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
public final class LinearScaleKt {
    private static ImageVector _linearScale;

    public static final ImageVector getLinearScale(Icons.Sharp sharp) {
        ImageVector imageVector = _linearScale;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LinearScale", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.5f, 9.5f);
        pathBuilder.curveToRelative(-1.03f, 0.0f, -1.9f, 0.62f, -2.29f, 1.5f);
        pathBuilder.horizontalLineToRelative(-2.92f);
        pathBuilder.curveToRelative(-0.39f, -0.88f, -1.26f, -1.5f, -2.29f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(-1.9f, 0.62f, -2.29f, 1.5f);
        pathBuilder.horizontalLineTo(6.79f);
        pathBuilder.curveToRelative(-0.39f, -0.88f, -1.26f, -1.5f, -2.29f, -1.5f);
        pathBuilder.curveTo(3.12f, 9.5f, 2.0f, 10.62f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.curveToRelative(1.03f, 0.0f, 1.9f, -0.62f, 2.29f, -1.5f);
        pathBuilder.horizontalLineToRelative(2.92f);
        pathBuilder.curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(1.9f, -0.62f, 2.29f, -1.5f);
        pathBuilder.horizontalLineToRelative(2.92f);
        pathBuilder.curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linearScale = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
