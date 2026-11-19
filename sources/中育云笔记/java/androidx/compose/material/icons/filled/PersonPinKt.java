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
public final class PersonPinKt {
    private static ImageVector _personPin;

    public static final ImageVector getPersonPin(Icons.Filled filled) {
        ImageVector imageVector = _personPin;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PersonPin", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 4.17f, 2.84f, 7.67f, 6.69f, 8.69f);
        pathBuilder.lineTo(12.0f, 22.0f);
        pathBuilder.lineToRelative(2.31f, -2.31f);
        pathBuilder.curveTo(18.16f, 18.67f, 21.0f, 15.17f, 21.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.3f);
        pathBuilder.curveToRelative(-2.5f, 0.0f, -4.71f, -1.28f, -6.0f, -3.22f);
        pathBuilder.curveToRelative(0.03f, -1.99f, 4.0f, -3.08f, 6.0f, -3.08f);
        pathBuilder.curveToRelative(1.99f, 0.0f, 5.97f, 1.09f, 6.0f, 3.08f);
        pathBuilder.curveToRelative(-1.29f, 1.94f, -3.5f, 3.22f, -6.0f, 3.22f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personPin = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
