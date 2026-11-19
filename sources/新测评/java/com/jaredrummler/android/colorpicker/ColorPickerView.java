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
import p196p1.AbstractC8816c;
import p196p1.C8814a;

/* loaded from: classes.dex */
public class ColorPickerView extends View {

    /* renamed from: A */
    public Rect f4590A;

    /* renamed from: B */
    public Rect f4591B;

    /* renamed from: C */
    public Rect f4592C;

    /* renamed from: D */
    public Rect f4593D;

    /* renamed from: E */
    public Point f4594E;

    /* renamed from: F */
    public C8814a f4595F;

    /* renamed from: G */
    public InterfaceC6324c f4596G;

    /* renamed from: a */
    public int f4597a;

    /* renamed from: b */
    public int f4598b;

    /* renamed from: c */
    public int f4599c;

    /* renamed from: d */
    public int f4600d;

    /* renamed from: e */
    public int f4601e;

    /* renamed from: f */
    public int f4602f;

    /* renamed from: g */
    public Paint f4603g;

    /* renamed from: h */
    public Paint f4604h;

    /* renamed from: i */
    public Paint f4605i;

    /* renamed from: j */
    public Paint f4606j;

    /* renamed from: k */
    public Paint f4607k;

    /* renamed from: l */
    public Paint f4608l;

    /* renamed from: m */
    public Shader f4609m;

    /* renamed from: n */
    public Shader f4610n;

    /* renamed from: o */
    public Shader f4611o;

    /* renamed from: p */
    public C6323b f4612p;

    /* renamed from: q */
    public C6323b f4613q;

    /* renamed from: r */
    public int f4614r;

    /* renamed from: s */
    public float f4615s;

    /* renamed from: t */
    public float f4616t;

    /* renamed from: u */
    public float f4617u;

    /* renamed from: v */
    public boolean f4618v;

    /* renamed from: w */
    public String f4619w;

    /* renamed from: x */
    public int f4620x;

    /* renamed from: y */
    public int f4621y;

    /* renamed from: z */
    public int f4622z;

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$b */
    public class C6323b {

        /* renamed from: a */
        public Canvas f4623a;

        /* renamed from: b */
        public Bitmap f4624b;

        /* renamed from: c */
        public float f4625c;

        public C6323b() {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$c */
    public interface InterfaceC6324c {
        /* renamed from: a */
        void mo4316a(int i10);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getPreferredHeight() {
        int iM14772a = AbstractC8816c.m14772a(getContext(), 200.0f);
        return this.f4618v ? iM14772a + this.f4599c + this.f4598b : iM14772a;
    }

    private int getPreferredWidth() {
        return AbstractC8816c.m14772a(getContext(), 200.0f) + this.f4597a + this.f4599c;
    }

    /* renamed from: a */
    public final Point m4342a(int i10) {
        Rect rect = this.f4593D;
        float fWidth = rect.width();
        Point point = new Point();
        point.x = (int) ((fWidth - ((i10 * fWidth) / 255.0f)) + rect.left);
        point.y = rect.top;
        return point;
    }

    /* renamed from: b */
    public final void m4343b(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorSecondary});
        if (this.f4621y == -9539986) {
            this.f4621y = typedArrayObtainStyledAttributes.getColor(0, -9539986);
        }
        if (this.f4620x == -4342339) {
            this.f4620x = typedArrayObtainStyledAttributes.getColor(0, -4342339);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public final void m4344c(Canvas canvas) {
        Rect rect;
        if (!this.f4618v || (rect = this.f4593D) == null || this.f4595F == null) {
            return;
        }
        this.f4608l.setColor(this.f4621y);
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, this.f4608l);
        this.f4595F.draw(canvas);
        float[] fArr = {this.f4615s, this.f4616t, this.f4617u};
        int iHSVToColor = Color.HSVToColor(fArr);
        int iHSVToColor2 = Color.HSVToColor(0, fArr);
        float f10 = rect.left;
        int i10 = rect.top;
        LinearGradient linearGradient = new LinearGradient(f10, i10, rect.right, i10, iHSVToColor, iHSVToColor2, Shader.TileMode.CLAMP);
        this.f4611o = linearGradient;
        this.f4605i.setShader(linearGradient);
        canvas.drawRect(rect, this.f4605i);
        String str = this.f4619w;
        if (str != null && !str.equals("")) {
            canvas.drawText(this.f4619w, rect.centerX(), rect.centerY() + AbstractC8816c.m14772a(getContext(), 4.0f), this.f4606j);
        }
        Point pointM4342a = m4342a(this.f4614r);
        RectF rectF = new RectF();
        int i11 = pointM4342a.x;
        int i12 = this.f4602f;
        rectF.left = i11 - (i12 / 2);
        rectF.right = i11 + (i12 / 2);
        int i13 = rect.top;
        int i14 = this.f4601e;
        rectF.top = i13 - i14;
        rectF.bottom = rect.bottom + i14;
        canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f4607k);
    }

