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
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p016c0.C1050c;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0570o implements RecyclerView.AbstractC0579x.b {

    /* renamed from: b */
    C0586c[] f3690b;

    /* renamed from: c */
    AbstractC0596j f3691c;

    /* renamed from: d */
    AbstractC0596j f3692d;

    /* renamed from: e */
    private int f3693e;

    /* renamed from: f */
    private int f3694f;

    /* renamed from: g */
    private final C0592f f3695g;

    /* renamed from: j */
    private BitSet f3698j;

    /* renamed from: o */
    private boolean f3703o;

    /* renamed from: p */
    private boolean f3704p;

    /* renamed from: q */
    private SavedState f3705q;

    /* renamed from: r */
    private int f3706r;

    /* renamed from: w */
    private int[] f3711w;

    /* renamed from: a */
    private int f3689a = -1;

    /* renamed from: h */
    boolean f3696h = false;

    /* renamed from: i */
    boolean f3697i = false;

    /* renamed from: k */
    int f3699k = -1;

    /* renamed from: l */
    int f3700l = Integer.MIN_VALUE;

    /* renamed from: m */
    LazySpanLookup f3701m = new LazySpanLookup();

    /* renamed from: n */
    private int f3702n = 2;

    /* renamed from: s */
    private final Rect f3707s = new Rect();

    /* renamed from: t */
    private final C0585b f3708t = new C0585b();

    /* renamed from: u */
    private boolean f3709u = false;

    /* renamed from: v */
    private boolean f3710v = true;

    /* renamed from: x */
    private final Runnable f3712x = new RunnableC0584a();

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        C0586c f3713e;

        /* renamed from: f */
        boolean f3714f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public final int m3216e() {
            C0586c c0586c = this.f3713e;
            if (c0586c == null) {
                return -1;
            }
            return c0586c.f3743e;
        }

        /* renamed from: f */
        public boolean m3217f() {
            return this.f3714f;
        }

        /* renamed from: g */
        public void m3218g(boolean z3) {
            this.f3714f = z3;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0583a();

        /* renamed from: a */
        int f3721a;

        /* renamed from: b */
        int f3722b;

        /* renamed from: c */
        int f3723c;

        /* renamed from: d */
        int[] f3724d;

        /* renamed from: e */
        int f3725e;

        /* renamed from: f */
        int[] f3726f;

        /* renamed from: g */
        List<LazySpanLookup.FullSpanItem> f3727g;

        /* renamed from: h */
        boolean f3728h;

        /* renamed from: i */
        boolean f3729i;

        /* renamed from: j */
        boolean f3730j;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        static class C0583a implements Parcelable.Creator<SavedState> {
            C0583a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState() {
        }

        /* renamed from: a */
        void m3237a() {
            this.f3724d = null;
            this.f3723c = 0;
            this.f3721a = -1;
            this.f3722b = -1;
        }

        /* renamed from: b */
        void m3238b() {
            this.f3724d = null;
            this.f3723c = 0;
            this.f3725e = 0;
            this.f3726f = null;
            this.f3727g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f3721a);
            parcel.writeInt(this.f3722b);
            parcel.writeInt(this.f3723c);
            if (this.f3723c > 0) {
                parcel.writeIntArray(this.f3724d);
            }
            parcel.writeInt(this.f3725e);
            if (this.f3725e > 0) {
                parcel.writeIntArray(this.f3726f);
            }
            parcel.writeInt(this.f3728h ? 1 : 0);
            parcel.writeInt(this.f3729i ? 1 : 0);
            parcel.writeInt(this.f3730j ? 1 : 0);
            parcel.writeList(this.f3727g);
        }

        SavedState(Parcel parcel) {
            this.f3721a = parcel.readInt();
            this.f3722b = parcel.readInt();
            int i4 = parcel.readInt();
            this.f3723c = i4;
            if (i4 > 0) {
                int[] iArr = new int[i4];
                this.f3724d = iArr;
                parcel.readIntArray(iArr);
            }
            int i5 = parcel.readInt();
            this.f3725e = i5;
            if (i5 > 0) {
                int[] iArr2 = new int[i5];
                this.f3726f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f3728h = parcel.readInt() == 1;
            this.f3729i = parcel.readInt() == 1;
            this.f3730j = parcel.readInt() == 1;
            this.f3727g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f3723c = savedState.f3723c;
            this.f3721a = savedState.f3721a;
            this.f3722b = savedState.f3722b;
            this.f3724d = savedState.f3724d;
            this.f3725e = savedState.f3725e;
            this.f3726f = savedState.f3726f;
            this.f3728h = savedState.f3728h;
            this.f3729i = savedState.f3729i;
            this.f3730j = savedState.f3730j;
            this.f3727g = savedState.f3727g;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class RunnableC0584a implements Runnable {
        RunnableC0584a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m3208g();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C0585b {

        /* renamed from: a */
        int f3732a;

        /* renamed from: b */
        int f3733b;

        /* renamed from: c */
        boolean f3734c;

        /* renamed from: d */
        boolean f3735d;

        /* renamed from: e */
        boolean f3736e;

        /* renamed from: f */
        int[] f3737f;

        C0585b() {
            m3243c();
        }

        /* renamed from: a */
        void m3241a() {
            this.f3733b = this.f3734c ? StaggeredGridLayoutManager.this.f3691c.mo3400i() : StaggeredGridLayoutManager.this.f3691c.mo3404m();
        }

        /* renamed from: b */
        void m3242b(int i4) {
            if (this.f3734c) {
                this.f3733b = StaggeredGridLayoutManager.this.f3691c.mo3400i() - i4;
            } else {
                this.f3733b = StaggeredGridLayoutManager.this.f3691c.mo3404m() + i4;
            }
        }

        /* renamed from: c */
        void m3243c() {
            this.f3732a = -1;
            this.f3733b = Integer.MIN_VALUE;
            this.f3734c = false;
            this.f3735d = false;
            this.f3736e = false;
            int[] iArr = this.f3737f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        void m3244d(C0586c[] c0586cArr) {
            int length = c0586cArr.length;
            int[] iArr = this.f3737f;
            if (iArr == null || iArr.length < length) {
                this.f3737f = new int[StaggeredGridLayoutManager.this.f3690b.length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                this.f3737f[i4] = c0586cArr[i4].m3263s(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    class C0586c {

        /* renamed from: a */
        ArrayList<View> f3739a = new ArrayList<>();

        /* renamed from: b */
        int f3740b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f3741c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f3742d = 0;

        /* renamed from: e */
        final int f3743e;

        C0586c(int i4) {
            this.f3743e = i4;
        }

        /* renamed from: a */
        void m3245a(View view) {
            LayoutParams layoutParamsM3261q = m3261q(view);
            layoutParamsM3261q.f3713e = this;
            this.f3739a.add(view);
            this.f3741c = Integer.MIN_VALUE;
            if (this.f3739a.size() == 1) {
                this.f3740b = Integer.MIN_VALUE;
            }
            if (layoutParamsM3261q.m3019c() || layoutParamsM3261q.m3018b()) {
                this.f3742d += StaggeredGridLayoutManager.this.f3691c.mo3396e(view);
            }
        }

        /* renamed from: b */
        void m3246b(boolean z3, int i4) {
            int iM3259o = z3 ? m3259o(Integer.MIN_VALUE) : m3263s(Integer.MIN_VALUE);
            m3249e();
            if (iM3259o == Integer.MIN_VALUE) {
                return;
            }
            if (!z3 || iM3259o >= StaggeredGridLayoutManager.this.f3691c.mo3400i()) {
                if (z3 || iM3259o <= StaggeredGridLayoutManager.this.f3691c.mo3404m()) {
                    if (i4 != Integer.MIN_VALUE) {
                        iM3259o += i4;
                    }
                    this.f3741c = iM3259o;
                    this.f3740b = iM3259o;
                }
            }
        }

        /* renamed from: c */
        void m3247c() {
            LazySpanLookup.FullSpanItem fullSpanItemM3227f;
            ArrayList<View> arrayList = this.f3739a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParamsM3261q = m3261q(view);
            this.f3741c = StaggeredGridLayoutManager.this.f3691c.mo3395d(view);
            if (layoutParamsM3261q.f3714f && (fullSpanItemM3227f = StaggeredGridLayoutManager.this.f3701m.m3227f(layoutParamsM3261q.m3017a())) != null && fullSpanItemM3227f.f3718b == 1) {
                this.f3741c += fullSpanItemM3227f.m3234a(this.f3743e);
            }
        }

        /* renamed from: d */
        void m3248d() {
            LazySpanLookup.FullSpanItem fullSpanItemM3227f;
            View view = this.f3739a.get(0);
            LayoutParams layoutParamsM3261q = m3261q(view);
            this.f3740b = StaggeredGridLayoutManager.this.f3691c.mo3398g(view);
            if (layoutParamsM3261q.f3714f && (fullSpanItemM3227f = StaggeredGridLayoutManager.this.f3701m.m3227f(layoutParamsM3261q.m3017a())) != null && fullSpanItemM3227f.f3718b == -1) {
                this.f3740b -= fullSpanItemM3227f.m3234a(this.f3743e);
            }
        }

        /* renamed from: e */
        void m3249e() {
            this.f3739a.clear();
            m3264t();
            this.f3742d = 0;
        }

        /* renamed from: f */
        public int m3250f() {
            return StaggeredGridLayoutManager.this.f3696h ? m3256l(this.f3739a.size() - 1, -1, true) : m3256l(0, this.f3739a.size(), true);
        }

        /* renamed from: g */
        public int m3251g() {
            return StaggeredGridLayoutManager.this.f3696h ? m3255k(this.f3739a.size() - 1, -1, true) : m3255k(0, this.f3739a.size(), true);
        }

        /* renamed from: h */
        public int m3252h() {
            return StaggeredGridLayoutManager.this.f3696h ? m3256l(this.f3739a.size() - 1, -1, false) : m3256l(0, this.f3739a.size(), false);
        }

        /* renamed from: i */
        public int m3253i() {
            return StaggeredGridLayoutManager.this.f3696h ? m3255k(0, this.f3739a.size(), true) : m3255k(this.f3739a.size() - 1, -1, true);
        }

        /* renamed from: j */
        int m3254j(int i4, int i5, boolean z3, boolean z4, boolean z5) {
            int iMo3404m = StaggeredGridLayoutManager.this.f3691c.mo3404m();
            int iMo3400i = StaggeredGridLayoutManager.this.f3691c.mo3400i();
            int i6 = i5 > i4 ? 1 : -1;
            while (i4 != i5) {
                View view = this.f3739a.get(i4);
                int iMo3398g = StaggeredGridLayoutManager.this.f3691c.mo3398g(view);
                int iMo3395d = StaggeredGridLayoutManager.this.f3691c.mo3395d(view);
                boolean z6 = false;
                boolean z7 = !z5 ? iMo3398g >= iMo3400i : iMo3398g > iMo3400i;
                if (!z5 ? iMo3395d > iMo3404m : iMo3395d >= iMo3404m) {
                    z6 = true;
                }
                if (z7 && z6) {
                    if (z3 && z4) {
                        if (iMo3398g >= iMo3404m && iMo3395d <= iMo3400i) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z4) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iMo3398g < iMo3404m || iMo3395d > iMo3400i) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i4 += i6;
            }
            return -1;
        }

        /* renamed from: k */
        int m3255k(int i4, int i5, boolean z3) {
            return m3254j(i4, i5, false, false, z3);
        }

        /* renamed from: l */
        int m3256l(int i4, int i5, boolean z3) {
            return m3254j(i4, i5, z3, true, false);
        }

        /* renamed from: m */
        public int m3257m() {
            return this.f3742d;
        }

        /* renamed from: n */
        int m3258n() {
            int i4 = this.f3741c;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            m3247c();
            return this.f3741c;
        }

        /* renamed from: o */
        int m3259o(int i4) {
            int i5 = this.f3741c;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f3739a.size() == 0) {
                return i4;
            }
            m3247c();
            return this.f3741c;
        }

        /* renamed from: p */
        public View m3260p(int i4, int i5) {
            View view = null;
            if (i5 != -1) {
                int size = this.f3739a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3739a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3696h && staggeredGridLayoutManager.getPosition(view2) >= i4) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3696h && staggeredGridLayoutManager2.getPosition(view2) <= i4) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3739a.size();
                int i6 = 0;
                while (i6 < size2) {
                    View view3 = this.f3739a.get(i6);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3696h && staggeredGridLayoutManager3.getPosition(view3) <= i4) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3696h && staggeredGridLayoutManager4.getPosition(view3) >= i4) || !view3.hasFocusable()) {
                        break;
                    }
                    i6++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: q */
        LayoutParams m3261q(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: r */
        int m3262r() {
            int i4 = this.f3740b;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            m3248d();
            return this.f3740b;
        }

        /* renamed from: s */
        int m3263s(int i4) {
            int i5 = this.f3740b;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f3739a.size() == 0) {
                return i4;
            }
            m3248d();
            return this.f3740b;
        }

        /* renamed from: t */
        void m3264t() {
            this.f3740b = Integer.MIN_VALUE;
            this.f3741c = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        void m3265u(int i4) {
            int i5 = this.f3740b;
            if (i5 != Integer.MIN_VALUE) {
                this.f3740b = i5 + i4;
            }
            int i6 = this.f3741c;
            if (i6 != Integer.MIN_VALUE) {
                this.f3741c = i6 + i4;
            }
        }

        /* renamed from: v */
        void m3266v() {
            int size = this.f3739a.size();
            View viewRemove = this.f3739a.remove(size - 1);
            LayoutParams layoutParamsM3261q = m3261q(viewRemove);
            layoutParamsM3261q.f3713e = null;
            if (layoutParamsM3261q.m3019c() || layoutParamsM3261q.m3018b()) {
                this.f3742d -= StaggeredGridLayoutManager.this.f3691c.mo3396e(viewRemove);
            }
            if (size == 1) {
                this.f3740b = Integer.MIN_VALUE;
            }
            this.f3741c = Integer.MIN_VALUE;
        }

        /* renamed from: w */
        void m3267w() {
            View viewRemove = this.f3739a.remove(0);
            LayoutParams layoutParamsM3261q = m3261q(viewRemove);
            layoutParamsM3261q.f3713e = null;
            if (this.f3739a.size() == 0) {
                this.f3741c = Integer.MIN_VALUE;
            }
            if (layoutParamsM3261q.m3019c() || layoutParamsM3261q.m3018b()) {
                this.f3742d -= StaggeredGridLayoutManager.this.f3691c.mo3396e(viewRemove);
            }
            this.f3740b = Integer.MIN_VALUE;
        }

        /* renamed from: x */
        void m3268x(View view) {
            LayoutParams layoutParamsM3261q = m3261q(view);
            layoutParamsM3261q.f3713e = this;
            this.f3739a.add(0, view);
            this.f3740b = Integer.MIN_VALUE;
            if (this.f3739a.size() == 1) {
                this.f3741c = Integer.MIN_VALUE;
            }
            if (layoutParamsM3261q.m3019c() || layoutParamsM3261q.m3018b()) {
                this.f3742d += StaggeredGridLayoutManager.this.f3691c.mo3396e(view);
            }
        }

        /* renamed from: y */
        void m3269y(int i4) {
            this.f3740b = i4;
            this.f3741c = i4;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        RecyclerView.AbstractC0570o.d properties = RecyclerView.AbstractC0570o.getProperties(context, attributeSet, i4, i5);
        setOrientation(properties.f3646a);
        setSpanCount(properties.f3647b);
        setReverseLayout(properties.f3648c);
        this.f3695g = new C0592f();
        m3191k();
    }

    /* renamed from: A */
    private int m3167A(int i4) {
        int iM3263s = this.f3690b[0].m3263s(i4);
        for (int i5 = 1; i5 < this.f3689a; i5++) {
            int iM3263s2 = this.f3690b[i5].m3263s(i4);
            if (iM3263s2 < iM3263s) {
                iM3263s = iM3263s2;
            }
        }
        return iM3263s;
    }

    /* renamed from: B */
    private C0586c m3168B(C0592f c0592f) {
        int i4;
        int i5;
        int i6 = -1;
        if (m3172H(c0592f.f3868e)) {
            i4 = this.f3689a - 1;
            i5 = -1;
        } else {
            i4 = 0;
            i6 = this.f3689a;
            i5 = 1;
        }
        C0586c c0586c = null;
        if (c0592f.f3868e == 1) {
            int i7 = Integer.MAX_VALUE;
            int iMo3404m = this.f3691c.mo3404m();
            while (i4 != i6) {
                C0586c c0586c2 = this.f3690b[i4];
                int iM3259o = c0586c2.m3259o(iMo3404m);
                if (iM3259o < i7) {
                    c0586c = c0586c2;
                    i7 = iM3259o;
                }
                i4 += i5;
            }
            return c0586c;
        }
        int i8 = Integer.MIN_VALUE;
        int iMo3400i = this.f3691c.mo3400i();
        while (i4 != i6) {
            C0586c c0586c3 = this.f3690b[i4];
            int iM3263s = c0586c3.m3263s(iMo3400i);
            if (iM3263s > i8) {
                c0586c = c0586c3;
                i8 = iM3263s;
            }
            i4 += i5;
        }
        return c0586c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3169C(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3697i
            if (r0 == 0) goto L9
            int r0 = r6.m3215w()
            goto Ld
        L9:
            int r0 = r6.m3214v()
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
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f3701m
            r4.m3229h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3701m
            r9.m3231k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f3701m
            r7.m3230j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3701m
            r9.m3231k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3701m
            r9.m3230j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f3697i
            if (r7 == 0) goto L4d
            int r7 = r6.m3214v()
            goto L51
        L4d:
            int r7 = r6.m3215w()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3169C(int, int, int):void");
    }

    /* renamed from: F */
    private void m3170F(View view, LayoutParams layoutParams, boolean z3) {
        if (layoutParams.f3714f) {
            if (this.f3693e == 1) {
                measureChildWithDecorationsAndMargin(view, this.f3706r, RecyclerView.AbstractC0570o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z3);
                return;
            } else {
                measureChildWithDecorationsAndMargin(view, RecyclerView.AbstractC0570o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.f3706r, z3);
                return;
            }
        }
        if (this.f3693e == 1) {
            measureChildWithDecorationsAndMargin(view, RecyclerView.AbstractC0570o.getChildMeasureSpec(this.f3694f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.AbstractC0570o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z3);
        } else {
            measureChildWithDecorationsAndMargin(view, RecyclerView.AbstractC0570o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.AbstractC0570o.getChildMeasureSpec(this.f3694f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3171G(androidx.recyclerview.widget.RecyclerView.C0576u r9, androidx.recyclerview.widget.RecyclerView.C0580y r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3171G(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    /* renamed from: H */
    private boolean m3172H(int i4) {
        if (this.f3693e == 0) {
            return (i4 == -1) != this.f3697i;
        }
        return ((i4 == -1) == this.f3697i) == isLayoutRTL();
    }

    /* renamed from: J */
    private void m3173J(View view) {
        for (int i4 = this.f3689a - 1; i4 >= 0; i4--) {
            this.f3690b[i4].m3268x(view);
        }
    }

    /* renamed from: K */
    private void m3174K(RecyclerView.C0576u c0576u, C0592f c0592f) {
        if (!c0592f.f3864a || c0592f.f3872i) {
            return;
        }
        if (c0592f.f3865b == 0) {
            if (c0592f.f3868e == -1) {
                m3175L(c0576u, c0592f.f3870g);
                return;
            } else {
                m3176M(c0576u, c0592f.f3869f);
                return;
            }
        }
        if (c0592f.f3868e != -1) {
            int iM3199z = m3199z(c0592f.f3870g) - c0592f.f3870g;
            m3176M(c0576u, iM3199z < 0 ? c0592f.f3869f : Math.min(iM3199z, c0592f.f3865b) + c0592f.f3869f);
        } else {
            int i4 = c0592f.f3869f;
            int iM3198y = i4 - m3198y(i4);
            m3175L(c0576u, iM3198y < 0 ? c0592f.f3870g : c0592f.f3870g - Math.min(iM3198y, c0592f.f3865b));
        }
    }

    /* renamed from: L */
    private void m3175L(RecyclerView.C0576u c0576u, int i4) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f3691c.mo3398g(childAt) < i4 || this.f3691c.mo3408q(childAt) < i4) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f3714f) {
                for (int i5 = 0; i5 < this.f3689a; i5++) {
                    if (this.f3690b[i5].f3739a.size() == 1) {
                        return;
                    }
                }
                for (int i6 = 0; i6 < this.f3689a; i6++) {
                    this.f3690b[i6].m3266v();
                }
            } else if (layoutParams.f3713e.f3739a.size() == 1) {
                return;
            } else {
                layoutParams.f3713e.m3266v();
            }
            removeAndRecycleView(childAt, c0576u);
        }
    }

    /* renamed from: M */
    private void m3176M(RecyclerView.C0576u c0576u, int i4) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f3691c.mo3395d(childAt) > i4 || this.f3691c.mo3407p(childAt) > i4) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f3714f) {
                for (int i5 = 0; i5 < this.f3689a; i5++) {
                    if (this.f3690b[i5].f3739a.size() == 1) {
                        return;
                    }
                }
                for (int i6 = 0; i6 < this.f3689a; i6++) {
                    this.f3690b[i6].m3267w();
                }
            } else if (layoutParams.f3713e.f3739a.size() == 1) {
                return;
            } else {
                layoutParams.f3713e.m3267w();
            }
            removeAndRecycleView(childAt, c0576u);
        }
    }

    /* renamed from: N */
    private void m3177N() {
        if (this.f3692d.mo3402k() == 1073741824) {
            return;
        }
        float fMax = IGoodView.DEFAULT_TO_ALPHA;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            float fMo3396e = this.f3692d.mo3396e(childAt);
            if (fMo3396e >= fMax) {
                if (((LayoutParams) childAt.getLayoutParams()).m3217f()) {
                    fMo3396e = (fMo3396e * 1.0f) / this.f3689a;
                }
                fMax = Math.max(fMax, fMo3396e);
            }
        }
        int i5 = this.f3694f;
        int iRound = Math.round(fMax * this.f3689a);
        if (this.f3692d.mo3402k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f3692d.mo3405n());
        }
        m3205U(iRound);
        if (this.f3694f == i5) {
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (!layoutParams.f3714f) {
                if (isLayoutRTL() && this.f3693e == 1) {
                    int i7 = this.f3689a;
                    int i8 = layoutParams.f3713e.f3743e;
                    childAt2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f3694f) - ((-((i7 - 1) - i8)) * i5));
                } else {
                    int i9 = layoutParams.f3713e.f3743e;
                    int i10 = this.f3694f * i9;
                    int i11 = i9 * i5;
                    if (this.f3693e == 1) {
                        childAt2.offsetLeftAndRight(i10 - i11);
                    } else {
                        childAt2.offsetTopAndBottom(i10 - i11);
                    }
                }
            }
        }
    }

    /* renamed from: O */
    private void m3178O(int i4) {
        C0592f c0592f = this.f3695g;
        c0592f.f3868e = i4;
        c0592f.f3867d = this.f3697i != (i4 == -1) ? -1 : 1;
    }

    /* renamed from: P */
    private void m3179P(int i4, int i5) {
        for (int i6 = 0; i6 < this.f3689a; i6++) {
            if (!this.f3690b[i6].f3739a.isEmpty()) {
                m3182V(this.f3690b[i6], i4, i5);
            }
        }
    }

    /* renamed from: Q */
    private boolean m3180Q(RecyclerView.C0580y c0580y, C0585b c0585b) {
        c0585b.f3732a = this.f3703o ? m3194s(c0580y.m3161b()) : m3193n(c0580y.m3161b());
        c0585b.f3733b = Integer.MIN_VALUE;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3181T(int r5, androidx.recyclerview.widget.RecyclerView.C0580y r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f3695g
            r1 = 0
            r0.f3865b = r1
            r0.f3866c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.m3162c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.f3697i
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.j r5 = r4.f3691c
            int r5 = r5.mo3405n()
            goto L2f
        L25:
            androidx.recyclerview.widget.j r5 = r4.f3691c
            int r5 = r5.mo3405n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.f r0 = r4.f3695g
            androidx.recyclerview.widget.j r3 = r4.f3691c
            int r3 = r3.mo3404m()
            int r3 = r3 - r6
            r0.f3869f = r3
            androidx.recyclerview.widget.f r6 = r4.f3695g
            androidx.recyclerview.widget.j r0 = r4.f3691c
            int r0 = r0.mo3400i()
            int r0 = r0 + r5
            r6.f3870g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.f r0 = r4.f3695g
            androidx.recyclerview.widget.j r3 = r4.f3691c
            int r3 = r3.mo3399h()
            int r3 = r3 + r5
            r0.f3870g = r3
            androidx.recyclerview.widget.f r5 = r4.f3695g
            int r6 = -r6
            r5.f3869f = r6
        L5d:
            androidx.recyclerview.widget.f r5 = r4.f3695g
            r5.f3871h = r1
            r5.f3864a = r2
            androidx.recyclerview.widget.j r6 = r4.f3691c
            int r6 = r6.mo3402k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.j r6 = r4.f3691c
            int r6 = r6.mo3399h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f3872i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3181T(int, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    /* renamed from: V */
    private void m3182V(C0586c c0586c, int i4, int i5) {
        int iM3257m = c0586c.m3257m();
        if (i4 == -1) {
            if (c0586c.m3262r() + iM3257m <= i5) {
                this.f3698j.set(c0586c.f3743e, false);
            }
        } else if (c0586c.m3258n() - iM3257m >= i5) {
            this.f3698j.set(c0586c.f3743e, false);
        }
    }

    /* renamed from: W */
    private int m3183W(int i4, int i5, int i6) {
        if (i5 == 0 && i6 == 0) {
            return i4;
        }
        int mode = View.MeasureSpec.getMode(i4);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i5) - i6), mode) : i4;
    }

    /* renamed from: a */
    private void m3184a(View view) {
        for (int i4 = this.f3689a - 1; i4 >= 0; i4--) {
            this.f3690b[i4].m3245a(view);
        }
    }

    /* renamed from: b */
    private void m3185b(C0585b c0585b) {
        SavedState savedState = this.f3705q;
        int i4 = savedState.f3723c;
        if (i4 > 0) {
            if (i4 == this.f3689a) {
                for (int i5 = 0; i5 < this.f3689a; i5++) {
                    this.f3690b[i5].m3249e();
                    SavedState savedState2 = this.f3705q;
                    int iMo3400i = savedState2.f3724d[i5];
                    if (iMo3400i != Integer.MIN_VALUE) {
                        iMo3400i += savedState2.f3729i ? this.f3691c.mo3400i() : this.f3691c.mo3404m();
                    }
                    this.f3690b[i5].m3269y(iMo3400i);
                }
            } else {
                savedState.m3238b();
                SavedState savedState3 = this.f3705q;
                savedState3.f3721a = savedState3.f3722b;
            }
        }
        SavedState savedState4 = this.f3705q;
        this.f3704p = savedState4.f3730j;
        setReverseLayout(savedState4.f3728h);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.f3705q;
        int i6 = savedState5.f3721a;
        if (i6 != -1) {
            this.f3699k = i6;
            c0585b.f3734c = savedState5.f3729i;
        } else {
            c0585b.f3734c = this.f3697i;
        }
        if (savedState5.f3725e > 1) {
            LazySpanLookup lazySpanLookup = this.f3701m;
            lazySpanLookup.f3715a = savedState5.f3726f;
            lazySpanLookup.f3716b = savedState5.f3727g;
        }
    }

    private int computeScrollExtent(RecyclerView.C0580y c0580y) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0599m.m3421a(c0580y, this.f3691c, m3211p(!this.f3710v), m3210o(!this.f3710v), this, this.f3710v);
    }

    private int computeScrollOffset(RecyclerView.C0580y c0580y) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0599m.m3422b(c0580y, this.f3691c, m3211p(!this.f3710v), m3210o(!this.f3710v), this, this.f3710v, this.f3697i);
    }

    private int computeScrollRange(RecyclerView.C0580y c0580y) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0599m.m3423c(c0580y, this.f3691c, m3211p(!this.f3710v), m3210o(!this.f3710v), this, this.f3710v);
    }

    private int convertFocusDirectionToLayoutDirection(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 17 ? i4 != 33 ? i4 != 66 ? (i4 == 130 && this.f3693e == 1) ? 1 : Integer.MIN_VALUE : this.f3693e == 0 ? 1 : Integer.MIN_VALUE : this.f3693e == 1 ? -1 : Integer.MIN_VALUE : this.f3693e == 0 ? -1 : Integer.MIN_VALUE : (this.f3693e != 1 && isLayoutRTL()) ? -1 : 1 : (this.f3693e != 1 && isLayoutRTL()) ? 1 : -1;
    }

    /* renamed from: e */
    private void m3186e(View view, LayoutParams layoutParams, C0592f c0592f) {
        if (c0592f.f3868e == 1) {
            if (layoutParams.f3714f) {
                m3184a(view);
                return;
            } else {
                layoutParams.f3713e.m3245a(view);
                return;
            }
        }
        if (layoutParams.f3714f) {
            m3173J(view);
        } else {
            layoutParams.f3713e.m3268x(view);
        }
    }

    /* renamed from: f */
    private int m3187f(int i4) {
        if (getChildCount() == 0) {
            return this.f3697i ? 1 : -1;
        }
        return (i4 < m3214v()) != this.f3697i ? -1 : 1;
    }

    /* renamed from: h */
    private boolean m3188h(C0586c c0586c) {
        if (this.f3697i) {
            if (c0586c.m3258n() < this.f3691c.mo3400i()) {
                ArrayList<View> arrayList = c0586c.f3739a;
                return !c0586c.m3261q(arrayList.get(arrayList.size() - 1)).f3714f;
            }
        } else if (c0586c.m3262r() > this.f3691c.mo3404m()) {
            return !c0586c.m3261q(c0586c.f3739a.get(0)).f3714f;
        }
        return false;
    }

    /* renamed from: i */
    private LazySpanLookup.FullSpanItem m3189i(int i4) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3719c = new int[this.f3689a];
        for (int i5 = 0; i5 < this.f3689a; i5++) {
            fullSpanItem.f3719c[i5] = i4 - this.f3690b[i5].m3259o(i4);
        }
        return fullSpanItem;
    }

    /* renamed from: j */
    private LazySpanLookup.FullSpanItem m3190j(int i4) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3719c = new int[this.f3689a];
        for (int i5 = 0; i5 < this.f3689a; i5++) {
            fullSpanItem.f3719c[i5] = this.f3690b[i5].m3263s(i4) - i4;
        }
        return fullSpanItem;
    }

    /* renamed from: k */
    private void m3191k() {
        this.f3691c = AbstractC0596j.m3393b(this, this.f3693e);
        this.f3692d = AbstractC0596j.m3393b(this, 1 - this.f3693e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: l */
    private int m3192l(RecyclerView.C0576u c0576u, C0592f c0592f, RecyclerView.C0580y c0580y) {
        int i4;
        C0586c c0586cM3168B;
        int iMo3396e;
        int i5;
        int iMo3396e2;
        int iMo3396e3;
        ?? r9 = 0;
        this.f3698j.set(0, this.f3689a, true);
        if (this.f3695g.f3872i) {
            i4 = c0592f.f3868e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i4 = c0592f.f3868e == 1 ? c0592f.f3870g + c0592f.f3865b : c0592f.f3869f - c0592f.f3865b;
        }
        m3179P(c0592f.f3868e, i4);
        int iMo3400i = this.f3697i ? this.f3691c.mo3400i() : this.f3691c.mo3404m();
        boolean z3 = false;
        while (c0592f.m3375a(c0580y) && (this.f3695g.f3872i || !this.f3698j.isEmpty())) {
            View viewM3376b = c0592f.m3376b(c0576u);
            LayoutParams layoutParams = (LayoutParams) viewM3376b.getLayoutParams();
            int iM3017a = layoutParams.m3017a();
            int iM3228g = this.f3701m.m3228g(iM3017a);
            boolean z4 = iM3228g == -1;
            if (z4) {
                c0586cM3168B = layoutParams.f3714f ? this.f3690b[r9] : m3168B(c0592f);
                this.f3701m.m3232n(iM3017a, c0586cM3168B);
            } else {
                c0586cM3168B = this.f3690b[iM3228g];
            }
            C0586c c0586c = c0586cM3168B;
            layoutParams.f3713e = c0586c;
            if (c0592f.f3868e == 1) {
                addView(viewM3376b);
            } else {
                addView(viewM3376b, r9);
            }
            m3170F(viewM3376b, layoutParams, r9);
            if (c0592f.f3868e == 1) {
                int iM3197x = layoutParams.f3714f ? m3197x(iMo3400i) : c0586c.m3259o(iMo3400i);
                int iMo3396e4 = this.f3691c.mo3396e(viewM3376b) + iM3197x;
                if (z4 && layoutParams.f3714f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM3189i = m3189i(iM3197x);
                    fullSpanItemM3189i.f3718b = -1;
                    fullSpanItemM3189i.f3717a = iM3017a;
                    this.f3701m.m3222a(fullSpanItemM3189i);
                }
                i5 = iMo3396e4;
                iMo3396e = iM3197x;
            } else {
                int iM3167A = layoutParams.f3714f ? m3167A(iMo3400i) : c0586c.m3263s(iMo3400i);
                iMo3396e = iM3167A - this.f3691c.mo3396e(viewM3376b);
                if (z4 && layoutParams.f3714f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM3190j = m3190j(iM3167A);
                    fullSpanItemM3190j.f3718b = 1;
                    fullSpanItemM3190j.f3717a = iM3017a;
                    this.f3701m.m3222a(fullSpanItemM3190j);
                }
                i5 = iM3167A;
            }
            if (layoutParams.f3714f && c0592f.f3867d == -1) {
                if (z4) {
                    this.f3709u = true;
                } else {
                    if (!(c0592f.f3868e == 1 ? m3206c() : m3207d())) {
                        LazySpanLookup.FullSpanItem fullSpanItemM3227f = this.f3701m.m3227f(iM3017a);
                        if (fullSpanItemM3227f != null) {
                            fullSpanItemM3227f.f3720d = true;
                        }
                        this.f3709u = true;
                    }
                }
            }
            m3186e(viewM3376b, layoutParams, c0592f);
            if (isLayoutRTL() && this.f3693e == 1) {
                int iMo3400i2 = layoutParams.f3714f ? this.f3692d.mo3400i() : this.f3692d.mo3400i() - (((this.f3689a - 1) - c0586c.f3743e) * this.f3694f);
                iMo3396e3 = iMo3400i2;
                iMo3396e2 = iMo3400i2 - this.f3692d.mo3396e(viewM3376b);
            } else {
                int iMo3404m = layoutParams.f3714f ? this.f3692d.mo3404m() : (c0586c.f3743e * this.f3694f) + this.f3692d.mo3404m();
                iMo3396e2 = iMo3404m;
                iMo3396e3 = this.f3692d.mo3396e(viewM3376b) + iMo3404m;
            }
            if (this.f3693e == 1) {
                layoutDecoratedWithMargins(viewM3376b, iMo3396e2, iMo3396e, iMo3396e3, i5);
            } else {
                layoutDecoratedWithMargins(viewM3376b, iMo3396e, iMo3396e2, i5, iMo3396e3);
            }
            if (layoutParams.f3714f) {
                m3179P(this.f3695g.f3868e, i4);
            } else {
                m3182V(c0586c, this.f3695g.f3868e, i4);
            }
            m3174K(c0576u, this.f3695g);
            if (this.f3695g.f3871h && viewM3376b.hasFocusable()) {
                if (layoutParams.f3714f) {
                    this.f3698j.clear();
                } else {
                    this.f3698j.set(c0586c.f3743e, false);
                }
            }
            z3 = true;
            r9 = 0;
        }
        if (!z3) {
            m3174K(c0576u, this.f3695g);
        }
        int iMo3404m2 = this.f3695g.f3868e == -1 ? this.f3691c.mo3404m() - m3167A(this.f3691c.mo3404m()) : m3197x(this.f3691c.mo3400i()) - this.f3691c.mo3400i();
        if (iMo3404m2 > 0) {
            return Math.min(c0592f.f3865b, iMo3404m2);
        }
        return 0;
    }

    private void measureChildWithDecorationsAndMargin(View view, int i4, int i5, boolean z3) {
        calculateItemDecorationsForChild(view, this.f3707s);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.f3707s;
        int iM3183W = m3183W(i4, i6 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.f3707s;
        int iM3183W2 = m3183W(i5, i7 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z3 ? shouldReMeasureChild(view, iM3183W, iM3183W2, layoutParams) : shouldMeasureChild(view, iM3183W, iM3183W2, layoutParams)) {
            view.measure(iM3183W, iM3183W2);
        }
    }

    /* renamed from: n */
    private int m3193n(int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            int position = getPosition(getChildAt(i5));
            if (position >= 0 && position < i4) {
                return position;
            }
        }
        return 0;
    }

    private void resolveShouldLayoutReverse() {
        if (this.f3693e == 1 || !isLayoutRTL()) {
            this.f3697i = this.f3696h;
        } else {
            this.f3697i = !this.f3696h;
        }
    }

    /* renamed from: s */
    private int m3194s(int i4) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i4) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: t */
    private void m3195t(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, boolean z3) {
        int iMo3400i;
        int iM3197x = m3197x(Integer.MIN_VALUE);
        if (iM3197x != Integer.MIN_VALUE && (iMo3400i = this.f3691c.mo3400i() - iM3197x) > 0) {
            int i4 = iMo3400i - (-scrollBy(-iMo3400i, c0576u, c0580y));
            if (!z3 || i4 <= 0) {
                return;
            }
            this.f3691c.mo3409r(i4);
        }
    }

    /* renamed from: u */
    private void m3196u(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, boolean z3) {
        int iMo3404m;
        int iM3167A = m3167A(Integer.MAX_VALUE);
        if (iM3167A != Integer.MAX_VALUE && (iMo3404m = iM3167A - this.f3691c.mo3404m()) > 0) {
            int iScrollBy = iMo3404m - scrollBy(iMo3404m, c0576u, c0580y);
            if (!z3 || iScrollBy <= 0) {
                return;
            }
            this.f3691c.mo3409r(-iScrollBy);
        }
    }

    /* renamed from: x */
    private int m3197x(int i4) {
        int iM3259o = this.f3690b[0].m3259o(i4);
        for (int i5 = 1; i5 < this.f3689a; i5++) {
            int iM3259o2 = this.f3690b[i5].m3259o(i4);
            if (iM3259o2 > iM3259o) {
                iM3259o = iM3259o2;
            }
        }
        return iM3259o;
    }

    /* renamed from: y */
    private int m3198y(int i4) {
        int iM3263s = this.f3690b[0].m3263s(i4);
        for (int i5 = 1; i5 < this.f3689a; i5++) {
            int iM3263s2 = this.f3690b[i5].m3263s(i4);
            if (iM3263s2 > iM3263s) {
                iM3263s = iM3263s2;
            }
        }
        return iM3263s;
    }

    /* renamed from: z */
    private int m3199z(int i4) {
        int iM3259o = this.f3690b[0].m3259o(i4);
        for (int i5 = 1; i5 < this.f3689a; i5++) {
            int iM3259o2 = this.f3690b[i5].m3259o(i4);
            if (iM3259o2 < iM3259o) {
                iM3259o = iM3259o2;
            }
        }
        return iM3259o;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View m3200D() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3689a
            r2.<init>(r3)
            int r3 = r12.f3689a
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3693e
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.f3697i
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f3713e
            int r9 = r9.f3743e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f3713e
            boolean r9 = r12.m3188h(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f3713e
            int r9 = r9.f3743e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f3714f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f3697i
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.j r10 = r12.f3691c
            int r10 = r10.mo3395d(r7)
            androidx.recyclerview.widget.j r11 = r12.f3691c
            int r11 = r11.mo3395d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.j r10 = r12.f3691c
            int r10 = r10.mo3398g(r7)
            androidx.recyclerview.widget.j r11 = r12.f3691c
            int r11 = r11.mo3398g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = r8.f3713e
            int r8 = r8.f3743e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.f3713e
            int r9 = r9.f3743e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3200D():android.view.View");
    }

    /* renamed from: E */
    public void m3201E() {
        this.f3701m.m3223b();
        requestLayout();
    }

    /* renamed from: I */
    void m3202I(int i4, RecyclerView.C0580y c0580y) {
        int iM3214v;
        int i5;
        if (i4 > 0) {
            iM3214v = m3215w();
            i5 = 1;
        } else {
            iM3214v = m3214v();
            i5 = -1;
        }
        this.f3695g.f3864a = true;
        m3181T(iM3214v, c0580y);
        m3178O(i5);
        C0592f c0592f = this.f3695g;
        c0592f.f3866c = iM3214v + c0592f.f3867d;
        c0592f.f3865b = Math.abs(i4);
    }

    /* renamed from: R */
    boolean m3203R(RecyclerView.C0580y c0580y, C0585b c0585b) {
        int i4;
        if (!c0580y.m3164e() && (i4 = this.f3699k) != -1) {
            if (i4 >= 0 && i4 < c0580y.m3161b()) {
                SavedState savedState = this.f3705q;
                if (savedState == null || savedState.f3721a == -1 || savedState.f3723c < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f3699k);
                    if (viewFindViewByPosition != null) {
                        c0585b.f3732a = this.f3697i ? m3215w() : m3214v();
                        if (this.f3700l != Integer.MIN_VALUE) {
                            if (c0585b.f3734c) {
                                c0585b.f3733b = (this.f3691c.mo3400i() - this.f3700l) - this.f3691c.mo3395d(viewFindViewByPosition);
                            } else {
                                c0585b.f3733b = (this.f3691c.mo3404m() + this.f3700l) - this.f3691c.mo3398g(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.f3691c.mo3396e(viewFindViewByPosition) > this.f3691c.mo3405n()) {
                            c0585b.f3733b = c0585b.f3734c ? this.f3691c.mo3400i() : this.f3691c.mo3404m();
                            return true;
                        }
                        int iMo3398g = this.f3691c.mo3398g(viewFindViewByPosition) - this.f3691c.mo3404m();
                        if (iMo3398g < 0) {
                            c0585b.f3733b = -iMo3398g;
                            return true;
                        }
                        int iMo3400i = this.f3691c.mo3400i() - this.f3691c.mo3395d(viewFindViewByPosition);
                        if (iMo3400i < 0) {
                            c0585b.f3733b = iMo3400i;
                            return true;
                        }
                        c0585b.f3733b = Integer.MIN_VALUE;
                    } else {
                        int i5 = this.f3699k;
                        c0585b.f3732a = i5;
                        int i6 = this.f3700l;
                        if (i6 == Integer.MIN_VALUE) {
                            c0585b.f3734c = m3187f(i5) == 1;
                            c0585b.m3241a();
                        } else {
                            c0585b.m3242b(i6);
                        }
                        c0585b.f3735d = true;
                    }
                } else {
                    c0585b.f3733b = Integer.MIN_VALUE;
                    c0585b.f3732a = this.f3699k;
                }
                return true;
            }
            this.f3699k = -1;
            this.f3700l = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: S */
    void m3204S(RecyclerView.C0580y c0580y, C0585b c0585b) {
        if (m3203R(c0580y, c0585b) || m3180Q(c0580y, c0585b)) {
            return;
        }
        c0585b.m3241a();
        c0585b.f3732a = 0;
    }

    /* renamed from: U */
    void m3205U(int i4) {
        this.f3694f = i4 / this.f3689a;
        this.f3706r = View.MeasureSpec.makeMeasureSpec(i4, this.f3692d.mo3402k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f3705q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* renamed from: c */
    boolean m3206c() {
        int iM3259o = this.f3690b[0].m3259o(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.f3689a; i4++) {
            if (this.f3690b[i4].m3259o(Integer.MIN_VALUE) != iM3259o) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean canScrollHorizontally() {
        return this.f3693e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean canScrollVertically() {
        return this.f3693e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void collectAdjacentPrefetchPositions(int i4, int i5, RecyclerView.C0580y c0580y, RecyclerView.AbstractC0570o.c cVar) {
        int iM3259o;
        int iM3263s;
        if (this.f3693e != 0) {
            i4 = i5;
        }
        if (getChildCount() == 0 || i4 == 0) {
            return;
        }
        m3202I(i4, c0580y);
        int[] iArr = this.f3711w;
        if (iArr == null || iArr.length < this.f3689a) {
            this.f3711w = new int[this.f3689a];
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f3689a; i7++) {
            C0592f c0592f = this.f3695g;
            if (c0592f.f3867d == -1) {
                iM3259o = c0592f.f3869f;
                iM3263s = this.f3690b[i7].m3263s(iM3259o);
            } else {
                iM3259o = this.f3690b[i7].m3259o(c0592f.f3870g);
                iM3263s = this.f3695g.f3870g;
            }
            int i8 = iM3259o - iM3263s;
            if (i8 >= 0) {
                this.f3711w[i6] = i8;
                i6++;
            }
        }
        Arrays.sort(this.f3711w, 0, i6);
        for (int i9 = 0; i9 < i6 && this.f3695g.m3375a(c0580y); i9++) {
            cVar.mo3096a(this.f3695g.f3866c, this.f3711w[i9]);
            C0592f c0592f2 = this.f3695g;
            c0592f2.f3866c += c0592f2.f3867d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeHorizontalScrollExtent(RecyclerView.C0580y c0580y) {
        return computeScrollExtent(c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeHorizontalScrollOffset(RecyclerView.C0580y c0580y) {
        return computeScrollOffset(c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeHorizontalScrollRange(RecyclerView.C0580y c0580y) {
        return computeScrollRange(c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579x.b
    public PointF computeScrollVectorForPosition(int i4) {
        int iM3187f = m3187f(i4);
        PointF pointF = new PointF();
        if (iM3187f == 0) {
            return null;
        }
        if (this.f3693e == 0) {
            pointF.x = iM3187f;
            pointF.y = IGoodView.DEFAULT_TO_ALPHA;
        } else {
            pointF.x = IGoodView.DEFAULT_TO_ALPHA;
            pointF.y = iM3187f;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeVerticalScrollExtent(RecyclerView.C0580y c0580y) {
        return computeScrollExtent(c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeVerticalScrollOffset(RecyclerView.C0580y c0580y) {
        return computeScrollOffset(c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int computeVerticalScrollRange(RecyclerView.C0580y c0580y) {
        return computeScrollRange(c0580y);
    }

    /* renamed from: d */
    boolean m3207d() {
        int iM3263s = this.f3690b[0].m3263s(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.f3689a; i4++) {
            if (this.f3690b[i4].m3263s(Integer.MIN_VALUE) != iM3263s) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    boolean m3208g() {
        int iM3214v;
        int iM3215w;
        if (getChildCount() == 0 || this.f3702n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f3697i) {
            iM3214v = m3215w();
            iM3215w = m3214v();
        } else {
            iM3214v = m3214v();
            iM3215w = m3215w();
        }
        if (iM3214v == 0 && m3200D() != null) {
            this.f3701m.m3223b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f3709u) {
            return false;
        }
        int i4 = this.f3697i ? -1 : 1;
        int i5 = iM3215w + 1;
        LazySpanLookup.FullSpanItem fullSpanItemM3226e = this.f3701m.m3226e(iM3214v, i5, i4, true);
        if (fullSpanItemM3226e == null) {
            this.f3709u = false;
            this.f3701m.m3225d(i5);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemM3226e2 = this.f3701m.m3226e(iM3214v, fullSpanItemM3226e.f3717a, i4 * (-1), true);
        if (fullSpanItemM3226e2 == null) {
            this.f3701m.m3225d(fullSpanItemM3226e.f3717a);
        } else {
            this.f3701m.m3225d(fullSpanItemM3226e2.f3717a + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.f3693e == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int getColumnCountForAccessibility(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        return this.f3693e == 1 ? this.f3689a : super.getColumnCountForAccessibility(c0576u, c0580y);
    }

    public int getOrientation() {
        return this.f3693e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int getRowCountForAccessibility(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        return this.f3693e == 0 ? this.f3689a : super.getRowCountForAccessibility(c0576u, c0580y);
    }

    public int getSpanCount() {
        return this.f3689a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean isAutoMeasureEnabled() {
        return this.f3702n != 0;
    }

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: m */
    public int[] m3209m(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3689a];
        } else if (iArr.length < this.f3689a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3689a + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.f3689a; i4++) {
            iArr[i4] = this.f3690b[i4].m3250f();
        }
        return iArr;
    }

    /* renamed from: o */
    View m3210o(boolean z3) {
        int iMo3404m = this.f3691c.mo3404m();
        int iMo3400i = this.f3691c.mo3400i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iMo3398g = this.f3691c.mo3398g(childAt);
            int iMo3395d = this.f3691c.mo3395d(childAt);
            if (iMo3395d > iMo3404m && iMo3398g < iMo3400i) {
                if (iMo3395d <= iMo3400i || !z3) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void offsetChildrenHorizontal(int i4) {
        super.offsetChildrenHorizontal(i4);
        for (int i5 = 0; i5 < this.f3689a; i5++) {
            this.f3690b[i5].m3265u(i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void offsetChildrenVertical(int i4) {
        super.offsetChildrenVertical(i4);
        for (int i5 = 0; i5 < this.f3689a; i5++) {
            this.f3690b[i5].m3265u(i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0576u c0576u) {
        super.onDetachedFromWindow(recyclerView, c0576u);
        removeCallbacks(this.f3712x);
        for (int i4 = 0; i4 < this.f3689a; i4++) {
            this.f3690b[i4].m3249e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public View onFocusSearchFailed(View view, int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        View viewFindContainingItemView;
        View viewM3260p;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i4);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewFindContainingItemView.getLayoutParams();
        boolean z3 = layoutParams.f3714f;
        C0586c c0586c = layoutParams.f3713e;
        int iM3215w = iConvertFocusDirectionToLayoutDirection == 1 ? m3215w() : m3214v();
        m3181T(iM3215w, c0580y);
        m3178O(iConvertFocusDirectionToLayoutDirection);
        C0592f c0592f = this.f3695g;
        c0592f.f3866c = c0592f.f3867d + iM3215w;
        c0592f.f3865b = (int) (this.f3691c.mo3405n() * 0.33333334f);
        C0592f c0592f2 = this.f3695g;
        c0592f2.f3871h = true;
        c0592f2.f3864a = false;
        m3192l(c0576u, c0592f2, c0580y);
        this.f3703o = this.f3697i;
        if (!z3 && (viewM3260p = c0586c.m3260p(iM3215w, iConvertFocusDirectionToLayoutDirection)) != null && viewM3260p != viewFindContainingItemView) {
            return viewM3260p;
        }
        if (m3172H(iConvertFocusDirectionToLayoutDirection)) {
            for (int i5 = this.f3689a - 1; i5 >= 0; i5--) {
                View viewM3260p2 = this.f3690b[i5].m3260p(iM3215w, iConvertFocusDirectionToLayoutDirection);
                if (viewM3260p2 != null && viewM3260p2 != viewFindContainingItemView) {
                    return viewM3260p2;
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f3689a; i6++) {
                View viewM3260p3 = this.f3690b[i6].m3260p(iM3215w, iConvertFocusDirectionToLayoutDirection);
                if (viewM3260p3 != null && viewM3260p3 != viewFindContainingItemView) {
                    return viewM3260p3;
                }
            }
        }
        boolean z4 = (this.f3696h ^ true) == (iConvertFocusDirectionToLayoutDirection == -1);
        if (!z3) {
            View viewFindViewByPosition = findViewByPosition(z4 ? c0586c.m3251g() : c0586c.m3253i());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (m3172H(iConvertFocusDirectionToLayoutDirection)) {
            for (int i7 = this.f3689a - 1; i7 >= 0; i7--) {
                if (i7 != c0586c.f3743e) {
                    View viewFindViewByPosition2 = findViewByPosition(z4 ? this.f3690b[i7].m3251g() : this.f3690b[i7].m3253i());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i8 = 0; i8 < this.f3689a; i8++) {
                View viewFindViewByPosition3 = findViewByPosition(z4 ? this.f3690b[i8].m3251g() : this.f3690b[i8].m3253i());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM3211p = m3211p(false);
            View viewM3210o = m3210o(false);
            if (viewM3211p == null || viewM3210o == null) {
                return;
            }
            int position = getPosition(viewM3211p);
            int position2 = getPosition(viewM3210o);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y, View view, C1050c c1050c) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c1050c);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.f3693e == 0) {
            c1050c.m4884f0(C1050c.c.m4923a(layoutParams2.m3216e(), layoutParams2.f3714f ? this.f3689a : 1, -1, -1, false, false));
        } else {
            c1050c.m4884f0(C1050c.c.m4923a(-1, -1, layoutParams2.m3216e(), layoutParams2.f3714f ? this.f3689a : 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onItemsAdded(RecyclerView recyclerView, int i4, int i5) {
        m3169C(i4, i5, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f3701m.m3223b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onItemsMoved(RecyclerView recyclerView, int i4, int i5, int i6) {
        m3169C(i4, i5, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onItemsRemoved(RecyclerView recyclerView, int i4, int i5) {
        m3169C(i4, i5, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onItemsUpdated(RecyclerView recyclerView, int i4, int i5, Object obj) {
        m3169C(i4, i5, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onLayoutChildren(RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        m3171G(c0576u, c0580y, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onLayoutCompleted(RecyclerView.C0580y c0580y) {
        super.onLayoutCompleted(c0580y);
        this.f3699k = -1;
        this.f3700l = Integer.MIN_VALUE;
        this.f3705q = null;
        this.f3708t.m3243c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f3705q = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public Parcelable onSaveInstanceState() {
        int iM3263s;
        int iMo3404m;
        int[] iArr;
        if (this.f3705q != null) {
            return new SavedState(this.f3705q);
        }
        SavedState savedState = new SavedState();
        savedState.f3728h = this.f3696h;
        savedState.f3729i = this.f3703o;
        savedState.f3730j = this.f3704p;
        LazySpanLookup lazySpanLookup = this.f3701m;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f3715a) == null) {
            savedState.f3725e = 0;
        } else {
            savedState.f3726f = iArr;
            savedState.f3725e = iArr.length;
            savedState.f3727g = lazySpanLookup.f3716b;
        }
        if (getChildCount() > 0) {
            savedState.f3721a = this.f3703o ? m3215w() : m3214v();
            savedState.f3722b = m3212q();
            int i4 = this.f3689a;
            savedState.f3723c = i4;
            savedState.f3724d = new int[i4];
            for (int i5 = 0; i5 < this.f3689a; i5++) {
                if (this.f3703o) {
                    iM3263s = this.f3690b[i5].m3259o(Integer.MIN_VALUE);
                    if (iM3263s != Integer.MIN_VALUE) {
                        iMo3404m = this.f3691c.mo3400i();
                        iM3263s -= iMo3404m;
                    }
                } else {
                    iM3263s = this.f3690b[i5].m3263s(Integer.MIN_VALUE);
                    if (iM3263s != Integer.MIN_VALUE) {
                        iMo3404m = this.f3691c.mo3404m();
                        iM3263s -= iMo3404m;
                    }
                }
                savedState.f3724d[i5] = iM3263s;
            }
        } else {
            savedState.f3721a = -1;
            savedState.f3722b = -1;
            savedState.f3723c = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void onScrollStateChanged(int i4) {
        if (i4 == 0) {
            m3208g();
        }
    }

    /* renamed from: p */
    View m3211p(boolean z3) {
        int iMo3404m = this.f3691c.mo3404m();
        int iMo3400i = this.f3691c.mo3400i();
        int childCount = getChildCount();
        View view = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int iMo3398g = this.f3691c.mo3398g(childAt);
            if (this.f3691c.mo3395d(childAt) > iMo3404m && iMo3398g < iMo3400i) {
                if (iMo3398g >= iMo3404m || !z3) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: q */
    int m3212q() {
        View viewM3210o = this.f3697i ? m3210o(true) : m3211p(true);
        if (viewM3210o == null) {
            return -1;
        }
        return getPosition(viewM3210o);
    }

    /* renamed from: r */
    public int[] m3213r(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3689a];
        } else if (iArr.length < this.f3689a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3689a + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.f3689a; i4++) {
            iArr[i4] = this.f3690b[i4].m3252h();
        }
        return iArr;
    }

    int scrollBy(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        m3202I(i4, c0580y);
        int iM3192l = m3192l(c0576u, this.f3695g, c0580y);
        if (this.f3695g.f3865b >= iM3192l) {
            i4 = i4 < 0 ? -iM3192l : iM3192l;
        }
        this.f3691c.mo3409r(-i4);
        this.f3703o = this.f3697i;
        C0592f c0592f = this.f3695g;
        c0592f.f3865b = 0;
        m3174K(c0576u, c0592f);
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int scrollHorizontallyBy(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        return scrollBy(i4, c0576u, c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void scrollToPosition(int i4) {
        SavedState savedState = this.f3705q;
        if (savedState != null && savedState.f3721a != i4) {
            savedState.m3237a();
        }
        this.f3699k = i4;
        this.f3700l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public int scrollVerticallyBy(int i4, RecyclerView.C0576u c0576u, RecyclerView.C0580y c0580y) {
        return scrollBy(i4, c0576u, c0580y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void setMeasuredDimension(Rect rect, int i4, int i5) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f3693e == 1) {
            iChooseSize2 = RecyclerView.AbstractC0570o.chooseSize(i5, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.AbstractC0570o.chooseSize(i4, (this.f3694f * this.f3689a) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC0570o.chooseSize(i4, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.AbstractC0570o.chooseSize(i5, (this.f3694f * this.f3689a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i4 == this.f3693e) {
            return;
        }
        this.f3693e = i4;
        AbstractC0596j abstractC0596j = this.f3691c;
        this.f3691c = this.f3692d;
        this.f3692d = abstractC0596j;
        requestLayout();
    }

    public void setReverseLayout(boolean z3) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f3705q;
        if (savedState != null && savedState.f3728h != z3) {
            savedState.f3728h = z3;
        }
        this.f3696h = z3;
        requestLayout();
    }

    public void setSpanCount(int i4) {
        assertNotInLayoutOrScroll(null);
        if (i4 != this.f3689a) {
            m3201E();
            this.f3689a = i4;
            this.f3698j = new BitSet(this.f3689a);
            this.f3690b = new C0586c[this.f3689a];
            for (int i5 = 0; i5 < this.f3689a; i5++) {
                this.f3690b[i5] = new C0586c(i5);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0580y c0580y, int i4) {
        C0593g c0593g = new C0593g(recyclerView.getContext());
        c0593g.setTargetPosition(i4);
        startSmoothScroll(c0593g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public boolean supportsPredictiveItemAnimations() {
        return this.f3705q == null;
    }

    /* renamed from: v */
    int m3214v() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* renamed from: w */
    int m3215w() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0570o
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    static class LazySpanLookup {

        /* renamed from: a */
        int[] f3715a;

        /* renamed from: b */
        List<FullSpanItem> f3716b;

        LazySpanLookup() {
        }

        /* renamed from: i */
        private int m3219i(int i4) {
            if (this.f3716b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemM3227f = m3227f(i4);
            if (fullSpanItemM3227f != null) {
                this.f3716b.remove(fullSpanItemM3227f);
            }
            int size = this.f3716b.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    i5 = -1;
                    break;
                }
                if (this.f3716b.get(i5).f3717a >= i4) {
                    break;
                }
                i5++;
            }
            if (i5 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f3716b.get(i5);
            this.f3716b.remove(i5);
            return fullSpanItem.f3717a;
        }

        /* renamed from: l */
        private void m3220l(int i4, int i5) {
            List<FullSpanItem> list = this.f3716b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3716b.get(size);
                int i6 = fullSpanItem.f3717a;
                if (i6 >= i4) {
                    fullSpanItem.f3717a = i6 + i5;
                }
            }
        }

        /* renamed from: m */
        private void m3221m(int i4, int i5) {
            List<FullSpanItem> list = this.f3716b;
            if (list == null) {
                return;
            }
            int i6 = i4 + i5;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3716b.get(size);
                int i7 = fullSpanItem.f3717a;
                if (i7 >= i4) {
                    if (i7 < i6) {
                        this.f3716b.remove(size);
                    } else {
                        fullSpanItem.f3717a = i7 - i5;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m3222a(FullSpanItem fullSpanItem) {
            if (this.f3716b == null) {
                this.f3716b = new ArrayList();
            }
            int size = this.f3716b.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem2 = this.f3716b.get(i4);
                if (fullSpanItem2.f3717a == fullSpanItem.f3717a) {
                    this.f3716b.remove(i4);
                }
                if (fullSpanItem2.f3717a >= fullSpanItem.f3717a) {
                    this.f3716b.add(i4, fullSpanItem);
                    return;
                }
            }
            this.f3716b.add(fullSpanItem);
        }

        /* renamed from: b */
        void m3223b() {
            int[] iArr = this.f3715a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3716b = null;
        }

        /* renamed from: c */
        void m3224c(int i4) {
            int[] iArr = this.f3715a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i4, 10) + 1];
                this.f3715a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[m3233o(i4)];
                this.f3715a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3715a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        int m3225d(int i4) {
            List<FullSpanItem> list = this.f3716b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3716b.get(size).f3717a >= i4) {
                        this.f3716b.remove(size);
                    }
                }
            }
            return m3229h(i4);
        }

        /* renamed from: e */
        public FullSpanItem m3226e(int i4, int i5, int i6, boolean z3) {
            List<FullSpanItem> list = this.f3716b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                FullSpanItem fullSpanItem = this.f3716b.get(i7);
                int i8 = fullSpanItem.f3717a;
                if (i8 >= i5) {
                    return null;
                }
                if (i8 >= i4 && (i6 == 0 || fullSpanItem.f3718b == i6 || (z3 && fullSpanItem.f3720d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem m3227f(int i4) {
            List<FullSpanItem> list = this.f3716b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3716b.get(size);
                if (fullSpanItem.f3717a == i4) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: g */
        int m3228g(int i4) {
            int[] iArr = this.f3715a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            return iArr[i4];
        }

        /* renamed from: h */
        int m3229h(int i4) {
            int[] iArr = this.f3715a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            int iM3219i = m3219i(i4);
            if (iM3219i == -1) {
                int[] iArr2 = this.f3715a;
                Arrays.fill(iArr2, i4, iArr2.length, -1);
                return this.f3715a.length;
            }
            int i5 = iM3219i + 1;
            Arrays.fill(this.f3715a, i4, i5, -1);
            return i5;
        }

        /* renamed from: j */
        void m3230j(int i4, int i5) {
            int[] iArr = this.f3715a;
            if (iArr == null || i4 >= iArr.length) {
                return;
            }
            int i6 = i4 + i5;
            m3224c(i6);
            int[] iArr2 = this.f3715a;
            System.arraycopy(iArr2, i4, iArr2, i6, (iArr2.length - i4) - i5);
            Arrays.fill(this.f3715a, i4, i6, -1);
            m3220l(i4, i5);
        }

        /* renamed from: k */
        void m3231k(int i4, int i5) {
            int[] iArr = this.f3715a;
            if (iArr == null || i4 >= iArr.length) {
                return;
            }
            int i6 = i4 + i5;
            m3224c(i6);
            int[] iArr2 = this.f3715a;
            System.arraycopy(iArr2, i6, iArr2, i4, (iArr2.length - i4) - i5);
            int[] iArr3 = this.f3715a;
            Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
            m3221m(i4, i5);
        }

        /* renamed from: n */
        void m3232n(int i4, C0586c c0586c) {
            m3224c(i4);
            this.f3715a[i4] = c0586c.f3743e;
        }

        /* renamed from: o */
        int m3233o(int i4) {
            int length = this.f3715a.length;
            while (length <= i4) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0582a();

            /* renamed from: a */
            int f3717a;

            /* renamed from: b */
            int f3718b;

            /* renamed from: c */
            int[] f3719c;

            /* renamed from: d */
            boolean f3720d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            static class C0582a implements Parcelable.Creator<FullSpanItem> {
                C0582a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i4) {
                    return new FullSpanItem[i4];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f3717a = parcel.readInt();
                this.f3718b = parcel.readInt();
                this.f3720d = parcel.readInt() == 1;
                int i4 = parcel.readInt();
                if (i4 > 0) {
                    int[] iArr = new int[i4];
                    this.f3719c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            int m3234a(int i4) {
                int[] iArr = this.f3719c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i4];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3717a + ", mGapDir=" + this.f3718b + ", mHasUnwantedGapAfter=" + this.f3720d + ", mGapPerSpan=" + Arrays.toString(this.f3719c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i4) {
                parcel.writeInt(this.f3717a);
                parcel.writeInt(this.f3718b);
                parcel.writeInt(this.f3720d ? 1 : 0);
                int[] iArr = this.f3719c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f3719c);
                }
            }

            FullSpanItem() {
            }
        }
    }
}
