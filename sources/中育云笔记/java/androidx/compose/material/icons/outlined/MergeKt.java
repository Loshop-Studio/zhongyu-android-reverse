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
public final class MergeKt {
    private static ImageVector _merge;

    public static final ImageVector getMerge(Icons.Outlined outlined) {
        ImageVector imageVector = _merge;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Merge", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.41f, 21.0f);
        pathBuilder.lineTo(5.0f, 19.59f);
        pathBuilder.lineToRelative(4.83f, -4.83f);
        pathBuilder.curveToRelative(0.75f, -0.75f, 1.17f, -1.77f, 1.17f, -2.83f);
        pathBuilder.verticalLineToRelative(-5.1f);
        pathBuilder.lineTo(9.41f, 8.41f);
        pathBuilder.lineTo(8.0f, 7.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(13.0f, 6.83f);
        pathBuilder.verticalLineToRelative(5.1f);
        pathBuilder.curveToRelative(0.0f, 1.06f, 0.42f, 2.08f, 1.17f, 2.83f);
        pathBuilder.lineTo(19.0f, 19.59f);
        pathBuilder.lineTo(17.59f, 21.0f);
        pathBuilder.lineTo(12.0f, 15.41f);
        pathBuilder.lineTo(6.41f, 21.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _merge = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
