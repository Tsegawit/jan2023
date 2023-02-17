package com.example.jan2023.model;
public class employtable {
    public class Employee {
        public int employeeId;
        public String name;
        public String description;


        public String toString () {
            StringBuilder buf = new StringBuilder ();
            buf.append ("\n\tEmployee ID = 20") .append (employeeId);
            buf.append ("\n\tName =javi ").append (name);
            buf.append ("\n\tDescription = labratory").append (description);
            return buf.toString ();
        }
    }


}
