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
public final class RiceBowlKt {
    private static ImageVector _riceBowl;

    public static final ImageVector getRiceBowl(Icons.Rounded rounded) {
        ImageVector imageVector = _riceBowl;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RiceBowl", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 12.0f);
        pathBuilder.lineTo(22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -5.48f, -4.4f, -9.93f, -9.86f, -10.0f);
        pathBuilder.curveTo(8.52f, 1.95f, 5.29f, 4.03f, 3.43f, 7.14f);
        pathBuilder.curveTo(0.1f, 12.69f, 2.98f, 18.27f, 8.0f, 20.25f);
        pathBuilder.verticalLineToRelative(0.25f);
        pathBuilder.curveTo(8.0f, 21.33f, 8.67f, 22.0f, 9.5f, 22.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-0.25f);
        pathBuilder.curveTo(19.53f, 18.86f, 22.0f, 15.69f, 22.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineTo(5.08f);
        pathBuilder.curveTo(18.39f, 6.47f, 20.0f, 9.05f, 20.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 4.26f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineTo(4.26f);
        pathBuilder.curveTo(10.64f, 4.1f, 11.31f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveTo(13.36f, 4.1f, 14.0f, 4.26f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.95f, 1.61f, -5.53f, 4.0f, -6.92f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _riceBowl = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
