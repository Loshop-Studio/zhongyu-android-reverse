package p379vd;

import androidx.camera.view.AbstractC0979q;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.flow.StateFlowImpl;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p394wd.AbstractC11727b;
import p394wd.AbstractC11728c;
import p409xc.AbstractC11831f;
import p410xd.AbstractC11840d;
import vc.InterfaceC11588c;

/* renamed from: vd.w */
/* loaded from: classes6.dex */
public final class C11614w extends AbstractC11728c {

    /* renamed from: a */
    public final AtomicReference f27515a = new AtomicReference(null);

    @Override // p394wd.AbstractC11728c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo25598a(StateFlowImpl stateFlowImpl) {
        if (AbstractC11840d.m26247a(this.f27515a) != null) {
            return false;
        }
        AbstractC11840d.m26248b(this.f27515a, AbstractC11613v.f27513a);
        return true;
    }

    /* renamed from: e */
    public final Object m25608e(InterfaceC11588c interfaceC11588c) {
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        if (!AbstractC0979q.m884a(this.f27515a, AbstractC11613v.f27513a, c9997c)) {
            Result.C9921a c9921a = Result.f23263d;
            c9997c.resumeWith(Result.m20054c(C10786q.f26013a));
        }
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
    }

    @Override // p394wd.AbstractC11728c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC11588c[] mo25599b(StateFlowImpl stateFlowImpl) {
        AbstractC11840d.m26248b(this.f27515a, null);
        return AbstractC11727b.f27890a;
    }

    /* renamed from: g */
    public final void m25610g() {
        AtomicReference atomicReference = this.f27515a;
        while (true) {
            Object objM26247a = AbstractC11840d.m26247a(atomicReference);
            if (objM26247a == null || objM26247a == AbstractC11613v.f27514b) {
                return;
            }
            if (objM26247a == AbstractC11613v.f27513a) {
                if (AbstractC0979q.m884a(this.f27515a, objM26247a, AbstractC11613v.f27514b)) {
                    return;
                }
            } else if (AbstractC0979q.m884a(this.f27515a, objM26247a, AbstractC11613v.f27513a)) {
                Result.C9921a c9921a = Result.f23263d;
                ((C9997c) objM26247a).resumeWith(Result.m20054c(C10786q.f26013a));
                return;
            }
        }
    }

    /* renamed from: h */
    public final boolean m25611h() {
        Object andSet = this.f27515a.getAndSet(AbstractC11613v.f27513a);
        AbstractC9979u.m20291d(andSet);
        return andSet == AbstractC11613v.f27514b;
    }
}
