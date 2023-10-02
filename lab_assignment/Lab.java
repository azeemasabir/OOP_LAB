package lab_assignment;

public class Lab {
    private String labID;
    private Computer [] computers;
    private LabStatus status;
    private  Employee labAttendant;

    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
    }


    public void addComputer(Computer computer) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == null) {
                computers[i] = computer;
                return;
            }
        }
        System.out.println("Lab is full. Cannot add more computers.");
    }
    public boolean removeComputer(String computerNumber) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null && computers[i].getComputerNumber().equals(computerNumber)) {
                computers[i] = null;
                return true;
            }
        }
        System.out.println("Computer with number " + computerNumber + " not found.");
        return false;
    }
}
