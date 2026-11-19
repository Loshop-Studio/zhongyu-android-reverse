package androidx.compose.p011ui.graphics.layer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.p011ui.graphics.CanvasHolder;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.HandlerCompat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m5110d2 = {"Landroidx/compose/ui/graphics/layer/LayerManager;", "", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "<init>", "(Landroidx/compose/ui/graphics/CanvasHolder;)V", "Landroidx/collection/ScatterSet;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layers", "Ld6/s;", "persistLayers", "(Landroidx/collection/ScatterSet;)V", "layer", "persist", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "release", "destroy", "()V", "", "hasImageReader", "()Z", "updateLayerPersistence", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/collection/MutableScatterSet;", "layerSet", "Landroidx/collection/MutableScatterSet;", "Landroid/media/ImageReader;", "imageReader", "Landroid/media/ImageReader;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroidx/collection/MutableObjectList;", "postponedReleaseRequests", "Landroidx/collection/MutableObjectList;", "persistenceIterationInProgress", "Z", "Companion", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLayerManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,167:1\n1516#2:168\n1#3:169\n41#4,3:170\n44#4,2:198\n231#5,3:173\n200#5,7:176\n211#5,3:184\n214#5,9:188\n234#5:197\n1399#6:183\n1270#6:187\n287#7,6:200\n*S KotlinDebug\n*F\n+ 1 LayerManager.android.kt\nandroidx/compose/ui/graphics/layer/LayerManager\n*L\n82#1:168\n123#1:170,3\n123#1:198,2\n126#1:173,3\n126#1:176,7\n126#1:184,3\n126#1:188,9\n126#1:197\n126#1:183\n126#1:187\n132#1:200,6\n*E\n"})
/* loaded from: classes.dex */
public final class LayerManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean isRobolectric;

    @NotNull
    private final CanvasHolder canvasHolder;

    @Nullable
    private ImageReader imageReader;
    private boolean persistenceIterationInProgress;

    @Nullable
    private MutableObjectList<GraphicsLayer> postponedReleaseRequests;

    @NotNull
    private final MutableScatterSet<GraphicsLayer> layerSet = ScatterSetKt.mutableScatterSetOf();

    @NotNull
    private final Handler handler = HandlerCompat.createAsync(Looper.getMainLooper(), new Handler.Callback() { // from class: androidx.compose.ui.graphics.layer.c
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return LayerManager.handler$lambda$0(this.f834a, message);
        }
    });

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Landroidx/compose/ui/graphics/layer/LayerManager$Companion;", "", "()V", "isRobolectric", "", "()Z", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
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
        AbstractC5830k.m5329f(lowerCase, "toLowerCase(...)");
        isRobolectric = lowerCase.equals("robolectric");
    }

    public LayerManager(@NotNull CanvasHolder canvasHolder) {
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
    private final void persistLayers(androidx.collection.ScatterSet<androidx.compose.p011ui.graphics.layer.GraphicsLayer> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r1.isNotEmpty()
            if (r2 == 0) goto Lc4
            boolean r2 = androidx.compose.p011ui.graphics.layer.LayerManager.isRobolectric
            if (r2 != 0) goto Lc4
            android.media.ImageReader r2 = r0.imageReader
            r3 = 1
            if (r2 != 0) goto L24
            r2 = 3
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r3, r3, r3, r2)
            androidx.compose.ui.graphics.layer.b r4 = new androidx.compose.ui.graphics.layer.b
            r4.<init>()
            android.os.Handler r5 = r0.handler
            r2.setOnImageAvailableListener(r4, r5)
            r0.imageReader = r2
        L24:
            android.view.Surface r2 = r2.getSurface()
            androidx.compose.ui.graphics.layer.LockHardwareCanvasHelper r4 = androidx.compose.p011ui.graphics.layer.LockHardwareCanvasHelper.INSTANCE
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
            androidx.compose.ui.graphics.layer.GraphicsLayer r8 = (androidx.compose.p011ui.graphics.layer.GraphicsLayer) r8
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
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = (androidx.compose.p011ui.graphics.layer.GraphicsLayer) r1
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.layer.LayerManager.persistLayers(androidx.collection.ScatterSet):void");
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

    @NotNull
    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    public final boolean hasImageReader() {
        return this.imageReader != null;
    }

    public final void persist(@NotNull GraphicsLayer layer) {
        this.layerSet.add(layer);
        if (this.handler.hasMessages(0)) {
            return;
        }
        this.handler.sendMessageAtFrontOfQueue(Message.obtain());
    }

    public final void release(@NotNull GraphicsLayer layer) {
        if (!this.persistenceIterationInProgress) {
            if (this.layerSet.remove(layer)) {
                layer.discardDisplayList$ui_graphics_release();
            }
        } else {
            MutableObjectList<GraphicsLayer> mutableObjectList = this.postponedReleaseRequests;
            if (mutableObjectList == null) {
                mutableObjectList = new MutableObjectList<>(0, 1, null);
                this.postponedReleaseRequests = mutableObjectList;
            }
            mutableObjectList.add(layer);
        }
    }

    public final void updateLayerPersistence() {
        destroy();
        persistLayers(this.layerSet);
    }
}
