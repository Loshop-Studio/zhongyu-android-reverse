package com.xuexiang.xui.widget.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;

/* loaded from: classes5.dex */
public class RippleView extends FrameLayout {

    /* renamed from: A */
    public final Runnable f15549A;

    /* renamed from: c */
    public int f15550c;

    /* renamed from: d */
    public int f15551d;

    /* renamed from: e */
    public int f15552e;

    /* renamed from: f */
    public int f15553f;

    /* renamed from: g */
    public int f15554g;

    /* renamed from: h */
    public Handler f15555h;

    /* renamed from: i */
    public float f15556i;

    /* renamed from: j */
    public boolean f15557j;

    /* renamed from: k */
    public int f15558k;

    /* renamed from: l */
    public int f15559l;

    /* renamed from: m */
    public int f15560m;

    /* renamed from: n */
    public float f15561n;

    /* renamed from: o */
    public float f15562o;

    /* renamed from: p */
    public int f15563p;

    /* renamed from: q */
    public float f15564q;

    /* renamed from: r */
    public ScaleAnimation f15565r;

    /* renamed from: s */
    public Boolean f15566s;

    /* renamed from: t */
    public Boolean f15567t;

    /* renamed from: u */
    public Integer f15568u;

    /* renamed from: v */
    public Paint f15569v;

    /* renamed from: w */
    public Bitmap f15570w;

    /* renamed from: x */
    public int f15571x;

    /* renamed from: y */
    public int f15572y;

    /* renamed from: z */
    public GestureDetector f15573z;

    public enum RippleType {
        SIMPLE(0),
        DOUBLE(1),
        RECTANGLE(2);


        /* renamed from: c */
        public int f15578c;

