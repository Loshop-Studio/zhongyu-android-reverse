package com.zykj.blackboard.utils;

// RE note 对资源文件中的字节计算摘要，供文件完整性校验。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
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
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0006¨\u0006\u000e"}, m5110d2 = {"Lcom/zykj/blackboard/utils/FileValidateUtils;", "", "()V", "getFileSignature", "", "file", "Ljava/io/File;", "typeEnum", "Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;", "validateFile", "", "standardStr", "fileToCheck", "TypeEnum", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class FileValidateUtils {

    @NotNull
    public static final FileValidateUtils INSTANCE = new FileValidateUtils();

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;", "", "(Ljava/lang/String;I)V", "MD5", "SHA1", "SHA256", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum TypeEnum {
        MD5,
        SHA1,
        SHA256
    }

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public static /* synthetic */ String getFileSignature$default(FileValidateUtils fileValidateUtils, File file, TypeEnum typeEnum, int i, Object obj) {
        if ((i & 2) != 0) {
            typeEnum = TypeEnum.SHA256;
        }
        return fileValidateUtils.getFileSignature(file, typeEnum);
    }

    @Nullable
    public final String getFileSignature(@NotNull File file, @NotNull TypeEnum typeEnum) throws NoSuchAlgorithmException, IOException {
        String str;
        AbstractC5830k.m5330g(file, "file");
        AbstractC5830k.m5330g(typeEnum, "typeEnum");
        int i = WhenMappings.$EnumSwitchMapping$0[typeEnum.ordinal()];
        if (i == 1) {
            str = "MD5";
        } else if (i == 2) {
            str = "SHA-1";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "SHA-256";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            AbstractC5830k.m5329f(messageDigest, "getInstance(type)");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        try {
                            int i8 = fileInputStream.read(bArr);
                            if (i8 <= 0) {
                                String strM5419z = AbstractC5862w.m5419z(String.format("%32s", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest()).toString(16)}, 1)), ' ', '0');
                                try {
                                    fileInputStream.close();
                                    return strM5419z;
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    return strM5419z;
                                }
                            }
                            messageDigest.update(bArr, 0, i8);
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            try {
                                fileInputStream.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                            return null;
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                        throw th;
                    }
                }
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
                return null;
            }
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public final boolean validateFile(@NotNull TypeEnum typeEnum, @NotNull String standardStr, @Nullable File fileToCheck) {
        AbstractC5830k.m5330g(typeEnum, "typeEnum");
        AbstractC5830k.m5330g(standardStr, "standardStr");
        if (!AbstractC5855p.m5382P(standardStr) && fileToCheck != null) {
            AbstractC3387g.m2342e("FileValidateUtils [" + fileToCheck.getName() + "] validate:" + standardStr);
            String fileSignature = getFileSignature(fileToCheck, typeEnum);
            AbstractC3387g.m2342e("FileValidateUtils [" + fileToCheck.getName() + "] calculateValidate:" + fileSignature);
            if (fileSignature != null && !AbstractC5855p.m5382P(fileSignature)) {
                boolean zM5415v = AbstractC5862w.m5415v(fileSignature, standardStr, true);
                if (!zM5415v) {
                    AbstractC3387g.m2342e("FileValidateUtils [" + fileToCheck.getName() + "] 文件校验未通过");
                }
                return zM5415v;
            }
        }
        return false;
    }
}
