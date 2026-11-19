package p099g5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.zykj.camera.R$mipmap;
import com.zykj.camera.R$styleable;

/* renamed from: g5.g */
/* loaded from: classes4.dex */
public class C7532g extends View {

    /* renamed from: A */
    public boolean f12464A;

    /* renamed from: B */
    public String f12465B;

    /* renamed from: C */
    public String f12466C;

    /* renamed from: D */
    public String f12467D;

    /* renamed from: E */
    public int f12468E;

    /* renamed from: F */
    public int f12469F;

    /* renamed from: G */
    public boolean f12470G;

    /* renamed from: H */
    public int f12471H;

    /* renamed from: I */
    public boolean f12472I;

    /* renamed from: J */
    public int f12473J;

    /* renamed from: K */
    public boolean f12474K;

    /* renamed from: L */
    public boolean f12475L;

    /* renamed from: M */
    public boolean f12476M;

    /* renamed from: N */
    public Drawable f12477N;

    /* renamed from: O */
    public Bitmap f12478O;

    /* renamed from: P */
    public float f12479P;

    /* renamed from: Q */
    public float f12480Q;

    /* renamed from: R */
    public Bitmap f12481R;

    /* renamed from: S */
    public Bitmap f12482S;

    /* renamed from: T */
    public Bitmap f12483T;

    /* renamed from: U */
    public Bitmap f12484U;

    /* renamed from: V */
    public float f12485V;

    /* renamed from: W */
    public StaticLayout f12486W;

    /* renamed from: a */
    public int f12487a;

    /* renamed from: b */
    public int f12488b;

    /* renamed from: c */
    public Rect f12489c;

    /* renamed from: c0 */
    public int f12490c0;

    /* renamed from: d */
    public float f12491d;

    /* renamed from: d0 */
    public boolean f12492d0;

    /* renamed from: e */
    public float f12493e;

    /* renamed from: f */
    public Paint f12494f;

    /* renamed from: g */
    public TextPaint f12495g;

    /* renamed from: h */
    public int f12496h;

    /* renamed from: i */
    public int f12497i;

    /* renamed from: j */
    public int f12498j;

    /* renamed from: k */
    public int f12499k;

    /* renamed from: l */
    public int f12500l;

    /* renamed from: m */
    public int f12501m;

    /* renamed from: n */
    public int f12502n;

    /* renamed from: o */
    public int f12503o;

    /* renamed from: p */
    public int f12504p;

    /* renamed from: q */
    public int f12505q;

    /* renamed from: r */
    public int f12506r;

    /* renamed from: s */
    public boolean f12507s;

    /* renamed from: t */
    public Drawable f12508t;

    /* renamed from: u */
    public Bitmap f12509u;

    /* renamed from: v */
    public int f12510v;

    /* renamed from: w */
    public int f12511w;

    /* renamed from: x */
    public int f12512x;

    /* renamed from: y */
    public boolean f12513y;

    /* renamed from: z */
    public int f12514z;

    public C7532g(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f12494f = paint;
        paint.setAntiAlias(true);
        this.f12496h = Color.parseColor("#33FFFFFF");
        this.f12497i = -1;
        this.f12498j = AbstractC7526a.m12292b(context, 20.0f);
        this.f12499k = AbstractC7526a.m12292b(context, 3.0f);
        this.f12504p = AbstractC7526a.m12292b(context, 1.0f);
        this.f12505q = -1;
        this.f12503o = AbstractC7526a.m12292b(context, 90.0f);
        this.f12500l = AbstractC7526a.m12292b(context, 200.0f);
        this.f12501m = AbstractC7526a.m12292b(context, 200.0f);
        this.f12502n = AbstractC7526a.m12292b(context, 140.0f);
        this.f12506r = 0;
        this.f12507s = false;
        this.f12508t = null;
        this.f12509u = null;
        this.f12510v = AbstractC7526a.m12292b(context, 1.0f);
        this.f12511w = -1;
        this.f12512x = 1000;
        this.f12513y = false;
        this.f12514z = 0;
        this.f12464A = false;
        this.f12487a = AbstractC7526a.m12292b(context, 10.0f);
        this.f12467D = null;
        this.f12468E = AbstractC7526a.m12295e(context, 14.0f);
        this.f12469F = -1;
        this.f12470G = false;
        this.f12471H = AbstractC7526a.m12292b(context, 20.0f);
        this.f12472I = false;
        this.f12473J = Color.parseColor("#22000000");
        this.f12474K = false;
        this.f12475L = false;
        this.f12476M = false;
        TextPaint textPaint = new TextPaint();
        this.f12495g = textPaint;
        textPaint.setAntiAlias(true);
        this.f12490c0 = AbstractC7526a.m12292b(context, 4.0f);
        this.f12492d0 = false;
    }

