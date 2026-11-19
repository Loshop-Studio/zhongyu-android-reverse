package com.p053ta.utdid2.p058a.p059a;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* renamed from: com.ta.utdid2.a.a.d */
/* loaded from: classes.dex */
public class C1692d {

    /* renamed from: a */
    private static final Pattern f7464a = Pattern.compile("([\t\r\n])+");

    /* renamed from: a */
    public static int m5781a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i4 = 0;
        for (char c4 : str.toCharArray()) {
            i4 = (i4 * 31) + c4;
        }
        return i4;
    }

    /* renamed from: b */
    public static boolean m5783b(String str) {
        return str == null || str.length() <= 0;
    }

    /* renamed from: e */
    public static String m5784e(String str) {
        return (str == null || "".equals(str)) ? str : f7464a.matcher(str).replaceAll("");
    }

    /* renamed from: a */
    public static Map<String, String> m5782a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.ta.utdid2.a.a.d.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        treeMap.putAll(map);
        return treeMap;
    }
}
