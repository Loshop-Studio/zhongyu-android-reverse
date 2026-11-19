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
public final class UmbrellaKt {
    private static ImageVector _umbrella;

    public static final ImageVector getUmbrella(Icons.Filled filled) {
        ImageVector imageVector = _umbrella;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Umbrella", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.5f, 6.92f);
        pathBuilder.lineTo(13.0f, 5.77f);
        pathBuilder.verticalLineTo(3.88f);
        pathBuilder.verticalLineTo(3.4f);
        pathBuilder.curveToRelative(0.0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.21f, 0.5f, 0.48f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(3.4f);
        pathBuilder.curveTo(16.0f, 2.07f, 14.88f, 1.0f, 13.5f, 1.0f);
        pathBuilder.curveTo(12.12f, 1.0f, 11.0f, 2.07f, 11.0f, 3.4f);
        pathBuilder.verticalLineToRelative(0.48f);
        pathBuilder.verticalLineToRelative(1.89f);
        pathBuilder.lineTo(9.5f, 6.92f);
        pathBuilder.lineTo(6.0f, 6.07f);
        pathBuilder.lineToRelative(5.05f, 15.25f);
        pathBuilder.curveTo(11.2f, 21.77f, 11.6f, 22.0f, 12.0f, 22.0f);
        pathBuilder.reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f);
        pathBuilder.lineTo(18.0f, 6.07f);
        pathBuilder.lineTo(14.5f, 6.92f);
        pathBuilder.close();
        pathBuilder.moveTo(13.28f, 8.5f);
        pathBuilder.lineToRelative(0.76f, 0.58f);
        pathBuilder.lineToRelative(0.92f, -0.23f);
        pathBuilder.lineTo(13.0f, 14.8f);
        pathBuilder.verticalLineTo(8.29f);
        pathBuilder.lineTo(13.28f, 8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(9.96f, 9.09f);
        pathBuilder.lineToRelative(0.76f, -0.58f);
        pathBuilder.lineTo(11.0f, 8.29f);
        pathBuilder.verticalLineToRelative(6.51f);
        pathBuilder.lineTo(9.03f, 8.86f);
        pathBuilder.lineTo(9.96f, 9.09f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _umbrella = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
