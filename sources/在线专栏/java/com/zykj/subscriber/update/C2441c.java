package com.zykj.subscriber.update;

import android.annotation.SuppressLint;
import android.app.Activity;
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
import android.os.Process;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.google.gson.Gson;
import com.zykj.subscriber.R;
import com.zykj.subscriber.update.UpdateResp;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;
import p096h2.C2656a;
import p116l2.C2840a;

/* renamed from: com.zykj.subscriber.update.c */
/* loaded from: classes.dex */
public class C2441c {

    /* renamed from: a */
    private Context f9958a;

    /* renamed from: b */
    private Dialog f9959b;

    /* renamed from: c */
    private ProgressDialog f9960c;

    /* renamed from: d */
    private f f9961d;

    /* renamed from: e */
    private c f9962e;

    /* renamed from: f */
    private UpdateResp.UpdateInfo f9963f;

    /* renamed from: com.zykj.subscriber.update.c$a */
    class a extends Thread {

        /* renamed from: a */
        final /* synthetic */ String f9964a;

        /* renamed from: b */
        final /* synthetic */ int f9965b;

        a(String str, int i4) {
            this.f9964a = str;
            this.f9965b = i4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws IOException {
            C2441c.this.m8150i(this.f9964a, this.f9965b);
        }
    }

