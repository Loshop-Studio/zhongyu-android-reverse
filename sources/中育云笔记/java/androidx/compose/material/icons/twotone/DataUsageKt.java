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
public final class DataUsageKt {
    private static ImageVector _dataUsage;

    public static final ImageVector getDataUsage(Icons.TwoTone twoTone) {
        ImageVector imageVector = _dataUsage;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DataUsage", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 2.05f);
        pathBuilder.verticalLineToRelative(3.03f);
        pathBuilder.curveToRelative(3.39f, 0.49f, 6.0f, 3.39f, 6.0f, 6.92f);
        pathBuilder.curveToRelative(0.0f, 0.9f, -0.18f, 1.75f, -0.48f, 2.54f);
        pathBuilder.lineToRelative(2.6f, 1.53f);
        pathBuilder.curveToRelative(0.56f, -1.24f, 0.88f, -2.62f, 0.88f, -4.07f);
        pathBuilder.curveToRelative(0.0f, -5.18f, -3.95f, -9.45f, -9.0f, -9.95f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        pathBuilder.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilder.curveToRelative(0.0f, -3.53f, 2.61f, -6.43f, 6.0f, -6.92f);
        pathBuilder.verticalLineTo(2.05f);
        pathBuilder.curveToRelative(-5.06f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.24f, -1.61f, 8.06f, -4.09f);
        pathBuilder.lineToRelative(-2.6f, -1.53f);
        pathBuilder.curveTo(16.17f, 17.98f, 14.21f, 19.0f, 12.0f, 19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataUsage = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
