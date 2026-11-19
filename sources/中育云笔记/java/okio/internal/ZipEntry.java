package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Path;

/* loaded from: classes6.dex */
public final class ZipEntry {
    private final Path canonicalPath;
    private final List<Path> children;
    private final String comment;
    private final long compressedSize;
    private final int compressionMethod;
    private final long crc;
    private final int dosLastModifiedAtDate;
    private final int dosLastModifiedAtTime;
    private final Integer extendedCreatedAtSeconds;
    private final Integer extendedLastAccessedAtSeconds;
    private final Integer extendedLastModifiedAtSeconds;
    private final boolean isDirectory;
    private final Long ntfsCreatedAtFiletime;
    private final Long ntfsLastAccessedAtFiletime;
    private final Long ntfsLastModifiedAtFiletime;
    private final long offset;
    private final long size;

    public ZipEntry(Path canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        AbstractC9979u.m20294g(canonicalPath, "canonicalPath");
        AbstractC9979u.m20294g(comment, "comment");
        this.canonicalPath = canonicalPath;
        this.isDirectory = z10;
        this.comment = comment;
        this.crc = j10;
        this.compressedSize = j11;
        this.size = j12;
        this.compressionMethod = i10;
        this.offset = j13;
        this.dosLastModifiedAtDate = i11;
        this.dosLastModifiedAtTime = i12;
        this.ntfsLastModifiedAtFiletime = l10;
        this.ntfsLastAccessedAtFiletime = l11;
        this.ntfsCreatedAtFiletime = l12;
        this.extendedLastModifiedAtSeconds = num;
        this.extendedLastAccessedAtSeconds = num2;
        this.extendedCreatedAtSeconds = num3;
        this.children = new ArrayList();
    }

    public final ZipEntry copy$okio(Integer num, Integer num2, Integer num3) {
        return new ZipEntry(this.canonicalPath, this.isDirectory, this.comment, this.crc, this.compressedSize, this.size, this.compressionMethod, this.offset, this.dosLastModifiedAtDate, this.dosLastModifiedAtTime, this.ntfsLastModifiedAtFiletime, this.ntfsLastAccessedAtFiletime, this.ntfsCreatedAtFiletime, num, num2, num3);
    }

    public final Path getCanonicalPath() {
        return this.canonicalPath;
    }

    public final List<Path> getChildren() {
        return this.children;
    }

    public final String getComment() {
        return this.comment;
    }

    public final long getCompressedSize() {
        return this.compressedSize;
    }

    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    public final long getCrc() {
        return this.crc;
    }

    public final Long getCreatedAtMillis$okio() {
        Long l10 = this.ntfsCreatedAtFiletime;
        if (l10 != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l10.longValue()));
        }
        if (this.extendedCreatedAtSeconds != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    public final int getDosLastModifiedAtDate() {
        return this.dosLastModifiedAtDate;
    }

    public final int getDosLastModifiedAtTime() {
        return this.dosLastModifiedAtTime;
    }

    public final Integer getExtendedCreatedAtSeconds() {
        return this.extendedCreatedAtSeconds;
    }

    public final Integer getExtendedLastAccessedAtSeconds() {
        return this.extendedLastAccessedAtSeconds;
    }

    public final Integer getExtendedLastModifiedAtSeconds() {
        return this.extendedLastModifiedAtSeconds;
    }

    public final Long getLastAccessedAtMillis$okio() {
        Long l10 = this.ntfsLastAccessedAtFiletime;
        if (l10 != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l10.longValue()));
        }
        if (this.extendedLastAccessedAtSeconds != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    public final Long getLastModifiedAtMillis$okio() {
        Long l10 = this.ntfsLastModifiedAtFiletime;
        if (l10 != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l10.longValue()));
        }
        if (this.extendedLastModifiedAtSeconds != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        int i10 = this.dosLastModifiedAtTime;
        if (i10 != -1) {
            return ZipFilesKt.dosDateTimeToEpochMillis(this.dosLastModifiedAtDate, i10);
        }
        return null;
    }

    public final Long getNtfsCreatedAtFiletime() {
        return this.ntfsCreatedAtFiletime;
    }

    public final Long getNtfsLastAccessedAtFiletime() {
        return this.ntfsLastAccessedAtFiletime;
    }

    public final Long getNtfsLastModifiedAtFiletime() {
        return this.ntfsLastModifiedAtFiletime;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ZipEntry(Path path, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, AbstractC9972n abstractC9972n) {
        Integer num4;
        boolean z11;
        Integer num5;
        boolean z12 = (i13 & 2) != 0 ? false : z10;
        String str2 = (i13 & 4) != 0 ? "" : str;
        long j14 = (i13 & 8) != 0 ? -1L : j10;
        long j15 = (i13 & 16) != 0 ? -1L : j11;
        long j16 = (i13 & 32) != 0 ? -1L : j12;
        int i14 = (i13 & 64) != 0 ? -1 : i10;
        long j17 = (i13 & 128) == 0 ? j13 : -1L;
        int i15 = (i13 & 256) != 0 ? -1 : i11;
        int i16 = (i13 & 512) == 0 ? i12 : -1;
        Long l13 = (i13 & 1024) != 0 ? null : l10;
        Long l14 = (i13 & 2048) != 0 ? null : l11;
        boolean z13 = z12;
        Long l15 = (i13 & 4096) != 0 ? null : l12;
        Integer num6 = (i13 & 8192) != 0 ? null : num;
        Integer num7 = (i13 & 16384) != 0 ? null : num2;
        if ((i13 & 32768) != 0) {
            num4 = num6;
            z11 = z13;
            num5 = null;
        } else {
            num4 = num6;
            z11 = z13;
            num5 = num3;
        }
        this(path, z11, str2, j14, j15, j16, i14, j17, i15, i16, l13, l14, l15, num4, num7, num5);
    }
}
