/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commercialnumbers;

import java.awt.Button;
import java.awt.Font;
import java.awt.Window;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author vazhenin
 */
public class CommercialNumbersWindow extends javax.swing.JFrame {

    Font f;
    boolean foundCategory = false;

    String[] president = new String[]{"AAAAAAA"};
    String[] vip = new String[]{"AAAAAAB", "ABBBBBB"};
    String[] prime = new String[]{
        //<editor-fold defaultstate="collapsed" desc="Prime">
        "7000700",
        "7080708",
        "700700A",
        "700A700",
        "708708A",
        "708A708",
        "A700700",
        "A708708",
        "AAAAABA",
        "AAAAABC",
        "ABAAAAA",
        "ABBBBBC",
        "ABCCCCC"};
//</editor-fold>
    String[] platina = new String[]{
        //<editor-fold defaultstate="collapsed" desc="Platina">
        "AABBBBB",
        "AAAAABB",
        "ABBBBBA",
        "AAABBBB",
        "AAAABBB",
        "ABBBBAA",
        "AABBBBA",
        "ABAAAAB",
        "AAABBAA"};
//</editor-fold>
    String[] gold = new String[]{
        //<editor-fold defaultstate="collapsed" desc="Gold">
        "A00X000",
        "AAAABAA",
        "AAAABAB",
        "AAAABBA",
        "AAAABBC",
        "AAAABCA",
        "AAAABCC",
        "AAABAAA",
        "AAABAAB",
        "AAABAAC",
        "AAABABA",
        "AAABABB",
        "AAABACA",
        "AAABACC",
        "AAABBAB",
        "AABAAAA",
        "AABAABB",
        "AABABAB",
        "AABBAAA",
        "AABBAAB",
        "AABBABB",
        "AABBBBC",
        "AABCCCC",
        "ABAABAA",
        "ABAABAB",
        "ABABAAA",
        "ABABBAA",
        "ABABBAB",
        "ABABBBA",
        "ABACCCC",
        "ABBAAAA",
        "ABBAABB",
        "ABBABAB",
        "ABBBAAB",
        "ABBBABA",
        "ABBBABB",
        "ABBBBAB",
        "ABBBBAC",
        "ABBBBCA",
        "ABBBBCB",
        "ABBBCBB",
        "ABBBCCB",
        "ABBCBBB",
        "ABCA000",
        "ABCBBBA",
        "ABCBBBC",
        "ABCCCCB",
        "BABAAAA",
        "BBBBABC",
        "CAAAABB",
        "CAABBBB",
        "CCCCABA",
        "ABCCCCA",
        "ABAAABB",
        "ACBBBCC",
        "AABAABA",
        "AABACAA",
        "AABCAAA",
        "ABAAACA",
        "ABAACAA"}; //
//</editor-fold>
    String[] silver = new String[]{
        //<editor-fold defaultstate="collapsed" desc="Silver">
        "1234567",
        "2345678",
        "3456789",
        "7654321",
        "8765432",
        "9876543",
        "AAABBBA",
        "AAABBBC",
        "AAABCAA",
        "AAABCBC",
        "AAABCCB",
        "AAABCCC",
        "AABAAAB",
        "AABABAA",
        "AABABBA",
        "AABABBB",
        "AABBABA",
        "AABBBAA",
        "AABBBAB",
        "AABBBCC",
        "AABCAAB",
        "AABCBBB",
        "AABCCCB",
        "ABAAAAC",
        "ABAAABA",
        "ABAABBA",
        "ABAABBB",
        "ABABCCC",
        "ABACAAA",
        "ABACABA",
        "ABACACA",
        "ABACCCA",
        "ABBAAAB",
        "ABBAABA",
        "ABBABAA",
        "ABBABBA",
        "ABBABBB",
        "ABBABBC",
        "ABBACAC",
        "ABBACCC",
        "ABBBAAA",
        "ABBBCBC",
        "ABBBCCC",
        "ABBCABB",
        "ABBCBBC",
        "ABBCBCB",
        "ABBCCBB",
        "ABBCCCA",
        "ABBCCCB",
        "ABCAAAB",
        "ABCAAAC",
        "ABCAABB",
        "ABCABAB",
        "ABCABBA",
        "ABCABBB",
        "ABCACCC",
        "ABCB000",
        "ABCBBBB",
        "ABCBCCC",
        "ABCCBBB",
        "ABCCBCB",
        "ABCCBCC",
        "ABCCCBA",
        "ABCCCBB",
        "ABCD000",
        "ABCDEEE",
        "АВСCEEE",
        "АВСССDD",
        "АВСССDX",
        "ABCAAAA",
        "AABAAAC",
        "AABAABC",
        "ABCCDDD",
        "ABCCCDD",
        "AABACCA",
        "AABACCC",
        "AAABCAB",
        "AABBAAC",
        "AABBACA",
        "AABBBCB",
        "AABBCAA",
        "AABBCBB",
        "AABCACA",
        "AABCCAA",
        "ABAACCA",
        "ABABBCB",
        "ABABCBB",
        "ABACCAA",
        "ABBAAAC",
        "ABBAACA",
        "ABBACAA",
        "ABBBABC",
        "ABBBACB",
        "ABBBBCD",
        "ABBBCAB",
        "ABBBCBA",
        "ABBCAAA",
        "ABBCBAB",
        "ABBCBBD",
        "ABBCBDB",
        "ABBCDBB",
        "ABCBAAA",
        "ABCBABB",
        "ABCBBAB",
        "ABCBCBB",
        "ABCCACC"};
//</editor-fold>
    String[] bronze = new String[]{
        //<editor-fold defaultstate="collapsed" desc="Bronze">
        "7080700",
        "708X700",
        "AAABABC",
        "AAABBCB",
        "AAABBCC",
        "AAABCAC",
        "AAABCBA",
        "AAABCCA",
        "AABBCBC",
        "AABBCCB",
        "AACABAB",
        "ABAACCC",
        "ABABAAB",
        "ABABABA",
        "ABABABB",
        "ABABABC",
        "ABABBBC",
        "ABACBBB",
        "ABACBBC",
        "ABBABCB",
        "ABBCBBA",
        "ABCABCC",
        "ABCACAC",
        "ABCBABA",
        "ABCBBCB",
        "ABCBBCC",
        "ABCBCBC",
        "ABCBCCB",
        "ABCCACA",
        "ABCCBBC",
        "ABCCCAB",
        "ABCCCBC",
        "ABCCCCD",
        "ACDBBBB",
        "ABBCCDD",
        "AAAABCD",
        "AABBCCC",
        "ABCDDEE",
        "ABCDEDE",
        "ABCDEED",
        "AACDEDE",
        "AABAACA",
        "AABAACB",
        "AABAACC",
        "AABABBC",
        "AABABCC",
        "ABBCDCD",
        "ABBCDDD",
        "ABCCCBD",
        "ABCCDCD",
        "AABCDDD",
        "ABCDBBB",
        "ABCCXCC",
        "ABCXABC",
        "ABCDCDC",
        "ABCDDDX",
        "ABCCCDX",
        "ABCDCCC",
        "AABBBCX",
        "ABCCCDC",
        "AAABACB",
        "AAABBAC",
        "AAABBCA",
        "AAA0B00",
        "AA0AB00",
        "AA000AB",
        "AA000BA",
        "AABCAAD",
        "AA0B0A0",
        "AA0B00B",
        "AA0B00C",
        "AABCBCB",
        "AA0B0BB",
        "AA0B0C0",
        "AABCCBB",
        "AABCDAA",
        "AA0BC00",
        "AABCDCD",
        "ABAAABC",
        "ABAAACB",
        "ABAAACC",
        "ABAACAC",
        "ABABCAA",
        "ABACBCB",
        "ABACCBB",
        "ABACDCD",
        "ABBACBB",
        "ABCAABA",
        "ABCAACA",
        "ABCBBBD",
        "ABCBBDB",
        "ABCCAAA",
        "ABCCAAC",
        "ABCCCAC",
        "ABCCDCC",
        "ABCDAAA",
        "ABCDBDB",
        "ABCDDBB",
        "ABCDDCC"}; //
//</editor-fold>

