package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8792m0;
import p134i7.AbstractC8809v;
import p134i7.C8791m;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class FlattenedPageEventStorage<T> {
    private LoadStates mediatorStates;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private boolean receivedFirstEvent;
    private final C8791m pages = new C8791m();
    private final MutableLoadStateCollection sourceStates = new MutableLoadStateCollection();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void handleInsert(PageEvent.Insert<T> insert) {
        this.sourceStates.set(insert.getSourceLoadStates());
        this.mediatorStates = insert.getMediatorLoadStates();
        int i10 = WhenMappings.$EnumSwitchMapping$0[insert.getLoadType().ordinal()];
        if (i10 == 1) {
            this.placeholdersBefore = insert.getPlaceholdersBefore();
            Iterator<T> it = AbstractC8323h.m13522q(insert.getPages().size() - 1, 0).iterator();
            while (it.hasNext()) {
                this.pages.addFirst(insert.getPages().get(((AbstractC8792m0) it).nextInt()));
            }
            return;
        }
        if (i10 == 2) {
            this.placeholdersAfter = insert.getPlaceholdersAfter();
            this.pages.addAll(insert.getPages());
        } else {
            if (i10 != 3) {
                return;
            }
            this.pages.clear();
            this.placeholdersAfter = insert.getPlaceholdersAfter();
            this.placeholdersBefore = insert.getPlaceholdersBefore();
            this.pages.addAll(insert.getPages());
        }
    }

    private final void handleLoadStateUpdate(PageEvent.LoadStateUpdate<T> loadStateUpdate) {
        this.sourceStates.set(loadStateUpdate.getSource());
        this.mediatorStates = loadStateUpdate.getMediator();
    }

    private final void handlePageDrop(PageEvent.Drop<T> drop) {
        this.sourceStates.set(drop.getLoadType(), LoadState.NotLoading.Companion.getIncomplete$paging_common_release());
        int i10 = WhenMappings.$EnumSwitchMapping$0[drop.getLoadType().ordinal()];
        int i11 = 0;
        if (i10 == 1) {
            this.placeholdersBefore = drop.getPlaceholdersRemaining();
            int pageCount = drop.getPageCount();
            while (i11 < pageCount) {
                this.pages.removeFirst();
                i11++;
            }
            return;
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.placeholdersAfter = drop.getPlaceholdersRemaining();
        int pageCount2 = drop.getPageCount();
        while (i11 < pageCount2) {
            this.pages.removeLast();
            i11++;
        }
    }

    private final void handleStaticList(PageEvent.StaticList<T> staticList) {
        if (staticList.getSourceLoadStates() != null) {
            this.sourceStates.set(staticList.getSourceLoadStates());
        }
        if (staticList.getMediatorLoadStates() != null) {
            this.mediatorStates = staticList.getMediatorLoadStates();
        }
        this.pages.clear();
        this.placeholdersAfter = 0;
        this.placeholdersBefore = 0;
        this.pages.add(new TransformablePage(0, staticList.getData()));
    }

    public final void add(PageEvent<T> event) {
        AbstractC9133u.m16133g(event, "event");
        this.receivedFirstEvent = true;
        if (event instanceof PageEvent.Insert) {
            handleInsert((PageEvent.Insert) event);
            return;
        }
        if (event instanceof PageEvent.Drop) {
            handlePageDrop((PageEvent.Drop) event);
        } else if (event instanceof PageEvent.LoadStateUpdate) {
            handleLoadStateUpdate((PageEvent.LoadStateUpdate) event);
        } else if (event instanceof PageEvent.StaticList) {
            handleStaticList((PageEvent.StaticList) event);
        }
    }

    public final List<PageEvent<T>> getAsEvents() {
        if (!this.receivedFirstEvent) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList();
        LoadStates loadStatesSnapshot = this.sourceStates.snapshot();
        if (this.pages.isEmpty()) {
            arrayList.add(new PageEvent.LoadStateUpdate(loadStatesSnapshot, this.mediatorStates));
            return arrayList;
        }
        arrayList.add(PageEvent.Insert.Companion.Refresh(AbstractC8778f0.m14544U0(this.pages), this.placeholdersBefore, this.placeholdersAfter, loadStatesSnapshot, this.mediatorStates));
        return arrayList;
    }
}
