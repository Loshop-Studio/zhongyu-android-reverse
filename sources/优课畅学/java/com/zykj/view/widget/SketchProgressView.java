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
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p135i8.AbstractC8839h;
import p135i8.C8876t0;

/* loaded from: classes5.dex */
public final class SketchProgressView extends View {

    /* renamed from: p */
    public static final C8262a f15610p = new C8262a(null);

    /* renamed from: a */
    public float f15611a;

    /* renamed from: b */
    public InterfaceC8263b f15612b;

    /* renamed from: c */
    public int f15613c;

    /* renamed from: d */
    public float f15614d;

    /* renamed from: e */
    public RectF f15615e;

    /* renamed from: f */
    public Paint f15616f;

    /* renamed from: g */
    public float f15617g;

    /* renamed from: h */
    public float f15618h;

    /* renamed from: i */
    public float f15619i;

    /* renamed from: j */
    public float f15620j;

    /* renamed from: k */
    public boolean f15621k;

    /* renamed from: l */
    public boolean f15622l;

    /* renamed from: m */
    public InterfaceC9212n f15623m;

    /* renamed from: n */
    public InterfaceC9212n f15624n;

    /* renamed from: o */
    public boolean f15625o;

    /* renamed from: com.zykj.view.widget.SketchProgressView$a */
    public static final class C8262a {
        public /* synthetic */ C8262a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C8262a() {
        }
    }

    /* renamed from: com.zykj.view.widget.SketchProgressView$b */
    public interface InterfaceC8263b {
        /* renamed from: a */
        void mo67a(float f10);

        /* renamed from: b */
        void mo68b();

        void onProgress(float f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SketchProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9133u.m16133g(context, "context");
    }

    private final int getViewCrossLength() {
        return this.f15613c == 1 ? getWidth() : getHeight();
    }

    private final int getViewMainLength() {
        return this.f15613c == 1 ? getHeight() : getWidth();
    }

    /* renamed from: d */
    public final void m13339d() {
        int viewMainLength = getViewMainLength();
        float fHeight = this.f15613c == 1 ? this.f15615e.height() : this.f15615e.width();
        float f10 = 2;
        float f11 = this.f15619i;
        float f12 = (fHeight / f10) + f11;
        this.f15617g = f12;
        this.f15618h = (viewMainLength - f12) + (f10 * f11);
        Log.i("SketchProgressView", "minTouch -> " + f12);
        Log.i("SketchProgressView", "maxTouch -> " + this.f15618h);
    }

    /* renamed from: e */
    public final void m13340e() {
        int viewMainLength = getViewMainLength();
        int viewCrossLength = getViewCrossLength();
        int i10 = (int) (viewMainLength * this.f15614d);
        if (i10 >= viewCrossLength) {
            viewCrossLength = i10;
        }
        float f10 = (viewMainLength - viewCrossLength) * this.f15611a;
        if (this.f15613c == 1) {
            this.f15615e.set(0.0f, f10, getWidth(), viewCrossLength + f10);
        } else {
            this.f15615e.set(f10, 0.0f, viewCrossLength + f10, getHeight());
        }
    }

    /* renamed from: f */
    public final void m13341f(MotionEvent motionEvent) {
        float x10;
        float fCenterX;
        if (this.f15613c == 1) {
            x10 = motionEvent.getY();
            fCenterX = this.f15615e.centerY();
        } else {
            x10 = motionEvent.getX();
            fCenterX = this.f15615e.centerX();
        }
        float f10 = x10 - fCenterX;
        this.f15619i = f10;
        Log.i("SketchProgressView", "touchOffset -> " + f10);
    }

    /* renamed from: g */
    public final boolean m13342g(MotionEvent motionEvent) {
        return this.f15615e.contains(motionEvent.getX(), motionEvent.getY());
    }

    public final int getOrientation() {
        return this.f15613c;
    }

    public final float getProgress() {
        return this.f15611a;
    }

    public final InterfaceC8263b getProgressListener() {
        return this.f15612b;
    }

    public final float getThumbTime() {
        return this.f15614d;
    }

    /* renamed from: h */
    public final void m13343h() {
        InterfaceC9212n interfaceC9212n = this.f15623m;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        this.f15623m = AbstractC8839h.m14861d(C8876t0.f16535a, null, null, new SketchProgressView$closeVisible$1(this, null), 3, null);
    }

    /* renamed from: i */
    public final void m13344i(Canvas canvas) {
        RectF rectF = this.f15615e;
        float f10 = this.f15620j;
        canvas.drawRoundRect(rectF, f10, f10, this.f15616f);
    }

    /* renamed from: j */
    public final float m13345j(MotionEvent motionEvent) {
        return this.f15613c == 1 ? motionEvent.getY() : motionEvent.getX();
    }

