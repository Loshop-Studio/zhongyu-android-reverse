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
public final class NoLuggageKt {
    private static ImageVector _noLuggage;

    public static final ImageVector getNoLuggage(Icons.Outlined outlined) {
        ImageVector imageVector = _noLuggage;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoLuggage", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 13.17f);
        pathBuilder.lineToRelative(-1.5f, -1.5f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineTo(13.17f);
        pathBuilder.close();
        pathBuilder.moveTo(19.78f, 22.61f);
        pathBuilder.lineToRelative(-1.85f, -1.85f);
        pathBuilder.curveTo(17.65f, 20.91f, 17.34f, 21.0f, 17.0f, 21.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(18.38f, 18.38f);
        pathBuilder.lineTo(19.78f, 22.61f);
        pathBuilder.close();
        pathBuilder.moveTo(16.17f, 19.0f);
        pathBuilder.lineToRelative(-3.42f, -3.42f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(-3.92f);
        pathBuilder.lineTo(9.5f, 12.33f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-7.17f);
        pathBuilder.lineToRelative(-1.0f, -1.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(16.17f);
        pathBuilder.close();
        pathBuilder.moveTo(12.75f, 9.0f);
        pathBuilder.horizontalLineToRelative(-0.92f);
        pathBuilder.lineToRelative(0.92f, 0.92f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 8.0f);
        pathBuilder.verticalLineToRelative(8.17f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(-6.17f);
        pathBuilder.lineTo(9.84f, 7.01f);
        pathBuilder.lineTo(9.0f, 6.17f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveTo(18.1f, 6.0f, 19.0f, 6.9f, 19.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.5f, 6.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noLuggage = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
