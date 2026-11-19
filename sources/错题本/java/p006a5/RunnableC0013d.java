package p006a5;

import android.widget.DatePicker;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.edit.BoardControl;
import com.zykj.blackboard.core.play.PlayControl;
import com.zykj.merge.sketch.view.OldSketchProxyView;
import com.zykj.sketch.core.config.SketchConfig;
import java.util.Map;
import java.util.concurrent.Executor;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

/* renamed from: a5.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0013d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f32a;

    /* renamed from: b */
    public final /* synthetic */ Object f33b;

    /* renamed from: c */
    public final /* synthetic */ Object f34c;

    /* renamed from: d */
    public final /* synthetic */ Object f35d;

    /* renamed from: e */
    public final /* synthetic */ Object f36e;

    public /* synthetic */ RunnableC0013d(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f32a = i;
        this.f33b = obj;
        this.f34c = obj2;
        this.f35d = obj3;
        this.f36e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() throws InvalidProtocolBufferException {
        switch (this.f32a) {
            case 0:
                C0014e c0014e = (C0014e) this.f33b;
                DatePicker datePicker = (DatePicker) this.f34c;
                DatePicker datePicker2 = (DatePicker) this.f35d;
                C0012c c0012c = (C0012c) this.f36e;
                c0014e.getClass();
                C0014e.m56d(datePicker);
                C0014e.m56d(datePicker2);
                c0012c.invoke();
                break;
            case 1:
                ((ImageCapture) this.f33b).lambda$takePicture$2((ImageCapture.OutputFileOptions) this.f34c, (Executor) this.f35d, (ImageCapture.OnImageSavedCallback) this.f36e);
                break;
            case 2:
                ((DefaultSurfaceProcessor) this.f33b).lambda$initGlRenderer$9((DynamicRange) this.f34c, (Map) this.f35d, (CallbackToFutureAdapter.Completer) this.f36e);
                break;
            case 3:
                ((DualSurfaceProcessor) this.f33b).lambda$initGlRenderer$5((DynamicRange) this.f34c, (Map) this.f35d, (CallbackToFutureAdapter.Completer) this.f36e);
                break;
            case 4:
                SketchRecorderView.m13750ready$lambda2((SketchRecorderView) this.f33b, (String) this.f34c, (InterfaceC6474f) this.f35d, (InterfaceC6471c) this.f36e);
                break;
            case 5:
                BoardControl.m13765loadDir$lambda14((String) this.f33b, (BoardControl) this.f34c, (InterfaceC6473e) this.f35d, (InterfaceC6471c) this.f36e);
                break;
            case 6:
                PlayControl.m13786loadPath$lambda4((PlayControl) this.f33b, (String) this.f34c, (InterfaceC6471c) this.f35d, (InterfaceC6471c) this.f36e);
                break;
            case 7:
                OldSketchProxyView.m13832loadData$lambda4((OldSketchProxyView) this.f33b, (String) this.f34c, (InterfaceC6471c) this.f35d, (InterfaceC6471c) this.f36e);
                break;
            default:
                com.zykj.sketch.core.record.SketchRecorderView.m13879initConfig$lambda2$lambda1((com.zykj.sketch.core.record.SketchRecorderView) this.f33b, (String) this.f34c, (SketchConfig) this.f35d, (InterfaceC6471c) this.f36e);
                break;
        }
    }
}
