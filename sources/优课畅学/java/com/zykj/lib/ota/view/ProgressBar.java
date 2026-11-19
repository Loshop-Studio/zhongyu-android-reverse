package com.zykj.lib.ota.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.timepicker.TimeModel;
import com.zykj.lib.ota.R$styleable;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;
import p077d8.AbstractC8323h;
import p212p7.InterfaceC9760a;

/* loaded from: classes4.dex */
public class ProgressBar extends android.widget.ProgressBar {

    /* renamed from: t */
    public static final C7382a f10277t = new C7382a(null);

    /* renamed from: u */
    public static final String f10278u = android.widget.ProgressBar.class.getSimpleName();

    /* renamed from: a */
    public Paint f10279a;

    /* renamed from: b */
    public Mode f10280b;

    /* renamed from: c */
    public int f10281c;

    /* renamed from: d */
    public int f10282d;

    /* renamed from: e */
    public int f10283e;

    /* renamed from: f */
    public int f10284f;

    /* renamed from: g */
    public int f10285g;

    /* renamed from: h */
    public int f10286h;

    /* renamed from: i */
    public int f10287i;

    /* renamed from: j */
    public boolean f10288j;

    /* renamed from: k */
    public boolean f10289k;

    /* renamed from: l */
    public int f10290l;

    /* renamed from: m */
    public int f10291m;

    /* renamed from: n */
    public int f10292n;

    /* renamed from: o */
    public int f10293o;

    /* renamed from: p */
    public int f10294p;

    /* renamed from: q */
    public RectF f10295q;

    /* renamed from: r */
    public final Rect f10296r;

    /* renamed from: s */
    public String f10297s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {

        /* renamed from: a */
        public static final Mode f10298a = new Mode("System", 0);

        /* renamed from: b */
        public static final Mode f10299b = new Mode("Horizontal", 1);

        /* renamed from: c */
        public static final Mode f10300c = new Mode("Circle", 2);

        /* renamed from: d */
        public static final Mode f10301d = new Mode("Comet", 3);

        /* renamed from: e */
        public static final Mode f10302e = new Mode("Wave", 4);

        /* renamed from: f */
        public static final /* synthetic */ Mode[] f10303f;

        /* renamed from: g */
        public static final /* synthetic */ InterfaceC9760a f10304g;

        static {
            Mode[] modeArrM9486a = m9486a();
            f10303f = modeArrM9486a;
            f10304g = AbstractC9108a.m16085a(modeArrM9486a);
        }

        public Mode(String str, int i10) {
        }

        /* renamed from: a */
        public static final /* synthetic */ Mode[] m9486a() {
            return new Mode[]{f10298a, f10299b, f10300c, f10301d, f10302e};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f10303f.clone();
        }
    }

    /* renamed from: com.zykj.lib.ota.view.ProgressBar$a */
    public static final class C7382a {
        public /* synthetic */ C7382a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final int m9487a(Context context, float f10) {
            AbstractC9133u.m16133g(context, "context");
            return (int) TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
        }

        /* renamed from: b */
        public final int m9488b(Context context, float f10) {
            AbstractC9133u.m16133g(context, "context");
            return (int) TypedValue.applyDimension(2, f10, context.getResources().getDisplayMetrics());
        }

        public C7382a() {
        }
    }

