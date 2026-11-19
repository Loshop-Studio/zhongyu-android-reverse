package androidx.camera.video;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
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
    public static final Quality f979HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;
    static final Quality NONE;
    private static final Set<Quality> QUALITIES;
    private static final List<Quality> QUALITIES_ORDER_BY_SIZE;

    /* renamed from: SD */
    public static final Quality f980SD;
    public static final Quality UHD;

    @AutoValue
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class ConstantQuality extends Quality {
        public ConstantQuality() {
            super();
        }

        @NonNull
        /* renamed from: of */
        public static ConstantQuality m896of(int i10, @NonNull String str, @NonNull List<Size> list) {
            return new AutoValue_Quality_ConstantQuality(i10, str, list);
        }

        @NonNull
        public abstract String getName();

        @NonNull
        public abstract List<Size> getTypicalSizes();

        public abstract int getValue();
    }

    static {
        ConstantQuality constantQualityM896of = ConstantQuality.m896of(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f980SD = constantQualityM896of;
        ConstantQuality constantQualityM896of2 = ConstantQuality.m896of(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f979HD = constantQualityM896of2;
        ConstantQuality constantQualityM896of3 = ConstantQuality.m896of(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        FHD = constantQualityM896of3;
        ConstantQuality constantQualityM896of4 = ConstantQuality.m896of(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        UHD = constantQualityM896of4;
        List list = Collections.EMPTY_LIST;
        ConstantQuality constantQualityM896of5 = ConstantQuality.m896of(0, "LOWEST", list);
        LOWEST = constantQualityM896of5;
        ConstantQuality constantQualityM896of6 = ConstantQuality.m896of(1, "HIGHEST", list);
        HIGHEST = constantQualityM896of6;
        NONE = ConstantQuality.m896of(-1, "NONE", list);
        QUALITIES = new HashSet(Arrays.asList(constantQualityM896of5, constantQualityM896of6, constantQualityM896of, constantQualityM896of2, constantQualityM896of3, constantQualityM896of4));
        QUALITIES_ORDER_BY_SIZE = Arrays.asList(constantQualityM896of4, constantQualityM896of3, constantQualityM896of2, constantQualityM896of);
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
