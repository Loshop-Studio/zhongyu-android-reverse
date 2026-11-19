package p343t4;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: t4.m */
/* loaded from: classes5.dex */
public abstract class AbstractC11225m {
    /* renamed from: a */
    public static String m24975a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            Log.w("ResourcesUtils", "resName is empty");
            return null;
        }
        int identifier = context.getResources().getIdentifier(str2, TypedValues.Custom.S_STRING, str);
        if (identifier == 0) {
            Log.w("ResourcesUtils", "resId == 0");
            return null;
        }
        try {
            return context.getResources().getString(identifier);
        } catch (Resources.NotFoundException e10) {
            Log.e("ResourcesUtils", "resources not fund" + e10.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static String m24976b(Context context, String str, String str2, String str3) {
        try {
            return m24975a(context, str, str2 + AbstractC11213a.m24933c(m24977c(str3.getBytes("utf-8"))));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e10) {
            Log.e("ResourcesUtils", "getResources exception:" + e10.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m24977c(byte[] bArr) {
        return MessageDigest.getInstance("SHA-256").digest(bArr);
    }
}
