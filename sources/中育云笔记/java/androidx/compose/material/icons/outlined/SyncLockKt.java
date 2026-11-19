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
public final class SyncLockKt {
    private static ImageVector _syncLock;

    public static final ImageVector getSyncLock(Icons.Outlined outlined) {
        ImageVector imageVector = _syncLock;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SyncLock", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 4.26f);
        pathBuilder.verticalLineToRelative(2.09f);
        pathBuilder.curveTo(7.67f, 7.18f, 6.0f, 9.39f, 6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.77f, 0.78f, 3.34f, 2.0f, 4.44f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.73f);
        pathBuilder.curveTo(5.06f, 16.54f, 4.0f, 14.4f, 4.0f, 12.0f);
        pathBuilder.curveTo(4.0f, 8.27f, 6.55f, 5.15f, 10.0f, 4.26f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(7.56f);
        pathBuilder.curveToRelative(1.22f, 1.1f, 2.0f, 2.67f, 2.0f, 4.44f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -2.4f, -1.06f, -4.54f, -2.73f, -6.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 17.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(21.0f, 17.45f, 20.55f, 17.0f, 20.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncLock = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
