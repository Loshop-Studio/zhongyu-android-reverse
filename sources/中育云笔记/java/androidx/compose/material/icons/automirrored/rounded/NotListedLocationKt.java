package androidx.compose.material.icons.automirrored.rounded;

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
public final class NotListedLocationKt {
    private static ImageVector _notListedLocation;

    public static final ImageVector getNotListedLocation(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _notListedLocation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.NotListedLocation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        pathBuilder.curveToRelative(0.0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.22f);
        pathBuilder.curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f);
        pathBuilder.curveTo(17.55f, 17.12f, 20.0f, 13.38f, 20.0f, 10.2f);
        pathBuilder.curveTo(20.0f, 5.22f, 16.2f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.01f, 16.0f);
        pathBuilder.curveToRelative(-0.59f, 0.0f, -1.05f, -0.47f, -1.05f, -1.05f);
        pathBuilder.curveToRelative(0.0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f);
        pathBuilder.curveToRelative(0.59f, 0.0f, 1.04f, 0.45f, 1.04f, 1.04f);
        pathBuilder.curveTo(13.05f, 15.53f, 12.61f, 16.0f, 12.01f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.52f, 9.83f);
        pathBuilder.curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f);
        pathBuilder.curveToRelative(-0.08f, 0.14f, -0.13f, 0.26f, -0.16f, 0.49f);
        pathBuilder.curveToRelative(-0.05f, 0.39f, -0.36f, 0.68f, -0.75f, 0.68f);
        pathBuilder.horizontalLineToRelative(-0.03f);
        pathBuilder.curveToRelative(-0.44f, 0.0f, -0.79f, -0.38f, -0.75f, -0.82f);
        pathBuilder.curveToRelative(0.03f, -0.27f, 0.09f, -0.57f, 0.25f, -0.84f);
        pathBuilder.curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f);
        pathBuilder.curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f);
        pathBuilder.curveToRelative(-0.61f, 0.0f, -1.01f, 0.32f, -1.26f, 0.7f);
        pathBuilder.curveToRelative(-0.19f, 0.29f, -0.57f, 0.39f, -0.89f, 0.25f);
        pathBuilder.curveToRelative(-0.42f, -0.18f, -0.6f, -0.7f, -0.34f, -1.07f);
        pathBuilder.curveTo(10.03f, 6.55f, 10.88f, 6.0f, 12.0f, 6.0f);
        pathBuilder.curveToRelative(1.23f, 0.0f, 2.08f, 0.56f, 2.51f, 1.26f);
        pathBuilder.curveTo(14.87f, 7.87f, 15.09f, 8.99f, 14.52f, 9.83f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notListedLocation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
