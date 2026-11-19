package androidx.camera.camera2.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class GuaranteedConfigurationsUtil {
    private GuaranteedConfigurationsUtil() {
    }

    @NonNull
    public static List<SurfaceCombination> generateSupportedCombinationList(int i, boolean z8, boolean z9) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getLegacySupportedCombinationList());
        if (i == 0 || i == 1 || i == 3) {
            arrayList.addAll(getLimitedSupportedCombinationList());
        }
        if (i == 1 || i == 3) {
            arrayList.addAll(getFullSupportedCombinationList());
        }
        if (z8) {
            arrayList.addAll(getRAWSupportedCombinationList());
        }
        if (z9 && i == 0) {
            arrayList.addAll(getBurstSupportedCombinationList());
        }
        if (i == 3) {
            arrayList.addAll(getLevel3SupportedCombinationList());
        }
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> get10BitSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationM78c = AbstractC0037f.m78c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationM78c2 = AbstractC0037f.m78c(configType2, configSize, surfaceCombinationM78c, arrayList, surfaceCombinationM78c);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombinationM78c2.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationM78c3 = AbstractC0037f.m78c(configType3, configSize, surfaceCombinationM78c2, arrayList, surfaceCombinationM78c2);
        AbstractC0037f.m73B(configType, configSize2, surfaceCombinationM78c3, configType2, configSize);
        SurfaceCombination surfaceCombinationM79d = AbstractC0037f.m79d(arrayList, surfaceCombinationM78c3);
        AbstractC0037f.m73B(configType2, configSize2, surfaceCombinationM79d, configType2, configSize);
        SurfaceCombination surfaceCombinationM79d2 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d);
        surfaceCombinationM79d2.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination surfaceCombinationM78c4 = AbstractC0037f.m78c(configType, configSize3, surfaceCombinationM79d2, arrayList, surfaceCombinationM79d2);
        AbstractC0037f.m73B(configType, configSize2, surfaceCombinationM78c4, configType, configSize3);
        SurfaceCombination surfaceCombinationM78c5 = AbstractC0037f.m78c(configType2, configSize3, surfaceCombinationM78c4, arrayList, surfaceCombinationM78c4);
        AbstractC0037f.m73B(configType, configSize2, surfaceCombinationM78c5, configType, configSize3);
        surfaceCombinationM78c5.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3));
        arrayList.add(surfaceCombinationM78c5);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getBurstSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationM78c = AbstractC0037f.m78c(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        surfaceCombinationM78c.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationM78c2 = AbstractC0037f.m78c(configType2, configSize2, surfaceCombinationM78c, arrayList, surfaceCombinationM78c);
        AbstractC0037f.m73B(configType2, configSize, surfaceCombinationM78c2, configType2, configSize2);
        arrayList.add(surfaceCombinationM78c2);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getConcurrentSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        SurfaceCombination surfaceCombinationM78c = AbstractC0037f.m78c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceCombination surfaceCombinationM78c2 = AbstractC0037f.m78c(configType2, configSize, surfaceCombinationM78c, arrayList, surfaceCombinationM78c);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationM78c3 = AbstractC0037f.m78c(configType3, configSize, surfaceCombinationM78c2, arrayList, surfaceCombinationM78c2);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.s720p;
        AbstractC0037f.m73B(configType, configSize2, surfaceCombinationM78c3, configType3, configSize);
        SurfaceCombination surfaceCombinationM79d = AbstractC0037f.m79d(arrayList, surfaceCombinationM78c3);
        AbstractC0037f.m73B(configType2, configSize2, surfaceCombinationM79d, configType3, configSize);
        SurfaceCombination surfaceCombinationM79d2 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d);
        AbstractC0037f.m73B(configType, configSize2, surfaceCombinationM79d2, configType, configSize);
        SurfaceCombination surfaceCombinationM79d3 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d2);
        AbstractC0037f.m73B(configType, configSize2, surfaceCombinationM79d3, configType2, configSize);
        SurfaceCombination surfaceCombinationM79d4 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d3);
        AbstractC0037f.m73B(configType2, configSize2, surfaceCombinationM79d4, configType, configSize);
        SurfaceCombination surfaceCombinationM79d5 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d4);
        AbstractC0037f.m73B(configType2, configSize2, surfaceCombinationM79d5, configType2, configSize);
        arrayList.add(surfaceCombinationM79d5);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getFullSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationM78c = AbstractC0037f.m78c(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        surfaceCombinationM78c.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationM78c2 = AbstractC0037f.m78c(configType2, configSize2, surfaceCombinationM78c, arrayList, surfaceCombinationM78c);
        AbstractC0037f.m73B(configType2, configSize, surfaceCombinationM78c2, configType2, configSize2);
        SurfaceCombination surfaceCombinationM79d = AbstractC0037f.m79d(arrayList, surfaceCombinationM78c2);
        AbstractC0037f.m73B(configType, configSize, surfaceCombinationM79d, configType, configSize);
        SurfaceCombination surfaceCombinationM78c3 = AbstractC0037f.m78c(SurfaceConfig.ConfigType.JPEG, configSize2, surfaceCombinationM79d, arrayList, surfaceCombinationM79d);
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.VGA;
        AbstractC0037f.m73B(configType2, configSize3, surfaceCombinationM78c3, configType, configSize);
        SurfaceCombination surfaceCombinationM78c4 = AbstractC0037f.m78c(configType2, configSize2, surfaceCombinationM78c3, arrayList, surfaceCombinationM78c3);
        AbstractC0037f.m73B(configType2, configSize3, surfaceCombinationM78c4, configType2, configSize);
        surfaceCombinationM78c4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        arrayList.add(surfaceCombinationM78c4);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getLegacySupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationM78c = AbstractC0037f.m78c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationM78c2 = AbstractC0037f.m78c(configType2, configSize, surfaceCombinationM78c, arrayList, surfaceCombinationM78c);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationM78c3 = AbstractC0037f.m78c(configType3, configSize, surfaceCombinationM78c2, arrayList, surfaceCombinationM78c2);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        AbstractC0037f.m73B(configType, configSize2, surfaceCombinationM78c3, configType2, configSize);
        SurfaceCombination surfaceCombinationM79d = AbstractC0037f.m79d(arrayList, surfaceCombinationM78c3);
        AbstractC0037f.m73B(configType3, configSize2, surfaceCombinationM79d, configType2, configSize);
        SurfaceCombination surfaceCombinationM79d2 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d);
        AbstractC0037f.m73B(configType, configSize2, surfaceCombinationM79d2, configType, configSize2);
        SurfaceCombination surfaceCombinationM79d3 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d2);
        AbstractC0037f.m73B(configType, configSize2, surfaceCombinationM79d3, configType3, configSize2);
        SurfaceCombination surfaceCombinationM79d4 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d3);
        AbstractC0037f.m73B(configType, configSize2, surfaceCombinationM79d4, configType3, configSize2);
        surfaceCombinationM79d4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize));
        arrayList.add(surfaceCombinationM79d4);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getLevel3SupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.VGA;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize2));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.RAW;
        SurfaceCombination surfaceCombinationM78c = AbstractC0037f.m78c(configType3, configSize3, surfaceCombination, arrayList, surfaceCombination);
        AbstractC0037f.m73B(configType, configSize, surfaceCombinationM78c, configType, configSize2);
        AbstractC0037f.m73B(SurfaceConfig.ConfigType.JPEG, configSize3, surfaceCombinationM78c, configType3, configSize3);
        arrayList.add(surfaceCombinationM78c);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getLimitedSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination surfaceCombinationM78c = AbstractC0037f.m78c(configType, configSize2, surfaceCombination, arrayList, surfaceCombination);
        surfaceCombinationM78c.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationM78c2 = AbstractC0037f.m78c(configType2, configSize2, surfaceCombinationM78c, arrayList, surfaceCombinationM78c);
        AbstractC0037f.m73B(configType2, configSize, surfaceCombinationM78c2, configType2, configSize2);
        SurfaceCombination surfaceCombinationM79d = AbstractC0037f.m79d(arrayList, surfaceCombinationM78c2);
        AbstractC0037f.m73B(configType, configSize, surfaceCombinationM79d, configType, configSize2);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationM78c3 = AbstractC0037f.m78c(configType3, configSize2, surfaceCombinationM79d, arrayList, surfaceCombinationM79d);
        AbstractC0037f.m73B(configType, configSize, surfaceCombinationM78c3, configType2, configSize2);
        SurfaceCombination surfaceCombinationM78c4 = AbstractC0037f.m78c(configType3, configSize2, surfaceCombinationM78c3, arrayList, surfaceCombinationM78c3);
        AbstractC0037f.m73B(configType2, configSize, surfaceCombinationM78c4, configType2, configSize);
        surfaceCombinationM78c4.addSurfaceConfig(SurfaceConfig.create(configType3, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(surfaceCombinationM78c4);
        return arrayList;
    }

    @NonNull
    @RequiresApi(api = 33)
    public static List<SurfaceCombination> getPreviewStabilizationSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        SurfaceCombination surfaceCombinationM78c = AbstractC0037f.m78c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationM78c2 = AbstractC0037f.m78c(configType2, configSize, surfaceCombinationM78c, arrayList, surfaceCombinationM78c);
        surfaceCombinationM78c2.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationM78c3 = AbstractC0037f.m78c(configType3, configSize2, surfaceCombinationM78c2, arrayList, surfaceCombinationM78c2);
        AbstractC0037f.m73B(configType2, configSize, surfaceCombinationM78c3, configType3, configSize2);
        SurfaceCombination surfaceCombinationM79d = AbstractC0037f.m79d(arrayList, surfaceCombinationM78c3);
        AbstractC0037f.m73B(configType, configSize, surfaceCombinationM79d, configType2, configSize2);
        SurfaceCombination surfaceCombinationM79d2 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d);
        AbstractC0037f.m73B(configType2, configSize, surfaceCombinationM79d2, configType2, configSize2);
        SurfaceCombination surfaceCombinationM79d3 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d2);
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.PREVIEW;
        AbstractC0037f.m73B(configType, configSize3, surfaceCombinationM79d3, configType, configSize);
        SurfaceCombination surfaceCombinationM79d4 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d3);
        AbstractC0037f.m73B(configType2, configSize3, surfaceCombinationM79d4, configType, configSize);
        SurfaceCombination surfaceCombinationM79d5 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d4);
        AbstractC0037f.m73B(configType, configSize3, surfaceCombinationM79d5, configType2, configSize);
        SurfaceCombination surfaceCombinationM79d6 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d5);
        AbstractC0037f.m73B(configType2, configSize3, surfaceCombinationM79d6, configType2, configSize);
        arrayList.add(surfaceCombinationM79d6);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getRAWSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.RAW;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationM78c = AbstractC0037f.m78c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        AbstractC0037f.m73B(configType2, configSize2, surfaceCombinationM78c, configType, configSize);
        SurfaceCombination surfaceCombinationM79d = AbstractC0037f.m79d(arrayList, surfaceCombinationM78c);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        AbstractC0037f.m73B(configType3, configSize2, surfaceCombinationM79d, configType, configSize);
        SurfaceCombination surfaceCombinationM79d2 = AbstractC0037f.m79d(arrayList, surfaceCombinationM79d);
        AbstractC0037f.m73B(configType2, configSize2, surfaceCombinationM79d2, configType2, configSize2);
        SurfaceCombination surfaceCombinationM78c2 = AbstractC0037f.m78c(configType, configSize, surfaceCombinationM79d2, arrayList, surfaceCombinationM79d2);
        AbstractC0037f.m73B(configType2, configSize2, surfaceCombinationM78c2, configType3, configSize2);
        SurfaceCombination surfaceCombinationM78c3 = AbstractC0037f.m78c(configType, configSize, surfaceCombinationM78c2, arrayList, surfaceCombinationM78c2);
        AbstractC0037f.m73B(configType3, configSize2, surfaceCombinationM78c3, configType3, configSize2);
        SurfaceCombination surfaceCombinationM78c4 = AbstractC0037f.m78c(configType, configSize, surfaceCombinationM78c3, arrayList, surfaceCombinationM78c3);
        surfaceCombinationM78c4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.JPEG;
        AbstractC0037f.m73B(configType4, configSize, surfaceCombinationM78c4, configType, configSize);
        SurfaceCombination surfaceCombinationM79d3 = AbstractC0037f.m79d(arrayList, surfaceCombinationM78c4);
        AbstractC0037f.m73B(configType3, configSize2, surfaceCombinationM79d3, configType4, configSize);
        surfaceCombinationM79d3.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        arrayList.add(surfaceCombinationM79d3);
        return arrayList;
    }

    @NonNull
    @RequiresApi(api = 33)
    public static List<SurfaceCombination> getStreamUseCaseSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.s1440p;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize, 4L));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.create(configType2, configSize, 4L));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3, 2L));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.create(configType2, configSize3, 2L));
        arrayList.add(surfaceCombination8);
        SurfaceCombination surfaceCombination9 = new SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        arrayList.add(surfaceCombination9);
        SurfaceCombination surfaceCombination10 = new SurfaceCombination();
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        arrayList.add(surfaceCombination10);
        SurfaceCombination surfaceCombination11 = new SurfaceCombination();
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.create(configType2, configSize4, 1L));
        arrayList.add(surfaceCombination11);
        SurfaceCombination surfaceCombination12 = new SurfaceCombination();
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType, configSize2, 3L));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2, 2L));
        arrayList.add(surfaceCombination12);
        SurfaceCombination surfaceCombination13 = new SurfaceCombination();
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2, 3L));
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.create(configType3, configSize2, 2L));
        arrayList.add(surfaceCombination13);
        SurfaceCombination surfaceCombination14 = new SurfaceCombination();
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType, configSize4, 1L));
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType2, configSize4, 1L));
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.create(configType3, configSize3, 2L));
        arrayList.add(surfaceCombination14);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getUltraHdrSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.JPEG_R;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationM78c = AbstractC0037f.m78c(configType, configSize, surfaceCombination, arrayList, surfaceCombination);
        AbstractC0037f.m73B(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, surfaceCombinationM78c, configType, configSize);
        arrayList.add(surfaceCombinationM78c);
        return arrayList;
    }

    @NonNull
    public static List<SurfaceCombination> getUltraHighResolutionSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.create(configType2, configSize2));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination surfaceCombinationM78c = AbstractC0037f.m78c(configType2, configSize3, surfaceCombination, arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        AbstractC0037f.m73B(configType3, configSize, surfaceCombinationM78c, configType2, configSize2);
        SurfaceCombination surfaceCombinationM78c2 = AbstractC0037f.m78c(configType2, configSize3, surfaceCombinationM78c, arrayList, surfaceCombinationM78c);
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.RAW;
        AbstractC0037f.m73B(configType4, configSize, surfaceCombinationM78c2, configType2, configSize2);
        SurfaceCombination surfaceCombinationM78c3 = AbstractC0037f.m78c(configType2, configSize3, surfaceCombinationM78c2, arrayList, surfaceCombinationM78c2);
        AbstractC0037f.m73B(configType, configSize, surfaceCombinationM78c3, configType2, configSize2);
        SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationM78c4 = AbstractC0037f.m78c(configType3, configSize4, surfaceCombinationM78c3, arrayList, surfaceCombinationM78c3);
        AbstractC0037f.m73B(configType3, configSize, surfaceCombinationM78c4, configType2, configSize2);
        SurfaceCombination surfaceCombinationM78c5 = AbstractC0037f.m78c(configType3, configSize4, surfaceCombinationM78c4, arrayList, surfaceCombinationM78c4);
        AbstractC0037f.m73B(configType4, configSize, surfaceCombinationM78c5, configType2, configSize2);
        SurfaceCombination surfaceCombinationM78c6 = AbstractC0037f.m78c(configType3, configSize4, surfaceCombinationM78c5, arrayList, surfaceCombinationM78c5);
        AbstractC0037f.m73B(configType, configSize, surfaceCombinationM78c6, configType2, configSize2);
        SurfaceCombination surfaceCombinationM78c7 = AbstractC0037f.m78c(configType, configSize4, surfaceCombinationM78c6, arrayList, surfaceCombinationM78c6);
        AbstractC0037f.m73B(configType3, configSize, surfaceCombinationM78c7, configType2, configSize2);
        SurfaceCombination surfaceCombinationM78c8 = AbstractC0037f.m78c(configType, configSize4, surfaceCombinationM78c7, arrayList, surfaceCombinationM78c7);
        AbstractC0037f.m73B(configType4, configSize, surfaceCombinationM78c8, configType2, configSize2);
        SurfaceCombination surfaceCombinationM78c9 = AbstractC0037f.m78c(configType, configSize4, surfaceCombinationM78c8, arrayList, surfaceCombinationM78c8);
        AbstractC0037f.m73B(configType, configSize, surfaceCombinationM78c9, configType2, configSize2);
        SurfaceCombination surfaceCombinationM78c10 = AbstractC0037f.m78c(configType4, configSize4, surfaceCombinationM78c9, arrayList, surfaceCombinationM78c9);
        AbstractC0037f.m73B(configType3, configSize, surfaceCombinationM78c10, configType2, configSize2);
        SurfaceCombination surfaceCombinationM78c11 = AbstractC0037f.m78c(configType4, configSize4, surfaceCombinationM78c10, arrayList, surfaceCombinationM78c10);
        AbstractC0037f.m73B(configType4, configSize, surfaceCombinationM78c11, configType2, configSize2);
        surfaceCombinationM78c11.addSurfaceConfig(SurfaceConfig.create(configType4, configSize4));
        arrayList.add(surfaceCombinationM78c11);
        return arrayList;
    }
}
