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
public final class RemoveDoneKt {
    private static ImageVector _removeDone;

    public static final ImageVector getRemoveDone(Icons.Rounded rounded) {
        ImageVector imageVector = _removeDone;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RemoveDone", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.14f, 2.69f);
        pathBuilder.lineTo(4.14f, 2.69f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(9.67f, 9.67f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(-3.54f, -3.53f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(4.24f, 4.24f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.12f, -2.12f);
        pathBuilder.lineToRelative(5.89f, 5.89f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(5.55f, 2.69f);
        pathBuilder.curveTo(5.16f, 2.3f, 4.53f, 2.3f, 4.14f, 2.69f);
        pathBuilder.close();
        pathBuilder.moveTo(18.05f, 12.36f);
        pathBuilder.lineToRelative(4.24f, -4.24f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, -0.38f, -1.02f, -0.38f, -1.41f, 0.01f);
        pathBuilder.lineToRelative(-4.24f, 4.24f);
        pathBuilder.lineTo(18.05f, 12.36f);
        pathBuilder.close();
        pathBuilder.moveTo(16.64f, 6.7f);
        pathBuilder.lineTo(16.64f, 6.7f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder.curveTo(17.03f, 7.72f, 17.03f, 7.09f, 16.64f, 6.7f);
        pathBuilder.close();
        pathBuilder.moveTo(1.79f, 13.06f);
        pathBuilder.lineToRelative(4.95f, 4.95f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(3.2f, 11.65f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(1.4f, 12.04f, 1.4f, 12.67f, 1.79f, 13.06f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeDone = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
