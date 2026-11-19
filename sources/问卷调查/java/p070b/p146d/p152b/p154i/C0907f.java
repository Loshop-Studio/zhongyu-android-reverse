package p070b.p146d.p152b.p154i;

import android.R;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.zykj.satisfaction.update.PercentCircleView;
import com.zykj.satisfaction.update.UpdateResp;
import io.github.inflationx.calligraphy3.C1088R;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

/* renamed from: b.d.b.i.f */
/* loaded from: classes.dex */
public class C0907f {

    /* renamed from: a */
    public Context f4761a;

    /* renamed from: b */
    public Dialog f4762b;

    /* renamed from: c */
    public ProgressDialog f4763c;

    /* renamed from: d */
    public d f4764d;

    /* renamed from: e */
    public a f4765e;

    /* renamed from: f */
    public UpdateResp.UpdateInfo f4766f;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: b.d.b.i.f$a */
    public class a extends Handler {

        /* renamed from: a */
        public b f4767a;

        /* renamed from: b */
        public int f4768b;

        public a(b bVar) {
            this.f4767a = bVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Toast.makeText(C0907f.this.f4761a, C1088R.string.file_download_failed, 0).show();
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f4768b = ((Integer) message.obj).intValue();
            } else if (this.f4768b > 0) {
                int iIntValue = ((Integer) message.obj).intValue();
                ((C0902a) this.f4767a).f4754a.setTargetPercent(iIntValue / this.f4768b);
            }
        }
    }

    /* renamed from: b.d.b.i.f$b */
    public interface b {
    }

    /* renamed from: b.d.b.i.f$c */
    public interface c {
    }

    /* renamed from: b.d.b.i.f$d */
    public static class d extends Handler {

        /* renamed from: a */
        public c f4770a;

        public d(c cVar) {
            this.f4770a = cVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
                final C0907f c0907f = ((C0904c) this.f4770a).f4756a;
                ProgressDialog progressDialog = c0907f.f4763c;
                if (progressDialog != null && progressDialog.isShowing()) {
                    c0907f.f4763c.dismiss();
                    c0907f.f4763c = null;
                }
                if (zBooleanValue) {
                    Dialog dialog = new Dialog(c0907f.f4761a, R.style.Theme.Dialog);
                    c0907f.f4762b = dialog;
                    dialog.getWindow().setBackgroundDrawableResource(R.color.transparent);
                    c0907f.f4762b.setContentView(C1088R.layout.dialog_update_process);
                    c0907f.f4762b.setCanceledOnTouchOutside(false);
                    c0907f.f4762b.setCancelable(false);
                    PercentCircleView percentCircleView = (PercentCircleView) c0907f.f4762b.findViewById(C1088R.id.pcv_update_process);
                    percentCircleView.getClass();
                    c0907f.f4765e = c0907f.new a(new C0902a(percentCircleView));
                    c0907f.f4762b.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: b.d.b.i.b
                        @Override // android.content.DialogInterface.OnKeyListener
                        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                            C0907f c0907f2 = c0907f;
                            Objects.requireNonNull(c0907f2);
                            if (i != 4 || keyEvent.getRepeatCount() != 0) {
                                return false;
                            }
                            Toast.makeText(c0907f2.f4761a, C1088R.string.downloading_wait, 0).show();
                            return true;
                        }
                    });
                    if (!Environment.getExternalStorageState().equals("mounted")) {
                        Toast.makeText(c0907f.f4761a, C1088R.string.sd_no_work, 0).show();
                    } else {
                        c0907f.f4762b.show();
                        new C0906e(c0907f).start();
                    }
                }
            }
        }
    }

    public C0907f(Context context) {
        this.f4761a = context;
    }

    /* renamed from: a */
    public File m2591a(String str) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(5000);
        int contentLength = httpURLConnection.getContentLength();
        if (contentLength > 0) {
            Message.obtain(this.f4765e, 3, Integer.valueOf(contentLength)).sendToTarget();
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        File file = new File(this.f4761a.getExternalCacheDir() + "/install.apk");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                byte[] bArr = new byte[1024];
                int i = 0;
                while (true) {
                    int i2 = bufferedInputStream.read(bArr);
                    if (i2 == -1) {
                        bufferedInputStream.close();
                        inputStream.close();
                        fileOutputStream.close();
                        return file;
                    }
                    i += i2;
                    fileOutputStream.write(bArr, 0, i2);
                    Message.obtain(this.f4765e, 2, Integer.valueOf(i)).sendToTarget();
                }
            } finally {
            }
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public void m2592b(File file) {
        Intent intent = new Intent();
        intent.setDataAndType(Build.VERSION.SDK_INT >= 24 ? FileProvider.m1694a(this.f4761a, "com.zykj.satisfaction.fileProvider").mo1697b(file) : Uri.fromFile(file), "application/vnd.android.package-archive");
        intent.setFlags(268435459);
        intent.setAction("android.intent.action.VIEW");
        this.f4761a.startActivity(intent);
    }
}
