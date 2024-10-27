import java.util.*;
class Solution{



public static int findAvgVoyagesByPct(NavalVessel[] ar, int ks){
  int tot = 0;
int cnt = 0;
 for(NavalVessel k: ar){
  int perce = (k.getNoOfVoyagesCompleted() * 100)/k.getNoOfVoyagesPlanned();
  if(perce >= ks){
   tot += k.getNoOfVoyagesCompleted();
   cnt++;
}
}
  int avera = tot/cnt;
return avera;

}

public static String findVesselByGrade(NavalVessel[] ar, String ps){
int perc = 0;
String n = "";
String val = "";
for(NavalVessel h: ar){

if(h.getPurpose().equals(ps)){
perc = h.getNoOfVoyagesCompleted() * 100 / h.getNoOfVoyagesPlanned();
n = h.getVesselName();
 if(perc == 100){
  val = (n + "%" + "Star");
}else if(perc >= 99 && perc <= 80){
  val = (n + "%" + "Leader" );
}else if(perc >= 79 && perc <= 55){
   val = (n + "%Inspirer");
}else{
 val = (n + "%Striver");
}

}



}

return val;

}




public static void main(String[] args){
Scanner sc = new Scanner(System.in);
NavalVessel[] ar = new NavalVessel[4];
for(int i=0; i<4; i++){
int id = sc.nextInt();
sc.nextLine();
String name = sc.nextLine();
int voyage = sc.nextInt();
sc.nextLine();
int complete = sc.nextInt();
sc.nextLine();
String pur = sc.nextLine();

NavalVessel n = new NavalVessel(id, name, voyage, complete, pur);

ar[i] = n;

}
int per = sc.nextInt();
sc.nextLine();
String str = sc.nextLine();




System.out.println("Average   " + findAvgVoyagesByPct(ar, per));

System.out.println(findVesselByGrade(ar, str));














}
}