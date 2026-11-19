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
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class FileValidateUtils {

    /* renamed from: a */
    public static final FileValidateUtils f7853a = new FileValidateUtils();

    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m13558d2 = {"Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
    public enum TypeEnum {
        MD5,
        SHA1,
        SHA256
    }

    /* renamed from: com.zykj.blackboard.utils.FileValidateUtils$a */
    public /* synthetic */ class C6749a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7858a;

        static {
            int[] iArr = new int[TypeEnum.values().length];
            iArr[TypeEnum.MD5.ordinal()] = 1;
            iArr[TypeEnum.SHA1.ordinal()] = 2;
            iArr[TypeEnum.SHA256.ordinal()] = 3;
            f7858a = iArr;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ String m6899b(FileValidateUtils fileValidateUtils, File file, TypeEnum typeEnum, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeEnum = TypeEnum.SHA256;
        }
        return fileValidateUtils.m6900a(file, typeEnum);
    }

    /* renamed from: a */
    public final String m6900a(File file, TypeEnum typeEnum) throws NoSuchAlgorithmException, IOException {
        String str;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(typeEnum, "typeEnum");
        int i10 = C6749a.f7858a[typeEnum.ordinal()];
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
            Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(type)");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        try {
                            int i11 = fileInputStream.read(bArr);
                            if (i11 <= 0) {
                                String string = new BigInteger(1, messageDigest.digest()).toString(16);
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                String str2 = String.format("%32s", Arrays.copyOf(new Object[]{string}, 1));
                                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                                String strReplace$default = StringsKt.replace$default(str2, ' ', '0', false, 4, (Object) null);
                                try {
                                    fileInputStream.close();
                                    return strReplace$default;
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                    return strReplace$default;
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
    public final boolean m6901c(TypeEnum typeEnum, String standardStr, File file) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(typeEnum, "typeEnum");
        Intrinsics.checkNotNullParameter(standardStr, "standardStr");
        if (!StringsKt.isBlank(standardStr) && file != null) {
            LogUtils.m3239i("FileValidateUtils [" + file.getName() + "] validate:" + standardStr);
            String strM6900a = m6900a(file, typeEnum);
            LogUtils.m3239i("FileValidateUtils [" + file.getName() + "] calculateValidate:" + strM6900a);
            if (strM6900a != null && !StringsKt.isBlank(strM6900a)) {
                boolean zEquals = StringsKt.equals(strM6900a, standardStr, true);
                if (!zEquals) {
                    LogUtils.m3239i("FileValidateUtils [" + file.getName() + "] 文件校验未通过");
                }
                return zEquals;
            }
        }
        return false;
    }
}
