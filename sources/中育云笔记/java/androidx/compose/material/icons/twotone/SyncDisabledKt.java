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
public final class SyncDisabledKt {
    private static ImageVector _syncDisabled;

    public static final ImageVector getSyncDisabled(Icons.TwoTone twoTone) {
        ImageVector imageVector = _syncDisabled;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SyncDisabled", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 6.35f);
        pathBuilder.verticalLineTo(4.26f);
        pathBuilder.curveToRelative(-0.66f, 0.17f, -1.29f, 0.43f, -1.88f, 0.75f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.curveToRelative(0.13f, -0.05f, 0.25f, -0.11f, 0.38f, -0.16f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f);
        pathBuilder.lineTo(20.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineToRelative(2.24f, -2.24f);
        pathBuilder.curveTo(17.32f, 8.85f, 18.0f, 10.34f, 18.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.85f, -0.19f, 1.65f, -0.51f, 2.38f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.curveTo(19.63f, 14.74f, 20.0f, 13.41f, 20.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.27f, 4.0f);
        pathBuilder.lineTo(2.86f, 5.41f);
        pathBuilder.lineToRelative(2.36f, 2.36f);
        pathBuilder.curveTo(4.45f, 8.99f, 4.0f, 10.44f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.lineToRelative(-2.24f, 2.24f);
        pathBuilder.curveTo(6.68f, 15.15f, 6.0f, 13.66f, 6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.0f, 0.25f, -1.94f, 0.68f, -2.77f);
        pathBuilder.lineToRelative(8.08f, 8.08f);
        pathBuilder.curveToRelative(-0.25f, 0.13f, -0.5f, 0.24f, -0.76f, 0.34f);
        pathBuilder.verticalLineToRelative(2.09f);
        pathBuilder.curveToRelative(0.8f, -0.21f, 1.55f, -0.54f, 2.23f, -0.96f);
        pathBuilder.lineToRelative(2.58f, 2.58f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(4.27f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncDisabled = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
