package com.p074ta.utdid2.p079a.p080a;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* renamed from: com.ta.utdid2.a.a.d */
/* loaded from: classes5.dex */
public class C7589d {

    /* renamed from: a */
    private static final Pattern f12862a = Pattern.compile("([\t\r\n])+");

    /* renamed from: a */
    public static int m9807a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i10 = 0;
        for (char c10 : str.toCharArray()) {
            i10 = (i10 * 31) + c10;
        }
        return i10;
    }

    /* renamed from: b */
    public static boolean m9809b(String str) {
        return str == null || str.length() <= 0;
    }

    /* renamed from: e */
    public static String m9810e(String str) {
        return (str == null || "".equals(str)) ? str : f12862a.matcher(str).replaceAll("");
    }

    /* renamed from: a */
    public static Map<String, String> m9808a(Map<String, String> map) {
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
