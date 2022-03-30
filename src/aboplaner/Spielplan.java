package aboplaner;

// @author Valentin

public class Spielplan
{
    // Bekannte Daten
    int einsatztermine;
    String spielweise;
    int anzahlSpieler;
    int anzahlFeiertage;
    
    public Spielplan()
    {
        
    }
    
    public void algorithmus()
    {
        aufteilen(14, "Doppel", 6, 5);
        //aufteilen(9, "Einzel", 3, 4);
        //int einsatztermine, String spielweise, int anzahlSpieler, int anzahlFeiertage);
    }
    
    public void aufteilen(int einsatztermine, String spielweise, int anzahlSpieler, int anzahlFeiertage)
    {
        int spielerProSpiel;
	if (spielweise.equals("Doppel"))
	{
		spielerProSpiel = 4;
	}
	else
	{
		spielerProSpiel = 2;
	}
	
	int gesamtEinsätze = einsatztermine * spielerProSpiel;
	int einsätzeProSpieler = gesamtEinsätze / anzahlSpieler;
        
	int restEinsätze = gesamtEinsätze - einsätzeProSpieler * anzahlSpieler;
	
	int[] spielerArray = new int[anzahlSpieler];
	
	for (int i = 0; i < spielerArray.length; i++)
	{
		spielerArray[i] = einsätzeProSpieler;
		// Array wird aufgefüllt mit der Grundanzahl an Einsätzen
	}
	
	for (int i = 0; i < restEinsätze; i++)
	{
		spielerArray[i] += 1;
		// Gesamtanzahl der Spieleinsätze pro Spieler
	}

	int gesamtEinsätzeFeiertage = anzahlFeiertage * spielerProSpiel;
	int einsätzeFeiertageProSpieler = gesamtEinsätzeFeiertage / anzahlSpieler;
	
	int restEinsätzeFeiertage = gesamtEinsätzeFeiertage - einsätzeFeiertageProSpieler * anzahlSpieler;
        
	int[] spielerArrayFeiertage = new int[anzahlSpieler];
        
	for (int i = 0; i < spielerArrayFeiertage.length; i++)
	{
		spielerArrayFeiertage[i] = einsätzeFeiertageProSpieler;
		// Array wird aufgefüllt mit der Grundanzahl an Einsätzen an Feiertagen
	}

	for (int i = 0; i < restEinsätzeFeiertage; i++)
	{
		spielerArrayFeiertage[i] += 1;
		// Gesamtanzahl der Spieleinsätze pro Spieler an Feiertagen
	}
	
	int[] spielerArrayOhneFeiertage = new int[anzahlSpieler];
        
	for (int i = 0; i < anzahlSpieler; i++)
	{
		spielerArrayOhneFeiertage[i] = spielerArray[i] - spielerArrayFeiertage[i];
		// Tatsächliche Anzahl der Einsätze von jedem Spieler (Einsätze - Feiertage)
	}
        
        // Ausgabe der Werte
        for (int i = 0; i < anzahlSpieler; i++)
        {
            System.out.println("Gesamtanzahl der Spieleinsätze von Spieler " + (i+1) +": " + spielerArray[i]);
            System.out.println("Gesamtanzahl der Spieleinsätze von Spieler " + (i+1) +" an Feiertagen: " + spielerArrayFeiertage[i]);
            System.out.println("Gesamtanzahl der Spieleinsätze von Spieler " + (i+1) +" ohne Feiertage: " + spielerArrayOhneFeiertage[i]);
        }
        
        zuteilen(einsatztermine, spielerProSpiel, anzahlSpieler, spielerArray, spielerArrayFeiertage, spielerArrayOhneFeiertage);
    }
    
    public void zuteilen(int einsatztermine, int spielerProSpiel, int anzahlSpieler, int[] spielerArray, int[] spielerArrayFeiertage, int[] spielerArrayOhneFeiertage)
    {
        int sortiervariable;
        int [] [] terminUebersicht = new int [einsatztermine] [spielerProSpiel];
        int counter = 1;
        int kombinationszahl = 0;
        System.out.println("");
        for (int i = 0; i < terminUebersicht.length; i++)
        {
            System.out.println("An Einsatztermin " + (i + 1) + " spielen folgende Spieler: ");
            for (int j = 0; j < terminUebersicht[i].length; j++)
            {
                if (spielerProSpiel == 2)
                {
                    if (anzahlSpieler == 3)
                    {
                        kombinationszahl = 1 + 2;
                        if (counter % kombinationszahl == 1)
                        {
                            if (j == 0)
                            {
                                terminUebersicht[i][j] = 1;
                                spielerArray[0] -= 1;
                            }
                            else
                            {
                                terminUebersicht[i][j] = 2;
                                spielerArray[1] -= 1;
                            }
                        }
                        else if (counter % kombinationszahl == 2)
                        {
                            if (j == 0)
                            {
                                terminUebersicht[i][j] = 3;
                                spielerArray[2] -= 1;
                            }
                            else
                            {
                                terminUebersicht[i][j] = 1;
                                spielerArray[0] -= 1;
                            }
                        }
                        else if (counter % kombinationszahl == 0)
                        {
                            if (j == 0)
                            {
                                terminUebersicht[i][j] = 2;
                                spielerArray[1] -= 1;
                            }
                            else
                            {
                                terminUebersicht[i][j] = 3;
                                spielerArray[2] -= 1;
                            }
                        }
                    }
                    else if (anzahlSpieler == 4)
                    {
                        kombinationszahl = 1 + 2 + 3;
                        
                    }
                }
                else if (spielerProSpiel == 4)
                {
                    if (j == 0)
                    {
                        terminUebersicht[i][j] = (int)(Math.random() * anzahlSpieler)+1;
                    }
                    else if (j == 1)
                    {
                        do
                        {
                            terminUebersicht[i][j] = (int)(Math.random() * anzahlSpieler)+1;
                        }
                        while (terminUebersicht[i][1] == terminUebersicht[i][0]);
                    }
                    else if (j == 2)
                    {
                        do
                        {
                            terminUebersicht[i][j] = (int)(Math.random() * anzahlSpieler)+1;
                        }
                        while (terminUebersicht[i][2] == terminUebersicht[i][0]
                                || terminUebersicht[i][2] == terminUebersicht[i][1]);
                    }
                    else if (j == 3)
                    {
                        do
                        {
                            terminUebersicht[i][j] = (int)(Math.random() * anzahlSpieler)+1;
                        }
                        while (terminUebersicht[i][3] == terminUebersicht[i][0]
                                || terminUebersicht[i][3] == terminUebersicht[i][1]
                                || terminUebersicht[i][3] == terminUebersicht[i][2]);
                        
                        //SortierAlgorithmus
                        
                        
                    }
                }
                
                System.out.println("Spieler: " + terminUebersicht[i][j]);
            }
            counter++;
        }
        System.out.println("Die Einsatztermine: " + (counter-1));
        
        // Alle möglichen Kombinationen berechnen und zuweisen
    }
}