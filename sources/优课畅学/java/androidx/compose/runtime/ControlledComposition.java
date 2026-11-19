package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface ControlledComposition extends Composition {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(InterfaceC10574p interfaceC10574p);

    <R> R delegateInvalidations(ControlledComposition controlledComposition, int i10, InterfaceC10559a interfaceC10559a);

    @InternalComposeApi
    void disposeUnusedMovableContent(MovableContentState movableContentState);

    ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback shouldPauseCallback);

    boolean getHasPendingChanges();

    @InternalComposeApi
    void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set<? extends Object> set);

    void prepareCompose(InterfaceC10559a interfaceC10559a);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> set);

    void recordReadOf(Object obj);

    void recordWriteOf(Object obj);

    @InternalComposeApi
    void verifyConsistent();
}
