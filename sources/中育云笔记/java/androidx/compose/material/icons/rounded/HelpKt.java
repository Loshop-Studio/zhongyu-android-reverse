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
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class HelpKt {
    private static ImageVector _help;

    public static final ImageVector getHelp(Icons.Rounded rounded) {
        ImageVector imageVector = _help;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Help", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder.moveTo(13.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.07f, 11.25f);
        pathBuilder.lineToRelative(-0.9f, 0.92f);
        pathBuilder.curveToRelative(-0.5f, 0.51f, -0.86f, 0.97f, -1.04f, 1.69f);
        pathBuilder.curveToRelative(-0.08f, 0.32f, -0.13f, 0.68f, -0.13f, 1.14f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.curveToRelative(0.0f, -0.46f, 0.08f, -0.9f, 0.22f, -1.31f);
        pathBuilder.curveToRelative(0.2f, -0.58f, 0.53f, -1.1f, 0.95f, -1.52f);
        pathBuilder.lineToRelative(1.24f, -1.26f);
        pathBuilder.curveToRelative(0.46f, -0.44f, 0.68f, -1.1f, 0.55f, -1.8f);
        pathBuilder.curveToRelative(-0.13f, -0.72f, -0.69f, -1.33f, -1.39f, -1.53f);
        pathBuilder.curveToRelative(-1.11f, -0.31f, -2.14f, 0.32f, -2.47f, 1.27f);
        pathBuilder.curveToRelative(-0.12f, 0.37f, -0.43f, 0.65f, -0.82f, 0.65f);
        pathBuilder.horizontalLineToRelative(-0.3f);
        pathBuilder.curveTo(8.4f, 9.0f, 8.0f, 8.44f, 8.16f, 7.88f);
        pathBuilder.curveToRelative(0.43f, -1.47f, 1.68f, -2.59f, 3.23f, -2.83f);
        pathBuilder.curveToRelative(1.52f, -0.24f, 2.97f, 0.55f, 3.87f, 1.8f);
        pathBuilder.curveToRelative(1.18f, 1.63f, 0.83f, 3.38f, -0.19f, 4.4f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _help = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getHelp$annotations(Icons.Rounded rounded) {
    }
}
