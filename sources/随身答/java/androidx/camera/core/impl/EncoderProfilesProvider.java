package androidx.camera.core.impl;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface EncoderProfilesProvider {
    public static final EncoderProfilesProvider EMPTY = new EncoderProfilesProvider() { // from class: androidx.camera.core.impl.EncoderProfilesProvider.1
        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        @Nullable
        public EncoderProfilesProxy getAll(int i9) {
            return null;
        }

        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public boolean hasProfile(int i9) {
            return false;
        }
    };
    public static final List<Integer> QUALITY_HIGH_TO_LOW = Collections.unmodifiableList(Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    @Nullable
    EncoderProfilesProxy getAll(int i9);

    boolean hasProfile(int i9);
}
