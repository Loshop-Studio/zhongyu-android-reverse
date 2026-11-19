package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class DataUsageKt {
    private static ImageVector _dataUsage;

    public static final ImageVector getDataUsage(Icons.Rounded rounded) {
        ImageVector imageVector = _dataUsage;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DataUsage", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 3.87f);
        pathBuilder.verticalLineToRelative(0.02f);
        pathBuilder.curveToRelative(0.0f, 0.67f, 0.45f, 1.23f, 1.08f, 1.43f);
        pathBuilder.curveTo(16.93f, 6.21f, 19.0f, 8.86f, 19.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.52f, -0.06f, 1.01f, -0.17f, 1.49f);
        pathBuilder.curveToRelative(-0.14f, 0.64f, 0.12f, 1.3f, 0.69f, 1.64f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.curveToRelative(0.86f, 0.5f, 1.98f, 0.05f, 2.21f, -0.91f);
        pathBuilder.curveToRelative(0.17f, -0.72f, 0.26f, -1.47f, 0.26f, -2.23f);
        pathBuilder.curveToRelative(0.0f, -4.5f, -2.98f, -8.32f, -7.08f, -9.57f);
        pathBuilder.curveToRelative(-0.95f, -0.29f, -1.92f, 0.44f, -1.92f, 1.44f);
        pathBuilder.close();
        pathBuilder.moveTo(10.94f, 18.92f);
        pathBuilder.curveToRelative(-2.99f, -0.43f, -5.42f, -2.86f, -5.86f, -5.84f);
        pathBuilder.curveToRelative(-0.54f, -3.6f, 1.66f, -6.77f, 4.83f, -7.76f);
        pathBuilder.curveToRelative(0.64f, -0.19f, 1.09f, -0.76f, 1.09f, -1.43f);
        pathBuilder.verticalLineToRelative(-0.02f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -0.97f, -1.73f, -1.93f, -1.44f);
        pathBuilder.curveToRelative(-4.51f, 1.38f, -7.66f, 5.86f, -6.98f, 10.96f);
        pathBuilder.curveToRelative(0.59f, 4.38f, 4.13f, 7.92f, 8.51f, 8.51f);
        pathBuilder.curveToRelative(3.14f, 0.42f, 6.04f, -0.61f, 8.13f, -2.53f);
        pathBuilder.curveToRelative(0.74f, -0.68f, 0.61f, -1.89f, -0.26f, -2.39f);
        pathBuilder.curveToRelative(-0.58f, -0.34f, -1.3f, -0.23f, -1.8f, 0.22f);
        pathBuilder.curveToRelative(-1.47f, 1.34f, -3.51f, 2.05f, -5.73f, 1.72f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataUsage = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
