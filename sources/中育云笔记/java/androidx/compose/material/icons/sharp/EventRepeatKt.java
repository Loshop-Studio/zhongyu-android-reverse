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
public final class EventRepeatKt {
    private static ImageVector _eventRepeat;

    public static final ImageVector getEventRepeat(Icons.Sharp sharp) {
        ImageVector imageVector = _eventRepeat;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EventRepeat", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.64f, 20.0f);
        pathBuilder.curveToRelative(0.43f, 1.45f, 1.77f, 2.5f, 3.36f, 2.5f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f);
        pathBuilder.curveToRelative(-0.95f, 0.0f, -1.82f, 0.38f, -2.45f, 1.0f);
        pathBuilder.lineToRelative(1.45f, 0.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.lineToRelative(0.0f, 1.43f);
        pathBuilder.curveTo(16.4f, 14.55f, 17.64f, 14.0f, 19.0f, 14.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilder.curveToRelative(-2.42f, 0.0f, -4.44f, -1.72f, -4.9f, -4.0f);
        pathBuilder.lineTo(15.64f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eventRepeat = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
