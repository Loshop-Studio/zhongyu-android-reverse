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
public final class AddAPhotoKt {
    private static ImageVector _addAPhoto;

    public static final ImageVector getAddAPhoto(Icons.Filled filled) {
        ImageVector imageVector = _addAPhoto;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddAPhoto", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 4.0f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(0.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 10.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.lineToRelative(1.83f, 2.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 19.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveTo(10.24f, 19.0f, 13.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.8f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 1.77f, 1.43f, 3.2f, 3.2f, 3.2f);
        pathBuilder.reflectiveCurveToRelative(3.2f, -1.43f, 3.2f, -3.2f);
        pathBuilder.reflectiveCurveToRelative(-1.43f, -3.2f, -3.2f, -3.2f);
        pathBuilder.reflectiveCurveTo(9.8f, 12.23f, 9.8f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAPhoto = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
