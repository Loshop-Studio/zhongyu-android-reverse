package android.view;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Landroidx/activity/FullyDrawnReporter;", "Lkotlin/Function1;", "Lh6/c;", "Ld6/s;", "", "reporter", "reportWhenComplete", "(Landroidx/activity/FullyDrawnReporter;Lr6/c;Lh6/c;)Ljava/lang/Object;", "activity_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FullyDrawnReporterKt {

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    @DebugMetadata(m5302c = "androidx.activity.FullyDrawnReporterKt", m5303f = "FullyDrawnReporter.kt", m5304i = {0}, m5305l = {173}, m5306m = "reportWhenComplete", m5307n = {"$this$reportWhenComplete"}, m5308s = {"L$0"})
    /* renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 */
    public static final class C00561 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00561(InterfaceC5631c<? super C00561> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object reportWhenComplete(@org.jetbrains.annotations.NotNull android.view.FullyDrawnReporter r5, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r6, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r7) {
        /*
            boolean r0 = r7 instanceof android.view.FullyDrawnReporterKt.C00561
            if (r0 == 0) goto L13
            r0 = r7
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (android.view.FullyDrawnReporterKt.C00561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            d6.s r3 = p045d6.C5443s.f8405a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r5 = r0.L$0
            androidx.activity.FullyDrawnReporter r5 = (android.view.FullyDrawnReporter) r5
            kotlin.AbstractC5774b.m5119b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r6 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.AbstractC5774b.m5119b(r7)
            r5.addReporter()
            boolean r7 = r5.isFullyDrawnReported()
            if (r7 == 0) goto L44
            return r3
        L44:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2d
            r0.label = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r5.removeReporter()
            return r3
        L53:
            r5.removeReporter()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.FullyDrawnReporterKt.reportWhenComplete(androidx.activity.FullyDrawnReporter, r6.c, h6.c):java.lang.Object");
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        fullyDrawnReporter.addReporter();
        boolean zIsFullyDrawnReported = fullyDrawnReporter.isFullyDrawnReported();
        C5443s c5443s = C5443s.f8405a;
        if (zIsFullyDrawnReported) {
            return c5443s;
        }
        try {
            interfaceC6471c.invoke(interfaceC5631c);
            return c5443s;
        } finally {
            fullyDrawnReporter.removeReporter();
        }
    }
}
