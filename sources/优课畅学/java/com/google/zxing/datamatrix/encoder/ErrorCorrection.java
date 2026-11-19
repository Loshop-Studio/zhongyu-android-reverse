package com.google.zxing.datamatrix.encoder;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsListener;

/* loaded from: classes4.dex */
public final class ErrorCorrection {
    private static final int MODULO_VALUE = 301;
    private static final int[] FACTOR_SETS = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] FACTORS = {new int[]{228, 48, 15, TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR, 62}, new int[]{23, 68, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 248, 116, 255, 110, 61}, new int[]{175, 138, TbsListener.ErrorCode.UNZIP_DIR_ERROR, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 109, 129, 94, 254, TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 48, 90, 188}, new int[]{15, 195, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, TbsListener.ErrorCode.UNZIP_DIR_ERROR, 109, 39, 176, 21, 155, 197, 251, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 155, 21, 5, 172, 254, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY, 12, 181, 184, 96, 50, 193}, new int[]{TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, 231, 43, 97, 71, 96, TbsListener.ErrorCode.READ_RESPONSE_ERROR, 174, 37, 151, 170, 53, 75, 34, 249, TbsListener.ErrorCode.THREAD_INIT_ERROR, 17, 138, 110, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 141, 136, 120, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, 130, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 162, 181, 102, 120, 84, 179, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 98, 81, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, TbsListener.ErrorCode.DISK_FULL, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, TbsListener.ErrorCode.DISK_FULL, TbsListener.ErrorCode.COPY_TMPDIR_ERROR, TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR, 57, TbsListener.ErrorCode.THREAD_INIT_ERROR, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, TbsListener.ErrorCode.DEXOAT_EXCEPTION, 5, 9, 5}, new int[]{245, 132, 172, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 96, 32, 117, 22, 238, 133, 238, 231, TbsListener.ErrorCode.UNZIP_DIR_ERROR, 188, 237, 87, 191, TbsListener.ErrorCode.FILE_DELETED, 16, 147, 118, 23, 37, 90, 170, TbsListener.ErrorCode.UNZIP_DIR_ERROR, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 92, 253, TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 19}, new int[]{175, 9, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 238, 12, 17, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM, 100, 29, 175, 170, 230, 192, TbsListener.ErrorCode.COPY_EXCEPTION, 235, 150, 159, 36, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 38, 200, 132, 54, 228, 146, TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, 234, 117, 203, 29, 232, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, TbsListener.ErrorCode.UNKNOWN_ERROR, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, TbsListener.ErrorCode.ROM_NOT_ENOUGH, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, 134, 230, 245, 63, 197, 190, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, TbsListener.ErrorCode.FILE_DELETED, 185, TbsListener.ErrorCode.INCRUPDATE_INSTALL_SUCCESS, 175, 64, 114, 71, 161, 44, 147, 6, 27, TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, TbsListener.ErrorCode.UNKNOWN_ERROR, 232, 7, 94, 166, TbsListener.ErrorCode.EXCEED_INCR_UPDATE, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY, 86, 47, 11, 204}, new int[]{TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 154, 36, 73, 127, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 136, 248, TXLiveConstants.RENDER_ROTATION_180, 234, 197, 158, 177, 68, 122, 93, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 15, 160, TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL, 236, 66, 139, 153, 185, 202, 167, 179, 25, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, 232, 96, TbsListener.ErrorCode.ROM_NOT_ENOUGH, 231, 136, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 239, 181, 241, 59, 52, 172, 25, 49, 232, TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, 189, 64, 54, 108, 153, 132, 63, 96, TbsListener.ErrorCode.READ_RESPONSE_ERROR, 82, 186}};
    private static final int[] LOG = new int[256];
    private static final int[] ALOG = new int[255];

    static {
        int i10 = 1;
        for (int i11 = 0; i11 < 255; i11++) {
            ALOG[i11] = i10;
            LOG[i10] = i11;
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= 301;
            }
        }
    }

    private ErrorCorrection() {
    }

    private static String createECCBlock(CharSequence charSequence, int i10) {
        return createECCBlock(charSequence, 0, charSequence.length(), i10);
    }

    public static String encodeECC200(String str, SymbolInfo symbolInfo) {
        if (str.length() != symbolInfo.getDataCapacity()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb = new StringBuilder(symbolInfo.getDataCapacity() + symbolInfo.getErrorCodewords());
        sb.append(str);
        int interleavedBlockCount = symbolInfo.getInterleavedBlockCount();
        if (interleavedBlockCount == 1) {
            sb.append(createECCBlock(str, symbolInfo.getErrorCodewords()));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[interleavedBlockCount];
            int[] iArr2 = new int[interleavedBlockCount];
            int[] iArr3 = new int[interleavedBlockCount];
            int i10 = 0;
            while (i10 < interleavedBlockCount) {
                int i11 = i10 + 1;
                iArr[i10] = symbolInfo.getDataLengthForInterleavedBlock(i11);
                iArr2[i10] = symbolInfo.getErrorLengthForInterleavedBlock(i11);
                iArr3[i10] = 0;
                if (i10 > 0) {
                    iArr3[i10] = iArr3[i10 - 1] + iArr[i10];
                }
                i10 = i11;
            }
            for (int i12 = 0; i12 < interleavedBlockCount; i12++) {
                StringBuilder sb2 = new StringBuilder(iArr[i12]);
                for (int i13 = i12; i13 < symbolInfo.getDataCapacity(); i13 += interleavedBlockCount) {
                    sb2.append(str.charAt(i13));
                }
                String strCreateECCBlock = createECCBlock(sb2.toString(), iArr2[i12]);
                int i14 = i12;
                int i15 = 0;
                while (i14 < iArr2[i12] * interleavedBlockCount) {
                    sb.setCharAt(symbolInfo.getDataCapacity() + i14, strCreateECCBlock.charAt(i15));
                    i14 += interleavedBlockCount;
                    i15++;
                }
            }
        }
        return sb.toString();
    }

    private static String createECCBlock(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = 0;
        while (true) {
            int[] iArr = FACTOR_SETS;
            if (i15 >= iArr.length) {
                i15 = -1;
                break;
            }
            if (iArr[i15] == i12) {
                break;
            }
            i15++;
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i12)));
        }
        int[] iArr2 = FACTORS[i15];
        char[] cArr = new char[i12];
        for (int i16 = 0; i16 < i12; i16++) {
            cArr[i16] = 0;
        }
        for (int i17 = i10; i17 < i10 + i11; i17++) {
            int i18 = i12 - 1;
            int iCharAt = cArr[i18] ^ charSequence.charAt(i17);
            while (i18 > 0) {
                if (iCharAt == 0 || (i14 = iArr2[i18]) == 0) {
                    cArr[i18] = cArr[i18 - 1];
                } else {
                    char c10 = cArr[i18 - 1];
                    int[] iArr3 = ALOG;
                    int[] iArr4 = LOG;
                    cArr[i18] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i14]) % 255] ^ c10);
                }
                i18--;
            }
            if (iCharAt == 0 || (i13 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = ALOG;
                int[] iArr6 = LOG;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i13]) % 255];
            }
        }
        char[] cArr2 = new char[i12];
        for (int i19 = 0; i19 < i12; i19++) {
            cArr2[i19] = cArr[(i12 - i19) - 1];
        }
        return String.valueOf(cArr2);
    }
}
