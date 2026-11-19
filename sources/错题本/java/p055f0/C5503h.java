package p055f0;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f0.h */
/* loaded from: classes2.dex */
public final class C5503h {

    /* renamed from: a */
    public static final Map f8517a;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            map.put(HttpHeaders.USER_AGENT, Collections.singletonList(new C5504i(property)));
        }
        f8517a = Collections.unmodifiableMap(map);
    }
}
