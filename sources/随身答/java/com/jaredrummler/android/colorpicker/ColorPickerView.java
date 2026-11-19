package com.jaredrummler.android.colorpicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.text.util.LocalePreferences;
import androidx.core.view.ViewCompat;
import p185n1.AbstractC9086c;
import p185n1.C9084a;

/* loaded from: classes4.dex */
public class ColorPickerView extends View {

    /* renamed from: A */
    public Rect f5181A;

    /* renamed from: B */
    public Rect f5182B;

    /* renamed from: C */
    public Rect f5183C;

    /* renamed from: D */
    public Rect f5184D;

    /* renamed from: E */
    public Point f5185E;

    /* renamed from: F */
    public C9084a f5186F;

    /* renamed from: G */
    public InterfaceC6589c f5187G;

    /* renamed from: a */
    public int f5188a;

    /* renamed from: b */
    public int f5189b;

    /* renamed from: c */
    public int f5190c;

    /* renamed from: d */
    public int f5191d;

    /* renamed from: e */
    public int f5192e;

    /* renamed from: f */
    public int f5193f;

    /* renamed from: g */
    public Paint f5194g;

    /* renamed from: h */
    public Paint f5195h;

    /* renamed from: i */
    public Paint f5196i;

    /* renamed from: j */
    public Paint f5197j;

    /* renamed from: k */
    public Paint f5198k;

    /* renamed from: l */
    public Paint f5199l;

    /* renamed from: m */
    public Shader f5200m;

    /* renamed from: n */
    public Shader f5201n;

    /* renamed from: o */
    public Shader f5202o;

    /* renamed from: p */
    public C6588b f5203p;

    /* renamed from: q */
    public C6588b f5204q;

    /* renamed from: r */
    public int f5205r;

    /* renamed from: s */
    public float f5206s;

    /* renamed from: t */
    public float f5207t;

    /* renamed from: u */
    public float f5208u;

    /* renamed from: v */
    public boolean f5209v;

    /* renamed from: w */
    public String f5210w;

    /* renamed from: x */
    public int f5211x;

    /* renamed from: y */
    public int f5212y;

    /* renamed from: z */
    public int f5213z;

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$b */
    public class C6588b {

        /* renamed from: a */
        public Canvas f5214a;

        /* renamed from: b */
        public Bitmap f5215b;

        /* renamed from: c */
        public float f5216c;

        public C6588b() {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$c */
    public interface InterfaceC6589c {
        /* renamed from: a */
        void mo4510a(int i9);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getPreferredHeight() {
        int iM14578a = AbstractC9086c.m14578a(getContext(), 200.0f);
        return this.f5209v ? iM14578a + this.f5190c + this.f5189b : iM14578a;
    }

    private int getPreferredWidth() {
        return AbstractC9086c.m14578a(getContext(), 200.0f) + this.f5188a + this.f5190c;
    }

    /* renamed from: a */
    public final Point m4536a(int i9) {
        Rect rect = this.f5184D;
        float fWidth = rect.width();
        Point point = new Point();
        point.x = (int) ((fWidth - ((i9 * fWidth) / 255.0f)) + rect.left);
        point.y = rect.top;
        return point;
    }

    /* renamed from: b */
    public final void m4537b(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
        if (this.f5212y == -9539986) {
            this.f5212y = typedArrayObtainStyledAttributes.getColor(0, -9539986);
        }
        if (this.f5211x == -4342339) {
            this.f5211x = typedArrayObtainStyledAttributes.getColor(0, -4342339);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public final void m4538c(Canvas canvas) {
        Rect rect;
        if (!this.f5209v || (rect = this.f5184D) == null || this.f5186F == null) {
            return;
        }
        this.f5199l.setColor(this.f5212y);
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, this.f5199l);
        this.f5186F.draw(canvas);
        float[] fArr = {this.f5206s, this.f5207t, this.f5208u};
        int iHSVToColor = Color.HSVToColor(fArr);
        int iHSVToColor2 = Color.HSVToColor(0, fArr);
        float f10 = rect.left;
        int i9 = rect.top;
        LinearGradient linearGradient = new LinearGradient(f10, i9, rect.right, i9, iHSVToColor, iHSVToColor2, Shader.TileMode.CLAMP);
        this.f5202o = linearGradient;
        this.f5196i.setShader(linearGradient);
        canvas.drawRect(rect, this.f5196i);
        String str = this.f5210w;
        if (str != null && !str.equals("")) {
            canvas.drawText(this.f5210w, rect.centerX(), rect.centerY() + AbstractC9086c.m14578a(getContext(), 4.0f), this.f5197j);
        }
        Point pointM4536a = m4536a(this.f5205r);
        RectF rectF = new RectF();
        int i10 = pointM4536a.x;
        int i11 = this.f5193f;
        rectF.left = i10 - (i11 / 2);
        rectF.right = i10 + (i11 / 2);
        int i12 = rect.top;
        int i13 = this.f5192e;
        rectF.top = i12 - i13;
        rectF.bottom = rect.bottom + i13;
        canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f5198k);
    }

    /* renamed from: d */
    public final void m4539d(Canvas canvas) {
        Rect rect = this.f5183C;
        this.f5199l.setColor(this.f5212y);
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, this.f5199l);
        if (this.f5204q == null) {
            C6588b c6588b = new C6588b();
            this.f5204q = c6588b;
            c6588b.f5215b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            this.f5204q.f5214a = new Canvas(this.f5204q.f5215b);
            int iHeight = (int) (rect.height() + 0.5f);
            int[] iArr = new int[iHeight];
            float f10 = 360.0f;
            for (int i9 = 0; i9 < iHeight; i9++) {
                iArr[i9] = Color.HSVToColor(new float[]{f10, 1.0f, 1.0f});
                f10 -= 360.0f / iHeight;
            }
            Paint paint = new Paint();
            paint.setStrokeWidth(0.0f);
            for (int i10 = 0; i10 < iHeight; i10++) {
                paint.setColor(iArr[i10]);
                float f11 = i10;
                this.f5204q.f5214a.drawLine(0.0f, f11, r9.f5215b.getWidth(), f11, paint);
            }
        }
        canvas.drawBitmap(this.f5204q.f5215b, (Rect) null, rect, (Paint) null);
        Point pointM4541f = m4541f(this.f5206s);
        RectF rectF = new RectF();
        int i11 = rect.left;
        int i12 = this.f5192e;
        rectF.left = i11 - i12;
        rectF.right = rect.right + i12;
        int i13 = pointM4541f.y;
        int i14 = this.f5193f;
        rectF.top = i13 - (i14 / 2);
        rectF.bottom = i13 + (i14 / 2);
        canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f5198k);
    }

