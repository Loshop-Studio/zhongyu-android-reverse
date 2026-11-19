package androidx.compose.p012ui.spatial;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.p012ui.node.DelegatableNode;
import androidx.compose.p012ui.node.DelegatableNodeKt;
import androidx.compose.p012ui.node.LayoutNode;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001:\u0001RB\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060\u0004R\u00020\u0000H\u0002JH\u0010%\u001a\u00020\n2\n\u0010$\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J@\u0010*\u001a\u00020#2\n\u0010$\u001a\u00060\u0004R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000e\u0010-\u001a\u00020#2\u0006\u0010&\u001a\u00020\nJ\u000e\u0010.\u001a\u00020#2\u0006\u0010&\u001a\u00020\nJ&\u0010/\u001a\u00020#2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nJ,\u00104\u001a\u00020#2\n\u0010$\u001a\u00060\u0004R\u00020\u00002\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J:\u00105\u001a\u0002062\u0006\u00100\u001a\u0002012\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020#0<J:\u0010>\u001a\u0002062\u0006\u00100\u001a\u0002012\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020#0<J\u0014\u0010?\u001a\u00020@2\n\u0010$\u001a\u00060\u0004R\u00020\u0000H\u0002J\u0010\u0010A\u001a\u00020\n2\u0006\u0010B\u001a\u00020\nH\u0002J\u000e\u0010C\u001a\u00020#2\u0006\u0010&\u001a\u00020\nJ*\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00142\b\u0010G\u001a\u0004\u0018\u00010\u0019ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ)\u0010J\u001a\u00020#*\u00060\u0004R\u00020\u00002\u0016\u0010K\u001a\u0012\u0012\b\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020#0<H\u0082\bJ/\u0010L\u001a\u00020#*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00102\u0016\u0010K\u001a\u0012\u0012\b\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020#0<H\u0082\bJ.\u0010M\u001a\u00060\u0004R\u00020\u0000*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00102\u0006\u0010N\u001a\u0002012\n\u0010O\u001a\u00060\u0004R\u00020\u0000H\u0002J*\u0010P\u001a\u00020@*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00102\u0006\u0010N\u001a\u0002012\n\u0010O\u001a\u00060\u0004R\u00020\u0000H\u0002J7\u0010Q\u001a\u00020#*\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u00102\u0006\u00100\u001a\u0002012\u0016\u0010K\u001a\u0012\u0012\b\u0012\u00060\u0004R\u00020\u0000\u0012\u0004\u0012\u00020#0<H\u0082\bR \u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00000\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u0014X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR$\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u0014X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, m13413d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks;", "", "()V", "globalChangeEntries", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getGlobalChangeEntries", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setGlobalChangeEntries", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "minDebounceDeadline", "", "getMinDebounceDeadline", "()J", "setMinDebounceDeadline", "(J)V", "rectChangedMap", "Landroidx/collection/MutableIntObjectMap;", "getRectChangedMap", "()Landroidx/collection/MutableIntObjectMap;", "screenOffset", "Landroidx/compose/ui/unit/IntOffset;", "getScreenOffset-nOcc-ac", "setScreenOffset--gyyYBs", "J", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "getViewToWindowMatrix-3i98HWw", "()[F", "setViewToWindowMatrix-Q8lPUPs", "([F)V", "[F", "windowOffset", "getWindowOffset-nOcc-ac", "setWindowOffset--gyyYBs", "addToGlobalEntries", "", "entry", "debounceEntry", "currentMillis", "minDeadline", "debounceEntry-b8qMvQI", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J", "fire", "fire-WY9HvpM", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V", "fireGlobalChangeEntries", "fireOnRectChangedEntries", "fireOnUpdatedRect", "id", "", "topLeft", "bottomRight", "fireWithUpdatedRect", "registerOnGlobalChange", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "throttleMillis", "debounceMillis", "node", "Landroidx/compose/ui/node/DelegatableNode;", "callback", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "registerOnRectChanged", "removeFromGlobalEntries", "", "roundDownToMultipleOf8", "x", "triggerDebounced", "updateOffsets", "screen", "window", "matrix", "updateOffsets-bT0EZQs", "(JJ[F)Z", "linkedForEach", "block", "multiForEach", "multiPut", "key", "value", "multiRemove", "runFor", "Entry", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 7 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n405#1,6:495\n395#1:501\n396#1,6:518\n402#1:531\n387#1,3:532\n390#1,3:540\n395#1:543\n396#1,6:560\n402#1:573\n387#1,6:574\n397#2,3:502\n354#2,6:505\n364#2,3:512\n367#2,2:516\n370#2,6:524\n400#2:530\n397#2,3:544\n354#2,6:547\n364#2,3:554\n367#2,2:558\n370#2,6:566\n400#2:572\n397#2,3:580\n354#2,6:583\n364#2,3:590\n367#2,9:594\n400#2:603\n1399#3:511\n1270#3:515\n1399#3:553\n1270#3:557\n1399#3:589\n1270#3:593\n54#4:535\n59#4:537\n85#5:536\n90#5:538\n787#6:539\n679#7:604\n1#8:605\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n*L\n172#1:495,6\n182#1:501\n182#1:518,6\n182#1:531\n198#1:532,3\n198#1:540,3\n227#1:543\n227#1:560,6\n227#1:573\n238#1:574,6\n182#1:502,3\n182#1:505,6\n182#1:512,3\n182#1:516,2\n182#1:524,6\n182#1:530\n227#1:544,3\n227#1:547,6\n227#1:554,3\n227#1:558,2\n227#1:566,6\n227#1:572\n395#1:580,3\n395#1:583,6\n395#1:590,3\n395#1:594,9\n395#1:603\n182#1:511\n182#1:515\n227#1:553\n227#1:557\n395#1:589\n395#1:593\n206#1:535\n206#1:537\n206#1:536\n206#1:538\n206#1:539\n413#1:604\n413#1:605\n*E\n"})
/* loaded from: classes2.dex */
public final class ThrottledCallbacks {
    public static final int $stable = 8;
    private Entry globalChangeEntries;
    private long screenOffset;
    private float[] viewToWindowMatrix;
    private long windowOffset;
    private final MutableIntObjectMap<Entry> rectChangedMap = IntObjectMapKt.mutableIntObjectMapOf();
    private long minDebounceDeadline = -1;

