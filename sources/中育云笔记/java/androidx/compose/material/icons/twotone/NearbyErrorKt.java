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
public final class NearbyErrorKt {
    private static ImageVector _nearbyError;

    public static final ImageVector getNearbyError(Icons.TwoTone twoTone) {
        ImageVector imageVector = _nearbyError;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NearbyError", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.57f);
        pathBuilder.lineToRelative(4.42f, 4.42f);
        pathBuilder.lineTo(12.0f, 16.41f);
        pathBuilder.lineToRelative(-4.42f, -4.42f);
        pathBuilder.lineTo(12.0f, 7.57f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.19f);
        pathBuilder.lineToRelative(-7.2f, -7.2f);
        pathBuilder.lineToRelative(7.2f, -7.2f);
        pathBuilder.lineToRelative(6.0f, 6.0f);
        pathBuilder.verticalLineTo(7.16f);
        pathBuilder.lineToRelative(-4.58f, -4.58f);
        pathBuilder.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilder.lineToRelative(-8.01f, 8.0f);
        pathBuilder.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder.lineToRelative(8.01f, 8.0f);
        pathBuilder.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilder.lineTo(18.0f, 16.82f);
        pathBuilder.verticalLineToRelative(-3.63f);
        pathBuilder.lineTo(12.0f, 19.19f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearbyError = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
