import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.lang.*;

class push {

    public static void main(String[] args) {
        // String cmd = "powershell.exe -ExecutionPolicy ByPass -File
        // C:/Users/sarth/OneDrive/Desktop/ProblemSolving/psh.ps1";
        // System.out.println(PowerShell.executeSingleCommand(cmd).getCommandOutput());
        String[] commandList = { "powershell.exe", "-ExecutionPolicy", "ByPass", "-File",
                "C:/Users/sarth/OneDrive/Desktop/ProblemSolving/psh.ps1" };

        ProcessBuilder pb = new ProcessBuilder(commandList);

        Process p = pb.command();
    }

}