package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.SolidColor;
import androidx.compose.p009ui.graphics.StrokeCap;
import androidx.compose.p009ui.graphics.StrokeJoin;
import androidx.compose.p009ui.graphics.vector.ImageVector;
import androidx.compose.p009ui.graphics.vector.PathBuilder;
import androidx.compose.p009ui.graphics.vector.VectorKt;
import androidx.compose.p009ui.unit.C2452Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7880d2 = {"_exposureZero", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ExposureZero", "Landroidx/compose/material/icons/Icons$Filled;", "getExposureZero", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nExposureZero.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposureZero.kt\nandroidx/compose/material/icons/filled/ExposureZeroKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 ExposureZero.kt\nandroidx/compose/material/icons/filled/ExposureZeroKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"})
/* loaded from: classes.dex */
public final class ExposureZeroKt {
    private static ImageVector _exposureZero;

    public static final ImageVector getExposureZero(Icons.Filled filled) {
        ImageVector imageVector = _exposureZero;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ExposureZero", C2452Dp.m16484constructorimpl(24.0f), C2452Dp.m16484constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw = StrokeCap.INSTANCE.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk8 = StrokeJoin.INSTANCE.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.14f, 12.5f);
        pathBuilder.curveToRelative(0.0f, 1.0f, -0.1f, 1.85f, -0.3f, 2.55f);
        pathBuilder.curveToRelative(-0.2f, 0.7f, -0.48f, 1.27f, -0.83f, 1.7f);
        pathBuilder.curveToRelative(-0.36f, 0.44f, -0.79f, 0.75f, -1.3f, 0.95f);
        pathBuilder.curveToRelative(-0.51f, 0.2f, -1.07f, 0.3f, -1.7f, 0.3f);
        pathBuilder.curveToRelative(-0.62f, 0.0f, -1.18f, -0.1f, -1.69f, -0.3f);
        pathBuilder.curveToRelative(-0.51f, -0.2f, -0.95f, -0.51f, -1.31f, -0.95f);
        pathBuilder.curveToRelative(-0.36f, -0.44f, -0.65f, -1.01f, -0.85f, -1.7f);
        pathBuilder.curveToRelative(-0.2f, -0.7f, -0.3f, -1.55f, -0.3f, -2.55f);
        pathBuilder.verticalLineToRelative(-2.04f);
        pathBuilder.curveToRelative(0.0f, -1.0f, 0.1f, -1.85f, 0.3f, -2.55f);
        pathBuilder.curveToRelative(0.2f, -0.7f, 0.48f, -1.26f, 0.84f, -1.69f);
        pathBuilder.curveToRelative(0.36f, -0.43f, 0.8f, -0.74f, 1.31f, -0.93f);
        pathBuilder.curveTo(10.81f, 5.1f, 11.38f, 5.0f, 12.0f, 5.0f);
        pathBuilder.curveToRelative(0.63f, 0.0f, 1.19f, 0.1f, 1.7f, 0.29f);
        pathBuilder.curveToRelative(0.51f, 0.19f, 0.95f, 0.5f, 1.31f, 0.93f);
        pathBuilder.curveToRelative(0.36f, 0.43f, 0.64f, 0.99f, 0.84f, 1.69f);
        pathBuilder.curveToRelative(0.2f, 0.7f, 0.3f, 1.54f, 0.3f, 2.55f);
        pathBuilder.verticalLineToRelative(2.04f);
        pathBuilder.close();
        pathBuilder.moveTo(14.03f, 10.14f);
        pathBuilder.curveToRelative(0.0f, -0.64f, -0.05f, -1.18f, -0.13f, -1.62f);
        pathBuilder.curveToRelative(-0.09f, -0.44f, -0.22f, -0.79f, -0.4f, -1.06f);
        pathBuilder.curveToRelative(-0.17f, -0.27f, -0.39f, -0.46f, -0.64f, -0.58f);
        pathBuilder.curveToRelative(-0.25f, -0.13f, -0.54f, -0.19f, -0.86f, -0.19f);
        pathBuilder.curveToRelative(-0.32f, 0.0f, -0.61f, 0.06f, -0.86f, 0.18f);
        pathBuilder.reflectiveCurveToRelative(-0.47f, 0.31f, -0.64f, 0.58f);
        pathBuilder.curveToRelative(-0.17f, 0.27f, -0.31f, 0.62f, -0.4f, 1.06f);
        pathBuilder.reflectiveCurveToRelative(-0.13f, 0.98f, -0.13f, 1.62f);
        pathBuilder.verticalLineToRelative(2.67f);
        pathBuilder.curveToRelative(0.0f, 0.64f, 0.05f, 1.18f, 0.14f, 1.62f);
        pathBuilder.curveToRelative(0.09f, 0.45f, 0.23f, 0.81f, 0.4f, 1.09f);
        pathBuilder.reflectiveCurveToRelative(0.39f, 0.48f, 0.64f, 0.61f);
        pathBuilder.reflectiveCurveToRelative(0.54f, 0.19f, 0.87f, 0.19f);
        pathBuilder.curveToRelative(0.33f, 0.0f, 0.62f, -0.06f, 0.87f, -0.19f);
        pathBuilder.reflectiveCurveToRelative(0.46f, -0.33f, 0.63f, -0.61f);
        pathBuilder.curveToRelative(0.17f, -0.28f, 0.3f, -0.64f, 0.39f, -1.09f);
        pathBuilder.curveToRelative(0.09f, -0.45f, 0.13f, -0.99f, 0.13f, -1.62f);
        pathBuilder.verticalLineToRelative(-2.66f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw, iM14262getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exposureZero = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
