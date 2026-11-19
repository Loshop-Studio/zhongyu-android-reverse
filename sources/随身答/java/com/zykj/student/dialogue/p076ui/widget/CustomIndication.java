package com.zykj.student.dialogue.p076ui.widget;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p012ui.graphics.drawscope.DrawScope;
import androidx.compose.p012ui.node.DelegatableNode;
import androidx.compose.p012ui.node.DrawModifierNode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.taobao.sophix.PatchStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002¨\u0006\u000f"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/widget/CustomIndication;", "Landroidx/compose/foundation/IndicationNodeFactory;", "<init>", "()V", "create", "Landroidx/compose/ui/node/DelegatableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "hashCode", "", "equals", "", "other", "", "PressIndicationInstance", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class CustomIndication implements IndicationNodeFactory {

    /* renamed from: a */
    public static final CustomIndication f11893a = new CustomIndication();

    public static final class PressIndicationInstance extends Modifier.Node implements DrawModifierNode {

        /* renamed from: a */
        public final InteractionSource f11894a;

        /* renamed from: b */
        public boolean f11895b;

        public PressIndicationInstance(InteractionSource interactionSource) {
            Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
            this.f11894a = interactionSource;
        }

        @Override // androidx.compose.p012ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
            if (this.f11895b) {
                DrawScope.m21954drawRectnJ9OG0$default(contentDrawScope, Color.m21408copywmQWz5c$default(Color.INSTANCE.m21446getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo21960getSizeNHjbRc(), 0.0f, null, null, 0, PatchStatus.CODE_LOAD_RES_UPDATECONFIG, null);
            }
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new CustomIndication$PressIndicationInstance$onAttach$1(this, null), 3, null);
        }

        @Override // androidx.compose.p012ui.node.DrawModifierNode
        public void onMeasureResultChanged() {
            super.onMeasureResultChanged();
        }
    }

    private CustomIndication() {
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public DelegatableNode create(InteractionSource interactionSource) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        return new PressIndicationInstance(interactionSource);
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public boolean equals(Object other) {
        return other == this;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public int hashCode() {
        return -1;
    }

    @Override // androidx.compose.foundation.Indication
    public IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i9) {
        return super.rememberUpdatedInstance(interactionSource, composer, i9);
    }
}
