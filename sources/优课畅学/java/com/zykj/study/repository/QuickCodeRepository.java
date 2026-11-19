package com.zykj.study.repository;

import com.zykj.study.bean.AttachmentIdInput;
import com.zykj.study.bean.AttachmentInput;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p198o4.InterfaceC9524g;

/* loaded from: classes3.dex */
public final class QuickCodeRepository {

    /* renamed from: a */
    public final InterfaceC9524g f11472a;

    public QuickCodeRepository(InterfaceC9524g api) {
        AbstractC9133u.m16133g(api, "api");
        this.f11472a = api;
    }

    /* renamed from: a */
    public final Object m10381a(AttachmentIdInput attachmentIdInput, InterfaceC9324c interfaceC9324c) {
        return this.f11472a.m17726a(attachmentIdInput, interfaceC9324c);
    }

    /* renamed from: b */
    public final Object m10382b(AttachmentInput attachmentInput, InterfaceC9324c interfaceC9324c) {
        Object objM17727b = this.f11472a.m17727b(attachmentInput, interfaceC9324c);
        return objM17727b == AbstractC9434a.m17291f() ? objM17727b : C8736p.f16368a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10383c(com.zykj.study.bean.ScanResult r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.zykj.study.repository.QuickCodeRepository$verifyCode$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.study.repository.QuickCodeRepository$verifyCode$1 r0 = (com.zykj.study.repository.QuickCodeRepository$verifyCode$1) r0
            int r1 = r0.f11476d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11476d = r1
            goto L18
        L13:
            com.zykj.study.repository.QuickCodeRepository$verifyCode$1 r0 = new com.zykj.study.repository.QuickCodeRepository$verifyCode$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f11474b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11476d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f11473a
            com.zykj.study.bean.ScanResult r5 = (com.zykj.study.bean.ScanResult) r5
            kotlin.AbstractC9079b.m15926b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r6)
            o4.g r6 = r4.f11472a
            java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r5)
            r0.f11473a = r2
            r0.f11476d = r3
            java.lang.Object r5 = r6.m17728c(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r5 = p201o7.AbstractC9536a.m17796a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.QuickCodeRepository.m10383c(com.zykj.study.bean.ScanResult, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/QuickCodeRepository.smali:102
    }
}
