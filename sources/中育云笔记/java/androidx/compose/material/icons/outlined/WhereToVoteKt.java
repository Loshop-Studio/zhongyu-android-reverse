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
public final class WhereToVoteKt {
    private static ImageVector _whereToVote;

    public static final ImageVector getWhereToVote(Icons.Outlined outlined) {
        ImageVector imageVector = _whereToVote;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WhereToVote", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 1.0f);
        pathBuilder.curveTo(7.59f, 1.0f, 4.0f, 4.59f, 4.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 5.57f, 6.96f, 13.34f, 7.26f, 13.67f);
        pathBuilder.lineToRelative(0.74f, 0.82f);
        pathBuilder.lineToRelative(0.74f, -0.82f);
        pathBuilder.curveTo(13.04f, 22.34f, 20.0f, 14.57f, 20.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.47f);
        pathBuilder.curveTo(9.82f, 17.86f, 6.0f, 12.54f, 6.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, 3.83f, -4.25f, 9.36f, -6.0f, 11.47f);
        pathBuilder.close();
        pathBuilder.moveTo(10.47f, 11.17f);
        pathBuilder.lineTo(8.71f, 9.4f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.lineTo(10.47f, 14.0f);
        pathBuilder.lineToRelative(6.01f, -6.01f);
        pathBuilder.lineToRelative(-1.41f, -1.42f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _whereToVote = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
