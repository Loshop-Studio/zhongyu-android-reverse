package androidx.compose.material.icons.outlined;

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
public final class SportsMotorsportsKt {
    private static ImageVector _sportsMotorsports;

    public static final ImageVector getSportsMotorsports(Icons.Outlined outlined) {
        ImageVector imageVector = _sportsMotorsports;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsMotorsports", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.96f, 11.22f);
        pathBuilder.curveTo(21.57f, 7.01f, 17.76f, 4.0f, 13.56f, 4.0f);
        pathBuilder.curveToRelative(-0.19f, 0.0f, -0.38f, 0.01f, -0.57f, 0.02f);
        pathBuilder.curveTo(2.0f, 4.74f, 2.0f, 17.2f, 2.0f, 17.2f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveTo(18.67f, 20.0f, 22.41f, 15.99f, 21.96f, 11.22f);
        pathBuilder.close();
        pathBuilder.moveTo(5.26f, 11.56f);
        pathBuilder.curveToRelative(0.57f, -1.29f, 1.28f, -2.35f, 2.14f, -3.19f);
        pathBuilder.lineToRelative(3.62f, 1.53f);
        pathBuilder.curveToRelative(0.6f, 0.25f, 0.98f, 0.83f, 0.98f, 1.48f);
        pathBuilder.curveToRelative(0.0f, 0.89f, -0.72f, 1.61f, -1.61f, 1.61f);
        pathBuilder.horizontalLineTo(4.72f);
        pathBuilder.curveTo(4.87f, 12.53f, 5.04f, 12.05f, 5.26f, 11.56f);
        pathBuilder.close();
        pathBuilder.moveTo(18.44f, 16.04f);
        pathBuilder.curveTo(17.3f, 17.29f, 15.68f, 18.0f, 14.0f, 18.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(-0.8f);
        pathBuilder.curveToRelative(0.0f, -0.02f, 0.01f, -0.92f, 0.24f, -2.2f);
        pathBuilder.horizontalLineToRelative(6.15f);
        pathBuilder.curveToRelative(1.99f, 0.0f, 3.61f, -1.62f, 3.61f, -3.61f);
        pathBuilder.curveToRelative(0.0f, -1.45f, -0.87f, -2.76f, -2.2f, -3.32f);
        pathBuilder.lineTo(9.3f, 7.01f);
        pathBuilder.curveToRelative(1.1f, -0.57f, 2.37f, -0.9f, 3.82f, -0.99f);
        pathBuilder.curveTo(13.27f, 6.0f, 13.42f, 6.0f, 13.56f, 6.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.13f, 2.37f, 6.41f, 5.41f);
        pathBuilder.curveTo(20.13f, 13.13f, 19.59f, 14.77f, 18.44f, 16.04f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsMotorsports = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
