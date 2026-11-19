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
public final class TramKt {
    private static ImageVector _tram;

    public static final ImageVector getTram(Icons.Filled filled) {
        ImageVector imageVector = _tram;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Tram", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 16.94f);
        pathBuilder.lineTo(19.0f, 8.5f);
        pathBuilder.curveToRelative(0.0f, -2.79f, -2.61f, -3.4f, -6.01f, -3.49f);
        pathBuilder.lineToRelative(0.76f, -1.51f);
        pathBuilder.lineTo(17.0f, 3.5f);
        pathBuilder.lineTo(17.0f, 2.0f);
        pathBuilder.lineTo(7.0f, 2.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(4.75f);
        pathBuilder.lineToRelative(-0.76f, 1.52f);
        pathBuilder.curveTo(7.86f, 5.11f, 5.0f, 5.73f, 5.0f, 8.5f);
        pathBuilder.verticalLineToRelative(8.44f);
        pathBuilder.curveToRelative(0.0f, 1.45f, 1.19f, 2.66f, 2.59f, 2.97f);
        pathBuilder.lineTo(6.0f, 21.5f);
        pathBuilder.verticalLineToRelative(0.5f);
        pathBuilder.horizontalLineToRelative(2.23f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.lineTo(14.0f, 20.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.lineTo(16.5f, 20.0f);
        pathBuilder.horizontalLineToRelative(-0.08f);
        pathBuilder.curveToRelative(1.69f, 0.0f, 2.58f, -1.37f, 2.58f, -3.06f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 14.0f);
        pathBuilder.lineTo(7.0f, 14.0f);
        pathBuilder.lineTo(7.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tram = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
