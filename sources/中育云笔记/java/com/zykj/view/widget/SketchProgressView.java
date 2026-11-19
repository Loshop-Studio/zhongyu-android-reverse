package com.zykj.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.zykj.view.R$styleable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import sd.AbstractC11117h;
import sd.C11119h1;

/* loaded from: classes6.dex */
public final class SketchProgressView extends View {

    /* renamed from: r */
    public static final C8894a f20824r = new C8894a(null);

    /* renamed from: c */
    public float f20825c;

    /* renamed from: d */
    public InterfaceC8895b f20826d;

    /* renamed from: e */
    public int f20827e;

    /* renamed from: f */
    public float f20828f;

    /* renamed from: g */
    public RectF f20829g;

    /* renamed from: h */
    public Paint f20830h;

    /* renamed from: i */
    public float f20831i;

    /* renamed from: j */
    public float f20832j;

    /* renamed from: k */
    public float f20833k;

    /* renamed from: l */
    public float f20834l;

    /* renamed from: m */
    public boolean f20835m;

    /* renamed from: n */
    public boolean f20836n;

    /* renamed from: o */
    public InterfaceC10045g f20837o;

    /* renamed from: p */
    public InterfaceC10045g f20838p;

    /* renamed from: q */
    public boolean f20839q;

    /* renamed from: com.zykj.view.widget.SketchProgressView$a */
    public static final class C8894a {
        public /* synthetic */ C8894a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8894a() {
        }
    }

    /* renamed from: com.zykj.view.widget.SketchProgressView$b */
    public interface InterfaceC8895b {
        /* renamed from: a */
        void mo17220a(float f10);

        /* renamed from: b */
        void mo17221b();

        void onProgress(float f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SketchProgressView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9979u.m20294g(context, "context");
    }

    private final int getViewCrossLength() {
        return this.f20827e == 1 ? getWidth() : getHeight();
    }

    private final int getViewMainLength() {
        return this.f20827e == 1 ? getHeight() : getWidth();
    }

    /* renamed from: d */
    public final void m17414d() {
        int viewMainLength = getViewMainLength();
        float fHeight = this.f20827e == 1 ? this.f20829g.height() : this.f20829g.width();
        float f10 = 2;
        float f11 = this.f20833k;
        float f12 = (fHeight / f10) + f11;
        this.f20831i = f12;
        this.f20832j = (viewMainLength - f12) + (f10 * f11);
        Log.i("SketchProgressView", "minTouch -> " + f12);
        Log.i("SketchProgressView", "maxTouch -> " + this.f20832j);
    }

    /* renamed from: e */
    public final void m17415e() {
        int viewMainLength = getViewMainLength();
        int viewCrossLength = getViewCrossLength();
        int i10 = (int) (viewMainLength * this.f20828f);
        if (i10 >= viewCrossLength) {
            viewCrossLength = i10;
        }
        float f10 = (viewMainLength - viewCrossLength) * this.f20825c;
        if (this.f20827e == 1) {
            this.f20829g.set(0.0f, f10, getWidth(), viewCrossLength + f10);
        } else {
            this.f20829g.set(f10, 0.0f, viewCrossLength + f10, getHeight());
        }
    }

    /* renamed from: f */
    public final void m17416f(MotionEvent motionEvent) {
        float x10;
        float fCenterX;
        if (this.f20827e == 1) {
            x10 = motionEvent.getY();
            fCenterX = this.f20829g.centerY();
        } else {
            x10 = motionEvent.getX();
            fCenterX = this.f20829g.centerX();
        }
        float f10 = x10 - fCenterX;
        this.f20833k = f10;
        Log.i("SketchProgressView", "touchOffset -> " + f10);
    }

    /* renamed from: g */
    public final boolean m17417g(MotionEvent motionEvent) {
        return this.f20829g.contains(motionEvent.getX(), motionEvent.getY());
    }

    public final int getOrientation() {
        return this.f20827e;
    }

    public final float getProgress() {
        return this.f20825c;
    }

    public final InterfaceC8895b getProgressListener() {
        return this.f20826d;
    }

    public final float getThumbTime() {
        return this.f20828f;
    }

    /* renamed from: h */
    public final void m17418h() {
        InterfaceC10045g interfaceC10045g = this.f20837o;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.f20837o = AbstractC11117h.m24726d(C11119h1.f26784c, null, null, new SketchProgressView$closeVisible$1(this, null), 3, null);
    }

    /* renamed from: i */
    public final void m17419i(Canvas canvas) {
        RectF rectF = this.f20829g;
        float f10 = this.f20834l;
        canvas.drawRoundRect(rectF, f10, f10, this.f20830h);
    }

    /* renamed from: j */
    public final float m17420j(MotionEvent motionEvent) {
        return this.f20827e == 1 ? motionEvent.getY() : motionEvent.getX();
    }

