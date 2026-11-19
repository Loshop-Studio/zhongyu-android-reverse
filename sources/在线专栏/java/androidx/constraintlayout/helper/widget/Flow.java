package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C0295c;
import androidx.constraintlayout.widget.C0298f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import p121n.C2869e;
import p121n.C2871g;
import p121n.C2874j;
import p121n.C2876l;

/* loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* renamed from: k */
    private C2871g f1328k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: m */
    protected void mo1151m(AttributeSet attributeSet) {
        super.mo1151m(attributeSet);
        this.f1328k = new C2871g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0298f.f2317a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2327b1) {
                    this.f1328k.m9835T1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0298f.f2337c1) {
                    this.f1328k.m9877Z0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0298f.f2437m1) {
                    this.f1328k.m9882e1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0298f.f2446n1) {
                    this.f1328k.m9879b1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0298f.f2347d1) {
                    this.f1328k.m9880c1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0298f.f2357e1) {
                    this.f1328k.m9883f1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0298f.f2367f1) {
                    this.f1328k.m9881d1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0298f.f2377g1) {
                    this.f1328k.m9878a1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0298f.f2182L1) {
                    this.f1328k.m9840Y1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0298f.f2092B1) {
                    this.f1328k.m9828N1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0298f.f2173K1) {
                    this.f1328k.m9839X1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0298f.f2518v1) {
                    this.f1328k.m9822H1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0298f.f2110D1) {
                    this.f1328k.m9830P1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0298f.f2536x1) {
                    this.f1328k.m9824J1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0298f.f2128F1) {
                    this.f1328k.m9832R1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0298f.f2554z1) {
                    this.f1328k.m9826L1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0298f.f2509u1) {
                    this.f1328k.m9821G1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0298f.f2101C1) {
                    this.f1328k.m9829O1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0298f.f2527w1) {
                    this.f1328k.m9823I1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0298f.f2119E1) {
                    this.f1328k.m9831Q1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0298f.f2155I1) {
                    this.f1328k.m9837V1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0298f.f2545y1) {
                    this.f1328k.m9825K1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == C0298f.f2146H1) {
                    this.f1328k.m9836U1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == C0298f.f2083A1) {
                    this.f1328k.m9827M1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0298f.f2164J1) {
                    this.f1328k.m9838W1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0298f.f2137G1) {
                    this.f1328k.m9833S1(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f1822d = this.f1328k;
        m1600u();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: n */
    public void mo1152n(C0295c.a aVar, C2874j c2874j, ConstraintLayout.LayoutParams layoutParams, SparseArray<C2869e> sparseArray) {
        super.mo1152n(aVar, c2874j, layoutParams, sparseArray);
        if (c2874j instanceof C2871g) {
            C2871g c2871g = (C2871g) c2874j;
            int i4 = layoutParams.f1868S;
            if (i4 != -1) {
                c2871g.m9835T1(i4);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: o */
    public void mo1153o(C2869e c2869e, boolean z3) {
        this.f1328k.m9864L0(z3);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i4, int i5) {
        mo1154v(this.f1328k, i4, i5);
    }

    public void setFirstHorizontalBias(float f4) {
        this.f1328k.m9821G1(f4);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i4) {
        this.f1328k.m9822H1(i4);
        requestLayout();
    }

    public void setFirstVerticalBias(float f4) {
        this.f1328k.m9823I1(f4);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i4) {
        this.f1328k.m9824J1(i4);
        requestLayout();
    }

    public void setHorizontalAlign(int i4) {
        this.f1328k.m9825K1(i4);
        requestLayout();
    }

    public void setHorizontalBias(float f4) {
        this.f1328k.m9826L1(f4);
        requestLayout();
    }

    public void setHorizontalGap(int i4) {
        this.f1328k.m9827M1(i4);
        requestLayout();
    }

    public void setHorizontalStyle(int i4) {
        this.f1328k.m9828N1(i4);
        requestLayout();
    }

    public void setMaxElementsWrap(int i4) {
        this.f1328k.m9833S1(i4);
        requestLayout();
    }

    public void setOrientation(int i4) {
        this.f1328k.m9835T1(i4);
        requestLayout();
    }

    public void setPadding(int i4) {
        this.f1328k.m9877Z0(i4);
        requestLayout();
    }

    public void setPaddingBottom(int i4) {
        this.f1328k.m9878a1(i4);
        requestLayout();
    }

    public void setPaddingLeft(int i4) {
        this.f1328k.m9880c1(i4);
        requestLayout();
    }

    public void setPaddingRight(int i4) {
        this.f1328k.m9881d1(i4);
        requestLayout();
    }

    public void setPaddingTop(int i4) {
        this.f1328k.m9883f1(i4);
        requestLayout();
    }

    public void setVerticalAlign(int i4) {
        this.f1328k.m9836U1(i4);
        requestLayout();
    }

    public void setVerticalBias(float f4) {
        this.f1328k.m9837V1(f4);
        requestLayout();
    }

    public void setVerticalGap(int i4) {
        this.f1328k.m9838W1(i4);
        requestLayout();
    }

    public void setVerticalStyle(int i4) {
        this.f1328k.m9839X1(i4);
        requestLayout();
    }

    public void setWrapMode(int i4) {
        this.f1328k.m9840Y1(i4);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    /* renamed from: v */
    public void mo1154v(C2876l c2876l, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (c2876l == null) {
            setMeasuredDimension(0, 0);
        } else {
            c2876l.mo9834T0(mode, size, mode2, size2);
            setMeasuredDimension(c2876l.m9867O0(), c2876l.m9866N0());
        }
    }

    public Flow(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
