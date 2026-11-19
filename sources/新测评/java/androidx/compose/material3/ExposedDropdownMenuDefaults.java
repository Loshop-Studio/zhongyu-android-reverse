package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.MenuAnchorType;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.tokens.FilledAutocompleteTokens;
import androidx.compose.material3.tokens.OutlinedAutocompleteTokens;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.RotateKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.window.PopupProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@Metadata(m13557d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000eJ\u0082\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0084\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0098\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010>\u001a\u00020\u00122\b\b\u0002\u0010?\u001a\u00020\u00122\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u001a\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0082\u0002\u0010I\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010J\u001a\u00020\u00122\b\b\u0002\u0010K\u001a\u00020\u00122\b\b\u0002\u0010L\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010,J\u0084\u0003\u0010I\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010J\u001a\u00020\u00122\b\b\u0002\u0010K\u001a\u00020\u00122\b\b\u0002\u0010L\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010=J\u0098\u0003\u0010I\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010>\u001a\u00020\u00122\b\b\u0002\u0010?\u001a\u00020\u00122\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010J\u001a\u00020\u00122\b\b\u0002\u0010K\u001a\u00020\u00122\b\b\u0002\u0010L\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bP\u0010BR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q²\u0006\n\u0010R\u001a\u00020\nX\u008a\u0084\u0002"}, m13558d2 = {"Landroidx/compose/material3/ExposedDropdownMenuDefaults;", "", "()V", "ItemContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "TrailingIcon", "", "expanded", "", "(ZLandroidx/compose/runtime/Composer;I)V", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "outlinedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "containerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-St-qZLY", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "unfocusedTextColor", "errorTextColor", "errorContainerColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "errorPlaceholderColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "outlinedTextFieldColors-tN0la-I", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "outlinedTextFieldColors-FD9MK7s", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "popupProperties", "Landroidx/compose/ui/window/PopupProperties;", "anchorType", "Landroidx/compose/material3/MenuAnchorType;", "popupProperties-pR6Bxps$material3_release", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/window/PopupProperties;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-St-qZLY", "textFieldColors-tN0la-I", "textFieldColors-FD9MK7s", "material3_release", "a11yServicesEnabled"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1490:1\n77#2:1491\n77#2:1492\n77#2:1493\n77#2:1494\n77#2:1495\n77#2:1496\n81#3:1497\n148#4:1498\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuDefaults\n*L\n587#1:1491\n748#1:1492\n903#1:1493\n1015#1:1494\n1126#1:1495\n1225#1:1496\n862#1:1497\n853#1:1498\n*E\n"})
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();
    private static final PaddingValues ItemContentPadding = PaddingKt.m17675PaddingValuesYgX7TsA(ExposedDropdownMenu_androidKt.ExposedDropdownMenuItemHorizontalPadding, C3127Dp.m23561constructorimpl(0));

    private ExposedDropdownMenuDefaults() {
    }

    private static final boolean popupProperties_pR6Bxps$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    public final void TrailingIcon(final boolean z9, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1987096744);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1987096744, i12, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:519)");
            }
            IconKt.m18887Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE), (String) null, RotateKt.rotate(modifier, z9 ? 180.0f : 0.0f), 0L, composerStartRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i14) {
                    ExposedDropdownMenuDefaults.this.TrailingIcon(z9, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
                }
            });
        }
    }

    public final PaddingValues getItemContentPadding() {
        return ItemContentPadding;
    }

    @Composable
    /* renamed from: outlinedTextFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m18821outlinedTextFieldColorsFD9MK7s(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, SelectionColors selectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jM20975copywmQWz5c$default;
        SelectionColors selectionColors2;
        int i16;
        long value;
        long jM20975copywmQWz5c$default2;
        int i17;
        long value2;
        long jM20975copywmQWz5c$default3;
        long j48;
        int i18;
        long value3;
        long jM20975copywmQWz5c$default4;
        long j49;
        int i19;
        long value4;
        long jM20975copywmQWz5c$default5;
        int i20;
        long value5;
        long jM20975copywmQWz5c$default6;
        int i21;
        long value6;
        long jM20975copywmQWz5c$default7;
        int i22;
        long value7;
        long jM20975copywmQWz5c$default8;
        long value8 = (i14 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long value9 = (i14 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        if ((i14 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default = j12;
        }
        long value10 = (i14 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long jM21011getTransparent0d7_KjU = (i14 & 16) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j14;
        long jM21011getTransparent0d7_KjU2 = (i14 & 32) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j15;
        long jM21011getTransparent0d7_KjU3 = (i14 & 64) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j16;
        long jM21011getTransparent0d7_KjU4 = (i14 & 128) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j17;
        long value11 = (i14 & 256) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j18;
        long value12 = (i14 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j19;
        SelectionColors selectionColors3 = (i14 & 1024) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        if ((i14 & 2048) != 0) {
            selectionColors2 = selectionColors3;
            i16 = 6;
            value = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6);
        } else {
            selectionColors2 = selectionColors3;
            i16 = 6;
            value = j20;
        }
        long value13 = (i14 & 4096) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, i16) : j21;
        if ((i14 & 8192) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default2 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, i16), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default2 = j22;
        }
        long j50 = jM20975copywmQWz5c$default2;
        if ((i14 & 16384) != 0) {
            i17 = 6;
            value2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6);
        } else {
            i17 = 6;
            value2 = j23;
        }
        long value14 = (32768 & i14) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, i17) : j24;
        long value15 = (65536 & i14) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, i17) : j25;
        if ((131072 & i14) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default3 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, i17), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default3 = j26;
        }
        if ((i14 & 262144) != 0) {
            j48 = jM20975copywmQWz5c$default3;
            i18 = 6;
            value3 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        } else {
            j48 = jM20975copywmQWz5c$default3;
            i18 = 6;
            value3 = j27;
        }
        long value16 = (i14 & 524288) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, i18) : j28;
        long value17 = (i14 & 1048576) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, i18) : j29;
        if ((i14 & 2097152) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default4 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, i18), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default4 = j30;
        }
        if ((i14 & 4194304) != 0) {
            j49 = jM20975copywmQWz5c$default4;
            i19 = 6;
            value4 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        } else {
            j49 = jM20975copywmQWz5c$default4;
            i19 = 6;
            value4 = j31;
        }
        long value18 = (i14 & 8388608) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, i19) : j32;
        long value19 = (i14 & 16777216) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, i19) : j33;
        if ((i14 & 33554432) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default5 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, i19), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default5 = j34;
        }
        if ((i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            i20 = 6;
            value5 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6);
        } else {
            i20 = 6;
            value5 = j35;
        }
        long value20 = (i14 & 134217728) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i20) : j36;
        long value21 = (i14 & 268435456) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i20) : j37;
        if ((i14 & 536870912) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default6 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, i20), outlinedAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default6 = j38;
        }
        if ((i14 & 1073741824) != 0) {
            i21 = 6;
            value6 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i21 = 6;
            value6 = j39;
        }
        long value22 = (i15 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i21) : j40;
        long value23 = (i15 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i21) : j41;
        if ((i15 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default7 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, i21), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default7 = j42;
        }
        if ((i15 & 8) != 0) {
            i22 = 6;
            value7 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i22 = 6;
            value7 = j43;
        }
        long value24 = (i15 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i22) : j44;
        long value25 = (i15 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i22) : j45;
        if ((i15 & 64) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens8 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default8 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens8.getFieldDisabledSupportingTextColor(), composer, i22), outlinedAutocompleteTokens8.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default8 = j46;
        }
        long value26 = (i15 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j47;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1567195085, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:805)");
        }
        int i23 = i13 << 12;
        int i24 = i13 >> 18;
        int i25 = (i24 & 14) | 3072 | (i24 & 112) | (i24 & 896);
        SelectionColors selectionColors4 = selectionColors2;
        long j51 = j48;
        TextFieldColors textFieldColorsM19080colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m19080colors0hiis_0(value8, value9, jM20975copywmQWz5c$default, value10, jM21011getTransparent0d7_KjU, jM21011getTransparent0d7_KjU2, jM21011getTransparent0d7_KjU3, jM21011getTransparent0d7_KjU4, value11, value12, selectionColors4, value, value13, j50, value2, value14, value15, j51, value3, value16, value17, j49, value4, value18, value19, jM20975copywmQWz5c$default5, value5, value20, value21, jM20975copywmQWz5c$default6, value6, 0L, 0L, 0L, 0L, value22, value23, jM20975copywmQWz5c$default7, value7, value24, value25, jM20975copywmQWz5c$default8, value26, composer, i10 & 2147483646, i11 & 2147483646, i12 & 2147483646, (i13 & 14) | (458752 & i23) | (3670016 & i23) | (29360128 & i23) | (234881024 & i23) | (i23 & 1879048192), i25, 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM19080colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: outlinedTextFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m18822outlinedTextFieldColorsStqZLY(long j10, long j11, long j12, long j13, long j14, SelectionColors selectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, Composer composer, int i10, int i11, int i12, int i13) {
        long jM20975copywmQWz5c$default;
        long jM20975copywmQWz5c$default2;
        long jM20975copywmQWz5c$default3;
        long jM20975copywmQWz5c$default4;
        long jM20975copywmQWz5c$default5;
        long jM20975copywmQWz5c$default6;
        long value = (i13 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j10;
        if ((i13 & 2) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default = j11;
        }
        long jM21011getTransparent0d7_KjU = (i13 & 4) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j12;
        long value2 = (i13 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j13;
        long value3 = (i13 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j14;
        SelectionColors selectionColors2 = (i13 & 32) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        long value4 = (i13 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j15;
        long value5 = (i13 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j16;
        if ((i13 & 256) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default2 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, 6), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default2 = j17;
        }
        long value6 = (i13 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j18;
        long value7 = (i13 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j19;
        long value8 = (i13 & 2048) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j20;
        if ((i13 & 4096) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default3 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default3 = j21;
        }
        long value9 = (i13 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j22;
        long value10 = (i13 & 16384) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j23;
        long value11 = (32768 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j24;
        if ((65536 & i13) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default4 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default4 = j25;
        }
        long value12 = (131072 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j26;
        long value13 = (262144 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j27;
        long value14 = (524288 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j28;
        if ((1048576 & i13) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default5 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, 6), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default5 = j29;
        }
        long value15 = (2097152 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j30;
        long value16 = (4194304 & i13) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j31;
        if ((i13 & 8388608) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default6 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens6.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default6 = j32;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-836383316, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1265)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
        long value17 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value18 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long jM20975copywmQWz5c$default7 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value19 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value21 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long jM20975copywmQWz5c$default8 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value22 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        int i14 = i10 << 3;
        int i15 = (i10 & 14) | (i14 & 112) | (i14 & 896);
        int i16 = i10 << 9;
        int i17 = i15 | (i16 & 7168) | ((i10 << 6) & 57344) | (i16 & 458752) | ((i10 << 12) & 3670016);
        int i18 = i10 << 15;
        int i19 = i17 | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i11 << 15;
        int i21 = i12 << 15;
        int i22 = i12 << 18;
        int i23 = ((i11 >> 15) & 65534) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i22 & 234881024) | (i22 & 1879048192);
        int i24 = ((i12 >> 6) & 14) | (i21 & 1879048192);
        long j33 = value;
        TextFieldColors textFieldColorsM18821outlinedTextFieldColorsFD9MK7s = m18821outlinedTextFieldColorsFD9MK7s(j33, value, jM20975copywmQWz5c$default, j33, jM21011getTransparent0d7_KjU, jM21011getTransparent0d7_KjU, jM21011getTransparent0d7_KjU, jM21011getTransparent0d7_KjU, value2, value3, selectionColors2, value4, value5, jM20975copywmQWz5c$default2, value6, value7, value8, jM20975copywmQWz5c$default3, value9, value10, value11, jM20975copywmQWz5c$default4, value12, value13, value14, jM20975copywmQWz5c$default5, value15, value16, value16, jM20975copywmQWz5c$default6, value16, value17, value18, jM20975copywmQWz5c$default7, value19, value20, value21, jM20975copywmQWz5c$default8, value22, composer, i19, ((i10 >> 15) & 65534) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), i23, i24, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM18821outlinedTextFieldColorsFD9MK7s;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: outlinedTextFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m18823outlinedTextFieldColorstN0laI(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, SelectionColors selectionColors, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jM20975copywmQWz5c$default;
        long jM20975copywmQWz5c$default2;
        long jM20975copywmQWz5c$default3;
        long jM20975copywmQWz5c$default4;
        long jM20975copywmQWz5c$default5;
        long jM20975copywmQWz5c$default6;
        long jM20975copywmQWz5c$default7;
        long jM20975copywmQWz5c$default8;
        long value = (i14 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long value2 = (i14 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        if ((i14 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default = j12;
        }
        long value3 = (i14 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long jM21011getTransparent0d7_KjU = (i14 & 16) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j14;
        long jM21011getTransparent0d7_KjU2 = (i14 & 32) != 0 ? Color.INSTANCE.m21011getTransparent0d7_KjU() : j15;
        long value4 = (i14 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j16;
        long value5 = (i14 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j17;
        SelectionColors selectionColors2 = (i14 & 256) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        long value6 = (i14 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j18;
        long value7 = (i14 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j19;
        if ((i14 & 2048) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default2 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, 6), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default2 = j20;
        }
        long value8 = (i14 & 4096) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j21;
        long value9 = (i14 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j22;
        long value10 = (i14 & 16384) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j23;
        if ((32768 & i14) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default3 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default3 = j24;
        }
        long value11 = (i14 & 65536) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j25;
        long value12 = (i14 & 131072) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j26;
        long value13 = (i14 & 262144) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j27;
        if ((i14 & 524288) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default4 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default4 = j28;
        }
        long value14 = (i14 & 1048576) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j29;
        long value15 = (i14 & 2097152) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j30;
        long value16 = (i14 & 4194304) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j31;
        if ((i14 & 8388608) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default5 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, 6), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default5 = j32;
        }
        long value17 = (i14 & 16777216) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j33;
        long value18 = (i14 & 33554432) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long value19 = (i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j35;
        if ((i14 & 134217728) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default6 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default6 = j36;
        }
        long value20 = (i14 & 268435456) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        long value21 = (i14 & 536870912) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        long value22 = (i14 & 1073741824) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        if ((i15 & 1) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default7 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default7 = j40;
        }
        long value23 = (i15 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j41;
        long value24 = (i15 & 4) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j42;
        long value25 = (i15 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j43;
        if ((i15 & 16) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens8 = OutlinedAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default8 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens8.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens8.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default8 = j44;
        }
        long value26 = (i15 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j45;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-388128543, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1072)");
        }
        int i16 = i10 << 6;
        int i17 = (65534 & i10) | ((i10 << 3) & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i11 << 6;
        int i19 = ((i10 >> 24) & 126) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i12 << 6;
        int i21 = i13 << 6;
        TextFieldColors textFieldColorsM18821outlinedTextFieldColorsFD9MK7s = m18821outlinedTextFieldColorsFD9MK7s(value, value2, jM20975copywmQWz5c$default, value3, jM21011getTransparent0d7_KjU, jM21011getTransparent0d7_KjU, jM21011getTransparent0d7_KjU, jM21011getTransparent0d7_KjU2, value4, value5, selectionColors2, value6, value7, jM20975copywmQWz5c$default2, value8, value9, value10, jM20975copywmQWz5c$default3, value11, value12, value13, jM20975copywmQWz5c$default4, value14, value15, value16, jM20975copywmQWz5c$default5, value17, value18, value19, jM20975copywmQWz5c$default6, value20, value21, value22, jM20975copywmQWz5c$default7, value23, value24, value25, jM20975copywmQWz5c$default8, value26, composer, i17, i19, ((i11 >> 24) & 126) | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i21 & 896) | ((i12 >> 24) & 126) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM18821outlinedTextFieldColorsFD9MK7s;
    }

    @Composable
    /* renamed from: popupProperties-pR6Bxps$material3_release, reason: not valid java name */
    public final PopupProperties m18824popupPropertiespR6Bxps$material3_release(String str, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1724259382, i10, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.popupProperties (ExposedDropdownMenu.android.kt:860)");
        }
        State<Boolean> stateRememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, composer, 0, 3);
        int i11 = !popupProperties_pR6Bxps$lambda$0(stateRememberAccessibilityServiceState) ? 393248 : 393216;
        MenuAnchorType.Companion companion = MenuAnchorType.INSTANCE;
        if (MenuAnchorType.m18957equalsimpl0(str, companion.m18961getPrimaryEditableMg6Rgbw()) || (MenuAnchorType.m18957equalsimpl0(str, companion.m18963getSecondaryEditableMg6Rgbw()) && !popupProperties_pR6Bxps$lambda$0(stateRememberAccessibilityServiceState))) {
            i11 |= 8;
        }
        PopupProperties popupProperties = new PopupProperties(i11, false, false, false, false, false, 62, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return popupProperties;
    }

    @Composable
    /* renamed from: textFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m18825textFieldColorsFD9MK7s(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, SelectionColors selectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jM20975copywmQWz5c$default;
        SelectionColors selectionColors2;
        int i16;
        long value;
        long jM20975copywmQWz5c$default2;
        int i17;
        long value2;
        long jM20975copywmQWz5c$default3;
        long j48;
        int i18;
        long value3;
        long jM20975copywmQWz5c$default4;
        long j49;
        int i19;
        long value4;
        long jM20975copywmQWz5c$default5;
        int i20;
        long value5;
        long jM20975copywmQWz5c$default6;
        int i21;
        long value6;
        long jM20975copywmQWz5c$default7;
        long value7 = (i14 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long value8 = (i14 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        if ((i14 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default = j12;
        }
        long value9 = (i14 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long value10 = (i14 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j14;
        long value11 = (i14 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j15;
        long value12 = (i14 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j16;
        long value13 = (i14 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j17;
        long value14 = (i14 & 256) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j18;
        long value15 = (i14 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j19;
        SelectionColors selectionColors3 = (i14 & 1024) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        if ((i14 & 2048) != 0) {
            selectionColors2 = selectionColors3;
            i16 = 6;
            value = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6);
        } else {
            selectionColors2 = selectionColors3;
            i16 = 6;
            value = j20;
        }
        long value16 = (i14 & 4096) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, i16) : j21;
        if ((i14 & 8192) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default2 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, i16), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default2 = j22;
        }
        long j50 = jM20975copywmQWz5c$default2;
        if ((i14 & 16384) != 0) {
            i17 = 6;
            value2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6);
        } else {
            i17 = 6;
            value2 = j23;
        }
        long value17 = (32768 & i14) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, i17) : j24;
        long value18 = (65536 & i14) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, i17) : j25;
        if ((131072 & i14) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default3 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, i17), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default3 = j26;
        }
        if ((i14 & 262144) != 0) {
            j48 = jM20975copywmQWz5c$default3;
            i18 = 6;
            value3 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        } else {
            j48 = jM20975copywmQWz5c$default3;
            i18 = 6;
            value3 = j27;
        }
        long value19 = (i14 & 524288) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, i18) : j28;
        long value20 = (i14 & 1048576) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, i18) : j29;
        if ((i14 & 2097152) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default4 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, i18), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default4 = j30;
        }
        if ((i14 & 4194304) != 0) {
            j49 = jM20975copywmQWz5c$default4;
            i19 = 6;
            value4 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        } else {
            j49 = jM20975copywmQWz5c$default4;
            i19 = 6;
            value4 = j31;
        }
        long value21 = (i14 & 8388608) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, i19) : j32;
        long value22 = (i14 & 16777216) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, i19) : j33;
        long value23 = (i14 & 33554432) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, i19) : j34;
        long value24 = (i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, i19) : j35;
        long value25 = (i14 & 134217728) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i19) : j36;
        long value26 = (i14 & 268435456) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i19) : j37;
        if ((i14 & 536870912) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default5 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledSupportingTextColor(), composer, i19), filledAutocompleteTokens5.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default5 = j38;
        }
        if ((i14 & 1073741824) != 0) {
            i20 = 6;
            value5 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i20 = 6;
            value5 = j39;
        }
        long value27 = (i15 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i20) : j40;
        long value28 = (i15 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i20) : j41;
        if ((i15 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens6 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default6 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, i20), filledAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default6 = j42;
        }
        if ((i15 & 8) != 0) {
            i21 = 6;
            value6 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i21 = 6;
            value6 = j43;
        }
        long value29 = (i15 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i21) : j44;
        long value30 = (i15 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i21) : j45;
        if ((i15 & 64) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens7 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default7 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, i21), filledAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default7 = j46;
        }
        long value31 = (i15 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j47;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(768358577, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:642)");
        }
        int i22 = i13 << 12;
        int i23 = i13 >> 18;
        int i24 = (i23 & 14) | 3072 | (i23 & 112) | (i23 & 896);
        SelectionColors selectionColors4 = selectionColors2;
        long j51 = j48;
        TextFieldColors textFieldColorsM19411colors0hiis_0 = TextFieldDefaults.INSTANCE.m19411colors0hiis_0(value7, value8, jM20975copywmQWz5c$default, value9, value10, value11, value12, value13, value14, value15, selectionColors4, value, value16, j50, value2, value17, value18, j51, value3, value19, value20, j49, value4, value21, value22, value23, value24, value25, value26, jM20975copywmQWz5c$default5, value5, 0L, 0L, 0L, 0L, value27, value28, jM20975copywmQWz5c$default6, value6, value29, value30, jM20975copywmQWz5c$default7, value31, composer, i10 & 2147483646, i11 & 2147483646, i12 & 2147483646, (i13 & 14) | (458752 & i22) | (3670016 & i22) | (29360128 & i22) | (234881024 & i22) | (i22 & 1879048192), i24, 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM19411colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: textFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m18826textFieldColorsStqZLY(long j10, long j11, long j12, long j13, long j14, SelectionColors selectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, Composer composer, int i10, int i11, int i12, int i13) {
        long jM20975copywmQWz5c$default;
        long jM20975copywmQWz5c$default2;
        long jM20975copywmQWz5c$default3;
        long jM20975copywmQWz5c$default4;
        long jM20975copywmQWz5c$default5;
        long value = (i13 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j10;
        if ((i13 & 2) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default = j11;
        }
        long value2 = (i13 & 4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j12;
        long value3 = (i13 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j13;
        long value4 = (i13 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j14;
        SelectionColors selectionColors2 = (i13 & 32) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        long value5 = (i13 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j15;
        long value6 = (i13 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j16;
        if ((i13 & 256) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default2 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, 6), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default2 = j17;
        }
        long value7 = (i13 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j18;
        long value8 = (i13 & 1024) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j19;
        long value9 = (i13 & 2048) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j20;
        if ((i13 & 4096) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default3 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default3 = j21;
        }
        long value10 = (i13 & 8192) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j22;
        long value11 = (i13 & 16384) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j23;
        long value12 = (32768 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j24;
        if ((65536 & i13) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default4 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default4 = j25;
        }
        long value13 = (131072 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j26;
        long value14 = (262144 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j27;
        long value15 = (524288 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j28;
        long value16 = (1048576 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j29;
        long value17 = (2097152 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j30;
        long value18 = (4194304 & i13) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j31;
        if ((i13 & 8388608) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default5 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens5.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default5 = j32;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1343678550, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:1165)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
        long value19 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long jM20975copywmQWz5c$default6 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value21 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value22 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value23 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long jM20975copywmQWz5c$default7 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value24 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        int i14 = i10 << 3;
        int i15 = (i10 & 14) | (i14 & 112) | (i14 & 896);
        int i16 = i10 << 9;
        int i17 = i15 | (i16 & 7168) | ((i10 << 6) & 57344) | (i16 & 458752) | ((i10 << 12) & 3670016);
        int i18 = i10 << 15;
        int i19 = i17 | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i11 << 15;
        int i21 = i12 << 15;
        int i22 = i12 << 18;
        int i23 = ((i11 >> 15) & 65534) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i22 & 234881024) | (i22 & 1879048192);
        int i24 = ((i12 >> 6) & 14) | (i21 & 1879048192);
        long j33 = value;
        TextFieldColors textFieldColorsM18825textFieldColorsFD9MK7s = m18825textFieldColorsFD9MK7s(j33, value, jM20975copywmQWz5c$default, j33, value2, value2, value2, value2, value3, value4, selectionColors2, value5, value6, jM20975copywmQWz5c$default2, value7, value8, value9, jM20975copywmQWz5c$default3, value10, value11, value12, jM20975copywmQWz5c$default4, value13, value14, value15, value16, value17, value18, value18, jM20975copywmQWz5c$default5, value18, value19, value20, jM20975copywmQWz5c$default6, value21, value22, value23, jM20975copywmQWz5c$default7, value24, composer, i19, ((i10 >> 15) & 65534) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), i23, i24, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM18825textFieldColorsFD9MK7s;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: textFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m18827textFieldColorstN0laI(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, SelectionColors selectionColors, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jM20975copywmQWz5c$default;
        long jM20975copywmQWz5c$default2;
        long jM20975copywmQWz5c$default3;
        long jM20975copywmQWz5c$default4;
        long jM20975copywmQWz5c$default5;
        long jM20975copywmQWz5c$default6;
        long jM20975copywmQWz5c$default7;
        long value = (i14 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j10;
        long value2 = (i14 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j11;
        if ((i14 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default = j12;
        }
        long value3 = (i14 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j13;
        long value4 = (i14 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j14;
        long value5 = (i14 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j15;
        long value6 = (i14 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j16;
        long value7 = (i14 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j17;
        SelectionColors selectionColors2 = (i14 & 256) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        long value8 = (i14 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j18;
        long value9 = (i14 & 1024) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j19;
        if ((i14 & 2048) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default2 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, 6), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default2 = j20;
        }
        long value10 = (i14 & 4096) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j21;
        long value11 = (i14 & 8192) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j22;
        long value12 = (i14 & 16384) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j23;
        if ((32768 & i14) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default3 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default3 = j24;
        }
        long value13 = (i14 & 65536) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j25;
        long value14 = (i14 & 131072) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j26;
        long value15 = (i14 & 262144) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j27;
        if ((i14 & 524288) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default4 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default4 = j28;
        }
        long value16 = (i14 & 1048576) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j29;
        long value17 = (i14 & 2097152) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j30;
        long value18 = (i14 & 4194304) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j31;
        long value19 = (i14 & 8388608) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j32;
        long value20 = (i14 & 16777216) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j33;
        long value21 = (i14 & 33554432) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long value22 = (i14 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j35;
        if ((i14 & 134217728) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default5 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens5.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default5 = j36;
        }
        long value23 = (i14 & 268435456) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        long value24 = (i14 & 536870912) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j38;
        long value25 = (i14 & 1073741824) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        if ((i15 & 1) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens6 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default6 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default6 = j40;
        }
        long value26 = (i15 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j41;
        long value27 = (i15 & 4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j42;
        long value28 = (i15 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j43;
        if ((i15 & 16) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens7 = FilledAutocompleteTokens.INSTANCE;
            jM20975copywmQWz5c$default7 = Color.m20975copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM20975copywmQWz5c$default7 = j44;
        }
        long value29 = (i15 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j45;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611690079, i10, i11, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:958)");
        }
        int i16 = i10 << 6;
        int i17 = (65534 & i10) | ((i10 << 3) & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i11 << 6;
        int i19 = ((i10 >> 24) & 126) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192);
        int i20 = i12 << 6;
        int i21 = i13 << 6;
        TextFieldColors textFieldColorsM18825textFieldColorsFD9MK7s = m18825textFieldColorsFD9MK7s(value, value2, jM20975copywmQWz5c$default, value3, value4, value4, value4, value5, value6, value7, selectionColors2, value8, value9, jM20975copywmQWz5c$default2, value10, value11, value12, jM20975copywmQWz5c$default3, value13, value14, value15, jM20975copywmQWz5c$default4, value16, value17, value18, value19, value20, value21, value22, jM20975copywmQWz5c$default5, value23, value24, value25, jM20975copywmQWz5c$default6, value26, value27, value28, jM20975copywmQWz5c$default7, value29, composer, i17, i19, ((i11 >> 24) & 126) | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i21 & 896) | ((i12 >> 24) & 126) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM18825textFieldColorsFD9MK7s;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @ExperimentalMaterial3Api
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    public final /* synthetic */ void TrailingIcon(boolean z9, Composer composer, final int i10) {
        int i11;
        final boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-473088613);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z10 = z9;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-473088613, i11, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:886)");
            }
            z10 = z9;
            TrailingIcon(z10, Modifier.INSTANCE, composerStartRestartGroup, (i11 & 14) | 48 | ((i11 << 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    ExposedDropdownMenuDefaults.this.TrailingIcon(z10, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }
}
