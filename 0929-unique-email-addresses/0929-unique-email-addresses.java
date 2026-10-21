import java.util.HashSet;
class Solution {
    public int numUniqueEmails(String[] emails) {
        //Using HashSet to store unique email address
        HashSet<String> uniqueEmails = new HashSet<>();
        
        for (int i = 0; i < emails.length; i++){
            String currentEmail = emails[i];
             int atPosition = currentEmail.indexOf('@');         /// String[] parts = email.split('@'); String local = parts[0]; String domain = parts[1]
             String local = currentEmail.substring(0,atPosition);
             String domain = currentEmail.substring(atPosition + 1);
             int plusPosition = local.indexOf('+');

             if (plusPosition  != -1){
                local = local.substring(0,plusPosition);
             }

             local = local.replace(".", "");

             currentEmail = local + "@" + domain;

             uniqueEmails.add(currentEmail);  

        }

        return uniqueEmails.size();

        

        
    }
}