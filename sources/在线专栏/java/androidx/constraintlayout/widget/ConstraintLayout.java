package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.http2.Http2Connection;
import p121n.C2868d;
import p121n.C2869e;
import p121n.C2870f;
import p121n.C2872h;
import p125o.C2892b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray<View> f1827a;

    /* renamed from: b */
    private ArrayList<ConstraintHelper> f1828b;

    /* renamed from: c */
    protected C2870f f1829c;

    /* renamed from: d */
    private int f1830d;

    /* renamed from: e */
    private int f1831e;

    /* renamed from: f */
    private int f1832f;

    /* renamed from: g */
    private int f1833g;

    /* renamed from: h */
    protected boolean f1834h;

    /* renamed from: i */
    private int f1835i;

    /* renamed from: j */
    private C0295c f1836j;

    /* renamed from: k */
    protected C0294b f1837k;

    /* renamed from: l */
    private int f1838l;

    /* renamed from: m */
    private HashMap<String, Integer> f1839m;

    /* renamed from: n */
    private int f1840n;

    /* renamed from: o */
    private int f1841o;

    /* renamed from: p */
    int f1842p;

    /* renamed from: q */
    int f1843q;

    /* renamed from: r */
    int f1844r;

    /* renamed from: s */
    int f1845s;

    /* renamed from: t */
    private SparseArray<C2869e> f1846t;

    /* renamed from: u */
    C0292b f1847u;

    /* renamed from: v */
    private int f1848v;

    /* renamed from: w */
    private int f1849w;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0291a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1918a;

        static {
            int[] iArr = new int[C2869e.b.values().length];
            f1918a = iArr;
            try {
                iArr[C2869e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1918a[C2869e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1918a[C2869e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1918a[C2869e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    class C0292b implements C2892b.b {

        /* renamed from: a */
        ConstraintLayout f1919a;

        /* renamed from: b */
        int f1920b;

        /* renamed from: c */
        int f1921c;

        /* renamed from: d */
        int f1922d;

        /* renamed from: e */
        int f1923e;

        /* renamed from: f */
        int f1924f;

        /* renamed from: g */
        int f1925g;

        public C0292b(ConstraintLayout constraintLayout) {
            this.f1919a = constraintLayout;
        }

        @Override // p125o.C2892b.b
        /* renamed from: a */
        public final void mo1621a() {
            int childCount = this.f1919a.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.f1919a.getChildAt(i4);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).m1628b(this.f1919a);
                }
            }
            int size = this.f1919a.f1828b.size();
            if (size > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    ((ConstraintHelper) this.f1919a.f1828b.get(i5)).m1597q(this.f1919a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x016c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0216  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0159  */
        @Override // p125o.C2892b.b
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void mo1622b(p121n.C2869e r20, p125o.C2892b.a r21) {
            /*
                Method dump skipped, instructions count: 613
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0292b.mo1622b(n.e, o.b$a):void");
        }

        /* renamed from: c */
        public void m1623c(int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f1920b = i6;
            this.f1921c = i7;
            this.f1922d = i8;
            this.f1923e = i9;
            this.f1924f = i4;
            this.f1925g = i5;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1827a = new SparseArray<>();
        this.f1828b = new ArrayList<>(4);
        this.f1829c = new C2870f();
        this.f1830d = 0;
        this.f1831e = 0;
        this.f1832f = Integer.MAX_VALUE;
        this.f1833g = Integer.MAX_VALUE;
        this.f1834h = true;
        this.f1835i = 263;
        this.f1836j = null;
        this.f1837k = null;
        this.f1838l = -1;
        this.f1839m = new HashMap<>();
        this.f1840n = -1;
        this.f1841o = -1;
        this.f1842p = -1;
        this.f1843q = -1;
        this.f1844r = 0;
        this.f1845s = 0;
        this.f1846t = new SparseArray<>();
        this.f1847u = new C0292b(this);
        this.f1848v = 0;
        this.f1849w = 0;
        m1603i(attributeSet, 0, 0);
    }

    /* renamed from: f */
    private final C2869e m1602f(int i4) {
        if (i4 == 0) {
            return this.f1829c;
        }
        View viewFindViewById = this.f1827a.get(i4);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i4)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f1829c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((LayoutParams) viewFindViewById.getLayoutParams()).f1903n0;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* renamed from: i */
    private void m1603i(AttributeSet attributeSet, int i4, int i5) {
        this.f1829c.m9730d0(this);
        this.f1829c.m9790h1(this.f1847u);
        this.f1827a.put(getId(), this);
        this.f1836j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0298f.f2317a1, i4, i5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == C0298f.f2417k1) {
                    this.f1830d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1830d);
                } else if (index == C0298f.f2427l1) {
                    this.f1831e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1831e);
                } else if (index == C0298f.f2397i1) {
                    this.f1832f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1832f);
                } else if (index == C0298f.f2407j1) {
                    this.f1833g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1833g);
                } else if (index == C0298f.f2183L2) {
                    this.f1835i = typedArrayObtainStyledAttributes.getInt(index, this.f1835i);
                } else if (index == C0298f.f2191M1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo1213l(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1837k = null;
                        }
                    }
                } else if (index == C0298f.f2491s1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0295c c0295c = new C0295c();
                        this.f1836j = c0295c;
                        c0295c.m1671u(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1836j = null;
                    }
                    this.f1838l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1829c.m9791i1(this.f1835i);
    }

    /* renamed from: k */
    private void m1604k() {
        this.f1834h = true;
        this.f1840n = -1;
        this.f1841o = -1;
        this.f1842p = -1;
        this.f1843q = -1;
        this.f1844r = 0;
        this.f1845s = 0;
    }

    /* renamed from: o */
    private void m1605o() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            C2869e c2869eM1612h = m1612h(getChildAt(i4));
            if (c2869eM1612h != null) {
                c2869eM1612h.mo9726Z();
            }
        }
        if (zIsInEditMode) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m1616p(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    m1602f(childAt.getId()).m9732e0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1838l != -1) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (childAt2.getId() == this.f1838l && (childAt2 instanceof Constraints)) {
                    this.f1836j = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C0295c c0295c = this.f1836j;
        if (c0295c != null) {
            c0295c.m1659f(this, true);
        }
        this.f1829c.m9886O0();
        int size = this.f1828b.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f1828b.get(i7).m1598s(this);
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt3 = getChildAt(i8);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).m1629c(this);
            }
        }
        this.f1846t.clear();
        this.f1846t.put(0, this.f1829c);
        this.f1846t.put(getId(), this.f1829c);
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt4 = getChildAt(i9);
            this.f1846t.put(childAt4.getId(), m1612h(childAt4));
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt5 = getChildAt(i10);
            C2869e c2869eM1612h2 = m1612h(childAt5);
            if (c2869eM1612h2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.f1829c.m9887b(c2869eM1612h2);
                m1607b(zIsInEditMode, childAt5, c2869eM1612h2, layoutParams, this.f1846t);
            }
        }
    }

    /* renamed from: r */
    private boolean m1606r() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        int childCount = getChildCount();
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            if (getChildAt(i4).isLayoutRequested()) {
                z3 = true;
                break;
            }
            i4++;
        }
        if (z3) {
            m1605o();
        }
        return z3;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m1607b(boolean z3, View view, C2869e c2869e, LayoutParams layoutParams, SparseArray<C2869e> sparseArray) {
        float f4;
        C2869e c2869e2;
        C2869e c2869e3;
        C2869e c2869e4;
        C2869e c2869e5;
        int i4;
        layoutParams.m1620c();
        layoutParams.f1905o0 = false;
        c2869e.m9700E0(view.getVisibility());
        if (layoutParams.f1879b0) {
            c2869e.m9752q0(true);
            c2869e.m9700E0(8);
        }
        c2869e.m9730d0(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).mo1153o(c2869e, this.f1829c.m9786c1());
        }
        if (layoutParams.f1875Z) {
            C2872h c2872h = (C2872h) c2869e;
            int i5 = layoutParams.f1897k0;
            int i6 = layoutParams.f1899l0;
            float f5 = layoutParams.f1901m0;
            if (f5 != -1.0f) {
                c2872h.m9857R0(f5);
                return;
            } else if (i5 != -1) {
                c2872h.m9855P0(i5);
                return;
            } else {
                if (i6 != -1) {
                    c2872h.m9856Q0(i6);
                    return;
                }
                return;
            }
        }
        int i7 = layoutParams.f1883d0;
        int i8 = layoutParams.f1885e0;
        int i9 = layoutParams.f1887f0;
        int i10 = layoutParams.f1889g0;
        int i11 = layoutParams.f1891h0;
        int i12 = layoutParams.f1893i0;
        float f6 = layoutParams.f1895j0;
        int i13 = layoutParams.f1900m;
        if (i13 != -1) {
            C2869e c2869e6 = sparseArray.get(i13);
            if (c2869e6 != null) {
                c2869e.m9740k(c2869e6, layoutParams.f1904o, layoutParams.f1902n);
            }
        } else {
            if (i7 != -1) {
                C2869e c2869e7 = sparseArray.get(i7);
                if (c2869e7 != null) {
                    C2868d.b bVar = C2868d.b.LEFT;
                    f4 = f6;
                    c2869e.m9722U(bVar, c2869e7, bVar, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11);
                } else {
                    f4 = f6;
                }
            } else {
                f4 = f6;
                if (i8 != -1 && (c2869e2 = sparseArray.get(i8)) != null) {
                    c2869e.m9722U(C2868d.b.LEFT, c2869e2, C2868d.b.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11);
                }
            }
            if (i9 != -1) {
                C2869e c2869e8 = sparseArray.get(i9);
                if (c2869e8 != null) {
                    c2869e.m9722U(C2868d.b.RIGHT, c2869e8, C2868d.b.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i12);
                }
            } else if (i10 != -1 && (c2869e3 = sparseArray.get(i10)) != null) {
                C2868d.b bVar2 = C2868d.b.RIGHT;
                c2869e.m9722U(bVar2, c2869e3, bVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i12);
            }
            int i14 = layoutParams.f1890h;
            if (i14 != -1) {
                C2869e c2869e9 = sparseArray.get(i14);
                if (c2869e9 != null) {
                    C2868d.b bVar3 = C2868d.b.TOP;
                    c2869e.m9722U(bVar3, c2869e9, bVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f1911u);
                }
            } else {
                int i15 = layoutParams.f1892i;
                if (i15 != -1 && (c2869e4 = sparseArray.get(i15)) != null) {
                    c2869e.m9722U(C2868d.b.TOP, c2869e4, C2868d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f1911u);
                }
            }
            int i16 = layoutParams.f1894j;
            if (i16 != -1) {
                C2869e c2869e10 = sparseArray.get(i16);
                if (c2869e10 != null) {
                    c2869e.m9722U(C2868d.b.BOTTOM, c2869e10, C2868d.b.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1913w);
                }
            } else {
                int i17 = layoutParams.f1896k;
                if (i17 != -1 && (c2869e5 = sparseArray.get(i17)) != null) {
                    C2868d.b bVar4 = C2868d.b.BOTTOM;
                    c2869e.m9722U(bVar4, c2869e5, bVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f1913w);
                }
            }
            int i18 = layoutParams.f1898l;
            if (i18 != -1) {
                View view2 = this.f1827a.get(i18);
                C2869e c2869e11 = sparseArray.get(layoutParams.f1898l);
                if (c2869e11 != null && view2 != null && (view2.getLayoutParams() instanceof LayoutParams)) {
                    LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                    layoutParams.f1874Y = true;
                    layoutParams2.f1874Y = true;
                    C2868d.b bVar5 = C2868d.b.BASELINE;
                    c2869e.mo9745n(bVar5).m9675b(c2869e11.mo9745n(bVar5), 0, -1, true);
                    c2869e.m9735h0(true);
                    layoutParams2.f1903n0.m9735h0(true);
                    c2869e.mo9745n(C2868d.b.TOP).m9685l();
                    c2869e.mo9745n(C2868d.b.BOTTOM).m9685l();
                }
            }
            float f7 = f4;
            if (f7 >= IGoodView.DEFAULT_TO_ALPHA) {
                c2869e.m9739j0(f7);
            }
            float f8 = layoutParams.f1850A;
            if (f8 >= IGoodView.DEFAULT_TO_ALPHA) {
                c2869e.m9768y0(f8);
            }
        }
        if (z3 && ((i4 = layoutParams.f1866Q) != -1 || layoutParams.f1867R != -1)) {
            c2869e.m9764w0(i4, layoutParams.f1867R);
        }
        if (layoutParams.f1872W) {
            c2869e.m9744m0(C2869e.b.FIXED);
            c2869e.m9702F0(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                c2869e.m9744m0(C2869e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.f1869T) {
                c2869e.m9744m0(C2869e.b.MATCH_CONSTRAINT);
            } else {
                c2869e.m9744m0(C2869e.b.MATCH_PARENT);
            }
            c2869e.mo9745n(C2868d.b.LEFT).f11092e = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            c2869e.mo9745n(C2868d.b.RIGHT).f11092e = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            c2869e.m9744m0(C2869e.b.MATCH_CONSTRAINT);
            c2869e.m9702F0(0);
        }
        if (layoutParams.f1873X) {
            c2869e.m9694B0(C2869e.b.FIXED);
            c2869e.m9737i0(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                c2869e.m9694B0(C2869e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.f1870U) {
                c2869e.m9694B0(C2869e.b.MATCH_CONSTRAINT);
            } else {
                c2869e.m9694B0(C2869e.b.MATCH_PARENT);
            }
            c2869e.mo9745n(C2868d.b.TOP).f11092e = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            c2869e.mo9745n(C2868d.b.BOTTOM).f11092e = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            c2869e.m9694B0(C2869e.b.MATCH_CONSTRAINT);
            c2869e.m9737i0(0);
        }
        c2869e.m9733f0(layoutParams.f1851B);
        c2869e.m9748o0(layoutParams.f1854E);
        c2869e.m9698D0(layoutParams.f1855F);
        c2869e.m9741k0(layoutParams.f1856G);
        c2869e.m9770z0(layoutParams.f1857H);
        c2869e.m9746n0(layoutParams.f1858I, layoutParams.f1860K, layoutParams.f1862M, layoutParams.f1864O);
        c2869e.m9696C0(layoutParams.f1859J, layoutParams.f1861L, layoutParams.f1863N, layoutParams.f1865P);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f1828b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f1828b.get(i4).mo1158r(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i6 = Integer.parseInt(strArrSplit[0]);
                        int i7 = Integer.parseInt(strArrSplit[1]);
                        int i8 = Integer.parseInt(strArrSplit[2]);
                        int i9 = (int) ((i6 / 1080.0f) * width);
                        int i10 = (int) ((i7 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f4 = i9;
                        float f5 = i10;
                        float f6 = i9 + ((int) ((i8 / 1080.0f) * width));
                        canvas.drawLine(f4, f5, f6, f5, paint);
                        float f7 = i10 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f6, f5, f6, f7, paint);
                        canvas.drawLine(f6, f7, f4, f7, paint);
                        canvas.drawLine(f4, f7, f4, f5, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f4, f5, f6, f7, paint);
                        canvas.drawLine(f4, f7, f6, f5, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public Object m1610e(int i4, Object obj) {
        if (i4 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f1839m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f1839m.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        m1604k();
        super.forceLayout();
    }

    /* renamed from: g */
    public View m1611g(int i4) {
        return this.f1827a.get(i4);
    }

    public int getMaxHeight() {
        return this.f1833g;
    }

    public int getMaxWidth() {
        return this.f1832f;
    }

    public int getMinHeight() {
        return this.f1831e;
    }

    public int getMinWidth() {
        return this.f1830d;
    }

    public int getOptimizationLevel() {
        return this.f1829c.m9781X0();
    }

    /* renamed from: h */
    public final C2869e m1612h(View view) {
        if (view == this) {
            return this.f1829c;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f1903n0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public boolean m1613j() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* renamed from: l */
    protected void mo1213l(int i4) {
        this.f1837k = new C0294b(getContext(), this, i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public void m1614m(int i4, int i5, int i6, int i7, boolean z3, boolean z4) {
        C0292b c0292b = this.f1847u;
        int i8 = c0292b.f1923e;
        int iResolveSizeAndState = ViewGroup.resolveSizeAndState(i6 + c0292b.f1922d, i4, 0);
        int iResolveSizeAndState2 = ViewGroup.resolveSizeAndState(i7 + i8, i5, 0) & 16777215;
        int iMin = Math.min(this.f1832f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f1833g, iResolveSizeAndState2);
        if (z3) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z4) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f1840n = iMin;
        this.f1841o = iMin2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m1615n(C2870f c2870f, int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i7 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f1847u.m1623c(i5, i6, iMax, iMax2, paddingWidth, i7);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? m1613j() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i8 = size - paddingWidth;
        int i9 = size2 - i7;
        m1617q(c2870f, mode, i8, mode2, i9);
        c2870f.m9788e1(i4, mode, i8, mode2, i9, this.f1840n, this.f1841o, iMax5, iMax);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            C2869e c2869e = layoutParams.f1903n0;
            if ((childAt.getVisibility() != 8 || layoutParams.f1875Z || layoutParams.f1877a0 || layoutParams.f1881c0 || zIsInEditMode) && !layoutParams.f1879b0) {
                int iM9719R = c2869e.m9719R();
                int iM9720S = c2869e.m9720S();
                int iM9718Q = c2869e.m9718Q() + iM9719R;
                int iM9763w = c2869e.m9763w() + iM9720S;
                childAt.layout(iM9719R, iM9720S, iM9718Q, iM9763w);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM9719R, iM9720S, iM9718Q, iM9763w);
                }
            }
        }
        int size = this.f1828b.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                this.f1828b.get(i9).mo1157p(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        this.f1848v = i4;
        this.f1849w = i5;
        this.f1829c.m9792j1(m1613j());
        if (this.f1834h) {
            this.f1834h = false;
            if (m1606r()) {
                this.f1829c.m9794l1();
            }
        }
        m1615n(this.f1829c, this.f1835i, i4, i5);
        m1614m(i4, i5, this.f1829c.m9718Q(), this.f1829c.m9763w(), this.f1829c.m9787d1(), this.f1829c.m9785b1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C2869e c2869eM1612h = m1612h(view);
        if ((view instanceof Guideline) && !(c2869eM1612h instanceof C2872h)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C2872h c2872h = new C2872h();
            layoutParams.f1903n0 = c2872h;
            layoutParams.f1875Z = true;
            c2872h.m9858S0(layoutParams.f1868S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m1600u();
            ((LayoutParams) view.getLayoutParams()).f1877a0 = true;
            if (!this.f1828b.contains(constraintHelper)) {
                this.f1828b.add(constraintHelper);
            }
        }
        this.f1827a.put(view.getId(), view);
        this.f1834h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1827a.remove(view.getId());
        this.f1829c.m9885N0(m1612h(view));
        this.f1828b.remove(view);
        this.f1834h = true;
    }

    /* renamed from: p */
    public void m1616p(int i4, Object obj, Object obj2) {
        if (i4 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1839m == null) {
                this.f1839m = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f1839m.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 n.e$b) = (r2v3 n.e$b), (r2v0 n.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m1617q(p121n.C2870f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$b r0 = r7.f1847u
            int r1 = r0.f1923e
            int r0 = r0.f1922d
            n.e$b r2 = p121n.C2869e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L38
        L1a:
            int r9 = r7.f1832f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            n.e$b r9 = p121n.C2869e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f1830d
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            n.e$b r9 = p121n.C2869e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f1830d
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = 0
            goto L5d
        L40:
            int r11 = r7.f1833g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            n.e$b r2 = p121n.C2869e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f1831e
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            n.e$b r2 = p121n.C2869e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f1831e
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.m9718Q()
            if (r10 != r11) goto L69
            int r11 = r8.m9763w()
            if (r12 == r11) goto L6c
        L69:
            r8.m9784a1()
        L6c:
            r8.m9704G0(r6)
            r8.m9706H0(r6)
            int r11 = r7.f1832f
            int r11 = r11 - r0
            r8.m9758t0(r11)
            int r11 = r7.f1833g
            int r11 = r11 - r1
            r8.m9756s0(r11)
            r8.m9762v0(r6)
            r8.m9760u0(r6)
            r8.m9744m0(r9)
            r8.m9702F0(r10)
            r8.m9694B0(r2)
            r8.m9737i0(r12)
            int r9 = r7.f1830d
            int r9 = r9 - r0
            r8.m9762v0(r9)
            int r9 = r7.f1831e
            int r9 = r9 - r1
            r8.m9760u0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1617q(n.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m1604k();
        super.requestLayout();
    }

    public void setConstraintSet(C0295c c0295c) {
        this.f1836j = c0295c;
    }

    @Override // android.view.View
    public void setId(int i4) {
        this.f1827a.remove(getId());
        super.setId(i4);
        this.f1827a.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 == this.f1833g) {
            return;
        }
        this.f1833g = i4;
        requestLayout();
    }

    public void setMaxWidth(int i4) {
        if (i4 == this.f1832f) {
            return;
        }
        this.f1832f = i4;
        requestLayout();
    }

    public void setMinHeight(int i4) {
        if (i4 == this.f1831e) {
            return;
        }
        this.f1831e = i4;
        requestLayout();
    }

    public void setMinWidth(int i4) {
        if (i4 == this.f1830d) {
            return;
        }
        this.f1830d = i4;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0296d abstractC0296d) {
        C0294b c0294b = this.f1837k;
        if (c0294b != null) {
            c0294b.m1642c(abstractC0296d);
        }
    }

    public void setOptimizationLevel(int i4) {
        this.f1835i = i4;
        this.f1829c.m9791i1(i4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1827a = new SparseArray<>();
        this.f1828b = new ArrayList<>(4);
        this.f1829c = new C2870f();
        this.f1830d = 0;
        this.f1831e = 0;
        this.f1832f = Integer.MAX_VALUE;
        this.f1833g = Integer.MAX_VALUE;
        this.f1834h = true;
        this.f1835i = 263;
        this.f1836j = null;
        this.f1837k = null;
        this.f1838l = -1;
        this.f1839m = new HashMap<>();
        this.f1840n = -1;
        this.f1841o = -1;
        this.f1842p = -1;
        this.f1843q = -1;
        this.f1844r = 0;
        this.f1845s = 0;
        this.f1846t = new SparseArray<>();
        this.f1847u = new C0292b(this);
        this.f1848v = 0;
        this.f1849w = 0;
        m1603i(attributeSet, i4, 0);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f1850A;

        /* renamed from: B */
        public String f1851B;

        /* renamed from: C */
        float f1852C;

        /* renamed from: D */
        int f1853D;

        /* renamed from: E */
        public float f1854E;

        /* renamed from: F */
        public float f1855F;

        /* renamed from: G */
        public int f1856G;

        /* renamed from: H */
        public int f1857H;

        /* renamed from: I */
        public int f1858I;

        /* renamed from: J */
        public int f1859J;

        /* renamed from: K */
        public int f1860K;

        /* renamed from: L */
        public int f1861L;

        /* renamed from: M */
        public int f1862M;

        /* renamed from: N */
        public int f1863N;

        /* renamed from: O */
        public float f1864O;

        /* renamed from: P */
        public float f1865P;

        /* renamed from: Q */
        public int f1866Q;

        /* renamed from: R */
        public int f1867R;

        /* renamed from: S */
        public int f1868S;

        /* renamed from: T */
        public boolean f1869T;

        /* renamed from: U */
        public boolean f1870U;

        /* renamed from: V */
        public String f1871V;

        /* renamed from: W */
        boolean f1872W;

        /* renamed from: X */
        boolean f1873X;

        /* renamed from: Y */
        boolean f1874Y;

        /* renamed from: Z */
        boolean f1875Z;

        /* renamed from: a */
        public int f1876a;

        /* renamed from: a0 */
        boolean f1877a0;

        /* renamed from: b */
        public int f1878b;

        /* renamed from: b0 */
        boolean f1879b0;

        /* renamed from: c */
        public float f1880c;

        /* renamed from: c0 */
        boolean f1881c0;

        /* renamed from: d */
        public int f1882d;

        /* renamed from: d0 */
        int f1883d0;

        /* renamed from: e */
        public int f1884e;

        /* renamed from: e0 */
        int f1885e0;

        /* renamed from: f */
        public int f1886f;

        /* renamed from: f0 */
        int f1887f0;

        /* renamed from: g */
        public int f1888g;

        /* renamed from: g0 */
        int f1889g0;

        /* renamed from: h */
        public int f1890h;

        /* renamed from: h0 */
        int f1891h0;

        /* renamed from: i */
        public int f1892i;

        /* renamed from: i0 */
        int f1893i0;

        /* renamed from: j */
        public int f1894j;

        /* renamed from: j0 */
        float f1895j0;

        /* renamed from: k */
        public int f1896k;

        /* renamed from: k0 */
        int f1897k0;

        /* renamed from: l */
        public int f1898l;

        /* renamed from: l0 */
        int f1899l0;

        /* renamed from: m */
        public int f1900m;

        /* renamed from: m0 */
        float f1901m0;

        /* renamed from: n */
        public int f1902n;

        /* renamed from: n0 */
        C2869e f1903n0;

        /* renamed from: o */
        public float f1904o;

        /* renamed from: o0 */
        public boolean f1905o0;

        /* renamed from: p */
        public int f1906p;

        /* renamed from: q */
        public int f1907q;

        /* renamed from: r */
        public int f1908r;

        /* renamed from: s */
        public int f1909s;

        /* renamed from: t */
        public int f1910t;

        /* renamed from: u */
        public int f1911u;

        /* renamed from: v */
        public int f1912v;

        /* renamed from: w */
        public int f1913w;

        /* renamed from: x */
        public int f1914x;

        /* renamed from: y */
        public int f1915y;

        /* renamed from: z */
        public float f1916z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        private static class C0290a {

            /* renamed from: a */
            public static final SparseIntArray f1917a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1917a = sparseIntArray;
                sparseIntArray.append(C0298f.f2428l2, 8);
                sparseIntArray.append(C0298f.f2438m2, 9);
                sparseIntArray.append(C0298f.f2456o2, 10);
                sparseIntArray.append(C0298f.f2465p2, 11);
                sparseIntArray.append(C0298f.f2519v2, 12);
                sparseIntArray.append(C0298f.f2510u2, 13);
                sparseIntArray.append(C0298f.f2254T1, 14);
                sparseIntArray.append(C0298f.f2245S1, 15);
                sparseIntArray.append(C0298f.f2227Q1, 16);
                sparseIntArray.append(C0298f.f2263U1, 2);
                sparseIntArray.append(C0298f.f2281W1, 3);
                sparseIntArray.append(C0298f.f2272V1, 4);
                sparseIntArray.append(C0298f.f2111D2, 49);
                sparseIntArray.append(C0298f.f2120E2, 50);
                sparseIntArray.append(C0298f.f2318a2, 5);
                sparseIntArray.append(C0298f.f2328b2, 6);
                sparseIntArray.append(C0298f.f2338c2, 7);
                sparseIntArray.append(C0298f.f2327b1, 1);
                sparseIntArray.append(C0298f.f2474q2, 17);
                sparseIntArray.append(C0298f.f2483r2, 18);
                sparseIntArray.append(C0298f.f2308Z1, 19);
                sparseIntArray.append(C0298f.f2299Y1, 20);
                sparseIntArray.append(C0298f.f2147H2, 21);
                sparseIntArray.append(C0298f.f2174K2, 22);
                sparseIntArray.append(C0298f.f2156I2, 23);
                sparseIntArray.append(C0298f.f2129F2, 24);
                sparseIntArray.append(C0298f.f2165J2, 25);
                sparseIntArray.append(C0298f.f2138G2, 26);
                sparseIntArray.append(C0298f.f2388h2, 29);
                sparseIntArray.append(C0298f.f2528w2, 30);
                sparseIntArray.append(C0298f.f2290X1, 44);
                sparseIntArray.append(C0298f.f2408j2, 45);
                sparseIntArray.append(C0298f.f2546y2, 46);
                sparseIntArray.append(C0298f.f2398i2, 47);
                sparseIntArray.append(C0298f.f2537x2, 48);
                sparseIntArray.append(C0298f.f2209O1, 27);
                sparseIntArray.append(C0298f.f2200N1, 28);
                sparseIntArray.append(C0298f.f2555z2, 31);
                sparseIntArray.append(C0298f.f2348d2, 32);
                sparseIntArray.append(C0298f.f2093B2, 33);
                sparseIntArray.append(C0298f.f2084A2, 34);
                sparseIntArray.append(C0298f.f2102C2, 35);
                sparseIntArray.append(C0298f.f2368f2, 36);
                sparseIntArray.append(C0298f.f2358e2, 37);
                sparseIntArray.append(C0298f.f2378g2, 38);
                sparseIntArray.append(C0298f.f2418k2, 39);
                sparseIntArray.append(C0298f.f2501t2, 40);
                sparseIntArray.append(C0298f.f2447n2, 41);
                sparseIntArray.append(C0298f.f2236R1, 42);
                sparseIntArray.append(C0298f.f2218P1, 43);
                sparseIntArray.append(C0298f.f2492s2, 51);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) throws NumberFormatException {
            int i4;
            super(context, attributeSet);
            this.f1876a = -1;
            this.f1878b = -1;
            this.f1880c = -1.0f;
            this.f1882d = -1;
            this.f1884e = -1;
            this.f1886f = -1;
            this.f1888g = -1;
            this.f1890h = -1;
            this.f1892i = -1;
            this.f1894j = -1;
            this.f1896k = -1;
            this.f1898l = -1;
            this.f1900m = -1;
            this.f1902n = 0;
            this.f1904o = IGoodView.DEFAULT_TO_ALPHA;
            this.f1906p = -1;
            this.f1907q = -1;
            this.f1908r = -1;
            this.f1909s = -1;
            this.f1910t = -1;
            this.f1911u = -1;
            this.f1912v = -1;
            this.f1913w = -1;
            this.f1914x = -1;
            this.f1915y = -1;
            this.f1916z = 0.5f;
            this.f1850A = 0.5f;
            this.f1851B = null;
            this.f1852C = IGoodView.DEFAULT_TO_ALPHA;
            this.f1853D = 1;
            this.f1854E = -1.0f;
            this.f1855F = -1.0f;
            this.f1856G = 0;
            this.f1857H = 0;
            this.f1858I = 0;
            this.f1859J = 0;
            this.f1860K = 0;
            this.f1861L = 0;
            this.f1862M = 0;
            this.f1863N = 0;
            this.f1864O = 1.0f;
            this.f1865P = 1.0f;
            this.f1866Q = -1;
            this.f1867R = -1;
            this.f1868S = -1;
            this.f1869T = false;
            this.f1870U = false;
            this.f1871V = null;
            this.f1872W = true;
            this.f1873X = true;
            this.f1874Y = false;
            this.f1875Z = false;
            this.f1877a0 = false;
            this.f1879b0 = false;
            this.f1881c0 = false;
            this.f1883d0 = -1;
            this.f1885e0 = -1;
            this.f1887f0 = -1;
            this.f1889g0 = -1;
            this.f1891h0 = -1;
            this.f1893i0 = -1;
            this.f1895j0 = 0.5f;
            this.f1903n0 = new C2869e();
            this.f1905o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0298f.f2317a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                int i6 = C0290a.f1917a.get(index);
                switch (i6) {
                    case 1:
                        this.f1868S = typedArrayObtainStyledAttributes.getInt(index, this.f1868S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1900m);
                        this.f1900m = resourceId;
                        if (resourceId == -1) {
                            this.f1900m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f1902n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1902n);
                        break;
                    case 4:
                        float f4 = typedArrayObtainStyledAttributes.getFloat(index, this.f1904o) % 360.0f;
                        this.f1904o = f4;
                        if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
                            this.f1904o = (360.0f - f4) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f1876a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1876a);
                        break;
                    case 6:
                        this.f1878b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1878b);
                        break;
                    case 7:
                        this.f1880c = typedArrayObtainStyledAttributes.getFloat(index, this.f1880c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1882d);
                        this.f1882d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1882d = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1884e);
                        this.f1884e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1884e = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1886f);
                        this.f1886f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1886f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1888g);
                        this.f1888g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1888g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1890h);
                        this.f1890h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1890h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1892i);
                        this.f1892i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1892i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1894j);
                        this.f1894j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1894j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1896k);
                        this.f1896k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1896k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1898l);
                        this.f1898l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1898l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1906p);
                        this.f1906p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1906p = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1907q);
                        this.f1907q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1907q = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1908r);
                        this.f1908r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1908r = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1909s);
                        this.f1909s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1909s = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f1910t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1910t);
                        break;
                    case 22:
                        this.f1911u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1911u);
                        break;
                    case 23:
                        this.f1912v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1912v);
                        break;
                    case 24:
                        this.f1913w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1913w);
                        break;
                    case 25:
                        this.f1914x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1914x);
                        break;
                    case 26:
                        this.f1915y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1915y);
                        break;
                    case 27:
                        this.f1869T = typedArrayObtainStyledAttributes.getBoolean(index, this.f1869T);
                        break;
                    case 28:
                        this.f1870U = typedArrayObtainStyledAttributes.getBoolean(index, this.f1870U);
                        break;
                    case 29:
                        this.f1916z = typedArrayObtainStyledAttributes.getFloat(index, this.f1916z);
                        break;
                    case 30:
                        this.f1850A = typedArrayObtainStyledAttributes.getFloat(index, this.f1850A);
                        break;
                    case 31:
                        int i7 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f1858I = i7;
                        if (i7 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i8 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f1859J = i8;
                        if (i8 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f1860K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1860K);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1860K) == -2) {
                                this.f1860K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f1862M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1862M);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1862M) == -2) {
                                this.f1862M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f1864O = Math.max(IGoodView.DEFAULT_TO_ALPHA, typedArrayObtainStyledAttributes.getFloat(index, this.f1864O));
                        this.f1858I = 2;
                        break;
                    case 36:
                        try {
                            this.f1861L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1861L);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1861L) == -2) {
                                this.f1861L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f1863N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1863N);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f1863N) == -2) {
                                this.f1863N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f1865P = Math.max(IGoodView.DEFAULT_TO_ALPHA, typedArrayObtainStyledAttributes.getFloat(index, this.f1865P));
                        this.f1859J = 2;
                        break;
                    default:
                        switch (i6) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f1851B = string;
                                this.f1852C = Float.NaN;
                                this.f1853D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f1851B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i4 = 0;
                                    } else {
                                        String strSubstring = this.f1851B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f1853D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f1853D = 1;
                                        }
                                        i4 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f1851B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f1851B.substring(i4);
                                        if (strSubstring2.length() > 0) {
                                            this.f1852C = Float.parseFloat(strSubstring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String strSubstring3 = this.f1851B.substring(i4, iIndexOf2);
                                        String strSubstring4 = this.f1851B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                            break;
                                        } else {
                                            try {
                                                float f5 = Float.parseFloat(strSubstring3);
                                                float f6 = Float.parseFloat(strSubstring4);
                                                if (f5 <= IGoodView.DEFAULT_TO_ALPHA || f6 <= IGoodView.DEFAULT_TO_ALPHA) {
                                                    break;
                                                } else if (this.f1853D == 1) {
                                                    this.f1852C = Math.abs(f6 / f5);
                                                    break;
                                                } else {
                                                    this.f1852C = Math.abs(f5 / f6);
                                                    break;
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.f1854E = typedArrayObtainStyledAttributes.getFloat(index, this.f1854E);
                                break;
                            case 46:
                                this.f1855F = typedArrayObtainStyledAttributes.getFloat(index, this.f1855F);
                                break;
                            case 47:
                                this.f1856G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f1857H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f1866Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1866Q);
                                break;
                            case 50:
                                this.f1867R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1867R);
                                break;
                            case 51:
                                this.f1871V = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m1620c();
        }

        /* renamed from: a */
        public String m1618a() {
            return this.f1871V;
        }

        /* renamed from: b */
        public C2869e m1619b() {
            return this.f1903n0;
        }

        /* renamed from: c */
        public void m1620c() {
            this.f1875Z = false;
            this.f1872W = true;
            this.f1873X = true;
            int i4 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i4 == -2 && this.f1869T) {
                this.f1872W = false;
                if (this.f1858I == 0) {
                    this.f1858I = 1;
                }
            }
            int i5 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i5 == -2 && this.f1870U) {
                this.f1873X = false;
                if (this.f1859J == 0) {
                    this.f1859J = 1;
                }
            }
            if (i4 == 0 || i4 == -1) {
                this.f1872W = false;
                if (i4 == 0 && this.f1858I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1869T = true;
                }
            }
            if (i5 == 0 || i5 == -1) {
                this.f1873X = false;
                if (i5 == 0 && this.f1859J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1870U = true;
                }
            }
            if (this.f1880c == -1.0f && this.f1876a == -1 && this.f1878b == -1) {
                return;
            }
            this.f1875Z = true;
            this.f1872W = true;
            this.f1873X = true;
            if (!(this.f1903n0 instanceof C2872h)) {
                this.f1903n0 = new C2872h();
            }
            ((C2872h) this.f1903n0).m9858S0(this.f1868S);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f1876a = -1;
            this.f1878b = -1;
            this.f1880c = -1.0f;
            this.f1882d = -1;
            this.f1884e = -1;
            this.f1886f = -1;
            this.f1888g = -1;
            this.f1890h = -1;
            this.f1892i = -1;
            this.f1894j = -1;
            this.f1896k = -1;
            this.f1898l = -1;
            this.f1900m = -1;
            this.f1902n = 0;
            this.f1904o = IGoodView.DEFAULT_TO_ALPHA;
            this.f1906p = -1;
            this.f1907q = -1;
            this.f1908r = -1;
            this.f1909s = -1;
            this.f1910t = -1;
            this.f1911u = -1;
            this.f1912v = -1;
            this.f1913w = -1;
            this.f1914x = -1;
            this.f1915y = -1;
            this.f1916z = 0.5f;
            this.f1850A = 0.5f;
            this.f1851B = null;
            this.f1852C = IGoodView.DEFAULT_TO_ALPHA;
            this.f1853D = 1;
            this.f1854E = -1.0f;
            this.f1855F = -1.0f;
            this.f1856G = 0;
            this.f1857H = 0;
            this.f1858I = 0;
            this.f1859J = 0;
            this.f1860K = 0;
            this.f1861L = 0;
            this.f1862M = 0;
            this.f1863N = 0;
            this.f1864O = 1.0f;
            this.f1865P = 1.0f;
            this.f1866Q = -1;
            this.f1867R = -1;
            this.f1868S = -1;
            this.f1869T = false;
            this.f1870U = false;
            this.f1871V = null;
            this.f1872W = true;
            this.f1873X = true;
            this.f1874Y = false;
            this.f1875Z = false;
            this.f1877a0 = false;
            this.f1879b0 = false;
            this.f1881c0 = false;
            this.f1883d0 = -1;
            this.f1885e0 = -1;
            this.f1887f0 = -1;
            this.f1889g0 = -1;
            this.f1891h0 = -1;
            this.f1893i0 = -1;
            this.f1895j0 = 0.5f;
            this.f1903n0 = new C2869e();
            this.f1905o0 = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1876a = -1;
            this.f1878b = -1;
            this.f1880c = -1.0f;
            this.f1882d = -1;
            this.f1884e = -1;
            this.f1886f = -1;
            this.f1888g = -1;
            this.f1890h = -1;
            this.f1892i = -1;
            this.f1894j = -1;
            this.f1896k = -1;
            this.f1898l = -1;
            this.f1900m = -1;
            this.f1902n = 0;
            this.f1904o = IGoodView.DEFAULT_TO_ALPHA;
            this.f1906p = -1;
            this.f1907q = -1;
            this.f1908r = -1;
            this.f1909s = -1;
            this.f1910t = -1;
            this.f1911u = -1;
            this.f1912v = -1;
            this.f1913w = -1;
            this.f1914x = -1;
            this.f1915y = -1;
            this.f1916z = 0.5f;
            this.f1850A = 0.5f;
            this.f1851B = null;
            this.f1852C = IGoodView.DEFAULT_TO_ALPHA;
            this.f1853D = 1;
            this.f1854E = -1.0f;
            this.f1855F = -1.0f;
            this.f1856G = 0;
            this.f1857H = 0;
            this.f1858I = 0;
            this.f1859J = 0;
            this.f1860K = 0;
            this.f1861L = 0;
            this.f1862M = 0;
            this.f1863N = 0;
            this.f1864O = 1.0f;
            this.f1865P = 1.0f;
            this.f1866Q = -1;
            this.f1867R = -1;
            this.f1868S = -1;
            this.f1869T = false;
            this.f1870U = false;
            this.f1871V = null;
            this.f1872W = true;
            this.f1873X = true;
            this.f1874Y = false;
            this.f1875Z = false;
            this.f1877a0 = false;
            this.f1879b0 = false;
            this.f1881c0 = false;
            this.f1883d0 = -1;
            this.f1885e0 = -1;
            this.f1887f0 = -1;
            this.f1889g0 = -1;
            this.f1891h0 = -1;
            this.f1893i0 = -1;
            this.f1895j0 = 0.5f;
            this.f1903n0 = new C2869e();
            this.f1905o0 = false;
        }
    }
}
