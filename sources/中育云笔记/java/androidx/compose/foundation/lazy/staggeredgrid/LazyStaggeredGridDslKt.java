package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
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
public final class LazyStaggeredGridDslKt {

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10 */
    public static final class C161010 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9546r $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C161010(InterfaceC9546r interfaceC9546r, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC9546r;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i11;
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
                ComposerKt.traceEventStart(2101296000, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:480)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items[i10], composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3 */
    public static final class C16113 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16113(InterfaceC9540l interfaceC9540l, List<? extends T> list) {
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

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5 */
    public static final class C16125 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9546r $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16125(InterfaceC9546r interfaceC9546r, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC9546r;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i11;
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
                ComposerKt.traceEventStart(-886456479, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:408)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items.get(i10), composer, Integer.valueOf(i12 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8 */
    public static final class C16148 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9540l $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16148(InterfaceC9540l interfaceC9540l, T[] tArr) {
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

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10 */
    public static final class C161610 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9547s $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C161610(InterfaceC9547s interfaceC9547s, T[] tArr) {
            super(4);
            this.$itemContent = interfaceC9547s;
            this.$items = tArr;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i11;
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
                ComposerKt.traceEventStart(-804487775, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:516)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i10), this.$items[i10], composer, Integer.valueOf(i12 & Opcodes.IAND));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3 */
    public static final class C16173 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9544p $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16173(InterfaceC9544p interfaceC9544p, List<? extends T> list) {
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

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5 */
    public static final class C16185 extends Lambda implements InterfaceC9546r {
        final /* synthetic */ InterfaceC9547s $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16185(InterfaceC9547s interfaceC9547s, List<? extends T> list) {
            super(4);
            this.$itemContent = interfaceC9547s;
            this.$items = list;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyStaggeredGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i11;
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
                ComposerKt.traceEventStart(284833944, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:444)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i10), this.$items.get(i10), composer, Integer.valueOf(i12 & Opcodes.IAND));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8 */
    public static final class C16208 extends Lambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9544p $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16208(InterfaceC9544p interfaceC9544p, T[] tArr) {
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LazyHorizontalStaggeredGrid-121YqSk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27660LazyHorizontalStaggeredGrid121YqSk(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r31, androidx.compose.p014ui.Modifier r32, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, androidx.compose.foundation.layout.Arrangement.Vertical r36, float r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.OverscrollEffect r40, final p181hd.InterfaceC9540l r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m27660LazyHorizontalStaggeredGrid121YqSk(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, hd.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m27661LazyHorizontalStaggeredGridcJHQLPU(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.p014ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, float r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final p181hd.InterfaceC9540l r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m27661LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LazyVerticalStaggeredGrid-6qCrX9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27662LazyVerticalStaggeredGrid6qCrX9Q(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r31, androidx.compose.p014ui.Modifier r32, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r33, androidx.compose.foundation.layout.PaddingValues r34, boolean r35, float r36, androidx.compose.foundation.layout.Arrangement.Horizontal r37, androidx.compose.foundation.gestures.FlingBehavior r38, boolean r39, androidx.compose.foundation.OverscrollEffect r40, final p181hd.InterfaceC9540l r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m27662LazyVerticalStaggeredGrid6qCrX9Q(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, hd.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m27663LazyVerticalStaggeredGridzadm560(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.p014ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, float r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final p181hd.InterfaceC9540l r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m27663LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, hd.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9546r interfaceC9546r) {
        lazyStaggeredGridScope.items(list.size(), interfaceC9540l != null ? new LazyStaggeredGridDslKt$items$2$1(interfaceC9540l, list) : null, new C16113(interfaceC9540l2, list), interfaceC9540l3 != null ? new LazyStaggeredGridDslKt$items$4$1(interfaceC9540l3, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new C16125(interfaceC9546r, list)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1
                @Override // p181hd.InterfaceC9540l
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l3 = null;
        }
        lazyStaggeredGridScope.items(list.size(), interfaceC9540l != null ? new LazyStaggeredGridDslKt$items$2$1(interfaceC9540l, list) : null, new C16113(interfaceC9540l2, list), interfaceC9540l3 != null ? new LazyStaggeredGridDslKt$items$4$1(interfaceC9540l3, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new C16125(interfaceC9546r, list)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9544p interfaceC9544p3, InterfaceC9547s interfaceC9547s) {
        lazyStaggeredGridScope.items(list.size(), interfaceC9544p != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(interfaceC9544p, list) : null, new C16173(interfaceC9544p2, list), interfaceC9544p3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(interfaceC9544p3, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C16185(interfaceC9547s, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9544p interfaceC9544p3, InterfaceC9547s interfaceC9547s, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9544p = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9544p2 = new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i10 & 8) != 0) {
            interfaceC9544p3 = null;
        }
        lazyStaggeredGridScope.items(list.size(), interfaceC9544p != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(interfaceC9544p, list) : null, new C16173(interfaceC9544p2, list), interfaceC9544p3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(interfaceC9544p3, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C16185(interfaceC9547s, list)));
    }

    @Composable
    private static final LazyGridStaggeredGridSlotsProvider rememberColumnSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1267076841, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:134)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i10 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridSlotCache(new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m27664invoke0kLqBqw((Density) obj, ((Constraints) obj2).m33460unboximpl());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m27664invoke0kLqBqw(Density density, long j10) {
                    if (!(Constraints.m33454getMaxWidthimpl(j10) != Integer.MAX_VALUE)) {
                        InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.");
                    }
                    PaddingValues paddingValues2 = paddingValues;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10) - density.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(PaddingKt.calculateStartPadding(paddingValues2, layoutDirection) + PaddingKt.calculateEndPadding(paddingValues, layoutDirection)));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, iM33454getMaxWidthimpl, density.mo27093roundToPx0680j_4(horizontal2.mo27345getSpacingD9Ej5fM()));
                    int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
                    horizontal2.arrange(density, iM33454getMaxWidthimpl, iArrCalculateCrossAxisCellSizes, layoutDirection, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    @Composable
    private static final LazyGridStaggeredGridSlotsProvider rememberRowSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1532383053, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:259)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i10 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridSlotCache(new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m27665invoke0kLqBqw((Density) obj, ((Constraints) obj2).m33460unboximpl());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m27665invoke0kLqBqw(Density density, long j10) {
                    if (!(Constraints.m33453getMaxHeightimpl(j10) != Integer.MAX_VALUE)) {
                        InlineClassHelperKt.throwIllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.");
                    }
                    int iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10) - density.mo27093roundToPx0680j_4(C3186Dp.m33501constructorimpl(paddingValues.mo27410calculateTopPaddingD9Ej5fM() + paddingValues.mo27407calculateBottomPaddingD9Ej5fM()));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, iM33453getMaxHeightimpl, density.mo27093roundToPx0680j_4(vertical2.mo27345getSpacingD9Ej5fM()));
                    int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
                    vertical2.arrange(density, iM33453getMaxHeightimpl, iArrCalculateCrossAxisCellSizes, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9546r interfaceC9546r) {
        lazyStaggeredGridScope.items(tArr.length, interfaceC9540l != null ? new LazyStaggeredGridDslKt$items$7$1(interfaceC9540l, tArr) : null, new C16148(interfaceC9540l2, tArr), interfaceC9540l3 != null ? new LazyStaggeredGridDslKt$items$9$1(interfaceC9540l3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new C161010(interfaceC9546r, tArr)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9544p interfaceC9544p3, InterfaceC9547s interfaceC9547s) {
        lazyStaggeredGridScope.items(tArr.length, interfaceC9544p != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(interfaceC9544p, tArr) : null, new C16208(interfaceC9544p2, tArr), interfaceC9544p3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(interfaceC9544p3, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C161610(interfaceC9547s, tArr)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6
                @Override // p181hd.InterfaceC9540l
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l3 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, interfaceC9540l != null ? new LazyStaggeredGridDslKt$items$7$1(interfaceC9540l, objArr) : null, new C16148(interfaceC9540l2, objArr), interfaceC9540l3 != null ? new LazyStaggeredGridDslKt$items$9$1(interfaceC9540l3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new C161010(interfaceC9546r, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC9544p interfaceC9544p3, InterfaceC9547s interfaceC9547s, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9544p = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9544p2 = new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6
                public final Void invoke(int i11, Object obj2) {
                    return null;
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i10 & 8) != 0) {
            interfaceC9544p3 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, interfaceC9544p != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(interfaceC9544p, objArr) : null, new C16208(interfaceC9544p2, objArr), interfaceC9544p3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(interfaceC9544p3, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C161610(interfaceC9547s, objArr)));
    }
}
