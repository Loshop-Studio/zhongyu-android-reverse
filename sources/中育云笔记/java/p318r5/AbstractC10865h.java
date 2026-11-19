package p318r5;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;

/* renamed from: r5.h */
/* loaded from: classes5.dex */
public abstract class AbstractC10865h {
    /* renamed from: a */
    public static boolean m23460a(Context context) {
        return System.currentTimeMillis() - AbstractC10877l.m23517a(context, "Privacy_MY", "flashKeyTime", -1L) > 43200000;
    }

    /* renamed from: b */
    public static boolean m23461b(Context context, String str) {
        if (context == null) {
            return true;
        }
        if (context.checkSelfPermission(str) == 0) {
            return false;
        }
        AbstractC10861f1.m23441m("hmsSdk", "not have read phone permission!");
        return true;
    }

    /* renamed from: c */
    public static boolean m23462c(Context context, String str, int i10) {
        String str2 = AbstractC10877l.m23524h(context, str) + ".xml";
        File file = new File(context.getFilesDir(), "../shared_prefs/" + str2);
        if (!file.exists()) {
            String str3 = context.getPackageName() + BundleUtil.UNDERLINE_TAG + str2;
            file = new File(context.getFilesDir(), "../../shared_prefs/" + str3);
        }
        long length = file.length();
        if (length <= i10) {
            return false;
        }
        AbstractC10861f1.m23436h("hmsSdk", String.format("reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i10)));
        return true;
    }

    /* renamed from: d */
    public static boolean m23463d(String str, long j10, long j11) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j10 - Long.parseLong(str) > j11;
        } catch (NumberFormatException unused) {
            AbstractC10861f1.m23441m("hmsSdk", "isTimeExpired(): Data type conversion error : number format !");
            return true;
        }
    }
}
