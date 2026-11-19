package retrofit2;

import java.util.concurrent.CompletableFuture;

/* renamed from: retrofit2.k */
/* loaded from: classes4.dex */
public final class C6502k extends CompletableFuture {

    /* renamed from: a */
    public final C6524x f10708a;

    public C6502k(C6524x c6524x) {
        this.f10708a = c6524x;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        if (z8) {
            this.f10708a.cancel();
        }
        return super.cancel(z8);
    }
}
