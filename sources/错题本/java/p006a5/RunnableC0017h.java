package p006a5;

import android.support.v4.media.C0039h;
import android.widget.DatePicker;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.data.SourceLoad;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.exception.FileVerificationException;
import com.zykj.board.EzyPageRouter$PageRouter;
import com.zykj.merge.sketch.view.OldSketchProxyView;
import com.zykj.mistake.feature.notebook.detail.C4764a5;
import com.zykj.mistake.feature.notebook.detail.C4791f;
import com.zykj.sketch.core.player.SketchPlayerView;
import com.zykj.sketch.exception.HighVersionException;
import com.zykj.sketch.exception.LowVersionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p152r6.InterfaceC6471c;
import retrofit2.C6508n;
import retrofit2.C6509n0;
import retrofit2.InterfaceC6496h;

/* renamed from: a5.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0017h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f50a;

    /* renamed from: b */
    public final /* synthetic */ Object f51b;

    /* renamed from: c */
    public final /* synthetic */ Object f52c;

    /* renamed from: d */
    public final /* synthetic */ Object f53d;

    public /* synthetic */ RunnableC0017h(C0014e c0014e, DatePicker datePicker, DatePicker datePicker2, C0012c c0012c) {
        this.f50a = 0;
        this.f51b = datePicker;
        this.f52c = datePicker2;
        this.f53d = c0012c;
    }

    @Override // java.lang.Runnable
    public final void run() throws FileVerificationException, IOException {
        switch (this.f50a) {
            case 0:
                DatePicker datePicker = (DatePicker) this.f51b;
                DatePicker datePicker2 = (DatePicker) this.f52c;
                C0012c c0012c = (C0012c) this.f53d;
                C0014e.m57e(datePicker);
                C0014e.m57e(datePicker2);
                c0012c.invoke();
                break;
            case 1:
                ((DefaultSurfaceProcessor) this.f51b).lambda$executeSafely$12((Runnable) this.f52c, (Runnable) this.f53d);
                break;
            case 2:
                ((InternalImageProcessor) this.f51b).lambda$safeProcess$0((ImageProcessor.Request) this.f52c, (CallbackToFutureAdapter.Completer) this.f53d);
                break;
            case 3:
                ((SurfaceProcessorNode) this.f51b).lambda$sendSurfaceOutputs$0((SurfaceEdge) this.f52c, (Map.Entry) this.f53d);
                break;
            case 4:
                ((DualSurfaceProcessor) this.f51b).lambda$executeSafely$8((Runnable) this.f52c, (Runnable) this.f53d);
                break;
            case 5:
                ((AudioSource) this.f51b).lambda$setAudioSourceCallback$6((Executor) this.f52c, (AudioSource.AudioSourceCallback) this.f53d);
                break;
            case 6:
                ((BufferedAudioStream) this.f51b).lambda$setCallback$3((AudioStream.AudioStreamCallback) this.f52c, (Executor) this.f53d);
                break;
            case 7:
                SketchRecorderView.m13751ready$lambda4((SketchRecorderView) this.f51b, (InterfaceC6471c) this.f52c, (InterfaceC6471c) this.f53d);
                break;
            case 8:
                OldSketchProxyView.m13840seekTo$lambda9$lambda8((OldSketchProxyView) this.f51b, (InterfaceC6471c) this.f52c, (Exception) this.f53d);
                break;
            case 9:
                ((C4764a5) this.f51b).m4172h((C4791f) this.f52c, (List) this.f53d);
                break;
            case 10:
                SketchPlayerView.m13872seekTo$lambda22$lambda21$lambda20((SketchPlayerView) this.f51b, (InterfaceC6471c) this.f52c, (Throwable) this.f53d);
                break;
            case 11:
                SketchPlayerView.m13862loadData$lambda13$lambda12$lambda2((SketchPlayerView) this.f51b, (InterfaceC6471c) this.f52c, (LowVersionException) this.f53d);
                break;
            case 12:
                SketchPlayerView.m13864loadData$lambda13$lambda12$lambda5((SketchPlayerView) this.f51b, (InterfaceC6471c) this.f52c, (HighVersionException) this.f53d);
                break;
            case 13:
                SketchPlayerView.m13866loadData$lambda13$lambda12$lambda8((SketchPlayerView) this.f51b, (InterfaceC6471c) this.f52c, (FileNotFoundException) this.f53d);
                break;
            case 14:
                SketchPlayerView.m13860loadData$lambda13$lambda12$lambda11((SketchPlayerView) this.f51b, (InterfaceC6471c) this.f52c, (IOException) this.f53d);
                break;
            case 15:
                C0039h c0039h = (C0039h) this.f51b;
                InterfaceC6496h interfaceC6496h = (InterfaceC6496h) this.f52c;
                C6509n0 c6509n0 = (C6509n0) this.f53d;
                C6508n c6508n = (C6508n) c0039h.f97c;
                if (!c6508n.f10761b.isCanceled()) {
                    interfaceC6496h.mo120n(c6508n, c6509n0);
                    break;
                } else {
                    interfaceC6496h.mo117k(c6508n, new IOException("Canceled"));
                    break;
                }
            case 16:
                C0039h c0039h2 = (C0039h) this.f51b;
                ((InterfaceC6496h) this.f52c).mo117k((C6508n) c0039h2.f97c, (Throwable) this.f53d);
                break;
            default:
                SourceLoad.m13761loadRecord$lambda3$lambda2$lambda1((EzyPageRouter$PageRouter) this.f51b, (BlackBoardEntity) this.f52c, (String) this.f53d);
                break;
        }
    }

    public /* synthetic */ RunnableC0017h(Object obj, Object obj2, int i, Object obj3) {
        this.f50a = i;
        this.f51b = obj;
        this.f52c = obj2;
        this.f53d = obj3;
    }
}
