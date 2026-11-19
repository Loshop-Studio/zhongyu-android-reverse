package p070b.p146d.p152b.p154i;

import android.os.Message;
import java.io.File;

/* renamed from: b.d.b.i.e */
/* loaded from: classes.dex */
public class C0906e extends Thread {

    /* renamed from: b */
    public final /* synthetic */ C0907f f4760b;

    public C0906e(C0907f c0907f) {
        this.f4760b = c0907f;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        try {
            C0907f c0907f = this.f4760b;
            File fileM2591a = c0907f.m2591a(c0907f.f4766f.getFileUrl());
            Thread.sleep(1000L);
            this.f4760b.f4762b.dismiss();
            this.f4760b.m2592b(fileM2591a);
        } catch (Exception e2) {
            Message.obtain(this.f4760b.f4765e, 1);
            this.f4760b.f4762b.dismiss();
            e2.printStackTrace();
        }
    }
}
