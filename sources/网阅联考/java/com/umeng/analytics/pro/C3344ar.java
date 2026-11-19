package com.umeng.analytics.pro;

import androidx.core.app.FrameMetricsAggregator;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.umeng.analytics.pro.ar */
/* loaded from: classes2.dex */
public final class C3344ar {

    /* renamed from: a */
    private static final Comparator f1830a = new a();

    /* renamed from: com.umeng.analytics.pro.ar$a */
    public static class a implements Comparator {
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
            return obj instanceof List ? C3344ar.m2968a((List) obj, (List) obj2) : obj instanceof Set ? C3344ar.m2970a((Set) obj, (Set) obj2) : obj instanceof Map ? C3344ar.m2969a((Map) obj, (Map) obj2) : obj instanceof byte[] ? C3344ar.m2973a((byte[]) obj, (byte[]) obj2) : C3344ar.m2964a((Comparable) obj, (Comparable) obj2);
        }
    }

    private C3344ar() {
    }

    /* renamed from: a */
    public static int m2960a(byte b4, byte b5) {
        if (b4 < b5) {
            return -1;
        }
        return b5 < b4 ? 1 : 0;
    }

    /* renamed from: b */
    public static boolean m2978b(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    /* renamed from: c */
    public static ByteBuffer m2979c(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        return m2978b(byteBuffer) ? byteBuffer : ByteBuffer.wrap(m2976a(byteBuffer));
    }

    /* renamed from: d */
    public static ByteBuffer m2980d(ByteBuffer byteBuffer) {
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
    public static int m2961a(double d4, double d5) {
        if (d4 < d5) {
            return -1;
        }
        return d5 < d4 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m2962a(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i5 < i4 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m2963a(long j4, long j5) {
        if (j4 < j5) {
            return -1;
        }
        return j5 < j4 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m2971a(short s3, short s4) {
        if (s3 < s4) {
            return -1;
        }
        return s4 < s3 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m2965a(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return m2964a((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return m2968a((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return m2970a((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return m2969a((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return m2973a((byte[]) obj, (byte[]) obj2);
        }
        throw new IllegalArgumentException("Cannot compare objects of type " + obj.getClass());
    }

    /* renamed from: a */
    public static int m2972a(boolean z3, boolean z4) {
        return Boolean.valueOf(z3).compareTo(Boolean.valueOf(z4));
    }

    /* renamed from: a */
    public static int m2966a(String str, String str2) {
        return str.compareTo(str2);
    }

    /* renamed from: a */
    public static int m2973a(byte[] bArr, byte[] bArr2) {
        int iM2962a = m2962a(bArr.length, bArr2.length);
        if (iM2962a != 0) {
            return iM2962a;
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            int iM2960a = m2960a(bArr[i4], bArr2[i4]);
            if (iM2960a != 0) {
                return iM2960a;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m2964a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* renamed from: a */
    public static int m2968a(List list, List list2) {
        int iM2962a = m2962a(list.size(), list2.size());
        if (iM2962a != 0) {
            return iM2962a;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iCompare = f1830a.compare(list.get(i4), list2.get(i4));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m2970a(Set set, Set set2) {
        int iM2962a = m2962a(set.size(), set2.size());
        if (iM2962a != 0) {
            return iM2962a;
        }
        Comparator comparator = f1830a;
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(comparator);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompare = f1830a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m2969a(Map map, Map map2) {
        int iM2962a = m2962a(map.size(), map2.size());
        if (iM2962a != 0) {
            return iM2962a;
        }
        Comparator comparator = f1830a;
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            Comparator comparator2 = f1830a;
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
    public static void m2975a(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        int iPosition = byteBuffer.position() + iArrayOffset;
        int iLimit = iArrayOffset + byteBuffer.limit();
        int i4 = iLimit - iPosition > 128 ? iPosition + 128 : iLimit;
        for (int i5 = iPosition; i5 < i4; i5++) {
            if (i5 > iPosition) {
                sb.append(" ");
            }
            sb.append(m2974a(bArrArray[i5]));
        }
        if (iLimit != i4) {
            sb.append("...");
        }
    }

    /* renamed from: a */
    public static String m2974a(byte b4) {
        return Integer.toHexString((b4 | 256) & FrameMetricsAggregator.EVERY_DURATION).toUpperCase().substring(1);
    }

    /* renamed from: a */
    public static byte[] m2976a(ByteBuffer byteBuffer) {
        if (m2978b(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        m2967a(byteBuffer, bArr, 0);
        return bArr;
    }

    /* renamed from: a */
    public static int m2967a(ByteBuffer byteBuffer, byte[] bArr, int i4) {
        int iRemaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), bArr, i4, iRemaining);
        return iRemaining;
    }

    /* renamed from: a */
    public static byte[] m2977a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
