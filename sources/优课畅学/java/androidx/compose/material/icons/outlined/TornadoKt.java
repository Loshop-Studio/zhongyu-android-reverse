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
public final class TornadoKt {
    private static ImageVector _tornado;

    public static final ImageVector getTornado(Icons.Outlined outlined) {
        ImageVector imageVector = _tornado;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Tornado", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 3.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.lineToRelative(11.0f, 19.0f);
        pathBuilder.lineTo(23.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.53f, 5.0f);
        pathBuilder.lineToRelative(-1.74f, 3.0f);
        pathBuilder.horizontalLineTo(6.21f);
        pathBuilder.lineTo(4.47f, 5.0f);
        pathBuilder.horizontalLineTo(19.53f);
        pathBuilder.close();
        pathBuilder.moveTo(10.26f, 15.0f);
        pathBuilder.horizontalLineToRelative(3.48f);
        pathBuilder.lineTo(12.0f, 18.01f);
        pathBuilder.lineTo(10.26f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.9f, 13.0f);
        pathBuilder.horizontalLineTo(9.1f);
        pathBuilder.lineToRelative(-1.74f, -3.0f);
        pathBuilder.horizontalLineToRelative(9.27f);
        pathBuilder.lineTo(14.9f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tornado = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
