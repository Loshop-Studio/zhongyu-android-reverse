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
public final class CheckroomKt {
    private static ImageVector _checkroom;

    public static final ImageVector getCheckroom(Icons.TwoTone twoTone) {
        ImageVector imageVector = _checkroom;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Checkroom", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.6f, 18.2f);
        pathBuilder.lineTo(13.0f, 11.75f);
        pathBuilder.verticalLineToRelative(-0.91f);
        pathBuilder.curveToRelative(1.65f, -0.49f, 2.8f, -2.17f, 2.43f, -4.05f);
        pathBuilder.curveToRelative(-0.26f, -1.31f, -1.3f, -2.4f, -2.61f, -2.7f);
        pathBuilder.curveTo(10.54f, 3.57f, 8.5f, 5.3f, 8.5f, 7.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveTo(10.5f, 6.67f, 11.17f, 6.0f, 12.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.curveToRelative(0.0f, 0.84f, -0.69f, 1.52f, -1.53f, 1.5f);
        pathBuilder.curveTo(11.43f, 8.99f, 11.0f, 9.45f, 11.0f, 9.99f);
        pathBuilder.verticalLineToRelative(1.76f);
        pathBuilder.lineTo(2.4f, 18.2f);
        pathBuilder.curveTo(1.63f, 18.78f, 2.04f, 20.0f, 3.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.curveTo(21.96f, 20.0f, 22.37f, 18.78f, 21.6f, 18.2f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 18.0f);
        pathBuilder.lineToRelative(6.0f, -4.5f);
        pathBuilder.lineToRelative(6.0f, 4.5f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _checkroom = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
