import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TerminalAudioPlayer {
    public static void main(String args[]) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the absolute path of the file you want to play:");
        String path = scanner.next();
        File file = new File(path);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String response = "";

        while (!response.equals("Q")){
            System.out.print("P = Play, R = Reset, S = Stop, Q = Quit ");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response){
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                case ("Q"):
                    clip.stop();
                    break;
                default:
                    System.out.println("Not a valid command!");

            }

        }
        System.out.println("Thanks for listening!");

    }
}