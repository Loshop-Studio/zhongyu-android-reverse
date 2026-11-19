package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0298f;
import androidx.core.widget.NestedScrollView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.t */
/* loaded from: classes.dex */
class C0284t {

    /* renamed from: v */
    private static final float[][] f1742v = {new float[]{0.5f, IGoodView.DEFAULT_TO_ALPHA}, new float[]{IGoodView.DEFAULT_TO_ALPHA, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{IGoodView.DEFAULT_TO_ALPHA, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: w */
    private static final float[][] f1743w = {new float[]{IGoodView.DEFAULT_TO_ALPHA, -1.0f}, new float[]{IGoodView.DEFAULT_TO_ALPHA, 1.0f}, new float[]{-1.0f, IGoodView.DEFAULT_TO_ALPHA}, new float[]{1.0f, IGoodView.DEFAULT_TO_ALPHA}, new float[]{-1.0f, IGoodView.DEFAULT_TO_ALPHA}, new float[]{1.0f, IGoodView.DEFAULT_TO_ALPHA}};

    /* renamed from: m */
    private float f1756m;

    /* renamed from: n */
    private float f1757n;

    /* renamed from: o */
    private final MotionLayout f1758o;

    /* renamed from: a */
    private int f1744a = 0;

    /* renamed from: b */
    private int f1745b = 0;

    /* renamed from: c */
    private int f1746c = 0;

    /* renamed from: d */
    private int f1747d = -1;

    /* renamed from: e */
    private int f1748e = -1;

    /* renamed from: f */
    private int f1749f = -1;

    /* renamed from: g */
    private float f1750g = 0.5f;

    /* renamed from: h */
    private float f1751h = 0.5f;

    /* renamed from: i */
    private float f1752i = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: j */
    private float f1753j = 1.0f;

    /* renamed from: k */
    private boolean f1754k = false;

    /* renamed from: l */
    private float[] f1755l = new float[2];

    /* renamed from: p */
    private float f1759p = 4.0f;

    /* renamed from: q */
    private float f1760q = 1.2f;

    /* renamed from: r */
    private boolean f1761r = true;

    /* renamed from: s */
    private float f1762s = 1.0f;

    /* renamed from: t */
    private int f1763t = 0;

    /* renamed from: u */
    private float f1764u = 10.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.t$a */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$b */
    class b implements NestedScrollView.InterfaceC0366b {
        b() {
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0366b
        /* renamed from: a */
        public void mo155a(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7) {
        }
    }

    C0284t(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f1758o = motionLayout;
        m1559c(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: b */
    private void m1558b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            if (index == C0298f.f2403i7) {
                this.f1747d = typedArray.getResourceId(index, this.f1747d);
            } else if (index == C0298f.f2413j7) {
                int i5 = typedArray.getInt(index, this.f1744a);
                this.f1744a = i5;
                float[][] fArr = f1742v;
                this.f1751h = fArr[i5][0];
                this.f1750g = fArr[i5][1];
            } else if (index == C0298f.f2313Z6) {
                int i6 = typedArray.getInt(index, this.f1745b);
                this.f1745b = i6;
                float[][] fArr2 = f1743w;
                this.f1752i = fArr2[i6][0];
                this.f1753j = fArr2[i6][1];
            } else if (index == C0298f.f2363e7) {
                this.f1759p = typedArray.getFloat(index, this.f1759p);
            } else if (index == C0298f.f2353d7) {
                this.f1760q = typedArray.getFloat(index, this.f1760q);
            } else if (index == C0298f.f2373f7) {
                this.f1761r = typedArray.getBoolean(index, this.f1761r);
            } else if (index == C0298f.f2323a7) {
                this.f1762s = typedArray.getFloat(index, this.f1762s);
            } else if (index == C0298f.f2333b7) {
                this.f1764u = typedArray.getFloat(index, this.f1764u);
            } else if (index == C0298f.f2423k7) {
                this.f1748e = typedArray.getResourceId(index, this.f1748e);
            } else if (index == C0298f.f2393h7) {
                this.f1746c = typedArray.getInt(index, this.f1746c);
            } else if (index == C0298f.f2383g7) {
                this.f1763t = typedArray.getInteger(index, 0);
            } else if (index == C0298f.f2343c7) {
                this.f1749f = typedArray.getResourceId(index, 0);
            }
        }
    }

    /* renamed from: c */
    private void m1559c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0298f.f2304Y6);
        m1558b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    float m1560a(float f4, float f5) {
        return (f4 * this.f1752i) + (f5 * this.f1753j);
    }

    /* renamed from: d */
    public int m1561d() {
        return this.f1763t;
    }

    /* renamed from: e */
    RectF m1562e(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i4 = this.f1749f;
        if (i4 == -1 || (viewFindViewById = viewGroup.findViewById(i4)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* renamed from: f */
    float m1563f() {
        return this.f1760q;
    }

    /* renamed from: g */
    public float m1564g() {
        return this.f1759p;
    }

    /* renamed from: h */
    boolean m1565h() {
        return this.f1761r;
    }

    /* renamed from: i */
    float m1566i(float f4, float f5) throws Resources.NotFoundException {
        this.f1758o.m1204X(this.f1747d, this.f1758o.getProgress(), this.f1751h, this.f1750g, this.f1755l);
        float f6 = this.f1752i;
        if (f6 != IGoodView.DEFAULT_TO_ALPHA) {
            float[] fArr = this.f1755l;
            if (fArr[0] == IGoodView.DEFAULT_TO_ALPHA) {
                fArr[0] = 1.0E-7f;
            }
            return (f4 * f6) / fArr[0];
        }
        float[] fArr2 = this.f1755l;
        if (fArr2[1] == IGoodView.DEFAULT_TO_ALPHA) {
            fArr2[1] = 1.0E-7f;
        }
        return (f5 * this.f1753j) / fArr2[1];
    }

    /* renamed from: j */
    RectF m1567j(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i4 = this.f1748e;
        if (i4 == -1 || (viewFindViewById = viewGroup.findViewById(i4)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* renamed from: k */
    int m1568k() {
        return this.f1748e;
    }

    /* renamed from: l */
    void m1569l(MotionEvent motionEvent, MotionLayout.InterfaceC0260f interfaceC0260f, int i4, C0281q c0281q) throws Resources.NotFoundException {
        int i5;
        interfaceC0260f.mo1242a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1756m = motionEvent.getRawX();
            this.f1757n = motionEvent.getRawY();
            this.f1754k = false;
            return;
        }
        if (action == 1) {
            this.f1754k = false;
            interfaceC0260f.mo1245d(1000);
            float fMo1244c = interfaceC0260f.mo1244c();
            float fMo1243b = interfaceC0260f.mo1243b();
            float progress = this.f1758o.getProgress();
            int i6 = this.f1747d;
            if (i6 != -1) {
                this.f1758o.m1204X(i6, progress, this.f1751h, this.f1750g, this.f1755l);
            } else {
                float fMin = Math.min(this.f1758o.getWidth(), this.f1758o.getHeight());
                float[] fArr = this.f1755l;
                fArr[1] = this.f1753j * fMin;
                fArr[0] = fMin * this.f1752i;
            }
            float f4 = this.f1752i;
            float[] fArr2 = this.f1755l;
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            float f7 = f4 != IGoodView.DEFAULT_TO_ALPHA ? fMo1244c / fArr2[0] : fMo1243b / fArr2[1];
            float f8 = !Float.isNaN(f7) ? (f7 / 3.0f) + progress : progress;
            if (f8 == IGoodView.DEFAULT_TO_ALPHA || f8 == 1.0f || (i5 = this.f1746c) == 3) {
                if (IGoodView.DEFAULT_TO_ALPHA >= f8 || 1.0f <= f8) {
                    this.f1758o.setState(MotionLayout.EnumC0264j.FINISHED);
                    return;
                }
                return;
            }
            this.f1758o.m1214l0(i5, ((double) f8) < 0.5d ? IGoodView.DEFAULT_TO_ALPHA : 1.0f, f7);
            if (IGoodView.DEFAULT_TO_ALPHA >= progress || 1.0f <= progress) {
                this.f1758o.setState(MotionLayout.EnumC0264j.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f1757n;
        float rawX = motionEvent.getRawX() - this.f1756m;
        if (Math.abs((this.f1752i * rawX) + (this.f1753j * rawY)) > this.f1764u || this.f1754k) {
            float progress2 = this.f1758o.getProgress();
            if (!this.f1754k) {
                this.f1754k = true;
                this.f1758o.setProgress(progress2);
            }
            int i7 = this.f1747d;
            if (i7 != -1) {
                this.f1758o.m1204X(i7, progress2, this.f1751h, this.f1750g, this.f1755l);
            } else {
                float fMin2 = Math.min(this.f1758o.getWidth(), this.f1758o.getHeight());
                float[] fArr3 = this.f1755l;
                fArr3[1] = this.f1753j * fMin2;
                fArr3[0] = fMin2 * this.f1752i;
            }
            float f9 = this.f1752i;
            float[] fArr4 = this.f1755l;
            if (Math.abs(((f9 * fArr4[0]) + (this.f1753j * fArr4[1])) * this.f1762s) < 0.01d) {
                float[] fArr5 = this.f1755l;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            float fMax = Math.max(Math.min(progress2 + (this.f1752i != IGoodView.DEFAULT_TO_ALPHA ? rawX / this.f1755l[0] : rawY / this.f1755l[1]), 1.0f), IGoodView.DEFAULT_TO_ALPHA);
            if (fMax != this.f1758o.getProgress()) {
                this.f1758o.setProgress(fMax);
                interfaceC0260f.mo1245d(1000);
                this.f1758o.f1415z = this.f1752i != IGoodView.DEFAULT_TO_ALPHA ? interfaceC0260f.mo1244c() / this.f1755l[0] : interfaceC0260f.mo1243b() / this.f1755l[1];
            } else {
                this.f1758o.f1415z = IGoodView.DEFAULT_TO_ALPHA;
            }
            this.f1756m = motionEvent.getRawX();
            this.f1757n = motionEvent.getRawY();
        }
    }

    /* renamed from: m */
    void m1570m(float f4, float f5) throws Resources.NotFoundException {
        float progress = this.f1758o.getProgress();
        if (!this.f1754k) {
            this.f1754k = true;
            this.f1758o.setProgress(progress);
        }
        this.f1758o.m1204X(this.f1747d, progress, this.f1751h, this.f1750g, this.f1755l);
        float f6 = this.f1752i;
        float[] fArr = this.f1755l;
        if (Math.abs((f6 * fArr[0]) + (this.f1753j * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f1755l;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f7 = this.f1752i;
        float fMax = Math.max(Math.min(progress + (f7 != IGoodView.DEFAULT_TO_ALPHA ? (f4 * f7) / this.f1755l[0] : (f5 * this.f1753j) / this.f1755l[1]), 1.0f), IGoodView.DEFAULT_TO_ALPHA);
        if (fMax != this.f1758o.getProgress()) {
            this.f1758o.setProgress(fMax);
        }
    }

    /* renamed from: n */
    void m1571n(float f4, float f5) throws Resources.NotFoundException {
        this.f1754k = false;
        float progress = this.f1758o.getProgress();
        this.f1758o.m1204X(this.f1747d, progress, this.f1751h, this.f1750g, this.f1755l);
        float f6 = this.f1752i;
        float[] fArr = this.f1755l;
        float f7 = fArr[0];
        float f8 = this.f1753j;
        float f9 = fArr[1];
        float f10 = IGoodView.DEFAULT_TO_ALPHA;
        float f11 = f6 != IGoodView.DEFAULT_TO_ALPHA ? (f4 * f6) / fArr[0] : (f5 * f8) / fArr[1];
        if (!Float.isNaN(f11)) {
            progress += f11 / 3.0f;
        }
        if (progress != IGoodView.DEFAULT_TO_ALPHA) {
            boolean z3 = progress != 1.0f;
            int i4 = this.f1746c;
            if ((i4 != 3) && z3) {
                MotionLayout motionLayout = this.f1758o;
                if (progress >= 0.5d) {
                    f10 = 1.0f;
                }
                motionLayout.m1214l0(i4, f10, f11);
            }
        }
    }

    /* renamed from: o */
    void m1572o(float f4, float f5) {
        this.f1756m = f4;
        this.f1757n = f5;
    }

    /* renamed from: p */
    public void m1573p(boolean z3) {
        if (z3) {
            float[][] fArr = f1743w;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f1742v;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f1743w;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f1742v;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = f1742v;
        int i4 = this.f1744a;
        this.f1751h = fArr5[i4][0];
        this.f1750g = fArr5[i4][1];
        float[][] fArr6 = f1743w;
        int i5 = this.f1745b;
        this.f1752i = fArr6[i5][0];
        this.f1753j = fArr6[i5][1];
    }

    /* renamed from: q */
    void m1574q(float f4, float f5) {
        this.f1756m = f4;
        this.f1757n = f5;
        this.f1754k = false;
    }

    /* renamed from: r */
    void m1575r() {
        View viewFindViewById;
        int i4 = this.f1747d;
        if (i4 != -1) {
            viewFindViewById = this.f1758o.findViewById(i4);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + C0265a.m1256b(this.f1758o.getContext(), this.f1747d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }

    public String toString() {
        return this.f1752i + " , " + this.f1753j;
    }
}
