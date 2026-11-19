package androidx.navigation.serialization;

import androidx.collection.AbstractC0584a;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.core.location.LocationRequestCompat;
import com.zykj.mistake.R;
import com.zykj.mistake.feature.ask.C4525h0;
import com.zykj.mistake.feature.collection.detail.C4577a1;
import com.zykj.mistake.feature.collection.detail.C4632z0;
import com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailContract$DrawerMode;
import com.zykj.mistake.feature.collection.filter.AbstractC4655i;
import com.zykj.mistake.feature.collection.filter.C4676s0;
import com.zykj.mistake.feature.review.AbstractC5017y;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

/* renamed from: androidx.navigation.serialization.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2873c implements InterfaceC6474f {

    /* renamed from: a */
    public final /* synthetic */ int f1348a;

    /* renamed from: b */
    public final /* synthetic */ Object f1349b;

    /* renamed from: c */
    public final /* synthetic */ Object f1350c;

    public /* synthetic */ C2873c(int i, Object obj, Object obj2) {
        this.f1348a = i;
        this.f1349b = obj;
        this.f1350c = obj2;
    }

    @Override // p152r6.InterfaceC6474f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f1348a;
        C5443s c5443s = C5443s.f8405a;
        Object obj4 = this.f1350c;
        Object obj5 = this.f1349b;
        switch (i) {
            case 0:
                break;
            case 1:
                C4632z0 c4632z0 = (C4632z0) obj5;
                InterfaceC6471c interfaceC6471c = (InterfaceC6471c) obj4;
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1176099217, iIntValue, -1, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailScreen.<anonymous>.<anonymous> (MistakeCollectionDetailScreen.kt:106)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxHeight$default);
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
                int i8 = c4632z0.f6560o;
                String str = c4632z0.f6561p;
                String str2 = c4632z0.f6562q;
                boolean z8 = c4632z0.f6563r;
                List list = c4632z0.f6558m;
                List list2 = c4632z0.f6559n;
                Set set = c4632z0.f6564s;
                Integer num = c4632z0.f6565t;
                Integer num2 = c4632z0.f6566u;
                Integer num3 = c4632z0.f6567v;
                int i9 = c4632z0.f6569x;
                boolean z9 = c4632z0.f6571z;
                Set set2 = c4632z0.f6536A;
                Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.m7314width3ABfNKs(companion, C2331Dp.m13305constructorimpl(520)), 0.0f, 1, null);
                MistakeCollectionDetailContract$DrawerMode mistakeCollectionDetailContract$DrawerMode = c4632z0.f6551f;
                MistakeCollectionDetailContract$DrawerMode mistakeCollectionDetailContract$DrawerMode2 = MistakeCollectionDetailContract$DrawerMode.ADD_FILTER;
                boolean z10 = mistakeCollectionDetailContract$DrawerMode == mistakeCollectionDetailContract$DrawerMode2;
                boolean z11 = mistakeCollectionDetailContract$DrawerMode == mistakeCollectionDetailContract$DrawerMode2;
                int i10 = c4632z0.f6568w;
                boolean zChanged = composer.changed(interfaceC6471c);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new C4577a1(interfaceC6471c, 8);
                    composer.updateRememberedValue(objRememberedValue);
                }
                InterfaceC6471c interfaceC6471c2 = (InterfaceC6471c) objRememberedValue;
                boolean zChanged2 = composer.changed(interfaceC6471c);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new C4525h0(interfaceC6471c, 4);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) objRememberedValue2;
                boolean zChanged3 = composer.changed(interfaceC6471c);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new C4577a1(interfaceC6471c, 1);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                InterfaceC6471c interfaceC6471c3 = (InterfaceC6471c) objRememberedValue3;
                boolean zChanged4 = composer.changed(interfaceC6471c);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new C4577a1(interfaceC6471c, 2);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                InterfaceC6471c interfaceC6471c4 = (InterfaceC6471c) objRememberedValue4;
                boolean zChanged5 = composer.changed(interfaceC6471c);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new C4577a1(interfaceC6471c, 3);
                    composer.updateRememberedValue(objRememberedValue5);
                }
                InterfaceC6471c interfaceC6471c5 = (InterfaceC6471c) objRememberedValue5;
                boolean zChanged6 = composer.changed(interfaceC6471c);
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new C4577a1(interfaceC6471c, 4);
                    composer.updateRememberedValue(objRememberedValue6);
                }
                InterfaceC6471c interfaceC6471c6 = (InterfaceC6471c) objRememberedValue6;
                boolean zChanged7 = composer.changed(interfaceC6471c);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new C4577a1(interfaceC6471c, 5);
                    composer.updateRememberedValue(objRememberedValue7);
                }
                InterfaceC6471c interfaceC6471c7 = (InterfaceC6471c) objRememberedValue7;
                boolean zChanged8 = composer.changed(interfaceC6471c);
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new C4577a1(interfaceC6471c, 6);
                    composer.updateRememberedValue(objRememberedValue8);
                }
                InterfaceC6471c interfaceC6471c8 = (InterfaceC6471c) objRememberedValue8;
                boolean zChanged9 = composer.changed(interfaceC6471c);
                Object objRememberedValue9 = composer.rememberedValue();
                if (zChanged9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new C4525h0(interfaceC6471c, 5);
                    composer.updateRememberedValue(objRememberedValue9);
                }
                InterfaceC6469a interfaceC6469a2 = (InterfaceC6469a) objRememberedValue9;
                boolean zChanged10 = composer.changed(interfaceC6471c);
                Object objRememberedValue10 = composer.rememberedValue();
                if (zChanged10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new C4525h0(interfaceC6471c, 6);
                    composer.updateRememberedValue(objRememberedValue10);
                }
                InterfaceC6469a interfaceC6469a3 = (InterfaceC6469a) objRememberedValue10;
                boolean zChanged11 = composer.changed(interfaceC6471c);
                Object objRememberedValue11 = composer.rememberedValue();
                if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue11 = new C4577a1(interfaceC6471c, 9);
                    composer.updateRememberedValue(objRememberedValue11);
                }
                InterfaceC6471c interfaceC6471c9 = (InterfaceC6471c) objRememberedValue11;
                boolean zChanged12 = composer.changed(interfaceC6471c);
                Object objRememberedValue12 = composer.rememberedValue();
                if (zChanged12 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new C4525h0(interfaceC6471c, 23);
                    composer.updateRememberedValue(objRememberedValue12);
                }
                InterfaceC6469a interfaceC6469a4 = (InterfaceC6469a) objRememberedValue12;
                boolean zChanged13 = composer.changed(interfaceC6471c);
                Object objRememberedValue13 = composer.rememberedValue();
                if (zChanged13 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue13 = new C4525h0(interfaceC6471c, 3);
                    composer.updateRememberedValue(objRememberedValue13);
                }
                AbstractC4655i.m4078d(i8, str, str2, z8, list, list2, set, num, num2, num3, i9, z9, set2, modifierFillMaxHeight$default2, z10, z11, i10, interfaceC6471c2, interfaceC6469a, interfaceC6471c3, interfaceC6471c4, interfaceC6471c5, interfaceC6471c6, interfaceC6471c7, interfaceC6471c8, interfaceC6469a2, interfaceC6469a3, interfaceC6471c9, interfaceC6469a4, (InterfaceC6469a) objRememberedValue13, composer, 0, 3072, 0);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    break;
                }
                break;
            case 2:
                C4676s0 c4676s0 = (C4676s0) obj5;
                InterfaceC6471c interfaceC6471c10 = (InterfaceC6471c) obj4;
                AnimatedVisibilityScope AnimatedVisibility2 = (AnimatedVisibilityScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(AnimatedVisibility2, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(363302550, iIntValue2, -1, "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultScreen.<anonymous>.<anonymous> (MistakeCollectionFilterResultScreen.kt:132)");
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxHeight$default3 = SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxHeight$default3);
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
                int i11 = c4676s0.f6703u;
                String str3 = c4676s0.f6704v;
                String str4 = c4676s0.f6705w;
                boolean z12 = c4676s0.f6706x;
                List list3 = c4676s0.f6701s;
                List list4 = c4676s0.f6702t;
                Set set3 = c4676s0.f6707y;
                Integer num4 = c4676s0.f6708z;
                Integer num5 = c4676s0.f6675A;
                Integer num6 = c4676s0.f6676B;
                int i12 = c4676s0.f6678D;
                boolean z13 = c4676s0.f6679E;
                Set set4 = c4676s0.f6680F;
                Modifier modifierFillMaxHeight$default4 = SizeKt.fillMaxHeight$default(SizeKt.m7314width3ABfNKs(companion3, C2331Dp.m13305constructorimpl(520)), 0.0f, 1, null);
                boolean z14 = c4676s0.f6695m;
                int i13 = c4676s0.f6677C;
                boolean zChanged14 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue14 = composer2.rememberedValue();
                if (zChanged14 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue14 = new C4577a1(interfaceC6471c10, 17);
                    composer2.updateRememberedValue(objRememberedValue14);
                }
                InterfaceC6471c interfaceC6471c11 = (InterfaceC6471c) objRememberedValue14;
                boolean zChanged15 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue15 = composer2.rememberedValue();
                if (zChanged15 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue15 = new C4525h0(interfaceC6471c10, 26);
                    composer2.updateRememberedValue(objRememberedValue15);
                }
                InterfaceC6469a interfaceC6469a5 = (InterfaceC6469a) objRememberedValue15;
                boolean zChanged16 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue16 = composer2.rememberedValue();
                if (zChanged16 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue16 = new C4577a1(interfaceC6471c10, 10);
                    composer2.updateRememberedValue(objRememberedValue16);
                }
                InterfaceC6471c interfaceC6471c12 = (InterfaceC6471c) objRememberedValue16;
                boolean zChanged17 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue17 = composer2.rememberedValue();
                if (zChanged17 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue17 = new C4577a1(interfaceC6471c10, 11);
                    composer2.updateRememberedValue(objRememberedValue17);
                }
                InterfaceC6471c interfaceC6471c13 = (InterfaceC6471c) objRememberedValue17;
                boolean zChanged18 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue18 = composer2.rememberedValue();
                if (zChanged18 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue18 = new C4577a1(interfaceC6471c10, 12);
                    composer2.updateRememberedValue(objRememberedValue18);
                }
                InterfaceC6471c interfaceC6471c14 = (InterfaceC6471c) objRememberedValue18;
                boolean zChanged19 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue19 = composer2.rememberedValue();
                if (zChanged19 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue19 = new C4577a1(interfaceC6471c10, 13);
                    composer2.updateRememberedValue(objRememberedValue19);
                }
                InterfaceC6471c interfaceC6471c15 = (InterfaceC6471c) objRememberedValue19;
                boolean zChanged20 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue20 = composer2.rememberedValue();
                if (zChanged20 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue20 = new C4577a1(interfaceC6471c10, 14);
                    composer2.updateRememberedValue(objRememberedValue20);
                }
                InterfaceC6471c interfaceC6471c16 = (InterfaceC6471c) objRememberedValue20;
                boolean zChanged21 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue21 = composer2.rememberedValue();
                if (zChanged21 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue21 = new C4577a1(interfaceC6471c10, 15);
                    composer2.updateRememberedValue(objRememberedValue21);
                }
                InterfaceC6471c interfaceC6471c17 = (InterfaceC6471c) objRememberedValue21;
                boolean zChanged22 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue22 = composer2.rememberedValue();
                if (zChanged22 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue22 = new C4525h0(interfaceC6471c10, 27);
                    composer2.updateRememberedValue(objRememberedValue22);
                }
                InterfaceC6469a interfaceC6469a6 = (InterfaceC6469a) objRememberedValue22;
                boolean zChanged23 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue23 = composer2.rememberedValue();
                if (zChanged23 || objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue23 = new C4525h0(interfaceC6471c10, 28);
                    composer2.updateRememberedValue(objRememberedValue23);
                }
                InterfaceC6469a interfaceC6469a7 = (InterfaceC6469a) objRememberedValue23;
                boolean zChanged24 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue24 = composer2.rememberedValue();
                if (zChanged24 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue24 = new C4577a1(interfaceC6471c10, 18);
                    composer2.updateRememberedValue(objRememberedValue24);
                }
                InterfaceC6471c interfaceC6471c18 = (InterfaceC6471c) objRememberedValue24;
                boolean zChanged25 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue25 = composer2.rememberedValue();
                if (zChanged25 || objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue25 = new C4525h0(interfaceC6471c10, 24);
                    composer2.updateRememberedValue(objRememberedValue25);
                }
                InterfaceC6469a interfaceC6469a8 = (InterfaceC6469a) objRememberedValue25;
                boolean zChanged26 = composer2.changed(interfaceC6471c10);
                Object objRememberedValue26 = composer2.rememberedValue();
                if (zChanged26 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue26 = new C4525h0(interfaceC6471c10, 25);
                    composer2.updateRememberedValue(objRememberedValue26);
                }
                AbstractC4655i.m4078d(i11, str3, str4, z12, list3, list4, set3, num4, num5, num6, i12, z13, set4, modifierFillMaxHeight$default4, true, z14, i13, interfaceC6471c11, interfaceC6469a5, interfaceC6471c12, interfaceC6471c13, interfaceC6471c14, interfaceC6471c15, interfaceC6471c16, interfaceC6471c17, interfaceC6469a6, interfaceC6469a7, interfaceC6471c18, interfaceC6469a8, (InterfaceC6469a) objRememberedValue26, composer2, 0, 27648, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    break;
                }
                break;
            default:
                InterfaceC6469a interfaceC6469a9 = (InterfaceC6469a) obj5;
                String str5 = (String) obj4;
                BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC5830k.m5330g(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= composer3.changed(BoxWithConstraints) ? 4 : 2;
                }
                if (!composer3.shouldExecute((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1395289925, iIntValue3, -1, "com.zykj.mistake.feature.review.RecommendedExercisesCard.<anonymous> (ReviewScreen.kt:226)");
                    }
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.bg_recommended_exercises_decoration, composer3, 0);
                    ContentScale.Companion companion5 = ContentScale.INSTANCE;
                    ContentScale fillBounds = companion5.getFillBounds();
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    ImageKt.Image(painterPainterResource, (String) null, SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), (Alignment) null, fillBounds, 0.0f, (ColorFilter) null, composer3, 25008, LocationRequestCompat.QUALITY_LOW_POWER);
                    float fM13305constructorimpl = C2331Dp.m13305constructorimpl(BoxWithConstraints.mo7168getMaxHeightD9Ej5fM() * 0.7991453f);
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.bg_recommended_exercises, composer3, 0);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (painterPainterResource2.getIntrinsicSize() >> 32)) / Float.intBitsToFloat((int) (painterPainterResource2.getIntrinsicSize() & 4294967295L));
                    Float fValueOf = (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE || fIntBitsToFloat <= 0.0f) ? null : Float.valueOf(fIntBitsToFloat);
                    float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                    ContentScale fillBounds2 = companion5.getFillBounds();
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    ImageKt.Image(painterPainterResource2, (String) null, SizeKt.m7314width3ABfNKs(SizeKt.m7295height3ABfNKs(PaddingKt.m7266paddingqDBjuR0$default(BoxWithConstraints.align(companion6, companion7.getBottomEnd()), 0.0f, 0.0f, C2331Dp.m13305constructorimpl(10), 0.0f, 11, null), fM13305constructorimpl), C2331Dp.m13305constructorimpl(fM13305constructorimpl * fFloatValue)), (Alignment) null, fillBounds2, 0.0f, (ColorFilter) null, composer3, 24624, LocationRequestCompat.QUALITY_LOW_POWER);
                    float f = 18;
                    Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(BoxWithConstraints.align(companion6, companion7.getTopStart()), C2331Dp.m13305constructorimpl(f), C2331Dp.m13305constructorimpl(f), 0.0f, 0.0f, 12, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion7.getStart(), composer3, 0);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM7266paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    InterfaceC6469a constructor3 = companion8.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composer3);
                    InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion8, composerM10109constructorimpl3, measurePolicyColumnMeasurePolicy, composerM10109constructorimpl3, currentCompositionLocalMap3);
                    if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r3);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion8.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion7.getCenterVertically(), composer3, 48);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, companion6);
                    InterfaceC6469a constructor4 = companion8.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10109constructorimpl4 = Updater.m10109constructorimpl(composer3);
                    InterfaceC6473e interfaceC6473eM917r4 = AbstractC0584a.m917r(companion8, composerM10109constructorimpl4, measurePolicyRowMeasurePolicy, composerM10109constructorimpl4, currentCompositionLocalMap4);
                    if (composerM10109constructorimpl4.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        AbstractC0584a.m918s(currentCompositeKeyHash4, composerM10109constructorimpl4, currentCompositeKeyHash4, interfaceC6473eM917r4);
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl4, modifierMaterializeModifier4, companion8.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_recommended_exercises, composer3, 0), (String) null, SizeKt.m7309size3ABfNKs(companion6, C2331Dp.m13305constructorimpl(32)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 432, MenuKt.InTransitionDuration);
                    TextKt.m9105Text4IGK_g("推荐练习", PaddingKt.m7266paddingqDBjuR0$default(companion6, C2331Dp.m13305constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4279572250L), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer3, 200118, 0, 131024);
                    composer3.endNode();
                    TextKt.m9105Text4IGK_g(str5, PaddingKt.m7266paddingqDBjuR0$default(companion6, C2331Dp.m13305constructorimpl(46), C2331Dp.m13305constructorimpl(3), 0.0f, 0.0f, 12, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (InterfaceC6471c) null, (TextStyle) null, composer3, 3504, 0, 131056);
                    composer3.endNode();
                    long jColor = ColorKt.Color(4279596799L);
                    long jM10719getWhite0d7_KjU = Color.INSTANCE.m10719getWhite0d7_KjU();
                    Modifier modifierAlign = BoxWithConstraints.align(companion6, companion7.getBottomStart());
                    float f7 = 24;
                    AbstractC5017y.m4335d("去练习", jColor, jM10719getWhite0d7_KjU, PaddingKt.m7266paddingqDBjuR0$default(modifierAlign, C2331Dp.m13305constructorimpl(f7), 0.0f, 0.0f, C2331Dp.m13305constructorimpl(f7), 6, null), interfaceC6469a9, false, composer3, 438, 32);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return c5443s;
    }
}
