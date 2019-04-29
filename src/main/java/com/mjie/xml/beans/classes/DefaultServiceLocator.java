package com.mjie.xml.beans.classes;

public class DefaultServiceLocator {
    private static ClientService clientService = new ClientService();
    private static AccountService accountService = new AccountService();

    public ClientService clientService() {
        return clientService;
    }

    public AccountService accountService() {
        return accountService;
    }
}
