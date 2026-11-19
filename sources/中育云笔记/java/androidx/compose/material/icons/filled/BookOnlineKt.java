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
public final class BookOnlineKt {
    private static ImageVector _bookOnline;

    public static final ImageVector getBookOnline(Icons.Filled filled) {
        ImageVector imageVector = _bookOnline;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BookOnline", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 1.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveTo(19.0f, 1.9f, 18.1f, 1.0f, 17.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 18.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 11.0f);
        pathBuilder.verticalLineTo(9.14f);
        pathBuilder.curveTo(16.0f, 8.51f, 15.55f, 8.0f, 15.0f, 8.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveTo(8.45f, 8.0f, 8.0f, 8.51f, 8.0f, 9.14f);
        pathBuilder.lineToRelative(0.0f, 1.96f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.lineToRelative(0.0f, 1.76f);
        pathBuilder.curveTo(8.0f, 15.49f, 8.45f, 16.0f, 9.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.51f, 1.0f, -1.14f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveTo(15.0f, 11.45f, 15.45f, 11.0f, 16.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 14.5f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(14.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 12.5f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(12.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bookOnline = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
