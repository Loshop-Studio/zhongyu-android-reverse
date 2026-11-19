package androidx.compose.foundation.text.selection;

import androidx.camera.core.internal.compat.workaround.C0404a;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.collections.AbstractC5809x;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;
import p152r6.InterfaceC6477i;
import p204y1.AbstractC6768a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 s2\u00020\u0001:\u0001sB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J2\u0010 \u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"JB\u0010(\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u0005R\"\u0010+\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0007048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00109\u001a\u000607j\u0002`88\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010ARB\u0010C\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR6\u0010J\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010ORN\u0010Q\u001a.\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010X\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R0\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010=\u001a\u0004\b_\u0010?\"\u0004\b`\u0010AR0\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010=\u001a\u0004\bb\u0010?\"\u0004\bc\u0010AR7\u0010m\u001a\b\u0012\u0004\u0012\u00020e0d2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020e0d8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00070d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010j\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006t"}, m5110d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "initialIncrementId", "<init>", "(J)V", "()V", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;", "Ld6/s;", "unsubscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)V", "nextSelectableId", "()J", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "", "sort", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;", "selectableId", "notifyPositionChange", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "isInTouchMode", "notifySelectionUpdateStart-ubNVwUQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "(JZ)V", "newPosition", "previousPosition", "isStartHandle", "notifySelectionUpdate-njBpvok", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "notifySelectableChange", "sorted", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "", "_selectables", "Ljava/util/List;", "Landroidx/collection/MutableLongObjectMap;", "_selectableMap", "Landroidx/collection/MutableLongObjectMap;", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "incrementId", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/Function1;", "onPositionChangeCallback", "Lr6/c;", "getOnPositionChangeCallback$foundation_release", "()Lr6/c;", "setOnPositionChangeCallback$foundation_release", "(Lr6/c;)V", "Lkotlin/Function4;", "onSelectionUpdateStartCallback", "Lr6/g;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lr6/g;", "setOnSelectionUpdateStartCallback$foundation_release", "(Lr6/g;)V", "Lkotlin/Function2;", "onSelectionUpdateSelectAll", "Lr6/e;", "getOnSelectionUpdateSelectAll$foundation_release", "()Lr6/e;", "setOnSelectionUpdateSelectAll$foundation_release", "(Lr6/e;)V", "Lkotlin/Function6;", "onSelectionUpdateCallback", "Lr6/i;", "getOnSelectionUpdateCallback$foundation_release", "()Lr6/i;", "setOnSelectionUpdateCallback$foundation_release", "(Lr6/i;)V", "Lkotlin/Function0;", "onSelectionUpdateEndCallback", "Lr6/a;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lr6/a;", "setOnSelectionUpdateEndCallback$foundation_release", "(Lr6/a;)V", "onSelectableChangeCallback", "getOnSelectableChangeCallback$foundation_release", "setOnSelectableChangeCallback$foundation_release", "afterSelectableUnsubscribe", "getAfterSelectableUnsubscribe$foundation_release", "setAfterSelectableUnsubscribe$foundation_release", "Landroidx/collection/LongObjectMap;", "Landroidx/compose/foundation/text/selection/Selection;", "<set-?>", "subselections$delegate", "Landroidx/compose/runtime/MutableState;", "getSubselections", "()Landroidx/collection/LongObjectMap;", "setSubselections", "(Landroidx/collection/LongObjectMap;)V", "subselections", "getSelectables$foundation_release", "()Ljava/util/List;", "selectables", "getSelectableMap$foundation_release", "selectableMap", "Companion", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,217:1\n85#2:218\n113#2,2:219\n96#3,5:221\n96#3,5:226\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n100#1:218\n100#1:219,2\n103#1:221,5\n106#1:226,5\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {

    @NotNull
    private final MutableLongObjectMap<Selectable> _selectableMap;

    @NotNull
    private final List<Selectable> _selectables;

    @Nullable
    private InterfaceC6471c afterSelectableUnsubscribe;

    @NotNull
    private AtomicLong incrementId;

    @Nullable
    private InterfaceC6471c onPositionChangeCallback;

    @Nullable
    private InterfaceC6471c onSelectableChangeCallback;

    @Nullable
    private InterfaceC6477i onSelectionUpdateCallback;

    @Nullable
    private InterfaceC6469a onSelectionUpdateEndCallback;

    @Nullable
    private InterfaceC6473e onSelectionUpdateSelectAll;

    @Nullable
    private InterfaceC6475g onSelectionUpdateStartCallback;
    private boolean sorted;

    /* renamed from: subselections$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState subselections;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Saver<SelectionRegistrarImpl, Long> Saver = SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$1
        @Override // p152r6.InterfaceC6473e
        public final Long invoke(SaverScope saverScope, SelectionRegistrarImpl selectionRegistrarImpl) {
            return Long.valueOf(selectionRegistrarImpl.incrementId.get());
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$2
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }

        public final SelectionRegistrarImpl invoke(long j7) {
            return new SelectionRegistrarImpl(j7, null);
        }
    });

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final Saver<SelectionRegistrarImpl, Long> getSaver() {
            return SelectionRegistrarImpl.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SelectionRegistrarImpl(long j7, AbstractC5824e abstractC5824e) {
        this(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(InterfaceC6473e interfaceC6473e, Object obj, Object obj2) {
        return ((Number) interfaceC6473e.invoke(obj, obj2)).intValue();
    }

    @Nullable
    /* renamed from: getAfterSelectableUnsubscribe$foundation_release, reason: from getter */
    public final InterfaceC6471c getAfterSelectableUnsubscribe() {
        return this.afterSelectableUnsubscribe;
    }

    @Nullable
    /* renamed from: getOnPositionChangeCallback$foundation_release, reason: from getter */
    public final InterfaceC6471c getOnPositionChangeCallback() {
        return this.onPositionChangeCallback;
    }

    @Nullable
    /* renamed from: getOnSelectableChangeCallback$foundation_release, reason: from getter */
    public final InterfaceC6471c getOnSelectableChangeCallback() {
        return this.onSelectableChangeCallback;
    }

    @Nullable
    /* renamed from: getOnSelectionUpdateCallback$foundation_release, reason: from getter */
    public final InterfaceC6477i getOnSelectionUpdateCallback() {
        return this.onSelectionUpdateCallback;
    }

    @Nullable
    /* renamed from: getOnSelectionUpdateEndCallback$foundation_release, reason: from getter */
    public final InterfaceC6469a getOnSelectionUpdateEndCallback() {
        return this.onSelectionUpdateEndCallback;
    }

    @Nullable
    /* renamed from: getOnSelectionUpdateSelectAll$foundation_release, reason: from getter */
    public final InterfaceC6473e getOnSelectionUpdateSelectAll() {
        return this.onSelectionUpdateSelectAll;
    }

    @Nullable
    /* renamed from: getOnSelectionUpdateStartCallback$foundation_release, reason: from getter */
    public final InterfaceC6475g getOnSelectionUpdateStartCallback() {
        return this.onSelectionUpdateStartCallback;
    }

    @NotNull
    public final LongObjectMap<Selectable> getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    @NotNull
    public final List<Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    /* renamed from: getSorted$foundation_release, reason: from getter */
    public final boolean getSorted() {
        return this.sorted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    @NotNull
    public LongObjectMap<Selection> getSubselections() {
        return (LongObjectMap) this.subselections.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long selectableId) {
        this.sorted = false;
        InterfaceC6471c interfaceC6471c = this.onPositionChangeCallback;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long selectableId) {
        InterfaceC6471c interfaceC6471c = this.onSelectableChangeCallback;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-njBpvok */
    public boolean mo8082notifySelectionUpdatenjBpvok(@NotNull LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, @NotNull SelectionAdjustment adjustment, boolean isInTouchMode) {
        InterfaceC6477i interfaceC6477i = this.onSelectionUpdateCallback;
        if (interfaceC6477i != null) {
            return ((Boolean) interfaceC6477i.invoke(Boolean.valueOf(isInTouchMode), layoutCoordinates, Offset.m10430boximpl(newPosition), Offset.m10430boximpl(previousPosition), Boolean.valueOf(isStartHandle), adjustment)).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        InterfaceC6469a interfaceC6469a = this.onSelectionUpdateEndCallback;
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long selectableId, boolean isInTouchMode) {
        InterfaceC6473e interfaceC6473e = this.onSelectionUpdateSelectAll;
        if (interfaceC6473e != null) {
            interfaceC6473e.invoke(Boolean.valueOf(isInTouchMode), Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public void mo8083notifySelectionUpdateStartubNVwUQ(@NotNull LayoutCoordinates layoutCoordinates, long startPosition, @NotNull SelectionAdjustment adjustment, boolean isInTouchMode) {
        InterfaceC6475g interfaceC6475g = this.onSelectionUpdateStartCallback;
        if (interfaceC6475g != null) {
            interfaceC6475g.invoke(Boolean.valueOf(isInTouchMode), layoutCoordinates, Offset.m10430boximpl(startPosition), adjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.afterSelectableUnsubscribe = interfaceC6471c;
    }

    public final void setOnPositionChangeCallback$foundation_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onPositionChangeCallback = interfaceC6471c;
    }

    public final void setOnSelectableChangeCallback$foundation_release(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onSelectableChangeCallback = interfaceC6471c;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(@Nullable InterfaceC6477i interfaceC6477i) {
        this.onSelectionUpdateCallback = interfaceC6477i;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(@Nullable InterfaceC6469a interfaceC6469a) {
        this.onSelectionUpdateEndCallback = interfaceC6469a;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(@Nullable InterfaceC6473e interfaceC6473e) {
        this.onSelectionUpdateSelectAll = interfaceC6473e;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(@Nullable InterfaceC6475g interfaceC6475g) {
        this.onSelectionUpdateStartCallback = interfaceC6475g;
    }

    public final void setSorted$foundation_release(boolean z8) {
        this.sorted = z8;
    }

    public void setSubselections(@NotNull LongObjectMap<Selection> longObjectMap) {
        this.subselections.setValue(longObjectMap);
    }

    @NotNull
    public final List<Selectable> sort(@NotNull final LayoutCoordinates containerLayoutCoordinates) {
        if (!this.sorted) {
            AbstractC5809x.m5289Q(this._selectables, new C0404a(new InterfaceC6473e() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort.1
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public final Integer invoke(Selectable selectable, Selectable selectable2) {
                    LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
                    LayoutCoordinates layoutCoordinates2 = selectable2.getLayoutCoordinates();
                    long jMo12042localPositionOfR5De75A = layoutCoordinates != null ? containerLayoutCoordinates.mo12042localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m10457getZeroF1C5BW0()) : Offset.INSTANCE.m10457getZeroF1C5BW0();
                    long jMo12042localPositionOfR5De75A2 = layoutCoordinates2 != null ? containerLayoutCoordinates.mo12042localPositionOfR5De75A(layoutCoordinates2, Offset.INSTANCE.m10457getZeroF1C5BW0()) : Offset.INSTANCE.m10457getZeroF1C5BW0();
                    int i = (int) (jMo12042localPositionOfR5De75A & 4294967295L);
                    int i8 = (int) (4294967295L & jMo12042localPositionOfR5De75A2);
                    return Integer.valueOf(Float.intBitsToFloat(i) == Float.intBitsToFloat(i8) ? AbstractC6768a.m6441f(Float.valueOf(Float.intBitsToFloat((int) (jMo12042localPositionOfR5De75A >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jMo12042localPositionOfR5De75A2 >> 32)))) : AbstractC6768a.m6441f(Float.valueOf(Float.intBitsToFloat(i)), Float.valueOf(Float.intBitsToFloat(i8))));
                }
            }, 1));
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    @NotNull
    public Selectable subscribe(@NotNull Selectable selectable) {
        if (!(selectable.getSelectableId() != 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("The selectable contains an invalid id: " + selectable.getSelectableId());
        }
        if (this._selectableMap.containsKey(selectable.getSelectableId())) {
            InlineClassHelperKt.throwIllegalArgumentException("Another selectable with the id: " + selectable + ".selectableId has already subscribed.");
        }
        this._selectableMap.set(selectable.getSelectableId(), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(@NotNull Selectable selectable) {
        if (this._selectableMap.containsKey(selectable.getSelectableId())) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(selectable.getSelectableId());
            InterfaceC6471c interfaceC6471c = this.afterSelectableUnsubscribe;
            if (interfaceC6471c != null) {
                interfaceC6471c.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }

    private SelectionRegistrarImpl(long j7) {
        this._selectables = new ArrayList();
        this._selectableMap = LongObjectMapKt.mutableLongObjectMapOf();
        this.incrementId = new AtomicLong(j7);
        this.subselections = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LongObjectMapKt.emptyLongObjectMap(), null, 2, null);
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }
}
