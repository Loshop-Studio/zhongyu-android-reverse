package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m7879d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0015J\u0016\u0010\u0016\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002J\u0016\u0010\u001a\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m7880d2 = {"Landroidx/paging/FlattenedPageEventStorage;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "mediatorStates", "Landroidx/paging/LoadStates;", "pages", "Lkotlin/collections/ArrayDeque;", "Landroidx/paging/TransformablePage;", "placeholdersAfter", "", "placeholdersBefore", "receivedFirstEvent", "", "sourceStates", "Landroidx/paging/MutableLoadStateCollection;", "add", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/paging/PageEvent;", "getAsEvents", "", "handleInsert", "Landroidx/paging/PageEvent$Insert;", "handleLoadStateUpdate", "Landroidx/paging/PageEvent$LoadStateUpdate;", "handlePageDrop", "Landroidx/paging/PageEvent$Drop;", "handleStaticList", "Landroidx/paging/PageEvent$StaticList;", "paging-common_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
@VisibleForTesting
@SourceDebugExtension({"SMAP\nCachedPageEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageEventStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n1#2:282\n1855#3,2:283\n*S KotlinDebug\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageEventStorage\n*L\n222#1:283,2\n*E\n"})
/* loaded from: classes3.dex */
public final class FlattenedPageEventStorage<T> {
    private LoadStates mediatorStates;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private boolean receivedFirstEvent;
    private final ArrayDeque<TransformablePage<T>> pages = new ArrayDeque<>();
    private final MutableLoadStateCollection sourceStates = new MutableLoadStateCollection();

    @Metadata(m7881k = 3, m7882mv = {1, 8, 0}, m7884xi = 48)
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

    private final void handleInsert(PageEvent.Insert<T> event) {
        this.sourceStates.set(event.getSourceLoadStates());
        this.mediatorStates = event.getMediatorLoadStates();
        int i6 = WhenMappings.$EnumSwitchMapping$0[event.getLoadType().ordinal()];
        if (i6 == 1) {
            this.placeholdersBefore = event.getPlaceholdersBefore();
            Iterator<Integer> it = RangesKt.downTo(event.getPages().size() - 1, 0).iterator();
            while (it.hasNext()) {
                this.pages.addFirst(event.getPages().get(((IntIterator) it).nextInt()));
            }
            return;
        }
        if (i6 == 2) {
            this.placeholdersAfter = event.getPlaceholdersAfter();
            this.pages.addAll(event.getPages());
        } else {
            if (i6 != 3) {
                return;
            }
            this.pages.clear();
            this.placeholdersAfter = event.getPlaceholdersAfter();
            this.placeholdersBefore = event.getPlaceholdersBefore();
            this.pages.addAll(event.getPages());
        }
    }

    private final void handleLoadStateUpdate(PageEvent.LoadStateUpdate<T> event) {
        this.sourceStates.set(event.getSource());
        this.mediatorStates = event.getMediator();
    }

    private final void handlePageDrop(PageEvent.Drop<T> event) {
        this.sourceStates.set(event.getLoadType(), LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
        int i6 = WhenMappings.$EnumSwitchMapping$0[event.getLoadType().ordinal()];
        int i7 = 0;
        if (i6 == 1) {
            this.placeholdersBefore = event.getPlaceholdersRemaining();
            int pageCount = event.getPageCount();
            while (i7 < pageCount) {
                this.pages.removeFirst();
                i7++;
            }
            return;
        }
        if (i6 != 2) {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.placeholdersAfter = event.getPlaceholdersRemaining();
        int pageCount2 = event.getPageCount();
        while (i7 < pageCount2) {
            this.pages.removeLast();
            i7++;
        }
    }

    private final void handleStaticList(PageEvent.StaticList<T> event) {
        if (event.getSourceLoadStates() != null) {
            this.sourceStates.set(event.getSourceLoadStates());
        }
        if (event.getMediatorLoadStates() != null) {
            this.mediatorStates = event.getMediatorLoadStates();
        }
        this.pages.clear();
        this.placeholdersAfter = 0;
        this.placeholdersBefore = 0;
        this.pages.add(new TransformablePage<>(0, event.getData()));
    }

    public final void add(PageEvent<T> event) {
        Intrinsics.checkNotNullParameter(event, "event");
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
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        LoadStates loadStatesSnapshot = this.sourceStates.snapshot();
        if (this.pages.isEmpty()) {
            arrayList.add(new PageEvent.LoadStateUpdate(loadStatesSnapshot, this.mediatorStates));
            return arrayList;
        }
        arrayList.add(PageEvent.Insert.INSTANCE.Refresh(CollectionsKt.toList(this.pages), this.placeholdersBefore, this.placeholdersAfter, loadStatesSnapshot, this.mediatorStates));
        return arrayList;
    }
}
