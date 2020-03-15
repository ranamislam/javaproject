package PasswordScure;

import java.util.*;
public class Password
{
    public static void main(String[] args)
    {
        System.out.print("Please enter the password that you would like to get a secure code: "); //Ask for the password
        Scanner keyboard = new Scanner(System.in);
        String inputPassword = keyboard.nextLine(); //Get the password

        char[] charStorage = new char[inputPassword.length()];

        char AA = 'x', B = 'x', C = 'x', D = 'x', E = 'x', F = 'x', G = 'x', H = 'x', I = 'x', J = 'x',
                K = 'x', L = 'x', M = 'x', N = 'x', O = 'x', P = 'x', Q = 'x', R = 'x', S = 'x', T = 'x',
                U = 'x', V = 'x', W = 'x', X = 'x', Y = 'x', Z = 'x';

        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0, n0 = 1;

        char a = 'y', b = 'y', c = 'y', d = 'y', e = 'y', f = 'y', g = 'y', h = 'y', i = 'y', j = 'y',
                k = 'y', l = 'y', m = 'y', n = 'y', o = 'y', p = 'y', q = 'y', r = 'y', s = 'y', t = 'y',
                u = 'y', v = 'y', w = 'y', x = 'y', y = 'z', z = 'y';

        String c1 = "QW", c2 = "9K", c3 = "JK", c4 = "P3", c5 = "ZA", c6 = "KK",  c7 = "GH",  c8 = "AA",  c9 = "DX",   c10 = "OL",
                c11 = "Q9", c12 = "KE", c13 = "GK", c14 = "43", c15 = "ZC", c16 = "SJ",  c17 = "YH",  c18 = "22",  c19 = "2X",   c20 = "OJ",
                c21 = "RR", c22 = "DV", c23 = "JJ", c24 = "PL", c25 = "ES", c26 = "32",  c27 = "O3",  c28 = "MW",  c29 = "XI",   c30 = "0G",
                c31 = "JV", c32 = "97", c33 = "5G", c34 = "22", c35 = "Z4", c36 = "PZ",  c37 = "3H",  c38 = "45",  c39 = "7D",   c40 = "G1",
                c41 = "3V", c42 = "T5", c43 = "CF", c44 = "II", c45 = "HQ", c46 = "5R",  c47 = "GZ",  c48 = "RE",  c49 = "SP",   c50 = "WN",
                c51 = "JA", c52 = "6K", c53 = "JF", c54 = "MG", c55 = "4Z", c56 = "DB",  c57 = "MZ",  c58 = "D1",  c59 = "MV",   c60 = "KL",
                c61 = "J5", c62 = "UG", c63 = "LK";


        /*
        System.out.println(inputPassword);


        for(int ir = 0; ir < inputPassword.length(); ir++)
        {
            charStorage[ir] = inputPassword.charAt(ir);
        }

        for(char ch : charStorage)
            System.out.print(ch);

         */

        /*

        for(int iretation = 0; iretation < inputPassword.length(); iretation++)
        {
            char inputPasswordChar = inputPassword.charAt(iretation);
            charStorage[iretation] = inputPasswordChar;
            if(charStorage[iretation] == 'A')
            {
                A = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'B')
            {
                B = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'C')
            {
                C = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'D')
            {
                D = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'E')
            {
                E = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'F')
            {
                F = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'G')
            {
                G = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'H')
            {
                H = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'I')
            {
                I = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'J')
            {
                J = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'L')
            {
                L = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'K')
            {
                K = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'M')
            {
                M = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'N')
            {
                N = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'O')
            {
                O = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'P')
            {
                P = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'Q')
            {
                Q = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'R')
            {
                R = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'S')
            {
                S = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'T')
            {
                T = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'U')
            {
                U = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'V')
            {
                V = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'W')
            {
                W = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'X')
            {
                X = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'Y')
            {
                Y = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'Z')
            {
                Z = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'a')
            {
                a = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'b')
            {
                b = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'c')
            {
                c = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'd')
            {
                d = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'e')
            {
                e = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'f')
            {
                f = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'g')
            {
                g = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'h')
            {
                h = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'i')
            {
                i = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'j')
            {
                j = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'k')
            {
                k = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'l')
            {
                l = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'm')
            {
                m = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'n')
            {
                n = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'o')
            {
                o = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'p')
            {
                p = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'q')
            {
                q = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'r')
            {
                r = charStorage[iretation];
            }
            else if(charStorage[iretation] == 's')
            {
                s = charStorage[iretation];
            }
            else if(charStorage[iretation] == 't')
            {
                t = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'u')
            {
                u = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'v')
            {
                v = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'w')
            {
                w = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'x')
            {
                x = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'y')
            {
                y = charStorage[iretation];
            }
            else if(charStorage[iretation] == 'z')
            {
                z = charStorage[iretation];
            }
            else if(charStorage[iretation] == 1)
            {
                n1 = charStorage[iretation];
            }
            else if(charStorage[iretation] == 2)
            {
                n2 = charStorage[iretation];
            }
            else if(charStorage[iretation] == 3)
            {
                n3 = charStorage[iretation];
            }
            else if(charStorage[iretation] == 4)
            {
                n4 = charStorage[iretation];
            }
            else if(charStorage[iretation] == 5)
            {
                n5 = charStorage[iretation];
            }
            else if(charStorage[iretation] == 6)
            {
                n6 = charStorage[iretation];
            }
            else if(charStorage[iretation] == 7)
            {
                n7 = charStorage[iretation];
            }
            else if(charStorage[iretation] == 8)
            {
                n8 = charStorage[iretation];
            }
            else if(charStorage[iretation] == 9)
            {
                n9 = charStorage[iretation];
            }
            else if(charStorage[iretation] == 0)
            {
                n0 = charStorage[iretation];
            }




        }

        */


    if (charStorage[0] == AA)
        System.out.println(charStorage[0]);
    else
        System.out.println("Not");


/*
        if(B == 'B')
        {
            display(c2);
        }
        if(C == 'C')
        {
            display(c3);
        }
        if(D == 'D')
        {
            display(c4);
        }
        if(E == 'E')
        {
            display(c5);
        }
        if(F == 'F')
        {
            display(c6);
        }
        if(G == 'G')
        {
            display(c7);
        }
        if(H == 'H')
        {
            display(c8);
        }
        if(I == 'I')
        {
            display(c9);
        }
        if(J == 'J')
        {
            display(c10);
        }
        if(K == 'K')
        {
            display(c11);
        }
        if(L == 'L')
        {
            display(c12);
        }
        if(M == 'M')
        {
            display(c13);
        }
        if(N == 'N')
        {
            display(c14);
        }
        if(O == 'O')
        {
            display(c15);
        }
        if(P == 'P')
        {
            display(c16);
        }
        if(Q == 'Q')
        {
            display(c17);
        }
        if(R == 'R')
        {
            display(c18);
        }
        if(S == 'S')
        {
            display(c19);
        }
        if(T == 'T')
        {
            display(c20);
        }
        if(U == 'U')
        {
            display(c21);
        }
        if(V == 'V')
        {
            display(c22);
        }
        if(W == 'W')
        {
            display(c23);
        }
        if(X == 'X')
        {
            display(c24);
        }
        if(Y == 'Y')
        {
            display(c25);
        }
        if(Z == 'Z')
        {
            display(c26);
        }
        if(a == 'a')
        {
            display(c27);
        }
        if(b == 'b')
        {
            display(c28);
        }
        if(c == 'c')
        {
            display(c29);
        }
        if(d == 'd')
        {
            display(c30);
        }
        if(e == 'e')
        {
            display(c31);
        }
        if(f == 'f')
        {
            display(c32);
        }
        if(g == 'g')
        {
            display(c33);
        }
        if(h == 'h')
        {
            display(c34);
        }
        if(i == 'i')
        {
            display(c35);
        }
        if(j == 'j')
        {
            display(c36);
        }
        if(k == 'k')
        {
            display(c37);
        }
        if(l == 'l')
        {
            display(c38);
        }
        if(m == 'm')
        {
            display(c39);
        }
        if(n == 'n')
        {
            display(c40);
        }
        if(o == 'o')
        {
            display(c41);
        }
        if(p == 'p')
        {
            display(c42);
        }
        if(q == 'q')
        {
            display(c43);
        }
        if(r == 'r')
        {
            display(c45);
        }
        if(s == 's')
        {
            display(c46);
        }
        if(t == 't')
        {
            display(c47);
        }
        if(u == 'u')
        {
            display(c48);
        }
        if(v == 'v')
        {
            display(c49);
        }
        if(w == 'w')
        {
            display(c50);
        }
        if(x == 'x')
        {
            display(c51);
        }
        if(y == 'z')
        {
            display(c51);
        }
        if(z == 'z')
        {
            display(c53);
        }
        if(n1 == 1)
        {
            display(c54);
        }
        if(n2 == 2)
        {
            display(c55);
        }
        if(n3 == 3)
        {
            display(c56);
        }
        if(n4 == 4)
        {
            display(c57);
        }
        if(n5 == 5)
        {
            display(c58);
        }
        if(n6 == 6)
        {
            display(c59);
        }
        if(n7 == 7)
        {
            display(c60);
        }
        if(n8 == 8)
        {
            display(c61);
        }
        if(n9 == 9)
        {
            display(c62);
        }

        if(n0 == 0)
        {
            display(c63);
        }

        //System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + F + " " + G + " " + H + " " + a);

*/
    }


    public void display(String s)
    {
        System.out.print(s+ "-");
    }

}

