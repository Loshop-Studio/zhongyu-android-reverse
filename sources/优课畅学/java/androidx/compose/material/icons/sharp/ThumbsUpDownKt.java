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

/* loaded from: classes.dex */
public final class ThumbsUpDownKt {
    private static ImageVector _thumbsUpDown;

    public static final ImageVector getThumbsUpDown(Icons.Sharp sharp) {
        ImageVector imageVector = _thumbsUpDown;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ThumbsUpDown", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 5.0f);
        pathBuilder.lineTo(5.82f, 5.0f);
        pathBuilder.lineToRelative(0.78f, -3.78f);
        pathBuilder.lineTo(5.38f, 0.0f);
        pathBuilder.lineTo(0.0f, 5.38f);
        pathBuilder.lineTo(0.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(9.24f);
        pathBuilder.lineTo(12.0f, 7.54f);
        pathBuilder.close();
        pathBuilder.moveTo(14.76f, 10.0f);
        pathBuilder.lineTo(12.0f, 16.46f);
        pathBuilder.lineTo(12.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(6.18f);
        pathBuilder.lineToRelative(-0.78f, 3.78f);
        pathBuilder.lineTo(18.62f, 24.0f);
        pathBuilder.lineTo(24.0f, 18.62f);
        pathBuilder.lineTo(24.0f, 10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbsUpDown = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
