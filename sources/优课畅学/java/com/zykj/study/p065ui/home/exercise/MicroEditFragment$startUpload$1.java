package com.zykj.study.p065ui.home.exercise;

import com.blankj.utilcode.util.AbstractC5376m0;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p134i7.AbstractC8801r;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.MicroEditFragment$startUpload$1", m17801f = "MicroEditFragment.kt", m17802l = {206, TbsListener.ErrorCode.COPY_SRCDIR_ERROR}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MicroEditFragment$startUpload$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f12062a;

    /* renamed from: b */
    public boolean f12063b;

    /* renamed from: c */
    public int f12064c;

    /* renamed from: d */
    public int f12065d;

    /* renamed from: e */
    public /* synthetic */ Object f12066e;

    /* renamed from: f */
    public final /* synthetic */ String f12067f;

    /* renamed from: g */
    public final /* synthetic */ MicroEditFragment f12068g;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.MicroEditFragment$startUpload$1$1", m17801f = "MicroEditFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragment$startUpload$1$1 */
    public static final class C78381 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12069a;

        /* renamed from: b */
        public /* synthetic */ Object f12070b;

        /* renamed from: c */
        public final /* synthetic */ String f12071c;

        /* renamed from: d */
        public final /* synthetic */ String f12072d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C78381(String str, String str2, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f12071c = str;
            this.f12072d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C78381 c78381 = new C78381(this.f12071c, this.f12072d, interfaceC9324c);
            c78381.f12070b = obj;
            return c78381;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C78381) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM15909b;
            List listM14736u1;
            AbstractC9434a.m17291f();
            if (this.f12069a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            String str = this.f12071c;
            String str2 = this.f12072d;
            try {
                Result.C9076a c9076a = Result.f17350b;
                File[] fileArrListFiles = new File(str).listFiles();
                objM15909b = Result.m15909b((fileArrListFiles == null || (listM14736u1 = AbstractC8801r.m14736u1(fileArrListFiles)) == null) ? null : AbstractC9536a.m17796a(AbstractC5376m0.m2585e(listM14736u1, new File(str2))));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            if (Result.m15913g(objM15909b)) {
                return null;
            }
            return objM15909b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroEditFragment$startUpload$1(String str, MicroEditFragment microEditFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12067f = str;
        this.f12068g = microEditFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        MicroEditFragment$startUpload$1 microEditFragment$startUpload$1 = new MicroEditFragment$startUpload$1(this.f12067f, this.f12068g, interfaceC9324c);
        microEditFragment$startUpload$1.f12066e = obj;
        return microEditFragment$startUpload$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MicroEditFragment$startUpload$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (r5.m10761P(r6, r2, r9) == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f12066e
            i8.b0 r0 = (p135i8.InterfaceC8822b0) r0
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r9.f12065d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2b
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1b
            java.lang.Object r0 = r9.f12062a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.AbstractC9079b.m15926b(r10)
            goto L8d
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r2 = r9.f12062a
            java.lang.String r2 = (java.lang.String) r2
            kotlin.AbstractC9079b.m15926b(r10)
            goto L5a
        L2b:
            kotlin.AbstractC9079b.m15926b(r10)
            java.lang.String r10 = r9.f12067f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r10 = ".zip"
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            kotlinx.coroutines.CoroutineDispatcher r10 = p135i8.C8843i0.m14867b()
            com.zykj.study.ui.home.exercise.MicroEditFragment$startUpload$1$1 r6 = new com.zykj.study.ui.home.exercise.MicroEditFragment$startUpload$1$1
            java.lang.String r7 = r9.f12067f
            r8 = 0
            r6.<init>(r7, r2, r8)
            r9.f12066e = r0
            r9.f12062a = r2
            r9.f12065d = r5
            java.lang.Object r10 = p135i8.AbstractC8833f.m14848g(r10, r6, r9)
            if (r10 != r1) goto L5a
            goto L7a
        L5a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L7b
            com.zykj.study.ui.home.exercise.MicroEditFragment r5 = r9.f12068g
            java.lang.String r6 = r9.f12067f
            boolean r10 = r10.booleanValue()
            r9.f12066e = r0
            java.lang.Object r0 = p201o7.AbstractC9543h.m17814a(r2)
            r9.f12062a = r0
            r9.f12063b = r10
            r9.f12064c = r3
            r9.f12065d = r4
            java.lang.Object r10 = r5.m10761P(r6, r2, r9)
            if (r10 != r1) goto L8d
        L7a:
            return r1
        L7b:
            com.zykj.study.ui.home.exercise.MicroEditFragment r10 = r9.f12068g
            com.zykj.base.utils.XToastUtils r0 = com.zykj.base.utils.XToastUtils.INSTANCE
            int r1 = com.zykj.study.R$string.micro_zip_error
            java.lang.String r10 = r10.getString(r1)
            java.lang.String r1 = "getString(...)"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r10, r1)
            p086e5.AbstractC8366o.m13652d(r0, r10)
        L8d:
            com.zykj.study.ui.home.exercise.MicroEditFragment r10 = r9.f12068g
            com.zykj.study.viewmodels.MicroEditViewModel r10 = com.zykj.study.p065ui.home.exercise.MicroEditFragment.m10754w(r10)
            com.kunminx.architecture.ui.callback.UnPeekLiveData r10 = r10.isDialogVisible()
            java.lang.Boolean r0 = p201o7.AbstractC9536a.m17796a(r3)
            r10.postValue(r0)
            h7.p r10 = p123h7.C8736p.f16368a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.exercise.MicroEditFragment$startUpload$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/exercise/MicroEditFragment$startUpload$1.smali:141
    }
}
