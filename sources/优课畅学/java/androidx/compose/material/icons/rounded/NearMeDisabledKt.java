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
public final class NearMeDisabledKt {
    private static ImageVector _nearMeDisabled;

    public static final ImageVector getNearMeDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _nearMeDisabled;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NearMeDisabled", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.34f);
        pathBuilder.lineToRelative(6.95f, -2.58f);
        pathBuilder.curveToRelative(0.8f, -0.3f, 1.58f, 0.48f, 1.29f, 1.29f);
        pathBuilder.lineTo(17.66f, 12.0f);
        pathBuilder.lineTo(12.0f, 6.34f);
        pathBuilder.close();
        pathBuilder.moveTo(21.9f, 19.07f);
        pathBuilder.lineTo(4.93f, 2.1f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(4.36f, 4.36f);
        pathBuilder.lineToRelative(-4.2f, 1.56f);
        pathBuilder.curveTo(3.27f, 9.59f, 3.0f, 9.97f, 3.0f, 10.4f);
        pathBuilder.curveToRelative(0.0f, 0.42f, 0.26f, 0.8f, 0.65f, 0.96f);
        pathBuilder.lineToRelative(6.42f, 2.57f);
        pathBuilder.lineToRelative(2.57f, 6.42f);
        pathBuilder.curveTo(12.8f, 20.74f, 13.18f, 21.0f, 13.6f, 21.0f);
        pathBuilder.curveToRelative(0.43f, 0.0f, 0.82f, -0.27f, 0.97f, -0.67f);
        pathBuilder.lineToRelative(1.56f, -4.2f);
        pathBuilder.lineToRelative(4.36f, 4.36f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveTo(22.29f, 20.09f, 22.29f, 19.46f, 21.9f, 19.07f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearMeDisabled = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
