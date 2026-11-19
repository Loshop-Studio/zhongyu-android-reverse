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
import p162g6.AbstractC9274c;
import p162g6.C9272a;

/* loaded from: classes5.dex */
public class ColorPickerView extends View {

    /* renamed from: A */
    public int f11956A;

    /* renamed from: B */
    public int f11957B;

    /* renamed from: C */
    public Rect f11958C;

    /* renamed from: D */
    public Rect f11959D;

    /* renamed from: E */
    public Rect f11960E;

    /* renamed from: F */
    public Rect f11961F;

    /* renamed from: G */
    public Point f11962G;

    /* renamed from: H */
    public C9272a f11963H;

    /* renamed from: I */
    public InterfaceC7378c f11964I;

    /* renamed from: c */
    public int f11965c;

    /* renamed from: d */
    public int f11966d;

    /* renamed from: e */
    public int f11967e;

    /* renamed from: f */
    public int f11968f;

    /* renamed from: g */
    public int f11969g;

    /* renamed from: h */
    public int f11970h;

    /* renamed from: i */
    public Paint f11971i;

    /* renamed from: j */
    public Paint f11972j;

    /* renamed from: k */
    public Paint f11973k;

    /* renamed from: l */
    public Paint f11974l;

    /* renamed from: m */
    public Paint f11975m;

    /* renamed from: n */
    public Paint f11976n;

    /* renamed from: o */
    public Shader f11977o;

    /* renamed from: p */
    public Shader f11978p;

    /* renamed from: q */
    public Shader f11979q;

    /* renamed from: r */
    public C7377b f11980r;

    /* renamed from: s */
    public C7377b f11981s;

    /* renamed from: t */
    public int f11982t;

    /* renamed from: u */
    public float f11983u;

    /* renamed from: v */
    public float f11984v;

    /* renamed from: w */
    public float f11985w;

    /* renamed from: x */
    public boolean f11986x;

    /* renamed from: y */
    public String f11987y;

    /* renamed from: z */
    public int f11988z;

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$b */
    public class C7377b {

        /* renamed from: a */
        public Canvas f11989a;

        /* renamed from: b */
        public Bitmap f11990b;

        /* renamed from: c */
        public float f11991c;

        public C7377b() {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$c */
    public interface InterfaceC7378c {
        /* renamed from: g */
        void mo8851g(int i10);
    }

    public ColorPickerView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        int iM18262a = AbstractC9274c.m18262a(getContext(), 200.0f);
        return this.f11986x ? iM18262a + this.f11967e + this.f11966d : iM18262a;
    }

    private int getPreferredWidth() {
        return AbstractC9274c.m18262a(getContext(), 200.0f) + this.f11965c + this.f11967e;
    }

    /* renamed from: a */
    public final Point m8871a(int i10) {
        Rect rect = this.f11961F;
        float fWidth = rect.width();
        Point point = new Point();
        point.x = (int) ((fWidth - ((i10 * fWidth) / 255.0f)) + rect.left);
        point.y = rect.top;
        return point;
    }

