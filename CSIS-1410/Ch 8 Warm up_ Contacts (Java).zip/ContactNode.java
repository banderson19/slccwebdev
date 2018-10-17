public class ContactNode {
	private String contactName;
    private String contactPhoneNumber;
    private ContactNode nextNodePtr;

    public ContactNode(String contactName, String contactPhoneNumber) {
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.nextNodePtr = null;
    }

    public String getName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return contactPhoneNumber;
    }

    public ContactNode getNext() {
        return nextNodePtr;
    }

    public void printContactNode(){
        System.out.println("Name: " + contactName);
        System.out.println("Phone number: " + contactPhoneNumber);
    }

    public void insertAfter(ContactNode prev){
        prev.nextNodePtr = this;
    }
} 