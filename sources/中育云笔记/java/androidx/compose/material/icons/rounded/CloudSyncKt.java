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
public final class CloudSyncKt {
    private static ImageVector _cloudSync;

    public static final ImageVector getCloudSync(Icons.Rounded rounded) {
        ImageVector imageVector = _cloudSync;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CloudSync", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(24.0f, 17.48f);
        pathBuilder.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder.lineTo(15.0f, 20.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -1.6f, 1.26f, -2.9f, 2.84f, -2.98f);
        pathBuilder.curveTo(15.4f, 12.83f, 16.6f, 12.0f, 18.0f, 12.0f);
        pathBuilder.curveToRelative(1.76f, 0.0f, 3.2f, 1.3f, 3.45f, 2.99f);
        pathBuilder.curveToRelative(0.02f, 0.0f, 0.03f, -0.01f, 0.05f, -0.01f);
        pathBuilder.curveTo(22.88f, 14.98f, 24.0f, 16.1f, 24.0f, 17.48f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 15.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.44f);
        pathBuilder.curveToRelative(-1.22f, -1.1f, -2.0f, -2.67f, -2.0f, -4.44f);
        pathBuilder.curveToRelative(0.0f, -2.38f, 1.39f, -4.43f, 3.4f, -5.4f);
        pathBuilder.curveTo(9.77f, 6.42f, 10.0f, 6.04f, 10.0f, 5.63f);
        pathBuilder.curveToRelative(0.0f, -0.71f, -0.73f, -1.18f, -1.37f, -0.88f);
        pathBuilder.curveTo(5.89f, 6.03f, 4.0f, 8.79f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.4f, 1.06f, 4.54f, 2.73f, 6.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(7.56f);
        pathBuilder.curveToRelative(0.98f, 0.89f, 1.68f, 2.08f, 1.92f, 3.44f);
        pathBuilder.lineToRelative(2.02f, 0.0f);
        pathBuilder.curveToRelative(-0.25f, -1.99f, -1.23f, -3.74f, -2.66f, -5.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudSync = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
