package Assignment1;

public class Lab {
    String LabId;
    Computer[] computers = new Computer[3];

    LabStatus status;
    Employee LabAttendant;


    public Lab(String labId, Computer[] computers, LabStatus status, Employee labAttendant) {
        LabId = labId;
        this.computers = computers;
        this.status = status;
        LabAttendant = labAttendant;
    }

    public Lab() {
        LabId = "";
        computers = new Computer[3];
        status = null;
        LabAttendant = null;

    }

    public String getLabId() {
        return LabId;
    }

    public void setLabId(String labId) {
        LabId = labId;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public Employee getLabAttendant() {
        return LabAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        LabAttendant = labAttendant;
    }

    void addcomputer() {
        int counter = 101;

        for (int i = 0; i < 3; i++) {
            computers[i] = new Computer(Integer.toString(counter), "M99", 34, 2, false);
            counter++;
        }


    }

    void display() {
        for (int i = 0; i < 3; i++) {
            if (computers[i] != null) {
                System.out.println(computers[i]);
            }
        }
    }

    void removecomputer(String computernum) {
        for (int i = 0; i < 3; i++) {
            if (computers[i] != null && computers[i].computerNumber.equals(computernum)) {
                System.out.println(computers[i].computerNumber + " is removed from your lab ...");
                computers[i] = null;
            }

        }
        display();

    }
    void fetchComputer(String computerNumber) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null && computers[i].getComputerNumber().equals(computerNumber)) {
                System.out.println("fetched computer is .........");
                System.out.println(computers[i]);
            }
        }

    }
    public void changeStatus(LabStatus newStatus) {
        switch (newStatus) {
            case OPERATIONAL:
                this.status = LabStatus.OPERATIONAL;
                break;
            case FAULTY_MULTIMEDIA:
                this.status = LabStatus.FAULTY_MULTIMEDIA;
                break;
            default:
                System.out.println("Invalid lab status");
                break;
        }
    }


}
