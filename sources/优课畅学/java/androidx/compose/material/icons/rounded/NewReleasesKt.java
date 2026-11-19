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
public final class NewReleasesKt {
    private static ImageVector _newReleases;

    public static final ImageVector getNewReleases(Icons.Rounded rounded) {
        ImageVector imageVector = _newReleases;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NewReleases", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.42f, 11.34f);
        pathBuilder.lineToRelative(-1.86f, -2.12f);
        pathBuilder.lineToRelative(0.26f, -2.81f);
        pathBuilder.curveToRelative(0.05f, -0.5f, -0.29f, -0.96f, -0.77f, -1.07f);
        pathBuilder.lineToRelative(-2.76f, -0.63f);
        pathBuilder.lineToRelative(-1.44f, -2.43f);
        pathBuilder.curveToRelative(-0.26f, -0.43f, -0.79f, -0.61f, -1.25f, -0.41f);
        pathBuilder.lineTo(12.0f, 3.0f);
        pathBuilder.lineTo(9.41f, 1.89f);
        pathBuilder.curveToRelative(-0.46f, -0.2f, -1.0f, -0.02f, -1.25f, 0.41f);
        pathBuilder.lineTo(6.71f, 4.72f);
        pathBuilder.lineToRelative(-2.75f, 0.62f);
        pathBuilder.curveToRelative(-0.49f, 0.11f, -0.83f, 0.56f, -0.78f, 1.07f);
        pathBuilder.lineToRelative(0.26f, 2.8f);
        pathBuilder.lineToRelative(-1.86f, 2.13f);
        pathBuilder.curveToRelative(-0.33f, 0.38f, -0.33f, 0.94f, 0.0f, 1.32f);
        pathBuilder.lineToRelative(1.86f, 2.12f);
        pathBuilder.lineToRelative(-0.26f, 2.82f);
        pathBuilder.curveToRelative(-0.05f, 0.5f, 0.29f, 0.96f, 0.77f, 1.07f);
        pathBuilder.lineToRelative(2.76f, 0.63f);
        pathBuilder.lineToRelative(1.44f, 2.42f);
        pathBuilder.curveToRelative(0.26f, 0.43f, 0.79f, 0.61f, 1.26f, 0.41f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(2.59f, 1.11f);
        pathBuilder.curveToRelative(0.46f, 0.2f, 1.0f, 0.02f, 1.25f, -0.41f);
        pathBuilder.lineToRelative(1.44f, -2.43f);
        pathBuilder.lineToRelative(2.76f, -0.63f);
        pathBuilder.curveToRelative(0.49f, -0.11f, 0.82f, -0.57f, 0.77f, -1.07f);
        pathBuilder.lineToRelative(-0.26f, -2.81f);
        pathBuilder.lineToRelative(1.86f, -2.12f);
        pathBuilder.curveToRelative(0.34f, -0.36f, 0.34f, -0.92f, 0.01f, -1.3f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 13.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.lineTo(11.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _newReleases = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
