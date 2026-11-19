package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.p006ui.layout.LayoutKt;
import androidx.compose.p006ui.layout.MeasurePolicy;
import androidx.compose.p006ui.node.ComposeUiNode;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.ViewConfiguration;
import androidx.compose.p006ui.semantics.Role;
import androidx.compose.p006ui.semantics.SemanticsModifierKt;
import androidx.compose.p006ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p006ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p006ui.text.TextStyle;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a¦\u0001\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a¼\u0001\u0010\u001e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0097\u0001\u0010(\u001a\u00020\b2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0001H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a¦\u0001\u0010.\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a®\u0001\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00104\u001a\u008f\u0001\u00105\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00107\u001a®\u0001\u00108\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00104\u001aÅ\u0001\u00109\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u0002012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010:\u001aÑ\u0001\u0010;\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\u0006\u0010\u001f\u001a\u00020 2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u0002012\b\u0010\u0017\u001a\u0004\u0018\u0001022\b\u0010\u0019\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u008f\u0001\u0010>\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u00107\u001a&\u0010?\u001a\u00020\u00012\b\b\u0002\u0010@\u001a\u00020\u00102\b\b\u0002\u0010A\u001a\u00020\u00102\b\b\u0002\u0010B\u001a\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006C"}, m5175d2 = {"AssistChipPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "FilterChipPadding", "HorizontalElementsPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SuggestionChipPadding", "AssistChip", "", "onClick", "Lkotlin/Function0;", "label", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "leadingIcon", "trailingIcon", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ChipColors;", "elevation", "Landroidx/compose/material3/ChipElevation;", "border", "Landroidx/compose/material3/ChipBorder;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Chip", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "labelColor", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/foundation/BorderStroke;", "minHeight", "paddingValues", "Chip-nkUnTEs", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ChipContent", "avatar", "leadingIconColor", "trailingIconColor", "ChipContent-fe0OD_I", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "ElevatedAssistChip", "ElevatedFilterChip", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "Landroidx/compose/material3/SelectableChipBorder;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedSuggestionChip", "icon", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "InputChip", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SelectableChip", "SelectableChip-u0RnIRE", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SuggestionChip", "inputChipPadding", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ChipKt {
    private static final PaddingValues AssistChipPadding;
    private static final PaddingValues FilterChipPadding;
    private static final float HorizontalElementsPadding;
    private static final PaddingValues SuggestionChipPadding;

    static {
        float fM11525constructorimpl = C1700Dp.m11525constructorimpl(8);
        HorizontalElementsPadding = fM11525constructorimpl;
        AssistChipPadding = PaddingKt.m7311PaddingValuesYgX7TsA$default(fM11525constructorimpl, 0.0f, 2, null);
        FilterChipPadding = PaddingKt.m7311PaddingValuesYgX7TsA$default(fM11525constructorimpl, 0.0f, 2, null);
        SuggestionChipPadding = PaddingKt.m7311PaddingValuesYgX7TsA$default(fM11525constructorimpl, 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AssistChip(final kotlin.jvm.functions.Function0<kotlin.Unit> r47, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, androidx.compose.p006ui.Modifier r49, boolean r50, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, androidx.compose.p006ui.graphics.Shape r53, androidx.compose.material3.ChipColors r54, androidx.compose.material3.ChipElevation r55, androidx.compose.material3.ChipBorder r56, androidx.compose.foundation.interaction.MutableInteractionSource r57, androidx.compose.runtime.Composer r58, final int r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.AssistChip(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Chip-nkUnTEs, reason: not valid java name */
    public static final void m7846ChipnkUnTEs(final Modifier modifier, final Function0<Unit> function0, final boolean z3, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final long j4, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Shape shape, final ChipColors chipColors, final ChipElevation chipElevation, final BorderStroke borderStroke, final float f4, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1400504719);
        if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i6 |= composerStartRestartGroup.changed(function0) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i6 |= composerStartRestartGroup.changed(function2) ? 2048 : 1024;
        }
        if ((i4 & 57344) == 0) {
            i6 |= composerStartRestartGroup.changed(textStyle) ? 16384 : 8192;
        }
        if ((i4 & 458752) == 0) {
            i6 |= composerStartRestartGroup.changed(j4) ? 131072 : 65536;
        }
        if ((i4 & 3670016) == 0) {
            i6 |= composerStartRestartGroup.changed(function22) ? 1048576 : 524288;
        }
        if ((29360128 & i4) == 0) {
            i6 |= composerStartRestartGroup.changed(function23) ? 8388608 : 4194304;
        }
        if ((i4 & 234881024) == 0) {
            i6 |= composerStartRestartGroup.changed(shape) ? 67108864 : 33554432;
        }
        if ((i4 & 1879048192) == 0) {
            i6 |= composerStartRestartGroup.changed(chipColors) ? 536870912 : 268435456;
        }
        if ((i5 & 14) == 0) {
            i7 = (composerStartRestartGroup.changed(chipElevation) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i7 |= composerStartRestartGroup.changed(borderStroke) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i7 |= composerStartRestartGroup.changed(f4) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i7 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i5 & 57344) == 0) {
            i7 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
        }
        if ((i6 & 1533916891) == 306783378 && (46811 & i7) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, i6, i7, "androidx.compose.material3.Chip (Chip.kt:1308)");
            }
            int i8 = (i6 >> 6) & 14;
            long jM9188unboximpl = chipColors.containerColor$material3_release(z3, composerStartRestartGroup, ((i6 >> 24) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | i8).getValue().m9188unboximpl();
            composerStartRestartGroup.startReplaceableGroup(64019101);
            State<C1700Dp> state = chipElevation == null ? null : chipElevation.tonalElevation$material3_release(z3, mutableInteractionSource, composerStartRestartGroup, i8 | ((i7 >> 9) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | ((i7 << 6) & 896));
            composerStartRestartGroup.endReplaceableGroup();
            final int i9 = i6;
            float fM11539unboximpl = state != null ? state.getValue().m11539unboximpl() : C1700Dp.m11525constructorimpl(0);
            State<C1700Dp> stateShadowElevation$material3_release = chipElevation == null ? null : chipElevation.shadowElevation$material3_release(z3, mutableInteractionSource, composerStartRestartGroup, i8 | ((i7 >> 9) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | ((i7 << 6) & 896));
            final int i10 = i7;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8145Surfaceo_FOJdg(function0, modifier, z3, shape, jM9188unboximpl, 0L, fM11539unboximpl, stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m11539unboximpl() : C1700Dp.m11525constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1985962652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i11) {
                    if ((i11 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1985962652, i11, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1335)");
                    }
                    Function2<Composer, Integer, Unit> function24 = function2;
                    TextStyle textStyle2 = textStyle;
                    long j5 = j4;
                    Function2<Composer, Integer, Unit> function25 = function22;
                    Function2<Composer, Integer, Unit> function26 = function23;
                    ChipColors chipColors2 = chipColors;
                    boolean z4 = z3;
                    int i12 = i9;
                    long jM9188unboximpl2 = chipColors2.leadingIconContentColor$material3_release(z4, composer3, ((i12 >> 24) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | ((i12 >> 6) & 14)).getValue().m9188unboximpl();
                    ChipColors chipColors3 = chipColors;
                    boolean z5 = z3;
                    int i13 = i9;
                    long jM9188unboximpl3 = chipColors3.trailingIconContentColor$material3_release(z5, composer3, ((i13 >> 24) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | ((i13 >> 6) & 14)).getValue().m9188unboximpl();
                    float f5 = f4;
                    PaddingValues paddingValues2 = paddingValues;
                    int i14 = i9;
                    int i15 = ((i14 >> 9) & 14) | 24576 | ((i14 >> 9) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | ((i14 >> 9) & 896) | ((i14 >> 9) & 7168) | (458752 & (i14 >> 6));
                    int i16 = i10;
                    ChipKt.m7847ChipContentfe0OD_I(function24, textStyle2, j5, function25, null, function26, jM9188unboximpl2, jM9188unboximpl3, f5, paddingValues2, composer3, i15 | ((i16 << 18) & 234881024) | ((i16 << 18) & 1879048192));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, ((i9 >> 3) & 14) | ((i9 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | (i9 & 896) | ((i9 >> 15) & 7168) | ((i10 << 21) & 234881024) | ((i10 << 15) & 1879048192), 6, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i11) {
                ChipKt.m7846ChipnkUnTEs(modifier, function0, z3, function2, textStyle, j4, function22, function23, shape, chipColors, chipElevation, borderStroke, f4, paddingValues, mutableInteractionSource, composer3, i4 | 1, i5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ChipContent-fe0OD_I, reason: not valid java name */
    public static final void m7847ChipContentfe0OD_I(final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final long j4, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final long j5, final long j6, final float f4, final PaddingValues paddingValues, Composer composer, final int i4) {
        int i5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-782878228);
        if ((i4 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(function2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i5 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(j4) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i5 |= composerStartRestartGroup.changed(function22) ? 2048 : 1024;
        }
        if ((57344 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(function23) ? 16384 : 8192;
        }
        if ((458752 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(function24) ? 131072 : 65536;
        }
        if ((3670016 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(j5) ? 1048576 : 524288;
        }
        if ((29360128 & i4) == 0) {
            i6 = i5 | (composerStartRestartGroup.changed(j6) ? 8388608 : 4194304);
        } else {
            i6 = i5;
        }
        if ((234881024 & i4) == 0) {
            i6 |= composerStartRestartGroup.changed(f4) ? 67108864 : 33554432;
        }
        if ((i4 & 1879048192) == 0) {
            i6 |= composerStartRestartGroup.changed(paddingValues) ? 536870912 : 268435456;
        }
        if ((i6 & 1533916891) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782878228, i6, -1, "androidx.compose.material3.ChipContent (Chip.kt:1402)");
            }
            final int i7 = i6;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(j4)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1748799148, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1748799148, i8, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:1417)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m7344defaultMinSizeVpY3zN4$default(companion, 0.0f, f4, 1, null), paddingValues);
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2<Composer, Integer, Unit> function25 = function23;
                    int i9 = i7;
                    Function2<Composer, Integer, Unit> function26 = function22;
                    long j7 = j5;
                    Function2<Composer, Integer, Unit> function27 = function2;
                    Function2<Composer, Integer, Unit> function28 = function24;
                    long j8 = j6;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composer2);
                    Updater.m8831setimpl(composerM8824constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m8831setimpl(composerM8824constructorimpl, density, companion2.getSetDensity());
                    Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                    composer2.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-678309503);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(827638800);
                    if (function25 != null) {
                        composer2.startReplaceableGroup(650988385);
                        function25.invoke(composer2, Integer.valueOf((i9 >> 12) & 14));
                        composer2.endReplaceableGroup();
                    } else if (function26 != null) {
                        composer2.startReplaceableGroup(650988456);
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(j7))}, function26, composer2, ((i9 >> 6) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(650988618);
                        composer2.endReplaceableGroup();
                    }
                    SpacerKt.Spacer(SizeKt.m7364width3ABfNKs(companion, ChipKt.HorizontalElementsPadding), composer2, 6);
                    function27.invoke(composer2, Integer.valueOf(i9 & 14));
                    SpacerKt.Spacer(SizeKt.m7364width3ABfNKs(companion, ChipKt.HorizontalElementsPadding), composer2, 6);
                    if (function28 != null) {
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m9168boximpl(j8))}, function28, composer2, ((i9 >> 12) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8);
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                ChipKt.m7847ChipContentfe0OD_I(function2, textStyle, j4, function22, function23, function24, j5, j6, f4, paddingValues, composer2, i4 | 1);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedAssistChip(final kotlin.jvm.functions.Function0<kotlin.Unit> r50, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, androidx.compose.p006ui.Modifier r52, boolean r53, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, androidx.compose.p006ui.graphics.Shape r56, androidx.compose.material3.ChipColors r57, androidx.compose.material3.ChipElevation r58, androidx.compose.material3.ChipBorder r59, androidx.compose.foundation.interaction.MutableInteractionSource r60, androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedAssistChip(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedFilterChip(final boolean r57, final kotlin.jvm.functions.Function0<kotlin.Unit> r58, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r59, androidx.compose.p006ui.Modifier r60, boolean r61, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r62, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r63, androidx.compose.p006ui.graphics.Shape r64, androidx.compose.material3.SelectableChipColors r65, androidx.compose.material3.SelectableChipElevation r66, androidx.compose.material3.SelectableChipBorder r67, androidx.compose.foundation.interaction.MutableInteractionSource r68, androidx.compose.runtime.Composer r69, final int r70, final int r71, final int r72) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedFilterChip(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedSuggestionChip(final kotlin.jvm.functions.Function0<kotlin.Unit> r42, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, androidx.compose.p006ui.Modifier r44, boolean r45, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, androidx.compose.p006ui.graphics.Shape r47, androidx.compose.material3.ChipColors r48, androidx.compose.material3.ChipElevation r49, androidx.compose.material3.ChipBorder r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.runtime.Composer r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedSuggestionChip(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FilterChip(final boolean r56, final kotlin.jvm.functions.Function0<kotlin.Unit> r57, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, androidx.compose.p006ui.Modifier r59, boolean r60, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r62, androidx.compose.p006ui.graphics.Shape r63, androidx.compose.material3.SelectableChipColors r64, androidx.compose.material3.SelectableChipElevation r65, androidx.compose.material3.SelectableChipBorder r66, androidx.compose.foundation.interaction.MutableInteractionSource r67, androidx.compose.runtime.Composer r68, final int r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.FilterChip(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InputChip(final boolean r51, final kotlin.jvm.functions.Function0<kotlin.Unit> r52, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, androidx.compose.p006ui.Modifier r54, boolean r55, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, androidx.compose.p006ui.graphics.Shape r59, androidx.compose.material3.SelectableChipColors r60, androidx.compose.material3.SelectableChipElevation r61, androidx.compose.material3.SelectableChipBorder r62, androidx.compose.foundation.interaction.MutableInteractionSource r63, androidx.compose.runtime.Composer r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.InputChip(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.material3.SelectableChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SelectableChip-u0RnIRE, reason: not valid java name */
    public static final void m7848SelectableChipu0RnIRE(final boolean z3, final Modifier modifier, final Function0<Unit> function0, final boolean z4, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Shape shape, final SelectableChipColors selectableChipColors, final SelectableChipElevation selectableChipElevation, final BorderStroke borderStroke, final float f4, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(402951308);
        if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i6 |= composerStartRestartGroup.changed(function0) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i6 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
        }
        if ((i4 & 57344) == 0) {
            i6 |= composerStartRestartGroup.changed(function2) ? 16384 : 8192;
        }
        if ((i4 & 458752) == 0) {
            i6 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((i4 & 3670016) == 0) {
            i6 |= composerStartRestartGroup.changed(function22) ? 1048576 : 524288;
        }
        if ((i4 & 29360128) == 0) {
            i6 |= composerStartRestartGroup.changed(function23) ? 8388608 : 4194304;
        }
        if ((i4 & 234881024) == 0) {
            i6 |= composerStartRestartGroup.changed(function24) ? 67108864 : 33554432;
        }
        if ((i4 & 1879048192) == 0) {
            i6 |= composerStartRestartGroup.changed(shape) ? 536870912 : 268435456;
        }
        if ((i5 & 14) == 0) {
            i7 = (composerStartRestartGroup.changed(selectableChipColors) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i7 |= composerStartRestartGroup.changed(selectableChipElevation) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i7 |= composerStartRestartGroup.changed(borderStroke) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i7 |= composerStartRestartGroup.changed(f4) ? 2048 : 1024;
        }
        if ((i5 & 57344) == 0) {
            i7 |= composerStartRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i5 & 458752) == 0) {
            i7 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((i6 & 1533916891) == 306783378 && (374491 & i7) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, i6, i7, "androidx.compose.material3.SelectableChip (Chip.kt:1353)");
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.m10938setRolekuIjeqM(semantics, Role.INSTANCE.m10925getCheckboxo7Vup1c());
                }
            }, 1, null);
            int i8 = (i6 >> 9) & 14;
            long jM9188unboximpl = selectableChipColors.containerColor$material3_release(z4, z3, composerStartRestartGroup, ((i6 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | i8 | ((i7 << 6) & 896)).getValue().m9188unboximpl();
            composerStartRestartGroup.startReplaceableGroup(1036661290);
            State<C1700Dp> state = selectableChipElevation == null ? null : selectableChipElevation.tonalElevation$material3_release(z4, mutableInteractionSource, composerStartRestartGroup, ((i7 >> 12) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | i8 | ((i7 << 3) & 896));
            composerStartRestartGroup.endReplaceableGroup();
            float fM11539unboximpl = state != null ? state.getValue().m11539unboximpl() : C1700Dp.m11525constructorimpl(0);
            State<C1700Dp> stateShadowElevation$material3_release = selectableChipElevation == null ? null : selectableChipElevation.shadowElevation$material3_release(z4, mutableInteractionSource, composerStartRestartGroup, i8 | ((i7 >> 12) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | ((i7 << 3) & 896));
            final int i9 = i6;
            final int i10 = i7;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8143Surfaced85dljk(z3, function0, modifierSemantics$default, z4, shape, jM9188unboximpl, 0L, fM11539unboximpl, stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m11539unboximpl() : C1700Dp.m11525constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -577614814, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i11) {
                    if ((i11 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-577614814, i11, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:1385)");
                    }
                    SelectableChipColors selectableChipColors2 = selectableChipColors;
                    boolean z5 = z4;
                    boolean z6 = z3;
                    int i12 = i9;
                    long jM9188unboximpl2 = selectableChipColors2.labelColor$material3_release(z5, z6, composer3, ((i12 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | ((i12 >> 9) & 14) | ((i10 << 6) & 896)).getValue().m9188unboximpl();
                    SelectableChipColors selectableChipColors3 = selectableChipColors;
                    boolean z7 = z4;
                    boolean z8 = z3;
                    int i13 = i9;
                    long jM9188unboximpl3 = selectableChipColors3.leadingIconContentColor$material3_release(z7, z8, composer3, ((i13 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | ((i13 >> 9) & 14) | ((i10 << 6) & 896)).getValue().m9188unboximpl();
                    SelectableChipColors selectableChipColors4 = selectableChipColors;
                    boolean z9 = z4;
                    boolean z10 = z3;
                    int i14 = i9;
                    long jM9188unboximpl4 = selectableChipColors4.trailingIconContentColor$material3_release(z9, z10, composer3, ((i14 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | ((i14 >> 9) & 14) | ((i10 << 6) & 896)).getValue().m9188unboximpl();
                    Function2<Composer, Integer, Unit> function25 = function2;
                    TextStyle textStyle2 = textStyle;
                    Function2<Composer, Integer, Unit> function26 = function22;
                    Function2<Composer, Integer, Unit> function27 = function23;
                    Function2<Composer, Integer, Unit> function28 = function24;
                    float f5 = f4;
                    PaddingValues paddingValues2 = paddingValues;
                    int i15 = i9;
                    int i16 = ((i15 >> 12) & 14) | ((i15 >> 12) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | ((i15 >> 9) & 7168) | ((i15 >> 9) & 57344) | ((i15 >> 9) & 458752);
                    int i17 = i10;
                    ChipKt.m7847ChipContentfe0OD_I(function25, textStyle2, jM9188unboximpl2, function26, function27, function28, jM9188unboximpl3, jM9188unboximpl4, f5, paddingValues2, composer3, ((i17 << 15) & 1879048192) | i16 | ((i17 << 15) & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i9 & 14) | ((i9 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | (i9 & 7168) | ((i9 >> 15) & 57344) | ((i10 << 21) & 1879048192), ((i10 >> 15) & 14) | 48, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i11) {
                ChipKt.m7848SelectableChipu0RnIRE(z3, modifier, function0, z4, function2, textStyle, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, f4, paddingValues, mutableInteractionSource, composer3, i4 | 1, i5);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SuggestionChip(final kotlin.jvm.functions.Function0<kotlin.Unit> r41, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, androidx.compose.p006ui.Modifier r43, boolean r44, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, androidx.compose.p006ui.graphics.Shape r46, androidx.compose.material3.ChipColors r47, androidx.compose.material3.ChipElevation r48, androidx.compose.material3.ChipBorder r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.runtime.Composer r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.SuggestionChip(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final PaddingValues inputChipPadding(boolean z3, boolean z4, boolean z5) {
        return PaddingKt.m7313PaddingValuesa9UjIt4$default(C1700Dp.m11525constructorimpl((z3 || !z4) ? 4 : 8), 0.0f, C1700Dp.m11525constructorimpl(z5 ? 8 : 4), 0.0f, 10, null);
    }

    public static /* synthetic */ PaddingValues inputChipPadding$default(boolean z3, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            z5 = false;
        }
        return inputChipPadding(z3, z4, z5);
    }
}
