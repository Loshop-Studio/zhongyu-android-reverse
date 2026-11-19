package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

@Immutable
@Metadata(m5109d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0018\u001a\u00020\t*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J¨\u0002\u0010+\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u00120\u001b¢\u0006\u0002\b\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0015\b\u0002\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u001c2\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u001c2\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u001c2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u001c2\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u001c2\u0015\b\u0002\u0010&\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u001c2\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u001c2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020(2\u0013\b\u0002\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00120\u001b¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b+\u0010,J8\u00103\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b1\u00102J8\u00105\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b4\u00102J:\u00107\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b6\u00102J\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u00108JÂ\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u0002092\b\b\u0002\u0010=\u001a\u0002092\b\b\u0002\u0010>\u001a\u0002092\b\b\u0002\u0010?\u001a\u0002092\b\b\u0002\u0010@\u001a\u0002092\b\b\u0002\u0010A\u001a\u0002092\b\b\u0002\u0010B\u001a\u0002092\b\b\u0002\u0010C\u001a\u0002092\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D2\b\b\u0002\u0010F\u001a\u0002092\b\b\u0002\u0010G\u001a\u0002092\b\b\u0002\u0010H\u001a\u0002092\b\b\u0002\u0010I\u001a\u0002092\b\b\u0002\u0010J\u001a\u0002092\b\b\u0002\u0010K\u001a\u0002092\b\b\u0002\u0010L\u001a\u0002092\b\b\u0002\u0010M\u001a\u0002092\b\b\u0002\u0010N\u001a\u0002092\b\b\u0002\u0010O\u001a\u0002092\b\b\u0002\u0010P\u001a\u0002092\b\b\u0002\u0010Q\u001a\u0002092\b\b\u0002\u0010R\u001a\u0002092\b\b\u0002\u0010S\u001a\u0002092\b\b\u0002\u0010T\u001a\u0002092\b\b\u0002\u0010U\u001a\u0002092\b\b\u0002\u0010V\u001a\u0002092\b\b\u0002\u0010W\u001a\u0002092\b\b\u0002\u0010X\u001a\u0002092\b\b\u0002\u0010Y\u001a\u0002092\b\b\u0002\u0010Z\u001a\u0002092\b\b\u0002\u0010[\u001a\u0002092\b\b\u0002\u0010\\\u001a\u0002092\b\b\u0002\u0010]\u001a\u0002092\b\b\u0002\u0010^\u001a\u0002092\b\b\u0002\u0010_\u001a\u0002092\b\b\u0002\u0010`\u001a\u0002092\b\b\u0002\u0010a\u001a\u0002092\b\b\u0002\u0010b\u001a\u0002092\b\b\u0002\u0010c\u001a\u0002092\b\b\u0002\u0010d\u001a\u0002092\b\b\u0002\u0010e\u001a\u000209H\u0007ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ9\u0010h\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\bh\u0010iJ:\u0010k\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bj\u00102J:\u0010m\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bl\u00102J:\u0010o\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\bn\u00102R\u001d\u0010p\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001d\u0010t\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bt\u0010q\u001a\u0004\bu\u0010sR\u001d\u0010v\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bv\u0010q\u001a\u0004\bw\u0010sR\u001d\u0010x\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bx\u0010q\u001a\u0004\by\u0010sR&\u0010z\u001a\u00020\u000f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bz\u0010q\u0012\u0004\b|\u0010\u0003\u001a\u0004\b{\u0010sR&\u0010}\u001a\u00020\u000f8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b}\u0010q\u0012\u0004\b\u007f\u0010\u0003\u001a\u0004\b~\u0010sR\u0013\u0010\u000e\u001a\u00020\r8G¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0085\u0001\u001a\u00020\u000b*\u00030\u0082\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010\u0088\u0001\u001a\u00020\r8GX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u0087\u0001\u0010\u0003\u001a\u0006\b\u0086\u0001\u0010\u0081\u0001R\u001e\u0010\u008b\u0001\u001a\u00020\r8GX\u0087\u0004¢\u0006\u000f\u0012\u0005\b\u008a\u0001\u0010\u0003\u001a\u0006\b\u0089\u0001\u0010\u0081\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008c\u0001"}, m5110d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "<init>", "()V", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "Ld6/s;", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", TextFieldImplKt.ContainerId, "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", RequestParameters.PREFIX, "suffix", "supportingText", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "container", "DecorationBox", "(Ljava/lang/String;Lr6/e;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lr6/e;Landroidx/compose/runtime/Composer;III)V", "start", "end", "top", "bottom", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithLabel", "contentPaddingWithoutLabel-a9UjIt4", "contentPaddingWithoutLabel", "supportingTextPadding-a9UjIt4$material3_release", "supportingTextPadding", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "ContainerBox", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "outlinedTextFieldPadding-a9UjIt4", "outlinedTextFieldPadding", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "getFocusedBorderThickness-D9Ej5fM$annotations", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material3/ColorScheme;", "getDefaultTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "defaultTextFieldColors", "getOutlinedShape", "getOutlinedShape$annotations", "outlinedShape", "getFilledShape", "getFilledShape$annotations", "filledShape", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1698:1\n135#2:1699\n148#3:1700\n148#3:1703\n148#3:1704\n148#3:1705\n148#3:1706\n77#4:1701\n1#5:1702\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n*L\n160#1:1699\n330#1:1700\n67#1:1703\n73#1:1704\n76#1:1705\n79#1:1706\n502#1:1701\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;

    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = C2331Dp.m13305constructorimpl(56);
    private static final float MinWidth = C2331Dp.m13305constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    static {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(1);
        UnfocusedIndicatorThickness = fM13305constructorimpl;
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(2);
        FocusedIndicatorThickness = fM13305constructorimpl2;
        UnfocusedBorderThickness = fM13305constructorimpl;
        FocusedBorderThickness = fM13305constructorimpl2;
    }

    private TextFieldDefaults() {
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m9076contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f8 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f9 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m9087contentPaddingWithLabela9UjIt4(f, f7, f8, f9);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m9077contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f9 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m9088contentPaddingWithoutLabela9UjIt4(f, f7, f8, f9);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m9078getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m9079getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m9080indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z8, boolean z9, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f7, int i, Object obj) {
        if ((i & 16) != 0) {
            f = FocusedIndicatorThickness;
        }
        return textFieldDefaults.m9095indicatorLinegv0btCI(modifier, z8, z9, interactionSource, textFieldColors, f, (i & 32) != 0 ? UnfocusedIndicatorThickness : f7);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m9081outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f9 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m9096outlinedTextFieldPaddinga9UjIt4(f, f7, f8, f9);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m9082supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f7 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f9 = C2331Dp.m13305constructorimpl(0);
        }
        return textFieldDefaults.m9097supportingTextPaddinga9UjIt4$material3_release(f, f7, f8, f9);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m9083textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f8 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f9 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m9098textFieldWithLabelPaddinga9UjIt4(f, f7, f8, f9);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m9084textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f9 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m9099textFieldWithoutLabelPaddinga9UjIt4(f, f7, f8, f9);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ed  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9085Container4EFweAY(final boolean r22, final boolean r23, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r24, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r25, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r26, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r27, float r28, float r29, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m9085Container4EFweAY(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Renamed to TextFieldDefaults.Container", replaceWith = @kotlin.ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n)", imports = {}))
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ContainerBox(final boolean r21, final boolean r22, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r23, @org.jetbrains.annotations.NotNull final androidx.compose.material3.TextFieldColors r24, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.ContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DecorationBox(@org.jetbrains.annotations.NotNull final java.lang.String r36, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r37, final boolean r38, final boolean r39, @org.jetbrains.annotations.NotNull final androidx.compose.p011ui.text.input.VisualTransformation r40, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.interaction.InteractionSource r41, boolean r42, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r43, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r44, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r45, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r46, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r47, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r48, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r49, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r50, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r51, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r52, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r53, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.DecorationBox(java.lang.String, r6.e, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, r6.e, r6.e, r6.e, r6.e, r6.e, r6.e, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, r6.e, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @NotNull
    public final TextFieldColors colors(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831731228, i, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:336)");
        }
        TextFieldColors defaultTextFieldColors = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColors;
    }

    @Composable
    @NotNull
    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m9086colors0hiis_0(long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, @Nullable TextSelectionColors textSelectionColors, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, @Nullable Composer composer, int i, int i8, int i9, int i10, int i11, int i12, int i13) {
        long j49;
        TextSelectionColors textSelectionColors2;
        long jM10718getUnspecified0d7_KjU = (i12 & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j7;
        long jM10718getUnspecified0d7_KjU2 = (i12 & 2) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j8;
        long jM10718getUnspecified0d7_KjU3 = (i12 & 4) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j9;
        long jM10718getUnspecified0d7_KjU4 = (i12 & 8) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j10;
        long jM10718getUnspecified0d7_KjU5 = (i12 & 16) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j11;
        long jM10718getUnspecified0d7_KjU6 = (i12 & 32) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j12;
        long jM10718getUnspecified0d7_KjU7 = (i12 & 64) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j13;
        long j50 = jM10718getUnspecified0d7_KjU;
        long jM10718getUnspecified0d7_KjU8 = (i12 & 128) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j14;
        long jM10718getUnspecified0d7_KjU9 = (i12 & 256) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j15;
        long jM10718getUnspecified0d7_KjU10 = (i12 & 512) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j16;
        TextSelectionColors textSelectionColors3 = (i12 & 1024) != 0 ? null : textSelectionColors;
        long jM10718getUnspecified0d7_KjU11 = (i12 & 2048) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j17;
        long jM10718getUnspecified0d7_KjU12 = (i12 & 4096) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j18;
        long jM10718getUnspecified0d7_KjU13 = (i12 & 8192) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j19;
        long jM10718getUnspecified0d7_KjU14 = (i12 & 16384) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j20;
        long jM10718getUnspecified0d7_KjU15 = (32768 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j21;
        long jM10718getUnspecified0d7_KjU16 = (65536 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j22;
        long jM10718getUnspecified0d7_KjU17 = (131072 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j23;
        long jM10718getUnspecified0d7_KjU18 = (262144 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j24;
        long jM10718getUnspecified0d7_KjU19 = (524288 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j25;
        long jM10718getUnspecified0d7_KjU20 = (1048576 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j26;
        long jM10718getUnspecified0d7_KjU21 = (2097152 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j27;
        long jM10718getUnspecified0d7_KjU22 = (4194304 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j28;
        long jM10718getUnspecified0d7_KjU23 = (8388608 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j29;
        long jM10718getUnspecified0d7_KjU24 = (16777216 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j30;
        long jM10718getUnspecified0d7_KjU25 = (33554432 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j31;
        long jM10718getUnspecified0d7_KjU26 = (67108864 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j32;
        long jM10718getUnspecified0d7_KjU27 = (134217728 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j33;
        long jM10718getUnspecified0d7_KjU28 = (268435456 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j34;
        long jM10718getUnspecified0d7_KjU29 = (536870912 & i12) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j35;
        long jM10718getUnspecified0d7_KjU30 = (i12 & BasicMeasure.EXACTLY) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j36;
        long jM10718getUnspecified0d7_KjU31 = (i13 & 1) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j37;
        long jM10718getUnspecified0d7_KjU32 = (i13 & 2) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j38;
        long jM10718getUnspecified0d7_KjU33 = (i13 & 4) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j39;
        long jM10718getUnspecified0d7_KjU34 = (i13 & 8) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j40;
        long jM10718getUnspecified0d7_KjU35 = (i13 & 16) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j41;
        long jM10718getUnspecified0d7_KjU36 = (i13 & 32) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j42;
        long jM10718getUnspecified0d7_KjU37 = (i13 & 64) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j43;
        long jM10718getUnspecified0d7_KjU38 = (i13 & 128) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j44;
        long jM10718getUnspecified0d7_KjU39 = (i13 & 256) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j45;
        long jM10718getUnspecified0d7_KjU40 = (i13 & 512) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j46;
        long jM10718getUnspecified0d7_KjU41 = (i13 & 1024) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j47;
        long jM10718getUnspecified0d7_KjU42 = (i13 & 2048) != 0 ? Color.INSTANCE.m10718getUnspecified0d7_KjU() : j48;
        if (ComposerKt.isTraceInProgress()) {
            j49 = jM10718getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
            ComposerKt.traceEventStart(1513344955, i, i8, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:438)");
        } else {
            j49 = jM10718getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
        }
        TextFieldColors textFieldColorsM9023copyejIjP34 = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i11 >> 6) & 112).m9023copyejIjP34(j50, jM10718getUnspecified0d7_KjU2, jM10718getUnspecified0d7_KjU3, jM10718getUnspecified0d7_KjU4, jM10718getUnspecified0d7_KjU5, jM10718getUnspecified0d7_KjU6, jM10718getUnspecified0d7_KjU7, jM10718getUnspecified0d7_KjU8, jM10718getUnspecified0d7_KjU9, jM10718getUnspecified0d7_KjU10, textSelectionColors2, jM10718getUnspecified0d7_KjU11, jM10718getUnspecified0d7_KjU12, jM10718getUnspecified0d7_KjU13, jM10718getUnspecified0d7_KjU14, jM10718getUnspecified0d7_KjU15, jM10718getUnspecified0d7_KjU16, jM10718getUnspecified0d7_KjU17, jM10718getUnspecified0d7_KjU18, jM10718getUnspecified0d7_KjU19, jM10718getUnspecified0d7_KjU20, jM10718getUnspecified0d7_KjU21, jM10718getUnspecified0d7_KjU22, jM10718getUnspecified0d7_KjU23, jM10718getUnspecified0d7_KjU24, jM10718getUnspecified0d7_KjU25, jM10718getUnspecified0d7_KjU26, jM10718getUnspecified0d7_KjU27, jM10718getUnspecified0d7_KjU28, jM10718getUnspecified0d7_KjU29, jM10718getUnspecified0d7_KjU30, jM10718getUnspecified0d7_KjU31, jM10718getUnspecified0d7_KjU32, jM10718getUnspecified0d7_KjU33, jM10718getUnspecified0d7_KjU34, jM10718getUnspecified0d7_KjU35, jM10718getUnspecified0d7_KjU36, jM10718getUnspecified0d7_KjU37, jM10718getUnspecified0d7_KjU38, jM10718getUnspecified0d7_KjU39, jM10718getUnspecified0d7_KjU40, jM10718getUnspecified0d7_KjU41, j49);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM9023copyejIjP34;
    }

    @NotNull
    /* renamed from: contentPaddingWithLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m9087contentPaddingWithLabela9UjIt4(float start, float end, float top2, float bottom) {
        return PaddingKt.m7258PaddingValuesa9UjIt4(start, top2, end, bottom);
    }

    @NotNull
    /* renamed from: contentPaddingWithoutLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m9088contentPaddingWithoutLabela9UjIt4(float start, float top2, float end, float bottom) {
        return PaddingKt.m7258PaddingValuesa9UjIt4(start, top2, end, bottom);
    }

    @Composable
    @JvmName(name = "getDefaultTextFieldColors")
    @NotNull
    public final TextFieldColors getDefaultTextFieldColors(@NotNull ColorScheme colorScheme, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1341970309, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:486)");
        }
        TextFieldColors defaultTextFieldColorsCached = colorScheme.getDefaultTextFieldColorsCached();
        composer.startReplaceGroup(27085453);
        if (defaultTextFieldColorsCached == null) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            TextFieldColors textFieldColors = new TextFieldColors(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorFocusCaretColor()), (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getActiveIndicatorColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledActiveIndicatorColor()), filledTextFieldTokens.getDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLeadingIconColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLeadingIconColor()), filledTextFieldTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getTrailingIconColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledTrailingIconColor()), filledTextFieldTokens.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLabelColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLabelColor()), filledTextFieldTokens.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getSupportingColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledSupportingColor()), filledTextFieldTokens.getDisabledSupportingOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), Color.m10681copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), null);
            colorScheme.setDefaultTextFieldColorsCached$material3_release(textFieldColors);
            defaultTextFieldColorsCached = textFieldColors;
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColorsCached;
    }

    @Composable
    @JvmName(name = "getFilledShape")
    @NotNull
    public final Shape getFilledShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:621)");
        }
        Shape shape = getShape(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m9089getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m9090getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m9091getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m9092getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:613)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:60)");
        }
        Shape value = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m9093getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m9094getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m9095indicatorLinegv0btCI(@NotNull Modifier modifier, final boolean z8, final boolean z9, @NotNull final InteractionSource interactionSource, @NotNull final TextFieldColors textFieldColors, final float f, final float f7) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC6471c() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                AbstractC0584a.m910k(z9, AbstractC0584a.m910k(z8, inspectorInfo.getProperties(), "enabled", inspectorInfo), "isError", inspectorInfo).set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                AbstractC0584a.m909j(f, inspectorInfo.getProperties(), "focusedIndicatorLineThickness", inspectorInfo).set("unfocusedIndicatorLineThickness", C2331Dp.m13303boximpl(f7));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC6474f() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceGroup(-891038934);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891038934, i, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:169)");
                }
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, TextFieldImplKt.m9400animateBorderStrokeAsStateNuRrP5Q(z8, z9, FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, 0).getValue().booleanValue(), textFieldColors, f, f7, composer, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @NotNull
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m9096outlinedTextFieldPaddinga9UjIt4(float start, float top2, float end, float bottom) {
        return OutlinedTextFieldDefaults.INSTANCE.m8750contentPaddinga9UjIt4(start, top2, end, bottom);
    }

    @NotNull
    /* renamed from: supportingTextPadding-a9UjIt4$material3_release, reason: not valid java name */
    public final PaddingValues m9097supportingTextPaddinga9UjIt4$material3_release(float start, float top2, float end, float bottom) {
        return PaddingKt.m7258PaddingValuesa9UjIt4(start, top2, end, bottom);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @NotNull
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m9098textFieldWithLabelPaddinga9UjIt4(float start, float end, float top2, float bottom) {
        return m9087contentPaddingWithLabela9UjIt4(start, end, top2, bottom);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @NotNull
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m9099textFieldWithoutLabelPaddinga9UjIt4(float start, float top2, float end, float bottom) {
        return m9088contentPaddingWithoutLabela9UjIt4(start, top2, end, bottom);
    }
}