    /* renamed from: b */
    public final void m8872b(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
        if (this.f11956A == -9539986) {
            this.f11956A = typedArrayObtainStyledAttributes.getColor(0, -9539986);
        }
        if (this.f11988z == -4342339) {
            this.f11988z = typedArrayObtainStyledAttributes.getColor(0, -4342339);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public final void m8873c(Canvas canvas) {
        Rect rect;
        if (!this.f11986x || (rect = this.f11961F) == null || this.f11963H == null) {
            return;
        }
        this.f11976n.setColor(this.f11956A);
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, this.f11976n);
        this.f11963H.draw(canvas);
        float[] fArr = {this.f11983u, this.f11984v, this.f11985w};
        int iHSVToColor = Color.HSVToColor(fArr);
        int iHSVToColor2 = Color.HSVToColor(0, fArr);
        float f10 = rect.left;
        int i10 = rect.top;
        LinearGradient linearGradient = new LinearGradient(f10, i10, rect.right, i10, iHSVToColor, iHSVToColor2, Shader.TileMode.CLAMP);
        this.f11979q = linearGradient;
        this.f11973k.setShader(linearGradient);
        canvas.drawRect(rect, this.f11973k);
        String str = this.f11987y;
        if (str != null && !str.equals("")) {
            canvas.drawText(this.f11987y, rect.centerX(), rect.centerY() + AbstractC9274c.m18262a(getContext(), 4.0f), this.f11974l);
        }
        Point pointM8871a = m8871a(this.f11982t);
        RectF rectF = new RectF();
        int i11 = pointM8871a.x;
        int i12 = this.f11970h;
        rectF.left = i11 - (i12 / 2);
        rectF.right = i11 + (i12 / 2);
        int i13 = rect.top;
        int i14 = this.f11969g;
        rectF.top = i13 - i14;
        rectF.bottom = rect.bottom + i14;
        canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f11975m);
    }

