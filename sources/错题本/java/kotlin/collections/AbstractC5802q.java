package kotlin.collections;

import android.support.v4.media.AbstractC0037f;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5435k;
import p045d6.C5437m;
import p045d6.C5439o;
import p045d6.C5442r;
import p073h4.AbstractC5625a;
import p185v7.AbstractC6675d;
import p200x6.C6756f;

/* renamed from: kotlin.collections.q */
/* loaded from: classes2.dex */
public abstract class AbstractC5802q extends AbstractC5625a {
    /* renamed from: A */
    public static void m5174A(char[] cArr, char[] destination, int i, int i8, int i9) {
        AbstractC5830k.m5330g(cArr, "<this>");
        AbstractC5830k.m5330g(destination, "destination");
        System.arraycopy(cArr, i8, destination, i, i9 - i8);
    }

    /* renamed from: B */
    public static void m5175B(double[] dArr, double[] destination, int i, int i8, int i9) {
        AbstractC5830k.m5330g(dArr, "<this>");
        AbstractC5830k.m5330g(destination, "destination");
        System.arraycopy(dArr, i8, destination, i, i9 - i8);
    }

    /* renamed from: C */
    public static void m5176C(float[] fArr, int i, float[] destination, int i8, int i9) {
        AbstractC5830k.m5330g(fArr, "<this>");
        AbstractC5830k.m5330g(destination, "destination");
        System.arraycopy(fArr, i8, destination, i, i9 - i8);
    }

    /* renamed from: D */
    public static void m5177D(long[] jArr, long[] destination, int i, int i8, int i9) {
        AbstractC5830k.m5330g(jArr, "<this>");
        AbstractC5830k.m5330g(destination, "destination");
        System.arraycopy(jArr, i8, destination, i, i9 - i8);
    }

    /* renamed from: E */
    public static void m5178E(Object[] objArr, Object[] destination, int i, int i8, int i9) {
        AbstractC5830k.m5330g(objArr, "<this>");
        AbstractC5830k.m5330g(destination, "destination");
        System.arraycopy(objArr, i8, destination, i, i9 - i8);
    }

    /* renamed from: F */
    public static /* synthetic */ void m5179F(int i, int i8, int[] iArr, int[] iArr2, int i9) {
        if ((i9 & 2) != 0) {
            i = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = iArr.length;
        }
        m5212y(i, 0, iArr, iArr2, i8);
    }

