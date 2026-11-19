package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Pair;
import kotlin.Triple;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p181hd.InterfaceC9547s;
import p181hd.InterfaceC9548t;
import p309qc.AbstractC10776g;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class MovableContentKt {
    public static final int movableContentKey = 126665345;

    public static final InterfaceC9544p movableContentOf(final InterfaceC9544p interfaceC9544p) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-514040016, true, new InterfaceC9545q() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Void) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(Void r32, Composer composer, int i10) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-514040016, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:36)");
                }
                interfaceC9544p.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-642339857, true, new InterfaceC9544p() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.1
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(Composer composer, int i10) {
                if (!composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-642339857, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
                }
                composer.insertMovableContent(movableContent, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @ComposableInferredTarget(scheme = "[0[0]:[_]]")
    public static final <R> InterfaceC9545q movableContentWithReceiverOf(final InterfaceC9545q interfaceC9545q) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(250838178, true, new InterfaceC9545q() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$1
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((MovableContentKt$movableContentWithReceiverOf$movableContent$1) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(R r10, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.changed(r10) : composer.changedInstance(r10) ? 4 : 2;
                }
                if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(250838178, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:159)");
                }
                interfaceC9545q.invoke(r10, composer, Integer.valueOf(i10 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(506997506, true, new InterfaceC9545q() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C25561) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(R r10, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.changed(r10) : composer.changedInstance(r10) ? 4 : 2;
                }
                if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(506997506, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:160)");
                }
                composer.insertMovableContent(movableContent, r10);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P> InterfaceC9545q movableContentOf(InterfaceC9545q interfaceC9545q) {
        final MovableContent movableContent = new MovableContent(interfaceC9545q);
        return ComposableLambdaKt.composableLambdaInstance(-434707029, true, new InterfaceC9545q() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C25522) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(P p10, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.changed(p10) : composer.changedInstance(p10) ? 4 : 2;
                }
                if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-434707029, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:59)");
                }
                composer.insertMovableContent(movableContent, p10);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <R, P> InterfaceC9546r movableContentWithReceiverOf(final InterfaceC9546r interfaceC9546r) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(812082854, true, new InterfaceC9545q() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$2
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Pair) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(Pair<? extends R, ? extends P> pair, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2;
                }
                if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(812082854, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:183)");
                }
                interfaceC9546r.invoke(pair.m20051f(), pair.m20052g(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(627354118, true, new InterfaceC9546r() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((C25572) obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(R r10, P p10, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? composer.changed(r10) : composer.changedInstance(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? composer.changed(p10) : composer.changedInstance(p10) ? 32 : 16;
                }
                if (!composer.shouldExecute((i11 & 147) != 146, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(627354118, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:184)");
                }
                composer.insertMovableContent(movableContent, AbstractC10776g.m22975a(r10, p10));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P1, P2> InterfaceC9546r movableContentOf(final InterfaceC9546r interfaceC9546r) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(1849814513, true, new InterfaceC9545q() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$2
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Pair) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(Pair<? extends P1, ? extends P2> pair, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2;
                }
                if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1849814513, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:80)");
                }
                interfaceC9546r.invoke(pair.m20051f(), pair.m20052g(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1200019734, true, new InterfaceC9546r() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((C25533) obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? composer.changed(p12) : composer.changedInstance(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 32 : 16;
                }
                if (!composer.shouldExecute((i11 & 147) != 146, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1200019734, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:81)");
                }
                composer.insertMovableContent(movableContent, AbstractC10776g.m22975a(p12, p22));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <R, P1, P2> InterfaceC9547s movableContentWithReceiverOf(final InterfaceC9547s interfaceC9547s) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(457013028, true, new InterfaceC9545q() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$3
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Triple) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(Triple<? extends R, ? extends P1, ? extends P2> triple, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.changed(triple) : composer.changedInstance(triple) ? 4 : 2;
                }
                if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(457013028, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:207)");
                }
                interfaceC9547s.invoke(triple.m20065e(), triple.m20066f(), triple.m20067g(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(583402949, true, new InterfaceC9547s() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            @Override // p181hd.InterfaceC9547s
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                invoke((C25583) obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(R r10, P1 p12, P2 p22, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? composer.changed(r10) : composer.changedInstance(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? composer.changed(p12) : composer.changedInstance(p12) ? 32 : 16;
                }
                if ((i10 & 384) == 0) {
                    i11 |= (i10 & 512) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 256 : 128;
                }
                if (!composer.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(583402949, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:208)");
                }
                composer.insertMovableContent(movableContent, new Triple(r10, p12, p22));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P1, P2, P3> InterfaceC9547s movableContentOf(final InterfaceC9547s interfaceC9547s) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1512228753, true, new InterfaceC9545q() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$3
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Triple) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(Triple<? extends P1, ? extends P2, ? extends P3> triple, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.changed(triple) : composer.changedInstance(triple) ? 4 : 2;
                }
                if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1512228753, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:105)");
                }
                interfaceC9547s.invoke(triple.m20065e(), triple.m20066f(), triple.m20067g(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1083870185, true, new InterfaceC9547s() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            @Override // p181hd.InterfaceC9547s
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                invoke((C25544) obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, P3 p32, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? composer.changed(p12) : composer.changedInstance(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 32 : 16;
                }
                if ((i10 & 384) == 0) {
                    i11 |= (i10 & 512) == 0 ? composer.changed(p32) : composer.changedInstance(p32) ? 256 : 128;
                }
                if (!composer.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1083870185, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:107)");
                }
                composer.insertMovableContent(movableContent, new Triple(p12, p22, p32));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <R, P1, P2, P3> InterfaceC9548t movableContentWithReceiverOf(final InterfaceC9548t interfaceC9548t) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(226809633, true, new InterfaceC9545q() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$4
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Object[]) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(Object[] objArr, Composer composer, int i10) {
                if (!composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(226809633, i10, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:233)");
                }
                interfaceC9548t.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(1468683306, true, new InterfaceC9548t() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            @Override // p181hd.InterfaceC9548t
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((C25594) obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(R r10, P1 p12, P2 p22, P3 p32, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? composer.changed(r10) : composer.changedInstance(r10) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? composer.changed(p12) : composer.changedInstance(p12) ? 32 : 16;
                }
                if ((i10 & 384) == 0) {
                    i11 |= (i10 & 512) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 256 : 128;
                }
                if ((i10 & 3072) == 0) {
                    i11 |= (i10 & 4096) == 0 ? composer.changed(p32) : composer.changedInstance(p32) ? 2048 : 1024;
                }
                if (!composer.shouldExecute((i11 & 9363) != 9362, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1468683306, i11, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:237)");
                }
                composer.insertMovableContent(movableContent, new Object[]{r10, p12, p22, p32});
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P1, P2, P3, P4> InterfaceC9548t movableContentOf(final InterfaceC9548t interfaceC9548t) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1900160788, true, new InterfaceC9545q() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$4
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Object[]) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(Object[] objArr, Composer composer, int i10) {
                if (!composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1900160788, i10, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:133)");
                }
                interfaceC9548t.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1741877681, true, new InterfaceC9548t() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            @Override // p181hd.InterfaceC9548t
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((C25555) obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(P1 p12, P2 p22, P3 p32, P4 p42, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? composer.changed(p12) : composer.changedInstance(p12) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 32 : 16;
                }
                if ((i10 & 384) == 0) {
                    i11 |= (i10 & 512) == 0 ? composer.changed(p32) : composer.changedInstance(p32) ? 256 : 128;
                }
                if ((i10 & 3072) == 0) {
                    i11 |= (i10 & 4096) == 0 ? composer.changed(p42) : composer.changedInstance(p42) ? 2048 : 1024;
                }
                if (!composer.shouldExecute((i11 & 9363) != 9362, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741877681, i11, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:137)");
                }
                composer.insertMovableContent(movableContent, new Object[]{p12, p22, p32, p42});
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }
}
