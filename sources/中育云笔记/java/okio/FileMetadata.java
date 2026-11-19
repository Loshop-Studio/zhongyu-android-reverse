package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.AbstractC10470d;
import p280od.InterfaceC10469c;
import p325rc.AbstractC10947g0;

/* loaded from: classes6.dex */
public final class FileMetadata {
    private final Long createdAtMillis;
    private final Map<InterfaceC10469c, Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;
    private final Long lastAccessedAtMillis;
    private final Long lastModifiedAtMillis;
    private final Long size;
    private final Path symlinkTarget;

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ FileMetadata copy$default(FileMetadata fileMetadata, boolean z10, boolean z11, Path path, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = fileMetadata.isRegularFile;
        }
        if ((i10 & 2) != 0) {
            z11 = fileMetadata.isDirectory;
        }
        if ((i10 & 4) != 0) {
            path = fileMetadata.symlinkTarget;
        }
        if ((i10 & 8) != 0) {
            l10 = fileMetadata.size;
        }
        if ((i10 & 16) != 0) {
            l11 = fileMetadata.createdAtMillis;
        }
        if ((i10 & 32) != 0) {
            l12 = fileMetadata.lastModifiedAtMillis;
        }
        if ((i10 & 64) != 0) {
            l13 = fileMetadata.lastAccessedAtMillis;
        }
        if ((i10 & 128) != 0) {
            map = fileMetadata.extras;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return fileMetadata.copy(z10, z11, path, l10, l15, l16, l14, map2);
    }

    public final FileMetadata copy(boolean z10, boolean z11, Path path, Long l10, Long l11, Long l12, Long l13, Map<InterfaceC10469c, ? extends Object> extras) {
        AbstractC9979u.m20294g(extras, "extras");
        return new FileMetadata(z10, z11, path, l10, l11, l12, l13, extras);
    }

    public final <T> T extra(InterfaceC10469c type) {
        AbstractC9979u.m20294g(type, "type");
        Object obj = this.extras.get(type);
        if (obj == null) {
            return null;
        }
        return (T) AbstractC10470d.m21852a(type, obj);
    }

    public final Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public final Map<InterfaceC10469c, Object> getExtras() {
        return this.extras;
    }

    public final Long getLastAccessedAtMillis() {
        return this.lastAccessedAtMillis;
    }

    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final Long getSize() {
        return this.size;
    }

    public final Path getSymlinkTarget() {
        return this.symlinkTarget;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public final boolean isRegularFile() {
        return this.isRegularFile;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        if (this.size != null) {
            arrayList.add("byteCount=" + this.size);
        }
        if (this.createdAtMillis != null) {
            arrayList.add("createdAt=" + this.createdAtMillis);
        }
        if (this.lastModifiedAtMillis != null) {
            arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis);
        }
        if (this.lastAccessedAtMillis != null) {
            arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis);
        }
        if (!this.extras.isEmpty()) {
            arrayList.add("extras=" + this.extras);
        }
        return AbstractC10947g0.m23954w0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public FileMetadata(boolean z10, boolean z11, Path path, Long l10, Long l11, Long l12, Long l13, Map<InterfaceC10469c, ? extends Object> extras) {
        AbstractC9979u.m20294g(extras, "extras");
        this.isRegularFile = z10;
        this.isDirectory = z11;
        this.symlinkTarget = path;
        this.size = l10;
        this.createdAtMillis = l11;
        this.lastModifiedAtMillis = l12;
        this.lastAccessedAtMillis = l13;
        this.extras = AbstractC9925a.m20101u(extras);
    }

    public /* synthetic */ FileMetadata(boolean z10, boolean z11, Path path, Long l10, Long l11, Long l12, Long l13, Map map, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : path, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? AbstractC9925a.m20088h() : map);
    }
}
