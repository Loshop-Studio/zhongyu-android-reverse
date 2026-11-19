package p169l8;

import androidx.camera.view.AbstractC0949q;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import kotlinx.coroutines.flow.StateFlowImpl;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p180m8.AbstractC9329b;
import p180m8.AbstractC9330c;
import p190n7.AbstractC9434a;
import p191n8.AbstractC9445f;
import p201o7.AbstractC9541f;

/* renamed from: l8.s */
/* loaded from: classes5.dex */
public final class C9282s extends AbstractC9330c {

    /* renamed from: a */
    public final AtomicReference f18282a = new AtomicReference(null);

    @Override // p180m8.AbstractC9330c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo17050a(StateFlowImpl stateFlowImpl) {
        if (AbstractC9445f.m17329a(this.f18282a) != null) {
            return false;
        }
        AbstractC9445f.m17330b(this.f18282a, AbstractC9281r.f18280a);
        return true;
    }

    /* renamed from: e */
    public final Object m17060e(InterfaceC9324c interfaceC9324c) {
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        if (!AbstractC0949q.m807a(this.f18282a, AbstractC9281r.f18280a, c9155c)) {
            Result.C9076a c9076a = Result.f17350b;
            c9155c.resumeWith(Result.m15909b(C8736p.f16368a));
        }
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x == AbstractC9434a.m17291f() ? objM16372x : C8736p.f16368a;
    }

    @Override // p180m8.AbstractC9330c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC9324c[] mo17051b(StateFlowImpl stateFlowImpl) {
        AbstractC9445f.m17330b(this.f18282a, null);
        return AbstractC9329b.f18389a;
    }

    /* renamed from: g */
    public final void m17062g() {
        AtomicReference atomicReference = this.f18282a;
        while (true) {
            Object objM17329a = AbstractC9445f.m17329a(atomicReference);
            if (objM17329a == null || objM17329a == AbstractC9281r.f18281b) {
                return;
            }
            if (objM17329a == AbstractC9281r.f18280a) {
                if (AbstractC0949q.m807a(this.f18282a, objM17329a, AbstractC9281r.f18281b)) {
                    return;
                }
            } else if (AbstractC0949q.m807a(this.f18282a, objM17329a, AbstractC9281r.f18280a)) {
                Result.C9076a c9076a = Result.f17350b;
                ((C9155c) objM17329a).resumeWith(Result.m15909b(C8736p.f16368a));
                return;
            }
        }
    }

    /* renamed from: h */
    public final boolean m17063h() {
        Object andSet = this.f18282a.getAndSet(AbstractC9281r.f18280a);
        AbstractC9133u.m16130d(andSet);
        return andSet == AbstractC9281r.f18281b;
    }
}
