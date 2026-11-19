package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.p014ui.layout.LayoutCoordinates;

/* loaded from: classes.dex */
public interface SelectionRegistrar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long InvalidSelectableId = 0;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long InvalidSelectableId = 0;

        private Companion() {
        }
    }

    LongObjectMap<Selection> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j10);

    void notifySelectableChange(long j10);

    /* renamed from: notifySelectionUpdate-njBpvok, reason: not valid java name */
    boolean mo28278notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j10, long j11, boolean z10, SelectionAdjustment selectionAdjustment, boolean z11);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long j10, boolean z10);

    /* renamed from: notifySelectionUpdateStart-ubNVwUQ, reason: not valid java name */
    void mo28279notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long j10, SelectionAdjustment selectionAdjustment, boolean z10);

    Selectable subscribe(Selectable selectable);

    void unsubscribe(Selectable selectable);
}
