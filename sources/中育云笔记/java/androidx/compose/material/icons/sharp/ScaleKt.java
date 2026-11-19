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
public final class ScaleKt {
    private static ImageVector _scale;

    public static final ImageVector getScale(Icons.Sharp sharp) {
        ImageVector imageVector = _scale;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Scale", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 11.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(4.56f, -0.58f, 8.0f, -3.1f, 8.0f, -6.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.curveToRelative(0.0f, 2.9f, 3.44f, 5.42f, 8.0f, 6.0f);
        pathBuilder.lineToRelative(0.0f, 3.0f);
        pathBuilder.curveToRelative(-3.68f, 0.73f, -8.0f, 3.61f, -8.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(4.13f);
        pathBuilder.curveToRelative(0.93f, -6.83f, 6.65f, -7.2f, 7.87f, -7.2f);
        pathBuilder.reflectiveCurveToRelative(6.94f, 0.37f, 7.87f, 7.2f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveTo(22.0f, 14.61f, 17.68f, 11.73f, 14.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 22.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.22f, -1.05f, 0.59f, -1.41f);
        pathBuilder.curveTo(11.39f, 17.79f, 16.0f, 16.0f, 16.0f, 16.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, 4.61f, -2.59f, 5.41f);
        pathBuilder.curveTo(13.05f, 21.78f, 12.55f, 22.0f, 12.0f, 22.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scale = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
