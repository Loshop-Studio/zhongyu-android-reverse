package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p060o.p061b.AbstractC0397t;
import p000a.p060o.p061b.C0391n;
import p000a.p060o.p061b.C0392o;
import p000a.p060o.p061b.RunnableC0390m;
import p070b.p071a.p072a.p073a.C0561a;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0538l implements RecyclerView.AbstractC0548v.b {

    /* renamed from: A */
    public BitSet f3446A;

    /* renamed from: F */
    public boolean f3451F;

    /* renamed from: G */
    public boolean f3452G;

    /* renamed from: H */
    public C0557e f3453H;

    /* renamed from: I */
    public int f3454I;

    /* renamed from: M */
    public int[] f3458M;

    /* renamed from: r */
    public int f3460r;

    /* renamed from: s */
    public C0558f[] f3461s;

    /* renamed from: t */
    public AbstractC0397t f3462t;

    /* renamed from: u */
    public AbstractC0397t f3463u;

    /* renamed from: v */
    public int f3464v;

    /* renamed from: w */
    public int f3465w;

    /* renamed from: x */
    public final C0391n f3466x;

    /* renamed from: y */
    public boolean f3467y;

    /* renamed from: z */
    public boolean f3468z = false;

    /* renamed from: B */
    public int f3447B = -1;

    /* renamed from: C */
    public int f3448C = Integer.MIN_VALUE;

    /* renamed from: D */
    public C0556d f3449D = new C0556d();

    /* renamed from: E */
    public int f3450E = 2;

    /* renamed from: J */
    public final Rect f3455J = new Rect();

    /* renamed from: K */
    public final C0554b f3456K = new C0554b();

    /* renamed from: L */
    public boolean f3457L = true;

    /* renamed from: N */
    public final Runnable f3459N = new RunnableC0553a();

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC0553a implements Runnable {
        public RunnableC0553a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m2026b1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0554b {

        /* renamed from: a */
        public int f3470a;

        /* renamed from: b */
        public int f3471b;

        /* renamed from: c */
        public boolean f3472c;

        /* renamed from: d */
        public boolean f3473d;

        /* renamed from: e */
        public boolean f3474e;

        /* renamed from: f */
        public int[] f3475f;

        public C0554b() {
            m2052b();
        }

        /* renamed from: a */
        public void m2051a() {
            this.f3471b = this.f3472c ? StaggeredGridLayoutManager.this.f3462t.mo1396g() : StaggeredGridLayoutManager.this.f3462t.mo1400k();
        }

        /* renamed from: b */
        public void m2052b() {
            this.f3470a = -1;
            this.f3471b = Integer.MIN_VALUE;
            this.f3472c = false;
            this.f3473d = false;
            this.f3474e = false;
            int[] iArr = this.f3475f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0555c extends RecyclerView.C0539m {

        /* renamed from: e */
        public C0558f f3477e;

        public C0555c(int i, int i2) {
            super(i, i2);
        }

        public C0555c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0555c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0555c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0556d {

        /* renamed from: a */
        public int[] f3478a;

        /* renamed from: b */
        public List<a> f3479b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C1091a();

            /* renamed from: b */
            public int f3480b;

            /* renamed from: c */
            public int f3481c;

            /* renamed from: d */
            public int[] f3482d;

            /* renamed from: e */
            public boolean f3483e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public static class C1091a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f3480b = parcel.readInt();
                this.f3481c = parcel.readInt();
                this.f3483e = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.f3482d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sbM2079g = C0561a.m2079g("FullSpanItem{mPosition=");
                sbM2079g.append(this.f3480b);
                sbM2079g.append(", mGapDir=");
                sbM2079g.append(this.f3481c);
                sbM2079g.append(", mHasUnwantedGapAfter=");
                sbM2079g.append(this.f3483e);
                sbM2079g.append(", mGapPerSpan=");
                sbM2079g.append(Arrays.toString(this.f3482d));
                sbM2079g.append('}');
                return sbM2079g.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3480b);
                parcel.writeInt(this.f3481c);
                parcel.writeInt(this.f3483e ? 1 : 0);
                int[] iArr = this.f3482d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f3482d);
                }
            }
        }

        /* renamed from: a */
        public void m2053a() {
            int[] iArr = this.f3478a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3479b = null;
        }

        /* renamed from: b */
        public void m2054b(int i) {
            int[] iArr = this.f3478a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f3478a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f3478a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3478a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: c */
        public a m2055c(int i) {
            List<a> list = this.f3479b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f3479b.get(size);
                if (aVar.f3480b == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int m2056d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f3478a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r5 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3479b
                if (r0 != 0) goto L10
            Le:
                r0 = r1
                goto L46
            L10:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.m2055c(r5)
                if (r0 == 0) goto L1b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f3479b
                r2.remove(r0)
            L1b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3479b
                int r0 = r0.size()
                r2 = 0
            L22:
                if (r2 >= r0) goto L34
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f3479b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0556d.a) r3
                int r3 = r3.f3480b
                if (r3 < r5) goto L31
                goto L35
            L31:
                int r2 = r2 + 1
                goto L22
            L34:
                r2 = r1
            L35:
                if (r2 == r1) goto Le
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3479b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0556d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f3479b
                r3.remove(r2)
                int r0 = r0.f3480b
            L46:
                if (r0 != r1) goto L52
                int[] r0 = r4.f3478a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f3478a
                int r5 = r5.length
                return r5
            L52:
                int[] r2 = r4.f3478a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.C0556d.m2056d(int):int");
        }

        /* renamed from: e */
        public void m2057e(int i, int i2) {
            int[] iArr = this.f3478a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m2054b(i3);
            int[] iArr2 = this.f3478a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f3478a, i, i3, -1);
            List<a> list = this.f3479b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f3479b.get(size);
                int i4 = aVar.f3480b;
                if (i4 >= i) {
                    aVar.f3480b = i4 + i2;
                }
            }
        }

        /* renamed from: f */
        public void m2058f(int i, int i2) {
            int[] iArr = this.f3478a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m2054b(i3);
            int[] iArr2 = this.f3478a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f3478a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<a> list = this.f3479b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f3479b.get(size);
                int i4 = aVar.f3480b;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f3479b.remove(size);
                    } else {
                        aVar.f3480b = i4 - i2;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0557e implements Parcelable {
        public static final Parcelable.Creator<C0557e> CREATOR = new a();

        /* renamed from: b */
        public int f3484b;

        /* renamed from: c */
        public int f3485c;

        /* renamed from: d */
        public int f3486d;

        /* renamed from: e */
        public int[] f3487e;

        /* renamed from: f */
        public int f3488f;

        /* renamed from: g */
        public int[] f3489g;

        /* renamed from: h */
        public List<C0556d.a> f3490h;

        /* renamed from: i */
        public boolean f3491i;

        /* renamed from: j */
        public boolean f3492j;

        /* renamed from: k */
        public boolean f3493k;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public static class a implements Parcelable.Creator<C0557e> {
            @Override // android.os.Parcelable.Creator
            public C0557e createFromParcel(Parcel parcel) {
                return new C0557e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0557e[] newArray(int i) {
                return new C0557e[i];
            }
        }

        public C0557e() {
        }

        public C0557e(Parcel parcel) {
            this.f3484b = parcel.readInt();
            this.f3485c = parcel.readInt();
            int i = parcel.readInt();
            this.f3486d = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.f3487e = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.f3488f = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f3489g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3491i = parcel.readInt() == 1;
            this.f3492j = parcel.readInt() == 1;
            this.f3493k = parcel.readInt() == 1;
            this.f3490h = parcel.readArrayList(C0556d.a.class.getClassLoader());
        }

        public C0557e(C0557e c0557e) {
            this.f3486d = c0557e.f3486d;
            this.f3484b = c0557e.f3484b;
            this.f3485c = c0557e.f3485c;
            this.f3487e = c0557e.f3487e;
            this.f3488f = c0557e.f3488f;
            this.f3489g = c0557e.f3489g;
            this.f3491i = c0557e.f3491i;
            this.f3492j = c0557e.f3492j;
            this.f3493k = c0557e.f3493k;
            this.f3490h = c0557e.f3490h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3484b);
            parcel.writeInt(this.f3485c);
            parcel.writeInt(this.f3486d);
            if (this.f3486d > 0) {
                parcel.writeIntArray(this.f3487e);
            }
            parcel.writeInt(this.f3488f);
            if (this.f3488f > 0) {
                parcel.writeIntArray(this.f3489g);
            }
            parcel.writeInt(this.f3491i ? 1 : 0);
            parcel.writeInt(this.f3492j ? 1 : 0);
            parcel.writeInt(this.f3493k ? 1 : 0);
            parcel.writeList(this.f3490h);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C0558f {

        /* renamed from: a */
        public ArrayList<View> f3494a = new ArrayList<>();

        /* renamed from: b */
        public int f3495b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f3496c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f3497d = 0;

        /* renamed from: e */
        public final int f3498e;

        public C0558f(int i) {
            this.f3498e = i;
        }

        /* renamed from: a */
        public void m2059a(View view) {
            C0555c c0555cM2068j = m2068j(view);
            c0555cM2068j.f3477e = this;
            this.f3494a.add(view);
            this.f3496c = Integer.MIN_VALUE;
            if (this.f3494a.size() == 1) {
                this.f3495b = Integer.MIN_VALUE;
            }
            if (c0555cM2068j.m1972c() || c0555cM2068j.m1971b()) {
                this.f3497d = StaggeredGridLayoutManager.this.f3462t.mo1392c(view) + this.f3497d;
            }
        }

        /* renamed from: b */
        public void m2060b() {
            View view = this.f3494a.get(r0.size() - 1);
            C0555c c0555cM2068j = m2068j(view);
            this.f3496c = StaggeredGridLayoutManager.this.f3462t.mo1391b(view);
            Objects.requireNonNull(c0555cM2068j);
        }

        /* renamed from: c */
        public void m2061c() {
            View view = this.f3494a.get(0);
            C0555c c0555cM2068j = m2068j(view);
            this.f3495b = StaggeredGridLayoutManager.this.f3462t.mo1394e(view);
            Objects.requireNonNull(c0555cM2068j);
        }

        /* renamed from: d */
        public void m2062d() {
            this.f3494a.clear();
            this.f3495b = Integer.MIN_VALUE;
            this.f3496c = Integer.MIN_VALUE;
            this.f3497d = 0;
        }

        /* renamed from: e */
        public int m2063e() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.f3467y) {
                size = this.f3494a.size() - 1;
                size2 = -1;
            } else {
                size = 0;
                size2 = this.f3494a.size();
            }
            return m2065g(size, size2, true);
        }

        /* renamed from: f */
        public int m2064f() {
            int size;
            int size2;
            if (StaggeredGridLayoutManager.this.f3467y) {
                size = 0;
                size2 = this.f3494a.size();
            } else {
                size = this.f3494a.size() - 1;
                size2 = -1;
            }
            return m2065g(size, size2, true);
        }

        /* renamed from: g */
        public int m2065g(int i, int i2, boolean z) {
            int iMo1400k = StaggeredGridLayoutManager.this.f3462t.mo1400k();
            int iMo1396g = StaggeredGridLayoutManager.this.f3462t.mo1396g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f3494a.get(i);
                int iMo1394e = StaggeredGridLayoutManager.this.f3462t.mo1394e(view);
                int iMo1391b = StaggeredGridLayoutManager.this.f3462t.mo1391b(view);
                boolean z2 = false;
                boolean z3 = !z ? iMo1394e >= iMo1396g : iMo1394e > iMo1396g;
                if (!z ? iMo1391b > iMo1400k : iMo1391b >= iMo1400k) {
                    z2 = true;
                }
                if (z3 && z2 && (iMo1394e < iMo1400k || iMo1391b > iMo1396g)) {
                    return StaggeredGridLayoutManager.this.m1938R(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: h */
        public int m2066h(int i) {
            int i2 = this.f3496c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3494a.size() == 0) {
                return i;
            }
            m2060b();
            return this.f3496c;
        }

        /* renamed from: i */
        public View m2067i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3494a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3494a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3467y && staggeredGridLayoutManager.m1938R(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3467y && staggeredGridLayoutManager2.m1938R(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3494a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f3494a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3467y && staggeredGridLayoutManager3.m1938R(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3467y && staggeredGridLayoutManager4.m1938R(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: j */
        public C0555c m2068j(View view) {
            return (C0555c) view.getLayoutParams();
        }

        /* renamed from: k */
        public int m2069k(int i) {
            int i2 = this.f3495b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3494a.size() == 0) {
                return i;
            }
            m2061c();
            return this.f3495b;
        }

        /* renamed from: l */
        public void m2070l() {
            int size = this.f3494a.size();
            View viewRemove = this.f3494a.remove(size - 1);
            C0555c c0555cM2068j = m2068j(viewRemove);
            c0555cM2068j.f3477e = null;
            if (c0555cM2068j.m1972c() || c0555cM2068j.m1971b()) {
                this.f3497d -= StaggeredGridLayoutManager.this.f3462t.mo1392c(viewRemove);
            }
            if (size == 1) {
                this.f3495b = Integer.MIN_VALUE;
            }
            this.f3496c = Integer.MIN_VALUE;
        }

        /* renamed from: m */
        public void m2071m() {
            View viewRemove = this.f3494a.remove(0);
            C0555c c0555cM2068j = m2068j(viewRemove);
            c0555cM2068j.f3477e = null;
            if (this.f3494a.size() == 0) {
                this.f3496c = Integer.MIN_VALUE;
            }
            if (c0555cM2068j.m1972c() || c0555cM2068j.m1971b()) {
                this.f3497d -= StaggeredGridLayoutManager.this.f3462t.mo1392c(viewRemove);
            }
            this.f3495b = Integer.MIN_VALUE;
        }

        /* renamed from: n */
        public void m2072n(View view) {
            C0555c c0555cM2068j = m2068j(view);
            c0555cM2068j.f3477e = this;
            this.f3494a.add(0, view);
            this.f3495b = Integer.MIN_VALUE;
            if (this.f3494a.size() == 1) {
                this.f3496c = Integer.MIN_VALUE;
            }
            if (c0555cM2068j.m1972c() || c0555cM2068j.m1971b()) {
                this.f3497d = StaggeredGridLayoutManager.this.f3462t.mo1392c(view) + this.f3497d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3460r = -1;
        this.f3467y = false;
        RecyclerView.AbstractC0538l.d dVarM1906S = RecyclerView.AbstractC0538l.m1906S(context, attributeSet, i, i2);
        int i3 = dVarM1906S.f3367a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1782d(null);
        if (i3 != this.f3464v) {
            this.f3464v = i3;
            AbstractC0397t abstractC0397t = this.f3462t;
            this.f3462t = this.f3463u;
            this.f3463u = abstractC0397t;
            m1930L0();
        }
        int i4 = dVarM1906S.f3368b;
        mo1782d(null);
        if (i4 != this.f3460r) {
            this.f3449D.m2053a();
            m1930L0();
            this.f3460r = i4;
            this.f3446A = new BitSet(this.f3460r);
            this.f3461s = new C0558f[this.f3460r];
            for (int i5 = 0; i5 < this.f3460r; i5++) {
                this.f3461s[i5] = new C0558f(i5);
            }
            m1930L0();
        }
        boolean z = dVarM1906S.f3369c;
        mo1782d(null);
        C0557e c0557e = this.f3453H;
        if (c0557e != null && c0557e.f3491i != z) {
            c0557e.f3491i = z;
        }
        this.f3467y = z;
        m1930L0();
        this.f3466x = new C0391n();
        this.f3462t = AbstractC0397t.m1405a(this, this.f3464v);
        this.f3463u = AbstractC0397t.m1405a(this, 1 - this.f3464v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: A */
    public int mo1727A(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        return this.f3464v == 1 ? this.f3460r : super.mo1727A(c0544r, c0549w);
    }

    /* renamed from: A1 */
    public final void m2020A1(int i) {
        C0391n c0391n = this.f3466x;
        c0391n.f2322e = i;
        c0391n.f2321d = this.f3468z != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: B0 */
    public void mo1767B0(Parcelable parcelable) {
        if (parcelable instanceof C0557e) {
            this.f3453H = (C0557e) parcelable;
            m1930L0();
        }
    }

    /* renamed from: B1 */
    public final void m2021B1(int i, int i2) {
        for (int i3 = 0; i3 < this.f3460r; i3++) {
            if (!this.f3461s[i3].f3494a.isEmpty()) {
                m2023D1(this.f3461s[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: C0 */
    public Parcelable mo1769C0() {
        int iM2069k;
        int iMo1400k;
        int[] iArr;
        C0557e c0557e = this.f3453H;
        if (c0557e != null) {
            return new C0557e(c0557e);
        }
        C0557e c0557e2 = new C0557e();
        c0557e2.f3491i = this.f3467y;
        c0557e2.f3492j = this.f3451F;
        c0557e2.f3493k = this.f3452G;
        C0556d c0556d = this.f3449D;
        if (c0556d == null || (iArr = c0556d.f3478a) == null) {
            c0557e2.f3488f = 0;
        } else {
            c0557e2.f3489g = iArr;
            c0557e2.f3488f = iArr.length;
            c0557e2.f3490h = c0556d.f3479b;
        }
        if (m1967y() > 0) {
            c0557e2.f3484b = this.f3451F ? m2036l1() : m2035k1();
            View viewM2031g1 = this.f3468z ? m2031g1(true) : m2032h1(true);
            c0557e2.f3485c = viewM2031g1 != null ? m1938R(viewM2031g1) : -1;
            int i = this.f3460r;
            c0557e2.f3486d = i;
            c0557e2.f3487e = new int[i];
            for (int i2 = 0; i2 < this.f3460r; i2++) {
                if (this.f3451F) {
                    iM2069k = this.f3461s[i2].m2066h(Integer.MIN_VALUE);
                    if (iM2069k != Integer.MIN_VALUE) {
                        iMo1400k = this.f3462t.mo1396g();
                        iM2069k -= iMo1400k;
                    }
                } else {
                    iM2069k = this.f3461s[i2].m2069k(Integer.MIN_VALUE);
                    if (iM2069k != Integer.MIN_VALUE) {
                        iMo1400k = this.f3462t.mo1400k();
                        iM2069k -= iMo1400k;
                    }
                }
                c0557e2.f3487e[i2] = iM2069k;
            }
        } else {
            c0557e2.f3484b = -1;
            c0557e2.f3485c = -1;
            c0557e2.f3486d = 0;
        }
        return c0557e2;
    }

    /* renamed from: C1 */
    public final void m2022C1(int i, RecyclerView.C0549w c0549w) {
        int iMo1401l;
        int iMo1401l2;
        int i2;
        C0391n c0391n = this.f3466x;
        boolean z = false;
        c0391n.f2319b = 0;
        c0391n.f2320c = i;
        RecyclerView.AbstractC0548v abstractC0548v = this.f3354g;
        if (!(abstractC0548v != null && abstractC0548v.f3395e) || (i2 = c0549w.f3406a) == -1) {
            iMo1401l = 0;
            iMo1401l2 = 0;
        } else {
            if (this.f3468z == (i2 < i)) {
                iMo1401l = this.f3462t.mo1401l();
                iMo1401l2 = 0;
            } else {
                iMo1401l2 = this.f3462t.mo1401l();
                iMo1401l = 0;
            }
        }
        RecyclerView recyclerView = this.f3349b;
        if (recyclerView != null && recyclerView.f3301h) {
            this.f3466x.f2323f = this.f3462t.mo1400k() - iMo1401l2;
            this.f3466x.f2324g = this.f3462t.mo1396g() + iMo1401l;
        } else {
            this.f3466x.f2324g = this.f3462t.mo1395f() + iMo1401l;
            this.f3466x.f2323f = -iMo1401l2;
        }
        C0391n c0391n2 = this.f3466x;
        c0391n2.f2325h = false;
        c0391n2.f2318a = true;
        if (this.f3462t.mo1398i() == 0 && this.f3462t.mo1395f() == 0) {
            z = true;
        }
        c0391n2.f2326i = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: D0 */
    public void mo1914D0(int i) {
        if (i == 0) {
            m2026b1();
        }
    }

    /* renamed from: D1 */
    public final void m2023D1(C0558f c0558f, int i, int i2) {
        int i3 = c0558f.f3497d;
        if (i == -1) {
            int i4 = c0558f.f3495b;
            if (i4 == Integer.MIN_VALUE) {
                c0558f.m2061c();
                i4 = c0558f.f3495b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = c0558f.f3496c;
            if (i5 == Integer.MIN_VALUE) {
                c0558f.m2060b();
                i5 = c0558f.f3496c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.f3446A.set(c0558f.f3498e, false);
    }

    /* renamed from: E1 */
    public final int m2024E1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: M0 */
    public int mo1733M0(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        return m2050z1(i, c0544r, c0549w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: N0 */
    public void mo1775N0(int i) {
        C0557e c0557e = this.f3453H;
        if (c0557e != null && c0557e.f3484b != i) {
            c0557e.f3487e = null;
            c0557e.f3486d = 0;
            c0557e.f3484b = -1;
            c0557e.f3485c = -1;
        }
        this.f3447B = i;
        this.f3448C = Integer.MIN_VALUE;
        m1930L0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: O0 */
    public int mo1736O0(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        return m2050z1(i, c0544r, c0549w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: R0 */
    public void mo1740R0(Rect rect, int i, int i2) {
        int iM1908h;
        int iM1908h2;
        int iM1934P = m1934P() + m1933O();
        int iM1932N = m1932N() + m1936Q();
        if (this.f3464v == 1) {
            iM1908h2 = RecyclerView.AbstractC0538l.m1908h(i2, rect.height() + iM1932N, m1929L());
            iM1908h = RecyclerView.AbstractC0538l.m1908h(i, (this.f3465w * this.f3460r) + iM1934P, m1931M());
        } else {
            iM1908h = RecyclerView.AbstractC0538l.m1908h(i, rect.width() + iM1934P, m1931M());
            iM1908h2 = RecyclerView.AbstractC0538l.m1908h(i2, (this.f3465w * this.f3460r) + iM1932N, m1929L());
        }
        this.f3349b.setMeasuredDimension(iM1908h, iM1908h2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: T */
    public int mo1742T(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        return this.f3464v == 0 ? this.f3460r : super.mo1742T(c0544r, c0549w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: W */
    public boolean mo1777W() {
        return this.f3450E != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: X0 */
    public void mo1778X0(RecyclerView recyclerView, RecyclerView.C0549w c0549w, int i) {
        C0392o c0392o = new C0392o(recyclerView.getContext());
        c0392o.f3391a = i;
        m1946Y0(c0392o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: Z0 */
    public boolean mo1743Z0() {
        return this.f3453H == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0548v.b
    /* renamed from: a */
    public PointF mo1779a(int i) {
        int iM2025a1 = m2025a1(i);
        PointF pointF = new PointF();
        if (iM2025a1 == 0) {
            return null;
        }
        if (this.f3464v == 0) {
            pointF.x = iM2025a1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM2025a1;
        }
        return pointF;
    }

    /* renamed from: a1 */
    public final int m2025a1(int i) {
        if (m1967y() == 0) {
            return this.f3468z ? 1 : -1;
        }
        return (i < m2035k1()) != this.f3468z ? -1 : 1;
    }

    /* renamed from: b1 */
    public boolean m2026b1() {
        int iM2035k1;
        if (m1967y() != 0 && this.f3450E != 0 && this.f3356i) {
            if (this.f3468z) {
                iM2035k1 = m2036l1();
                m2035k1();
            } else {
                iM2035k1 = m2035k1();
                m2036l1();
            }
            if (iM2035k1 == 0 && m2040p1() != null) {
                this.f3449D.m2053a();
                this.f3355h = true;
                m1930L0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: c1 */
    public final int m2027c1(RecyclerView.C0549w c0549w) {
        if (m1967y() == 0) {
            return 0;
        }
        return C0190e.m714i(c0549w, this.f3462t, m2032h1(!this.f3457L), m2031g1(!this.f3457L), this, this.f3457L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: d */
    public void mo1782d(String str) {
        RecyclerView recyclerView;
        if (this.f3453H != null || (recyclerView = this.f3349b) == null) {
            return;
        }
        recyclerView.m1862i(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: d0 */
    public void mo1953d0(int i) {
        super.mo1953d0(i);
        for (int i2 = 0; i2 < this.f3460r; i2++) {
            C0558f c0558f = this.f3461s[i2];
            int i3 = c0558f.f3495b;
            if (i3 != Integer.MIN_VALUE) {
                c0558f.f3495b = i3 + i;
            }
            int i4 = c0558f.f3496c;
            if (i4 != Integer.MIN_VALUE) {
                c0558f.f3496c = i4 + i;
            }
        }
    }

    /* renamed from: d1 */
    public final int m2028d1(RecyclerView.C0549w c0549w) {
        if (m1967y() == 0) {
            return 0;
        }
        return C0190e.m715j(c0549w, this.f3462t, m2032h1(!this.f3457L), m2031g1(!this.f3457L), this, this.f3457L, this.f3468z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: e */
    public boolean mo1784e() {
        return this.f3464v == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: e0 */
    public void mo1954e0(int i) {
        super.mo1954e0(i);
        for (int i2 = 0; i2 < this.f3460r; i2++) {
            C0558f c0558f = this.f3461s[i2];
            int i3 = c0558f.f3495b;
            if (i3 != Integer.MIN_VALUE) {
                c0558f.f3495b = i3 + i;
            }
            int i4 = c0558f.f3496c;
            if (i4 != Integer.MIN_VALUE) {
                c0558f.f3496c = i4 + i;
            }
        }
    }

    /* renamed from: e1 */
    public final int m2029e1(RecyclerView.C0549w c0549w) {
        if (m1967y() == 0) {
            return 0;
        }
        return C0190e.m716k(c0549w, this.f3462t, m2032h1(!this.f3457L), m2031g1(!this.f3457L), this, this.f3457L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: f */
    public boolean mo1786f() {
        return this.f3464v == 1;
    }

    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* renamed from: f1 */
    public final int m2030f1(RecyclerView.C0544r c0544r, C0391n c0391n, RecyclerView.C0549w c0549w) {
        int i;
        C0558f c0558f;
        ?? r2;
        int iM1909z;
        boolean z;
        int iM1909z2;
        int iM2069k;
        int iMo1392c;
        int iMo1400k;
        int iMo1392c2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        this.f3446A.set(0, this.f3460r, true);
        if (this.f3466x.f2326i) {
            i = c0391n.f2322e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = c0391n.f2322e == 1 ? c0391n.f2324g + c0391n.f2319b : c0391n.f2323f - c0391n.f2319b;
        }
        m2021B1(c0391n.f2322e, i);
        int iMo1396g = this.f3468z ? this.f3462t.mo1396g() : this.f3462t.mo1400k();
        boolean z2 = false;
        while (true) {
            int i10 = c0391n.f2320c;
            if (((i10 < 0 || i10 >= c0549w.m1995b()) ? i9 : 1) == 0 || (!this.f3466x.f2326i && this.f3446A.isEmpty())) {
                break;
            }
            View viewM1979e = c0544r.m1979e(c0391n.f2320c);
            c0391n.f2320c += c0391n.f2321d;
            C0555c c0555c = (C0555c) viewM1979e.getLayoutParams();
            int iM1970a = c0555c.m1970a();
            int[] iArr = this.f3449D.f3478a;
            int i11 = (iArr == null || iM1970a >= iArr.length) ? -1 : iArr[iM1970a];
            if ((i11 == -1 ? 1 : i9) != 0) {
                if (m2044t1(c0391n.f2322e)) {
                    i7 = this.f3460r - 1;
                    i6 = -1;
                    i8 = -1;
                } else {
                    i6 = this.f3460r;
                    i7 = i9;
                    i8 = 1;
                }
                C0558f c0558f2 = null;
                if (c0391n.f2322e == 1) {
                    int iMo1400k2 = this.f3462t.mo1400k();
                    int i12 = Integer.MAX_VALUE;
                    while (i7 != i6) {
                        C0558f c0558f3 = this.f3461s[i7];
                        int iM2066h = c0558f3.m2066h(iMo1400k2);
                        if (iM2066h < i12) {
                            c0558f2 = c0558f3;
                            i12 = iM2066h;
                        }
                        i7 += i8;
                    }
                } else {
                    int iMo1396g2 = this.f3462t.mo1396g();
                    int i13 = Integer.MIN_VALUE;
                    while (i7 != i6) {
                        C0558f c0558f4 = this.f3461s[i7];
                        int iM2069k2 = c0558f4.m2069k(iMo1396g2);
                        if (iM2069k2 > i13) {
                            c0558f2 = c0558f4;
                            i13 = iM2069k2;
                        }
                        i7 += i8;
                    }
                }
                c0558f = c0558f2;
                C0556d c0556d = this.f3449D;
                c0556d.m2054b(iM1970a);
                c0556d.f3478a[iM1970a] = c0558f.f3498e;
            } else {
                c0558f = this.f3461s[i11];
            }
            C0558f c0558f5 = c0558f;
            c0555c.f3477e = c0558f5;
            if (c0391n.f2322e == 1) {
                r2 = 0;
                m1951c(viewM1979e, -1, false);
            } else {
                r2 = 0;
                m1951c(viewM1979e, 0, false);
            }
            if (this.f3464v == 1) {
                iM1909z = RecyclerView.AbstractC0538l.m1909z(this.f3465w, this.f3361n, r2, ((ViewGroup.MarginLayoutParams) c0555c).width, r2);
                iM1909z2 = RecyclerView.AbstractC0538l.m1909z(this.f3364q, this.f3362o, m1932N() + m1936Q(), ((ViewGroup.MarginLayoutParams) c0555c).height, true);
                z = false;
            } else {
                iM1909z = RecyclerView.AbstractC0538l.m1909z(this.f3363p, this.f3361n, m1934P() + m1933O(), ((ViewGroup.MarginLayoutParams) c0555c).width, true);
                z = false;
                iM1909z2 = RecyclerView.AbstractC0538l.m1909z(this.f3465w, this.f3362o, 0, ((ViewGroup.MarginLayoutParams) c0555c).height, false);
            }
            m2042r1(viewM1979e, iM1909z, iM1909z2, z);
            if (c0391n.f2322e == 1) {
                iMo1392c = c0558f5.m2066h(iMo1396g);
                iM2069k = this.f3462t.mo1392c(viewM1979e) + iMo1392c;
            } else {
                iM2069k = c0558f5.m2069k(iMo1396g);
                iMo1392c = iM2069k - this.f3462t.mo1392c(viewM1979e);
            }
            int i14 = c0391n.f2322e;
            C0558f c0558f6 = c0555c.f3477e;
            if (i14 == 1) {
                c0558f6.m2059a(viewM1979e);
            } else {
                c0558f6.m2072n(viewM1979e);
            }
            if (m2041q1() && this.f3464v == 1) {
                iMo1392c2 = this.f3463u.mo1396g() - (((this.f3460r - 1) - c0558f5.f3498e) * this.f3465w);
                iMo1400k = iMo1392c2 - this.f3463u.mo1392c(viewM1979e);
            } else {
                iMo1400k = this.f3463u.mo1400k() + (c0558f5.f3498e * this.f3465w);
                iMo1392c2 = this.f3463u.mo1392c(viewM1979e) + iMo1400k;
            }
            if (this.f3464v == 1) {
                i3 = iMo1392c2;
                i2 = iM2069k;
                i4 = iMo1400k;
                iMo1400k = iMo1392c;
            } else {
                i2 = iMo1392c2;
                i3 = iM2069k;
                i4 = iMo1392c;
            }
            m1950b0(viewM1979e, i4, iMo1400k, i3, i2);
            m2023D1(c0558f5, this.f3466x.f2322e, i);
            m2046v1(c0544r, this.f3466x);
            if (this.f3466x.f2325h && viewM1979e.hasFocusable()) {
                i5 = 0;
                this.f3446A.set(c0558f5.f3498e, false);
            } else {
                i5 = 0;
            }
            i9 = i5;
            z2 = true;
        }
        int i15 = i9;
        if (!z2) {
            m2046v1(c0544r, this.f3466x);
        }
        int iMo1400k3 = this.f3466x.f2322e == -1 ? this.f3462t.mo1400k() - m2038n1(this.f3462t.mo1400k()) : m2037m1(this.f3462t.mo1396g()) - this.f3462t.mo1396g();
        return iMo1400k3 > 0 ? Math.min(c0391n.f2319b, iMo1400k3) : i15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: g */
    public boolean mo1745g(RecyclerView.C0539m c0539m) {
        return c0539m instanceof C0555c;
    }

    /* renamed from: g1 */
    public View m2031g1(boolean z) {
        int iMo1400k = this.f3462t.mo1400k();
        int iMo1396g = this.f3462t.mo1396g();
        View view = null;
        for (int iM1967y = m1967y() - 1; iM1967y >= 0; iM1967y--) {
            View viewM1966x = m1966x(iM1967y);
            int iMo1394e = this.f3462t.mo1394e(viewM1966x);
            int iMo1391b = this.f3462t.mo1391b(viewM1966x);
            if (iMo1391b > iMo1400k && iMo1394e < iMo1396g) {
                if (iMo1391b <= iMo1396g || !z) {
                    return viewM1966x;
                }
                if (view == null) {
                    view = viewM1966x;
                }
            }
        }
        return view;
    }

    /* renamed from: h1 */
    public View m2032h1(boolean z) {
        int iMo1400k = this.f3462t.mo1400k();
        int iMo1396g = this.f3462t.mo1396g();
        int iM1967y = m1967y();
        View view = null;
        for (int i = 0; i < iM1967y; i++) {
            View viewM1966x = m1966x(i);
            int iMo1394e = this.f3462t.mo1394e(viewM1966x);
            if (this.f3462t.mo1391b(viewM1966x) > iMo1400k && iMo1394e < iMo1396g) {
                if (iMo1394e >= iMo1400k || !z) {
                    return viewM1966x;
                }
                if (view == null) {
                    view = viewM1966x;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: i */
    public void mo1790i(int i, int i2, RecyclerView.C0549w c0549w, RecyclerView.AbstractC0538l.c cVar) {
        int iM2066h;
        int iM2069k;
        if (this.f3464v != 0) {
            i = i2;
        }
        if (m1967y() == 0 || i == 0) {
            return;
        }
        m2045u1(i, c0549w);
        int[] iArr = this.f3458M;
        if (iArr == null || iArr.length < this.f3460r) {
            this.f3458M = new int[this.f3460r];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f3460r; i4++) {
            C0391n c0391n = this.f3466x;
            if (c0391n.f2321d == -1) {
                iM2066h = c0391n.f2323f;
                iM2069k = this.f3461s[i4].m2069k(iM2066h);
            } else {
                iM2066h = this.f3461s[i4].m2066h(c0391n.f2324g);
                iM2069k = this.f3466x.f2324g;
            }
            int i5 = iM2066h - iM2069k;
            if (i5 >= 0) {
                this.f3458M[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.f3458M, 0, i3);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = this.f3466x.f2320c;
            if (!(i7 >= 0 && i7 < c0549w.m1995b())) {
                return;
            }
            ((RunnableC0390m.b) cVar).m1377a(this.f3466x.f2320c, this.f3458M[i6]);
            C0391n c0391n2 = this.f3466x;
            c0391n2.f2320c += c0391n2.f2321d;
        }
    }

    /* renamed from: i1 */
    public final void m2033i1(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, boolean z) {
        int iMo1396g;
        int iM2037m1 = m2037m1(Integer.MIN_VALUE);
        if (iM2037m1 != Integer.MIN_VALUE && (iMo1396g = this.f3462t.mo1396g() - iM2037m1) > 0) {
            int i = iMo1396g - (-m2050z1(-iMo1396g, c0544r, c0549w));
            if (!z || i <= 0) {
                return;
            }
            this.f3462t.mo1404p(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: j0 */
    public void mo1793j0(RecyclerView recyclerView, RecyclerView.C0544r c0544r) {
        m1958i0();
        Runnable runnable = this.f3459N;
        RecyclerView recyclerView2 = this.f3349b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.f3460r; i++) {
            this.f3461s[i].m2062d();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: j1 */
    public final void m2034j1(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, boolean z) {
        int iMo1400k;
        int iM2038n1 = m2038n1(Integer.MAX_VALUE);
        if (iM2038n1 != Integer.MAX_VALUE && (iMo1400k = iM2038n1 - this.f3462t.mo1400k()) > 0) {
            int iM2050z1 = iMo1400k - m2050z1(iMo1400k, c0544r, c0549w);
            if (!z || iM2050z1 <= 0) {
                return;
            }
            this.f3462t.mo1404p(-iM2050z1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: k */
    public int mo1795k(RecyclerView.C0549w c0549w) {
        return m2027c1(c0549w);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005b  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo1746k0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.C0544r r11, androidx.recyclerview.widget.RecyclerView.C0549w r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1746k0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    /* renamed from: k1 */
    public int m2035k1() {
        if (m1967y() == 0) {
            return 0;
        }
        return m1938R(m1966x(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: l */
    public int mo1747l(RecyclerView.C0549w c0549w) {
        return m2028d1(c0549w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: l0 */
    public void mo1797l0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0544r c0544r = this.f3349b.f3291c;
        m1959m0(accessibilityEvent);
        if (m1967y() > 0) {
            View viewM2032h1 = m2032h1(false);
            View viewM2031g1 = m2031g1(false);
            if (viewM2032h1 == null || viewM2031g1 == null) {
                return;
            }
            int iM1938R = m1938R(viewM2032h1);
            int iM1938R2 = m1938R(viewM2031g1);
            if (iM1938R < iM1938R2) {
                accessibilityEvent.setFromIndex(iM1938R);
                accessibilityEvent.setToIndex(iM1938R2);
            } else {
                accessibilityEvent.setFromIndex(iM1938R2);
                accessibilityEvent.setToIndex(iM1938R);
            }
        }
    }

    /* renamed from: l1 */
    public int m2036l1() {
        int iM1967y = m1967y();
        if (iM1967y == 0) {
            return 0;
        }
        return m1938R(m1966x(iM1967y - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: m */
    public int mo1748m(RecyclerView.C0549w c0549w) {
        return m2029e1(c0549w);
    }

    /* renamed from: m1 */
    public final int m2037m1(int i) {
        int iM2066h = this.f3461s[0].m2066h(i);
        for (int i2 = 1; i2 < this.f3460r; i2++) {
            int iM2066h2 = this.f3461s[i2].m2066h(i);
            if (iM2066h2 > iM2066h) {
                iM2066h = iM2066h2;
            }
        }
        return iM2066h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: n */
    public int mo1800n(RecyclerView.C0549w c0549w) {
        return m2027c1(c0549w);
    }

    /* renamed from: n1 */
    public final int m2038n1(int i) {
        int iM2069k = this.f3461s[0].m2069k(i);
        for (int i2 = 1; i2 < this.f3460r; i2++) {
            int iM2069k2 = this.f3461s[i2].m2069k(i);
            if (iM2069k2 < iM2069k) {
                iM2069k = iM2069k2;
            }
        }
        return iM2069k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: o */
    public int mo1749o(RecyclerView.C0549w c0549w) {
        return m2028d1(c0549w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: o0 */
    public void mo1750o0(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w, View view, C0245b c0245b) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0555c)) {
            m1960n0(view, c0245b);
            return;
        }
        C0555c c0555c = (C0555c) layoutParams;
        if (this.f3464v == 0) {
            C0558f c0558f = c0555c.f3477e;
            i3 = c0558f == null ? -1 : c0558f.f3498e;
            i4 = 1;
            i = -1;
            i2 = -1;
        } else {
            C0558f c0558f2 = c0555c.f3477e;
            i = c0558f2 == null ? -1 : c0558f2.f3498e;
            i2 = 1;
            i3 = -1;
            i4 = -1;
        }
        c0245b.m825j(C0245b.c.m828a(i3, i4, i, i2, false, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: o1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2039o1(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3468z
            if (r0 == 0) goto L9
            int r0 = r6.m2036l1()
            goto Ld
        L9:
            int r0 = r6.m2035k1()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f3449D
            r4.m2056d(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3449D
            r9.m2058f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f3449D
            r7.m2057e(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3449D
            r9.m2058f(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3449D
            r9.m2057e(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f3468z
            if (r7 == 0) goto L4d
            int r7 = r6.m2035k1()
            goto L51
        L4d:
            int r7 = r6.m2036l1()
        L51:
            if (r3 > r7) goto L56
            r6.m1930L0()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2039o1(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: p */
    public int mo1751p(RecyclerView.C0549w c0549w) {
        return m2029e1(c0549w);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View m2040p1() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2040p1():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: q0 */
    public void mo1752q0(RecyclerView recyclerView, int i, int i2) {
        m2039o1(i, i2, 1);
    }

    /* renamed from: q1 */
    public boolean m2041q1() {
        return m1927K() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: r0 */
    public void mo1754r0(RecyclerView recyclerView) {
        this.f3449D.m2053a();
        m1930L0();
    }

    /* renamed from: r1 */
    public final void m2042r1(View view, int i, int i2, boolean z) {
        Rect rect = this.f3455J;
        RecyclerView recyclerView = this.f3349b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1836L(view));
        }
        C0555c c0555c = (C0555c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0555c).leftMargin;
        Rect rect2 = this.f3455J;
        int iM2024E1 = m2024E1(i, i3 + rect2.left, ((ViewGroup.MarginLayoutParams) c0555c).rightMargin + rect2.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c0555c).topMargin;
        Rect rect3 = this.f3455J;
        int iM2024E12 = m2024E1(i2, i4 + rect3.top, ((ViewGroup.MarginLayoutParams) c0555c).bottomMargin + rect3.bottom);
        if (z ? m1944W0(view, iM2024E1, iM2024E12, c0555c) : m1942U0(view, iM2024E1, iM2024E12, c0555c)) {
            view.measure(iM2024E1, iM2024E12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: s0 */
    public void mo1755s0(RecyclerView recyclerView, int i, int i2, int i3) {
        m2039o1(i, i2, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03f7  */
    /* renamed from: s1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2043s1(androidx.recyclerview.widget.RecyclerView.C0544r r12, androidx.recyclerview.widget.RecyclerView.C0549w r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2043s1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: t0 */
    public void mo1756t0(RecyclerView recyclerView, int i, int i2) {
        m2039o1(i, i2, 2);
    }

    /* renamed from: t1 */
    public final boolean m2044t1(int i) {
        if (this.f3464v == 0) {
            return (i == -1) != this.f3468z;
        }
        return ((i == -1) == this.f3468z) == m2041q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: u */
    public RecyclerView.C0539m mo1757u() {
        return this.f3464v == 0 ? new C0555c(-2, -1) : new C0555c(-1, -2);
    }

    /* renamed from: u1 */
    public void m2045u1(int i, RecyclerView.C0549w c0549w) {
        int i2;
        int iM2035k1;
        if (i > 0) {
            iM2035k1 = m2036l1();
            i2 = 1;
        } else {
            i2 = -1;
            iM2035k1 = m2035k1();
        }
        this.f3466x.f2318a = true;
        m2022C1(iM2035k1, c0549w);
        m2020A1(i2);
        C0391n c0391n = this.f3466x;
        c0391n.f2320c = iM2035k1 + c0391n.f2321d;
        c0391n.f2319b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: v */
    public RecyclerView.C0539m mo1758v(Context context, AttributeSet attributeSet) {
        return new C0555c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: v0 */
    public void mo1759v0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m2039o1(i, i2, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        if (r6.f2322e == (-1)) goto L11;
     */
    /* renamed from: v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2046v1(androidx.recyclerview.widget.RecyclerView.C0544r r5, p000a.p060o.p061b.C0391n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f2318a
            if (r0 == 0) goto L7c
            boolean r0 = r6.f2326i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f2319b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f2322e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f2324g
        L15:
            r4.m2047w1(r5, r6)
            goto L7c
        L19:
            int r6 = r6.f2323f
        L1b:
            r4.m2048x1(r5, r6)
            goto L7c
        L1f:
            int r0 = r6.f2322e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f2323f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3461s
            r1 = r1[r2]
            int r1 = r1.m2069k(r0)
        L2f:
            int r2 = r4.f3460r
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f3461s
            r2 = r2[r3]
            int r2 = r2.m2069k(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f2324g
            int r6 = r6.f2319b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f2324g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3461s
            r1 = r1[r2]
            int r1 = r1.m2066h(r0)
        L5a:
            int r2 = r4.f3460r
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f3461s
            r2 = r2[r3]
            int r2 = r2.m2066h(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f2324g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f2323f
            int r6 = r6.f2319b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m2046v1(androidx.recyclerview.widget.RecyclerView$r, a.o.b.n):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: w */
    public RecyclerView.C0539m mo1760w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0555c((ViewGroup.MarginLayoutParams) layoutParams) : new C0555c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: w0 */
    public void mo1761w0(RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        m2043s1(c0544r, c0549w, true);
    }

    /* renamed from: w1 */
    public final void m2047w1(RecyclerView.C0544r c0544r, int i) {
        for (int iM1967y = m1967y() - 1; iM1967y >= 0; iM1967y--) {
            View viewM1966x = m1966x(iM1967y);
            if (this.f3462t.mo1394e(viewM1966x) < i || this.f3462t.mo1403o(viewM1966x) < i) {
                return;
            }
            C0555c c0555c = (C0555c) viewM1966x.getLayoutParams();
            Objects.requireNonNull(c0555c);
            if (c0555c.f3477e.f3494a.size() == 1) {
                return;
            }
            c0555c.f3477e.m2070l();
            m1924I0(viewM1966x, c0544r);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0538l
    /* renamed from: x0 */
    public void mo1763x0(RecyclerView.C0549w c0549w) {
        this.f3447B = -1;
        this.f3448C = Integer.MIN_VALUE;
        this.f3453H = null;
        this.f3456K.m2052b();
    }

    /* renamed from: x1 */
    public final void m2048x1(RecyclerView.C0544r c0544r, int i) {
        while (m1967y() > 0) {
            View viewM1966x = m1966x(0);
            if (this.f3462t.mo1391b(viewM1966x) > i || this.f3462t.mo1402n(viewM1966x) > i) {
                return;
            }
            C0555c c0555c = (C0555c) viewM1966x.getLayoutParams();
            Objects.requireNonNull(c0555c);
            if (c0555c.f3477e.f3494a.size() == 1) {
                return;
            }
            c0555c.f3477e.m2071m();
            m1924I0(viewM1966x, c0544r);
        }
    }

    /* renamed from: y1 */
    public final void m2049y1() {
        this.f3468z = (this.f3464v == 1 || !m2041q1()) ? this.f3467y : !this.f3467y;
    }

    /* renamed from: z1 */
    public int m2050z1(int i, RecyclerView.C0544r c0544r, RecyclerView.C0549w c0549w) {
        if (m1967y() == 0 || i == 0) {
            return 0;
        }
        m2045u1(i, c0549w);
        int iM2030f1 = m2030f1(c0544r, this.f3466x, c0549w);
        if (this.f3466x.f2319b >= iM2030f1) {
            i = i < 0 ? -iM2030f1 : iM2030f1;
        }
        this.f3462t.mo1404p(-i);
        this.f3451F = this.f3468z;
        C0391n c0391n = this.f3466x;
        c0391n.f2319b = 0;
        m2046v1(c0544r, c0391n);
        return i;
    }
}
