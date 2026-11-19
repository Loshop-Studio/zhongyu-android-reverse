package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p181hd.InterfaceC9547s;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;

/* loaded from: classes.dex */
public final class LazyGridDslKt {

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10 */
    public static final class C153810 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9546r $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C153810(InterfaceC9546r interfaceC9546r, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC9546r;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i11;
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
                ComposerKt.traceEventStart(407562193, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:616)");
            }
            this.$itemContent.invoke(lazyGridItemScope, this.$items[i10], composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2 */
    public static final class C15392 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC9540l $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15392(InterfaceC9540l interfaceC9540l, List<? extends T> list) {
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

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3 */
    public static final class C15403 extends Lambda implements InterfaceC9544p {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC9544p $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15403(InterfaceC9544p interfaceC9544p, List<? extends T> list) {
            super(2);
            this.$span = interfaceC9544p;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m27579boximpl(m27588invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m27588invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items.get(i10))).m27586unboximpl();
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4 */
    public static final class C15414 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15414(InterfaceC9540l interfaceC9540l, List<? extends T> list) {
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

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5 */
    public static final class C15425 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9546r $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15425(InterfaceC9546r interfaceC9546r, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC9546r;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i11;
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
                ComposerKt.traceEventStart(699646206, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
            }
            this.$itemContent.invoke(lazyGridItemScope, this.$items.get(i10), composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7 */
    public static final class C15447 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC9540l $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15447(InterfaceC9540l interfaceC9540l, T[] tArr) {
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

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8 */
    public static final class C15458 extends Lambda implements InterfaceC9544p {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC9544p $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15458(InterfaceC9544p interfaceC9544p, T[] tArr) {
            super(2);
            this.$span = interfaceC9544p;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m27579boximpl(m27589invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m27589invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items[i10])).m27586unboximpl();
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9 */
    public static final class C15469 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15469(InterfaceC9540l interfaceC9540l, T[] tArr) {
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

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10 */
    public static final class C154810 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9547s $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154810(InterfaceC9547s interfaceC9547s, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC9547s;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i11;
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
                ComposerKt.traceEventStart(-911455938, i12, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:653)");
            }
            this.$itemContent.invoke(lazyGridItemScope, Integer.valueOf(i10), this.$items[i10], composer, Integer.valueOf(i12 & Opcodes.IAND));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2 */
    public static final class C15492 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC9544p $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15492(InterfaceC9544p interfaceC9544p, List<? extends T> list) {
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

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3 */
    public static final class C15503 extends Lambda implements InterfaceC9544p {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ InterfaceC9545q $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15503(InterfaceC9545q interfaceC9545q, List<? extends T> list) {
            super(2);
            this.$span = interfaceC9545q;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m27579boximpl(m27590invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m27590invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i10), this.$items.get(i10))).m27586unboximpl();
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4 */
    public static final class C15514 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9544p $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15514(InterfaceC9544p interfaceC9544p, List<? extends T> list) {
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

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5 */
    public static final class C15525 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9547s $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15525(InterfaceC9547s interfaceC9547s, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC9547s;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyGridItemScope lazyGridItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i11;
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
                ComposerKt.traceEventStart(1229287273, i12, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:579)");
            }
            this.$itemContent.invoke(lazyGridItemScope, Integer.valueOf(i10), this.$items.get(i10), composer, Integer.valueOf(i12 & Opcodes.IAND));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7 */
    public static final class C15547 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC9544p $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15547(InterfaceC9544p interfaceC9544p, T[] tArr) {
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

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8 */
    public static final class C15558 extends Lambda implements InterfaceC9544p {
        final /* synthetic */ T[] $items;
        final /* synthetic */ InterfaceC9545q $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15558(InterfaceC9545q interfaceC9545q, T[] tArr) {
            super(2);
            this.$span = interfaceC9545q;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m27579boximpl(m27591invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m27591invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i10) {
            return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i10), this.$items[i10])).m27586unboximpl();
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9 */
    public static final class C15569 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9544p $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15569(InterfaceC9544p interfaceC9544p, T[] tArr) {
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyHorizontalGrid(final androidx.compose.foundation.lazy.grid.GridCells r31, androidx.compose.p014ui.Modifier r32, androidx.compose.foundation.lazy.grid.LazyGridState r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, androidx.compose.foundation.layout.Arrangement.Horizontal r36, androidx.compose.foundation.layout.Arrangement.Vertical r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.OverscrollEffect r40, final p181hd.InterfaceC9540l r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, hd.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyVerticalGrid(final androidx.compose.foundation.lazy.grid.GridCells r31, androidx.compose.p014ui.Modifier r32, androidx.compose.foundation.lazy.grid.LazyGridState r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, androidx.compose.foundation.layout.Arrangement.Vertical r36, androidx.compose.foundation.layout.Arrangement.Horizontal r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.OverscrollEffect r40, final p181hd.InterfaceC9540l r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, hd.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i10, int i11, int i12) {
        int i13 = i10 - (i12 * (i11 - 1));
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        ArrayList arrayList = new ArrayList(i11);
        int i16 = 0;
        while (i16 < i11) {
            arrayList.add(Integer.valueOf((i16 < i15 ? 1 : 0) + i14));
            i16++;
        }
        return arrayList;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyGridScope lazyGridScope, List<? extends T> list, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r) {
        lazyGridScope.items(list.size(), interfaceC9540l != null ? new C15392(interfaceC9540l, list) : null, interfaceC9544p != null ? new C15403(interfaceC9544p, list) : null, new C15414(interfaceC9540l2, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new C15425(interfaceC9546r, list)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List list, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9544p = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1
                @Override // p181hd.InterfaceC9540l
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(list.size(), interfaceC9540l != null ? new C15392(interfaceC9540l, list) : null, interfaceC9544p != null ? new C15403(interfaceC9544p, list) : null, new C15414(interfaceC9540l2, list), ComposableLambdaKt.composableLambdaInstance(699646206, true, new C15425(interfaceC9546r, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, List<? extends T> list, InterfaceC9544p interfaceC9544p, InterfaceC9545q interfaceC9545q, InterfaceC9544p interfaceC9544p2, InterfaceC9547s interfaceC9547s) {
        lazyGridScope.items(list.size(), interfaceC9544p != null ? new C15492(interfaceC9544p, list) : null, interfaceC9545q != null ? new C15503(interfaceC9545q, list) : null, new C15514(interfaceC9544p2, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C15525(interfaceC9547s, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List list, InterfaceC9544p interfaceC9544p, InterfaceC9545q interfaceC9545q, InterfaceC9544p interfaceC9544p2, InterfaceC9547s interfaceC9547s, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9544p = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9545q = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC9544p2 = new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyGridScope.items(list.size(), interfaceC9544p != null ? new C15492(interfaceC9544p, list) : null, interfaceC9545q != null ? new C15503(interfaceC9545q, list) : null, new C15514(interfaceC9544p2, list), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C15525(interfaceC9547s, list)));
    }

    @Composable
    private static final LazyGridSlotsProvider rememberColumnWidthSums(final GridCells gridCells, final Arrangement.Horizontal horizontal, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-76500289, i10, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i10 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new GridSlotCache(new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m27592invoke0kLqBqw((Density) obj, ((Constraints) obj2).m33460unboximpl());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridSlots m27592invoke0kLqBqw(Density density, long j10) {
                    if (!(Constraints.m33454getMaxWidthimpl(j10) != Integer.MAX_VALUE)) {
                        InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
                    }
                    int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
                    GridCells gridCells2 = gridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] iArrM23921W0 = AbstractC10947g0.m23921W0(gridCells2.calculateCrossAxisCellSizes(density, iM33454getMaxWidthimpl, density.mo27093roundToPx0680j_4(horizontal2.mo27345getSpacingD9Ej5fM())));
                    int[] iArr = new int[iArrM23921W0.length];
                    horizontal2.arrange(density, iM33454getMaxWidthimpl, iArrM23921W0, LayoutDirection.Ltr, iArr);
                    return new LazyGridSlots(iArrM23921W0, iArr);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    @Composable
    private static final LazyGridSlotsProvider rememberRowHeightSums(final GridCells gridCells, final Arrangement.Vertical vertical, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-150818144, i10, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:248)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i10 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new GridSlotCache(new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m27593invoke0kLqBqw((Density) obj, ((Constraints) obj2).m33460unboximpl());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridSlots m27593invoke0kLqBqw(Density density, long j10) {
                    if (!(Constraints.m33453getMaxHeightimpl(j10) != Integer.MAX_VALUE)) {
                        InlineClassHelperKt.throwIllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.");
                    }
                    int iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
                    GridCells gridCells2 = gridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] iArrM23921W0 = AbstractC10947g0.m23921W0(gridCells2.calculateCrossAxisCellSizes(density, iM33453getMaxHeightimpl, density.mo27093roundToPx0680j_4(vertical2.mo27345getSpacingD9Ej5fM())));
                    int[] iArr = new int[iArrM23921W0.length];
                    vertical2.arrange(density, iM33453getMaxHeightimpl, iArrM23921W0, iArr);
                    return new LazyGridSlots(iArrM23921W0, iArr);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridSlotsProvider lazyGridSlotsProvider = (LazyGridSlotsProvider) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyGridScope lazyGridScope, T[] tArr, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r) {
        lazyGridScope.items(tArr.length, interfaceC9540l != null ? new C15447(interfaceC9540l, tArr) : null, interfaceC9544p != null ? new C15458(interfaceC9544p, tArr) : null, new C15469(interfaceC9540l2, tArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new C153810(interfaceC9546r, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, T[] tArr, InterfaceC9544p interfaceC9544p, InterfaceC9545q interfaceC9545q, InterfaceC9544p interfaceC9544p2, InterfaceC9547s interfaceC9547s) {
        lazyGridScope.items(tArr.length, interfaceC9544p != null ? new C15547(interfaceC9544p, tArr) : null, interfaceC9545q != null ? new C15558(interfaceC9545q, tArr) : null, new C15569(interfaceC9544p2, tArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C154810(interfaceC9547s, tArr)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] objArr, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9544p = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6
                @Override // p181hd.InterfaceC9540l
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        lazyGridScope.items(objArr.length, interfaceC9540l != null ? new C15447(interfaceC9540l, objArr) : null, interfaceC9544p != null ? new C15458(interfaceC9544p, objArr) : null, new C15469(interfaceC9540l2, objArr), ComposableLambdaKt.composableLambdaInstance(407562193, true, new C153810(interfaceC9546r, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] objArr, InterfaceC9544p interfaceC9544p, InterfaceC9545q interfaceC9545q, InterfaceC9544p interfaceC9544p2, InterfaceC9547s interfaceC9547s, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9544p = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9545q = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC9544p2 = new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyGridScope.items(objArr.length, interfaceC9544p != null ? new C15547(interfaceC9544p, objArr) : null, interfaceC9545q != null ? new C15558(interfaceC9545q, objArr) : null, new C15569(interfaceC9544p2, objArr), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C154810(interfaceC9547s, objArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyHorizontalGrid(final androidx.compose.foundation.lazy.grid.GridCells r28, androidx.compose.p014ui.Modifier r29, androidx.compose.foundation.lazy.grid.LazyGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Horizontal r33, androidx.compose.foundation.layout.Arrangement.Vertical r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final p181hd.InterfaceC9540l r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void LazyVerticalGrid(final androidx.compose.foundation.lazy.grid.GridCells r28, androidx.compose.p014ui.Modifier r29, androidx.compose.foundation.lazy.grid.LazyGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final p181hd.InterfaceC9540l r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
