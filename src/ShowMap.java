public class ShowMap {
/*
 * this class is use to display the map and also indicating the current location
 */
    
        public static void showMap(String currentCity) {
            String[] cities = {"Saffron City", "Lavender Town", "Carulean City", "Celadon City",
                    "Vermillion City", "Fuschia City", "Cinnabar Island", "Pallet Town", "Viridian City", "Pewter City"};
            
            //Saffron City
            if(currentCity.equals(cities[0])){
            cities[0] = "**"+cities[0]+"**";
            System.out.println(" ________________________________________________________________________________________");
            System.out.println("                                                                                           ");
            System.out.println("    | "+cities[9]+" | -------------------------|  "+cities[2]+" |---------------                            ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |              | "+cities[3]+" |-----|"+cities[0]+" |-----| "+cities[1]+" |              ");
            System.out.println("           |                    |                     |                 /                        ");
            System.out.println("           |                    |                     |                /                         ");
            System.out.println("           |                    |                     |               /                          ");
            System.out.println("    |  "+cities[8]+" |          |                     |              /                               ");
            System.out.println("           |                    |                     |             /                                ");
            System.out.println("           |                    |                     |            /                                 "); 
            System.out.println("           |                    |                     |           /                                  "); 
            System.out.println("           |                    |                     |          /                                   "); 
            System.out.println("           |                    |                     |         /                                    "); 
            System.out.println("           |                    |                     |        /                                     ");
            System.out.println("           |                    |              | "+cities[4]+" |                                   ");
            System.out.println("           |                    |                  /                                             "); 
            System.out.println("    | "+cities[7]+" |             |                 /                                                      ");
            System.out.println("           |                    |                /                                               ");
            System.out.println("           |                    |               /                                                ");
            System.out.println("           |                    |              /                                                 ");
            System.out.println("           |                    |             /                                                  "); 
            System.out.println("           |                    |            /                                                   ");
            System.out.println("           |                    |           /                                                    "); 
            System.out.println("           |                    |          /                                                     "); 
            System.out.println("           |                    |         /                                                      ");
            System.out.println("           |                    |        /                                                       "); 
            System.out.println("    |"+cities[6]+"|-----|"+cities[5]+"|                                                                      ");   
            System.out.println("                                                                                           ");   
            System.out.println("___________________________________________________________________________________________");  
            }
            
            //Lavender town 
            else if (currentCity.equals(cities[1])) {
                cities[1] = "**"+cities[1]+"**";
                System.out.println(" ________________________________________________________________________________________");
            System.out.println("                                                                                           ");
            System.out.println("    | "+cities[9]+" | -------------------------|  "+cities[2]+" |---------------                            ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |              | "+cities[3]+" |-------| "+cities[0]+" |-------| "+cities[1]+" |              ");
            System.out.println("           |                    |                     |                   /                        ");
            System.out.println("           |                    |                     |                  /                         ");
            System.out.println("           |                    |                     |                 /                          ");
            System.out.println("    |  "+cities[8]+" |          |                     |                /                               ");
            System.out.println("           |                    |                     |               /                                ");
            System.out.println("           |                    |                     |              /                                 "); 
            System.out.println("           |                    |                     |             /                                  "); 
            System.out.println("           |                    |                     |            /                                   "); 
            System.out.println("           |                    |                     |           /                                    "); 
            System.out.println("           |                    |                     |          /                                     ");
            System.out.println("           |                    |              | "+cities[4]+" |                                   ");
            System.out.println("           |                    |                  /                                             "); 
            System.out.println("    | "+cities[7]+" |             |                 /                                                      ");
            System.out.println("           |                    |                /                                               ");
            System.out.println("           |                    |               /                                                ");
            System.out.println("           |                    |              /                                                 ");
            System.out.println("           |                    |             /                                                  "); 
            System.out.println("           |                    |            /                                                   ");
            System.out.println("           |                    |           /                                                    "); 
            System.out.println("           |                    |          /                                                     "); 
            System.out.println("           |                    |         /                                                      ");
            System.out.println("           |                    |        /                                                       "); 
            System.out.println("    |"+cities[6]+"|-----|"+cities[5]+"|                                                                      ");   
            System.out.println("                                                                                           ");   
            System.out.println("___________________________________________________________________________________________");
            }
            
            //Carulean CIty
            else if (currentCity.equals(cities[2])) {
                cities[2] = "**"+cities[2]+"**";
            System.out.println(" ________________________________________________________________________________________");
            System.out.println("                                                                                           ");
            System.out.println("    | "+cities[9]+" | -------------------------|  "+cities[2]+" |-----------                           ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |              | "+cities[3]+" |------| "+cities[0]+" |-------| "+cities[1]+" |              ");
            System.out.println("           |                    |                     |                   /                        ");
            System.out.println("           |                    |                     |                  /                         ");
            System.out.println("           |                    |                     |                 /                          ");
            System.out.println("    |  "+cities[8]+" |          |                     |                /                               ");
            System.out.println("           |                    |                     |               /                                ");
            System.out.println("           |                    |                     |              /                                 "); 
            System.out.println("           |                    |                     |             /                                  "); 
            System.out.println("           |                    |                     |            /                                   "); 
            System.out.println("           |                    |                     |           /                                    "); 
            System.out.println("           |                    |                     |          /                                     ");
            System.out.println("           |                    |              | "+cities[4]+" |                                   ");
            System.out.println("           |                    |                  /                                             "); 
            System.out.println("    | "+cities[7]+" |             |                 /                                                      ");
            System.out.println("           |                    |                /                                               ");
            System.out.println("           |                    |               /                                                ");
            System.out.println("           |                    |              /                                                 ");
            System.out.println("           |                    |             /                                                  "); 
            System.out.println("           |                    |            /                                                   ");
            System.out.println("           |                    |           /                                                    "); 
            System.out.println("           |                    |          /                                                     "); 
            System.out.println("           |                    |         /                                                      ");
            System.out.println("           |                    |        /                                                       "); 
            System.out.println("    |"+cities[6]+"|-----|"+cities[5]+"|                                                                      ");   
            System.out.println("                                                                                           ");   
            System.out.println("___________________________________________________________________________________________");
            }
            
            //Celadon City
            else if (currentCity.equals(cities[3])) {
                cities[3] = "**"+cities[3]+"**";
                System.out.println(" ________________________________________________________________________________________");
            System.out.println("                                                                                           ");
            System.out.println("    | "+cities[9]+" | -------------------------|  "+cities[2]+" |---------------                            ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |              | "+cities[3]+" |------| "+cities[0]+" |-----| "+cities[1]+" |              ");
            System.out.println("           |                    |                        |                 /                        ");
            System.out.println("           |                    |                        |                /                         ");
            System.out.println("           |                    |                        |               /                          ");
            System.out.println("    |  "+cities[8]+" |          |                        |              /                               ");
            System.out.println("           |                    |                        |             /                                ");
            System.out.println("           |                    |                        |            /                                 "); 
            System.out.println("           |                    |                        |           /                                  "); 
            System.out.println("           |                    |                        |          /                                   "); 
            System.out.println("           |                    |                        |         /                                    "); 
            System.out.println("           |                    |                        |        /                                     ");
            System.out.println("           |                    |              | "+cities[4]+" |                                   ");
            System.out.println("           |                    |                  /                                             "); 
            System.out.println("    | "+cities[7]+" |             |                 /                                                      ");
            System.out.println("           |                    |                /                                               ");
            System.out.println("           |                    |               /                                                ");
            System.out.println("           |                    |              /                                                 ");
            System.out.println("           |                    |             /                                                  "); 
            System.out.println("           |                    |            /                                                   ");
            System.out.println("           |                    |           /                                                    "); 
            System.out.println("           |                    |          /                                                     "); 
            System.out.println("           |                    |         /                                                      ");
            System.out.println("           |                    |        /                                                       "); 
            System.out.println("    |"+cities[6]+"|-----|"+cities[5]+"|                                                                      ");   
            System.out.println("                                                                                           ");   
            System.out.println("___________________________________________________________________________________________");
        }
            //Vermillion City
            else if (currentCity.equals(cities[4])) {
                cities[4] = "**"+cities[4]+"**";
                System.out.println(" ________________________________________________________________________________________");
            System.out.println("                                                                                           ");
            System.out.println("    | "+cities[9]+" | -------------------------|  "+cities[2]+" |---------------                            ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |              | "+cities[3]+" |------| "+cities[0]+" |------| "+cities[1]+" |              ");
            System.out.println("           |                    |                     |                    /                        ");
            System.out.println("           |                    |                     |                   /                         ");
            System.out.println("           |                    |                     |                  /                          ");
            System.out.println("    |  "+cities[8]+" |          |                     |                 /                               ");
            System.out.println("           |                    |                     |                /                                ");
            System.out.println("           |                    |                     |               /                                 "); 
            System.out.println("           |                    |                     |              /                                  "); 
            System.out.println("           |                    |                     |             /                                   "); 
            System.out.println("           |                    |                     |            /                                    "); 
            System.out.println("           |                    |                     |           /                                     ");
            System.out.println("           |                    |              | "+cities[4]+" |                                   ");
            System.out.println("           |                    |                  /                                             "); 
            System.out.println("    | "+cities[7]+" |             |                 /                                                      ");
            System.out.println("           |                    |                /                                               ");
            System.out.println("           |                    |               /                                                ");
            System.out.println("           |                    |              /                                                 ");
            System.out.println("           |                    |             /                                                  "); 
            System.out.println("           |                    |            /                                                   ");
            System.out.println("           |                    |           /                                                    "); 
            System.out.println("           |                    |          /                                                     "); 
            System.out.println("           |                    |         /                                                      ");
            System.out.println("           |                    |        /                                                       "); 
            System.out.println("    |"+cities[6]+"|-----|"+cities[5]+"|                                                                      ");   
            System.out.println("                                                                                           ");   
            System.out.println("___________________________________________________________________________________________");
    }
            
            //Fuschia City
            else if (currentCity.equals(cities[5])) {
                cities[5] = "**"+cities[5]+"**";
                System.out.println(" ________________________________________________________________________________________");
            System.out.println("                                                                                           ");
            System.out.println("    | "+cities[9]+" | -------------------------|  "+cities[2]+" |---------------                            ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |              | "+cities[3]+" |------| "+cities[0]+" |------| "+cities[1]+" |              ");
            System.out.println("           |                    |                     |                   /                        ");
            System.out.println("           |                    |                     |                 /                         ");
            System.out.println("           |                    |                     |                 /                          ");
            System.out.println("    |  "+cities[8]+" |          |                     |                /                               ");
            System.out.println("           |                    |                     |               /                                ");
            System.out.println("           |                    |                     |              /                                 "); 
            System.out.println("           |                    |                     |             /                                  "); 
            System.out.println("           |                    |                     |            /                                   "); 
            System.out.println("           |                    |                     |           /                                    "); 
            System.out.println("           |                    |                     |          /                                     ");
            System.out.println("           |                    |              | "+cities[4]+" |                                   ");
            System.out.println("           |                    |                  /                                             "); 
            System.out.println("    | "+cities[7]+" |             |                 /                                                      ");
            System.out.println("           |                    |                /                                               ");
            System.out.println("           |                    |               /                                                ");
            System.out.println("           |                    |              /                                                 ");
            System.out.println("           |                    |             /                                                  "); 
            System.out.println("           |                    |            /                                                   ");
            System.out.println("           |                    |           /                                                    "); 
            System.out.println("           |                    |          /                                                     "); 
            System.out.println("           |                    |         /                                                      ");
            System.out.println("           |                    |        /                                                       "); 
            System.out.println("    |"+cities[6]+"|-----|"+cities[5]+"|                                                                      ");   
            System.out.println("                                                                                           ");   
            System.out.println("___________________________________________________________________________________________");
            }
            
            //Cinnabar Island
            else if (currentCity.equals(cities[6])) {
                cities[6] = "**"+cities[6]+"**";
            System.out.println(" ________________________________________________________________________________________");
            System.out.println("                                                                                           ");
            System.out.println("    | "+cities[9]+" | -------------------------|  "+cities[2]+" |---------------                            ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |              | "+cities[3]+" |------| "+cities[0]+" |------| "+cities[1]+" |              ");
            System.out.println("           |                    |                     |                 /                        ");
            System.out.println("           |                    |                     |                /                         ");
            System.out.println("           |                    |                     |               /                          ");
            System.out.println("    |  "+cities[8]+" |          |                     |              /                               ");
            System.out.println("           |                    |                     |             /                                ");
            System.out.println("           |                    |                     |            /                                 "); 
            System.out.println("           |                    |                     |           /                                  "); 
            System.out.println("           |                    |                     |          /                                   "); 
            System.out.println("           |                    |                     |         /                                    "); 
            System.out.println("           |                    |                     |        /                                     ");
            System.out.println("           |                    |              | "+cities[4]+" |                                   ");
            System.out.println("           |                    |                  /                                             "); 
            System.out.println("    | "+cities[7]+" |             |                 /                                                      ");
            System.out.println("           |                    |                /                                               ");
            System.out.println("           |                    |               /                                                ");
            System.out.println("           |                    |              /                                                 ");
            System.out.println("           |                    |             /                                                  "); 
            System.out.println("           |                    |            /                                                   ");
            System.out.println("           |                    |           /                                                    "); 
            System.out.println("           |                    |          /                                                     "); 
            System.out.println("           |                    |         /                                                      ");
            System.out.println("           |                    |        /                                                       "); 
            System.out.println("    |"+cities[6]+"|-----|"+cities[5]+"|                                                                      ");   
            System.out.println("                                                                                           ");   
            System.out.println("___________________________________________________________________________________________");
            }
            
            //Pallet town
            else if (currentCity.equals(cities[7])) {
                cities[7] = "**"+cities[7]+"**";
            System.out.println(" ________________________________________________________________________________________");
            System.out.println("                                                                                           ");
            System.out.println("    | "+cities[9]+" | -------------------------|  "+cities[2]+" |---------------                            ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |              | "+cities[3]+" |------| "+cities[0]+" |------| "+cities[1]+" |              ");
            System.out.println("           |                    |                     |                 /                        ");
            System.out.println("           |                    |                     |                /                         ");
            System.out.println("           |                    |                     |               /                          ");
            System.out.println("    |  "+cities[8]+" |          |                     |              /                               ");
            System.out.println("           |                    |                     |             /                                ");
            System.out.println("           |                    |                     |            /                                 "); 
            System.out.println("           |                    |                     |           /                                  "); 
            System.out.println("           |                    |                     |          /                                   "); 
            System.out.println("           |                    |                     |         /                                    "); 
            System.out.println("           |                    |                     |        /                                     ");
            System.out.println("           |                    |              | "+cities[4]+" |                                   ");
            System.out.println("           |                    |                  /                                             "); 
            System.out.println("    | "+cities[7]+" |         |                 /                                                      ");
            System.out.println("           |                    |                /                                               ");
            System.out.println("           |                    |               /                                                ");
            System.out.println("           |                    |              /                                                 ");
            System.out.println("           |                    |             /                                                  "); 
            System.out.println("           |                    |            /                                                   ");
            System.out.println("           |                    |           /                                                    "); 
            System.out.println("           |                    |          /                                                     "); 
            System.out.println("           |                    |         /                                                      ");
            System.out.println("           |                    |        /                                                       "); 
            System.out.println("    |"+cities[6]+"|-----|"+cities[5]+"|                                                                      ");   
            System.out.println("                                                                                           ");   
            System.out.println("___________________________________________________________________________________________");
        }
            
            // Viridian City
            else if (currentCity.equals(cities[8])) {
                cities[8] = "**"+cities[8]+"**";
                System.out.println(" ________________________________________________________________________________________");
            System.out.println("                                                                                           ");
            System.out.println("    | "+cities[9]+" | -------------------------|  "+cities[2]+" |---------------                            ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |              | "+cities[3]+" |------| "+cities[0]+" |------| "+cities[1]+" |              ");
            System.out.println("           |                    |                     |                   /                        ");
            System.out.println("           |                    |                     |                  /                         ");
            System.out.println("           |                    |                     |                 /                          ");
            System.out.println("    |  "+cities[8]+" |      |                     |                /                               ");
            System.out.println("           |                    |                     |               /                                ");
            System.out.println("           |                    |                     |              /                                 "); 
            System.out.println("           |                    |                     |             /                                  "); 
            System.out.println("           |                    |                     |            /                                   "); 
            System.out.println("           |                    |                     |           /                                    "); 
            System.out.println("           |                    |                     |          /                                     ");
            System.out.println("           |                    |              | "+cities[4]+" |                                   ");
            System.out.println("           |                    |                  /                                             "); 
            System.out.println("    | "+cities[7]+" |             |                 /                                                      ");
            System.out.println("           |                    |                /                                               ");
            System.out.println("           |                    |               /                                                ");
            System.out.println("           |                    |              /                                                 ");
            System.out.println("           |                    |             /                                                  "); 
            System.out.println("           |                    |            /                                                   ");
            System.out.println("           |                    |           /                                                    "); 
            System.out.println("           |                    |          /                                                     "); 
            System.out.println("           |                    |         /                                                      ");
            System.out.println("           |                    |        /                                                       "); 
            System.out.println("    |"+cities[6]+"|-----|"+cities[5]+"|                                                                      ");   
            System.out.println("                                                                                           ");   
            System.out.println("___________________________________________________________________________________________");
            }
            
            else if (currentCity.equals(cities[9])) {
                cities[9] = "**"+cities[9]+"**";
            System.out.println(" ________________________________________________________________________________________");
            System.out.println("                                                                                           ");
            System.out.println("    | "+cities[9]+" | -------------------------|  "+cities[2]+" |-----------                            ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |                                           |                     |                   ");
            System.out.println("           |              | "+cities[3]+" |------| "+cities[0]+" |------| "+cities[1]+" |              ");
            System.out.println("           |                    |                     |                 /                        ");
            System.out.println("           |                    |                     |                /                         ");
            System.out.println("           |                    |                     |               /                          ");
            System.out.println("    |  "+cities[8]+" |          |                     |              /                               ");
            System.out.println("           |                    |                     |             /                                ");
            System.out.println("           |                    |                     |            /                                 "); 
            System.out.println("           |                    |                     |           /                                  "); 
            System.out.println("           |                    |                     |          /                                   "); 
            System.out.println("           |                    |                     |         /                                    "); 
            System.out.println("           |                    |                     |        /                                     ");
            System.out.println("           |                    |              | "+cities[4]+" |                                   ");
            System.out.println("           |                    |                  /                                             "); 
            System.out.println("    | "+cities[7]+" |             |                 /                                                      ");
            System.out.println("           |                    |                /                                               ");
            System.out.println("           |                    |               /                                                ");
            System.out.println("           |                    |              /                                                 ");
            System.out.println("           |                    |             /                                                  "); 
            System.out.println("           |                    |            /                                                   ");
            System.out.println("           |                    |           /                                                    "); 
            System.out.println("           |                    |          /                                                     "); 
            System.out.println("           |                    |         /                                                      ");
            System.out.println("           |                    |        /                                                       "); 
            System.out.println("    |"+cities[6]+"|-----|"+cities[5]+"|                                                                      ");   
            System.out.println("                                                                                           ");   
            System.out.println("___________________________________________________________________________________________");
            }
        }
    
}