    /* renamed from: com.zykj.lib.ota.view.ProgressBar$b */
    public static final /* synthetic */ class C7383b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10305a;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.f10298a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.f10299b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.f10300c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Mode.f10301d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Mode.f10302e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10305a = iArr;
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.progressBarStyle);
        this.f10279a = new Paint();
        this.f10280b = Mode.f10298a;
        this.f10296r = new Rect();
        if (context != null) {
            m9483d(context);
            m9482c(context, attributeSet);
        }
        this.f10292n = AbstractC8323h.m13510e(this.f10285g, this.f10287i);
    }

    /* renamed from: a */
    public final void m9480a() {
        C9114c0 c9114c0 = C9114c0.f17482a;
        String str = String.format(TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf((int) (((getProgress() * 1.0f) / getMax()) * 100))}, 1));
        AbstractC9133u.m16132f(str, "format(...)");
        this.f10297s = str + "%";
        this.f10279a.setTextSize((float) this.f10282d);
        this.f10279a.setStyle(Paint.Style.FILL);
        Paint paint = this.f10279a;
        String str2 = this.f10297s;
        AbstractC9133u.m16130d(str2);
        paint.getTextBounds(str2, 0, str2.length(), this.f10296r);
        this.f10294p = this.f10296r.width();
        this.f10293o = this.f10296r.height();
    }

    /* renamed from: b */
    public final void m9481b(int i10, TypedArray typedArray) {
        if (i10 == R$styleable.ProgressBar_pb_mode) {
            this.f10280b = Mode.values()[typedArray.getInt(i10, Mode.f10298a.ordinal())];
            return;
        }
        if (i10 == R$styleable.ProgressBar_pb_textColor) {
            this.f10281c = typedArray.getColor(i10, this.f10281c);
            return;
        }
        if (i10 == R$styleable.ProgressBar_pb_textSize) {
            this.f10282d = typedArray.getDimensionPixelOffset(i10, this.f10282d);
            return;
        }
        if (i10 == R$styleable.ProgressBar_pb_textMargin) {
            this.f10283e = typedArray.getDimensionPixelOffset(i10, this.f10283e);
            return;
        }
        if (i10 == R$styleable.ProgressBar_pb_reachedColor) {
            this.f10284f = typedArray.getColor(i10, this.f10284f);
            return;
        }
        if (i10 == R$styleable.ProgressBar_pb_reachedHeight) {
            this.f10285g = typedArray.getDimensionPixelOffset(i10, this.f10285g);
            return;
        }
        if (i10 == R$styleable.ProgressBar_pb_unReachedColor) {
            this.f10286h = typedArray.getColor(i10, this.f10286h);
            return;
        }
        if (i10 == R$styleable.ProgressBar_pb_unReachedHeight) {
            this.f10287i = typedArray.getDimensionPixelOffset(i10, this.f10287i);
            return;
        }
        if (i10 == R$styleable.ProgressBar_pb_isCapRounded) {
            boolean z10 = typedArray.getBoolean(i10, this.f10288j);
            this.f10288j = z10;
            if (z10) {
                this.f10279a.setStrokeCap(Paint.Cap.ROUND);
                return;
            }
            return;
        }
        if (i10 == R$styleable.ProgressBar_pb_isHiddenText) {
            this.f10289k = typedArray.getBoolean(i10, this.f10289k);
        } else if (i10 == R$styleable.ProgressBar_pb_radius) {
            this.f10290l = typedArray.getDimensionPixelOffset(i10, this.f10290l);
        }
    }

    /* renamed from: c */
    public final void m9482c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ProgressBar);
        AbstractC9133u.m16132f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            m9481b(typedArrayObtainStyledAttributes.getIndex(i10), typedArrayObtainStyledAttributes);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void m9483d(Context context) {
        this.f10279a.setAntiAlias(true);
        this.f10281c = Color.parseColor("#70A800");
        C7382a c7382a = f10277t;
        this.f10282d = c7382a.m9488b(context, 10.0f);
        this.f10283e = c7382a.m9487a(context, 4.0f);
        this.f10284f = Color.parseColor("#70A800");
        this.f10285g = c7382a.m9487a(context, 2.0f);
        this.f10286h = Color.parseColor("#CCCCCC");
        this.f10287i = c7382a.m9487a(context, 1.0f);
        this.f10288j = false;
        this.f10289k = false;
        this.f10290l = c7382a.m9487a(context, 16.0f);
    }

    /* renamed from: e */
    public final void m9484e(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getPaddingLeft() + (this.f10292n / 2), getPaddingTop() + (this.f10292n / 2));
        Paint paint = this.f10279a;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f10279a.setColor(this.f10286h);
        this.f10279a.setStrokeWidth(this.f10287i);
        int i10 = this.f10290l;
        canvas.drawCircle(i10, i10, i10, this.f10279a);
        this.f10279a.setStyle(style);
        this.f10279a.setColor(this.f10284f);
        this.f10279a.setStrokeWidth(this.f10285g);
        float progress = ((getProgress() * 1.0f) / getMax()) * 360;
        RectF rectF = this.f10295q;
        if (rectF != null) {
            canvas2 = canvas;
            canvas2.drawArc(rectF, -90.0f, progress, false, this.f10279a);
        } else {
            canvas2 = canvas;
        }
        if (!this.f10289k) {
            m9480a();
            this.f10279a.setStyle(Paint.Style.FILL);
            this.f10279a.setColor(this.f10281c);
            this.f10279a.setTextAlign(Paint.Align.CENTER);
            String str = this.f10297s;
            if (str != null) {
                canvas2.drawText(str, this.f10290l, r0 + (this.f10293o / 2), this.f10279a);
            }
        }
        canvas2.restore();
    }

    /* renamed from: f */
    public final void m9485f(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getPaddingLeft(), getMeasuredHeight() / 2);
        int i10 = this.f10291m;
        float progress = ((getProgress() * 1.0f) / getMax()) * i10;
        if (this.f10289k) {
            if (progress > i10) {
                progress = i10;
            }
            float f10 = progress;
            if (f10 > 0.0f) {
                this.f10279a.setColor(this.f10284f);
                this.f10279a.setStrokeWidth(this.f10285g);
                this.f10279a.setStyle(Paint.Style.STROKE);
                canvas.drawLine(0.0f, 0.0f, f10, 0.0f, this.f10279a);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            if (this.f10288j) {
                f10 += ((this.f10285g + this.f10287i) * 1.0f) / 2;
            }
            float f11 = f10;
            if (f11 < this.f10291m) {
                this.f10279a.setColor(this.f10286h);
                this.f10279a.setStrokeWidth(this.f10287i);
                this.f10279a.setStyle(Paint.Style.STROKE);
                canvas2.drawLine(f11, 0.0f, this.f10291m, 0.0f, this.f10279a);
            }
        } else {
            canvas2 = canvas;
            m9480a();
            float f12 = (this.f10291m - this.f10294p) - this.f10283e;
            float f13 = progress > f12 ? f12 : progress;
            if (f13 > 0.0f) {
                this.f10279a.setColor(this.f10284f);
                this.f10279a.setStrokeWidth(this.f10285g);
                this.f10279a.setStyle(Paint.Style.STROKE);
                canvas2.drawLine(0.0f, 0.0f, f13, 0.0f, this.f10279a);
            }
            this.f10279a.setTextAlign(Paint.Align.LEFT);
            this.f10279a.setStyle(Paint.Style.FILL);
            this.f10279a.setColor(this.f10281c);
            if (f13 > 0.0f) {
                f13 += this.f10283e;
            }
            String str = this.f10297s;
            if (str != null) {
                canvas2.drawText(str, f13, this.f10293o / 2, this.f10279a);
            }
            float f14 = f13 + this.f10294p + this.f10283e;
            if (f14 < this.f10291m) {
                this.f10279a.setColor(this.f10286h);
                this.f10279a.setStrokeWidth(this.f10287i);
                this.f10279a.setStyle(Paint.Style.STROKE);
                canvas2.drawLine(f14, 0.0f, this.f10291m, 0.0f, this.f10279a);
            }
        }
        canvas2.restore();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        try {
            AbstractC9133u.m16133g(canvas, "canvas");
            int i10 = C7383b.f10305a[this.f10280b.ordinal()];
            if (i10 == 1) {
                super.onDraw(canvas);
            } else if (i10 == 2) {
                m9485f(canvas);
            } else if (i10 == 3) {
                m9484e(canvas);
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                super.onDraw(canvas);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        try {
            int i12 = C7383b.f10305a[this.f10280b.ordinal()];
            if (i12 == 1) {
                super.onMeasure(i10, i11);
            } else if (i12 == 2) {
                m9480a();
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.resolveSize(getPaddingTop() + getPaddingBottom() + (this.f10289k ? AbstractC8323h.m13510e(this.f10285g, this.f10287i) : AbstractC8323h.m13510e(this.f10293o, AbstractC8323h.m13510e(this.f10285g, this.f10287i))), i11));
                this.f10291m = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else if (i12 == 3) {
                int paddingLeft = (this.f10290l * 2) + this.f10292n + getPaddingLeft() + getPaddingRight();
                int iM13513h = AbstractC8323h.m13513h(View.resolveSize(paddingLeft, i10), View.resolveSize(paddingLeft, i11));
                this.f10290l = (((iM13513h - getPaddingLeft()) - getPaddingRight()) - this.f10292n) / 2;
                if (this.f10295q == null) {
                    this.f10295q = new RectF();
                }
                RectF rectF = this.f10295q;
                AbstractC9133u.m16130d(rectF);
                int i13 = this.f10290l;
                rectF.set(0.0f, 0.0f, i13 * 2, i13 * 2);
                setMeasuredDimension(iM13513h, iM13513h);
            } else {
                if (i12 != 4 && i12 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                super.onMeasure(i10, i11);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
