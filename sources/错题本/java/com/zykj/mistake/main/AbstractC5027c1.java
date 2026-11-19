package com.zykj.mistake.main;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.compose.C2840b;
import com.zykj.mistake.feature.notebook.list.C4959k1;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p129o2.C6268a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.main.c1 */
/* loaded from: classes3.dex */
public abstract class AbstractC5027c1 {
    /* renamed from: a */
    public static final void m4361a(final C6268a webCaptureContainer, Modifier modifier, Composer composer, int i) {
        int i8;
        AbstractC5830k.m5330g(webCaptureContainer, "webCaptureContainer");
        Composer composerStartRestartGroup = composer.startRestartGroup(1766943846);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(webCaptureContainer) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        int i9 = i8 | 48;
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1766943846, i9, -1, "com.zykj.mistake.main.WebCaptureHost (WebCaptureHost.kt:14)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new C4959k1(9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierFillMaxSize$default, (InterfaceC6471c) objRememberedValue);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(webCaptureContainer);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                final int i10 = 0;
                objRememberedValue2 = new InterfaceC6471c() { // from class: com.zykj.mistake.main.b1
                    @Override // p152r6.InterfaceC6471c
                    public final Object invoke(Object obj) {
                        switch (i10) {
                            case 0:
                                Context context = (Context) obj;
                                AbstractC5830k.m5330g(context, "context");
                                FrameLayout frameLayout = new FrameLayout(context);
                                webCaptureContainer.f10022b = frameLayout;
                                return frameLayout;
                            default:
                                FrameLayout it = (FrameLayout) obj;
                                AbstractC5830k.m5330g(it, "it");
                                webCaptureContainer.f10022b = null;
                                return C5443s.f8405a;
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            InterfaceC6471c interfaceC6471c = (InterfaceC6471c) objRememberedValue2;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(webCaptureContainer);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                final int i11 = 1;
                objRememberedValue3 = new InterfaceC6471c() { // from class: com.zykj.mistake.main.b1
                    @Override // p152r6.InterfaceC6471c
                    public final Object invoke(Object obj) {
                        switch (i11) {
                            case 0:
                                Context context = (Context) obj;
                                AbstractC5830k.m5330g(context, "context");
                                FrameLayout frameLayout = new FrameLayout(context);
                                webCaptureContainer.f10022b = frameLayout;
                                return frameLayout;
                            default:
                                FrameLayout it = (FrameLayout) obj;
                                AbstractC5830k.m5330g(it, "it");
                                webCaptureContainer.f10022b = null;
                                return C5443s.f8405a;
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AndroidView_androidKt.AndroidView(interfaceC6471c, modifierGraphicsLayer, null, (InterfaceC6471c) objRememberedValue3, null, composerStartRestartGroup, 0, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2840b(i, 16, webCaptureContainer, modifier));
        }
    }
}