    /* renamed from: e */
    public final void m4540e(Canvas canvas) {
        Rect rect = this.f5182B;
        this.f5199l.setColor(this.f5212y);
        Rect rect2 = this.f5181A;
        canvas.drawRect(rect2.left, rect2.top, rect.right + 1, rect.bottom + 1, this.f5199l);
        if (this.f5200m == null) {
            int i9 = rect.left;
            this.f5200m = new LinearGradient(i9, rect.top, i9, rect.bottom, -1, ViewCompat.MEASURED_STATE_MASK, Shader.TileMode.CLAMP);
        }
        C6588b c6588b = this.f5203p;
        if (c6588b == null || c6588b.f5216c != this.f5206s) {
            if (c6588b == null) {
                this.f5203p = new C6588b();
            }
            C6588b c6588b2 = this.f5203p;
            if (c6588b2.f5215b == null) {
                c6588b2.f5215b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            }
            C6588b c6588b3 = this.f5203p;
            if (c6588b3.f5214a == null) {
                c6588b3.f5214a = new Canvas(this.f5203p.f5215b);
            }
            int iHSVToColor = Color.HSVToColor(new float[]{this.f5206s, 1.0f, 1.0f});
            float f10 = rect.left;
            int i10 = rect.top;
            this.f5201n = new LinearGradient(f10, i10, rect.right, i10, -1, iHSVToColor, Shader.TileMode.CLAMP);
            this.f5194g.setShader(new ComposeShader(this.f5200m, this.f5201n, PorterDuff.Mode.MULTIPLY));
            this.f5203p.f5214a.drawRect(0.0f, 0.0f, r15.f5215b.getWidth(), this.f5203p.f5215b.getHeight(), this.f5194g);
            this.f5203p.f5216c = this.f5206s;
        }
        canvas.drawBitmap(this.f5203p.f5215b, (Rect) null, rect, (Paint) null);
        Point pointM4548m = m4548m(this.f5207t, this.f5208u);
        this.f5195h.setColor(ViewCompat.MEASURED_STATE_MASK);
        canvas.drawCircle(pointM4548m.x, pointM4548m.y, this.f5191d - AbstractC9086c.m14578a(getContext(), 1.0f), this.f5195h);
        this.f5195h.setColor(-2236963);
        canvas.drawCircle(pointM4548m.x, pointM4548m.y, this.f5191d, this.f5195h);
    }

