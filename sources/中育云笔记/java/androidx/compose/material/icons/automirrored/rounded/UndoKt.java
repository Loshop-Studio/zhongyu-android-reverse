package androidx.compose.material.icons.automirrored.rounded;

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
public final class UndoKt {
    private static ImageVector _undo;

    public static final ImageVector getUndo(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _undo;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.Undo", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.5f, 8.0f);
        pathBuilder.curveToRelative(-2.65f, 0.0f, -5.05f, 0.99f, -6.9f, 2.6f);
        pathBuilder.lineTo(3.71f, 8.71f);
        pathBuilder.curveTo(3.08f, 8.08f, 2.0f, 8.52f, 2.0f, 9.41f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(5.59f);
        pathBuilder.curveToRelative(0.89f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f);
        pathBuilder.lineToRelative(-1.91f, -1.91f);
        pathBuilder.curveToRelative(1.39f, -1.16f, 3.16f, -1.88f, 5.12f, -1.88f);
        pathBuilder.curveToRelative(3.16f, 0.0f, 5.89f, 1.84f, 7.19f, 4.5f);
        pathBuilder.curveToRelative(0.27f, 0.56f, 0.91f, 0.84f, 1.5f, 0.64f);
        pathBuilder.curveToRelative(0.71f, -0.23f, 1.07f, -1.04f, 0.75f, -1.72f);
        pathBuilder.curveTo(20.23f, 10.42f, 16.65f, 8.0f, 12.5f, 8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _undo = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
