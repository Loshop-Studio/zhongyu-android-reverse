package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* renamed from: androidx.compose.foundation.text.input.internal.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1375d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f777a;

    /* renamed from: b */
    public final /* synthetic */ IntConsumer f778b;

    /* renamed from: c */
    public final /* synthetic */ int f779c;

    public /* synthetic */ RunnableC1375d(IntConsumer intConsumer, int i, int i8) {
        this.f777a = i8;
        this.f778b = intConsumer;
        this.f779c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f777a) {
            case 0:
                this.f778b.accept(this.f779c);
                break;
            default:
                this.f778b.accept(this.f779c);
                break;
        }
    }
}
