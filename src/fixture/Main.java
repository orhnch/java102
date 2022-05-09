package fixture;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("How many teams do you have?: ");
        int n = inp.nextInt();

        List<String> teams = new ArrayList<>();

        for(int i = n - 1; i >= 0; i--) {
            System.out.println("Add the team names:");
            String teamName = inp.next();
            teams.add(teamName);
        }
        if(n%2!=0){
            teams.add("PASS");
            n+=1;
        }


        List<String> tempTeams = new ArrayList<>();

        while (0<teams.size()){
            int ind = (int) (Math.random()*teams.size());
            tempTeams.add(teams.get(ind));
            teams.remove(ind);
        }
        teams=tempTeams;

        int numWeek = n - 1;
        int numMatchPerWeek = n/2;

        LinkedHashMap<String,ArrayList<ArrayList<String>>> weeks = new LinkedHashMap<>();

        for(int i=0; i<numWeek;i++){
            String week = String.valueOf(i+1);
            weeks.put(week, new ArrayList<ArrayList<String>>());
        }

        for(int i=0; i<numWeek; i++){
            ArrayList<String> home = new ArrayList<>();
            ArrayList<String> away = new ArrayList<>();
            for (int j=0; j<numMatchPerWeek;j++){
                home.add(teams.get(j));
                away.add(teams.get((n-j)-1));
            }
            String week = String.valueOf(i+1);
            weeks.get(week).add(home);
            weeks.get(week).add(away);

            List<String> nTeams = new ArrayList<>();

            nTeams.add(teams.get(0));
            nTeams.add(teams.get(n-1));

            for(int k=1;k<teams.size()-1;k++){
                nTeams.add(teams.get(k));
            }
            teams=nTeams;
        }

        for(int i=0;i<2*numWeek;i++){
            System.out.println("#########################################################################");
            System.out.println("Week #"+(i+1));
            for(int j=0;j<numMatchPerWeek;j++){
                if(i<numWeek){
                    System.out.println(weeks.get(String.valueOf(i+1)).get(0).get(j)+" vs "+weeks.get(String.valueOf(i+1)).get(1).get(j));
                }else {
                    System.out.println(weeks.get(String.valueOf(i+1-numWeek)).get(1).get(j)+" vs "+weeks.get(String.valueOf(i+1-numWeek)).get(0).get(j));
                }

            }
        }
    }
}
