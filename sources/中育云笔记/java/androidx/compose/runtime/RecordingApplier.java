package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 0)
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
    public static final int f1130UP = 0;
    private N current;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final MutableIntList operations = new MutableIntList(0, 1, null);
    private final MutableObjectList<Object> instances = new MutableObjectList<>(0, 1, null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public RecordingApplier(N n10) {
        this.current = n10;
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(InterfaceC9544p interfaceC9544p, Object obj) {
        this.operations.add(7);
        this.instances.add(interfaceC9544p);
        this.instances.add(obj);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        this.operations.add(4);
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n10) {
        this.operations.add(1);
        this.instances.add(n10);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i10, N n10) {
        this.operations.add(5);
        this.operations.add(i10);
        this.instances.add(n10);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i10, N n10) {
        this.operations.add(6);
        this.operations.add(i10);
        this.instances.add(n10);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i10, int i11, int i12) {
        this.operations.add(3);
        this.operations.add(i10);
        this.operations.add(i11);
        this.operations.add(i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void playTo(Applier<N> applier) {
        int i10;
        MutableIntList mutableIntList = this.operations;
        int i11 = mutableIntList._size;
        MutableObjectList<Object> mutableObjectList = this.instances;
        applier.onBeginChanges();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i12 + 1;
            try {
                switch (mutableIntList.get(i12)) {
                    case 0:
                        applier.mo1049up();
                        i12 = i14;
                        break;
                    case 1:
                        applier.down(mutableObjectList.get(i13));
                        i13++;
                        i12 = i14;
                        break;
                    case 2:
                        int i15 = i12 + 2;
                        i12 += 3;
                        applier.remove(mutableIntList.get(i14), mutableIntList.get(i15));
                        break;
                    case 3:
                        int i16 = mutableIntList.get(i14);
                        int i17 = i12 + 3;
                        int i18 = mutableIntList.get(i12 + 2);
                        i12 += 4;
                        applier.move(i16, i18, mutableIntList.get(i17));
                        break;
                    case 4:
                        applier.clear();
                        i12 = i14;
                        break;
                    case 5:
                        i12 += 2;
                        i10 = i13 + 1;
                        applier.insertBottomUp(mutableIntList.get(i14), mutableObjectList.get(i13));
                        i13 = i10;
                        break;
                    case 6:
                        i12 += 2;
                        i10 = i13 + 1;
                        applier.insertTopDown(mutableIntList.get(i14), mutableObjectList.get(i13));
                        i13 = i10;
                        break;
                    case 7:
                        int i19 = i13 + 1;
                        Object obj = mutableObjectList.get(i13);
                        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                        i13 += 2;
                        applier.apply((InterfaceC9544p) AbstractC9962d0.m20254e(obj, 2), mutableObjectList.get(i19));
                        i12 = i14;
                        break;
                    case 8:
                        applier.reuse();
                        i12 = i14;
                        break;
                    default:
                        i12 = i14;
                        break;
                }
            } catch (Throwable th) {
                applier.onEndChanges();
                throw th;
            }
        }
        if (!(i13 == mutableObjectList.getSize())) {
            ComposerKt.composeImmediateRuntimeError("Applier operation size mismatch");
        }
        mutableObjectList.clear();
        mutableIntList.clear();
        applier.onEndChanges();
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i10, int i11) {
        this.operations.add(2);
        this.operations.add(i10);
        this.operations.add(i11);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        this.operations.add(8);
    }

    public void setCurrent(N n10) {
        this.current = n10;
    }

    @Override // androidx.compose.runtime.Applier
    /* renamed from: up */
    public void mo1049up() {
        this.operations.add(0);
    }
}
