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
public final class DangerousKt {
    private static ImageVector _dangerous;

    public static final ImageVector getDangerous(Icons.Outlined outlined) {
        ImageVector imageVector = _dangerous;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Dangerous", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.73f, 3.0f);
        pathBuilder.horizontalLineTo(8.27f);
        pathBuilder.lineTo(3.0f, 8.27f);
        pathBuilder.verticalLineToRelative(7.46f);
        pathBuilder.lineTo(8.27f, 21.0f);
        pathBuilder.horizontalLineToRelative(7.46f);
        pathBuilder.lineTo(21.0f, 15.73f);
        pathBuilder.verticalLineTo(8.27f);
        pathBuilder.lineTo(15.73f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 14.9f);
        pathBuilder.lineTo(14.9f, 19.0f);
        pathBuilder.horizontalLineTo(9.1f);
        pathBuilder.lineTo(5.0f, 14.9f);
        pathBuilder.verticalLineTo(9.1f);
        pathBuilder.lineTo(9.1f, 5.0f);
        pathBuilder.horizontalLineToRelative(5.8f);
        pathBuilder.lineTo(19.0f, 9.1f);
        pathBuilder.verticalLineTo(14.9f);
        pathBuilder.close();
        pathBuilder.moveTo(14.83f, 7.76f);
        pathBuilder.lineTo(12.0f, 10.59f);
        pathBuilder.lineTo(9.17f, 7.76f);
        pathBuilder.lineTo(7.76f, 9.17f);
        pathBuilder.lineTo(10.59f, 12.0f);
        pathBuilder.lineToRelative(-2.83f, 2.83f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(12.0f, 13.41f);
        pathBuilder.lineToRelative(2.83f, 2.83f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(13.41f, 12.0f);
        pathBuilder.lineToRelative(2.83f, -2.83f);
        pathBuilder.lineTo(14.83f, 7.76f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dangerous = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
