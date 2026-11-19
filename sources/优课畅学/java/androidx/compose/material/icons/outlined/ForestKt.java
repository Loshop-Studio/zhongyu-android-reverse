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
public final class ForestKt {
    private static ImageVector _forest;

    public static final ImageVector getForest(Icons.Outlined outlined) {
        ImageVector imageVector = _forest;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Forest", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(24.0f, 18.0f);
        pathBuilder.lineToRelative(-3.86f, -6.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.lineTo(15.0f, 2.0f);
        pathBuilder.lineToRelative(-3.0f, 4.29f);
        pathBuilder.lineTo(9.0f, 2.0f);
        pathBuilder.lineTo(2.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(1.86f);
        pathBuilder.lineTo(0.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 5.49f);
        pathBuilder.lineTo(18.16f, 10.0f);
        pathBuilder.horizontalLineToRelative(-1.68f);
        pathBuilder.lineToRelative(3.86f, 6.0f);
        pathBuilder.horizontalLineToRelative(-3.62f);
        pathBuilder.lineToRelative(-2.57f, -4.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.lineToRelative(-2.78f, -3.97f);
        pathBuilder.lineTo(15.0f, 5.49f);
        pathBuilder.close();
        pathBuilder.moveTo(3.66f, 16.0f);
        pathBuilder.lineToRelative(3.86f, -6.0f);
        pathBuilder.horizontalLineTo(5.84f);
        pathBuilder.lineTo(9.0f, 5.49f);
        pathBuilder.lineTo(12.16f, 10.0f);
        pathBuilder.horizontalLineToRelative(-1.68f);
        pathBuilder.lineToRelative(3.86f, 6.0f);
        pathBuilder.horizontalLineTo(3.66f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forest = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
