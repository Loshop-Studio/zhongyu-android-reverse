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

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_tableRestaurant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TableRestaurant", "Landroidx/compose/material/icons/Icons$Outlined;", "getTableRestaurant", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTableRestaurant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableRestaurant.kt\nandroidx/compose/material/icons/outlined/TableRestaurantKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n72#5,4:103\n*S KotlinDebug\n*F\n+ 1 TableRestaurant.kt\nandroidx/compose/material/icons/outlined/TableRestaurantKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n30#1:103,4\n*E\n"})
/* loaded from: classes.dex */
public final class TableRestaurantKt {
    private static ImageVector _tableRestaurant;

    public static final ImageVector getTableRestaurant(Icons.Outlined outlined) {
        ImageVector imageVector = _tableRestaurant;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TableRestaurant", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.96f, 9.73f);
        pathBuilder.lineToRelative(-1.43f, -5.0f);
        pathBuilder.curveTo(20.41f, 4.3f, 20.02f, 4.0f, 19.57f, 4.0f);
        pathBuilder.horizontalLineTo(4.43f);
        pathBuilder.curveTo(3.98f, 4.0f, 3.59f, 4.3f, 3.47f, 4.73f);
        pathBuilder.lineToRelative(-1.43f, 5.0f);
        pathBuilder.curveTo(1.86f, 10.36f, 2.34f, 11.0f, 3.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.2f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(0.67f, -5.0f);
        pathBuilder.horizontalLineToRelative(10.67f);
        pathBuilder.lineTo(18.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-1.2f, -9.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.curveTo(21.66f, 11.0f, 22.14f, 10.36f, 21.96f, 9.73f);
        pathBuilder.close();
        pathBuilder.moveTo(6.93f, 13.0f);
        pathBuilder.lineToRelative(0.27f, -2.0f);
        pathBuilder.horizontalLineToRelative(9.6f);
        pathBuilder.lineToRelative(0.27f, 2.0f);
        pathBuilder.horizontalLineTo(6.93f);
        pathBuilder.close();
        pathBuilder.moveTo(4.33f, 9.0f);
        pathBuilder.lineToRelative(0.86f, -3.0f);
        pathBuilder.horizontalLineToRelative(13.63f);
        pathBuilder.lineToRelative(0.86f, 3.0f);
        pathBuilder.horizontalLineTo(4.33f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableRestaurant = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
