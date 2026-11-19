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
public final class AutoGraphKt {
    private static ImageVector _autoGraph;

    public static final ImageVector getAutoGraph(Icons.Rounded rounded) {
        ImageVector imageVector = _autoGraph;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AutoGraph", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.06f, 9.94f);
        pathBuilder.lineTo(13.0f, 9.45f);
        pathBuilder.curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(1.06f, -0.49f);
        pathBuilder.lineTo(14.55f, 7.0f);
        pathBuilder.curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f);
        pathBuilder.lineToRelative(0.49f, 1.06f);
        pathBuilder.lineTo(17.0f, 8.55f);
        pathBuilder.curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(-1.06f, 0.49f);
        pathBuilder.lineTo(15.45f, 11.0f);
        pathBuilder.curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0.0f);
        pathBuilder.lineTo(14.06f, 9.94f);
        pathBuilder.close();
        pathBuilder.moveTo(4.45f, 13.0f);
        pathBuilder.lineToRelative(0.49f, -1.06f);
        pathBuilder.lineTo(6.0f, 11.45f);
        pathBuilder.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(-1.06f, -0.49f);
        pathBuilder.lineTo(4.45f, 9.0f);
        pathBuilder.curveTo(4.28f, 8.61f, 3.72f, 8.61f, 3.55f, 9.0f);
        pathBuilder.lineToRelative(-0.49f, 1.06f);
        pathBuilder.lineTo(2.0f, 10.55f);
        pathBuilder.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(1.06f, 0.49f);
        pathBuilder.lineTo(3.55f, 13.0f);
        pathBuilder.curveTo(3.72f, 13.39f, 4.28f, 13.39f, 4.45f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.96f, 7.99f);
        pathBuilder.lineToRelative(0.63f, -1.4f);
        pathBuilder.lineToRelative(1.4f, -0.63f);
        pathBuilder.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(-1.4f, -0.63f);
        pathBuilder.lineToRelative(-0.63f, -1.4f);
        pathBuilder.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        pathBuilder.lineToRelative(-0.63f, 1.4f);
        pathBuilder.lineToRelative(-1.4f, 0.63f);
        pathBuilder.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(1.4f, 0.63f);
        pathBuilder.lineToRelative(0.63f, 1.4f);
        pathBuilder.curveTo(8.22f, 8.38f, 8.78f, 8.38f, 8.96f, 7.99f);
        pathBuilder.close();
        pathBuilder.moveTo(22.34f, 8.27f);
        pathBuilder.curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f);
        pathBuilder.lineToRelative(-6.39f, 7.18f);
        pathBuilder.lineToRelative(-3.29f, -3.29f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-6.04f, 6.05f);
        pathBuilder.curveToRelative(-0.41f, 0.41f, -0.41f, 1.09f, 0.0f, 1.5f);
        pathBuilder.curveToRelative(0.41f, 0.41f, 1.09f, 0.41f, 1.5f, 0.0f);
        pathBuilder.lineToRelative(5.25f, -5.26f);
        pathBuilder.lineToRelative(3.25f, 3.25f);
        pathBuilder.curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f);
        pathBuilder.lineToRelative(7.17f, -8.07f);
        pathBuilder.curveTo(22.73f, 9.24f, 22.71f, 8.64f, 22.34f, 8.27f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoGraph = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