    @Metadata(m13412d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rJ:\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/ø\u0001\u0000¢\u0006\u0004\b0\u00101J\b\u00102\u001a\u00020\fH\u0016R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R \u0010\u001e\u001a\b\u0018\u00010\u0000R\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0010R\u001a\u0010'\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, m13413d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "id", "", "throttleMillis", "", "debounceMillis", "node", "Landroidx/compose/ui/node/DelegatableNode;", "callback", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "(Landroidx/compose/ui/spatial/ThrottledCallbacks;IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)V", "bottomRight", "getBottomRight", "()J", "setBottomRight", "(J)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getDebounceMillis", "getId", "()I", "lastInvokeMillis", "getLastInvokeMillis", "setLastInvokeMillis", "lastUninvokedFireMillis", "getLastUninvokedFireMillis", "setLastUninvokedFireMillis", "next", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "getNext", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setNext", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "getThrottleMillis", "topLeft", "getTopLeft", "setTopLeft", "fire", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "fire-9b-9wPM", "(JJJJ[F)V", "unregister", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public final class Entry implements DelegatableNode.RegistrationHandle {
        private long bottomRight;
        private final Function1<RelativeLayoutBounds, Unit> callback;
        private final long debounceMillis;
        private final int id;
        private long lastInvokeMillis;
        private long lastUninvokedFireMillis = -1;
        private Entry next;
        private final DelegatableNode node;
        private final long throttleMillis;
        private long topLeft;

        /* JADX WARN: Multi-variable type inference failed */
        public Entry(int i9, long j9, long j10, DelegatableNode delegatableNode, Function1<? super RelativeLayoutBounds, Unit> function1) {
            this.id = i9;
            this.throttleMillis = j9;
            this.debounceMillis = j10;
            this.node = delegatableNode;
            this.callback = function1;
            this.lastInvokeMillis = -j9;
        }

        /* renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m23266fire9b9wPM(long topLeft, long bottomRight, long windowOffset, long screenOffset, float[] viewToWindowMatrix) {
            RelativeLayoutBounds relativeLayoutBoundsM23267rectInfoForQMZNJw = ThrottledCallbacksKt.m23267rectInfoForQMZNJw(this.node, topLeft, bottomRight, windowOffset, screenOffset, viewToWindowMatrix);
            if (relativeLayoutBoundsM23267rectInfoForQMZNJw == null) {
                return;
            }
            this.callback.invoke(relativeLayoutBoundsM23267rectInfoForQMZNJw);
        }

        public final long getBottomRight() {
            return this.bottomRight;
        }

        public final Function1<RelativeLayoutBounds, Unit> getCallback() {
            return this.callback;
        }

        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final int getId() {
            return this.id;
        }

        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        public final Entry getNext() {
            return this.next;
        }

        public final DelegatableNode getNode() {
            return this.node;
        }

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setBottomRight(long j9) {
            this.bottomRight = j9;
        }

        public final void setLastInvokeMillis(long j9) {
            this.lastInvokeMillis = j9;
        }

        public final void setLastUninvokedFireMillis(long j9) {
            this.lastUninvokedFireMillis = j9;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final void setTopLeft(long j9) {
            this.topLeft = j9;
        }

        @Override // androidx.compose.ui.node.DelegatableNode.RegistrationHandle
        public void unregister() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            if (throttledCallbacks.multiRemove(throttledCallbacks.getRectChangedMap(), this.id, this)) {
                return;
            }
            ThrottledCallbacks.this.removeFromGlobalEntries(this);
        }
    }

    public ThrottledCallbacks() {
        IntOffset.Companion companion = IntOffset.INSTANCE;
        this.windowOffset = companion.m24133getZeronOccac();
        this.screenOffset = companion.m24133getZeronOccac();
    }

    private final void addToGlobalEntries(Entry entry) {
        entry.setNext(this.globalChangeEntries);
        this.globalChangeEntries = entry;
    }

    /* renamed from: debounceEntry-b8qMvQI, reason: not valid java name */
    private final long m23257debounceEntryb8qMvQI(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis, long minDeadline) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return minDeadline;
        }
        if (currentMillis - entry.getLastUninvokedFireMillis() <= entry.getDebounceMillis()) {
            return Math.min(minDeadline, entry.getLastUninvokedFireMillis() + entry.getDebounceMillis());
        }
        entry.setLastInvokeMillis(currentMillis);
        entry.setLastUninvokedFireMillis(-1L);
        entry.m23266fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        return minDeadline;
    }

    /* renamed from: fire-WY9HvpM, reason: not valid java name */
    private final void m23258fireWY9HvpM(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis) {
        boolean z9 = currentMillis - entry.getLastInvokeMillis() > entry.getThrottleMillis();
        boolean z10 = entry.getDebounceMillis() == 0;
        entry.setLastUninvokedFireMillis(currentMillis);
        if (z9 && z10) {
            entry.setLastInvokeMillis(currentMillis);
            entry.m23266fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        }
        if (z10) {
            return;
        }
        long j9 = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis() + currentMillis;
        if (j9 <= 0 || debounceMillis >= j9) {
            return;
        }
        this.minDebounceDeadline = j9;
    }

    private final void fireWithUpdatedRect(Entry entry, long topLeft, long bottomRight, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z9 = currentMillis - lastInvokeMillis >= throttleMillis;
        boolean z10 = debounceMillis == 0;
        boolean z11 = throttleMillis == 0;
        entry.setTopLeft(topLeft);
        entry.setBottomRight(bottomRight);
        boolean z12 = !(z10 || z11) || z10;
        if (z9 && z12) {
            entry.setLastUninvokedFireMillis(-1L);
            entry.setLastInvokeMillis(currentMillis);
            entry.m23266fire9b9wPM(topLeft, bottomRight, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z10) {
                return;
            }
            entry.setLastUninvokedFireMillis(currentMillis);
            long j9 = this.minDebounceDeadline;
            long j10 = currentMillis + debounceMillis;
            if (j9 <= 0 || j10 >= j9) {
                return;
            }
            this.minDebounceDeadline = j9;
        }
    }

    private final void linkedForEach(Entry entry, Function1<? super Entry, Unit> function1) {
        while (entry != null) {
            function1.invoke(entry);
            entry = entry.getNext();
        }
    }

    private final void multiForEach(MutableIntObjectMap<Entry> mutableIntObjectMap, Function1<? super Entry, Unit> function1) {
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j9 = jArr[i9];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j9) < 128) {
                        for (Entry next = (Entry) objArr[(i9 << 3) + i11]; next != null; next = next.getNext()) {
                            function1.invoke(next);
                        }
                    }
                    j9 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length) {
                return;
            } else {
                i9++;
            }
        }
    }

    private final Entry multiPut(MutableIntObjectMap<Entry> mutableIntObjectMap, int i9, Entry entry) {
        Entry entry2 = mutableIntObjectMap.get(i9);
        if (entry2 == null) {
            mutableIntObjectMap.set(i9, entry);
            entry2 = entry;
        }
        Entry next = entry2;
        if (next != entry) {
            while (next.getNext() != null) {
                next = next.getNext();
                Intrinsics.checkNotNull(next);
            }
            next.setNext(entry);
        }
        return entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean multiRemove(androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks.Entry> r6, int r7, androidx.compose.ui.spatial.ThrottledCallbacks.Entry r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.remove(r7)
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = (androidx.compose.ui.spatial.ThrottledCallbacks.Entry) r0
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1f
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = r8.getNext()
            r8.setNext(r4)
            if (r0 == 0) goto L1e
            r6.put(r7, r0)
        L1e:
            return r3
        L1f:
            r6.put(r7, r0)
        L22:
            if (r0 == 0) goto L3d
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r6 = r0.getNext()
            if (r6 != 0) goto L2b
            return r1
        L2b:
            if (r6 != r8) goto L38
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r6 = r8.getNext()
            r0.setNext(r6)
            r8.setNext(r4)
            goto L3d
        L38:
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r0 = r0.getNext()
            goto L22
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p012ui.spatial.ThrottledCallbacks.multiRemove(androidx.collection.MutableIntObjectMap, int, androidx.compose.ui.spatial.ThrottledCallbacks$Entry):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeFromGlobalEntries(Entry entry) {
        Entry entry2 = this.globalChangeEntries;
        if (entry2 == entry) {
            this.globalChangeEntries = entry2.getNext();
            entry.setNext(null);
            return true;
        }
        Entry next = entry2 != null ? entry2.getNext() : null;
        while (true) {
            Entry entry3 = next;
            Entry entry4 = entry2;
            entry2 = entry3;
            if (entry2 == null) {
                return false;
            }
            if (entry2 == entry) {
                if (entry4 != null) {
                    entry4.setNext(entry2.getNext());
                }
                entry.setNext(null);
                return true;
            }
            next = entry2.getNext();
        }
    }

    private final long roundDownToMultipleOf8(long x9) {
        return (x9 >> 3) << 3;
    }

    private final void runFor(MutableIntObjectMap<Entry> mutableIntObjectMap, int i9, Function1<? super Entry, Unit> function1) {
        for (Entry next = mutableIntObjectMap.get(i9); next != null; next = next.getNext()) {
            function1.invoke(next);
        }
    }

    public final void fireGlobalChangeEntries(long currentMillis) {
        long j9 = this.windowOffset;
        long j10 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            for (Entry next = entry; next != null; next = next.getNext()) {
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(next.getNode());
                long offsetFromRoot = layoutNodeRequireLayoutNode.getOffsetFromRoot();
                long lastSize = layoutNodeRequireLayoutNode.getLastSize();
                next.setTopLeft(offsetFromRoot);
                next.setBottomRight(((IntOffset.m24122getXimpl(offsetFromRoot) + ((int) (lastSize >> 32))) << 32) | ((IntOffset.m24123getYimpl(offsetFromRoot) + ((int) (lastSize & 4294967295L))) & 4294967295L));
                m23258fireWY9HvpM(next, j9, j10, fArr, currentMillis);
            }
        }
    }

    public final void fireOnRectChangedEntries(long currentMillis) {
        ThrottledCallbacks throttledCallbacks = this;
        long j9 = throttledCallbacks.windowOffset;
        long j10 = throttledCallbacks.screenOffset;
        float[] fArr = throttledCallbacks.viewToWindowMatrix;
        MutableIntObjectMap<Entry> mutableIntObjectMap = throttledCallbacks.rectChangedMap;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j11 = jArr[i9];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                long j12 = j11;
                int i11 = 0;
                while (i11 < i10) {
                    if ((j12 & 255) < 128) {
                        Entry next = (Entry) objArr[(i9 << 3) + i11];
                        while (next != null) {
                            int i12 = i11;
                            Entry entry = next;
                            throttledCallbacks.m23258fireWY9HvpM(entry, j9, j10, fArr, currentMillis);
                            next = entry.getNext();
                            throttledCallbacks = this;
                            i11 = i12;
                        }
                    }
                    j12 >>= 8;
                    i11++;
                    throttledCallbacks = this;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length) {
                return;
            }
            i9++;
            throttledCallbacks = this;
        }
    }

    public final void fireOnUpdatedRect(int id, long topLeft, long bottomRight, long currentMillis) {
        for (Entry next = this.rectChangedMap.get(id); next != null; next = next.getNext()) {
            fireWithUpdatedRect(next, topLeft, bottomRight, currentMillis);
        }
    }

    public final Entry getGlobalChangeEntries() {
        return this.globalChangeEntries;
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    public final MutableIntObjectMap<Entry> getRectChangedMap() {
        return this.rectChangedMap;
    }

    /* renamed from: getScreenOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getScreenOffset() {
        return this.screenOffset;
    }

    /* renamed from: getViewToWindowMatrix-3i98HWw, reason: not valid java name and from getter */
    public final float[] getViewToWindowMatrix() {
        return this.viewToWindowMatrix;
    }

    /* renamed from: getWindowOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getWindowOffset() {
        return this.windowOffset;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalChange(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> callback) {
        Entry entry = new Entry(id, throttleMillis, debounceMillis == 0 ? throttleMillis : debounceMillis, node, callback);
        addToGlobalEntries(entry);
        return entry;
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChanged(int id, long throttleMillis, long debounceMillis, DelegatableNode node, Function1<? super RelativeLayoutBounds, Unit> callback) {
        return multiPut(this.rectChangedMap, id, new Entry(id, throttleMillis, debounceMillis == 0 ? throttleMillis : debounceMillis, node, callback));
    }

    public final void setGlobalChangeEntries(Entry entry) {
        this.globalChangeEntries = entry;
    }

    public final void setMinDebounceDeadline(long j9) {
        this.minDebounceDeadline = j9;
    }

    /* renamed from: setScreenOffset--gyyYBs, reason: not valid java name */
    public final void m23262setScreenOffsetgyyYBs(long j9) {
        this.screenOffset = j9;
    }

    /* renamed from: setViewToWindowMatrix-Q8lPUPs, reason: not valid java name */
    public final void m23263setViewToWindowMatrixQ8lPUPs(float[] fArr) {
        this.viewToWindowMatrix = fArr;
    }

    /* renamed from: setWindowOffset--gyyYBs, reason: not valid java name */
    public final void m23264setWindowOffsetgyyYBs(long j9) {
        this.windowOffset = j9;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[LOOP:0: B:8:0x0023->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[EDGE_INSN: B:39:0x0096->B:27:0x0096 BREAK  A[LOOP:0: B:8:0x0023->B:25:0x008c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void triggerDebounced(long r27) {
        /*
            r26 = this;
            r0 = r26
            long r1 = r0.minDebounceDeadline
            int r1 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r1 <= 0) goto L9
            return
        L9:
            long r2 = r0.windowOffset
            long r4 = r0.screenOffset
            float[] r6 = r0.viewToWindowMatrix
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks$Entry> r1 = r0.rectChangedMap
            java.lang.Object[] r11 = r1.values
            long[] r12 = r1.metadata
            int r1 = r12.length
            int r13 = r1 + (-2)
            if (r13 < 0) goto L8f
            r16 = 0
            r1 = r16
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L23:
            r9 = r12[r1]
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r14 = ~r9
            r19 = 7
            long r14 = r14 << r19
            long r14 = r14 & r9
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r19
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 == 0) goto L8a
            int r14 = r1 - r13
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r19 = r9
            r9 = r16
        L48:
            if (r9 >= r14) goto L84
            r21 = 255(0xff, double:1.26E-321)
            long r21 = r19 & r21
            r23 = 128(0x80, double:6.3E-322)
            int r10 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r10 >= 0) goto L7a
            int r10 = r1 << 3
            int r10 = r10 + r9
            r10 = r11[r10]
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r10 = (androidx.compose.ui.spatial.ThrottledCallbacks.Entry) r10
        L5b:
            if (r10 == 0) goto L74
            r25 = r1
            r21 = r9
            r1 = r10
            r9 = r7
            r7 = r27
            long r9 = r0.m23257debounceEntryb8qMvQI(r1, r2, r4, r6, r7, r9)
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r1 = r1.getNext()
            r7 = r9
            r9 = r21
            r10 = r1
            r1 = r25
            goto L5b
        L74:
            r21 = r9
            r9 = r7
        L77:
            r25 = r1
            goto L7d
        L7a:
            r21 = r9
            goto L77
        L7d:
            long r19 = r19 >> r15
            int r9 = r21 + 1
            r1 = r25
            goto L48
        L84:
            r25 = r1
            if (r14 != r15) goto L96
            r1 = r25
        L8a:
            if (r1 == r13) goto L96
            int r1 = r1 + 1
            goto L23
        L8f:
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = r17
        L96:
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r1 = r0.globalChangeEntries
            if (r1 == 0) goto La9
            r9 = r7
        L9b:
            if (r1 == 0) goto La8
            r7 = r27
            long r9 = r0.m23257debounceEntryb8qMvQI(r1, r2, r4, r6, r7, r9)
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r1 = r1.getNext()
            goto L9b
        La8:
            r7 = r9
        La9:
            int r1 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r1 != 0) goto Laf
            r7 = -1
        Laf:
            r0.minDebounceDeadline = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p012ui.spatial.ThrottledCallbacks.triggerDebounced(long):void");
    }

    /* renamed from: updateOffsets-bT0EZQs, reason: not valid java name */
    public final boolean m23265updateOffsetsbT0EZQs(long screen, long window, float[] matrix) {
        boolean z9;
        if (IntOffset.m24121equalsimpl0(window, this.windowOffset)) {
            z9 = false;
        } else {
            this.windowOffset = window;
            z9 = true;
        }
        if (!IntOffset.m24121equalsimpl0(screen, this.screenOffset)) {
            this.screenOffset = screen;
            z9 = true;
        }
        if (matrix == null) {
            return z9;
        }
        this.viewToWindowMatrix = matrix;
        return true;
    }
}
