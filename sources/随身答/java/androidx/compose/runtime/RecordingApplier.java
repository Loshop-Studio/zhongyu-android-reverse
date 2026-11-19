package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 '*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001'B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J3\u0010\u000f\u001a\u00020\u00102\u001f\u0010\u0011\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0002\b\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ \u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0014\u0010\"\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001aH\u0016J\b\u0010%\u001a\u00020\u0010H\u0016J\b\u0010&\u001a\u00020\u0010H\u0016R\u001c\u0010\u0005\u001a\u00028\u0000X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m13413d2 = {"Landroidx/compose/runtime/RecordingApplier;", "N", "Landroidx/compose/runtime/Applier;", "root", "(Ljava/lang/Object;)V", "current", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "Ljava/lang/Object;", "instances", "Landroidx/collection/MutableObjectList;", "", "operations", "Landroidx/collection/MutableIntList;", "apply", "", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "value", "clear", "down", "node", "insertBottomUp", "index", "", "instance", "(ILjava/lang/Object;)V", "insertTopDown", "move", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "count", "playTo", "applier", "remove", "reuse", "up", "Companion", "runtime_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPausableComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n+ 2 IntList.kt\nandroidx/collection/IntListKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,392:1\n905#2:393\n1516#3:394\n65#4:395\n4643#5,5:396\n*S KotlinDebug\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n*L\n262#1:393\n263#1:394\n319#1:395\n370#1:396,5\n*E\n"})
/* loaded from: classes2.dex */
public final class RecordingApplier<N> implements Applier<N> {
    public static final int APPLY = 7;
    public static final int CLEAR = 4;
    public static final int DOWN = 1;
    public static final int INSERT_BOTTOM_UP = 5;
    public static final int INSERT_TOP_DOWN = 6;
    public static final int MOVE = 3;
    public static final int REMOVE = 2;
    public static final int REUSE = 8;

    /* renamed from: UP */
    public static final int f1115UP = 0;
    private N current;
    public static final int $stable = 8;
    private final MutableIntList operations = new MutableIntList(0, 1, null);
    private final MutableObjectList<Object> instances = new MutableObjectList<>(0, 1, null);

    public RecordingApplier(N n9) {
        this.current = n9;
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(Function2<? super N, Object, Unit> block, Object value) {
        this.operations.add(7);
        this.instances.add(block);
        this.instances.add(value);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        this.operations.add(4);
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N node) {
        this.operations.add(1);
        this.instances.add(node);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, N instance) {
        this.operations.add(5);
        this.operations.add(index);
        this.instances.add(instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, N instance) {
        this.operations.add(6);
        this.operations.add(index);
        this.instances.add(instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to, int count) {
        this.operations.add(3);
        this.operations.add(from);
        this.operations.add(to);
        this.operations.add(count);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void playTo(Applier<N> applier) {
        int i9;
        MutableIntList mutableIntList = this.operations;
        int i10 = mutableIntList._size;
        MutableObjectList<Object> mutableObjectList = this.instances;
        applier.onBeginChanges();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i11 + 1;
            try {
                switch (mutableIntList.get(i11)) {
                    case 0:
                        applier.mo977up();
                        i11 = i13;
                        break;
                    case 1:
                        applier.down(mutableObjectList.get(i12));
                        i12++;
                        i11 = i13;
                        break;
                    case 2:
                        int i14 = i11 + 2;
                        i11 += 3;
                        applier.remove(mutableIntList.get(i13), mutableIntList.get(i14));
                        break;
                    case 3:
                        int i15 = mutableIntList.get(i13);
                        int i16 = i11 + 3;
                        int i17 = mutableIntList.get(i11 + 2);
                        i11 += 4;
                        applier.move(i15, i17, mutableIntList.get(i16));
                        break;
                    case 4:
                        applier.clear();
                        i11 = i13;
                        break;
                    case 5:
                        i11 += 2;
                        i9 = i12 + 1;
                        applier.insertBottomUp(mutableIntList.get(i13), mutableObjectList.get(i12));
                        i12 = i9;
                        break;
                    case 6:
                        i11 += 2;
                        i9 = i12 + 1;
                        applier.insertTopDown(mutableIntList.get(i13), mutableObjectList.get(i12));
                        i12 = i9;
                        break;
                    case 7:
                        int i18 = i12 + 1;
                        Object obj = mutableObjectList.get(i12);
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                        i12 += 2;
                        applier.apply((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 2), mutableObjectList.get(i18));
                        i11 = i13;
                        break;
                    case 8:
                        applier.reuse();
                        i11 = i13;
                        break;
                    default:
                        i11 = i13;
                        break;
                }
            } catch (Throwable th) {
                applier.onEndChanges();
                throw th;
            }
        }
        if (!(i12 == mutableObjectList.getSize())) {
            ComposerKt.composeImmediateRuntimeError("Applier operation size mismatch");
        }
        mutableObjectList.clear();
        mutableIntList.clear();
        applier.onEndChanges();
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        this.operations.add(2);
        this.operations.add(index);
        this.operations.add(count);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        this.operations.add(8);
    }

    public void setCurrent(N n9) {
        this.current = n9;
    }

    @Override // androidx.compose.runtime.Applier
    /* renamed from: up */
    public void mo977up() {
        this.operations.add(0);
    }
}
