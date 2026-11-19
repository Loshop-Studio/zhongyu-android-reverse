package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3127Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_hideImage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HideImage", "Landroidx/compose/material/icons/Icons$Filled;", "getHideImage", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nHideImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HideImage.kt\nandroidx/compose/material/icons/filled/HideImageKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,62:1\n212#2,12:63\n233#2,18:76\n253#2:113\n233#2,18:114\n253#2:151\n174#3:75\n705#4,2:94\n717#4,2:96\n719#4,11:102\n705#4,2:132\n717#4,2:134\n719#4,11:140\n72#5,4:98\n72#5,4:136\n*S KotlinDebug\n*F\n+ 1 HideImage.kt\nandroidx/compose/material/icons/filled/HideImageKt\n*L\n29#1:63,12\n30#1:76,18\n30#1:113\n38#1:114,18\n38#1:151\n29#1:75\n30#1:94,2\n30#1:96,2\n30#1:102,11\n38#1:132,2\n38#1:134,2\n38#1:140,11\n30#1:98,4\n38#1:136,4\n*E\n"})
/* loaded from: classes.dex */
public final class HideImageKt {
    private static ImageVector _hideImage;

    public static final ImageVector getHideImage(Icons.Filled filled) {
        ImageVector imageVector = _hideImage;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HideImage", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m21002getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM21329getButtKaPHkGw = companion2.m21329getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM21339getBevelLxFBmk8 = companion3.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(5.83f);
        pathBuilder.lineTo(21.0f, 18.17f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.close();
        ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw2 = companion2.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk82 = companion3.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(2.81f, 2.81f);
        pathBuilder2.lineTo(1.39f, 4.22f);
        pathBuilder2.lineTo(3.0f, 5.83f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(13.17f);
        pathBuilder2.lineToRelative(1.61f, 1.61f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(2.81f, 2.81f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 17.0f);
        pathBuilder2.lineToRelative(3.0f, -4.0f);
        pathBuilder2.lineToRelative(2.25f, 3.0f);
        pathBuilder2.lineToRelative(0.82f, -1.1f);
        pathBuilder2.lineToRelative(2.1f, 2.1f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw2, iM21339getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hideImage = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
