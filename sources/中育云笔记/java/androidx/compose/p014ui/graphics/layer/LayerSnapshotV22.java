package androidx.compose.p014ui.graphics.layer;

import androidx.annotation.RequiresApi;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@RequiresApi(22)
/* loaded from: classes2.dex */
public final class LayerSnapshotV22 implements LayerSnapshotImpl {
    public static final LayerSnapshotV22 INSTANCE = new LayerSnapshotV22();

    @InterfaceC11829d(m26210c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", m26211f = "LayerSnapshot.android.kt", m26212l = {225}, m26213m = "toBitmap")
    /* renamed from: androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 */
    public static final class C27841 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C27841(InterfaceC11588c<? super C27841> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LayerSnapshotV22.this.toBitmap(null, this);
        }
    }

    private LayerSnapshotV22() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p014ui.graphics.layer.LayerSnapshotImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object toBitmap(androidx.compose.p014ui.graphics.layer.GraphicsLayer r10, vc.InterfaceC11588c<? super android.graphics.Bitmap> r11) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.p014ui.graphics.layer.LayerSnapshotV22.C27841
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r0 = (androidx.compose.p014ui.graphics.layer.LayerSnapshotV22.C27841) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r10 = r0.L$4
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r10 = (androidx.compose.p014ui.graphics.layer.LayerSnapshotV22.C27841) r10
            java.lang.Object r10 = r0.L$3
            android.media.ImageReader r10 = (android.media.ImageReader) r10
            java.lang.Object r10 = r0.L$2
            java.lang.AutoCloseable r10 = (java.lang.AutoCloseable) r10
            java.lang.Object r1 = r0.L$1
            android.os.Looper r1 = (android.os.Looper) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = (androidx.compose.p014ui.graphics.layer.GraphicsLayer) r0
            kotlin.AbstractC9924b.m20071b(r11)     // Catch: java.lang.Throwable -> L3f
            goto Lc7
        L3f:
            r11 = move-exception
            goto Ld6
        L42:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L4a:
            kotlin.AbstractC9924b.m20071b(r11)
            long r5 = r10.m31520getSizeYbymL2g()
            android.os.Looper r11 = android.os.Looper.myLooper()
            if (r11 != 0) goto L5b
            android.os.Looper r11 = android.os.Looper.getMainLooper()
        L5b:
            r2 = 32
            long r7 = r5 >> r2
            int r2 = (int) r7
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r5 = (int) r5
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r2, r5, r3, r3)
            r0.L$0 = r10     // Catch: java.lang.Throwable -> Lc0
            r0.L$1 = r11     // Catch: java.lang.Throwable -> Lc0
            r0.L$2 = r2     // Catch: java.lang.Throwable -> Lc0
            r0.L$3 = r2     // Catch: java.lang.Throwable -> Lc0
            r0.L$4 = r0     // Catch: java.lang.Throwable -> Lc0
            r0.label = r3     // Catch: java.lang.Throwable -> Lc0
            kotlinx.coroutines.c r5 = new kotlinx.coroutines.c     // Catch: java.lang.Throwable -> Lc0
            vc.c r6 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r0)     // Catch: java.lang.Throwable -> Lc0
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> Lc0
            r5.m20503F()     // Catch: java.lang.Throwable -> Lc0
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1 r3 = new androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1     // Catch: java.lang.Throwable -> Lc0
            r3.<init>()     // Catch: java.lang.Throwable -> Lc0
            android.os.Handler r11 = androidx.core.os.HandlerCompat.createAsync(r11)     // Catch: java.lang.Throwable -> Lc0
            r2.setOnImageAvailableListener(r3, r11)     // Catch: java.lang.Throwable -> Lc0
            android.view.Surface r11 = r2.getSurface()     // Catch: java.lang.Throwable -> Lc0
            androidx.compose.ui.graphics.layer.SurfaceUtils r3 = androidx.compose.p014ui.graphics.layer.SurfaceUtils.INSTANCE     // Catch: java.lang.Throwable -> Lc0
            android.graphics.Canvas r3 = r3.lockCanvas(r11)     // Catch: java.lang.Throwable -> Lc0
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.p014ui.graphics.Color.Companion     // Catch: java.lang.Throwable -> Ld1
            long r6 = r6.m30904getBlack0d7_KjU()     // Catch: java.lang.Throwable -> Ld1
            int r6 = androidx.compose.p014ui.graphics.ColorKt.m30932toArgb8_81llA(r6)     // Catch: java.lang.Throwable -> Ld1
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> Ld1
            r3.drawColor(r6, r7)     // Catch: java.lang.Throwable -> Ld1
            androidx.compose.ui.graphics.Canvas r6 = androidx.compose.p014ui.graphics.AndroidCanvas_androidKt.Canvas(r3)     // Catch: java.lang.Throwable -> Ld1
            r10.draw$ui_graphics_release(r6, r4)     // Catch: java.lang.Throwable -> Ld1
            r11.unlockCanvasAndPost(r3)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r11 = r5.m20538x()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r10 = p393wc.AbstractC11725a.m25952f()     // Catch: java.lang.Throwable -> Lc0
            if (r11 != r10) goto Lc3
            p409xc.AbstractC11831f.m26221c(r0)     // Catch: java.lang.Throwable -> Lc0
            goto Lc3
        Lc0:
            r11 = move-exception
            r10 = r2
            goto Ld6
        Lc3:
            if (r11 != r1) goto Lc6
            return r1
        Lc6:
            r10 = r2
        Lc7:
            android.media.Image r11 = (android.media.Image) r11     // Catch: java.lang.Throwable -> L3f
            android.graphics.Bitmap r11 = androidx.compose.p014ui.graphics.layer.LayerSnapshot_androidKt.access$toBitmap(r11)     // Catch: java.lang.Throwable -> L3f
            p152fd.AbstractC9223a.m18142a(r10, r4)
            return r11
        Ld1:
            r10 = move-exception
            r11.unlockCanvasAndPost(r3)     // Catch: java.lang.Throwable -> Lc0
            throw r10     // Catch: java.lang.Throwable -> Lc0
        Ld6:
            throw r11     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r0 = move-exception
            p152fd.AbstractC9223a.m18142a(r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.graphics.layer.LayerSnapshotV22.toBitmap(androidx.compose.ui.graphics.layer.GraphicsLayer, vc.c):java.lang.Object");
    }
}
