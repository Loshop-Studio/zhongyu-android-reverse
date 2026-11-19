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

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7880d2 = {"_fiberPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberPin", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFiberPin", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nFiberPin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiberPin.kt\nandroidx/compose/material/icons/twotone/FiberPinKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n233#2,18:146\n253#2:183\n233#2,18:184\n253#2:221\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n705#4,2:164\n717#4,2:166\n719#4,11:172\n705#4,2:202\n717#4,2:204\n719#4,11:210\n72#5,4:130\n72#5,4:168\n72#5,4:206\n*S KotlinDebug\n*F\n+ 1 FiberPin.kt\nandroidx/compose/material/icons/twotone/FiberPinKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n64#1:146,18\n64#1:183\n71#1:184,18\n71#1:221\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n64#1:164,2\n64#1:166,2\n64#1:172,11\n71#1:202,2\n71#1:204,2\n71#1:210,11\n30#1:130,4\n64#1:168,4\n71#1:206,4\n*E\n"})
/* loaded from: classes.dex */
public final class FiberPinKt {
    private static ImageVector _fiberPin;

    public static final ImageVector getFiberPin(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fiberPin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FiberPin", C2452Dp.m16484constructorimpl(24.0f), C2452Dp.m16484constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM14252getButtKaPHkGw = companion2.m14252getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM14262getBevelLxFBmk8 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 14.62f);
        pathBuilder.horizontalLineToRelative(1.31f);
        pathBuilder.verticalLineToRelative(-1.75f);
        pathBuilder.horizontalLineToRelative(1.75f);
        pathBuilder.curveToRelative(0.74f, 0.0f, 1.31f, -0.57f, 1.31f, -1.31f);
        pathBuilder.verticalLineToRelative(-0.88f);
        pathBuilder.curveToRelative(0.0f, -0.74f, -0.57f, -1.31f, -1.31f, -1.31f);
        pathBuilder.lineTo(5.0f, 9.37f);
        pathBuilder.verticalLineToRelative(5.25f);
        pathBuilder.close();
        pathBuilder.moveTo(6.31f, 10.69f);
        pathBuilder.horizontalLineToRelative(1.75f);
        pathBuilder.verticalLineToRelative(0.88f);
        pathBuilder.lineTo(6.31f, 11.57f);
        pathBuilder.verticalLineToRelative(-0.88f);
        pathBuilder.close();
        pathBuilder.moveTo(11.34f, 9.38f);
        pathBuilder.horizontalLineToRelative(1.31f);
        pathBuilder.verticalLineToRelative(5.25f);
        pathBuilder.horizontalLineToRelative(-1.31f);
        pathBuilder.close();
        pathBuilder.moveTo(14.62f, 14.62f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.verticalLineToRelative(-3.06f);
        pathBuilder.lineToRelative(2.23f, 3.06f);
        pathBuilder.lineTo(19.0f, 14.62f);
        pathBuilder.lineTo(19.0f, 9.38f);
        pathBuilder.horizontalLineToRelative(-1.09f);
        pathBuilder.verticalLineToRelative(3.06f);
        pathBuilder.lineToRelative(-2.19f, -3.06f);
        pathBuilder.horizontalLineToRelative(-1.1f);
        pathBuilder.close();
        ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw, iM14262getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw2 = companion2.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk82 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(4.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.close();
        ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM14252getButtKaPHkGw2, iM14262getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw3 = companion2.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk83 = companion3.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 4.0f);
        pathBuilder3.lineTo(4.0f, 4.0f);
        pathBuilder3.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        pathBuilder3.lineTo(2.0f, 18.0f);
        pathBuilder3.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder3.lineTo(22.0f, 6.0f);
        pathBuilder3.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(20.0f, 18.0f);
        pathBuilder3.lineTo(4.0f, 18.0f);
        pathBuilder3.lineTo(4.0f, 6.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.verticalLineToRelative(12.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw3, iM14262getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberPin = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
