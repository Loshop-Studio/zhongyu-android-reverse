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
public final class CloudQueueKt {
    private static ImageVector _cloudQueue;

    public static final ImageVector getCloudQueue(Icons.TwoTone twoTone) {
        ImageVector imageVector = _cloudQueue;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CloudQueue", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.curveTo(17.5f, 8.46f, 15.04f, 6.0f, 12.0f, 6.0f);
        pathBuilder.curveToRelative(-2.52f, 0.0f, -4.63f, 1.69f, -5.29f, 4.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
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
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder2.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder2.horizontalLineToRelative(0.71f);
        pathBuilder2.curveTo(7.37f, 7.69f, 9.48f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.curveToRelative(3.04f, 0.0f, 5.5f, 2.46f, 5.5f, 5.5f);
        pathBuilder2.verticalLineToRelative(0.5f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudQueue = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
