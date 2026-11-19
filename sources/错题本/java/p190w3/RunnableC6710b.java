package p190w3;

import com.p035xw.repo.BubbleSeekBar;
import p042d3.C5416a;

/* renamed from: w3.b */
/* loaded from: classes3.dex */
public final class RunnableC6710b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f11321a;

    /* renamed from: b */
    public final /* synthetic */ BubbleSeekBar f11322b;

    public /* synthetic */ RunnableC6710b(BubbleSeekBar bubbleSeekBar, int i) {
        this.f11321a = i;
        this.f11322b = bubbleSeekBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11321a;
        BubbleSeekBar bubbleSeekBar = this.f11322b;
        switch (i) {
            case 0:
                bubbleSeekBar.requestLayout();
                break;
            case 1:
                bubbleSeekBar.f5147k0 = false;
                bubbleSeekBar.m3625a();
                break;
            case 2:
                bubbleSeekBar.f5133d0.animate().alpha(bubbleSeekBar.f5106B ? 1.0f : 0.0f).setDuration(bubbleSeekBar.f5105A).setListener(new C5416a(this, 2)).start();
                break;
            default:
                int i8 = BubbleSeekBar.f5104o0;
                bubbleSeekBar.m3631h();
                bubbleSeekBar.f5120P = true;
                break;
        }
    }
}
