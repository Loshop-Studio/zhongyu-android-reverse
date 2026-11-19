package com.zykj.download.work;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.download.data.DownloadEntity;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.AbstractC8874s1;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1", m17801f = "DownloadFileWork.kt", m17802l = {97}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DownloadFileWork$downloadFileWithProgress$error$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9648a;

    /* renamed from: b */
    public final /* synthetic */ DownloadFileWork f9649b;

    /* renamed from: c */
    public final /* synthetic */ DownloadEntity f9650c;

    @InterfaceC9539d(m17800c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1", m17801f = "DownloadFileWork.kt", m17802l = {108, 120, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, 120, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, 120, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, 120, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, 120, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1 */
    public static final class C72841 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public Object f9651a;

        /* renamed from: b */
        public Object f9652b;

        /* renamed from: c */
        public int f9653c;

        /* renamed from: d */
        public /* synthetic */ Object f9654d;

        /* renamed from: e */
        public final /* synthetic */ DownloadFileWork f9655e;

        /* renamed from: f */
        public final /* synthetic */ DownloadEntity f9656f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C72841(DownloadFileWork downloadFileWork, DownloadEntity downloadEntity, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f9655e = downloadFileWork;
            this.f9656f = downloadEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C72841 c72841 = new C72841(this.f9655e, this.f9656f, interfaceC9324c);
            c72841.f9654d = obj;
            return c72841;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C72841) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
        
            if (r13.updateFlag(r2, r3, r12) != r1) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
        /* JADX WARN: Type inference failed for: r13v23, types: [com.zykj.download.work.DownloadFileWorkProxy] */
        /* JADX WARN: Type inference failed for: r13v26, types: [com.zykj.download.work.DownloadFileWorkProxy] */
        /* JADX WARN: Type inference failed for: r13v29, types: [com.zykj.download.work.DownloadFileWorkProxy] */
        /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v19, types: [kotlinx.coroutines.n] */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v15, types: [com.zykj.download.DownloadFlag] */
        /* JADX WARN: Type inference failed for: r6v16, types: [com.zykj.download.DownloadFlag] */
        /* JADX WARN: Type inference failed for: r6v18, types: [com.zykj.download.DownloadFlag] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 526
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1.C72841.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1.smali:148
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWork$downloadFileWithProgress$error$1(DownloadFileWork downloadFileWork, DownloadEntity downloadEntity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9649b = downloadFileWork;
        this.f9650c = downloadEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new DownloadFileWork$downloadFileWithProgress$error$1(this.f9649b, this.f9650c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((DownloadFileWork$downloadFileWithProgress$error$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f9648a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        C72841 c72841 = new C72841(this.f9649b, this.f9650c, null);
        this.f9648a = 1;
        Object objM14911c = AbstractC8874s1.m14911c(c72841, this);
        return objM14911c == objM17291f ? objM17291f : objM14911c;
    }
}
