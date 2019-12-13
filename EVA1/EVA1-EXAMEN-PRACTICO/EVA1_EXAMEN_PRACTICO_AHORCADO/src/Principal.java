
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NIDIA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        char[][] cAp = new char[5][];
        char[][] cApc = new char[5][];
        int iOp = 4, iVolver = 0;
        boolean resp = false, resVolver = false;

        cAp[0] = new char[7];
        cAp[1] = new char[5];
        cAp[2] = new char[4];
        cAp[3] = new char[7];
        cAp[4] = new char[6];

        cApc[0] = new char[7];
        cApc[1] = new char[5];
        cApc[2] = new char[4];
        cApc[3] = new char[7];
        cApc[4] = new char[6];

        //PALABRA 1
        cAp[0][0] = 'c';
        cAp[0][1] = 'a';
        cAp[0][2] = 'b';
        cAp[0][3] = 'a';
        cAp[0][4] = 'l';
        cAp[0][5] = 'l';
        cAp[0][6] = 'o';

        //PALABRA 2
        cAp[1][0] = 'p';
        cAp[1][1] = 'a';
        cAp[1][2] = 'p';
        cAp[1][3] = 'e';
        cAp[1][4] = 'l';

        //PALABRA 3
        cAp[2][0] = 'v';
        cAp[2][1] = 'a';
        cAp[2][2] = 's';
        cAp[2][3] = 'o';

        //PALABRA 4
        cAp[3][0] = 'b';
        cAp[3][1] = 'o';
        cAp[3][2] = 't';
        cAp[3][3] = 'e';
        cAp[3][4] = 'l';
        cAp[3][5] = 'l';
        cAp[3][6] = 'a';

        //PALABRA 5
        cAp[4][0] = 'a';
        cAp[4][1] = 'z';
        cAp[4][2] = 'u';
        cAp[4][3] = 'c';
        cAp[4][4] = 'a';
        cAp[4][5] = 'r';

        //PALABRA 1
        cApc[0][0] = ' ';
        cApc[0][1] = ' ';
        cApc[0][2] = ' ';
        cApc[0][3] = ' ';
        cApc[0][4] = ' ';
        cApc[0][5] = ' ';
        cApc[0][6] = ' ';

        //PALABRA 2
        cApc[1][0] = ' ';
        cApc[1][1] = ' ';
        cApc[1][2] = ' ';
        cApc[1][3] = ' ';
        cApc[1][4] = ' ';

        //PALABRA 3
        cApc[2][0] = ' ';
        cApc[2][1] = ' ';
        cApc[2][2] = ' ';
        cApc[2][3] = ' ';

        //PALABRA 4
        cApc[3][0] = ' ';
        cApc[3][1] = ' ';
        cApc[3][2] = ' ';
        cApc[3][3] = ' ';
        cApc[3][4] = ' ';
        cApc[3][5] = ' ';
        cApc[3][6] = ' ';

        //PALABRA 5
        cApc[4][0] = ' ';
        cApc[4][1] = ' ';
        cApc[4][2] = ' ';
        cApc[4][3] = ' ';
        cApc[4][4] = ' ';
        cApc[4][5] = ' ';

        int iPalabra = (int) (Math.random() * 4);
        while (iVolver == 0) {
            switch (iPalabra) {
                case 0:
                    imprimirArreglo(cApc, iPalabra);
                    System.out.println("\nTiene 4 oportunidades para adivinar");
                    while (iOp > 0 && iVolver == 0 && iPalabra == 0) {
                        resp = false;
                        System.out.println("\n¿Sabe la palabra? (Contestar si o no)");
                        String res = Leer.nextLine();
                        if (res.equals("si")) {
                            System.out.println("Ingrese la palabra");
                            String pal = Leer.nextLine();

                            if (compararPal(pal, cApc, cAp, iPalabra, resp)) {
                                imprimirArreglo(cApc, iPalabra);
                                System.out.println("Ganaste!!:D");
                                System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                String resu = Leer.nextLine();
                                if (resu.equals("si")) {
                                    iVolver = 0;
                                    iOp = 4;
                                    iPalabra = (int) (Math.random() * 4);
                                    while (iPalabra == 0) {
                                        iPalabra = (int) (Math.random() * 4);
                                    }
                                    for (int i = 0; i < cApc[iPalabra].length; i++) {
                                        cApc[iPalabra][i] = ' ';
                                    }
                                } else if (resu.equals("no")) {
                                    iVolver = 1;
                                }
                            } else {
                                System.out.println("Tienes una oportunidad menos");
                                iOp--;
                                System.out.println("Oportunidades: " + iOp);
                                imprimirArreglo(cApc, iPalabra);
                                if (iOp == 0) {
                                    System.out.println("Perdiste!!");
                                    imprimirArreglo(cApc,iPalabra);
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 0) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }

                            }
                        } else if (res.equals("no")) {
                            System.out.println("Ingrese una letra a adivinar");
                            String pal = Leer.nextLine();

                            if (compararLet(pal, cApc, cAp, iPalabra, resp)) {
                                imprimirArreglo(cApc, iPalabra);
                                if (volverJuego(cApc, iPalabra, resVolver)) {
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 0) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }
                            } else {
                                System.out.println("Tienes una oportunidad menos");
                                iOp--;
                                System.out.println("Oportunidades: " + iOp);
                                imprimirArreglo(cApc, iPalabra);
                                if (iOp == 0) {
                                    System.out.println("Perdiste!!");
                                    imprimirArreglo(cApc,iPalabra);
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 0) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    imprimirArreglo(cApc, iPalabra);
                    System.out.println("\nTiene 4 oportunidades para adivinar");
                    while (iOp > 0 && iVolver == 0 && iPalabra == 1) {
                        resp = false;
                        System.out.println("\n¿Sabe la palabra? (Contestar si o no)");
                        String res = Leer.nextLine();
                        if (res.equals("si")) {
                            System.out.println("Ingrese la palabra");
                            String pal = Leer.nextLine();

                            if (compararPal(pal, cApc, cAp, iPalabra, resp)) {
                                imprimirArreglo(cApc, iPalabra);
                                System.out.println("Ganaste!!:D");
                                System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                String resu = Leer.nextLine();
                                if (resu.equals("si")) {
                                    iVolver = 0;
                                    iOp = 4;
                                    iPalabra = (int) (Math.random() * 4);
                                    while (iPalabra == 1) {
                                        iPalabra = (int) (Math.random() * 4);
                                    }
                                    for (int i = 0; i < cApc[iPalabra].length; i++) {
                                        cApc[iPalabra][i] = ' ';
                                    }
                                } else if (resu.equals("no")) {
                                    iVolver = 1;
                                }
                            } else {
                                System.out.println("Tienes una oportunidad menos");
                                iOp--;
                                System.out.println("Oportunidades: " + iOp);
                                imprimirArreglo(cApc, iPalabra);
                                if (iOp == 0) {
                                    System.out.println("Perdiste!!");
                                    imprimirArreglo(cApc,iPalabra);
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 1) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }

                            }
                        } else if (res.equals("no")) {
                            System.out.println("Ingrese una letra a adivinar");
                            String pal = Leer.nextLine();

                            if (compararLet(pal, cApc, cAp, iPalabra, resp)) {
                                imprimirArreglo(cApc, iPalabra);
                                if (volverJuego(cApc, iPalabra, resVolver)) {
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 1) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }
                            } else {
                                System.out.println("Tienes una oportunidad menos");
                                iOp--;
                                System.out.println("Oportunidades: " + iOp);
                                imprimirArreglo(cApc, iPalabra);
                                if (iOp == 0) {
                                    System.out.println("Perdiste!!");
                                    imprimirArreglo(cApc,iPalabra);
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 1) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    imprimirArreglo(cApc, iPalabra);
                    System.out.println("\nTiene 4 oportunidades para adivinar");
                    while (iOp > 0 && iVolver == 0 && iPalabra == 2) {
                        resp = false;
                        System.out.println("\n¿Sabe la palabra? (Contestar si o no)");
                        String res = Leer.nextLine();
                        if (res.equals("si")) {
                            System.out.println("Ingrese la palabra");
                            String pal = Leer.nextLine();

                            if (compararPal(pal, cApc, cAp, iPalabra, resp)) {
                                imprimirArreglo(cApc, iPalabra);
                                System.out.println("Ganaste!!:D");
                                System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                String resu = Leer.nextLine();
                                if (resu.equals("si")) {
                                    iVolver = 0;
                                    iOp = 4;
                                    iPalabra = (int) (Math.random() * 4);
                                    while (iPalabra == 2) {
                                        iPalabra = (int) (Math.random() * 4);
                                    }
                                    for (int i = 0; i < cApc[iPalabra].length; i++) {
                                        cApc[iPalabra][i] = ' ';
                                    }
                                } else if (resu.equals("no")) {
                                    iVolver = 1;
                                }
                            } else {
                                System.out.println("Tienes una oportunidad menos");
                                iOp--;
                                System.out.println("Oportunidades: " + iOp);
                                imprimirArreglo(cApc, iPalabra);
                                if (iOp == 0) {
                                    System.out.println("Perdiste!!");
                                    imprimirArreglo(cAp,iPalabra);
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 2) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }

                            }
                        } else if (res.equals("no")) {
                            System.out.println("Ingrese una letra a adivinar");
                            String pal = Leer.nextLine();

                            if (compararLet(pal, cApc, cAp, iPalabra, resp)) {
                                imprimirArreglo(cApc, iPalabra);
                                if (volverJuego(cApc, iPalabra, resVolver)) {
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 2) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }
                            } else {
                                System.out.println("Tienes una oportunidad menos");
                                iOp--;
                                System.out.println("Oportunidades: " + iOp);
                                imprimirArreglo(cApc, iPalabra);
                                if (iOp == 0) {
                                    System.out.println("Perdiste!!");
                                    imprimirArreglo(cAp,iPalabra);
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 2) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    imprimirArreglo(cApc, iPalabra);
                    System.out.println("\nTiene 4 oportunidades para adivinar");
                    while (iOp > 0 && iVolver == 0 && iPalabra == 3) {
                        resp = false;
                        System.out.println("\n¿Sabe la palabra? (Contestar si o no)");
                        String res = Leer.nextLine();
                        if (res.equals("si")) {
                            System.out.println("Ingrese la palabra");
                            String pal = Leer.nextLine();

                            if (compararPal(pal, cApc, cAp, iPalabra, resp)) {
                                imprimirArreglo(cApc, iPalabra);
                                System.out.println("Ganaste!!:D");
                                System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                String resu = Leer.nextLine();
                                if (resu.equals("si")) {
                                    iVolver = 0;
                                    iOp = 4;
                                    iPalabra = (int) (Math.random() * 4);
                                    while (iPalabra == 3) {
                                        iPalabra = (int) (Math.random() * 4);
                                    }
                                    for (int i = 0; i < cApc[iPalabra].length; i++) {
                                        cApc[iPalabra][i] = ' ';
                                    }
                                } else if (resu.equals("no")) {
                                    iVolver = 1;
                                }
                            } else {
                                System.out.println("Tienes una oportunidad menos");
                                iOp--;
                                System.out.println("Oportunidades: " + iOp);
                                imprimirArreglo(cApc, iPalabra);
                                if (iOp == 0) {
                                    System.out.println("Perdiste!!");                                    
                                    imprimirArreglo(cAp,iPalabra);
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 3) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }

                            }
                        } else if (res.equals("no")) {
                            System.out.println("Ingrese una letra a adivinar");
                            String pal = Leer.nextLine();

                            if (compararLet(pal, cApc, cAp, iPalabra, resp)) {
                                imprimirArreglo(cApc, iPalabra);
                                if (volverJuego(cApc, iPalabra, resVolver)) {
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 3) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }
                            } else {
                                System.out.println("Tienes una oportunidad menos");
                                iOp--;
                                System.out.println("Oportunidades: " + iOp);
                                imprimirArreglo(cApc, iPalabra);
                                if (iOp == 0) {
                                    System.out.println("Perdiste!!");                                    
                                    imprimirArreglo(cAp,iPalabra);
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 3) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    imprimirArreglo(cApc, iPalabra);
                    System.out.println("\nTiene 4 oportunidades para adivinar");
                    while (iOp > 0 && iVolver == 0 && iPalabra == 4) {
                        resp = false;
                        System.out.println("\n¿Sabe la palabra? (Contestar si o no)");
                        String res = Leer.nextLine();
                        if (res.equals("si")) {
                            System.out.println("Ingrese la palabra");
                            String pal = Leer.nextLine();

                            if (compararPal(pal, cApc, cAp, iPalabra, resp)) {
                                imprimirArreglo(cApc, iPalabra);
                                System.out.println("Ganaste!!:D");
                                System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                String resu = Leer.nextLine();
                                if (resu.equals("si")) {
                                    iVolver = 0;
                                    iOp = 4;
                                    iPalabra = (int) (Math.random() * 4);
                                    while (iPalabra == 2) {
                                        iPalabra = (int) (Math.random() * 4);
                                    }
                                    for (int i = 0; i < cApc[iPalabra].length; i++) {
                                        cApc[iPalabra][i] = ' ';
                                    }
                                } else if (resu.equals("no")) {
                                    iVolver = 1;
                                }
                            } else {
                                System.out.println("Tienes una oportunidad menos");
                                iOp--;
                                System.out.println("Oportunidades: " + iOp);
                                imprimirArreglo(cApc, iPalabra);
                                if (iOp == 0) {
                                    System.out.println("Perdiste!!");                                    
                                    imprimirArreglo(cAp,iPalabra);
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 2) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }

                            }
                        } else if (res.equals("no")) {
                            System.out.println("Ingrese una letra a adivinar");
                            String pal = Leer.nextLine();

                            if (compararLet(pal, cApc, cAp, iPalabra, resp)) {
                                imprimirArreglo(cApc, iPalabra);
                                if (volverJuego(cApc, iPalabra, resVolver)) {
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 4) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }
                            } else {
                                System.out.println("Tienes una oportunidad menos");
                                iOp--;
                                System.out.println("Oportunidades: " + iOp);
                                imprimirArreglo(cApc, iPalabra);
                                if (iOp == 0) {
                                    System.out.println("Perdiste!!");
                                    imprimirArreglo(cAp,iPalabra);
                                    System.out.println("\n¿Volver a jugar? (Contestar si o no)");
                                    String resu = Leer.nextLine();
                                    if (resu.equals("si")) {
                                        iVolver = 0;
                                        iOp = 4;
                                        iPalabra = (int) (Math.random() * 4);
                                        while (iPalabra == 4) {
                                            iPalabra = (int) (Math.random() * 4);
                                        }
                                        for (int i = 0; i < cApc[iPalabra].length; i++) {
                                            cApc[iPalabra][i] = ' ';
                                        }
                                    } else if (resu.equals("no")) {
                                        iVolver = 1;
                                    }
                                }
                            }
                        }
                    }
                    break;
            }
        }
    }

    public static void imprimirArreglo(char[][] args, int val) {
        for (int i = 0; i < args[val].length; i++) {
            System.out.print(" [" + args[val][i] + "] ");
        }
    }

    public static boolean compararPal(String pal2, char[][] cApc2, char[][] cAp2, int val, boolean resp2) {
        for (int i = 0; i < pal2.length(); i++) {
            if (pal2.charAt(i) == (cAp2[val][i])) {
                cApc2[val][i] = cAp2[val][i];
                resp2 = true;
            } else {
                resp2 = false;
            }
        }
        return resp2;
    }

    public static boolean compararLet(String pal2, char[][] cApc2, char[][] cAp2, int val, boolean resp2) {
        int c = 0;
        for (int i = 0; i < cAp2[val].length; i++) {
            if (pal2.charAt(0) == (cAp2[val][i])) {
                cApc2[val][i] = cAp2[val][i];
                resp2 = true;
            }
            if (cApc2[val][i] != ' ') {
                c++;
            }
        }
        if (c == cAp2[val].length) {
            System.out.println("Ganaste!!:D");
        }
        return resp2;
    }

    public static boolean volverJuego(char[][] cApc2, int val, boolean resVolver2) {
        int c = 0;
        for (int i = 0; i < cApc2[val].length; i++) {
            if (cApc2[val][i] != ' ') {
                c++;
            }
        }
        if (c == cApc2[val].length) {
            resVolver2 = true;
        }
        return resVolver2;
    }
}
