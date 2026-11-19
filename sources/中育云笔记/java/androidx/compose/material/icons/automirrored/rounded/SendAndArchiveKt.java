package androidx.compose.material.icons.automirrored.rounded;

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
public final class SendAndArchiveKt {
    private static ImageVector _sendAndArchive;

    public static final ImageVector getSendAndArchive(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _sendAndArchive;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.SendAndArchive", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 12.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.15f, 17.85f);
        pathBuilder.lineToRelative(-1.79f, 1.79f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
        pathBuilder.lineToRelative(-1.79f, -1.79f);
        pathBuilder.curveTo(14.54f, 17.54f, 14.76f, 17.0f, 15.21f, 17.0f);
        pathBuilder.horizontalLineToRelative(1.29f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.horizontalLineToRelative(1.29f);
        pathBuilder.curveTo(19.24f, 17.0f, 19.46f, 17.54f, 19.15f, 17.85f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.0f, 10.0f);
        pathBuilder2.curveToRelative(0.1f, 0.0f, 0.19f, 0.01f, 0.28f, 0.01f);
        pathBuilder2.lineTo(3.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.lineToRelative(8.0f, 2.0f);
        pathBuilder2.lineToRelative(-8.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.lineToRelative(7.0f, -2.95f);
        pathBuilder2.curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f);
        pathBuilder2.curveTo(10.0f, 13.13f, 13.13f, 10.0f, 17.0f, 10.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sendAndArchive = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
