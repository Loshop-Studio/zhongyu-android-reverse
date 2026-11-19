package com.zykj.blackboard.utils;

// RE note 对资源文件中的字节计算摘要，供文件完整性校验。

import com.blankj.utilcode.util.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;

/* loaded from: classes5.dex */
public final class FileValidateUtils {

    /* renamed from: a */
    public static final FileValidateUtils f18689a = new FileValidateUtils();

    public enum TypeEnum {
        MD5,
        SHA1,
        SHA256
    }

    /* renamed from: com.zykj.blackboard.utils.FileValidateUtils$a */
    public /* synthetic */ class C8446a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18694a;

        static {
            int[] iArr = new int[TypeEnum.values().length];
            iArr[TypeEnum.MD5.ordinal()] = 1;
            iArr[TypeEnum.SHA1.ordinal()] = 2;
            iArr[TypeEnum.SHA256.ordinal()] = 3;
            f18694a = iArr;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ String m14635b(FileValidateUtils fileValidateUtils, File file, TypeEnum typeEnum, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeEnum = TypeEnum.SHA256;
        }
        return fileValidateUtils.m14636a(file, typeEnum);
    }

    /* renamed from: a */
    public final String m14636a(File file, TypeEnum typeEnum) throws NoSuchAlgorithmException, IOException {
        String str;
        AbstractC9979u.m20294g(file, "file");
        AbstractC9979u.m20294g(typeEnum, "typeEnum");
        int i10 = C8446a.f18694a[typeEnum.ordinal()];
        if (i10 == 1) {
            str = "MD5";
        } else if (i10 == 2) {
            str = "SHA-1";
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "SHA-256";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            AbstractC9979u.m20293f(messageDigest, "getInstance(type)");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        try {
                            int i11 = fileInputStream.read(bArr);
                            if (i11 <= 0) {
                                String string = new BigInteger(1, messageDigest.digest()).toString(16);
                                C9960c0 c9960c0 = C9960c0.f23411a;
                                String str2 = String.format("%32s", Arrays.copyOf(new Object[]{string}, 1));
                                AbstractC9979u.m20293f(str2, "format(format, *args)");
                                String strM23237J = AbstractC10819z.m23237J(str2, ' ', '0', false, 4, null);
                                try {
                                    fileInputStream.close();
                                    return strM23237J;
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                    return strM23237J;
                                }
                            }
                            messageDigest.update(bArr, 0, i11);
                        } catch (IOException e11) {
                            e11.printStackTrace();
                            try {
                                fileInputStream.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                            return null;
                        }
                    } finally {
                    }
                }
            } catch (FileNotFoundException e13) {
                e13.printStackTrace();
                return null;
            }
        } catch (NoSuchAlgorithmException e14) {
            e14.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public final boolean m14637c(TypeEnum typeEnum, String standardStr, File file) throws NoSuchAlgorithmException, IOException {
        AbstractC9979u.m20294g(typeEnum, "typeEnum");
        AbstractC9979u.m20294g(standardStr, "standardStr");
        if (!AbstractC10793c0.m23132h0(standardStr) && file != null) {
            LogUtils.m3888i("FileValidateUtils [" + file.getName() + "] validate:" + standardStr);
            String strM14636a = m14636a(file, typeEnum);
            LogUtils.m3888i("FileValidateUtils [" + file.getName() + "] calculateValidate:" + strM14636a);
            if (strM14636a != null && !AbstractC10793c0.m23132h0(strM14636a)) {
                boolean zM23230C = AbstractC10819z.m23230C(strM14636a, standardStr, true);
                if (!zM23230C) {
                    LogUtils.m3888i("FileValidateUtils [" + file.getName() + "] 文件校验未通过");
                }
                return zM23230C;
            }
        }
        return false;
    }
}
