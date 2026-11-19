package com.tencent.liteav.basic.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.util.C6588a;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.ugc.TXRecordCommon;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: com.tencent.liteav.basic.util.e */
/* loaded from: classes4.dex */
public class C6592e {

    /* renamed from: a */
    public static long f5518a = 0;

    /* renamed from: b */
    private static boolean f5519b = true;

    /* renamed from: c */
    private static String f5520c = "";

    /* renamed from: d */
    private static int f5521d = 0;

    /* renamed from: e */
    private static long f5522e = 0;

    /* renamed from: f */
    private static boolean f5523f = false;

    /* renamed from: g */
    private static C6588a<C6589b> f5524g = new C6588a<>(new C6588a.a<C6589b>() { // from class: com.tencent.liteav.basic.util.e.1
        @Override // com.tencent.liteav.basic.util.C6588a.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6589b mo5020a() {
            return new C6589b();
        }
    });

    /* renamed from: h */
    private static final Object f5525h = new Object();

    /* renamed from: i */
    private static boolean f5526i = false;

    /* renamed from: j */
    private static int[] f5527j = {96000, 88200, 64000, 48000, TXRecordCommon.AUDIO_SAMPLERATE_44100, TXRecordCommon.AUDIO_SAMPLERATE_32000, 24000, 22050, 16000, 12000, 11025, TXRecordCommon.AUDIO_SAMPLERATE_8000, 7350};

    /* renamed from: c */
    public static int m5053c(Context context) {
        if (context == null) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 9) {
            return 5;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        if (activeNetworkInfo.getType() != 0) {
            return 0;
        }
        switch (telephonyManager.getNetworkType()) {
        }
        return 0;
    }

    /* renamed from: d */
    public static String m5055d() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: e */
    public static String m5057e() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: f */
    public static boolean m5058f() {
        boolean z10;
        synchronized (f5525h) {
            try {
                if (!f5526i) {
                    Log.w("Native-LiteAV", "load library txffmpeg " + m5044a("txffmpeg"));
                    Log.w("Native-LiteAV", "load library traeimp-rtmp " + m5044a("traeimp-rtmp"));
                    f5526i = m5044a("liteavsdk");
                    Log.w("Native-LiteAV", "load library liteavsdk " + f5526i);
                }
                z10 = f5526i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    /* renamed from: g */
    public static String m5059g() {
        return f5520c;
    }

    /* renamed from: b */
    public static int m5048b() {
        if (f5523f || (f5522e != 0 && TXCTimeUtil.getTimeTick() - f5522e < 15000)) {
            return f5521d;
        }
        f5523f = true;
        AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.basic.util.e.2
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                boolean unused = C6592e.f5523f = false;
                try {
                    Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                    Debug.getMemoryInfo(memoryInfo);
                    int totalPss = memoryInfo.getTotalPss();
                    long unused2 = C6592e.f5522e = TXCTimeUtil.getTimeTick();
                    int unused3 = C6592e.f5521d = totalPss / 1024;
                } catch (Exception unused4) {
                }
            }
        });
        return f5521d;
    }

    /* renamed from: d */
    public static String m5056d(Context context) {
        return TXCDRApi.getDevUUID(context, TXCDRApi.getSimulateIDFA(context));
    }

    /* renamed from: a */
    public static int[] m5047a() {
        if (f5519b) {
            f5519b = false;
            f5524g.m5019a().m5023a();
            return new int[]{0, 0};
        }
        return f5524g.m5019a().m5023a();
    }

    /* renamed from: b */
    public static String m5050b(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    /* renamed from: a */
    public static String m5039a(Context context) {
        return TXCDRApi.getSimulateIDFA(context);
    }

    /* renamed from: a */
    public static void m5043a(WeakReference<InterfaceC6559b> weakReference, String str, int i10, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("EVT_USERID", str);
        bundle.putInt("EVT_ID", i10);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (str2 != null) {
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str2);
        }
        m5040a(weakReference, i10, bundle);
    }

    /* renamed from: c */
    public static String m5054c() {
        return Build.MODEL;
    }

    /* renamed from: b */
    private static boolean m5052b(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Log.w("Native-LiteAV", "load library " + str2 + " from path " + str);
            System.load(str + "/lib" + str2 + ".so");
            return true;
        } catch (Error e10) {
            Log.w("Native-LiteAV", "load library : " + e10.toString());
            return false;
        } catch (Exception e11) {
            Log.w("Native-LiteAV", "load library : " + e11.toString());
            return false;
        }
    }

    /* renamed from: a */
    public static void m5041a(WeakReference<InterfaceC6559b> weakReference, int i10, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", i10);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (str != null) {
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        }
        m5040a(weakReference, i10, bundle);
    }

    /* renamed from: b */
    public static void m5051b(String str) {
        Log.w("Native-LiteAV", "setLibraryPath " + str);
        f5520c = str;
    }

    /* renamed from: a */
    public static void m5040a(WeakReference<InterfaceC6559b> weakReference, int i10, Bundle bundle) {
        InterfaceC6559b interfaceC6559b;
        if (weakReference == null || (interfaceC6559b = weakReference.get()) == null) {
            return;
        }
        interfaceC6559b.onNotifyEvent(i10, bundle);
    }

    /* renamed from: a */
    public static void m5042a(WeakReference<InterfaceC6559b> weakReference, String str, int i10, Bundle bundle) {
        InterfaceC6559b interfaceC6559b;
        if (weakReference == null || (interfaceC6559b = weakReference.get()) == null) {
            return;
        }
        bundle.putString("EVT_USERID", str);
        interfaceC6559b.onNotifyEvent(i10, bundle);
    }

    /* renamed from: a */
    public static boolean m5044a(String str) {
        try {
            Log.w("Native-LiteAV", "load library " + str + " from system path ");
            System.loadLibrary(str);
            return true;
        } catch (Error e10) {
            Log.w("Native-LiteAV", "load library : " + e10.toString());
            return m5052b(f5520c, str);
        } catch (Exception e11) {
            Log.w("Native-LiteAV", "load library : " + e11.toString());
            return m5052b(f5520c, str);
        }
    }

    /* renamed from: a */
    public static int m5036a(int i10) {
        int[] iArr;
        int i11 = 0;
        while (true) {
            iArr = f5527j;
            if (i11 >= iArr.length || iArr[i11] == i10) {
                break;
            }
            i11++;
        }
        if (i11 >= iArr.length) {
            return -1;
        }
        return i11;
    }

    @TargetApi(16)
    /* renamed from: a */
    public static MediaFormat m5038a(int i10, int i11, int i12) {
        int iM5036a = m5036a(i10);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put(0, (byte) ((i12 << 3) | (iM5036a >> 1)));
        byteBufferAllocate.put(1, (byte) (((iM5036a & 1) << 7) | (i11 << 3)));
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i10, i11);
        mediaFormatCreateAudioFormat.setInteger("channel-count", i11);
        mediaFormatCreateAudioFormat.setInteger("sample-rate", i10);
        mediaFormatCreateAudioFormat.setByteBuffer("csd-0", byteBufferAllocate);
        return mediaFormatCreateAudioFormat;
    }

    /* renamed from: a */
    public static boolean m5045a(String str, String str2) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap frameAtTime;
        FileOutputStream fileOutputStream;
        if (str == null || str2 == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            if (!new File(str).exists()) {
                return false;
            }
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    File file = new File(str2);
                    if (file.exists()) {
                        file.delete();
                    }
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                try {
                    fileOutputStream.close();
                } catch (IOException unused) {
                }
                mediaMetadataRetriever.release();
                return true;
            } catch (Exception e11) {
                e = e11;
                fileOutputStream2 = fileOutputStream;
                TXCLog.m4992e("TXCSystemUtil", "get video thumb failed.", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            mediaMetadataRetriever = null;
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever = null;
        }
    }
}