    /* renamed from: k */
    public final float m17421k(MotionEvent motionEvent) {
        float fM17420j = m17420j(motionEvent);
        float f10 = this.f20831i;
        if (fM17420j < f10) {
            fM17420j = f10;
        } else {
            float f11 = this.f20832j;
            if (fM17420j > f11) {
                fM17420j = f11;
            }
        }
        float f12 = this.f20832j;
        if (f12 == f10) {
            return 0.0f;
        }
        return (fM17420j - f10) / (f12 - f10);
    }

    /* renamed from: l */
    public final void m17422l() {
        InterfaceC10045g interfaceC10045g = this.f20838p;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.f20838p = AbstractC11117h.m24726d(C11119h1.f26784c, null, null, new SketchProgressView$hideView$1(this, null), 3, null);
    }

    /* renamed from: m */
    public final void m17423m() {
        Paint paint = this.f20830h;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        if (this.f20835m) {
            paint.setAlpha(255);
        }
    }

    /* renamed from: n */
    public final void m17424n() {
        InterfaceC10045g interfaceC10045g = this.f20838p;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.f20838p = AbstractC11117h.m24726d(C11119h1.f26784c, null, null, new SketchProgressView$showView$1(this, null), 3, null);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC10045g interfaceC10045g = this.f20838p;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        InterfaceC10045g interfaceC10045g2 = this.f20837o;
        if (interfaceC10045g2 != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g2, null, 1, null);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC9979u.m20294g(canvas, "canvas");
        super.onDraw(canvas);
        m17415e();
        m17419i(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getWidth() > getHeight() && this.f20827e != 0) {
            setOrientation(0);
        } else {
            if (getWidth() >= getHeight() || this.f20827e == 1) {
                return;
            }
            setOrientation(1);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (!this.f20839q) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            if (m17417g(event)) {
                m17416f(event);
            } else {
                this.f20833k = 0.0f;
            }
            m17414d();
            setProgress(m17421k(event));
            InterfaceC8895b interfaceC8895b = this.f20826d;
            if (interfaceC8895b != null) {
                interfaceC8895b.mo17221b();
            }
            InterfaceC8895b interfaceC8895b2 = this.f20826d;
            if (interfaceC8895b2 != null) {
                interfaceC8895b2.onProgress(this.f20825c);
            }
        } else if (action == 1) {
            setProgress(m17421k(event));
            InterfaceC8895b interfaceC8895b3 = this.f20826d;
            if (interfaceC8895b3 != null) {
                interfaceC8895b3.mo17220a(this.f20825c);
            }
        } else if (action == 2) {
            setProgress(m17421k(event));
            InterfaceC8895b interfaceC8895b4 = this.f20826d;
            if (interfaceC8895b4 != null) {
                interfaceC8895b4.onProgress(this.f20825c);
            }
        }
        return true;
    }

    public final void setOrientation(int i10) {
        this.f20827e = i10;
        postInvalidate();
    }

    public final void setProgress(float f10) {
        if (!this.f20835m) {
            if (this.f20828f < 1.0f && !this.f20836n) {
                this.f20836n = true;
                m17424n();
            }
            m17418h();
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f20825c = f10;
        postInvalidate();
    }

    public final void setProgressListener(InterfaceC8895b interfaceC8895b) {
        this.f20826d = interfaceC8895b;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setThumbTime(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.f20828f = r3
            r2.postInvalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.SketchProgressView.setThumbTime(float):void"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/view/widget/SketchProgressView.smali:1772
    }

    public final void setTouchable(boolean z10) {
        this.f20839q = z10;
    }

    public final void setViewAlwaysShow(boolean z10) {
        this.f20835m = z10;
        InterfaceC10045g interfaceC10045g = this.f20838p;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        InterfaceC10045g interfaceC10045g2 = this.f20837o;
        if (interfaceC10045g2 != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g2, null, 1, null);
        }
        this.f20830h.setAlpha(z10 ? 255 : 0);
        postInvalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SketchProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9979u.m20294g(context, "context");
    }

    public /* synthetic */ SketchProgressView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchProgressView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9979u.m20294g(context, "context");
        this.f20827e = 1;
        this.f20828f = 1.0f;
        this.f20829g = new RectF();
        this.f20830h = new Paint();
        this.f20834l = 2.0f;
        this.f20835m = true;
        this.f20836n = true;
        this.f20839q = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SketchProgressView);
            AbstractC9979u.m20293f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            setOrientation(typedArrayObtainStyledAttributes.getInt(R$styleable.SketchProgressView_sp_orientation, 1));
            this.f20834l = typedArrayObtainStyledAttributes.getDimension(R$styleable.SketchProgressView_sp_thumbRadius, 2.0f);
            this.f20830h.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.SketchProgressView_sp_thumbColor, Color.parseColor("#D9D9D9")));
            this.f20835m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SketchProgressView_sp_alwaysShow, true);
            this.f20839q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SketchProgressView_sp_touchable, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        m17423m();
    }
}
