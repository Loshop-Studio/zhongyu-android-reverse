package com.tencent.liteav.basic.util;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes4.dex */
public class TXHttpRequest {
    private static final int CON_TIMEOUT = 5000;
    private static final int READ_TIMEOUT = 5000;
    private static final String TAG = "TXHttpRequest";
    private long mNativeHttps;

    /* renamed from: com.tencent.liteav.basic.util.TXHttpRequest$b */
    public static class C6587b {

        /* renamed from: a */
        public int f5501a = 1;

        /* renamed from: b */
        public String f5502b = "";

        /* renamed from: c */
        public byte[] f5503c = "".getBytes();
    }

    public TXHttpRequest(long j10) {
        this.mNativeHttps = j10;
    }

    public static byte[] getHttpPostRsp(Map<String, String> map, String str, byte[] bArr) throws Exception {
        TXCLog.m4994i(TAG, "getHttpPostRsp->request: " + str);
        TXCLog.m4994i(TAG, "getHttpPostRsp->data size: " + bArr.length);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str.replace(" ", "%20")).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setRequestMethod("POST");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        dataOutputStream.close();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            TXCLog.m4994i(TAG, "getHttpPostRsp->response code: " + responseCode);
            throw new Exception("response: " + responseCode);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr, 0, bArr.length);
            if (i10 == -1) {
                byteArrayOutputStream.flush();
                inputStream.close();
                httpURLConnection.disconnect();
                TXCLog.m4994i(TAG, "getHttpsPostRsp->rsp size: " + byteArrayOutputStream.size());
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static byte[] getHttpsPostRsp(Map<String, String> map, String str, byte[] bArr) throws Exception {
        TXCLog.m4994i(TAG, "getHttpsPostRsp->request: " + str);
        TXCLog.m4994i(TAG, "getHttpsPostRsp->data: " + bArr.length);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str.replace(" ", "%20")).openConnection();
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setConnectTimeout(5000);
        httpsURLConnection.setReadTimeout(5000);
        httpsURLConnection.setRequestMethod("POST");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        dataOutputStream.close();
        int responseCode = httpsURLConnection.getResponseCode();
        if (responseCode != 200) {
            TXCLog.m4994i(TAG, "getHttpsPostRsp->response code: " + responseCode);
            throw new Exception("response: " + responseCode);
        }
        InputStream inputStream = httpsURLConnection.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr, 0, bArr.length);
            if (i10 == -1) {
                byteArrayOutputStream.flush();
                inputStream.close();
                httpsURLConnection.disconnect();
                TXCLog.m4994i(TAG, "getHttpsPostRsp->rsp size: " + byteArrayOutputStream.size());
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnRecvMessage(long j10, int i10, byte[] bArr);

    public void asyncPostRequest(Map<String, String> map, byte[] bArr, byte[] bArr2) {
        new AsyncTaskC6586a(this, map).execute(bArr, bArr2);
    }

    public int sendHttpsRequest(Map<String, String> map, String str, byte[] bArr) {
        TXCLog.m4994i(TAG, "sendHttpsRequest->enter action: " + str + ", data size: " + bArr.length);
        asyncPostRequest(map, str.getBytes(), bArr);
        return 0;
    }

    public int sendHttpsRequest(String str, byte[] bArr) {
        TXCLog.m4994i(TAG, "sendHttpsRequest->enter action: " + str + ", data size: " + bArr.length);
        asyncPostRequest(null, str.getBytes(), bArr);
        return 0;
    }

    /* renamed from: com.tencent.liteav.basic.util.TXHttpRequest$a */
    public static class AsyncTaskC6586a extends AsyncTask<byte[], Void, C6587b> {

        /* renamed from: a */
        private WeakReference<TXHttpRequest> f5495a;

        /* renamed from: b */
        private Handler f5496b;

        /* renamed from: c */
        private Map<String, String> f5497c;

        public AsyncTaskC6586a(TXHttpRequest tXHttpRequest, Map<String, String> map) {
            this.f5496b = null;
            this.f5497c = map;
            this.f5495a = new WeakReference<>(tXHttpRequest);
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                this.f5496b = new Handler(looperMyLooper);
            } else {
                this.f5496b = null;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6587b doInBackground(byte[]... bArr) {
            C6587b c6587b = new C6587b();
            try {
                if (new String(bArr[0]).startsWith("https")) {
                    c6587b.f5503c = TXHttpRequest.getHttpsPostRsp(this.f5497c, new String(bArr[0]), bArr[1]);
                } else {
                    c6587b.f5503c = TXHttpRequest.getHttpPostRsp(this.f5497c, new String(bArr[0]), bArr[1]);
                }
                c6587b.f5501a = 0;
            } catch (Exception e10) {
                c6587b.f5502b = e10.toString();
                c6587b.f5501a = 1;
            }
            TXCLog.m4994i(TXHttpRequest.TAG, "TXPostRequest->result: " + c6587b.f5501a + "|" + c6587b.f5502b);
            return c6587b;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(final C6587b c6587b) {
            super.onPostExecute(c6587b);
            final TXHttpRequest tXHttpRequest = this.f5495a.get();
            if (tXHttpRequest == null || tXHttpRequest.mNativeHttps == 0) {
                return;
            }
            Handler handler = this.f5496b;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.tencent.liteav.basic.util.TXHttpRequest.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TXCLog.m4994i(TXHttpRequest.TAG, "TXPostRequest->recvMsg: " + c6587b.f5501a + "|" + c6587b.f5502b);
                        TXHttpRequest tXHttpRequest2 = tXHttpRequest;
                        long j10 = tXHttpRequest2.mNativeHttps;
                        C6587b c6587b2 = c6587b;
                        tXHttpRequest2.nativeOnRecvMessage(j10, c6587b2.f5501a, c6587b2.f5503c);
                    }
                });
                return;
            }
            TXCLog.m4994i(TXHttpRequest.TAG, "TXPostRequest->recvMsg: " + c6587b.f5501a + "|" + c6587b.f5502b);
            tXHttpRequest.nativeOnRecvMessage(tXHttpRequest.mNativeHttps, c6587b.f5501a, c6587b.f5503c);
        }
    }
}
