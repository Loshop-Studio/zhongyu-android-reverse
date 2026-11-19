package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractC9942a;
import p181hd.InterfaceC9540l;
import sd.C11170v1;
import sd.InterfaceC11149p;
import sd.InterfaceC11156r;
import sd.InterfaceC11163t0;
import vc.InterfaceC11588c;

/* renamed from: kotlinx.coroutines.h */
/* loaded from: classes6.dex */
public final class C10046h extends AbstractC9942a implements InterfaceC10045g {

    /* renamed from: c */
    public static final C10046h f23978c = new C10046h();

    public C10046h() {
        super(InterfaceC10045g.f23976b0);
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    /* renamed from: A */
    public InterfaceC11163t0 mo20404A(InterfaceC9540l interfaceC9540l) {
        return C11170v1.f26829c;
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    public void cancel(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    /* renamed from: g */
    public CancellationException mo20438g() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    public boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    public boolean start() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    /* renamed from: t */
    public InterfaceC11163t0 mo20455t(boolean z10, boolean z11, InterfaceC9540l interfaceC9540l) {
        return C11170v1.f26829c;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    /* renamed from: v */
    public Object mo20458v(InterfaceC11588c interfaceC11588c) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC10045g
    /* renamed from: y */
    public InterfaceC11149p mo20464y(InterfaceC11156r interfaceC11156r) {
        return C11170v1.f26829c;
    }
}
