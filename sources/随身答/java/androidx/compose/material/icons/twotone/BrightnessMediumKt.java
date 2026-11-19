package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.SolidColor;
import androidx.compose.p012ui.graphics.StrokeCap;
import androidx.compose.p012ui.graphics.StrokeJoin;
import androidx.compose.p012ui.graphics.vector.ImageVector;
import androidx.compose.p012ui.graphics.vector.PathBuilder;
import androidx.compose.p012ui.graphics.vector.VectorKt;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_brightnessMedium", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BrightnessMedium", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBrightnessMedium", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBrightnessMedium.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrightnessMedium.kt\nandroidx/compose/material/icons/twotone/BrightnessMediumKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n72#5,4:139\n72#5,4:177\n*S KotlinDebug\n*F\n+ 1 BrightnessMedium.kt\nandroidx/compose/material/icons/twotone/BrightnessMediumKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n55#1:155,18\n55#1:192\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n55#1:173,2\n55#1:175,2\n55#1:181,11\n30#1:139,4\n55#1:177,4\n*E\n"})
/* loaded from: classes2.dex */
public final class BrightnessMediumKt {
    private static ImageVector _brightnessMedium;

    public static final ImageVector getBrightnessMedium(Icons.TwoTone twoTone) {
        ImageVector imageVector = _brightnessMedium;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BrightnessMedium", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m21435getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM21762getButtKaPHkGw = companion2.m21762getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM21772getBevelLxFBmk8 = companion3.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 9.52f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(-3.52f);
        pathBuilder.lineTo(12.0f, 3.52f);
        pathBuilder.lineTo(9.52f, 6.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(3.52f);
        pathBuilder.lineTo(3.52f, 12.0f);
        pathBuilder.lineTo(6.0f, 14.48f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(3.52f);
        pathBuilder.lineTo(12.0f, 20.48f);
        pathBuilder.lineTo(14.48f, 18.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineToRelative(-3.52f);
        pathBuilder.lineTo(20.48f, 12.0f);
        pathBuilder.lineTo(18.0f, 9.52f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw2 = companion2.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk82 = companion3.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 8.69f);
        pathBuilder2.lineTo(20.0f, 4.0f);
        pathBuilder2.horizontalLineToRelative(-4.69f);
        pathBuilder2.lineTo(12.0f, 0.69f);
        pathBuilder2.lineTo(8.69f, 4.0f);
        pathBuilder2.lineTo(4.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(4.69f);
        pathBuilder2.lineTo(0.69f, 12.0f);
        pathBuilder2.lineTo(4.0f, 15.31f);
        pathBuilder2.lineTo(4.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(4.69f);
        pathBuilder2.lineTo(12.0f, 23.31f);
        pathBuilder2.lineTo(15.31f, 20.0f);
        pathBuilder2.lineTo(20.0f, 20.0f);
        pathBuilder2.verticalLineToRelative(-4.69f);
        pathBuilder2.lineTo(23.31f, 12.0f);
        pathBuilder2.lineTo(20.0f, 8.69f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 14.48f);
        pathBuilder2.lineTo(18.0f, 18.0f);
        pathBuilder2.horizontalLineToRelative(-3.52f);
        pathBuilder2.lineTo(12.0f, 20.48f);
        pathBuilder2.lineTo(9.52f, 18.0f);
        pathBuilder2.lineTo(6.0f, 18.0f);
        pathBuilder2.verticalLineToRelative(-3.52f);
        pathBuilder2.lineTo(3.52f, 12.0f);
        pathBuilder2.lineTo(6.0f, 9.52f);
        pathBuilder2.lineTo(6.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(3.52f);
        pathBuilder2.lineTo(12.0f, 3.52f);
        pathBuilder2.lineTo(14.48f, 6.0f);
        pathBuilder2.lineTo(18.0f, 6.0f);
        pathBuilder2.verticalLineToRelative(3.52f);
        pathBuilder2.lineTo(20.48f, 12.0f);
        pathBuilder2.lineTo(18.0f, 14.48f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 6.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw2, iM21772getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightnessMedium = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
