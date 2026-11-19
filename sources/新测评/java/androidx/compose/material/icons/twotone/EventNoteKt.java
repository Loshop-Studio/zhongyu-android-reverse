package androidx.compose.material.icons.twotone;

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

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13558d2 = {"_eventNote", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EventNote", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEventNote$annotations", "(Landroidx/compose/material/icons/Icons$TwoTone;)V", "getEventNote", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nEventNote.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventNote.kt\nandroidx/compose/material/icons/twotone/EventNoteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n233#2,18:142\n253#2:179\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n705#4,2:160\n717#4,2:162\n719#4,11:168\n72#5,4:126\n72#5,4:164\n*S KotlinDebug\n*F\n+ 1 EventNote.kt\nandroidx/compose/material/icons/twotone/EventNoteKt\n*L\n35#1:91,12\n36#1:104,18\n36#1:141\n43#1:142,18\n43#1:179\n35#1:103\n36#1:122,2\n36#1:124,2\n36#1:130,11\n43#1:160,2\n43#1:162,2\n43#1:168,11\n36#1:126,4\n43#1:164,4\n*E\n"})
/* loaded from: classes2.dex */
public final class EventNoteKt {
    private static ImageVector _eventNote;

    public static final ImageVector getEventNote(Icons.TwoTone twoTone) {
        ImageVector imageVector = _eventNote;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EventNote", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m21002getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM21329getButtKaPHkGw = companion2.m21329getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM21339getBevelLxFBmk8 = companion3.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.close();
        ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw2 = companion2.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk82 = companion3.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.lineTo(18.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(8.0f, 3.0f);
        pathBuilder2.lineTo(8.0f, 1.0f);
        pathBuilder2.lineTo(6.0f, 1.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(5.0f, 3.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.lineTo(21.0f, 5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 19.0f);
        pathBuilder2.lineTo(5.0f, 19.0f);
        pathBuilder2.lineTo(5.0f, 9.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 7.0f);
        pathBuilder2.lineTo(5.0f, 7.0f);
        pathBuilder2.lineTo(5.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 11.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(7.0f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 15.0f);
        pathBuilder2.horizontalLineToRelative(7.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(7.0f, 17.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw2, iM21339getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eventNote = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.EventNote", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.TwoTone.EventNote", imports = {"androidx.compose.material.icons.automirrored.twotone.EventNote"}))
    public static /* synthetic */ void getEventNote$annotations(Icons.TwoTone twoTone) {
    }
}
