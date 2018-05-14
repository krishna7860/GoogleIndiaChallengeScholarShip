package com.example.krishna.login;

import android.provider.BaseColumns;

public class database_contract {

    public static final class database_entry implements BaseColumns
    {
        public static final String TABLE_NAME="users";
        public static final String USER_NAME="username";
        public static final String USER_EMAIL="email";
        public static final String USER_PASSWORD="password";
        public static final String USER_FIRST_NAME="name";

    }

}
