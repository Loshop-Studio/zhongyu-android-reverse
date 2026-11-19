package p009a8;

import android.os.Environment;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.p011ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.p011ui.text.input.TextInputServiceAndroid;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.constraintlayout.helper.widget.Carousel;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.tencent.bugly.crashreport.CrashReport;
import com.zykj.blackboard.core.edit.BasePageControl;
import com.zykj.blackboard.core.edit.BoardControl;
import com.zykj.blackboard.core.record.TimeRecord;
import com.zykj.mistake.R;
import com.zykj.mistake.application.MistakeApplication;
import com.zykj.mistake.databinding.DialogMistakeTagAddBinding;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.widget.StemWebView;
import com.zykj.paint.render.SketchViewer;
import com.zykj.sketch.core.record.SketchRecorderView;
import io.objectbox.relation.ToMany;
import java.io.File;
import kotlin.jvm.internal.AbstractC5830k;
import org.angmarch.views.NiceSpinner;
import p049e1.InterfaceFutureC5453a;
import p059f5.C5531e;
import p059f5.ViewOnLongClickListenerC5529c;
import p106l4.DialogC6058i;
import p152r6.InterfaceC6469a;

/* renamed from: a8.a */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0023a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f62a;

    /* renamed from: b */
    public final /* synthetic */ Object f63b;

    public /* synthetic */ RunnableC0023a(Object obj, int i) {
        this.f62a = i;
        this.f63b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        final int i = 1;
        switch (this.f62a) {
            case 0:
                ((NiceSpinner) this.f63b).m6022g();
                return;
            case 1:
                ((Camera2CameraControl) this.f63b).completeInFlightUpdate();
                return;
            case 2:
                ((CameraStateRegistry.OnOpenAvailableListener) this.f63b).onOpenAvailable();
                return;
            case 3:
                ((CameraStateRegistry.OnConfigureAvailableListener) this.f63b).onConfigureAvailable();
                return;
            case 4:
                ((InterfaceFutureC5453a) this.f63b).cancel(true);
                return;
            case 5:
                ((CallbackToFutureAdapter.Completer) this.f63b).set(null);
                return;
            case 6:
                ((DualSurfaceProcessor) this.f63b).lambda$release$4();
                return;
            case 7:
                ((DualSurfaceProcessorNode) this.f63b).lambda$release$1();
                return;
            case 8:
                ProcessCameraProvider.shutdownAsync$lambda$0((ProcessCameraProvider) this.f63b);
                return;
            case 9:
                ((AudioStream.AudioStreamCallback) this.f63b).onSilenceStateChanged(true);
                return;
            case 10:
                RippleHostView.setRippleState$lambda$2((RippleHostView) this.f63b);
                return;
            case 11:
                ((InterfaceC6469a) this.f63b).invoke();
                return;
            case 12:
                AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0((AndroidContentCaptureManager) this.f63b);
                return;
            case 13:
                TextInputServiceAndroid.sendInputCommand$lambda$1((TextInputServiceAndroid) this.f63b);
                return;
            case 14:
                ((Carousel) this.f63b).lambda$updateItems$0();
                return;
            case 15:
                ((CarouselLayoutManager) this.f63b).refreshKeylineState();
                return;
            case 16:
                ((MaterialBackOrchestrator) this.f63b).startListeningForBackCallbacksWithPriorityOverlay();
                return;
            case 17:
                BasePageControl.m13762release$lambda23((BasePageControl) this.f63b);
                return;
            case 18:
                BoardControl.m13766release$lambda17((BoardControl) this.f63b);
                return;
            case 19:
                ((SketchViewer) this.f63b).renderTemp();
                return;
            case 20:
                SketchRecorderView.m13878_init_$lambda0((SketchRecorderView) this.f63b);
                return;
            case 21:
                final StemWebView stemWebView = (StemWebView) this.f63b;
                WebView webView = stemWebView.f8094a;
                webView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                stemWebView.addView(webView);
                CrashReport.setJavascriptMonitor(webView, true);
                webView.setInitialScale(stemWebView.f8097d);
                webView.setOnLongClickListener(new ViewOnLongClickListenerC5529c());
                final int i8 = 0;
                webView.setVerticalScrollBarEnabled(false);
                webView.setHorizontalScrollBarEnabled(false);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setTextZoom(100);
                webView.getSettings().setMixedContentMode(0);
                webView.setWebViewClient(new C5531e(stemWebView));
                LinearLayout linearLayout = new LinearLayout(stemWebView.getContext());
                stemWebView.f8100g = linearLayout;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.rightMargin = stemWebView.getResources().getDimensionPixelSize(R.dimen.view_5);
                layoutParams.topMargin = stemWebView.getResources().getDimensionPixelSize(R.dimen.view_5);
                layoutParams.addRule(21);
                linearLayout.setLayoutParams(layoutParams);
                stemWebView.addView(linearLayout);
                linearLayout.setVisibility(stemWebView.f8101h ? 0 : 8);
                ImageView imageView = new ImageView(stemWebView.getContext());
                imageView.setLayoutParams(new LinearLayout.LayoutParams(stemWebView.getResources().getDimensionPixelSize(R.dimen.view_20), stemWebView.getResources().getDimensionPixelSize(R.dimen.view_15)));
                imageView.setPadding(stemWebView.getResources().getDimensionPixelSize(R.dimen.view_4), stemWebView.getResources().getDimensionPixelSize(R.dimen.view_2), stemWebView.getResources().getDimensionPixelSize(R.dimen.view_4), stemWebView.getResources().getDimensionPixelSize(R.dimen.view_2));
                imageView.setImageResource(R.drawable.ic_stem_enlarge);
                imageView.setBackgroundResource(R.drawable.selector_bg_stem_btn);
                linearLayout.addView(imageView);
                ImageView imageView2 = new ImageView(stemWebView.getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(stemWebView.getResources().getDimensionPixelSize(R.dimen.view_20), stemWebView.getResources().getDimensionPixelSize(R.dimen.view_15));
                layoutParams2.leftMargin = stemWebView.getResources().getDimensionPixelSize(R.dimen.view_3);
                imageView2.setLayoutParams(layoutParams2);
                imageView2.setPadding(stemWebView.getResources().getDimensionPixelSize(R.dimen.view_4), stemWebView.getResources().getDimensionPixelSize(R.dimen.view_2), stemWebView.getResources().getDimensionPixelSize(R.dimen.view_4), stemWebView.getResources().getDimensionPixelSize(R.dimen.view_2));
                imageView2.setImageResource(R.drawable.ic_stem_reduce);
                imageView2.setBackgroundResource(R.drawable.selector_bg_stem_btn);
                linearLayout.addView(imageView2);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: f5.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i8) {
                            case 0:
                                StemWebView stemWebView2 = stemWebView;
                                int i9 = stemWebView2.f8099f;
                                if (i9 < stemWebView2.f8098e) {
                                    stemWebView2.f8099f = i9 + 10;
                                }
                                stemWebView2.f8094a.setInitialScale(stemWebView2.f8097d + stemWebView2.f8099f);
                                break;
                            default:
                                StemWebView stemWebView3 = stemWebView;
                                int i10 = stemWebView3.f8099f;
                                if (i10 > 0) {
                                    stemWebView3.f8099f = i10 - 10;
                                }
                                stemWebView3.f8094a.setInitialScale(stemWebView3.f8097d + stemWebView3.f8099f);
                                break;
                        }
                    }
                });
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: f5.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i) {
                            case 0:
                                StemWebView stemWebView2 = stemWebView;
                                int i9 = stemWebView2.f8099f;
                                if (i9 < stemWebView2.f8098e) {
                                    stemWebView2.f8099f = i9 + 10;
                                }
                                stemWebView2.f8094a.setInitialScale(stemWebView2.f8097d + stemWebView2.f8099f);
                                break;
                            default:
                                StemWebView stemWebView3 = stemWebView;
                                int i10 = stemWebView3.f8099f;
                                if (i10 > 0) {
                                    stemWebView3.f8099f = i10 - 10;
                                }
                                stemWebView3.f8094a.setInitialScale(stemWebView3.f8097d + stemWebView3.f8099f);
                                break;
                        }
                    }
                });
                return;
            case 22:
                MistakeApplication mistakeApplication = (MistakeApplication) this.f63b;
                int i9 = MistakeApplication.f5988b;
                File filesDir = mistakeApplication.getApplicationContext().getFilesDir();
                AbstractC5830k.m5329f(filesDir, "getFilesDir(...)");
                AbstractC5099d.m4451a(filesDir);
                File cacheDir = mistakeApplication.getApplicationContext().getCacheDir();
                AbstractC5830k.m5329f(cacheDir, "getCacheDir(...)");
                AbstractC5099d.m4451a(cacheDir);
                File externalFilesDir = mistakeApplication.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
                if (externalFilesDir != null) {
                    AbstractC5099d.m4451a(externalFilesDir);
                    return;
                }
                return;
            case 23:
                ToMany toMany = (ToMany) this.f63b;
                toMany.internalApplyToDb(toMany.f8983b.m5031b(), toMany.f8984c.m5031b());
                return;
            case 24:
                DialogC6058i dialogC6058i = (DialogC6058i) this.f63b;
                Object systemService = dialogC6058i.getContext().getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    DialogMistakeTagAddBinding dialogMistakeTagAddBinding = dialogC6058i.f9657b;
                    if (dialogMistakeTagAddBinding != null) {
                        inputMethodManager.showSoftInput(dialogMistakeTagAddBinding.f6114a, 1);
                        return;
                    } else {
                        AbstractC5830k.m5339p("mBinding");
                        throw null;
                    }
                }
                return;
            default:
                TimeRecord.m13796startRecord$lambda0((TimeRecord) this.f63b);
                return;
        }
    }
}
