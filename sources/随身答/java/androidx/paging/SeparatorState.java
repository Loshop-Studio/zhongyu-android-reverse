package androidx.paging;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(m13412d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u0002H\u00012\u00020\u0002B[\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012L\u0010\u0006\u001aH\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007¢\u0006\u0002\u0010\rJ\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010;J\"\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010>H\u0086@¢\u0006\u0002\u0010?J\"\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000A2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010AH\u0086@¢\u0006\u0002\u0010BJ\"\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000>2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010DH\u0086@¢\u0006\u0002\u0010EJ\"\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000>2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010GH\u0086@¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00030%\"\b\b\u0002\u0010\u0003*\u00020\u00022\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00030%H\u0002J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000A*\b\u0012\u0004\u0012\u00028\u00010AJ\"\u0010L\u001a\u00020\u000f\"\b\b\u0002\u0010\u0003*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00030A2\u0006\u0010\u0004\u001a\u00020\u0005J\"\u0010M\u001a\u00020\u000f\"\b\b\u0002\u0010\u0003*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00030A2\u0006\u0010\u0004\u001a\u00020\u0005R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013RY\u0010\u0006\u001aH\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010%0$¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0011\"\u0004\b7\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006N"}, m13413d2 = {"Landroidx/paging/SeparatorState;", "R", "", ExifInterface.GPS_DIRECTION_TRUE, "terminalSeparatorType", "Landroidx/paging/TerminalSeparatorType;", "generator", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "before", "after", "Lkotlin/coroutines/Continuation;", "(Landroidx/paging/TerminalSeparatorType;Lkotlin/jvm/functions/Function3;)V", "endTerminalSeparatorDeferred", "", "getEndTerminalSeparatorDeferred", "()Z", "setEndTerminalSeparatorDeferred", "(Z)V", "footerAdded", "getFooterAdded", "setFooterAdded", "getGenerator", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "headerAdded", "getHeaderAdded", "setHeaderAdded", "mediatorStates", "Landroidx/paging/LoadStates;", "getMediatorStates", "()Landroidx/paging/LoadStates;", "setMediatorStates", "(Landroidx/paging/LoadStates;)V", "pageStash", "", "Landroidx/paging/TransformablePage;", "getPageStash", "()Ljava/util/List;", "placeholdersAfter", "", "getPlaceholdersAfter", "()I", "setPlaceholdersAfter", "(I)V", "placeholdersBefore", "getPlaceholdersBefore", "setPlaceholdersBefore", "sourceStates", "Landroidx/paging/MutableLoadStateCollection;", "getSourceStates", "()Landroidx/paging/MutableLoadStateCollection;", "startTerminalSeparatorDeferred", "getStartTerminalSeparatorDeferred", "setStartTerminalSeparatorDeferred", "getTerminalSeparatorType", "()Landroidx/paging/TerminalSeparatorType;", "onDrop", "Landroidx/paging/PageEvent$Drop;", NotificationCompat.CATEGORY_EVENT, "onEvent", "Landroidx/paging/PageEvent;", "(Landroidx/paging/PageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onInsert", "Landroidx/paging/PageEvent$Insert;", "(Landroidx/paging/PageEvent$Insert;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLoadStateUpdate", "Landroidx/paging/PageEvent$LoadStateUpdate;", "(Landroidx/paging/PageEvent$LoadStateUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStaticList", "Landroidx/paging/PageEvent$StaticList;", "(Landroidx/paging/PageEvent$StaticList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformablePageToStash", "originalPage", "asRType", "terminatesEnd", "terminatesStart", "paging-common_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSeparators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Separators.kt\nandroidx/paging/SeparatorState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 PageEvent.kt\nandroidx/paging/PageEvent$Insert\n*L\n1#1,608:1\n1#2:609\n1726#3,3:610\n2661#3,7:621\n116#4,8:613\n116#4,8:628\n*S KotlinDebug\n*F\n+ 1 Separators.kt\nandroidx/paging/SeparatorState\n*L\n264#1:610,3\n406#1:621,7\n315#1:613,8\n481#1:628,8\n*E\n"})
/* loaded from: classes3.dex */
final class SeparatorState<R, T extends R> {
    private boolean endTerminalSeparatorDeferred;
    private boolean footerAdded;
    private final Function3<T, T, Continuation<? super R>, Object> generator;
    private boolean headerAdded;
    private LoadStates mediatorStates;
    private final List<TransformablePage<T>> pageStash;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private final MutableLoadStateCollection sourceStates;
    private boolean startTerminalSeparatorDeferred;
    private final TerminalSeparatorType terminalSeparatorType;