    /* renamed from: d */
    public final void m8874d(Canvas canvas) {
        Rect rect = this.f11960E;
        this.f11976n.setColor(this.f11956A);
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, this.f11976n);
        if (this.f11981s == null) {
            C7377b c7377b = new C7377b();
            this.f11981s = c7377b;
            c7377b.f11990b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            this.f11981s.f11989a = new Canvas(this.f11981s.f11990b);
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
                this.f11981s.f11989a.drawLine(0.0f, f11, r9.f11990b.getWidth(), f11, paint);
            }
        }
        canvas.drawBitmap(this.f11981s.f11990b, (Rect) null, rect, (Paint) null);
        Point pointM8876f = m8876f(this.f11983u);
        RectF rectF = new RectF();
        int i12 = rect.left;
        int i13 = this.f11969g;
        rectF.left = i12 - i13;
        rectF.right = rect.right + i13;
        int i14 = pointM8876f.y;
        int i15 = this.f11970h;
        rectF.top = i14 - (i15 / 2);
        rectF.bottom = i14 + (i15 / 2);
        canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f11975m);
    }

    /* renamed from: e */
    public final void m8875e(Canvas canvas) {
        Rect rect = this.f11959D;
        this.f11976n.setColor(this.f11956A);
        Rect rect2 = this.f11958C;
        canvas.drawRect(rect2.left, rect2.top, rect.right + 1, rect.bottom + 1, this.f11976n);
        if (this.f11977o == null) {
            int i10 = rect.left;
            this.f11977o = new LinearGradient(i10, rect.top, i10, rect.bottom, -1, ViewCompat.MEASURED_STATE_MASK, Shader.TileMode.CLAMP);
        }
        C7377b c7377b = this.f11980r;
        if (c7377b == null || c7377b.f11991c != this.f11983u) {
            if (c7377b == null) {
                this.f11980r = new C7377b();
            }
            C7377b c7377b2 = this.f11980r;
            if (c7377b2.f11990b == null) {
                c7377b2.f11990b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            }
            C7377b c7377b3 = this.f11980r;
            if (c7377b3.f11989a == null) {
                c7377b3.f11989a = new Canvas(this.f11980r.f11990b);
            }
            int iHSVToColor = Color.HSVToColor(new float[]{this.f11983u, 1.0f, 1.0f});
            float f10 = rect.left;
            int i11 = rect.top;
            this.f11978p = new LinearGradient(f10, i11, rect.right, i11, -1, iHSVToColor, Shader.TileMode.CLAMP);
            this.f11971i.setShader(new ComposeShader(this.f11977o, this.f11978p, PorterDuff.Mode.MULTIPLY));
            this.f11980r.f11989a.drawRect(0.0f, 0.0f, r15.f11990b.getWidth(), this.f11980r.f11990b.getHeight(), this.f11971i);
            this.f11980r.f11991c = this.f11983u;
        }
        canvas.drawBitmap(this.f11980r.f11990b, (Rect) null, rect, (Paint) null);
        Point pointM8883m = m8883m(this.f11984v, this.f11985w);
        this.f11972j.setColor(ViewCompat.MEASURED_STATE_MASK);
        canvas.drawCircle(pointM8883m.x, pointM8883m.y, this.f11968f - AbstractC9274c.m18262a(getContext(), 1.0f), this.f11972j);
        this.f11972j.setColor(-2236963);
        canvas.drawCircle(pointM8883m.x, pointM8883m.y, this.f11968f, this.f11972j);
    }

    /* renamed from: f */
    public final Point m8876f(float f10) {
        Rect rect = this.f11960E;
        float fHeight = rect.height();
        Point point = new Point();
        point.y = (int) ((fHeight - ((f10 * fHeight) / 360.0f)) + rect.top);
        point.x = rect.left;
        return point;
    }

    /* renamed from: g */
    public final void m8877g(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPickerView);
        this.f11986x = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPickerView_cpv_alphaChannelVisible, false);
        this.f11987y = typedArrayObtainStyledAttributes.getString(R$styleable.ColorPickerView_cpv_alphaChannelText);
        this.f11988z = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_sliderColor, -4342339);
        this.f11956A = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_borderColor, -9539986);
        typedArrayObtainStyledAttributes.recycle();
        m8872b(context);
        this.f11965c = AbstractC9274c.m18262a(getContext(), 30.0f);
        this.f11966d = AbstractC9274c.m18262a(getContext(), 20.0f);
        this.f11967e = AbstractC9274c.m18262a(getContext(), 10.0f);
        this.f11968f = AbstractC9274c.m18262a(getContext(), 5.0f);
        this.f11970h = AbstractC9274c.m18262a(getContext(), 4.0f);
        this.f11969g = AbstractC9274c.m18262a(getContext(), 2.0f);
        this.f11957B = getResources().getDimensionPixelSize(R$dimen.cpv_required_padding);
        m8878h();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public String getAlphaSliderText() {
        return this.f11987y;
    }

    public int getBorderColor() {
        return this.f11956A;
    }

    public int getColor() {
        return Color.HSVToColor(this.f11982t, new float[]{this.f11983u, this.f11984v, this.f11985w});
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f11957B);
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f11957B);
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f11957B);
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f11957B);
    }

    public int getSliderTrackerColor() {
        return this.f11988z;
    }

    /* renamed from: h */
    public final void m8878h() {
        this.f11971i = new Paint();
        this.f11972j = new Paint();
        this.f11975m = new Paint();
        this.f11973k = new Paint();
        this.f11974l = new Paint();
        this.f11976n = new Paint();
        Paint paint = this.f11972j;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f11972j.setStrokeWidth(AbstractC9274c.m18262a(getContext(), 2.0f));
        this.f11972j.setAntiAlias(true);
        this.f11975m.setColor(this.f11988z);
        this.f11975m.setStyle(style);
        this.f11975m.setStrokeWidth(AbstractC9274c.m18262a(getContext(), 2.0f));
        this.f11975m.setAntiAlias(true);
        this.f11974l.setColor(-14935012);
        this.f11974l.setTextSize(AbstractC9274c.m18262a(getContext(), 14.0f));
        this.f11974l.setAntiAlias(true);
        this.f11974l.setTextAlign(Paint.Align.CENTER);
        this.f11974l.setFakeBoldText(true);
    }

    /* renamed from: i */
    public final boolean m8879i(MotionEvent motionEvent) {
        Point point = this.f11962G;
        if (point == null) {
            return false;
        }
        int i10 = point.x;
        int i11 = point.y;
        if (this.f11960E.contains(i10, i11)) {
            this.f11983u = m8881k(motionEvent.getY());
            return true;
        }
        if (this.f11959D.contains(i10, i11)) {
            float[] fArrM8882l = m8882l(motionEvent.getX(), motionEvent.getY());
            this.f11984v = fArrM8882l[0];
            this.f11985w = fArrM8882l[1];
            return true;
        }
        Rect rect = this.f11961F;
        if (rect == null || !rect.contains(i10, i11)) {
            return false;
        }
        this.f11982t = m8880j((int) motionEvent.getX());
        return true;
    }

    /* renamed from: j */
    public final int m8880j(int i10) {
        Rect rect = this.f11961F;
        int iWidth = rect.width();
        int i11 = rect.left;
        return 255 - (((i10 < i11 ? 0 : i10 > rect.right ? iWidth : i10 - i11) * 255) / iWidth);
    }

    /* renamed from: k */
    public final float m8881k(float f10) {
        Rect rect = this.f11960E;
        float fHeight = rect.height();
        int i10 = rect.top;
        return 360.0f - (((f10 < ((float) i10) ? 0.0f : f10 > ((float) rect.bottom) ? fHeight : f10 - i10) * 360.0f) / fHeight);
    }

    /* renamed from: l */
    public final float[] m8882l(float f10, float f11) {
        Rect rect = this.f11959D;
        float fWidth = rect.width();
        float fHeight = rect.height();
        int i10 = rect.left;
        float f12 = f10 < ((float) i10) ? 0.0f : f10 > ((float) rect.right) ? fWidth : f10 - i10;
        int i11 = rect.top;
        return new float[]{(1.0f / fWidth) * f12, 1.0f - ((1.0f / fHeight) * (f11 >= ((float) i11) ? f11 > ((float) rect.bottom) ? fHeight : f11 - i11 : 0.0f))};
    }

    /* renamed from: m */
    public final Point m8883m(float f10, float f11) {
        Rect rect = this.f11959D;
        float fHeight = rect.height();
        float fWidth = rect.width();
        Point point = new Point();
        point.x = (int) ((f10 * fWidth) + rect.left);
        point.y = (int) (((1.0f - f11) * fHeight) + rect.top);
        return point;
    }

    /* renamed from: n */
    public void m8884n(int i10, boolean z10) {
        InterfaceC7378c interfaceC7378c;
        int iAlpha = Color.alpha(i10);
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
        this.f11982t = iAlpha;
        float f10 = fArr[0];
        this.f11983u = f10;
        float f11 = fArr[1];
        this.f11984v = f11;
        float f12 = fArr[2];
        this.f11985w = f12;
        if (z10 && (interfaceC7378c = this.f11964I) != null) {
            interfaceC7378c.mo8851g(Color.HSVToColor(iAlpha, new float[]{f10, f11, f12}));
        }
        invalidate();
    }

    /* renamed from: o */
    public final void m8885o() {
        if (this.f11986x) {
            Rect rect = this.f11958C;
            int i10 = rect.left + 1;
            int i11 = rect.bottom;
            this.f11961F = new Rect(i10, (i11 - this.f11966d) + 1, rect.right - 1, i11 - 1);
            C9272a c9272a = new C9272a(AbstractC9274c.m18262a(getContext(), 4.0f));
            this.f11963H = c9272a;
            c9272a.setBounds(Math.round(this.f11961F.left), Math.round(this.f11961F.top), Math.round(this.f11961F.right), Math.round(this.f11961F.bottom));
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f11958C.width() <= 0 || this.f11958C.height() <= 0) {
            return;
        }
        m8875e(canvas);
        m8874d(canvas);
        m8873c(canvas);
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
            int r0 = r5.f11967e
            int r1 = r7 + r0
            int r2 = r5.f11965c
            int r1 = r1 + r2
            int r3 = r6 - r0
            int r3 = r3 - r2
            boolean r2 = r5.f11986x
            if (r2 == 0) goto L40
            int r2 = r5.f11966d
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
            int r0 = r5.f11967e
            int r1 = r6 - r0
            int r2 = r5.f11965c
            int r1 = r1 - r2
            boolean r2 = r5.f11986x
            if (r2 == 0) goto L6f
            int r2 = r5.f11966d
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
            int r0 = r5.f11967e
            int r1 = r7 + r0
            int r2 = r5.f11965c
            int r1 = r1 + r2
            boolean r2 = r5.f11986x
            if (r2 == 0) goto L87
            int r2 = r5.f11966d
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
            this.f11982t = bundle.getInt("alpha");
            this.f11983u = bundle.getFloat("hue");
            this.f11984v = bundle.getFloat(LocalePreferences.FirstDayOfWeek.SATURDAY);
            this.f11985w = bundle.getFloat("val");
            this.f11986x = bundle.getBoolean("show_alpha");
            this.f11987y = bundle.getString("alpha_text");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f11982t);
        bundle.putFloat("hue", this.f11983u);
        bundle.putFloat(LocalePreferences.FirstDayOfWeek.SATURDAY, this.f11984v);
        bundle.putFloat("val", this.f11985w);
        bundle.putBoolean("show_alpha", this.f11986x);
        bundle.putString("alpha_text", this.f11987y);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Rect rect = new Rect();
        this.f11958C = rect;
        rect.left = getPaddingLeft();
        this.f11958C.right = i10 - getPaddingRight();
        this.f11958C.top = getPaddingTop();
        this.f11958C.bottom = i11 - getPaddingBottom();
        this.f11977o = null;
        this.f11978p = null;
        this.f11979q = null;
        this.f11980r = null;
        this.f11981s = null;
        m8887q();
        m8886p();
        m8885o();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM8879i;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11962G = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zM8879i = m8879i(motionEvent);
        } else if (action != 1) {
            zM8879i = action != 2 ? false : m8879i(motionEvent);
        } else {
            this.f11962G = null;
            zM8879i = m8879i(motionEvent);
        }
        if (!zM8879i) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC7378c interfaceC7378c = this.f11964I;
        if (interfaceC7378c != null) {
            interfaceC7378c.mo8851g(Color.HSVToColor(this.f11982t, new float[]{this.f11983u, this.f11984v, this.f11985w}));
        }
        invalidate();
        return true;
    }

    /* renamed from: p */
    public final void m8886p() {
        Rect rect = this.f11958C;
        int i10 = rect.right;
        this.f11960E = new Rect((i10 - this.f11965c) + 1, rect.top + 1, i10 - 1, (rect.bottom - 1) - (this.f11986x ? this.f11967e + this.f11966d : 0));
    }

    /* renamed from: q */
    public final void m8887q() {
        Rect rect = this.f11958C;
        int i10 = rect.left + 1;
        int i11 = rect.top + 1;
        int i12 = rect.bottom - 1;
        int i13 = rect.right - 1;
        int i14 = this.f11967e;
        int i15 = (i13 - i14) - this.f11965c;
        if (this.f11986x) {
            i12 -= this.f11966d + i14;
        }
        this.f11959D = new Rect(i10, i11, i15, i12);
    }

    public void setAlphaSliderText(int i10) {
        setAlphaSliderText(getContext().getString(i10));
    }

    public void setAlphaSliderVisible(boolean z10) {
        if (this.f11986x != z10) {
            this.f11986x = z10;
            this.f11977o = null;
            this.f11978p = null;
            this.f11979q = null;
            this.f11981s = null;
            this.f11980r = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i10) {
        this.f11956A = i10;
        invalidate();
    }

    public void setColor(int i10) {
        m8884n(i10, false);
    }

    public void setOnColorChangedListener(InterfaceC7378c interfaceC7378c) {
        this.f11964I = interfaceC7378c;
    }

    public void setSliderTrackerColor(int i10) {
        this.f11988z = i10;
        this.f11975m.setColor(i10);
        invalidate();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f11982t = 255;
        this.f11983u = 360.0f;
        this.f11984v = 0.0f;
        this.f11985w = 0.0f;
        this.f11986x = false;
        this.f11987y = null;
        this.f11988z = -4342339;
        this.f11956A = -9539986;
        this.f11962G = null;
        m8877g(context, attributeSet);
    }

    public void setAlphaSliderText(String str) {
        this.f11987y = str;
        invalidate();
    }
}
