package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class YoutubeSearchedForKt {
    private static ImageVector _youtubeSearchedFor;

    public static final ImageVector getYoutubeSearchedFor(Icons.Rounded rounded) {
        ImageVector imageVector = _youtubeSearchedFor;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.YoutubeSearchedFor", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.01f, 14.0f);
        pathBuilder.horizontalLineToRelative(-0.8f);
        pathBuilder.lineToRelative(-0.27f, -0.27f);
        pathBuilder.curveToRelative(1.15f, -1.34f, 1.76f, -3.14f, 1.51f, -5.09f);
        pathBuilder.curveTo(17.11f, 6.0f, 15.1f, 3.78f, 12.5f, 3.18f);
        pathBuilder.curveTo(8.26f, 2.2f, 4.51f, 5.53f, 4.51f, 9.5f);
        pathBuilder.horizontalLineToRelative(-2.1f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.68f, 0.59f, -0.31f, 0.89f);
        pathBuilder.lineToRelative(3.4f, 2.75f);
        pathBuilder.curveToRelative(0.19f, 0.2f, 0.51f, 0.21f, 0.71f, 0.01f);
        pathBuilder.lineToRelative(2.9f, -2.79f);
        pathBuilder.curveToRelative(0.32f, -0.31f, 0.1f, -0.86f, -0.35f, -0.86f);
        pathBuilder.horizontalLineTo(6.51f);
        pathBuilder.curveToRelative(0.0f, -2.49f, 2.0f, -4.48f, 4.46f, -4.5f);
        pathBuilder.curveToRelative(2.44f, -0.02f, 4.54f, 2.05f, 4.54f, 4.49f);
        pathBuilder.curveToRelative(0.0f, 2.48f, -2.02f, 4.51f, -4.5f, 4.51f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.89f, -0.07f, -1.3f, -0.19f);
        pathBuilder.curveToRelative(-0.34f, -0.1f, -0.71f, 0.0f, -0.96f, 0.26f);
        pathBuilder.curveToRelative(-0.53f, 0.53f, -0.32f, 1.45f, 0.39f, 1.66f);
        pathBuilder.curveToRelative(0.59f, 0.17f, 1.22f, 0.27f, 1.87f, 0.27f);
        pathBuilder.curveToRelative(1.61f, 0.0f, 3.08f, -0.59f, 4.22f, -1.57f);
        pathBuilder.lineToRelative(0.27f, 0.27f);
        pathBuilder.verticalLineToRelative(0.79f);
        pathBuilder.lineToRelative(4.27f, 4.25f);
        pathBuilder.curveToRelative(0.41f, 0.41f, 1.07f, 0.41f, 1.48f, 0.0f);
        pathBuilder.curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        pathBuilder.lineTo(17.01f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _youtubeSearchedFor = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
