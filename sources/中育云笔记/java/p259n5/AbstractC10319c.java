package p259n5;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: n5.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10319c {

    /* renamed from: a */
    public static final String f24595a = "c";

    /* renamed from: a */
    public static String m21529a(String str, Context context) throws IOException {
        Logger.m8571d(f24595a, "Io getConfigContent, fileName: " + str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamOpen = null;
        try {
            try {
                if (!new File(str).isDirectory()) {
                    inputStreamOpen = context.getAssets().open(str);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = inputStreamOpen.read(bArr);
                        if (i10 == -1) {
                            byteArrayOutputStream.flush();
                            String string = byteArrayOutputStream.toString(Request.DEFAULT_CHARSET);
                            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
                            IoUtils.closeSecure(inputStreamOpen);
                            return string;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                }
            } catch (IOException unused) {
                Logger.m8590w(f24595a, "local config file is not exist.filename is {%s}", str);
            }
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStreamOpen);
            return "";
        } catch (Throwable th) {
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStreamOpen);
            throw th;
        }
    }
}
