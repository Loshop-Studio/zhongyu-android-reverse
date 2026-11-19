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
public final class ViewCompactKt {
    private static ImageVector _viewCompact;

    public static final ImageVector getViewCompact(Icons.Sharp sharp) {
        ImageVector imageVector = _viewCompact;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ViewCompact", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 13.25f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(13.25f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 8.5f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 6.0f);
        pathBuilder.verticalLineToRelative(2.5f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 8.5f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineTo(8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 18.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineToRelative(-2.5f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 13.25f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineToRelative(-2.5f);
        pathBuilder.verticalLineTo(13.25f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 18.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 8.5f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.verticalLineTo(8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 13.25f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineTo(13.25f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 13.25f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.verticalLineTo(13.25f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewCompact = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
