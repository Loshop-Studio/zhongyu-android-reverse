package com.xuexiang.xui.widget.picker.wheelview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.blankj.utilcode.util.HandlerC3388h;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p051e3.InterfaceC5455a;
import p057f3.C5523a;
import p057f3.InterfaceC5524b;

/* loaded from: classes3.dex */
public class WheelView extends View implements HasTypeface {

    /* renamed from: a */
    public final Context f4590a;

    /* renamed from: b */
    public final HandlerC3388h f4591b;

    /* renamed from: c */
    public final GestureDetector f4592c;

    /* renamed from: d */
    public final ScheduledExecutorService f4593d;

    /* renamed from: e */
    public ScheduledFuture f4594e;

    /* renamed from: f */
    public final TextPaint f4595f;

    /* renamed from: g */
    public final TextPaint f4596g;

    /* renamed from: h */
    public final Paint f4597h;

    /* renamed from: i */
    public int f4598i;

    /* renamed from: j */
    public Typeface f4599j;

    /* renamed from: k */
    public int f4600k;

    /* renamed from: l */
    public int f4601l;

    /* renamed from: m */
    public int f4602m;

    /* renamed from: n */
    public float f4603n;

    /* renamed from: o */
    public boolean f4604o;

    /* renamed from: p */
    public float f4605p;

    /* renamed from: q */
    public int f4606q;

    /* renamed from: r */
    public int f4607r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DividerType {
        public static final DividerType FILL;
        public static final DividerType WRAP;

        /* renamed from: a */
        public static final /* synthetic */ DividerType[] f4608a;

        static {
            DividerType dividerType = new DividerType("FILL", 0);
            FILL = dividerType;
            DividerType dividerType2 = new DividerType("WRAP", 1);
            WRAP = dividerType2;
            f4608a = new DividerType[]{dividerType, dividerType2};
        }

        public static DividerType valueOf(String str) {
            return (DividerType) Enum.valueOf(DividerType.class, str);
        }

        public static DividerType[] values() {
            return (DividerType[]) f4608a.clone();
        }
    }

    public WheelView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m3535a() {
        ScheduledFuture scheduledFuture = this.f4594e;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f4594e.cancel(true);
        this.f4594e = null;
    }

    public final InterfaceC5455a getAdapter() {
        return null;
    }

    public final int getCurrentItem() {
        return 0;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f4591b;
    }

    public int getInitPosition() {
        return this.f4606q;
    }

    public float getItemHeight() {
        return 0.0f;
    }

    public int getItemsCount() {
        return 0;
    }

    public float getTotalScrollY() {
        return this.f4605p;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f4592c.onTouchEvent(motionEvent);
        throw null;
    }

    public final void setAdapter(InterfaceC5455a interfaceC5455a) {
        invalidate();
    }

    public final void setCurrentItem(int i) {
        this.f4606q = i;
        this.f4605p = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z8) {
        this.f4604o = z8;
    }

    public void setDividerColor(int i) {
        this.f4602m = i;
        this.f4597h.setColor(i);
    }

    public void setDividerType(DividerType dividerType) {
    }

    public void setGravity(int i) {
    }

    public void setIsOptions(boolean z8) {
    }

    public void setLabel(String str) {
    }

    public void setLineSpacingMultiplier(float f) {
        if (f != 0.0f) {
            this.f4603n = f;
            if (f < 1.0f) {
                this.f4603n = 1.0f;
            } else if (f > 4.0f) {
                this.f4603n = 4.0f;
            }
        }
    }

    public void setTextColorCenter(int i) {
        this.f4601l = i;
        this.f4596g.setColor(i);
    }

    public void setTextColorOut(int i) {
        this.f4600k = i;
        this.f4595f.setColor(i);
    }

    public final void setTextSize(float f) {
        if (f > 0.0f) {
            int i = (int) (this.f4590a.getResources().getDisplayMetrics().density * f);
            this.f4598i = i;
            this.f4595f.setTextSize(i);
            this.f4596g.setTextSize(this.f4598i);
        }
    }

    public void setTextXOffset(int i) {
        if (i != 0) {
            this.f4596g.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f) {
        this.f4605p = f;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public final void setTypeface(Typeface typeface) {
        this.f4599j = typeface;
        this.f4595f.setTypeface(typeface);
        this.f4596g.setTypeface(this.f4599j);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4593d = Executors.newSingleThreadScheduledExecutor();
        this.f4599j = Typeface.MONOSPACE;
        this.f4603n = 1.6f;
        this.f4607r = 0;
        this.f4598i = getResources().getDimensionPixelSize(R$dimen.default_wheel_view_text_size);
        float f = getResources().getDisplayMetrics().density;
        if (f >= 1.0f && ((1.0f > f || f >= 1.5f) && ((1.5f > f || f >= 2.0f) && 2.0f <= f))) {
            int i = (f > 3.0f ? 1 : (f == 3.0f ? 0 : -1));
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WheelView, 0, 0);
            typedArrayObtainStyledAttributes.getInt(R$styleable.WheelView_wv_gravity, 17);
            this.f4600k = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorOut, -5723992);
            this.f4601l = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_textColorCenter, -14013910);
            this.f4602m = typedArrayObtainStyledAttributes.getColor(R$styleable.WheelView_wv_dividerColor, -2763307);
            this.f4598i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.WheelView_wv_textSize, this.f4598i);
            this.f4603n = typedArrayObtainStyledAttributes.getFloat(R$styleable.WheelView_wv_lineSpacingMultiplier, this.f4603n);
            typedArrayObtainStyledAttributes.recycle();
        }
        float f7 = this.f4603n;
        if (f7 < 1.0f) {
            this.f4603n = 1.0f;
        } else if (f7 > 4.0f) {
            this.f4603n = 4.0f;
        }
        this.f4590a = context;
        this.f4591b = new HandlerC3388h(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C5523a(this));
        this.f4592c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f4604o = true;
        this.f4605p = 0.0f;
        this.f4606q = -1;
        TextPaint textPaint = new TextPaint();
        this.f4595f = textPaint;
        textPaint.setColor(this.f4600k);
        this.f4595f.setAntiAlias(true);
        this.f4595f.setTypeface(this.f4599j);
        this.f4595f.setTextSize(this.f4598i);
        TextPaint textPaint2 = new TextPaint();
        this.f4596g = textPaint2;
        textPaint2.setColor(this.f4601l);
        this.f4596g.setAntiAlias(true);
        this.f4596g.setTextScaleX(1.1f);
        this.f4596g.setTypeface(this.f4599j);
        this.f4596g.setTextSize(this.f4598i);
        Paint paint = new Paint();
        this.f4597h = paint;
        paint.setColor(this.f4602m);
        this.f4597h.setAntiAlias(true);
        setLayerType(1, null);
    }

    public final void setOnItemSelectedListener(InterfaceC5524b interfaceC5524b) {
    }
}
