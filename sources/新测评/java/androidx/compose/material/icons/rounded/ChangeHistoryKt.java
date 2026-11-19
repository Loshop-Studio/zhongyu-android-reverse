package androidx.compose.material.icons.rounded;

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

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_changeHistory", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ChangeHistory", "Landroidx/compose/material/icons/Icons$Rounded;", "getChangeHistory", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nChangeHistory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeHistory.kt\nandroidx/compose/material/icons/rounded/ChangeHistoryKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,49:1\n212#2,12:50\n233#2,18:63\n253#2:100\n174#3:62\n705#4,2:81\n717#4,2:83\n719#4,11:89\n72#5,4:85\n*S KotlinDebug\n*F\n+ 1 ChangeHistory.kt\nandroidx/compose/material/icons/rounded/ChangeHistoryKt\n*L\n29#1:50,12\n30#1:63,18\n30#1:100\n29#1:62\n30#1:81,2\n30#1:83,2\n30#1:89,11\n30#1:85,4\n*E\n"})
/* loaded from: classes.dex */
public final class ChangeHistoryKt {
    private static ImageVector _changeHistory;

    public static final ImageVector getChangeHistory(Icons.Rounded rounded) {
        ImageVector imageVector = _changeHistory;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ChangeHistory", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.77f);
        pathBuilder.lineTo(18.39f, 18.0f);
        pathBuilder.horizontalLineTo(5.61f);
        pathBuilder.lineTo(12.0f, 7.77f);
        pathBuilder.moveToRelative(-0.85f, -2.41f);
        pathBuilder.lineToRelative(-8.2f, 13.11f);
        pathBuilder.curveToRelative(-0.41f, 0.67f, 0.07f, 1.53f, 0.85f, 1.53f);
        pathBuilder.horizontalLineToRelative(16.4f);
        pathBuilder.curveToRelative(0.79f, 0.0f, 1.26f, -0.86f, 0.85f, -1.53f);
        pathBuilder.lineToRelative(-8.2f, -13.11f);
        pathBuilder.curveToRelative(-0.39f, -0.63f, -1.31f, -0.63f, -1.7f, 0.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _changeHistory = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
