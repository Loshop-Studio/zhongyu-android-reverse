package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C0265a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p113l.C2827c;
import p121n.C2869e;
import p121n.C2874j;

/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes.dex */
public class C0295c {

    /* renamed from: e */
    private static final int[] f1978e = {0, 4, 8};

    /* renamed from: f */
    private static SparseIntArray f1979f;

    /* renamed from: a */
    private boolean f1980a;

    /* renamed from: b */
    private HashMap<String, C0293a> f1981b = new HashMap<>();

    /* renamed from: c */
    private boolean f1982c = true;

    /* renamed from: d */
    private HashMap<Integer, a> f1983d = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    public static class a {

        /* renamed from: a */
        int f1984a;

        /* renamed from: b */
        public final d f1985b = new d();

        /* renamed from: c */
        public final c f1986c = new c();

        /* renamed from: d */
        public final b f1987d = new b();

        /* renamed from: e */
        public final e f1988e = new e();

        /* renamed from: f */
        public HashMap<String, C0293a> f1989f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m1678f(int i4, ConstraintLayout.LayoutParams layoutParams) {
            this.f1984a = i4;
            b bVar = this.f1987d;
            bVar.f2031h = layoutParams.f1882d;
            bVar.f2033i = layoutParams.f1884e;
            bVar.f2035j = layoutParams.f1886f;
            bVar.f2037k = layoutParams.f1888g;
            bVar.f2038l = layoutParams.f1890h;
            bVar.f2039m = layoutParams.f1892i;
            bVar.f2040n = layoutParams.f1894j;
            bVar.f2041o = layoutParams.f1896k;
            bVar.f2042p = layoutParams.f1898l;
            bVar.f2043q = layoutParams.f1906p;
            bVar.f2044r = layoutParams.f1907q;
            bVar.f2045s = layoutParams.f1908r;
            bVar.f2046t = layoutParams.f1909s;
            bVar.f2047u = layoutParams.f1916z;
            bVar.f2048v = layoutParams.f1850A;
            bVar.f2049w = layoutParams.f1851B;
            bVar.f2050x = layoutParams.f1900m;
            bVar.f2051y = layoutParams.f1902n;
            bVar.f2052z = layoutParams.f1904o;
            bVar.f1991A = layoutParams.f1866Q;
            bVar.f1992B = layoutParams.f1867R;
            bVar.f1993C = layoutParams.f1868S;
            bVar.f2029g = layoutParams.f1880c;
            bVar.f2025e = layoutParams.f1876a;
            bVar.f2027f = layoutParams.f1878b;
            bVar.f2021c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            bVar.f2023d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            bVar.f1994D = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            bVar.f1995E = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            bVar.f1996F = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            bVar.f1997G = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            bVar.f2006P = layoutParams.f1855F;
            bVar.f2007Q = layoutParams.f1854E;
            bVar.f2009S = layoutParams.f1857H;
            bVar.f2008R = layoutParams.f1856G;
            bVar.f2032h0 = layoutParams.f1869T;
            bVar.f2034i0 = layoutParams.f1870U;
            bVar.f2010T = layoutParams.f1858I;
            bVar.f2011U = layoutParams.f1859J;
            bVar.f2012V = layoutParams.f1862M;
            bVar.f2013W = layoutParams.f1863N;
            bVar.f2014X = layoutParams.f1860K;
            bVar.f2015Y = layoutParams.f1861L;
            bVar.f2016Z = layoutParams.f1864O;
            bVar.f2018a0 = layoutParams.f1865P;
            bVar.f2030g0 = layoutParams.f1871V;
            bVar.f2001K = layoutParams.f1911u;
            bVar.f2003M = layoutParams.f1913w;
            bVar.f2000J = layoutParams.f1910t;
            bVar.f2002L = layoutParams.f1912v;
            bVar.f2005O = layoutParams.f1914x;
            bVar.f2004N = layoutParams.f1915y;
            bVar.f1998H = layoutParams.getMarginEnd();
            this.f1987d.f1999I = layoutParams.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m1679g(int i4, Constraints.LayoutParams layoutParams) {
            m1678f(i4, layoutParams);
            this.f1985b.f2064d = layoutParams.f1930p0;
            e eVar = this.f1988e;
            eVar.f2068b = layoutParams.f1933s0;
            eVar.f2069c = layoutParams.f1934t0;
            eVar.f2070d = layoutParams.f1935u0;
            eVar.f2071e = layoutParams.f1936v0;
            eVar.f2072f = layoutParams.f1937w0;
            eVar.f2073g = layoutParams.f1938x0;
            eVar.f2074h = layoutParams.f1939y0;
            eVar.f2075i = layoutParams.f1940z0;
            eVar.f2076j = layoutParams.f1928A0;
            eVar.f2077k = layoutParams.f1929B0;
            eVar.f2079m = layoutParams.f1932r0;
            eVar.f2078l = layoutParams.f1931q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m1680h(ConstraintHelper constraintHelper, int i4, Constraints.LayoutParams layoutParams) {
            m1679g(i4, layoutParams);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.f1987d;
                bVar.f2024d0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f2020b0 = barrier.getType();
                this.f1987d.f2026e0 = barrier.getReferencedIds();
                this.f1987d.f2022c0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void m1681d(ConstraintLayout.LayoutParams layoutParams) {
            b bVar = this.f1987d;
            layoutParams.f1882d = bVar.f2031h;
            layoutParams.f1884e = bVar.f2033i;
            layoutParams.f1886f = bVar.f2035j;
            layoutParams.f1888g = bVar.f2037k;
            layoutParams.f1890h = bVar.f2038l;
            layoutParams.f1892i = bVar.f2039m;
            layoutParams.f1894j = bVar.f2040n;
            layoutParams.f1896k = bVar.f2041o;
            layoutParams.f1898l = bVar.f2042p;
            layoutParams.f1906p = bVar.f2043q;
            layoutParams.f1907q = bVar.f2044r;
            layoutParams.f1908r = bVar.f2045s;
            layoutParams.f1909s = bVar.f2046t;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bVar.f1994D;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bVar.f1995E;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.f1996F;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.f1997G;
            layoutParams.f1914x = bVar.f2005O;
            layoutParams.f1915y = bVar.f2004N;
            layoutParams.f1911u = bVar.f2001K;
            layoutParams.f1913w = bVar.f2003M;
            layoutParams.f1916z = bVar.f2047u;
            layoutParams.f1850A = bVar.f2048v;
            layoutParams.f1900m = bVar.f2050x;
            layoutParams.f1902n = bVar.f2051y;
            layoutParams.f1904o = bVar.f2052z;
            layoutParams.f1851B = bVar.f2049w;
            layoutParams.f1866Q = bVar.f1991A;
            layoutParams.f1867R = bVar.f1992B;
            layoutParams.f1855F = bVar.f2006P;
            layoutParams.f1854E = bVar.f2007Q;
            layoutParams.f1857H = bVar.f2009S;
            layoutParams.f1856G = bVar.f2008R;
            layoutParams.f1869T = bVar.f2032h0;
            layoutParams.f1870U = bVar.f2034i0;
            layoutParams.f1858I = bVar.f2010T;
            layoutParams.f1859J = bVar.f2011U;
            layoutParams.f1862M = bVar.f2012V;
            layoutParams.f1863N = bVar.f2013W;
            layoutParams.f1860K = bVar.f2014X;
            layoutParams.f1861L = bVar.f2015Y;
            layoutParams.f1864O = bVar.f2016Z;
            layoutParams.f1865P = bVar.f2018a0;
            layoutParams.f1868S = bVar.f1993C;
            layoutParams.f1880c = bVar.f2029g;
            layoutParams.f1876a = bVar.f2025e;
            layoutParams.f1878b = bVar.f2027f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = bVar.f2021c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = bVar.f2023d;
            String str = bVar.f2030g0;
            if (str != null) {
                layoutParams.f1871V = str;
            }
            layoutParams.setMarginStart(bVar.f1999I);
            layoutParams.setMarginEnd(this.f1987d.f1998H);
            layoutParams.m1620c();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1987d.m1683a(this.f1987d);
            aVar.f1986c.m1685a(this.f1986c);
            aVar.f1985b.m1687a(this.f1985b);
            aVar.f1988e.m1689a(this.f1988e);
            aVar.f1984a = this.f1984a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    public static class b {

        /* renamed from: k0 */
        private static SparseIntArray f1990k0;

        /* renamed from: c */
        public int f2021c;

        /* renamed from: d */
        public int f2023d;

        /* renamed from: e0 */
        public int[] f2026e0;

        /* renamed from: f0 */
        public String f2028f0;

        /* renamed from: g0 */
        public String f2030g0;

        /* renamed from: a */
        public boolean f2017a = false;

        /* renamed from: b */
        public boolean f2019b = false;

        /* renamed from: e */
        public int f2025e = -1;

        /* renamed from: f */
        public int f2027f = -1;

        /* renamed from: g */
        public float f2029g = -1.0f;

        /* renamed from: h */
        public int f2031h = -1;

        /* renamed from: i */
        public int f2033i = -1;

        /* renamed from: j */
        public int f2035j = -1;

        /* renamed from: k */
        public int f2037k = -1;

        /* renamed from: l */
        public int f2038l = -1;

        /* renamed from: m */
        public int f2039m = -1;

        /* renamed from: n */
        public int f2040n = -1;

        /* renamed from: o */
        public int f2041o = -1;

        /* renamed from: p */
        public int f2042p = -1;

        /* renamed from: q */
        public int f2043q = -1;

        /* renamed from: r */
        public int f2044r = -1;

        /* renamed from: s */
        public int f2045s = -1;

        /* renamed from: t */
        public int f2046t = -1;

        /* renamed from: u */
        public float f2047u = 0.5f;

        /* renamed from: v */
        public float f2048v = 0.5f;

        /* renamed from: w */
        public String f2049w = null;

        /* renamed from: x */
        public int f2050x = -1;

        /* renamed from: y */
        public int f2051y = 0;

        /* renamed from: z */
        public float f2052z = IGoodView.DEFAULT_TO_ALPHA;

        /* renamed from: A */
        public int f1991A = -1;

        /* renamed from: B */
        public int f1992B = -1;

        /* renamed from: C */
        public int f1993C = -1;

        /* renamed from: D */
        public int f1994D = -1;

        /* renamed from: E */
        public int f1995E = -1;

        /* renamed from: F */
        public int f1996F = -1;

        /* renamed from: G */
        public int f1997G = -1;

        /* renamed from: H */
        public int f1998H = -1;

        /* renamed from: I */
        public int f1999I = -1;

        /* renamed from: J */
        public int f2000J = -1;

        /* renamed from: K */
        public int f2001K = -1;

        /* renamed from: L */
        public int f2002L = -1;

        /* renamed from: M */
        public int f2003M = -1;

        /* renamed from: N */
        public int f2004N = -1;

        /* renamed from: O */
        public int f2005O = -1;

        /* renamed from: P */
        public float f2006P = -1.0f;

        /* renamed from: Q */
        public float f2007Q = -1.0f;

        /* renamed from: R */
        public int f2008R = 0;

        /* renamed from: S */
        public int f2009S = 0;

        /* renamed from: T */
        public int f2010T = 0;

        /* renamed from: U */
        public int f2011U = 0;

        /* renamed from: V */
        public int f2012V = -1;

        /* renamed from: W */
        public int f2013W = -1;

        /* renamed from: X */
        public int f2014X = -1;

        /* renamed from: Y */
        public int f2015Y = -1;

        /* renamed from: Z */
        public float f2016Z = 1.0f;

        /* renamed from: a0 */
        public float f2018a0 = 1.0f;

        /* renamed from: b0 */
        public int f2020b0 = -1;

        /* renamed from: c0 */
        public int f2022c0 = 0;

        /* renamed from: d0 */
        public int f2024d0 = -1;

        /* renamed from: h0 */
        public boolean f2032h0 = false;

        /* renamed from: i0 */
        public boolean f2034i0 = false;

        /* renamed from: j0 */
        public boolean f2036j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1990k0 = sparseIntArray;
            sparseIntArray.append(C0298f.f2213O5, 24);
            f1990k0.append(C0298f.f2222P5, 25);
            f1990k0.append(C0298f.f2240R5, 28);
            f1990k0.append(C0298f.f2249S5, 29);
            f1990k0.append(C0298f.f2294X5, 35);
            f1990k0.append(C0298f.f2285W5, 34);
            f1990k0.append(C0298f.f2558z5, 4);
            f1990k0.append(C0298f.f2549y5, 3);
            f1990k0.append(C0298f.f2531w5, 1);
            f1990k0.append(C0298f.f2342c6, 6);
            f1990k0.append(C0298f.f2352d6, 7);
            f1990k0.append(C0298f.f2141G5, 17);
            f1990k0.append(C0298f.f2150H5, 18);
            f1990k0.append(C0298f.f2159I5, 19);
            f1990k0.append(C0298f.f2391h5, 26);
            f1990k0.append(C0298f.f2258T5, 31);
            f1990k0.append(C0298f.f2267U5, 32);
            f1990k0.append(C0298f.f2132F5, 10);
            f1990k0.append(C0298f.f2123E5, 9);
            f1990k0.append(C0298f.f2382g6, 13);
            f1990k0.append(C0298f.f2412j6, 16);
            f1990k0.append(C0298f.f2392h6, 14);
            f1990k0.append(C0298f.f2362e6, 11);
            f1990k0.append(C0298f.f2402i6, 15);
            f1990k0.append(C0298f.f2372f6, 12);
            f1990k0.append(C0298f.f2322a6, 38);
            f1990k0.append(C0298f.f2195M5, 37);
            f1990k0.append(C0298f.f2186L5, 39);
            f1990k0.append(C0298f.f2312Z5, 40);
            f1990k0.append(C0298f.f2177K5, 20);
            f1990k0.append(C0298f.f2303Y5, 36);
            f1990k0.append(C0298f.f2114D5, 5);
            f1990k0.append(C0298f.f2204N5, 76);
            f1990k0.append(C0298f.f2276V5, 76);
            f1990k0.append(C0298f.f2231Q5, 76);
            f1990k0.append(C0298f.f2540x5, 76);
            f1990k0.append(C0298f.f2522v5, 76);
            f1990k0.append(C0298f.f2421k5, 23);
            f1990k0.append(C0298f.f2441m5, 27);
            f1990k0.append(C0298f.f2459o5, 30);
            f1990k0.append(C0298f.f2468p5, 8);
            f1990k0.append(C0298f.f2431l5, 33);
            f1990k0.append(C0298f.f2450n5, 2);
            f1990k0.append(C0298f.f2401i5, 22);
            f1990k0.append(C0298f.f2411j5, 21);
            f1990k0.append(C0298f.f2087A5, 61);
            f1990k0.append(C0298f.f2105C5, 62);
            f1990k0.append(C0298f.f2096B5, 63);
            f1990k0.append(C0298f.f2332b6, 69);
            f1990k0.append(C0298f.f2168J5, 70);
            f1990k0.append(C0298f.f2504t5, 71);
            f1990k0.append(C0298f.f2486r5, 72);
            f1990k0.append(C0298f.f2495s5, 73);
            f1990k0.append(C0298f.f2513u5, 74);
            f1990k0.append(C0298f.f2477q5, 75);
        }

        /* renamed from: a */
        public void m1683a(b bVar) {
            this.f2017a = bVar.f2017a;
            this.f2021c = bVar.f2021c;
            this.f2019b = bVar.f2019b;
            this.f2023d = bVar.f2023d;
            this.f2025e = bVar.f2025e;
            this.f2027f = bVar.f2027f;
            this.f2029g = bVar.f2029g;
            this.f2031h = bVar.f2031h;
            this.f2033i = bVar.f2033i;
            this.f2035j = bVar.f2035j;
            this.f2037k = bVar.f2037k;
            this.f2038l = bVar.f2038l;
            this.f2039m = bVar.f2039m;
            this.f2040n = bVar.f2040n;
            this.f2041o = bVar.f2041o;
            this.f2042p = bVar.f2042p;
            this.f2043q = bVar.f2043q;
            this.f2044r = bVar.f2044r;
            this.f2045s = bVar.f2045s;
            this.f2046t = bVar.f2046t;
            this.f2047u = bVar.f2047u;
            this.f2048v = bVar.f2048v;
            this.f2049w = bVar.f2049w;
            this.f2050x = bVar.f2050x;
            this.f2051y = bVar.f2051y;
            this.f2052z = bVar.f2052z;
            this.f1991A = bVar.f1991A;
            this.f1992B = bVar.f1992B;
            this.f1993C = bVar.f1993C;
            this.f1994D = bVar.f1994D;
            this.f1995E = bVar.f1995E;
            this.f1996F = bVar.f1996F;
            this.f1997G = bVar.f1997G;
            this.f1998H = bVar.f1998H;
            this.f1999I = bVar.f1999I;
            this.f2000J = bVar.f2000J;
            this.f2001K = bVar.f2001K;
            this.f2002L = bVar.f2002L;
            this.f2003M = bVar.f2003M;
            this.f2004N = bVar.f2004N;
            this.f2005O = bVar.f2005O;
            this.f2006P = bVar.f2006P;
            this.f2007Q = bVar.f2007Q;
            this.f2008R = bVar.f2008R;
            this.f2009S = bVar.f2009S;
            this.f2010T = bVar.f2010T;
            this.f2011U = bVar.f2011U;
            this.f2012V = bVar.f2012V;
            this.f2013W = bVar.f2013W;
            this.f2014X = bVar.f2014X;
            this.f2015Y = bVar.f2015Y;
            this.f2016Z = bVar.f2016Z;
            this.f2018a0 = bVar.f2018a0;
            this.f2020b0 = bVar.f2020b0;
            this.f2022c0 = bVar.f2022c0;
            this.f2024d0 = bVar.f2024d0;
            this.f2030g0 = bVar.f2030g0;
            int[] iArr = bVar.f2026e0;
            if (iArr != null) {
                this.f2026e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2026e0 = null;
            }
            this.f2028f0 = bVar.f2028f0;
            this.f2032h0 = bVar.f2032h0;
            this.f2034i0 = bVar.f2034i0;
            this.f2036j0 = bVar.f2036j0;
        }

        /* renamed from: b */
        void m1684b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0298f.f2381g5);
            this.f2019b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                int i5 = f1990k0.get(index);
                if (i5 == 80) {
                    this.f2032h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2032h0);
                } else if (i5 != 81) {
                    switch (i5) {
                        case 1:
                            this.f2042p = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2042p);
                            break;
                        case 2:
                            this.f1997G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1997G);
                            break;
                        case 3:
                            this.f2041o = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2041o);
                            break;
                        case 4:
                            this.f2040n = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2040n);
                            break;
                        case 5:
                            this.f2049w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f1991A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1991A);
                            break;
                        case 7:
                            this.f1992B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1992B);
                            break;
                        case 8:
                            this.f1998H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1998H);
                            break;
                        case 9:
                            this.f2046t = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2046t);
                            break;
                        case 10:
                            this.f2045s = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2045s);
                            break;
                        case 11:
                            this.f2003M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2003M);
                            break;
                        case 12:
                            this.f2004N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2004N);
                            break;
                        case 13:
                            this.f2000J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2000J);
                            break;
                        case 14:
                            this.f2002L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2002L);
                            break;
                        case 15:
                            this.f2005O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2005O);
                            break;
                        case 16:
                            this.f2001K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2001K);
                            break;
                        case 17:
                            this.f2025e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2025e);
                            break;
                        case 18:
                            this.f2027f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2027f);
                            break;
                        case 19:
                            this.f2029g = typedArrayObtainStyledAttributes.getFloat(index, this.f2029g);
                            break;
                        case 20:
                            this.f2047u = typedArrayObtainStyledAttributes.getFloat(index, this.f2047u);
                            break;
                        case 21:
                            this.f2023d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2023d);
                            break;
                        case 22:
                            this.f2021c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f2021c);
                            break;
                        case 23:
                            this.f1994D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1994D);
                            break;
                        case 24:
                            this.f2031h = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2031h);
                            break;
                        case 25:
                            this.f2033i = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2033i);
                            break;
                        case 26:
                            this.f1993C = typedArrayObtainStyledAttributes.getInt(index, this.f1993C);
                            break;
                        case 27:
                            this.f1995E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1995E);
                            break;
                        case 28:
                            this.f2035j = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2035j);
                            break;
                        case 29:
                            this.f2037k = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2037k);
                            break;
                        case 30:
                            this.f1999I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1999I);
                            break;
                        case 31:
                            this.f2043q = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2043q);
                            break;
                        case 32:
                            this.f2044r = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2044r);
                            break;
                        case 33:
                            this.f1996F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1996F);
                            break;
                        case 34:
                            this.f2039m = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2039m);
                            break;
                        case 35:
                            this.f2038l = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2038l);
                            break;
                        case 36:
                            this.f2048v = typedArrayObtainStyledAttributes.getFloat(index, this.f2048v);
                            break;
                        case 37:
                            this.f2007Q = typedArrayObtainStyledAttributes.getFloat(index, this.f2007Q);
                            break;
                        case 38:
                            this.f2006P = typedArrayObtainStyledAttributes.getFloat(index, this.f2006P);
                            break;
                        case 39:
                            this.f2008R = typedArrayObtainStyledAttributes.getInt(index, this.f2008R);
                            break;
                        case 40:
                            this.f2009S = typedArrayObtainStyledAttributes.getInt(index, this.f2009S);
                            break;
                        default:
                            switch (i5) {
                                case 54:
                                    this.f2010T = typedArrayObtainStyledAttributes.getInt(index, this.f2010T);
                                    break;
                                case 55:
                                    this.f2011U = typedArrayObtainStyledAttributes.getInt(index, this.f2011U);
                                    break;
                                case 56:
                                    this.f2012V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2012V);
                                    break;
                                case 57:
                                    this.f2013W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2013W);
                                    break;
                                case 58:
                                    this.f2014X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2014X);
                                    break;
                                case 59:
                                    this.f2015Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2015Y);
                                    break;
                                default:
                                    switch (i5) {
                                        case 61:
                                            this.f2050x = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2050x);
                                            break;
                                        case 62:
                                            this.f2051y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2051y);
                                            break;
                                        case 63:
                                            this.f2052z = typedArrayObtainStyledAttributes.getFloat(index, this.f2052z);
                                            break;
                                        default:
                                            switch (i5) {
                                                case 69:
                                                    this.f2016Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f2018a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f2020b0 = typedArrayObtainStyledAttributes.getInt(index, this.f2020b0);
                                                    break;
                                                case 73:
                                                    this.f2022c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f2022c0);
                                                    break;
                                                case 74:
                                                    this.f2028f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f2036j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2036j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1990k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f2030g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1990k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f2034i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f2034i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c */
    public static class c {

        /* renamed from: h */
        private static SparseIntArray f2053h;

        /* renamed from: a */
        public boolean f2054a = false;

        /* renamed from: b */
        public int f2055b = -1;

        /* renamed from: c */
        public String f2056c = null;

        /* renamed from: d */
        public int f2057d = -1;

        /* renamed from: e */
        public int f2058e = 0;

        /* renamed from: f */
        public float f2059f = Float.NaN;

        /* renamed from: g */
        public float f2060g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2053h = sparseIntArray;
            sparseIntArray.append(C0298f.f2088A6, 1);
            f2053h.append(C0298f.f2106C6, 2);
            f2053h.append(C0298f.f2115D6, 3);
            f2053h.append(C0298f.f2559z6, 4);
            f2053h.append(C0298f.f2550y6, 5);
            f2053h.append(C0298f.f2097B6, 6);
        }

        /* renamed from: a */
        public void m1685a(c cVar) {
            this.f2054a = cVar.f2054a;
            this.f2055b = cVar.f2055b;
            this.f2056c = cVar.f2056c;
            this.f2057d = cVar.f2057d;
            this.f2058e = cVar.f2058e;
            this.f2060g = cVar.f2060g;
            this.f2059f = cVar.f2059f;
        }

        /* renamed from: b */
        void m1686b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0298f.f2541x6);
            this.f2054a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                switch (f2053h.get(index)) {
                    case 1:
                        this.f2060g = typedArrayObtainStyledAttributes.getFloat(index, this.f2060g);
                        break;
                    case 2:
                        this.f2057d = typedArrayObtainStyledAttributes.getInt(index, this.f2057d);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2056c = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2056c = C2827c.f10878c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2058e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2055b = C0295c.m1652w(typedArrayObtainStyledAttributes, index, this.f2055b);
                        break;
                    case 6:
                        this.f2059f = typedArrayObtainStyledAttributes.getFloat(index, this.f2059f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$d */
    public static class d {

        /* renamed from: a */
        public boolean f2061a = false;

        /* renamed from: b */
        public int f2062b = 0;

        /* renamed from: c */
        public int f2063c = 0;

        /* renamed from: d */
        public float f2064d = 1.0f;

        /* renamed from: e */
        public float f2065e = Float.NaN;

        /* renamed from: a */
        public void m1687a(d dVar) {
            this.f2061a = dVar.f2061a;
            this.f2062b = dVar.f2062b;
            this.f2064d = dVar.f2064d;
            this.f2065e = dVar.f2065e;
            this.f2063c = dVar.f2063c;
        }

        /* renamed from: b */
        void m1688b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0298f.f2452n7);
            this.f2061a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2470p7) {
                    this.f2064d = typedArrayObtainStyledAttributes.getFloat(index, this.f2064d);
                } else if (index == C0298f.f2461o7) {
                    this.f2062b = typedArrayObtainStyledAttributes.getInt(index, this.f2062b);
                    this.f2062b = C0295c.f1978e[this.f2062b];
                } else if (index == C0298f.f2488r7) {
                    this.f2063c = typedArrayObtainStyledAttributes.getInt(index, this.f2063c);
                } else if (index == C0298f.f2479q7) {
                    this.f2065e = typedArrayObtainStyledAttributes.getFloat(index, this.f2065e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$e */
    public static class e {

        /* renamed from: n */
        private static SparseIntArray f2066n;

        /* renamed from: a */
        public boolean f2067a = false;

        /* renamed from: b */
        public float f2068b = IGoodView.DEFAULT_TO_ALPHA;

        /* renamed from: c */
        public float f2069c = IGoodView.DEFAULT_TO_ALPHA;

        /* renamed from: d */
        public float f2070d = IGoodView.DEFAULT_TO_ALPHA;

        /* renamed from: e */
        public float f2071e = 1.0f;

        /* renamed from: f */
        public float f2072f = 1.0f;

        /* renamed from: g */
        public float f2073g = Float.NaN;

        /* renamed from: h */
        public float f2074h = Float.NaN;

        /* renamed from: i */
        public float f2075i = IGoodView.DEFAULT_TO_ALPHA;

        /* renamed from: j */
        public float f2076j = IGoodView.DEFAULT_TO_ALPHA;

        /* renamed from: k */
        public float f2077k = IGoodView.DEFAULT_TO_ALPHA;

        /* renamed from: l */
        public boolean f2078l = false;

        /* renamed from: m */
        public float f2079m = IGoodView.DEFAULT_TO_ALPHA;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2066n = sparseIntArray;
            sparseIntArray.append(C0298f.f2197M7, 1);
            f2066n.append(C0298f.f2206N7, 2);
            f2066n.append(C0298f.f2215O7, 3);
            f2066n.append(C0298f.f2179K7, 4);
            f2066n.append(C0298f.f2188L7, 5);
            f2066n.append(C0298f.f2143G7, 6);
            f2066n.append(C0298f.f2152H7, 7);
            f2066n.append(C0298f.f2161I7, 8);
            f2066n.append(C0298f.f2170J7, 9);
            f2066n.append(C0298f.f2224P7, 10);
            f2066n.append(C0298f.f2233Q7, 11);
        }

        /* renamed from: a */
        public void m1689a(e eVar) {
            this.f2067a = eVar.f2067a;
            this.f2068b = eVar.f2068b;
            this.f2069c = eVar.f2069c;
            this.f2070d = eVar.f2070d;
            this.f2071e = eVar.f2071e;
            this.f2072f = eVar.f2072f;
            this.f2073g = eVar.f2073g;
            this.f2074h = eVar.f2074h;
            this.f2075i = eVar.f2075i;
            this.f2076j = eVar.f2076j;
            this.f2077k = eVar.f2077k;
            this.f2078l = eVar.f2078l;
            this.f2079m = eVar.f2079m;
        }

        /* renamed from: b */
        void m1690b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0298f.f2134F7);
            this.f2067a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                switch (f2066n.get(index)) {
                    case 1:
                        this.f2068b = typedArrayObtainStyledAttributes.getFloat(index, this.f2068b);
                        break;
                    case 2:
                        this.f2069c = typedArrayObtainStyledAttributes.getFloat(index, this.f2069c);
                        break;
                    case 3:
                        this.f2070d = typedArrayObtainStyledAttributes.getFloat(index, this.f2070d);
                        break;
                    case 4:
                        this.f2071e = typedArrayObtainStyledAttributes.getFloat(index, this.f2071e);
                        break;
                    case 5:
                        this.f2072f = typedArrayObtainStyledAttributes.getFloat(index, this.f2072f);
                        break;
                    case 6:
                        this.f2073g = typedArrayObtainStyledAttributes.getDimension(index, this.f2073g);
                        break;
                    case 7:
                        this.f2074h = typedArrayObtainStyledAttributes.getDimension(index, this.f2074h);
                        break;
                    case 8:
                        this.f2075i = typedArrayObtainStyledAttributes.getDimension(index, this.f2075i);
                        break;
                    case 9:
                        this.f2076j = typedArrayObtainStyledAttributes.getDimension(index, this.f2076j);
                        break;
                    case 10:
                        this.f2077k = typedArrayObtainStyledAttributes.getDimension(index, this.f2077k);
                        break;
                    case 11:
                        this.f2078l = true;
                        this.f2079m = typedArrayObtainStyledAttributes.getDimension(index, this.f2079m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1979f = sparseIntArray;
        sparseIntArray.append(C0298f.f2508u0, 25);
        f1979f.append(C0298f.f2517v0, 26);
        f1979f.append(C0298f.f2535x0, 29);
        f1979f.append(C0298f.f2544y0, 30);
        f1979f.append(C0298f.f2118E0, 36);
        f1979f.append(C0298f.f2109D0, 35);
        f1979f.append(C0298f.f2336c0, 4);
        f1979f.append(C0298f.f2326b0, 3);
        f1979f.append(C0298f.f2306Z, 1);
        f1979f.append(C0298f.f2190M0, 6);
        f1979f.append(C0298f.f2199N0, 7);
        f1979f.append(C0298f.f2406j0, 17);
        f1979f.append(C0298f.f2416k0, 18);
        f1979f.append(C0298f.f2426l0, 19);
        f1979f.append(C0298f.f2489s, 27);
        f1979f.append(C0298f.f2553z0, 32);
        f1979f.append(C0298f.f2082A0, 33);
        f1979f.append(C0298f.f2396i0, 10);
        f1979f.append(C0298f.f2386h0, 9);
        f1979f.append(C0298f.f2226Q0, 13);
        f1979f.append(C0298f.f2253T0, 16);
        f1979f.append(C0298f.f2235R0, 14);
        f1979f.append(C0298f.f2208O0, 11);
        f1979f.append(C0298f.f2244S0, 15);
        f1979f.append(C0298f.f2217P0, 12);
        f1979f.append(C0298f.f2145H0, 40);
        f1979f.append(C0298f.f2490s0, 39);
        f1979f.append(C0298f.f2481r0, 41);
        f1979f.append(C0298f.f2136G0, 42);
        f1979f.append(C0298f.f2472q0, 20);
        f1979f.append(C0298f.f2127F0, 37);
        f1979f.append(C0298f.f2376g0, 5);
        f1979f.append(C0298f.f2499t0, 82);
        f1979f.append(C0298f.f2100C0, 82);
        f1979f.append(C0298f.f2526w0, 82);
        f1979f.append(C0298f.f2316a0, 82);
        f1979f.append(C0298f.f2297Y, 82);
        f1979f.append(C0298f.f2534x, 24);
        f1979f.append(C0298f.f2552z, 28);
        f1979f.append(C0298f.f2180L, 31);
        f1979f.append(C0298f.f2189M, 8);
        f1979f.append(C0298f.f2543y, 34);
        f1979f.append(C0298f.f2081A, 2);
        f1979f.append(C0298f.f2516v, 23);
        f1979f.append(C0298f.f2525w, 21);
        f1979f.append(C0298f.f2507u, 22);
        f1979f.append(C0298f.f2090B, 43);
        f1979f.append(C0298f.f2207O, 44);
        f1979f.append(C0298f.f2162J, 45);
        f1979f.append(C0298f.f2171K, 46);
        f1979f.append(C0298f.f2153I, 60);
        f1979f.append(C0298f.f2135G, 47);
        f1979f.append(C0298f.f2144H, 48);
        f1979f.append(C0298f.f2099C, 49);
        f1979f.append(C0298f.f2108D, 50);
        f1979f.append(C0298f.f2117E, 51);
        f1979f.append(C0298f.f2126F, 52);
        f1979f.append(C0298f.f2198N, 53);
        f1979f.append(C0298f.f2154I0, 54);
        f1979f.append(C0298f.f2436m0, 55);
        f1979f.append(C0298f.f2163J0, 56);
        f1979f.append(C0298f.f2445n0, 57);
        f1979f.append(C0298f.f2172K0, 58);
        f1979f.append(C0298f.f2454o0, 59);
        f1979f.append(C0298f.f2346d0, 61);
        f1979f.append(C0298f.f2366f0, 62);
        f1979f.append(C0298f.f2356e0, 63);
        f1979f.append(C0298f.f2216P, 64);
        f1979f.append(C0298f.f2289X0, 65);
        f1979f.append(C0298f.f2270V, 66);
        f1979f.append(C0298f.f2298Y0, 67);
        f1979f.append(C0298f.f2271V0, 79);
        f1979f.append(C0298f.f2498t, 38);
        f1979f.append(C0298f.f2262U0, 68);
        f1979f.append(C0298f.f2181L0, 69);
        f1979f.append(C0298f.f2463p0, 70);
        f1979f.append(C0298f.f2252T, 71);
        f1979f.append(C0298f.f2234R, 72);
        f1979f.append(C0298f.f2243S, 73);
        f1979f.append(C0298f.f2261U, 74);
        f1979f.append(C0298f.f2225Q, 75);
        f1979f.append(C0298f.f2280W0, 76);
        f1979f.append(C0298f.f2091B0, 77);
        f1979f.append(C0298f.f2307Z0, 78);
        f1979f.append(C0298f.f2288X, 80);
        f1979f.append(C0298f.f2279W, 81);
    }

    /* renamed from: k */
    private int[] m1649k(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objM1610e;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < strArrSplit.length) {
            String strTrim = strArrSplit[i4].trim();
            try {
                iIntValue = C0297e.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objM1610e = ((ConstraintLayout) view.getParent()).m1610e(0, strTrim)) != null && (objM1610e instanceof Integer)) {
                iIntValue = ((Integer) objM1610e).intValue();
            }
            iArr[i5] = iIntValue;
            i4++;
            i5++;
        }
        return i5 != strArrSplit.length ? Arrays.copyOf(iArr, i5) : iArr;
    }

    /* renamed from: l */
    private a m1650l(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0298f.f2480r);
        m1653x(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: m */
    private a m1651m(int i4) {
        if (!this.f1983d.containsKey(Integer.valueOf(i4))) {
            this.f1983d.put(Integer.valueOf(i4), new a());
        }
        return this.f1983d.get(Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static int m1652w(TypedArray typedArray, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i4, i5);
        return resourceId == -1 ? typedArray.getInt(i4, -1) : resourceId;
    }

    /* renamed from: x */
    private void m1653x(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            if (index != C0298f.f2498t && C0298f.f2180L != index && C0298f.f2189M != index) {
                aVar.f1986c.f2054a = true;
                aVar.f1987d.f2019b = true;
                aVar.f1985b.f2061a = true;
                aVar.f1988e.f2067a = true;
            }
            switch (f1979f.get(index)) {
                case 1:
                    b bVar = aVar.f1987d;
                    bVar.f2042p = m1652w(typedArray, index, bVar.f2042p);
                    break;
                case 2:
                    b bVar2 = aVar.f1987d;
                    bVar2.f1997G = typedArray.getDimensionPixelSize(index, bVar2.f1997G);
                    break;
                case 3:
                    b bVar3 = aVar.f1987d;
                    bVar3.f2041o = m1652w(typedArray, index, bVar3.f2041o);
                    break;
                case 4:
                    b bVar4 = aVar.f1987d;
                    bVar4.f2040n = m1652w(typedArray, index, bVar4.f2040n);
                    break;
                case 5:
                    aVar.f1987d.f2049w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f1987d;
                    bVar5.f1991A = typedArray.getDimensionPixelOffset(index, bVar5.f1991A);
                    break;
                case 7:
                    b bVar6 = aVar.f1987d;
                    bVar6.f1992B = typedArray.getDimensionPixelOffset(index, bVar6.f1992B);
                    break;
                case 8:
                    b bVar7 = aVar.f1987d;
                    bVar7.f1998H = typedArray.getDimensionPixelSize(index, bVar7.f1998H);
                    break;
                case 9:
                    b bVar8 = aVar.f1987d;
                    bVar8.f2046t = m1652w(typedArray, index, bVar8.f2046t);
                    break;
                case 10:
                    b bVar9 = aVar.f1987d;
                    bVar9.f2045s = m1652w(typedArray, index, bVar9.f2045s);
                    break;
                case 11:
                    b bVar10 = aVar.f1987d;
                    bVar10.f2003M = typedArray.getDimensionPixelSize(index, bVar10.f2003M);
                    break;
                case 12:
                    b bVar11 = aVar.f1987d;
                    bVar11.f2004N = typedArray.getDimensionPixelSize(index, bVar11.f2004N);
                    break;
                case 13:
                    b bVar12 = aVar.f1987d;
                    bVar12.f2000J = typedArray.getDimensionPixelSize(index, bVar12.f2000J);
                    break;
                case 14:
                    b bVar13 = aVar.f1987d;
                    bVar13.f2002L = typedArray.getDimensionPixelSize(index, bVar13.f2002L);
                    break;
                case 15:
                    b bVar14 = aVar.f1987d;
                    bVar14.f2005O = typedArray.getDimensionPixelSize(index, bVar14.f2005O);
                    break;
                case 16:
                    b bVar15 = aVar.f1987d;
                    bVar15.f2001K = typedArray.getDimensionPixelSize(index, bVar15.f2001K);
                    break;
                case 17:
                    b bVar16 = aVar.f1987d;
                    bVar16.f2025e = typedArray.getDimensionPixelOffset(index, bVar16.f2025e);
                    break;
                case 18:
                    b bVar17 = aVar.f1987d;
                    bVar17.f2027f = typedArray.getDimensionPixelOffset(index, bVar17.f2027f);
                    break;
                case 19:
                    b bVar18 = aVar.f1987d;
                    bVar18.f2029g = typedArray.getFloat(index, bVar18.f2029g);
                    break;
                case 20:
                    b bVar19 = aVar.f1987d;
                    bVar19.f2047u = typedArray.getFloat(index, bVar19.f2047u);
                    break;
                case 21:
                    b bVar20 = aVar.f1987d;
                    bVar20.f2023d = typedArray.getLayoutDimension(index, bVar20.f2023d);
                    break;
                case 22:
                    d dVar = aVar.f1985b;
                    dVar.f2062b = typedArray.getInt(index, dVar.f2062b);
                    d dVar2 = aVar.f1985b;
                    dVar2.f2062b = f1978e[dVar2.f2062b];
                    break;
                case 23:
                    b bVar21 = aVar.f1987d;
                    bVar21.f2021c = typedArray.getLayoutDimension(index, bVar21.f2021c);
                    break;
                case 24:
                    b bVar22 = aVar.f1987d;
                    bVar22.f1994D = typedArray.getDimensionPixelSize(index, bVar22.f1994D);
                    break;
                case 25:
                    b bVar23 = aVar.f1987d;
                    bVar23.f2031h = m1652w(typedArray, index, bVar23.f2031h);
                    break;
                case 26:
                    b bVar24 = aVar.f1987d;
                    bVar24.f2033i = m1652w(typedArray, index, bVar24.f2033i);
                    break;
                case 27:
                    b bVar25 = aVar.f1987d;
                    bVar25.f1993C = typedArray.getInt(index, bVar25.f1993C);
                    break;
                case 28:
                    b bVar26 = aVar.f1987d;
                    bVar26.f1995E = typedArray.getDimensionPixelSize(index, bVar26.f1995E);
                    break;
                case 29:
                    b bVar27 = aVar.f1987d;
                    bVar27.f2035j = m1652w(typedArray, index, bVar27.f2035j);
                    break;
                case 30:
                    b bVar28 = aVar.f1987d;
                    bVar28.f2037k = m1652w(typedArray, index, bVar28.f2037k);
                    break;
                case 31:
                    b bVar29 = aVar.f1987d;
                    bVar29.f1999I = typedArray.getDimensionPixelSize(index, bVar29.f1999I);
                    break;
                case 32:
                    b bVar30 = aVar.f1987d;
                    bVar30.f2043q = m1652w(typedArray, index, bVar30.f2043q);
                    break;
                case 33:
                    b bVar31 = aVar.f1987d;
                    bVar31.f2044r = m1652w(typedArray, index, bVar31.f2044r);
                    break;
                case 34:
                    b bVar32 = aVar.f1987d;
                    bVar32.f1996F = typedArray.getDimensionPixelSize(index, bVar32.f1996F);
                    break;
                case 35:
                    b bVar33 = aVar.f1987d;
                    bVar33.f2039m = m1652w(typedArray, index, bVar33.f2039m);
                    break;
                case 36:
                    b bVar34 = aVar.f1987d;
                    bVar34.f2038l = m1652w(typedArray, index, bVar34.f2038l);
                    break;
                case 37:
                    b bVar35 = aVar.f1987d;
                    bVar35.f2048v = typedArray.getFloat(index, bVar35.f2048v);
                    break;
                case 38:
                    aVar.f1984a = typedArray.getResourceId(index, aVar.f1984a);
                    break;
                case 39:
                    b bVar36 = aVar.f1987d;
                    bVar36.f2007Q = typedArray.getFloat(index, bVar36.f2007Q);
                    break;
                case 40:
                    b bVar37 = aVar.f1987d;
                    bVar37.f2006P = typedArray.getFloat(index, bVar37.f2006P);
                    break;
                case 41:
                    b bVar38 = aVar.f1987d;
                    bVar38.f2008R = typedArray.getInt(index, bVar38.f2008R);
                    break;
                case 42:
                    b bVar39 = aVar.f1987d;
                    bVar39.f2009S = typedArray.getInt(index, bVar39.f2009S);
                    break;
                case 43:
                    d dVar3 = aVar.f1985b;
                    dVar3.f2064d = typedArray.getFloat(index, dVar3.f2064d);
                    break;
                case 44:
                    e eVar = aVar.f1988e;
                    eVar.f2078l = true;
                    eVar.f2079m = typedArray.getDimension(index, eVar.f2079m);
                    break;
                case 45:
                    e eVar2 = aVar.f1988e;
                    eVar2.f2069c = typedArray.getFloat(index, eVar2.f2069c);
                    break;
                case 46:
                    e eVar3 = aVar.f1988e;
                    eVar3.f2070d = typedArray.getFloat(index, eVar3.f2070d);
                    break;
                case 47:
                    e eVar4 = aVar.f1988e;
                    eVar4.f2071e = typedArray.getFloat(index, eVar4.f2071e);
                    break;
                case 48:
                    e eVar5 = aVar.f1988e;
                    eVar5.f2072f = typedArray.getFloat(index, eVar5.f2072f);
                    break;
                case 49:
                    e eVar6 = aVar.f1988e;
                    eVar6.f2073g = typedArray.getDimension(index, eVar6.f2073g);
                    break;
                case 50:
                    e eVar7 = aVar.f1988e;
                    eVar7.f2074h = typedArray.getDimension(index, eVar7.f2074h);
                    break;
                case 51:
                    e eVar8 = aVar.f1988e;
                    eVar8.f2075i = typedArray.getDimension(index, eVar8.f2075i);
                    break;
                case 52:
                    e eVar9 = aVar.f1988e;
                    eVar9.f2076j = typedArray.getDimension(index, eVar9.f2076j);
                    break;
                case 53:
                    e eVar10 = aVar.f1988e;
                    eVar10.f2077k = typedArray.getDimension(index, eVar10.f2077k);
                    break;
                case 54:
                    b bVar40 = aVar.f1987d;
                    bVar40.f2010T = typedArray.getInt(index, bVar40.f2010T);
                    break;
                case 55:
                    b bVar41 = aVar.f1987d;
                    bVar41.f2011U = typedArray.getInt(index, bVar41.f2011U);
                    break;
                case 56:
                    b bVar42 = aVar.f1987d;
                    bVar42.f2012V = typedArray.getDimensionPixelSize(index, bVar42.f2012V);
                    break;
                case 57:
                    b bVar43 = aVar.f1987d;
                    bVar43.f2013W = typedArray.getDimensionPixelSize(index, bVar43.f2013W);
                    break;
                case 58:
                    b bVar44 = aVar.f1987d;
                    bVar44.f2014X = typedArray.getDimensionPixelSize(index, bVar44.f2014X);
                    break;
                case 59:
                    b bVar45 = aVar.f1987d;
                    bVar45.f2015Y = typedArray.getDimensionPixelSize(index, bVar45.f2015Y);
                    break;
                case 60:
                    e eVar11 = aVar.f1988e;
                    eVar11.f2068b = typedArray.getFloat(index, eVar11.f2068b);
                    break;
                case 61:
                    b bVar46 = aVar.f1987d;
                    bVar46.f2050x = m1652w(typedArray, index, bVar46.f2050x);
                    break;
                case 62:
                    b bVar47 = aVar.f1987d;
                    bVar47.f2051y = typedArray.getDimensionPixelSize(index, bVar47.f2051y);
                    break;
                case 63:
                    b bVar48 = aVar.f1987d;
                    bVar48.f2052z = typedArray.getFloat(index, bVar48.f2052z);
                    break;
                case 64:
                    c cVar = aVar.f1986c;
                    cVar.f2055b = m1652w(typedArray, index, cVar.f2055b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f1986c.f2056c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f1986c.f2056c = C2827c.f10878c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f1986c.f2058e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f1986c;
                    cVar2.f2060g = typedArray.getFloat(index, cVar2.f2060g);
                    break;
                case 68:
                    d dVar4 = aVar.f1985b;
                    dVar4.f2065e = typedArray.getFloat(index, dVar4.f2065e);
                    break;
                case 69:
                    aVar.f1987d.f2016Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f1987d.f2018a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f1987d;
                    bVar49.f2020b0 = typedArray.getInt(index, bVar49.f2020b0);
                    break;
                case 73:
                    b bVar50 = aVar.f1987d;
                    bVar50.f2022c0 = typedArray.getDimensionPixelSize(index, bVar50.f2022c0);
                    break;
                case 74:
                    aVar.f1987d.f2028f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f1987d;
                    bVar51.f2036j0 = typedArray.getBoolean(index, bVar51.f2036j0);
                    break;
                case 76:
                    c cVar3 = aVar.f1986c;
                    cVar3.f2057d = typedArray.getInt(index, cVar3.f2057d);
                    break;
                case 77:
                    aVar.f1987d.f2030g0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f1985b;
                    dVar5.f2063c = typedArray.getInt(index, dVar5.f2063c);
                    break;
                case 79:
                    c cVar4 = aVar.f1986c;
                    cVar4.f2059f = typedArray.getFloat(index, cVar4.f2059f);
                    break;
                case 80:
                    b bVar52 = aVar.f1987d;
                    bVar52.f2032h0 = typedArray.getBoolean(index, bVar52.f2032h0);
                    break;
                case 81:
                    b bVar53 = aVar.f1987d;
                    bVar53.f2034i0 = typedArray.getBoolean(index, bVar53.f2034i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1979f.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1979f.get(index));
                    break;
            }
        }
    }

    /* renamed from: A */
    public void m1654A(boolean z3) {
        this.f1982c = z3;
    }

    /* renamed from: B */
    public void m1655B(boolean z3) {
        this.f1980a = z3;
    }

    /* renamed from: c */
    public void m1656c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!this.f1983d.containsKey(Integer.valueOf(id))) {
                Log.v("ConstraintSet", "id unknown " + C0265a.m1257c(childAt));
            } else {
                if (this.f1982c && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f1983d.containsKey(Integer.valueOf(id))) {
                    C0293a.m1633h(childAt, this.f1983d.get(Integer.valueOf(id)).f1989f);
                }
            }
        }
    }

    /* renamed from: d */
    public void m1657d(ConstraintLayout constraintLayout) {
        m1659f(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: e */
    public void m1658e(ConstraintHelper constraintHelper, C2869e c2869e, ConstraintLayout.LayoutParams layoutParams, SparseArray<C2869e> sparseArray) {
        int id = constraintHelper.getId();
        if (this.f1983d.containsKey(Integer.valueOf(id))) {
            a aVar = this.f1983d.get(Integer.valueOf(id));
            if (c2869e instanceof C2874j) {
                constraintHelper.mo1152n(aVar, (C2874j) c2869e, layoutParams, sparseArray);
            }
        }
    }

    /* renamed from: f */
    void m1659f(ConstraintLayout constraintLayout, boolean z3) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1983d.keySet());
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!this.f1983d.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C0265a.m1257c(childAt));
            } else {
                if (this.f1982c && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f1983d.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f1983d.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f1987d.f2024d0 = 1;
                        }
                        int i5 = aVar.f1987d.f2024d0;
                        if (i5 != -1 && i5 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f1987d.f2020b0);
                            barrier.setMargin(aVar.f1987d.f2022c0);
                            barrier.setAllowsGoneWidget(aVar.f1987d.f2036j0);
                            b bVar = aVar.f1987d;
                            int[] iArr = bVar.f2026e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f2028f0;
                                if (str != null) {
                                    bVar.f2026e0 = m1649k(barrier, str);
                                    barrier.setReferencedIds(aVar.f1987d.f2026e0);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.m1620c();
                        aVar.m1681d(layoutParams);
                        if (z3) {
                            C0293a.m1633h(childAt, aVar.f1989f);
                        }
                        childAt.setLayoutParams(layoutParams);
                        d dVar = aVar.f1985b;
                        if (dVar.f2063c == 0) {
                            childAt.setVisibility(dVar.f2062b);
                        }
                        childAt.setAlpha(aVar.f1985b.f2064d);
                        childAt.setRotation(aVar.f1988e.f2068b);
                        childAt.setRotationX(aVar.f1988e.f2069c);
                        childAt.setRotationY(aVar.f1988e.f2070d);
                        childAt.setScaleX(aVar.f1988e.f2071e);
                        childAt.setScaleY(aVar.f1988e.f2072f);
                        if (!Float.isNaN(aVar.f1988e.f2073g)) {
                            childAt.setPivotX(aVar.f1988e.f2073g);
                        }
                        if (!Float.isNaN(aVar.f1988e.f2074h)) {
                            childAt.setPivotY(aVar.f1988e.f2074h);
                        }
                        childAt.setTranslationX(aVar.f1988e.f2075i);
                        childAt.setTranslationY(aVar.f1988e.f2076j);
                        childAt.setTranslationZ(aVar.f1988e.f2077k);
                        e eVar = aVar.f1988e;
                        if (eVar.f2078l) {
                            childAt.setElevation(eVar.f2079m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f1983d.get(num);
            int i6 = aVar2.f1987d.f2024d0;
            if (i6 != -1 && i6 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar2 = aVar2.f1987d;
                int[] iArr2 = bVar2.f2026e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f2028f0;
                    if (str2 != null) {
                        bVar2.f2026e0 = m1649k(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f1987d.f2026e0);
                    }
                }
                barrier2.setType(aVar2.f1987d.f2020b0);
                barrier2.setMargin(aVar2.f1987d.f2022c0);
                ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m1600u();
                aVar2.m1681d(layoutParamsGenerateDefaultLayoutParams);
                constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
            }
            if (aVar2.f1987d.f2017a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.m1681d(layoutParamsGenerateDefaultLayoutParams2);
                constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: g */
    public void m1660g(int i4, ConstraintLayout.LayoutParams layoutParams) {
        if (this.f1983d.containsKey(Integer.valueOf(i4))) {
            this.f1983d.get(Integer.valueOf(i4)).m1681d(layoutParams);
        }
    }

    /* renamed from: h */
    public void m1661h(Context context, int i4) {
        m1662i((ConstraintLayout) LayoutInflater.from(context).inflate(i4, (ViewGroup) null));
    }

    /* renamed from: i */
    public void m1662i(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1983d.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1982c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1983d.containsKey(Integer.valueOf(id))) {
                this.f1983d.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f1983d.get(Integer.valueOf(id));
            aVar.f1989f = C0293a.m1631b(this.f1981b, childAt);
            aVar.m1678f(id, layoutParams);
            aVar.f1985b.f2062b = childAt.getVisibility();
            aVar.f1985b.f2064d = childAt.getAlpha();
            aVar.f1988e.f2068b = childAt.getRotation();
            aVar.f1988e.f2069c = childAt.getRotationX();
            aVar.f1988e.f2070d = childAt.getRotationY();
            aVar.f1988e.f2071e = childAt.getScaleX();
            aVar.f1988e.f2072f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f1988e;
                eVar.f2073g = pivotX;
                eVar.f2074h = pivotY;
            }
            aVar.f1988e.f2075i = childAt.getTranslationX();
            aVar.f1988e.f2076j = childAt.getTranslationY();
            aVar.f1988e.f2077k = childAt.getTranslationZ();
            e eVar2 = aVar.f1988e;
            if (eVar2.f2078l) {
                eVar2.f2079m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f1987d.f2036j0 = barrier.m1588v();
                aVar.f1987d.f2026e0 = barrier.getReferencedIds();
                aVar.f1987d.f2020b0 = barrier.getType();
                aVar.f1987d.f2022c0 = barrier.getMargin();
            }
        }
    }

    /* renamed from: j */
    public void m1663j(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f1983d.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraints.getChildAt(i4);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1982c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1983d.containsKey(Integer.valueOf(id))) {
                this.f1983d.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f1983d.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                aVar.m1680h((ConstraintHelper) childAt, id, layoutParams);
            }
            aVar.m1679g(id, layoutParams);
        }
    }

    /* renamed from: n */
    public a m1664n(int i4) {
        if (this.f1983d.containsKey(Integer.valueOf(i4))) {
            return this.f1983d.get(Integer.valueOf(i4));
        }
        return null;
    }

    /* renamed from: o */
    public int m1665o(int i4) {
        return m1651m(i4).f1987d.f2023d;
    }

    /* renamed from: p */
    public int[] m1666p() {
        Integer[] numArr = (Integer[]) this.f1983d.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
        return iArr;
    }

    /* renamed from: q */
    public a m1667q(int i4) {
        return m1651m(i4);
    }

    /* renamed from: r */
    public int m1668r(int i4) {
        return m1651m(i4).f1985b.f2062b;
    }

    /* renamed from: s */
    public int m1669s(int i4) {
        return m1651m(i4).f1985b.f2063c;
    }

    /* renamed from: t */
    public int m1670t(int i4) {
        return m1651m(i4).f1987d.f2021c;
    }

    /* renamed from: u */
    public void m1671u(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarM1650l = m1650l(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarM1650l.f1987d.f2017a = true;
                    }
                    this.f1983d.put(Integer.valueOf(aVarM1650l.f1984a), aVarM1650l);
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0179, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1672v(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0295c.m1672v(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: y */
    public void m1673y(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1982c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1983d.containsKey(Integer.valueOf(id))) {
                this.f1983d.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f1983d.get(Integer.valueOf(id));
            if (!aVar.f1987d.f2019b) {
                aVar.m1678f(id, layoutParams);
                if (childAt instanceof ConstraintHelper) {
                    aVar.f1987d.f2026e0 = ((ConstraintHelper) childAt).getReferencedIds();
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f1987d.f2036j0 = barrier.m1588v();
                        aVar.f1987d.f2020b0 = barrier.getType();
                        aVar.f1987d.f2022c0 = barrier.getMargin();
                    }
                }
                aVar.f1987d.f2019b = true;
            }
            d dVar = aVar.f1985b;
            if (!dVar.f2061a) {
                dVar.f2062b = childAt.getVisibility();
                aVar.f1985b.f2064d = childAt.getAlpha();
                aVar.f1985b.f2061a = true;
            }
            e eVar = aVar.f1988e;
            if (!eVar.f2067a) {
                eVar.f2067a = true;
                eVar.f2068b = childAt.getRotation();
                aVar.f1988e.f2069c = childAt.getRotationX();
                aVar.f1988e.f2070d = childAt.getRotationY();
                aVar.f1988e.f2071e = childAt.getScaleX();
                aVar.f1988e.f2072f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar2 = aVar.f1988e;
                    eVar2.f2073g = pivotX;
                    eVar2.f2074h = pivotY;
                }
                aVar.f1988e.f2075i = childAt.getTranslationX();
                aVar.f1988e.f2076j = childAt.getTranslationY();
                aVar.f1988e.f2077k = childAt.getTranslationZ();
                e eVar3 = aVar.f1988e;
                if (eVar3.f2078l) {
                    eVar3.f2079m = childAt.getElevation();
                }
            }
        }
    }

    /* renamed from: z */
    public void m1674z(C0295c c0295c) {
        for (Integer num : c0295c.f1983d.keySet()) {
            int iIntValue = num.intValue();
            a aVar = c0295c.f1983d.get(num);
            if (!this.f1983d.containsKey(Integer.valueOf(iIntValue))) {
                this.f1983d.put(Integer.valueOf(iIntValue), new a());
            }
            a aVar2 = this.f1983d.get(Integer.valueOf(iIntValue));
            b bVar = aVar2.f1987d;
            if (!bVar.f2019b) {
                bVar.m1683a(aVar.f1987d);
            }
            d dVar = aVar2.f1985b;
            if (!dVar.f2061a) {
                dVar.m1687a(aVar.f1985b);
            }
            e eVar = aVar2.f1988e;
            if (!eVar.f2067a) {
                eVar.m1689a(aVar.f1988e);
            }
            c cVar = aVar2.f1986c;
            if (!cVar.f2054a) {
                cVar.m1685a(aVar.f1986c);
            }
            for (String str : aVar.f1989f.keySet()) {
                if (!aVar2.f1989f.containsKey(str)) {
                    aVar2.f1989f.put(str, aVar.f1989f.get(str));
                }
            }
        }
    }
}
