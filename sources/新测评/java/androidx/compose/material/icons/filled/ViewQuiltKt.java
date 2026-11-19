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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13558d2 = {"_viewQuilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ViewQuilt", "Landroidx/compose/material/icons/Icons$Filled;", "getViewQuilt$annotations", "(Landroidx/compose/material/icons/Icons$Filled;)V", "getViewQuilt", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nViewQuilt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewQuilt.kt\nandroidx/compose/material/icons/filled/ViewQuiltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n72#5,4:103\n*S KotlinDebug\n*F\n+ 1 ViewQuilt.kt\nandroidx/compose/material/icons/filled/ViewQuiltKt\n*L\n35#1:68,12\n36#1:81,18\n36#1:118\n35#1:80\n36#1:99,2\n36#1:101,2\n36#1:107,11\n36#1:103,4\n*E\n"})
/* loaded from: classes.dex */
public final class ViewQuiltKt {
    private static ImageVector _viewQuilt;

    public static final ImageVector getViewQuilt(Icons.Filled filled) {
        ImageVector imageVector = _viewQuilt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ViewQuilt", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 5.0f);
        pathBuilder.verticalLineToRelative(6.5f);
        pathBuilder.horizontalLineTo(9.33f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.67f, 19.0f);
        pathBuilder.verticalLineToRelative(-6.5f);
        pathBuilder.horizontalLineTo(9.33f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(14.67f);
        pathBuilder.close();
        pathBuilder.moveTo(15.67f, 12.5f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.verticalLineToRelative(-6.5f);
        pathBuilder.horizontalLineTo(15.67f);
        pathBuilder.close();
        pathBuilder.moveTo(8.33f, 19.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineTo(8.33f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewQuilt = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Filled.ViewQuilt", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Filled.ViewQuilt", imports = {"androidx.compose.material.icons.automirrored.filled.ViewQuilt"}))
    public static /* synthetic */ void getViewQuilt$annotations(Icons.Filled filled) {
    }
}
