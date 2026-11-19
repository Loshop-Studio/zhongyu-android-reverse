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
public final class VideogameAssetOffKt {
    private static ImageVector _videogameAssetOff;

    public static final ImageVector getVideogameAssetOff(Icons.Outlined outlined) {
        ImageVector imageVector = _videogameAssetOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.VideogameAssetOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.5f, 9.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 11.33f, 16.0f, 10.5f);
        pathBuilder.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.83f, 8.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(-1.17f);
        pathBuilder.lineToRelative(1.87f, 1.87f);
        pathBuilder.curveTo(21.45f, 17.58f, 22.0f, 16.85f, 22.0f, 16.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(8.83f);
        pathBuilder.lineTo(10.83f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.78f, 22.61f);
        pathBuilder.lineTo(15.17f, 18.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -0.85f, 0.55f, -1.58f, 1.3f, -1.87f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(18.38f, 18.38f);
        pathBuilder.lineTo(19.78f, 22.61f);
        pathBuilder.close();
        pathBuilder.moveTo(13.17f, 16.0f);
        pathBuilder.lineToRelative(-3.0f, -3.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(9.83f);
        pathBuilder.lineTo(5.17f, 8.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineTo(13.17f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videogameAssetOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
