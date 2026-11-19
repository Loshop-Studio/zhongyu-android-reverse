package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9546r;
import p181hd.InterfaceC9547s;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class LazyDslKt {

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$1 */
    public static final class C14971 extends Lambda implements InterfaceC9540l {
        public static final C14971 INSTANCE = new C14971();

        public C14971() {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$2 */
    public static final class C14982 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC9540l $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14982(InterfaceC9540l interfaceC9540l, List<? extends T> list) {
            super(1);
            this.$key = interfaceC9540l;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.$key.invoke(this.$items.get(i10));
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$3 */
    public static final class C14993 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14993(InterfaceC9540l interfaceC9540l, List<? extends T> list) {
            super(1);
            this.$contentType = interfaceC9540l;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.$contentType.invoke(this.$items.get(i10));
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$4 */
    public static final class C15004 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9546r $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15004(InterfaceC9546r interfaceC9546r, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC9546r;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyItemScope) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if (!composer.shouldExecute((i12 & 147) != 146, i12 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items.get(i10), composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$5 */
    public static final class C15015 extends Lambda implements InterfaceC9540l {
        public static final C15015 INSTANCE = new C15015();

        public C15015() {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$6 */
    public static final class C15026 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC9540l $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15026(InterfaceC9540l interfaceC9540l, T[] tArr) {
            super(1);
            this.$key = interfaceC9540l;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.$key.invoke(this.$items[i10]);
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$7 */
    public static final class C15037 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15037(InterfaceC9540l interfaceC9540l, T[] tArr) {
            super(1);
            this.$contentType = interfaceC9540l;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.$contentType.invoke(this.$items[i10]);
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$8 */
    public static final class C15048 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9546r $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15048(InterfaceC9546r interfaceC9546r, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC9546r;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyItemScope) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if (!composer.shouldExecute((i12 & 147) != 146, i12 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1043393750, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:250)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items[i10], composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2 */
    public static final class C15062 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC9544p $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15062(InterfaceC9544p interfaceC9544p, List<? extends T> list) {
            super(1);
            this.$key = interfaceC9544p;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.$key.invoke(Integer.valueOf(i10), this.$items.get(i10));
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3 */
    public static final class C15073 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9544p $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15073(InterfaceC9544p interfaceC9544p, List<? extends T> list) {
            super(1);
            this.$contentType = interfaceC9544p;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.$contentType.invoke(Integer.valueOf(i10), this.$items.get(i10));
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4 */
    public static final class C15084 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9547s $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15084(InterfaceC9547s interfaceC9547s, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC9547s;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyItemScope) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if (!composer.shouldExecute((i12 & 147) != 146, i12 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i10), this.$items.get(i10), composer, Integer.valueOf(i12 & Opcodes.IAND));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6 */
    public static final class C15106 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC9544p $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15106(InterfaceC9544p interfaceC9544p, T[] tArr) {
            super(1);
            this.$key = interfaceC9544p;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.$key.invoke(Integer.valueOf(i10), this.$items[i10]);
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7 */
    public static final class C15117 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9544p $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15117(InterfaceC9544p interfaceC9544p, T[] tArr) {
            super(1);
            this.$contentType = interfaceC9544p;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.$contentType.invoke(Integer.valueOf(i10), this.$items[i10]);
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8 */
    public static final class C15128 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9547s $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15128(InterfaceC9547s interfaceC9547s, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC9547s;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyItemScope) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.changed(i10) ? 32 : 16;
            }
            if (!composer.shouldExecute((i12 & 147) != 146, i12 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600639390, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:286)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i10), this.$items[i10], composer, Integer.valueOf(i12 & Opcodes.IAND));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyColumn(androidx.compose.p014ui.Modifier r31, androidx.compose.foundation.lazy.LazyListState r32, androidx.compose.foundation.layout.PaddingValues r33, boolean r34, androidx.compose.foundation.layout.Arrangement.Vertical r35, androidx.compose.ui.Alignment.Horizontal r36, androidx.compose.foundation.gestures.FlingBehavior r37, boolean r38, androidx.compose.foundation.OverscrollEffect r39, final p181hd.InterfaceC9540l r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyRow(androidx.compose.p014ui.Modifier r31, androidx.compose.foundation.lazy.LazyListState r32, androidx.compose.foundation.layout.PaddingValues r33, boolean r34, androidx.compose.foundation.layout.Arrangement.Horizontal r35, androidx.compose.ui.Alignment.Vertical r36, androidx.compose.foundation.gestures.FlingBehavior r37, boolean r38, androidx.compose.foundation.OverscrollEffect r39, final p181hd.InterfaceC9540l r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r) {
        lazyListScope.items(list.size(), interfaceC9540l != null ? new C14982(interfaceC9540l, list) : null, new C14993(interfaceC9540l2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C15004(interfaceC9546r, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9540l2 = C14971.INSTANCE;
        }
        lazyListScope.items(list.size(), interfaceC9540l != null ? new C14982(interfaceC9540l, list) : null, new C14993(interfaceC9540l2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C15004(interfaceC9546r, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9547s interfaceC9547s) {
        lazyListScope.items(list.size(), interfaceC9544p != null ? new C15062(interfaceC9544p, list) : null, new C15073(interfaceC9544p2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C15084(interfaceC9547s, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9547s interfaceC9547s, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9544p = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9544p2 = new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyListScope.items(list.size(), interfaceC9544p != null ? new C15062(interfaceC9544p, list) : null, new C15073(interfaceC9544p2, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C15084(interfaceC9547s, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyListScope lazyListScope, T[] tArr, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r) {
        lazyListScope.items(tArr.length, interfaceC9540l != null ? new C15026(interfaceC9540l, tArr) : null, new C15037(interfaceC9540l2, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new C15048(interfaceC9546r, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9547s interfaceC9547s) {
        lazyListScope.items(tArr.length, interfaceC9544p != null ? new C15106(interfaceC9544p, tArr) : null, new C15117(interfaceC9544p2, tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C15128(interfaceC9547s, tArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9540l2 = C15015.INSTANCE;
        }
        lazyListScope.items(objArr.length, interfaceC9540l != null ? new C15026(interfaceC9540l, objArr) : null, new C15037(interfaceC9540l2, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new C15048(interfaceC9546r, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9547s interfaceC9547s, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9544p = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9544p2 = new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyListScope.items(objArr.length, interfaceC9544p != null ? new C15106(interfaceC9544p, objArr) : null, new C15117(interfaceC9544p2, objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C15128(interfaceC9547s, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, InterfaceC9540l interfaceC9540l, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        lazyListScope.items(list.size(), interfaceC9540l != null ? new C14982(interfaceC9540l, list) : null, new C14993(C14971.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C15004(interfaceC9546r, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, InterfaceC9544p interfaceC9544p, InterfaceC9547s interfaceC9547s, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9544p = null;
        }
        lazyListScope.items(list.size(), interfaceC9544p != null ? new C15062(interfaceC9544p, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C15084(interfaceC9547s, list)));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.p014ui.Modifier r25, androidx.compose.foundation.lazy.LazyListState r26, androidx.compose.foundation.layout.PaddingValues r27, boolean r28, androidx.compose.foundation.layout.Arrangement.Vertical r29, androidx.compose.ui.Alignment.Horizontal r30, androidx.compose.foundation.gestures.FlingBehavior r31, boolean r32, final p181hd.InterfaceC9540l r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.p014ui.Modifier r25, androidx.compose.foundation.lazy.LazyListState r26, androidx.compose.foundation.layout.PaddingValues r27, boolean r28, androidx.compose.foundation.layout.Arrangement.Horizontal r29, androidx.compose.ui.Alignment.Vertical r30, androidx.compose.foundation.gestures.FlingBehavior r31, boolean r32, final p181hd.InterfaceC9540l r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, InterfaceC9544p interfaceC9544p, InterfaceC9547s interfaceC9547s, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9544p = null;
        }
        lazyListScope.items(objArr.length, interfaceC9544p != null ? new C15106(interfaceC9544p, objArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C15128(interfaceC9547s, objArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, InterfaceC9540l interfaceC9540l, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        lazyListScope.items(objArr.length, interfaceC9540l != null ? new C15026(interfaceC9540l, objArr) : null, new C15037(C15015.INSTANCE, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new C15048(interfaceC9546r, objArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.p014ui.Modifier r24, androidx.compose.foundation.lazy.LazyListState r25, androidx.compose.foundation.layout.PaddingValues r26, boolean r27, androidx.compose.foundation.layout.Arrangement.Vertical r28, androidx.compose.ui.Alignment.Horizontal r29, androidx.compose.foundation.gestures.FlingBehavior r30, final p181hd.InterfaceC9540l r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.p014ui.Modifier r24, androidx.compose.foundation.lazy.LazyListState r25, androidx.compose.foundation.layout.PaddingValues r26, boolean r27, androidx.compose.foundation.layout.Arrangement.Horizontal r28, androidx.compose.ui.Alignment.Vertical r29, androidx.compose.foundation.gestures.FlingBehavior r30, final p181hd.InterfaceC9540l r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
