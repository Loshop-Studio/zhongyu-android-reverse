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
public final class SyncProblemKt {
    private static ImageVector _syncProblem;

    public static final ImageVector getSyncProblem(Icons.TwoTone twoTone) {
        ImageVector imageVector = _syncProblem;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SyncProblem", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f);
        pathBuilder.lineTo(3.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.lineToRelative(-2.24f, 2.24f);
        pathBuilder.curveTo(5.68f, 15.15f, 5.0f, 13.66f, 5.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.61f, 1.67f, -4.83f, 4.0f, -5.65f);
        pathBuilder.lineTo(9.0f, 4.26f);
        pathBuilder.curveTo(5.55f, 5.15f, 3.0f, 8.27f, 3.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineToRelative(2.24f, -2.24f);
        pathBuilder.curveTo(18.32f, 8.85f, 19.0f, 10.34f, 19.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.61f, -1.67f, 4.83f, -4.0f, 5.65f);
        pathBuilder.verticalLineToRelative(2.09f);
        pathBuilder.curveToRelative(3.45f, -0.89f, 6.0f, -4.01f, 6.0f, -7.74f);
        pathBuilder.curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f);
        pathBuilder.lineTo(21.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(13.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncProblem = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
