package androidx.compose.material.icons.outlined;

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

    public static final ImageVector getRiceBowl(Icons.Outlined outlined) {
        ImageVector imageVector = _riceBowl;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RiceBowl", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.66f, 14.0f);
        pathBuilder.curveToRelative(-0.66f, 1.92f, -2.24f, 3.54f, -4.4f, 4.39f);
        pathBuilder.lineTo(14.0f, 18.88f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-1.12f);
        pathBuilder.lineToRelative(-1.27f, -0.5f);
        pathBuilder.curveToRelative(-2.16f, -0.85f, -3.74f, -2.47f, -4.4f, -4.39f);
        pathBuilder.horizontalLineTo(19.66f);
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-1.75f);
        pathBuilder.curveToRelative(3.53f, -1.39f, 6.0f, -4.56f, 6.0f, -8.25f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 12.0f);
        pathBuilder.verticalLineTo(4.26f);
        pathBuilder.curveTo(10.64f, 4.1f, 11.31f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(1.36f, 0.1f, 2.0f, 0.26f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.lineTo(10.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 12.0f);
        pathBuilder.verticalLineTo(5.08f);
        pathBuilder.curveToRelative(2.39f, 1.39f, 4.0f, 3.96f, 4.0f, 6.92f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.lineTo(16.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.95f, 1.61f, -5.53f, 4.0f, -6.92f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.lineTo(4.0f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _riceBowl = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
