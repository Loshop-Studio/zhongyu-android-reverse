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
    public static final Quality f577HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;
    static final Quality NONE;
    private static final Set<Quality> QUALITIES;
    private static final List<Quality> QUALITIES_ORDER_BY_SIZE;

    /* renamed from: SD */
    public static final Quality f578SD;
    public static final Quality UHD;

    @AutoValue
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class ConstantQuality extends Quality {
        public ConstantQuality() {
            super();
        }

        @NonNull
        /* renamed from: of */
        public static ConstantQuality m756of(int i, @NonNull String str, @NonNull List<Size> list) {
            return new AutoValue_Quality_ConstantQuality(i, str, list);
        }

        @NonNull
        public abstract String getName();

        @NonNull
        public abstract List<Size> getTypicalSizes();

        public abstract int getValue();
    }

    static {
        ConstantQuality constantQualityM756of = ConstantQuality.m756of(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f578SD = constantQualityM756of;
        ConstantQuality constantQualityM756of2 = ConstantQuality.m756of(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f577HD = constantQualityM756of2;
        ConstantQuality constantQualityM756of3 = ConstantQuality.m756of(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        FHD = constantQualityM756of3;
        ConstantQuality constantQualityM756of4 = ConstantQuality.m756of(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        UHD = constantQualityM756of4;
        List list = Collections.EMPTY_LIST;
        ConstantQuality constantQualityM756of5 = ConstantQuality.m756of(0, "LOWEST", list);
        LOWEST = constantQualityM756of5;
        ConstantQuality constantQualityM756of6 = ConstantQuality.m756of(1, "HIGHEST", list);
        HIGHEST = constantQualityM756of6;
        NONE = ConstantQuality.m756of(-1, "NONE", list);
        QUALITIES = new HashSet(Arrays.asList(constantQualityM756of5, constantQualityM756of6, constantQualityM756of, constantQualityM756of2, constantQualityM756of3, constantQualityM756of4));
        QUALITIES_ORDER_BY_SIZE = Arrays.asList(constantQualityM756of4, constantQualityM756of3, constantQualityM756of2, constantQualityM756of);
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