    /* City mask range */
    String[] cityGold = new String[]{
        //<editor-fold defaultstate="collapsed" desc="City Gold">        
        "ABCCCC",
        "ABCCCA",
        "ABCCCB",
        "ABCCC0",
        "ABCCCD",
        "ABCDDD",
        "ABCAAA",
        "ABCBBB",
        "ABC000",
        "ABCABC",
        "ABCCBA",
        "AABBBB",
        "AABBBA",
        "AABBB0",
        "AABBBD",
        "AABDDD",
        "AABAAA",
        "AAB000",
        "AABAAB",
        "ABAAAA",
        "ABAAAB",
        "ABAAA0",
        "ABAAAD",
        "ABADDD",
        "ABABBB",
        "ABA000",
        "ABAABA",
        "ABABAB",
        "ABBBBA",
        "ABBBB0",
        "ABBBBD",
        "ABBBAA",
        "ABBB00",
        "ABBBDD",
        "ABBBAB",
        "ABBBA0",
        "ABBBAD",
        "ABBB0B",
        "ABBB0D",
        "ABBB0A",
        "ABBBDB",
        "ABBBD0",
        "ABBBDA",
        "ABBDDD",
        "ABBAAA",
        "ABB000",
        "ABBABB",
        "ABB0BB",
        "ABBDBB",
        "AAAA00",
        "AAAABB",
        "AAAABA",
        "AAAABD",
        "AAAA0A",
        "AAAA0B",
        "AAAAD0",
        "AAABBB",
        "AAA000",
        "AAABAA",
        "AB0000",
        "AB000A",
        "AB000B",
        "AB000D",
        "AB0AB0",
        "A0BBBB",
        "A0BBBA",
        "A0BBB0",
        "A0BBBD",
        "A0B000",
        "A0BA0B",
        "A0000A",
        "A0000D",
        "A000DD",
        "A000AA",
        "A000A0",
        "A000D0",
        "AA0000",
        "AA000A",
        "AA000D",
        "AA0AAA",
        "AA0AA0",
        "A0AAAA",
        "A0AAA0",
        "A0AAAD",
        "A0A000",
        "A0A0A0",
        "ABCCCCC",
        "ABCCCCA",
        "ABCCCCB",
        "ABCCCC0",
        "ABCCCCD",
        "ABCCCAA",
        "ABCCCBB",
        "ABCCC00",
        "ABCCCDD",
        "ABCC000",
        "ABCCAAA",
        "ABCCBBB",
        "ABCCDDD",
        "ABCDCCC",
        "ABCACCC",
        "ABCBCCC",
        "ABC0CCC",
        "ABC0000",
        "ABC000A",
        "ABC000B",
        "ABC000C",
        "ABC000D",
        "ABCD000",
        "ABCA000",
        "ABCB000",
        "ABCAAAA",
        "ABCBBBB",
        "ABCDDDD",
        "ABCCDCC",
        "ABCCACC",
        "ABCCBCC",
        "ABCC0CC",
        "ABCBCBC",
        "ABCABCA",
        "ABCABCC",
        "ABCABC0",
        "ABCCCDC",
        "ABCCC0C",
        "ABCCCBC",
        "ABCCCAC",
        "ABC0ABC",
        "ABCABCB",
        "ABCABCD",
        "ABCCCAB",
        "AABBBBB",
        "AABBBBA",
        "AABBBB0",
        "AABBBBD",
        "AABBB00",
        "AABBBAA",
        "AABBBDD",
        "AABBBAB",
        "AABBBAD",
        "AABBBA0",
        "AABBBDB",
        "AABBBDA",
        "AABBBD0",
        "AABBB0B",
        "AABBB0A",
        "AABBB0D",
        "AABB000",
        "AABBAAA",
        "AABBDDD",
        "AABABBB",
        "AABDBBB",
        "AAB0BBB",
        "AAB0000",
        "AAB000A",
        "AAB000B",
        "AAB000D",
        "AABD000",
        "AABA000",
        "AABAAAA",
        "AABAAAD",
        "AABAAAB",
        "AABAAA0",
        "AABDAAA",
        "AAB0AAA",
        "AABDDDD",
        "AABAAB0",
        "AABAABA",
        "ABAAAAA",
        "ABAAAAB",
        "ABAAAA0",
        "ABAAAAD",
        "ABAAADD",
        "ABAAA00",
        "ABAAABB",
        "ABAAABA",
        "ABAAAB0",
        "ABAAABD",
        "ABAAA0A",
        "ABAAA0B",
        "ABAAA0D",
        "ABAAADA",
        "ABAAAD0",
        "ABAAADB",
        "ABA0000",
        "ABAD000",
        "ABAB000",
        "ABAA000",
        "ABA000A",
        "ABA000B",
        "ABA000D",
        "ABABBBB",
        "ABADBBB",
        "ABAABBB",
        "ABA0BBB",
        "ABABBBD",
        "ABABBBA",
        "ABABBB0",
        "ABABAAA",
        "ABADAAA",
        "ABA0AAA",
        "ABADDDD",
        "ABAADDD",
        "ABAADAA",
        "ABAA0AA",
        "ABAABAA",
        "ABBBBBA",
        "ABBBBB0",
        "ABBBBBD",
        "ABBBBDD",
        "ABBBB00",
        "ABBBBAA",
        "ABBBB0B",
        "ABBBB0A",
        "ABBBB0D",
        "ABBBBD0",
        "ABBBBDB",
        "ABBBBDA",
        "ABBBBDE",
        "ABBBBAB",
        "ABBBBA0",
        "ABBBBAD",
        "ABBABBB",
        "ABBDBBB",
        "ABB0BBB",
        "ABBBDAA",
        "ABBBDBB",
        "ABBBD00",
        "ABBB0DD",
        "ABBB0AA",
        "ABBB0BB",
        "ABBBEDD",
        "ABBBABB",
        "ABBBADD",
        "ABBBA00",
        "ABBBDDE",
        "ABBBDDA",
        "ABBBDDB",
        "ABBBDD0",
        "ABBBAA0",
        "ABBBAAB",
        "ABBBAAD",
        "ABBB00D",
        "ABBB00A",
        "ABBB00B",
        "ABB0000",
        "ABBD000",
        "ABBA000",
        "ABBB000",
        "ABB000A",
        "ABB000B",
        "ABB000D",
        "ABBAAAA",
        "ABBBAAA",
        "ABBDDDD",
        "ABBBDDD",
        "AAAAA00",
        "AAAAABB",
        "AAAAABA",
        "AAAAA0A",
        "AAAAAB0",
        "AAAAA0B",
        "AAAAADB",
        "AAAABBB",
        "AAAABB0",
        "AAAABBA",
        "AAAABBD",
        "AAAADBB",
        "AAAA0BB",
        "AAAA000",
        "AAAAB00",
        "AAAA00B",
        "AAAA00A",
        "AAAA0AA",
        "AAAABAA",
        "AAA0000",
        "AAABBBB",
        "AAA0AAA",
        "AAABAAA",
        "AB00000",
        "AB0000A",
        "AB0000B",
        "AB0000D",
        "AB000AA",
        "AB000BB",
        "AB000DD",
        "AB0D000",
        "AB0A000",
        "AB0B000",
        "AB0AAAA",
        "AB0BBBB",
        "AB0DDDD",
        "AB00D00",
        "AB00A00",
        "AB00B00",
        "AB0B0B0",
        "AB0AB0A",
        "AB0AB00",
        "AB000D0",
        "AB000B0",
        "AB000A0",
        "AB0AB0B",
        "AB000AB",
        "A00000A",
        "A00000D",
        "A0000AA",
        "A0000DD",
        "A0000D0",
        "A0000A0",
        "A0000AD",
        "A0000DA",
        "A0000DE",
        "A000D00",
        "A000A00",
        "A00D000",
        "A00A000",
        "A00AAAA",
        "A00DDDD",
        "A00A00A",
        "A00A00D",
        "A00D00D",
        "A00D00A",
        "A0BBBBB",
        "A0BBBBA",
        "A0BBBB0",
        "A0BBBBD",
        "A0BBB00",
        "A0BBBAA",
        "A0BBBDD",
        "A0BBBAB",
        "A0BBBAD",
        "A0BBBA0",
        "A0BBBDB",
        "A0BBBDA",
        "A0BBBD0",
        "A0BBB0B",
        "A0BBB0A",
        "A0BBB0D",
        "A0BB000",
        "A0BBAAA",
        "A0BBDDD",
        "A0BABBB",
        "A0BDBBB",
        "A0B0BBB",
        "A0B0000",
        "A0B000A",
        "A0B000B",
        "A0B000D",
        "A0BD000",
        "A0BA000",
        "A0BAAAA",
        "A0BAAAD",
        "A0BAAAB",
        "A0BAAA0",
        "A0BDAAA",
        "A0B0AAA",
        "A0BDDDD",
        "A0AAAAA",
        "A0AAAA0",
        "A0AAAAD",
        "A0AAA00",
        "A0AAADD",
        "A0AAADA",
        "A0AAAD0",
        "A0AAA0A",
        "A0AAA0D",
        "A0AA000",
        "A0AADDD",
        "A0ADAAA",
        "A0A0AAA",
        "A0A0000",
        "A0A000A",
        "A0A000D",
        "A0AD000",
        "A0AA000",
        "A0ADDDD",
        "A0AADAA",
        "A0AA0AA",
        "AA00000",
        "AA0000A",
        "AA0000D",
        "AA000AA",
        "AA000DD",
        "AA0D000",
        "AA0A000",
        "AA0AAAA",
        "AA0DDDD",
        "AA00D00",
        "AA00A00",
        "AA000D0",
        "AB000A0",
        "AA000DA",
        "AA000DE",
        "AA000AD"};
//</editor-fold>
    String[] citySilver = new String[]{
        //<editor-fold defaultstate="collapsed" desc="City Silver">
        "ABCC00",
        "ABCCDD",
        "ABCCAA",
        "ABCCBB",
        "ABCCAB",
        "ABCCBA",
        "ABC00D",
        "ABC00A",
        "ABC00B",
        "ABC00C",
        "ABCD00",
        "ABCA00",
        "ABCB00",
        "ABC0D0",
        "ABC0A0",
        "ABC0B0",
        "ABC0C0",
        "ABC0CC",
        "ABCC0C",
        "AABB00",
        "AABBDD",
        "AABBAA",
        "AABBAB",
        "AAB00D",
        "AAB00A",
        "AAB00B",
        "AABD00",
        "AABA00",
        "AABB00",
        "AAB0BB",
        "AABDBB",
        "AAB0AA",
        "AABDAA",
        "AAB0DD",
        "AABB0B",
        "AABB0A",
        "AABB0D",
        "AABAA0",
        "AABAAD",
        "AABAAB",
        "AABABB",
        "AABBDB",
        "AABBAB",
        "AABDDB",
        "AAB00B",
        "AABAAB",
        "ABBDDB",
        "ABBDDA",
        "ABBDD0",
        "ABBAAD",
        "ABBAAB",
        "ABBAA0",
        "ABB00D",
        "ABB00A",
        "ABB00B",
        "ABBD00",
        "ABBA00",
        "AAA00A",
        "AAA00B",
        "AAA0AA",
        "AAA0BB",
        "AAABBA",
        "AAABBD",
        "AAABB0",
        "AAAB00",
        "AAADBB",
        "AB0DDD",
        "AB0AAA",
        "AB0BBB",
        "AB00DD",
        "AB00AA",
        "AB00BB",
        "A0ADDD",
        "A0AA00",
        "A0AADD",
        "A0AA0A",
        "ABAA00",
        "ABAADD",
        "ABAABB",
        "ABA00D",
        "ABA00A",
        "ABA00B",
        "ABAD00",
        "ABAB00",
        "AA0DDD",
        "AA00DD",
        "AA00AA",
        "A0BB0A",
        "A0BDDD",
        "A0BAAA",
        "A0BB00",
        "A0BBDD",
        "A0BBAA",
        "A0B0D0",
        "A0B0A0",
        "A0B0B0",
        "A00A00",
        "A00D00",
        "A00DDD",
        "A00AAA",
        "A0A1A2",
        "A1A2A3",
        "A2A3A4",
        "A3A4A5",
        "A4A5A6",
        "A5A6A7",
        "A6A7A8",
        "A7A8A9",
        "0B1B2B",
        "1B2B3B",
        "2B3B4B",
        "3B4B5B",
        "4B5B6B",
        "5B6B7B",
        "6B7B8B",
        "7B8B9B",
        "ABCCCAD",
        "ABCCCBA",
        "ABCCCBD",
        "ABCCCDA",
        "ABCCCDB",
        "ABCCCDE",
        "ABCCCD0",
        "ABCCCA0",
        "ABCCCB0",
        "ABCCC0A",
        "ABCCC0B",
        "ABCCC0D",
        "ABCAAA0",
        "ABCAAAC",
        "ABCAAAB",
        "ABCAAAD",
        "ABC0AAA",
        "ABCDAAA",
        "ABCBAAA",
        "ABCBBBC",
        "ABCBBB0",
        "ABCBBBA",
        "ABCBBBD",
        "ABC0BBB",
        "ABCDBBB",
        "ABCABBB",
        "ABCDDDA",
        "ABCDDDB",
        "ABCDDDC",
        "ABCDDD0",
        "ABCDDDE",
        "ABCADDD",
        "ABCBDDD",
        "ABC0DDD",
        "ABCEDDD",
        "ABCC00D",
        "ABCC00A",
        "ABCC00B",
        "ABCC00C",
        "ABCDD00",
        "ABC00DD",
        "ABC00AA",
        "ABC00BB",
        "ABC00CC",
        "ABCAA00",
        "ABCBB00",
        "ABCCD00",
        "ABCCB00",
        "ABCCA00",
        "AABADDD",
        "AAB0DDD",
        "AABEDDD",
        "AABDDDA",
        "AABDDDB",
        "AABDDD0",
        "AABDDDE",
        "AABBAA0",
        "AABBAAB",
        "AABBAAD",
        "AABB00D",
        "AABB00A",
        "AABB00B",
        "AABBDDE",
        "AABBDDA",
        "AABBDDB",
        "AABBDD0",
        "AABBDAA",
        "AABBDBB",
        "AABBD00",
        "AABB0DD",
        "AABB0AA",
        "AABB0BB",
        "AABBABB",
        "AABBADD",
        "AABBA00",
        "AABDDAA",
        "AABDDBB",
        "AABDD00",
        "AABDDEE",
        "AAB00DD",
        "AAB00AA",
        "AAB00BB",
        "AABAADD",
        "AABAA00",
        "AABAABB",
        "AABABAB",
        "AABAABD",
        "ABABDDD",
        "ABA0DDD",
        "ABAEDDD",
        "ABADDDA",
        "ABADDDB",
        "ABADDD0",
        "ABADDDE",
        "ABAAD00",
        "ABAA0DD",
        "ABAA0BB",
        "ABABABA",
        "ABAADBB",
        "ABAABDD",
        "ABAAB00",
        "ABAADDE",
        "ABAADDA",
        "ABAADDB",
        "ABAADD0",
        "ABAABB0",
        "ABAABBA",
        "ABAABBD",
        "ABAA00D",
        "ABAA00B",
        "ABAA00A",
        "ABADDBB",
        "ABADDAA",
        "ABADD00",
        "ABADDEE",
        "ABA00DD",
        "ABA00BB",
        "ABA00AA",
        "ABABBDD",
        "ABABB00",
        "ABABBAA",
        "ABA0ABA",
        "ABBDAAA",
        "ABB0AAA",
        "ABBAAAD",
        "ABBAAAB",
        "ABBAAA0",
        "ABBADDD",
        "ABB0DDD",
        "ABBEDDD",
        "ABBDDDA",
        "ABBDDDB",
        "ABBDDD0",
        "ABBDDDE",
        "ABBDDAA",
        "ABBDDBB",
        "ABBDD00",
        "ABBDDEE",
        "ABB00DD",
        "ABB00AA",
        "ABB00BB",
        "ABBAADD",
        "ABBAA00",
        "ABBAABB",
        "ABBABAB",
        "ABBBABA",
        "ABB0ABB",
        "ABBABBA",
        "ABBABB0",
        "A0BADDD",
        "A0B0DDD",
        "A0BEDDD",
        "A0BDDDA",
        "A0BDDDB",
        "A0BDDD0",
        "A0BDDDE",
        "A0BBAA0",
        "A0BBAAB",
        "A0BBAAD",
        "A0BB00D",
        "A0BB00A",
        "A0BB00B",
        "A0BBDDE",
        "A0BBDDA",
        "A0BBDDB",
        "A0BBDD0",
        "A0BBDAA",
        "A0BBDBB",
        "AAAA0A0",
        "AAAABAB",
        "AAAABDB",
        "AAAA0B0",
        "AAAAB0B",
        "AAAB000",
        "AAA000A",
        "AAA000B",
        "AAADBBB",
        "AAA0BBB",
        "AAABBBA",
        "AAABBB0",
        "AAABBBD",
        "A000AAA",
        "A000AA0",
        "A000AAD",
        "A000DDD",
        "A000DDE",
        "A000DDA",
        "A000DD0",
        "A000Dсс",
        "A000DAA",
        "A000ADD",
        "A000D0D",
        "A000A0A",
        "A00DD00",
        "A00AA00",
        "A0A0DDD",
        "A0AEDDD",
        "A0ADDDA",
        "A0ADDD0",
        "A0ADDDE",
        "A0AA00D",
        "A0AA00A",
        "A0AADDE",
        "A0AADDA",
        "A0AADD0",
        "A0AAD00",
        "A0AA0DD",
        "A0ADDAA",
        "A0ADD00",
        "A0ADDEE",
        "A0A00DD",
        "A0A00AA",
        "AA0A0A0",
        "AA0AA0A",
        "AA0AA00",
        "AA0AA0D",
        "AA0AADD",
        "AA00AA0",
        "AA00AAD",
        "AA00DDE",
        "AA00DDA",
        "AA00DD0",
        "AA00DAA",
        "AA00ADD",
        "AA00Dсс",
        "AA0AAA0",
        "AA0AAAD",
        "AA0DAAA",
        "AA00AAA",
        "AA0DDDA",
        "AA0DDD0",
        "AA0DDDE",
        "AA0ADDD",
        "AA00DDD",
        "AA0EDDD",
        "AA0DDAA",
        "AA0DD00",
        "AA0DDEE",
        "A0BBD00",
        "A0BB0DD",
        "A0BB0AA",
        "A0BB0BB",
        "A0BBABB",
        "A0BBADD",
        "A0BBA00",
        "A0BDDAA",
        "A0BDDBB",
        "A0BDD00",
        "A0BDDEE",
        "A0B00DD",
        "A0B00AA",
        "A0B00BB",
        "A0BAADD",
        "A0BAA00",
        "A0BAABB",
        "A0BABAB",
        "A0BAABD",
        "AB00AB0",
        "AB0AB0D",
        "AB000AD",
        "AB000BA",
        "AB000BD",
        "AB000DA",
        "AB000DB",
        "AB000DE",
        "AB0AAA0",
        "AB0AAAB",
        "AB0AAAD",
        "AB00AAA",
        "AB0DAAA",
        "AB0BAAA",
        "AB0BBB0",
        "AB0BBBA",
        "AB0BBBD",
        "AB00BBB",
        "AB0DBBB",
        "AB0ABBB",
        "AB0DDDA",
        "AB0DDDB",
        "AB0DDD0",
        "AB0DDDE",
        "AB0ADDD",
        "AB0BDDD",
        "AB00DDD",
        "AB0EDDD"};
//</editor-fold>
    String[] cityBronze = new String[]{
        //<editor-fold defaultstate="collapsed" desc="City Bronze">
        "ABCDCC",
        "ABCACC",
        "ABCBCC",
        "ABCCDC",
        "ABCCAC",
        "ABCCBC",
        "ABCDCD",
        "ABCACA",
        "ABCBCB",
        "ABCDDC",
        "ABCAAC",
        "ABCBBC",
        "ABCBAB",
        "ABC0AB",
        "ABCBCA",
        "AABDBD",
        "AABABA",
        "AAB0D0",
        "AAB0A0",
        "AAB0B0",
        "AAB0AB",
        "AAB0BA",
        "AAA0A0",
        "AAA0B0",
        "AAABAB",
        "AAAB0B",
        "AAABDB",
        "AAA0BA",
        "AAA0AB",
        "ABBDBD",
        "ABBDAD",
        "ABBD0D",
        "ABBA0A",
        "ABBABA",
        "ABBADA",
        "ABB0D0",
        "ABB0A0",
        "ABB0B0",
        "ABB0BA",
        "ABB0AB",
        "ABADAA",
        "ABABAA",
        "ABA0AA",
        "ABAADA",
        "ABAABA",
        "ABAA0A",
        "ABADAD",
        "ABA0A0",
        "ABADDA",
        "ABABBA",
        "ABA00A",
        "ABA0AB",
        "ABA0BA",
        "ABA0D0",
        "ABA0A0",
        "ABA0B0",
        "ABAA0A",
        "ABAB0B",
        "ABAB0A",
        "AB0D00",
        "AB0A00",
        "AB0B00",
        "AB00D0",
        "AB00A0",
        "AB00B0",
        "AB0D0D",
        "AB0A0A",
        "AB0B0B",
        "AB0DD0",
        "AB0AA0",
        "AB0BB0",
        "AB00AB",
        "AB00BA",
        "A00D0D",
        "A00A0A",
        "A00DD0",
        "A00AA0",
        "AA0D00",
        "AA0A00",
        "AA00D0",
        "AA00A0",
        "AA0D0D",
        "AA0A0A",
        "AA0DD0",
        "AA0AA0",
        "A0B0BB",
        "A0BB0B",
        "A0BDBB",
        "A0BBDB",
        "A0BABB",
        "A0BBAB",
        "A0BDBD",
        "A0BABA",
        "A0BDDB",
        "A0BAAB",
        "A0B00B",
        "A0BBA0",
        "A0BB0A",
        "A0B00D",
        "A0B00A",
        "A0BD00",
        "A0BA00",
        "A0ADAA",
        "A0AADA",
        "A0ADAD",
        "A0ADDA",
        "A0A00A",
        "A0A0AA",
        "A0A00D",
        "A0AD00",
        "A0A0D0",
        "0BC1BC",
        "1BC2BC",
        "2BC3BC",
        "3BC4BC",
        "4BC5BC",
        "5BC6BC",
        "6BC7BC",
        "7BC8BC",
        "8BC9BC",
        "AB0AB1",
        "AB1AB2",
        "AB2AB3",
        "AB3AB4",
        "AB4AB5",
        "AB5AB6",
        "AB6AB7",
        "AB7AB8",
        "AB8AB9",
        "1BC0BC",
        "2BC1BC",
        "3BC2BC",
        "4BC3BC",
        "5BC4BC",
        "6BC5BC",
        "7BC6BC",
        "8BC7BC",
        "9BC8BC",
        "AB1AB0",
        "AB2AB1",
        "AB3AB2",
        "AB4AB3",
        "AB5AB4",
        "AB6AB5",
        "AB7AB6",
        "AB8AB7",
        "AB9AB8",
        "AB0B1B",
        "AB1B2B",
        "AB2B3B",
        "AB3B4B",
        "AB4B5B",
        "AB5B6B",
        "AB6B7B",
        "AB7B8B",
        "AB8B9B",
        "AABB0B0",
        "AABB0A0",
        "AABB0BA",
        "AABB0AB",
        "AABBA0A",
        "AABBA0B",
        "AABBAB0",
        "AABA0BB",
        "AABAA0A",
        "AABAA0B",
        "AABABB0",
        "AAB0ABB",
        "AAB0AAB",
        "AABABBA",
        "AABBABA",
        "AABA00A",
        "AABA00B",
        "AAB00A0",
        "AAB00B0",
        "AAB0A00",
        "AAB0B00",
        "AAB0AA0",
        "AAB0BB0",
        "AAB00DA",
        "AAB00DB",
        "AAB00D0",
        "AAB00DE",
        "AABD00D",
        "AAB0D00",
        "AAB0DD0",
        "AABB0D0",
        "AABBD0D",
        "A0AA0A0",
        "A0AA0AA",
        "A0AA00A",
        "A0A00A0",
        "A0A0A00",
        "A0A0AA0",
        "A0A00DA",
        "A0A00D0",
        "A0A00DE",
        "A0AD00D",
        "A0A0D00",
        "A0A0DD0",
        "A0AA0D0",
        "A0AAD0D",
        "ABAB0BB",
        "ABABB0B",
        "ABAA0A0",
        "ABAD0D0",
        "ABAB0B0",
        "ABA0D0D",
        "ABA0B0B",
        "ABA0A0A",
        "ABA0DD0",
        "ABA0BB0",
        "ABA0AA0",
        "ABA0B00",
        "ABA0A00",
        "ABA0D00",
        "ABA00B0",
        "ABA00A0",
        "ABA00D0",
        "ABA00DB",
        "ABA00DA",
        "ABA00D0",
        "ABA00DE",
        "ABAB00B",
        "ABAB00A",
        "ABAD00D",
        "ABA0A0B",
        "ABA0B0A",
        "ABAABAB",
        "ABABAAB",
        "A00AAA0",
        "A00AAAD",
        "A00DAAA",
        "A00DDDA",
        "A00DDD0",
        "A00DDDE",
        "A00ADDD",
        "A00EDDD",
        "A00D0D0",
        "A00A0A0",
        "A00DD0D",
        "A00AA0A",
        "A00A0AA",
        "A00D0DD",
        "A00DDAA",
        "A00DDEE",
        "A00AADD",
        "ABCCAA0",
        "ABCCAAB",
        "ABCCAAC",
        "ABCCAAD",
        "ABCCBB0",
        "ABCCBBA",
        "ABCCBBC",
        "ABCCBBD",
        "ABCCDD0",
        "ABCCDDE",
        "ABCCDDA",
        "ABCCDDB",
        "ABCCDDC",
        "ABCDDAA",
        "ABCDDBB",
        "ABCDDCC",
        "ABCDDEE",
        "ABCAADD",
        "ABCAABB",
        "ABCAACC",
        "ABCBBDD",
        "ABCBBAA",
        "ABCBBCC",
        "ABCCDсс",
        "ABCCDAA",
        "ABCCDBB",
        "ABCC0DD",
        "ABCC0AA",
        "ABCC0BB",
        "ABCCBAA",
        "ABCCBDD",
        "ABCCABB",
        "ABCCADD",
        "ABCD0D0",
        "ABCA0A0",
        "ABCB0B0",
        "ABCC0C0",
        "ABC0D0D",
        "ABC0A0A",
        "ABC0B0B",
        "ABC0C0C",
        "ABC00C0",
        "ABC00A0",
        "ABC00B0",
        "ABC00D0",
        "ABC0C00",
        "ABC0A00",
        "ABC0B00",
        "ABC0D00",
        "ABC0DD0",
        "ABC0AA0",
        "ABC0BB0",
        "ABC0CC0",
        "ABCD00D",
        "ABCA00A",
        "ABCB00B",
        "ABC0DD0",
        "ABC0AA0",
        "ABC0BB0",
        "ABC0CC0",
        "ABCAA0A",
        "ABCBB0B",
        "ABCDD0D",
        "ABCA0AA",
        "ABCD0DD",
        "ABCB0BB",
        "A0BB0B0",
        "A0BB0A0",
        "A0BB0D0",
        "A0BBA0A",
        "A0BBD0D",
        "A0BBABA",
        "A0BAA0A",
        "A0BABB0",
        "A0BABBA",
        "A0B0ABB",
        "A0B0AAB",
        "A0BA00A",
        "A0BA00B",
        "A0B00A0",
        "A0B00B0",
        "A0B0A00",
        "A0B0B00",
        "A0B0AA0",
        "A0B0BB0",
        "A0B00DA",
        "A0B00DB",
        "A0B00D0",
        "A0B00DE",
        "A0BD00D",
        "A0B0D00",
        "A0B0DD0",
        "AAA00BB",
        "AAA00AA",
        "AAABBDD",
        "AAABB00",
        "AAABBAA",
        "AAAB0BB",
        "AAABB0B",
        "AAAB00B",
        "AAAB00A",
        "AAAB0B0",
        "AAA0B0B",
        "AAA0A0A",
        "AAA00B0",
        "AAA00A0",
        "AAA0B00",
        "AAA0A00",
        "AAA0BB0",
        "AAA0AA0",
        "ABBB0B0",
        "ABBB0A0",
        "ABBB0D0",
        "ABBBDBD",
        "ABBBDAD",
        "ABBBD0D",
        "ABBBDED",
        "ABBBABA",
        "ABBBADA",
        "ABBBA0A",
        "ABBBAB0",
        "ABBB0AB",
        "ABBBA0B",
        "ABBBABD",
        "ABBBDAB",
        "ABBBADB",
        "ABBBDB0",
        "ABBB0DB",
        "ABBBD0B",
        "ABBBAD0",
        "ABBB0AD",
        "ABBBA0D",
        "AB00AA0",
        "AB00AAB",
        "AB00AAD",
        "AB00BB0",
        "AB00BBA",
        "AB00BBD",
        "AB00DDE",
        "AB00DDA",
        "AB00DDB",
        "AB00DD0",
        "AB00Dсс",
        "AB00DAA",
        "AB00DBB",
        "AB00BDD",
        "AB00ABB",
        "AB00ADD",
        "AB00D0D",
        "AB00A0A",
        "AB00B0B",
        "AB0D00D",
        "AB0A00A",
        "AB0B00B",
        "AB0DDAA",
        "AB0DDBB",
        "AB0DD00",
        "AB0DDEE",
        "AB0AADD",
        "AB0AABB",
        "AB0AA00",
        "AB0BBDD",
        "AB0BBAA",
        "AB0BB00",
        "AB0AA0A",
        "AB0BB0B",
        "AB0DD0D",
        "AB0A0AA",
        "AB0D0DD",
        "AB0B0BB",
        "AB0D0D0",
        "AB0A0A0",
        "AA00D0D",
        "AA00A0A",
        "AA0D00D",
        "AA0A00A",
        "AA0DD0D",
        "AA0D0DD",
        "AA0A0AA",
        "AA0D0D0",
        "ABCBCCB"};
//</editor-fold>
    String[] cityPlatina = new String[]{
        //<editor-fold defaultstate="collapsed" desc="City Platina">
        "AAAAAA",
        "ABBBBB",
        "AAAAAB",
        "A00000",
        "AAAAA0",
        "AAAAAAB",
        "AAAAAA0",
        "ABBBBBB",
        "A000000",
        "ххххххх"};
//</editor-fold>

