package p215k2;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import cd.AbstractC5428g;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.google.gson.Gson;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;
import org.json.JSONObject;
import p310qd.AbstractC10793c0;
import p310qd.C10792c;
import p429z1.AbstractC11958b;

/* renamed from: k2.o */
/* loaded from: classes3.dex */
public final class C9797o {

    /* renamed from: a */
    public static final C9797o f22992a = new C9797o();

    /* renamed from: b */
    public static final String f22993b = Environment.getExternalStorageDirectory().getAbsolutePath() + "/deviceId/deviceId.bin";

    /* renamed from: a */
    public final String m19795a(String schoolCode, String username) {
        AbstractC9979u.m20294g(schoolCode, "schoolCode");
        AbstractC9979u.m20294g(username, "username");
        String str = f22993b;
        if (!FileUtils.isFileExists(str)) {
            return null;
        }
        try {
            if (schoolCode.length() > 0 && username.length() > 0) {
                String strM23150z0 = AbstractC10793c0.m23150z0(AbstractC10793c0.m23129e1(AbstractC5428g.m2921e(new File(str), null, 1, null)).toString(), SignParameters.NEW_LINE);
                if (!AbstractC10793c0.m23132h0(strM23150z0)) {
                    byte[] bArrDecode = Base64.decode(strM23150z0, 0);
                    AbstractC9979u.m20293f(bArrDecode, "decode(...)");
                    JSONObject jSONObject = new JSONObject(new String(bArrDecode, C10792c.f26019b));
                    String lowerCase = schoolCode.toLowerCase(Locale.ROOT);
                    AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
                    String str2 = lowerCase + BundleUtil.UNDERLINE_TAG + username;
                    if (jSONObject.has(str2)) {
                        return jSONObject.getString(str2);
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m19796b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        try {
            FileUtils.createFileByDeleteOldFile(str);
            AbstractC5428g.m2923g(new File(str), str2, null, 2, null);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m19797c(String schoolCode, String username, String deviceId) {
        AbstractC9979u.m20294g(schoolCode, "schoolCode");
        AbstractC9979u.m20294g(username, "username");
        AbstractC9979u.m20294g(deviceId, "deviceId");
        String str = f22993b;
        FileUtils.createOrExistsFile(str);
        HashMap map = new HashMap();
        try {
            String strM23150z0 = AbstractC10793c0.m23150z0(AbstractC10793c0.m23129e1(AbstractC5428g.m2921e(new File(str), null, 1, null)).toString(), SignParameters.NEW_LINE);
            if (!AbstractC10793c0.m23132h0(strM23150z0)) {
                byte[] bArrDecode = Base64.decode(strM23150z0, 0);
                AbstractC9979u.m20293f(bArrDecode, "decode(...)");
                JSONObject jSONObject = new JSONObject(new String(bArrDecode, C10792c.f26019b));
                Iterator<String> itKeys = jSONObject.keys();
                AbstractC9979u.m20293f(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    AbstractC9979u.m20293f(next, "next(...)");
                    String str2 = next;
                    map.put(str2, jSONObject.getString(str2));
                }
            }
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
            AbstractC11958b.m26583d("没有存储权限");
            PermissionUtils.permissionGroup(PermissionConstants.STORAGE).request();
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        String lowerCase = schoolCode.toLowerCase(Locale.ROOT);
        AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
        map.put(lowerCase + BundleUtil.UNDERLINE_TAG + username, deviceId);
        String json = new Gson().toJson(map);
        AbstractC9979u.m20291d(json);
        Charset charset = C10792c.f26019b;
        byte[] bytes = json.getBytes(charset);
        AbstractC9979u.m20293f(bytes, "getBytes(...)");
        byte[] bArrEncode = Base64.encode(bytes, 0);
        AbstractC9979u.m20293f(bArrEncode, "encode(...)");
        return m19796b(f22993b, new String(bArrEncode, charset));
    }
}
