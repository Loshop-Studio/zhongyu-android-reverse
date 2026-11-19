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

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7880d2 = {"_moreTime", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MoreTime", "Landroidx/compose/material/icons/Icons$TwoTone;", "getMoreTime", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMoreTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoreTime.kt\nandroidx/compose/material/icons/twotone/MoreTimeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n212#2,12:76\n233#2,18:89\n253#2:126\n233#2,18:127\n253#2:164\n233#2,18:165\n253#2:202\n174#3:88\n705#4,2:107\n717#4,2:109\n719#4,11:115\n705#4,2:145\n717#4,2:147\n719#4,11:153\n705#4,2:183\n717#4,2:185\n719#4,11:191\n72#5,4:111\n72#5,4:149\n72#5,4:187\n*S KotlinDebug\n*F\n+ 1 MoreTime.kt\nandroidx/compose/material/icons/twotone/MoreTimeKt\n*L\n29#1:76,12\n30#1:89,18\n30#1:126\n39#1:127,18\n39#1:164\n55#1:165,18\n55#1:202\n29#1:88\n30#1:107,2\n30#1:109,2\n30#1:115,11\n39#1:145,2\n39#1:147,2\n39#1:153,11\n55#1:183,2\n55#1:185,2\n55#1:191,11\n30#1:111,4\n39#1:149,4\n55#1:187,4\n*E\n"})
/* loaded from: classes.dex */
public final class MoreTimeKt {
    private static ImageVector _moreTime;

    public static final ImageVector getMoreTime(Icons.TwoTone twoTone) {
        ImageVector imageVector = _moreTime;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MoreTime", C2452Dp.m16484constructorimpl(24.0f), C2452Dp.m16484constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM14252getButtKaPHkGw = companion2.m14252getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM14262getBevelLxFBmk8 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 8.0f);
        pathBuilder.lineToRelative(0.0f, 6.0f);
        pathBuilder.lineToRelative(4.7f, 2.9f);
        pathBuilder.lineToRelative(0.8f, -1.2f);
        pathBuilder.lineToRelative(-4.0f, -2.4f);
        pathBuilder.lineToRelative(0.0f, -5.3f);
        pathBuilder.close();
        ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw, iM14262getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw2 = companion2.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk82 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.92f, 12.0f);
        pathBuilder2.curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f);
        pathBuilder2.curveToRelative(0.0f, 3.9f, -3.1f, 7.0f, -7.0f, 7.0f);
        pathBuilder2.reflectiveCurveToRelative(-7.0f, -3.1f, -7.0f, -7.0f);
        pathBuilder2.curveToRelative(0.0f, -3.9f, 3.1f, -7.0f, 7.0f, -7.0f);
        pathBuilder2.curveToRelative(0.7f, 0.0f, 1.37f, 0.1f, 2.0f, 0.29f);
        pathBuilder2.verticalLineTo(4.23f);
        pathBuilder2.curveTo(12.36f, 4.08f, 11.69f, 4.0f, 11.0f, 4.0f);
        pathBuilder2.curveToRelative(-5.0f, 0.0f, -9.0f, 4.0f, -9.0f, 9.0f);
        pathBuilder2.reflectiveCurveToRelative(4.0f, 9.0f, 9.0f, 9.0f);
        pathBuilder2.reflectiveCurveToRelative(9.0f, -4.0f, 9.0f, -9.0f);
        pathBuilder2.curveToRelative(0.0f, -0.34f, -0.02f, -0.67f, -0.06f, -1.0f);
        pathBuilder2.horizontalLineTo(17.92f);
        pathBuilder2.close();
        ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw2, iM14262getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw3 = companion2.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk83 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 5.0f);
        pathBuilder3.lineToRelative(0.0f, -3.0f);
        pathBuilder3.lineToRelative(-2.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, 3.0f);
        pathBuilder3.lineToRelative(-3.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, 2.0f);
        pathBuilder3.lineToRelative(3.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, 3.0f);
        pathBuilder3.lineToRelative(2.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, -3.0f);
        pathBuilder3.lineToRelative(3.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, -2.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw3, iM14262getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moreTime = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
