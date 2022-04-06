package com.melone.itismeucci;


public class CrittografiaPolialfabetica 
{

   public static void main(String arg[]) 
   {
      String testo = "ADOGNIAZIONECORRISPONDEUNAREAZIONEUGUALEECONTRARIA";
      String testoChiave = "NEWTON";
      codificaDecodifica(testo, testoChiave);
   }

   public static void codificaDecodifica(String testo, String testoChiave) 
   {
      
      char msg[] = testo.toCharArray();
      int lunghezzaMsg = msg.length;
      int i, j;


      char chiave1[] = new char[lunghezzaMsg];
      char msgCodificato[] = new char[lunghezzaMsg];
      char msgDecodificato[] = new char[lunghezzaMsg];


      for (i = 0, j = 0; i < lunghezzaMsg; ++i, ++j) 
      {
         if (j == testoChiave.length()) {
            j = 0;
         }
         chiave1[i] = testoChiave.charAt(j);
      }

      // Codifica
      for (i = 0; i < lunghezzaMsg; ++i) 
      {
         msgCodificato[i] = (char) (((msg[i] + chiave1[i]) % 26) + 'A');
      }
      // Decodifica
      for (i = 0; i < lunghezzaMsg; ++i) 
      {
         msgDecodificato[i] = (char) ((((msgCodificato[i] - chiave1[i]) + 26) % 26) + 'A');
      }

      //Output
      System.out.println("Messaggio originale: " + testo);
      System.out.println("Chiave: " + testoChiave);

      System.out.println("Composizione frase con chiave: " + String.valueOf(chiave1));
      System.out.println();
      System.out.println("Messaggio codificato: " + String.valueOf(msgCodificato));
      System.out.println();
      System.out.println("Messaggio decodificato: " + String.valueOf(msgDecodificato));
   }
}
