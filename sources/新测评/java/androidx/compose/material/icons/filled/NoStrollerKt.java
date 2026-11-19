package androidx.compose.material.icons.filled;

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

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_noStroller", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoStroller", "Landroidx/compose/material/icons/Icons$Filled;", "getNoStroller", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNoStroller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoStroller.kt\nandroidx/compose/material/icons/filled/NoStrollerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 NoStroller.kt\nandroidx/compose/material/icons/filled/NoStrollerKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"})
/* loaded from: classes.dex */
public final class NoStrollerKt {
    private static ImageVector _noStroller;

    public static final ImageVector getNoStroller(Icons.Filled filled) {
        ImageVector imageVector = _noStroller;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoStroller", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 18.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(4.9f, 18.0f, 6.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.65f, 3.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        pathBuilder.lineToRelative(-3.5f, 4.11f);
        pathBuilder.lineTo(17.0f, 14.17f);
        pathBuilder.verticalLineToRelative(-7.9f);
        pathBuilder.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        pathBuilder.curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(6.48f);
        pathBuilder.curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.67f, 10.67f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(7.97f, 7.97f);
        pathBuilder.lineTo(6.7f, 15.31f);
        pathBuilder.curveToRelative(-0.55f, 0.65f, -0.09f, 1.65f, 0.76f, 1.65f);
        pathBuilder.horizontalLineToRelative(6.66f);
        pathBuilder.lineToRelative(1.17f, 1.17f);
        pathBuilder.curveTo(14.54f, 18.42f, 14.0f, 19.14f, 14.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.86f, 0.0f, 1.58f, -0.54f, 1.87f, -1.3f);
        pathBuilder.lineToRelative(1.91f, 1.91f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(-4.8f, -4.8f);
        pathBuilder.lineTo(10.67f, 10.67f);
        pathBuilder.close();
        pathBuilder.moveTo(13.47f, 5.03f);
        pathBuilder.curveToRelative(0.27f, -0.32f, 0.58f, -0.72f, 0.98f, -1.09f);
        pathBuilder.curveToRelative(-2.46f, -1.19f, -5.32f, -1.22f, -7.81f, -0.13f);
        pathBuilder.lineToRelative(4.25f, 4.25f);
        pathBuilder.lineTo(13.47f, 5.03f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noStroller = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
