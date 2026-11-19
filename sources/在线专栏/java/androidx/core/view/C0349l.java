package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.l */
/* loaded from: classes.dex */
public class C0349l {

    /* renamed from: a */
    private ViewParent f2738a;

    /* renamed from: b */
    private ViewParent f2739b;

    /* renamed from: c */
    private final View f2740c;

    /* renamed from: d */
    private boolean f2741d;

    /* renamed from: e */
    private int[] f2742e;

    public C0349l(View view) {
        this.f2740c = view;
    }

    /* renamed from: h */
    private boolean m1949h(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent viewParentM1950i;
        int i9;
        int i10;
        int[] iArr3;
        if (!m1962m() || (viewParentM1950i = m1950i(i8)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2740c.getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM1951j = m1951j();
            iArrM1951j[0] = 0;
            iArrM1951j[1] = 0;
            iArr3 = iArrM1951j;
        } else {
            iArr3 = iArr2;
        }
        C0361x.m2115d(viewParentM1950i, this.f2740c, i4, i5, i6, i7, i8, iArr3);
        if (iArr != null) {
            this.f2740c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    /* renamed from: i */
    private ViewParent m1950i(int i4) {
        if (i4 == 0) {
            return this.f2738a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f2739b;
    }

    /* renamed from: j */
    private int[] m1951j() {
        if (this.f2742e == null) {
            this.f2742e = new int[2];
        }
        return this.f2742e;
    }

    /* renamed from: o */
    private void m1952o(int i4, ViewParent viewParent) {
        if (i4 == 0) {
            this.f2738a = viewParent;
        } else {
            if (i4 != 1) {
                return;
            }
            this.f2739b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean m1953a(float f4, float f5, boolean z3) {
        ViewParent viewParentM1950i;
        if (!m1962m() || (viewParentM1950i = m1950i(0)) == null) {
            return false;
        }
        return C0361x.m2112a(viewParentM1950i, this.f2740c, f4, f5, z3);
    }

    /* renamed from: b */
    public boolean m1954b(float f4, float f5) {
        ViewParent viewParentM1950i;
        if (!m1962m() || (viewParentM1950i = m1950i(0)) == null) {
            return false;
        }
        return C0361x.m2113b(viewParentM1950i, this.f2740c, f4, f5);
    }

    /* renamed from: c */
    public boolean m1955c(int i4, int i5, int[] iArr, int[] iArr2) {
        return m1956d(i4, i5, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m1956d(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        ViewParent viewParentM1950i;
        int i7;
        int i8;
        if (!m1962m() || (viewParentM1950i = m1950i(i6)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f2740c.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            iArr = m1951j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0361x.m2114c(viewParentM1950i, this.f2740c, i4, i5, iArr, i6);
        if (iArr2 != null) {
            this.f2740c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public void m1957e(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        m1949h(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    /* renamed from: f */
    public boolean m1958f(int i4, int i5, int i6, int i7, int[] iArr) {
        return m1949h(i4, i5, i6, i7, iArr, 0, null);
    }

    /* renamed from: g */
    public boolean m1959g(int i4, int i5, int i6, int i7, int[] iArr, int i8) {
        return m1949h(i4, i5, i6, i7, iArr, i8, null);
    }

    /* renamed from: k */
    public boolean m1960k() {
        return m1961l(0);
    }

    /* renamed from: l */
    public boolean m1961l(int i4) {
        return m1950i(i4) != null;
    }

    /* renamed from: m */
    public boolean m1962m() {
        return this.f2741d;
    }

    /* renamed from: n */
    public void m1963n(boolean z3) {
        if (this.f2741d) {
            C0358u.m2003M0(this.f2740c);
        }
        this.f2741d = z3;
    }

    /* renamed from: p */
    public boolean m1964p(int i4) {
        return m1965q(i4, 0);
    }

    /* renamed from: q */
    public boolean m1965q(int i4, int i5) {
        if (m1961l(i5)) {
            return true;
        }
        if (!m1962m()) {
            return false;
        }
        View view = this.f2740c;
        for (ViewParent parent = this.f2740c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0361x.m2117f(parent, view, this.f2740c, i4, i5)) {
                m1952o(i5, parent);
                C0361x.m2116e(parent, view, this.f2740c, i4, i5);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void m1966r() {
        m1967s(0);
    }

    /* renamed from: s */
    public void m1967s(int i4) {
        ViewParent viewParentM1950i = m1950i(i4);
        if (viewParentM1950i != null) {
            C0361x.m2118g(viewParentM1950i, this.f2740c, i4);
            m1952o(i4, null);
        }
    }
}
