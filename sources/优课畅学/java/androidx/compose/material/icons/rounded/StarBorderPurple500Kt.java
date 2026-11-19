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
public final class StarBorderPurple500Kt {
    private static ImageVector _starBorderPurple500;

    public static final ImageVector getStarBorderPurple500(Icons.Rounded rounded) {
        ImageVector imageVector = _starBorderPurple500;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StarBorderPurple500", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 8.89f);
        pathBuilder.lineTo(12.94f, 12.0f);
        pathBuilder.horizontalLineToRelative(2.82f);
        pathBuilder.lineToRelative(-2.27f, 1.62f);
        pathBuilder.lineToRelative(0.93f, 3.01f);
        pathBuilder.lineTo(12.0f, 14.79f);
        pathBuilder.lineToRelative(-2.42f, 1.84f);
        pathBuilder.lineToRelative(0.93f, -3.01f);
        pathBuilder.lineTo(8.24f, 12.0f);
        pathBuilder.horizontalLineToRelative(2.82f);
        pathBuilder.lineTo(12.0f, 8.89f);
        pathBuilder.moveTo(9.58f, 10.0f);
        pathBuilder.horizontalLineTo(5.12f);
        pathBuilder.curveToRelative(-0.97f, 0.0f, -1.37f, 1.25f, -0.58f, 1.81f);
        pathBuilder.lineToRelative(3.64f, 2.6f);
        pathBuilder.lineToRelative(-1.43f, 4.61f);
        pathBuilder.curveToRelative(-0.29f, 0.93f, 0.79f, 1.68f, 1.56f, 1.09f);
        pathBuilder.lineTo(12.0f, 17.31f);
        pathBuilder.lineToRelative(3.69f, 2.81f);
        pathBuilder.curveToRelative(0.77f, 0.59f, 1.85f, -0.16f, 1.56f, -1.09f);
        pathBuilder.lineToRelative(-1.43f, -4.61f);
        pathBuilder.lineToRelative(3.64f, -2.6f);
        pathBuilder.curveToRelative(0.79f, -0.57f, 0.39f, -1.81f, -0.58f, -1.81f);
        pathBuilder.horizontalLineToRelative(-4.46f);
        pathBuilder.lineToRelative(-1.47f, -4.84f);
        pathBuilder.curveToRelative(-0.29f, -0.95f, -1.63f, -0.95f, -1.91f, 0.0f);
        pathBuilder.lineTo(9.58f, 10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starBorderPurple500 = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
