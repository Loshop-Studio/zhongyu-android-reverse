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
public final class StarOutlineKt {
    private static ImageVector _starOutline;

    public static final ImageVector getStarOutline(Icons.Filled filled) {
        ImageVector imageVector = _starOutline;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.StarOutline", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 9.24f);
        pathBuilder.lineToRelative(-7.19f, -0.62f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.lineTo(9.19f, 8.63f);
        pathBuilder.lineTo(2.0f, 9.24f);
        pathBuilder.lineToRelative(5.46f, 4.73f);
        pathBuilder.lineTo(5.82f, 21.0f);
        pathBuilder.lineTo(12.0f, 17.27f);
        pathBuilder.lineTo(18.18f, 21.0f);
        pathBuilder.lineToRelative(-1.63f, -7.03f);
        pathBuilder.lineTo(22.0f, 9.24f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.4f);
        pathBuilder.lineToRelative(-3.76f, 2.27f);
        pathBuilder.lineToRelative(1.0f, -4.28f);
        pathBuilder.lineToRelative(-3.32f, -2.88f);
        pathBuilder.lineToRelative(4.38f, -0.38f);
        pathBuilder.lineTo(12.0f, 6.1f);
        pathBuilder.lineToRelative(1.71f, 4.04f);
        pathBuilder.lineToRelative(4.38f, 0.38f);
        pathBuilder.lineToRelative(-3.32f, 2.88f);
        pathBuilder.lineToRelative(1.0f, 4.28f);
        pathBuilder.lineTo(12.0f, 15.4f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starOutline = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
