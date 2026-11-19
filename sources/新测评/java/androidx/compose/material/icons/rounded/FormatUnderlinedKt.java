package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3127Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_formatUnderlined", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatUnderlined", "Landroidx/compose/material/icons/Icons$Rounded;", "getFormatUnderlined", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nFormatUnderlined.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatUnderlined.kt\nandroidx/compose/material/icons/rounded/FormatUnderlinedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 FormatUnderlined.kt\nandroidx/compose/material/icons/rounded/FormatUnderlinedKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"})
/* loaded from: classes.dex */
public final class FormatUnderlinedKt {
    private static ImageVector _formatUnderlined;

    public static final ImageVector getFormatUnderlined(Icons.Rounded rounded) {
        ImageVector imageVector = _formatUnderlined;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatUnderlined", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.79f, 16.95f);
        pathBuilder.curveToRelative(3.03f, -0.39f, 5.21f, -3.11f, 5.21f, -6.16f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.curveTo(18.0f, 3.56f, 17.44f, 3.0f, 16.75f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilder.verticalLineToRelative(6.65f);
        pathBuilder.curveToRelative(0.0f, 1.67f, -1.13f, 3.19f, -2.77f, 3.52f);
        pathBuilder.curveToRelative(-2.25f, 0.47f, -4.23f, -1.25f, -4.23f, -3.42f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.curveTo(8.5f, 3.56f, 7.94f, 3.0f, 7.25f, 3.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 3.56f, 6.0f, 4.25f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.curveToRelative(0.0f, 3.57f, 3.13f, 6.42f, 6.79f, 5.95f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatUnderlined = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
