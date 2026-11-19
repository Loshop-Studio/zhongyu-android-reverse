package p114d6;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: d6.d */
/* loaded from: classes5.dex */
public class AsyncTaskC8994d extends AsyncTask {

    /* renamed from: a */
    public static final String f20959a = "d";

    /* renamed from: b */
    public static volatile boolean f20960b = false;

    /* renamed from: b */
    public static void m17552b() {
        if (m17553e()) {
            AbstractC8996f.m17564e(f20959a, "checkUpgradeBks, execute check task");
            new AsyncTaskC8994d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, AbstractC8992b.m17549a());
        }
    }

    /* renamed from: e */
    public static boolean m17553e() {
        if (f20960b) {
            return false;
        }
        Context contextM17549a = AbstractC8992b.m17549a();
        if (contextM17549a == null) {
            AbstractC8996f.m17565f(f20959a, "checkUpgradeBks, context is null");
            return false;
        }
        f20960b = true;
        long jM17567a = AbstractC8998h.m17567a("lastCheckTime", 0L, contextM17549a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jM17567a > 432000000) {
            AbstractC8998h.m17570d("lastCheckTime", jCurrentTimeMillis, contextM17549a);
            return true;
        }
        AbstractC8996f.m17564e(f20959a, "checkUpgradeBks, ignore");
        return false;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Context... contextArr) throws IOException {
        InputStream inputStreamM17547n;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            inputStreamM17547n = AbstractC8991a.m17547n(contextArr[0]);
        } catch (Exception e10) {
            AbstractC8996f.m17563d(f20959a, "doInBackground: exception : " + e10.getMessage());
            inputStreamM17547n = null;
        }
        AbstractC8996f.m17561b(f20959a, "doInBackground: get bks from hms tss cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        if (inputStreamM17547n == null) {
            return Boolean.FALSE;
        }
        AbstractC8995e.m17558b(inputStreamM17547n);
        return Boolean.TRUE;
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            AbstractC8996f.m17564e(f20959a, "onPostExecute: upate done");
        } else {
            AbstractC8996f.m17563d(f20959a, "onPostExecute: upate failed");
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        AbstractC8996f.m17564e(f20959a, "onProgressUpdate");
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        AbstractC8996f.m17561b(f20959a, "onPreExecute");
    }
}
