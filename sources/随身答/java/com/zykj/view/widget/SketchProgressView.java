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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.view.R$styleable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata(m13412d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Z2\u00020\u0001:\u000291B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u001eJ\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u001eJ\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010$J\u000f\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010\u001eJ\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u001eJ\u000f\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u0010\u001eR*\u00107\u001a\u00020\"2\u0006\u00100\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010?\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010E\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010*\"\u0004\bC\u0010DR*\u0010H\u001a\u00020\"2\u0006\u00100\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00102\u001a\u0004\bF\u00104\"\u0004\bG\u00106R\u0016\u0010K\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010JR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010MR\u0016\u0010O\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0016\u0010P\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00102R\u0016\u0010Q\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00102R\u0016\u0010R\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00102R\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010SR\u0016\u0010T\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010VR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010S¨\u0006["}, m13413d2 = {"Lcom/zykj/view/widget/SketchProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isTouchable", "", "setTouchable", "(Z)V", "isViewAlwaysShow", "setViewAlwaysShow", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "()V", "g", "f", "(Landroid/view/MotionEvent;)V", "", "k", "(Landroid/view/MotionEvent;)F", "i", "m", "e", "d", "getViewMainLength", "()I", "getViewCrossLength", "j", "n", "l", "h", "value", "a", "F", "getProgress", "()F", "setProgress", "(F)V", "progress", "Lcom/zykj/view/widget/SketchProgressView$b;", "b", "Lcom/zykj/view/widget/SketchProgressView$b;", "getProgressListener", "()Lcom/zykj/view/widget/SketchProgressView$b;", "setProgressListener", "(Lcom/zykj/view/widget/SketchProgressView$b;)V", "progressListener", "c", "I", "getOrientation", "setOrientation", "(I)V", "orientation", "getThumbTime", "setThumbTime", "thumbTime", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "thumbRectF", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "minTouch", "maxTouch", "touchOffset", "radius", "Z", "viewVisible", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "closeVisibleJob", "job", "o", "p", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class SketchProgressView extends View {

    /* renamed from: a, reason: from kotlin metadata */
    public float progress;

    /* renamed from: b, reason: from kotlin metadata */
    public InterfaceC7728b progressListener;

    /* renamed from: c, reason: from kotlin metadata */
    public int orientation;

    /* renamed from: d, reason: from kotlin metadata */
    public float thumbTime;

    /* renamed from: e, reason: from kotlin metadata */
    public RectF thumbRectF;

    /* renamed from: f, reason: from kotlin metadata */
    public Paint paint;

    /* renamed from: g, reason: from kotlin metadata */
    public float minTouch;

    /* renamed from: h, reason: from kotlin metadata */
    public float maxTouch;

    /* renamed from: i, reason: from kotlin metadata */
    public float touchOffset;

    /* renamed from: j, reason: from kotlin metadata */
    public float radius;

    /* renamed from: k, reason: from kotlin metadata */
    public boolean isViewAlwaysShow;

    /* renamed from: l, reason: from kotlin metadata */
    public boolean viewVisible;

    /* renamed from: m, reason: from kotlin metadata */
    public Job closeVisibleJob;

    /* renamed from: n, reason: from kotlin metadata */
    public Job job;

    /* renamed from: o, reason: from kotlin metadata */
    public boolean isTouchable;

    /* renamed from: com.zykj.view.widget.SketchProgressView$b */
    public interface InterfaceC7728b {
        /* renamed from: a */
        void mo11756a(float f10);

        /* renamed from: b */
        void mo11757b();

        void onProgress(float f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SketchProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getViewCrossLength() {
        return this.orientation == 1 ? getWidth() : getHeight();
    }

    private final int getViewMainLength() {
        return this.orientation == 1 ? getHeight() : getWidth();
    }

    /* renamed from: d */
    public final void m12041d() {
        int viewMainLength = getViewMainLength();
        float fHeight = this.orientation == 1 ? this.thumbRectF.height() : this.thumbRectF.width();
        float f10 = 2;
        float f11 = this.touchOffset;
        float f12 = (fHeight / f10) + f11;
        this.minTouch = f12;
        this.maxTouch = (viewMainLength - f12) + (f10 * f11);
        Log.i("SketchProgressView", "minTouch -> " + f12);
        Log.i("SketchProgressView", "maxTouch -> " + this.maxTouch);
    }

    /* renamed from: e */
    public final void m12042e() {
        int viewMainLength = getViewMainLength();
        int viewCrossLength = getViewCrossLength();
        int i9 = (int) (viewMainLength * this.thumbTime);
        if (i9 >= viewCrossLength) {
            viewCrossLength = i9;
        }
        float f10 = (viewMainLength - viewCrossLength) * this.progress;
        if (this.orientation == 1) {
            this.thumbRectF.set(0.0f, f10, getWidth(), viewCrossLength + f10);
        } else {
            this.thumbRectF.set(f10, 0.0f, viewCrossLength + f10, getHeight());
        }
    }

    /* renamed from: f */
    public final void m12043f(MotionEvent event) {
        float x9;
        float fCenterX;
        if (this.orientation == 1) {
            x9 = event.getY();
            fCenterX = this.thumbRectF.centerY();
        } else {
            x9 = event.getX();
            fCenterX = this.thumbRectF.centerX();
        }
        float f10 = x9 - fCenterX;
        this.touchOffset = f10;
        Log.i("SketchProgressView", "touchOffset -> " + f10);
    }

    /* renamed from: g */
    public final boolean m12044g(MotionEvent event) {
        return this.thumbRectF.contains(event.getX(), event.getY());
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final InterfaceC7728b getProgressListener() {
        return this.progressListener;
    }

    public final float getThumbTime() {
        return this.thumbTime;
    }

    /* renamed from: h */
    public final void m12045h() {
        Job job = this.closeVisibleJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.closeVisibleJob = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SketchProgressView$closeVisible$1(this, null), 3, null);
    }

    /* renamed from: i */
    public final void m12046i(Canvas canvas) {
        RectF rectF = this.thumbRectF;
        float f10 = this.radius;
        canvas.drawRoundRect(rectF, f10, f10, this.paint);
    }

    /* renamed from: j */
    public final float m12047j(MotionEvent event) {
        return this.orientation == 1 ? event.getY() : event.getX();
    }

    /* renamed from: k */
    public final float m12048k(MotionEvent event) {
        float fM12047j = m12047j(event);
        float f10 = this.minTouch;
        if (fM12047j < f10) {
            fM12047j = f10;
        } else {
            float f11 = this.maxTouch;
            if (fM12047j > f11) {
                fM12047j = f11;
            }
        }
        float f12 = this.maxTouch;
        if (f12 == f10) {
            return 0.0f;
        }
        return (fM12047j - f10) / (f12 - f10);
    }

    /* renamed from: l */
    public final void m12049l() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SketchProgressView$hideView$1(this, null), 3, null);
    }

    /* renamed from: m */
    public final void m12050m() {
        Paint paint = this.paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        if (this.isViewAlwaysShow) {
            paint.setAlpha(255);
        }
    }

    /* renamed from: n */
    public final void m12051n() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SketchProgressView$showView$1(this, null), 3, null);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.closeVisibleJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        m12042e();
        m12046i(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getWidth() > getHeight() && this.orientation != 0) {
            setOrientation(0);
        } else {
            if (getWidth() >= getHeight() || this.orientation == 1) {
                return;
            }
            setOrientation(1);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isTouchable) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            if (m12044g(event)) {
                m12043f(event);
            } else {
                this.touchOffset = 0.0f;
            }
            m12041d();
            setProgress(m12048k(event));
            InterfaceC7728b interfaceC7728b = this.progressListener;
            if (interfaceC7728b != null) {
                interfaceC7728b.mo11757b();
            }
            InterfaceC7728b interfaceC7728b2 = this.progressListener;
            if (interfaceC7728b2 != null) {
                interfaceC7728b2.onProgress(this.progress);
            }
        } else if (action == 1) {
            setProgress(m12048k(event));
            InterfaceC7728b interfaceC7728b3 = this.progressListener;
            if (interfaceC7728b3 != null) {
                interfaceC7728b3.mo11756a(this.progress);
            }
        } else if (action == 2) {
            setProgress(m12048k(event));
            InterfaceC7728b interfaceC7728b4 = this.progressListener;
            if (interfaceC7728b4 != null) {
                interfaceC7728b4.onProgress(this.progress);
            }
        }
        return true;
    }

    public final void setOrientation(int i9) {
        this.orientation = i9;
        postInvalidate();
    }

    public final void setProgress(float f10) {
        if (!this.isViewAlwaysShow) {
            if (this.thumbTime < 1.0f && !this.viewVisible) {
                this.viewVisible = true;
                m12051n();
            }
            m12045h();
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.progress = f10;
        postInvalidate();
    }

    public final void setProgressListener(InterfaceC7728b interfaceC7728b) {
        this.progressListener = interfaceC7728b;
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
            r2.thumbTime = r3
            r2.postInvalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.SketchProgressView.setThumbTime(float):void"); // DEX body: android/随身答/smali_classes5/com/zykj/view/widget/SketchProgressView.smali:1856
    }

    public final void setTouchable(boolean isTouchable) {
        this.isTouchable = isTouchable;
    }

    public final void setViewAlwaysShow(boolean isViewAlwaysShow) {
        this.isViewAlwaysShow = isViewAlwaysShow;
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.closeVisibleJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.paint.setAlpha(isViewAlwaysShow ? 255 : 0);
        postInvalidate();
    }

    public /* synthetic */ SketchProgressView(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchProgressView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        this.orientation = 1;
        this.thumbTime = 1.0f;
        this.thumbRectF = new RectF();
        this.paint = new Paint();
        this.radius = 2.0f;
        this.isViewAlwaysShow = true;
        this.viewVisible = true;
        this.isTouchable = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SketchProgressView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            setOrientation(typedArrayObtainStyledAttributes.getInt(R$styleable.SketchProgressView_sp_orientation, 1));
            this.radius = typedArrayObtainStyledAttributes.getDimension(R$styleable.SketchProgressView_sp_thumbRadius, 2.0f);
            this.paint.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.SketchProgressView_sp_thumbColor, Color.parseColor("#D9D9D9")));
            this.isViewAlwaysShow = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SketchProgressView_sp_alwaysShow, true);
            this.isTouchable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SketchProgressView_sp_touchable, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        m12050m();
    }
}
