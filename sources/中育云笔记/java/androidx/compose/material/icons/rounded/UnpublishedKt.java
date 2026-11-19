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
public final class UnpublishedKt {
    private static ImageVector _unpublished;

    public static final ImageVector getUnpublished(Icons.Rounded rounded) {
        ImageVector imageVector = _unpublished;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Unpublished", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.49f, 20.49f);
        pathBuilder.lineTo(3.51f, 3.51f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(1.56f, 1.56f);
        pathBuilder.curveToRelative(-1.25f, 1.88f, -1.88f, 4.21f, -1.59f, 6.7f);
        pathBuilder.curveToRelative(0.53f, 4.54f, 4.21f, 8.22f, 8.74f, 8.74f);
        pathBuilder.curveToRelative(2.49f, 0.29f, 4.81f, -0.34f, 6.7f, -1.59f);
        pathBuilder.lineToRelative(1.56f, 1.56f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        pathBuilder.close();
        pathBuilder.moveTo(9.88f, 15.89f);
        pathBuilder.lineToRelative(-2.83f, -2.83f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineToRelative(0.18f, -0.18f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(-0.88f, 0.88f);
        pathBuilder.curveTo(10.9f, 16.28f, 10.27f, 16.28f, 9.88f, 15.89f);
        pathBuilder.close();
        pathBuilder.moveTo(13.59f, 10.76f);
        pathBuilder.lineToRelative(-7.1f, -7.1f);
        pathBuilder.curveToRelative(1.88f, -1.25f, 4.21f, -1.88f, 6.7f, -1.59f);
        pathBuilder.curveToRelative(4.54f, 0.53f, 8.22f, 4.21f, 8.74f, 8.74f);
        pathBuilder.curveToRelative(0.29f, 2.49f, -0.34f, 4.82f, -1.59f, 6.7f);
        pathBuilder.lineToRelative(-5.34f, -5.34f);
        pathBuilder.lineToRelative(1.94f, -1.94f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(13.59f, 10.76f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unpublished = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
