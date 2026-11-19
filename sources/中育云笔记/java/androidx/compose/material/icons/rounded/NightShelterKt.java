package androidx.compose.material.icons.rounded;

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
public final class NightShelterKt {
    private static ImageVector _nightShelter;

    public static final ImageVector getNightShelter(Icons.Rounded rounded) {
        ImageVector imageVector = _nightShelter;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NightShelter", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.8f, 3.9f);
        pathBuilder.lineToRelative(-6.0f, 4.5f);
        pathBuilder.curveTo(4.3f, 8.78f, 4.0f, 9.37f, 4.0f, 10.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f);
        pathBuilder.lineToRelative(-6.0f, -4.5f);
        pathBuilder.curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f);
        pathBuilder.close();
        pathBuilder.moveTo(9.75f, 12.5f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilder.reflectiveCurveTo(10.44f, 15.0f, 9.75f, 15.0f);
        pathBuilder.reflectiveCurveTo(8.5f, 14.44f, 8.5f, 13.75f);
        pathBuilder.reflectiveCurveTo(9.06f, 12.5f, 9.75f, 12.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 18.0f);
        pathBuilder.lineTo(16.5f, 18.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveTo(8.0f, 17.78f, 7.78f, 18.0f, 7.5f, 18.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(7.22f, 18.0f, 7.0f, 17.78f, 7.0f, 17.5f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.curveTo(7.0f, 11.22f, 7.22f, 11.0f, 7.5f, 11.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(7.78f, 11.0f, 8.0f, 11.22f, 8.0f, 11.5f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(3.5f);
        pathBuilder.curveTo(17.0f, 17.78f, 16.78f, 18.0f, 16.5f, 18.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightShelter = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
