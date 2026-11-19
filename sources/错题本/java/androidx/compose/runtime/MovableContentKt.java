package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;
import p152r6.InterfaceC6476h;
import p152r6.InterfaceC6477i;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a=\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u00062\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\b\u001aO\u0010\u0004\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2\u001d\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\f\u001aa\u0010\u0004\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\r2#\u0010\u0003\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u000f\u001as\u0010\u0004\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00102)\u0010\u0003\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002¢\u0006\u0004\b\u0004\u0010\u0012\u001aG\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014\"\u0004\b\u0000\u0010\u00132\u001c\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0015\u0010\b\u001aY\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u00062\"\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0015\u0010\f\u001ak\u0010\u0015\u001a$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\n2(\u0010\u0003\u001a$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0015\u0010\u000f\u001a}\u0010\u0015\u001a*\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\n\"\u0004\b\u0003\u0010\r2.\u0010\u0003\u001a*\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0015\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00168\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m5110d2 = {"Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "movableContentOf", "(Lr6/e;)Lr6/e;", "P", "Lkotlin/Function1;", "(Lr6/f;)Lr6/f;", "P1", "P2", "Lkotlin/Function2;", "(Lr6/g;)Lr6/g;", "P3", "Lkotlin/Function3;", "(Lr6/h;)Lr6/h;", "P4", "Lkotlin/Function4;", "(Lr6/i;)Lr6/i;", "R", "Lkotlin/ExtensionFunctionType;", "movableContentWithReceiverOf", "", "movableContentKey", "I", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MovableContentKt {
    public static final int movableContentKey = 126665345;

    @NotNull
    public static final InterfaceC6473e movableContentOf(@NotNull final InterfaceC6473e interfaceC6473e) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-514040016, true, new InterfaceC6474f() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Void) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(Void r32, Composer composer, int i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-514040016, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:36)");
                }
                interfaceC6473e.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-642339857, true, new InterfaceC6473e() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.1
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(Composer composer, int i) {
                if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-642339857, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
                }
                composer.insertMovableContent(movableContent, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @ComposableInferredTarget(scheme = "[0[0]:[_]]")
    @NotNull
    public static final <R> InterfaceC6474f movableContentWithReceiverOf(@NotNull final InterfaceC6474f interfaceC6474f) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(250838178, true, new InterfaceC6474f() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$1
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((MovableContentKt$movableContentWithReceiverOf$movableContent$1) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(R r, Composer composer, int i) {
                if ((i & 6) == 0) {
                    i |= (i & 8) == 0 ? composer.changed(r) : composer.changedInstance(r) ? 4 : 2;
                }
                if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(250838178, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:159)");
                }
                interfaceC6474f.invoke(r, composer, Integer.valueOf(i & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(506997506, true, new InterfaceC6474f() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C19971) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(R r, Composer composer, int i) {
                if ((i & 6) == 0) {
                    i |= (i & 8) == 0 ? composer.changed(r) : composer.changedInstance(r) ? 4 : 2;
                }
                if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(506997506, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:160)");
                }
                composer.insertMovableContent(movableContent, r);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <P> InterfaceC6474f movableContentOf(@NotNull InterfaceC6474f interfaceC6474f) {
        final MovableContent movableContent = new MovableContent(interfaceC6474f);
        return ComposableLambdaKt.composableLambdaInstance(-434707029, true, new InterfaceC6474f() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C19932) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(P p6, Composer composer, int i) {
                if ((i & 6) == 0) {
                    i |= (i & 8) == 0 ? composer.changed(p6) : composer.changedInstance(p6) ? 4 : 2;
                }
                if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-434707029, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:59)");
                }
                composer.insertMovableContent(movableContent, p6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <R, P> InterfaceC6475g movableContentWithReceiverOf(@NotNull final InterfaceC6475g interfaceC6475g) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(812082854, true, new InterfaceC6474f() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$2
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Pair) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(Pair<? extends R, ? extends P> pair, Composer composer, int i) {
                if ((i & 6) == 0) {
                    i |= (i & 8) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2;
                }
                if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(812082854, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:183)");
                }
                interfaceC6475g.invoke(pair.getFirst(), pair.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(627354118, true, new InterfaceC6475g() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p152r6.InterfaceC6475g
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((C19982) obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(R r, P p6, Composer composer, int i) {
                int i8;
                if ((i & 6) == 0) {
                    i8 = ((i & 8) == 0 ? composer.changed(r) : composer.changedInstance(r) ? 4 : 2) | i;
                } else {
                    i8 = i;
                }
                if ((i & 48) == 0) {
                    i8 |= (i & 64) == 0 ? composer.changed(p6) : composer.changedInstance(p6) ? 32 : 16;
                }
                if (!composer.shouldExecute((i8 & 147) != 146, i8 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(627354118, i8, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:184)");
                }
                composer.insertMovableContent(movableContent, new Pair(r, p6));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <P1, P2> InterfaceC6475g movableContentOf(@NotNull final InterfaceC6475g interfaceC6475g) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(1849814513, true, new InterfaceC6474f() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$2
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Pair) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(Pair<? extends P1, ? extends P2> pair, Composer composer, int i) {
                if ((i & 6) == 0) {
                    i |= (i & 8) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2;
                }
                if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1849814513, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:80)");
                }
                interfaceC6475g.invoke(pair.getFirst(), pair.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1200019734, true, new InterfaceC6475g() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p152r6.InterfaceC6475g
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((C19943) obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(P1 p1, P2 p22, Composer composer, int i) {
                int i8;
                if ((i & 6) == 0) {
                    i8 = ((i & 8) == 0 ? composer.changed(p1) : composer.changedInstance(p1) ? 4 : 2) | i;
                } else {
                    i8 = i;
                }
                if ((i & 48) == 0) {
                    i8 |= (i & 64) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 32 : 16;
                }
                if (!composer.shouldExecute((i8 & 147) != 146, i8 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1200019734, i8, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:81)");
                }
                composer.insertMovableContent(movableContent, new Pair(p1, p22));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <R, P1, P2> InterfaceC6476h movableContentWithReceiverOf(@NotNull final InterfaceC6476h interfaceC6476h) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(457013028, true, new InterfaceC6474f() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$3
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Triple) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(Triple<? extends R, ? extends P1, ? extends P2> triple, Composer composer, int i) {
                if ((i & 6) == 0) {
                    i |= (i & 8) == 0 ? composer.changed(triple) : composer.changedInstance(triple) ? 4 : 2;
                }
                if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(457013028, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:207)");
                }
                interfaceC6476h.invoke(triple.getFirst(), triple.getSecond(), triple.getThird(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(583402949, true, new InterfaceC6476h() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            @Override // p152r6.InterfaceC6476h
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                invoke((C19993) obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(R r, P1 p1, P2 p22, Composer composer, int i) {
                int i8;
                if ((i & 6) == 0) {
                    i8 = ((i & 8) == 0 ? composer.changed(r) : composer.changedInstance(r) ? 4 : 2) | i;
                } else {
                    i8 = i;
                }
                if ((i & 48) == 0) {
                    i8 |= (i & 64) == 0 ? composer.changed(p1) : composer.changedInstance(p1) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i8 |= (i & 512) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 256 : 128;
                }
                if (!composer.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(583402949, i8, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:208)");
                }
                composer.insertMovableContent(movableContent, new Triple(r, p1, p22));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <P1, P2, P3> InterfaceC6476h movableContentOf(@NotNull final InterfaceC6476h interfaceC6476h) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1512228753, true, new InterfaceC6474f() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$3
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Triple) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(Triple<? extends P1, ? extends P2, ? extends P3> triple, Composer composer, int i) {
                if ((i & 6) == 0) {
                    i |= (i & 8) == 0 ? composer.changed(triple) : composer.changedInstance(triple) ? 4 : 2;
                }
                if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1512228753, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:105)");
                }
                interfaceC6476h.invoke(triple.getFirst(), triple.getSecond(), triple.getThird(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1083870185, true, new InterfaceC6476h() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            @Override // p152r6.InterfaceC6476h
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                invoke((C19954) obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(P1 p1, P2 p22, P3 p32, Composer composer, int i) {
                int i8;
                if ((i & 6) == 0) {
                    i8 = ((i & 8) == 0 ? composer.changed(p1) : composer.changedInstance(p1) ? 4 : 2) | i;
                } else {
                    i8 = i;
                }
                if ((i & 48) == 0) {
                    i8 |= (i & 64) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i8 |= (i & 512) == 0 ? composer.changed(p32) : composer.changedInstance(p32) ? 256 : 128;
                }
                if (!composer.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1083870185, i8, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:107)");
                }
                composer.insertMovableContent(movableContent, new Triple(p1, p22, p32));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <R, P1, P2, P3> InterfaceC6477i movableContentWithReceiverOf(@NotNull final InterfaceC6477i interfaceC6477i) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(226809633, true, new InterfaceC6474f() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$4
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Object[]) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(Object[] objArr, Composer composer, int i) {
                if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(226809633, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:233)");
                }
                interfaceC6477i.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(1468683306, true, new InterfaceC6477i() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            @Override // p152r6.InterfaceC6477i
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((C20004) obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(R r, P1 p1, P2 p22, P3 p32, Composer composer, int i) {
                int i8;
                if ((i & 6) == 0) {
                    i8 = ((i & 8) == 0 ? composer.changed(r) : composer.changedInstance(r) ? 4 : 2) | i;
                } else {
                    i8 = i;
                }
                if ((i & 48) == 0) {
                    i8 |= (i & 64) == 0 ? composer.changed(p1) : composer.changedInstance(p1) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i8 |= (i & 512) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i8 |= (i & 4096) == 0 ? composer.changed(p32) : composer.changedInstance(p32) ? 2048 : 1024;
                }
                if (!composer.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1468683306, i8, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:237)");
                }
                composer.insertMovableContent(movableContent, new Object[]{r, p1, p22, p32});
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @NotNull
    public static final <P1, P2, P3, P4> InterfaceC6477i movableContentOf(@NotNull final InterfaceC6477i interfaceC6477i) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1900160788, true, new InterfaceC6474f() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$4
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Object[]) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(Object[] objArr, Composer composer, int i) {
                if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1900160788, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:133)");
                }
                interfaceC6477i.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1741877681, true, new InterfaceC6477i() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            @Override // p152r6.InterfaceC6477i
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((C19965) obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(P1 p1, P2 p22, P3 p32, P4 p42, Composer composer, int i) {
                int i8;
                if ((i & 6) == 0) {
                    i8 = ((i & 8) == 0 ? composer.changed(p1) : composer.changedInstance(p1) ? 4 : 2) | i;
                } else {
                    i8 = i;
                }
                if ((i & 48) == 0) {
                    i8 |= (i & 64) == 0 ? composer.changed(p22) : composer.changedInstance(p22) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i8 |= (i & 512) == 0 ? composer.changed(p32) : composer.changedInstance(p32) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i8 |= (i & 4096) == 0 ? composer.changed(p42) : composer.changedInstance(p42) ? 2048 : 1024;
                }
                if (!composer.shouldExecute((i8 & 9363) != 9362, i8 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741877681, i8, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:137)");
                }
                composer.insertMovableContent(movableContent, new Object[]{p1, p22, p32, p42});
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }
}
