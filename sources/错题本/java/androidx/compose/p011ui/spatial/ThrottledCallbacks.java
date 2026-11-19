package androidx.compose.p011ui.spatial;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b#\b\u0000\u0018\u00002\u00020\u0001:\u0001_B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ-\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\"J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010'J3\u0010*\u001a\u00020\u00162\n\u0010)\u001a\u00060(R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010+J@\u00101\u001a\u00020\u00162\n\u0010)\u001a\u00060(R\u00020\u00002\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001e\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100JH\u00105\u001a\u00020\u000f2\n\u0010)\u001a\u00060(R\u00020\u00002\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020\u00162\n\u0010)\u001a\u00060(R\u00020\u0000H\u0002¢\u0006\u0004\b6\u00107J\u001b\u00108\u001a\u00020\t2\n\u0010)\u001a\u00060(R\u00020\u0000H\u0002¢\u0006\u0004\b8\u00109J0\u0010;\u001a\u00020\u0016*\u00060(R\u00020\u00002\u0016\u0010:\u001a\u0012\u0012\b\u0012\u00060(R\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u0014H\u0082\b¢\u0006\u0004\b;\u0010<J6\u0010>\u001a\u00020\u0016*\f\u0012\b\u0012\u00060(R\u00020\u00000=2\u0016\u0010:\u001a\u0012\u0012\b\u0012\u00060(R\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u0014H\u0082\b¢\u0006\u0004\b>\u0010?J>\u0010@\u001a\u00020\u0016*\f\u0012\b\u0012\u00060(R\u00020\u00000=2\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010:\u001a\u0012\u0012\b\u0012\u00060(R\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u0014H\u0082\b¢\u0006\u0004\b@\u0010AJ5\u0010D\u001a\u00060(R\u00020\u0000*\f\u0012\b\u0012\u00060(R\u00020\u00000=2\u0006\u0010B\u001a\u00020\r2\n\u0010C\u001a\u00060(R\u00020\u0000H\u0002¢\u0006\u0004\bD\u0010EJ1\u0010F\u001a\u00020\t*\f\u0012\b\u0012\u00060(R\u00020\u00000=2\u0006\u0010B\u001a\u00020\r2\n\u0010C\u001a\u00060(R\u00020\u0000H\u0002¢\u0006\u0004\bF\u0010GR!\u0010H\u001a\f\u0012\b\u0012\u00060(R\u00020\u00000=8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR(\u0010L\u001a\b\u0018\u00010(R\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u00107R\"\u0010Q\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010\"R(\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010R\u001a\u0004\bV\u0010T\"\u0004\bW\u0010\"R(\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010R\u001a\u0004\bX\u0010T\"\u0004\bY\u0010\"R*\u0010.\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b.\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, m5110d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntOffset;", "screen", "window", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "", "updateOffsets-bT0EZQs", "(JJ[F)Z", "updateOffsets", "", "id", "", "throttleMillis", "debounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "Ld6/s;", "callback", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnRectChanged", "(IJJLandroidx/compose/ui/node/DelegatableNode;Lr6/c;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnGlobalChange", "topLeft", "bottomRight", "currentMillis", "fireOnUpdatedRect", "(IJJJ)V", "fireOnRectChangedEntries", "(J)V", "fireGlobalChangeEntries", "triggerDebounced", "x", "roundDownToMultipleOf8", "(J)J", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "entry", "fireWithUpdatedRect", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJJ)V", "windowOffset", "screenOffset", "viewToWindowMatrix", "fire-WY9HvpM", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V", "fire", "minDeadline", "debounceEntry-b8qMvQI", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J", "debounceEntry", "addToGlobalEntries", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "removeFromGlobalEntries", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z", "block", "linkedForEach", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;Lr6/c;)V", "Landroidx/collection/MutableIntObjectMap;", "multiForEach", "(Landroidx/collection/MutableIntObjectMap;Lr6/c;)V", "runFor", "(Landroidx/collection/MutableIntObjectMap;ILr6/c;)V", "key", "value", "multiPut", "(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "multiRemove", "(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z", "rectChangedMap", "Landroidx/collection/MutableIntObjectMap;", "getRectChangedMap", "()Landroidx/collection/MutableIntObjectMap;", "globalChangeEntries", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getGlobalChangeEntries", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setGlobalChangeEntries", "minDebounceDeadline", "J", "getMinDebounceDeadline", "()J", "setMinDebounceDeadline", "getWindowOffset-nOcc-ac", "setWindowOffset--gyyYBs", "getScreenOffset-nOcc-ac", "setScreenOffset--gyyYBs", "[F", "getViewToWindowMatrix-3i98HWw", "()[F", "setViewToWindowMatrix-Q8lPUPs", "([F)V", "Entry", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 7 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n405#1,6:495\n395#1:501\n396#1,6:518\n402#1:531\n387#1,3:532\n390#1,3:540\n395#1:543\n396#1,6:560\n402#1:573\n387#1,6:574\n397#2,3:502\n354#2,6:505\n364#2,3:512\n367#2,2:516\n370#2,6:524\n400#2:530\n397#2,3:544\n354#2,6:547\n364#2,3:554\n367#2,2:558\n370#2,6:566\n400#2:572\n397#2,3:580\n354#2,6:583\n364#2,3:590\n367#2,9:594\n400#2:603\n1399#3:511\n1270#3:515\n1399#3:553\n1270#3:557\n1399#3:589\n1270#3:593\n54#4:535\n59#4:537\n85#5:536\n90#5:538\n787#6:539\n679#7:604\n1#8:605\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n*L\n172#1:495,6\n182#1:501\n182#1:518,6\n182#1:531\n198#1:532,3\n198#1:540,3\n227#1:543\n227#1:560,6\n227#1:573\n238#1:574,6\n182#1:502,3\n182#1:505,6\n182#1:512,3\n182#1:516,2\n182#1:524,6\n182#1:530\n227#1:544,3\n227#1:547,6\n227#1:554,3\n227#1:558,2\n227#1:566,6\n227#1:572\n395#1:580,3\n395#1:583,6\n395#1:590,3\n395#1:594,9\n395#1:603\n182#1:511\n182#1:515\n227#1:553\n227#1:557\n395#1:589\n395#1:593\n206#1:535\n206#1:537\n206#1:536\n206#1:538\n206#1:539\n413#1:604\n413#1:605\n*E\n"})
/* loaded from: classes2.dex */
public final class ThrottledCallbacks {
    public static final int $stable = 8;

