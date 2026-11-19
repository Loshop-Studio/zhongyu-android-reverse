package p333s5;

import anet.channel.request.Request;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: s5.j */
/* loaded from: classes5.dex */
public abstract class AbstractC11070j {
    /* renamed from: a */
    public static String m24562a(String str) throws Throwable {
        InputStreamReader inputStreamReader;
        File file = new File(str);
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream(file), Request.DEFAULT_CHARSET);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        } catch (FileNotFoundException unused) {
                            bufferedReader = bufferedReader2;
                            HMSLog.m8725e("StreamUtil", "file not exist.");
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                            return sb2.toString();
                        } catch (IOException unused2) {
                            bufferedReader = bufferedReader2;
                            HMSLog.m8725e("StreamUtil", "read value IOException.");
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                            return sb2.toString();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                            throw th;
                        }
                    }
                    IOUtils.closeQuietly((Reader) inputStreamReader);
                    IOUtils.closeQuietly((Reader) bufferedReader2);
                } catch (FileNotFoundException unused3) {
                } catch (IOException unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused5) {
            inputStreamReader = null;
        } catch (IOException unused6) {
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static void m24563b(File file) throws IOException {
        if (file.exists()) {
            return;
        }
        if (file.getParentFile() == null) {
            HMSLog.m8725e("StreamUtil", "parent file is null.");
            throw new IOException("parent file is null");
        }
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            HMSLog.m8725e("StreamUtil", "make parent dirs failed.");
            throw new IOException("make parent dirs failed");
        }
        if (file.createNewFile()) {
            return;
        }
        HMSLog.m8725e("StreamUtil", "create file failed.");
        throw new IOException("create file failed");
    }
}
