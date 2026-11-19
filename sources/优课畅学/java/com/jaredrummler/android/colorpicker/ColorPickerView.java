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
import p082e1.AbstractC8348c;
import p082e1.C8346a;

/* loaded from: classes4.dex */
public class ColorPickerView extends View {

    /* renamed from: A */
    public Rect f4153A;

    /* renamed from: B */
    public Rect f4154B;

    /* renamed from: C */
    public Rect f4155C;

    /* renamed from: D */
    public Rect f4156D;

    /* renamed from: E */
    public Point f4157E;

    /* renamed from: F */
    public C8346a f4158F;

    /* renamed from: G */
    public InterfaceC6396c f4159G;

    /* renamed from: a */
    public int f4160a;

    /* renamed from: b */
    public int f4161b;

    /* renamed from: c */
    public int f4162c;

    /* renamed from: d */
    public int f4163d;

    /* renamed from: e */
    public int f4164e;

    /* renamed from: f */
    public int f4165f;

    /* renamed from: g */
    public Paint f4166g;

    /* renamed from: h */
    public Paint f4167h;

    /* renamed from: i */
    public Paint f4168i;

    /* renamed from: j */
    public Paint f4169j;

    /* renamed from: k */
    public Paint f4170k;

    /* renamed from: l */
    public Paint f4171l;

    /* renamed from: m */
    public Shader f4172m;

    /* renamed from: n */
    public Shader f4173n;

    /* renamed from: o */
    public Shader f4174o;

    /* renamed from: p */
    public C6395b f4175p;

    /* renamed from: q */
    public C6395b f4176q;

    /* renamed from: r */
    public int f4177r;

    /* renamed from: s */
    public float f4178s;

    /* renamed from: t */
    public float f4179t;

    /* renamed from: u */
    public float f4180u;

    /* renamed from: v */
    public boolean f4181v;

    /* renamed from: w */
    public String f4182w;

    /* renamed from: x */
    public int f4183x;

    /* renamed from: y */
    public int f4184y;

    /* renamed from: z */
    public int f4185z;

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$b */
    public class C6395b {

        /* renamed from: a */
        public Canvas f4186a;

        /* renamed from: b */
        public Bitmap f4187b;

        /* renamed from: c */
        public float f4188c;

