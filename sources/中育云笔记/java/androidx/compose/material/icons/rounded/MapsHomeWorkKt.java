package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class MapsHomeWorkKt {
    private static ImageVector _mapsHomeWork;

    public static final ImageVector getMapsHomeWork(Icons.Rounded rounded) {
        ImageVector imageVector = _mapsHomeWork;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MapsHomeWork", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.16f, 10.4f);
        pathBuilder.lineToRelative(-5.0f, -3.57f);
        pathBuilder.curveToRelative(-0.7f, -0.5f, -1.63f, -0.5f, -2.32f, 0.0f);
        pathBuilder.lineToRelative(-5.0f, 3.57f);
        pathBuilder.curveTo(1.31f, 10.78f, 1.0f, 11.38f, 1.0f, 12.03f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-7.97f);
        pathBuilder.curveTo(15.0f, 11.38f, 14.69f, 10.78f, 14.16f, 10.4f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.03f, 3.0f);
        pathBuilder2.horizontalLineToRelative(-9.06f);
        pathBuilder2.curveTo(10.88f, 3.0f, 10.0f, 3.88f, 10.0f, 4.97f);
        pathBuilder2.lineToRelative(0.09f, 0.09f);
        pathBuilder2.curveToRelative(0.08f, 0.05f, 0.16f, 0.09f, 0.24f, 0.14f);
        pathBuilder2.lineToRelative(5.0f, 3.57f);
        pathBuilder2.curveToRelative(0.76f, 0.54f, 1.3f, 1.34f, 1.54f, 2.23f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.verticalLineToRelative(1.0f);
        pathBuilder2.horizontalLineToRelative(4.03f);
        pathBuilder2.curveToRelative(1.09f, 0.0f, 1.97f, -0.88f, 1.97f, -1.97f);
        pathBuilder2.verticalLineTo(4.97f);
        pathBuilder2.curveTo(23.0f, 3.88f, 22.12f, 3.0f, 21.03f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(9.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mapsHomeWork = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
