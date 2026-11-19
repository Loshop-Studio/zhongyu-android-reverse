package p114g2;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: g2.n */
/* loaded from: classes4.dex */
public abstract class AbstractC8029n {

    /* renamed from: a */
    public static final Comparator f13610a = new b();

    /* renamed from: g2.n$b */
    public static class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            return obj instanceof List ? AbstractC8029n.m12692d((List) obj, (List) obj2) : obj instanceof Set ? AbstractC8029n.m12694f((Set) obj, (Set) obj2) : obj instanceof Map ? AbstractC8029n.m12693e((Map) obj, (Map) obj2) : obj instanceof byte[] ? AbstractC8029n.m12695g((byte[]) obj, (byte[]) obj2) : AbstractC8029n.m12691c((Comparable) obj, (Comparable) obj2);
        }
    }

    /* renamed from: a */
    public static int m12689a(byte b10, byte b11) {
        if (b10 < b11) {
            return -1;
        }
        return b11 < b10 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m12690b(int i9, int i10) {
        if (i9 < i10) {
            return -1;
        }
        return i10 < i9 ? 1 : 0;
    }

    /* renamed from: c */
    public static int m12691c(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: d */
    public static int m12692d(List list, List list2) {
        int iM12690b = m12690b(list.size(), list2.size());
        if (iM12690b != 0) {
            return iM12690b;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            int iCompare = f13610a.compare(list.get(i9), list2.get(i9));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static int m12693e(Map map, Map map2) {
        int iM12690b = m12690b(map.size(), map2.size());
        if (iM12690b != 0) {
            return iM12690b;
        }
        Comparator comparator = f13610a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f13610a;
            int iCompare = comparator2.compare(entry.getKey(), entry2.getKey());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = comparator2.compare(entry.getValue(), entry2.getValue());
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static int m12694f(Set set, Set set2) {
        int iM12690b = m12690b(set.size(), set2.size());
        if (iM12690b != 0) {
            return iM12690b;
        }
        Comparator comparator = f13610a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompare = f13610a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static int m12695g(byte[] bArr, byte[] bArr2) {
        int iM12690b = m12690b(bArr.length, bArr2.length);
        if (iM12690b != 0) {
            return iM12690b;
        }
        for (int i9 = 0; i9 < bArr.length; i9++) {
            int iM12689a = m12689a(bArr[i9], bArr2[i9]);
            if (iM12689a != 0) {
                return iM12689a;
            }
        }
        return 0;
    }

    /* renamed from: h */
    public static String m12696h(byte b10) {
        return Integer.toHexString((b10 | 256) & 511).toUpperCase().substring(1);
    }

    /* renamed from: i */
    public static void m12697i(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iPosition = byteBuffer.position() + iArrayOffset;
        int iLimit = iArrayOffset + byteBuffer.limit();
        int i9 = iLimit - iPosition > 128 ? iPosition + 128 : iLimit;
        for (int i10 = iPosition; i10 < i9; i10++) {
            if (i10 > iPosition) {
                sb.append(" ");
            }
            sb.append(m12696h(bArrArray[i10]));
        }
        if (iLimit != i9) {
            sb.append("...");
        }
    }
}
