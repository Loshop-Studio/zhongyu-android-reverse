package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.C5903b0;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\n\u001a'\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0016\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/m0;", "Lh6/h;", "context", "Landroidx/compose/runtime/State;", "collectAsState", "(Lkotlinx/coroutines/flow/m0;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "R", "Lkotlinx/coroutines/flow/f;", "initial", "(Lkotlinx/coroutines/flow/f;Ljava/lang/Object;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "block", "snapshotFlow", "(Lr6/a;)Lkotlinx/coroutines/flow/f;", "Landroidx/collection/MutableScatterSet;", "", "", "set", "", "intersects$SnapshotStateKt__SnapshotFlowKt", "(Landroidx/collection/MutableScatterSet;Ljava/util/Set;)Z", "intersects", "runtime_release"}, m5111k = 5, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,179:1\n1247#2,6:180\n256#3,2:186\n231#3,3:188\n200#3,7:191\n211#3,3:199\n214#3,9:203\n234#3:212\n258#3:213\n1399#4:198\n1270#4:202\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n65#1:180,6\n178#1:186,2\n178#1:188,3\n178#1:191,7\n178#1:199,3\n178#1:203,9\n178#1:212\n178#1:213\n178#1:198\n178#1:202\n*E\n"})
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/g;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/g;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", m5303f = "SnapshotFlow.kt", m5304i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m5305l = {142, 146, 169}, m5306m = "invokeSuspend", m5307n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,179:1\n148#2,5:180\n148#2,5:185\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n137#1:180,5\n161#1:185,5\n*E\n"})
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 */
    public static final class C20221 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6469a $block;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20221(InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super C20221> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$block = interfaceC6469a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C20221 c20221 = new C20221(this.$block, interfaceC5631c);
            c20221.L$0 = obj;
            return c20221;
        }

        /* JADX WARN: Path cross not found for [B:34:0x00e0, B:38:0x00e9], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:42:0x00f8, B:58:0x0137], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:58:0x0137, B:42:0x00f8], limit reached: 75 */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f8 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:32:0x00dc, B:34:0x00e0, B:39:0x00ea, B:42:0x00f8, B:46:0x010e, B:48:0x0117, B:56:0x0133, B:57:0x0136, B:15:0x004e, B:43:0x0103, B:45:0x010b, B:54:0x012f, B:55:0x0132), top: B:71:0x004e, inners: #3 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 333
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.C20221.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC5912g interfaceC5912g, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C20221) create(interfaceC5912g, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsState(@NotNull InterfaceC5944m0 interfaceC5944m0, @Nullable InterfaceC5636h interfaceC5636h, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        }
        InterfaceC5636h interfaceC5636h2 = interfaceC5636h;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:48)");
        }
        State<T> stateCollectAsState = SnapshotStateKt.collectAsState(interfaceC5944m0, interfaceC5944m0.getValue(), interfaceC5636h2, composer, (i & 14) | ((i << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean intersects$SnapshotStateKt__SnapshotFlowKt(androidx.collection.MutableScatterSet<java.lang.Object> r13, java.util.Set<? extends java.lang.Object> r14) {
        /*
            java.lang.Object[] r0 = r13.elements
            long[] r13 = r13.metadata
            int r1 = r13.length
            int r1 = r1 + (-2)
            r2 = 0
            if (r1 < 0) goto L48
            r3 = r2
        Lb:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L43
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L41
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3d
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            boolean r9 = r14.contains(r9)
            if (r9 == 0) goto L3d
            r13 = 1
            return r13
        L3d:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L41:
            if (r6 != r7) goto L48
        L43:
            if (r3 == r1) goto L48
            int r3 = r3 + 1
            goto Lb
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.intersects$SnapshotStateKt__SnapshotFlowKt(androidx.collection.MutableScatterSet, java.util.Set):boolean");
    }

    @NotNull
    public static final <T> InterfaceC5910f snapshotFlow(@NotNull InterfaceC6469a interfaceC6469a) {
        return new C5903b0(new C20221(interfaceC6469a, null));
    }

    @Composable
    @NotNull
    public static final <T extends R, R> State<R> collectAsState(@NotNull InterfaceC5910f interfaceC5910f, R r, @Nullable InterfaceC5636h interfaceC5636h, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 2) != 0) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        }
        InterfaceC5636h interfaceC5636h2 = interfaceC5636h;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:64)");
        }
        boolean zChangedInstance = composer.changedInstance(interfaceC5636h2) | composer.changedInstance(interfaceC5910f);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(interfaceC5636h2, interfaceC5910f, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        State<R> stateProduceState = SnapshotStateKt.produceState(r, interfaceC5910f, interfaceC5636h2, (InterfaceC6473e) objRememberedValue, composer, ((i >> 3) & 14) | ((i << 3) & 112) | (i & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateProduceState;
    }
}
