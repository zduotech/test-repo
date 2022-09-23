public class StudentEmail extends Email {

//    B. Implement the class StudentEmail which is a subclass of Email
//
//            It contains the following:
//
//    Data field with private visibility:
             final String TYPE = "Student";
             private static int batchNo; // - represents batchNo of the student.
//
//            Constructor:
//            - constructor that accepts and initializes firstName , lastName and batchNo.
//    Besides that it needs to do the following:
//            - initializes emailAddress using generateEmail() method.
//            - initializes password using generatePassword() method.
//            - initializes capacity to 25.
//            - initializes maxAttachmentSize to 50.

            public StudentEmail(String firstName, String lastName, int batchNo){

                setFirstName(firstName);
                setLastName(lastName);
                this.batchNo = batchNo;
                setCapacity(25);
                setMaxAttachmentSize(50);
            }
//
//

//    Methods:
//            - generateEmail() - override it so it returns the following:
//    firstName + . + lastName + _b + batchNo + @ + student. + DOMAIN_NAME
//    Example: Bahar Mahmud, batch 5 -> bahar.mahmud_b5@student.duotech.io

    @Override
    public String generateEmail() {
        return firstName() + "." + lastName() + "_b" + batchNo + "@" + "student. "+ DOMAIN_NAME;
    }


//
//     - generatePassword() - override it so it returns the following:
//    random password with length 8 that consists of lowercase, uppercase chars and numbers
//    Example: gad6FshR

    @Override
    public String generatePassword() {
        return super.generatePassword();
    }


//     - toString() - override it so it returns the info in following format (use super class's toString() for super class field values):
//            TYPE: Student
//            BATCH NO: batchNo
//            NAME: firstName + lastName
//            GENERATED EMAIL ADDRESS: emailAddress
//            GENERATED PASSWORD: password
//            CAPACITY: capacity
//            MAX ATTACHMENT SIZE: maxAttachmentSize


    @Override
    public String toString() {
        return "BATCH NO: " + batchNo
        +"\nNAME: " +firstName() + lastName()
        +"\nGENERATED EMAIL ADDRESS: " +emailAddress()
        +"\nGENERATED PASSWORD: " +password()
        +"\nCAPACITY: " +capacity()
        +"\nMAX ATTACHMENT SIZE: " +maxAttachmentSize();
    }
}
