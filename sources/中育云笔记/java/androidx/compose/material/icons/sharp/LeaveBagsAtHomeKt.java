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
public final class LeaveBagsAtHomeKt {
    private static ImageVector _leaveBagsAtHome;

    public static final ImageVector getLeaveBagsAtHome(Icons.Sharp sharp) {
        ImageVector imageVector = _leaveBagsAtHome;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LeaveBagsAtHome", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.83f, 9.0f);
        pathBuilder.horizontalLineToRelative(0.92f);
        pathBuilder.verticalLineToRelative(0.92f);
        pathBuilder.lineToRelative(1.75f, 1.75f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(4.17f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(8.83f);
        pathBuilder.lineTo(11.83f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 21.19f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineTo(5.0f, 7.83f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(1.17f);
        pathBuilder.lineToRelative(1.61f, 1.61f);
        pathBuilder.lineTo(21.19f, 21.19f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-7.17f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.25f, 18.0f);
        pathBuilder.verticalLineToRelative(-3.92f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineTo(11.25f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 18.0f);
        pathBuilder.verticalLineToRelative(-0.67f);
        pathBuilder.lineTo(15.17f, 18.0f);
        pathBuilder.horizontalLineTo(14.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leaveBagsAtHome = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
