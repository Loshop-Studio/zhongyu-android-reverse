package androidx.compose.material.icons.outlined;

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
public final class ClosedCaptionDisabledKt {
    private static ImageVector _closedCaptionDisabled;

    public static final ImageVector getClosedCaptionDisabled(Icons.Outlined outlined) {
        ImageVector imageVector = _closedCaptionDisabled;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ClosedCaptionDisabled", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.lineTo(13.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 13.5f);
        pathBuilder.lineToRelative(1.21f, 1.21f);
        pathBuilder.curveTo(17.89f, 14.52f, 18.0f, 14.27f, 18.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineTo(13.5f);
        pathBuilder.close();
        pathBuilder.moveTo(8.83f, 6.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineToRelative(10.17f);
        pathBuilder.lineToRelative(1.98f, 1.98f);
        pathBuilder.curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.16f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(6.83f);
        pathBuilder.lineTo(8.83f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.78f, 22.61f);
        pathBuilder.lineTo(17.17f, 20.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(18.38f, 18.38f);
        pathBuilder.lineTo(19.78f, 22.61f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 13.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(0.67f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.horizontalLineTo(7.5f);
        pathBuilder.verticalLineTo(13.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.17f, 18.0f);
        pathBuilder.lineTo(11.0f, 13.83f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.32f, 0.16f, -0.59f, 0.4f, -0.78f);
        pathBuilder.lineTo(5.0f, 7.83f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineTo(15.17f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _closedCaptionDisabled = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
