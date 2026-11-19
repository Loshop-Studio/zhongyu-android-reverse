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
public final class LocalActivityKt {
    private static ImageVector _localActivity;

    public static final ImageVector getLocalActivity(Icons.Rounded rounded) {
        ImageVector imageVector = _localActivity;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalActivity", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.76f, 0.43f, -1.42f, 1.06f, -1.76f);
        pathBuilder.curveToRelative(0.6f, -0.33f, 0.94f, -1.01f, 0.94f, -1.7f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.89f, -1.99f, 1.99f);
        pathBuilder.verticalLineToRelative(2.55f);
        pathBuilder.curveToRelative(0.0f, 0.69f, 0.33f, 1.37f, 0.94f, 1.69f);
        pathBuilder.curveTo(3.58f, 10.58f, 4.0f, 11.24f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-0.43f, 1.43f, -1.06f, 1.76f);
        pathBuilder.curveToRelative(-0.6f, 0.33f, -0.94f, 1.01f, -0.94f, 1.7f);
        pathBuilder.lineTo(2.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-2.54f);
        pathBuilder.curveToRelative(0.0f, -0.69f, -0.34f, -1.37f, -0.94f, -1.7f);
        pathBuilder.curveToRelative(-0.63f, -0.34f, -1.06f, -1.0f, -1.06f, -1.76f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 16.1f);
        pathBuilder.lineTo(12.0f, 14.5f);
        pathBuilder.lineToRelative(-2.5f, 1.61f);
        pathBuilder.curveToRelative(-0.38f, 0.24f, -0.87f, -0.11f, -0.75f, -0.55f);
        pathBuilder.lineToRelative(0.75f, -2.88f);
        pathBuilder.lineToRelative(-2.3f, -1.88f);
        pathBuilder.curveToRelative(-0.35f, -0.29f, -0.17f, -0.86f, 0.29f, -0.89f);
        pathBuilder.lineToRelative(2.96f, -0.17f);
        pathBuilder.lineToRelative(1.08f, -2.75f);
        pathBuilder.curveToRelative(0.17f, -0.42f, 0.77f, -0.42f, 0.93f, 0.0f);
        pathBuilder.lineToRelative(1.08f, 2.76f);
        pathBuilder.lineToRelative(2.96f, 0.17f);
        pathBuilder.curveToRelative(0.45f, 0.03f, 0.64f, 0.6f, 0.29f, 0.89f);
        pathBuilder.lineToRelative(-2.3f, 1.88f);
        pathBuilder.lineToRelative(0.76f, 2.86f);
        pathBuilder.curveToRelative(0.12f, 0.45f, -0.37f, 0.8f, -0.75f, 0.55f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localActivity = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
