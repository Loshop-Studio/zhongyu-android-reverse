package p263n9;

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
import com.xuexiang.xui.utils.AbstractC8042h;
import p420y7.AbstractC11916b;

/* renamed from: n9.a */
/* loaded from: classes5.dex */
public final class C10337a {

    /* renamed from: a */
    public Context f24620a;

    /* renamed from: b */
    public int f24621b;

    /* renamed from: c */
    public int f24622c;

    /* renamed from: d */
    public int f24623d;

    /* renamed from: e */
    public int f24624e;

    /* renamed from: f */
    public int f24625f;

    /* renamed from: g */
    public int f24626g;

    /* renamed from: h */
    public String f24627h;

    /* renamed from: i */
    public int f24628i;

    /* renamed from: j */
    public int f24629j;

    /* renamed from: k */
    public String f24630k;

    /* renamed from: l */
    public int f24631l;

    /* renamed from: m */
    public boolean f24632m;

    /* renamed from: n */
    public int f24633n;

    /* renamed from: o */
    public Paint f24634o;

    /* renamed from: p */
    public Paint f24635p;

    /* renamed from: q */
    public Path f24636q;

    /* renamed from: r */
    public Path f24637r;

    /* renamed from: s */
    public Paint f24638s;

    /* renamed from: t */
    public Rect f24639t;

    public C10337a(Context context, AttributeSet attributeSet, int i10) {
        this.f24620a = context;
        m21603l(context, attributeSet, i10);
        m21604m();
    }

    /* renamed from: a */
    public final void m21592a(int i10, int i11) {
        int i12 = this.f24622c;
        int i13 = this.f24623d;
        float f10 = (i10 - i12) - i13;
        float f11 = i10;
        float f12 = (i11 - i12) - i13;
        float f13 = i11;
        float f14 = i13 / 2.0f;
        int i14 = this.f24633n;
        if (i14 == 1) {
            this.f24636q.reset();
            this.f24636q.moveTo(0.0f, this.f24622c);
            this.f24636q.lineTo(this.f24622c, 0.0f);
            this.f24636q.lineTo(this.f24622c + this.f24623d, 0.0f);
            this.f24636q.lineTo(0.0f, this.f24622c + this.f24623d);
            this.f24636q.close();
            this.f24637r.reset();
            this.f24637r.moveTo(0.0f, this.f24622c + f14);
            this.f24637r.lineTo(this.f24622c + f14, 0.0f);
            this.f24637r.close();
            return;
        }
        if (i14 == 2) {
            this.f24636q.reset();
            this.f24636q.moveTo(f10, 0.0f);
            this.f24636q.lineTo(this.f24623d + f10, 0.0f);
            this.f24636q.lineTo(f11, this.f24622c);
            this.f24636q.lineTo(f11, this.f24622c + this.f24623d);
            this.f24636q.close();
            this.f24637r.reset();
            this.f24637r.moveTo(f10 + f14, 0.0f);
            this.f24637r.lineTo(f11, this.f24622c + f14);
            this.f24637r.close();
            return;
        }
        if (i14 == 3) {
            this.f24636q.reset();
            this.f24636q.moveTo(0.0f, f12);
            this.f24636q.lineTo(this.f24622c + this.f24623d, f13);
            this.f24636q.lineTo(this.f24622c, f13);
            this.f24636q.lineTo(0.0f, this.f24623d + f12);
            this.f24636q.close();
            this.f24637r.reset();
            this.f24637r.moveTo(0.0f, f12 + f14);
            this.f24637r.lineTo(this.f24622c + f14, f13);
            this.f24637r.close();
            return;
        }
        if (i14 != 4) {
            return;
        }
        this.f24636q.reset();
        this.f24636q.moveTo(f10, f13);
        this.f24636q.lineTo(f11, f12);
        this.f24636q.lineTo(f11, this.f24623d + f12);
        this.f24636q.lineTo(this.f24623d + f10, f13);
        this.f24636q.close();
        this.f24637r.reset();
        this.f24637r.moveTo(f10 + f14, f13);
        this.f24637r.lineTo(f11, f12 + f14);
        this.f24637r.close();
    }

