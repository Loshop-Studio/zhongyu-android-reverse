package p129j2;

import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* renamed from: j2.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7783c {
    /* renamed from: a */
    public static boolean m13158a(String str, String str2) throws Throwable {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(new File(str));
                try {
                    bufferedWriter = new BufferedWriter(fileWriter);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e11) {
            e = e11;
            fileWriter = null;
        } catch (Throwable th2) {
            th = th2;
            fileWriter = null;
        }
        try {
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            try {
                bufferedWriter.close();
            } catch (Exception e12) {
                AbstractC7788h.m13180f("FileUtils", e12, new Object[0]);
            }
            try {
                fileWriter.close();
                return true;
            } catch (Exception e13) {
                AbstractC7788h.m13180f("FileUtils", e13, new Object[0]);
                return true;
            }
        } catch (Exception e14) {
            e = e14;
            bufferedWriter2 = bufferedWriter;
            AbstractC7788h.m13180f("FileUtils", e, new Object[0]);
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (Exception e15) {
                    AbstractC7788h.m13180f("FileUtils", e15, new Object[0]);
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e16) {
                    AbstractC7788h.m13180f("FileUtils", e16, new Object[0]);
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (Exception e17) {
                    AbstractC7788h.m13180f("FileUtils", e17, new Object[0]);
                }
            }
            if (fileWriter == null) {
                throw th;
            }
            try {
                fileWriter.close();
                throw th;
            } catch (Exception e18) {
                AbstractC7788h.m13180f("FileUtils", e18, new Object[0]);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static String m13159b(String str) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream(str));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            char[] cArr = new char[100];
            StringBuilder sb = new StringBuilder("");
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    String string = sb.toString();
                    try {
                        inputStreamReader.close();
                        return string;
                    } catch (Exception e11) {
                        AbstractC7788h.m13180f("FileUtils", e11, new Object[0]);
                        return string;
                    }
                }
                sb.append(cArr, 0, i10);
            }
        } catch (Exception e12) {
            e = e12;
            inputStreamReader2 = inputStreamReader;
            AbstractC7788h.m13180f("FileUtils", e, new Object[0]);
            if (inputStreamReader2 != null) {
                try {
                    inputStreamReader2.close();
                } catch (Exception e13) {
                    AbstractC7788h.m13180f("FileUtils", e13, new Object[0]);
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            inputStreamReader2 = inputStreamReader;
            if (inputStreamReader2 != null) {
                try {
                    inputStreamReader2.close();
                } catch (Exception e14) {
                    AbstractC7788h.m13180f("FileUtils", e14, new Object[0]);
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static void m13160c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (file.exists()) {
                AbstractC7788h.m13181g("FileUtils", "path exists", str);
            } else {
                AbstractC7788h.m13181g("FileUtils", "mkdirs path", str, "created", Boolean.valueOf(file.mkdirs()));
            }
        } catch (Exception e10) {
            AbstractC7788h.m13180f("FileUtils", e10, new Object[0]);
        }
    }
}
