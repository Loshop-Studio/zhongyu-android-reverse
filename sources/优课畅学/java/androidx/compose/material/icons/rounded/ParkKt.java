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
public final class ParkKt {
    private static ImageVector _park;

    public static final ImageVector getPark(Icons.Rounded rounded) {
        ImageVector imageVector = _park;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Park", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.96f, 12.0f);
        pathBuilder.horizontalLineToRelative(0.08f);
        pathBuilder.curveToRelative(0.81f, 0.0f, 1.28f, -0.91f, 0.82f, -1.57f);
        pathBuilder.lineToRelative(-5.08f, -7.25f);
        pathBuilder.curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0.0f);
        pathBuilder.lineTo(6.1f, 10.43f);
        pathBuilder.curveTo(5.64f, 11.09f, 6.12f, 12.0f, 6.93f, 12.0f);
        pathBuilder.horizontalLineToRelative(0.04f);
        pathBuilder.lineToRelative(-2.9f, 4.46f);
        pathBuilder.curveTo(3.63f, 17.12f, 4.11f, 18.0f, 4.91f, 18.0f);
        pathBuilder.horizontalLineToRelative(5.08f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveToRelative(0.0f, 1.09f, 0.89f, 1.98f, 1.98f, 1.98f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(1.09f, 0.0f, 1.98f, -0.89f, 1.98f, -1.98f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(5.15f);
        pathBuilder.curveToRelative(0.8f, 0.0f, 1.28f, -0.89f, 0.83f, -1.55f);
        pathBuilder.lineTo(16.96f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _park = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
