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
public final class DirectionsOffKt {
    private static ImageVector _directionsOff;

    public static final ImageVector getDirectionsOff(Icons.Sharp sharp) {
        ImageVector imageVector = _directionsOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DirectionsOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 7.5f);
        pathBuilder.lineToRelative(3.5f, 3.5f);
        pathBuilder.lineToRelative(-1.33f, 1.34f);
        pathBuilder.lineToRelative(3.45f, 3.45f);
        pathBuilder.lineToRelative(3.79f, -3.79f);
        pathBuilder.lineToRelative(-10.4f, -10.42f);
        pathBuilder.lineToRelative(-3.8f, 3.8f);
        pathBuilder.lineToRelative(4.79f, 4.79f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(1.39f, 4.22f);
        pathBuilder2.lineToRelative(3.99f, 3.99f);
        pathBuilder2.lineToRelative(-3.79f, 3.79f);
        pathBuilder2.lineTo(12.01f, 22.4f);
        pathBuilder2.lineToRelative(3.79f, -3.79f);
        pathBuilder2.lineToRelative(3.99f, 3.99f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(2.81f, 2.81f);
        pathBuilder2.lineTo(1.39f, 4.22f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.99f, 12.82f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(-4.18f);
        pathBuilder2.lineTo(9.99f, 12.82f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
