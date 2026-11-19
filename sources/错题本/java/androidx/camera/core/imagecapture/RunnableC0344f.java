package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.ProcessingNode;

/* renamed from: androidx.camera.core.imagecapture.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0344f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f428a;

    /* renamed from: b */
    public final /* synthetic */ ProcessingNode f429b;

    /* renamed from: c */
    public final /* synthetic */ ProcessingNode.InputPacket f430c;

    public /* synthetic */ RunnableC0344f(ProcessingNode processingNode, ProcessingNode.InputPacket inputPacket, int i) {
        this.f428a = i;
        this.f429b = processingNode;
        this.f430c = inputPacket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f428a) {
            case 0:
                this.f429b.lambda$transform$2(this.f430c);
                break;
            default:
                this.f429b.lambda$transform$0(this.f430c);
                break;
        }
    }
}
