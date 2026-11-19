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
public final class VideoCameraFrontKt {
    private static ImageVector _videoCameraFront;

    public static final ImageVector getVideoCameraFront(Icons.Sharp sharp) {
        ImageVector imageVector = _videoCameraFront;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.VideoCameraFront", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 10.48f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-6.48f);
        pathBuilder.lineToRelative(4.0f, 3.98f);
        pathBuilder.verticalLineToRelative(-11.0f);
        pathBuilder.lineTo(18.0f, 10.48f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 8.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(8.9f, 8.0f, 10.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 16.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(-0.57f);
        pathBuilder.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        pathBuilder.curveTo(8.07f, 13.21f, 9.01f, 13.0f, 10.0f, 13.0f);
        pathBuilder.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        pathBuilder.curveTo(13.52f, 13.9f, 14.0f, 14.62f, 14.0f, 15.43f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videoCameraFront = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