        public C6395b() {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$c */
    public interface InterfaceC6396c {
        /* renamed from: b */
        void mo3928b(int i10);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getPreferredHeight() {
        int iM13590a = AbstractC8348c.m13590a(getContext(), 200.0f);
        return this.f4181v ? iM13590a + this.f4162c + this.f4161b : iM13590a;
    }

    private int getPreferredWidth() {
        return AbstractC8348c.m13590a(getContext(), 200.0f) + this.f4160a + this.f4162c;
    }

    /* renamed from: a */
    public final Point m3954a(int i10) {
        Rect rect = this.f4156D;
        float fWidth = rect.width();
        Point point = new Point();
        point.x = (int) ((fWidth - ((i10 * fWidth) / 255.0f)) + rect.left);
        point.y = rect.top;
        return point;
    }

    /* renamed from: b */
    public final void m3955b(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
        if (this.f4184y == -9539986) {
            this.f4184y = typedArrayObtainStyledAttributes.getColor(0, -9539986);
        }
        if (this.f4183x == -4342339) {
            this.f4183x = typedArrayObtainStyledAttributes.getColor(0, -4342339);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public final void m3956c(Canvas canvas) {
        Rect rect;
        if (!this.f4181v || (rect = this.f4156D) == null || this.f4158F == null) {
            return;
        }
        this.f4171l.setColor(this.f4184y);
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, this.f4171l);
        this.f4158F.draw(canvas);
        float[] fArr = {this.f4178s, this.f4179t, this.f4180u};
        int iHSVToColor = Color.HSVToColor(fArr);
        int iHSVToColor2 = Color.HSVToColor(0, fArr);
        float f10 = rect.left;
        int i10 = rect.top;
        LinearGradient linearGradient = new LinearGradient(f10, i10, rect.right, i10, iHSVToColor, iHSVToColor2, Shader.TileMode.CLAMP);
        this.f4174o = linearGradient;
        this.f4168i.setShader(linearGradient);
        canvas.drawRect(rect, this.f4168i);
        String str = this.f4182w;
        if (str != null && !str.equals("")) {
            canvas.drawText(this.f4182w, rect.centerX(), rect.centerY() + AbstractC8348c.m13590a(getContext(), 4.0f), this.f4169j);
        }
        Point pointM3954a = m3954a(this.f4177r);
        RectF rectF = new RectF();
        int i11 = pointM3954a.x;
        int i12 = this.f4165f;
        rectF.left = i11 - (i12 / 2);
        rectF.right = i11 + (i12 / 2);
        int i13 = rect.top;
        int i14 = this.f4164e;
        rectF.top = i13 - i14;
        rectF.bottom = rect.bottom + i14;
        canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f4170k);
    }

    /* renamed from: d */
    public final void m3957d(Canvas canvas) {
        Rect rect = this.f4155C;
        this.f4171l.setColor(this.f4184y);
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, this.f4171l);
        if (this.f4176q == null) {
            C6395b c6395b = new C6395b();
            this.f4176q = c6395b;
            c6395b.f4187b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            this.f4176q.f4186a = new Canvas(this.f4176q.f4187b);
            int iHeight = (int) (rect.height() + 0.5f);
            int[] iArr = new int[iHeight];
            float f10 = 360.0f;
            for (int i10 = 0; i10 < iHeight; i10++) {
                iArr[i10] = Color.HSVToColor(new float[]{f10, 1.0f, 1.0f});
                f10 -= 360.0f / iHeight;
            }
            Paint paint = new Paint();
            paint.setStrokeWidth(0.0f);
            for (int i11 = 0; i11 < iHeight; i11++) {
                paint.setColor(iArr[i11]);
                float f11 = i11;
                this.f4176q.f4186a.drawLine(0.0f, f11, r9.f4187b.getWidth(), f11, paint);
            }
        }
        canvas.drawBitmap(this.f4176q.f4187b, (Rect) null, rect, (Paint) null);
        Point pointM3959f = m3959f(this.f4178s);
        RectF rectF = new RectF();
        int i12 = rect.left;
        int i13 = this.f4164e;
        rectF.left = i12 - i13;
        rectF.right = rect.right + i13;
        int i14 = pointM3959f.y;
        int i15 = this.f4165f;
        rectF.top = i14 - (i15 / 2);
        rectF.bottom = i14 + (i15 / 2);
        canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f4170k);
    }

    /* renamed from: e */
    public final void m3958e(Canvas canvas) {
        Rect rect = this.f4154B;
        this.f4171l.setColor(this.f4184y);
        Rect rect2 = this.f4153A;
        canvas.drawRect(rect2.left, rect2.top, rect.right + 1, rect.bottom + 1, this.f4171l);
        if (this.f4172m == null) {
            int i10 = rect.left;
            this.f4172m = new LinearGradient(i10, rect.top, i10, rect.bottom, -1, -16777216, Shader.TileMode.CLAMP);
        }
        C6395b c6395b = this.f4175p;
        if (c6395b == null || c6395b.f4188c != this.f4178s) {
            if (c6395b == null) {
                this.f4175p = new C6395b();
            }
            C6395b c6395b2 = this.f4175p;
            if (c6395b2.f4187b == null) {
                c6395b2.f4187b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            }
            C6395b c6395b3 = this.f4175p;
            if (c6395b3.f4186a == null) {
                c6395b3.f4186a = new Canvas(this.f4175p.f4187b);
            }
            int iHSVToColor = Color.HSVToColor(new float[]{this.f4178s, 1.0f, 1.0f});
            float f10 = rect.left;
            int i11 = rect.top;
            this.f4173n = new LinearGradient(f10, i11, rect.right, i11, -1, iHSVToColor, Shader.TileMode.CLAMP);
            this.f4166g.setShader(new ComposeShader(this.f4172m, this.f4173n, PorterDuff.Mode.MULTIPLY));
            this.f4175p.f4186a.drawRect(0.0f, 0.0f, r15.f4187b.getWidth(), this.f4175p.f4187b.getHeight(), this.f4166g);
            this.f4175p.f4188c = this.f4178s;
        }
        canvas.drawBitmap(this.f4175p.f4187b, (Rect) null, rect, (Paint) null);
        Point pointM3966m = m3966m(this.f4179t, this.f4180u);
        this.f4167h.setColor(-16777216);
        canvas.drawCircle(pointM3966m.x, pointM3966m.y, this.f4163d - AbstractC8348c.m13590a(getContext(), 1.0f), this.f4167h);
        this.f4167h.setColor(-2236963);
        canvas.drawCircle(pointM3966m.x, pointM3966m.y, this.f4163d, this.f4167h);
    }

