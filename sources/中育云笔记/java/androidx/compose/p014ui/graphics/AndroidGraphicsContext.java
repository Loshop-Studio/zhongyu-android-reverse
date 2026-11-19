package androidx.compose.p014ui.graphics;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.graphics.layer.GraphicsLayerImpl;
import androidx.compose.p014ui.graphics.layer.GraphicsLayerV23;
import androidx.compose.p014ui.graphics.layer.GraphicsLayerV29;
import androidx.compose.p014ui.graphics.layer.GraphicsViewLayer;
import androidx.compose.p014ui.graphics.layer.LayerManager;
import androidx.compose.p014ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.p014ui.graphics.layer.view.ViewLayerContainer;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class AndroidGraphicsContext implements GraphicsContext {
    public static final boolean enableLayerPersistence = false;
    private boolean componentCallbackRegistered;
    private final ViewGroup ownerView;
    private boolean predrawListenerRegistered;
    private DrawChildContainer viewLayerContainer;
    public static final Companion Companion = new Companion(null);
    private static boolean isRenderNodeCompatible = true;
    private final Object lock = new Object();
    private final LayerManager layerManager = null;
    private final ComponentCallbacks2 componentCallback = null;

    /* renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$1 */
    public static final class ComponentCallbacks2C27061 implements ComponentCallbacks2 {
        public ComponentCallbacks2C27061() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            if (i10 < 40 || AndroidGraphicsContext.this.predrawListenerRegistered) {
                return;
            }
            AndroidGraphicsContext.this.layerManager.destroy();
            ViewTreeObserver viewTreeObserver = AndroidGraphicsContext.this.ownerView.getViewTreeObserver();
            final AndroidGraphicsContext androidGraphicsContext = AndroidGraphicsContext.this;
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.compose.ui.graphics.AndroidGraphicsContext$1$onTrimMemory$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    androidGraphicsContext.layerManager.updateLayerPersistence();
                    androidGraphicsContext.ownerView.getViewTreeObserver().removeOnPreDrawListener(this);
                    androidGraphicsContext.predrawListenerRegistered = false;
                    return true;
                }
            });
            AndroidGraphicsContext.this.predrawListenerRegistered = true;
        }
    }

    /* renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$2 */
    public static final class ViewOnAttachStateChangeListenerC27072 implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC27072() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AndroidGraphicsContext.this.registerComponentCallback(view.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AndroidGraphicsContext.this.unregisterComponentCallback(view.getContext());
            AndroidGraphicsContext.this.layerManager.destroy();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final boolean isRenderNodeCompatible() {
            return AndroidGraphicsContext.isRenderNodeCompatible;
        }

        public final void setRenderNodeCompatible(boolean z10) {
            AndroidGraphicsContext.isRenderNodeCompatible = z10;
        }

        private Companion() {
        }
    }

    @RequiresApi(29)
    public static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        public static final long getUniqueDrawingId(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public AndroidGraphicsContext(ViewGroup viewGroup) {
        this.ownerView = viewGroup;
    }

    private final long getUniqueDrawingId(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(view);
        }
        return -1L;
    }

    private final DrawChildContainer obtainViewLayerContainer(ViewGroup viewGroup) {
        DrawChildContainer drawChildContainer = this.viewLayerContainer;
        if (drawChildContainer != null) {
            return drawChildContainer;
        }
        ViewLayerContainer viewLayerContainer = new ViewLayerContainer(viewGroup.getContext());
        viewGroup.addView(viewLayerContainer);
        this.viewLayerContainer = viewLayerContainer;
        return viewLayerContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerComponentCallback(Context context) {
        if (this.componentCallbackRegistered) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.componentCallback);
        this.componentCallbackRegistered = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterComponentCallback(Context context) {
        if (this.componentCallbackRegistered) {
            context.getApplicationContext().unregisterComponentCallbacks(this.componentCallback);
            this.componentCallbackRegistered = false;
        }
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsContext
    public GraphicsLayer createGraphicsLayer() {
        GraphicsLayerImpl graphicsViewLayer;
        GraphicsLayer graphicsLayer;
        synchronized (this.lock) {
            try {
                long uniqueDrawingId = getUniqueDrawingId(this.ownerView);
                if (Build.VERSION.SDK_INT >= 29) {
                    graphicsViewLayer = new GraphicsLayerV29(uniqueDrawingId, null, null, 6, null);
                } else if (isRenderNodeCompatible) {
                    try {
                        graphicsViewLayer = new GraphicsLayerV23(this.ownerView, uniqueDrawingId, null, null, 12, null);
                    } catch (Throwable unused) {
                        isRenderNodeCompatible = false;
                        graphicsViewLayer = new GraphicsViewLayer(obtainViewLayerContainer(this.ownerView), uniqueDrawingId, null, null, 12, null);
                    }
                } else {
                    graphicsViewLayer = new GraphicsViewLayer(obtainViewLayerContainer(this.ownerView), uniqueDrawingId, null, null, 12, null);
                }
                graphicsLayer = new GraphicsLayer(graphicsViewLayer, this.layerManager);
            } catch (Throwable th) {
                throw th;
            }
        }
        return graphicsLayer;
    }

    public final boolean isLayerManagerInitialized() {
        LayerManager layerManager = this.layerManager;
        if (layerManager != null) {
            return layerManager.hasImageReader();
        }
        return false;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsContext
    public void releaseGraphicsLayer(GraphicsLayer graphicsLayer) {
        synchronized (this.lock) {
            graphicsLayer.release$ui_graphics_release();
            C10786q c10786q = C10786q.f26013a;
        }
    }
}
