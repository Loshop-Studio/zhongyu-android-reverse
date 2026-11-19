package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C0295c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Arrays;
import java.util.HashMap;
import p121n.C2869e;
import p121n.C2870f;
import p121n.C2874j;
import p121n.InterfaceC2873i;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: a */
    protected int[] f1819a;

    /* renamed from: b */
    protected int f1820b;

    /* renamed from: c */
    protected Context f1821c;

    /* renamed from: d */
    protected InterfaceC2873i f1822d;

    /* renamed from: e */
    protected boolean f1823e;

    /* renamed from: f */
    protected String f1824f;

    /* renamed from: g */
    private View[] f1825g;

    /* renamed from: h */
    private HashMap<Integer, String> f1826h;

    public ConstraintHelper(Context context) {
        super(context);
        this.f1819a = new int[32];
        this.f1823e = false;
        this.f1825g = null;
        this.f1826h = new HashMap<>();
        this.f1821c = context;
        mo1151m(null);
    }

    /* renamed from: e */
    private void m1589e(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f1821c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iM1593k = m1593k(strTrim);
        if (iM1593k != 0) {
            this.f1826h.put(Integer.valueOf(iM1593k), strTrim);
            m1590f(iM1593k);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    /* renamed from: f */
    private void m1590f(int i4) {
        if (i4 == getId()) {
            return;
        }
        int i5 = this.f1820b + 1;
        int[] iArr = this.f1819a;
        if (i5 > iArr.length) {
            this.f1819a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1819a;
        int i6 = this.f1820b;
        iArr2[i6] = i4;
        this.f1820b = i6 + 1;
    }

    /* renamed from: i */
    private int[] m1591i(View view, String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String[] strArrSplit = str.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i4 = 0;
        for (String str2 : strArrSplit) {
            int iM1593k = m1593k(str2.trim());
            if (iM1593k != 0) {
                iArr[i4] = iM1593k;
                i4++;
            }
        }
        return i4 != strArrSplit.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    /* renamed from: j */
    private int m1592j(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1821c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: k */
    private int m1593k(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iM1592j = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objM1610e = constraintLayout.m1610e(0, str);
            if (objM1610e instanceof Integer) {
                iM1592j = ((Integer) objM1610e).intValue();
            }
        }
        if (iM1592j == 0 && constraintLayout != null) {
            iM1592j = m1592j(constraintLayout, str);
        }
        if (iM1592j == 0) {
            try {
                iM1592j = C0297e.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iM1592j == 0 ? this.f1821c.getResources().getIdentifier(str, "id", this.f1821c.getPackageName()) : iM1592j;
    }

    /* renamed from: g */
    protected void m1594g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m1595h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1819a, this.f1820b);
    }

    /* renamed from: h */
    protected void m1595h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i4 = 0; i4 < this.f1820b; i4++) {
            View viewM1611g = constraintLayout.m1611g(this.f1819a[i4]);
            if (viewM1611g != null) {
                viewM1611g.setVisibility(visibility);
                if (elevation > IGoodView.DEFAULT_TO_ALPHA) {
                    viewM1611g.setTranslationZ(viewM1611g.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: l */
    protected View[] m1596l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1825g;
        if (viewArr == null || viewArr.length != this.f1820b) {
            this.f1825g = new View[this.f1820b];
        }
        for (int i4 = 0; i4 < this.f1820b; i4++) {
            this.f1825g[i4] = constraintLayout.m1611g(this.f1819a[i4]);
        }
        return this.f1825g;
    }

    /* renamed from: m */
    protected void mo1151m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0298f.f2317a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2500t1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1824f = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: n */
    public void mo1152n(C0295c.a aVar, C2874j c2874j, ConstraintLayout.LayoutParams layoutParams, SparseArray<C2869e> sparseArray) {
        C0295c.b bVar = aVar.f1987d;
        int[] iArr = bVar.f2026e0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f2028f0;
            if (str != null && str.length() > 0) {
                C0295c.b bVar2 = aVar.f1987d;
                bVar2.f2026e0 = m1591i(this, bVar2.f2028f0);
            }
        }
        c2874j.mo9861c();
        if (aVar.f1987d.f2026e0 == null) {
            return;
        }
        int i4 = 0;
        while (true) {
            int[] iArr2 = aVar.f1987d.f2026e0;
            if (i4 >= iArr2.length) {
                return;
            }
            C2869e c2869e = sparseArray.get(iArr2[i4]);
            if (c2869e != null) {
                c2874j.mo9860b(c2869e);
            }
            i4++;
        }
    }

    /* renamed from: o */
    public void mo1153o(C2869e c2869e, boolean z3) {
    }

    @Override // android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f1824f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f1823e) {
            super.onMeasure(i4, i5);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: p */
    public void mo1157p(ConstraintLayout constraintLayout) {
    }

    /* renamed from: q */
    public void m1597q(ConstraintLayout constraintLayout) {
    }

    /* renamed from: r */
    public void mo1158r(ConstraintLayout constraintLayout) {
    }

    /* renamed from: s */
    public void m1598s(ConstraintLayout constraintLayout) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String str;
        int iM1592j;
        if (isInEditMode()) {
            setIds(this.f1824f);
        }
        InterfaceC2873i interfaceC2873i = this.f1822d;
        if (interfaceC2873i == null) {
            return;
        }
        interfaceC2873i.mo9861c();
        for (int i4 = 0; i4 < this.f1820b; i4++) {
            int i5 = this.f1819a[i4];
            View viewM1611g = constraintLayout.m1611g(i5);
            if (viewM1611g == null && (iM1592j = m1592j(constraintLayout, (str = this.f1826h.get(Integer.valueOf(i5))))) != 0) {
                this.f1819a[i4] = iM1592j;
                this.f1826h.put(Integer.valueOf(iM1592j), str);
                viewM1611g = constraintLayout.m1611g(iM1592j);
            }
            if (viewM1611g != null) {
                this.f1822d.mo9860b(constraintLayout.m1612h(viewM1611g));
            }
        }
        this.f1822d.mo9859a(constraintLayout.f1829c);
    }

    protected void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f1824f = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f1820b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i4);
            if (iIndexOf == -1) {
                m1589e(str.substring(i4));
                return;
            } else {
                m1589e(str.substring(i4, iIndexOf));
                i4 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1824f = null;
        this.f1820b = 0;
        for (int i4 : iArr) {
            m1590f(i4);
        }
    }

    /* renamed from: t */
    public void m1599t(C2870f c2870f, InterfaceC2873i interfaceC2873i, SparseArray<C2869e> sparseArray) {
        interfaceC2873i.mo9861c();
        for (int i4 = 0; i4 < this.f1820b; i4++) {
            interfaceC2873i.mo9860b(sparseArray.get(this.f1819a[i4]));
        }
    }

    /* renamed from: u */
    public void m1600u() {
        if (this.f1822d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f1903n0 = (C2869e) this.f1822d;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1819a = new int[32];
        this.f1823e = false;
        this.f1825g = null;
        this.f1826h = new HashMap<>();
        this.f1821c = context;
        mo1151m(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1819a = new int[32];
        this.f1823e = false;
        this.f1825g = null;
        this.f1826h = new HashMap<>();
        this.f1821c = context;
        mo1151m(attributeSet);
    }
}
