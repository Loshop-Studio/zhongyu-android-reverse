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
public final class TextRotationDownKt {
    private static ImageVector _textRotationDown;

    public static final ImageVector getTextRotationDown(Icons.Rounded rounded) {
        ImageVector imageVector = _textRotationDown;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextRotationDown", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.35f, 19.65f);
        pathBuilder.lineToRelative(1.79f, -1.79f);
        pathBuilder.curveToRelative(0.32f, -0.32f, 0.1f, -0.86f, -0.35f, -0.86f);
        pathBuilder.lineTo(7.0f, 17.0f);
        pathBuilder.lineTo(7.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(-0.79f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilder.lineToRelative(1.79f, 1.79f);
        pathBuilder.curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.01f);
        pathBuilder.close();
        pathBuilder.moveTo(12.2f, 8.5f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.lineToRelative(-1.6f, 0.66f);
        pathBuilder.curveToRelative(-0.36f, 0.15f, -0.6f, 0.5f, -0.6f, 0.89f);
        pathBuilder.curveToRelative(0.0f, 0.69f, 0.71f, 1.15f, 1.34f, 0.88f);
        pathBuilder.lineToRelative(8.97f, -3.88f);
        pathBuilder.curveToRelative(0.42f, -0.18f, 0.69f, -0.59f, 0.69f, -1.05f);
        pathBuilder.curveToRelative(0.0f, -0.46f, -0.27f, -0.87f, -0.69f, -1.05f);
        pathBuilder.lineToRelative(-8.97f, -3.88f);
        pathBuilder.curveToRelative(-0.63f, -0.27f, -1.34f, 0.2f, -1.34f, 0.89f);
        pathBuilder.curveToRelative(0.0f, 0.39f, 0.24f, 0.74f, 0.6f, 0.89f);
        pathBuilder.lineToRelative(1.6f, 0.65f);
        pathBuilder.close();
        pathBuilder.moveTo(19.02f, 11.0f);
        pathBuilder.lineTo(14.0f, 12.87f);
        pathBuilder.lineTo(14.0f, 9.13f);
        pathBuilder.lineTo(19.02f, 11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationDown = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
