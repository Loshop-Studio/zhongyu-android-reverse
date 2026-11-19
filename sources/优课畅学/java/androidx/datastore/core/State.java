package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public abstract class State<T> {
    private final int version;

    public /* synthetic */ State(int i10, AbstractC9126n abstractC9126n) {
        this(i10);
    }

    public final int getVersion() {
        return this.version;
    }

    private State(int i10) {
        this.version = i10;
    }
}
