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
public final class ReportOffKt {
    private static ImageVector _reportOff;

    public static final ImageVector getReportOff(Icons.Rounded rounded) {
        ImageVector imageVector = _reportOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ReportOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.33f);
        pathBuilder.lineToRelative(7.2f, 7.2f);
        pathBuilder.lineToRelative(0.51f, -0.51f);
        pathBuilder.curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f);
        pathBuilder.verticalLineTo(8.68f);
        pathBuilder.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        pathBuilder.lineToRelative(-4.68f, -4.68f);
        pathBuilder.curveToRelative(-0.19f, -0.18f, -0.45f, -0.29f, -0.71f, -0.29f);
        pathBuilder.horizontalLineTo(8.68f);
        pathBuilder.curveToRelative(-0.26f, 0.0f, -0.52f, 0.11f, -0.7f, 0.29f);
        pathBuilder.lineToRelative(-0.51f, 0.51f);
        pathBuilder.lineToRelative(3.69f, 3.69f);
        pathBuilder.curveToRelative(0.17f, -0.29f, 0.48f, -0.49f, 0.84f, -0.49f);
        pathBuilder.close();
        pathBuilder.moveTo(2.41f, 1.58f);
        pathBuilder.lineTo(1.0f, 2.99f);
        pathBuilder.lineToRelative(3.64f, 3.64f);
        pathBuilder.lineToRelative(-1.35f, 1.35f);
        pathBuilder.curveToRelative(-0.18f, 0.18f, -0.29f, 0.44f, -0.29f, 0.7f);
        pathBuilder.verticalLineToRelative(6.63f);
        pathBuilder.curveToRelative(0.0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f);
        pathBuilder.lineToRelative(4.68f, 4.68f);
        pathBuilder.curveToRelative(0.19f, 0.19f, 0.45f, 0.3f, 0.71f, 0.3f);
        pathBuilder.horizontalLineToRelative(6.63f);
        pathBuilder.curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.71f, -0.29f);
        pathBuilder.lineToRelative(1.35f, -1.35f);
        pathBuilder.lineTo(21.01f, 23.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.41f, 1.58f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.3f);
        pathBuilder.curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f);
        pathBuilder.curveToRelative(0.0f, -0.72f, 0.58f, -1.3f, 1.3f, -1.3f);
        pathBuilder.reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f);
        pathBuilder.curveToRelative(0.0f, 0.72f, -0.58f, 1.3f, -1.3f, 1.3f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reportOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
