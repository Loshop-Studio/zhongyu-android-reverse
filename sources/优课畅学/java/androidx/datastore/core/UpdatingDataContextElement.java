package androidx.datastore.core;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class UpdatingDataContextElement implements InterfaceC9100d.b {
    public static final Companion Companion = new Companion(null);
    private static final String NESTED_UPDATE_ERROR_MESSAGE = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    private final DataStoreImpl<?> instance;
    private final UpdatingDataContextElement parent;

    public static final class Companion {

        public static final class Key implements InterfaceC9100d.c {
            public static final Key INSTANCE = new Key();

            private Key() {
            }
        }

        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core_release() {
            return UpdatingDataContextElement.NESTED_UPDATE_ERROR_MESSAGE;
        }

        private Companion() {
        }
    }

    public UpdatingDataContextElement(UpdatingDataContextElement updatingDataContextElement, DataStoreImpl<?> instance) {
        AbstractC9133u.m16133g(instance, "instance");
        this.parent = updatingDataContextElement;
        this.instance = instance;
    }

    public final void checkNotUpdating(DataStore<?> candidate) {
        AbstractC9133u.m16133g(candidate, "candidate");
        if (this.instance == candidate) {
            throw new IllegalStateException(NESTED_UPDATE_ERROR_MESSAGE.toString());
        }
        UpdatingDataContextElement updatingDataContextElement = this.parent;
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(candidate);
        }
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public <R> R fold(R r10, InterfaceC10574p interfaceC10574p) {
        return (R) InterfaceC9100d.b.a.m16071a(this, r10, interfaceC10574p);
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public <E extends InterfaceC9100d.b> E get(InterfaceC9100d.c cVar) {
        return (E) InterfaceC9100d.b.a.m16072b(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b
    public InterfaceC9100d.c getKey() {
        return Companion.Key.INSTANCE;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return InterfaceC9100d.b.a.m16073c(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return InterfaceC9100d.b.a.m16074d(this, interfaceC9100d);
    }
}
