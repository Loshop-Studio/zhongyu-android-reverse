package kotlinx.coroutines.flow;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p135i8.AbstractC8823b1;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8869r;
import p169l8.AbstractC9281r;
import p169l8.C9273j;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", m17801f = "Share.kt", m17802l = {336}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f17880a;

    /* renamed from: b */
    public /* synthetic */ Object f17881b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9266c f17882c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC8869r f17883d;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$a */
    public static final class C9186a implements InterfaceC9267d {

        /* renamed from: a */
        public final /* synthetic */ Ref$ObjectRef f17884a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8822b0 f17885b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC8869r f17886c;

        public C9186a(Ref$ObjectRef ref$ObjectRef, InterfaceC8822b0 interfaceC8822b0, InterfaceC8869r interfaceC8869r) {
            this.f17884a = ref$ObjectRef;
            this.f17885b = interfaceC8822b0;
            this.f17886c = interfaceC8869r;
        }

        @Override // p169l8.InterfaceC9267d
        public final Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
            C8736p c8736p;
            InterfaceC9271h interfaceC9271h = (InterfaceC9271h) this.f17884a.f17473a;
            if (interfaceC9271h != null) {
                interfaceC9271h.setValue(obj);
                c8736p = C8736p.f16368a;
            } else {
                c8736p = null;
            }
            if (c8736p == null) {
                InterfaceC8822b0 interfaceC8822b0 = this.f17885b;
                Ref$ObjectRef ref$ObjectRef = this.f17884a;
                InterfaceC8869r interfaceC8869r = this.f17886c;
                InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(obj);
                interfaceC8869r.mo14905h(new C9273j(interfaceC9271hM17054a, AbstractC8823b1.m14816l(interfaceC8822b0.getCoroutineContext())));
                ref$ObjectRef.f17473a = interfaceC9271hM17054a;
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(InterfaceC9266c interfaceC9266c, InterfaceC8869r interfaceC8869r, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f17882c = interfaceC9266c;
        this.f17883d = interfaceC8869r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.f17882c, this.f17883d, interfaceC9324c);
        flowKt__ShareKt$launchSharingDeferred$1.f17881b = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f17880a;
        try {
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f17881b;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                InterfaceC9266c interfaceC9266c = this.f17882c;
                C9186a c9186a = new C9186a(ref$ObjectRef, interfaceC8822b0, this.f17883d);
                this.f17880a = 1;
                if (interfaceC9266c.collect(c9186a, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        } catch (Throwable th) {
            this.f17883d.mo14904a(th);
            throw th;
        }
    }
}
