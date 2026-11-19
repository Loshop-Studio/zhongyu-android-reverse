package androidx.compose.material.icons.automirrored.sharp;

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

    public static final ImageVector getUndo(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _undo;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.Undo", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.5f, 8.0f);
        pathBuilder.curveToRelative(-2.65f, 0.0f, -5.05f, 0.99f, -6.9f, 2.6f);
        pathBuilder.lineTo(2.0f, 7.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.lineToRelative(-3.62f, -3.62f);
        pathBuilder.curveToRelative(1.39f, -1.16f, 3.16f, -1.88f, 5.12f, -1.88f);
        pathBuilder.curveToRelative(3.54f, 0.0f, 6.55f, 2.31f, 7.6f, 5.5f);
        pathBuilder.lineToRelative(2.37f, -0.78f);
        pathBuilder.curveTo(21.08f, 11.03f, 17.15f, 8.0f, 12.5f, 8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _undo = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
