package androidx.compose.material.icons.rounded;

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
public final class SpeedKt {
    private static ImageVector _speed;

    public static final ImageVector getSpeed(Icons.Rounded rounded) {
        ImageVector imageVector = _speed;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Speed", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.46f, 10.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.07f, 1.0f);
        pathBuilder.arcToRelative(7.55f, 7.55f, 0.0f, false, true, 0.52f, 1.81f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.69f, 4.73f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.89f, 0.53f);
        pathBuilder.horizontalLineTo(5.68f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.89f, -0.54f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 13.0f, 6.06f);
        pathBuilder.arcToRelative(7.69f, 7.69f, 0.0f, false, true, 2.11f, 0.56f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -0.07f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.17f, -1.76f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 3.35f, 19.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.72f, 1.0f);
        pathBuilder.horizontalLineToRelative(13.85f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.74f, -1.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.55f, -8.89f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.75f, -0.11f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.59f, 12.59f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.83f, 2.83f);
        pathBuilder2.lineToRelative(5.66f, -8.49f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speed = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
