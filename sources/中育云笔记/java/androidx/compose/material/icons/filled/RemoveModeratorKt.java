package androidx.compose.material.icons.filled;

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
public final class RemoveModeratorKt {
    private static ImageVector _removeModerator;

    public static final ImageVector getRemoveModerator(Icons.Filled filled) {
        ImageVector imageVector = _removeModerator;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RemoveModerator", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.27f, 21.73f);
        pathBuilder.lineToRelative(-3.54f, -3.55f);
        pathBuilder.lineTo(5.78f, 5.23f);
        pathBuilder.lineTo(2.27f, 1.72f);
        pathBuilder.lineTo(1.0f, 2.99f);
        pathBuilder.lineTo(3.01f, 5.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        pathBuilder.curveToRelative(2.16f, -0.53f, 4.08f, -1.76f, 5.6f, -3.41f);
        pathBuilder.lineTo(21.0f, 23.0f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.92f);
        pathBuilder.lineToRelative(6.67f, 6.67f);
        pathBuilder.curveTo(20.51f, 14.87f, 21.0f, 12.96f, 21.0f, 11.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.lineToRelative(-9.0f, -4.0f);
        pathBuilder.lineToRelative(-5.48f, 2.44f);
        pathBuilder.lineTo(11.0f, 7.92f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeModerator = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
