package p154k5;

import java.lang.ref.WeakReference;

/* renamed from: k5.a */
/* loaded from: classes5.dex */
public class RunnableC9056a implements Runnable {

    /* renamed from: a */
    public WeakReference f17329a;

    public RunnableC9056a(InterfaceC9057b interfaceC9057b) {
        this.f17329a = new WeakReference(interfaceC9057b);
    }

    @Override // java.lang.Runnable
    public void run() {
        WeakReference weakReference = this.f17329a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((InterfaceC9057b) this.f17329a.get()).hide();
    }
}