    /* renamed from: k */
    public final float m13346k(MotionEvent motionEvent) {
        float fM13345j = m13345j(motionEvent);
        float f10 = this.f15617g;
        if (fM13345j < f10) {
            fM13345j = f10;
        } else {
            float f11 = this.f15618h;
            if (fM13345j > f11) {
                fM13345j = f11;
            }
        }
        float f12 = this.f15618h;
        if (f12 == f10) {
            return 0.0f;
        }
        return (fM13345j - f10) / (f12 - f10);
    }

    /* renamed from: l */
    public final void m13347l() {
        InterfaceC9212n interfaceC9212n = this.f15624n;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        this.f15624n = AbstractC8839h.m14861d(C8876t0.f16535a, null, null, new SketchProgressView$hideView$1(this, null), 3, null);
    }

    /* renamed from: m */
    public final void m13348m() {
        Paint paint = this.f15616f;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        if (this.f15621k) {
            paint.setAlpha(255);
        }
    }

    /* renamed from: n */
    public final void m13349n() {
        InterfaceC9212n interfaceC9212n = this.f15624n;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        this.f15624n = AbstractC8839h.m14861d(C8876t0.f16535a, null, null, new SketchProgressView$showView$1(this, null), 3, null);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC9212n interfaceC9212n = this.f15624n;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        InterfaceC9212n interfaceC9212n2 = this.f15623m;
        if (interfaceC9212n2 != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n2, null, 1, null);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
        super.onDraw(canvas);
        m13340e();
        m13344i(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getWidth() > getHeight() && this.f15613c != 0) {
            setOrientation(0);
        } else {
            if (getWidth() >= getHeight() || this.f15613c == 1) {
                return;
            }
            setOrientation(1);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (!this.f15625o) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            if (m13342g(event)) {
                m13341f(event);
            } else {
                this.f15619i = 0.0f;
            }
            m13339d();
            setProgress(m13346k(event));
            InterfaceC8263b interfaceC8263b = this.f15612b;
            if (interfaceC8263b != null) {
                interfaceC8263b.mo68b();
            }
            InterfaceC8263b interfaceC8263b2 = this.f15612b;
            if (interfaceC8263b2 != null) {
                interfaceC8263b2.onProgress(this.f15611a);
            }
        } else if (action == 1) {
            setProgress(m13346k(event));
            InterfaceC8263b interfaceC8263b3 = this.f15612b;
            if (interfaceC8263b3 != null) {
                interfaceC8263b3.mo67a(this.f15611a);
            }
        } else if (action == 2) {
            setProgress(m13346k(event));
            InterfaceC8263b interfaceC8263b4 = this.f15612b;
            if (interfaceC8263b4 != null) {
                interfaceC8263b4.onProgress(this.f15611a);
            }
        }
        return true;
    }

    public final void setOrientation(int i10) {
        this.f15613c = i10;
        postInvalidate();
    }

    public final void setProgress(float f10) {
        if (!this.f15621k) {
            if (this.f15614d < 1.0f && !this.f15622l) {
                this.f15622l = true;
                m13349n();
            }
            m13343h();
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.f15611a = f10;
        postInvalidate();
    }

    public final void setProgressListener(InterfaceC8263b interfaceC8263b) {
        this.f15612b = interfaceC8263b;
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
            r2.f15614d = r3
            r2.postInvalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.SketchProgressView.setThumbTime(float):void"); // DEX body: android/优课畅学/smali_classes5/com/zykj/view/widget/SketchProgressView.smali:1747
    }

    public final void setTouchable(boolean z10) {
        this.f15625o = z10;
    }

    public final void setViewAlwaysShow(boolean z10) {
        this.f15621k = z10;
        InterfaceC9212n interfaceC9212n = this.f15624n;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        InterfaceC9212n interfaceC9212n2 = this.f15623m;
        if (interfaceC9212n2 != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n2, null, 1, null);
        }
        this.f15616f.setAlpha(z10 ? 255 : 0);
        postInvalidate();
    }

    public /* synthetic */ SketchProgressView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchProgressView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9133u.m16133g(context, "context");
        this.f15613c = 1;
        this.f15614d = 1.0f;
        this.f15615e = new RectF();
        this.f15616f = new Paint();
        this.f15620j = 2.0f;
        this.f15621k = true;
        this.f15622l = true;
        this.f15625o = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SketchProgressView);
            AbstractC9133u.m16132f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            setOrientation(typedArrayObtainStyledAttributes.getInt(R$styleable.SketchProgressView_sp_orientation, 1));
            this.f15620j = typedArrayObtainStyledAttributes.getDimension(R$styleable.SketchProgressView_sp_thumbRadius, 2.0f);
            this.f15616f.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.SketchProgressView_sp_thumbColor, Color.parseColor("#D9D9D9")));
            this.f15621k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SketchProgressView_sp_alwaysShow, true);
            this.f15625o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SketchProgressView_sp_touchable, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        m13348m();
    }
}
