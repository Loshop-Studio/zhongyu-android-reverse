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
public final class PermDataSettingKt {
    private static ImageVector _permDataSetting;

    public static final ImageVector getPermDataSetting(Icons.Rounded rounded) {
        ImageVector imageVector = _permDataSetting;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PermDataSetting", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.99f, 11.5f);
        pathBuilder.curveToRelative(0.34f, 0.0f, 0.68f, 0.03f, 1.01f, 0.07f);
        pathBuilder.lineTo(20.0f, 2.42f);
        pathBuilder.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        pathBuilder.lineTo(1.71f, 18.29f);
        pathBuilder.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        pathBuilder.horizontalLineToRelative(9.15f);
        pathBuilder.curveToRelative(-0.04f, -0.33f, -0.07f, -0.66f, -0.07f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f);
        pathBuilder.close();
        pathBuilder.moveTo(22.7f, 19.49f);
        pathBuilder.curveToRelative(0.02f, -0.16f, 0.04f, -0.32f, 0.04f, -0.49f);
        pathBuilder.reflectiveCurveToRelative(-0.01f, -0.33f, -0.04f, -0.49f);
        pathBuilder.lineToRelative(1.06f, -0.83f);
        pathBuilder.curveToRelative(0.09f, -0.08f, 0.12f, -0.21f, 0.06f, -0.32f);
        pathBuilder.lineToRelative(-1.0f, -1.73f);
        pathBuilder.curveToRelative(-0.06f, -0.11f, -0.19f, -0.15f, -0.31f, -0.11f);
        pathBuilder.lineToRelative(-1.24f, 0.5f);
        pathBuilder.curveToRelative(-0.26f, -0.2f, -0.54f, -0.37f, -0.85f, -0.49f);
        pathBuilder.lineToRelative(-0.19f, -1.32f);
        pathBuilder.curveToRelative(-0.01f, -0.12f, -0.12f, -0.21f, -0.24f, -0.21f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.12f, 0.0f, -0.23f, 0.09f, -0.25f, 0.21f);
        pathBuilder.lineToRelative(-0.19f, 1.32f);
        pathBuilder.curveToRelative(-0.3f, 0.13f, -0.59f, 0.29f, -0.85f, 0.49f);
        pathBuilder.lineToRelative(-1.24f, -0.5f);
        pathBuilder.curveToRelative(-0.11f, -0.04f, -0.24f, 0.0f, -0.31f, 0.11f);
        pathBuilder.lineToRelative(-1.0f, 1.73f);
        pathBuilder.curveToRelative(-0.06f, 0.11f, -0.04f, 0.24f, 0.06f, 0.32f);
        pathBuilder.lineToRelative(1.06f, 0.83f);
        pathBuilder.curveToRelative(-0.02f, 0.16f, -0.03f, 0.32f, -0.03f, 0.49f);
        pathBuilder.reflectiveCurveToRelative(0.01f, 0.33f, 0.03f, 0.49f);
        pathBuilder.lineToRelative(-1.06f, 0.83f);
        pathBuilder.curveToRelative(-0.09f, 0.08f, -0.12f, 0.21f, -0.06f, 0.32f);
        pathBuilder.lineToRelative(1.0f, 1.73f);
        pathBuilder.curveToRelative(0.06f, 0.11f, 0.19f, 0.15f, 0.31f, 0.11f);
        pathBuilder.lineToRelative(1.24f, -0.5f);
        pathBuilder.curveToRelative(0.26f, 0.2f, 0.54f, 0.37f, 0.85f, 0.49f);
        pathBuilder.lineToRelative(0.19f, 1.32f);
        pathBuilder.curveToRelative(0.02f, 0.12f, 0.12f, 0.21f, 0.25f, 0.21f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.12f, 0.0f, 0.23f, -0.09f, 0.25f, -0.21f);
        pathBuilder.lineToRelative(0.19f, -1.32f);
        pathBuilder.curveToRelative(0.3f, -0.13f, 0.59f, -0.29f, 0.84f, -0.49f);
        pathBuilder.lineToRelative(1.25f, 0.5f);
        pathBuilder.curveToRelative(0.11f, 0.04f, 0.24f, 0.0f, 0.31f, -0.11f);
        pathBuilder.lineToRelative(1.0f, -1.73f);
        pathBuilder.curveToRelative(0.06f, -0.11f, 0.03f, -0.24f, -0.06f, -0.32f);
        pathBuilder.lineToRelative(-1.07f, -0.83f);
        pathBuilder.close();
        pathBuilder.moveTo(18.99f, 20.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permDataSetting = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
