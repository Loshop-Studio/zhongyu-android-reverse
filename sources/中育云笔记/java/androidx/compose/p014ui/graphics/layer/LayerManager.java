package androidx.compose.p014ui.graphics.layer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.p014ui.graphics.CanvasHolder;
import androidx.core.os.HandlerCompat;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class LayerManager {
    public static final Companion Companion = new Companion(null);
    private static final boolean isRobolectric;
    private final CanvasHolder canvasHolder;
    private ImageReader imageReader;
    private boolean persistenceIterationInProgress;
    private MutableObjectList<GraphicsLayer> postponedReleaseRequests;
    private final MutableScatterSet<GraphicsLayer> layerSet = ScatterSetKt.mutableScatterSetOf();
    private final Handler handler = HandlerCompat.createAsync(Looper.getMainLooper(), new Handler.Callback() { // from class: androidx.compose.ui.graphics.layer.z
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return LayerManager.handler$lambda$0(this.f1182c, message);
        }
    });

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final boolean isRobolectric() {
            return LayerManager.isRobolectric;
        }

        private Companion() {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        isRobolectric = AbstractC9979u.m20289b(lowerCase, "robolectric");
    }

    public LayerManager(CanvasHolder canvasHolder) {
        this.canvasHolder = canvasHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handler$lambda$0(LayerManager layerManager, Message message) {
        layerManager.persistLayers(layerManager.layerSet);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void persistLayers(androidx.collection.ScatterSet<androidx.compose.p014ui.graphics.layer.GraphicsLayer> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r1.isNotEmpty()
            if (r2 == 0) goto Lc4
            boolean r2 = androidx.compose.p014ui.graphics.layer.LayerManager.isRobolectric
            if (r2 != 0) goto Lc4
            android.media.ImageReader r2 = r0.imageReader
            r3 = 1
            if (r2 != 0) goto L24
            r2 = 3
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r3, r3, r3, r2)
            androidx.compose.ui.graphics.layer.y r4 = new androidx.compose.ui.graphics.layer.y
            r4.<init>()
            android.os.Handler r5 = r0.handler
            r2.setOnImageAvailableListener(r4, r5)
            r0.imageReader = r2
        L24:
            android.view.Surface r2 = r2.getSurface()
            androidx.compose.ui.graphics.layer.LockHardwareCanvasHelper r4 = androidx.compose.p014ui.graphics.layer.LockHardwareCanvasHelper.INSTANCE
            android.graphics.Canvas r4 = r4.lockHardwareCanvas(r2)
            r0.persistenceIterationInProgress = r3
            androidx.compose.ui.graphics.CanvasHolder r5 = r0.canvasHolder
            androidx.compose.ui.graphics.AndroidCanvas r6 = r5.getAndroidCanvas()
            android.graphics.Canvas r6 = r6.getInternalCanvas()
            androidx.compose.ui.graphics.AndroidCanvas r7 = r5.getAndroidCanvas()
            r7.setInternalCanvas(r4)
            androidx.compose.ui.graphics.AndroidCanvas r7 = r5.getAndroidCanvas()
            r4.save()
            r8 = 0
            r4.clipRect(r8, r8, r3, r3)
            java.lang.Object[] r3 = r1.elements
            long[] r1 = r1.metadata
            int r9 = r1.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto L96
            r10 = r8
        L56:
            r11 = r1[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L90
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = r8
        L70:
            if (r15 >= r13) goto L8e
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L89
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r3[r16]
            r8 = r16
            androidx.compose.ui.graphics.layer.GraphicsLayer r8 = (androidx.compose.p014ui.graphics.layer.GraphicsLayer) r8
            r8.drawForPersistence$ui_graphics_release(r7)
        L89:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            r8 = 0
            goto L70
        L8e:
            if (r13 != r14) goto L96
        L90:
            if (r10 == r9) goto L96
            int r10 = r10 + 1
            r8 = 0
            goto L56
        L96:
            r4.restore()
            androidx.compose.ui.graphics.AndroidCanvas r1 = r5.getAndroidCanvas()
            r1.setInternalCanvas(r6)
            r1 = 0
            r0.persistenceIterationInProgress = r1
            androidx.collection.MutableObjectList<androidx.compose.ui.graphics.layer.GraphicsLayer> r3 = r0.postponedReleaseRequests
            if (r3 == 0) goto Lc1
            boolean r5 = r3.isNotEmpty()
            if (r5 == 0) goto Lc1
            java.lang.Object[] r5 = r3.content
            int r6 = r3._size
            r8 = r1
        Lb2:
            if (r8 >= r6) goto Lbe
            r1 = r5[r8]
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = (androidx.compose.p014ui.graphics.layer.GraphicsLayer) r1
            r0.release(r1)
            int r8 = r8 + 1
            goto Lb2
        Lbe:
            r3.clear()
        Lc1:
            r2.unlockCanvasAndPost(r4)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.graphics.layer.LayerManager.persistLayers(androidx.collection.ScatterSet):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistLayers$lambda$3$lambda$2(ImageReader imageReader) {
        Image imageAcquireLatestImage;
        if (imageReader == null || (imageAcquireLatestImage = imageReader.acquireLatestImage()) == null) {
            return;
        }
        imageAcquireLatestImage.close();
    }

    public final void destroy() {
        ImageReader imageReader = this.imageReader;
        if (imageReader != null) {
            imageReader.close();
        }
        this.imageReader = null;
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    public final boolean hasImageReader() {
        return this.imageReader != null;
    }

    public final void persist(GraphicsLayer graphicsLayer) {
        this.layerSet.add(graphicsLayer);
        if (this.handler.hasMessages(0)) {
            return;
        }
        this.handler.sendMessageAtFrontOfQueue(Message.obtain());
    }

    public final void release(GraphicsLayer graphicsLayer) {
        if (!this.persistenceIterationInProgress) {
            if (this.layerSet.remove(graphicsLayer)) {
                graphicsLayer.discardDisplayList$ui_graphics_release();
            }
        } else {
            MutableObjectList<GraphicsLayer> mutableObjectList = this.postponedReleaseRequests;
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList<>(0, 1, null);
                this.postponedReleaseRequests = mutableObjectList;
            }
            mutableObjectList.add(graphicsLayer);
        }
    }

    public final void updateLayerPersistence() {
        destroy();
        persistLayers(this.layerSet);
    }
}
