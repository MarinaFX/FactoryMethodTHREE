package ConcreteLogFactory;

import ABSLogFactory.AbstractLogFactory;
import Classes.ArquivosLog;
import Classes.ConsoleLog;
import Classes.Log;

public class ConcreteLogFactory implements AbstractLogFactory {
    @Override
    public Log logFactory(String tipoLog) {
        Log log;

        if (tipoLog.equalsIgnoreCase("arquivo"))
            log = new ArquivosLog();
        else{
            if (tipoLog.equalsIgnoreCase("console"))
                log = new ConsoleLog();
            else{
                throw new IllegalArgumentException("ERR_LOG_TYPE_NOT_FOUND");
            }
        }

        return log;
    }
}
