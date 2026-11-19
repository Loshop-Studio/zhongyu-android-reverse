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
public final class RoomKt {
    private static ImageVector _room;

    public static final ImageVector getRoom(Icons.Filled filled) {
        ImageVector imageVector = _room;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Room", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(8.13f, 2.0f, 5.0f, 5.13f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, -7.75f, 7.0f, -13.0f);
        pathBuilder.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 11.5f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _room = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
