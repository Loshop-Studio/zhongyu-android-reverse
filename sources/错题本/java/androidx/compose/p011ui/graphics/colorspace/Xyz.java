package androidx.compose.p011ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0082\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J%\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\u001bJ=\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m5110d2 = {"Landroidx/compose/ui/graphics/colorspace/Xyz;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "clamp", "", "x", "fromXyz", "", "v", "getMaxValue", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,74:1\n71#1:75\n71#1:86\n71#1:97\n71#1:108\n71#1:122\n71#1:133\n71#1:144\n71#1:155\n71#1:166\n65#2,10:76\n65#2,10:87\n65#2,10:98\n65#2,10:109\n65#2,10:123\n65#2,10:134\n65#2,10:145\n65#2,10:156\n65#2,10:167\n65#2,10:177\n53#3,3:119\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n38#1:75\n39#1:86\n40#1:97\n45#1:108\n49#1:122\n59#1:133\n63#1:144\n64#1:155\n65#1:166\n38#1:76,10\n39#1:87,10\n40#1:98,10\n45#1:109,10\n49#1:123,10\n59#1:134,10\n63#1:145,10\n64#1:156,10\n65#1:167,10\n71#1:177,10\n45#1:119,3\n*E\n"})
/* loaded from: classes.dex */
public final class Xyz extends ColorSpace {
    public Xyz(@NotNull String str, int i) {
        super(str, ColorModel.INSTANCE.m11097getXyzxdoWZVw(), i, null);
    }

    private final float clamp(float x3) {
        if (x3 < -2.0f) {
            x3 = -2.0f;
        }
        if (x3 > 2.0f) {
            return 2.0f;
        }
        return x3;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v2) {
        float f = v2[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        v2[0] = f;
        float f7 = v2[1];
        if (f7 < -2.0f) {
            f7 = -2.0f;
        }
        if (f7 > 2.0f) {
            f7 = 2.0f;
        }
        v2[1] = f7;
        float f8 = v2[2];
        float f9 = f8 >= -2.0f ? f8 : -2.0f;
        v2[2] = f9 <= 2.0f ? f9 : 2.0f;
        return v2;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return 2.0f;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return -2.0f;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v02, float v12, float v2) {
        if (v02 < -2.0f) {
            v02 = -2.0f;
        }
        if (v02 > 2.0f) {
            v02 = 2.0f;
        }
        if (v12 < -2.0f) {
            v12 = -2.0f;
        }
        return (Float.floatToRawIntBits(v02) << 32) | (Float.floatToRawIntBits(v12 <= 2.0f ? v12 : 2.0f) & 4294967295L);
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v2) {
        float f = v2[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        v2[0] = f;
        float f7 = v2[1];
        if (f7 < -2.0f) {
            f7 = -2.0f;
        }
        if (f7 > 2.0f) {
            f7 = 2.0f;
        }
        v2[1] = f7;
        float f8 = v2[2];
        float f9 = f8 >= -2.0f ? f8 : -2.0f;
        v2[2] = f9 <= 2.0f ? f9 : 2.0f;
        return v2;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v02, float v12, float v2) {
        if (v2 < -2.0f) {
            v2 = -2.0f;
        }
        if (v2 > 2.0f) {
            return 2.0f;
        }
        return v2;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo11099xyzaToColorJlNiLsg$ui_graphics_release(float x3, float y2, float z8, float a9, @NotNull ColorSpace colorSpace) {
        if (x3 < -2.0f) {
            x3 = -2.0f;
        }
        if (x3 > 2.0f) {
            x3 = 2.0f;
        }
        if (y2 < -2.0f) {
            y2 = -2.0f;
        }
        if (y2 > 2.0f) {
            y2 = 2.0f;
        }
        if (z8 < -2.0f) {
            z8 = -2.0f;
        }
        return ColorKt.Color(x3, y2, z8 <= 2.0f ? z8 : 2.0f, a9, colorSpace);
    }
}
