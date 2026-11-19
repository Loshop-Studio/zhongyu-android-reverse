package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.TimeoutKt", m26211f = "Timeout.kt", m26212l = {102}, m26213m = "withTimeoutOrNull")
/* loaded from: classes6.dex */
public final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {

    /* renamed from: c */
    public long f23507c;

    /* renamed from: d */
    public Object f23508d;

    /* renamed from: e */
    public Object f23509e;

    /* renamed from: f */
    public /* synthetic */ Object f23510f;

    /* renamed from: g */
    public int f23511g;

    public TimeoutKt$withTimeoutOrNull$1(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23510f = obj;
        this.f23511g |= Integer.MIN_VALUE;
        return TimeoutKt.m20489e(0L, null, this);
    }
}
