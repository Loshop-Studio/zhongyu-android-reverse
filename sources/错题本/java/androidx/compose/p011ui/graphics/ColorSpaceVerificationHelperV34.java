package androidx.compose.p011ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.RequiresApi;
import androidx.compose.p011ui.graphics.colorspace.ColorSpaces;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(34)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m5110d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelperV34;", "", "()V", "obtainAndroidColorSpace", "Landroid/graphics/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "obtainComposeColorSpaceFromId", "id", "", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class ColorSpaceVerificationHelperV34 {

    @NotNull
    public static final ColorSpaceVerificationHelperV34 INSTANCE = new ColorSpaceVerificationHelperV34();

    private ColorSpaceVerificationHelperV34() {
    }

    @JvmStatic
    @Nullable
    public static final ColorSpace obtainAndroidColorSpace(@NotNull androidx.compose.p011ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getBt2020Hlg())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (AbstractC5830k.m5325b(colorSpace, colorSpaces.getBt2020Pq())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }

    @JvmStatic
    @NotNull
    public static final androidx.compose.p011ui.graphics.colorspace.ColorSpace obtainComposeColorSpaceFromId(int id) {
        return id == ColorSpace.Named.BT2020_HLG.ordinal() ? ColorSpaces.INSTANCE.getBt2020Hlg() : id == ColorSpace.Named.BT2020_PQ.ordinal() ? ColorSpaces.INSTANCE.getBt2020Pq() : ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release();
    }
}
