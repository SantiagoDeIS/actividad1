/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewsfootball;

import java.util.List;

/**
 *
 * @author entrar
 */
public class ClienteWSFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Yellow cards" + yellowCardsTotal());
        //System.out.println("defensas: " + allDefenders("Germany").getString())
        
        List<TCountryInfo> tcountryinfo = countryNames(true).getTCountryInfo();
        for(TCountryInfo tcountryinfol: tcountryinfo){
            System.out.println(tcountryinfol.getSName());
            String country = tcountryinfol.getSName();
            System.out.println("defensas: " + allDefenders(country).getString());
        }
        
    }

    private static int yellowCardsTotal() {
        clientewsfootball.Info service = new clientewsfootball.Info();
        clientewsfootball.InfoSoapType port = service.getInfoSoap();
        return port.yellowCardsTotal();
    }

    private static ArrayOfString allDefenders(java.lang.String sCountryName) {
        clientewsfootball.Info service = new clientewsfootball.Info();
        clientewsfootball.InfoSoapType port = service.getInfoSoap();
        return port.allDefenders(sCountryName);
    }

    private static ArrayOftCountryInfo countryNames(boolean bWithCompetitors) {
        clientewsfootball.Info service = new clientewsfootball.Info();
        clientewsfootball.InfoSoapType port = service.getInfoSoap();
        return port.countryNames(bWithCompetitors);
    }
    
}
