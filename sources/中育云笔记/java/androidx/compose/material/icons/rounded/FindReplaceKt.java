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
public final class FindReplaceKt {
    private static ImageVector _findReplace;

    public static final ImageVector getFindReplace(Icons.Rounded rounded) {
        ImageVector imageVector = _findReplace;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FindReplace", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 6.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.63f, 0.56f, 3.54f, 1.46f);
        pathBuilder.lineToRelative(-1.69f, 1.69f);
        pathBuilder.curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
        pathBuilder.horizontalLineToRelative(4.29f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.lineTo(18.0f, 5.21f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineToRelative(-1.2f, 1.2f);
        pathBuilder.curveTo(14.68f, 4.78f, 12.93f, 4.0f, 11.0f, 4.0f);
        pathBuilder.curveTo(7.96f, 4.0f, 5.38f, 5.94f, 4.42f, 8.64f);
        pathBuilder.curveToRelative(-0.24f, 0.66f, 0.23f, 1.36f, 0.93f, 1.36f);
        pathBuilder.curveToRelative(0.42f, 0.0f, 0.79f, -0.26f, 0.93f, -0.66f);
        pathBuilder.curveTo(6.96f, 7.4f, 8.82f, 6.0f, 11.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.64f, 15.14f);
        pathBuilder.curveToRelative(0.4f, -0.54f, 0.72f, -1.15f, 0.95f, -1.8f);
        pathBuilder.curveToRelative(0.23f, -0.65f, -0.25f, -1.34f, -0.94f, -1.34f);
        pathBuilder.curveToRelative(-0.42f, 0.0f, -0.79f, 0.26f, -0.93f, 0.66f);
        pathBuilder.curveTo(15.04f, 14.6f, 13.18f, 16.0f, 11.0f, 16.0f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.63f, -0.56f, -3.54f, -1.46f);
        pathBuilder.lineToRelative(1.69f, -1.69f);
        pathBuilder.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        pathBuilder.lineTo(4.5f, 12.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(4.29f);
        pathBuilder.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilder.lineToRelative(1.2f, -1.2f);
        pathBuilder.curveTo(7.32f, 17.22f, 9.07f, 18.0f, 11.0f, 18.0f);
        pathBuilder.curveToRelative(1.55f, 0.0f, 2.98f, -0.51f, 4.14f, -1.36f);
        pathBuilder.lineToRelative(4.11f, 4.11f);
        pathBuilder.curveToRelative(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f);
        pathBuilder.curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        pathBuilder.lineToRelative(-4.1f, -4.12f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _findReplace = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
