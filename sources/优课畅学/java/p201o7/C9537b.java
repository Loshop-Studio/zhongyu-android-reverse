package p201o7;

import kotlin.coroutines.InterfaceC9100d;
import p179m7.InterfaceC9324c;

/* renamed from: o7.b */
/* loaded from: classes5.dex */
public final class C9537b implements InterfaceC9324c {

    /* renamed from: a */
    public static final C9537b f18901a = new C9537b();

    @Override // p179m7.InterfaceC9324c
    public InterfaceC9100d getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p179m7.InterfaceC9324c
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
