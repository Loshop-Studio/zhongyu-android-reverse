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
public final class RemoveModeratorKt {
    private static ImageVector _removeModerator;

    public static final ImageVector getRemoveModerator(Icons.Rounded rounded) {
        ImageVector imageVector = _removeModerator;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RemoveModerator", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 11.09f);
        pathBuilder.verticalLineToRelative(-4.7f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f);
        pathBuilder.lineToRelative(-6.0f, -2.25f);
        pathBuilder.curveToRelative(-0.45f, -0.17f, -0.95f, -0.17f, -1.4f, 0.0f);
        pathBuilder.lineTo(6.78f, 3.96f);
        pathBuilder.lineToRelative(12.09f, 12.09f);
        pathBuilder.curveTo(19.59f, 14.52f, 20.0f, 12.83f, 20.0f, 11.09f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 20.49f);
        pathBuilder.lineTo(3.51f, 3.51f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(4.0f, 6.83f);
        pathBuilder.verticalLineToRelative(4.26f);
        pathBuilder.curveToRelative(0.0f, 4.83f, 3.13f, 9.37f, 7.43f, 10.75f);
        pathBuilder.curveToRelative(0.37f, 0.12f, 0.77f, 0.12f, 1.14f, 0.0f);
        pathBuilder.curveToRelative(1.49f, -0.48f, 2.84f, -1.35f, 3.97f, -2.47f);
        pathBuilder.lineToRelative(2.53f, 2.53f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeModerator = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
