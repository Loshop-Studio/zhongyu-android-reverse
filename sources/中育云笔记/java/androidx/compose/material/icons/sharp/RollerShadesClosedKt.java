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
public final class RollerShadesClosedKt {
    private static ImageVector _rollerShadesClosed;

    public static final ImageVector getRollerShadesClosed(Icons.Sharp sharp) {
        ImageVector imageVector = _rollerShadesClosed;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RollerShadesClosed", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 19.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(8.25f);
        pathBuilder.curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f);
        pathBuilder.reflectiveCurveToRelative(1.75f, -0.78f, 1.75f, -1.75f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rollerShadesClosed = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
