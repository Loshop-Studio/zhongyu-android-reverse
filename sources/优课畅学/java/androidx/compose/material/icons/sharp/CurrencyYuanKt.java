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
public final class CurrencyYuanKt {
    private static ImageVector _currencyYuan;

    public static final ImageVector getCurrencyYuan(Icons.Sharp sharp) {
        ImageVector imageVector = _currencyYuan;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CurrencyYuan", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.28f, 12.0f);
        pathBuilder.lineToRelative(4.72f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 2.0f);
        pathBuilder.lineToRelative(-5.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 7.0f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -7.0f);
        pathBuilder.lineToRelative(-5.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -2.0f);
        pathBuilder.lineToRelative(4.72f, 0.0f);
        pathBuilder.lineToRelative(-5.72f, -9.0f);
        pathBuilder.lineToRelative(2.37f, 0.0f);
        pathBuilder.lineToRelative(4.63f, 7.29f);
        pathBuilder.lineToRelative(4.63f, -7.29f);
        pathBuilder.lineToRelative(2.37f, 0.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyYuan = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
