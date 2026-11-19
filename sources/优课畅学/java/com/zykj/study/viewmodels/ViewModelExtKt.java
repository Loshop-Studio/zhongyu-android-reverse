package com.zykj.study.viewmodels;

import androidx.lifecycle.ViewModelKt;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.zykj.base.BaseViewModel;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p135i8.AbstractC8839h;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public abstract class ViewModelExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[Catch: all -> 0x00b4, TRY_LEAVE, TryCatch #1 {all -> 0x00b4, blocks: (B:34:0x00a4, B:36:0x00b0), top: B:48:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m12314a(com.zykj.base.BaseViewModel r14, com.kunminx.architecture.p043ui.callback.UnPeekLiveData r15, com.kunminx.architecture.p043ui.callback.UnPeekLiveData r16, p300x7.InterfaceC10574p r17, p300x7.InterfaceC10570l r18, p179m7.InterfaceC9324c r19) {
        /*
            r1 = r16
            r0 = r19
            boolean r2 = r0 instanceof com.zykj.study.viewmodels.ViewModelExtKt$launchAsyncData$1
            if (r2 == 0) goto L17
            r2 = r0
            com.zykj.study.viewmodels.ViewModelExtKt$launchAsyncData$1 r2 = (com.zykj.study.viewmodels.ViewModelExtKt$launchAsyncData$1) r2
            int r3 = r2.f14512h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f14512h = r3
            goto L1c
        L17:
            com.zykj.study.viewmodels.ViewModelExtKt$launchAsyncData$1 r2 = new com.zykj.study.viewmodels.ViewModelExtKt$launchAsyncData$1
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f14511g
            java.lang.Object r3 = p190n7.AbstractC9434a.m17291f()
            int r4 = r2.f14512h
            r5 = 0
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L56
            if (r4 != r7) goto L4e
            java.lang.Object r14 = r2.f14510f
            i8.e0 r14 = (p135i8.InterfaceC8831e0) r14
            java.lang.Object r14 = r2.f14509e
            x7.l r14 = (p300x7.InterfaceC10570l) r14
            java.lang.Object r15 = r2.f14508d
            x7.p r15 = (p300x7.InterfaceC10574p) r15
            java.lang.Object r15 = r2.f14507c
            com.kunminx.architecture.ui.callback.UnPeekLiveData r15 = (com.kunminx.architecture.p043ui.callback.UnPeekLiveData) r15
            java.lang.Object r1 = r2.f14506b
            com.kunminx.architecture.ui.callback.UnPeekLiveData r1 = (com.kunminx.architecture.p043ui.callback.UnPeekLiveData) r1
            java.lang.Object r2 = r2.f14505a
            com.zykj.base.BaseViewModel r2 = (com.zykj.base.BaseViewModel) r2
            kotlin.AbstractC9079b.m15926b(r0)     // Catch: java.lang.Throwable -> L47
            goto L95
        L47:
            r0 = move-exception
            r8 = r1
            r1 = r15
            r15 = r8
            r8 = r14
            r14 = r2
            goto La4
        L4e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L56:
            kotlin.AbstractC9079b.m15926b(r0)
            if (r1 == 0) goto L62
            java.lang.Boolean r0 = p201o7.AbstractC9536a.m17796a(r7)
            r1.setValue(r0)
        L62:
            i8.b0 r8 = androidx.lifecycle.ViewModelKt.getViewModelScope(r14)     // Catch: java.lang.Throwable -> La1
            com.zykj.study.viewmodels.ViewModelExtKt$launchAsyncData$async$1 r11 = new com.zykj.study.viewmodels.ViewModelExtKt$launchAsyncData$async$1     // Catch: java.lang.Throwable -> La1
            r0 = r17
            r11.<init>(r0, r5)     // Catch: java.lang.Throwable -> La1
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            i8.e0 r4 = p135i8.AbstractC8833f.m14843b(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> La1
            r2.f14505a = r14     // Catch: java.lang.Throwable -> La1
            r2.f14506b = r15     // Catch: java.lang.Throwable -> La1
            r2.f14507c = r1     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = p201o7.AbstractC9543h.m17814a(r0)     // Catch: java.lang.Throwable -> La1
            r2.f14508d = r0     // Catch: java.lang.Throwable -> La1
            r8 = r18
            r2.f14509e = r8     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = p201o7.AbstractC9543h.m17814a(r4)     // Catch: java.lang.Throwable -> L9f
            r2.f14510f = r0     // Catch: java.lang.Throwable -> L9f
            r2.f14512h = r7     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = r4.mo14833u(r2)     // Catch: java.lang.Throwable -> L9f
            if (r0 != r3) goto L94
            return r3
        L94:
            r15 = r1
        L95:
            if (r15 == 0) goto L9e
            java.lang.Boolean r14 = p201o7.AbstractC9536a.m17796a(r6)
            r15.setValue(r14)
        L9e:
            return r0
        L9f:
            r0 = move-exception
            goto La4
        La1:
            r0 = move-exception
            r8 = r18
        La4:
            java.lang.Object r2 = r8.invoke(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Lb4
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto Lb7
            r14.handlerThrowable(r0, r15)     // Catch: java.lang.Throwable -> Lb4
            goto Lb7
        Lb4:
            r0 = move-exception
            r14 = r0
            goto Lc1
        Lb7:
            if (r1 == 0) goto Lc0
            java.lang.Boolean r14 = p201o7.AbstractC9536a.m17796a(r6)
            r1.setValue(r14)
        Lc0:
            return r5
        Lc1:
            if (r1 == 0) goto Lca
            java.lang.Boolean r15 = p201o7.AbstractC9536a.m17796a(r6)
            r1.setValue(r15)
        Lca:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.ViewModelExtKt.m12314a(com.zykj.base.BaseViewModel, com.kunminx.architecture.ui.callback.UnPeekLiveData, com.kunminx.architecture.ui.callback.UnPeekLiveData, x7.p, x7.l, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/ViewModelExtKt.smali:7
    }

    /* renamed from: b */
    public static final InterfaceC9212n m12315b(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, InterfaceC10574p block, InterfaceC10575q error) {
        AbstractC9133u.m16133g(baseViewModel, "<this>");
        AbstractC9133u.m16133g(block, "block");
        AbstractC9133u.m16133g(error, "error");
        return AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(baseViewModel), null, null, new ViewModelExtKt$launchData$1(unPeekLiveData2, block, error, baseViewModel, unPeekLiveData, null), 3, null);
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC9212n m12316c(BaseViewModel baseViewModel, UnPeekLiveData unPeekLiveData, UnPeekLiveData unPeekLiveData2, InterfaceC10574p interfaceC10574p, InterfaceC10575q interfaceC10575q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            unPeekLiveData = null;
        }
        if ((i10 & 2) != 0) {
            unPeekLiveData2 = null;
        }
        return m12315b(baseViewModel, unPeekLiveData, unPeekLiveData2, interfaceC10574p, interfaceC10575q);
    }
}
