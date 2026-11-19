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
public final class CropRotateKt {
    private static ImageVector _cropRotate;

    public static final ImageVector getCropRotate(Icons.TwoTone twoTone) {
        ImageVector imageVector = _cropRotate;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CropRotate", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.95f, 24.0f);
        pathBuilder.curveToRelative(0.23f, 0.0f, 0.44f, -0.02f, 0.66f, -0.03f);
        pathBuilder.lineTo(8.8f, 20.15f);
        pathBuilder.lineToRelative(-1.33f, 1.34f);
        pathBuilder.curveTo(4.2f, 19.93f, 1.86f, 16.76f, 1.5f, 13.0f);
        pathBuilder.lineTo(0.0f, 13.0f);
        pathBuilder.curveToRelative(0.51f, 6.16f, 5.66f, 11.0f, 11.95f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.05f, 0.0f);
        pathBuilder.curveToRelative(-0.23f, 0.0f, -0.44f, 0.02f, -0.66f, 0.04f);
        pathBuilder.lineToRelative(3.81f, 3.81f);
        pathBuilder.lineToRelative(1.33f, -1.33f);
        pathBuilder.curveTo(19.8f, 4.07f, 22.14f, 7.24f, 22.5f, 11.0f);
        pathBuilder.lineTo(24.0f, 11.0f);
        pathBuilder.curveToRelative(-0.51f, -6.16f, -5.66f, -11.0f, -11.95f, -11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(18.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(8.0f, 16.0f);
        pathBuilder.lineTo(8.0f, 4.0f);
        pathBuilder.lineTo(6.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cropRotate = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
