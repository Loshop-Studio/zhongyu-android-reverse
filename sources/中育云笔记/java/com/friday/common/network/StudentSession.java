package com.friday.common.network;

import androidx.lifecycle.CoroutineLiveDataKt;
import be.AbstractC5194f;
import be.InterfaceC5189a;
import com.alibaba.fastjson.asm.Opcodes;
import com.friday.common.helper.C5962b;
import com.friday.common.network.StudentSession;
import com.zykj.http.bean.HeaderBean;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.message.server.bean.UserInfo;
import je.C9738r;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.TimeoutKt;
import p048cb.InterfaceC5416b;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.AbstractC11831f;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.AbstractC11164t1;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class StudentSession {

    /* renamed from: a */
    public final InterfaceC11603l f6114a;

    /* renamed from: b */
    public final InterfaceC9529a f6115b;

    /* renamed from: c */
    public final InterfaceC9540l f6116c;

    /* renamed from: d */
    public final long f6117d;

    /* renamed from: e */
    public final InterfaceC9540l f6118e;

    /* renamed from: f */
    public final InterfaceC5189a f6119f;

    @InterfaceC11829d(m26210c = "com.friday.common.network.StudentSession$1", m26211f = "StudentSession.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.common.network.StudentSession$1 */
    public static final class C59661 extends SuspendLambda implements InterfaceC9540l {

        /* renamed from: c */
        public int f6120c;

        public C59661(InterfaceC11588c interfaceC11588c) {
            super(1, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
            return new C59661(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f6120c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return AbstractC11826a.m26206a(true);
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c interfaceC11588c) {
            return ((C59661) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.common.network.StudentSession$3", m26211f = "StudentSession.kt", m26212l = {40}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.common.network.StudentSession$3 */
    public static final class C59673 extends SuspendLambda implements InterfaceC9540l {

        /* renamed from: c */
        public int f6121c;

        @InterfaceC11829d(m26210c = "com.friday.common.network.StudentSession$3$1", m26211f = "StudentSession.kt", m26212l = {Opcodes.IAND}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.common.network.StudentSession$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f6122c;

            /* renamed from: d */
            public int f6123d;

            /* renamed from: com.friday.common.network.StudentSession$3$1$a */
            public static final class a implements InterfaceC5416b {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC11125j f6124a;

                public a(InterfaceC11125j interfaceC11125j) {
                    this.f6124a = interfaceC11125j;
                }

                @Override // p048cb.InterfaceC5416b
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public void mo2890a(ServerInfo serverInfo) {
                    if (this.f6124a.isActive()) {
                        this.f6124a.resumeWith(Result.m20054c(serverInfo));
                    }
                }
            }

            public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f6123d;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    return obj;
                }
                AbstractC9924b.m20071b(obj);
                this.f6122c = 0;
                this.f6123d = 1;
                C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(this), 1);
                c9997c.m20503F();
                MessageClient.f19777c.mo16539a(new a(c9997c));
                Object objM20538x = c9997c.m20538x();
                if (objM20538x == AbstractC11725a.m25952f()) {
                    AbstractC11831f.m26221c(this);
                }
                return objM20538x == objM25952f ? objM25952f : objM20538x;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C59673(InterfaceC11588c interfaceC11588c) {
            super(1, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
            return new C59673(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f6121c;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.f6121c = 1;
            Object objM24709g = AbstractC11109f.m24709g(abstractC11164t1Mo25209k, anonymousClass1, this);
            return objM24709g == objM25952f ? objM25952f : objM24709g;
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c interfaceC11588c) {
            return ((C59673) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.common.network.StudentSession$4", m26211f = "StudentSession.kt", m26212l = {51}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.common.network.StudentSession$4 */
    public static final class C59684 extends SuspendLambda implements InterfaceC9540l {

        /* renamed from: c */
        public int f6125c;

        @InterfaceC11829d(m26210c = "com.friday.common.network.StudentSession$4$1", m26211f = "StudentSession.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.common.network.StudentSession$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f6126c;

            public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                UserInfo userInfoMo16541d;
                Long lM16573a;
                AbstractC11725a.m25952f();
                if (this.f6126c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                long jM5292t = C5962b.f6082a.m5299a().m5292t();
                return AbstractC11826a.m26206a(jM5292t > 0 && (userInfoMo16541d = MessageClient.f19777c.mo16541d()) != null && (lM16573a = userInfoMo16541d.m16573a()) != null && lM16573a.longValue() == jM5292t);
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C59684(InterfaceC11588c interfaceC11588c) {
            super(1, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
            return new C59684(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f6125c;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.f6125c = 1;
            Object objM24709g = AbstractC11109f.m24709g(abstractC11106e0M24799b, anonymousClass1, this);
            return objM24709g == objM25952f ? objM25952f : objM24709g;
        }

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c interfaceC11588c) {
            return ((C59684) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public StudentSession(InterfaceC11603l headerBeanFlow, InterfaceC9529a isStudent, InterfaceC9540l fetchServerInfo, long j10, InterfaceC9540l isCurrentAccount) {
        AbstractC9979u.m20294g(headerBeanFlow, "headerBeanFlow");
        AbstractC9979u.m20294g(isStudent, "isStudent");
        AbstractC9979u.m20294g(fetchServerInfo, "fetchServerInfo");
        AbstractC9979u.m20294g(isCurrentAccount, "isCurrentAccount");
        this.f6114a = headerBeanFlow;
        this.f6115b = isStudent;
        this.f6116c = fetchServerInfo;
        this.f6117d = j10;
        this.f6118e = isCurrentAccount;
        this.f6119f = AbstractC5194f.m2745b(false, 1, null);
    }

    /* renamed from: b */
    public static final boolean m5358b() {
        return C5962b.f6082a.m5299a().m5294v();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5365i(vc.InterfaceC11588c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.friday.common.network.StudentSession$ensureReady$1
            if (r0 == 0) goto L13
            r0 = r8
            com.friday.common.network.StudentSession$ensureReady$1 r0 = (com.friday.common.network.StudentSession$ensureReady$1) r0
            int r1 = r0.f6129e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6129e = r1
            goto L18
        L13:
            com.friday.common.network.StudentSession$ensureReady$1 r0 = new com.friday.common.network.StudentSession$ensureReady$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f6127c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f6129e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            kotlin.AbstractC9924b.m20071b(r8)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L5e
        L2a:
            r8 = move-exception
            goto L73
        L2c:
            r8 = move-exception
            goto L79
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            kotlin.AbstractC9924b.m20071b(r8)
            hd.a r8 = r7.f6115b
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7a
            boolean r8 = r7.m5366j()
            if (r8 == 0) goto L4e
            goto L7a
        L4e:
            long r5 = r7.f6117d     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            com.friday.common.network.StudentSession$ensureReady$ready$1 r8 = new com.friday.common.network.StudentSession$ensureReady$ready$1     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r8.<init>(r7, r3)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.f6129e = r4     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r8 = kotlinx.coroutines.TimeoutKt.m20489e(r5, r8, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r8 != r1) goto L5e
            return r1
        L5e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r8 == 0) goto L67
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L68
        L67:
            r8 = 0
        L68:
            if (r8 == 0) goto L6d
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        L6d:
            com.friday.common.network.SessionNotReadyException r8 = new com.friday.common.network.SessionNotReadyException
            r8.<init>(r3, r4, r3)
            throw r8
        L73:
            com.friday.common.network.SessionNotReadyException r0 = new com.friday.common.network.SessionNotReadyException
            r0.<init>(r8)
            throw r0
        L79:
            throw r8
        L7a:
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.network.StudentSession.m5365i(vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/network/StudentSession.smali:274
    }

    /* renamed from: j */
    public final boolean m5366j() {
        String accessToken;
        HeaderBean headerBean = (HeaderBean) this.f6114a.getValue();
        String serverUrl = headerBean.getServerUrl();
        return ((serverUrl != null ? C9738r.f22749k.m19470f(serverUrl) : null) == null || (accessToken = headerBean.getAccessToken()) == null || AbstractC10793c0.m23132h0(accessToken)) ? false : true;
    }

    /* renamed from: k */
    public final boolean m5367k(ServerInfo serverInfo) {
        String strM16568c;
        if ((serverInfo != null ? serverInfo.m16567b() : null) != Status.LOGIN) {
            return false;
        }
        String strM16566a = serverInfo.m16566a();
        return ((strM16566a != null ? C9738r.f22749k.m19470f(strM16566a) : null) == null || (strM16568c = serverInfo.m16568c()) == null || AbstractC10793c0.m23132h0(strM16568c)) ? false : true;
    }

    /* renamed from: l */
    public final boolean m5368l(ServerInfo serverInfo) {
        Object value;
        if (!m5367k(serverInfo)) {
            return false;
        }
        InterfaceC11603l interfaceC11603l = this.f6114a;
        do {
            value = interfaceC11603l.getValue();
            AbstractC9979u.m20291d(serverInfo);
        } while (!interfaceC11603l.mo20870e(value, HeaderBean.copy$default((HeaderBean) value, null, null, serverInfo.m16566a(), serverInfo.m16568c(), null, 19, null)));
        return true;
    }

    /* renamed from: m */
    public final Object m5369m(ServerInfo serverInfo, InterfaceC11588c interfaceC11588c) {
        return !m5367k(serverInfo) ? C10786q.f26013a : TimeoutKt.m20489e(this.f6117d, new StudentSession$updateForCurrentAccount$2(this, serverInfo, null), interfaceC11588c);
    }

    public /* synthetic */ StudentSession(InterfaceC11603l interfaceC11603l, InterfaceC9529a interfaceC9529a, InterfaceC9540l interfaceC9540l, long j10, InterfaceC9540l interfaceC9540l2, int i10, AbstractC9972n abstractC9972n) {
        this(interfaceC11603l, interfaceC9529a, interfaceC9540l, (i10 & 8) != 0 ? CoroutineLiveDataKt.DEFAULT_TIMEOUT : j10, (i10 & 16) != 0 ? new C59661(null) : interfaceC9540l2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StudentSession(InterfaceC11603l headerBeanFlow) {
        this(headerBeanFlow, new InterfaceC9529a() { // from class: h2.g
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return Boolean.valueOf(StudentSession.m5358b());
            }
        }, new C59673(null), 0L, new C59684(null), 8, null);
        AbstractC9979u.m20294g(headerBeanFlow, "headerBeanFlow");
    }
}
