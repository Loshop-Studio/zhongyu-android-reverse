package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@AutoValue
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public abstract class StreamInfo {
    static final int STREAM_ID_ANY = 0;
    static final int STREAM_ID_ERROR = -1;
    static final StreamInfo STREAM_INFO_ANY_INACTIVE = m788of(0, StreamState.INACTIVE);
    static final Set<Integer> NON_SURFACE_STREAM_ID = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    static final Observable<StreamInfo> ALWAYS_ACTIVE_OBSERVABLE = ConstantObservable.withValue(m788of(0, StreamState.ACTIVE));

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public enum StreamState {
        ACTIVE,
        INACTIVE
    }

    @NonNull
    /* renamed from: of */
    public static StreamInfo m788of(int i, @NonNull StreamState streamState) {
        return new AutoValue_StreamInfo(i, streamState, null);
    }

    public abstract int getId();

    @Nullable
    public abstract SurfaceRequest.TransformationInfo getInProgressTransformationInfo();

    @NonNull
    public abstract StreamState getStreamState();

    @NonNull
    /* renamed from: of */
    public static StreamInfo m789of(int i, @NonNull StreamState streamState, @Nullable SurfaceRequest.TransformationInfo transformationInfo) {
        return new AutoValue_StreamInfo(i, streamState, transformationInfo);
    }
}
