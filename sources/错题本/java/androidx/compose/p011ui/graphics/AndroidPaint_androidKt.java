package androidx.compose.p011ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\u000e\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0011\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u0013*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\u0018*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u001d*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010\"\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u001dH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\"\u0010%\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020#H\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010\r\u001a\u0017\u0010&\u001a\u00020#*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010(\u001a\u00020\u0013*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b(\u0010\u0015\u001a\u001f\u0010)\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0000¢\u0006\u0004\b)\u0010\u0017\u001a\u0017\u0010+\u001a\u00020**\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b+\u0010'\u001a\"\u0010-\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020*H\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010\r\u001a\u0017\u0010/\u001a\u00020.*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b/\u0010'\u001a\"\u00101\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020.H\u0000ø\u0001\u0000¢\u0006\u0004\b0\u0010\r\u001a\u0017\u00102\u001a\u00020\u0013*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b2\u0010\u0015\u001a\u001f\u00103\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0000¢\u0006\u0004\b3\u0010\u0017\u001a\u0017\u00105\u001a\u000204*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b5\u0010'\u001a\"\u00107\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u0010\u001a\u000204H\u0000ø\u0001\u0000¢\u0006\u0004\b6\u0010\r\u001a'\u0010:\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u000e\u0010\u0010\u001a\n\u0018\u000108j\u0004\u0018\u0001`9H\u0000¢\u0006\u0004\b:\u0010;\u001a!\u0010=\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u0010\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0004\b=\u0010>*\n\u0010?\"\u00020\u00032\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, m5110d2 = {"Landroidx/compose/ui/graphics/Paint;", "Paint", "()Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/Paint;", "asComposePaint", "(Landroid/graphics/Paint;)Landroidx/compose/ui/graphics/Paint;", "makeNativePaint", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "Landroidx/compose/ui/graphics/BlendMode;", "mode", "Ld6/s;", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeBlendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "setNativeColorFilter", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/ColorFilter;)V", "", "getNativeAlpha", "(Landroid/graphics/Paint;)F", "setNativeAlpha", "(Landroid/graphics/Paint;F)V", "", "getNativeAntiAlias", "(Landroid/graphics/Paint;)Z", "setNativeAntiAlias", "(Landroid/graphics/Paint;Z)V", "Landroidx/compose/ui/graphics/Color;", "getNativeColor", "(Landroid/graphics/Paint;)J", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColor", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeStyle--5YerkU", "setNativeStyle", "getNativeStyle", "(Landroid/graphics/Paint;)I", "getNativeStrokeWidth", "setNativeStrokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeJoin", "getNativeStrokeMiterLimit", "setNativeStrokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativeFilterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeShader", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Landroidx/compose/ui/graphics/PathEffect;", "setNativePathEffect", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/PathEffect;)V", "NativePaint", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidPaint_androidKt {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    @NotNull
    public static final Paint Paint() {
        return new AndroidPaint();
    }

    @NotNull
    public static final Paint asComposePaint(@NotNull Paint paint) {
        return new AndroidPaint(paint);
    }

    public static final float getNativeAlpha(@NotNull Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(@NotNull Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(@NotNull Paint paint) {
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(@NotNull Paint paint) {
        return !paint.isFilterBitmap() ? FilterQuality.INSTANCE.m10783getNonefv9h1I() : FilterQuality.INSTANCE.m10781getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(@NotNull Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? StrokeCap.INSTANCE.m11035getButtKaPHkGw() : StrokeCap.INSTANCE.m11037getSquareKaPHkGw() : StrokeCap.INSTANCE.m11036getRoundKaPHkGw() : StrokeCap.INSTANCE.m11035getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(@NotNull Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? StrokeJoin.INSTANCE.m11046getMiterLxFBmk8() : StrokeJoin.INSTANCE.m11047getRoundLxFBmk8() : StrokeJoin.INSTANCE.m11045getBevelLxFBmk8() : StrokeJoin.INSTANCE.m11046getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(@NotNull Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(@NotNull Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(@NotNull Paint paint) {
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? PaintingStyle.INSTANCE.m10950getStrokeTiuSbCo() : PaintingStyle.INSTANCE.m10949getFillTiuSbCo();
    }

    @NotNull
    public static final Paint makeNativePaint() {
        return new Paint(7);
    }

    public static final void setNativeAlpha(@NotNull Paint paint, float f) {
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void setNativeAntiAlias(@NotNull Paint paint, boolean z8) {
        paint.setAntiAlias(z8);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m10566setNativeBlendModeGB0RdKg(@NotNull Paint paint, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m11085setBlendModeGB0RdKg(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m10534toPorterDuffModes9anfk8(i)));
        }
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m10567setNativeColor4WTKRHQ(@NotNull Paint paint, long j7) {
        paint.setColor(ColorKt.m10736toArgb8_81llA(j7));
    }

    public static final void setNativeColorFilter(@NotNull Paint paint, @Nullable ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m10568setNativeFilterQuality50PEsBU(@NotNull Paint paint, int i) {
        paint.setFilterBitmap(!FilterQuality.m10776equalsimpl0(i, FilterQuality.INSTANCE.m10783getNonefv9h1I()));
    }

    public static final void setNativePathEffect(@NotNull Paint paint, @Nullable PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void setNativeShader(@NotNull Paint paint, @Nullable Shader shader) {
        paint.setShader(shader);
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m10569setNativeStrokeCapCSYIeUk(@NotNull Paint paint, int i) {
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        paint.setStrokeCap(StrokeCap.m11031equalsimpl0(i, companion.m11037getSquareKaPHkGw()) ? Paint.Cap.SQUARE : StrokeCap.m11031equalsimpl0(i, companion.m11036getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m11031equalsimpl0(i, companion.m11035getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m10570setNativeStrokeJoinkLtJ_vA(@NotNull Paint paint, int i) {
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        paint.setStrokeJoin(StrokeJoin.m11041equalsimpl0(i, companion.m11046getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m11041equalsimpl0(i, companion.m11045getBevelLxFBmk8()) ? Paint.Join.BEVEL : StrokeJoin.m11041equalsimpl0(i, companion.m11047getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void setNativeStrokeMiterLimit(@NotNull Paint paint, float f) {
        paint.setStrokeMiter(f);
    }

    public static final void setNativeStrokeWidth(@NotNull Paint paint, float f) {
        paint.setStrokeWidth(f);
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m10571setNativeStyle5YerkU(@NotNull Paint paint, int i) {
        paint.setStyle(PaintingStyle.m10945equalsimpl0(i, PaintingStyle.INSTANCE.m10950getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
