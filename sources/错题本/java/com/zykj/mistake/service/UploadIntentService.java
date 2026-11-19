package com.zykj.mistake.service;

// RE note: The local directory packer is static method c(String, Messenger) in DEX. ZIP paths are relative to the notebook root, and empty directories have explicit entries.

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置、ZIP、文件流。

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3399s;
import com.zykj.mistake.R;
import com.zykj.mistake.entity.req.MonitorPictureReq;
import com.zykj.mistake.entity.req.TokenReq;
import com.zykj.mistake.entity.resp.GeneratorResp;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.utils.AbstractC5099d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import kotlinx.coroutines.AbstractC6014x;
import p030c6.AbstractC3234f;
import p073h4.AbstractC5626b;
import p151r5.AbstractC6465b;
import retrofit2.C6509n0;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/service/UploadIntentService;", "Landroid/app/IntentService;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class UploadIntentService extends IntentService {

    /* renamed from: a */
    public final String f7995a;

    public UploadIntentService() {
        super("UploadIntentService");
        this.f7995a = "UploadIntentService";
    }

    /* renamed from: b */
    public static void m4441b(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 0;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        try {
            messenger.send(messageObtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static String m4442c(String str, Messenger messenger) throws Throwable {
        List listM5204e0;
        File file = new File(str.concat("_upload.zip"));
        File[] fileArrListFiles = new File(str).listFiles();
        ZipOutputStream zipOutputStream = null;
        if (fileArrListFiles != null && (listM5204e0 = AbstractC5802q.m5204e0(fileArrListFiles)) != null) {
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file));
                try {
                    Iterator it = listM5204e0.iterator();
                    while (it.hasNext() && AbstractC3382c.m2321v((File) it.next(), "", zipOutputStream2)) {
                    }
                    zipOutputStream2.finish();
                    zipOutputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    zipOutputStream = zipOutputStream2;
                    if (zipOutputStream != null) {
                        zipOutputStream.finish();
                        zipOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        m4441b(TypedValues.TYPE_TARGET, null, messenger);
        String absolutePath = file.getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    /* renamed from: a */
    public final void m4443a(String str, String str2, Messenger messenger, boolean z8) throws RemoteException {
        if (!z8) {
            Bundle bundle = new Bundle();
            bundle.putString("UPLOAD_SUCCESS_URL", str);
            bundle.putString("UPLOAD_DATA", str2);
            m4441b(103, bundle, messenger);
            return;
        }
        String string = getApplicationContext().getString(R.string.app_name);
        AbstractC5830k.m5329f(string, "getString(...)");
        MonitorPictureReq monitorPictureReq = new MonitorPictureReq(string, "com.zykj.mistake", AbstractC5806u.m5267f(str));
        C5088a c5088a = C5088a.f7986a;
        C5088a.m4381b().m4400r(monitorPictureReq).m6079d(AbstractC3234f.f1799a).m6077a(AbstractC6465b.m6127a()).m6078b(new C5094b(this, messenger, str, str2));
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) throws Throwable {
        String str;
        String strM4442c;
        AbstractC5830k.m5327d(intent);
        int intExtra = intent.getIntExtra("UPLOAD_TYPE", 0);
        String stringExtra = intent.getStringExtra("UPLOAD_PATH");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = intent.getStringExtra("UPLOAD_DATA");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        Log.i("uploadImage", "start1:" + hashCode() + ", tag--->> " + stringExtra2);
        Bundle extras = intent.getExtras();
        AbstractC5830k.m5327d(extras);
        Object obj = extras.get("UPLOAD_MESSENGER");
        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type android.os.Messenger");
        Messenger messenger = (Messenger) obj;
        if (!AbstractC5099d.m4454d(getApplicationContext())) {
            m4441b(ComposerKt.compositionLocalMapKey, null, messenger);
            return;
        }
        try {
            String str2 = stringExtra;
            long j7 = AbstractC5626b.f8757a.getSharedPreferences("zykjMistake", 0).getLong("SP_USER_ID", -1L);
            String str3 = intExtra == 1 ? ".jpg" : ".zip";
            String string = UUID.randomUUID().toString();
            AbstractC5830k.m5329f(string, "toString(...)");
            String strM5407A = AbstractC5862w.m5407A(string, "-", "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            TokenReq tokenReq = new TokenReq(0, 0, str3, 0, null, strM5407A, jCurrentTimeMillis, AbstractC3382c.m2301b(j7 + "+mistake_v2+res+1+" + str3 + "+0+" + strM5407A + "+" + jCurrentTimeMillis), 27, null);
            String str4 = "mistake_v2/res/" + j7 + "/" + AbstractC3399s.m2350a().format(new Date(jCurrentTimeMillis)) + "/" + strM5407A + str3;
            C5088a c5088a = C5088a.f7986a;
            C6509n0 c6509n0Mo6145d = C5088a.m4381b().m4397o(tokenReq).mo6145d();
            AbstractC5830k.m5329f(c6509n0Mo6145d, "execute(...)");
            if (c6509n0Mo6145d.f10762a.f10107d == 401) {
                m4441b(ComposerKt.providerValuesKey, null, messenger);
                return;
            }
            GeneratorResp generatorResp = (GeneratorResp) c6509n0Mo6145d.f10763b;
            try {
                if (generatorResp == null || !generatorResp.getSuccess()) {
                    m4441b(ComposerKt.compositionLocalMapKey, null, messenger);
                    return;
                }
                if (intExtra == 2) {
                    str = str2;
                    strM4442c = m4442c(str, messenger);
                } else {
                    str = str2;
                    strM4442c = str;
                }
                m4441b(LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, null, messenger);
                String str5 = (String) AbstractC6014x.m5655z(EmptyCoroutineContext.INSTANCE, new UploadIntentService$onHandleIntent$resultUrl$1(strM4442c, str4, generatorResp, null));
                if (str5 == null || str5.length() == 0) {
                    m4441b(ComposerKt.compositionLocalMapKey, null, messenger);
                    return;
                }
                File file = new File(str.concat("_upload.zip"));
                if (file.exists()) {
                    file.delete();
                }
                m4443a(str5, stringExtra2, messenger, intExtra == 1);
            } catch (IOException e) {
                e = e;
                m4441b(ComposerKt.compositionLocalMapKey, null, messenger);
                e.printStackTrace();
            }
        } catch (IOException e4) {
            e = e4;
        }
    }
}
