package com.zykj.study.utils;

import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.ViewModelKt;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.zykj.base.BaseViewModel;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.AbstractC8839h;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public abstract class ContextExtKt {
    /* renamed from: a */
    public static final void m11875a(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, InterfaceC10574p block, InterfaceC10575q interfaceC10575q) {
        AbstractC9133u.m16133g(baseViewModel, "<this>");
        AbstractC9133u.m16133g(block, "block");
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(baseViewModel), null, null, new ContextExtKt$enqueue$1(unPeekLiveData2, block, baseViewModel, unPeekLiveData, interfaceC10575q, null), 3, null);
    }

    /* renamed from: b */
    public static /* synthetic */ void m11876b(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, InterfaceC10574p interfaceC10574p, InterfaceC10575q interfaceC10575q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i10 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC10575q = null;
        }
        m11875a(baseViewModel, unPeekLiveData, unPeekLiveData2, interfaceC10574p, interfaceC10575q);
    }

    /* renamed from: c */
    public static final long m11877c(float f10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1720909256, i10, -1, "com.zykj.study.utils.toSp (ContextExt.kt:217)");
        }
        long jMo20499toSp0xMU5do = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo20499toSp0xMU5do(f10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jMo20499toSp0xMU5do;
    }
}
