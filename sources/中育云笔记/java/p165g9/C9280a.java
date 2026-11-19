package p165g9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;

/* renamed from: g9.a */
/* loaded from: classes5.dex */
public class C9280a extends Drawable {

    /* renamed from: a */
    public Paint f21635a;

    /* renamed from: b */
    public Paint f21636b;

    /* renamed from: c */
    public int f21637c;

    /* renamed from: d */
    public int f21638d;

    /* renamed from: e */
    public int f21639e;

    /* renamed from: f */
    public int f21640f;

    /* renamed from: g */
    public int f21641g;

    /* renamed from: h */
    public int[] f21642h;

    /* renamed from: i */
    public RectF f21643i;

    /* renamed from: g9.a$b */
    public static class b {

        /* renamed from: h */
        public static final int f21644h = Color.parseColor("#4d000000");

        /* renamed from: a */
        public int f21645a = 0;

        /* renamed from: b */
        public int f21646b = 10;

        /* renamed from: c */
        public int f21647c = f21644h;

        /* renamed from: d */
        public int f21648d = 16;

        /* renamed from: e */
        public int f21649e = 0;

        /* renamed from: f */
        public int f21650f = 0;

        /* renamed from: g */
        public int[] f21651g = {0};

        /* renamed from: a */
        public C9280a m18280a() {
            return new C9280a(this.f21645a, this.f21651g, this.f21646b, this.f21647c, this.f21648d, this.f21649e, this.f21650f);
        }

        /* renamed from: b */
        public b m18281b(int i10) {
            this.f21651g[0] = i10;
            return this;
        }

        /* renamed from: c */
        public b m18282c(int[] iArr) {
            this.f21651g = iArr;
            return this;
        }

        /* renamed from: d */
        public b m18283d(int i10) {
            this.f21649e = i10;
            return this;
        }

        /* renamed from: e */
        public b m18284e(int i10) {
            this.f21650f = i10;
            return this;
        }

        /* renamed from: f */
        public b m18285f(int i10) {
            this.f21647c = i10;
            return this;
        }

        /* renamed from: g */
        public b m18286g(int i10) {
            this.f21648d = i10;
            return this;
        }

        /* renamed from: h */
        public b m18287h(int i10) {
            this.f21645a = i10;
            return this;
        }

        /* renamed from: i */
        public b m18288i(int i10) {
            this.f21646b = i10;
            return this;
        }
    }

    /* renamed from: a */
    public static C9280a m18279a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShadowDrawable);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShadowDrawable_sd_shadowRadius, AbstractC8040f.m12204e(R$dimen.default_sd_shadow_radius));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.ShadowDrawable_sd_shadowColor, b.f21644h);
        int i10 = typedArrayObtainStyledAttributes.getInt(R$styleable.ShadowDrawable_sd_shapeType, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShadowDrawable_sd_shapeRadius, AbstractC8040f.m12204e(R$dimen.default_sd_shape_radius));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShadowDrawable_sd_offsetX, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShadowDrawable_sd_offsetY, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.ShadowDrawable_sd_bgColor, AbstractC8040f.m12202c(R$color.xui_config_color_white));
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.ShadowDrawable_sd_secondBgColor, -1);
        typedArrayObtainStyledAttributes.recycle();
        b bVarM18284e = new b().m18287h(i10).m18288i(dimensionPixelSize2).m18285f(color).m18286g(dimensionPixelSize).m18283d(dimensionPixelSize3).m18284e(dimensionPixelSize4);
        if (color3 != -1) {
            bVarM18284e.m18282c(new int[]{color2, color3});
        } else {
            bVarM18284e.m18281b(color2);
        }
        return bVarM18284e.m18280a();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int[] iArr = this.f21642h;
        if (iArr != null) {
            if (iArr.length == 1) {
                this.f21636b.setColor(iArr[0]);
            } else {
                Paint paint = this.f21636b;
                RectF rectF = this.f21643i;
                float f10 = rectF.left;
                float fHeight = rectF.height() / 2.0f;
                RectF rectF2 = this.f21643i;
                paint.setShader(new LinearGradient(f10, fHeight, rectF2.right, rectF2.height() / 2.0f, this.f21642h, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        if (this.f21638d != 0) {
            canvas.drawCircle(this.f21643i.centerX(), this.f21643i.centerY(), Math.min(this.f21643i.width(), this.f21643i.height()) / 2.0f, this.f21635a);
            canvas.drawCircle(this.f21643i.centerX(), this.f21643i.centerY(), Math.min(this.f21643i.width(), this.f21643i.height()) / 2.0f, this.f21636b);
            return;
        }
        RectF rectF3 = this.f21643i;
        int i10 = this.f21639e;
        canvas.drawRoundRect(rectF3, i10, i10, this.f21635a);
        RectF rectF4 = this.f21643i;
        int i11 = this.f21639e;
        canvas.drawRoundRect(rectF4, i11, i11, this.f21636b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f21635a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = this.f21637c;
        int i15 = this.f21640f;
        int i16 = this.f21641g;
        this.f21643i = new RectF((i10 + i14) - i15, (i11 + i14) - i16, (i12 - i14) - i15, (i13 - i14) - i16);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21635a.setColorFilter(colorFilter);
    }

    public C9280a(int i10, int[] iArr, int i11, int i12, int i13, int i14, int i15) {
        this.f21638d = i10;
        this.f21642h = iArr;
        this.f21639e = i11;
        this.f21637c = i13;
        this.f21640f = i14;
        this.f21641g = i15;
        Paint paint = new Paint();
        this.f21635a = paint;
        paint.setColor(0);
        this.f21635a.setAntiAlias(true);
        this.f21635a.setShadowLayer(i13, i14, i15, i12);
        this.f21635a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        Paint paint2 = new Paint();
        this.f21636b = paint2;
        paint2.setAntiAlias(true);
    }
}
