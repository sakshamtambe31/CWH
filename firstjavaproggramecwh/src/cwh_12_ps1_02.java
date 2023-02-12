public class cwh_12_ps1_02 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);
        //decrypted grade
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}