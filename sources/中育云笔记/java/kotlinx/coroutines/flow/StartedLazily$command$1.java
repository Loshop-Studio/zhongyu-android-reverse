package kotlinx.coroutines.flow;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.StartedLazily$command$1", m26211f = "SharingStarted.kt", m26212l = {Opcodes.DCMPL}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class StartedLazily$command$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23858c;

    /* renamed from: d */
    public /* synthetic */ Object f23859d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC11612u f23860e;

    /* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1 */
    public static final class C100371 implements InterfaceC11595d {

        /* renamed from: c */
        public final /* synthetic */ Ref$BooleanRef f23861c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC11595d f23862d;

        public C100371(Ref$BooleanRef ref$BooleanRef, InterfaceC11595d interfaceC11595d) {
            this.f23861c = ref$BooleanRef;
            this.f23862d = interfaceC11595d;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object m20864b(int r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
                int r1 = r0.f23865e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f23865e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f23863c
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.f23865e
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.AbstractC9924b.m20071b(r6)
                goto L4b
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.AbstractC9924b.m20071b(r6)
                if (r5 <= 0) goto L4e
                kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f23861c
                boolean r6 = r5.f23398c
                if (r6 != 0) goto L4e
                r5.f23398c = r3
                vd.d r5 = r4.f23862d
                kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.f23853c
                r0.f23865e = r3
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L4b
                return r1
            L4b:
                qc.q r5 = p309qc.C10786q.f26013a
                return r5
            L4e:
                qc.q r5 = p309qc.C10786q.f26013a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily$command$1.C100371.m20864b(int, vc.c):java.lang.Object");
        }

        @Override // p379vd.InterfaceC11595d
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
            return m20864b(((Number) obj).intValue(), interfaceC11588c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(InterfaceC11612u interfaceC11612u, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23860e = interfaceC11612u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.f23860e, interfaceC11588c);
        startedLazily$command$1.f23859d = obj;
        return startedLazily$command$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23858c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.f23859d;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            InterfaceC11612u interfaceC11612u = this.f23860e;
            C100371 c100371 = new C100371(ref$BooleanRef, interfaceC11595d);
            this.f23858c = 1;
            if (interfaceC11612u.collect(c100371, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        return ((StartedLazily$command$1) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
