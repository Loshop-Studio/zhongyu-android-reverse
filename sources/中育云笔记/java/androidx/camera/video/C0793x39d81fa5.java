package androidx.camera.video;

import android.location.Location;
import android.os.ParcelFileDescriptor;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.FileDescriptorOutputOptions;

/* renamed from: androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal */
/* loaded from: classes.dex */
final class C0793x39d81fa5 extends FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal {
    private final long durationLimitMillis;
    private final long fileSizeLimit;
    private final Location location;
    private final ParcelFileDescriptor parcelFileDescriptor;

    /* renamed from: androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal$Builder */
    public static final class Builder extends FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder {
        private Long durationLimitMillis;
        private Long fileSizeLimit;
        private Location location;
        private ParcelFileDescriptor parcelFileDescriptor;

        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder
        public FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
            if (parcelFileDescriptor == null) {
                throw new NullPointerException("Null parcelFileDescriptor");
            }
            this.parcelFileDescriptor = parcelFileDescriptor;
            return this;
        }

        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder, androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal build() {
            String str = "";
            if (this.fileSizeLimit == null) {
                str = " fileSizeLimit";
            }
            if (this.durationLimitMillis == null) {
                str = str + " durationLimitMillis";
            }
            if (this.parcelFileDescriptor == null) {
                str = str + " parcelFileDescriptor";
            }
            if (str.isEmpty()) {
                return new C0793x39d81fa5(this.fileSizeLimit.longValue(), this.durationLimitMillis.longValue(), this.location, this.parcelFileDescriptor);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setDurationLimitMillis(long j10) {
            this.durationLimitMillis = Long.valueOf(j10);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setFileSizeLimit(long j10) {
            this.fileSizeLimit = Long.valueOf(j10);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder setLocation(@Nullable Location location) {
            this.location = location;
            return this;
        }
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal) {
            FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal fileDescriptorOutputOptionsInternal = (FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal) obj;
            if (this.fileSizeLimit == fileDescriptorOutputOptionsInternal.getFileSizeLimit() && this.durationLimitMillis == fileDescriptorOutputOptionsInternal.getDurationLimitMillis() && ((location = this.location) != null ? location.equals(fileDescriptorOutputOptionsInternal.getLocation()) : fileDescriptorOutputOptionsInternal.getLocation() == null) && this.parcelFileDescriptor.equals(fileDescriptorOutputOptionsInternal.getParcelFileDescriptor())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @IntRange(from = 0)
    public long getDurationLimitMillis() {
        return this.durationLimitMillis;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @IntRange(from = 0)
    public long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    @Nullable
    public Location getLocation() {
        return this.location;
    }

    @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal
    @NonNull
    public ParcelFileDescriptor getParcelFileDescriptor() {
        return this.parcelFileDescriptor;
    }

    public int hashCode() {
        long j10 = this.fileSizeLimit;
        long j11 = this.durationLimitMillis;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        Location location = this.location;
        return ((i10 ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.parcelFileDescriptor.hashCode();
    }

    public String toString() {
        return "FileDescriptorOutputOptionsInternal{fileSizeLimit=" + this.fileSizeLimit + ", durationLimitMillis=" + this.durationLimitMillis + ", location=" + this.location + ", parcelFileDescriptor=" + this.parcelFileDescriptor + "}";
    }

    private C0793x39d81fa5(long j10, long j11, @Nullable Location location, ParcelFileDescriptor parcelFileDescriptor) {
        this.fileSizeLimit = j10;
        this.durationLimitMillis = j11;
        this.location = location;
        this.parcelFileDescriptor = parcelFileDescriptor;
    }
}
