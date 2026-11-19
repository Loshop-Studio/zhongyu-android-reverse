package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.C0295c;
import androidx.constraintlayout.widget.ConstraintLayout;
import p121n.C2865a;
import p121n.C2869e;
import p121n.C2870f;
import p121n.C2874j;

/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: i */
    private int f1816i;

    /* renamed from: j */
    private int f1817j;

    /* renamed from: k */
    private C2865a f1818k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: w */
    private void m1587w(C2869e c2869e, int i4, boolean z3) {
        this.f1817j = i4;
        if (z3) {
            int i5 = this.f1816i;
            if (i5 == 5) {
                this.f1817j = 1;
            } else if (i5 == 6) {
                this.f1817j = 0;
            }
        } else {
            int i6 = this.f1816i;
            if (i6 == 5) {
                this.f1817j = 0;
            } else if (i6 == 6) {
                this.f1817j = 1;
            }
        }
        if (c2869e instanceof C2865a) {
            ((C2865a) c2869e).m9664Q0(this.f1817j);
        }
    }

    public int getMargin() {
        return this.f1818k.m9661N0();
    }

    public int getType() {
        return this.f1816i;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: m */
    protected void mo1151m(AttributeSet attributeSet) {
        super.mo1151m(attributeSet);
        this.f1818k = new C2865a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0298f.f2317a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2473q1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0298f.f2464p1) {
                    this.f1818k.m9663P0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0298f.f2482r1) {
                    this.f1818k.m9665R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f1822d = this.f1818k;
        m1600u();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: n */
    public void mo1152n(C0295c.a aVar, C2874j c2874j, ConstraintLayout.LayoutParams layoutParams, SparseArray<C2869e> sparseArray) {
        super.mo1152n(aVar, c2874j, layoutParams, sparseArray);
        if (c2874j instanceof C2865a) {
            C2865a c2865a = (C2865a) c2874j;
            m1587w(c2865a, aVar.f1987d.f2020b0, ((C2870f) c2874j.m9705H()).m9786c1());
            c2865a.m9663P0(aVar.f1987d.f2036j0);
            c2865a.m9665R0(aVar.f1987d.f2022c0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: o */
    public void mo1153o(C2869e c2869e, boolean z3) {
        m1587w(c2869e, this.f1816i, z3);
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f1818k.m9663P0(z3);
    }

    public void setDpMargin(int i4) {
        this.f1818k.m9665R0((int) ((i4 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i4) {
        this.f1818k.m9665R0(i4);
    }

    public void setType(int i4) {
        this.f1816i = i4;
    }

    /* renamed from: v */
    public boolean m1588v() {
        return this.f1818k.m9659L0();
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        super.setVisibility(8);
    }
}
