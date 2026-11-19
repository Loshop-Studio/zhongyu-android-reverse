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
public final class SimCardDownloadKt {
    private static ImageVector _simCardDownload;

    public static final ImageVector getSimCardDownload(Icons.Rounded rounded) {
        ImageVector imageVector = _simCardDownload;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SimCardDownload", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-7.17f);
        pathBuilder.curveTo(10.3f, 2.0f, 9.79f, 2.21f, 9.41f, 2.59f);
        pathBuilder.lineTo(4.59f, 7.41f);
        pathBuilder.curveTo(4.21f, 7.79f, 4.0f, 8.3f, 4.0f, 8.83f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.65f, 16.65f);
        pathBuilder.lineToRelative(-2.79f, -2.79f);
        pathBuilder.curveTo(8.54f, 13.54f, 8.76f, 13.0f, 9.21f, 13.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineToRelative(-2.99f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.44f, -0.99f, 0.99f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(12.55f, 9.0f, 13.0f, 9.45f, 13.0f, 10.01f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(1.79f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.67f, 0.54f, 0.35f, 0.85f);
        pathBuilder.lineToRelative(-2.79f, 2.79f);
        pathBuilder.curveTo(12.16f, 16.84f, 11.84f, 16.84f, 11.65f, 16.65f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _simCardDownload = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
