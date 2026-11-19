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
public final class PlaylistRemoveKt {
    private static ImageVector _playlistRemove;

    public static final ImageVector getPlaylistRemove(Icons.Sharp sharp) {
        ImageVector imageVector = _playlistRemove;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PlaylistRemove", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 10.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(11.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 6.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(11.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.41f, 22.0f);
        pathBuilder.lineTo(17.0f, 19.41f);
        pathBuilder.lineTo(19.59f, 22.0f);
        pathBuilder.lineTo(21.0f, 20.59f);
        pathBuilder.lineTo(18.41f, 18.0f);
        pathBuilder.lineTo(21.0f, 15.41f);
        pathBuilder.lineTo(19.59f, 14.0f);
        pathBuilder.lineTo(17.0f, 16.59f);
        pathBuilder.lineTo(14.41f, 14.0f);
        pathBuilder.lineTo(13.0f, 15.41f);
        pathBuilder.lineTo(15.59f, 18.0f);
        pathBuilder.lineTo(13.0f, 20.59f);
        pathBuilder.lineTo(14.41f, 22.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playlistRemove = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
