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

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7880d2 = {"_autoAwesomeMosaic", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoAwesomeMosaic", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAutoAwesomeMosaic", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nAutoAwesomeMosaic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoAwesomeMosaic.kt\nandroidx/compose/material/icons/twotone/AutoAwesomeMosaicKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n233#2,18:154\n253#2:191\n233#2,18:192\n253#2:229\n233#2,18:230\n253#2:267\n233#2,18:268\n253#2:305\n233#2,18:306\n253#2:343\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n705#4,2:172\n717#4,2:174\n719#4,11:180\n705#4,2:210\n717#4,2:212\n719#4,11:218\n705#4,2:248\n717#4,2:250\n719#4,11:256\n705#4,2:286\n717#4,2:288\n719#4,11:294\n705#4,2:324\n717#4,2:326\n719#4,11:332\n72#5,4:138\n72#5,4:176\n72#5,4:214\n72#5,4:252\n72#5,4:290\n72#5,4:328\n*S KotlinDebug\n*F\n+ 1 AutoAwesomeMosaic.kt\nandroidx/compose/material/icons/twotone/AutoAwesomeMosaicKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n37#1:154,18\n37#1:191\n44#1:192,18\n44#1:229\n51#1:230,18\n51#1:267\n67#1:268,18\n67#1:305\n82#1:306,18\n82#1:343\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n37#1:172,2\n37#1:174,2\n37#1:180,11\n44#1:210,2\n44#1:212,2\n44#1:218,11\n51#1:248,2\n51#1:250,2\n51#1:256,11\n67#1:286,2\n67#1:288,2\n67#1:294,11\n82#1:324,2\n82#1:326,2\n82#1:332,11\n30#1:138,4\n37#1:176,4\n44#1:214,4\n51#1:252,4\n67#1:290,4\n82#1:328,4\n*E\n"})
/* loaded from: classes.dex */
public final class AutoAwesomeMosaicKt {
    private static ImageVector _autoAwesomeMosaic;

    public static final ImageVector getAutoAwesomeMosaic(Icons.TwoTone twoTone) {
        ImageVector imageVector = _autoAwesomeMosaic;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AutoAwesomeMosaic", C2452Dp.m16484constructorimpl(24.0f), C2452Dp.m16484constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM14252getButtKaPHkGw = companion2.m14252getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM14262getBevelLxFBmk8 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.close();
        ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM14252getButtKaPHkGw, iM14262getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw2 = companion2.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk82 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.0f, 15.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.close();
        ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM14252getButtKaPHkGw2, iM14262getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw3 = companion2.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk83 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.0f, 5.0f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        pathBuilder3.verticalLineToRelative(4.0f);
        pathBuilder3.horizontalLineToRelative(-4.0f);
        pathBuilder3.close();
        ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, iM14252getButtKaPHkGw3, iM14262getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw4 = companion2.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk84 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(3.0f, 5.0f);
        pathBuilder4.verticalLineToRelative(14.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(6.0f);
        pathBuilder4.verticalLineTo(3.0f);
        pathBuilder4.horizontalLineTo(5.0f);
        pathBuilder4.curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(9.0f, 19.0f);
        pathBuilder4.horizontalLineTo(5.0f);
        pathBuilder4.verticalLineTo(5.0f);
        pathBuilder4.horizontalLineToRelative(4.0f);
        pathBuilder4.verticalLineTo(19.0f);
        pathBuilder4.close();
        ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw4, iM14262getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw5 = companion2.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk85 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(19.0f, 3.0f);
        pathBuilder5.horizontalLineToRelative(-6.0f);
        pathBuilder5.verticalLineToRelative(8.0f);
        pathBuilder5.horizontalLineToRelative(8.0f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder5.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(19.0f, 9.0f);
        pathBuilder5.horizontalLineToRelative(-4.0f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder5.horizontalLineToRelative(4.0f);
        pathBuilder5.verticalLineTo(9.0f);
        pathBuilder5.close();
        ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw5, iM14262getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw6 = companion2.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk86 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(13.0f, 21.0f);
        pathBuilder6.horizontalLineToRelative(6.0f);
        pathBuilder6.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder6.verticalLineToRelative(-6.0f);
        pathBuilder6.horizontalLineToRelative(-8.0f);
        pathBuilder6.verticalLineTo(21.0f);
        pathBuilder6.close();
        pathBuilder6.moveTo(15.0f, 15.0f);
        pathBuilder6.horizontalLineToRelative(4.0f);
        pathBuilder6.verticalLineToRelative(4.0f);
        pathBuilder6.horizontalLineToRelative(-4.0f);
        pathBuilder6.verticalLineTo(15.0f);
        pathBuilder6.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw6, iM14262getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoAwesomeMosaic = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