    /* renamed from: d */
    public final void m4345d(Canvas canvas) {
        Rect rect = this.f4592C;
        this.f4608l.setColor(this.f4621y);
        canvas.drawRect(rect.left - 1, rect.top - 1, rect.right + 1, rect.bottom + 1, this.f4608l);
        if (this.f4613q == null) {
            C6323b c6323b = new C6323b();
            this.f4613q = c6323b;
            c6323b.f4624b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            this.f4613q.f4623a = new Canvas(this.f4613q.f4624b);
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
                this.f4613q.f4623a.drawLine(0.0f, f11, r9.f4624b.getWidth(), f11, paint);
            }
        }
        canvas.drawBitmap(this.f4613q.f4624b, (Rect) null, rect, (Paint) null);
        Point pointM4347f = m4347f(this.f4615s);
        RectF rectF = new RectF();
        int i12 = rect.left;
        int i13 = this.f4601e;
        rectF.left = i12 - i13;
        rectF.right = rect.right + i13;
        int i14 = pointM4347f.y;
        int i15 = this.f4602f;
        rectF.top = i14 - (i15 / 2);
        rectF.bottom = i14 + (i15 / 2);
        canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f4607k);
    }

    /* renamed from: e */
    public final void m4346e(Canvas canvas) {
        Rect rect = this.f4591B;
        this.f4608l.setColor(this.f4621y);
        Rect rect2 = this.f4590A;
        canvas.drawRect(rect2.left, rect2.top, rect.right + 1, rect.bottom + 1, this.f4608l);
        if (this.f4609m == null) {
            int i10 = rect.left;
            this.f4609m = new LinearGradient(i10, rect.top, i10, rect.bottom, -1, ViewCompat.MEASURED_STATE_MASK, Shader.TileMode.CLAMP);
        }
        C6323b c6323b = this.f4612p;
        if (c6323b == null || c6323b.f4625c != this.f4615s) {
            if (c6323b == null) {
                this.f4612p = new C6323b();
            }
            C6323b c6323b2 = this.f4612p;
            if (c6323b2.f4624b == null) {
                c6323b2.f4624b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            }
            C6323b c6323b3 = this.f4612p;
            if (c6323b3.f4623a == null) {
                c6323b3.f4623a = new Canvas(this.f4612p.f4624b);
            }
            int iHSVToColor = Color.HSVToColor(new float[]{this.f4615s, 1.0f, 1.0f});
            float f10 = rect.left;
            int i11 = rect.top;
            this.f4610n = new LinearGradient(f10, i11, rect.right, i11, -1, iHSVToColor, Shader.TileMode.CLAMP);
            this.f4603g.setShader(new ComposeShader(this.f4609m, this.f4610n, PorterDuff.Mode.MULTIPLY));
            this.f4612p.f4623a.drawRect(0.0f, 0.0f, r15.f4624b.getWidth(), this.f4612p.f4624b.getHeight(), this.f4603g);
            this.f4612p.f4625c = this.f4615s;
        }
        canvas.drawBitmap(this.f4612p.f4624b, (Rect) null, rect, (Paint) null);
        Point pointM4354m = m4354m(this.f4616t, this.f4617u);
        this.f4604h.setColor(ViewCompat.MEASURED_STATE_MASK);
        canvas.drawCircle(pointM4354m.x, pointM4354m.y, this.f4600d - AbstractC8816c.m14772a(getContext(), 1.0f), this.f4604h);
        this.f4604h.setColor(-2236963);
        canvas.drawCircle(pointM4354m.x, pointM4354m.y, this.f4600d, this.f4604h);
    }

    /* renamed from: f */
    public final Point m4347f(float f10) {
        Rect rect = this.f4592C;
        float fHeight = rect.height();
        Point point = new Point();
        point.y = (int) ((fHeight - ((f10 * fHeight) / 360.0f)) + rect.top);
        point.x = rect.left;
        return point;
    }

    /* renamed from: g */
    public final void m4348g(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ColorPickerView);
        this.f4618v = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ColorPickerView_cpv_alphaChannelVisible, false);
        this.f4619w = typedArrayObtainStyledAttributes.getString(R$styleable.ColorPickerView_cpv_alphaChannelText);
        this.f4620x = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_sliderColor, -4342339);
        this.f4621y = typedArrayObtainStyledAttributes.getColor(R$styleable.ColorPickerView_cpv_borderColor, -9539986);
        typedArrayObtainStyledAttributes.recycle();
        m4343b(context);
        this.f4597a = AbstractC8816c.m14772a(getContext(), 30.0f);
        this.f4598b = AbstractC8816c.m14772a(getContext(), 20.0f);
        this.f4599c = AbstractC8816c.m14772a(getContext(), 10.0f);
        this.f4600d = AbstractC8816c.m14772a(getContext(), 5.0f);
        this.f4602f = AbstractC8816c.m14772a(getContext(), 4.0f);
        this.f4601e = AbstractC8816c.m14772a(getContext(), 2.0f);
        this.f4622z = getResources().getDimensionPixelSize(R$dimen.cpv_required_padding);
        m4349h();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public String getAlphaSliderText() {
        return this.f4619w;
    }

    public int getBorderColor() {
        return this.f4621y;
    }

    public int getColor() {
        return Color.HSVToColor(this.f4614r, new float[]{this.f4615s, this.f4616t, this.f4617u});
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f4622z);
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f4622z);
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f4622z);
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f4622z);
    }

    public int getSliderTrackerColor() {
        return this.f4620x;
    }

    /* renamed from: h */
    public final void m4349h() {
        this.f4603g = new Paint();
        this.f4604h = new Paint();
        this.f4607k = new Paint();
        this.f4605i = new Paint();
        this.f4606j = new Paint();
        this.f4608l = new Paint();
        Paint paint = this.f4604h;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f4604h.setStrokeWidth(AbstractC8816c.m14772a(getContext(), 2.0f));
        this.f4604h.setAntiAlias(true);
        this.f4607k.setColor(this.f4620x);
        this.f4607k.setStyle(style);
        this.f4607k.setStrokeWidth(AbstractC8816c.m14772a(getContext(), 2.0f));
        this.f4607k.setAntiAlias(true);
        this.f4606j.setColor(-14935012);
        this.f4606j.setTextSize(AbstractC8816c.m14772a(getContext(), 14.0f));
        this.f4606j.setAntiAlias(true);
        this.f4606j.setTextAlign(Paint.Align.CENTER);
        this.f4606j.setFakeBoldText(true);
    }

    /* renamed from: i */
    public final boolean m4350i(MotionEvent motionEvent) {
        Point point = this.f4594E;
        if (point == null) {
            return false;
        }
        int i10 = point.x;
        int i11 = point.y;
        if (this.f4592C.contains(i10, i11)) {
            this.f4615s = m4352k(motionEvent.getY());
            return true;
        }
        if (this.f4591B.contains(i10, i11)) {
            float[] fArrM4353l = m4353l(motionEvent.getX(), motionEvent.getY());
            this.f4616t = fArrM4353l[0];
            this.f4617u = fArrM4353l[1];
            return true;
        }
        Rect rect = this.f4593D;
        if (rect == null || !rect.contains(i10, i11)) {
            return false;
        }
        this.f4614r = m4351j((int) motionEvent.getX());
        return true;
    }

    /* renamed from: j */
    public final int m4351j(int i10) {
        Rect rect = this.f4593D;
        int iWidth = rect.width();
        int i11 = rect.left;
        return 255 - (((i10 < i11 ? 0 : i10 > rect.right ? iWidth : i10 - i11) * 255) / iWidth);
    }

    /* renamed from: k */
    public final float m4352k(float f10) {
        Rect rect = this.f4592C;
        float fHeight = rect.height();
        int i10 = rect.top;
        return 360.0f - (((f10 < ((float) i10) ? 0.0f : f10 > ((float) rect.bottom) ? fHeight : f10 - i10) * 360.0f) / fHeight);
    }

    /* renamed from: l */
    public final float[] m4353l(float f10, float f11) {
        Rect rect = this.f4591B;
        float fWidth = rect.width();
        float fHeight = rect.height();
        int i10 = rect.left;
        float f12 = f10 < ((float) i10) ? 0.0f : f10 > ((float) rect.right) ? fWidth : f10 - i10;
        int i11 = rect.top;
        return new float[]{(1.0f / fWidth) * f12, 1.0f - ((1.0f / fHeight) * (f11 >= ((float) i11) ? f11 > ((float) rect.bottom) ? fHeight : f11 - i11 : 0.0f))};
    }

    /* renamed from: m */
    public final Point m4354m(float f10, float f11) {
        Rect rect = this.f4591B;
        float fHeight = rect.height();
        float fWidth = rect.width();
        Point point = new Point();
        point.x = (int) ((f10 * fWidth) + rect.left);
        point.y = (int) (((1.0f - f11) * fHeight) + rect.top);
        return point;
    }

    /* renamed from: n */
    public void m4355n(int i10, boolean z9) {
        InterfaceC6324c interfaceC6324c;
        int iAlpha = Color.alpha(i10);
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
        this.f4614r = iAlpha;
        float f10 = fArr[0];
        this.f4615s = f10;
        float f11 = fArr[1];
        this.f4616t = f11;
        float f12 = fArr[2];
        this.f4617u = f12;
        if (z9 && (interfaceC6324c = this.f4596G) != null) {
            interfaceC6324c.mo4316a(Color.HSVToColor(iAlpha, new float[]{f10, f11, f12}));
        }
        invalidate();
    }

    /* renamed from: o */
    public final void m4356o() {
        if (this.f4618v) {
            Rect rect = this.f4590A;
            int i10 = rect.left + 1;
            int i11 = rect.bottom;
            this.f4593D = new Rect(i10, (i11 - this.f4598b) + 1, rect.right - 1, i11 - 1);
            C8814a c8814a = new C8814a(AbstractC8816c.m14772a(getContext(), 4.0f));
            this.f4595F = c8814a;
            c8814a.setBounds(Math.round(this.f4593D.left), Math.round(this.f4593D.top), Math.round(this.f4593D.right), Math.round(this.f4593D.bottom));
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f4590A.width() <= 0 || this.f4590A.height() <= 0) {
            return;
        }
        m4346e(canvas);
        m4345d(canvas);
        m4344c(canvas);
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
            int r0 = r5.f4599c
            int r1 = r7 + r0
            int r2 = r5.f4597a
            int r1 = r1 + r2
            int r3 = r6 - r0
            int r3 = r3 - r2
            boolean r2 = r5.f4618v
            if (r2 == 0) goto L40
            int r2 = r5.f4598b
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
            int r0 = r5.f4599c
            int r1 = r6 - r0
            int r2 = r5.f4597a
            int r1 = r1 - r2
            boolean r2 = r5.f4618v
            if (r2 == 0) goto L6f
            int r2 = r5.f4598b
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
            int r0 = r5.f4599c
            int r1 = r7 + r0
            int r2 = r5.f4597a
            int r1 = r1 + r2
            boolean r2 = r5.f4618v
            if (r2 == 0) goto L87
            int r2 = r5.f4598b
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
            this.f4614r = bundle.getInt("alpha");
            this.f4615s = bundle.getFloat("hue");
            this.f4616t = bundle.getFloat(LocalePreferences.FirstDayOfWeek.SATURDAY);
            this.f4617u = bundle.getFloat("val");
            this.f4618v = bundle.getBoolean("show_alpha");
            this.f4619w = bundle.getString("alpha_text");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f4614r);
        bundle.putFloat("hue", this.f4615s);
        bundle.putFloat(LocalePreferences.FirstDayOfWeek.SATURDAY, this.f4616t);
        bundle.putFloat("val", this.f4617u);
        bundle.putBoolean("show_alpha", this.f4618v);
        bundle.putString("alpha_text", this.f4619w);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Rect rect = new Rect();
        this.f4590A = rect;
        rect.left = getPaddingLeft();
        this.f4590A.right = i10 - getPaddingRight();
        this.f4590A.top = getPaddingTop();
        this.f4590A.bottom = i11 - getPaddingBottom();
        this.f4609m = null;
        this.f4610n = null;
        this.f4611o = null;
        this.f4612p = null;
        this.f4613q = null;
        m4358q();
        m4357p();
        m4356o();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM4350i;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f4594E = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            zM4350i = m4350i(motionEvent);
        } else if (action != 1) {
            zM4350i = action != 2 ? false : m4350i(motionEvent);
        } else {
            this.f4594E = null;
            zM4350i = m4350i(motionEvent);
        }
        if (!zM4350i) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC6324c interfaceC6324c = this.f4596G;
        if (interfaceC6324c != null) {
            interfaceC6324c.mo4316a(Color.HSVToColor(this.f4614r, new float[]{this.f4615s, this.f4616t, this.f4617u}));
        }
        invalidate();
        return true;
    }

    /* renamed from: p */
    public final void m4357p() {
        Rect rect = this.f4590A;
        int i10 = rect.right;
        this.f4592C = new Rect((i10 - this.f4597a) + 1, rect.top + 1, i10 - 1, (rect.bottom - 1) - (this.f4618v ? this.f4599c + this.f4598b : 0));
    }

    /* renamed from: q */
    public final void m4358q() {
        Rect rect = this.f4590A;
        int i10 = rect.left + 1;
        int i11 = rect.top + 1;
        int i12 = rect.bottom - 1;
        int i13 = rect.right - 1;
        int i14 = this.f4599c;
        int i15 = (i13 - i14) - this.f4597a;
        if (this.f4618v) {
            i12 -= this.f4598b + i14;
        }
        this.f4591B = new Rect(i10, i11, i15, i12);
    }

    public void setAlphaSliderText(int i10) {
        setAlphaSliderText(getContext().getString(i10));
    }

    public void setAlphaSliderVisible(boolean z9) {
        if (this.f4618v != z9) {
            this.f4618v = z9;
            this.f4609m = null;
            this.f4610n = null;
            this.f4611o = null;
            this.f4613q = null;
            this.f4612p = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i10) {
        this.f4621y = i10;
        invalidate();
    }

    public void setColor(int i10) {
        m4355n(i10, false);
    }

    public void setOnColorChangedListener(InterfaceC6324c interfaceC6324c) {
        this.f4596G = interfaceC6324c;
    }

    public void setSliderTrackerColor(int i10) {
        this.f4620x = i10;
        this.f4607k.setColor(i10);
        invalidate();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f4614r = 255;
        this.f4615s = 360.0f;
        this.f4616t = 0.0f;
        this.f4617u = 0.0f;
        this.f4618v = false;
        this.f4619w = null;
        this.f4620x = -4342339;
        this.f4621y = -9539986;
        this.f4594E = null;
        m4348g(context, attributeSet);
    }

    public void setAlphaSliderText(String str) {
        this.f4619w = str;
        invalidate();
    }
}
