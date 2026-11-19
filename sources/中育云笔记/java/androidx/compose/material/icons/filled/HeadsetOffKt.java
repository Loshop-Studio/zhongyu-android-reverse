package androidx.compose.material.icons.filled;

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
public final class HeadsetOffKt {
    private static ImageVector _headsetOff;

    public static final ImageVector getHeadsetOff(Icons.Filled filled) {
        ImageVector imageVector = _headsetOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HeadsetOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.92f);
        pathBuilder.lineTo(21.0f, 17.92f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -3.76f, 0.62f, -5.23f, 1.68f);
        pathBuilder.lineToRelative(1.44f, 1.44f);
        pathBuilder.curveTo(9.3f, 4.41f, 10.6f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.27f, 1.72f);
        pathBuilder.lineTo(1.0f, 3.0f);
        pathBuilder.lineToRelative(3.33f, 3.32f);
        pathBuilder.curveTo(3.49f, 7.68f, 3.0f, 9.29f, 3.0f, 11.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -1.17f, 0.29f, -2.26f, 0.79f, -3.22f);
        pathBuilder.lineTo(15.0f, 17.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.3f, 0.0f, 0.59f, -0.06f, 0.86f, -0.14f);
        pathBuilder.lineTo(21.0f, 23.0f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        pathBuilder.lineToRelative(-20.0f, -20.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _headsetOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
