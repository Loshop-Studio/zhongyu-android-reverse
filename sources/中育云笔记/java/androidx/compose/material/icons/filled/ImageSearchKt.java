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
public final class ImageSearchKt {
    private static ImageVector _imageSearch;

    public static final ImageVector getImageSearch(Icons.Filled filled) {
        ImageVector imageVector = _imageSearch;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ImageSearch", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(5.02f);
        pathBuilder.curveToRelative(0.05f, -0.71f, 0.22f, -1.38f, 0.48f, -2.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 18.0f);
        pathBuilder.horizontalLineToRelative(-11.0f);
        pathBuilder.lineToRelative(2.75f, -3.53f);
        pathBuilder.lineToRelative(1.96f, 2.36f);
        pathBuilder.lineToRelative(2.75f, -3.54f);
        pathBuilder.close();
        pathBuilder.moveTo(19.3f, 8.89f);
        pathBuilder.curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f);
        pathBuilder.curveTo(20.0f, 4.01f, 17.99f, 2.0f, 15.5f, 2.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 4.01f, 11.0f, 6.5f);
        pathBuilder.reflectiveCurveToRelative(2.01f, 4.5f, 4.49f, 4.5f);
        pathBuilder.curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f);
        pathBuilder.lineTo(21.0f, 13.42f);
        pathBuilder.lineTo(22.42f, 12.0f);
        pathBuilder.lineTo(19.3f, 8.89f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 9.0f);
        pathBuilder.curveTo(14.12f, 9.0f, 13.0f, 7.88f, 13.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(14.12f, 4.0f, 15.5f, 4.0f);
        pathBuilder.reflectiveCurveTo(18.0f, 5.12f, 18.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(16.88f, 9.0f, 15.5f, 9.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageSearch = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
