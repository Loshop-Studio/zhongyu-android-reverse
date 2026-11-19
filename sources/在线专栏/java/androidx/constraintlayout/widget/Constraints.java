package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: a */
    C0295c f1927a;

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1624c(attributeSet);
        super.setVisibility(8);
    }

    /* renamed from: c */
    private void m1624c(AttributeSet attributeSet) {
        Log.v("Constraints", " ################# init");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public C0295c getConstraintSet() {
        if (this.f1927a == null) {
            this.f1927a = new C0295c();
        }
        this.f1927a.m1663j(this);
        return this.f1927a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        m1624c(attributeSet);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: A0 */
        public float f1928A0;

        /* renamed from: B0 */
        public float f1929B0;

        /* renamed from: p0 */
        public float f1930p0;

        /* renamed from: q0 */
        public boolean f1931q0;

        /* renamed from: r0 */
        public float f1932r0;

        /* renamed from: s0 */
        public float f1933s0;

        /* renamed from: t0 */
        public float f1934t0;

        /* renamed from: u0 */
        public float f1935u0;

        /* renamed from: v0 */
        public float f1936v0;

        /* renamed from: w0 */
        public float f1937w0;

        /* renamed from: x0 */
        public float f1938x0;

        /* renamed from: y0 */
        public float f1939y0;

        /* renamed from: z0 */
        public float f1940z0;

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f1930p0 = 1.0f;
            this.f1931q0 = false;
            this.f1932r0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1933s0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1934t0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1935u0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1936v0 = 1.0f;
            this.f1937w0 = 1.0f;
            this.f1938x0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1939y0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1940z0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1928A0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1929B0 = IGoodView.DEFAULT_TO_ALPHA;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1930p0 = 1.0f;
            this.f1931q0 = false;
            this.f1932r0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1933s0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1934t0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1935u0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1936v0 = 1.0f;
            this.f1937w0 = 1.0f;
            this.f1938x0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1939y0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1940z0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1928A0 = IGoodView.DEFAULT_TO_ALPHA;
            this.f1929B0 = IGoodView.DEFAULT_TO_ALPHA;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0298f.f2219P2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2228Q2) {
                    this.f1930p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1930p0);
                } else if (index == C0298f.f2329b3) {
                    this.f1932r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1932r0);
                    this.f1931q0 = true;
                } else if (index == C0298f.f2300Y2) {
                    this.f1934t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1934t0);
                } else if (index == C0298f.f2309Z2) {
                    this.f1935u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1935u0);
                } else if (index == C0298f.f2291X2) {
                    this.f1933s0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1933s0);
                } else if (index == C0298f.f2273V2) {
                    this.f1936v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1936v0);
                } else if (index == C0298f.f2282W2) {
                    this.f1937w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1937w0);
                } else if (index == C0298f.f2237R2) {
                    this.f1938x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1938x0);
                } else if (index == C0298f.f2246S2) {
                    this.f1939y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1939y0);
                } else if (index == C0298f.f2255T2) {
                    this.f1940z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1940z0);
                } else if (index == C0298f.f2264U2) {
                    this.f1928A0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1928A0);
                } else if (index == C0298f.f2319a3) {
                    this.f1929B0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1929B0);
                }
            }
        }
    }
}
