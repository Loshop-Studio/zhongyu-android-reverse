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
public final class PortraitKt {
    private static ImageVector _portrait;

    public static final ImageVector getPortrait(Icons.Sharp sharp) {
        ImageVector imageVector = _portrait;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Portrait", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 12.25f);
        pathBuilder.curveToRelative(1.24f, 0.0f, 2.25f, -1.01f, 2.25f, -2.25f);
        pathBuilder.reflectiveCurveTo(13.24f, 7.75f, 12.0f, 7.75f);
        pathBuilder.reflectiveCurveTo(9.75f, 8.76f, 9.75f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(1.01f, 2.25f, 2.25f, 2.25f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 16.25f);
        pathBuilder.curveToRelative(0.0f, -1.5f, -3.0f, -2.25f, -4.5f, -2.25f);
        pathBuilder.reflectiveCurveToRelative(-4.5f, 0.75f, -4.5f, 2.25f);
        pathBuilder.lineTo(7.5f, 17.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineToRelative(-0.75f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.lineTo(3.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(21.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 19.0f);
        pathBuilder.lineTo(5.0f, 19.0f);
        pathBuilder.lineTo(5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _portrait = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
