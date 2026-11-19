package p188n5;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.work.WorkRequest;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXLog;
import java.lang.ref.WeakReference;

/* renamed from: n5.c */
/* loaded from: classes5.dex */
public class C9423c {

    /* renamed from: a */
    public WeakReference f18608a;

    /* renamed from: b */
    public WeakReference f18609b;

    /* renamed from: c */
    public int f18610c = 0;

    /* renamed from: d */
    public String f18611d = "";

    /* renamed from: e */
    public long f18612e = 0;

    /* renamed from: f */
    public long f18613f = 0;

    /* renamed from: g */
    public boolean f18614g;

    /* renamed from: n5.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TXLog.m5759w("NetWatcher", "net check loading count = " + C9423c.this.f18610c + " loading time = " + C9423c.this.f18612e);
            if (C9423c.this.f18610c >= 3 || C9423c.this.f18612e >= WorkRequest.MIN_BACKOFF_MILLIS) {
                C9423c.this.m17265j();
            }
            C9423c.this.f18610c = 0;
            C9423c.this.f18612e = 0L;
        }
    }

    /* renamed from: n5.c$b */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ Context f18616a;

        public b(Context context) {
            this.f18616a = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            TXLivePlayer tXLivePlayer = C9423c.this.f18609b != null ? (TXLivePlayer) C9423c.this.f18609b.get() : null;
            String strReplace = C9423c.this.f18611d.replace(".flv", "_900.flv");
            if (tXLivePlayer != null && !TextUtils.isEmpty(strReplace)) {
                if (tXLivePlayer.switchStream(strReplace) < 0) {
                    Toast.makeText(this.f18616a, "切换高清清晰度失败，请稍候重试", 0).show();
                } else {
                    Toast.makeText(this.f18616a, "正在为您切换为高清清晰度，请稍候...", 0).show();
                }
            }
            dialogInterface.dismiss();
        }
    }

    public C9423c(Context context) {
        this.f18608a = new WeakReference(context);
    }

    /* renamed from: h */
    public void m17263h() {
        if (this.f18614g) {
            this.f18610c++;
            this.f18613f = System.currentTimeMillis();
        }
    }

    /* renamed from: i */
    public void m17264i() {
        if (!this.f18614g || this.f18613f == 0) {
            return;
        }
        this.f18612e += System.currentTimeMillis() - this.f18613f;
        this.f18613f = 0L;
    }

    /* renamed from: j */
    public final void m17265j() {
        Context context = (Context) this.f18608a.get();
        if (context == null) {
            return;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).create();
        alertDialogCreate.setMessage("检测到您的网络较差，建议切换清晰度");
        alertDialogCreate.setButton(-3, "OK", new b(context));
        alertDialogCreate.show();
    }

    /* renamed from: k */
    public void m17266k(String str, TXLivePlayer tXLivePlayer) {
        this.f18614g = true;
        this.f18609b = new WeakReference(tXLivePlayer);
        this.f18611d = str;
        this.f18610c = 0;
        this.f18612e = 0L;
        this.f18613f = 0L;
        TXLog.m5759w("NetWatcher", "net check start watch ");
        new Handler(Looper.getMainLooper()).postDelayed(new a(), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }

    /* renamed from: l */
    public void m17267l() {
        this.f18614g = false;
        this.f18610c = 0;
        this.f18612e = 0L;
        this.f18613f = 0L;
        this.f18611d = "";
        this.f18609b = null;
        TXLog.m5759w("NetWatcher", "net check stop watch");
    }
}
