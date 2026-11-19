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
public final class DiamondKt {
    private static ImageVector _diamond;

    public static final ImageVector getDiamond(Icons.Outlined outlined) {
        ImageVector imageVector = _diamond;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Diamond", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.lineTo(2.0f, 9.0f);
        pathBuilder.lineToRelative(10.0f, 12.0f);
        pathBuilder.lineTo(22.0f, 9.0f);
        pathBuilder.lineTo(19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.62f, 8.0f);
        pathBuilder.lineToRelative(1.5f, -3.0f);
        pathBuilder.horizontalLineToRelative(1.76f);
        pathBuilder.lineToRelative(1.5f, 3.0f);
        pathBuilder.horizontalLineTo(9.62f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 10.0f);
        pathBuilder.verticalLineToRelative(6.68f);
        pathBuilder.lineTo(5.44f, 10.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(5.56f);
        pathBuilder.lineTo(13.0f, 16.68f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.26f, 8.0f);
        pathBuilder.horizontalLineToRelative(-2.65f);
        pathBuilder.lineToRelative(-1.5f, -3.0f);
        pathBuilder.horizontalLineToRelative(2.65f);
        pathBuilder.lineTo(19.26f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.24f, 5.0f);
        pathBuilder.horizontalLineToRelative(2.65f);
        pathBuilder.lineToRelative(-1.5f, 3.0f);
        pathBuilder.horizontalLineTo(4.74f);
        pathBuilder.lineTo(6.24f, 5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _diamond = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
