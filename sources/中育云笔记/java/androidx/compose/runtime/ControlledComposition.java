package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public interface ControlledComposition extends Composition {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(InterfaceC9544p interfaceC9544p);

    <R> R delegateInvalidations(ControlledComposition controlledComposition, int i10, InterfaceC9529a interfaceC9529a);

    @InternalComposeApi
    void disposeUnusedMovableContent(MovableContentState movableContentState);

    ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback shouldPauseCallback);

    boolean getHasPendingChanges();

    @InternalComposeApi
    void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set<? extends Object> set);

    void prepareCompose(InterfaceC9529a interfaceC9529a);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> set);

    void recordReadOf(Object obj);

    void recordWriteOf(Object obj);

    @InternalComposeApi
    void verifyConsistent();
}
