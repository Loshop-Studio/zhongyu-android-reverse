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

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_wbIridescent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbIridescent", "Landroidx/compose/material/icons/Icons$Filled;", "getWbIridescent", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nWbIridescent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WbIridescent.kt\nandroidx/compose/material/icons/filled/WbIridescentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 WbIridescent.kt\nandroidx/compose/material/icons/filled/WbIridescentKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"})
/* loaded from: classes.dex */
public final class WbIridescentKt {
    private static ImageVector _wbIridescent;

    public static final ImageVector getWbIridescent(Icons.Filled filled) {
        ImageVector imageVector = _wbIridescent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WbIridescent", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 14.5f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.lineTo(5.0f, 8.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 0.55f);
        pathBuilder.lineTo(11.0f, 3.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(13.0f, 0.55f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.04f, 3.05f);
        pathBuilder.lineToRelative(-1.79f, 1.79f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.8f, -1.79f);
        pathBuilder.lineToRelative(-1.42f, -1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 22.45f);
        pathBuilder.lineTo(13.0f, 19.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.95f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.45f, 18.54f);
        pathBuilder.lineToRelative(-1.8f, -1.79f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(1.79f, 1.8f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(3.55f, 4.46f);
        pathBuilder.lineToRelative(1.79f, 1.79f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(-1.79f, -1.79f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(4.96f, 19.95f);
        pathBuilder.lineToRelative(1.79f, -1.8f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-1.79f, 1.79f);
        pathBuilder.lineToRelative(1.41f, 1.42f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbIridescent = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
