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
public final class EmojiObjectsKt {
    private static ImageVector _emojiObjects;

    public static final ImageVector getEmojiObjects(Icons.Rounded rounded) {
        ImageVector imageVector = _emojiObjects;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EmojiObjects", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveToRelative(-0.46f, 0.0f, -0.93f, 0.04f, -1.4f, 0.14f);
        pathBuilder.curveTo(7.84f, 3.67f, 5.64f, 5.9f, 5.12f, 8.66f);
        pathBuilder.curveToRelative(-0.48f, 2.61f, 0.48f, 5.01f, 2.22f, 6.56f);
        pathBuilder.curveTo(7.77f, 15.6f, 8.0f, 16.13f, 8.0f, 16.69f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(0.28f);
        pathBuilder.curveToRelative(0.35f, 0.6f, 0.98f, 1.0f, 1.72f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.38f, -0.4f, 1.72f, -1.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-2.31f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.22f, -1.09f, 0.64f, -1.46f);
        pathBuilder.curveTo(18.09f, 13.95f, 19.0f, 12.08f, 19.0f, 10.0f);
        pathBuilder.curveTo(19.0f, 6.13f, 15.87f, 3.0f, 12.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(-2.59f);
        pathBuilder.lineTo(9.67f, 9.59f);
        pathBuilder.lineToRelative(0.71f, -0.71f);
        pathBuilder.lineTo(12.0f, 10.5f);
        pathBuilder.lineToRelative(1.62f, -1.62f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineToRelative(-1.83f, 1.83f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 19.0f);
        pathBuilder.curveToRelative(-0.01f, 0.0f, -0.02f, -0.01f, -0.03f, -0.01f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(-2.94f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(-0.01f, 0.0f, -0.02f, 0.01f, -0.03f, 0.01f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.curveToRelative(0.01f, 0.0f, 0.02f, 0.01f, 0.03f, 0.01f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(2.94f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.01f, 0.0f, 0.02f, -0.01f, 0.03f, -0.01f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(14.0f, 18.78f, 13.78f, 19.0f, 13.5f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 17.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(14.0f, 16.78f, 13.78f, 17.0f, 13.5f, 17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiObjects = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
