package com.zykj.blackboard.utils;

// RE note 对资源文件中的字节计算摘要，供文件完整性校验。

import com.blankj.utilcode.util.AbstractC5380q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;

/* loaded from: classes4.dex */
public final class FileValidateUtils {
    public static final FileValidateUtils INSTANCE = new FileValidateUtils();

    public enum TypeEnum {
        MD5,
        SHA1,
        SHA256
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypeEnum.values().length];
            iArr[TypeEnum.MD5.ordinal()] = 1;
            iArr[TypeEnum.SHA1.ordinal()] = 2;
            iArr[TypeEnum.SHA256.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FileValidateUtils() {
    }

    public static /* synthetic */ String getFileSignature$default(FileValidateUtils fileValidateUtils, File file, TypeEnum typeEnum, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeEnum = TypeEnum.SHA256;
        }
        return fileValidateUtils.getFileSignature(file, typeEnum);
    }

    public final String getFileSignature(File file, TypeEnum typeEnum) throws NoSuchAlgorithmException, IOException {
        String str;
        AbstractC9133u.m16133g(file, "file");
        AbstractC9133u.m16133g(typeEnum, "typeEnum");
        int i10 = WhenMappings.$EnumSwitchMapping$0[typeEnum.ordinal()];
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
            AbstractC9133u.m16132f(messageDigest, "getInstance(type)");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        try {
                            int i11 = fileInputStream.read(bArr);
                            if (i11 <= 0) {
                                String string = new BigInteger(1, messageDigest.digest()).toString(16);
                                C9114c0 c9114c0 = C9114c0.f17482a;
                                String str2 = String.format("%32s", Arrays.copyOf(new Object[]{string}, 1));
                                AbstractC9133u.m16132f(str2, "format(format, *args)");
                                String strM14100H = AbstractC8687z.m14100H(str2, ' ', '0', false, 4, null);
                                try {
                                    fileInputStream.close();
                                    return strM14100H;
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                    return strM14100H;
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

    public final boolean validateFile(TypeEnum typeEnum, String standardStr, File file) throws NoSuchAlgorithmException, IOException {
        AbstractC9133u.m16133g(typeEnum, "typeEnum");
        AbstractC9133u.m16133g(standardStr, "standardStr");
        if (!AbstractC8661c0.m13993h0(standardStr) && file != null) {
            AbstractC5380q.m2623s("FileValidateUtils [" + file.getName() + "] validate:" + standardStr);
            String fileSignature = getFileSignature(file, typeEnum);
            AbstractC5380q.m2623s("FileValidateUtils [" + file.getName() + "] calculateValidate:" + fileSignature);
            if (fileSignature != null && !AbstractC8661c0.m13993h0(fileSignature)) {
                boolean zM14093A = AbstractC8687z.m14093A(fileSignature, standardStr, true);
                if (!zM14093A) {
                    AbstractC5380q.m2623s("FileValidateUtils [" + file.getName() + "] 文件校验未通过");
                }
                return zM14093A;
            }
        }
        return false;
    }
}
