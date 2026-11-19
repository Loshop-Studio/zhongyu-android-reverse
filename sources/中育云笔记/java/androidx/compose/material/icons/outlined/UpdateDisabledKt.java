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
public final class UpdateDisabledKt {
    private static ImageVector _updateDisabled;

    public static final ImageVector getUpdateDisabled(Icons.Outlined outlined) {
        ImageVector imageVector = _updateDisabled;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.UpdateDisabled", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.94f, 13.0f);
        pathBuilder.curveToRelative(-0.15f, 1.38f, -0.62f, 2.67f, -1.33f, 3.79f);
        pathBuilder.lineToRelative(-1.47f, -1.47f);
        pathBuilder.curveToRelative(0.38f, -0.71f, 0.65f, -1.49f, 0.77f, -2.32f);
        pathBuilder.horizontalLineTo(20.94f);
        pathBuilder.close();
        pathBuilder.moveTo(8.67f, 5.84f);
        pathBuilder.curveTo(9.66f, 5.31f, 10.8f, 5.0f, 12.0f, 5.0f);
        pathBuilder.curveToRelative(2.37f, 0.0f, 4.47f, 1.19f, 5.74f, 3.0f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.36f);
        pathBuilder.curveTo(17.35f, 4.32f, 14.83f, 3.0f, 12.0f, 3.0f);
        pathBuilder.curveToRelative(-1.76f, 0.0f, -3.4f, 0.51f, -4.78f, 1.39f);
        pathBuilder.lineTo(8.67f, 5.84f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 7.0f);
        pathBuilder.verticalLineToRelative(1.17f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.78f, 22.61f);
        pathBuilder.lineToRelative(-3.0f, -3.0f);
        pathBuilder.curveTo(15.39f, 20.48f, 13.76f, 21.0f, 12.0f, 21.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, -4.03f, -9.0f, -9.0f);
        pathBuilder.curveToRelative(0.0f, -1.76f, 0.51f, -3.4f, 1.39f, -4.78f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(18.38f, 18.38f);
        pathBuilder.lineTo(19.78f, 22.61f);
        pathBuilder.close();
        pathBuilder.moveTo(15.32f, 18.15f);
        pathBuilder.lineTo(5.84f, 8.67f);
        pathBuilder.curveTo(5.31f, 9.66f, 5.0f, 10.8f, 5.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f);
        pathBuilder.curveTo(13.2f, 19.0f, 14.34f, 18.69f, 15.32f, 18.15f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _updateDisabled = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
