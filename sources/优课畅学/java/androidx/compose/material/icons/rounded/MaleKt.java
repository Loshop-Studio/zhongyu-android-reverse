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
public final class MaleKt {
    private static ImageVector _male;

    public static final ImageVector getMale(Icons.Rounded rounded) {
        ImageVector imageVector = _male;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Male", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.58f);
        pathBuilder.lineToRelative(-3.97f, 3.97f);
        pathBuilder.curveTo(11.73f, 9.36f, 10.66f, 9.0f, 9.5f, 9.0f);
        pathBuilder.curveTo(6.46f, 9.0f, 4.0f, 11.46f, 4.0f, 14.5f);
        pathBuilder.curveTo(4.0f, 17.54f, 6.46f, 20.0f, 9.5f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f);
        pathBuilder.curveToRelative(0.0f, -1.16f, -0.36f, -2.23f, -0.97f, -3.12f);
        pathBuilder.lineTo(18.0f, 7.42f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(20.0f, 4.45f, 19.55f, 4.0f, 19.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 18.0f);
        pathBuilder.curveTo(7.57f, 18.0f, 6.0f, 16.43f, 6.0f, 14.5f);
        pathBuilder.curveTo(6.0f, 12.57f, 7.57f, 11.0f, 9.5f, 11.0f);
        pathBuilder.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.curveTo(13.0f, 16.43f, 11.43f, 18.0f, 9.5f, 18.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _male = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
