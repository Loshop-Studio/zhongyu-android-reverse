package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class MediaBluetoothOffKt {
    private static ImageVector _mediaBluetoothOff;

    public static final ImageVector getMediaBluetoothOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _mediaBluetoothOff;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MediaBluetoothOff", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 6.17f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(1.17f);
        pathBuilder.lineTo(9.0f, 6.17f);
        pathBuilder.close();
        pathBuilder.moveTo(19.42f, 15.0f);
        pathBuilder.lineTo(22.0f, 17.57f);
        pathBuilder.lineToRelative(-0.8f, 0.8f);
        pathBuilder.lineToRelative(-6.78f, -6.78f);
        pathBuilder.lineToRelative(0.8f, -0.8f);
        pathBuilder.lineToRelative(2.75f, 2.75f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(0.6f);
        pathBuilder.lineTo(22.0f, 12.43f);
        pathBuilder.lineTo(19.42f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.17f, 13.55f);
        pathBuilder.lineToRelative(1.13f, -1.13f);
        pathBuilder.lineToRelative(-1.13f, -1.13f);
        pathBuilder.verticalLineTo(13.55f);
        pathBuilder.close();
        pathBuilder.moveTo(17.21f, 17.21f);
        pathBuilder.lineToRelative(3.98f, 3.98f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(-3.98f, -3.98f);
        pathBuilder.lineToRelative(-0.58f, 0.58f);
        pathBuilder.lineToRelative(-0.85f, -0.85f);
        pathBuilder.lineToRelative(0.58f, -0.58f);
        pathBuilder.lineTo(11.0f, 13.83f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, -1.78f, 4.0f, -3.99f, 4.0f);
        pathBuilder.reflectiveCurveTo(3.0f, 19.21f, 3.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, -4.0f, 4.01f, -4.0f);
        pathBuilder.curveToRelative(0.73f, 0.0f, 1.41f, 0.21f, 2.0f, 0.55f);
        pathBuilder.verticalLineToRelative(-1.72f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineTo(2.8f, 2.81f);
        pathBuilder.lineToRelative(13.56f, 13.56f);
        pathBuilder.lineTo(17.21f, 17.21f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediaBluetoothOff = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
