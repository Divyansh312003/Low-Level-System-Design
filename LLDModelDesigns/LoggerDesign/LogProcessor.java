package LLDModelDesigns.LoggerDesign;

public abstract class LogProcessor {
    static int INFO=1;
    static int DEBUG=2;
    static int ERROR=3;
    LogProcessor nextLogProcessor;
    public LogProcessor(LogProcessor log){
        this.nextLogProcessor=log;
    }

    public void log(int level,String message){
        if(nextLogProcessor!=null){
             nextLogProcessor.log(level, message);
        }
    }

    
}
