package androidx.paging;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p265nd.C10405j;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final class SeparatorState<R, T extends R> {
    private boolean endTerminalSeparatorDeferred;
    private boolean footerAdded;
    private final InterfaceC9545q generator;
    private boolean headerAdded;
    private LoadStates mediatorStates;
    private final List<TransformablePage<T>> pageStash;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private final MutableLoadStateCollection sourceStates;
    private boolean startTerminalSeparatorDeferred;
    private final TerminalSeparatorType terminalSeparatorType;

    public static final /* synthetic */ class WhenMappings {
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

    @InterfaceC11829d(m26210c = "androidx.paging.SeparatorState", m26211f = "Separators.kt", m26212l = {217, 219, 220}, m26213m = "onEvent", m26214v = 1)
    /* renamed from: androidx.paging.SeparatorState$onEvent$1 */
    public static final class C42841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeparatorState<R, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42841(SeparatorState<R, T> separatorState, InterfaceC11588c<? super C42841> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = separatorState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onEvent(null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.SeparatorState", m26211f = "Separators.kt", m26212l = {310, 373, 385, 391, TypedValues.CycleType.TYPE_ALPHA, 412, 437, 446, 460, 471}, m26213m = "onInsert", m26214v = 1)
    /* renamed from: androidx.paging.SeparatorState$onInsert$1 */
    public static final class C42851 extends ContinuationImpl {
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
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeparatorState<R, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42851(SeparatorState<R, T> separatorState, InterfaceC11588c<? super C42851> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = separatorState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onInsert(null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.SeparatorState", m26211f = "Separators.kt", m26212l = {575}, m26213m = "onStaticList", m26214v = 1)
    /* renamed from: androidx.paging.SeparatorState$onStaticList$1 */
    public static final class C42861 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeparatorState<R, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42861(SeparatorState<R, T> separatorState, InterfaceC11588c<? super C42861> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = separatorState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onStaticList(null, this);
        }
    }

    public SeparatorState(TerminalSeparatorType terminalSeparatorType, InterfaceC9545q generator) {
        AbstractC9979u.m20294g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9979u.m20294g(generator, "generator");
        this.terminalSeparatorType = terminalSeparatorType;
        this.generator = generator;
        this.pageStash = new ArrayList();
        this.sourceStates = new MutableLoadStateCollection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onDrop$lambda$0(C10405j c10405j, TransformablePage stash) {
        AbstractC9979u.m20294g(stash, "stash");
        for (int i10 : stash.getOriginalPageOffsets()) {
            if (c10405j.m21739g(i10)) {
                return true;
            }
        }
        return false;
    }

    private final <T> TransformablePage<T> transformablePageToStash(TransformablePage<T> transformablePage) {
        int[] originalPageOffsets = transformablePage.getOriginalPageOffsets();
        List listM24139q = AbstractC10978w.m24139q(AbstractC10947g0.m23944m0(transformablePage.getData()), AbstractC10947g0.m23956y0(transformablePage.getData()));
        int hintOriginalPageOffset = transformablePage.getHintOriginalPageOffset();
        List<Integer> hintOriginalIndices = transformablePage.getHintOriginalIndices();
        Integer numValueOf = Integer.valueOf(hintOriginalIndices != null ? ((Number) AbstractC10947g0.m23944m0(hintOriginalIndices)).intValue() : 0);
        List<Integer> hintOriginalIndices2 = transformablePage.getHintOriginalIndices();
        return new TransformablePage<>(originalPageOffsets, listM24139q, hintOriginalPageOffset, AbstractC10978w.m24139q(numValueOf, Integer.valueOf(hintOriginalIndices2 != null ? ((Number) AbstractC10947g0.m23956y0(hintOriginalIndices2)).intValue() : AbstractC10978w.m24138p(transformablePage.getData()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PageEvent.Insert<R> asRType(PageEvent.Insert<T> insert) {
        AbstractC9979u.m20294g(insert, "<this>");
        return insert;
    }

    public final boolean getEndTerminalSeparatorDeferred() {
        return this.endTerminalSeparatorDeferred;
    }

    public final boolean getFooterAdded() {
        return this.footerAdded;
    }

    public final InterfaceC9545q getGenerator() {
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
        AbstractC9979u.m20294g(event, "event");
        this.sourceStates.set(event.getLoadType(), LoadState.NotLoading.Companion.getIncomplete$paging_common());
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
        final C10405j c10405j = new C10405j(event.getMinPageOffset(), event.getMaxPageOffset());
        AbstractC10937b0.m23867L(this.pageStash, new InterfaceC9540l() { // from class: androidx.paging.o1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SeparatorState.onDrop$lambda$0(c10405j, (TransformablePage) obj));
            }
        });
        return event;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onEvent(androidx.paging.PageEvent<T> r7, vc.InterfaceC11588c<? super androidx.paging.PageEvent<R>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.paging.SeparatorState.C42841
            if (r0 == 0) goto L13
            r0 = r8
            androidx.paging.SeparatorState$onEvent$1 r0 = (androidx.paging.SeparatorState.C42841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.SeparatorState$onEvent$1 r0 = new androidx.paging.SeparatorState$onEvent$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.AbstractC9924b.m20071b(r8)
            goto L80
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.AbstractC9924b.m20071b(r8)
            goto L6e
        L3b:
            kotlin.AbstractC9924b.m20071b(r8)
            goto L51
        L3f:
            kotlin.AbstractC9924b.m20071b(r8)
            boolean r8 = r7 instanceof androidx.paging.PageEvent.Insert
            if (r8 == 0) goto L54
            androidx.paging.PageEvent$Insert r7 = (androidx.paging.PageEvent.Insert) r7
            r0.label = r5
            java.lang.Object r8 = r6.onInsert(r7, r0)
            if (r8 != r1) goto L51
            goto L7f
        L51:
            androidx.paging.PageEvent r8 = (androidx.paging.PageEvent) r8
            goto L82
        L54:
            boolean r8 = r7 instanceof androidx.paging.PageEvent.Drop
            if (r8 == 0) goto L5f
            androidx.paging.PageEvent$Drop r7 = (androidx.paging.PageEvent.Drop) r7
            androidx.paging.PageEvent$Drop r8 = r6.onDrop(r7)
            goto L82
        L5f:
            boolean r8 = r7 instanceof androidx.paging.PageEvent.LoadStateUpdate
            if (r8 == 0) goto L71
            androidx.paging.PageEvent$LoadStateUpdate r7 = (androidx.paging.PageEvent.LoadStateUpdate) r7
            r0.label = r4
            java.lang.Object r8 = r6.onLoadStateUpdate(r7, r0)
            if (r8 != r1) goto L6e
            goto L7f
        L6e:
            androidx.paging.PageEvent r8 = (androidx.paging.PageEvent) r8
            goto L82
        L71:
            boolean r8 = r7 instanceof androidx.paging.PageEvent.StaticList
            if (r8 == 0) goto Lad
            androidx.paging.PageEvent$StaticList r7 = (androidx.paging.PageEvent.StaticList) r7
            r0.label = r3
            java.lang.Object r8 = r6.onStaticList(r7, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            androidx.paging.PageEvent r8 = (androidx.paging.PageEvent) r8
        L82:
            boolean r7 = r6.endTerminalSeparatorDeferred
            if (r7 == 0) goto L97
            java.util.List<androidx.paging.TransformablePage<T extends R>> r7 = r6.pageStash
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L8f
            goto L97
        L8f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "deferred endTerm, page stash should be empty"
            r7.<init>(r8)
            throw r7
        L97:
            boolean r7 = r6.startTerminalSeparatorDeferred
            if (r7 == 0) goto Lac
            java.util.List<androidx.paging.TransformablePage<T extends R>> r7 = r6.pageStash
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto La4
            goto Lac
        La4:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "deferred startTerm, page stash should be empty"
            r7.<init>(r8)
            throw r7
        Lac:
            return r8
        Lad:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onEvent(androidx.paging.PageEvent, vc.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x0686, code lost:
    
        if (r2 == r4) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0293, code lost:
    
        if (r2 == r4) goto L236;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:31:0x01e7, B:30:0x01e5], limit reached: 246 */
    /* JADX WARN: Path cross not found for [B:60:0x025d, B:98:0x02ea], limit reached: 246 */
    /* JADX WARN: Path cross not found for [B:98:0x02ea, B:60:0x025d], limit reached: 246 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x042a -> B:137:0x0430). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x061c -> B:193:0x061d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:217:0x06fe -> B:218:0x06ff). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onInsert(androidx.paging.PageEvent.Insert<T> r21, vc.InterfaceC11588c<? super androidx.paging.PageEvent.Insert<R>> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onInsert(androidx.paging.PageEvent$Insert, vc.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object onLoadStateUpdate(PageEvent.LoadStateUpdate<T> loadStateUpdate, InterfaceC11588c<? super PageEvent<R>> interfaceC11588c) {
        LoadStates loadStates = this.mediatorStates;
        if (AbstractC9979u.m20289b(this.sourceStates.snapshot(), loadStateUpdate.getSource()) && AbstractC9979u.m20289b(loadStates, loadStateUpdate.getMediator())) {
            AbstractC9979u.m20292e(loadStateUpdate, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
            return loadStateUpdate;
        }
        this.sourceStates.set(loadStateUpdate.getSource());
        this.mediatorStates = loadStateUpdate.getMediator();
        if (loadStateUpdate.getMediator() != null && loadStateUpdate.getMediator().getPrepend().getEndOfPaginationReached()) {
            if (!AbstractC9979u.m20289b(loadStates != null ? loadStates.getPrepend() : null, loadStateUpdate.getMediator().getPrepend())) {
                return onInsert(PageEvent.Insert.Companion.Prepend(AbstractC10978w.m24136n(), this.placeholdersBefore, loadStateUpdate.getSource(), loadStateUpdate.getMediator()), interfaceC11588c);
            }
        }
        if (loadStateUpdate.getMediator() != null && loadStateUpdate.getMediator().getAppend().getEndOfPaginationReached()) {
            if (!AbstractC9979u.m20289b(loadStates != null ? loadStates.getAppend() : null, loadStateUpdate.getMediator().getAppend())) {
                return onInsert(PageEvent.Insert.Companion.Append(AbstractC10978w.m24136n(), this.placeholdersAfter, loadStateUpdate.getSource(), loadStateUpdate.getMediator()), interfaceC11588c);
            }
        }
        AbstractC9979u.m20292e(loadStateUpdate, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
        return loadStateUpdate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:21:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onStaticList(androidx.paging.PageEvent.StaticList<T> r10, vc.InterfaceC11588c<? super androidx.paging.PageEvent<R>> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.paging.SeparatorState.C42861
            if (r0 == 0) goto L13
            r0 = r11
            androidx.paging.SeparatorState$onStaticList$1 r0 = (androidx.paging.SeparatorState.C42861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.SeparatorState$onStaticList$1 r0 = new androidx.paging.SeparatorState$onStaticList$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r10 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$2
            java.lang.Object r5 = r0.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.L$0
            androidx.paging.PageEvent$StaticList r6 = (androidx.paging.PageEvent.StaticList) r6
            kotlin.AbstractC9924b.m20071b(r11)
            r8 = r4
            r4 = r10
            r10 = r6
            r6 = r8
            goto L81
        L3b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L43:
            kotlin.AbstractC9924b.m20071b(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r2 = r10.getData()
            int r2 = r2.size()
            if (r2 < 0) goto L94
            r4 = 0
            r5 = r11
        L57:
            java.util.List r11 = r10.getData()
            int r6 = r4 + (-1)
            java.lang.Object r11 = p325rc.AbstractC10947g0.m23947p0(r11, r6)
            java.util.List r6 = r10.getData()
            java.lang.Object r6 = p325rc.AbstractC10947g0.m23947p0(r6, r4)
            hd.q r7 = r9.generator
            r0.L$0 = r10
            r0.L$1 = r5
            r0.L$2 = r6
            r0.I$0 = r4
            r0.I$1 = r2
            r0.label = r3
            java.lang.Object r11 = r7.invoke(r11, r6, r0)
            if (r11 != r1) goto L7e
            return r1
        L7e:
            r8 = r4
            r4 = r2
            r2 = r8
        L81:
            if (r11 == 0) goto L86
            r5.add(r11)
        L86:
            if (r6 == 0) goto L8b
            r5.add(r6)
        L8b:
            if (r2 == r4) goto L92
            int r11 = r2 + 1
            r2 = r4
            r4 = r11
            goto L57
        L92:
            r1 = r5
            goto L95
        L94:
            r1 = r11
        L95:
            androidx.paging.PageEvent$StaticList r0 = new androidx.paging.PageEvent$StaticList
            androidx.paging.LoadStates r2 = r10.getSourceLoadStates()
            androidx.paging.LoadStates r3 = r10.getMediatorLoadStates()
            r6 = 24
            r7 = 0
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorState.onStaticList(androidx.paging.PageEvent$StaticList, vc.c):java.lang.Object");
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
        AbstractC9979u.m20294g(insert, "<this>");
        AbstractC9979u.m20294g(terminalSeparatorType, "terminalSeparatorType");
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
        AbstractC9979u.m20294g(insert, "<this>");
        AbstractC9979u.m20294g(terminalSeparatorType, "terminalSeparatorType");
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
