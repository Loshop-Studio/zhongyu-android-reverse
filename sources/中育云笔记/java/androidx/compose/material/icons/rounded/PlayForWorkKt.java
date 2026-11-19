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
public final class PlayForWorkKt {
    private static ImageVector _playForWork;

    public static final ImageVector getPlayForWork(Icons.Rounded rounded) {
        ImageVector imageVector = _playForWork;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PlayForWork", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 6.0f);
        pathBuilder.verticalLineToRelative(4.59f);
        pathBuilder.lineTo(8.71f, 10.59f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilder.lineToRelative(3.29f, 3.29f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(3.29f, -3.29f);
        pathBuilder.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        pathBuilder.lineTo(13.0f, 10.59f);
        pathBuilder.lineTo(13.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.1f, 14.0f);
        pathBuilder.curveToRelative(-0.61f, 0.0f, -1.11f, 0.55f, -0.99f, 1.15f);
        pathBuilder.curveTo(6.65f, 17.91f, 9.08f, 20.0f, 12.0f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(5.35f, -2.09f, 5.89f, -4.85f);
        pathBuilder.curveToRelative(0.12f, -0.6f, -0.38f, -1.15f, -0.99f, -1.15f);
        pathBuilder.curveToRelative(-0.49f, 0.0f, -0.88f, 0.35f, -0.98f, 0.83f);
        pathBuilder.curveTo(15.53f, 16.64f, 13.93f, 18.0f, 12.0f, 18.0f);
        pathBuilder.reflectiveCurveToRelative(-3.53f, -1.36f, -3.91f, -3.17f);
        pathBuilder.curveToRelative(-0.1f, -0.48f, -0.5f, -0.83f, -0.99f, -0.83f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playForWork = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
