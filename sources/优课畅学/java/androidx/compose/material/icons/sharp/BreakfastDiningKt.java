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
public final class BreakfastDiningKt {
    private static ImageVector _breakfastDining;

    public static final ImageVector getBreakfastDining(Icons.Sharp sharp) {
        ImageVector imageVector = _breakfastDining;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BreakfastDining", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.85f, 3.0f);
        pathBuilder.lineTo(6.14f, 3.0f);
        pathBuilder.curveTo(4.15f, 3.0f, 2.36f, 4.39f, 2.05f, 6.36f);
        pathBuilder.curveTo(1.78f, 8.11f, 2.64f, 9.65f, 4.0f, 10.45f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(10.45f);
        pathBuilder.curveToRelative(1.36f, -0.79f, 2.23f, -2.36f, 1.95f, -4.11f);
        pathBuilder.curveTo(21.63f, 4.38f, 19.83f, 3.0f, 17.85f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.41f, 13.0f);
        pathBuilder.lineTo(12.0f, 17.42f);
        pathBuilder.lineTo(7.59f, 13.0f);
        pathBuilder.lineTo(12.0f, 8.59f);
        pathBuilder.lineTo(16.41f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _breakfastDining = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
