package androidx.compose.material.icons.filled;

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
public final class AutoFixHighKt {
    private static ImageVector _autoFixHigh;

    public static final ImageVector getAutoFixHigh(Icons.Filled filled) {
        ImageVector imageVector = _autoFixHigh;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AutoFixHigh", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.5f, 5.6f);
        pathBuilder.lineTo(10.0f, 7.0f);
        pathBuilder.lineTo(8.6f, 4.5f);
        pathBuilder.lineTo(10.0f, 2.0f);
        pathBuilder.lineTo(7.5f, 3.4f);
        pathBuilder.lineTo(5.0f, 2.0f);
        pathBuilder.lineToRelative(1.4f, 2.5f);
        pathBuilder.lineTo(5.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.5f, 15.4f);
        pathBuilder.lineTo(17.0f, 14.0f);
        pathBuilder.lineToRelative(1.4f, 2.5f);
        pathBuilder.lineTo(17.0f, 19.0f);
        pathBuilder.lineToRelative(2.5f, -1.4f);
        pathBuilder.lineTo(22.0f, 19.0f);
        pathBuilder.lineToRelative(-1.4f, -2.5f);
        pathBuilder.lineTo(22.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 2.0f);
        pathBuilder.lineToRelative(-2.5f, 1.4f);
        pathBuilder.lineTo(17.0f, 2.0f);
        pathBuilder.lineToRelative(1.4f, 2.5f);
        pathBuilder.lineTo(17.0f, 7.0f);
        pathBuilder.lineToRelative(2.5f, -1.4f);
        pathBuilder.lineTo(22.0f, 7.0f);
        pathBuilder.lineToRelative(-1.4f, -2.5f);
        pathBuilder.close();
        pathBuilder.moveTo(14.37f, 7.29f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(1.29f, 18.96f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(2.34f, 2.34f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(16.7f, 11.05f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-2.33f, -2.35f);
        pathBuilder.close();
        pathBuilder.moveTo(13.34f, 12.78f);
        pathBuilder.lineToRelative(-2.12f, -2.12f);
        pathBuilder.lineToRelative(2.44f, -2.44f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineToRelative(-2.44f, 2.44f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoFixHigh = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
