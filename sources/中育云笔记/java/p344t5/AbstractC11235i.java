package p344t5;

import android.app.Notification;
import android.text.TextUtils;
import com.huawei.hms.push.EnumC7321k;

/* renamed from: t5.i */
/* loaded from: classes5.dex */
public abstract class AbstractC11235i {
    /* renamed from: a */
    public static EnumC7321k m25009a(C11239m c11239m) {
        return (c11239m.m25036I() < 0 || c11239m.m25036I() >= EnumC7321k.values().length) ? EnumC7321k.STYLE_DEFAULT : EnumC7321k.values()[c11239m.m25036I()];
    }

    /* renamed from: b */
    public static void m25010b(Notification.Builder builder, String str, C11239m c11239m) {
        Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
        if (!TextUtils.isEmpty(c11239m.m25054o())) {
            bigTextStyle.setBigContentTitle(c11239m.m25054o());
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            bigTextStyle.bigText(str);
        }
        builder.setStyle(bigTextStyle);
    }
}
