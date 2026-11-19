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
public final class DoDisturbAltKt {
    private static ImageVector _doDisturbAlt;

    public static final ImageVector getDoDisturbAlt(Icons.Filled filled) {
        ImageVector imageVector = _doDisturbAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DoDisturbAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder.curveToRelative(0.0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f);
        pathBuilder.lineTo(16.9f, 18.31f);
        pathBuilder.curveTo(15.55f, 19.37f, 13.85f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.31f, 16.9f);
        pathBuilder.lineTo(7.1f, 5.69f);
        pathBuilder.curveTo(8.45f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder.curveTo(20.0f, 13.85f, 19.37f, 15.55f, 18.31f, 16.9f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doDisturbAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
