package com.zykj.mistake.feature.collection.detail;

import androidx.collection.AbstractC0584a;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.zykj.mistake.feature.ask.C4525h0;
import com.zykj.mistake.feature.collection.filter.C4680u0;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

/* renamed from: com.zykj.mistake.feature.collection.detail.e1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4589e1 implements InterfaceC6474f {

    /* renamed from: a */
    public final /* synthetic */ int f6473a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f6474b;

    public /* synthetic */ C4589e1(InterfaceC6471c interfaceC6471c, int i) {
        this.f6473a = i;
        this.f6474b = interfaceC6471c;
    }

    @Override // p152r6.InterfaceC6474f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f6473a;
        C5443s c5443s = C5443s.f8405a;
        InterfaceC6471c interfaceC6471c = this.f6474b;
        switch (i) {
            case 0:
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-572047432, iIntValue, -1, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailScreen.<anonymous>.<anonymous> (MistakeCollectionDetailScreen.kt:85)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                InterfaceC6469a constructor = companion2.getConstructor();
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
                InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
                if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
                }
                Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierM6754backgroundbw27NRU$default = BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.m10681copywmQWz5c$default(Color.INSTANCE.m10708getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                boolean zChanged = composer.changed(interfaceC6471c);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C4525h0(interfaceC6471c, 22);
                    composer.updateRememberedValue(objRememberedValue);
                }
                BoxKt.Box(ClickableKt.m6790clickableXHw0xAI$default(modifierM6754backgroundbw27NRU$default, false, null, null, (InterfaceC6469a) objRememberedValue, 7, null), composer, 0);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    break;
                }
                break;
            case 1:
                AnimatedVisibilityScope AnimatedVisibility2 = (AnimatedVisibilityScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(AnimatedVisibility2, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(254280287, iIntValue2, -1, "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultScreen.<anonymous>.<anonymous> (MistakeCollectionFilterResultScreen.kt:111)");
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default2);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                InterfaceC6469a constructor2 = companion4.getConstructor();
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
                InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion4, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl2, currentCompositionLocalMap2);
                if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
                }
                Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier modifierM6754backgroundbw27NRU$default2 = BackgroundKt.m6754backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Color.m10681copywmQWz5c$default(Color.INSTANCE.m10708getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                boolean zChanged2 = composer2.changed(interfaceC6471c);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C4680u0(interfaceC6471c, 3);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                BoxKt.Box(ClickableKt.m6790clickableXHw0xAI$default(modifierM6754backgroundbw27NRU$default2, false, null, null, (InterfaceC6469a) objRememberedValue2, 7, null), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    break;
                }
                break;
            default:
                interfaceC6471c.invoke((Throwable) obj);
                break;
        }
        return c5443s;
    }
}
