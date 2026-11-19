package androidx.compose.p014ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;

/* loaded from: classes2.dex */
public final class AndroidPaint_androidKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final Paint asComposePaint(Paint paint) {
        return new AndroidPaint(paint);
    }

    public static final float getNativeAlpha(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(Paint paint) {
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(Paint paint) {
        return !paint.isFilterBitmap() ? FilterQuality.Companion.m30979getNonefv9h1I() : FilterQuality.Companion.m30977getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StrokeCap.Companion.m31231getButtKaPHkGw() : StrokeCap.Companion.m31233getSquareKaPHkGw() : StrokeCap.Companion.m31232getRoundKaPHkGw() : StrokeCap.Companion.m31231getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StrokeJoin.Companion.m31242getMiterLxFBmk8() : StrokeJoin.Companion.m31243getRoundLxFBmk8() : StrokeJoin.Companion.m31241getBevelLxFBmk8() : StrokeJoin.Companion.m31242getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(Paint paint) {
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? PaintingStyle.Companion.m31146getStrokeTiuSbCo() : PaintingStyle.Companion.m31145getFillTiuSbCo();
    }

    public static final Paint makeNativePaint() {
        return new Paint(7);
    }

    public static final void setNativeAlpha(Paint paint, float f10) {
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void setNativeAntiAlias(Paint paint, boolean z10) {
        paint.setAntiAlias(z10);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m30762setNativeBlendModeGB0RdKg(Paint paint, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m31281setBlendModeGB0RdKg(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m30730toPorterDuffModes9anfk8(i10)));
        }
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m30763setNativeColor4WTKRHQ(Paint paint, long j10) {
        paint.setColor(ColorKt.m30932toArgb8_81llA(j10));
    }

    public static final void setNativeColorFilter(Paint paint, ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m30764setNativeFilterQuality50PEsBU(Paint paint, int i10) {
        paint.setFilterBitmap(!FilterQuality.m30972equalsimpl0(i10, FilterQuality.Companion.m30979getNonefv9h1I()));
    }

    public static final void setNativePathEffect(Paint paint, PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void setNativeShader(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m30765setNativeStrokeCapCSYIeUk(Paint paint, int i10) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        paint.setStrokeCap(StrokeCap.m31227equalsimpl0(i10, companion.m31233getSquareKaPHkGw()) ? Paint.Cap.SQUARE : StrokeCap.m31227equalsimpl0(i10, companion.m31232getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m31227equalsimpl0(i10, companion.m31231getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m30766setNativeStrokeJoinkLtJ_vA(Paint paint, int i10) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        paint.setStrokeJoin(StrokeJoin.m31237equalsimpl0(i10, companion.m31242getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m31237equalsimpl0(i10, companion.m31241getBevelLxFBmk8()) ? Paint.Join.BEVEL : StrokeJoin.m31237equalsimpl0(i10, companion.m31243getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void setNativeStrokeMiterLimit(Paint paint, float f10) {
        paint.setStrokeMiter(f10);
    }

    public static final void setNativeStrokeWidth(Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m30767setNativeStyle5YerkU(Paint paint, int i10) {
        paint.setStyle(PaintingStyle.m31141equalsimpl0(i10, PaintingStyle.Companion.m31146getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
