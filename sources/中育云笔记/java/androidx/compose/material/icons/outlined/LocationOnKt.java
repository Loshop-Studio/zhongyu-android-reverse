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
public final class LocationOnKt {
    private static ImageVector _locationOn;

    public static final ImageVector getLocationOn(Icons.Outlined outlined) {
        ImageVector imageVector = _locationOn;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocationOn", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(8.13f, 2.0f, 5.0f, 5.13f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, -7.75f, 7.0f, -13.0f);
        pathBuilder.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 2.88f, -2.88f, 7.19f, -5.0f, 9.88f);
        pathBuilder.curveTo(9.92f, 16.21f, 7.0f, 11.85f, 7.0f, 9.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 9.0f);
        pathBuilder2.moveToRelative(-2.5f, 0.0f);
        pathBuilder2.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        pathBuilder2.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationOn = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