    /* renamed from: a */
    public final void m12338a() {
        Drawable drawable = this.f12477N;
        if (drawable != null) {
            this.f12483T = ((BitmapDrawable) drawable).getBitmap();
        }
        if (this.f12483T == null) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R$mipmap.qrcode_default_grid_scan_line);
            this.f12483T = bitmapDecodeResource;
            this.f12483T = AbstractC7526a.m12294d(bitmapDecodeResource, this.f12505q);
        }
        Bitmap bitmapM12291a = AbstractC7526a.m12291a(this.f12483T, 90);
        this.f12484U = bitmapM12291a;
        Bitmap bitmapM12291a2 = AbstractC7526a.m12291a(bitmapM12291a, 90);
        this.f12484U = bitmapM12291a2;
        this.f12484U = AbstractC7526a.m12291a(bitmapM12291a2, 90);
        Drawable drawable2 = this.f12508t;
        if (drawable2 != null) {
            this.f12481R = ((BitmapDrawable) drawable2).getBitmap();
        }
        if (this.f12481R == null) {
            Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), R$mipmap.qrcode_default_scan_line);
            this.f12481R = bitmapDecodeResource2;
            this.f12481R = AbstractC7526a.m12294d(bitmapDecodeResource2, this.f12505q);
        }
        this.f12482S = AbstractC7526a.m12291a(this.f12481R, 90);
        this.f12503o += this.f12514z;
        this.f12485V = (this.f12499k * 1.0f) / 2.0f;
        this.f12495g.setTextSize(this.f12468E);
        this.f12495g.setColor(this.f12469F);
        setIsBarcode(this.f12464A);
    }

    /* renamed from: b */
    public final void m12339b() {
        int i10 = (AbstractC7526a.m12293c(getContext()).x - this.f12500l) / 2;
        int i11 = this.f12503o;
        this.f12489c = new Rect(i10, i11, this.f12500l + i10, this.f12501m + i11);
        if (this.f12464A) {
            float f10 = r1.left + this.f12485V + 0.5f;
            this.f12493e = f10;
            this.f12480Q = f10;
        } else {
            float f11 = r1.top + this.f12485V + 0.5f;
            this.f12491d = f11;
            this.f12479P = f11;
        }
    }

    /* renamed from: c */
    public final void m12340c(Canvas canvas) {
        if (this.f12510v > 0) {
            this.f12494f.setStyle(Paint.Style.STROKE);
            this.f12494f.setColor(this.f12511w);
            this.f12494f.setStrokeWidth(this.f12510v);
            canvas.drawRect(this.f12489c, this.f12494f);
        }
    }

    /* renamed from: d */
    public final void m12341d(Canvas canvas) {
        if (this.f12485V > 0.0f) {
            this.f12494f.setStyle(Paint.Style.STROKE);
            this.f12494f.setColor(this.f12497i);
            this.f12494f.setStrokeWidth(this.f12499k);
            Rect rect = this.f12489c;
            int i10 = rect.left;
            float f10 = this.f12485V;
            int i11 = rect.top;
            canvas.drawLine(i10 - f10, i11, (i10 - f10) + this.f12498j, i11, this.f12494f);
            Rect rect2 = this.f12489c;
            int i12 = rect2.left;
            int i13 = rect2.top;
            float f11 = this.f12485V;
            canvas.drawLine(i12, i13 - f11, i12, (i13 - f11) + this.f12498j, this.f12494f);
            Rect rect3 = this.f12489c;
            int i14 = rect3.right;
            float f12 = this.f12485V;
            int i15 = rect3.top;
            canvas.drawLine(i14 + f12, i15, (i14 + f12) - this.f12498j, i15, this.f12494f);
            Rect rect4 = this.f12489c;
            int i16 = rect4.right;
            int i17 = rect4.top;
            float f13 = this.f12485V;
            canvas.drawLine(i16, i17 - f13, i16, (i17 - f13) + this.f12498j, this.f12494f);
            Rect rect5 = this.f12489c;
            int i18 = rect5.left;
            float f14 = this.f12485V;
            int i19 = rect5.bottom;
            canvas.drawLine(i18 - f14, i19, (i18 - f14) + this.f12498j, i19, this.f12494f);
            Rect rect6 = this.f12489c;
            int i20 = rect6.left;
            int i21 = rect6.bottom;
            float f15 = this.f12485V;
            canvas.drawLine(i20, i21 + f15, i20, (i21 + f15) - this.f12498j, this.f12494f);
            Rect rect7 = this.f12489c;
            int i22 = rect7.right;
            float f16 = this.f12485V;
            int i23 = rect7.bottom;
            canvas.drawLine(i22 + f16, i23, (i22 + f16) - this.f12498j, i23, this.f12494f);
            Rect rect8 = this.f12489c;
            int i24 = rect8.right;
            int i25 = rect8.bottom;
            float f17 = this.f12485V;
            canvas.drawLine(i24, i25 + f17, i24, (i25 + f17) - this.f12498j, this.f12494f);
        }
    }

    /* renamed from: e */
    public final void m12342e(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.f12496h != 0) {
            this.f12494f.setStyle(Paint.Style.FILL);
            this.f12494f.setColor(this.f12496h);
            float f10 = width;
            canvas.drawRect(0.0f, 0.0f, f10, this.f12489c.top, this.f12494f);
            Rect rect = this.f12489c;
            canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f12494f);
            Rect rect2 = this.f12489c;
            canvas.drawRect(rect2.right + 1, rect2.top, f10, rect2.bottom + 1, this.f12494f);
            canvas.drawRect(0.0f, this.f12489c.bottom + 1, f10, height, this.f12494f);
        }
    }

    /* renamed from: f */
    public final void m12343f(Canvas canvas) {
        if (this.f12464A) {
            if (this.f12478O != null) {
                float f10 = this.f12489c.left;
                float f11 = this.f12485V;
                int i10 = this.f12506r;
                RectF rectF = new RectF(f10 + f11 + 0.5f, r1.top + f11 + i10, this.f12480Q, (r1.bottom - f11) - i10);
                Rect rect = new Rect((int) (this.f12478O.getWidth() - rectF.width()), 0, this.f12478O.getWidth(), this.f12478O.getHeight());
                if (rect.left < 0) {
                    rect.left = 0;
                    rectF.left = rectF.right - rect.width();
                }
                canvas.drawBitmap(this.f12478O, rect, rectF, this.f12494f);
                return;
            }
            if (this.f12509u != null) {
                float f12 = this.f12493e;
                canvas.drawBitmap(this.f12509u, (Rect) null, new RectF(f12, this.f12489c.top + this.f12485V + this.f12506r, this.f12509u.getWidth() + f12, (this.f12489c.bottom - this.f12485V) - this.f12506r), this.f12494f);
                return;
            }
            this.f12494f.setStyle(Paint.Style.FILL);
            this.f12494f.setColor(this.f12505q);
            float f13 = this.f12493e;
            float f14 = this.f12489c.top;
            float f15 = this.f12485V;
            int i11 = this.f12506r;
            canvas.drawRect(f13, f14 + f15 + i11, this.f12504p + f13, (r0.bottom - f15) - i11, this.f12494f);
            return;
        }
        if (this.f12478O != null) {
            float f16 = this.f12489c.left;
            float f17 = this.f12485V;
            int i12 = this.f12506r;
            RectF rectF2 = new RectF(f16 + f17 + i12, r0.top + f17 + 0.5f, (r0.right - f17) - i12, this.f12479P);
            Rect rect2 = new Rect(0, (int) (this.f12478O.getHeight() - rectF2.height()), this.f12478O.getWidth(), this.f12478O.getHeight());
            if (rect2.top < 0) {
                rect2.top = 0;
                rectF2.top = rectF2.bottom - rect2.height();
            }
            canvas.drawBitmap(this.f12478O, rect2, rectF2, this.f12494f);
            return;
        }
        if (this.f12509u != null) {
            float f18 = this.f12489c.left;
            float f19 = this.f12485V;
            int i13 = this.f12506r;
            float f20 = this.f12491d;
            canvas.drawBitmap(this.f12509u, (Rect) null, new RectF(f18 + f19 + i13, f20, (r0.right - f19) - i13, this.f12509u.getHeight() + f20), this.f12494f);
            return;
        }
        this.f12494f.setStyle(Paint.Style.FILL);
        this.f12494f.setColor(this.f12505q);
        float f21 = this.f12489c.left;
        float f22 = this.f12485V;
        int i14 = this.f12506r;
        float f23 = this.f12491d;
        canvas.drawRect(f21 + f22 + i14, f23, (r15.right - f22) - i14, f23 + this.f12504p, this.f12494f);
    }

    /* renamed from: g */
    public final void m12344g(Canvas canvas) {
        if (TextUtils.isEmpty(this.f12467D) || this.f12486W == null) {
            return;
        }
        if (this.f12470G) {
            if (this.f12474K) {
                this.f12494f.setColor(this.f12473J);
                this.f12494f.setStyle(Paint.Style.FILL);
                if (this.f12472I) {
                    Rect rect = new Rect();
                    TextPaint textPaint = this.f12495g;
                    String str = this.f12467D;
                    textPaint.getTextBounds(str, 0, str.length(), rect);
                    float width = ((canvas.getWidth() - rect.width()) / 2) - this.f12490c0;
                    RectF rectF = new RectF(width, (this.f12489c.bottom + this.f12471H) - this.f12490c0, rect.width() + width + (this.f12490c0 * 2), this.f12489c.bottom + this.f12471H + this.f12486W.getHeight() + this.f12490c0);
                    int i10 = this.f12490c0;
                    canvas.drawRoundRect(rectF, i10, i10, this.f12494f);
                } else {
                    Rect rect2 = this.f12489c;
                    float f10 = rect2.left;
                    int i11 = rect2.bottom;
                    int i12 = this.f12471H;
                    RectF rectF2 = new RectF(f10, (i11 + i12) - this.f12490c0, rect2.right, i11 + i12 + this.f12486W.getHeight() + this.f12490c0);
                    int i13 = this.f12490c0;
                    canvas.drawRoundRect(rectF2, i13, i13, this.f12494f);
                }
            }
            canvas.save();
            if (this.f12472I) {
                canvas.translate(0.0f, this.f12489c.bottom + this.f12471H);
            } else {
                Rect rect3 = this.f12489c;
                canvas.translate(rect3.left + this.f12490c0, rect3.bottom + this.f12471H);
            }
            this.f12486W.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.f12474K) {
            this.f12494f.setColor(this.f12473J);
            this.f12494f.setStyle(Paint.Style.FILL);
            if (this.f12472I) {
                Rect rect4 = new Rect();
                TextPaint textPaint2 = this.f12495g;
                String str2 = this.f12467D;
                textPaint2.getTextBounds(str2, 0, str2.length(), rect4);
                float width2 = ((canvas.getWidth() - rect4.width()) / 2) - this.f12490c0;
                int i14 = this.f12490c0;
                RectF rectF3 = new RectF(width2, ((this.f12489c.top - this.f12471H) - this.f12486W.getHeight()) - this.f12490c0, rect4.width() + width2 + (i14 * 2), (this.f12489c.top - this.f12471H) + i14);
                int i15 = this.f12490c0;
                canvas.drawRoundRect(rectF3, i15, i15, this.f12494f);
            } else {
                Rect rect5 = this.f12489c;
                float f11 = rect5.left;
                int height = (rect5.top - this.f12471H) - this.f12486W.getHeight();
                int i16 = this.f12490c0;
                Rect rect6 = this.f12489c;
                RectF rectF4 = new RectF(f11, height - i16, rect6.right, (rect6.top - this.f12471H) + i16);
                int i17 = this.f12490c0;
                canvas.drawRoundRect(rectF4, i17, i17, this.f12494f);
            }
        }
        canvas.save();
        if (this.f12472I) {
            canvas.translate(0.0f, (this.f12489c.top - this.f12471H) - this.f12486W.getHeight());
        } else {
            Rect rect7 = this.f12489c;
            canvas.translate(rect7.left + this.f12490c0, (rect7.top - this.f12471H) - this.f12486W.getHeight());
        }
        this.f12486W.draw(canvas);
        canvas.restore();
    }

    public boolean getIsBarcode() {
        return this.f12464A;
    }

    /* renamed from: h */
    public final void m12345h(int i10, TypedArray typedArray) {
        if (i10 == R$styleable.QRCodeView_asv_topOffset) {
            this.f12503o = typedArray.getDimensionPixelSize(i10, this.f12503o);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_cornerSize) {
            this.f12499k = typedArray.getDimensionPixelSize(i10, this.f12499k);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_cornerLength) {
            this.f12498j = typedArray.getDimensionPixelSize(i10, this.f12498j);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_scanLineSize) {
            this.f12504p = typedArray.getDimensionPixelSize(i10, this.f12504p);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_rectWidth) {
            this.f12500l = typedArray.getDimensionPixelSize(i10, this.f12500l);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_rectHeight) {
            this.f12501m = typedArray.getDimensionPixelSize(i10, this.f12501m);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_maskColor) {
            this.f12496h = typedArray.getColor(i10, this.f12496h);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_cornerColor) {
            this.f12497i = typedArray.getColor(i10, this.f12497i);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_scanLineColor) {
            this.f12505q = typedArray.getColor(i10, this.f12505q);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_scanLineMargin) {
            this.f12506r = typedArray.getDimensionPixelSize(i10, this.f12506r);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_isShowDefaultScanLineDrawable) {
            this.f12507s = typedArray.getBoolean(i10, this.f12507s);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_customScanLineDrawable) {
            this.f12508t = typedArray.getDrawable(i10);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_borderSize) {
            this.f12510v = typedArray.getDimensionPixelSize(i10, this.f12510v);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_borderColor) {
            this.f12511w = typedArray.getColor(i10, this.f12511w);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_animTime) {
            this.f12512x = typedArray.getInteger(i10, this.f12512x);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_isCenterVertical) {
            this.f12513y = typedArray.getBoolean(i10, this.f12513y);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_toolbarHeight) {
            this.f12514z = typedArray.getDimensionPixelSize(i10, this.f12514z);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_barcodeRectHeight) {
            this.f12502n = typedArray.getDimensionPixelSize(i10, this.f12502n);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_isBarcode) {
            this.f12464A = typedArray.getBoolean(i10, this.f12464A);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_barCodeTipText) {
            this.f12466C = typedArray.getString(i10);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_qrCodeTipText) {
            this.f12465B = typedArray.getString(i10);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_tipTextSize) {
            this.f12468E = typedArray.getDimensionPixelSize(i10, this.f12468E);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_tipTextColor) {
            this.f12469F = typedArray.getColor(i10, this.f12469F);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_isTipTextBelowRect) {
            this.f12470G = typedArray.getBoolean(i10, this.f12470G);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_tipTextMargin) {
            this.f12471H = typedArray.getDimensionPixelSize(i10, this.f12471H);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_isShowTipTextAsSingleLine) {
            this.f12472I = typedArray.getBoolean(i10, this.f12472I);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_isShowTipBackground) {
            this.f12474K = typedArray.getBoolean(i10, this.f12474K);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_tipBackgroundColor) {
            this.f12473J = typedArray.getColor(i10, this.f12473J);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_isScanLineReverse) {
            this.f12475L = typedArray.getBoolean(i10, this.f12475L);
            return;
        }
        if (i10 == R$styleable.QRCodeView_asv_isShowDefaultGridScanLineDrawable) {
            this.f12476M = typedArray.getBoolean(i10, this.f12476M);
        } else if (i10 == R$styleable.QRCodeView_asv_customGridScanLineDrawable) {
            this.f12477N = typedArray.getDrawable(i10);
        } else if (i10 == R$styleable.QRCodeView_asv_isOnlyDecodeScanBoxArea) {
            this.f12492d0 = typedArray.getBoolean(i10, this.f12492d0);
        }
    }

    /* renamed from: i */
    public void m12346i(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.QRCodeView);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            m12345h(typedArrayObtainStyledAttributes.getIndex(i10), typedArrayObtainStyledAttributes);
        }
        typedArrayObtainStyledAttributes.recycle();
        m12338a();
    }

    /* renamed from: j */
    public final void m12347j() {
        if (this.f12464A) {
            if (this.f12478O == null) {
                this.f12493e += this.f12487a;
                int width = this.f12504p;
                Bitmap bitmap = this.f12509u;
                if (bitmap != null) {
                    width = bitmap.getWidth();
                }
                if (this.f12475L) {
                    float f10 = this.f12493e;
                    float f11 = width + f10;
                    float f12 = this.f12489c.right;
                    float f13 = this.f12485V;
                    if (f11 > f12 - f13 || f10 < r2.left + f13) {
                        this.f12487a = -this.f12487a;
                    }
                } else {
                    float f14 = this.f12493e + width;
                    float f15 = this.f12489c.right;
                    float f16 = this.f12485V;
                    if (f14 > f15 - f16) {
                        this.f12493e = r0.left + f16 + 0.5f;
                    }
                }
            } else {
                float f17 = this.f12480Q + this.f12487a;
                this.f12480Q = f17;
                float f18 = this.f12489c.right;
                float f19 = this.f12485V;
                if (f17 > f18 - f19) {
                    this.f12480Q = r2.left + f19 + 0.5f;
                }
            }
        } else if (this.f12478O == null) {
            this.f12491d += this.f12487a;
            int height = this.f12504p;
            Bitmap bitmap2 = this.f12509u;
            if (bitmap2 != null) {
                height = bitmap2.getHeight();
            }
            if (this.f12475L) {
                float f20 = this.f12491d;
                float f21 = height + f20;
                float f22 = this.f12489c.bottom;
                float f23 = this.f12485V;
                if (f21 > f22 - f23 || f20 < r2.top + f23) {
                    this.f12487a = -this.f12487a;
                }
            } else {
                float f24 = this.f12491d + height;
                float f25 = this.f12489c.bottom;
                float f26 = this.f12485V;
                if (f24 > f25 - f26) {
                    this.f12491d = r0.top + f26 + 0.5f;
                }
            }
        } else {
            float f27 = this.f12479P + this.f12487a;
            this.f12479P = f27;
            float f28 = this.f12489c.bottom;
            float f29 = this.f12485V;
            if (f27 > f28 - f29) {
                this.f12479P = r2.top + f29 + 0.5f;
            }
        }
        long j10 = this.f12488b;
        Rect rect = this.f12489c;
        postInvalidateDelayed(j10, rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f12489c == null) {
            return;
        }
        m12342e(canvas);
        m12340c(canvas);
        m12341d(canvas);
        m12343f(canvas);
        m12344g(canvas);
        m12347j();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m12339b();
    }

    public void setIsBarcode(boolean z9) {
        this.f12464A = z9;
        if (this.f12477N != null || this.f12476M) {
            if (z9) {
                this.f12478O = this.f12484U;
            } else {
                this.f12478O = this.f12483T;
            }
        } else if (this.f12508t != null || this.f12507s) {
            if (z9) {
                this.f12509u = this.f12482S;
            } else {
                this.f12509u = this.f12481R;
            }
        }
        if (z9) {
            this.f12467D = this.f12466C;
            this.f12501m = this.f12502n;
            this.f12488b = (int) (((this.f12512x * 1.0f) * this.f12487a) / this.f12500l);
        } else {
            this.f12467D = this.f12465B;
            this.f12488b = (int) (((this.f12512x * 1.0f) * this.f12487a) / this.f12501m);
        }
        if (!TextUtils.isEmpty(this.f12467D)) {
            if (this.f12472I) {
                this.f12486W = new StaticLayout(this.f12467D, this.f12495g, AbstractC7526a.m12293c(getContext()).x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            } else {
                this.f12486W = new StaticLayout(this.f12467D, this.f12495g, this.f12500l - (this.f12490c0 * 2), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
            }
        }
        if (this.f12513y) {
            int i10 = AbstractC7526a.m12293c(getContext()).y;
            int i11 = this.f12514z;
            if (i11 == 0) {
                this.f12503o = (i10 - this.f12501m) / 2;
            } else {
                this.f12503o = ((i10 - this.f12501m) / 2) + (i11 / 2);
            }
        }
        m12339b();
        postInvalidate();
    }
}
