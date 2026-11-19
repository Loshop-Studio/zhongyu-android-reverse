package androidx.constraintlayout.compose;

import androidx.autofill.HintConstants;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.runtime.Immutable;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import kotlin.Metadata;

@Immutable
@Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m13558d2 = {"Landroidx/constraintlayout/compose/ConstraintSet;", "", "applyTo", "", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "transition", "Landroidx/constraintlayout/core/state/Transition;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "isDirty", "", "override", HintConstants.AUTOFILL_HINT_NAME, "", "value", "", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public interface ConstraintSet {

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void applyTo(ConstraintSet constraintSet, androidx.constraintlayout.core.state.Transition transition, int i10) {
            ConstraintSet.super.applyTo(transition, i10);
        }

        @Deprecated
        public static boolean isDirty(ConstraintSet constraintSet, List<? extends Measurable> list) {
            return ConstraintSet.super.isDirty(list);
        }

        @Deprecated
        public static ConstraintSet override(ConstraintSet constraintSet, String str, float f10) {
            return ConstraintSet.super.override(str, f10);
        }
    }

    void applyTo(State state, List<? extends Measurable> measurables);

    default void applyTo(androidx.constraintlayout.core.state.Transition transition, int type) {
    }

    default boolean isDirty(List<? extends Measurable> measurables) {
        return true;
    }

    default ConstraintSet override(String name, float value) {
        return this;
    }
}
