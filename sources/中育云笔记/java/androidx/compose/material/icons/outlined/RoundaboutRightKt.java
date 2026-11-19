package androidx.compose.material.icons.outlined;

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
public final class RoundaboutRightKt {
    private static ImageVector _roundaboutRight;

    public static final ImageVector getRoundaboutRight(Icons.Outlined outlined) {
        ImageVector imageVector = _roundaboutRight;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RoundaboutRight", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.92f, 8.0f);
        pathBuilder.curveTo(13.44f, 5.16f, 10.97f, 3.0f, 8.0f, 3.0f);
        pathBuilder.curveTo(4.69f, 3.0f, 2.0f, 5.69f, 2.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 2.97f, 2.16f, 5.44f, 5.0f, 5.92f);
        pathBuilder.lineTo(7.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(0.0f, -6.09f);
        pathBuilder.curveToRelative(0.0f, -0.98f, -0.71f, -1.8f, -1.67f, -1.97f);
        pathBuilder.curveTo(5.44f, 12.63f, 4.0f, 10.98f, 4.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.curveToRelative(1.98f, 0.0f, 3.63f, 1.44f, 3.94f, 3.33f);
        pathBuilder.curveTo(12.11f, 9.29f, 12.93f, 10.0f, 13.91f, 10.0f);
        pathBuilder.lineToRelative(4.26f, 0.0f);
        pathBuilder.lineToRelative(-1.59f, 1.59f);
        pathBuilder.lineTo(18.0f, 13.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(18.17f, 8.0f);
        pathBuilder.lineTo(13.92f, 8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _roundaboutRight = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
