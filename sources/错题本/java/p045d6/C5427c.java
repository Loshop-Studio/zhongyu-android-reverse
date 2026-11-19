package p045d6;

import kotlin.coroutines.EmptyCoroutineContext;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6474f;

/* renamed from: d6.c */
/* loaded from: classes.dex */
public final class C5427c extends AbstractC5426b implements InterfaceC5631c {

    /* renamed from: a */
    public InterfaceC6474f f8389a;

    /* renamed from: b */
    public InterfaceC5631c f8390b;

    /* renamed from: c */
    public Object f8391c;

    @Override // p075h6.InterfaceC5631c
    public final InterfaceC5636h getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // p075h6.InterfaceC5631c
    public final void resumeWith(Object obj) {
        this.f8390b = null;
        this.f8391c = obj;
    }
}