    @Nullable
    private Entry globalChangeEntries;
    private long screenOffset;

    @Nullable
    private float[] viewToWindowMatrix;
    private long windowOffset;

    @NotNull
    private final MutableIntObjectMap<Entry> rectChangedMap = IntObjectMapKt.mutableIntObjectMapOf();
    private long minDebounceDeadline = -1;

    @Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R(\u0010)\u001a\b\u0018\u00010\u0000R\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b/\u0010 \"\u0004\b0\u00101R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b2\u0010 \"\u0004\b3\u00101R\"\u00104\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 \"\u0004\b6\u00101R\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001e\u001a\u0004\b8\u0010 \"\u0004\b9\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, m5110d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "", "id", "", "throttleMillis", "debounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "Ld6/s;", "callback", "<init>", "(Landroidx/compose/ui/spatial/ThrottledCallbacks;IJJLandroidx/compose/ui/node/DelegatableNode;Lr6/c;)V", "unregister", "()V", "topLeft", "bottomRight", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "fire-9b-9wPM", "(JJJJ[F)V", "fire", "I", "getId", "()I", "J", "getThrottleMillis", "()J", "getDebounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "Lr6/c;", "getCallback", "()Lr6/c;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "next", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getNext", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setNext", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "getTopLeft", "setTopLeft", "(J)V", "getBottomRight", "setBottomRight", "lastInvokeMillis", "getLastInvokeMillis", "setLastInvokeMillis", "lastUninvokedFireMillis", "getLastUninvokedFireMillis", "setLastUninvokedFireMillis", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public final class Entry implements DelegatableNode.RegistrationHandle {
        private long bottomRight;

        @NotNull
        private final InterfaceC6471c callback;
        private final long debounceMillis;
        private final int id;
        private long lastInvokeMillis;
        private long lastUninvokedFireMillis = -1;

        @Nullable
        private Entry next;

        @NotNull
        private final DelegatableNode node;
        private final long throttleMillis;
        private long topLeft;

        public Entry(int i, long j7, long j8, @NotNull DelegatableNode delegatableNode, @NotNull InterfaceC6471c interfaceC6471c) {
            this.id = i;
            this.throttleMillis = j7;
            this.debounceMillis = j8;
            this.node = delegatableNode;
            this.callback = interfaceC6471c;
            this.lastInvokeMillis = -j7;
        }

        /* renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m12576fire9b9wPM(long topLeft, long bottomRight, long windowOffset, long screenOffset, @Nullable float[] viewToWindowMatrix) {
            RelativeLayoutBounds relativeLayoutBoundsM12577rectInfoForQMZNJw = ThrottledCallbacksKt.m12577rectInfoForQMZNJw(this.node, topLeft, bottomRight, windowOffset, screenOffset, viewToWindowMatrix);
            if (relativeLayoutBoundsM12577rectInfoForQMZNJw == null) {
                return;
            }
            this.callback.invoke(relativeLayoutBoundsM12577rectInfoForQMZNJw);
        }

        public final long getBottomRight() {
            return this.bottomRight;
        }

        @NotNull
        public final InterfaceC6471c getCallback() {
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

        @Nullable
        public final Entry getNext() {
            return this.next;
        }

        @NotNull
        public final DelegatableNode getNode() {
            return this.node;
        }

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setBottomRight(long j7) {
            this.bottomRight = j7;
        }

        public final void setLastInvokeMillis(long j7) {
            this.lastInvokeMillis = j7;
        }

        public final void setLastUninvokedFireMillis(long j7) {
            this.lastUninvokedFireMillis = j7;
        }

        public final void setNext(@Nullable Entry entry) {
            this.next = entry;
        }

        public final void setTopLeft(long j7) {
            this.topLeft = j7;
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
        this.windowOffset = companion.m13444getZeronOccac();
        this.screenOffset = companion.m13444getZeronOccac();
    }

    private final void addToGlobalEntries(Entry entry) {
        entry.setNext(this.globalChangeEntries);
        this.globalChangeEntries = entry;
    }

    /* renamed from: debounceEntry-b8qMvQI, reason: not valid java name */
    private final long m12567debounceEntryb8qMvQI(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis, long minDeadline) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return minDeadline;
        }
        if (currentMillis - entry.getLastUninvokedFireMillis() <= entry.getDebounceMillis()) {
            return Math.min(minDeadline, entry.getDebounceMillis() + entry.getLastUninvokedFireMillis());
        }
        entry.setLastInvokeMillis(currentMillis);
        entry.setLastUninvokedFireMillis(-1L);
        entry.m12576fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        return minDeadline;
    }

    /* renamed from: fire-WY9HvpM, reason: not valid java name */
    private final void m12568fireWY9HvpM(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis) {
        boolean z8 = currentMillis - entry.getLastInvokeMillis() > entry.getThrottleMillis();
        boolean z9 = entry.getDebounceMillis() == 0;
        entry.setLastUninvokedFireMillis(currentMillis);
        if (z8 && z9) {
            entry.setLastInvokeMillis(currentMillis);
            entry.m12576fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        }
        if (z9) {
            return;
        }
        long j7 = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis() + currentMillis;
        if (j7 <= 0 || debounceMillis >= j7) {
            return;
        }
        this.minDebounceDeadline = j7;
    }

    private final void fireWithUpdatedRect(Entry entry, long topLeft, long bottomRight, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z8 = currentMillis - lastInvokeMillis >= throttleMillis;
        boolean z9 = debounceMillis == 0;
        boolean z10 = throttleMillis == 0;
        entry.setTopLeft(topLeft);
        entry.setBottomRight(bottomRight);
        boolean z11 = !(z9 || z10) || z9;
        if (z8 && z11) {
            entry.setLastUninvokedFireMillis(-1L);
            entry.setLastInvokeMillis(currentMillis);
            entry.m12576fire9b9wPM(topLeft, bottomRight, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z9) {
                return;
            }
            entry.setLastUninvokedFireMillis(currentMillis);
            long j7 = this.minDebounceDeadline;
            long j8 = currentMillis + debounceMillis;
            if (j7 <= 0 || j8 >= j7) {
                return;
            }
            this.minDebounceDeadline = j7;
        }
    }

    private final void linkedForEach(Entry entry, InterfaceC6471c interfaceC6471c) {
        while (entry != null) {
            interfaceC6471c.invoke(entry);
            entry = entry.getNext();
        }
    }

    private final void multiForEach(MutableIntObjectMap<Entry> mutableIntObjectMap, InterfaceC6471c interfaceC6471c) {
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        for (Entry next = (Entry) objArr[(i << 3) + i9]; next != null; next = next.getNext()) {
                            interfaceC6471c.invoke(next);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final Entry multiPut(MutableIntObjectMap<Entry> mutableIntObjectMap, int i, Entry entry) {
        Entry entry2 = mutableIntObjectMap.get(i);
        if (entry2 == null) {
            mutableIntObjectMap.set(i, entry);
            entry2 = entry;
        }
        Entry next = entry2;
        if (next != entry) {
            while (next.getNext() != null) {
                next = next.getNext();
                AbstractC5830k.m5327d(next);
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
            boolean r2 = r0.equals(r8)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.spatial.ThrottledCallbacks.multiRemove(androidx.collection.MutableIntObjectMap, int, androidx.compose.ui.spatial.ThrottledCallbacks$Entry):boolean");
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

    private final long roundDownToMultipleOf8(long x3) {
        return (x3 >> 3) << 3;
    }

    private final void runFor(MutableIntObjectMap<Entry> mutableIntObjectMap, int i, InterfaceC6471c interfaceC6471c) {
        for (Entry next = mutableIntObjectMap.get(i); next != null; next = next.getNext()) {
            interfaceC6471c.invoke(next);
        }
    }

    public final void fireGlobalChangeEntries(long currentMillis) {
        long j7 = this.windowOffset;
        long j8 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            for (Entry next = entry; next != null; next = next.getNext()) {
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(next.getNode());
                long offsetFromRoot = layoutNodeRequireLayoutNode.getOffsetFromRoot();
                long lastSize = layoutNodeRequireLayoutNode.getLastSize();
                next.setTopLeft(offsetFromRoot);
                next.setBottomRight(((IntOffset.m13433getXimpl(offsetFromRoot) + ((int) (lastSize >> 32))) << 32) | ((IntOffset.m13434getYimpl(offsetFromRoot) + ((int) (lastSize & 4294967295L))) & 4294967295L));
                m12568fireWY9HvpM(next, j7, j8, fArr, currentMillis);
            }
        }
    }

    public final void fireOnRectChangedEntries(long currentMillis) {
        ThrottledCallbacks throttledCallbacks = this;
        long j7 = throttledCallbacks.windowOffset;
        long j8 = throttledCallbacks.screenOffset;
        float[] fArr = throttledCallbacks.viewToWindowMatrix;
        MutableIntObjectMap<Entry> mutableIntObjectMap = throttledCallbacks.rectChangedMap;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j9 = jArr[i];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                long j10 = j9;
                int i9 = 0;
                while (i9 < i8) {
                    if ((j10 & 255) < 128) {
                        Entry next = (Entry) objArr[(i << 3) + i9];
                        while (next != null) {
                            int i10 = i9;
                            Entry entry = next;
                            throttledCallbacks.m12568fireWY9HvpM(entry, j7, j8, fArr, currentMillis);
                            next = entry.getNext();
                            throttledCallbacks = this;
                            i9 = i10;
                        }
                    }
                    j10 >>= 8;
                    i9++;
                    throttledCallbacks = this;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            }
            i++;
            throttledCallbacks = this;
        }
    }

    public final void fireOnUpdatedRect(int id, long topLeft, long bottomRight, long currentMillis) {
        for (Entry next = this.rectChangedMap.get(id); next != null; next = next.getNext()) {
            fireWithUpdatedRect(next, topLeft, bottomRight, currentMillis);
        }
    }

    @Nullable
    public final Entry getGlobalChangeEntries() {
        return this.globalChangeEntries;
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    @NotNull
    public final MutableIntObjectMap<Entry> getRectChangedMap() {
        return this.rectChangedMap;
    }

    /* renamed from: getScreenOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getScreenOffset() {
        return this.screenOffset;
    }

    @Nullable
    /* renamed from: getViewToWindowMatrix-3i98HWw, reason: not valid java name and from getter */
    public final float[] getViewToWindowMatrix() {
        return this.viewToWindowMatrix;
    }

    /* renamed from: getWindowOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getWindowOffset() {
        return this.windowOffset;
    }

    @NotNull
    public final DelegatableNode.RegistrationHandle registerOnGlobalChange(int id, long throttleMillis, long debounceMillis, @NotNull DelegatableNode node, @NotNull InterfaceC6471c callback) {
        Entry entry = new Entry(id, throttleMillis, debounceMillis == 0 ? throttleMillis : debounceMillis, node, callback);
        addToGlobalEntries(entry);
        return entry;
    }

    @NotNull
    public final DelegatableNode.RegistrationHandle registerOnRectChanged(int id, long throttleMillis, long debounceMillis, @NotNull DelegatableNode node, @NotNull InterfaceC6471c callback) {
        return multiPut(this.rectChangedMap, id, new Entry(id, throttleMillis, debounceMillis == 0 ? throttleMillis : debounceMillis, node, callback));
    }

    public final void setGlobalChangeEntries(@Nullable Entry entry) {
        this.globalChangeEntries = entry;
    }

    public final void setMinDebounceDeadline(long j7) {
        this.minDebounceDeadline = j7;
    }

    /* renamed from: setScreenOffset--gyyYBs, reason: not valid java name */
    public final void m12572setScreenOffsetgyyYBs(long j7) {
        this.screenOffset = j7;
    }

    /* renamed from: setViewToWindowMatrix-Q8lPUPs, reason: not valid java name */
    public final void m12573setViewToWindowMatrixQ8lPUPs(@Nullable float[] fArr) {
        this.viewToWindowMatrix = fArr;
    }

    /* renamed from: setWindowOffset--gyyYBs, reason: not valid java name */
    public final void m12574setWindowOffsetgyyYBs(long j7) {
        this.windowOffset = j7;
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
            long r9 = r0.m12567debounceEntryb8qMvQI(r1, r2, r4, r6, r7, r9)
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
            long r9 = r0.m12567debounceEntryb8qMvQI(r1, r2, r4, r6, r7, r9)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.spatial.ThrottledCallbacks.triggerDebounced(long):void");
    }

    /* renamed from: updateOffsets-bT0EZQs, reason: not valid java name */
    public final boolean m12575updateOffsetsbT0EZQs(long screen, long window, @Nullable float[] matrix) {
        boolean z8;
        if (IntOffset.m13432equalsimpl0(window, this.windowOffset)) {
            z8 = false;
        } else {
            this.windowOffset = window;
            z8 = true;
        }
        if (!IntOffset.m13432equalsimpl0(screen, this.screenOffset)) {
            this.screenOffset = screen;
            z8 = true;
        }
        if (matrix == null) {
            return z8;
        }
        this.viewToWindowMatrix = matrix;
        return true;
    }
}
