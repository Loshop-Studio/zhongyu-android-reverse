package androidx.compose.runtime;

/* loaded from: classes2.dex */
final class Invalidation {
    private Object instances;
    private final int location;
    private final RecomposeScopeImpl scope;

    public Invalidation(RecomposeScopeImpl recomposeScopeImpl, int i10, Object obj) {
        this.scope = recomposeScopeImpl;
        this.location = i10;
        this.instances = obj;
    }

    public final Object getInstances() {
        return this.instances;
    }

    public final int getLocation() {
        return this.location;
    }

    public final RecomposeScopeImpl getScope() {
        return this.scope;
    }

    public final boolean isInvalid() {
        return this.scope.isInvalidFor(this.instances);
    }

    public final void setInstances(Object obj) {
        this.instances = obj;
    }
}
