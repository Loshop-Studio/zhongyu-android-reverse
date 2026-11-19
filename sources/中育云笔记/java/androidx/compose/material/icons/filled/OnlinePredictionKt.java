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
public final class OnlinePredictionKt {
    private static ImageVector _onlinePrediction;

    public static final ImageVector getOnlinePrediction(Icons.Filled filled) {
        ImageVector imageVector = _onlinePrediction;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.OnlinePrediction", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 11.5f);
        pathBuilder.curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        pathBuilder.curveTo(8.5f, 9.57f, 10.07f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(15.5f, 9.57f, 15.5f, 11.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -1.12f, -5.26f, -2.93f, -7.07f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.curveTo(19.55f, 7.53f, 20.5f, 9.66f, 20.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.34f, -0.95f, 4.47f, -2.49f, 6.01f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.curveTo(20.88f, 17.26f, 22.0f, 14.76f, 22.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.34f, 0.95f, -4.47f, 2.49f, -6.01f);
        pathBuilder.lineTo(4.93f, 4.93f);
        pathBuilder.curveTo(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 1.12f, 5.26f, 2.93f, 7.07f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.curveTo(4.45f, 16.47f, 3.5f, 14.34f, 3.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.52f, -0.62f, 2.89f, -1.61f, 3.89f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.curveTo(18.22f, 15.68f, 19.0f, 13.93f, 19.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.93f, -0.78f, -3.68f, -2.05f, -4.95f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.curveTo(16.88f, 9.11f, 17.5f, 10.48f, 17.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.05f, 16.95f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.curveToRelative(-1.0f, -1.0f, -1.61f, -2.37f, -1.61f, -3.89f);
        pathBuilder.curveToRelative(0.0f, -1.52f, 0.62f, -2.89f, 1.61f, -3.89f);
        pathBuilder.lineTo(7.05f, 7.05f);
        pathBuilder.curveTo(5.78f, 8.32f, 5.0f, 10.07f, 5.0f, 12.0f);
        pathBuilder.curveTo(5.0f, 13.93f, 5.78f, 15.68f, 7.05f, 16.95f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _onlinePrediction = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
