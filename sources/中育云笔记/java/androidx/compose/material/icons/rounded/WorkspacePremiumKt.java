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
public final class WorkspacePremiumKt {
    private static ImageVector _workspacePremium;

    public static final ImageVector getWorkspacePremium(Icons.Rounded rounded) {
        ImageVector imageVector = _workspacePremium;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WorkspacePremium", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.92f, 12.75f);
        pathBuilder.lineTo(12.0f, 11.93f);
        pathBuilder.lineToRelative(1.07f, 0.81f);
        pathBuilder.curveToRelative(0.39f, 0.29f, 0.92f, -0.08f, 0.78f, -0.55f);
        pathBuilder.lineToRelative(-0.42f, -1.36f);
        pathBuilder.lineToRelative(1.2f, -0.95f);
        pathBuilder.curveTo(15.0f, 9.6f, 14.79f, 9.0f, 14.31f, 9.0f);
        pathBuilder.horizontalLineToRelative(-1.4f);
        pathBuilder.lineToRelative(-0.43f, -1.34f);
        pathBuilder.curveToRelative(-0.15f, -0.46f, -0.8f, -0.46f, -0.95f, 0.0f);
        pathBuilder.lineTo(11.09f, 9.0f);
        pathBuilder.horizontalLineTo(9.68f);
        pathBuilder.curveTo(9.21f, 9.0f, 9.0f, 9.6f, 9.37f, 9.89f);
        pathBuilder.lineToRelative(1.19f, 0.95f);
        pathBuilder.lineToRelative(-0.42f, 1.36f);
        pathBuilder.curveTo(10.0f, 12.67f, 10.53f, 13.04f, 10.92f, 12.75f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 21.61f);
        pathBuilder.curveToRelative(0.0f, 0.68f, 0.67f, 1.16f, 1.32f, 0.95f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(4.68f, 1.56f);
        pathBuilder.curveTo(17.33f, 22.78f, 18.0f, 22.3f, 18.0f, 21.61f);
        pathBuilder.verticalLineToRelative(-6.33f);
        pathBuilder.curveToRelative(1.24f, -1.41f, 2.0f, -3.25f, 2.0f, -5.28f);
        pathBuilder.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 2.03f, 0.76f, 3.87f, 2.0f, 5.28f);
        pathBuilder.verticalLineTo(21.61f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveTo(8.69f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _workspacePremium = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
