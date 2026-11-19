package androidx.compose.p011ui.graphics.layer;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@RequiresApi(22)
@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV22;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lh6/c;)Ljava/lang/Object;", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLayerSnapshot.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV22\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,220:1\n54#2:221\n59#2:223\n85#3:222\n90#3:224\n314#4,11:225\n*S KotlinDebug\n*F\n+ 1 LayerSnapshot.android.kt\nandroidx/compose/ui/graphics/layer/LayerSnapshotV22\n*L\n83#1:221\n84#1:223\n83#1:222\n84#1:224\n89#1:225,11\n*E\n"})
/* loaded from: classes.dex */
public final class LayerSnapshotV22 implements LayerSnapshotImpl {

    @NotNull
    public static final LayerSnapshotV22 INSTANCE = new LayerSnapshotV22();

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", m5303f = "LayerSnapshot.android.kt", m5304i = {0, 0, 0, 0}, m5305l = {225}, m5306m = "toBitmap", m5307n = {"graphicsLayer", "looper", "reader", "$completion$iv"}, m5308s = {"L$0", "L$1", "L$3", "L$4"})
    /* renamed from: androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 */
    public static final class C21211 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C21211(InterfaceC5631c<? super C21211> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LayerSnapshotV22.this.toBitmap(null, this);
        }
    }

    private LayerSnapshotV22() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p011ui.graphics.layer.LayerSnapshotImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object toBitmap(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.graphics.layer.GraphicsLayer r10, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super android.graphics.Bitmap> r11) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.p011ui.graphics.layer.LayerSnapshotV22.C21211
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r0 = (androidx.compose.p011ui.graphics.layer.LayerSnapshotV22.C21211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r0 = new androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r10 = r0.L$4
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r10 = (androidx.compose.p011ui.graphics.layer.LayerSnapshotV22.C21211) r10
            java.lang.Object r10 = r0.L$3
            android.media.ImageReader r10 = (android.media.ImageReader) r10
            java.lang.Object r10 = r0.L$2
            java.lang.AutoCloseable r10 = (java.lang.AutoCloseable) r10
            java.lang.Object r1 = r0.L$1
            android.os.Looper r1 = (android.os.Looper) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = (androidx.compose.p011ui.graphics.layer.GraphicsLayer) r0
            kotlin.AbstractC5774b.m5119b(r11)     // Catch: java.lang.Throwable -> L3d
            goto Lb8
        L3d:
            r11 = move-exception
            goto Lca
        L40:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L48:
            kotlin.AbstractC5774b.m5119b(r11)
            long r5 = r10.getSize()
            android.os.Looper r11 = android.os.Looper.myLooper()
            if (r11 != 0) goto L59
            android.os.Looper r11 = android.os.Looper.getMainLooper()
        L59:
            r2 = 32
            long r7 = r5 >> r2
            int r2 = (int) r7
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r5 = (int) r5
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r2, r5, r3, r3)
            r0.L$0 = r10     // Catch: java.lang.Throwable -> Lc2
            r0.L$1 = r11     // Catch: java.lang.Throwable -> Lc2
            r0.L$2 = r2     // Catch: java.lang.Throwable -> Lc2
            r0.L$3 = r2     // Catch: java.lang.Throwable -> Lc2
            r0.L$4 = r0     // Catch: java.lang.Throwable -> Lc2
            r0.label = r3     // Catch: java.lang.Throwable -> Lc2
            kotlinx.coroutines.g r5 = new kotlinx.coroutines.g     // Catch: java.lang.Throwable -> Lc2
            h6.c r0 = p185v7.AbstractC6683l.m6374n(r0)     // Catch: java.lang.Throwable -> Lc2
            r5.<init>(r3, r0)     // Catch: java.lang.Throwable -> Lc2
            r5.m5584u()     // Catch: java.lang.Throwable -> Lc2
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1 r0 = new androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1     // Catch: java.lang.Throwable -> Lc2
            r0.<init>()     // Catch: java.lang.Throwable -> Lc2
            android.os.Handler r11 = androidx.core.os.HandlerCompat.createAsync(r11)     // Catch: java.lang.Throwable -> Lc2
            r2.setOnImageAvailableListener(r0, r11)     // Catch: java.lang.Throwable -> Lc2
            android.view.Surface r11 = r2.getSurface()     // Catch: java.lang.Throwable -> Lc2
            androidx.compose.ui.graphics.layer.SurfaceUtils r0 = androidx.compose.p011ui.graphics.layer.SurfaceUtils.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            android.graphics.Canvas r0 = r0.lockCanvas(r11)     // Catch: java.lang.Throwable -> Lc2
            androidx.compose.ui.graphics.Color$Companion r3 = androidx.compose.p011ui.graphics.Color.INSTANCE     // Catch: java.lang.Throwable -> Lc5
            long r6 = r3.m10708getBlack0d7_KjU()     // Catch: java.lang.Throwable -> Lc5
            int r3 = androidx.compose.p011ui.graphics.ColorKt.m10736toArgb8_81llA(r6)     // Catch: java.lang.Throwable -> Lc5
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> Lc5
            r0.drawColor(r3, r6)     // Catch: java.lang.Throwable -> Lc5
            androidx.compose.ui.graphics.Canvas r3 = androidx.compose.p011ui.graphics.AndroidCanvas_androidKt.Canvas(r0)     // Catch: java.lang.Throwable -> Lc5
            r10.draw$ui_graphics_release(r3, r4)     // Catch: java.lang.Throwable -> Lc5
            r11.unlockCanvasAndPost(r0)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r11 = r5.m5583t()     // Catch: java.lang.Throwable -> Lc2
            if (r11 != r1) goto Lb7
            return r1
        Lb7:
            r10 = r2
        Lb8:
            android.media.Image r11 = (android.media.Image) r11     // Catch: java.lang.Throwable -> L3d
            android.graphics.Bitmap r11 = androidx.compose.p011ui.graphics.layer.LayerSnapshot_androidKt.access$toBitmap(r11)     // Catch: java.lang.Throwable -> L3d
            p073h4.AbstractC5625a.m4943c(r10, r4)
            return r11
        Lc2:
            r11 = move-exception
            r10 = r2
            goto Lca
        Lc5:
            r10 = move-exception
            r11.unlockCanvasAndPost(r0)     // Catch: java.lang.Throwable -> Lc2
            throw r10     // Catch: java.lang.Throwable -> Lc2
        Lca:
            throw r11     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            r0 = move-exception
            p073h4.AbstractC5625a.m4943c(r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.layer.LayerSnapshotV22.toBitmap(androidx.compose.ui.graphics.layer.GraphicsLayer, h6.c):java.lang.Object");
    }
}
