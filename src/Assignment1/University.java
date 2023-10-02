
package Assignment1;

public class University {
    Lab[] labs = new Lab[5];
    int labCount = 0;

    // Method to add a lab to the University
    public void addLab(Lab lab) {
        if (labCount < labs.length) {
            labs[labCount] = lab;
            labCount++;
            System.out.println("Lab added successfully.");
        } else {
            System.out.println("The maximum number of labs has been reached.");
        }
    }

    // Method to remove a lab from the University by LabId
    public void removeLab(String labId) {
        for (int i = 0; i < labCount; i++) {
            if (labs[i] != null && labs[i].getLabId().equals(labId)) {
                System.out.println("Lab with LabId '" + labId + "' has been removed.");
                labs[i] = null;
                // Move the last lab (if any) to this position
                if (i < labCount - 1) {
                    labs[i] = labs[labCount - 1];
                    labs[labCount - 1] = null;
                }
                labCount--;
                return;
            }
        }
        System.out.println("Lab with LabId '" + labId + "' not found.");
    }

    // Method to fetch a lab by LabId
    public Lab fetchLab(String labId) {
        for (int i = 0; i < labCount; i++) {
            if (labs[i] != null && labs[i].getLabId().equals(labId)) {
                System.out.println("Fetched lab is:");
                System.out.println(labs[i]);
                return labs[i];
            }
        }
        System.out.println("Lab with LabId '" + labId + "' not found.");
        return null;
    }
}
