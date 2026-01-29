/**
 * OOPSBannerApp UC3-OOPS Banner Application (Use Case 3)
 *
 * This class extends the functionality of Use Case 2 by improving the way the "OOPS" banner
 * is constructed and displayed. It focuses on enhansing code readability and efficiency
 * by utilizing the String.join() method to create each line of the banner. This approach
 * overcomes the drawbacks of using the + oprator for String concatination, which can lead
 * to code inefficiency due to creation of multiple intermediate String objects in memory.
 *
 * @author Developer
 * @version 3.0
 */

public class OOPSBannerApp {
    public static void main(String[] args) {
        System.out.println( String.join("  ",
                "   ***  ", "    ***  ", " ****** ", "     *****"));
        System.out.println(String.join("  ",
                " **   **", "  **   **", " **    **", "  **    "));
        System.out.println( String.join("  ",
                "**     **", "**     **", "** ", "  **", "**"));
        System.out.println(String.join("  ",
                "**     **", "**     **", "**    **", "   **   "));
        System.out.println(String.join("  ",
                        "**     **", "**     **", "******    ", "   ***"));
        System.out.println(String.join("  ",
                        "**     **", "**     **", "**    ", "          **"));
        System.out.println(String.join("  ",
                "**     **", "**     **", "**    ", "           **"));
        System.out.println( String.join("  ",
                " **   **", "  **   **", " **    ", "          **"));
        System.out.println(String.join("  ",
                "   ***   ", "   ***   ", "**    ", "     *****"));
    }
}