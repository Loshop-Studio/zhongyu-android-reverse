package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0298f;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p121n.C2869e;

/* loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* renamed from: i */
    private float f1329i;

    /* renamed from: j */
    private float f1330j;

    /* renamed from: k */
    private float f1331k;

    /* renamed from: l */
    ConstraintLayout f1332l;

    /* renamed from: m */
    private float f1333m;

    /* renamed from: n */
    private float f1334n;

    /* renamed from: o */
    protected float f1335o;

    /* renamed from: p */
    protected float f1336p;

    /* renamed from: q */
    protected float f1337q;

    /* renamed from: r */
    protected float f1338r;

    /* renamed from: s */
    protected float f1339s;

    /* renamed from: t */
    protected float f1340t;

    /* renamed from: u */
    boolean f1341u;

    /* renamed from: v */
    View[] f1342v;

    /* renamed from: w */
    private float f1343w;

    /* renamed from: x */
    private float f1344x;

    /* renamed from: y */
    private boolean f1345y;

    /* renamed from: z */
    private boolean f1346z;

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1329i = Float.NaN;
        this.f1330j = Float.NaN;
        this.f1331k = Float.NaN;
        this.f1333m = 1.0f;
        this.f1334n = 1.0f;
        this.f1335o = Float.NaN;
        this.f1336p = Float.NaN;
        this.f1337q = Float.NaN;
        this.f1338r = Float.NaN;
        this.f1339s = Float.NaN;
        this.f1340t = Float.NaN;
        this.f1341u = true;
        this.f1342v = null;
        this.f1343w = IGoodView.DEFAULT_TO_ALPHA;
        this.f1344x = IGoodView.DEFAULT_TO_ALPHA;
    }

    /* renamed from: w */
    private void m1155w() {
        int i4;
        if (this.f1332l == null || (i4 = this.f1820b) == 0) {
            return;
        }
        View[] viewArr = this.f1342v;
        if (viewArr == null || viewArr.length != i4) {
            this.f1342v = new View[i4];
        }
        for (int i5 = 0; i5 < this.f1820b; i5++) {
            this.f1342v[i5] = this.f1332l.m1611g(this.f1819a[i5]);
        }
    }

    /* renamed from: x */
    private void m1156x() {
        if (this.f1332l == null) {
            return;
        }
        if (this.f1342v == null) {
            m1155w();
        }
        m1159v();
        double radians = Math.toRadians(this.f1331k);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f4 = this.f1333m;
        float f5 = f4 * fCos;
        float f6 = this.f1334n;
        float f7 = (-f6) * fSin;
        float f8 = f4 * fSin;
        float f9 = f6 * fCos;
        for (int i4 = 0; i4 < this.f1820b; i4++) {
            View view = this.f1342v[i4];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f10 = left - this.f1335o;
            float f11 = top - this.f1336p;
            float f12 = (((f5 * f10) + (f7 * f11)) - f10) + this.f1343w;
            float f13 = (((f10 * f8) + (f9 * f11)) - f11) + this.f1344x;
            view.setTranslationX(f12);
            view.setTranslationY(f13);
            view.setScaleY(this.f1334n);
            view.setScaleX(this.f1333m);
            view.setRotation(this.f1331k);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: m */
    protected void mo1151m(AttributeSet attributeSet) {
        super.mo1151m(attributeSet);
        this.f1823e = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0298f.f2317a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2387h1) {
                    this.f1345y = true;
                } else if (index == C0298f.f2455o1) {
                    this.f1346z = true;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        this.f1332l = (ConstraintLayout) getParent();
        if (this.f1345y || this.f1346z) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i4 = 0; i4 < this.f1820b; i4++) {
                View viewM1611g = this.f1332l.m1611g(this.f1819a[i4]);
                if (viewM1611g != null) {
                    if (this.f1345y) {
                        viewM1611g.setVisibility(visibility);
                    }
                    if (this.f1346z && elevation > IGoodView.DEFAULT_TO_ALPHA) {
                        viewM1611g.setTranslationZ(viewM1611g.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: p */
    public void mo1157p(ConstraintLayout constraintLayout) {
        m1155w();
        this.f1335o = Float.NaN;
        this.f1336p = Float.NaN;
        C2869e c2869eM1619b = ((ConstraintLayout.LayoutParams) getLayoutParams()).m1619b();
        c2869eM1619b.m9702F0(0);
        c2869eM1619b.m9737i0(0);
        m1159v();
        layout(((int) this.f1339s) - getPaddingLeft(), ((int) this.f1340t) - getPaddingTop(), ((int) this.f1337q) + getPaddingRight(), ((int) this.f1338r) + getPaddingBottom());
        if (Float.isNaN(this.f1331k)) {
            return;
        }
        m1156x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: r */
    public void mo1158r(ConstraintLayout constraintLayout) {
        this.f1332l = constraintLayout;
        float rotation = getRotation();
        if (rotation != IGoodView.DEFAULT_TO_ALPHA) {
            this.f1331k = rotation;
        } else {
            if (Float.isNaN(this.f1331k)) {
                return;
            }
            this.f1331k = rotation;
        }
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        m1594g();
    }

    @Override // android.view.View
    public void setPivotX(float f4) {
        this.f1329i = f4;
        m1156x();
    }

    @Override // android.view.View
    public void setPivotY(float f4) {
        this.f1330j = f4;
        m1156x();
    }

    @Override // android.view.View
    public void setRotation(float f4) {
        this.f1331k = f4;
        m1156x();
    }

    @Override // android.view.View
    public void setScaleX(float f4) {
        this.f1333m = f4;
        m1156x();
    }

    @Override // android.view.View
    public void setScaleY(float f4) {
        this.f1334n = f4;
        m1156x();
    }

    @Override // android.view.View
    public void setTranslationX(float f4) {
        this.f1343w = f4;
        m1156x();
    }

    @Override // android.view.View
    public void setTranslationY(float f4) {
        this.f1344x = f4;
        m1156x();
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        m1594g();
    }

    /* renamed from: v */
    protected void m1159v() {
        if (this.f1332l == null) {
            return;
        }
        if (this.f1341u || Float.isNaN(this.f1335o) || Float.isNaN(this.f1336p)) {
            if (!Float.isNaN(this.f1329i) && !Float.isNaN(this.f1330j)) {
                this.f1336p = this.f1330j;
                this.f1335o = this.f1329i;
                return;
            }
            View[] viewArrM1596l = m1596l(this.f1332l);
            int left = viewArrM1596l[0].getLeft();
            int top = viewArrM1596l[0].getTop();
            int right = viewArrM1596l[0].getRight();
            int bottom = viewArrM1596l[0].getBottom();
            for (int i4 = 0; i4 < this.f1820b; i4++) {
                View view = viewArrM1596l[i4];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f1337q = right;
            this.f1338r = bottom;
            this.f1339s = left;
            this.f1340t = top;
            if (Float.isNaN(this.f1329i)) {
                this.f1335o = (left + right) / 2;
            } else {
                this.f1335o = this.f1329i;
            }
            if (Float.isNaN(this.f1330j)) {
                this.f1336p = (top + bottom) / 2;
            } else {
                this.f1336p = this.f1330j;
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1329i = Float.NaN;
        this.f1330j = Float.NaN;
        this.f1331k = Float.NaN;
        this.f1333m = 1.0f;
        this.f1334n = 1.0f;
        this.f1335o = Float.NaN;
        this.f1336p = Float.NaN;
        this.f1337q = Float.NaN;
        this.f1338r = Float.NaN;
        this.f1339s = Float.NaN;
        this.f1340t = Float.NaN;
        this.f1341u = true;
        this.f1342v = null;
        this.f1343w = IGoodView.DEFAULT_TO_ALPHA;
        this.f1344x = IGoodView.DEFAULT_TO_ALPHA;
    }
}
