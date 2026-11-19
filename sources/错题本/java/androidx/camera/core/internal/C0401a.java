package androidx.camera.core.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.core.util.Consumer;

/* renamed from: androidx.camera.core.internal.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0401a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f487a;

    /* renamed from: b */
    public final /* synthetic */ Object f488b;

    /* renamed from: c */
    public final /* synthetic */ Object f489c;

    public /* synthetic */ C0401a(int i, Object obj, Object obj2) {
        this.f487a = i;
        this.f488b = obj;
        this.f489c = obj2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f487a) {
            case 0:
                CameraUseCaseAdapter.lambda$createExtraPreview$0((Surface) this.f488b, (SurfaceTexture) this.f489c, (SurfaceRequest.Result) obj);
                break;
            default:
                ((DualSurfaceProcessor) this.f488b).lambda$onOutputSurface$2((SurfaceOutput) this.f489c, (SurfaceOutput.Event) obj);
                break;
        }
    }
}