    StringBuffer v_default = new StringBuffer();
    StringBuffer v_president = new StringBuffer();
    StringBuffer v_vip = new StringBuffer();
    StringBuffer v_prime = new StringBuffer();
    StringBuffer v_platina = new StringBuffer();
    StringBuffer v_gold = new StringBuffer();
    StringBuffer v_silver = new StringBuffer();
    StringBuffer v_bronze = new StringBuffer();

    StringBuffer v_city_gold = new StringBuffer();
    StringBuffer v_city_silver = new StringBuffer();
    StringBuffer v_city_bronze = new StringBuffer();
    StringBuffer v_city_platina = new StringBuffer();

    /**
     * Creates new form CommercialNumbersWindow
     */
    public CommercialNumbersWindow() {
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        chooseFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooseFile.setCurrentDirectory(new File(System.getProperty("user.dir")));
        chooseFile.updateUI();
        setLocationRelativeTo(null);
        f = jLabel1.getFont();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseFile = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabelDefault = new javax.swing.JLabel();
        jLabelBronze = new javax.swing.JLabel();
        jLabelSilver = new javax.swing.JLabel();
        jLabelGold = new javax.swing.JLabel();
        jLabelPlatin = new javax.swing.JLabel();
        jLabelPrime = new javax.swing.JLabel();
        jLabelvip = new javax.swing.JLabel();
        jLabelPresident = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextAreaDefault = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextAreaBronze = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaSilver = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaGold = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaPlatin = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaPrime = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaVip = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPresident = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CheckNumber 7.1");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 108));

        jLabel1.setText("Проверить номер");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Проверить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Проверить диапазон");

        jTextField2.setToolTipText("");

        jLabelDefault.setText("Обычный");

        jLabelBronze.setText("Бронзовый");

        jLabelSilver.setText("Серебрянный");

        jLabelGold.setText("Золотой");

        jLabelPlatin.setText("Платиновый");

        jLabelPrime.setText("Prime");

        jLabelvip.setText("VIP");

        jLabelPresident.setText("President");

        jButton5.setText("Проверить");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDefault, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelBronze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSilver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPlatin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPrime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelvip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPresident, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(239, 239, 239))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelPresident)
                    .addComponent(jLabelDefault)
                    .addComponent(jLabelBronze)
                    .addComponent(jLabelSilver)
                    .addComponent(jLabelGold)
                    .addComponent(jLabelPlatin)
                    .addComponent(jLabelPrime)
                    .addComponent(jLabelvip))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setText("Обработать файл");

        jButton3.setText("Выбрать файл");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Обработать");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(0, 0));

        jButton13.setText("Сохранить");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTextAreaDefault.setColumns(20);
        jTextAreaDefault.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextAreaDefault.setLineWrap(true);
        jTextAreaDefault.setRows(5);
        jScrollPane9.setViewportView(jTextAreaDefault);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Обычные", jPanel2);

        jButton12.setText("Сохранить");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextAreaBronze.setColumns(20);
        jTextAreaBronze.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextAreaBronze.setRows(5);
        jScrollPane8.setViewportView(jTextAreaBronze);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Бронзовые", jPanel3);

        jButton11.setText("Сохранить");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextAreaSilver.setColumns(20);
        jTextAreaSilver.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextAreaSilver.setRows(5);
        jScrollPane7.setViewportView(jTextAreaSilver);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Серебрянные", jPanel4);

        jButton10.setText("Сохранить");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextAreaGold.setColumns(20);
        jTextAreaGold.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextAreaGold.setRows(5);
        jScrollPane6.setViewportView(jTextAreaGold);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Золотые", jPanel5);

        jButton9.setText("Сохранить");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextAreaPlatin.setColumns(20);
        jTextAreaPlatin.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextAreaPlatin.setRows(5);
        jScrollPane5.setViewportView(jTextAreaPlatin);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Платиновые", jPanel6);

        jButton8.setText("Сохранить");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextAreaPrime.setColumns(20);
        jTextAreaPrime.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextAreaPrime.setRows(5);
        jScrollPane4.setViewportView(jTextAreaPrime);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Prime", jPanel7);

        jButton7.setText("Сохранить");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextAreaVip.setColumns(20);
        jTextAreaVip.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextAreaVip.setRows(5);
        jScrollPane3.setViewportView(jTextAreaVip);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("VIP", jPanel8);

        jButton6.setText("Сохранить");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextAreaPresident.setColumns(20);
        jTextAreaPresident.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextAreaPresident.setRows(5);
        jScrollPane2.setViewportView(jTextAreaPresident);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("President", jPanel9);

        jTextAreaLog.setColumns(20);
        jTextAreaLog.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jTextAreaLog.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLog);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Лог", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (chooseFile.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                String selectedDir = chooseFile.getSelectedFile().getAbsolutePath();
                if (selectedDir != null) {
                    jTextField3.setText(selectedDir);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String msisdn = jTextField1.getText().trim();

        if (msisdn.length() > 0 && msisdn.length() == 10) {
            defineCategory(msisdn, false);
        } else {
            JOptionPane.showMessageDialog(this, "Неверный формат номера", "Внимание", 2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        resetStuff();
        if (jTextField2.getText().trim().length() > 0) {
            String temp = jTextField2.getText();
            try {
                long start = Long.valueOf(temp.substring(0, temp.indexOf("-")));
                long end = Long.valueOf(temp.substring(temp.indexOf("-") + 1, temp.length()));

                if (String.valueOf(start).length() > 10
                        | String.valueOf(end).length() > 10
                        | String.valueOf(start).length() < 10
                        | String.valueOf(end).length() < 10
                        | end < start) {
                    JOptionPane.showMessageDialog(this, "Неверные форматы номеров указанные в диапазоне\n Пример : 7080000000-7080001000", "Внимание", 2);
                    return;
                }
                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        if (end > start) {

                            showDialogMessage("Начата орбаботка данных", "Внимание", 1);

                            for (int i = 0; i < end - start + 1; i++) {
                                defineCategory(String.valueOf(start + i), true);
                            }
                            updateTextAreas();
                            JOptionPane.showMessageDialog(CommercialNumbersWindow.this, "Операция завершена", "Результат выполнения", 1);
                        } else {
                            JOptionPane.showMessageDialog(CommercialNumbersWindow.this, "Неверный диапазон\n Пример : 7080000000-7080001000", "Внимание", 2);
                        }
                    }
                }).start();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Неверный диапазон\n Пример : 7080000000-7080001000", "Внимание", 2);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Диапазон не указан", "Внимание", 2);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    void showDialogMessage(String text, String title, int severity) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(CommercialNumbersWindow.this, text, title, 1);
            }
        }).start();
    }

    boolean isCity(String msisdn) {
        boolean result = false;
        String[] cityPrefix = new String[]{
            "7162",
            "7132",
            "7282",
            "7122",
            "7232",
            "7262",
            "7112",
            "7212",
            "7142",
            "72422",
            "7292",
            "7182",
            "7152",
            "7172",
            "7252",
            "727"};
        for (int i = 0; i < cityPrefix.length; i++) {
            String cityPrefix1 = cityPrefix[i];
            if (msisdn.substring(0, cityPrefix1.length()).indexOf(cityPrefix1) != -1) {
                result = true;
                break;
            }
        }
        return result;
    }

    String cutPrefix(String msisdn) {
        String[] prefixes = new String[]{
            "72422",
            "7162",
            "7132",
            "7282",
            "7122",
            "7232",
            "7262",
            "7112",
            "7212",
            "7142",
            "7292",
            "7182",
            "7152",
            "7172",
            "7252",
            "700",
            "708",
            "727"};
        String result = msisdn;
        for (int i = 0; i < prefixes.length; i++) {
            String prefix = prefixes[i];
            if (msisdn.substring(0, prefix.length()).indexOf(prefix) != -1) {
                result = msisdn.substring(prefix.length(), msisdn.length());
                break;
            }
        }
        return result;
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        exportData();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        exportData();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        exportData();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        exportData();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        exportData();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        exportData();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        exportData();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        exportData();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String file = jTextField3.getText().trim();
        new Thread(new Runnable() {

            @Override
            public void run() {
                if (file.length() > 0) {
                    resetStuff();
                    try {
                        File f = new File(file);
                        BufferedReader br = new BufferedReader(new FileReader(f));
                        String line;
                        showDialogMessage("Начата орбаботка данных", "Внимание", 1);
                        while ((line = br.readLine()) != null) {
                            defineCategory(line, true);
                        }
                        updateTextAreas();
                        JOptionPane.showMessageDialog(CommercialNumbersWindow.this, "Операция завершена", "Результат выполнения", 1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(CommercialNumbersWindow.this, "Выберите файл", "Внимание", 2);
                }
            }
        }).start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    void exportData() {
        String path = "./";
        String delimiter = (jTextField2.getText().length() > 0) ? "_" : "";
        writeFile(path, jTextAreaDefault.getText(), jTextField2.getText() + delimiter + "Default.txt");
        writeFile(path, jTextAreaBronze.getText(), jTextField2.getText() + delimiter + "Bronze.txt");
        writeFile(path, jTextAreaSilver.getText(), jTextField2.getText() + delimiter + "Silver.txt");
        writeFile(path, jTextAreaGold.getText(), jTextField2.getText() + delimiter + "Gold.txt");
        writeFile(path, jTextAreaPlatin.getText(), jTextField2.getText() + delimiter + "Platin.txt");
        writeFile(path, jTextAreaPrime.getText(), jTextField2.getText() + delimiter + "Prime.txt");
        writeFile(path, jTextAreaVip.getText(), jTextField2.getText() + delimiter + "Vip.txt");
        writeFile(path, jTextAreaPresident.getText(), jTextField2.getText() + delimiter + "President.txt");
    }

    void writeFile(String path, String data, String filename) {
        try {
            File f = new File(path + "/" + filename);
            //BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
            Writer bos = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), "UTF-8"));
//            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bos.write(data.replace("\n", "\r\n"));
            bos.flush();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CommercialNumbersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommercialNumbersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommercialNumbersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommercialNumbersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommercialNumbersWindow().setVisible(true);
            }
        });
    }

    void logAppend(String text) {
        jTextAreaLog.append(text + "\n");
//        jTextAreaLog.append("\r\n");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser chooseFile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBronze;
    private javax.swing.JLabel jLabelDefault;
    private javax.swing.JLabel jLabelGold;
    private javax.swing.JLabel jLabelPlatin;
    private javax.swing.JLabel jLabelPresident;
    private javax.swing.JLabel jLabelPrime;
    private javax.swing.JLabel jLabelSilver;
    private javax.swing.JLabel jLabelvip;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaBronze;
    private javax.swing.JTextArea jTextAreaDefault;
    private javax.swing.JTextArea jTextAreaGold;
    private javax.swing.JTextArea jTextAreaLog;
    private javax.swing.JTextArea jTextAreaPlatin;
    private javax.swing.JTextArea jTextAreaPresident;
    private javax.swing.JTextArea jTextAreaPrime;
    private javax.swing.JTextArea jTextAreaSilver;
    private javax.swing.JTextArea jTextAreaVip;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void defineCategory(String phone, boolean range) {
        String mask = null;
        foundCategory = false;

        String msisdnWoPrefix = cutPrefix(phone);

        jLabelvip.setFont(f.deriveFont(f.getStyle() | Font.PLAIN));
        jLabelPresident.setFont(f.deriveFont(f.getStyle() | Font.PLAIN));
        jLabelPrime.setFont(f.deriveFont(f.getStyle() | Font.PLAIN));
        jLabelPlatin.setFont(f.deriveFont(f.getStyle() | Font.PLAIN));
        jLabelGold.setFont(f.deriveFont(f.getStyle() | Font.PLAIN));
        jLabelSilver.setFont(f.deriveFont(f.getStyle() | Font.PLAIN));
        jLabelBronze.setFont(f.deriveFont(f.getStyle() | Font.PLAIN));
        jLabelDefault.setFont(f.deriveFont(f.getStyle() | Font.PLAIN));

        if (isCity(phone)) {
//<editor-fold defaultstate="collapsed" desc="defineCategory for City numbers">
            for (int i = 0; i < cityPlatina.length; i++) {
                String mainMask = cityPlatina[i];
                String generatedPhoneMask = getPhoneMask(msisdnWoPrefix, mainMask);

                // if we found one, we exit
                if (mainMask.indexOf(generatedPhoneMask) != -1) {
                    v_city_platina.append(phone + "\n");
                    if (!range) {
                        settleCategory(jTextAreaPlatin, jLabelPlatin, mainMask, phone);
                    }
                    return;
                }
            }

            for (int i = 0; i < cityGold.length; i++) {
                String mainMask = cityGold[i];
                String generatedPhoneMask = getPhoneMask(msisdnWoPrefix, mainMask);

                // if we found one, we exit
                if (mainMask.indexOf(generatedPhoneMask) != -1) {
                    v_city_gold.append(phone + "\n");
                    if (!range) {
                        settleCategory(jTextAreaGold, jLabelGold, mainMask, phone);
                    }
                    return;
                }
            }

            for (int i = 0; i < citySilver.length; i++) {
                String mainMask = citySilver[i];
                String generatedPhoneMask = getPhoneMask(msisdnWoPrefix, mainMask);

                // if we found one, we exit
                if (mainMask.indexOf(generatedPhoneMask) != -1) {
                    v_city_silver.append(phone + "\n");
                    if (!range) {
                        settleCategory(jTextAreaSilver, jLabelSilver, mainMask, phone);
                    }
                    return;
                }
            }

            for (int i = 0; i < cityBronze.length; i++) {
                String mainMask = cityBronze[i];
                String generatedPhoneMask = getPhoneMask(msisdnWoPrefix, mainMask);

                // if we found one, we exit
                if (mainMask.indexOf(generatedPhoneMask) != -1) {
                    v_city_bronze.append(phone + "\n");
                    if (!range) {
                        settleCategory(jTextAreaBronze, jLabelBronze, mainMask, phone);
                    }
                    return;
                }
            }
//</editor-fold>
        } else {
//<editor-fold defaultstate="collapsed" desc="defineCategory for non city numbers">
            for (int i = 0; i < president.length; i++) {
                String mainMask = president[i];
                String generatedPhoneMask = getPhoneMask(msisdnWoPrefix, mainMask);

                // if we found one, we exit
                if (mainMask.indexOf(generatedPhoneMask) != -1) {
                    v_president.append(phone + "\n");
                    if (!range) {
                        settleCategory(jTextAreaPresident, jLabelPresident, mainMask, phone);
                    }
                    return;
                }
            }

            for (int i = 0; i < vip.length; i++) {
                String mainMask = vip[i];
                String generatedPhoneMask = getPhoneMask(msisdnWoPrefix, mainMask);

                // if we found one, we exit
                if (mainMask.indexOf(generatedPhoneMask) != -1) {
                    v_vip.append(phone + "\n");
                    if (!range) {
                        settleCategory(jTextAreaVip, jLabelvip, mainMask, phone);
                    }
                    return;
                }
            }

            for (int i = 0; i < prime.length; i++) {
                String mainMask = prime[i];
                String generatedPhoneMask = getPhoneMask(msisdnWoPrefix, mainMask);

                // if we found one, we exit
                if (mainMask.indexOf(generatedPhoneMask) != -1) {
                    v_prime.append(phone + "\n");
                    if (!range) {
                        settleCategory(jTextAreaPrime, jLabelPrime, mainMask, phone);
                    }
                    return;
                }
            }

            for (int i = 0; i < platina.length; i++) {
                String mainMask = platina[i];
                String generatedPhoneMask = getPhoneMask(msisdnWoPrefix, mainMask);

                // if we found one, we exit
                if (mainMask.indexOf(generatedPhoneMask) != -1) {
                    v_platina.append(phone + "\n");
                    if (!range) {
                        settleCategory(jTextAreaPlatin, jLabelPlatin, mainMask, phone);
                    }
                    return;
                }
            }

            for (int i = 0; i < gold.length; i++) {
                String mainMask = gold[i];
                String generatedPhoneMask = getPhoneMask(msisdnWoPrefix, mainMask);

                // if we found one, we exit
                if (mainMask.indexOf(generatedPhoneMask) != -1) {
                    v_gold.append(phone + "\n");
                    if (!range) {
                        settleCategory(jTextAreaGold, jLabelGold, mainMask, phone);
                    }
                    return;
                }
            }

            for (int i = 0; i < silver.length; i++) {
                String mainMask = silver[i];
                String generatedPhoneMask = getPhoneMask(msisdnWoPrefix, mainMask);

                // if we found one, we exit
                if (mainMask.indexOf(generatedPhoneMask) != -1) {
                    v_silver.append(phone + "\n");
                    if (!range) {
                        settleCategory(jTextAreaSilver, jLabelSilver, mainMask, phone);
                    }
                    return;
                }
            }

            for (int i = 0; i < bronze.length; i++) {
                String mainMask = bronze[i];
                String generatedPhoneMask = getPhoneMask(msisdnWoPrefix, mainMask);

                // if we found one, we exit
                if (mainMask.indexOf(generatedPhoneMask) != -1) {
                    v_bronze.append(phone + "\n");
                    if (!range) {
                        settleCategory(jTextAreaBronze, jLabelBronze, mainMask, phone);
                    }
                    return;
                }
            }
//</editor-fold>
        } // end if city
        if (!foundCategory) {
            v_default.append(phone + "\n");
            if (!range) {
                settleCategory(jTextAreaDefault, jLabelDefault, null, phone);
            }
        }
    }

    private void resetStuff() {
        jTextAreaVip.setText("");
        jTextAreaPresident.setText("");
        jTextAreaPrime.setText("");
        jTextAreaPlatin.setText("");
        jTextAreaGold.setText("");
        jTextAreaSilver.setText("");
        jTextAreaBronze.setText("");
        jTextAreaDefault.setText("");

        v_default = new StringBuffer();
        v_president = new StringBuffer();
        v_vip = new StringBuffer();
        v_prime = new StringBuffer();
        v_platina = new StringBuffer();
        v_gold = new StringBuffer();
        v_silver = new StringBuffer();
        v_bronze = new StringBuffer();

        v_city_gold = new StringBuffer();
        v_city_silver = new StringBuffer();
        v_city_bronze = new StringBuffer();
        v_city_platina = new StringBuffer();
    }

    void updateTextAreas() {
        jTextAreaDefault.append(v_default.toString());
        jTextAreaPresident.append(v_president.toString());
        jTextAreaVip.append(v_vip.toString());
        jTextAreaPrime.append(v_prime.toString());
        jTextAreaPlatin.append(v_platina.toString());
        jTextAreaGold.append(v_gold.toString());
        jTextAreaSilver.append(v_silver.toString());
        jTextAreaBronze.append(v_bronze.toString());

        jTextAreaBronze.append(v_city_bronze.toString());
        jTextAreaSilver.append(v_city_silver.toString());
        jTextAreaGold.append(v_city_gold.toString());
        jTextAreaPlatin.append(v_city_platina.toString());
    }

    private void settleCategory(JTextArea jTextAreaSilver, JLabel jLabelSilver, String mainMask, String phone) {
        foundCategory = true;
        jLabelSilver.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
        if (mainMask != null) {
            logAppend("Найденна маска для номера " + mainMask);
        }
    }

    private ArrayList<PhoneAnalize> getAnalizedPhone(String msisdn, String mainMask) {
        ArrayList<PhoneAnalize> nums = new ArrayList<>(), temp = new ArrayList<>();

//        if (mainMask.indexOf("708X700") != -1) {
//            System.out.println(mainMask.contains("X"));
//        }
//        fill temp array with numbers - constant=false
        for (int i = 0; i < msisdn.length(); i++) {
            temp.add(new PhoneAnalize(msisdn.substring(i, i + 1), false));
        }

//        fill main array, in case if one of the number does not match, we return temp arrays
        for (int i = 0; i < mainMask.length(); i++) {
//            if mask has X , we mark it as constant
            if (mainMask.substring(i, i + 1).contains("X")) {
                nums.add(new PhoneAnalize(msisdn.substring(i, i + 1), true));
            } else {
//            if mainMask contain number, we proceed to analizes
                if (isNumber(mainMask.substring(i, i + 1).charAt(0))) {
//                if number we got from mainMask = number we have in in MSISDN, we proceeds
                    if (msisdn.substring(i, i + 1).indexOf(mainMask.substring(i, i + 1)) != -1) {
//                    mark this number as constant , so in getPhoneMask method we dont process it
                        nums.add(new PhoneAnalize(msisdn.substring(i, i + 1), true));
                    } else {
//                if number does not match we exit with temp array, where all numbers contatnt = falses
                        nums = temp;
                        break;
                    }
                } else {
//                if in current position there's no number, we mark it as constant = false
                    nums.add(new PhoneAnalize(msisdn.substring(i, i + 1), false));
                }
            }

        }

        return nums;
    }

    boolean isNumber(char str) {

        return Character.isDigit(str);
    }

    private String getPhoneMask(String phone, String mask) {

        mask = mask.trim();
        String result = "nomask", tempPhoneMask = phone.toString();
        ArrayList<TakenMaskChars> takenMaskChars = new ArrayList<>();
        if (mask.length() == phone.length()) {
            for (int i = 0; i < mask.length(); i++) {
                String maskChar = mask.substring(i, i + 1);
                String phoneChar = phone.substring(i, i + 1);
//                if at current position of mask we found a number, then we collate it with char in phone at the same position
                if (isNumber(maskChar.charAt(0))) {
                    if (isNumber(phoneChar.charAt(0))) {
                        // if mask number != phone number, we exit
                        if (!maskChar.contains(phoneChar)) {
                            break;
                        }
                    } else {
                        if (tempPhoneMask.substring(i, i + 1).contains(maskChar)) {
                            phone = phone.substring(0, i) + maskChar + phone.substring(i + 1);
                        } else {
                            break;
                        }
                    }
                } // otherwise consider there'a a char in mask
                else {
                    // check if at defined phone pos we have number
                    if (isNumber(phoneChar.charAt(0))) {
                        if (isTakenMask(takenMaskChars, maskChar, phoneChar)) {
                            break;
                        }
                        phone = phone.replace(phoneChar, maskChar);
                        takenMaskChars.add(new TakenMaskChars(phoneChar, maskChar, true));
                    } else {
                        if (maskChar.toLowerCase().contains("x")) {
                            phone = phone.substring(0, i) + maskChar + phone.substring(i + 1);
                        } else {
                            if (!maskChar.contains(phoneChar)) {
                                break;
                            }
                        }
                    }
                }
                if ((i + 1) == mask.length()) {
                    result = phone;
                }
            }
        }

        return result;
    }

    boolean isTakenMask(ArrayList<TakenMaskChars> maskChars, String maskChar, String number) {
        boolean taken = false;
        for (int i = 0; i < maskChars.size(); i++) {
            TakenMaskChars get = maskChars.get(i);
            if (get.mask.contains(maskChar)) {
                if (get.isTaken) {
                    taken = true;
                    return taken;
                }
            }
        }

        return taken;
    }

//    returns a list of possible masks according to initially defined mask
    private ArrayList<String> getPhoneMaskOptions(String mask) {
        ArrayList<String> result = new ArrayList<String>();

        ArrayList<Numbers> foundNums = new ArrayList<Numbers>();
        String[] mask_letters = new String[]{"A", "B", "C", "D", "E"};

        result.add(mask);

        for (int i = 0; i < mask_letters.length; i++) {
            String mask_letter = mask_letters[i];
            if (mask.contains(mask_letter)) {
                String new_mask = replaceWasteLetters(mask, mask_letter);
                getPhoneMaskOptions(new_mask);
                System.out.println(new_mask);
            }
        }

        return result;
    }

    String getNextLetter(String letter) {
        String[] mask_letters = new String[]{"A", "B", "C", "D", "E"};
        String res = new String();
        // if incoming parameter the same as last letter in array, we return first letter
        if (letter.contains(mask_letters[mask_letters.length - 1])) {
            res = mask_letters[0];
        } else {
            for (int i = 0; i < mask_letters.length; i++) {
                String mask_letter = mask_letters[i];
                if (letter == mask_letter) {
                    res = mask_letters[(i + 1)];
                    break;
                }
            }
        }
        return res;
    }

    String replaceWasteLetters(String mask, String letter) {
        if (mask.indexOf(getNextLetter(letter)) != -1) {
            mask = replaceWasteLetters(mask, getNextLetter(letter));
        }
        return mask.replace(letter, getNextLetter(letter));
    }

//    search for letter in mask ( for example AABB00C), if we found , then return true, otherwise - false
    private boolean maskLetterExist(String mask, String mask_letter) {
        boolean result = false;
        for (int i = 0; i < mask.length(); i++) {
            String letter = mask.substring(i, i + 1);
            if (letter.indexOf(mask_letter) != -1) {
                result = true;
                break;
            }
        }
        return result;
    }

    class Numbers {

        public Numbers(int number, String mask_letter) {
            this.number = number;
            this.mask_letter = mask_letter;
        }

        int number;
        String mask_letter;
    }

    class TakenMaskChars {

        String number;
        String mask;
        boolean isTaken;

        public TakenMaskChars(String number, String mask, boolean isTaken) {
            this.number = number;
            this.mask = mask;
            this.isTaken = isTaken;
        }

    }

    class PhoneAnalize {

        public PhoneAnalize(String number, boolean isTaken) {
            this.number = number;
            this.isTaken = isTaken;
        }

        String number;
        boolean isTaken;
    }
}
