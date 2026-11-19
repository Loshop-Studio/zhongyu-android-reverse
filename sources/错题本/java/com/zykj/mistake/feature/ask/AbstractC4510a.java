package com.zykj.mistake.feature.ask;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.compose.C2756g;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import coil3.network.AbstractC3315g;
import com.zykj.mistake.activity.MainActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6473e;
import p167t4.AbstractC6591d;
import p167t4.C6592e;
import p191w4.AbstractC6719d;
import p191w4.InterfaceC6718c;
import p212z4.C6814a;

/* renamed from: com.zykj.mistake.feature.ask.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4510a {
    /* renamed from: a */
    public static final void m3997a(MistakeAskMaterialViewModel mistakeAskMaterialViewModel, C4520f bundle, C6814a environment, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(bundle, "bundle");
        AbstractC5830k.m5330g(environment, "environment");
        Composer composerStartRestartGroup = composer.startRestartGroup(1809456032);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(mistakeAskMaterialViewModel) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(bundle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(environment) ? 256 : 128;
        }
        int i9 = i8;
        if (composerStartRestartGroup.shouldExecute((i9 & 147) != 146, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1809456032, i9, -1, "com.zykj.mistake.feature.ask.AskMaterialEffectHandler (AskMaterialEffectHandler.kt:22)");
            }
            InterfaceC6718c interfaceC6718c = (InterfaceC6718c) composerStartRestartGroup.consume(AbstractC6719d.f11339a);
            C6592e c6592e = (C6592e) composerStartRestartGroup.consume(AbstractC6591d.f11002a);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new LinkedHashSet();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Set set = (Set) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new C4512b();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            C4512b c4512b = (C4512b) objRememberedValue2;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(bundle) | composerStartRestartGroup.changedInstance(environment) | composerStartRestartGroup.changedInstance(mistakeAskMaterialViewModel) | composerStartRestartGroup.changedInstance(set);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                AskMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1 askMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1 = new AskMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1(bundle, environment, mistakeAskMaterialViewModel, set, null);
                composerStartRestartGroup.updateRememberedValue(askMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1);
                objRememberedValue3 = askMaterialEffectHandlerKt$AskMaterialEffectHandler$1$1;
            }
            EffectsKt.LaunchedEffect(bundle, mistakeAskMaterialViewModel, (InterfaceC6473e) objRememberedValue3, composerStartRestartGroup, ((i9 >> 3) & 14) | ((i9 << 3) & 112));
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(mistakeAskMaterialViewModel) | composerStartRestartGroup.changedInstance(c6592e) | composerStartRestartGroup.changedInstance(interfaceC6718c) | composerStartRestartGroup.changedInstance(environment) | composerStartRestartGroup.changedInstance(c4512b);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1 askMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1 = new AskMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1(mistakeAskMaterialViewModel, c6592e, interfaceC6718c, environment, c4512b, null);
                composerStartRestartGroup.updateRememberedValue(askMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1);
                objRememberedValue4 = askMaterialEffectHandlerKt$AskMaterialEffectHandler$2$1;
            }
            EffectsKt.LaunchedEffect(mistakeAskMaterialViewModel, (InterfaceC6473e) objRememberedValue4, composerStartRestartGroup, i9 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 3, mistakeAskMaterialViewModel, bundle, environment));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x011b -> B:44:0x0123). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3998b(com.zykj.mistake.feature.ask.C4520f r13, p212z4.C6814a r14, com.zykj.mistake.feature.ask.MistakeAskMaterialViewModel r15, java.util.Set r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.ask.AbstractC4510a.m3998b(com.zykj.mistake.feature.ask.f, z4.a, com.zykj.mistake.feature.ask.MistakeAskMaterialViewModel, java.util.Set, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/ask/a.smali:682
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3999c(java.util.ArrayList r7, p212z4.C6814a r8, p191w4.InterfaceC6718c r9, com.zykj.mistake.feature.ask.C4512b r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt$resolveAndOpenAsk$1
            if (r0 == 0) goto L13
            r0 = r11
            com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt$resolveAndOpenAsk$1 r0 = (com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt$resolveAndOpenAsk$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt$resolveAndOpenAsk$1 r0 = new com.zykj.mistake.feature.ask.AskMaterialEffectHandlerKt$resolveAndOpenAsk$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            d6.s r3 = p045d6.C5443s.f8405a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 != r5) goto L43
            java.lang.Object r7 = r0.L$4
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            java.lang.Object r7 = r0.L$3
            r10 = r7
            com.zykj.mistake.feature.ask.b r10 = (com.zykj.mistake.feature.ask.C4512b) r10
            java.lang.Object r7 = r0.L$2
            r9 = r7
            w4.c r9 = (p191w4.InterfaceC6718c) r9
            java.lang.Object r7 = r0.L$1
            r8 = r7
            z4.a r8 = (p212z4.C6814a) r8
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            kotlin.AbstractC5774b.m5119b(r11)     // Catch: java.lang.Throwable -> L41
            goto L85
        L41:
            r7 = move-exception
            goto L8c
        L43:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L4b:
            kotlin.AbstractC5774b.m5119b(r11)
            boolean r11 = r10.f6215a
            if (r11 == 0) goto L53
            return r3
        L53:
            o2.a r11 = r8.f11542b
            java.lang.Object r11 = r11.f10022b
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            if (r11 != 0) goto L63
            java.lang.String r7 = "页面尚未就绪，请稍后重试"
            com.zykj.mistake.activity.MainActivity r9 = (com.zykj.mistake.activity.MainActivity) r9
            r9.m3907b(r7)
            return r3
        L63:
            r10.f6215a = r5
            p191w4.InterfaceC6718c.m6409a(r9)     // Catch: java.lang.Throwable -> La6
            com.zykj.mistake.utils.c r2 = new com.zykj.mistake.utils.c     // Catch: java.lang.Throwable -> L41
            com.zykj.mistake.activity.MainActivity r6 = r8.f11541a     // Catch: java.lang.Throwable -> L41
            r2.<init>(r6, r11)     // Catch: java.lang.Throwable -> L41
            r11 = 0
            r0.L$0 = r11     // Catch: java.lang.Throwable -> L41
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L41
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L41
            r0.L$3 = r10     // Catch: java.lang.Throwable -> L41
            r0.L$4 = r11     // Catch: java.lang.Throwable -> L41
            r0.I$0 = r4     // Catch: java.lang.Throwable -> L41
            r0.label = r5     // Catch: java.lang.Throwable -> L41
            java.lang.Object r11 = r2.m4449e(r7, r0)     // Catch: java.lang.Throwable -> L41
            if (r11 != r1) goto L85
            return r1
        L85:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L41
            java.lang.Object r7 = kotlin.Result.m13956constructorimpl(r11)     // Catch: java.lang.Throwable -> L41
            goto L94
        L8c:
            kotlin.Result$Failure r7 = kotlin.AbstractC5774b.m5118a(r7)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r7 = kotlin.Result.m13956constructorimpl(r7)     // Catch: java.lang.Throwable -> La6
        L94:
            com.zykj.mistake.activity.MainActivity r9 = (com.zykj.mistake.activity.MainActivity) r9     // Catch: java.lang.Throwable -> La6
            r9.m3908c()     // Catch: java.lang.Throwable -> La6
            boolean r11 = kotlin.Result.m13962isSuccessimpl(r7)     // Catch: java.lang.Throwable -> La6
            if (r11 == 0) goto La8
            r11 = r7
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> La6
            m4000d(r8, r9, r11)     // Catch: java.lang.Throwable -> La6
            goto La8
        La6:
            r7 = move-exception
            goto Lb6
        La8:
            java.lang.Throwable r7 = kotlin.Result.m13959exceptionOrNullimpl(r7)     // Catch: java.lang.Throwable -> La6
            if (r7 == 0) goto Lb3
            java.lang.String r7 = "素材处理失败"
            r9.m3907b(r7)     // Catch: java.lang.Throwable -> La6
        Lb3:
            r10.f6215a = r4
            return r3
        Lb6:
            r10.f6215a = r4
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.ask.AbstractC4510a.m3999c(java.util.ArrayList, z4.a, w4.c, com.zykj.mistake.feature.ask.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/ask/a.smali:1456
    }

    /* renamed from: d */
    public static final void m4000d(C6814a c6814a, MainActivity mainActivity, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            File file = new File((String) obj);
            if (file.exists() && file.length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            mainActivity.m3907b("素材处理失败");
            return;
        }
        PackageManager packageManager = c6814a.f11541a.getPackageManager();
        AbstractC5830k.m5329f(packageManager, "getPackageManager(...)");
        if (AbstractC3315g.m2236d().resolveActivity(packageManager) == null) {
            mainActivity.m3907b("未检测到随身答应用，无法提问");
            return;
        }
        try {
            MainActivity mainActivity2 = c6814a.f11541a;
            Intent intentM2236d = AbstractC3315g.m2236d();
            intentM2236d.putExtra("localPathList", (String[]) arrayList.toArray(new String[0]));
            mainActivity2.startActivity(intentM2236d);
        } catch (ActivityNotFoundException unused) {
            mainActivity.m3907b("未检测到随身答应用，无法提问");
        }
    }
}
