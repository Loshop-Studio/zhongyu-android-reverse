package androidx.compose.foundation.text;

import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.Placeholder;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt {
    private static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<InterfaceC9545q>>> EmptyInlineContent = new Pair<>(AbstractC10978w.m24136n(), AbstractC10978w.m24136n());

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void InlineChildren(final AnnotatedString annotatedString, final List<AnnotatedString.Range<InterfaceC9545q>> list, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1794596951);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i12 = 0;
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1794596951, i11, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            int i13 = 0;
            while (i13 < size) {
                AnnotatedString.Range<InterfaceC9545q> range = list.get(i13);
                InterfaceC9545q interfaceC9545qComponent1 = range.component1();
                int iComponent2 = range.component2();
                int iComponent3 = range.component3();
                AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 annotatedStringResolveInlineContentKt$InlineChildren$1$2 = new MeasurePolicy() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2
                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list2, long j10) {
                        final ArrayList arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            arrayList.add(list2.get(i14).mo32229measureBRTryo0(j10));
                        }
                        return MeasureScope.layout$default(measureScope, Constraints.m33454getMaxWidthimpl(j10), Constraints.m33453getMaxHeightimpl(j10), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(Placeable.PlacementScope placementScope) {
                                List<Placeable> list3 = arrayList;
                                int size3 = list3.size();
                                for (int i15 = 0; i15 < size3; i15++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list3.get(i15), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                Modifier.Companion companion = Modifier.Companion;
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i12);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                InterfaceC9529a constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
                int i14 = i12;
                Updater.m30312setimpl(composerM30305constructorimpl, annotatedStringResolveInlineContentKt$InlineChildren$1$2, companion2.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                interfaceC9545qComponent1.invoke(annotatedString.subSequence(iComponent2, iComponent3).getText(), composerStartRestartGroup, Integer.valueOf(i14));
                composerStartRestartGroup.endNode();
                i13++;
                i12 = i14;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.InlineChildren.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i15) {
                    AnnotatedStringResolveInlineContentKt.InlineChildren(annotatedString, list, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public static final boolean hasInlineContent(AnnotatedString annotatedString) {
        return annotatedString.hasStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
    }

    public static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<InterfaceC9545q>>> resolveInlineContent(AnnotatedString annotatedString, Map<String, InlineTextContent> map) {
        if (map == null || map.isEmpty()) {
            return EmptyInlineContent;
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<String> range = stringAnnotations.get(i10);
            InlineTextContent inlineTextContent = map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }
}
