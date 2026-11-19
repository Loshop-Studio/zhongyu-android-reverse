package p086f2;

import android.net.ParseException;
import com.google.gson.JsonParseException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import retrofit2.adapter.rxjava.HttpException;

/* renamed from: f2.a */
/* loaded from: classes.dex */
public class C2527a {

    /* renamed from: f2.a$a */
    public static class a extends Exception {

        /* renamed from: a */
        public String f10219a;

        public a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a */
    public static a m8493a(Throwable th) {
        a aVar = new a(th);
        if (th instanceof HttpException) {
            if (((HttpException) th).code() != 401) {
                aVar.f10219a = "网络错误";
            } else {
                aVar.f10219a = "用户未登录";
            }
            return aVar;
        }
        if ((th instanceof JsonParseException) || (th instanceof JSONException) || (th instanceof ParseException)) {
            aVar.f10219a = "解析错误";
            return aVar;
        }
        if (th instanceof ConnectException) {
            aVar.f10219a = "连接失败";
            return aVar;
        }
        if (th instanceof SocketTimeoutException) {
            aVar.f10219a = "连接超时";
            return aVar;
        }
        if (th instanceof SSLHandshakeException) {
            aVar.f10219a = "证书验证失败";
            return aVar;
        }
        aVar.f10219a = "未知错误";
        return aVar;
    }
}