    /* renamed from: G */
    public static /* synthetic */ void m5180G(float[] fArr, int i, float[] fArr2, int i8) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        m5176C(fArr, i, fArr2, 0, (i8 & 8) != 0 ? fArr.length : 6);
    }

    /* renamed from: I */
    public static /* synthetic */ void m5182I(Object[] objArr, Object[] objArr2, int i, int i8, int i9, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        m5178E(objArr, objArr2, i, i8, i9);
    }

    /* renamed from: J */
    public static byte[] m5183J(byte[] bArr, int i, int i8) {
        AbstractC5830k.m5330g(bArr, "<this>");
        AbstractC5625a.m4947g(i8, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i8);
        AbstractC5830k.m5329f(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* renamed from: K */
    public static Object[] m5184K(int i, int i8, Object[] objArr) {
        AbstractC5830k.m5330g(objArr, "<this>");
        AbstractC5625a.m4947g(i8, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i8);
        AbstractC5830k.m5329f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* renamed from: L */
    public static List m5185L(int i, Object[] objArr) {
        AbstractC5830k.m5330g(objArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i, "Requested element count ", " is less than zero.").toString());
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return m5204e0(objArr);
        }
        if (length == 1) {
            return AbstractC5806u.m5286y(objArr[length2 - 1]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = length2 - length; i8 < length2; i8++) {
            arrayList.add(objArr[i8]);
        }
        return arrayList;
    }

    /* renamed from: M */
    public static void m5186M(Object obj, Object[] objArr, int i, int i8) {
        AbstractC5830k.m5330g(objArr, "<this>");
        Arrays.fill(objArr, i, i8, obj);
    }

    /* renamed from: N */
    public static void m5187N(int[] iArr, int i, int i8, int i9) {
        if ((i9 & 4) != 0) {
            i8 = iArr.length;
        }
        AbstractC5830k.m5330g(iArr, "<this>");
        Arrays.fill(iArr, 0, i8, i);
    }

    /* renamed from: O */
    public static void m5188O(long[] jArr, long j7) {
        int length = jArr.length;
        AbstractC5830k.m5330g(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j7);
    }

    /* renamed from: Q */
    public static ArrayList m5190Q(Object[] objArr) {
        AbstractC5830k.m5330g(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    public static Object m5191R(Object[] objArr) {
        AbstractC5830k.m5330g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: S */
    public static C6756f m5192S(int[] iArr) {
        return new C6756f(0, iArr.length - 1, 1);
    }

    /* renamed from: T */
    public static int m5193T(long[] jArr) {
        AbstractC5830k.m5330g(jArr, "<this>");
        return jArr.length - 1;
    }

    /* renamed from: U */
    public static int m5194U(Object[] objArr) {
        AbstractC5830k.m5330g(objArr, "<this>");
        return objArr.length - 1;
    }

    /* renamed from: V */
    public static Object m5195V(int i, Object[] objArr) {
        AbstractC5830k.m5330g(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    /* renamed from: W */
    public static int m5196W(Object[] objArr, Object obj) {
        AbstractC5830k.m5330g(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: X */
    public static int m5197X(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        int i8 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i9 = iArr[i8];
                if (i < i9) {
                    i = i9;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        return i;
    }

    /* renamed from: Y */
    public static char m5198Y(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: Z */
    public static List m5199Z(Object[] objArr, C6756f indices) {
        AbstractC5830k.m5330g(objArr, "<this>");
        AbstractC5830k.m5330g(indices, "indices");
        return indices.isEmpty() ? EmptyList.INSTANCE : m5208u(m5184K(indices.f11420a, indices.f11421b + 1, objArr));
    }

    /* renamed from: a0 */
    public static final void m5200a0(Object[] objArr, AbstractSet abstractSet) {
        AbstractC5830k.m5330g(objArr, "<this>");
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    /* renamed from: b0 */
    public static List m5201b0(double[] dArr) {
        AbstractC5830k.m5330g(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return AbstractC5806u.m5286y(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d9 : dArr) {
            arrayList.add(Double.valueOf(d9));
        }
        return arrayList;
    }

    /* renamed from: c0 */
    public static List m5202c0(float[] fArr) {
        AbstractC5830k.m5330g(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return AbstractC5806u.m5286y(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    /* renamed from: d0 */
    public static List m5203d0(long[] jArr) {
        AbstractC5830k.m5330g(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return AbstractC5806u.m5286y(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    /* renamed from: e0 */
    public static List m5204e0(Object[] objArr) {
        AbstractC5830k.m5330g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C5800o(objArr, false)) : AbstractC5806u.m5286y(objArr[0]) : EmptyList.INSTANCE;
    }

    /* renamed from: f0 */
    public static List m5205f0(boolean[] zArr) {
        AbstractC5830k.m5330g(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return AbstractC5806u.m5286y(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z8 : zArr) {
            arrayList.add(Boolean.valueOf(z8));
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public static ArrayList m5206g0(int[] iArr) {
        AbstractC5830k.m5330g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public static Set m5207h0(Object[] objArr) {
        AbstractC5830k.m5330g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.INSTANCE;
        }
        if (length == 1) {
            return AbstractC6675d.m6354t(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC5785e0.m5149C(objArr.length));
        m5200a0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: u */
    public static List m5208u(Object[] objArr) {
        AbstractC5830k.m5330g(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC5830k.m5329f(listAsList, "asList(...)");
        return listAsList;
    }

    /* renamed from: v */
    public static boolean m5209v(Object[] objArr, Object obj) {
        AbstractC5830k.m5330g(objArr, "<this>");
        return m5196W(objArr, obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    /* renamed from: w */
    public static boolean m5210w(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!m5210w((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof C5435k) && (obj2 instanceof C5435k)) {
                    byte[] bArr = ((C5435k) obj).f8397a;
                    byte[] bArr2 = ((C5435k) obj2).f8397a;
                    if (bArr == null) {
                        bArr = null;
                    }
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof C5442r) && (obj2 instanceof C5442r)) {
                    short[] sArr = ((C5442r) obj).f8404a;
                    ?? r52 = ((C5442r) obj2).f8404a;
                    if (sArr == null) {
                        sArr = null;
                    }
                    if (!Arrays.equals(sArr, (short[]) (r52 != 0 ? r52 : null))) {
                        return false;
                    }
                } else if ((obj instanceof C5437m) && (obj2 instanceof C5437m)) {
                    int[] iArr = ((C5437m) obj).f8399a;
                    ?? r53 = ((C5437m) obj2).f8399a;
                    if (iArr == null) {
                        iArr = null;
                    }
                    if (!Arrays.equals(iArr, (int[]) (r53 != 0 ? r53 : null))) {
                        return false;
                    }
                } else if ((obj instanceof C5439o) && (obj2 instanceof C5439o)) {
                    long[] jArr = ((C5439o) obj).f8401a;
                    ?? r54 = ((C5439o) obj2).f8401a;
                    if (jArr == null) {
                        jArr = null;
                    }
                    if (!Arrays.equals(jArr, (long[]) (r54 != 0 ? r54 : null))) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: x */
    public static final void m5211x(Object[] objArr, StringBuilder sb, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i];
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof Object[]) {
                m5211x((Object[]) obj, sb, arrayList);
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                AbstractC5830k.m5329f(string, "toString(...)");
                sb.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                AbstractC5830k.m5329f(string2, "toString(...)");
                sb.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                AbstractC5830k.m5329f(string3, "toString(...)");
                sb.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                AbstractC5830k.m5329f(string4, "toString(...)");
                sb.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                AbstractC5830k.m5329f(string5, "toString(...)");
                sb.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                AbstractC5830k.m5329f(string6, "toString(...)");
                sb.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                AbstractC5830k.m5329f(string7, "toString(...)");
                sb.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                AbstractC5830k.m5329f(string8, "toString(...)");
                sb.append(string8);
            } else if (obj instanceof C5435k) {
                String strM5234n0 = AbstractC5805t.m5234n0(new C5435k(((C5435k) obj).f8397a), ", ", "[", "]", null, 56);
                sb.append(strM5234n0 != null ? strM5234n0 : "null");
            } else if (obj instanceof C5442r) {
                String strM5234n02 = AbstractC5805t.m5234n0(new C5442r(((C5442r) obj).f8404a), ", ", "[", "]", null, 56);
                sb.append(strM5234n02 != null ? strM5234n02 : "null");
            } else if (obj instanceof C5437m) {
                String strM5234n03 = AbstractC5805t.m5234n0(new C5437m(((C5437m) obj).f8399a), ", ", "[", "]", null, 56);
                sb.append(strM5234n03 != null ? strM5234n03 : "null");
            } else if (obj instanceof C5439o) {
                String strM5234n04 = AbstractC5805t.m5234n0(new C5439o(((C5439o) obj).f8401a), ", ", "[", "]", null, 56);
                sb.append(strM5234n04 != null ? strM5234n04 : "null");
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        arrayList.remove(AbstractC5806u.m5282u(arrayList));
    }

    /* renamed from: y */
    public static void m5212y(int i, int i8, int[] iArr, int[] destination, int i9) {
        AbstractC5830k.m5330g(iArr, "<this>");
        AbstractC5830k.m5330g(destination, "destination");
        System.arraycopy(iArr, i8, destination, i, i9 - i8);
    }

    /* renamed from: z */
    public static void m5213z(byte[] bArr, int i, byte[] destination, int i8, int i9) {
        AbstractC5830k.m5330g(bArr, "<this>");
        AbstractC5830k.m5330g(destination, "destination");
        System.arraycopy(bArr, i8, destination, i, i9 - i8);
    }
}
