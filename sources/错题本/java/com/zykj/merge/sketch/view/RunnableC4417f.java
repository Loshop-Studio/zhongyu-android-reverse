package com.zykj.merge.sketch.view;

import android.graphics.Bitmap;
import android.support.v4.media.AbstractC0037f;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zykj.mistake.feature.notebook.detail.C4764a5;
import com.zykj.mistake.feature.notebook.detail.C4791f;
import com.zykj.mistake.utils.AbstractC5101f;
import com.zykj.mistake.widget.StemWebView;
import com.zykj.sketch.core.player.SketchPlayerView;
import com.zykj.view.simpleBoard.SimpleBoardView;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.text.AbstractC5855p;
import p045d6.C5443s;
import p073h4.AbstractC5625a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: com.zykj.merge.sketch.view.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4417f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5658a;

    /* renamed from: b */
    public final /* synthetic */ int f5659b;

    /* renamed from: c */
    public final /* synthetic */ Object f5660c;

    /* renamed from: d */
    public final /* synthetic */ Object f5661d;

    /* renamed from: e */
    public final /* synthetic */ Object f5662e;

    public /* synthetic */ RunnableC4417f(RelativeLayout relativeLayout, int i, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i8) {
        this.f5658a = i8;
        this.f5660c = relativeLayout;
        this.f5659b = i;
        this.f5661d = interfaceC6471c;
        this.f5662e = interfaceC6471c2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5658a) {
            case 0:
                OldSketchProxyView.m13837seekTo$lambda9((OldSketchProxyView) this.f5660c, this.f5659b, (InterfaceC6471c) this.f5661d, (InterfaceC6471c) this.f5662e);
                break;
            case 1:
                final C4764a5 c4764a5 = (C4764a5) this.f5660c;
                final C4791f c4791f = (C4791f) this.f5661d;
                StemWebView stemWebView = (StemWebView) this.f5662e;
                if (c4764a5.m4171g(c4791f)) {
                    final Bitmap bitmapM4480a = stemWebView.m4480a();
                    if (bitmapM4480a != null) {
                        final File file = new File(AbstractC5101f.m4464b("AskMaterial"));
                        final int i = this.f5659b;
                        final File file2 = new File(file, AbstractC0037f.m82g(i, "stem_snapshot_", ".jpg"));
                        AbstractC5625a.m4955o("StemSnapshotWriter", new InterfaceC6469a() { // from class: com.zykj.mistake.feature.notebook.detail.u4
                            @Override // p152r6.InterfaceC6469a
                            public final Object invoke() {
                                Object objM13956constructorimpl;
                                final C4764a5 c4764a52;
                                SimpleBoardView simpleBoardView;
                                FileOutputStream fileOutputStream;
                                File file3 = file;
                                final File file4 = file2;
                                Bitmap bitmap = bitmapM4480a;
                                try {
                                    file3.mkdirs();
                                    fileOutputStream = new FileOutputStream(file4);
                                    try {
                                    } finally {
                                    }
                                } catch (Throwable th) {
                                    objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
                                }
                                if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 92, fileOutputStream)) {
                                    throw new IllegalStateException("Save stem snapshot failed");
                                }
                                fileOutputStream.close();
                                objM13956constructorimpl = Result.m13956constructorimpl(file4.getAbsolutePath());
                                if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
                                    objM13956constructorimpl = null;
                                }
                                final String str = (String) objM13956constructorimpl;
                                if (str != null && !AbstractC5855p.m5382P(str) && (simpleBoardView = (c4764a52 = c4764a5).f6894a) != null) {
                                    final C4791f c4791f2 = c4791f;
                                    final int i8 = i;
                                    simpleBoardView.post(new Runnable() { // from class: com.zykj.mistake.feature.notebook.detail.v4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C4764a5 c4764a53 = c4764a52;
                                            C4791f c4791f3 = c4791f2;
                                            int i9 = i8;
                                            String str2 = str;
                                            File file5 = file4;
                                            if (c4764a53.m4171g(c4791f3) && c4764a53.f6899f == i9) {
                                                InterfaceC6473e interfaceC6473e = c4764a53.f6904k;
                                                if (interfaceC6473e != null) {
                                                    interfaceC6473e.invoke(Integer.valueOf(i9), str2);
                                                }
                                                AbstractC5625a.m4955o("StemSnapshotCleaner", new C4898w4(c4764a53, i9, file5));
                                            }
                                        }
                                    });
                                }
                                return C5443s.f8405a;
                            }
                        });
                        c4764a5.m4176l(c4791f, bitmapM4480a);
                    } else {
                        SimpleBoardView simpleBoardView = c4764a5.f6894a;
                        if (simpleBoardView != null) {
                            c4764a5.m4168d(simpleBoardView);
                        }
                        c4764a5.m4174j(c4791f);
                    }
                    FrameLayout frameLayout = c4764a5.f6895b;
                    if (frameLayout != null) {
                        frameLayout.removeAllViews();
                        break;
                    }
                }
                break;
            default:
                SketchPlayerView.m13869seekTo$lambda22((SketchPlayerView) this.f5660c, this.f5659b, (InterfaceC6471c) this.f5661d, (InterfaceC6471c) this.f5662e);
                break;
        }
    }

    public /* synthetic */ RunnableC4417f(C4764a5 c4764a5, C4791f c4791f, StemWebView stemWebView, int i) {
        this.f5658a = 1;
        this.f5660c = c4764a5;
        this.f5661d = c4791f;
        this.f5662e = stemWebView;
        this.f5659b = i;
    }
}
