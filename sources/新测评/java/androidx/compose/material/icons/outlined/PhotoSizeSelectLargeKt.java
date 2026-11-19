package androidx.compose.material.icons.outlined;

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

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_photoSizeSelectLarge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhotoSizeSelectLarge", "Landroidx/compose/material/icons/Icons$Outlined;", "getPhotoSizeSelectLarge", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPhotoSizeSelectLarge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoSizeSelectLarge.kt\nandroidx/compose/material/icons/outlined/PhotoSizeSelectLargeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,120:1\n212#2,12:121\n233#2,18:134\n253#2:171\n174#3:133\n705#4,2:152\n717#4,2:154\n719#4,11:160\n72#5,4:156\n*S KotlinDebug\n*F\n+ 1 PhotoSizeSelectLarge.kt\nandroidx/compose/material/icons/outlined/PhotoSizeSelectLargeKt\n*L\n29#1:121,12\n30#1:134,18\n30#1:171\n29#1:133\n30#1:152,2\n30#1:154,2\n30#1:160,11\n30#1:156,4\n*E\n"})
/* loaded from: classes.dex */
public final class PhotoSizeSelectLargeKt {
    private static ImageVector _photoSizeSelectLarge;

    public static final ImageVector getPhotoSizeSelectLarge(Icons.Outlined outlined) {
        ImageVector imageVector = _photoSizeSelectLarge;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PhotoSizeSelectLarge", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(1.0f, 0.0f, 2.0f, -1.0f, 2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(13.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(21.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -1.0f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(1.0f, 9.0f);
        pathBuilder.lineTo(1.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(17.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 3.0f);
        pathBuilder.curveTo(2.0f, 3.0f, 1.0f, 4.0f, 1.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(3.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(9.0f, 5.0f);
        pathBuilder.lineTo(9.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(5.0f, 5.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 11.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.lineTo(15.0f, 11.0f);
        pathBuilder.lineTo(1.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 19.0f);
        pathBuilder.lineToRelative(2.5f, -3.21f);
        pathBuilder.lineToRelative(1.79f, 2.15f);
        pathBuilder.lineToRelative(2.5f, -3.22f);
        pathBuilder.lineTo(13.0f, 19.0f);
        pathBuilder.lineTo(3.0f, 19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoSizeSelectLarge = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
