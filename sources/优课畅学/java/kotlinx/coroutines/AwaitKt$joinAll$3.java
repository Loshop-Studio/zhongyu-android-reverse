package kotlinx.coroutines;

import androidx.databinding.library.baseAdapters.C3721BR;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.AwaitKt", m17801f = "Await.kt", m17802l = {C3721BR.versionViewModel}, m17803m = "joinAll")
/* loaded from: classes5.dex */
public final class AwaitKt$joinAll$3 extends ContinuationImpl {

    /* renamed from: a */
    public Object f17544a;

    /* renamed from: b */
    public /* synthetic */ Object f17545b;

    /* renamed from: c */
    public int f17546c;

    public AwaitKt$joinAll$3(InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17545b = obj;
        this.f17546c |= Integer.MIN_VALUE;
        return AwaitKt.m16211a(null, this);
    }
}
