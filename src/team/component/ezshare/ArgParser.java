package team.component.ezshare;


import org.apache.commons.cli.Options;
import org.json.simple.JSONObject;

public class ArgParser {

    //client command line arguments
    public static JSONObject clientArgument(String[] args){

        Options options = new Options();

        options.addOption("channel", true, "channel");
        options.addOption("debug", false, "print debug information");
        options.addOption("description",true,"resource description");
        options.addOption("exchange", false, "exchange server list with server");
        options.addOption("fetch",false,"fetch resource from server");
        options.addOption("host",true,"server host, a domain name or IP address");
        options.addOption("name",true,"resouce name");
        options.addOption("owner",true,"owner");
        options.addOption("port",true,"server port, an integer");
        options.addOption("publish",false,"publish resource on server");
        options.addOption("query",false,"query for resources from server");
        options.addOption("remove",false,"remove resource from server");
        options.addOption("secret",true,"secret");
        options.addOption("servers",true,"server list, host1:port1,host2:port2,...");
        options.addOption("share",false,"share resource on server");
        options.addOption("tags",true,"resource tags, tag1,tag2,tag3,...");
        options.addOption("uri",true,"resource URI");


        JSONObject newCommand=new JSONObject();

        return newCommand;

    }

    //server command line arguments

}
