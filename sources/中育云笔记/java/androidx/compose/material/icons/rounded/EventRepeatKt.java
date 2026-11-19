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
public final class EventRepeatKt {
    private static ImageVector _eventRepeat;

    public static final ImageVector getEventRepeat(Icons.Rounded rounded) {
        ImageVector imageVector = _eventRepeat;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EventRepeat", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 2.45f, 6.0f, 3.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 4.0f, 3.0f, 4.9f, 3.0f, 6.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.13f, 20.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.91f, 0.56f, -0.68f, 1.06f);
        pathBuilder.curveTo(15.23f, 22.79f, 16.97f, 24.0f, 19.0f, 24.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder.curveToRelative(-1.36f, 0.0f, -2.6f, 0.55f, -3.5f, 1.43f);
        pathBuilder.lineToRelative(0.0f, -0.68f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(14.34f, 14.0f, 14.0f, 14.34f, 14.0f, 14.75f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.25f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.lineToRelative(-0.7f, 0.0f);
        pathBuilder.curveToRelative(0.63f, -0.62f, 1.5f, -1.0f, 2.45f, -1.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f);
        pathBuilder.curveToRelative(-1.42f, 0.0f, -2.64f, -0.85f, -3.19f, -2.06f);
        pathBuilder.curveTo(15.69f, 20.17f, 15.42f, 20.0f, 15.13f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eventRepeat = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
