package com.lahey;
/**
 * @author jack lahey
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //*************************************************************************
    //* main
    //*************************************************************************
    public static void main(String[] args) {

        ArrayList<User> userList = new ArrayList<User>();
        Scanner inputScanner = new Scanner(System.in);

        int iMenuQuit = 8;
        int iMenuSelection = 0;
        String mainMenu = "Please make a selection\n" +
                "1. Display All Users\n" +
                "2. Create New User\n" +
                "3. Add Education to User\n" +
                "4. Add Work Experience to User\n" +
                "5. Add Skill to User\n" +
                "6. Update User Information\n" +
                "7. Print User Resume\n" +
                "8. Quit";

        //create initial data elements
        initialize(userList);

        do{
            System.out.println(mainMenu);
            while( !inputScanner.hasNextInt() ){
                System.out.print("Please enter a number");
                inputScanner.nextLine();
            }
            iMenuSelection = inputScanner.nextInt();
            inputScanner.nextLine();

            switch(iMenuSelection){

                case 1:
                    System.out.println("Display All Users");
                    displayAllCurrentUsers(userList);
                    break;
                case 2:
                    System.out.println("Create New User");
                    createNewUser(inputScanner, userList);
                    break;
                case 3:
                    System.out.println("Add Education to User");
                    addEducationToUser( inputScanner, userList);
                    break;
                case 4:
                    System.out.println("Add Work Experience to User");
                    addWorkExperienceToUser(inputScanner, userList);
                    break;
                case 5:
                    System.out.println("Add Skill To User");
                    addSkillToUser(inputScanner,userList);
                    break;
                case 6:
                    System.out.println("Update User Information");
                    break;
                case 7:
                    System.out.println("Print User Resume");
                    writeResume(inputScanner, userList);
                    break;
                case 8:
                    System.out.println("Quit");
                    break;
                default :
                    System.out.println("Please select on of the menu options");
                    break;

            }//end switch(iMenuSelection)

        }while( !(iMenuSelection == iMenuQuit) );


    }//public static void main(String[] args)



    //*************************************************************************
    //* Required Methods
    //*************************************************************************
    public static void displayAllCurrentUsers(ArrayList<User> userList){

        for(User user : userList){

            System.out.printf("UserID %s  User Name: %s\n\n", user.getUserID(), user.getUserName());
        }

    }//end public static void displayAllUsers


//    public static User findUserByUserID(int idNumber, ArrayList<User> userList ){
    public static User findUserByUserID(Scanner inputScanner, ArrayList<User> userList ){

        int iInputNumber = 0;

        System.out.println("Enter the userID");
        while( !inputScanner.hasNextInt() ){
            System.out.print("Please enter a number");
            inputScanner.nextLine();
        }
        iInputNumber = inputScanner.nextInt();
        inputScanner.nextLine();

        for(User user : userList ){

            if(user.getUserID() == iInputNumber){

                return user;
            }
        }//end for(User user : userList )

        return null;

    }//end public static User findUserByUserID(int idNumber, ArrayList userList )


    public static void createNewUser(Scanner inputScan, ArrayList<User> userList){

        System.out.println("Enter user name");
        String name = inputScan.nextLine();
        System.out.println("Enter user email");
        String email = inputScan.nextLine();
        System.out.println("Enter user phone");
        String phone = inputScan.nextLine();

        User user = new User(name, email, phone);
        userList.add(user);
        System.out.println(user.getUserName() + "has been added\n");

    }//end public static void createNewUser()


    public static void addEducationToUser(Scanner inputScanner,ArrayList<User> userList){

        User user = findUserByUserID(inputScanner, userList );
        if( (user == null) ){
            System.out.println("User not found\n");
        }
        else{
            //public EducationalAchievement(String school, String year, String degree)
            System.out.println("Enter school name");
            String school = inputScanner.nextLine();
            System.out.println("Enter year");
            String year = inputScanner.nextLine();
            System.out.println("Enter degree");
            String degree = inputScanner.nextLine();

            EducationalAchievement ea = new EducationalAchievement(school, year, degree);
            user.addUserEducationalAchievement(ea);
            System.out.println(ea.getSchool() + " has been added\n");

        }//end  if( (user == null) )

    }//end public static void addEducationToUser()


    public static void addWorkExperienceToUser(Scanner inputScanner,ArrayList<User> userList){

        String sInput = "";
        String sInputChoice = "";
        String sInputNO = "N";
        String sInputYES = "Y";

        User user = findUserByUserID(inputScanner, userList );
        if( (user == null) ){
            System.out.println("User not found\n");
        }
        else{
            // public WorkExperience(String companyName, String jobTitle, String jobDateStart, String jobDateEnd)
            System.out.println("Enter company name");
            String companyName = inputScanner.nextLine();
            System.out.println("Enter job title");
            String jobTitle = inputScanner.nextLine();
            System.out.println("Enter start date");
            String startDate = inputScanner.nextLine();
            System.out.println("Enter end date");
            String endDate = inputScanner.nextLine();

            WorkExperience work = new WorkExperience(companyName, jobTitle, startDate, endDate);
            user.addUserWorkExperience(work);

            do {

                do{
                    System.out.println("Enter description of a job responsibility");
                    String responsibility = inputScanner.nextLine();
                    work.addJobResponsibility(responsibility);

                    System.out.println(responsibility + " has been added.  Do you wan to add another?  Enter \"Y\" or \"N\" ");
                    sInputChoice = inputScanner.nextLine();

                }while( !sInputChoice.equalsIgnoreCase(sInputYES) && !sInputChoice.equalsIgnoreCase(sInputNO) );

            }while( !sInputChoice.equalsIgnoreCase(sInputNO) );

            System.out.println(work.getCompanyName() + " has been added\n");

        }//end  if( (user == null) )


    }//end public static void addWorkExperienceToUser()


    public static void addSkillToUser(Scanner inputScanner,ArrayList<User> userList){

        User user = findUserByUserID(inputScanner, userList );
        if( (user == null) ){
            System.out.println("User not found\n");
        }
        else{
            //public Skill(String skillName, String competencyRating)
            System.out.println("Enter skill name");
            String skillName = inputScanner.nextLine();
            System.out.println("Enter competency rating");
            String rating = inputScanner.nextLine();

            Skill skill = new Skill(skillName, rating);
            user.addUserSkill(skill);
            System.out.println(skill.getSkillName() + " has been added\n");

        }//end  if( (user == null) )

    }//end public static void addEducationToUser()


    public static void writeResume(Scanner inputScanner,ArrayList<User> userList){

        FileHandler outFile = new FileHandler();

        String sNewLine = "\n";

        User user = findUserByUserID(inputScanner, userList );
        if( (user == null) ){
            System.out.println("User not found\n");
        }
        else{

            StringBuffer buffer = new StringBuffer();

            buffer.append("================================================================================" + sNewLine);
            buffer.append(user.getUserName() + sNewLine);
            buffer.append(user.getUserEmail() + sNewLine);
            buffer.append(sNewLine);

            buffer.append("EDUCATION"  + sNewLine);
            ArrayList<EducationalAchievement> tempEducationList = user.getEducationalAchievementList();
            for(EducationalAchievement ea : tempEducationList){

                buffer.append(ea.getDegree()  + sNewLine);
                buffer.append(ea.getSchool() + "' " + ea.getYear()  + sNewLine);
                buffer.append(sNewLine);

            }//end for(EducationalAchievement ea : tempEducationList)


            buffer.append("EXPERIENCE"  + sNewLine);
            ArrayList<WorkExperience> tempWorkList = user.getWorkExperienceList();
            for(WorkExperience work : tempWorkList){

                buffer.append(work.getJobTitle()  + sNewLine);
                buffer.append(work.getCompanyName()  + "' " + work.getJobDateStart() + " - " + work.getJobDateEnd() + sNewLine);

                ArrayList<String> tempList = work.getjobResponsibilities();
                for( int i = 0 ; i < tempList.size() ; i++){

                    int iValue = i + 1;
                    buffer.append("Job Responsibility " + iValue + ", " + tempList.get(i) + sNewLine);
                }
                buffer.append(sNewLine);

            }//end for(WorkExperience work : tempWorkList)



            buffer.append("SKILLS"  + sNewLine);
            ArrayList<Skill> tempSkillList = user.getSkillList();
            for(Skill skill : tempSkillList){

                buffer.append(skill.getSkillName() + ", " + skill.getCompetencyRating()  + sNewLine);

            }//end for(Skill skill : tempSkillList)
            buffer.append(sNewLine);

            //write to output file
            outFile.writeToFile(buffer.toString());

            System.out.print(buffer.toString());

        }//end  if( (user == null) )

    }//end public static void writeResume(Scanner inputScanner,ArrayList<User> userList)



    public static void initialize(ArrayList<User> userList){

        User user01 = new User("Bob Marley", "bob@email.com","555-1212");

        //create some educational acchievements
        EducationalAchievement ea1 = new EducationalAchievement("Montgomery College", "1984", "English");
        user01.addUserEducationalAchievement(ea1);
        EducationalAchievement ea2 = new EducationalAchievement("School of Hard Knocks", "1567", "Mathematics");
        user01.addUserEducationalAchievement(ea2);

        //create some work experiences
        WorkExperience work01 = new WorkExperience("Petco","Clerk","June 1865","December 2018");
        work01.addJobResponsibility("Walk the dogs");
        work01.addJobResponsibility("Polish the cats");
        user01.addUserWorkExperience(work01);

        WorkExperience work02 = new WorkExperience("Target","Clerk","April 1865","May 2018");
        work02.addJobResponsibility("Scan the purchases");
        work02.addJobResponsibility("Stock shelves");
        user01.addUserWorkExperience(work02);

        //create some skills
        // Competency Ratings: Fundamental, Novice, Intermediate, Advanced, Expert
        Skill skill01 = new Skill("Java","Novice");
        user01.addUserSkill(skill01);
        Skill skill02 = new Skill("Eating","Expert");
        user01.addUserSkill(skill02);
        Skill skill03 = new Skill("Washing Dishes","Intermediate");
        user01.addUserSkill(skill03);

        userList.add(user01);

    }//end public static void initialize(ArrayList<User> userList)


    //*************************************************************************
    //* Optional Methods
    //*************************************************************************

    //Allow a person to change their name, e-mail address and/or phone number
    public static void updateUserInformation(User user){

        System.out.println("To be completed.");

    }//end public static void updateUserInformation()


    public static void changeUserName (User user){

        System.out.println("To be completed.");

    }//end public static void changeUserName (User user)


    public static void changeUserEmail(User user){

        System.out.println("To be completed.");

    }//end public static void changeUserEmail(User user)


    public static void changeUserPhone(User user){

        System.out.println("To be completed.");

    }//end public static void changeUserPhone(User user)



}//end public class Main
