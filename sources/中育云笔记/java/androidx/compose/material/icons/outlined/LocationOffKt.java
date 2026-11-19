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
public final class LocationOffKt {
    private static ImageVector _locationOff;

    public static final ImageVector getLocationOff(Icons.Outlined outlined) {
        ImageVector imageVector = _locationOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocationOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 1.06f, -0.39f, 2.32f, -1.0f, 3.62f);
        pathBuilder.lineToRelative(1.49f, 1.49f);
        pathBuilder.curveTo(18.37f, 12.36f, 19.0f, 10.57f, 19.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilder.curveToRelative(-1.84f, 0.0f, -3.5f, 0.71f, -4.75f, 1.86f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.curveTo(9.56f, 4.5f, 10.72f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.5f);
        pathBuilder.curveToRelative(-0.59f, 0.0f, -1.13f, 0.21f, -1.56f, 0.56f);
        pathBuilder.lineToRelative(3.5f, 3.5f);
        pathBuilder.curveToRelative(0.35f, -0.43f, 0.56f, -0.97f, 0.56f, -1.56f);
        pathBuilder.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.close();
        pathBuilder.moveTo(3.41f, 2.86f);
        pathBuilder.lineTo(2.0f, 4.27f);
        pathBuilder.lineToRelative(3.18f, 3.18f);
        pathBuilder.curveTo(5.07f, 7.95f, 5.0f, 8.47f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        pathBuilder.reflectiveCurveToRelative(1.67f, -1.85f, 3.38f, -4.35f);
        pathBuilder.lineTo(18.73f, 21.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(3.41f, 2.86f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.88f);
        pathBuilder.curveToRelative(-2.01f, -2.58f, -4.8f, -6.74f, -4.98f, -9.59f);
        pathBuilder.lineToRelative(6.92f, 6.92f);
        pathBuilder.curveToRelative(-0.65f, 0.98f, -1.33f, 1.89f, -1.94f, 2.67f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
