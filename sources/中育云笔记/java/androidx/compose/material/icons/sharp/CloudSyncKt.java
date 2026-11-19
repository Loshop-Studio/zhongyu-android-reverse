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
public final class CloudSyncKt {
    private static ImageVector _cloudSync;

    public static final ImageVector getCloudSync(Icons.Sharp sharp) {
        ImageVector imageVector = _cloudSync;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CloudSync", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.5f, 14.98f);
        pathBuilder.curveToRelative(-0.02f, 0.0f, -0.03f, 0.0f, -0.05f, 0.01f);
        pathBuilder.curveTo(21.2f, 13.3f, 19.76f, 12.0f, 18.0f, 12.0f);
        pathBuilder.curveToRelative(-1.4f, 0.0f, -2.6f, 0.83f, -3.16f, 2.02f);
        pathBuilder.curveTo(13.26f, 14.1f, 12.0f, 15.4f, 12.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.lineToRelative(6.5f, -0.02f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(22.88f, 14.98f, 21.5f, 14.98f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 4.26f);
        pathBuilder.verticalLineToRelative(2.09f);
        pathBuilder.curveTo(7.67f, 7.18f, 6.0f, 9.39f, 6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.77f, 0.78f, 3.34f, 2.0f, 4.44f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.73f);
        pathBuilder.curveTo(5.06f, 16.54f, 4.0f, 14.4f, 4.0f, 12.0f);
        pathBuilder.curveTo(4.0f, 8.27f, 6.55f, 5.15f, 10.0f, 4.26f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-2.73f);
        pathBuilder.curveToRelative(1.43f, 1.26f, 2.41f, 3.01f, 2.66f, 5.0f);
        pathBuilder.lineToRelative(-2.02f, 0.0f);
        pathBuilder.curveTo(17.68f, 9.64f, 16.98f, 8.45f, 16.0f, 7.56f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudSync = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
