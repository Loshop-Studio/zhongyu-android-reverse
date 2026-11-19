package androidx.compose.p014ui.graphics;

/* loaded from: classes2.dex */
public interface PathMeasure {

    public static final class DefaultImpls {
    }

    static /* synthetic */ boolean getSegment$default(PathMeasure pathMeasure, float f10, float f11, Path path, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return pathMeasure.getSegment(f10, f11, path, z10);
    }

    float getLength();

    /* renamed from: getPosition-tuRUvjQ */
    long mo30776getPositiontuRUvjQ(float f10);

    boolean getSegment(float f10, float f11, Path path, boolean z10);

    /* renamed from: getTangent-tuRUvjQ */
    long mo30777getTangenttuRUvjQ(float f10);

    void setPath(Path path, boolean z10);
}
