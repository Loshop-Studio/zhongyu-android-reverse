package androidx.camera.extensions.internal;

/* loaded from: classes.dex */
final class AutoValue_Version extends Version {
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    public AutoValue_Version(int i10, int i11, int i12, String str) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.description = str;
    }

    @Override // androidx.camera.extensions.internal.Version
    public String getDescription() {
        return this.description;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMajor() {
        return this.major;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMinor() {
        return this.minor;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getPatch() {
        return this.patch;
    }
}
