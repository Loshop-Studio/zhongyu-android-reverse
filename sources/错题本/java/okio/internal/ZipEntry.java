package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010!\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J-\u00105\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b6\u00107R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010)\u001a\u0004\b*\u0010(R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010)\u001a\u0004\b+\u0010(R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010.\u001a\u0004\b/\u0010-R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010.\u001a\u0004\b0\u0010-R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u000302¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u00108\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010(R\u0016\u0010:\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010(R\u0016\u0010<\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010(¨\u0006>"}, m5110d2 = {"Lokio/internal/ZipEntry;", "", "canonicalPath", "Lokio/Path;", "isDirectory", "", "comment", "", "crc", "", "compressedSize", "size", "compressionMethod", "", TypedValues.CycleType.S_WAVE_OFFSET, "dosLastModifiedAtDate", "dosLastModifiedAtTime", "ntfsLastModifiedAtFiletime", "ntfsLastAccessedAtFiletime", "ntfsCreatedAtFiletime", "extendedLastModifiedAtSeconds", "extendedLastAccessedAtSeconds", "extendedCreatedAtSeconds", "<init>", "(Lokio/Path;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCanonicalPath", "()Lokio/Path;", "()Z", "getComment", "()Ljava/lang/String;", "getCrc", "()J", "getCompressedSize", "getSize", "getCompressionMethod", "()I", "getOffset", "getDosLastModifiedAtDate", "getDosLastModifiedAtTime", "getNtfsLastModifiedAtFiletime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNtfsLastAccessedAtFiletime", "getNtfsCreatedAtFiletime", "getExtendedLastModifiedAtSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExtendedLastAccessedAtSeconds", "getExtendedCreatedAtSeconds", "children", "", "getChildren", "()Ljava/util/List;", "copy", "copy$okio", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lokio/internal/ZipEntry;", "lastAccessedAtMillis", "getLastAccessedAtMillis$okio", "lastModifiedAtMillis", "getLastModifiedAtMillis$okio", "createdAtMillis", "getCreatedAtMillis$okio", "okio"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class ZipEntry {

    @NotNull
    private final Path canonicalPath;

    @NotNull
    private final List<Path> children;

    @NotNull
    private final String comment;
    private final long compressedSize;
    private final int compressionMethod;
    private final long crc;
    private final int dosLastModifiedAtDate;
    private final int dosLastModifiedAtTime;

    @Nullable
    private final Integer extendedCreatedAtSeconds;

    @Nullable
    private final Integer extendedLastAccessedAtSeconds;

    @Nullable
    private final Integer extendedLastModifiedAtSeconds;
    private final boolean isDirectory;

    @Nullable
    private final Long ntfsCreatedAtFiletime;

    @Nullable
    private final Long ntfsLastAccessedAtFiletime;

    @Nullable
    private final Long ntfsLastModifiedAtFiletime;
    private final long offset;
    private final long size;

    public ZipEntry(@NotNull Path canonicalPath, boolean z8, @NotNull String comment, long j7, long j8, long j9, int i, long j10, int i8, int i9, @Nullable Long l, @Nullable Long l3, @Nullable Long l8, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        AbstractC5830k.m5330g(canonicalPath, "canonicalPath");
        AbstractC5830k.m5330g(comment, "comment");
        this.canonicalPath = canonicalPath;
        this.isDirectory = z8;
        this.comment = comment;
        this.crc = j7;
        this.compressedSize = j8;
        this.size = j9;
        this.compressionMethod = i;
        this.offset = j10;
        this.dosLastModifiedAtDate = i8;
        this.dosLastModifiedAtTime = i9;
        this.ntfsLastModifiedAtFiletime = l;
        this.ntfsLastAccessedAtFiletime = l3;
        this.ntfsCreatedAtFiletime = l8;
        this.extendedLastModifiedAtSeconds = num;
        this.extendedLastAccessedAtSeconds = num2;
        this.extendedCreatedAtSeconds = num3;
        this.children = new ArrayList();
    }

    @NotNull
    public final ZipEntry copy$okio(@Nullable Integer extendedLastModifiedAtSeconds, @Nullable Integer extendedLastAccessedAtSeconds, @Nullable Integer extendedCreatedAtSeconds) {
        return new ZipEntry(this.canonicalPath, this.isDirectory, this.comment, this.crc, this.compressedSize, this.size, this.compressionMethod, this.offset, this.dosLastModifiedAtDate, this.dosLastModifiedAtTime, this.ntfsLastModifiedAtFiletime, this.ntfsLastAccessedAtFiletime, this.ntfsCreatedAtFiletime, extendedLastModifiedAtSeconds, extendedLastAccessedAtSeconds, extendedCreatedAtSeconds);
    }

    @NotNull
    public final Path getCanonicalPath() {
        return this.canonicalPath;
    }

    @NotNull
    public final List<Path> getChildren() {
        return this.children;
    }

    @NotNull
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

    @Nullable
    public final Long getCreatedAtMillis$okio() {
        Long l = this.ntfsCreatedAtFiletime;
        if (l != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l.longValue()));
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

    @Nullable
    public final Integer getExtendedCreatedAtSeconds() {
        return this.extendedCreatedAtSeconds;
    }

    @Nullable
    public final Integer getExtendedLastAccessedAtSeconds() {
        return this.extendedLastAccessedAtSeconds;
    }

    @Nullable
    public final Integer getExtendedLastModifiedAtSeconds() {
        return this.extendedLastModifiedAtSeconds;
    }

    @Nullable
    public final Long getLastAccessedAtMillis$okio() {
        Long l = this.ntfsLastAccessedAtFiletime;
        if (l != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l.longValue()));
        }
        if (this.extendedLastAccessedAtSeconds != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    @Nullable
    public final Long getLastModifiedAtMillis$okio() {
        Long l = this.ntfsLastModifiedAtFiletime;
        if (l != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l.longValue()));
        }
        if (this.extendedLastModifiedAtSeconds != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        int i = this.dosLastModifiedAtTime;
        if (i != -1) {
            return ZipFilesKt.dosDateTimeToEpochMillis(this.dosLastModifiedAtDate, i);
        }
        return null;
    }

    @Nullable
    public final Long getNtfsCreatedAtFiletime() {
        return this.ntfsCreatedAtFiletime;
    }

    @Nullable
    public final Long getNtfsLastAccessedAtFiletime() {
        return this.ntfsLastAccessedAtFiletime;
    }

    @Nullable
    public final Long getNtfsLastModifiedAtFiletime() {
        return this.ntfsLastModifiedAtFiletime;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    /* renamed from: isDirectory, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ZipEntry(Path path, boolean z8, String str, long j7, long j8, long j9, int i, long j10, int i8, int i9, Long l, Long l3, Long l8, Integer num, Integer num2, Integer num3, int i10, AbstractC5824e abstractC5824e) {
        Integer num4;
        boolean z9;
        Integer num5;
        boolean z10 = (i10 & 2) != 0 ? false : z8;
        String str2 = (i10 & 4) != 0 ? "" : str;
        long j11 = (i10 & 8) != 0 ? -1L : j7;
        long j12 = (i10 & 16) != 0 ? -1L : j8;
        long j13 = (i10 & 32) != 0 ? -1L : j9;
        int i11 = (i10 & 64) != 0 ? -1 : i;
        long j14 = (i10 & 128) == 0 ? j10 : -1L;
        int i12 = (i10 & 256) != 0 ? -1 : i8;
        int i13 = (i10 & 512) == 0 ? i9 : -1;
        Long l9 = (i10 & 1024) != 0 ? null : l;
        Long l10 = (i10 & 2048) != 0 ? null : l3;
        boolean z11 = z10;
        Long l11 = (i10 & 4096) != 0 ? null : l8;
        Integer num6 = (i10 & 8192) != 0 ? null : num;
        Integer num7 = (i10 & 16384) != 0 ? null : num2;
        if ((i10 & 32768) != 0) {
            num4 = num6;
            z9 = z11;
            num5 = null;
        } else {
            num4 = num6;
            z9 = z11;
            num5 = num3;
        }
        this(path, z9, str2, j11, j12, j13, i11, j14, i12, i13, l9, l10, l11, num4, num7, num5);
    }
}
