package androidx.room;

import com.alibaba.fastjson.asm.Opcodes;
import java.util.Arrays;
import java.util.Set;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10983y0;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", m26211f = "MultiInstanceInvalidationClient.android.kt", m26212l = {Opcodes.POP}, m26213m = "invokeSuspend")
/* renamed from: androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 */
/* loaded from: classes3.dex */
public final class C4467x5cbf7351 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ String[] $tables;
    Object L$0;
    int label;
    final /* synthetic */ MultiInstanceInvalidationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4467x5cbf7351(String[] strArr, MultiInstanceInvalidationClient multiInstanceInvalidationClient, InterfaceC11588c<? super C4467x5cbf7351> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$tables = strArr;
        this.this$0 = multiInstanceInvalidationClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new C4467x5cbf7351(this.$tables, this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set<String> set;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            String[] strArr = this.$tables;
            Set<String> setM24164j = AbstractC10983y0.m24164j(Arrays.copyOf(strArr, strArr.length));
            InterfaceC11602k interfaceC11602k = this.this$0.invalidatedTables;
            this.L$0 = setM24164j;
            this.label = 1;
            if (interfaceC11602k.emit(setM24164j, this) == objM25952f) {
                return objM25952f;
            }
            set = setM24164j;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) this.L$0;
            AbstractC9924b.m20071b(obj);
        }
        this.this$0.getInvalidationTracker().notifyObserversByTableNames$room_runtime_release(set);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((C4467x5cbf7351) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
