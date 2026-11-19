package com.p074ta.p075a.p078c;

import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* renamed from: com.ta.a.c.a */
/* loaded from: classes5.dex */
public class C7580a {
    /* renamed from: b */
    public static void m9777b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (file.exists()) {
                C7585f.m9799b("FileUtils", "path exists", str);
            } else {
                C7585f.m9799b("FileUtils", "mkdirs path", str, "created", Boolean.valueOf(file.mkdirs()));
            }
        } catch (Exception e10) {
            C7585f.m9798b("FileUtils", e10, new Object[0]);
        }
    }

    /* renamed from: c */
    public static String m9779c(String str) throws Throwable {
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
            StringBuilder sb2 = new StringBuilder("");
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    String string = sb2.toString();
                    try {
                        inputStreamReader.close();
                        return string;
                    } catch (Exception e11) {
                        C7585f.m9798b("FileUtils", e11, new Object[0]);
                        return string;
                    }
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (Exception e12) {
            e = e12;
            inputStreamReader2 = inputStreamReader;
            C7585f.m9798b("FileUtils", e, new Object[0]);
            if (inputStreamReader2 != null) {
                try {
                    inputStreamReader2.close();
                } catch (Exception e13) {
                    C7585f.m9798b("FileUtils", e13, new Object[0]);
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
                    C7585f.m9798b("FileUtils", e14, new Object[0]);
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m9778b(String str, String str2) throws Throwable {
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
                C7585f.m9798b("FileUtils", e12, new Object[0]);
            }
            try {
                fileWriter.close();
                return true;
            } catch (Exception e13) {
                C7585f.m9798b("FileUtils", e13, new Object[0]);
                return true;
            }
        } catch (Exception e14) {
            e = e14;
            bufferedWriter2 = bufferedWriter;
            C7585f.m9798b("FileUtils", e, new Object[0]);
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (Exception e15) {
                    C7585f.m9798b("FileUtils", e15, new Object[0]);
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (Exception e16) {
                    C7585f.m9798b("FileUtils", e16, new Object[0]);
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
                    C7585f.m9798b("FileUtils", e17, new Object[0]);
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                    throw th;
                } catch (Exception e18) {
                    C7585f.m9798b("FileUtils", e18, new Object[0]);
                    throw th;
                }
            }
            throw th;
        }
    }
}
