package com.umeng.analytics.pro;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.umeng.analytics.pro.ar */
/* loaded from: classes.dex */
public final class C1860ar {

    /* renamed from: a */
    private static final Comparator f8422a = new a();

    /* renamed from: com.umeng.analytics.pro.ar$a */
    private static class a implements Comparator {
        private a() {
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
            return obj instanceof List ? C1860ar.m6891a((List) obj, (List) obj2) : obj instanceof Set ? C1860ar.m6893a((Set) obj, (Set) obj2) : obj instanceof Map ? C1860ar.m6892a((Map) obj, (Map) obj2) : obj instanceof byte[] ? C1860ar.m6896a((byte[]) obj, (byte[]) obj2) : C1860ar.m6887a((Comparable) obj, (Comparable) obj2);
        }
    }

    private C1860ar() {
    }

    /* renamed from: a */
    public static int m6883a(byte b4, byte b5) {
        if (b4 < b5) {
            return -1;
        }
        return b5 < b4 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m6884a(double d4, double d5) {
        if (d4 < d5) {
            return -1;
        }
        return d5 < d4 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m6885a(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i5 < i4 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m6886a(long j4, long j5) {
        if (j4 < j5) {
            return -1;
        }
        return j5 < j4 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m6888a(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return m6887a((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return m6891a((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return m6893a((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return m6892a((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return m6896a((byte[]) obj, (byte[]) obj2);
        }
        throw new IllegalArgumentException("Cannot compare objects of type " + obj.getClass());
    }

    /* renamed from: a */
    public static int m6894a(short s3, short s4) {
        if (s3 < s4) {
            return -1;
        }
        return s4 < s3 ? 1 : 0;
    }

    /* renamed from: b */
    public static boolean m6901b(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* renamed from: c */
    public static ByteBuffer m6902c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        return m6901b(byteBuffer) ? byteBuffer : ByteBuffer.wrap(m6899a(byteBuffer));
    }

    /* renamed from: d */
    public static ByteBuffer m6903d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[byteBuffer.remaining()]);
        if (byteBuffer.hasArray()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBufferWrap.array(), 0, byteBuffer.remaining());
        } else {
            byteBuffer.slice().get(byteBufferWrap.array());
        }
        return byteBufferWrap;
    }

    /* renamed from: a */
    public static int m6895a(boolean z3, boolean z4) {
        return Boolean.valueOf(z3).compareTo(Boolean.valueOf(z4));
    }

    /* renamed from: a */
    public static int m6889a(String str, String str2) {
        return str.compareTo(str2);
    }

    /* renamed from: a */
    public static int m6896a(byte[] bArr, byte[] bArr2) {
        int iM6885a = m6885a(bArr.length, bArr2.length);
        if (iM6885a != 0) {
            return iM6885a;
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            int iM6883a = m6883a(bArr[i4], bArr2[i4]);
            if (iM6883a != 0) {
                return iM6883a;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m6887a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: a */
    public static int m6891a(List list, List list2) {
        int iM6885a = m6885a(list.size(), list2.size());
        if (iM6885a != 0) {
            return iM6885a;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iCompare = f8422a.compare(list.get(i4), list2.get(i4));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m6893a(Set set, Set set2) {
        int iM6885a = m6885a(set.size(), set2.size());
        if (iM6885a != 0) {
            return iM6885a;
        }
        Comparator comparator = f8422a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompare = f8422a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m6892a(Map map, Map map2) {
        int iM6885a = m6885a(map.size(), map2.size());
        if (iM6885a != 0) {
            return iM6885a;
        }
        Comparator comparator = f8422a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f8422a;
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

    /* renamed from: a */
    public static void m6898a(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iPosition = byteBuffer.position() + iArrayOffset;
        int iLimit = iArrayOffset + byteBuffer.limit();
        int i4 = iLimit - iPosition > 128 ? iPosition + 128 : iLimit;
        for (int i5 = iPosition; i5 < i4; i5++) {
            if (i5 > iPosition) {
                sb.append(" ");
            }
            sb.append(m6897a(bArrArray[i5]));
        }
        if (iLimit != i4) {
            sb.append("...");
        }
    }

    /* renamed from: a */
    public static String m6897a(byte b4) {
        return Integer.toHexString((b4 | 256) & 511).toUpperCase().substring(1);
    }

    /* renamed from: a */
    public static byte[] m6899a(ByteBuffer byteBuffer) {
        if (m6901b(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m6890a(byteBuffer, bArr, 0);
        return bArr;
    }

    /* renamed from: a */
    public static int m6890a(ByteBuffer byteBuffer, byte[] bArr, int i4) {
        int iRemaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i4, iRemaining);
        return iRemaining;
    }

    /* renamed from: a */
    public static byte[] m6900a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
