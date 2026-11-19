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
public final class ConnectedTvKt {
    private static ImageVector _connectedTv;

    public static final ImageVector getConnectedTv(Icons.Rounded rounded) {
        ImageVector imageVector = _connectedTv;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ConnectedTv", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 3.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilder.lineTo(22.0f, 5.0f);
        pathBuilder.curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 17.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 15.97f);
        pathBuilder.curveTo(6.98f, 14.89f, 6.11f, 14.02f, 5.03f, 14.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(15.97f);
        pathBuilder.close();
        pathBuilder.moveTo(5.62f, 12.55f);
        pathBuilder.curveToRelative(1.44f, 0.26f, 2.58f, 1.4f, 2.83f, 2.84f);
        pathBuilder.curveTo(8.51f, 15.75f, 8.82f, 16.0f, 9.18f, 16.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.46f, 0.0f, 0.82f, -0.41f, 0.75f, -0.86f);
        pathBuilder.curveToRelative(-0.36f, -2.07f, -1.99f, -3.7f, -4.06f, -4.06f);
        pathBuilder.curveTo(5.41f, 11.0f, 5.0f, 11.36f, 5.0f, 11.82f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(5.0f, 12.19f, 5.26f, 12.49f, 5.62f, 12.55f);
        pathBuilder.close();
        pathBuilder.moveTo(5.64f, 9.53f);
        pathBuilder.curveToRelative(3.07f, 0.3f, 5.52f, 2.75f, 5.83f, 5.82f);
        pathBuilder.curveToRelative(0.04f, 0.37f, 0.37f, 0.65f, 0.74f, 0.65f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.79f, -0.4f, 0.75f, -0.85f);
        pathBuilder.curveToRelative(-0.4f, -3.74f, -3.37f, -6.71f, -7.11f, -7.1f);
        pathBuilder.curveTo(5.4f, 8.0f, 5.0f, 8.34f, 5.0f, 8.79f);
        pathBuilder.curveTo(5.0f, 9.16f, 5.27f, 9.5f, 5.64f, 9.53f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectedTv = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
