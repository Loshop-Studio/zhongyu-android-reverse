package androidx.compose.material.icons.rounded;

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
public final class FitnessCenterKt {
    private static ImageVector _fitnessCenter;

    public static final ImageVector getFitnessCenter(Icons.Rounded rounded) {
        ImageVector imageVector = _fitnessCenter;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FitnessCenter", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.57f, 14.86f);
        pathBuilder.lineToRelative(0.72f, -0.72f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-0.02f, -0.02f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(17.0f, 15.57f);
        pathBuilder.lineTo(8.43f, 7.0f);
        pathBuilder.lineToRelative(2.86f, -2.86f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-0.02f, -0.02f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-0.72f, 0.72f);
        pathBuilder.lineToRelative(-0.72f, -0.72f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilder.lineTo(5.57f, 4.14f);
        pathBuilder.lineToRelative(-0.72f, -0.72f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.04f, -0.39f, -1.43f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.04f, 0.0f, 1.43f);
        pathBuilder.lineToRelative(0.72f, 0.72f);
        pathBuilder.lineTo(2.71f, 7.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.72f, 0.72f);
        pathBuilder.lineToRelative(-0.72f, 0.73f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.02f, 0.02f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(7.0f, 8.43f);
        pathBuilder.lineTo(15.57f, 17.0f);
        pathBuilder.lineToRelative(-2.86f, 2.86f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.02f, 0.02f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.72f, -0.72f);
        pathBuilder.lineToRelative(0.72f, 0.72f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(1.43f, -1.43f);
        pathBuilder.lineToRelative(0.72f, 0.72f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.04f, 0.39f, 1.43f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.04f, 0.0f, -1.43f);
        pathBuilder.lineToRelative(-0.72f, -0.72f);
        pathBuilder.lineTo(21.29f, 17.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-0.72f, -0.73f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fitnessCenter = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
