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
public final class TokenKt {
    private static ImageVector _token;

    public static final ImageVector getToken(Icons.Rounded rounded) {
        ImageVector imageVector = _token;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Token", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.97f, 2.54f);
        pathBuilder.curveToRelative(-0.6f, -0.34f, -1.34f, -0.34f, -1.94f, 0.0f);
        pathBuilder.lineToRelative(-7.0f, 3.89f);
        pathBuilder.lineTo(9.1f, 9.24f);
        pathBuilder.curveTo(9.83f, 8.48f, 10.86f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(2.17f, 0.48f, 2.9f, 1.24f);
        pathBuilder.lineToRelative(5.07f, -2.82f);
        pathBuilder.lineTo(12.97f, 2.54f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 8.14f);
        pathBuilder.lineToRelative(5.13f, 2.85f);
        pathBuilder.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        pathBuilder.verticalLineToRelative(5.57f);
        pathBuilder.lineToRelative(-6.97f, -3.87f);
        pathBuilder.curveTo(3.39f, 17.22f, 3.0f, 16.55f, 3.0f, 15.82f);
        pathBuilder.verticalLineTo(8.14f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 21.44f);
        pathBuilder.verticalLineToRelative(-5.57f);
        pathBuilder.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        pathBuilder.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        pathBuilder.lineTo(21.0f, 8.14f);
        pathBuilder.lineToRelative(0.0f, 7.68f);
        pathBuilder.curveToRelative(0.0f, 0.73f, -0.39f, 1.4f, -1.03f, 1.75f);
        pathBuilder.lineTo(13.0f, 21.44f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _token = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
