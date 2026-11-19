package androidx.camera.core.internal;

import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class SupportedOutputSizesSorterLegacy {
    private static final String TAG = "SupportedOutputSizesCollector";
    private final Rational mFullFovRatio;
    private final boolean mIsSensorLandscapeResolution;
    private final int mLensFacing;
    private final int mSensorOrientation;

    public SupportedOutputSizesSorterLegacy(@NonNull CameraInfoInternal cameraInfoInternal, @Nullable Rational rational) {
        this.mSensorOrientation = cameraInfoInternal.getSensorRotationDegrees();
        this.mLensFacing = cameraInfoInternal.getLensFacing();
        this.mFullFovRatio = rational;
        boolean z9 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z9 = false;
        }
        this.mIsSensorLandscapeResolution = z9;
    }

    @Nullable
    private static Size flipSizeByRotation(@Nullable Size size, int i9, int i10, int i11) {
        return (size == null || !isRotationNeeded(i9, i10, i11)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    @Nullable
    private static Rational getAspectRatioGroupKeyOfTargetSize(@Nullable Size size, @NonNull List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : SupportedOutputSizesSorter.getResolutionListGroupingAspectRatioKeys(list)) {
            if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational getTargetAspectRatioByLegacyApi(@NonNull ImageOutputConfig imageOutputConfig, @NonNull List<Size> list) {
        if (imageOutputConfig.hasTargetAspectRatio()) {
            return SupportedOutputSizesSorter.getTargetAspectRatioRationalValue(imageOutputConfig.getTargetAspectRatio(), this.mIsSensorLandscapeResolution);
        }
        Size targetSize = getTargetSize(imageOutputConfig);
        if (targetSize != null) {
            return getAspectRatioGroupKeyOfTargetSize(targetSize, list);
        }
        return null;
    }

    @Nullable
    private Size getTargetSize(@NonNull ImageOutputConfig imageOutputConfig) {
        return flipSizeByRotation(imageOutputConfig.getTargetResolution(null), imageOutputConfig.getTargetRotation(0), this.mLensFacing, this.mSensorOrientation);
    }

    private static boolean isRotationNeeded(int i9, int i10, int i11) {
        int relativeImageRotation = CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(i9), i11, 1 == i10);
        return relativeImageRotation == 90 || relativeImageRotation == 270;
    }

    @NonNull
    public List<Size> sortSupportedOutputSizes(@NonNull List<Size> list, @NonNull UseCaseConfig<?> useCaseConfig) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new CompareSizesByArea(true));
        ArrayList arrayList2 = new ArrayList();
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfig;
        Size maxResolution = imageOutputConfig.getMaxResolution(null);
        int i9 = 0;
        Size size = (Size) arrayList.get(0);
        if (maxResolution == null || SizeUtil.getArea(size) < SizeUtil.getArea(maxResolution)) {
            maxResolution = size;
        }
        Size targetSize = getTargetSize(imageOutputConfig);
        Size size2 = SizeUtil.RESOLUTION_VGA;
        int area = SizeUtil.getArea(size2);
        if (SizeUtil.getArea(maxResolution) < area) {
            size2 = SizeUtil.RESOLUTION_ZERO;
        } else if (targetSize != null && SizeUtil.getArea(targetSize) < area) {
            size2 = targetSize;
        }
        int size3 = arrayList.size();
        int i10 = 0;
        while (i10 < size3) {
            Object obj = arrayList.get(i10);
            i10++;
            Size size4 = (Size) obj;
            if (SizeUtil.getArea(size4) <= SizeUtil.getArea(maxResolution) && SizeUtil.getArea(size4) >= SizeUtil.getArea(size2) && !arrayList2.contains(size4)) {
                arrayList2.add(size4);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + maxResolution + "\ninitial size list: " + arrayList);
        }
        Rational targetAspectRatioByLegacyApi = getTargetAspectRatioByLegacyApi(imageOutputConfig, arrayList2);
        if (targetSize == null) {
            targetSize = imageOutputConfig.getDefaultResolution(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (targetAspectRatioByLegacyApi == null) {
            arrayList3.addAll(arrayList2);
            if (targetSize != null) {
                SupportedOutputSizesSorter.sortSupportedSizesByFallbackRuleClosestHigherThenLower(arrayList3, targetSize, true);
                return arrayList3;
            }
        } else {
            Map<Rational, List<Size>> mapGroupSizesByAspectRatio = SupportedOutputSizesSorter.groupSizesByAspectRatio(arrayList2);
            if (targetSize != null) {
                Iterator<Rational> it = mapGroupSizesByAspectRatio.keySet().iterator();
                while (it.hasNext()) {
                    SupportedOutputSizesSorter.sortSupportedSizesByFallbackRuleClosestHigherThenLower(mapGroupSizesByAspectRatio.get(it.next()), targetSize, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(mapGroupSizesByAspectRatio.keySet());
            Collections.sort(arrayList4, new AspectRatioUtil.CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace(targetAspectRatioByLegacyApi, this.mFullFovRatio));
            int size5 = arrayList4.size();
            while (i9 < size5) {
                Object obj2 = arrayList4.get(i9);
                i9++;
                for (Size size6 : mapGroupSizesByAspectRatio.get((Rational) obj2)) {
                    if (!arrayList3.contains(size6)) {
                        arrayList3.add(size6);
                    }
                }
            }
        }
        return arrayList3;
    }
}
