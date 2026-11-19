package androidx.camera.video;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import com.tencent.smtt.sdk.TbsListener;
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
    public static final Quality f876HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;
    static final Quality NONE;
    private static final Set<Quality> QUALITIES;
    private static final List<Quality> QUALITIES_ORDER_BY_SIZE;

    /* renamed from: SD */
    public static final Quality f877SD;
    public static final Quality UHD;

    @AutoValue
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class ConstantQuality extends Quality {
        public ConstantQuality() {
            super();
        }

        @NonNull
        /* renamed from: of */
        public static ConstantQuality m669of(int i10, @NonNull String str, @NonNull List<Size> list) {
            return new AutoValue_Quality_ConstantQuality(i10, str, list);
        }

        @NonNull
        public abstract String getName();

        @NonNull
        public abstract List<Size> getTypicalSizes();

        public abstract int getValue();
    }

    static {
        ConstantQuality constantQualityM669of = ConstantQuality.m669of(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR, 480))));
        f877SD = constantQualityM669of;
        ConstantQuality constantQualityM669of2 = ConstantQuality.m669of(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f876HD = constantQualityM669of2;
        ConstantQuality constantQualityM669of3 = ConstantQuality.m669of(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        FHD = constantQualityM669of3;
        ConstantQuality constantQualityM669of4 = ConstantQuality.m669of(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        UHD = constantQualityM669of4;
        List list = Collections.EMPTY_LIST;
        ConstantQuality constantQualityM669of5 = ConstantQuality.m669of(0, "LOWEST", list);
        LOWEST = constantQualityM669of5;
        ConstantQuality constantQualityM669of6 = ConstantQuality.m669of(1, "HIGHEST", list);
        HIGHEST = constantQualityM669of6;
        NONE = ConstantQuality.m669of(-1, "NONE", list);
        QUALITIES = new HashSet(Arrays.asList(constantQualityM669of5, constantQualityM669of6, constantQualityM669of, constantQualityM669of2, constantQualityM669of3, constantQualityM669of4));
        QUALITIES_ORDER_BY_SIZE = Arrays.asList(constantQualityM669of4, constantQualityM669of3, constantQualityM669of2, constantQualityM669of);
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
