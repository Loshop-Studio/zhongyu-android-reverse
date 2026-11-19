package androidx.camera.core.impl.utils;

import android.graphics.Typeface;
import android.view.View;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import com.blankj.utilcode.util.AbstractC3385e;
import com.bumptech.glide.C3412f;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.bumptech.glide.ComponentCallbacks2C3414h;
import com.zykj.blackboard.core.edit.BasePageControl;
import com.zykj.blackboard.core.edit.BoardControl;
import com.zykj.mistake.activity.SketchActivity;
import com.zykj.mistake.widget.StemWebView;
import com.zykj.sketch.core.player.SketchPlayerView;
import com.zykj.sketch.exception.HighVersionException;
import com.zykj.sketch.exception.LowVersionException;
import com.zykj.view.board.board.BoardFragment;
import com.zykj.view.p037ui.camera.ImagePickFragment;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.C5961g;
import p046d7.C5447d;
import p049e1.InterfaceFutureC5453a;
import p147r0.FutureC6445c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p180v0.AbstractC6658e;

/* renamed from: androidx.camera.core.impl.utils.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0377a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f463a;

    /* renamed from: b */
    public final /* synthetic */ Object f464b;

    /* renamed from: c */
    public final /* synthetic */ Object f465c;

    public /* synthetic */ RunnableC0377a(int i, Object obj, Object obj2) {
        this.f463a = i;
        this.f464b = obj;
        this.f465c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        int i = this.f463a;
        Object obj = this.f465c;
        Object obj2 = this.f464b;
        switch (i) {
            case 0:
                Threads.lambda$runOnMainSync$0((Runnable) obj2, (CountDownLatch) obj);
                break;
            case 1:
                ((DualSurfaceProcessor) obj2).lambda$onInputSurface$1((SurfaceRequest) obj);
                break;
            case 2:
                ((DualSurfaceProcessor) obj2).lambda$onOutputSurface$3((SurfaceOutput) obj);
                break;
            case 3:
                ((AudioSource) obj2).lambda$setBufferProvider$0((BufferProvider) obj);
                break;
            case 4:
                ((AudioSource.AudioSourceCallback) obj2).onError((Throwable) obj);
                break;
            case 5:
                ((AudioSource) obj2).lambda$release$4((CallbackToFutureAdapter.Completer) obj);
                break;
            case 6:
                ((AudioSource) obj2).lambda$postMaxAmplitude$11((AudioSource.AudioSourceCallback) obj);
                break;
            case 7:
                ((ViewTransition) obj2).lambda$applyTransition$0((View[]) obj);
                break;
            case 8:
                ((ResourcesCompat.FontCallback) obj2).lambda$callbackSuccessAsync$0((Typeface) obj);
                break;
            case 9:
                BasePageControl.m13763show$lambda34((BasePageControl) obj2, (InterfaceC6469a) obj);
                break;
            case 10:
                BoardControl.m13764drop$lambda10((BoardControl) obj2, (InterfaceC6471c) obj);
                break;
            case 11:
                final SketchActivity sketchActivity = (SketchActivity) obj;
                int i8 = SketchActivity.f5853v;
                final ArrayList arrayList = new ArrayList();
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.element = -1;
                for (String str : (List) obj2) {
                    try {
                        C3412f c3412fM2376w = ComponentCallbacks2C3408b.m2361d(sketchActivity).m5863c(sketchActivity).m2383i(File.class).mo2374c(ComponentCallbacks2C3414h.f2238m);
                        c3412fM2376w.f2234w = str;
                        c3412fM2376w.f2236y = true;
                        FutureC6445c futureC6445c = new FutureC6445c();
                        c3412fM2376w.m2373A(futureC6445c, futureC6445c, c3412fM2376w, AbstractC6658e.f11232b);
                        File file = (File) futureC6445c.get();
                        File file2 = new File(sketchActivity.getExternalCacheDir(), System.currentTimeMillis() + ".jpg");
                        int i9 = AbstractC3385e.f2155a;
                        if (file != null) {
                            if (file.isDirectory()) {
                                AbstractC3385e.m2329a(file, file2);
                            } else {
                                AbstractC3385e.m2330b(file, file2);
                            }
                        }
                        arrayList.add(file2.getAbsolutePath());
                    } catch (Exception e) {
                        String message = e.getMessage();
                        int i10 = 0;
                        if (message != null && AbstractC5855p.m5372F(message, "FileNotFoundException", false)) {
                            i10 = 1;
                        }
                        ref$IntRef.element = i10 ^ 1;
                    }
                }
                sketchActivity.runOnUiThread(new Runnable() { // from class: com.zykj.mistake.activity.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = SketchActivity.f5853v;
                        int i12 = ref$IntRef.element;
                        SketchActivity sketchActivity2 = sketchActivity;
                        if (i12 == 0) {
                            sketchActivity2.mo3962b("图片违规，无法导入");
                        } else if (i12 == 1) {
                            sketchActivity2.mo3962b("素材导入失败");
                        }
                        ArrayList arrayList2 = arrayList;
                        if (!arrayList2.isEmpty()) {
                            BoardFragment boardFragment = sketchActivity2.f5859j;
                            if (boardFragment == null) {
                                AbstractC5830k.m5339p("mSketchFragment");
                                throw null;
                            }
                            boardFragment.addBitmapList(arrayList2, true);
                        }
                        sketchActivity2.mo3963c();
                    }
                });
                break;
            case 12:
                ((StemWebView) obj2).m4481b((String) obj);
                break;
            case 13:
                SketchPlayerView.m13867loadData$lambda13$lambda12$lambda8$lambda6((InterfaceC6471c) obj2, (FileNotFoundException) obj);
                break;
            case 14:
                SketchPlayerView.m13865loadData$lambda13$lambda12$lambda5$lambda3((InterfaceC6471c) obj2, (HighVersionException) obj);
                break;
            case 15:
                SketchPlayerView.m13861loadData$lambda13$lambda12$lambda11$lambda9((InterfaceC6471c) obj2, (IOException) obj);
                break;
            case 16:
                SketchPlayerView.m13868loadData$lambda14((InterfaceC6471c) obj2, (String) obj);
                break;
            case 17:
                SketchPlayerView.m13863loadData$lambda13$lambda12$lambda2$lambda0((InterfaceC6471c) obj2, (LowVersionException) obj);
                break;
            case 18:
                SketchPlayerView.m13873seekTo$lambda22$lambda21$lambda20$lambda19((InterfaceC6471c) obj2, (Throwable) obj);
                break;
            case 19:
                ImagePickFragment.setUpCamera$lambda$5((ImagePickFragment) obj2, (InterfaceFutureC5453a) obj);
                break;
            case 20:
                ((C5961g) obj2).m5576C((C5447d) obj);
                break;
            case 21:
                FragmentStrictMode.handlePolicyViolation$lambda$0((FragmentStrictMode.Policy) obj2, (Violation) obj);
                break;
            case 22:
                FragmentStrictMode.handlePolicyViolation$lambda$1((String) obj2, (Violation) obj);
                break;
            default:
                ToOne.m5070a((ToOne) obj2, obj);
                break;
        }
    }
}
