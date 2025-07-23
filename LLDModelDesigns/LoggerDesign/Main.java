package LLDModelDesigns.LoggerDesign;
public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.INFO,"printing info");
         logProcessor.log(LogProcessor.DEBUG,"debugging");
          logProcessor.log(LogProcessor.ERROR,"printing error");

    }
}