    /* renamed from: com.zykj.subscriber.update.c$b */
    class b extends Thread {
        b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                C2441c c2441c = C2441c.this;
                File fileM8156l = c2441c.m8156l(c2441c.f9963f.getFileUrl());
                Thread.sleep(1000L);
                C2441c.this.f9959b.dismiss();
                C2441c.this.m8157m(fileM8156l);
            } catch (Exception e4) {
                Message.obtain(C2441c.this.f9962e, 1);
                C2441c.this.f9959b.dismiss();
                e4.printStackTrace();
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.zykj.subscriber.update.c$c */
    private class c extends Handler {

        /* renamed from: a */
        private d f9968a;

        /* renamed from: b */
        private int f9969b;

        public c(d dVar) {
            this.f9968a = dVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                Toast.makeText(C2441c.this.f9958a, R.string.file_download_failed, 0).show();
                return;
            }
            if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                this.f9969b = ((Integer) message.obj).intValue();
            } else if (this.f9969b > 0) {
                this.f9968a.mo8141a(((Integer) message.obj).intValue() / this.f9969b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zykj.subscriber.update.c$d */
    interface d {
        /* renamed from: a */
        void mo8141a(float f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zykj.subscriber.update.c$e */
    interface e {
        /* renamed from: a */
        void mo8142a(boolean z3);
    }

    /* renamed from: com.zykj.subscriber.update.c$f */
    private static class f extends Handler {

        /* renamed from: a */
        private e f9971a;

        public f(e eVar) {
            this.f9971a = eVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                this.f9971a.mo8142a(((Boolean) message.obj).booleanValue());
            }
        }
    }

    public C2441c(Context context) {
        this.f9958a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m8150i(String str, int i4) throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            StringBuilder sb = new StringBuilder();
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i5 = inputStream.read(bArr);
                if (i5 == -1) {
                    break;
                } else {
                    sb.append(new String(bArr, 0, i5));
                }
            }
            Log.i("UpdateVersionManager", sb.toString());
            UpdateResp updateResp = (UpdateResp) new Gson().fromJson(sb.toString(), UpdateResp.class);
            if (updateResp == null || updateResp.getResult() == null) {
                Message.obtain(this.f9961d, 1, Boolean.FALSE).sendToTarget();
                return;
            }
            UpdateResp.UpdateInfo result = updateResp.getResult();
            this.f9963f = result;
            if (result == null || result.getVersionCode() <= i4) {
                Message.obtain(this.f9961d, 1, Boolean.FALSE).sendToTarget();
            } else {
                Message.obtain(this.f9961d, 1, Boolean.TRUE).sendToTarget();
            }
        } catch (Exception e4) {
            Message.obtain(this.f9961d, 1, Boolean.FALSE).sendToTarget();
            e4.printStackTrace();
        }
    }

    /* renamed from: j */
    private void m8151j(boolean z3, int i4, int i5) {
        String str = C2656a.f10552a.m8918a() + "/api/services/app/AppStore/CheckUpdateAsync?packageName=com.zykj.subscriber&version=" + i5 + "&appType=" + i4;
        if (z3 && !((Activity) this.f9958a).isFinishing()) {
            Context context = this.f9958a;
            ProgressDialog progressDialogShow = ProgressDialog.show(context, context.getString(R.string.update_title), this.f9958a.getString(R.string.update_content));
            this.f9960c = progressDialogShow;
            progressDialogShow.setCanceledOnTouchOutside(true);
        }
        this.f9961d = new f(new e() { // from class: com.zykj.subscriber.update.b
            @Override // com.zykj.subscriber.update.C2441c.e
            /* renamed from: a */
            public final void mo8142a(boolean z4) {
                this.f9957a.m8153n(z4);
            }
        });
        new a(str, i5).start();
    }

    /* renamed from: k */
    private void m8152k() {
        Dialog dialog = new Dialog(this.f9958a, android.R.style.Theme.Dialog);
        this.f9959b = dialog;
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        this.f9959b.setContentView(R.layout.dialog_update_process);
        this.f9959b.setCanceledOnTouchOutside(false);
        this.f9959b.setCancelable(false);
        final PercentCircleView percentCircleView = (PercentCircleView) this.f9959b.findViewById(R.id.pcv_update_process);
        Objects.requireNonNull(percentCircleView);
        this.f9962e = new c(new d() { // from class: com.zykj.subscriber.update.a
            @Override // com.zykj.subscriber.update.C2441c.d
            /* renamed from: a */
            public final void mo8141a(float f4) {
                percentCircleView.setTargetPercent(f4);
            }
        });
        this.f9959b.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: k2.a
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
                return this.f10695a.m8154o(dialogInterface, i4, keyEvent);
            }
        });
        if (!Environment.getExternalStorageState().equals("mounted")) {
            Toast.makeText(this.f9958a, R.string.sd_no_work, 0).show();
        } else {
            this.f9959b.show();
            new b().start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m8153n(boolean z3) {
        ProgressDialog progressDialog = this.f9960c;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f9960c.dismiss();
            this.f9960c = null;
        }
        if (z3) {
            m8152k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ boolean m8154o(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        if (i4 != 4 || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        Toast.makeText(this.f9958a, R.string.downloading_wait, 0).show();
        return true;
    }

    /* renamed from: h */
    public void m8155h(boolean z3, int i4, int i5) {
        if (C2840a.m9537c(this.f9958a)) {
            return;
        }
        m8151j(z3, i4, i5);
    }

    /* renamed from: l */
    public File m8156l(String str) throws IOException {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(5000);
        int contentLength = httpURLConnection.getContentLength();
        if (contentLength > 0) {
            Message.obtain(this.f9962e, 3, Integer.valueOf(contentLength)).sendToTarget();
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        File file = new File(this.f9958a.getExternalCacheDir() + "/install.apk");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                byte[] bArr = new byte[1024];
                int i4 = 0;
                while (true) {
                    int i5 = bufferedInputStream.read(bArr);
                    if (i5 == -1) {
                        bufferedInputStream.close();
                        inputStream.close();
                        fileOutputStream.close();
                        return file;
                    }
                    i4 += i5;
                    fileOutputStream.write(bArr, 0, i5);
                    Message.obtain(this.f9962e, 2, Integer.valueOf(i4)).sendToTarget();
                }
            } finally {
            }
        } catch (FileNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    protected void m8157m(File file) {
        Intent intent = new Intent();
        intent.setDataAndType(Build.VERSION.SDK_INT >= 24 ? FileProvider.m1797e(this.f9958a, "com.zykj.subscriber.fileProvider", file) : Uri.fromFile(file), "application/vnd.android.package-archive");
        intent.setFlags(268435459);
        intent.setAction("android.intent.action.VIEW");
        this.f9958a.startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(0);
    }
}
