package p140k2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* renamed from: k2.f */
/* loaded from: classes4.dex */
public abstract class AbstractC7875f {

    /* renamed from: a */
    public static final Pattern f13655a = Pattern.compile("([\t\r\n])+");

    /* renamed from: k2.f$a */
    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* renamed from: a */
    public static int m13407a(String str) {
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
    public static Map m13408b(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        TreeMap treeMap = new TreeMap(new a());
        treeMap.putAll(map);
        return treeMap;
    }

    /* renamed from: c */
    public static boolean m13409c(String str) {
        return str == null || str.length() <= 0;
    }

    /* renamed from: d */
    public static String m13410d(String str) {
        return (str == null || "".equals(str)) ? str : f13655a.matcher(str).replaceAll("");
    }
}
