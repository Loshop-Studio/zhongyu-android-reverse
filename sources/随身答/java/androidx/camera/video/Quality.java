package androidx.camera.video;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import com.p071uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Quality {
    public static final Quality FHD;

    /* renamed from: HD */
    public static final Quality f791HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;
    static final Quality NONE;
    private static final Set<Quality> QUALITIES;
    private static final List<Quality> QUALITIES_ORDER_BY_SIZE;

    /* renamed from: SD */
    public static final Quality f792SD;
    public static final Quality UHD;

    @AutoValue
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class ConstantQuality extends Quality {
        public ConstantQuality() {
            super();
        }

        @NonNull
        /* renamed from: of */
        public static ConstantQuality m674of(int i9, @NonNull String str, @NonNull List<Size> list) {
            return new AutoValue_Quality_ConstantQuality(i9, str, list);
        }

        @NonNull
        public abstract String getName();

        @NonNull
        public abstract List<Size> getTypicalSizes();

        public abstract int getValue();
    }

    static {
        ConstantQuality constantQualityM674of = ConstantQuality.m674of(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f792SD = constantQualityM674of;
        ConstantQuality constantQualityM674of2 = ConstantQuality.m674of(5, "HD", Collections.singletonList(new Size(LogType.UNEXP_ANR, 720)));
        f791HD = constantQualityM674of2;
        ConstantQuality constantQualityM674of3 = ConstantQuality.m674of(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        FHD = constantQualityM674of3;
        ConstantQuality constantQualityM674of4 = ConstantQuality.m674of(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        UHD = constantQualityM674of4;
        List list = Collections.EMPTY_LIST;
        ConstantQuality constantQualityM674of5 = ConstantQuality.m674of(0, "LOWEST", list);
        LOWEST = constantQualityM674of5;
        ConstantQuality constantQualityM674of6 = ConstantQuality.m674of(1, "HIGHEST", list);
        HIGHEST = constantQualityM674of6;
        NONE = ConstantQuality.m674of(-1, "NONE", list);
        QUALITIES = new HashSet(Arrays.asList(constantQualityM674of5, constantQualityM674of6, constantQualityM674of, constantQualityM674of2, constantQualityM674of3, constantQualityM674of4));
        QUALITIES_ORDER_BY_SIZE = Arrays.asList(constantQualityM674of4, constantQualityM674of3, constantQualityM674of2, constantQualityM674of);
    }

    public static boolean containsQuality(@NonNull Quality quality) {
        return QUALITIES.contains(quality);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static List<Quality> getSortedQualities() {
        return new ArrayList(QUALITIES_ORDER_BY_SIZE);
    }

    private Quality() {
    }
}
