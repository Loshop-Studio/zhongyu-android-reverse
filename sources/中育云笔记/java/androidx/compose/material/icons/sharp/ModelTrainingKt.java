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
public final class ModelTrainingKt {
    private static ImageVector _modelTraining;

    public static final ImageVector getModelTraining(Icons.Sharp sharp) {
        ImageVector imageVector = _modelTraining;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ModelTraining", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 13.5f);
        pathBuilder.curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(13.93f, 10.0f, 15.5f, 11.57f, 15.5f, 13.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 19.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(19.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 1.68f, -0.59f, 3.21f, -1.58f, 4.42f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.curveTo(20.18f, 17.27f, 21.0f, 15.23f, 21.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -2.74f, -1.23f, -5.19f, -3.16f, -6.84f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveTo(17.99f, 8.86f, 19.0f, 10.82f, 19.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 5.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 2.23f, 0.82f, 4.27f, 2.16f, 5.84f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder.curveTo(5.59f, 16.21f, 5.0f, 14.68f, 5.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(16.0f, 5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _modelTraining = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
