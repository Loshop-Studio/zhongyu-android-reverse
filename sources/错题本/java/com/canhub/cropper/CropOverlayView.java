package com.canhub.cropper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.canhub.cropper.CropImageView;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.AbstractC0000a;

@Metadata(m5109d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0003U\bVB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0015¢\u0006\u0004\b*\u0010\u0018J\u0015\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u001d¢\u0006\u0004\b,\u0010 J\u0015\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u001d¢\u0006\u0004\b.\u0010 J\u0015\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102R(\u0010&\u001a\u0004\u0018\u00010%2\b\u00103\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u00103\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R(\u0010@\u001a\u0004\u0018\u00010\u00112\b\u00103\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u0010G\u001a\u00020A2\u0006\u0010B\u001a\u00020A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u00020!2\u0006\u0010H\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010$R$\u0010L\u001a\u00020!2\u0006\u0010L\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010J\"\u0004\bN\u0010$R(\u0010T\u001a\u0004\u0018\u00010O2\b\u0010B\u001a\u0004\u0018\u00010O8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006W"}, m5110d2 = {"Lcom/canhub/cropper/CropOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/canhub/cropper/a0;", "listener", "Ld6/s;", "setCropWindowChangeListener", "(Lcom/canhub/cropper/a0;)V", "Lcom/canhub/cropper/CropImageView$CropShape;", "cropShape", "setCropShape", "(Lcom/canhub/cropper/CropImageView$CropShape;)V", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "cropCornerShape", "setCropCornerShape", "(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V", "", "isEnabled", "setCropperTextLabelVisibility", "(Z)V", "", "textLabel", "setCropLabelText", "(Ljava/lang/String;)V", "", "textSize", "setCropLabelTextSize", "(F)V", "", "textColor", "setCropLabelTextColor", "(I)V", "Lcom/canhub/cropper/CropImageView$Guidelines;", "guidelines", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$Guidelines;)V", "fixAspectRatio", "setFixedAspectRatio", "snapRadius", "setSnapRadius", "cornerRadius", "setCropCornerRadius", "Lcom/canhub/cropper/CropImageOptions;", "options", "setInitialAttributeValues", "(Lcom/canhub/cropper/CropImageOptions;)V", "value", "D", "Lcom/canhub/cropper/CropImageView$Guidelines;", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$Guidelines;", ExifInterface.LONGITUDE_EAST, "Lcom/canhub/cropper/CropImageView$CropShape;", "getCropShape", "()Lcom/canhub/cropper/CropImageView$CropShape;", "F", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$CropCornerShape;", "cornerShape", "Landroid/graphics/RectF;", "rect", "getCropWindowRect", "()Landroid/graphics/RectF;", "setCropWindowRect", "(Landroid/graphics/RectF;)V", "cropWindowRect", "aspectRatioX", "getAspectRatioX", "()I", "setAspectRatioX", "aspectRatioY", "getAspectRatioY", "setAspectRatioY", "Landroid/graphics/Rect;", "getInitialCropWindowRect", "()Landroid/graphics/Rect;", "setInitialCropWindowRect", "(Landroid/graphics/Rect;)V", "initialCropWindowRect", "a/a", "com/canhub/cropper/b0", "cropper_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCropOverlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropOverlayView.kt\ncom/canhub/cropper/CropOverlayView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1304:1\n1#2:1305\n*E\n"})
/* loaded from: classes2.dex */
public final class CropOverlayView extends View {

    /* renamed from: A */
    public int f2492A;

    /* renamed from: B */
    public int f2493B;

    /* renamed from: C */
    public float f2494C;

    /* renamed from: D, reason: from kotlin metadata */
    public CropImageView.Guidelines guidelines;

    /* renamed from: E, reason: from kotlin metadata */
    public CropImageView.CropShape cropShape;

    /* renamed from: F, reason: from kotlin metadata */
    public CropImageView.CropCornerShape cornerShape;

    /* renamed from: G */
    public boolean f2498G;

    /* renamed from: H */
    public String f2499H;

    /* renamed from: I */
    public float f2500I;

    /* renamed from: J */
    public int f2501J;

    /* renamed from: K */
    public final Rect f2502K;

    /* renamed from: L */
    public boolean f2503L;

    /* renamed from: M */
    public final float f2504M;

    /* renamed from: a */
    public float f2505a;

    /* renamed from: b */
    public Integer f2506b;

    /* renamed from: c */
    public CropImageOptions f2507c;

    /* renamed from: d */
    public ScaleGestureDetector f2508d;

    /* renamed from: e */
    public boolean f2509e;

    /* renamed from: f */
    public boolean f2510f;

    /* renamed from: g */
    public final C3432e0 f2511g;

    /* renamed from: h */
    public InterfaceC3424a0 f2512h;

    /* renamed from: i */
    public final RectF f2513i;

    /* renamed from: j */
    public Paint f2514j;

    /* renamed from: k */
    public Paint f2515k;

    /* renamed from: l */
    public Paint f2516l;

    /* renamed from: m */
    public Paint f2517m;

    /* renamed from: n */
    public Paint f2518n;

    /* renamed from: o */
    public final Path f2519o;

    /* renamed from: p */
    public final float[] f2520p;

    /* renamed from: q */
    public final RectF f2521q;

    /* renamed from: r */
    public int f2522r;

    /* renamed from: s */
    public int f2523s;

    /* renamed from: t */
    public float f2524t;

    /* renamed from: u */
    public float f2525u;

    /* renamed from: v */
    public float f2526v;

    /* renamed from: w */
    public float f2527w;

    /* renamed from: x */
    public float f2528x;

    /* renamed from: y */
    public C3436g0 f2529y;

    /* renamed from: z */
    public boolean f2530z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CropOverlayView(@NotNull Context context) {
        this(context, null);
        AbstractC5830k.m5330g(context, "context");
    }

    /* renamed from: a */
    public final boolean m2446a(RectF rectF) {
        float f;
        float f7;
        Rect rect = AbstractC3437h.f2603a;
        float[] fArr = this.f2520p;
        float fM2486q = AbstractC3437h.m2486q(fArr);
        float fM2488s = AbstractC3437h.m2488s(fArr);
        float fM2487r = AbstractC3437h.m2487r(fArr);
        float fM2481l = AbstractC3437h.m2481l(fArr);
        float f8 = fArr[0];
        float f9 = fArr[6];
        RectF rectF2 = this.f2521q;
        if (f8 == f9 || fArr[1] == fArr[7]) {
            rectF2.set(fM2486q, fM2488s, fM2487r, fM2481l);
            return false;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[7];
        if (f15 < f11) {
            f7 = fArr[3];
            if (f11 < f7) {
                float f16 = fArr[2];
                f = f14;
                f11 = f13;
                f14 = f16;
                f13 = f15;
                f10 = f12;
            } else {
                f7 = f11;
                f11 = f7;
                f14 = f10;
                f10 = fArr[2];
                f = f12;
            }
        } else {
            float f17 = fArr[3];
            if (f11 > f17) {
                f = fArr[2];
                f13 = f17;
                f7 = f15;
            } else {
                f = f10;
                f10 = f14;
                f14 = f12;
                f7 = f13;
                f13 = f11;
                f11 = f15;
            }
        }
        float f18 = (f11 - f13) / (f10 - f);
        float f19 = (-1.0f) / f18;
        float f20 = f13 - (f18 * f);
        float f21 = f13 - (f * f19);
        float f22 = f7 - (f18 * f14);
        float f23 = f7 - (f14 * f19);
        float fCenterY = rectF.centerY() - rectF.top;
        float fCenterX = rectF.centerX();
        float f24 = rectF.left;
        float f25 = fCenterY / (fCenterX - f24);
        float f26 = -f25;
        float f27 = rectF.top;
        float f28 = f27 - (f24 * f25);
        float f29 = rectF.right;
        float f30 = f27 - (f26 * f29);
        float f31 = f18 - f25;
        float f32 = (f28 - f20) / f31;
        float fMax = Math.max(fM2486q, f32 < f29 ? f32 : fM2486q);
        float f33 = (f28 - f21) / (f19 - f25);
        if (f33 >= rectF.right) {
            f33 = fMax;
        }
        float fMax2 = Math.max(fMax, f33);
        float f34 = f19 - f26;
        float f35 = (f30 - f23) / f34;
        if (f35 >= rectF.right) {
            f35 = fMax2;
        }
        float fMax3 = Math.max(fMax2, f35);
        float f36 = (f30 - f21) / f34;
        if (f36 <= rectF.left) {
            f36 = fM2487r;
        }
        float fMin = Math.min(fM2487r, f36);
        float f37 = (f30 - f22) / (f18 - f26);
        float fMin2 = Math.min(fMin, f37 > rectF.left ? f37 : fMin);
        float f38 = (f28 - f22) / f31;
        if (f38 <= rectF.left) {
            f38 = fMin2;
        }
        float fMin3 = Math.min(fMin2, f38);
        float fMax4 = Math.max(fM2488s, Math.max((f18 * fMax3) + f20, (f19 * fMin3) + f21));
        float fMin4 = Math.min(fM2481l, Math.min((f19 * fMax3) + f23, (f18 * fMin3) + f22));
        rectF2.left = fMax3;
        rectF2.top = fMax4;
        rectF2.right = fMin3;
        rectF2.bottom = fMin4;
        return true;
    }

    /* renamed from: b */
    public final void m2447b(Canvas canvas, float f, float f7, RectF rectF) {
        CropImageView.CropShape cropShape = this.cropShape;
        int i = cropShape == null ? -1 : AbstractC3428c0.f2566a[cropShape.ordinal()];
        if (i == 1) {
            float f8 = this.f2505a;
            CropImageView.CropCornerShape cropCornerShape = this.cornerShape;
            int i8 = cropCornerShape == null ? -1 : AbstractC3428c0.f2567b[cropCornerShape.ordinal()];
            if (i8 != -1) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m2449d(canvas, f, f7, rectF);
                    return;
                }
                float f9 = rectF.left - f;
                float f10 = rectF.top - f;
                Paint paint = this.f2515k;
                AbstractC5830k.m5327d(paint);
                canvas.drawCircle(f9, f10, f8, paint);
                float f11 = rectF.right + f;
                float f12 = rectF.top - f;
                Paint paint2 = this.f2515k;
                AbstractC5830k.m5327d(paint2);
                canvas.drawCircle(f11, f12, f8, paint2);
                float f13 = rectF.left - f;
                float f14 = rectF.bottom + f;
                Paint paint3 = this.f2515k;
                AbstractC5830k.m5327d(paint3);
                canvas.drawCircle(f13, f14, f8, paint3);
                float f15 = rectF.right + f;
                float f16 = rectF.bottom + f;
                Paint paint4 = this.f2515k;
                AbstractC5830k.m5327d(paint4);
                canvas.drawCircle(f15, f16, f8, paint4);
                return;
            }
            return;
        }
        if (i == 2) {
            float fCenterX = rectF.centerX() - this.f2525u;
            float f17 = rectF.top - f;
            float fCenterX2 = this.f2525u + rectF.centerX();
            float f18 = rectF.top - f;
            Paint paint5 = this.f2515k;
            AbstractC5830k.m5327d(paint5);
            canvas.drawLine(fCenterX, f17, fCenterX2, f18, paint5);
            float fCenterX3 = rectF.centerX() - this.f2525u;
            float f19 = rectF.bottom + f;
            float fCenterX4 = this.f2525u + rectF.centerX();
            float f20 = rectF.bottom + f;
            Paint paint6 = this.f2515k;
            AbstractC5830k.m5327d(paint6);
            canvas.drawLine(fCenterX3, f19, fCenterX4, f20, paint6);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            m2449d(canvas, f, f7, rectF);
            return;
        }
        float f21 = rectF.left - f;
        float fCenterY = rectF.centerY() - this.f2525u;
        float f22 = rectF.left - f;
        float fCenterY2 = this.f2525u + rectF.centerY();
        Paint paint7 = this.f2515k;
        AbstractC5830k.m5327d(paint7);
        canvas.drawLine(f21, fCenterY, f22, fCenterY2, paint7);
        float f23 = rectF.right + f;
        float fCenterY3 = rectF.centerY() - this.f2525u;
        float f24 = rectF.right + f;
        float fCenterY4 = this.f2525u + rectF.centerY();
        Paint paint8 = this.f2515k;
        AbstractC5830k.m5327d(paint8);
        canvas.drawLine(f23, fCenterY3, f24, fCenterY4, paint8);
    }

    /* renamed from: c */
    public final void m2448c(Canvas canvas) {
        if (this.f2516l != null) {
            Paint paint = this.f2514j;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF rectFM2462g = this.f2511g.m2462g();
            rectFM2462g.inset(strokeWidth, strokeWidth);
            float f = 3;
            float fWidth = rectFM2462g.width() / f;
            float fHeight = rectFM2462g.height() / f;
            CropImageView.CropShape cropShape = this.cropShape;
            int i = cropShape == null ? -1 : AbstractC3428c0.f2566a[cropShape.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                float f7 = rectFM2462g.left + fWidth;
                float f8 = rectFM2462g.right - fWidth;
                float f9 = rectFM2462g.top;
                float f10 = rectFM2462g.bottom;
                Paint paint2 = this.f2516l;
                AbstractC5830k.m5327d(paint2);
                canvas.drawLine(f7, f9, f7, f10, paint2);
                float f11 = rectFM2462g.top;
                float f12 = rectFM2462g.bottom;
                Paint paint3 = this.f2516l;
                AbstractC5830k.m5327d(paint3);
                canvas.drawLine(f8, f11, f8, f12, paint3);
                float f13 = rectFM2462g.top + fHeight;
                float f14 = rectFM2462g.bottom - fHeight;
                float f15 = rectFM2462g.left;
                float f16 = rectFM2462g.right;
                Paint paint4 = this.f2516l;
                AbstractC5830k.m5327d(paint4);
                canvas.drawLine(f15, f13, f16, f13, paint4);
                float f17 = rectFM2462g.left;
                float f18 = rectFM2462g.right;
                Paint paint5 = this.f2516l;
                AbstractC5830k.m5327d(paint5);
                canvas.drawLine(f17, f14, f18, f14, paint5);
                return;
            }
            if (i != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            float f19 = 2;
            float fWidth2 = (rectFM2462g.width() / f19) - strokeWidth;
            float fHeight2 = (rectFM2462g.height() / f19) - strokeWidth;
            float f20 = rectFM2462g.left + fWidth;
            float f21 = rectFM2462g.right - fWidth;
            float fSin = (float) (Math.sin(Math.acos((fWidth2 - fWidth) / fWidth2)) * fHeight2);
            float f22 = (rectFM2462g.top + fHeight2) - fSin;
            float f23 = (rectFM2462g.bottom - fHeight2) + fSin;
            Paint paint6 = this.f2516l;
            AbstractC5830k.m5327d(paint6);
            canvas.drawLine(f20, f22, f20, f23, paint6);
            float f24 = (rectFM2462g.top + fHeight2) - fSin;
            float f25 = (rectFM2462g.bottom - fHeight2) + fSin;
            Paint paint7 = this.f2516l;
            AbstractC5830k.m5327d(paint7);
            canvas.drawLine(f21, f24, f21, f25, paint7);
            float f26 = rectFM2462g.top + fHeight;
            float f27 = rectFM2462g.bottom - fHeight;
            float fCos = (float) (Math.cos(Math.asin((fHeight2 - fHeight) / fHeight2)) * fWidth2);
            float f28 = (rectFM2462g.left + fWidth2) - fCos;
            float f29 = (rectFM2462g.right - fWidth2) + fCos;
            Paint paint8 = this.f2516l;
            AbstractC5830k.m5327d(paint8);
            canvas.drawLine(f28, f26, f29, f26, paint8);
            float f30 = (rectFM2462g.left + fWidth2) - fCos;
            float f31 = (rectFM2462g.right - fWidth2) + fCos;
            Paint paint9 = this.f2516l;
            AbstractC5830k.m5327d(paint9);
            canvas.drawLine(f30, f27, f31, f27, paint9);
        }
    }

    /* renamed from: d */
    public final void m2449d(Canvas canvas, float f, float f7, RectF rectF) {
        float f8 = rectF.left - f;
        float f9 = rectF.top;
        float f10 = f9 + this.f2525u;
        Paint paint = this.f2515k;
        AbstractC5830k.m5327d(paint);
        canvas.drawLine(f8, f9 - f7, f8, f10, paint);
        float f11 = rectF.left;
        float f12 = rectF.top - f;
        float f13 = f11 + this.f2525u;
        Paint paint2 = this.f2515k;
        AbstractC5830k.m5327d(paint2);
        canvas.drawLine(f11 - f7, f12, f13, f12, paint2);
        float f14 = rectF.right + f;
        float f15 = rectF.top;
        float f16 = f15 + this.f2525u;
        Paint paint3 = this.f2515k;
        AbstractC5830k.m5327d(paint3);
        canvas.drawLine(f14, f15 - f7, f14, f16, paint3);
        float f17 = rectF.right;
        float f18 = rectF.top - f;
        float f19 = f17 - this.f2525u;
        Paint paint4 = this.f2515k;
        AbstractC5830k.m5327d(paint4);
        canvas.drawLine(f17 + f7, f18, f19, f18, paint4);
        float f20 = rectF.left - f;
        float f21 = rectF.bottom;
        float f22 = f21 - this.f2525u;
        Paint paint5 = this.f2515k;
        AbstractC5830k.m5327d(paint5);
        canvas.drawLine(f20, f21 + f7, f20, f22, paint5);
        float f23 = rectF.left;
        float f24 = rectF.bottom + f;
        float f25 = f23 + this.f2525u;
        Paint paint6 = this.f2515k;
        AbstractC5830k.m5327d(paint6);
        canvas.drawLine(f23 - f7, f24, f25, f24, paint6);
        float f26 = rectF.right + f;
        float f27 = rectF.bottom;
        float f28 = f27 - this.f2525u;
        Paint paint7 = this.f2515k;
        AbstractC5830k.m5327d(paint7);
        canvas.drawLine(f26, f27 + f7, f26, f28, paint7);
        float f29 = rectF.right;
        float f30 = rectF.bottom + f;
        float f31 = f29 - this.f2525u;
        Paint paint8 = this.f2515k;
        AbstractC5830k.m5327d(paint8);
        canvas.drawLine(f29 + f7, f30, f31, f30, paint8);
    }

    /* renamed from: e */
    public final void m2450e(RectF rectF) {
        float fWidth = rectF.width();
        C3432e0 c3432e0 = this.f2511g;
        if (fWidth < c3432e0.m2460e()) {
            float fM2460e = (c3432e0.m2460e() - rectF.width()) / 2;
            rectF.left -= fM2460e;
            rectF.right += fM2460e;
        }
        if (rectF.height() < c3432e0.m2459d()) {
            float fM2459d = (c3432e0.m2459d() - rectF.height()) / 2;
            rectF.top -= fM2459d;
            rectF.bottom += fM2459d;
        }
        if (rectF.width() > c3432e0.m2458c()) {
            float fWidth2 = (rectF.width() - c3432e0.m2458c()) / 2;
            rectF.left += fWidth2;
            rectF.right -= fWidth2;
        }
        if (rectF.height() > c3432e0.m2457b()) {
            float fHeight = (rectF.height() - c3432e0.m2457b()) / 2;
            rectF.top += fHeight;
            rectF.bottom -= fHeight;
        }
        m2446a(rectF);
        RectF rectF2 = this.f2521q;
        if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
            float fMax = Math.max(rectF2.left, 0.0f);
            float fMax2 = Math.max(rectF2.top, 0.0f);
            float fMin = Math.min(rectF2.right, getWidth());
            float fMin2 = Math.min(rectF2.bottom, getHeight());
            if (rectF.left < fMax) {
                rectF.left = fMax;
            }
            if (rectF.top < fMax2) {
                rectF.top = fMax2;
            }
            if (rectF.right > fMin) {
                rectF.right = fMin;
            }
            if (rectF.bottom > fMin2) {
                rectF.bottom = fMin2;
            }
        }
        if (!this.f2530z || Math.abs(rectF.width() - (rectF.height() * this.f2494C)) <= 0.1d) {
            return;
        }
        if (rectF.width() > rectF.height() * this.f2494C) {
            float fAbs = Math.abs((rectF.height() * this.f2494C) - rectF.width()) / 2;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        } else {
            float fAbs2 = Math.abs((rectF.width() / this.f2494C) - rectF.height()) / 2;
            rectF.top += fAbs2;
            rectF.bottom -= fAbs2;
        }
    }

    /* renamed from: f */
    public final void m2451f() {
        Rect rect = AbstractC3437h.f2603a;
        float[] fArr = this.f2520p;
        float fMax = Math.max(AbstractC3437h.m2486q(fArr), 0.0f);
        float fMax2 = Math.max(AbstractC3437h.m2488s(fArr), 0.0f);
        float fMin = Math.min(AbstractC3437h.m2487r(fArr), getWidth());
        float fMin2 = Math.min(AbstractC3437h.m2481l(fArr), getHeight());
        if (fMin <= fMax || fMin2 <= fMax2) {
            return;
        }
        RectF rectF = new RectF();
        this.f2503L = true;
        float f = this.f2526v;
        float f7 = fMin - fMax;
        float f8 = f * f7;
        float f9 = fMin2 - fMax2;
        float f10 = f * f9;
        Rect rect2 = this.f2502K;
        int iWidth = rect2.width();
        C3432e0 c3432e0 = this.f2511g;
        if (iWidth > 0 && rect2.height() > 0) {
            float f11 = (rect2.left / c3432e0.f2589k) + fMax;
            rectF.left = f11;
            rectF.top = (rect2.top / c3432e0.f2590l) + fMax2;
            rectF.right = (rect2.width() / c3432e0.f2589k) + f11;
            rectF.bottom = (rect2.height() / c3432e0.f2590l) + rectF.top;
            rectF.left = Math.max(fMax, rectF.left);
            rectF.top = Math.max(fMax2, rectF.top);
            rectF.right = Math.min(fMin, rectF.right);
            rectF.bottom = Math.min(fMin2, rectF.bottom);
        } else if (!this.f2530z || fMin <= fMax || fMin2 <= fMax2) {
            rectF.left = fMax + f8;
            rectF.top = fMax2 + f10;
            rectF.right = fMin - f8;
            rectF.bottom = fMin2 - f10;
        } else if (f7 / f9 > this.f2494C) {
            rectF.top = fMax2 + f10;
            rectF.bottom = fMin2 - f10;
            float width = getWidth() / 2.0f;
            this.f2494C = this.f2492A / this.f2493B;
            float fMax3 = Math.max(c3432e0.m2460e(), rectF.height() * this.f2494C) / 2.0f;
            rectF.left = width - fMax3;
            rectF.right = width + fMax3;
        } else {
            rectF.left = fMax + f8;
            rectF.right = fMin - f8;
            float height = getHeight() / 2.0f;
            float fMax4 = Math.max(c3432e0.m2459d(), rectF.width() / this.f2494C) / 2.0f;
            rectF.top = height - fMax4;
            rectF.bottom = height + fMax4;
        }
        m2450e(rectF);
        c3432e0.f2579a.set(rectF);
    }

    /* renamed from: g */
    public final void m2452g() {
        if (this.f2503L) {
            setCropWindowRect(AbstractC3437h.f2604b);
            m2451f();
            invalidate();
        }
    }

    /* renamed from: getAspectRatioX, reason: from getter */
    public final int getF2492A() {
        return this.f2492A;
    }

    /* renamed from: getAspectRatioY, reason: from getter */
    public final int getF2493B() {
        return this.f2493B;
    }

    @Nullable
    public final CropImageView.CropCornerShape getCornerShape() {
        return this.cornerShape;
    }

    @Nullable
    public final CropImageView.CropShape getCropShape() {
        return this.cropShape;
    }

    @NotNull
    public final RectF getCropWindowRect() {
        return this.f2511g.m2462g();
    }

    @Nullable
    public final CropImageView.Guidelines getGuidelines() {
        return this.guidelines;
    }

    @Nullable
    /* renamed from: getInitialCropWindowRect, reason: from getter */
    public final Rect getF2502K() {
        return this.f2502K;
    }

    /* renamed from: h */
    public final void m2453h(float[] fArr, int i, int i8) {
        float[] fArr2 = this.f2520p;
        if (fArr == null || !Arrays.equals(fArr2, fArr)) {
            if (fArr == null) {
                Arrays.fill(fArr2, 0.0f);
            } else {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            }
            this.f2522r = i;
            this.f2523s = i8;
            RectF rectFM2462g = this.f2511g.m2462g();
            if (rectFM2462g.width() == 0.0f || rectFM2462g.height() == 0.0f) {
                m2451f();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i8;
        Canvas canvas2;
        Paint paint;
        AbstractC5830k.m5330g(canvas, "canvas");
        super.onDraw(canvas);
        C3432e0 c3432e0 = this.f2511g;
        RectF rectFM2462g = c3432e0.m2462g();
        Rect rect = AbstractC3437h.f2603a;
        float[] fArr = this.f2520p;
        float fMax = Math.max(AbstractC3437h.m2486q(fArr), 0.0f);
        float fMax2 = Math.max(AbstractC3437h.m2488s(fArr), 0.0f);
        float fMin = Math.min(AbstractC3437h.m2487r(fArr), getWidth());
        float fMin2 = Math.min(AbstractC3437h.m2481l(fArr), getHeight());
        CropImageView.CropShape cropShape = this.cropShape;
        int i9 = cropShape == null ? -1 : AbstractC3428c0.f2566a[cropShape.ordinal()];
        Path path = this.f2519o;
        if (i9 == 1 || i9 == 2 || i9 == 3) {
            i = 3;
            i8 = 4;
            if (fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
                float f = rectFM2462g.top;
                Paint paint2 = this.f2517m;
                AbstractC5830k.m5327d(paint2);
                canvas2 = canvas;
                canvas2.drawRect(fMax, fMax2, fMin, f, paint2);
                float f7 = rectFM2462g.bottom;
                Paint paint3 = this.f2517m;
                AbstractC5830k.m5327d(paint3);
                canvas2.drawRect(fMax, f7, fMin, fMin2, paint3);
                float f8 = rectFM2462g.top;
                float f9 = rectFM2462g.left;
                float f10 = rectFM2462g.bottom;
                Paint paint4 = this.f2517m;
                AbstractC5830k.m5327d(paint4);
                canvas2.drawRect(fMax, f8, f9, f10, paint4);
                float f11 = rectFM2462g.right;
                float f12 = rectFM2462g.top;
                float f13 = rectFM2462g.bottom;
                Paint paint5 = this.f2517m;
                AbstractC5830k.m5327d(paint5);
                canvas2.drawRect(f11, f12, fMin, f13, paint5);
            } else {
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.close();
                canvas.save();
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipOutPath(path);
                } else {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                Paint paint6 = this.f2517m;
                AbstractC5830k.m5327d(paint6);
                canvas2 = canvas;
                canvas2.drawRect(fMax, fMax2, fMin, fMin2, paint6);
                canvas2.restore();
            }
        } else {
            if (i9 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            path.reset();
            float f14 = rectFM2462g.left;
            float f15 = rectFM2462g.top;
            i8 = 4;
            float f16 = rectFM2462g.right;
            float f17 = rectFM2462g.bottom;
            i = 3;
            RectF rectF = this.f2513i;
            rectF.set(f14, f15, f16, f17);
            path.addOval(rectF, Path.Direction.CW);
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(path);
            } else {
                canvas.clipPath(path, Region.Op.XOR);
            }
            Paint paint7 = this.f2517m;
            AbstractC5830k.m5327d(paint7);
            canvas.drawRect(fMax, fMax2, fMin, fMin2, paint7);
            canvas.restore();
            canvas2 = canvas;
        }
        RectF rectF2 = c3432e0.f2579a;
        if (rectF2.width() >= 100.0f && rectF2.height() >= 100.0f) {
            CropImageView.Guidelines guidelines = this.guidelines;
            if (guidelines == CropImageView.Guidelines.f2485ON) {
                m2448c(canvas);
            } else if (guidelines == CropImageView.Guidelines.ON_TOUCH && this.f2529y != null) {
                m2448c(canvas);
            }
        }
        CropImageOptions cropImageOptions = this.f2507c;
        this.f2515k = AbstractC0000a.m9j(cropImageOptions != null ? cropImageOptions.f2439y : 0.0f, cropImageOptions != null ? cropImageOptions.f2372B : -1);
        if (this.f2498G) {
            RectF rectFM2462g2 = c3432e0.m2462g();
            float f18 = (rectFM2462g2.left + rectFM2462g2.right) / 2;
            float f19 = rectFM2462g2.top - 50;
            Paint paint8 = this.f2518n;
            if (paint8 != null) {
                paint8.setTextSize(this.f2500I);
                paint8.setColor(this.f2501J);
            }
            String str = this.f2499H;
            Paint paint9 = this.f2518n;
            AbstractC5830k.m5327d(paint9);
            canvas2.drawText(str, f18, f19, paint9);
            canvas2.save();
        }
        Paint paint10 = this.f2514j;
        if (paint10 != null) {
            float strokeWidth = paint10.getStrokeWidth();
            RectF rectFM2462g3 = c3432e0.m2462g();
            float f20 = strokeWidth / 2;
            rectFM2462g3.inset(f20, f20);
            CropImageView.CropShape cropShape2 = this.cropShape;
            int i10 = cropShape2 == null ? -1 : AbstractC3428c0.f2566a[cropShape2.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == i) {
                Paint paint11 = this.f2514j;
                AbstractC5830k.m5327d(paint11);
                canvas2.drawRect(rectFM2462g3, paint11);
            } else {
                if (i10 != i8) {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
                Paint paint12 = this.f2514j;
                AbstractC5830k.m5327d(paint12);
                canvas2.drawOval(rectFM2462g3, paint12);
            }
        }
        if (this.f2515k != null) {
            Paint paint13 = this.f2514j;
            float strokeWidth2 = paint13 != null ? paint13.getStrokeWidth() : 0.0f;
            Paint paint14 = this.f2515k;
            AbstractC5830k.m5327d(paint14);
            float strokeWidth3 = paint14.getStrokeWidth();
            float f21 = 2;
            float f22 = (strokeWidth3 - strokeWidth2) / f21;
            float f23 = strokeWidth3 / f21;
            float f24 = f23 + f22;
            CropImageView.CropShape cropShape3 = this.cropShape;
            int i11 = cropShape3 == null ? -1 : AbstractC3428c0.f2566a[cropShape3.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                f23 += this.f2524t;
            } else if (i11 != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            RectF rectFM2462g4 = c3432e0.m2462g();
            rectFM2462g4.inset(f23, f23);
            m2447b(canvas2, f22, f24, rectFM2462g4);
            if (this.cornerShape == CropImageView.CropCornerShape.OVAL) {
                Integer num = this.f2506b;
                if (num != null) {
                    int iIntValue = num.intValue();
                    paint = new Paint();
                    paint.setColor(iIntValue);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAntiAlias(true);
                } else {
                    paint = null;
                }
                this.f2515k = paint;
                m2447b(canvas2, f22, f24, rectFM2462g4);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            RectF rectFM2462g5 = c3432e0.m2462g();
            List systemGestureExclusionRects = getSystemGestureExclusionRects();
            AbstractC5830k.m5329f(systemGestureExclusionRects, "getSystemGestureExclusionRects(...)");
            Rect rect2 = (Rect) (systemGestureExclusionRects.size() > 0 ? systemGestureExclusionRects.get(0) : new Rect());
            List systemGestureExclusionRects2 = getSystemGestureExclusionRects();
            AbstractC5830k.m5329f(systemGestureExclusionRects2, "getSystemGestureExclusionRects(...)");
            Rect rect3 = (Rect) (1 < systemGestureExclusionRects2.size() ? systemGestureExclusionRects2.get(1) : new Rect());
            List systemGestureExclusionRects3 = getSystemGestureExclusionRects();
            AbstractC5830k.m5329f(systemGestureExclusionRects3, "getSystemGestureExclusionRects(...)");
            Rect rect4 = (Rect) (2 < systemGestureExclusionRects3.size() ? systemGestureExclusionRects3.get(2) : new Rect());
            float f25 = rectFM2462g5.left;
            float f26 = this.f2527w;
            int i12 = (int) (f25 - f26);
            rect2.left = i12;
            int i13 = (int) (rectFM2462g5.right + f26);
            rect2.right = i13;
            float f27 = rectFM2462g5.top;
            int i14 = (int) (f27 - f26);
            rect2.top = i14;
            float f28 = this.f2504M;
            float f29 = 0.3f * f28;
            rect2.bottom = (int) (i14 + f29);
            rect3.left = i12;
            rect3.right = i13;
            float f30 = rectFM2462g5.bottom;
            int i15 = (int) (((f27 + f30) / 2.0f) - (0.2f * f28));
            rect3.top = i15;
            rect3.bottom = (int) ((f28 * 0.4f) + i15);
            rect4.left = rect2.left;
            rect4.right = rect2.right;
            int i16 = (int) (f30 + f26);
            rect4.bottom = i16;
            rect4.top = (int) (i16 - f29);
            setSystemGestureExclusionRects(AbstractC5806u.m5287z(rect2, rect3, rect4));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r2 != 3) goto L213;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f2492A != i) {
            this.f2492A = i;
            this.f2494C = i / this.f2493B;
            if (this.f2503L) {
                m2451f();
                invalidate();
            }
        }
    }

    public final void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.f2493B != i) {
            this.f2493B = i;
            this.f2494C = this.f2492A / i;
            if (this.f2503L) {
                m2451f();
                invalidate();
            }
        }
    }

    public final void setCropCornerRadius(float cornerRadius) {
        this.f2505a = cornerRadius;
    }

    public final void setCropCornerShape(@NotNull CropImageView.CropCornerShape cropCornerShape) {
        AbstractC5830k.m5330g(cropCornerShape, "cropCornerShape");
        if (this.cornerShape != cropCornerShape) {
            this.cornerShape = cropCornerShape;
            invalidate();
        }
    }

    public final void setCropLabelText(@Nullable String textLabel) {
        if (textLabel != null) {
            this.f2499H = textLabel;
        }
    }

    public final void setCropLabelTextColor(int textColor) {
        this.f2501J = textColor;
        invalidate();
    }

    public final void setCropLabelTextSize(float textSize) {
        this.f2500I = textSize;
        invalidate();
    }

    public final void setCropShape(@NotNull CropImageView.CropShape cropShape) {
        AbstractC5830k.m5330g(cropShape, "cropShape");
        if (this.cropShape != cropShape) {
            this.cropShape = cropShape;
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(@Nullable InterfaceC3424a0 listener) {
        this.f2512h = listener;
    }

    public final void setCropWindowRect(@NotNull RectF rect) {
        AbstractC5830k.m5330g(rect, "rect");
        this.f2511g.f2579a.set(rect);
    }

    public final void setCropperTextLabelVisibility(boolean isEnabled) {
        this.f2498G = isEnabled;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        if (this.f2530z != fixAspectRatio) {
            this.f2530z = fixAspectRatio;
            if (this.f2503L) {
                m2451f();
                invalidate();
            }
        }
    }

    public final void setGuidelines(@NotNull CropImageView.Guidelines guidelines) {
        AbstractC5830k.m5330g(guidelines, "guidelines");
        if (this.guidelines != guidelines) {
            this.guidelines = guidelines;
            if (this.f2503L) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(@NotNull CropImageOptions options) {
        InterfaceC3424a0 interfaceC3424a0;
        AbstractC5830k.m5330g(options, "options");
        float f = options.f2420m0;
        int i = options.f2422n0;
        int i8 = options.f2382L;
        int i9 = options.f2381K;
        int i10 = options.f2380J;
        int i11 = options.f2379I;
        int i12 = options.f2436v;
        int i13 = options.f2435u;
        boolean z8 = options.f2433t;
        boolean zM5325b = AbstractC5830k.m5325b(this.f2507c, options);
        CropImageOptions cropImageOptions = this.f2507c;
        boolean z9 = (cropImageOptions != null && z8 == cropImageOptions.f2433t && i13 == cropImageOptions.f2435u && i12 == cropImageOptions.f2436v) ? false : true;
        this.f2507c = options;
        float f7 = i11;
        C3432e0 c3432e0 = this.f2511g;
        c3432e0.f2585g = f7;
        float f8 = i10;
        c3432e0.f2586h = f8;
        float f9 = i9;
        c3432e0.f2587i = f9;
        float f10 = i8;
        c3432e0.f2588j = f10;
        if (zM5325b) {
            return;
        }
        c3432e0.f2581c = options.f2377G;
        c3432e0.f2582d = options.f2378H;
        c3432e0.f2585g = f7;
        c3432e0.f2586h = f8;
        c3432e0.f2587i = f9;
        c3432e0.f2588j = f10;
        this.f2501J = i;
        this.f2500I = f;
        String str = options.f2424o0;
        if (str == null) {
            str = "";
        }
        this.f2499H = str;
        this.f2498G = options.f2415k;
        this.f2505a = options.f2403e;
        this.cornerShape = options.f2401d;
        this.cropShape = options.f2399c;
        this.f2528x = options.f2405f;
        setEnabled(options.f2427q);
        this.guidelines = options.f2409h;
        this.f2530z = z8;
        setAspectRatioX(i13);
        setAspectRatioY(i12);
        boolean z10 = options.f2423o;
        this.f2509e = z10;
        if (z10 && this.f2508d == null) {
            this.f2508d = new ScaleGestureDetector(getContext(), new C3426b0(this));
        }
        this.f2510f = options.f2425p;
        this.f2527w = options.f2407g;
        this.f2526v = options.f2431s;
        this.f2514j = AbstractC0000a.m9j(options.f2437w, options.f2438x);
        this.f2524t = options.f2440z;
        this.f2525u = options.f2371A;
        this.f2506b = Integer.valueOf(options.f2373C);
        this.f2515k = AbstractC0000a.m9j(options.f2439y, options.f2372B);
        this.f2516l = AbstractC0000a.m9j(options.f2374D, options.f2375E);
        int i14 = options.f2376F;
        Paint paint = new Paint();
        paint.setColor(i14);
        this.f2517m = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(1.0f);
        paint2.setTextSize(f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setColor(i);
        this.f2518n = paint2;
        if (z9) {
            m2451f();
        }
        invalidate();
        if (!z9 || (interfaceC3424a0 = this.f2512h) == null) {
            return;
        }
        ((CropImageView) interfaceC3424a0).m2439d(false, true);
    }

    public final void setInitialCropWindowRect(@Nullable Rect rect) {
        if (rect == null) {
            rect = AbstractC3437h.f2603a;
        }
        this.f2502K.set(rect);
        if (this.f2503L) {
            m2451f();
            invalidate();
            InterfaceC3424a0 interfaceC3424a0 = this.f2512h;
            if (interfaceC3424a0 != null) {
                ((CropImageView) interfaceC3424a0).m2439d(false, true);
            }
        }
    }

    public final void setSnapRadius(float snapRadius) {
        this.f2528x = snapRadius;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CropOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
        this.f2510f = true;
        this.f2511g = new C3432e0();
        this.f2513i = new RectF();
        this.f2519o = new Path();
        this.f2520p = new float[8];
        this.f2521q = new RectF();
        this.f2494C = this.f2492A / this.f2493B;
        this.f2499H = "";
        this.f2500I = 20.0f;
        this.f2501J = -1;
        this.f2502K = new Rect();
        this.f2504M = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());
    }
}
