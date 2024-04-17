package process;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.Config;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class ConfigTraitement{

    private String jarDir;
    private String expectedDir;
    private String actualDir;
    private String outputDir;

    private String configFileName;
    private String configFilePath;

    private Config configForComparaison;


    public ConfigTraitement(String configFileName) throws URISyntaxException {

        this.configFileName = configFileName;
        this.jarDir= new File(ConfigTraitement.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getPath();

        this.expectedDir = this.jarDir + File.separator + "expected";
        this.actualDir = this.jarDir + File.separator+ "actual";
        this.outputDir = this.jarDir + File.separator + "output";
        this.configFilePath = this.jarDir + File.separator + configFileName;

        System.out.println("the path of the jar is :"+jarDir);
        System.out.println("the path of the output is :"+outputDir);

    }


    public void getConfig(){

        ObjectMapper mapper = new ObjectMapper();

        try {
            this.configForComparaison = mapper.readValue(new File(this.configFilePath),Config.class);
            System.out.println(configForComparaison);
        } catch (IOException e) {
            System.out.println("PRINT ERROR");
            throw new RuntimeException(e.getMessage());
        }

    }

    public static void main(String[] args) throws URISyntaxException {

        if(args.length == 0){
            throw new RuntimeException("Error : there no json configuration file");
        }

        ConfigTraitement configTraitement = new ConfigTraitement(args[0]);
        configTraitement.getConfig();


    }

}