package com.zykj.mistake.feature.notebook.detail;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.navigation.C2857e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

/* renamed from: com.zykj.mistake.feature.notebook.detail.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4815j implements InterfaceC6474f {

    /* renamed from: a */
    public final /* synthetic */ int f7029a;

    /* renamed from: b */
    public final /* synthetic */ List f7030b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6471c f7031c;

    public /* synthetic */ C4815j(int i, List list, InterfaceC6471c interfaceC6471c) {
        this.f7029a = i;
        this.f7030b = list;
        this.f7031c = interfaceC6471c;
    }

    @Override // p152r6.InterfaceC6474f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f7029a;
        C5443s c5443s = C5443s.f8405a;
        InterfaceC6471c interfaceC6471c = this.f7031c;
        List<C4819j3> list = this.f7030b;
        switch (i) {
            case 0:
                ColumnScope SupplementSection = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(SupplementSection, "$this$SupplementSection");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1661366756, iIntValue, -1, "com.zykj.mistake.feature.notebook.detail.SupplementMicroLessonSection.<anonymous> (MistakeDetailAnswerPanel.kt:364)");
                    }
                    Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(12)), Alignment.INSTANCE.getTop(), composer, 6);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierHorizontalScroll$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor = companion.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composer);
                    InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                    if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer.startReplaceGroup(-358709131);
                    for (C4819j3 c4819j3 : list) {
                        boolean zChanged = composer.changed(interfaceC6471c) | composer.changed(c4819j3);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new C2857e(8, interfaceC6471c, c4819j3);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        AbstractC4875t.m4260p(c4819j3, (InterfaceC6469a) objRememberedValue, composer, 0);
                    }
                    if (AbstractC0584a.m923x(composer)) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                } else {
                    composer.skipToGroupEnd();
                    break;
                }
                break;
            default:
                ColumnScope SupplementSection2 = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(SupplementSection2, "$this$SupplementSection");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1260380440, iIntValue2, -1, "com.zykj.mistake.feature.notebook.detail.SupplementTypicalSection.<anonymous> (MistakeDetailAnswerPanel.kt:388)");
                    }
                    Modifier modifierHorizontalScroll$default2 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m7143spacedBy0680j_4(C2331Dp.m13305constructorimpl(12)), Alignment.INSTANCE.getTop(), composer2, 6);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierHorizontalScroll$default2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor2 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composer2);
                    InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyRowMeasurePolicy2, composerM10109constructorimpl2, currentCompositionLocalMap2);
                    if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(-2041354069);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C4849o3 c4849o3 = (C4849o3) it.next();
                        boolean zChanged2 = composer2.changed(interfaceC6471c) | composer2.changed(c4849o3);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new C2857e(9, interfaceC6471c, c4849o3);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        AbstractC4875t.m4263s(c4849o3, (InterfaceC6469a) objRememberedValue2, composer2, 0);
                    }
                    if (AbstractC0584a.m923x(composer2)) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                } else {
                    composer2.skipToGroupEnd();
                    break;
                }
                break;
        }
        return c5443s;
    }
}
