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
public final class ChangeHistoryKt {
    private static ImageVector _changeHistory;

    public static final ImageVector getChangeHistory(Icons.Rounded rounded) {
        ImageVector imageVector = _changeHistory;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ChangeHistory", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.77f);
        pathBuilder.lineTo(18.39f, 18.0f);
        pathBuilder.horizontalLineTo(5.61f);
        pathBuilder.lineTo(12.0f, 7.77f);
        pathBuilder.moveToRelative(-0.85f, -2.41f);
        pathBuilder.lineToRelative(-8.2f, 13.11f);
        pathBuilder.curveToRelative(-0.41f, 0.67f, 0.07f, 1.53f, 0.85f, 1.53f);
        pathBuilder.horizontalLineToRelative(16.4f);
        pathBuilder.curveToRelative(0.79f, 0.0f, 1.26f, -0.86f, 0.85f, -1.53f);
        pathBuilder.lineToRelative(-8.2f, -13.11f);
        pathBuilder.curveToRelative(-0.39f, -0.63f, -1.31f, -0.63f, -1.7f, 0.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _changeHistory = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
