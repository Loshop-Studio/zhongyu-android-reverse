package androidx.compose.p013ui.node;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.CompositionLocalMap;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface ComposeUiNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InterfaceC10559a Constructor = LayoutNode.Companion.getConstructor$ui_release();
        private static final InterfaceC10559a VirtualConstructor = new InterfaceC10559a() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            @Override // p300x7.InterfaceC10559a
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        };
        private static final InterfaceC10574p SetModifier = new InterfaceC10574p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (Modifier) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(ComposeUiNode composeUiNode, Modifier modifier) {
                composeUiNode.setModifier(modifier);
            }
        };
        private static final InterfaceC10574p SetDensity = new InterfaceC10574p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (Density) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(ComposeUiNode composeUiNode, Density density) {
                composeUiNode.setDensity(density);
            }
        };
        private static final InterfaceC10574p SetResolvedCompositionLocals = new InterfaceC10574p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (CompositionLocalMap) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
                composeUiNode.setCompositionLocalMap(compositionLocalMap);
            }
        };
        private static final InterfaceC10574p SetMeasurePolicy = new InterfaceC10574p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (MeasurePolicy) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                composeUiNode.setMeasurePolicy(measurePolicy);
            }
        };
        private static final InterfaceC10574p SetLayoutDirection = new InterfaceC10574p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (LayoutDirection) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                composeUiNode.setLayoutDirection(layoutDirection);
            }
        };
        private static final InterfaceC10574p SetViewConfiguration = new InterfaceC10574p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, (ViewConfiguration) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                composeUiNode.setViewConfiguration(viewConfiguration);
            }
        };
        private static final InterfaceC10574p SetCompositeKeyHash = new InterfaceC10574p() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((ComposeUiNode) obj, ((Number) obj2).intValue());
                return C8736p.f16368a;
            }

            public final void invoke(ComposeUiNode composeUiNode, int i10) {
                composeUiNode.setCompositeKeyHash(i10);
            }
        };

        private Companion() {
        }

        public final InterfaceC10559a getConstructor() {
            return Constructor;
        }

        public final InterfaceC10574p getSetCompositeKeyHash() {
            return SetCompositeKeyHash;
        }

        public final InterfaceC10574p getSetDensity() {
            return SetDensity;
        }

        public final InterfaceC10574p getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        public final InterfaceC10574p getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        public final InterfaceC10574p getSetModifier() {
            return SetModifier;
        }

        public final InterfaceC10574p getSetResolvedCompositionLocals() {
            return SetResolvedCompositionLocals;
        }

        public final InterfaceC10574p getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        public final InterfaceC10559a getVirtualConstructor() {
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
