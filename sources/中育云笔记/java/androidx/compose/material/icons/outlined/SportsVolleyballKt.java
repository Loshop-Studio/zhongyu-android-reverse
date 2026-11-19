package androidx.compose.material.icons.outlined;

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
public final class SportsVolleyballKt {
    private static ImageVector _sportsVolleyball;

    public static final ImageVector getSportsVolleyball(Icons.Outlined outlined) {
        ImageVector imageVector = _sportsVolleyball;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsVolleyball", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 4.07f);
        pathBuilder.curveToRelative(3.07f, 0.38f, 5.57f, 2.52f, 6.54f, 5.36f);
        pathBuilder.lineTo(13.0f, 5.65f);
        pathBuilder.verticalLineTo(4.07f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 5.08f);
        pathBuilder.curveToRelative(1.18f, -0.69f, 3.33f, -1.06f, 3.0f, -1.02f);
        pathBuilder.verticalLineToRelative(7.35f);
        pathBuilder.lineToRelative(-3.0f, 1.73f);
        pathBuilder.verticalLineTo(5.08f);
        pathBuilder.close();
        pathBuilder.moveTo(4.63f, 15.1f);
        pathBuilder.curveTo(4.23f, 14.14f, 4.0f, 13.1f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.02f, 0.76f, -3.86f, 2.0f, -5.27f);
        pathBuilder.verticalLineToRelative(7.58f);
        pathBuilder.lineTo(4.63f, 15.1f);
        pathBuilder.close();
        pathBuilder.moveTo(5.64f, 16.83f);
        pathBuilder.lineTo(12.0f, 13.15f);
        pathBuilder.lineToRelative(3.0f, 1.73f);
        pathBuilder.lineToRelative(-6.98f, 4.03f);
        pathBuilder.curveTo(7.09f, 18.38f, 6.28f, 17.68f, 5.64f, 16.83f);
        pathBuilder.close();
        pathBuilder.moveTo(10.42f, 19.84f);
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-0.54f, 0.0f, -1.07f, -0.06f, -1.58f, -0.16f);
        pathBuilder.lineToRelative(6.58f, -3.8f);
        pathBuilder.lineToRelative(1.36f, 0.78f);
        pathBuilder.curveTo(16.9f, 18.75f, 14.6f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 11.42f);
        pathBuilder.verticalLineTo(7.96f);
        pathBuilder.lineToRelative(7.0f, 4.05f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.23f, 2.14f, -0.63f, 3.09f);
        pathBuilder.lineTo(13.0f, 11.42f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsVolleyball = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
