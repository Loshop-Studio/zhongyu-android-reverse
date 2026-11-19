package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@ExperimentalMaterial3Api
@Metadata(m5174d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001eJS\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#Jî\u0001\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00150(¢\u0006\u0002\b)2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u00102\u001a\u0002032\u0013\b\u0002\u00104\u001a\r\u0012\u0004\u0012\u00020\u00150(¢\u0006\u0002\b)H\u0007¢\u0006\u0002\u00105Jø\u0001\u00106\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00150(¢\u0006\u0002\b)2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u00102\u001a\u0002032\u0013\b\u0002\u00104\u001a\r\u0012\u0004\u0012\u00020\u00150(¢\u0006\u0002\b)H\u0007¢\u0006\u0002\u00107J\u00ad\u0002\u00108\u001a\u00020\u001c2\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020:2\b\b\u0002\u0010>\u001a\u00020:2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020:2\b\b\u0002\u0010B\u001a\u00020:2\b\b\u0002\u0010C\u001a\u00020:2\b\b\u0002\u0010D\u001a\u00020:2\b\b\u0002\u0010E\u001a\u00020:2\b\b\u0002\u0010F\u001a\u00020:2\b\b\u0002\u0010G\u001a\u00020:2\b\b\u0002\u0010H\u001a\u00020:2\b\b\u0002\u0010I\u001a\u00020:2\b\b\u0002\u0010J\u001a\u00020:2\b\b\u0002\u0010K\u001a\u00020:2\b\b\u0002\u0010L\u001a\u00020:2\b\b\u0002\u0010M\u001a\u00020:2\b\b\u0002\u0010N\u001a\u00020:2\b\b\u0002\u0010O\u001a\u00020:2\b\b\u0002\u0010P\u001a\u00020:2\b\b\u0002\u0010Q\u001a\u00020:2\b\b\u0002\u0010R\u001a\u00020:2\b\b\u0002\u0010S\u001a\u00020:2\b\b\u0002\u0010T\u001a\u00020:2\b\b\u0002\u0010U\u001a\u00020:2\b\b\u0002\u0010V\u001a\u00020:H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010XJ=\u0010Y\u001a\u0002032\b\b\u0002\u0010Z\u001a\u00020\u00042\b\b\u0002\u0010[\u001a\u00020\u00042\b\b\u0002\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010]\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_J=\u0010`\u001a\u0002032\b\b\u0002\u0010Z\u001a\u00020\u00042\b\b\u0002\u0010[\u001a\u00020\u00042\b\b\u0002\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010]\u001a\u00020\u0004H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\ba\u0010_J\u00ad\u0002\u0010b\u001a\u00020\u001c2\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020:2\b\b\u0002\u0010>\u001a\u00020:2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010c\u001a\u00020:2\b\b\u0002\u0010d\u001a\u00020:2\b\b\u0002\u0010e\u001a\u00020:2\b\b\u0002\u0010f\u001a\u00020:2\b\b\u0002\u0010E\u001a\u00020:2\b\b\u0002\u0010F\u001a\u00020:2\b\b\u0002\u0010G\u001a\u00020:2\b\b\u0002\u0010H\u001a\u00020:2\b\b\u0002\u0010I\u001a\u00020:2\b\b\u0002\u0010J\u001a\u00020:2\b\b\u0002\u0010K\u001a\u00020:2\b\b\u0002\u0010L\u001a\u00020:2\b\b\u0002\u0010M\u001a\u00020:2\b\b\u0002\u0010N\u001a\u00020:2\b\b\u0002\u0010O\u001a\u00020:2\b\b\u0002\u0010P\u001a\u00020:2\b\b\u0002\u0010Q\u001a\u00020:2\b\b\u0002\u0010R\u001a\u00020:2\b\b\u0002\u0010S\u001a\u00020:2\b\b\u0002\u0010T\u001a\u00020:2\b\b\u0002\u0010U\u001a\u00020:2\b\b\u0002\u0010V\u001a\u00020:H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bg\u0010XJ=\u0010h\u001a\u0002032\b\b\u0002\u0010Z\u001a\u00020\u00042\b\b\u0002\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010[\u001a\u00020\u00042\b\b\u0002\u0010]\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bi\u0010_J=\u0010j\u001a\u0002032\b\b\u0002\u0010Z\u001a\u00020\u00042\b\b\u0002\u0010[\u001a\u00020\u00042\b\b\u0002\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010]\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010_JM\u0010l\u001a\u00020m*\u00020m2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010n\u001a\u00020\u00042\b\b\u0002\u0010o\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bp\u0010qR\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, m5175d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "FilledContainerBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material3/TextFieldColors;", "shape", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "OutlinedBorderContainerBox", "focusedBorderThickness", "unfocusedBorderThickness", "OutlinedBorderContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "outlinedTextFieldColors", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "containerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "outlinedTextFieldColors-l59Burw", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldPadding", "start", "top", "end", "bottom", "outlinedTextFieldPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "supportingTextPadding", "supportingTextPadding-a9UjIt4$material3_release", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-l59Burw", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = C1700Dp.m11525constructorimpl(56);
    private static final float MinWidth = C1700Dp.m11525constructorimpl(280);
    private static final float UnfocusedBorderThickness = C1700Dp.m11525constructorimpl(1);
    private static final float FocusedBorderThickness = C1700Dp.m11525constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m8183indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z3, boolean z4, InteractionSource interactionSource, TextFieldColors textFieldColors, float f4, float f5, int i4, Object obj) {
        return textFieldDefaults.m8193indicatorLinegv0btCI(modifier, z3, z4, interactionSource, textFieldColors, (i4 & 16) != 0 ? FocusedBorderThickness : f4, (i4 & 32) != 0 ? UnfocusedBorderThickness : f5);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m8184outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i4 & 2) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i4 & 4) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i4 & 8) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m8195outlinedTextFieldPaddinga9UjIt4(f4, f5, f6, f7);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m8185supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i4 & 2) != 0) {
            f5 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i4 & 4) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i4 & 8) != 0) {
            f7 = C1700Dp.m11525constructorimpl(0);
        }
        return textFieldDefaults.m8196supportingTextPaddinga9UjIt4$material3_release(f4, f5, f6, f7);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m8186textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i4 & 2) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i4 & 4) != 0) {
            f6 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i4 & 8) != 0) {
            f7 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m8198textFieldWithLabelPaddinga9UjIt4(f4, f5, f6, f7);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m8187textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i4 & 2) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i4 & 4) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i4 & 8) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m8199textFieldWithoutLabelPaddinga9UjIt4(f4, f5, f6, f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FilledContainerBox(final boolean r20, final boolean r21, final androidx.compose.foundation.interaction.InteractionSource r22, final androidx.compose.material3.TextFieldColors r23, androidx.compose.p006ui.graphics.Shape r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.FilledContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ca  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: OutlinedBorderContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8188OutlinedBorderContainerBoxnbWgWpA(final boolean r21, final boolean r22, final androidx.compose.foundation.interaction.InteractionSource r23, final androidx.compose.material3.TextFieldColors r24, androidx.compose.p006ui.graphics.Shape r25, float r26, float r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m8188OutlinedBorderContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OutlinedTextFieldDecorationBox(final java.lang.String r83, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r84, final boolean r85, final boolean r86, final androidx.compose.p006ui.text.input.VisualTransformation r87, final androidx.compose.foundation.interaction.InteractionSource r88, boolean r89, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r90, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r91, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r92, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r93, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r94, androidx.compose.material3.TextFieldColors r95, androidx.compose.foundation.layout.PaddingValues r96, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r97, androidx.compose.runtime.Composer r98, final int r99, final int r100, final int r101) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0144  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TextFieldDecorationBox(final java.lang.String r77, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r78, final boolean r79, final boolean r80, final androidx.compose.p006ui.text.input.VisualTransformation r81, final androidx.compose.foundation.interaction.InteractionSource r82, boolean r83, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r84, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r85, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r86, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r87, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r88, androidx.compose.p006ui.graphics.Shape r89, androidx.compose.material3.TextFieldColors r90, androidx.compose.foundation.layout.PaddingValues r91, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r92, androidx.compose.runtime.Composer r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @JvmName(name = "getFilledShape")
    public final Shape getFilledShape(Composer composer, int i4) {
        composer.startReplaceableGroup(611926497);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i4, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:62)");
        }
        Shape shape = ShapesKt.toShape(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m8189getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m8190getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m8191getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    public final Shape getOutlinedShape(Composer composer, int i4) {
        composer.startReplaceableGroup(-584749279);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i4, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:59)");
        }
        Shape shape = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m8192getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    @ExperimentalMaterial3Api
    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m8193indicatorLinegv0btCI(Modifier indicatorLine, final boolean z3, final boolean z4, final InteractionSource interactionSource, final TextFieldColors colors, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(indicatorLine, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return ComposedModifierKt.composed(indicatorLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z3));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z4));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", colors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", C1700Dp.m11523boximpl(f4));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", C1700Dp.m11523boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i4) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-891038934);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891038934, i4, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:146)");
                }
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m8201animateBorderStrokeAsStateNuRrP5Q(z3, z4, interactionSource, colors, f4, f5, composer, 0).getValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }

    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: outlinedTextFieldColors-l59Burw, reason: not valid java name */
    public final TextFieldColors m8194outlinedTextFieldColorsl59Burw(long j4, long j5, long j6, long j7, long j8, SelectionColors selectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, Composer composer, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(-1654658683);
        long color = (i7 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j4;
        long jM9177copywmQWz5c$default = (i7 & 2) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long jM9213getTransparent0d7_KjU = (i7 & 4) != 0 ? Color.INSTANCE.m9213getTransparent0d7_KjU() : j6;
        long color2 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j7;
        long color3 = (i7 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j8;
        SelectionColors selectionColors2 = (i7 & 32) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        long color4 = (i7 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j9;
        long color5 = (i7 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j10;
        long jM9177copywmQWz5c$default2 = (i7 & 256) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long color6 = (i7 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j12;
        long color7 = (i7 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j13;
        long color8 = (i7 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j14;
        long jM9177copywmQWz5c$default3 = (i7 & 4096) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color9 = (i7 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j16;
        long color10 = (i7 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j17;
        long color11 = (32768 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j18;
        long jM9177copywmQWz5c$default4 = (65536 & i7) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color12 = (131072 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j20;
        long color13 = (262144 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j21;
        long color14 = (524288 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j22;
        long jM9177copywmQWz5c$default5 = (1048576 & i7) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color15 = (2097152 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j24;
        long color16 = (4194304 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j25;
        long jM9177copywmQWz5c$default6 = (8388608 & i7) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color17 = (16777216 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j27;
        long color18 = (33554432 & i7) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j28;
        long jM9177copywmQWz5c$default7 = (67108864 & i7) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long color19 = (i7 & 134217728) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j30;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1654658683, i4, i5, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:399)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, jM9177copywmQWz5c$default, jM9213getTransparent0d7_KjU, color2, color3, selectionColors2, color4, color5, color6, jM9177copywmQWz5c$default2, color7, color8, jM9177copywmQWz5c$default3, color9, color10, color11, jM9177copywmQWz5c$default4, color12, color13, color14, jM9177copywmQWz5c$default5, color15, color16, jM9177copywmQWz5c$default6, color17, color18, jM9177copywmQWz5c$default7, color19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    @ExperimentalMaterial3Api
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m8195outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m7312PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    @ExperimentalMaterial3Api
    /* renamed from: supportingTextPadding-a9UjIt4$material3_release, reason: not valid java name */
    public final PaddingValues m8196supportingTextPaddinga9UjIt4$material3_release(float start, float top, float end, float bottom) {
        return PaddingKt.m7312PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: textFieldColors-l59Burw, reason: not valid java name */
    public final TextFieldColors m8197textFieldColorsl59Burw(long j4, long j5, long j6, long j7, long j8, SelectionColors selectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, Composer composer, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(-128842621);
        long color = (i7 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j4;
        long jM9177copywmQWz5c$default = (i7 & 2) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long color2 = (i7 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j6;
        long color3 = (i7 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j7;
        long color4 = (i7 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j8;
        SelectionColors selectionColors2 = (i7 & 32) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        long color5 = (i7 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j9;
        long color6 = (i7 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j10;
        long jM9177copywmQWz5c$default2 = (i7 & 256) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long color7 = (i7 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j12;
        long color8 = (i7 & 1024) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j13;
        long color9 = (i7 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j14;
        long jM9177copywmQWz5c$default3 = (i7 & 4096) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color10 = (i7 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j16;
        long color11 = (i7 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j17;
        long color12 = (32768 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j18;
        long jM9177copywmQWz5c$default4 = (65536 & i7) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long color13 = (131072 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j20;
        long color14 = (262144 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j21;
        long color15 = (524288 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j22;
        long jM9177copywmQWz5c$default5 = (1048576 & i7) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color16 = (2097152 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j24;
        long color17 = (4194304 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j25;
        long jM9177copywmQWz5c$default6 = (8388608 & i7) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color18 = (16777216 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j27;
        long color19 = (33554432 & i7) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j28;
        long jM9177copywmQWz5c$default7 = (67108864 & i7) != 0 ? Color.m9177copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long color20 = (i7 & 134217728) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j30;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-128842621, i4, i5, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:292)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, jM9177copywmQWz5c$default, color2, color3, color4, selectionColors2, color5, color6, color7, jM9177copywmQWz5c$default2, color8, color9, jM9177copywmQWz5c$default3, color10, color11, color12, jM9177copywmQWz5c$default4, color13, color14, color15, jM9177copywmQWz5c$default5, color16, color17, jM9177copywmQWz5c$default6, color18, color19, jM9177copywmQWz5c$default7, color20, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    @ExperimentalMaterial3Api
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m8198textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m7312PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    @ExperimentalMaterial3Api
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m8199textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m7312PaddingValuesa9UjIt4(start, top, end, bottom);
    }
}