    /* renamed from: f */
    public final Point m4541f(float f10) {
        Rect rect = this.f5183C;
        float fHeight = rect.height();
        Point point = new Point();
        point.y = (int) ((fHeight - ((f10 * fHeight) / 360.0f)) + rect.top);
        point.x = rect.left;
        return point;
    }

    /* renamed from: g */
    public final void m4542g(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPickerView);
        this.f5209v = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPickerView_cpv_alphaChannelVisible, false);
        this.f5210w = typedArrayObtainStyledAttributes.getString(R$styleable.ColorPickerView_cpv_alphaChannelText);
        this.f5211x = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_sliderColor, -4342339);
        this.f5212y = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_borderColor, -9539986);
        typedArrayObtainStyledAttributes.recycle();
        m4537b(context);
        this.f5188a = AbstractC9086c.m14578a(getContext(), 30.0f);
        this.f5189b = AbstractC9086c.m14578a(getContext(), 20.0f);
        this.f5190c = AbstractC9086c.m14578a(getContext(), 10.0f);
        this.f5191d = AbstractC9086c.m14578a(getContext(), 5.0f);
        this.f5193f = AbstractC9086c.m14578a(getContext(), 4.0f);
        this.f5192e = AbstractC9086c.m14578a(getContext(), 2.0f);
        this.f5213z = getResources().getDimensionPixelSize(R$dimen.cpv_required_padding);
        m4543h();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public String getAlphaSliderText() {
        return this.f5210w;
    }

    public int getBorderColor() {
        return this.f5212y;
    }

    public int getColor() {
        return Color.HSVToColor(this.f5205r, new float[]{this.f5206s, this.f5207t, this.f5208u});
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f5213z);
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f5213z);
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f5213z);
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f5213z);
    }

    public int getSliderTrackerColor() {
        return this.f5211x;
    }

    /* renamed from: h */
    public final void m4543h() {
        this.f5194g = new Paint();
        this.f5195h = new Paint();
        this.f5198k = new Paint();
        this.f5196i = new Paint();
        this.f5197j = new Paint();
        this.f5199l = new Paint();
        Paint paint = this.f5195h;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f5195h.setStrokeWidth(AbstractC9086c.m14578a(getContext(), 2.0f));
        this.f5195h.setAntiAlias(true);
        this.f5198k.setColor(this.f5211x);
        this.f5198k.setStyle(style);
        this.f5198k.setStrokeWidth(AbstractC9086c.m14578a(getContext(), 2.0f));
        this.f5198k.setAntiAlias(true);
        this.f5197j.setColor(-14935012);
        this.f5197j.setTextSize(AbstractC9086c.m14578a(getContext(), 14.0f));
        this.f5197j.setAntiAlias(true);
        this.f5197j.setTextAlign(Paint.Align.CENTER);
        this.f5197j.setFakeBoldText(true);
    }

    /* renamed from: i */
    public final boolean m4544i(MotionEvent motionEvent) {
        Point point = this.f5185E;
        if (point == null) {
            return false;
        }
        int i9 = point.x;
        int i10 = point.y;
        if (this.f5183C.contains(i9, i10)) {
            this.f5206s = m4546k(motionEvent.getY());
            return true;
        }
        if (this.f5182B.contains(i9, i10)) {
            float[] fArrM4547l = m4547l(motionEvent.getX(), motionEvent.getY());
            this.f5207t = fArrM4547l[0];
            this.f5208u = fArrM4547l[1];
            return true;
        }
        Rect rect = this.f5184D;
        if (rect == null || !rect.contains(i9, i10)) {
            return false;
        }
        this.f5205r = m4545j((int) motionEvent.getX());
        return true;
    }

    /* renamed from: j */
    public final int m4545j(int i9) {
        Rect rect = this.f5184D;
        int iWidth = rect.width();
        int i10 = rect.left;
        return 255 - (((i9 < i10 ? 0 : i9 > rect.right ? iWidth : i9 - i10) * 255) / iWidth);
    }

    /* renamed from: k */
    public final float m4546k(float f10) {
        Rect rect = this.f5183C;
        float fHeight = rect.height();
        int i9 = rect.top;
        return 360.0f - (((f10 < ((float) i9) ? 0.0f : f10 > ((float) rect.bottom) ? fHeight : f10 - i9) * 360.0f) / fHeight);
    }

    /* renamed from: l */
    public final float[] m4547l(float f10, float f11) {
        Rect rect = this.f5182B;
        float fWidth = rect.width();
        float fHeight = rect.height();
        int i9 = rect.left;
        float f12 = f10 < ((float) i9) ? 0.0f : f10 > ((float) rect.right) ? fWidth : f10 - i9;
        int i10 = rect.top;
        return new float[]{(1.0f / fWidth) * f12, 1.0f - ((1.0f / fHeight) * (f11 >= ((float) i10) ? f11 > ((float) rect.bottom) ? fHeight : f11 - i10 : 0.0f))};
    }

    /* renamed from: m */
    public final Point m4548m(float f10, float f11) {
        Rect rect = this.f5182B;
        float fHeight = rect.height();
        float fWidth = rect.width();
        Point point = new Point();
        point.x = (int) ((f10 * fWidth) + rect.left);
        point.y = (int) (((1.0f - f11) * fHeight) + rect.top);
        return point;
    }

    /* renamed from: n */
    public void m4549n(int i9, boolean z9) {
        InterfaceC6589c interfaceC6589c;
        int iAlpha = Color.alpha(i9);
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i9), Color.green(i9), Color.blue(i9), fArr);
        this.f5205r = iAlpha;
        float f10 = fArr[0];
        this.f5206s = f10;
        float f11 = fArr[1];
        this.f5207t = f11;
        float f12 = fArr[2];
        this.f5208u = f12;
        if (z9 && (interfaceC6589c = this.f5187G) != null) {
            interfaceC6589c.mo4510a(Color.HSVToColor(iAlpha, new float[]{f10, f11, f12}));
        }
        invalidate();
    }

    /* renamed from: o */
    public final void m4550o() {
        if (this.f5209v) {
            Rect rect = this.f5181A;
            int i9 = rect.left + 1;
            int i10 = rect.bottom;
            this.f5184D = new Rect(i9, (i10 - this.f5189b) + 1, rect.right - 1, i10 - 1);
            C9084a c9084a = new C9084a(AbstractC9086c.m14578a(getContext(), 4.0f));
            this.f5186F = c9084a;
            c9084a.setBounds(Math.round(this.f5184D.left), Math.round(this.f5184D.top), Math.round(this.f5184D.right), Math.round(this.f5184D.bottom));
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f5181A.width() <= 0 || this.f5181A.height() <= 0) {
            return;
        }
        m4540e(canvas);
        m4539d(canvas);
        m4538c(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[PHI: r1
      0x0054: PHI (r1v9 int) = (r1v3 int), (r1v12 int) binds: [B:38:0x0087, B:20:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = r5.getPaddingLeft()
            int r6 = r6 - r2
            int r2 = r5.getPaddingRight()
            int r6 = r6 - r2
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r2 = r5.getPaddingBottom()
            int r7 = r7 - r2
            int r2 = r5.getPaddingTop()
            int r7 = r7 - r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L5c
            if (r1 != r2) goto L2b
            goto L5c
        L2b:
            int r0 = r5.f5190c
            int r1 = r7 + r0
            int r2 = r5.f5188a
            int r1 = r1 + r2
            int r3 = r6 - r0
            int r3 = r3 - r2
            boolean r2 = r5.f5209v
            if (r2 == 0) goto L40
            int r2 = r5.f5189b
            int r4 = r0 + r2
            int r1 = r1 - r4
            int r0 = r0 + r2
            int r3 = r3 + r0
        L40:
            r0 = 1
            r2 = 0
            if (r1 > r6) goto L46
            r4 = r0
            goto L47
        L46:
            r4 = r2
        L47:
            if (r3 > r7) goto L4a
            goto L4b
        L4a:
            r0 = r2
        L4b:
            if (r4 == 0) goto L50
            if (r0 == 0) goto L50
            goto L5a
        L50:
            if (r0 != 0) goto L56
            if (r4 == 0) goto L56
        L54:
            r6 = r1
            goto L89
        L56:
            if (r4 != 0) goto L89
            if (r0 == 0) goto L89
        L5a:
            r7 = r3
            goto L89
        L5c:
            if (r0 != r2) goto L74
            if (r1 == r2) goto L74
            int r0 = r5.f5190c
            int r1 = r6 - r0
            int r2 = r5.f5188a
            int r1 = r1 - r2
            boolean r2 = r5.f5209v
            if (r2 == 0) goto L6f
            int r2 = r5.f5189b
            int r0 = r0 + r2
            int r1 = r1 + r0
        L6f:
            if (r1 <= r7) goto L72
            goto L89
        L72:
            r7 = r1
            goto L89
        L74:
            if (r1 != r2) goto L89
            if (r0 == r2) goto L89
            int r0 = r5.f5190c
            int r1 = r7 + r0
            int r2 = r5.f5188a
            int r1 = r1 + r2
            boolean r2 = r5.f5209v
            if (r2 == 0) goto L87
            int r2 = r5.f5189b
            int r0 = r0 + r2
            int r1 = r1 - r0
        L87:
            if (r1 <= r6) goto L54
        L89:
            int r0 = r5.getPaddingLeft()
            int r6 = r6 + r0
            int r0 = r5.getPaddingRight()
            int r6 = r6 + r0
            int r0 = r5.getPaddingTop()
            int r7 = r7 + r0
            int r0 = r5.getPaddingBottom()
            int r7 = r7 + r0
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jaredrummler.android.colorpicker.ColorPickerView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f5205r = bundle.getInt("alpha");
            this.f5206s = bundle.getFloat("hue");
            this.f5207t = bundle.getFloat(LocalePreferences.FirstDayOfWeek.SATURDAY);
            this.f5208u = bundle.getFloat("val");
            this.f5209v = bundle.getBoolean("show_alpha");
            this.f5210w = bundle.getString("alpha_text");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f5205r);
        bundle.putFloat("hue", this.f5206s);
        bundle.putFloat(LocalePreferences.FirstDayOfWeek.SATURDAY, this.f5207t);
        bundle.putFloat("val", this.f5208u);
        bundle.putBoolean("show_alpha", this.f5209v);
        bundle.putString("alpha_text", this.f5210w);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        Rect rect = new Rect();
        this.f5181A = rect;
        rect.left = getPaddingLeft();
        this.f5181A.right = i9 - getPaddingRight();
        this.f5181A.top = getPaddingTop();
        this.f5181A.bottom = i10 - getPaddingBottom();
        this.f5200m = null;
        this.f5201n = null;
        this.f5202o = null;
        this.f5203p = null;
        this.f5204q = null;
        m4552q();
        m4551p();
        m4550o();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM4544i;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5185E = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zM4544i = m4544i(motionEvent);
        } else if (action != 1) {
            zM4544i = action != 2 ? false : m4544i(motionEvent);
        } else {
            this.f5185E = null;
            zM4544i = m4544i(motionEvent);
        }
        if (!zM4544i) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC6589c interfaceC6589c = this.f5187G;
        if (interfaceC6589c != null) {
            interfaceC6589c.mo4510a(Color.HSVToColor(this.f5205r, new float[]{this.f5206s, this.f5207t, this.f5208u}));
        }
        invalidate();
        return true;
    }

    /* renamed from: p */
    public final void m4551p() {
        Rect rect = this.f5181A;
        int i9 = rect.right;
        this.f5183C = new Rect((i9 - this.f5188a) + 1, rect.top + 1, i9 - 1, (rect.bottom - 1) - (this.f5209v ? this.f5190c + this.f5189b : 0));
    }

    /* renamed from: q */
    public final void m4552q() {
        Rect rect = this.f5181A;
        int i9 = rect.left + 1;
        int i10 = rect.top + 1;
        int i11 = rect.bottom - 1;
        int i12 = rect.right - 1;
        int i13 = this.f5190c;
        int i14 = (i12 - i13) - this.f5188a;
        if (this.f5209v) {
            i11 -= this.f5189b + i13;
        }
        this.f5182B = new Rect(i9, i10, i14, i11);
    }

    public void setAlphaSliderText(int i9) {
        setAlphaSliderText(getContext().getString(i9));
    }

    public void setAlphaSliderVisible(boolean z9) {
        if (this.f5209v != z9) {
            this.f5209v = z9;
            this.f5200m = null;
            this.f5201n = null;
            this.f5202o = null;
            this.f5204q = null;
            this.f5203p = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i9) {
        this.f5212y = i9;
        invalidate();
    }

    public void setColor(int i9) {
        m4549n(i9, false);
    }

    public void setOnColorChangedListener(InterfaceC6589c interfaceC6589c) {
        this.f5187G = interfaceC6589c;
    }

    public void setSliderTrackerColor(int i9) {
        this.f5211x = i9;
        this.f5198k.setColor(i9);
        invalidate();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i9) throws Resources.NotFoundException {
        super(context, attributeSet, i9);
        this.f5205r = 255;
        this.f5206s = 360.0f;
        this.f5207t = 0.0f;
        this.f5208u = 0.0f;
        this.f5209v = false;
        this.f5210w = null;
        this.f5211x = -4342339;
        this.f5212y = -9539986;
        this.f5185E = null;
        m4542g(context, attributeSet);
    }

    public void setAlphaSliderText(String str) {
        this.f5210w = str;
        invalidate();
    }
}
