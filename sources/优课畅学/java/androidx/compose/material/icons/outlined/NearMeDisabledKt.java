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
public final class NearMeDisabledKt {
    private static ImageVector _nearMeDisabled;

    public static final ImageVector getNearMeDisabled(Icons.Outlined outlined) {
        ImageVector imageVector = _nearMeDisabled;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NearMeDisabled", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.34f);
        pathBuilder.lineTo(21.0f, 3.0f);
        pathBuilder.lineToRelative(-3.34f, 9.0f);
        pathBuilder.lineToRelative(-1.56f, -1.56f);
        pathBuilder.lineToRelative(1.5f, -4.05f);
        pathBuilder.lineToRelative(-4.05f, 1.5f);
        pathBuilder.lineTo(12.0f, 6.34f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 21.19f);
        pathBuilder.lineToRelative(-5.07f, -5.07f);
        pathBuilder.lineTo(14.31f, 21.0f);
        pathBuilder.horizontalLineTo(12.9f);
        pathBuilder.lineToRelative(-2.83f, -7.07f);
        pathBuilder.lineTo(3.0f, 11.1f);
        pathBuilder.verticalLineTo(9.69f);
        pathBuilder.lineToRelative(4.88f, -1.81f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(18.38f, 18.38f);
        pathBuilder.lineTo(21.19f, 21.19f);
        pathBuilder.close();
        pathBuilder.moveTo(14.57f, 14.57f);
        pathBuilder.lineTo(9.43f, 9.43f);
        pathBuilder.lineToRelative(-2.71f, 1.01f);
        pathBuilder.lineToRelative(4.89f, 1.95f);
        pathBuilder.lineToRelative(1.95f, 4.89f);
        pathBuilder.lineTo(14.57f, 14.57f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearMeDisabled = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
