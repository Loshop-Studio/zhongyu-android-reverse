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
public final class CommuteKt {
    private static ImageVector _commute;

    public static final ImageVector getCommute(Icons.TwoTone twoTone) {
        ImageVector imageVector = _commute;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Commute", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.lineTo(5.0f, 4.0f);
        pathBuilder.curveTo(3.34f, 4.0f, 2.0f, 5.34f, 2.0f, 7.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.lineToRelative(-1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.lineTo(4.0f, 13.0f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(15.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 14.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.57f, 9.66f);
        pathBuilder.curveToRelative(-0.14f, -0.4f, -0.52f, -0.66f, -0.97f, -0.66f);
        pathBuilder.horizontalLineToRelative(-7.19f);
        pathBuilder.curveToRelative(-0.46f, 0.0f, -0.83f, 0.26f, -0.98f, 0.66f);
        pathBuilder.lineToRelative(-1.42f, 4.11f);
        pathBuilder.verticalLineToRelative(5.51f);
        pathBuilder.curveToRelative(0.0f, 0.38f, 0.31f, 0.72f, 0.69f, 0.72f);
        pathBuilder.horizontalLineToRelative(0.62f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.68f, -0.38f, 0.68f, -0.76f);
        pathBuilder.lineTo(12.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(1.24f);
        pathBuilder.curveToRelative(0.0f, 0.38f, 0.31f, 0.76f, 0.69f, 0.76f);
        pathBuilder.horizontalLineToRelative(0.61f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.69f, -0.34f, 0.69f, -0.72f);
        pathBuilder.lineToRelative(0.01f, -1.37f);
        pathBuilder.verticalLineToRelative(-4.14f);
        pathBuilder.lineToRelative(-1.43f, -4.11f);
        pathBuilder.close();
        pathBuilder.moveTo(12.41f, 10.0f);
        pathBuilder.horizontalLineToRelative(7.19f);
        pathBuilder.lineToRelative(1.03f, 3.0f);
        pathBuilder.horizontalLineToRelative(-9.25f);
        pathBuilder.lineToRelative(1.03f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 16.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _commute = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
