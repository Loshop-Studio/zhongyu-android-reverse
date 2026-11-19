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
public final class CompassCalibrationKt {
    private static ImageVector _compassCalibration;

    public static final ImageVector getCompassCalibration(Icons.Rounded rounded) {
        ImageVector imageVector = _compassCalibration;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CompassCalibration", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder.moveToRelative(-4.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 3.0f);
        pathBuilder2.curveTo(8.49f, 3.0f, 5.28f, 4.29f, 2.8f, 6.41f);
        pathBuilder2.curveToRelative(-0.44f, 0.38f, -0.48f, 1.06f, -0.06f, 1.48f);
        pathBuilder2.lineToRelative(3.6f, 3.6f);
        pathBuilder2.curveToRelative(0.36f, 0.36f, 0.92f, 0.39f, 1.32f, 0.08f);
        pathBuilder2.curveToRelative(1.2f, -0.94f, 2.71f, -1.5f, 4.34f, -1.5f);
        pathBuilder2.curveToRelative(1.64f, 0.0f, 3.14f, 0.56f, 4.34f, 1.49f);
        pathBuilder2.curveToRelative(0.4f, 0.31f, 0.96f, 0.28f, 1.31f, -0.08f);
        pathBuilder2.lineToRelative(3.6f, -3.6f);
        pathBuilder2.curveToRelative(0.42f, -0.42f, 0.38f, -1.1f, -0.07f, -1.48f);
        pathBuilder2.curveTo(18.72f, 4.28f, 15.51f, 3.0f, 12.0f, 3.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _compassCalibration = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
