package androidx.camera.core.internal;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class SupportedOutputSizesSorter {
    private static final String TAG = "SupportedOutputSizesCollector";
    private final CameraInfoInternal mCameraInfoInternal;
    private final Rational mFullFovRatio;
    private final int mLensFacing;
    private final int mSensorOrientation;
    private final SupportedOutputSizesSorterLegacy mSupportedOutputSizesSorterLegacy;

    public SupportedOutputSizesSorter(@NonNull CameraInfoInternal cameraInfoInternal, @Nullable Size size) {
        this.mCameraInfoInternal = cameraInfoInternal;
        this.mSensorOrientation = cameraInfoInternal.getSensorRotationDegrees();
        this.mLensFacing = cameraInfoInternal.getLensFacing();
        Rational rationalCalculateFullFovRatioFromActiveArraySize = size != null ? calculateFullFovRatioFromActiveArraySize(size) : calculateFullFovRatioFromSupportedOutputSizes(cameraInfoInternal);
        this.mFullFovRatio = rationalCalculateFullFovRatioFromActiveArraySize;
        this.mSupportedOutputSizesSorterLegacy = new SupportedOutputSizesSorterLegacy(cameraInfoInternal, rationalCalculateFullFovRatioFromActiveArraySize);
    }

    @NonNull
    private static LinkedHashMap<Rational, List<Size>> applyAspectRatioStrategy(@NonNull List<Size> list, @NonNull AspectRatioStrategy aspectRatioStrategy, Rational rational) {
        return applyAspectRatioStrategyFallbackRule(groupSizesByAspectRatio(list), aspectRatioStrategy, rational);
    }

    private static LinkedHashMap<Rational, List<Size>> applyAspectRatioStrategyFallbackRule(@NonNull Map<Rational, List<Size>> map, @NonNull AspectRatioStrategy aspectRatioStrategy, Rational rational) {
        int i10 = 0;
        boolean z9 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z9 = false;
        }
        Rational targetAspectRatioRationalValue = getTargetAspectRatioRationalValue(aspectRatioStrategy.getPreferredAspectRatio(), z9);
        if (aspectRatioStrategy.getFallbackRule() == 0) {
            Rational targetAspectRatioRationalValue2 = getTargetAspectRatioRationalValue(aspectRatioStrategy.getPreferredAspectRatio(), z9);
            ArrayList arrayList = new ArrayList(map.keySet());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Rational rational2 = (Rational) obj;
                if (!rational2.equals(targetAspectRatioRationalValue2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2, new AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(targetAspectRatioRationalValue, rational));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            Rational rational3 = (Rational) obj2;
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    @NonNull
    private List<Size> applyHighResolutionSettings(@NonNull List<Size> list, @NonNull ResolutionSelector resolutionSelector, int i10) {
        if (resolutionSelector.getAllowedResolutionMode() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.mCameraInfoInternal.getSupportedHighResolutions(i10));
        Collections.sort(arrayList, new CompareSizesByArea(true));
        return arrayList;
    }

    private static void applyMaxResolutionRestriction(@NonNull LinkedHashMap<Rational, List<Size>> linkedHashMap, @NonNull Size size) {
        int area = SizeUtil.getArea(size);
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = linkedHashMap.get(it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (SizeUtil.getArea(size2) <= area) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    @NonNull
    private static List<Size> applyResolutionFilter(@NonNull List<Size> list, @Nullable ResolutionFilter resolutionFilter, int i10, int i11, int i12) {
        if (resolutionFilter == null) {
            return list;
        }
        List<Size> listFilter = resolutionFilter.filter(new ArrayList(list), CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(i10), i11, i12 == 1));
        if (list.containsAll(listFilter)) {
            return listFilter;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void applyResolutionStrategy(@NonNull LinkedHashMap<Rational, List<Size>> linkedHashMap, @Nullable ResolutionStrategy resolutionStrategy) {
        if (resolutionStrategy == null) {
            return;
        }
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            applyResolutionStrategyFallbackRule(linkedHashMap.get(it.next()), resolutionStrategy);
        }
    }

    private static void applyResolutionStrategyFallbackRule(@NonNull List<Size> list, @NonNull ResolutionStrategy resolutionStrategy) {
        if (list.isEmpty()) {
            return;
        }
        int fallbackRule = resolutionStrategy.getFallbackRule();
        if (resolutionStrategy.equals(ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY)) {
            return;
        }
        Size boundSize = resolutionStrategy.getBoundSize();
        if (fallbackRule == 0) {
            sortSupportedSizesByFallbackRuleNone(list, boundSize);
            return;
        }
        if (fallbackRule == 1) {
            sortSupportedSizesByFallbackRuleClosestHigherThenLower(list, boundSize, true);
            return;
        }
        if (fallbackRule == 2) {
            sortSupportedSizesByFallbackRuleClosestHigherThenLower(list, boundSize, false);
        } else if (fallbackRule == 3) {
            sortSupportedSizesByFallbackRuleClosestLowerThenHigher(list, boundSize, true);
        } else {
            if (fallbackRule != 4) {
                return;
            }
            sortSupportedSizesByFallbackRuleClosestLowerThenHigher(list, boundSize, false);
        }
    }

    @NonNull
    private Rational calculateFullFovRatioFromActiveArraySize(@NonNull Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    @Nullable
    private Rational calculateFullFovRatioFromSupportedOutputSizes(@NonNull CameraInfoInternal cameraInfoInternal) {
        List<Size> supportedResolutions = cameraInfoInternal.getSupportedResolutions(256);
        if (supportedResolutions.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(supportedResolutions, new CompareSizesByArea());
        return new Rational(size.getWidth(), size.getHeight());
    }

    @NonNull
    private List<Size> getResolutionCandidateList(@Nullable List<Pair<Integer, Size[]>> list, int i10) {
        List<Size> sizeListByFormat = getSizeListByFormat(list, i10);
        if (sizeListByFormat == null) {
            sizeListByFormat = this.mCameraInfoInternal.getSupportedResolutions(i10);
        }
        ArrayList arrayList = new ArrayList(sizeListByFormat);
        Collections.sort(arrayList, new CompareSizesByArea(true));
        if (arrayList.isEmpty()) {
            Logger.m729w(TAG, "The retrieved supported resolutions from camera info internal is empty. Format is " + i10 + ".");
        }
        return arrayList;
    }

    @NonNull
    public static List<Rational> getResolutionListGroupingAspectRatioKeys(@NonNull List<Size> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AspectRatioUtil.ASPECT_RATIO_4_3);
        arrayList.add(AspectRatioUtil.ASPECT_RATIO_16_9);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        arrayList.add(rational);
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (AspectRatioUtil.hasMatchingAspectRatio(size, (Rational) obj)) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    @Nullable
    private List<Size> getSizeListByFormat(@Nullable List<Pair<Integer, Size[]>> list, int i10) {
        Size[] sizeArr;
        if (list != null) {
            for (Pair<Integer, Size[]> pair : list) {
                if (((Integer) pair.first).intValue() == i10) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    @Nullable
    public static Rational getTargetAspectRatioRationalValue(int i10, boolean z9) {
        if (i10 == -1) {
            return null;
        }
        if (i10 == 0) {
            return z9 ? AspectRatioUtil.ASPECT_RATIO_4_3 : AspectRatioUtil.ASPECT_RATIO_3_4;
        }
        if (i10 == 1) {
            return z9 ? AspectRatioUtil.ASPECT_RATIO_16_9 : AspectRatioUtil.ASPECT_RATIO_9_16;
        }
        Logger.m725e(TAG, "Undefined target aspect ratio: " + i10);
        return null;
    }

    public static Map<Rational, List<Size>> groupSizesByAspectRatio(@NonNull List<Size> list) {
        HashMap map = new HashMap();
        Iterator<Rational> it = getResolutionListGroupingAspectRatioKeys(list).iterator();
        while (it.hasNext()) {
            map.put(it.next(), new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational : map.keySet()) {
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    @NonNull
    public static List<Size> sortSupportedOutputSizesByResolutionSelector(@NonNull ResolutionSelector resolutionSelector, @NonNull List<Size> list, @Nullable Size size, int i10, @NonNull Rational rational, int i11, int i12) {
        LinkedHashMap<Rational, List<Size>> linkedHashMapApplyAspectRatioStrategy = applyAspectRatioStrategy(list, resolutionSelector.getAspectRatioStrategy(), rational);
        if (size != null) {
            applyMaxResolutionRestriction(linkedHashMapApplyAspectRatioStrategy, size);
        }
        applyResolutionStrategy(linkedHashMapApplyAspectRatioStrategy, resolutionSelector.getResolutionStrategy());
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMapApplyAspectRatioStrategy.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return applyResolutionFilter(arrayList, resolutionSelector.getResolutionFilter(), i10, i11, i12);
    }

    public static void sortSupportedSizesByFallbackRuleClosestHigherThenLower(@NonNull List<Size> list, @NonNull Size size, boolean z9) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z9) {
            list.addAll(arrayList);
        }
    }

    private static void sortSupportedSizesByFallbackRuleClosestLowerThenHigher(@NonNull List<Size> list, @NonNull Size size, boolean z9) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z9) {
            list.addAll(arrayList);
        }
    }

    private static void sortSupportedSizesByFallbackRuleNone(@NonNull List<Size> list, @NonNull Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }

    @NonNull
    public List<Size> getSortedSupportedOutputSizes(@NonNull UseCaseConfig<?> useCaseConfig) {
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfig;
        List<Size> customOrderedResolutions = imageOutputConfig.getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null) {
            return customOrderedResolutions;
        }
        ResolutionSelector resolutionSelector = imageOutputConfig.getResolutionSelector(null);
        List<Size> resolutionCandidateList = getResolutionCandidateList(imageOutputConfig.getSupportedResolutions(null), useCaseConfig.getInputFormat());
        if (resolutionSelector == null) {
            return this.mSupportedOutputSizesSorterLegacy.sortSupportedOutputSizes(resolutionCandidateList, useCaseConfig);
        }
        Size maxResolution = ((ImageOutputConfig) useCaseConfig).getMaxResolution(null);
        int targetRotation = imageOutputConfig.getTargetRotation(0);
        if (!useCaseConfig.isHighResolutionDisabled(false)) {
            resolutionCandidateList = applyHighResolutionSettings(resolutionCandidateList, resolutionSelector, useCaseConfig.getInputFormat());
        }
        return sortSupportedOutputSizesByResolutionSelector(imageOutputConfig.getResolutionSelector(), resolutionCandidateList, maxResolution, targetRotation, this.mFullFovRatio, this.mSensorOrientation, this.mLensFacing);
    }
}
