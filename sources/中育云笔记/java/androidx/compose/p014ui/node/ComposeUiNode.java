package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.CompositionLocalMap;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public interface ComposeUiNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InterfaceC9529a Constructor = LayoutNode.Companion.getConstructor$ui_release();
        private static final InterfaceC9529a VirtualConstructor = new InterfaceC9529a() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            @Override // p181hd.InterfaceC9529a
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        };
        private static final InterfaceC9544p SetModifier = new InterfaceC9544p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (Modifier) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(ComposeUiNode composeUiNode, Modifier modifier) {
                composeUiNode.setModifier(modifier);
            }
        };
        private static final InterfaceC9544p SetDensity = new InterfaceC9544p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (Density) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(ComposeUiNode composeUiNode, Density density) {
                composeUiNode.setDensity(density);
            }
        };
        private static final InterfaceC9544p SetResolvedCompositionLocals = new InterfaceC9544p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (CompositionLocalMap) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
                composeUiNode.setCompositionLocalMap(compositionLocalMap);
            }
        };
        private static final InterfaceC9544p SetMeasurePolicy = new InterfaceC9544p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (MeasurePolicy) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                composeUiNode.setMeasurePolicy(measurePolicy);
            }
        };
        private static final InterfaceC9544p SetLayoutDirection = new InterfaceC9544p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (LayoutDirection) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                composeUiNode.setLayoutDirection(layoutDirection);
            }
        };
        private static final InterfaceC9544p SetViewConfiguration = new InterfaceC9544p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (ViewConfiguration) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                composeUiNode.setViewConfiguration(viewConfiguration);
            }
        };
        private static final InterfaceC9544p SetCompositeKeyHash = new InterfaceC9544p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, ((Number) obj2).intValue());
                return C10786q.f26013a;
            }

            public final void invoke(ComposeUiNode composeUiNode, int i10) {
                composeUiNode.setCompositeKeyHash(i10);
            }
        };

        private Companion() {
        }

        public final InterfaceC9529a getConstructor() {
            return Constructor;
        }

        public final InterfaceC9544p getSetCompositeKeyHash() {
            return SetCompositeKeyHash;
        }

        public final InterfaceC9544p getSetDensity() {
            return SetDensity;
        }

        public final InterfaceC9544p getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        public final InterfaceC9544p getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        public final InterfaceC9544p getSetModifier() {
            return SetModifier;
        }

        public final InterfaceC9544p getSetResolvedCompositionLocals() {
            return SetResolvedCompositionLocals;
        }

        public final InterfaceC9544p getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        public final InterfaceC9529a getVirtualConstructor() {
            return VirtualConstructor;
        }
    }

    int getCompositeKeyHash();

    CompositionLocalMap getCompositionLocalMap();

    Density getDensity();

    LayoutDirection getLayoutDirection();

    MeasurePolicy getMeasurePolicy();

    Modifier getModifier();

    ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int i10);

    void setCompositionLocalMap(CompositionLocalMap compositionLocalMap);

    void setDensity(Density density);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void setMeasurePolicy(MeasurePolicy measurePolicy);

    void setModifier(Modifier modifier);

    void setViewConfiguration(ViewConfiguration viewConfiguration);
}
