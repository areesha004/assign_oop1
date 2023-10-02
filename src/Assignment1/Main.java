
   package Assignment1;
public class Main{

        public static void main(String[] args) {
            University university = new University();

            // Create some sample labs
            Lab lab1 = new Lab("Lab101", new Computer[3], LabStatus.OPERATIONAL, new Employee("E101", "John"));
            Lab lab2 = new Lab("Lab102", new Computer[3], LabStatus.FAULTY_MULTIMEDIA, new Employee("E102", "Alice"));

            // Add labs to the university
            university.addLab(lab1);
            university.addLab(lab2);

            // Fetch and display a lab by LabId
//            Lab fetchedLab = university.fetchLab("Lab101");

            // Remove a lab by LabId
            university.removeLab("Lab102");

            // Display the remaining labs
            System.out.println("Remaining labs:");
            for (int i = 0; i < university.labCount; i++) {
                System.out.println(university.labs[i]);
            }
        }

        public void addLab(Lab lab) {
            // ... (same as in the previous response)
        }

        public void removeLab(String labId) {
            // ... (same as in the previous response)
        }

        public void fetchLab(String labId) {
            // ... (same as in the previous response)}
    }
    }


