
package br.com.sptech.inovacao;

import java.io.IOException;

public class Script {
    
    public void executeCommands() throws IOException, InterruptedException {

        String script = 
                "echo \\Reiniciando o computador!\\ \n"
                + "sleep 4\n"
                + "sudo reboot \n";
        
        try {
            ProcessBuilder pb = new ProcessBuilder("bash",  "-c", script);
            pb.inheritIO();
            Process process = pb.start();
            process.waitFor();
        } finally {
             System.out.println("Maquina reiniciou");
        }
    }
    
}
