package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.tencent.ijk.media.player.IjkMediaMeta;

/* loaded from: classes4.dex */
public final class Version {
    private static final Version[] VERSIONS = buildVersions();
    private final int dataRegionSizeColumns;
    private final int dataRegionSizeRows;
    private final ECBlocks ecBlocks;
    private final int symbolSizeColumns;
    private final int symbolSizeRows;
    private final int totalCodewords;
    private final int versionNumber;

    public static final class ECB {
        private final int count;
        private final int dataCodewords;

        public int getCount() {
            return this.count;
        }

        public int getDataCodewords() {
            return this.dataCodewords;
        }

        private ECB(int i10, int i11) {
            this.count = i10;
            this.dataCodewords = i11;
        }
    }

    private Version(int i10, int i11, int i12, int i13, int i14, ECBlocks eCBlocks) {
        this.versionNumber = i10;
        this.symbolSizeRows = i11;
        this.symbolSizeColumns = i12;
        this.dataRegionSizeRows = i13;
        this.dataRegionSizeColumns = i14;
        this.ecBlocks = eCBlocks;
        int eCCodewords = eCBlocks.getECCodewords();
        int count = 0;
        for (ECB ecb : eCBlocks.getECBlocks()) {
            count += ecb.getCount() * (ecb.getDataCodewords() + eCCodewords);
        }
        this.totalCodewords = count;
    }

    private static Version[] buildVersions() {
        int i10 = 1;
        int i11 = 5;
        Version version = new Version(1, 10, 10, 8, 8, new ECBlocks(i11, new ECB(i10, 3)));
        Version version2 = new Version(2, 12, 12, 10, 10, new ECBlocks(7, new ECB(i10, i11)));
        Version version3 = new Version(3, 14, 14, 12, 12, new ECBlocks(10, new ECB(i10, 8)));
        int i12 = 12;
        Version version4 = new Version(4, 16, 16, 14, 14, new ECBlocks(i12, new ECB(i10, i12)));
        int i13 = 18;
        Version version5 = new Version(5, 18, 18, 16, 16, new ECBlocks(14, new ECB(i10, i13)));
        Version version6 = new Version(6, 20, 20, 18, 18, new ECBlocks(i13, new ECB(i10, 22)));
        Version version7 = new Version(7, 22, 22, 20, 20, new ECBlocks(20, new ECB(i10, 30)));
        int i14 = 36;
        Version version8 = new Version(8, 24, 24, 22, 22, new ECBlocks(24, new ECB(i10, i14)));
        Version version9 = new Version(9, 26, 26, 24, 24, new ECBlocks(28, new ECB(i10, 44)));
        Version version10 = new Version(10, 32, 32, 14, 14, new ECBlocks(i14, new ECB(i10, 62)));
        int i15 = 42;
        Version version11 = new Version(11, 36, 36, 16, 16, new ECBlocks(i15, new ECB(i10, 86)));
        int i16 = 114;
        int i17 = 48;
        Version version12 = new Version(12, 40, 40, 18, 18, new ECBlocks(i17, new ECB(i10, i16)));
        int i18 = IjkMediaMeta.FF_PROFILE_H264_HIGH_444;
        int i19 = 56;
        Version version13 = new Version(13, 44, 44, 20, 20, new ECBlocks(i19, new ECB(i10, i18)));
        Version version14 = new Version(14, 48, 48, 22, 22, new ECBlocks(68, new ECB(i10, 174)));
        int i20 = 2;
        Version version15 = new Version(15, 52, 52, 24, 24, new ECBlocks(i15, new ECB(i20, 102)));
        Version version16 = new Version(16, 64, 64, 14, 14, new ECBlocks(i19, new ECB(i20, 140)));
        int i21 = 4;
        Version version17 = new Version(17, 72, 72, 16, 16, new ECBlocks(i14, new ECB(i21, 92)));
        Version version18 = new Version(18, 80, 80, 18, 18, new ECBlocks(i17, new ECB(i21, i16)));
        Version version19 = new Version(19, 88, 88, 20, 20, new ECBlocks(i19, new ECB(i21, i18)));
        Version version20 = new Version(20, 96, 96, 22, 22, new ECBlocks(68, new ECB(i21, 174)));
        Version version21 = new Version(21, 104, 104, 24, 24, new ECBlocks(i19, new ECB(6, 136)));
        Version version22 = new Version(22, 120, 120, 18, 18, new ECBlocks(68, new ECB(6, 175)));
        Version version23 = new Version(23, 132, 132, 20, 20, new ECBlocks(62, new ECB(8, 163)));
        Version version24 = new Version(24, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 22, 22, new ECBlocks(62, new ECB(8, 156), new ECB(i20, 155)));
        int i22 = 1;
        Version version25 = new Version(25, 8, 18, 6, 16, new ECBlocks(7, new ECB(i22, 5)));
        Version version26 = new Version(26, 8, 32, 6, 14, new ECBlocks(11, new ECB(i22, 10)));
        int i23 = 1;
        return new Version[]{version, version2, version3, version4, version5, version6, version7, version8, version9, version10, version11, version12, version13, version14, version15, version16, version17, version18, version19, version20, version21, version22, version23, version24, version25, version26, new Version(27, 12, 26, 10, 24, new ECBlocks(14, new ECB(i23, 16))), new Version(28, 12, 36, 10, 16, new ECBlocks(18, new ECB(i23, 22))), new Version(29, 16, 36, 14, 16, new ECBlocks(24, new ECB(1, 32))), new Version(30, 16, 48, 14, 22, new ECBlocks(28, new ECB(1, 49)))};
    }

    public static Version getVersionForDimensions(int i10, int i11) throws FormatException {
        if ((i10 & 1) != 0 || (i11 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        for (Version version : VERSIONS) {
            if (version.symbolSizeRows == i10 && version.symbolSizeColumns == i11) {
                return version;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public int getDataRegionSizeColumns() {
        return this.dataRegionSizeColumns;
    }

    public int getDataRegionSizeRows() {
        return this.dataRegionSizeRows;
    }

    public ECBlocks getECBlocks() {
        return this.ecBlocks;
    }

    public int getSymbolSizeColumns() {
        return this.symbolSizeColumns;
    }

    public int getSymbolSizeRows() {
        return this.symbolSizeRows;
    }

    public int getTotalCodewords() {
        return this.totalCodewords;
    }

    public int getVersionNumber() {
        return this.versionNumber;
    }

    public String toString() {
        return String.valueOf(this.versionNumber);
    }

    public static final class ECBlocks {
        private final ECB[] ecBlocks;
        private final int ecCodewords;

        public ECB[] getECBlocks() {
            return this.ecBlocks;
        }

        public int getECCodewords() {
            return this.ecCodewords;
        }

        private ECBlocks(int i10, ECB ecb) {
            this.ecCodewords = i10;
            this.ecBlocks = new ECB[]{ecb};
        }

        private ECBlocks(int i10, ECB ecb, ECB ecb2) {
            this.ecCodewords = i10;
            this.ecBlocks = new ECB[]{ecb, ecb2};
        }
    }
}
