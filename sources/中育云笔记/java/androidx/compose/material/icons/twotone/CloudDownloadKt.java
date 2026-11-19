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
public final class CloudDownloadKt {
    private static ImageVector _cloudDownload;

    public static final ImageVector getCloudDownload(Icons.TwoTone twoTone) {
        ImageVector imageVector = _cloudDownload;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CloudDownload", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.21f, 12.04f);
        pathBuilder.lineToRelative(-1.53f, -0.11f);
        pathBuilder.lineToRelative(-0.3f, -1.5f);
        pathBuilder.curveTo(16.88f, 7.86f, 14.62f, 6.0f, 12.0f, 6.0f);
        pathBuilder.curveTo(9.94f, 6.0f, 8.08f, 7.14f, 7.12f, 8.96f);
        pathBuilder.lineToRelative(-0.5f, 0.95f);
        pathBuilder.lineToRelative(-1.07f, 0.11f);
        pathBuilder.curveTo(3.53f, 10.24f, 2.0f, 11.95f, 2.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -1.55f, -1.22f, -2.86f, -2.79f, -2.96f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(2.55f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(2.91f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.lineToRelative(-4.0f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.35f, 10.04f);
        pathBuilder2.curveTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveTo(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        pathBuilder2.curveTo(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(13.0f);
        pathBuilder2.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder2.curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 18.0f);
        pathBuilder2.lineTo(6.0f, 18.0f);
        pathBuilder2.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder2.curveToRelative(0.0f, -2.05f, 1.53f, -3.76f, 3.56f, -3.97f);
        pathBuilder2.lineToRelative(1.07f, -0.11f);
        pathBuilder2.lineToRelative(0.5f, -0.95f);
        pathBuilder2.curveTo(8.08f, 7.14f, 9.94f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.curveToRelative(2.62f, 0.0f, 4.88f, 1.86f, 5.39f, 4.43f);
        pathBuilder2.lineToRelative(0.3f, 1.5f);
        pathBuilder2.lineToRelative(1.53f, 0.11f);
        pathBuilder2.curveToRelative(1.56f, 0.1f, 2.78f, 1.41f, 2.78f, 2.96f);
        pathBuilder2.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.45f, 10.0f);
        pathBuilder2.horizontalLineToRelative(-2.9f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.lineTo(8.0f, 13.0f);
        pathBuilder2.lineToRelative(4.0f, 4.0f);
        pathBuilder2.lineToRelative(4.0f, -4.0f);
        pathBuilder2.horizontalLineToRelative(-2.55f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudDownload = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
