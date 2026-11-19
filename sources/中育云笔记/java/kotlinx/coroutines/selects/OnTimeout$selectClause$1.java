package kotlinx.coroutines.selects;

import ae.InterfaceC0115k;
import com.taobao.agoo.p087a.p088a.C7707c;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements InterfaceC9545q {

    /* renamed from: c */
    public static final OnTimeout$selectClause$1 f24013c = new OnTimeout$selectClause$1();

    public OnTimeout$selectClause$1() {
        super(3, OnTimeout.class, C7707c.JSON_CMD_REGISTER, "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: g */
    public final void m20970g(OnTimeout onTimeout, InterfaceC0115k interfaceC0115k, Object obj) {
        onTimeout.m20969d(interfaceC0115k, obj);
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m20970g((OnTimeout) obj, (InterfaceC0115k) obj2, obj3);
        return C10786q.f26013a;
    }
}