    @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TerminalSeparatorType.values().length];
            try {
                iArr[TerminalSeparatorType.FULLY_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TerminalSeparatorType.SOURCE_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.paging.SeparatorState", m13451f = "Separators.kt", m13452i = {0, 1, 2}, m13453l = {214, 216, 217}, m13454m = "onEvent", m13455n = {"this", "this", "this"}, m13456s = {"L$0", "L$0", "L$0"})
    /* renamed from: androidx.paging.SeparatorState$onEvent$1 */
    public static final class C44421 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeparatorState<R, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44421(SeparatorState<R, T> separatorState, Continuation<? super C44421> continuation) {
            super(continuation);
            this.this$0 = separatorState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onEvent(null, this);
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.paging.SeparatorState", m13451f = "Separators.kt", m13452i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9}, m13453l = {307, 370, 382, 388, 400, 409, 431, 440, 453, 464}, m13454m = "onInsert", m13455n = {"this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT, "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "pageAfter", "eventTerminatesEnd", "eventEmpty", "this", NotificationCompat.CATEGORY_EVENT, "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "eventTerminatesEnd", "eventEmpty", "pageIndex", "this", NotificationCompat.CATEGORY_EVENT, "outList", "stashOutList", "firstNonEmptyPage", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "lastStash", "eventTerminatesEnd", "eventEmpty", "this", NotificationCompat.CATEGORY_EVENT, "outList", "stashOutList", "firstNonEmptyPageIndex", "lastNonEmptyPage", "lastNonEmptyPageIndex", "eventTerminatesEnd", "eventEmpty", "this", NotificationCompat.CATEGORY_EVENT, "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "iterator$iv", "page", "pageBefore", "eventTerminatesEnd", "eventEmpty", "this", NotificationCompat.CATEGORY_EVENT, "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "iterator$iv", "page", "pageBefore", "eventTerminatesEnd", "eventEmpty", "this", NotificationCompat.CATEGORY_EVENT, "outList", "stashOutList", "lastNonEmptyPage", "lastNonEmptyPageIndex", "pageAfter", "eventTerminatesEnd", "eventEmpty", "this", NotificationCompat.CATEGORY_EVENT, "outList", "stashOutList", "lastNonEmptyPage", "eventTerminatesEnd", "eventEmpty", "pageIndex", "this", NotificationCompat.CATEGORY_EVENT, "outList", "stashOutList", "pageBefore"}, m13456s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: androidx.paging.SeparatorState$onInsert$1 */
    public static final class C44431 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeparatorState<R, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44431(SeparatorState<R, T> separatorState, Continuation<? super C44431> continuation) {
            super(continuation);
            this.this$0 = separatorState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onInsert(null, this);
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.paging.SeparatorState", m13451f = "Separators.kt", m13452i = {0, 0, 0, 0, 0}, m13453l = {564}, m13454m = "onStaticList", m13455n = {"this", NotificationCompat.CATEGORY_EVENT, "data", "item", "i"}, m13456s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
    /* renamed from: androidx.paging.SeparatorState$onStaticList$1 */
    public static final class C44441 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeparatorState<R, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44441(SeparatorState<R, T> separatorState, Continuation<? super C44441> continuation) {
            super(continuation);
            this.this$0 = separatorState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onStaticList(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SeparatorState(TerminalSeparatorType terminalSeparatorType, Function3<? super T, ? super T, ? super Continuation<? super R>, ? extends Object> generator) {
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(generator, "generator");
        this.terminalSeparatorType = terminalSeparatorType;
        this.generator = generator;
        this.pageStash = new ArrayList();
        this.sourceStates = new MutableLoadStateCollection();
    }

    private final <T> TransformablePage<T> transformablePageToStash(TransformablePage<T> originalPage) {
        int[] originalPageOffsets = originalPage.getOriginalPageOffsets();
        List listListOf = CollectionsKt.listOf(CollectionsKt.first((List) originalPage.getData()), CollectionsKt.last((List) originalPage.getData()));
        int hintOriginalPageOffset = originalPage.getHintOriginalPageOffset();
        List<Integer> hintOriginalIndices = originalPage.getHintOriginalIndices();
        Integer numValueOf = Integer.valueOf(hintOriginalIndices != null ? ((Number) CollectionsKt.first((List) hintOriginalIndices)).intValue() : 0);
        List<Integer> hintOriginalIndices2 = originalPage.getHintOriginalIndices();
        return new TransformablePage<>(originalPageOffsets, listListOf, hintOriginalPageOffset, CollectionsKt.listOf((Object[]) new Integer[]{numValueOf, Integer.valueOf(hintOriginalIndices2 != null ? ((Number) CollectionsKt.last((List) hintOriginalIndices2)).intValue() : CollectionsKt.getLastIndex(originalPage.getData()))}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PageEvent.Insert<R> asRType(PageEvent.Insert<T> insert) {
        Intrinsics.checkNotNullParameter(insert, "<this>");
        return insert;
    }

    public final boolean getEndTerminalSeparatorDeferred() {
        return this.endTerminalSeparatorDeferred;
    }

    public final boolean getFooterAdded() {
        return this.footerAdded;
    }

    public final Function3<T, T, Continuation<? super R>, Object> getGenerator() {
        return this.generator;
    }

    public final boolean getHeaderAdded() {
        return this.headerAdded;
    }

    public final LoadStates getMediatorStates() {
        return this.mediatorStates;
    }

    public final List<TransformablePage<T>> getPageStash() {
        return this.pageStash;
    }

    public final int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    public final int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    public final MutableLoadStateCollection getSourceStates() {
        return this.sourceStates;
    }

    public final boolean getStartTerminalSeparatorDeferred() {
        return this.startTerminalSeparatorDeferred;
    }

    public final TerminalSeparatorType getTerminalSeparatorType() {
        return this.terminalSeparatorType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PageEvent.Drop<R> onDrop(PageEvent.Drop<T> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.sourceStates.set(event.getLoadType(), LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
        LoadType loadType = event.getLoadType();
        LoadType loadType2 = LoadType.PREPEND;
        if (loadType == loadType2) {
            this.placeholdersBefore = event.getPlaceholdersRemaining();
            this.headerAdded = false;
        } else if (event.getLoadType() == LoadType.APPEND) {
            this.placeholdersAfter = event.getPlaceholdersRemaining();
            this.footerAdded = false;
        }
        if (this.pageStash.isEmpty()) {
            if (event.getLoadType() == loadType2) {
                this.startTerminalSeparatorDeferred = false;
            } else {
                this.endTerminalSeparatorDeferred = false;
            }
        }
        final IntRange intRange = new IntRange(event.getMinPageOffset(), event.getMaxPageOffset());
        CollectionsKt.removeAll((List) this.pageStash, (Function1) new Function1<TransformablePage<T>, Boolean>() { // from class: androidx.paging.SeparatorState.onDrop.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TransformablePage<T> stash) {
                Intrinsics.checkNotNullParameter(stash, "stash");
                int[] originalPageOffsets = stash.getOriginalPageOffsets();
                IntRange intRange2 = intRange;
                int length = originalPageOffsets.length;
                boolean z9 = false;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    if (intRange2.contains(originalPageOffsets[i9])) {
                        z9 = true;
                        break;
                    }
                    i9++;
                }
                return Boolean.valueOf(z9);
            }
        });
        return event;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onEvent(androidx.paging.PageEvent<T> r7, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> r8) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onEvent(androidx.paging.PageEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x06c9, code lost:
    
        if (r2 == r4) goto L235;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:100:0x031e, B:61:0x028e], limit reached: 247 */
    /* JADX WARN: Path cross not found for [B:32:0x0218, B:31:0x0216], limit reached: 247 */
    /* JADX WARN: Path cross not found for [B:61:0x028e, B:100:0x031e], limit reached: 247 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02dc  */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0469 -> B:139:0x0470). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x0661 -> B:17:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x0741 -> B:218:0x0742). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onInsert(androidx.paging.PageEvent.Insert<T> r29, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent.Insert<R>> r30) {
        /*
            Method dump skipped, instructions count: 2092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onInsert(androidx.paging.PageEvent$Insert, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object onLoadStateUpdate(PageEvent.LoadStateUpdate<T> loadStateUpdate, Continuation<? super PageEvent<R>> continuation) {
        LoadStates loadStates = this.mediatorStates;
        if (Intrinsics.areEqual(this.sourceStates.snapshot(), loadStateUpdate.getSource()) && Intrinsics.areEqual(loadStates, loadStateUpdate.getMediator())) {
            Intrinsics.checkNotNull(loadStateUpdate, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
            return loadStateUpdate;
        }
        this.sourceStates.set(loadStateUpdate.getSource());
        this.mediatorStates = loadStateUpdate.getMediator();
        if (loadStateUpdate.getMediator() != null && loadStateUpdate.getMediator().getPrepend().getEndOfPaginationReached()) {
            if (!Intrinsics.areEqual(loadStates != null ? loadStates.getPrepend() : null, loadStateUpdate.getMediator().getPrepend())) {
                return onInsert(PageEvent.Insert.INSTANCE.Prepend(CollectionsKt.emptyList(), this.placeholdersBefore, loadStateUpdate.getSource(), loadStateUpdate.getMediator()), continuation);
            }
        }
        if (loadStateUpdate.getMediator() != null && loadStateUpdate.getMediator().getAppend().getEndOfPaginationReached()) {
            if (!Intrinsics.areEqual(loadStates != null ? loadStates.getAppend() : null, loadStateUpdate.getMediator().getAppend())) {
                return onInsert(PageEvent.Insert.INSTANCE.Append(CollectionsKt.emptyList(), this.placeholdersAfter, loadStateUpdate.getSource(), loadStateUpdate.getMediator()), continuation);
            }
        }
        Intrinsics.checkNotNull(loadStateUpdate, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
        return loadStateUpdate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0085 -> B:21:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onStaticList(androidx.paging.PageEvent.StaticList<T> r11, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent<R>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.paging.SeparatorState.C44441
            if (r0 == 0) goto L13
            r0 = r12
            androidx.paging.SeparatorState$onStaticList$1 r0 = (androidx.paging.SeparatorState.C44441) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.SeparatorState$onStaticList$1 r0 = new androidx.paging.SeparatorState$onStaticList$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            int r11 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$3
            java.lang.Object r5 = r0.L$2
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.L$1
            androidx.paging.PageEvent$StaticList r6 = (androidx.paging.PageEvent.StaticList) r6
            java.lang.Object r7 = r0.L$0
            androidx.paging.SeparatorState r7 = (androidx.paging.SeparatorState) r7
            kotlin.ResultKt.throwOnFailure(r12)
            r9 = r4
            r4 = r11
            r11 = r6
            r6 = r9
            goto L88
        L3f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L47:
            kotlin.ResultKt.throwOnFailure(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.List r2 = r11.getData()
            int r2 = r2.size()
            if (r2 < 0) goto L9a
            r4 = 0
            r7 = r10
            r5 = r12
        L5c:
            java.util.List r12 = r11.getData()
            int r6 = r4 + (-1)
            java.lang.Object r12 = kotlin.collections.CollectionsKt.getOrNull(r12, r6)
            java.util.List r6 = r11.getData()
            java.lang.Object r6 = kotlin.collections.CollectionsKt.getOrNull(r6, r4)
            kotlin.jvm.functions.Function3<T extends R, T extends R, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r7.generator
            r0.L$0 = r7
            r0.L$1 = r11
            r0.L$2 = r5
            r0.L$3 = r6
            r0.I$0 = r4
            r0.I$1 = r2
            r0.label = r3
            java.lang.Object r12 = r8.invoke(r12, r6, r0)
            if (r12 != r1) goto L85
            return r1
        L85:
            r9 = r4
            r4 = r2
            r2 = r9
        L88:
            if (r12 == 0) goto L8d
            r5.add(r12)
        L8d:
            if (r6 == 0) goto L92
            r5.add(r6)
        L92:
            if (r2 == r4) goto L99
            int r12 = r2 + 1
            r2 = r4
            r4 = r12
            goto L5c
        L99:
            r12 = r5
        L9a:
            androidx.paging.PageEvent$StaticList r0 = new androidx.paging.PageEvent$StaticList
            androidx.paging.LoadStates r1 = r11.getSourceLoadStates()
            androidx.paging.LoadStates r11 = r11.getMediatorLoadStates()
            r0.<init>(r12, r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onStaticList(androidx.paging.PageEvent$StaticList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setEndTerminalSeparatorDeferred(boolean z9) {
        this.endTerminalSeparatorDeferred = z9;
    }

    public final void setFooterAdded(boolean z9) {
        this.footerAdded = z9;
    }

    public final void setHeaderAdded(boolean z9) {
        this.headerAdded = z9;
    }

    public final void setMediatorStates(LoadStates loadStates) {
        this.mediatorStates = loadStates;
    }

    public final void setPlaceholdersAfter(int i9) {
        this.placeholdersAfter = i9;
    }

    public final void setPlaceholdersBefore(int i9) {
        this.placeholdersBefore = i9;
    }

    public final void setStartTerminalSeparatorDeferred(boolean z9) {
        this.startTerminalSeparatorDeferred = z9;
    }

    public final <T> boolean terminatesEnd(PageEvent.Insert<T> insert, TerminalSeparatorType terminalSeparatorType) {
        LoadState append;
        Intrinsics.checkNotNullParameter(insert, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        if (insert.getLoadType() == LoadType.PREPEND) {
            return this.endTerminalSeparatorDeferred;
        }
        int i9 = WhenMappings.$EnumSwitchMapping$0[terminalSeparatorType.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                return insert.getSourceLoadStates().getAppend().getEndOfPaginationReached();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!insert.getSourceLoadStates().getAppend().getEndOfPaginationReached()) {
            return false;
        }
        LoadStates mediatorLoadStates = insert.getMediatorLoadStates();
        return mediatorLoadStates == null || (append = mediatorLoadStates.getAppend()) == null || append.getEndOfPaginationReached();
    }

    public final <T> boolean terminatesStart(PageEvent.Insert<T> insert, TerminalSeparatorType terminalSeparatorType) {
        LoadState prepend;
        Intrinsics.checkNotNullParameter(insert, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        if (insert.getLoadType() == LoadType.APPEND) {
            return this.startTerminalSeparatorDeferred;
        }
        int i9 = WhenMappings.$EnumSwitchMapping$0[terminalSeparatorType.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                return insert.getSourceLoadStates().getPrepend().getEndOfPaginationReached();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!insert.getSourceLoadStates().getPrepend().getEndOfPaginationReached()) {
            return false;
        }
        LoadStates mediatorLoadStates = insert.getMediatorLoadStates();
        return mediatorLoadStates == null || (prepend = mediatorLoadStates.getPrepend()) == null || prepend.getEndOfPaginationReached();
    }
}
