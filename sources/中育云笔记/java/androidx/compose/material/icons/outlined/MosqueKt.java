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
public final class MosqueKt {
    private static ImageVector _mosque;

    public static final ImageVector getMosque(Icons.Outlined outlined) {
        ImageVector imageVector = _mosque;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Mosque", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(24.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 1.9f, -2.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.95f, -0.66f, -1.74f, -1.55f, -1.94f);
        pathBuilder.curveTo(17.79f, 8.48f, 18.0f, 7.81f, 18.0f, 7.09f);
        pathBuilder.curveToRelative(0.0f, -1.31f, -0.65f, -2.53f, -1.74f, -3.25f);
        pathBuilder.lineTo(12.0f, 1.0f);
        pathBuilder.lineTo(7.74f, 3.84f);
        pathBuilder.curveTo(6.65f, 4.56f, 6.0f, 5.78f, 6.0f, 7.09f);
        pathBuilder.curveToRelative(0.0f, 0.72f, 0.21f, 1.39f, 0.55f, 1.96f);
        pathBuilder.curveTo(5.66f, 9.26f, 5.0f, 10.05f, 5.0f, 11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineTo(8.72f);
        pathBuilder.curveTo(3.6f, 8.38f, 4.0f, 7.74f, 4.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(0.0f, 5.9f, 0.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineTo(8.72f);
        pathBuilder.curveTo(23.6f, 8.38f, 24.0f, 7.74f, 24.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.85f, 5.5f);
        pathBuilder.lineTo(12.0f, 3.4f);
        pathBuilder.lineToRelative(3.15f, 2.1f);
        pathBuilder.curveTo(15.68f, 5.86f, 16.0f, 6.45f, 16.0f, 7.09f);
        pathBuilder.curveTo(16.0f, 8.14f, 15.14f, 9.0f, 14.09f, 9.0f);
        pathBuilder.horizontalLineTo(9.91f);
        pathBuilder.curveTo(8.86f, 9.0f, 8.0f, 8.14f, 8.0f, 7.09f);
        pathBuilder.curveTo(8.0f, 6.45f, 8.32f, 5.86f, 8.85f, 5.5f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mosque = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
