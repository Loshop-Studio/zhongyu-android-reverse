package kotlinx.coroutines.flow;

import kotlin.AbstractC9079b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.StartedLazily$command$1", m17801f = "SharingStarted.kt", m17802l = {151}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StartedLazily$command$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f17946a;

    /* renamed from: b */
    public /* synthetic */ Object f17947b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9280q f17948c;

    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1 */
    public static final class C91951 implements InterfaceC9267d {

        /* renamed from: a */
        public final /* synthetic */ Ref$BooleanRef f17949a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9267d f17950b;

        public C91951(Ref$BooleanRef ref$BooleanRef, InterfaceC9267d interfaceC9267d) {
            this.f17949a = ref$BooleanRef;
            this.f17950b = interfaceC9267d;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object m16680c(int r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
                int r1 = r0.f17953c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17953c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f17951a
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.f17953c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.AbstractC9079b.m15926b(r6)
                goto L4b
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.AbstractC9079b.m15926b(r6)
                if (r5 <= 0) goto L4e
                kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f17949a
                boolean r6 = r5.f17469a
                if (r6 != 0) goto L4e
                r5.f17469a = r3
                l8.d r5 = r4.f17950b
                kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.f17941a
                r0.f17953c = r3
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L4b
                return r1
            L4b:
                h7.p r5 = p123h7.C8736p.f16368a
                return r5
            L4e:
                h7.p r5 = p123h7.C8736p.f16368a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily$command$1.C91951.m16680c(int, m7.c):java.lang.Object");
        }

        @Override // p169l8.InterfaceC9267d
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
            return m16680c(((Number) obj).intValue(), interfaceC9324c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(InterfaceC9280q interfaceC9280q, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f17948c = interfaceC9280q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.f17948c, interfaceC9324c);
        startedLazily$command$1.f17947b = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f17946a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.f17947b;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            InterfaceC9280q interfaceC9280q = this.f17948c;
            C91951 c91951 = new C91951(ref$BooleanRef, interfaceC9267d);
            this.f17946a = 1;
            if (interfaceC9280q.collect(c91951, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        return ((StartedLazily$command$1) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
