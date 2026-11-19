package com.zykj.mistake.data;

/* renamed from: com.zykj.mistake.data.e */
/* loaded from: classes3.dex */
public abstract class AbstractC4496e {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3978a(p152r6.InterfaceC6471c r5, p075h6.InterfaceC5631c r6) {
        /*
            boolean r0 = r6 instanceof com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$1
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$1 r0 = (com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$1 r0 = new com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            r6.c r5 = (p152r6.InterfaceC6471c) r5
            kotlin.AbstractC5774b.m5119b(r6)     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.AbstractC5774b.m5119b(r6)
            g7.e r6 = kotlinx.coroutines.AbstractC5896f0.f9343a     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            g7.d r6 = p068g7.ExecutorC5608d.f8730a     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$resp$1 r2 = new com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$resp$1     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            r4 = 0
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            r0.label = r3     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            java.lang.Object r6 = kotlinx.coroutines.AbstractC6014x.m5626F(r6, r2, r0)     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            if (r6 != r1) goto L4b
            return r1
        L4b:
            com.zykj.mistake.network.ApiResp r6 = (com.zykj.mistake.network.ApiResp) r6     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            boolean r5 = r6.getUnAuthorizedRequest()     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            if (r5 == 0) goto L6e
            com.zykj.mistake.data.b r5 = com.zykj.mistake.data.C4493b.f6003a     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            r5.m3974a()     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            com.zykj.mistake.network.ApiException r5 = new com.zykj.mistake.network.ApiException     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            int r0 = r6.getErrorCode()     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            java.lang.String r6 = r6.getErrorMessage()     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            kotlin.Result$Failure r5 = kotlin.AbstractC5774b.m5118a(r5)     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            java.lang.Object r5 = kotlin.Result.m13956constructorimpl(r5)     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            return r5
        L6e:
            boolean r5 = r6.getSuccess()     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            if (r5 == 0) goto L79
            java.lang.Object r5 = kotlin.Result.m13956constructorimpl(r6)     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            return r5
        L79:
            com.zykj.mistake.network.ApiException r5 = new com.zykj.mistake.network.ApiException     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            int r0 = r6.getErrorCode()     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            java.lang.String r6 = r6.getErrorMessage()     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            kotlin.Result$Failure r5 = kotlin.AbstractC5774b.m5118a(r5)     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            java.lang.Object r5 = kotlin.Result.m13956constructorimpl(r5)     // Catch: java.lang.Throwable -> L8f java.util.concurrent.CancellationException -> L91
            return r5
        L8f:
            r5 = move-exception
            goto L93
        L91:
            r5 = move-exception
            goto Lb4
        L93:
            boolean r6 = r5 instanceof retrofit2.HttpException
            if (r6 == 0) goto La7
            r6 = r5
            retrofit2.HttpException r6 = (retrofit2.HttpException) r6
            int r6 = r6.code()
            r0 = 401(0x191, float:5.62E-43)
            if (r6 != r0) goto La7
            com.zykj.mistake.data.b r6 = com.zykj.mistake.data.C4493b.f6003a
            r6.m3974a()
        La7:
            com.zykj.mistake.network.ApiException r5 = coil3.network.AbstractC3315g.m2245n(r5)
            kotlin.Result$Failure r5 = kotlin.AbstractC5774b.m5118a(r5)
            java.lang.Object r5 = kotlin.Result.m13956constructorimpl(r5)
            return r5
        Lb4:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.data.AbstractC4496e.m3978a(r6.c, h6.c):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/data/e.smali:7
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3979b(p152r6.InterfaceC6471c r4, p152r6.InterfaceC6471c r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$2
            if (r0 == 0) goto L13
            r0 = r6
            com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$2 r0 = (com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$2 r0 = new com.zykj.mistake.data.UiRequestRunnerKt$runApiRequest$2
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r4 = r0.L$1
            r5 = r4
            r6.c r5 = (p152r6.InterfaceC6471c) r5
            java.lang.Object r4 = r0.L$0
            r6.c r4 = (p152r6.InterfaceC6471c) r4
            kotlin.AbstractC5774b.m5119b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r4 = r6.getValue()
            goto L4f
        L36:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3e:
            kotlin.AbstractC5774b.m5119b(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r4 = m3978a(r4, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            java.lang.Throwable r6 = kotlin.Result.m13959exceptionOrNullimpl(r4)
            if (r6 != 0) goto L70
            com.zykj.mistake.network.ApiResp r4 = (com.zykj.mistake.network.ApiResp) r4
            java.lang.Object r4 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L6e
            java.lang.Object r4 = kotlin.Result.m13956constructorimpl(r4)     // Catch: java.lang.Throwable -> L60 java.util.concurrent.CancellationException -> L6e
            return r4
        L60:
            r4 = move-exception
            com.zykj.mistake.network.ApiException r4 = coil3.network.AbstractC3315g.m2245n(r4)
            kotlin.Result$Failure r4 = kotlin.AbstractC5774b.m5118a(r4)
            java.lang.Object r4 = kotlin.Result.m13956constructorimpl(r4)
            return r4
        L6e:
            r4 = move-exception
            throw r4
        L70:
            kotlin.Result$Failure r4 = kotlin.AbstractC5774b.m5118a(r6)
            java.lang.Object r4 = kotlin.Result.m13956constructorimpl(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.data.AbstractC4496e.m3979b(r6.c, r6.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/data/e.smali:403
    }
}
