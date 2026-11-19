package androidx.compose.p006ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p006ui.graphics.StrokeCap;
import androidx.compose.p006ui.graphics.StrokeJoin;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\b*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0018\u0010\t\u001a\u00020\n*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u00020\r*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u000f\u001a\u00020\u0010*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u0011\u001a\u00020\u0012*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0010\u0010\u0013\u001a\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u0016*\u00060\u0003j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u0017\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001a%\u0010\u001b\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010 \u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\nH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001a\u0010#\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010$H\u0000\u001a%\u0010%\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\rH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001f\u001a\u001a\u0010'\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010(H\u0000\u001a \u0010)\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u000e\u0010\u0019\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+H\u0000\u001a%\u0010,\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0010H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010\u001f\u001a%\u0010.\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0012H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001f\u001a\u0018\u00100\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u001a\u0018\u00101\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u001a%\u00102\u001a\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0016H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001f\u001a\n\u00104\u001a\u00020\u0001*\u00020\u0003*\n\u00105\"\u00020\u00032\u00020\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00066"}, m5175d2 = {"Paint", "Landroidx/compose/ui/graphics/Paint;", "makeNativePaint", "Landroid/graphics/Paint;", "getNativeAlpha", "", "Landroidx/compose/ui/graphics/NativePaint;", "getNativeAntiAlias", "", "getNativeColor", "Landroidx/compose/ui/graphics/Color;", "(Landroid/graphics/Paint;)J", "getNativeFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "(Landroid/graphics/Paint;)I", "getNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeMiterLimit", "getNativeStrokeWidth", "getNativeStyle", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeAlpha", "", "value", "setNativeAntiAlias", "setNativeBlendMode", "mode", "Landroidx/compose/ui/graphics/BlendMode;", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeColor", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "setNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativePathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "setNativeShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeMiterLimit", "setNativeStrokeWidth", "setNativeStyle", "setNativeStyle--5YerkU", "toComposePaint", "NativePaint", "ui-graphics_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidPaint_androidKt {

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public static final float getNativeAlpha(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return !paint.isFilterBitmap() ? FilterQuality.INSTANCE.m9275getNonefv9h1I() : FilterQuality.INSTANCE.m9273getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i4 = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? StrokeCap.INSTANCE.m9501getButtKaPHkGw() : StrokeCap.INSTANCE.m9503getSquareKaPHkGw() : StrokeCap.INSTANCE.m9502getRoundKaPHkGw() : StrokeCap.INSTANCE.m9501getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i4 = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? StrokeJoin.INSTANCE.m9512getMiterLxFBmk8() : StrokeJoin.INSTANCE.m9513getRoundLxFBmk8() : StrokeJoin.INSTANCE.m9511getBevelLxFBmk8() : StrokeJoin.INSTANCE.m9512getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? PaintingStyle.INSTANCE.m9420getStrokeTiuSbCo() : PaintingStyle.INSTANCE.m9419getFillTiuSbCo();
    }

    public static final Paint makeNativePaint() {
        return new Paint(7);
    }

    public static final void setNativeAlpha(Paint paint, float f4) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAlpha((int) Math.rint(f4 * 255.0f));
    }

    public static final void setNativeAntiAlias(Paint paint, boolean z3) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setAntiAlias(z3);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m9071setNativeBlendModeGB0RdKg(Paint setNativeBlendMode, int i4) {
        Intrinsics.checkNotNullParameter(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m9551setBlendModeGB0RdKg(setNativeBlendMode, i4);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m9038toPorterDuffModes9anfk8(i4)));
        }
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m9072setNativeColor4WTKRHQ(Paint setNativeColor, long j4) {
        Intrinsics.checkNotNullParameter(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(ColorKt.m9232toArgb8_81llA(j4));
    }

    public static final void setNativeColorFilter(Paint paint, ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m9073setNativeFilterQuality50PEsBU(Paint setNativeFilterQuality, int i4) {
        Intrinsics.checkNotNullParameter(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!FilterQuality.m9268equalsimpl0(i4, FilterQuality.INSTANCE.m9275getNonefv9h1I()));
    }

    public static final void setNativePathEffect(Paint paint, PathEffect pathEffect) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void setNativeShader(Paint paint, Shader shader) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setShader(shader);
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m9074setNativeStrokeCapCSYIeUk(Paint setNativeStrokeCap, int i4) {
        Intrinsics.checkNotNullParameter(setNativeStrokeCap, "$this$setNativeStrokeCap");
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        setNativeStrokeCap.setStrokeCap(StrokeCap.m9497equalsimpl0(i4, companion.m9503getSquareKaPHkGw()) ? Paint.Cap.SQUARE : StrokeCap.m9497equalsimpl0(i4, companion.m9502getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m9497equalsimpl0(i4, companion.m9501getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m9075setNativeStrokeJoinkLtJ_vA(Paint setNativeStrokeJoin, int i4) {
        Intrinsics.checkNotNullParameter(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        setNativeStrokeJoin.setStrokeJoin(StrokeJoin.m9507equalsimpl0(i4, companion.m9512getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m9507equalsimpl0(i4, companion.m9511getBevelLxFBmk8()) ? Paint.Join.BEVEL : StrokeJoin.m9507equalsimpl0(i4, companion.m9513getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void setNativeStrokeMiterLimit(Paint paint, float f4) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeMiter(f4);
    }

    public static final void setNativeStrokeWidth(Paint paint, float f4) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        paint.setStrokeWidth(f4);
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m9076setNativeStyle5YerkU(Paint setNativeStyle, int i4) {
        Intrinsics.checkNotNullParameter(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(PaintingStyle.m9415equalsimpl0(i4, PaintingStyle.INSTANCE.m9420getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public static final Paint toComposePaint(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        return new AndroidPaint(paint);
    }
}
