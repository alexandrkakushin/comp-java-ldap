package ru.ak.info;

import ru.ak.ldap.LdapService;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Корневой Web-сервис, содержащий метод получения версии
 * @author akakushin
 */
@WebService(name = "Info", serviceName = "Info", portName = "InfoPort") 
public class InfoService extends LdapService {

    /**
     * Получение версии компоненты
     * @return Версия компоненты 
     */
    @WebMethod(operationName = "version")
    public String version() {
        return "1.0.0.1";
    }
}
