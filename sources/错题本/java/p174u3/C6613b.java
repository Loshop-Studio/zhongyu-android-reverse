package p174u3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.xuexiang.xui.R$styleable;
import p164t1.AbstractC6582a;

/* renamed from: u3.b */
/* loaded from: classes3.dex */
public final class C6613b {

    /* renamed from: a */
    public final Context f11043a;

    /* renamed from: b */
    public int f11044b;

    /* renamed from: c */
    public int f11045c;

    /* renamed from: d */
    public int f11046d;

    /* renamed from: e */
    public int f11047e;

    /* renamed from: f */
    public final int f11048f;

    /* renamed from: g */
    public final int f11049g;

    /* renamed from: h */
    public String f11050h;

    /* renamed from: i */
    public int f11051i;

    /* renamed from: j */
    public int f11052j;

    /* renamed from: k */
    public String f11053k;

    /* renamed from: l */
    public int f11054l;

    /* renamed from: m */
    public boolean f11055m;

    /* renamed from: n */
    public int f11056n;

    /* renamed from: o */
    public final Paint f11057o;

    /* renamed from: p */
    public final Paint f11058p;

    /* renamed from: q */
    public final Path f11059q;

    /* renamed from: r */
    public final Path f11060r;

    /* renamed from: s */
    public final Paint f11061s;

    /* renamed from: t */
    public final Rect f11062t;

