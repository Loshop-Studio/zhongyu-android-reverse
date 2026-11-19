package p170h2;

import anet.channel.request.Request;
import com.alibaba.fastjson.JSON;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.friday.common.property.BaseResponse;
import java.nio.charset.Charset;
import je.AbstractC9746z;
import je.C9740t;
import je.C9745y;
import je.InterfaceC9739s;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Buffer;
import okio.BufferedSource;
import p310qd.AbstractC10793c0;

/* renamed from: h2.f */
/* loaded from: classes3.dex */
public final class C9455f implements InterfaceC9739s {
    @Override // je.InterfaceC9739s
    public C9745y intercept(InterfaceC9739s.a chain) {
        AbstractC9979u.m20294g(chain, "chain");
        C9745y c9745yMo19477a = chain.mo19477a(chain.request());
        if (c9745yMo19477a.m19638s()) {
            AbstractC9746z abstractC9746zM19628e = c9745yMo19477a.m19628e();
            if (abstractC9746zM19628e != null) {
                try {
                    BufferedSource bufferedSourceSource = abstractC9746zM19628e.source();
                    bufferedSourceSource.request(Long.MAX_VALUE);
                    Buffer buffer = bufferedSourceSource.getBuffer();
                    Charset charsetForName = Charset.forName(Request.DEFAULT_CHARSET);
                    C9740t c9740tContentType = abstractC9746zM19628e.contentType();
                    if (c9740tContentType != null) {
                        charsetForName = c9740tContentType.m19484c(charsetForName);
                    }
                    Buffer bufferClone = buffer.clone();
                    AbstractC9979u.m20291d(charsetForName);
                    String string = bufferClone.readString(charsetForName);
                    String strM18639b = AbstractC9451b.m18639b();
                    BaseResponse baseResponse = (BaseResponse) GsonUtils.fromJson(string, BaseResponse.class);
                    if (baseResponse.getData() != null) {
                        Object data = baseResponse.getData();
                        AbstractC9979u.m20292e(data, "null cannot be cast to non-null type kotlin.String");
                        baseResponse = new BaseResponse(baseResponse.getCode(), baseResponse.getMsg(), JSON.parseObject(AbstractC9450a.m18633c((String) data, strM18639b), Object.class));
                    }
                    String jSONString = JSON.toJSONString(baseResponse);
                    AbstractC9746z.b bVar = AbstractC9746z.Companion;
                    AbstractC9979u.m20291d(jSONString);
                    return c9745yMo19477a.m19641v().m19647b(bVar.m19667a(AbstractC10793c0.m23129e1(jSONString).toString(), c9740tContentType)).m19648c();
                } catch (Exception e10) {
                    LogUtils.m3887e("解密异常====》" + e10);
                    return c9745yMo19477a;
                }
            }
            LogUtils.m3888i("响应体为空");
        }
        return c9745yMo19477a;
    }
}
