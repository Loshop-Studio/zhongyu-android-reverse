package com.google.zxing.aztec.decoder;

import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Arrays;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class Decoder {
    private AztecDetectorResult ddata;
    private static final String[] UPPER_TABLE = {"CTRL_PS", " ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] LOWER_TABLE = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] MIXED_TABLE = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", SignParameters.NEW_LINE, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] PUNCT_TABLE = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", Marker.ANY_MARKER, Marker.ANY_NON_NULL_MARKER, ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] DIGIT_TABLE = {"CTRL_PS", " ", "0", "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: com.google.zxing.aztec.decoder.Decoder$1 */
    public static /* synthetic */ class C63631 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;

        static {
            int[] iArr = new int[Table.values().length];
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] convertBoolArrayToByteArray(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = readByte(zArr, i10 << 3);
        }
        return bArr;
    }

    private boolean[] correctBits(boolean[] zArr) throws FormatException {
        int i10;
        GenericGF genericGF;
        if (this.ddata.getNbLayers() <= 2) {
            genericGF = GenericGF.AZTEC_DATA_6;
            i10 = 6;
        } else {
            i10 = 8;
            if (this.ddata.getNbLayers() <= 8) {
                genericGF = GenericGF.AZTEC_DATA_8;
            } else if (this.ddata.getNbLayers() <= 22) {
                genericGF = GenericGF.AZTEC_DATA_10;
                i10 = 10;
            } else {
                genericGF = GenericGF.AZTEC_DATA_12;
                i10 = 12;
            }
        }
        int nbDatablocks = this.ddata.getNbDatablocks();
        int length = zArr.length / i10;
        if (length < nbDatablocks) {
            throw FormatException.getFormatInstance();
        }
        int length2 = zArr.length % i10;
        int[] iArr = new int[length];
        int i11 = 0;
        while (i11 < length) {
            iArr[i11] = readCode(zArr, length2, i10);
            i11++;
            length2 += i10;
        }
        try {
            new ReedSolomonDecoder(genericGF).decode(iArr, length - nbDatablocks);
            int i12 = 1 << i10;
            int i13 = i12 - 1;
            int i14 = 0;
            for (int i15 = 0; i15 < nbDatablocks; i15++) {
                int i16 = iArr[i15];
                if (i16 == 0 || i16 == i13) {
                    throw FormatException.getFormatInstance();
                }
                if (i16 == 1 || i16 == i12 - 2) {
                    i14++;
                }
            }
            boolean[] zArr2 = new boolean[(nbDatablocks * i10) - i14];
            int i17 = 0;
            for (int i18 = 0; i18 < nbDatablocks; i18++) {
                int i19 = iArr[i18];
                if (i19 == 1 || i19 == i12 - 2) {
                    Arrays.fill(zArr2, i17, (i17 + i10) - 1, i19 > 1);
                    i17 += i10 - 1;
                } else {
                    int i20 = i10 - 1;
                    while (i20 >= 0) {
                        int i21 = i17 + 1;
                        zArr2[i17] = ((1 << i20) & i19) != 0;
                        i20--;
                        i17 = i21;
                    }
                }
            }
            return zArr2;
        } catch (ReedSolomonException e10) {
            throw FormatException.getFormatInstance(e10);
        }
    }

    private boolean[] extractBits(BitMatrix bitMatrix) {
        boolean zIsCompact = this.ddata.isCompact();
        int nbLayers = this.ddata.getNbLayers();
        int i10 = (zIsCompact ? 11 : 14) + (nbLayers << 2);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[totalBitsInLayer(nbLayers, zIsCompact)];
        int i11 = 2;
        if (zIsCompact) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((i10 + 1) + (((i13 - 1) / 15) * 2)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                iArr[(i13 - i15) - 1] = (i14 - r12) - 1;
                iArr[i13 + i15] = (i15 / 15) + i15 + i14 + 1;
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < nbLayers) {
            int i18 = ((nbLayers - i16) << i11) + (zIsCompact ? 9 : 12);
            int i19 = i16 << 1;
            int i20 = (i10 - 1) - i19;
            int i21 = 0;
            while (i21 < i18) {
                int i22 = i21 << 1;
                int i23 = 0;
                while (i23 < i11) {
                    int i24 = i19 + i23;
                    int i25 = i19 + i21;
                    zArr[i17 + i22 + i23] = bitMatrix.get(iArr[i24], iArr[i25]);
                    int i26 = i20 - i23;
                    zArr[(i18 * 2) + i17 + i22 + i23] = bitMatrix.get(iArr[i25], iArr[i26]);
                    int i27 = iArr[i26];
                    int i28 = i20 - i21;
                    zArr[(i18 * 4) + i17 + i22 + i23] = bitMatrix.get(i27, iArr[i28]);
                    zArr[(i18 * 6) + i17 + i22 + i23] = bitMatrix.get(iArr[i28], iArr[i24]);
                    i23++;
                    i11 = 2;
                }
                i21++;
                i11 = 2;
            }
            i17 += i18 << 3;
            i16++;
            i11 = 2;
        }
        return zArr;
    }

    private static String getCharacter(Table table, int i10) {
        int i11 = C63631.$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[table.ordinal()];
        if (i11 == 1) {
            return UPPER_TABLE[i10];
        }
        if (i11 == 2) {
            return LOWER_TABLE[i10];
        }
        if (i11 == 3) {
            return MIXED_TABLE[i10];
        }
        if (i11 == 4) {
            return PUNCT_TABLE[i10];
        }
        if (i11 == 5) {
            return DIGIT_TABLE[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    private static String getEncodedData(boolean[] zArr) {
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb = new StringBuilder(20);
        Table table2 = table;
        int i10 = 0;
        while (i10 < length) {
            if (table != Table.BINARY) {
                int i11 = table == Table.DIGIT ? 4 : 5;
                if (length - i10 < i11) {
                    break;
                }
                int code = readCode(zArr, i10, i11);
                i10 += i11;
                String character = getCharacter(table, code);
                if (character.startsWith("CTRL_")) {
                    table2 = getTable(character.charAt(5));
                    if (character.charAt(6) != 'L') {
                        table2 = table;
                        table = table2;
                    }
                } else {
                    sb.append(character);
                }
                table = table2;
            } else {
                if (length - i10 < 5) {
                    break;
                }
                int code2 = readCode(zArr, i10, 5);
                int i12 = i10 + 5;
                if (code2 == 0) {
                    if (length - i12 < 11) {
                        break;
                    }
                    code2 = readCode(zArr, i12, 11) + 31;
                    i12 = i10 + 16;
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= code2) {
                        i10 = i12;
                        break;
                    }
                    if (length - i12 < 8) {
                        i10 = length;
                        break;
                    }
                    sb.append((char) readCode(zArr, i12, 8));
                    i12 += 8;
                    i13++;
                }
                table = table2;
            }
        }
        return sb.toString();
    }

    private static Table getTable(char c10) {
        return c10 != 'B' ? c10 != 'D' ? c10 != 'P' ? c10 != 'L' ? c10 != 'M' ? Table.UPPER : Table.MIXED : Table.LOWER : Table.PUNCT : Table.DIGIT : Table.BINARY;
    }

    public static String highLevelDecode(boolean[] zArr) {
        return getEncodedData(zArr);
    }

    private static byte readByte(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? readCode(zArr, i10, 8) : readCode(zArr, i10, length) << (8 - length));
    }

    private static int readCode(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    private static int totalBitsInLayer(int i10, boolean z10) {
        return ((z10 ? 88 : TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) + (i10 << 4)) * i10;
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) throws FormatException {
        this.ddata = aztecDetectorResult;
        boolean[] zArrCorrectBits = correctBits(extractBits(aztecDetectorResult.getBits()));
        DecoderResult decoderResult = new DecoderResult(convertBoolArrayToByteArray(zArrCorrectBits), getEncodedData(zArrCorrectBits), null, null);
        decoderResult.setNumBits(zArrCorrectBits.length);
        return decoderResult;
    }
}
