package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.SolidColor;
import androidx.compose.p009ui.graphics.StrokeCap;
import androidx.compose.p009ui.graphics.StrokeJoin;
import androidx.compose.p009ui.graphics.vector.ImageVector;
import androidx.compose.p009ui.graphics.vector.PathBuilder;
import androidx.compose.p009ui.graphics.vector.VectorKt;
import androidx.compose.p009ui.unit.C2452Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7880d2 = {"_chalet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Chalet", "Landroidx/compose/material/icons/Icons$TwoTone;", "getChalet", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nChalet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chalet.kt\nandroidx/compose/material/icons/twotone/ChaletKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n212#2,12:118\n233#2,18:131\n253#2:168\n233#2,18:169\n253#2:206\n174#3:130\n705#4,2:149\n717#4,2:151\n719#4,11:157\n705#4,2:187\n717#4,2:189\n719#4,11:195\n72#5,4:153\n72#5,4:191\n*S KotlinDebug\n*F\n+ 1 Chalet.kt\nandroidx/compose/material/icons/twotone/ChaletKt\n*L\n29#1:118,12\n30#1:131,18\n30#1:168\n42#1:169,18\n42#1:206\n29#1:130\n30#1:149,2\n30#1:151,2\n30#1:157,11\n42#1:187,2\n42#1:189,2\n42#1:195,11\n30#1:153,4\n42#1:191,4\n*E\n"})
/* loaded from: classes.dex */
public final class ChaletKt {
    private static ImageVector _chalet;

    public static final ImageVector getChalet(Icons.TwoTone twoTone) {
        ImageVector imageVector = _chalet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Chalet", C2452Dp.m16484constructorimpl(24.0f), C2452Dp.m16484constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM14252getButtKaPHkGw = companion2.m14252getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM14262getBevelLxFBmk8 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 18.0f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -3.0f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 3.0f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -4.67f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.close();
        ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM14252getButtKaPHkGw, iM14262getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw2 = companion2.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk82 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.5f, 15.0f);
        pathBuilder2.lineTo(10.0f, 7.5f);
        pathBuilder2.lineTo(2.5f, 15.0f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineTo(5.0f, 15.33f);
        pathBuilder2.verticalLineTo(20.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.verticalLineToRelative(-4.67f);
        pathBuilder2.lineToRelative(1.09f, 1.09f);
        pathBuilder2.lineTo(17.5f, 15.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 18.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(-3.0f);
        pathBuilder2.horizontalLineTo(9.0f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.horizontalLineTo(7.0f);
        pathBuilder2.verticalLineToRelative(-4.67f);
        pathBuilder2.lineToRelative(3.0f, -3.0f);
        pathBuilder2.lineToRelative(3.0f, 3.0f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(22.0f, 7.5f);
        pathBuilder2.horizontalLineToRelative(-1.19f);
        pathBuilder2.lineToRelative(0.75f, 0.75f);
        pathBuilder2.lineToRelative(-0.71f, 0.71f);
        pathBuilder2.lineTo(19.39f, 7.5f);
        pathBuilder2.horizontalLineTo(18.5f);
        pathBuilder2.verticalLineToRelative(0.89f);
        pathBuilder2.lineToRelative(1.45f, 1.45f);
        pathBuilder2.lineToRelative(-0.71f, 0.71f);
        pathBuilder2.lineTo(18.5f, 9.81f);
        pathBuilder2.verticalLineTo(11.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.verticalLineTo(9.81f);
        pathBuilder2.lineToRelative(-0.75f, 0.75f);
        pathBuilder2.lineToRelative(-0.71f, -0.71f);
        pathBuilder2.lineToRelative(1.45f, -1.45f);
        pathBuilder2.verticalLineTo(7.5f);
        pathBuilder2.horizontalLineToRelative(-0.89f);
        pathBuilder2.lineToRelative(-1.45f, 1.45f);
        pathBuilder2.lineToRelative(-0.71f, -0.71f);
        pathBuilder2.lineToRelative(0.75f, -0.75f);
        pathBuilder2.horizontalLineTo(14.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineToRelative(1.19f);
        pathBuilder2.lineToRelative(-0.75f, -0.75f);
        pathBuilder2.lineToRelative(0.71f, -0.71f);
        pathBuilder2.lineToRelative(1.45f, 1.45f);
        pathBuilder2.horizontalLineToRelative(0.89f);
        pathBuilder2.verticalLineTo(5.61f);
        pathBuilder2.lineToRelative(-1.45f, -1.45f);
        pathBuilder2.lineToRelative(0.71f, -0.71f);
        pathBuilder2.lineToRelative(0.75f, 0.75f);
        pathBuilder2.verticalLineTo(3.0f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.verticalLineToRelative(1.19f);
        pathBuilder2.lineToRelative(0.75f, -0.75f);
        pathBuilder2.lineToRelative(0.71f, 0.71f);
        pathBuilder2.lineTo(18.5f, 5.61f);
        pathBuilder2.verticalLineTo(6.5f);
        pathBuilder2.horizontalLineToRelative(0.89f);
        pathBuilder2.lineToRelative(1.45f, -1.45f);
        pathBuilder2.lineToRelative(0.71f, 0.71f);
        pathBuilder2.lineTo(20.81f, 6.5f);
        pathBuilder2.horizontalLineTo(22.0f);
        pathBuilder2.verticalLineTo(7.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw2, iM14262getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chalet = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
