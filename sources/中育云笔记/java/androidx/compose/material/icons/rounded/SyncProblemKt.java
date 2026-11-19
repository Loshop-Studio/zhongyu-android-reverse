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
public final class SyncProblemKt {
    private static ImageVector _syncProblem;

    public static final ImageVector getSyncProblem(Icons.Rounded rounded) {
        ImageVector imageVector = _syncProblem;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SyncProblem", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f);
        pathBuilder.lineToRelative(-1.51f, 1.51f);
        pathBuilder.curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
        pathBuilder.lineTo(8.5f, 20.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-4.29f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineToRelative(-1.39f, 1.39f);
        pathBuilder.curveTo(5.68f, 15.15f, 5.0f, 13.66f, 5.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.39f, 1.4f, -4.46f, 3.43f, -5.42f);
        pathBuilder.curveToRelative(0.34f, -0.16f, 0.57f, -0.47f, 0.57f, -0.84f);
        pathBuilder.verticalLineToRelative(-0.19f);
        pathBuilder.curveToRelative(0.0f, -0.68f, -0.71f, -1.11f, -1.32f, -0.82f);
        pathBuilder.curveTo(4.92f, 5.99f, 3.0f, 8.77f, 3.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.79f, 4.0f);
        pathBuilder.lineTo(15.5f, 4.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(4.29f);
        pathBuilder.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilder.lineToRelative(1.39f, -1.39f);
        pathBuilder.curveTo(18.32f, 8.85f, 19.0f, 10.34f, 19.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.39f, -1.4f, 4.46f, -3.43f, 5.42f);
        pathBuilder.curveToRelative(-0.34f, 0.16f, -0.57f, 0.47f, -0.57f, 0.84f);
        pathBuilder.verticalLineToRelative(0.18f);
        pathBuilder.curveToRelative(0.0f, 0.68f, 0.71f, 1.11f, 1.32f, 0.82f);
        pathBuilder.curveTo(19.08f, 18.01f, 21.0f, 15.23f, 21.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f);
        pathBuilder.lineToRelative(1.51f, -1.51f);
        pathBuilder.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 13.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.lineTo(13.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncProblem = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
