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
public final class TroubleshootKt {
    private static ImageVector _troubleshoot;

    public static final ImageVector getTroubleshoot(Icons.Outlined outlined) {
        ImageVector imageVector = _troubleshoot;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Troubleshoot", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 20.59f);
        pathBuilder.lineToRelative(-4.69f, -4.69f);
        pathBuilder.curveTo(18.37f, 14.55f, 19.0f, 12.85f, 19.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilder.curveToRelative(-4.08f, 0.0f, -7.44f, 3.05f, -7.93f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveTo(5.57f, 7.17f, 8.03f, 5.0f, 11.0f, 5.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.curveToRelative(-2.42f, 0.0f, -4.5f, -1.44f, -5.45f, -3.5f);
        pathBuilder.horizontalLineTo(3.4f);
        pathBuilder.curveTo(4.45f, 16.69f, 7.46f, 19.0f, 11.0f, 19.0f);
        pathBuilder.curveToRelative(1.85f, 0.0f, 3.55f, -0.63f, 4.9f, -1.69f);
        pathBuilder.lineTo(20.59f, 22.0f);
        pathBuilder.lineTo(22.0f, 20.59f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.43f, 9.69f);
        pathBuilder2.lineToRelative(1.22f, 5.31f);
        pathBuilder2.lineToRelative(1.64f, 0.0f);
        pathBuilder2.lineToRelative(1.26f, -3.78f);
        pathBuilder2.lineToRelative(0.95f, 2.28f);
        pathBuilder2.lineToRelative(2.0f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, -1.5f);
        pathBuilder2.lineToRelative(-1.0f, 0.0f);
        pathBuilder2.lineToRelative(-1.25f, -3.0f);
        pathBuilder2.lineToRelative(-1.54f, 0.0f);
        pathBuilder2.lineToRelative(-1.12f, 3.37f);
        pathBuilder2.lineToRelative(-1.24f, -5.37f);
        pathBuilder2.lineToRelative(-1.65f, 0.0f);
        pathBuilder2.lineToRelative(-1.25f, 4.0f);
        pathBuilder2.lineToRelative(-5.45f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, 1.5f);
        pathBuilder2.lineToRelative(6.55f, 0.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _troubleshoot = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
