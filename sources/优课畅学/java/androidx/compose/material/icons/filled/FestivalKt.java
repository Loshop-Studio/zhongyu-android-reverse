package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class FestivalKt {
    private static ImageVector _festival;

    public static final ImageVector getFestival(Icons.Filled filled) {
        ImageVector imageVector = _festival;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Festival", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 5.7f);
        pathBuilder.lineToRelative(0.0f, -1.7f);
        pathBuilder.lineToRelative(3.0f, 0.0f);
        pathBuilder.lineToRelative(-1.0f, -1.49f);
        pathBuilder.lineToRelative(1.0f, -1.51f);
        pathBuilder.lineToRelative(-5.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 4.7f);
        pathBuilder.lineToRelative(-9.0f, 6.3f);
        pathBuilder.lineToRelative(0.0f, 10.0f);
        pathBuilder.lineToRelative(7.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -5.0f);
        pathBuilder.lineToRelative(3.03f, -2.0f);
        pathBuilder.lineToRelative(2.97f, 2.0f);
        pathBuilder.lineToRelative(0.0f, 5.0f);
        pathBuilder.lineToRelative(7.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _festival = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
