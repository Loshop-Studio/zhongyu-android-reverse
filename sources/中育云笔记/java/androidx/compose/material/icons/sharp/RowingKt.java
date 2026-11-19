package androidx.compose.material.icons.sharp;

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
public final class RowingKt {
    private static ImageVector _rowing;

    public static final ImageVector getRowing(Icons.Sharp sharp) {
        ImageVector imageVector = _rowing;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Rowing", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.5f, 14.5f);
        pathBuilder.lineTo(4.0f, 19.0f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.lineTo(9.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 1.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 21.01f);
        pathBuilder.lineTo(18.0f, 24.0f);
        pathBuilder.lineToRelative(-2.99f, -3.01f);
        pathBuilder.lineTo(15.01f, 19.5f);
        pathBuilder.lineToRelative(-7.1f, -7.09f);
        pathBuilder.curveToRelative(-0.31f, 0.05f, -0.61f, 0.07f, -0.91f, 0.07f);
        pathBuilder.verticalLineToRelative(-2.16f);
        pathBuilder.curveToRelative(1.66f, 0.03f, 3.61f, -0.87f, 4.67f, -2.04f);
        pathBuilder.lineToRelative(1.4f, -1.55f);
        pathBuilder.curveToRelative(0.19f, -0.21f, 0.43f, -0.38f, 0.69f, -0.5f);
        pathBuilder.curveToRelative(0.29f, -0.14f, 0.62f, -0.23f, 0.96f, -0.23f);
        pathBuilder.horizontalLineToRelative(0.03f);
        pathBuilder.curveTo(15.99f, 6.0f, 17.0f, 7.01f, 17.0f, 8.25f);
        pathBuilder.lineTo(17.0f, 17.0f);
        pathBuilder.lineToRelative(-0.92f, -0.83f);
        pathBuilder.lineToRelative(-3.58f, -3.58f);
        pathBuilder.verticalLineToRelative(-2.27f);
        pathBuilder.curveToRelative(-0.63f, 0.52f, -1.43f, 1.02f, -2.29f, 1.39f);
        pathBuilder.lineTo(16.5f, 18.0f);
        pathBuilder.lineTo(18.0f, 18.0f);
        pathBuilder.lineToRelative(3.0f, 3.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rowing = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
