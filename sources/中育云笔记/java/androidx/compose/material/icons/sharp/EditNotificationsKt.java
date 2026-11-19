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
public final class EditNotificationsKt {
    private static ImageVector _editNotifications;

    public static final ImageVector getEditNotifications(Icons.Sharp sharp) {
        ImageVector imageVector = _editNotifications;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EditNotifications", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.58f, 6.25f);
        pathBuilder.lineToRelative(1.77f, 1.77f);
        pathBuilder.lineTo(14.37f, 13.0f);
        pathBuilder.horizontalLineTo(12.6f);
        pathBuilder.verticalLineToRelative(-1.77f);
        pathBuilder.lineTo(17.58f, 6.25f);
        pathBuilder.close();
        pathBuilder.moveTo(20.85f, 5.81f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilder.lineToRelative(-0.85f, 0.85f);
        pathBuilder.lineToRelative(1.77f, 1.77f);
        pathBuilder.lineToRelative(0.85f, -0.85f);
        pathBuilder.curveTo(21.05f, 6.32f, 21.05f, 6.0f, 20.85f, 5.81f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 12.2f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-7.0f);
        pathBuilder.curveToRelative(0.0f, -2.79f, 1.91f, -5.14f, 4.5f, -5.8f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(2.2f);
        pathBuilder.curveToRelative(0.82f, 0.21f, 1.57f, 0.59f, 2.21f, 1.09f);
        pathBuilder.lineTo(10.6f, 10.4f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineToRelative(4.6f);
        pathBuilder.lineTo(18.0f, 12.2f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 21.1f, 10.0f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editNotifications = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
