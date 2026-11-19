package androidx.room;

import java.util.Arrays;
import java.util.Set;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p134i7.AbstractC8812w0;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", m17801f = "MultiInstanceInvalidationClient.android.kt", m17802l = {87}, m17803m = "invokeSuspend")
/* renamed from: androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 */
/* loaded from: classes3.dex */
public final class C4519x5cbf7351 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ String[] $tables;
    Object L$0;
    int label;
    final /* synthetic */ MultiInstanceInvalidationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4519x5cbf7351(String[] strArr, MultiInstanceInvalidationClient multiInstanceInvalidationClient, InterfaceC9324c<? super C4519x5cbf7351> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$tables = strArr;
        this.this$0 = multiInstanceInvalidationClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new C4519x5cbf7351(this.$tables, this.this$0, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((C4519x5cbf7351) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set<String> set;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            String[] strArr = this.$tables;
            Set<String> setM14791i = AbstractC8812w0.m14791i(Arrays.copyOf(strArr, strArr.length));
            InterfaceC9270g interfaceC9270g = this.this$0.invalidatedTables;
            this.L$0 = setM14791i;
            this.label = 1;
            if (interfaceC9270g.emit(setM14791i, this) == objM17291f) {
                return objM17291f;
            }
            set = setM14791i;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) this.L$0;
            AbstractC9079b.m15926b(obj);
        }
        this.this$0.getInvalidationTracker().notifyObserversByTableNames$room_runtime_release(set);
        return C8736p.f16368a;
    }
}
