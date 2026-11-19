package androidx.compose.material.icons.sharp;

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
import p123h7.InterfaceC8721a;

/* loaded from: classes.dex */
public final class PhoneMissedKt {
    private static ImageVector _phoneMissed;

    public static final ImageVector getPhoneMissed(Icons.Sharp sharp) {
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhoneMissed", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.32f, 16.67f);
        pathBuilder.curveToRelative(-2.95f, -2.79f, -6.93f, -4.51f, -11.31f, -4.51f);
        pathBuilder.curveToRelative(-4.39f, 0.0f, -8.37f, 1.72f, -11.31f, 4.51f);
        pathBuilder.lineToRelative(-0.69f, 0.69f);
        pathBuilder.lineTo(3.65f, 21.0f);
        pathBuilder.lineToRelative(3.93f, -2.72f);
        pathBuilder.lineToRelative(-0.01f, -3.49f);
        pathBuilder.curveToRelative(1.4f, -0.45f, 2.9f, -0.7f, 4.44f, -0.7f);
        pathBuilder.curveToRelative(1.55f, 0.0f, 3.04f, 0.24f, 4.44f, 0.7f);
        pathBuilder.lineToRelative(-0.01f, 3.49f);
        pathBuilder.lineTo(20.37f, 21.0f);
        pathBuilder.lineToRelative(3.64f, -3.64f);
        pathBuilder.curveToRelative(0.0f, -0.01f, -0.52f, -0.52f, -0.69f, -0.69f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 6.43f);
        pathBuilder.lineToRelative(4.94f, 4.94f);
        pathBuilder.lineToRelative(7.07f, -7.07f);
        pathBuilder.lineToRelative(-1.41f, -1.42f);
        pathBuilder.lineToRelative(-5.66f, 5.66f);
        pathBuilder.lineTo(8.4f, 5.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneMissed = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC8721a
    public static /* synthetic */ void getPhoneMissed$annotations(Icons.Sharp sharp) {
    }
}
