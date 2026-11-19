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
public final class DynamicFormKt {
    private static ImageVector _dynamicForm;

    public static final ImageVector getDynamicForm(Icons.Rounded rounded) {
        ImageVector imageVector = _dynamicForm;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DynamicForm", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.68f, 9.71f);
        pathBuilder.lineToRelative(-3.72f, 8.19f);
        pathBuilder.curveTo(17.73f, 18.39f, 17.0f, 18.23f, 17.0f, 17.69f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.curveTo(15.0f, 4.22f, 15.22f, 4.0f, 15.5f, 4.0f);
        pathBuilder.horizontalLineToRelative(5.76f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.6f, 0.36f, 0.46f, 0.69f);
        pathBuilder.lineTo(20.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.22f);
        pathBuilder.curveTo(21.59f, 9.0f, 21.83f, 9.38f, 21.68f, 9.71f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 13.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.25f, 16.5f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(6.25f, 16.91f, 6.25f, 16.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 4.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.25f, 7.5f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.reflectiveCurveTo(4.75f, 7.09f, 4.75f, 7.5f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(6.25f, 7.91f, 6.25f, 7.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dynamicForm = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
