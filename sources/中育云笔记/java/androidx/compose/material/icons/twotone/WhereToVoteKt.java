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
public final class WhereToVoteKt {
    private static ImageVector _whereToVote;

    public static final ImageVector getWhereToVote(Icons.TwoTone twoTone) {
        ImageVector imageVector = _whereToVote;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WhereToVote", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveTo(8.69f, 3.0f, 6.0f, 5.69f, 6.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 3.54f, 3.82f, 8.86f, 6.0f, 11.47f);
        pathBuilder.curveToRelative(1.75f, -2.11f, 6.0f, -7.63f, 6.0f, -11.47f);
        pathBuilder.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.47f, 14.0f);
        pathBuilder.lineToRelative(-3.18f, -3.18f);
        pathBuilder.lineTo(8.71f, 9.4f);
        pathBuilder.lineToRelative(1.77f, 1.77f);
        pathBuilder.lineToRelative(4.6f, -4.6f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(10.47f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 1.0f);
        pathBuilder2.curveTo(7.59f, 1.0f, 4.0f, 4.59f, 4.0f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, 5.57f, 6.96f, 13.34f, 7.26f, 13.67f);
        pathBuilder2.lineToRelative(0.74f, 0.82f);
        pathBuilder2.lineToRelative(0.74f, -0.82f);
        pathBuilder2.curveTo(13.04f, 22.34f, 20.0f, 14.57f, 20.0f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 20.47f);
        pathBuilder2.curveTo(9.82f, 17.86f, 6.0f, 12.54f, 6.0f, 9.0f);
        pathBuilder2.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, 3.83f, -4.25f, 9.36f, -6.0f, 11.47f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.07f, 6.57f);
        pathBuilder2.lineToRelative(-4.6f, 4.6f);
        pathBuilder2.lineTo(8.71f, 9.4f);
        pathBuilder2.lineToRelative(-1.42f, 1.42f);
        pathBuilder2.lineTo(10.47f, 14.0f);
        pathBuilder2.lineToRelative(6.01f, -6.01f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _whereToVote = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
