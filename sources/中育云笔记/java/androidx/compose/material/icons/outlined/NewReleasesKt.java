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
public final class NewReleasesKt {
    private static ImageVector _newReleases;

    public static final ImageVector getNewReleases(Icons.Outlined outlined) {
        ImageVector imageVector = _newReleases;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NewReleases", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 12.0f);
        pathBuilder.lineToRelative(-2.44f, -2.78f);
        pathBuilder.lineToRelative(0.34f, -3.68f);
        pathBuilder.lineToRelative(-3.61f, -0.82f);
        pathBuilder.lineToRelative(-1.89f, -3.18f);
        pathBuilder.lineTo(12.0f, 3.0f);
        pathBuilder.lineTo(8.6f, 1.54f);
        pathBuilder.lineTo(6.71f, 4.72f);
        pathBuilder.lineToRelative(-3.61f, 0.81f);
        pathBuilder.lineToRelative(0.34f, 3.68f);
        pathBuilder.lineTo(1.0f, 12.0f);
        pathBuilder.lineToRelative(2.44f, 2.78f);
        pathBuilder.lineToRelative(-0.34f, 3.69f);
        pathBuilder.lineToRelative(3.61f, 0.82f);
        pathBuilder.lineToRelative(1.89f, 3.18f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(3.4f, 1.46f);
        pathBuilder.lineToRelative(1.89f, -3.18f);
        pathBuilder.lineToRelative(3.61f, -0.82f);
        pathBuilder.lineToRelative(-0.34f, -3.68f);
        pathBuilder.lineTo(23.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.49f, 14.11f);
        pathBuilder.lineToRelative(0.26f, 2.79f);
        pathBuilder.lineToRelative(-2.74f, 0.62f);
        pathBuilder.lineToRelative(-1.43f, 2.41f);
        pathBuilder.lineTo(12.0f, 18.82f);
        pathBuilder.lineToRelative(-2.58f, 1.11f);
        pathBuilder.lineToRelative(-1.43f, -2.41f);
        pathBuilder.lineToRelative(-2.74f, -0.62f);
        pathBuilder.lineToRelative(0.26f, -2.8f);
        pathBuilder.lineTo(3.66f, 12.0f);
        pathBuilder.lineToRelative(1.85f, -2.12f);
        pathBuilder.lineToRelative(-0.26f, -2.78f);
        pathBuilder.lineToRelative(2.74f, -0.61f);
        pathBuilder.lineToRelative(1.43f, -2.41f);
        pathBuilder.lineTo(12.0f, 5.18f);
        pathBuilder.lineToRelative(2.58f, -1.11f);
        pathBuilder.lineToRelative(1.43f, 2.41f);
        pathBuilder.lineToRelative(2.74f, 0.62f);
        pathBuilder.lineToRelative(-0.26f, 2.79f);
        pathBuilder.lineTo(20.34f, 12.0f);
        pathBuilder.lineToRelative(-1.85f, 2.11f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _newReleases = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
