package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class NightlifeKt {
    private static ImageVector _nightlife;

    public static final ImageVector getNightlife(Icons.TwoTone twoTone) {
        ImageVector imageVector = _nightlife;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Nightlife", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.lineToRelative(-6.0f, 9.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.lineTo(1.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.1f, 9.0f);
        pathBuilder.lineToRelative(1.4f, -2.0f);
        pathBuilder.horizontalLineTo(4.49f);
        pathBuilder.lineToRelative(1.4f, 2.0f);
        pathBuilder.horizontalLineTo(10.1f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.69f, 0.06f, 1.0f, 0.17f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightlife = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