    /* renamed from: f */
    public final Point m3959f(float f10) {
        Rect rect = this.f4155C;
        float fHeight = rect.height();
        Point point = new Point();
        point.y = (int) ((fHeight - ((f10 * fHeight) / 360.0f)) + rect.top);
        point.x = rect.left;
        return point;
    }

    /* renamed from: g */
    public final void m3960g(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPickerView);
        this.f4181v = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPickerView_cpv_alphaChannelVisible, false);
        this.f4182w = typedArrayObtainStyledAttributes.getString(R$styleable.ColorPickerView_cpv_alphaChannelText);
        this.f4183x = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_sliderColor, -4342339);
        this.f4184y = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_borderColor, -9539986);
        typedArrayObtainStyledAttributes.recycle();
        m3955b(context);
        this.f4160a = AbstractC8348c.m13590a(getContext(), 30.0f);
        this.f4161b = AbstractC8348c.m13590a(getContext(), 20.0f);
        this.f4162c = AbstractC8348c.m13590a(getContext(), 10.0f);
        this.f4163d = AbstractC8348c.m13590a(getContext(), 5.0f);
        this.f4165f = AbstractC8348c.m13590a(getContext(), 4.0f);
        this.f4164e = AbstractC8348c.m13590a(getContext(), 2.0f);
        this.f4185z = getResources().getDimensionPixelSize(R$dimen.cpv_required_padding);
        m3961h();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public String getAlphaSliderText() {
        return this.f4182w;
    }

    public int getBorderColor() {
        return this.f4184y;
    }

    public int getColor() {
        return Color.HSVToColor(this.f4177r, new float[]{this.f4178s, this.f4179t, this.f4180u});
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f4185z);
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f4185z);
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f4185z);
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f4185z);
    }

    public int getSliderTrackerColor() {
        return this.f4183x;
    }

    /* renamed from: h */
    public final void m3961h() {
        this.f4166g = new Paint();
        this.f4167h = new Paint();
        this.f4170k = new Paint();
        this.f4168i = new Paint();
        this.f4169j = new Paint();
        this.f4171l = new Paint();
        Paint paint = this.f4167h;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f4167h.setStrokeWidth(AbstractC8348c.m13590a(getContext(), 2.0f));
        this.f4167h.setAntiAlias(true);
        this.f4170k.setColor(this.f4183x);
        this.f4170k.setStyle(style);
        this.f4170k.setStrokeWidth(AbstractC8348c.m13590a(getContext(), 2.0f));
        this.f4170k.setAntiAlias(true);
        this.f4169j.setColor(-14935012);
        this.f4169j.setTextSize(AbstractC8348c.m13590a(getContext(), 14.0f));
        this.f4169j.setAntiAlias(true);
        this.f4169j.setTextAlign(Paint.Align.CENTER);
        this.f4169j.setFakeBoldText(true);
    }

    /* renamed from: i */
    public final boolean m3962i(MotionEvent motionEvent) {
        Point point = this.f4157E;
        if (point == null) {
            return false;
        }
        int i10 = point.x;
        int i11 = point.y;
        if (this.f4155C.contains(i10, i11)) {
            this.f4178s = m3964k(motionEvent.getY());
            return true;
        }
        if (this.f4154B.contains(i10, i11)) {
            float[] fArrM3965l = m3965l(motionEvent.getX(), motionEvent.getY());
            this.f4179t = fArrM3965l[0];
            this.f4180u = fArrM3965l[1];
            return true;
        }
        Rect rect = this.f4156D;
        if (rect == null || !rect.contains(i10, i11)) {
            return false;
        }
        this.f4177r = m3963j((int) motionEvent.getX());
        return true;
    }

    /* renamed from: j */
    public final int m3963j(int i10) {
        Rect rect = this.f4156D;
        int iWidth = rect.width();
        int i11 = rect.left;
        return 255 - (((i10 < i11 ? 0 : i10 > rect.right ? iWidth : i10 - i11) * 255) / iWidth);
    }

    /* renamed from: k */
    public final float m3964k(float f10) {
        Rect rect = this.f4155C;
        float fHeight = rect.height();
        int i10 = rect.top;
        return 360.0f - (((f10 < ((float) i10) ? 0.0f : f10 > ((float) rect.bottom) ? fHeight : f10 - i10) * 360.0f) / fHeight);
    }

    /* renamed from: l */
    public final float[] m3965l(float f10, float f11) {
        Rect rect = this.f4154B;
        float fWidth = rect.width();
        float fHeight = rect.height();
        int i10 = rect.left;
        float f12 = f10 < ((float) i10) ? 0.0f : f10 > ((float) rect.right) ? fWidth : f10 - i10;
        int i11 = rect.top;
        return new float[]{(1.0f / fWidth) * f12, 1.0f - ((1.0f / fHeight) * (f11 >= ((float) i11) ? f11 > ((float) rect.bottom) ? fHeight : f11 - i11 : 0.0f))};
    }

    /* renamed from: m */
    public final Point m3966m(float f10, float f11) {
        Rect rect = this.f4154B;
        float fHeight = rect.height();
        float fWidth = rect.width();
        Point point = new Point();
        point.x = (int) ((f10 * fWidth) + rect.left);
        point.y = (int) (((1.0f - f11) * fHeight) + rect.top);
        return point;
    }

    /* renamed from: n */
    public void m3967n(int i10, boolean z10) {
        InterfaceC6396c interfaceC6396c;
        int iAlpha = Color.alpha(i10);
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
        this.f4177r = iAlpha;
        float f10 = fArr[0];
        this.f4178s = f10;
        float f11 = fArr[1];
        this.f4179t = f11;
        float f12 = fArr[2];
        this.f4180u = f12;
        if (z10 && (interfaceC6396c = this.f4159G) != null) {
            interfaceC6396c.mo3928b(Color.HSVToColor(iAlpha, new float[]{f10, f11, f12}));
        }
        invalidate();
    }

    /* renamed from: o */
    public final void m3968o() {
        if (this.f4181v) {
            Rect rect = this.f4153A;
            int i10 = rect.left + 1;
            int i11 = rect.bottom;
            this.f4156D = new Rect(i10, (i11 - this.f4161b) + 1, rect.right - 1, i11 - 1);
            C8346a c8346a = new C8346a(AbstractC8348c.m13590a(getContext(), 4.0f));
            this.f4158F = c8346a;
            c8346a.setBounds(Math.round(this.f4156D.left), Math.round(this.f4156D.top), Math.round(this.f4156D.right), Math.round(this.f4156D.bottom));
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f4153A.width() <= 0 || this.f4153A.height() <= 0) {
            return;
        }
        m3958e(canvas);
        m3957d(canvas);
        m3956c(canvas);
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
            int r0 = r5.f4162c
            int r1 = r7 + r0
            int r2 = r5.f4160a
            int r1 = r1 + r2
            int r3 = r6 - r0
            int r3 = r3 - r2
            boolean r2 = r5.f4181v
            if (r2 == 0) goto L40
            int r2 = r5.f4161b
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
            int r0 = r5.f4162c
            int r1 = r6 - r0
            int r2 = r5.f4160a
            int r1 = r1 - r2
            boolean r2 = r5.f4181v
            if (r2 == 0) goto L6f
            int r2 = r5.f4161b
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
            int r0 = r5.f4162c
            int r1 = r7 + r0
            int r2 = r5.f4160a
            int r1 = r1 + r2
            boolean r2 = r5.f4181v
            if (r2 == 0) goto L87
            int r2 = r5.f4161b
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
            this.f4177r = bundle.getInt("alpha");
            this.f4178s = bundle.getFloat("hue");
            this.f4179t = bundle.getFloat(LocalePreferences.FirstDayOfWeek.SATURDAY);
            this.f4180u = bundle.getFloat("val");
            this.f4181v = bundle.getBoolean("show_alpha");
            this.f4182w = bundle.getString("alpha_text");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f4177r);
        bundle.putFloat("hue", this.f4178s);
        bundle.putFloat(LocalePreferences.FirstDayOfWeek.SATURDAY, this.f4179t);
        bundle.putFloat("val", this.f4180u);
        bundle.putBoolean("show_alpha", this.f4181v);
        bundle.putString("alpha_text", this.f4182w);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Rect rect = new Rect();
        this.f4153A = rect;
        rect.left = getPaddingLeft();
        this.f4153A.right = i10 - getPaddingRight();
        this.f4153A.top = getPaddingTop();
        this.f4153A.bottom = i11 - getPaddingBottom();
        this.f4172m = null;
        this.f4173n = null;
        this.f4174o = null;
        this.f4175p = null;
        this.f4176q = null;
        m3970q();
        m3969p();
        m3968o();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM3962i;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f4157E = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zM3962i = m3962i(motionEvent);
        } else if (action != 1) {
            zM3962i = action != 2 ? false : m3962i(motionEvent);
        } else {
            this.f4157E = null;
            zM3962i = m3962i(motionEvent);
        }
        if (!zM3962i) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC6396c interfaceC6396c = this.f4159G;
        if (interfaceC6396c != null) {
            interfaceC6396c.mo3928b(Color.HSVToColor(this.f4177r, new float[]{this.f4178s, this.f4179t, this.f4180u}));
        }
        invalidate();
        return true;
    }

    /* renamed from: p */
    public final void m3969p() {
        Rect rect = this.f4153A;
        int i10 = rect.right;
        this.f4155C = new Rect((i10 - this.f4160a) + 1, rect.top + 1, i10 - 1, (rect.bottom - 1) - (this.f4181v ? this.f4162c + this.f4161b : 0));
    }

    /* renamed from: q */
    public final void m3970q() {
        Rect rect = this.f4153A;
        int i10 = rect.left + 1;
        int i11 = rect.top + 1;
        int i12 = rect.bottom - 1;
        int i13 = rect.right - 1;
        int i14 = this.f4162c;
        int i15 = (i13 - i14) - this.f4160a;
        if (this.f4181v) {
            i12 -= this.f4161b + i14;
        }
        this.f4154B = new Rect(i10, i11, i15, i12);
    }

    public void setAlphaSliderText(int i10) {
        setAlphaSliderText(getContext().getString(i10));
    }

    public void setAlphaSliderVisible(boolean z10) {
        if (this.f4181v != z10) {
            this.f4181v = z10;
            this.f4172m = null;
            this.f4173n = null;
            this.f4174o = null;
            this.f4176q = null;
            this.f4175p = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i10) {
        this.f4184y = i10;
        invalidate();
    }

    public void setColor(int i10) {
        m3967n(i10, false);
    }

    public void setOnColorChangedListener(InterfaceC6396c interfaceC6396c) {
        this.f4159G = interfaceC6396c;
    }

    public void setSliderTrackerColor(int i10) {
        this.f4183x = i10;
        this.f4170k.setColor(i10);
        invalidate();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f4177r = 255;
        this.f4178s = 360.0f;
        this.f4179t = 0.0f;
        this.f4180u = 0.0f;
        this.f4181v = false;
        this.f4182w = null;
        this.f4183x = -4342339;
        this.f4184y = -9539986;
        this.f4157E = null;
        m3960g(context, attributeSet);
    }

    public void setAlphaSliderText(String str) {
        this.f4182w = str;
        invalidate();
    }
}
