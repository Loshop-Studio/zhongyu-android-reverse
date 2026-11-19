package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 /*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J:\u0010\u001e\u001a\u00020\u00072\u001f\u0010\u001c\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0002\b\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\nJ\u001b\u0010\"\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010*\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0005¨\u00060"}, m5110d2 = {"Landroidx/compose/runtime/RecordingApplier;", "N", "Landroidx/compose/runtime/Applier;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "Ld6/s;", "down", "up", "()V", "", "index", "count", "remove", "(II)V", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "move", "(III)V", "clear", "instance", "insertBottomUp", "(ILjava/lang/Object;)V", "insertTopDown", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "block", "value", "apply", "(Lr6/e;Ljava/lang/Object;)V", "reuse", "applier", "playTo", "(Landroidx/compose/runtime/Applier;)V", "Landroidx/collection/MutableIntList;", "operations", "Landroidx/collection/MutableIntList;", "Landroidx/collection/MutableObjectList;", "instances", "Landroidx/collection/MutableObjectList;", "current", "Ljava/lang/Object;", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "Companion", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPausableComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n+ 2 IntList.kt\nandroidx/collection/IntListKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,392:1\n905#2:393\n1516#3:394\n65#4:395\n4643#5,5:396\n*S KotlinDebug\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/RecordingApplier\n*L\n262#1:393\n263#1:394\n319#1:395\n370#1:396,5\n*E\n"})
/* loaded from: classes.dex */
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
    public static final int f791UP = 0;
    private N current;
    public static final int $stable = 8;

    @NotNull
    private final MutableIntList operations = new MutableIntList(0, 1, null);

    @NotNull
    private final MutableObjectList<Object> instances = new MutableObjectList<>(0, 1, null);

    public RecordingApplier(N n4) {
        this.current = n4;
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(@NotNull InterfaceC6473e block, @Nullable Object value) {
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
    public final void playTo(@NotNull Applier<N> applier) {
        int i;
        MutableIntList mutableIntList = this.operations;
        int i8 = mutableIntList._size;
        MutableObjectList<Object> mutableObjectList = this.instances;
        applier.onBeginChanges();
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i9 + 1;
            try {
                switch (mutableIntList.get(i9)) {
                    case 0:
                        applier.mo1095up();
                        i9 = i11;
                        break;
                    case 1:
                        applier.down(mutableObjectList.get(i10));
                        i10++;
                        i9 = i11;
                        break;
                    case 2:
                        int i12 = i9 + 2;
                        i9 += 3;
                        applier.remove(mutableIntList.get(i11), mutableIntList.get(i12));
                        break;
                    case 3:
                        int i13 = mutableIntList.get(i11);
                        int i14 = i9 + 3;
                        int i15 = mutableIntList.get(i9 + 2);
                        i9 += 4;
                        applier.move(i13, i15, mutableIntList.get(i14));
                        break;
                    case 4:
                        applier.clear();
                        i9 = i11;
                        break;
                    case 5:
                        i9 += 2;
                        i = i10 + 1;
                        applier.insertBottomUp(mutableIntList.get(i11), mutableObjectList.get(i10));
                        i10 = i;
                        break;
                    case 6:
                        i9 += 2;
                        i = i10 + 1;
                        applier.insertTopDown(mutableIntList.get(i11), mutableObjectList.get(i10));
                        i10 = i;
                        break;
                    case 7:
                        int i16 = i10 + 1;
                        Object obj = mutableObjectList.get(i10);
                        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                        AbstractC5835p.m5354c(2, obj);
                        i10 += 2;
                        applier.apply((InterfaceC6473e) obj, mutableObjectList.get(i16));
                        i9 = i11;
                        break;
                    case 8:
                        applier.reuse();
                        i9 = i11;
                        break;
                    default:
                        i9 = i11;
                        break;
                }
            } catch (Throwable th) {
                applier.onEndChanges();
                throw th;
            }
        }
        if (i10 != mutableObjectList.getSize()) {
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

    public void setCurrent(N n4) {
        this.current = n4;
    }

    @Override // androidx.compose.runtime.Applier
    /* renamed from: up */
    public void mo1095up() {
        this.operations.add(0);
    }
}
