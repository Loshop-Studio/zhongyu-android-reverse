package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8321f;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
final class SeparatorState<R, T extends R> {
    private boolean endTerminalSeparatorDeferred;
    private boolean footerAdded;
    private final InterfaceC10575q generator;
    private boolean headerAdded;
    private LoadStates mediatorStates;
    private final List<TransformablePage<T>> pageStash;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private final MutableLoadStateCollection sourceStates;
    private boolean startTerminalSeparatorDeferred;
    private final TerminalSeparatorType terminalSeparatorType;

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

    @InterfaceC9539d(m17800c = "androidx.paging.SeparatorState", m17801f = "Separators.kt", m17802l = {TbsListener.ErrorCode.COPY_TMPDIR_ERROR, TbsListener.ErrorCode.INCR_UPDATE_ERROR, TbsListener.ErrorCode.INCR_UPDATE_FAIL}, m17803m = "onEvent")
    /* renamed from: androidx.paging.SeparatorState$onEvent$1 */
    public static final class C43811 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeparatorState<R, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43811(SeparatorState<R, T> separatorState, InterfaceC9324c<? super C43811> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = separatorState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onEvent(null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.SeparatorState", m17801f = "Separators.kt", m17802l = {307, 370, 382, 388, TbsListener.ErrorCode.INFO_CODE_BASE, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, 431, 440, 453, 464}, m17803m = "onInsert")
    /* renamed from: androidx.paging.SeparatorState$onInsert$1 */
    public static final class C43821 extends ContinuationImpl {
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
        public C43821(SeparatorState<R, T> separatorState, InterfaceC9324c<? super C43821> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = separatorState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onInsert(null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.SeparatorState", m17801f = "Separators.kt", m17802l = {564}, m17803m = "onStaticList")
    /* renamed from: androidx.paging.SeparatorState$onStaticList$1 */
    public static final class C43831 extends ContinuationImpl {
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
        public C43831(SeparatorState<R, T> separatorState, InterfaceC9324c<? super C43831> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = separatorState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onStaticList(null, this);
        }
    }

    public SeparatorState(TerminalSeparatorType terminalSeparatorType, InterfaceC10575q generator) {
        AbstractC9133u.m16133g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9133u.m16133g(generator, "generator");
        this.terminalSeparatorType = terminalSeparatorType;
        this.generator = generator;
        this.pageStash = new ArrayList();
        this.sourceStates = new MutableLoadStateCollection();
    }

    private final <T> TransformablePage<T> transformablePageToStash(TransformablePage<T> transformablePage) {
        int[] originalPageOffsets = transformablePage.getOriginalPageOffsets();
        List listM14774q = AbstractC8809v.m14774q(AbstractC8778f0.m14566l0(transformablePage.getData()), AbstractC8778f0.m14578x0(transformablePage.getData()));
        int hintOriginalPageOffset = transformablePage.getHintOriginalPageOffset();
        List<Integer> hintOriginalIndices = transformablePage.getHintOriginalIndices();
        Integer numValueOf = Integer.valueOf(hintOriginalIndices != null ? ((Number) AbstractC8778f0.m14566l0(hintOriginalIndices)).intValue() : 0);
        List<Integer> hintOriginalIndices2 = transformablePage.getHintOriginalIndices();
        return new TransformablePage<>(originalPageOffsets, listM14774q, hintOriginalPageOffset, AbstractC8809v.m14774q(numValueOf, Integer.valueOf(hintOriginalIndices2 != null ? ((Number) AbstractC8778f0.m14578x0(hintOriginalIndices2)).intValue() : AbstractC8809v.m14773p(transformablePage.getData()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PageEvent.Insert<R> asRType(PageEvent.Insert<T> insert) {
        AbstractC9133u.m16133g(insert, "<this>");
        return insert;
    }

    public final boolean getEndTerminalSeparatorDeferred() {
        return this.endTerminalSeparatorDeferred;
    }

    public final boolean getFooterAdded() {
        return this.footerAdded;
    }

    public final InterfaceC10575q getGenerator() {
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
        AbstractC9133u.m16133g(event, "event");
        this.sourceStates.set(event.getLoadType(), LoadState.NotLoading.Companion.getIncomplete$paging_common_release());
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
        final C8321f c8321f = new C8321f(event.getMinPageOffset(), event.getMaxPageOffset());
        AbstractC8768a0.m14490L(this.pageStash, new InterfaceC10570l() { // from class: androidx.paging.SeparatorState.onDrop.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(TransformablePage<T> stash) {
                AbstractC9133u.m16133g(stash, "stash");
                int[] originalPageOffsets = stash.getOriginalPageOffsets();
                C8321f c8321f2 = c8321f;
                int length = originalPageOffsets.length;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (c8321f2.m13502g(originalPageOffsets[i10])) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                return Boolean.valueOf(z10);
            }
        });
        return event;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onEvent(androidx.paging.PageEvent<T> r7, p179m7.InterfaceC9324c<? super androidx.paging.PageEvent<R>> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onEvent(androidx.paging.PageEvent, m7.c):java.lang.Object");
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
    public final java.lang.Object onInsert(androidx.paging.PageEvent.Insert<T> r29, p179m7.InterfaceC9324c<? super androidx.paging.PageEvent.Insert<R>> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onInsert(androidx.paging.PageEvent$Insert, m7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object onLoadStateUpdate(PageEvent.LoadStateUpdate<T> loadStateUpdate, InterfaceC9324c<? super PageEvent<R>> interfaceC9324c) {
        LoadStates loadStates = this.mediatorStates;
        if (AbstractC9133u.m16128b(this.sourceStates.snapshot(), loadStateUpdate.getSource()) && AbstractC9133u.m16128b(loadStates, loadStateUpdate.getMediator())) {
            AbstractC9133u.m16131e(loadStateUpdate, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
            return loadStateUpdate;
        }
        this.sourceStates.set(loadStateUpdate.getSource());
        this.mediatorStates = loadStateUpdate.getMediator();
        if (loadStateUpdate.getMediator() != null && loadStateUpdate.getMediator().getPrepend().getEndOfPaginationReached()) {
            if (!AbstractC9133u.m16128b(loadStates != null ? loadStates.getPrepend() : null, loadStateUpdate.getMediator().getPrepend())) {
                return onInsert(PageEvent.Insert.Companion.Prepend(AbstractC8809v.m14771n(), this.placeholdersBefore, loadStateUpdate.getSource(), loadStateUpdate.getMediator()), interfaceC9324c);
            }
        }
        if (loadStateUpdate.getMediator() != null && loadStateUpdate.getMediator().getAppend().getEndOfPaginationReached()) {
            if (!AbstractC9133u.m16128b(loadStates != null ? loadStates.getAppend() : null, loadStateUpdate.getMediator().getAppend())) {
                return onInsert(PageEvent.Insert.Companion.Append(AbstractC8809v.m14771n(), this.placeholdersAfter, loadStateUpdate.getSource(), loadStateUpdate.getMediator()), interfaceC9324c);
            }
        }
        AbstractC9133u.m16131e(loadStateUpdate, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
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
    public final java.lang.Object onStaticList(androidx.paging.PageEvent.StaticList<T> r11, p179m7.InterfaceC9324c<? super androidx.paging.PageEvent<R>> r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.paging.SeparatorState.C43831
            if (r0 == 0) goto L13
            r0 = r12
            androidx.paging.SeparatorState$onStaticList$1 r0 = (androidx.paging.SeparatorState.C43831) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
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
            kotlin.AbstractC9079b.m15926b(r12)
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
            kotlin.AbstractC9079b.m15926b(r12)
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
            java.lang.Object r12 = p134i7.AbstractC8778f0.m14569o0(r12, r6)
            java.util.List r6 = r11.getData()
            java.lang.Object r6 = p134i7.AbstractC8778f0.m14569o0(r6, r4)
            x7.q r8 = r7.generator
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onStaticList(androidx.paging.PageEvent$StaticList, m7.c):java.lang.Object");
    }

    public final void setEndTerminalSeparatorDeferred(boolean z10) {
        this.endTerminalSeparatorDeferred = z10;
    }

    public final void setFooterAdded(boolean z10) {
        this.footerAdded = z10;
    }

    public final void setHeaderAdded(boolean z10) {
        this.headerAdded = z10;
    }

    public final void setMediatorStates(LoadStates loadStates) {
        this.mediatorStates = loadStates;
    }

    public final void setPlaceholdersAfter(int i10) {
        this.placeholdersAfter = i10;
    }

    public final void setPlaceholdersBefore(int i10) {
        this.placeholdersBefore = i10;
    }

    public final void setStartTerminalSeparatorDeferred(boolean z10) {
        this.startTerminalSeparatorDeferred = z10;
    }

    public final <T> boolean terminatesEnd(PageEvent.Insert<T> insert, TerminalSeparatorType terminalSeparatorType) {
        LoadState append;
        AbstractC9133u.m16133g(insert, "<this>");
        AbstractC9133u.m16133g(terminalSeparatorType, "terminalSeparatorType");
        if (insert.getLoadType() == LoadType.PREPEND) {
            return this.endTerminalSeparatorDeferred;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[terminalSeparatorType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
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
        AbstractC9133u.m16133g(insert, "<this>");
        AbstractC9133u.m16133g(terminalSeparatorType, "terminalSeparatorType");
        if (insert.getLoadType() == LoadType.APPEND) {
            return this.startTerminalSeparatorDeferred;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[terminalSeparatorType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
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
