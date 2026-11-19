package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class EvStationKt {
    private static ImageVector _evStation;

    public static final ImageVector getEvStation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _evStation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EvStation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 13.5f);
        pathBuilder.lineTo(6.0f, 13.5f);
        pathBuilder.lineTo(6.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.lineToRelative(-4.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 13.5f);
        pathBuilder.lineTo(10.0f, 6.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(12.0f, 5.0f);
        pathBuilder.lineTo(6.0f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 3.0f);
        pathBuilder2.lineTo(6.0f, 3.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.verticalLineToRelative(-7.5f);
        pathBuilder2.horizontalLineToRelative(1.5f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder2.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder2.lineTo(20.5f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, -0.69f, -0.28f, -1.32f, -0.73f, -1.77f);
        pathBuilder2.lineToRelative(0.01f, -0.01f);
        pathBuilder2.lineToRelative(-3.72f, -3.72f);
        pathBuilder2.lineTo(15.0f, 4.56f);
        pathBuilder2.lineToRelative(2.11f, 2.11f);
        pathBuilder2.curveToRelative(-0.94f, 0.36f, -1.61f, 1.26f, -1.61f, 2.33f);
        pathBuilder2.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder2.curveToRelative(0.36f, 0.0f, 0.69f, -0.08f, 1.0f, -0.21f);
        pathBuilder2.verticalLineToRelative(7.21f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.lineTo(17.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.lineTo(14.0f, 5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 11.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.lineTo(6.0f, 19.0f);
        pathBuilder2.lineTo(6.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 10.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.0f, 6.0f);
        pathBuilder2.lineToRelative(-4.0f, 7.5f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineTo(8.0f, 18.0f);
        pathBuilder2.lineToRelative(4.0f, -7.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _evStation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
