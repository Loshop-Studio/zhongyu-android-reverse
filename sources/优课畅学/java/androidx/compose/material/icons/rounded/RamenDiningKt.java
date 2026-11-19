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
public final class RamenDiningKt {
    private static ImageVector _ramenDining;

    public static final ImageVector getRamenDining(Icons.Rounded rounded) {
        ImageVector imageVector = _ramenDining;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RamenDining", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 2.84f);
        pathBuilder.lineTo(22.0f, 2.84f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.39f, -0.79f, -0.83f, -0.75f);
        pathBuilder.lineTo(4.89f, 3.9f);
        pathBuilder.curveTo(4.38f, 3.95f, 4.0f, 4.38f, 4.0f, 4.89f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineTo(3.08f);
        pathBuilder.curveToRelative(-0.6f, 0.0f, -1.08f, 0.53f, -1.0f, 1.13f);
        pathBuilder.curveTo(2.52f, 16.33f, 4.83f, 19.0f, 8.0f, 20.25f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-0.75f);
        pathBuilder.curveToRelative(3.17f, -1.25f, 5.48f, -3.92f, 5.92f, -7.12f);
        pathBuilder.curveToRelative(0.08f, -0.6f, -0.4f, -1.13f, -1.0f, -1.13f);
        pathBuilder.horizontalLineTo(10.5f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(10.75f);
        pathBuilder.curveTo(21.66f, 8.0f, 22.0f, 7.66f, 22.0f, 7.25f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.horizontalLineTo(10.5f);
        pathBuilder.verticalLineTo(4.78f);
        pathBuilder.lineToRelative(10.83f, -1.19f);
        pathBuilder.curveTo(21.71f, 3.54f, 22.0f, 3.22f, 22.0f, 2.84f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 5.22f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(5.34f);
        pathBuilder.lineTo(6.5f, 5.22f);
        pathBuilder.close();
        pathBuilder.moveTo(5.5f, 8.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 12.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 6.5f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(5.06f);
        pathBuilder.lineToRelative(1.0f, -0.11f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ramenDining = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
