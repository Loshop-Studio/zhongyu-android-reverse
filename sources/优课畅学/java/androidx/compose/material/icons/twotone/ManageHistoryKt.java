package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class ManageHistoryKt {
    private static ImageVector _manageHistory;

    public static final ImageVector getManageHistory(Icons.TwoTone twoTone) {
        ImageVector imageVector = _manageHistory;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ManageHistory", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.69f, 18.37f);
        pathBuilder.lineToRelative(1.14f, -1.0f);
        pathBuilder.lineToRelative(-1.0f, -1.73f);
        pathBuilder.lineToRelative(-1.45f, 0.49f);
        pathBuilder.curveToRelative(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f);
        pathBuilder.lineTo(20.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-0.3f, 1.49f);
        pathBuilder.curveToRelative(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f);
        pathBuilder.lineToRelative(-1.45f, -0.49f);
        pathBuilder.lineToRelative(-1.0f, 1.73f);
        pathBuilder.lineToRelative(1.14f, 1.0f);
        pathBuilder.curveToRelative(-0.08f, 0.5f, -0.08f, 0.76f, 0.0f, 1.26f);
        pathBuilder.lineToRelative(-1.14f, 1.0f);
        pathBuilder.lineToRelative(1.0f, 1.73f);
        pathBuilder.lineToRelative(1.45f, -0.49f);
        pathBuilder.curveToRelative(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f);
        pathBuilder.lineTo(18.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(0.3f, -1.49f);
        pathBuilder.curveToRelative(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f);
        pathBuilder.lineToRelative(1.45f, 0.49f);
        pathBuilder.lineToRelative(1.0f, -1.73f);
        pathBuilder.lineToRelative(-1.14f, -1.0f);
        pathBuilder.curveTo(22.77f, 19.13f, 22.77f, 18.87f, 22.69f, 18.37f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 21.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(20.1f, 21.0f, 19.0f, 21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 7.0f);
        pathBuilder.verticalLineToRelative(5.41f);
        pathBuilder.lineToRelative(2.36f, 2.36f);
        pathBuilder.lineToRelative(1.04f, -1.79f);
        pathBuilder.lineTo(13.0f, 11.59f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder.curveTo(9.17f, 3.0f, 6.65f, 4.32f, 5.0f, 6.36f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(6.26f);
        pathBuilder.curveTo(7.53f, 6.19f, 9.63f, 5.0f, 12.0f, 5.0f);
        pathBuilder.curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.86f, 18.91f);
        pathBuilder.curveTo(7.87f, 18.42f, 5.51f, 16.01f, 5.08f, 13.0f);
        pathBuilder.horizontalLineTo(3.06f);
        pathBuilder.curveToRelative(0.5f, 4.5f, 4.31f, 8.0f, 8.94f, 8.0f);
        pathBuilder.curveToRelative(0.02f, 0.0f, 0.05f, 0.0f, 0.07f, 0.0f);
        pathBuilder.lineTo(10.86f, 18.91f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _manageHistory = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
