package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class YoutubeSearchedForKt {
    private static ImageVector _youtubeSearchedFor;

    public static final ImageVector getYoutubeSearchedFor(Icons.TwoTone twoTone) {
        ImageVector imageVector = _youtubeSearchedFor;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.YoutubeSearchedFor", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.01f, 14.0f);
        pathBuilder.horizontalLineToRelative(-0.8f);
        pathBuilder.lineToRelative(-0.27f, -0.27f);
        pathBuilder.curveToRelative(0.98f, -1.14f, 1.57f, -2.61f, 1.57f, -4.23f);
        pathBuilder.curveToRelative(0.0f, -3.59f, -2.91f, -6.5f, -6.5f, -6.5f);
        pathBuilder.reflectiveCurveToRelative(-6.5f, 3.0f, -6.5f, 6.5f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.lineToRelative(3.84f, 4.0f);
        pathBuilder.lineToRelative(4.16f, -4.0f);
        pathBuilder.horizontalLineTo(6.51f);
        pathBuilder.curveTo(6.51f, 7.0f, 8.53f, 5.0f, 11.01f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(4.5f, 2.01f, 4.5f, 4.5f);
        pathBuilder.curveToRelative(0.0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f);
        pathBuilder.curveToRelative(-0.65f, 0.0f, -1.26f, -0.14f, -1.82f, -0.38f);
        pathBuilder.lineTo(7.71f, 15.1f);
        pathBuilder.curveToRelative(0.97f, 0.57f, 2.09f, 0.9f, 3.3f, 0.9f);
        pathBuilder.curveToRelative(1.61f, 0.0f, 3.08f, -0.59f, 4.22f, -1.57f);
        pathBuilder.lineToRelative(0.27f, 0.27f);
        pathBuilder.verticalLineToRelative(0.79f);
        pathBuilder.lineToRelative(5.01f, 4.99f);
        pathBuilder.lineTo(22.0f, 19.0f);
        pathBuilder.lineToRelative(-4.99f, -5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _youtubeSearchedFor = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
