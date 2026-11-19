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
public final class NestCamWiredStandKt {
    private static ImageVector _nestCamWiredStand;

    public static final ImageVector getNestCamWiredStand(Icons.Sharp sharp) {
        ImageVector imageVector = _nestCamWiredStand;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NestCamWiredStand", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 0.85f);
        pathBuilder.lineTo(11.98f, 1.4f);
        pathBuilder.curveTo(8.95f, 1.7f, 6.37f, 4.0f, 6.04f, 7.03f);
        pathBuilder.curveToRelative(-0.39f, 3.57f, 2.2f, 6.69f, 5.68f, 7.04f);
        pathBuilder.lineToRelative(1.9f, 0.19f);
        pathBuilder.lineToRelative(-0.56f, 0.85f);
        pathBuilder.curveToRelative(-0.88f, -0.19f, -1.83f, -0.18f, -2.85f, 0.25f);
        pathBuilder.curveTo(8.21f, 16.21f, 7.0f, 18.25f, 7.0f, 20.41f);
        pathBuilder.lineTo(7.0f, 23.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -1.67f, -0.83f, -3.15f, -2.09f, -4.06f);
        pathBuilder.lineToRelative(0.97f, -1.45f);
        pathBuilder.lineTo(18.0f, 14.72f);
        pathBuilder.verticalLineTo(0.85f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nestCamWiredStand = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
