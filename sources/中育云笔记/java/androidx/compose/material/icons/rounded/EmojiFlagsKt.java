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
public final class EmojiFlagsKt {
    private static ImageVector _emojiFlags;

    public static final ImageVector getEmojiFlags(Icons.Rounded rounded) {
        ImageVector imageVector = _emojiFlags;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmojiFlags", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(-0.72f, -1.45f);
        pathBuilder.curveTo(13.11f, 7.21f, 12.76f, 7.0f, 12.38f, 7.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(5.72f);
        pathBuilder.curveTo(7.6f, 5.38f, 8.0f, 4.74f, 8.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(4.0f, 2.9f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.lineToRelative(0.72f, 1.45f);
        pathBuilder.curveToRelative(0.17f, 0.34f, 0.52f, 0.55f, 0.89f, 0.55f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.curveTo(20.0f, 9.45f, 19.55f, 9.0f, 19.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineToRelative(-1.0f, -2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.lineToRelative(1.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiFlags = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
