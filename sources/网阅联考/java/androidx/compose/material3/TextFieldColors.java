package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(m5174d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001Bê\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010 J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030%2\u0006\u0010(\u001a\u00020)H\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J0\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030%2\u0006\u00101\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J0\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030%2\u0006\u00101\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00105J0\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030%2\u0006\u00101\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0001ø\u0001\u0000¢\u0006\u0004\b9\u00105J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030%2\u0006\u00101\u001a\u00020)H\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010+J0\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030%2\u0006\u00101\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0001ø\u0001\u0000¢\u0006\u0004\b<\u00105J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030%2\u0006\u00101\u001a\u00020)H\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010+J0\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030%2\u0006\u00101\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u00102\u001a\u000203H\u0001ø\u0001\u0000¢\u0006\u0004\b?\u00105R\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0018\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0010\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u001b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u001e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0014\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0019\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0011\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u001f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0015\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0016\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u000e\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u001c\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0012\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u001a\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0014\u0010\"\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0017\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u000f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u001d\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!R\u0019\u0010\u0013\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, m5175d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "containerColor", "cursorColor", "errorCursorColor", "textSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "selectionColors", "getSelectionColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "Landroidx/compose/runtime/State;", "containerColor$material3_release", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "isError", "", "cursorColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "indicatorColor", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "indicatorColor$material3_release", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor", "labelColor$material3_release", "leadingIconColor", "leadingIconColor$material3_release", "placeholderColor$material3_release", "supportingTextColor", "supportingTextColor$material3_release", "textColor$material3_release", "trailingIconColor", "trailingIconColor$material3_release", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldColors {
    private final long containerColor;
    private final long cursorColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorSupportingTextColor;
    private final long errorTrailingIconColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedSupportingTextColor;
    private final long focusedTrailingIconColor;
    private final long placeholderColor;
    private final long textColor;
    private final SelectionColors textSelectionColors;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTrailingIconColor;

    public /* synthetic */ TextFieldColors(long j4, long j5, long j6, long j7, long j8, SelectionColors selectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4, j5, j6, j7, j8, selectionColors, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30);
    }

    /* renamed from: indicatorColor$lambda-2, reason: not valid java name */
    private static final boolean m8178indicatorColor$lambda2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: labelColor$lambda-3, reason: not valid java name */
    private static final boolean m8179labelColor$lambda3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: leadingIconColor$lambda-0, reason: not valid java name */
    private static final boolean m8180leadingIconColor$lambda0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: supportingTextColor$lambda-4, reason: not valid java name */
    private static final boolean m8181supportingTextColor$lambda4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* renamed from: trailingIconColor$lambda-1, reason: not valid java name */
    private static final boolean m8182trailingIconColor$lambda1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @Composable
    public final State<Color> containerColor$material3_release(Composer composer, int i4) {
        composer.startReplaceableGroup(954653884);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(954653884, i4, -1, "androidx.compose.material3.TextFieldColors.containerColor (TextFieldDefaults.kt:794)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(this.containerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> cursorColor$material3_release(boolean z3, Composer composer, int i4) {
        composer.startReplaceableGroup(-1885422187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1885422187, i4, -1, "androidx.compose.material3.TextFieldColors.cursorColor (TextFieldDefaults.kt:862)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(z3 ? this.errorCursorColor : this.cursorColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) other;
        return Color.m9179equalsimpl0(this.textColor, textFieldColors.textColor) && Color.m9179equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m9179equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m9179equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && Intrinsics.areEqual(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m9179equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m9179equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m9179equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m9179equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m9179equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m9179equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m9179equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m9179equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m9179equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m9179equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m9179equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m9179equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m9179equalsimpl0(this.containerColor, textFieldColors.containerColor) && Color.m9179equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m9179equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m9179equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m9179equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m9179equalsimpl0(this.placeholderColor, textFieldColors.placeholderColor) && Color.m9179equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m9179equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m9179equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m9179equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m9179equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor);
    }

    @Composable
    @JvmName(name = "getSelectionColors")
    public final SelectionColors getSelectionColors(Composer composer, int i4) {
        composer.startReplaceableGroup(997785083);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(997785083, i4, -1, "androidx.compose.material3.TextFieldColors.<get-selectionColors> (TextFieldDefaults.kt:870)");
        }
        SelectionColors selectionColors = this.textSelectionColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectionColors;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m9185hashCodeimpl(this.textColor) * 31) + Color.m9185hashCodeimpl(this.disabledTextColor)) * 31) + Color.m9185hashCodeimpl(this.cursorColor)) * 31) + Color.m9185hashCodeimpl(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.m9185hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m9185hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m9185hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m9185hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m9185hashCodeimpl(this.focusedLeadingIconColor)) * 31) + Color.m9185hashCodeimpl(this.unfocusedLeadingIconColor)) * 31) + Color.m9185hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m9185hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m9185hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m9185hashCodeimpl(this.unfocusedTrailingIconColor)) * 31) + Color.m9185hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m9185hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m9185hashCodeimpl(this.containerColor)) * 31) + Color.m9185hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m9185hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m9185hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m9185hashCodeimpl(this.errorLabelColor)) * 31) + Color.m9185hashCodeimpl(this.placeholderColor)) * 31) + Color.m9185hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m9185hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m9185hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m9185hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m9185hashCodeimpl(this.errorSupportingTextColor);
    }

    @Composable
    public final State<Color> indicatorColor$material3_release(boolean z3, boolean z4, InteractionSource interactionSource, Composer composer, int i4) {
        State<Color> stateRememberUpdatedState;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1877482635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877482635, i4, -1, "androidx.compose.material3.TextFieldColors.indicatorColor (TextFieldDefaults.kt:770)");
        }
        long j4 = !z3 ? this.disabledIndicatorColor : z4 ? this.errorIndicatorColor : m8178indicatorColor$lambda2(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i4 >> 6) & 14)) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        if (z3) {
            composer.startReplaceableGroup(715730990);
            stateRememberUpdatedState = SingleValueAnimationKt.m6984animateColorAsStateKTwxG1Y(j4, AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null), null, composer, 48, 4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(715731095);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(j4), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> labelColor$material3_release(boolean z3, boolean z4, InteractionSource interactionSource, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1167161306);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1167161306, i4, -1, "androidx.compose.material3.TextFieldColors.labelColor (TextFieldDefaults.kt:817)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(!z3 ? this.disabledLabelColor : z4 ? this.errorLabelColor : m8179labelColor$lambda3(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i4 >> 6) & 14)) ? this.focusedLabelColor : this.unfocusedLabelColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> leadingIconColor$material3_release(boolean z3, boolean z4, InteractionSource interactionSource, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(925127045);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(925127045, i4, -1, "androidx.compose.material3.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:718)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(!z3 ? this.disabledLeadingIconColor : z4 ? this.errorLeadingIconColor : m8180leadingIconColor$lambda0(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i4 >> 6) & 14)) ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> placeholderColor$material3_release(boolean z3, Composer composer, int i4) {
        composer.startReplaceableGroup(-117469162);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-117469162, i4, -1, "androidx.compose.material3.TextFieldColors.placeholderColor (TextFieldDefaults.kt:804)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(z3 ? this.placeholderColor : this.disabledPlaceholderColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> supportingTextColor$material3_release(boolean z3, boolean z4, InteractionSource interactionSource, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1464709698);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1464709698, i4, -1, "androidx.compose.material3.TextFieldColors.supportingTextColor (TextFieldDefaults.kt:839)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(!z3 ? this.disabledSupportingTextColor : z4 ? this.errorSupportingTextColor : m8181supportingTextColor$lambda4(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i4 >> 6) & 14)) ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> textColor$material3_release(boolean z3, Composer composer, int i4) {
        composer.startReplaceableGroup(2080722220);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2080722220, i4, -1, "androidx.compose.material3.TextFieldColors.textColor (TextFieldDefaults.kt:834)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(z3 ? this.textColor : this.disabledTextColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> trailingIconColor$material3_release(boolean z3, boolean z4, InteractionSource interactionSource, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-109504137);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-109504137, i4, -1, "androidx.compose.material3.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:744)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m9168boximpl(!z3 ? this.disabledTrailingIconColor : z4 ? this.errorTrailingIconColor : m8182trailingIconColor$lambda1(FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i4 >> 6) & 14)) ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    private TextFieldColors(long j4, long j5, long j6, long j7, long j8, SelectionColors selectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        this.textColor = j4;
        this.disabledTextColor = j5;
        this.containerColor = j6;
        this.cursorColor = j7;
        this.errorCursorColor = j8;
        this.textSelectionColors = selectionColors;
        this.focusedIndicatorColor = j9;
        this.unfocusedIndicatorColor = j10;
        this.errorIndicatorColor = j11;
        this.disabledIndicatorColor = j12;
        this.focusedLeadingIconColor = j13;
        this.unfocusedLeadingIconColor = j14;
        this.disabledLeadingIconColor = j15;
        this.errorLeadingIconColor = j16;
        this.focusedTrailingIconColor = j17;
        this.unfocusedTrailingIconColor = j18;
        this.disabledTrailingIconColor = j19;
        this.errorTrailingIconColor = j20;
        this.focusedLabelColor = j21;
        this.unfocusedLabelColor = j22;
        this.disabledLabelColor = j23;
        this.errorLabelColor = j24;
        this.placeholderColor = j25;
        this.disabledPlaceholderColor = j26;
        this.focusedSupportingTextColor = j27;
        this.unfocusedSupportingTextColor = j28;
        this.disabledSupportingTextColor = j29;
        this.errorSupportingTextColor = j30;
    }
}
