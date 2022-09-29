package homelesson3;

public class Lelel1homework3 {
    public static void main(String[] args) {
        String iStudyBJStr= "I study Basic Java!";
        String trimmedStr = iStudyBJStr.trim();
        System.out.println(trimmedStr.charAt(trimmedStr.length() -1));
        System.out.println(iStudyBJStr.contains("Java"));
        System.out.println(trimmedStr.replace('a', 'o'));
        System.out.println(iStudyBJStr.toUpperCase());
        System.out.println(iStudyBJStr.toLowerCase());
        System.out.println(trimmedStr.substring(0,trimmedStr.indexOf("Java")));
        double percent = (200.0/470)*100;
        System.out.println(percent);

        char a = 'g';
                int i = a;
              System.out.println(i);


    }
}
