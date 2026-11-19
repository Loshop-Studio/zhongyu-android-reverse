package androidx.compose.material.icons.sharp;

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
public final class PhotoFilterKt {
    private static ImageVector _photoFilter;

    public static final ImageVector getPhotoFilter(Icons.Sharp sharp) {
        ImageVector imageVector = _photoFilter;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhotoFilter", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 10.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineTo(4.98f, 19.0f);
        pathBuilder.lineTo(4.98f, 5.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.lineTo(13.98f, 3.0f);
        pathBuilder.lineTo(3.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(21.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 10.0f);
        pathBuilder.lineToRelative(0.94f, -2.06f);
        pathBuilder.lineTo(20.0f, 7.0f);
        pathBuilder.lineToRelative(-2.06f, -0.94f);
        pathBuilder.lineTo(17.0f, 4.0f);
        pathBuilder.lineToRelative(-0.94f, 2.06f);
        pathBuilder.lineTo(14.0f, 7.0f);
        pathBuilder.lineToRelative(2.06f, 0.94f);
        pathBuilder.lineTo(17.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.25f, 10.75f);
        pathBuilder.lineTo(12.0f, 8.0f);
        pathBuilder.lineToRelative(-1.25f, 2.75f);
        pathBuilder.lineTo(8.0f, 12.0f);
        pathBuilder.lineToRelative(2.75f, 1.25f);
        pathBuilder.lineTo(12.0f, 16.0f);
        pathBuilder.lineToRelative(1.25f, -2.75f);
        pathBuilder.lineTo(16.0f, 12.0f);
        pathBuilder.lineToRelative(-2.75f, -1.25f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoFilter = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