    public C6613b(Context context, AttributeSet attributeSet, int i) {
        this.f11043a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LabelView, i, 0);
        this.f11045c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_label_distance, m6255a(40.0f));
        this.f11046d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_label_height, m6255a(20.0f));
        this.f11047e = typedArrayObtainStyledAttributes.getColor(R$styleable.LabelView_label_backgroundColor, -1624781376);
        this.f11048f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_label_strokeWidth, m6255a(1.0f));
        this.f11049g = typedArrayObtainStyledAttributes.getColor(R$styleable.LabelView_label_strokeColor, 0);
        this.f11050h = typedArrayObtainStyledAttributes.getString(R$styleable.LabelView_label_text);
        this.f11051i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_label_textSize, m6255a(14.0f));
        this.f11052j = typedArrayObtainStyledAttributes.getInt(R$styleable.LabelView_label_textStyle, 0);
        this.f11053k = typedArrayObtainStyledAttributes.getString(R$styleable.LabelView_label_textFont);
        this.f11054l = typedArrayObtainStyledAttributes.getColor(R$styleable.LabelView_label_textColor, -1);
        this.f11055m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LabelView_label_visual, true);
        this.f11056n = typedArrayObtainStyledAttributes.getInteger(R$styleable.LabelView_label_orientation, 1);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f11057o = paint;
        paint.setDither(true);
        this.f11057o.setAntiAlias(true);
        this.f11057o.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f11058p = paint2;
        paint2.setDither(true);
        this.f11058p.setAntiAlias(true);
        this.f11058p.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        this.f11059q = path;
        path.reset();
        Path path2 = new Path();
        this.f11060r = path2;
        path2.reset();
        Paint paint3 = new Paint();
        this.f11061s = paint3;
        paint3.setDither(true);
        this.f11061s.setAntiAlias(true);
        this.f11061s.setStrokeJoin(Paint.Join.ROUND);
        this.f11061s.setStrokeCap(Paint.Cap.SQUARE);
        this.f11062t = new Rect();
    }

    /* renamed from: a */
    public final int m6255a(float f) {
        return (int) ((f * this.f11043a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public final void m6256b(Canvas canvas, int i, int i8) {
        if (!this.f11055m || this.f11050h == null) {
            return;
        }
        int i9 = this.f11045c;
        int i10 = this.f11046d;
        float f = i10 / 2.0f;
        float f7 = i9 + f;
        float f8 = (i - i9) - i10;
        float f9 = i;
        float f10 = (i8 - i9) - i10;
        float f11 = i8;
        int i11 = this.f11056n;
        if (i11 == 1) {
            this.f11059q.reset();
            this.f11059q.moveTo(0.0f, this.f11045c);
            this.f11059q.lineTo(this.f11045c, 0.0f);
            this.f11059q.lineTo(this.f11045c + this.f11046d, 0.0f);
            this.f11059q.lineTo(0.0f, this.f11045c + this.f11046d);
            this.f11059q.close();
            this.f11060r.reset();
            this.f11060r.moveTo(0.0f, this.f11045c + f);
            this.f11060r.lineTo(this.f11045c + f, 0.0f);
            this.f11060r.close();
        } else if (i11 == 2) {
            this.f11059q.reset();
            this.f11059q.moveTo(f8, 0.0f);
            this.f11059q.lineTo(this.f11046d + f8, 0.0f);
            this.f11059q.lineTo(f9, this.f11045c);
            this.f11059q.lineTo(f9, this.f11045c + this.f11046d);
            this.f11059q.close();
            this.f11060r.reset();
            this.f11060r.moveTo(f8 + f, 0.0f);
            this.f11060r.lineTo(f9, this.f11045c + f);
            this.f11060r.close();
        } else if (i11 == 3) {
            this.f11059q.reset();
            this.f11059q.moveTo(0.0f, f10);
            this.f11059q.lineTo(this.f11045c + this.f11046d, f11);
            this.f11059q.lineTo(this.f11045c, f11);
            this.f11059q.lineTo(0.0f, this.f11046d + f10);
            this.f11059q.close();
            this.f11060r.reset();
            this.f11060r.moveTo(0.0f, f10 + f);
            this.f11060r.lineTo(this.f11045c + f, f11);
            this.f11060r.close();
        } else if (i11 == 4) {
            this.f11059q.reset();
            this.f11059q.moveTo(f8, f11);
            this.f11059q.lineTo(f9, f10);
            this.f11059q.lineTo(f9, this.f11046d + f10);
            this.f11059q.lineTo(this.f11046d + f8, f11);
            this.f11059q.close();
            this.f11060r.reset();
            this.f11060r.moveTo(f8 + f, f11);
            this.f11060r.lineTo(f9, f10 + f);
            this.f11060r.close();
        }
        this.f11057o.setColor(this.f11047e);
        int i12 = this.f11044b;
        if (i12 != 0) {
            this.f11057o.setAlpha(i12);
        }
        this.f11058p.setColor(this.f11049g);
        this.f11058p.setStrokeWidth(this.f11048f);
        canvas.drawPath(this.f11059q, this.f11057o);
        canvas.drawPath(this.f11059q, this.f11058p);
        this.f11061s.setTextSize(this.f11051i);
        this.f11061s.setColor(this.f11054l);
        String str = this.f11050h;
        this.f11061s.getTextBounds(str, 0, str.length(), this.f11062t);
        String str2 = this.f11053k;
        if (str2 == null || str2.length() == 0) {
            this.f11061s.setTypeface(Typeface.defaultFromStyle(this.f11052j));
        } else {
            AbstractC6582a.m6219c(this.f11053k);
            this.f11061s.setTypeface(null);
        }
        float fWidth = ((f7 * 1.4142135f) / 2.0f) - (this.f11062t.width() / 2.0f);
        canvas.drawTextOnPath(this.f11050h, this.f11060r, fWidth < 0.0f ? 0.0f : fWidth, this.f11062t.height() / 2.0f, this.f11061s);
    }

    /* renamed from: c */
    public final int m6257c(float f) {
        return (int) ((f / this.f11043a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: d */
    public final void m6258d(View view, int i) {
        float f = i;
        if (this.f11045c != m6255a(f)) {
            this.f11045c = m6255a(f);
            view.invalidate();
        }
    }

    /* renamed from: e */
    public final void m6259e(View view, int i) {
        float f = i;
        if (this.f11046d != m6255a(f)) {
            this.f11046d = m6255a(f);
            view.invalidate();
        }
    }

    /* renamed from: f */
    public final void m6260f(View view, int i) {
        if (this.f11056n == i || i > 4 || i < 1) {
            return;
        }
        this.f11056n = i;
        view.invalidate();
    }
}
