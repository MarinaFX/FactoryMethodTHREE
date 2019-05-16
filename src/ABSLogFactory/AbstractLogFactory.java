package ABSLogFactory;

import Classes.Log;

public interface AbstractLogFactory {
    Log logFactory(String tipoLog);
}
