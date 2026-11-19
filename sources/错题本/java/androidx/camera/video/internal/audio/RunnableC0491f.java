package androidx.camera.video.internal.audio;

import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.zykj.view.board.crop.BlackboardCropFragment;

/* renamed from: androidx.camera.video.internal.audio.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0491f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f609a;

    /* renamed from: b */
    public final /* synthetic */ int f610b;

    /* renamed from: c */
    public final /* synthetic */ Object f611c;

    public /* synthetic */ RunnableC0491f(int i, BlackboardCropFragment blackboardCropFragment) {
        this.f609a = 3;
        this.f610b = i;
        this.f611c = blackboardCropFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f609a) {
            case 0:
                ((BufferedAudioStream) this.f611c).lambda$updateCollectionBufferSizeAsync$4(this.f610b);
                break;
            case 1:
                ((ResourcesCompat.FontCallback) this.f611c).lambda$callbackFailAsync$1(this.f610b);
                break;
            case 2:
                ((SideSheetBehavior) this.f611c).lambda$setState$0(this.f610b);
                break;
            default:
                BlackboardCropFragment.load$lambda$17$lambda$16(this.f610b, (BlackboardCropFragment) this.f611c);
                break;
        }
    }

    public /* synthetic */ RunnableC0491f(Object obj, int i, int i8) {
        this.f609a = i8;
        this.f611c = obj;
        this.f610b = i;
    }
}