    /* renamed from: b */
    public final int m21593b(float f10) {
        return (int) ((f10 * this.f24620a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public int m21594c() {
        return this.f24624e;
    }

    /* renamed from: d */
    public int m21595d() {
        return m21606o(this.f24622c);
    }

    /* renamed from: e */
    public int m21596e() {
        return m21606o(this.f24623d);
    }

    /* renamed from: f */
    public int m21597f() {
        return this.f24633n;
    }

    /* renamed from: g */
    public String m21598g() {
        return this.f24627h;
    }

    /* renamed from: h */
    public int m21599h() {
        return this.f24631l;
    }

    /* renamed from: i */
    public String m21600i() {
        return this.f24630k;
    }

    /* renamed from: j */
    public int m21601j() {
        return m21606o(this.f24628i);
    }

    /* renamed from: k */
    public int m21602k() {
        return this.f24629j;
    }

    /* renamed from: l */
    public final void m21603l(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LabelView, i10, 0);
        this.f24622c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_label_distance, m21593b(40.0f));
        this.f24623d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_label_height, m21593b(20.0f));
        this.f24624e = typedArrayObtainStyledAttributes.getColor(R$styleable.LabelView_label_backgroundColor, -1624781376);
        this.f24625f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_label_strokeWidth, m21593b(1.0f));
        this.f24626g = typedArrayObtainStyledAttributes.getColor(R$styleable.LabelView_label_strokeColor, 0);
        this.f24627h = typedArrayObtainStyledAttributes.getString(R$styleable.LabelView_label_text);
        this.f24628i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LabelView_label_textSize, m21593b(14.0f));
        this.f24629j = typedArrayObtainStyledAttributes.getInt(R$styleable.LabelView_label_textStyle, 0);
        this.f24630k = typedArrayObtainStyledAttributes.getString(R$styleable.LabelView_label_textFont);
        this.f24631l = typedArrayObtainStyledAttributes.getColor(R$styleable.LabelView_label_textColor, -1);
        this.f24632m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LabelView_label_visual, true);
        this.f24633n = typedArrayObtainStyledAttributes.getInteger(R$styleable.LabelView_label_orientation, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: m */
    public final void m21604m() {
        Paint paint = new Paint();
        this.f24634o = paint;
        paint.setDither(true);
        this.f24634o.setAntiAlias(true);
        this.f24634o.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f24635p = paint2;
        paint2.setDither(true);
        this.f24635p.setAntiAlias(true);
        this.f24635p.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        this.f24636q = path;
        path.reset();
        Path path2 = new Path();
        this.f24637r = path2;
        path2.reset();
        Paint paint3 = new Paint();
        this.f24638s = paint3;
        paint3.setDither(true);
        this.f24638s.setAntiAlias(true);
        this.f24638s.setStrokeJoin(Paint.Join.ROUND);
        this.f24638s.setStrokeCap(Paint.Cap.SQUARE);
        this.f24639t = new Rect();
    }

    /* renamed from: n */
    public void m21605n(Canvas canvas, int i10, int i11) {
        if (!this.f24632m || this.f24627h == null) {
            return;
        }
        float f10 = this.f24622c + (this.f24623d / 2.0f);
        m21592a(i10, i11);
        this.f24634o.setColor(this.f24624e);
        int i12 = this.f24621b;
        if (i12 != 0) {
            this.f24634o.setAlpha(i12);
        }
        this.f24635p.setColor(this.f24626g);
        this.f24635p.setStrokeWidth(this.f24625f);
        canvas.drawPath(this.f24636q, this.f24634o);
        canvas.drawPath(this.f24636q, this.f24635p);
        this.f24638s.setTextSize(this.f24628i);
        this.f24638s.setColor(this.f24631l);
        Paint paint = this.f24638s;
        String str = this.f24627h;
        paint.getTextBounds(str, 0, str.length(), this.f24639t);
        if (AbstractC8042h.m12235i(this.f24630k)) {
            this.f24638s.setTypeface(Typeface.defaultFromStyle(this.f24629j));
        } else {
            this.f24638s.setTypeface(AbstractC11916b.m26460d(this.f24630k));
        }
        float fWidth = ((f10 * 1.4142135f) / 2.0f) - (this.f24639t.width() / 2.0f);
        canvas.drawTextOnPath(this.f24627h, this.f24637r, fWidth < 0.0f ? 0.0f : fWidth, this.f24639t.height() / 2.0f, this.f24638s);
    }

    /* renamed from: o */
    public final int m21606o(float f10) {
        return (int) ((f10 / this.f24620a.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: p */
    public void m21607p(View view, int i10) {
        if (this.f24621b != i10) {
            this.f24621b = i10;
            view.invalidate();
        }
    }

    /* renamed from: q */
    public void m21608q(View view, int i10) {
        if (this.f24624e != i10) {
            this.f24624e = i10;
            view.invalidate();
        }
    }

    /* renamed from: r */
    public void m21609r(View view, int i10) {
        float f10 = i10;
        if (this.f24622c != m21593b(f10)) {
            this.f24622c = m21593b(f10);
            view.invalidate();
        }
    }

    /* renamed from: s */
    public void m21610s(View view, int i10) {
        float f10 = i10;
        if (this.f24623d != m21593b(f10)) {
            this.f24623d = m21593b(f10);
            view.invalidate();
        }
    }

    /* renamed from: t */
    public void m21611t(View view, int i10) {
        if (this.f24633n == i10 || i10 > 4 || i10 < 1) {
            return;
        }
        this.f24633n = i10;
        view.invalidate();
    }

    /* renamed from: u */
    public void m21612u(View view, String str) {
        String str2 = this.f24627h;
        if (str2 == null || !str2.equals(str)) {
            this.f24627h = str;
            view.invalidate();
        }
    }

    /* renamed from: v */
    public void m21613v(View view, int i10) {
        if (this.f24631l != i10) {
            this.f24631l = i10;
            view.invalidate();
        }
    }

    /* renamed from: w */
    public void m21614w(View view, String str) {
        this.f24630k = str;
        view.invalidate();
    }

    /* renamed from: x */
    public void m21615x(View view, int i10) {
        if (this.f24628i != i10) {
            this.f24628i = i10;
            view.invalidate();
        }
    }

    /* renamed from: y */
    public void m21616y(View view, int i10) {
        if (this.f24629j == i10) {
            return;
        }
        this.f24629j = i10;
        view.invalidate();
    }

    /* renamed from: z */
    public void m21617z(View view, boolean z10) {
        if (this.f24632m != z10) {
            this.f24632m = z10;
            view.invalidate();
        }
    }
}
