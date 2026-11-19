package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class Timer10SelectKt {
    private static ImageVector _timer10Select;

    public static final ImageVector getTimer10Select(Icons.Sharp sharp) {
        ImageVector imageVector = _timer10Select;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Timer10Select", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 8.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.moveTo(16.0f, 5.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timer10Select = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