        RippleType(int i10) {
            this.f15578c = i10;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.RippleView$a */
    public class RunnableC8070a implements Runnable {
        public RunnableC8070a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RippleView.this.invalidate();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.RippleView$b */
    public class C8071b extends GestureDetector.SimpleOnGestureListener {
        public C8071b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            RippleView.this.m12433b(motionEvent);
            RippleView.this.m12439h(Boolean.TRUE);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.RippleView$c */
    public interface InterfaceC8072c {
    }

    public RippleView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public void m12433b(MotionEvent motionEvent) {
        m12434c(motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: c */
    public final void m12434c(float f10, float f11) {
        if (!isEnabled() || this.f15557j) {
            return;
        }
        if (this.f15566s.booleanValue()) {
            startAnimation(this.f15565r);
        }
        this.f15556i = Math.max(this.f15550c, this.f15551d);
        if (this.f15568u.intValue() != 2) {
            this.f15556i /= 2.0f;
        }
        this.f15556i -= this.f15572y;
        if (this.f15567t.booleanValue() || this.f15568u.intValue() == 1) {
            this.f15561n = getMeasuredWidth() >> 1;
            this.f15562o = getMeasuredHeight() >> 1;
        } else {
            this.f15561n = f10;
            this.f15562o = f11;
        }
        this.f15557j = true;
        if (this.f15568u.intValue() == 1 && this.f15570w == null) {
            this.f15570w = getDrawingCache(true);
        }
        invalidate();
    }

    /* renamed from: d */
    public final Bitmap m12435d(int i10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f15570w.getWidth(), this.f15570w.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        float f10 = this.f15561n;
        float f11 = i10;
        float f12 = this.f15562o;
        Rect rect = new Rect((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(this.f15561n, this.f15562o, f11, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.f15570w, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f15557j) {
            canvas.save();
            int i10 = this.f15553f;
            int i11 = this.f15558k;
            int i12 = this.f15552e;
            if (i10 <= i11 * i12) {
                this.f15557j = false;
                this.f15558k = 0;
                this.f15560m = -1;
                this.f15559l = 0;
                canvas.restore();
                invalidate();
                return;
            }
            this.f15555h.postDelayed(this.f15549A, i12);
            if (this.f15558k == 0) {
                canvas.save();
            }
            canvas.drawCircle(this.f15561n, this.f15562o, this.f15556i * ((this.f15558k * this.f15552e) / this.f15553f), this.f15569v);
            this.f15569v.setColor(Color.parseColor("#FFFF4444"));
            if (this.f15568u.intValue() == 1 && this.f15570w != null) {
                int i13 = this.f15558k;
                int i14 = this.f15552e;
                float f10 = i13 * i14;
                int i15 = this.f15553f;
                if (f10 / i15 > 0.4f) {
                    if (this.f15560m == -1) {
                        this.f15560m = i15 - (i13 * i14);
                    }
                    int i16 = this.f15559l + 1;
                    this.f15559l = i16;
                    Bitmap bitmapM12435d = m12435d((int) (this.f15556i * ((i16 * i14) / this.f15560m)));
                    canvas.drawBitmap(bitmapM12435d, 0.0f, 0.0f, this.f15569v);
                    bitmapM12435d.recycle();
                }
            }
            this.f15569v.setColor(this.f15571x);
            if (this.f15568u.intValue() == 1) {
                float f11 = this.f15558k;
                int i17 = this.f15552e;
                if ((f11 * i17) / this.f15553f > 0.6f) {
                    Paint paint = this.f15569v;
                    int i18 = this.f15554g;
                    paint.setAlpha((int) (i18 - (i18 * ((this.f15559l * i17) / this.f15560m))));
                } else {
                    this.f15569v.setAlpha(this.f15554g);
                }
            } else {
                Paint paint2 = this.f15569v;
                int i19 = this.f15554g;
                paint2.setAlpha((int) (i19 - (i19 * ((this.f15558k * this.f15552e) / this.f15553f))));
            }
            this.f15558k++;
        }
    }

    /* renamed from: e */
    public final void m12436e(Context context, AttributeSet attributeSet, int i10) {
        m12437f(context, attributeSet, i10);
        m12438g();
        this.f15573z = new GestureDetector(context, new C8071b());
        setDrawingCacheEnabled(true);
        setClickable(true);
    }

    /* renamed from: f */
    public final void m12437f(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RippleView, i10, 0);
        this.f15571x = typedArrayObtainStyledAttributes.getColor(R$styleable.RippleView_rv_color, AbstractC8040f.m12202c(R$color.xui_config_color_white));
        this.f15568u = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(R$styleable.RippleView_rv_type, 0));
        this.f15566s = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R$styleable.RippleView_rv_zoom, false));
        this.f15567t = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R$styleable.RippleView_rv_centered, false));
        this.f15553f = typedArrayObtainStyledAttributes.getInteger(R$styleable.RippleView_rv_rippleDuration, this.f15553f);
        this.f15552e = typedArrayObtainStyledAttributes.getInteger(R$styleable.RippleView_rv_frameRate, this.f15552e);
        this.f15554g = typedArrayObtainStyledAttributes.getInteger(R$styleable.RippleView_rv_alpha, this.f15554g);
        this.f15572y = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RippleView_rv_ripplePadding, 0);
        this.f15555h = new Handler();
        this.f15564q = typedArrayObtainStyledAttributes.getFloat(R$styleable.RippleView_rv_zoomScale, 1.03f);
        this.f15563p = typedArrayObtainStyledAttributes.getInt(R$styleable.RippleView_rv_zoomDuration, 200);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: g */
    public final void m12438g() {
        Paint paint = new Paint();
        this.f15569v = paint;
        paint.setAntiAlias(true);
        this.f15569v.setStyle(Paint.Style.FILL);
        this.f15569v.setColor(this.f15571x);
        this.f15569v.setAlpha(this.f15554g);
        setWillNotDraw(false);
    }

    public int getFrameRate() {
        return this.f15552e;
    }

    public int getRippleAlpha() {
        return this.f15554g;
    }

    public int getRippleColor() {
        return this.f15571x;
    }

    public int getRippleDuration() {
        return this.f15553f;
    }

    public int getRipplePadding() {
        return this.f15572y;
    }

    public RippleType getRippleType() {
        return RippleType.values()[this.f15568u.intValue()];
    }

    public int getZoomDuration() {
        return this.f15563p;
    }

    public float getZoomScale() {
        return this.f15564q;
    }

    /* renamed from: h */
    public final void m12439h(Boolean bool) {
        if (getParent() instanceof AdapterView) {
            AdapterView<?> adapterView = (AdapterView) getParent();
            int positionForView = adapterView.getPositionForView(this);
            long itemIdAtPosition = adapterView.getItemIdAtPosition(positionForView);
            if (bool.booleanValue()) {
                if (adapterView.getOnItemLongClickListener() != null) {
                    adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, positionForView, itemIdAtPosition);
                }
            } else if (adapterView.getOnItemClickListener() != null) {
                adapterView.getOnItemClickListener().onItemClick(adapterView, this, positionForView, itemIdAtPosition);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f15550c = i10;
        this.f15551d = i11;
        float f10 = this.f15564q;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f10, 1.0f, f10, i10 >> 1, i11 >> 1);
        this.f15565r = scaleAnimation;
        scaleAnimation.setDuration(this.f15563p);
        this.f15565r.setRepeatMode(2);
        this.f15565r.setRepeatCount(1);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f15573z.onTouchEvent(motionEvent)) {
            m12433b(motionEvent);
            m12439h(Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCentered(Boolean bool) {
        this.f15567t = bool;
    }

    public void setFrameRate(int i10) {
        this.f15552e = i10;
    }

    public void setOnRippleCompleteListener(InterfaceC8072c interfaceC8072c) {
    }

    public void setRippleAlpha(int i10) {
        this.f15554g = i10;
    }

    public void setRippleColor(@ColorRes int i10) {
        this.f15571x = getResources().getColor(i10);
    }

    public void setRippleDuration(int i10) {
        this.f15553f = i10;
    }

    public void setRipplePadding(int i10) {
        this.f15572y = i10;
    }

    public void setRippleType(RippleType rippleType) {
        this.f15568u = Integer.valueOf(rippleType.ordinal());
    }

    public void setZoomDuration(int i10) {
        this.f15563p = i10;
    }

    public void setZoomScale(float f10) {
        this.f15564q = f10;
    }

    public void setZooming(Boolean bool) {
        this.f15566s = bool;
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.RippleViewStyle);
    }

    public RippleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15552e = 10;
        this.f15553f = 400;
        this.f15554g = 90;
        this.f15556i = 0.0f;
        this.f15557j = false;
        this.f15558k = 0;
        this.f15559l = 0;
        this.f15560m = -1;
        this.f15561n = -1.0f;
        this.f15562o = -1.0f;
        this.f15549A = new RunnableC8070a();
        m12436e(context, attributeSet, i10);
    }
}
