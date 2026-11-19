package p070b.p146d.p152b.p154i;

import android.os.Message;
import android.util.Log;
import com.zykj.satisfaction.update.UpdateResp;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;
import p070b.p074b.p105b.C0768i;
import p070b.p146d.p152b.p154i.C0907f;

/* renamed from: b.d.b.i.d */
/* loaded from: classes.dex */
public class C0905d extends Thread {

    /* renamed from: b */
    public final /* synthetic */ String f4757b;

    /* renamed from: c */
    public final /* synthetic */ int f4758c;

    /* renamed from: d */
    public final /* synthetic */ C0907f f4759d;

    public C0905d(C0907f c0907f, String str, int i) {
        this.f4759d = c0907f;
        this.f4757b = str;
        this.f4758c = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws IOException {
        C0907f.d dVar;
        Message messageObtain;
        C0907f c0907f = this.f4759d;
        String str = this.f4757b;
        int i = this.f4758c;
        Objects.requireNonNull(c0907f);
        Boolean bool = Boolean.FALSE;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            StringBuilder sb = new StringBuilder();
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                } else {
                    sb.append(new String(bArr, 0, i2));
                }
            }
            Log.i("UpdateVersionManager", sb.toString());
            UpdateResp updateResp = (UpdateResp) new C0768i().m2450b(sb.toString(), UpdateResp.class);
            if (updateResp == null || updateResp.getResult() == null) {
                dVar = c0907f.f4764d;
            } else {
                UpdateResp.UpdateInfo result = updateResp.getResult();
                c0907f.f4766f = result;
                if (result != null && result.getVersionCode() > i) {
                    messageObtain = Message.obtain(c0907f.f4764d, 1, Boolean.TRUE);
                    messageObtain.sendToTarget();
                }
                dVar = c0907f.f4764d;
            }
            messageObtain = Message.obtain(dVar, 1, bool);
            messageObtain.sendToTarget();
        } catch (Exception e2) {
            Message.obtain(c0907f.f4764d, 1, bool).sendToTarget();
            e2.printStackTrace();
        }
    }
}
