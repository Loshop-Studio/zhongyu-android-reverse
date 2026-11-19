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
public final class RemoveDoneKt {
    private static ImageVector _removeDone;

    public static final ImageVector getRemoveDone(Icons.Filled filled) {
        ImageVector imageVector = _removeDone;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RemoveDone", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.79f, 12.0f);
        pathBuilder.lineToRelative(5.58f, 5.59f);
        pathBuilder.lineTo(5.96f, 19.0f);
        pathBuilder.lineTo(0.37f, 13.41f);
        pathBuilder.lineTo(1.79f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.24f, 4.22f);
        pathBuilder.lineTo(12.9f, 14.89f);
        pathBuilder.lineToRelative(-1.28f, 1.28f);
        pathBuilder.lineTo(7.44f, 12.0f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(11.62f, 19.0f);
        pathBuilder.lineToRelative(2.69f, -2.69f);
        pathBuilder.lineToRelative(4.89f, 4.89f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(3.65f, 2.81f);
        pathBuilder.lineTo(2.24f, 4.22f);
        pathBuilder.close();
        pathBuilder.moveTo(17.14f, 13.49f);
        pathBuilder.lineTo(23.62f, 7.0f);
        pathBuilder.lineTo(22.2f, 5.59f);
        pathBuilder.lineToRelative(-6.48f, 6.48f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(17.96f, 7.0f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-3.65f, 3.66f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(17.96f, 7.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeDone = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
