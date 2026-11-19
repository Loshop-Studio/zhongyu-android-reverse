package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final KeylineState defaultState;
    private final float endShiftRange;
    private final List<KeylineState> endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final List<KeylineState> startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    private KeylineStateList(@NonNull KeylineState keylineState, List<KeylineState> list, List<KeylineState> list2) {
        this.defaultState = keylineState;
        this.startStateSteps = Collections.unmodifiableList(list);
        this.endStateSteps = Collections.unmodifiableList(list2);
        float f10 = list.get(list.size() - 1).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.startShiftRange = f10;
        float f11 = keylineState.getLastKeyline().loc - list2.get(list2.size() - 1).getLastKeyline().loc;
        this.endShiftRange = f11;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(f10, list, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(f11, list2, false);
    }

    private KeylineState closestStateStepFromInterpolation(List<KeylineState> list, float f10, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f10, fArr);
        return stateStepsRange[0] >= 0.5f ? list.get((int) stateStepsRange[2]) : list.get((int) stateStepsRange[1]);
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f10) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f10 == keylineState.getKeylines().get(lastFocalKeylineIndex).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    private static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int i9 = 0; i9 < keylineState.getKeylines().size(); i9++) {
            if (!keylineState.getKeylines().get(i9).isAnchor) {
                return i9;
            }
        }
        return -1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f10) {
        for (int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - 1; firstFocalKeylineIndex >= 0; firstFocalKeylineIndex--) {
            if (f10 == keylineState.getKeylines().get(firstFocalKeylineIndex).mask) {
                return firstFocalKeylineIndex;
            }
        }
        return 0;
    }

    private static int findLastNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int size = keylineState.getKeylines().size() - 1; size >= 0; size--) {
            if (!keylineState.getKeylines().get(size).isAnchor) {
                return size;
            }
        }
        return -1;
    }

    public static KeylineStateList from(Carousel carousel, KeylineState keylineState, float f10, float f11, float f12) {
        return new KeylineStateList(keylineState, getStateStepsStart(carousel, keylineState, f10, f11), getStateStepsEnd(carousel, keylineState, f10, f12));
    }

    private static float[] getStateStepInterpolationPoints(float f10, List<KeylineState> list, boolean z9) {
        int size = list.size();
        float[] fArr = new float[size];
        int i9 = 1;
        while (i9 < size) {
            int i10 = i9 - 1;
            KeylineState keylineState = list.get(i10);
            KeylineState keylineState2 = list.get(i9);
            fArr[i9] = i9 == size + (-1) ? 1.0f : fArr[i10] + ((z9 ? keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc : keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc) / f10);
            i9++;
        }
        return fArr;
    }

    private static List<KeylineState> getStateStepsEnd(Carousel carousel, KeylineState keylineState, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iFindLastNonAnchorKeylineIndex = findLastNonAnchorKeylineIndex(keylineState);
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!isLastFocalItemVisibleAtRightOfContainer(carousel, keylineState) && iFindLastNonAnchorKeylineIndex != -1) {
            int lastFocalKeylineIndex = iFindLastNonAnchorKeylineIndex - keylineState.getLastFocalKeylineIndex();
            float f12 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (lastFocalKeylineIndex <= 0 && keylineState.getLastFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f12 - keylineState.getLastFocalKeyline().cutoff, containerWidth));
                return arrayList;
            }
            int i9 = 0;
            float f13 = 0.0f;
            while (i9 < lastFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i10 = iFindLastNonAnchorKeylineIndex - i9;
                float f14 = f13 + keylineState.getKeylines().get(i10).cutoff;
                int i11 = i10 + 1;
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindLastNonAnchorKeylineIndex, i11 < keylineState.getKeylines().size() ? findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i11).mask) + 1 : 0, f12 - f14, keylineState.getFirstFocalKeylineIndex() + i9 + 1, keylineState.getLastFocalKeylineIndex() + i9 + 1, containerWidth);
                if (i9 == lastFocalKeylineIndex - 1 && f11 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f11, containerWidth, false, f10);
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
                i9++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f11, containerWidth, false, f10));
        }
        return arrayList;
    }

    private static float[] getStateStepsRange(List<KeylineState> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i9 = 1;
        while (i9 < size) {
            float f12 = fArr[i9];
            if (f10 <= f12) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f11, f12, f10), i9 - 1, i9};
            }
            i9++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<KeylineState> getStateStepsStart(Carousel carousel, KeylineState keylineState, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iFindFirstNonAnchorKeylineIndex = findFirstNonAnchorKeylineIndex(keylineState);
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!isFirstFocalItemAtLeftOfContainer(keylineState) && iFindFirstNonAnchorKeylineIndex != -1) {
            int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - iFindFirstNonAnchorKeylineIndex;
            float f12 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (firstFocalKeylineIndex <= 0 && keylineState.getFirstFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f12 + keylineState.getFirstFocalKeyline().cutoff, containerWidth));
                return arrayList;
            }
            int i9 = 0;
            float f13 = 0.0f;
            while (i9 < firstFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i10 = iFindFirstNonAnchorKeylineIndex + i9;
                int size = keylineState.getKeylines().size() - 1;
                float f14 = f13 + keylineState.getKeylines().get(i10).cutoff;
                int i11 = i10 - 1;
                if (i11 >= 0) {
                    size = findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i11).mask) - 1;
                }
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindFirstNonAnchorKeylineIndex, size, f12 + f14, (keylineState.getFirstFocalKeylineIndex() - i9) - 1, (keylineState.getLastFocalKeylineIndex() - i9) - 1, containerWidth);
                if (i9 == firstFocalKeylineIndex - 1 && f11 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f11, containerWidth, true, f10);
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
                i9++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f11, containerWidth, true, f10));
        }
        return arrayList;
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState keylineState) {
        return keylineState.getFirstFocalKeyline().locOffset - (keylineState.getFirstFocalKeyline().maskedItemSize / 2.0f) >= 0.0f && keylineState.getFirstFocalKeyline() == keylineState.getFirstNonAnchorKeyline();
    }

    private static boolean isLastFocalItemVisibleAtRightOfContainer(Carousel carousel, KeylineState keylineState) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        return keylineState.getLastFocalKeyline().locOffset + (keylineState.getLastFocalKeyline().maskedItemSize / 2.0f) <= ((float) containerHeight) && keylineState.getLastFocalKeyline() == keylineState.getLastNonAnchorKeyline();
    }

    private static KeylineState lerp(List<KeylineState> list, float f10, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f10, fArr);
        return KeylineState.lerp(list.get((int) stateStepsRange[1]), list.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i9, int i10, float f10, int i11, int i12, float f11) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i10, (KeylineState.Keyline) arrayList.remove(i9));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f11);
        int i13 = 0;
        while (i13 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i13);
            float f12 = keyline.maskedItemSize;
            builder.addKeyline(f10 + (f12 / 2.0f), keyline.mask, f12, i13 >= i11 && i13 <= i12, keyline.isAnchor, keyline.cutoff);
            f10 += keyline.maskedItemSize;
            i13++;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylineStateForPadding(KeylineState keylineState, float f10, float f11, boolean z9, float f12) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f11);
        float numberOfNonAnchorKeylines = f10 / keylineState.getNumberOfNonAnchorKeylines();
        float f13 = z9 ? f10 : 0.0f;
        int i9 = 0;
        while (i9 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i9);
            if (keyline.isAnchor) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                boolean z10 = i9 >= keylineState.getFirstFocalKeylineIndex() && i9 <= keylineState.getLastFocalKeylineIndex();
                float f14 = keyline.maskedItemSize - numberOfNonAnchorKeylines;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f14, keylineState.getItemSize(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - keyline.locOffset;
                builder.addKeyline(f15, childMaskPercentage, f14, z10, false, keyline.cutoff, z9 ? f16 : 0.0f, z9 ? 0.0f : f16);
                f13 += f14;
            }
            i9++;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f10, float f11) {
        return moveKeylineAndCreateKeylineState(keylineState, 0, 0, f10, keylineState.getFirstFocalKeylineIndex(), keylineState.getLastFocalKeylineIndex(), f11);
    }

    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    public KeylineState getEndState() {
        return this.endStateSteps.get(r0.size() - 1);
    }

    public Map<Integer, KeylineState> getKeylineStateForPositionMap(int i9, int i10, int i11, boolean z9) {
        float itemSize = this.defaultState.getItemSize();
        HashMap map = new HashMap();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= i9) {
                break;
            }
            int i14 = z9 ? (i9 - i12) - 1 : i12;
            if (i14 * itemSize * (z9 ? -1 : 1) > i11 - this.endShiftRange || i12 >= i9 - this.endStateSteps.size()) {
                Integer numValueOf = Integer.valueOf(i14);
                List<KeylineState> list = this.endStateSteps;
                map.put(numValueOf, list.get(MathUtils.clamp(i13, 0, list.size() - 1)));
                i13++;
            }
            i12++;
        }
        int i15 = 0;
        for (int i16 = i9 - 1; i16 >= 0; i16--) {
            int i17 = z9 ? (i9 - i16) - 1 : i16;
            if (i17 * itemSize * (z9 ? -1 : 1) < i10 + this.startShiftRange || i16 < this.startStateSteps.size()) {
                Integer numValueOf2 = Integer.valueOf(i17);
                List<KeylineState> list2 = this.startStateSteps;
                map.put(numValueOf2, list2.get(MathUtils.clamp(i15, 0, list2.size() - 1)));
                i15++;
            }
        }
        return map;
    }

    public KeylineState getShiftedState(float f10, float f11, float f12) {
        return getShiftedState(f10, f11, f12, false);
    }

    public KeylineState getStartState() {
        return this.startStateSteps.get(r0.size() - 1);
    }

    public KeylineState getShiftedState(float f10, float f11, float f12, boolean z9) {
        float fLerp;
        List<KeylineState> list;
        float[] fArr;
        float f13 = this.startShiftRange + f11;
        float f14 = f12 - this.endShiftRange;
        float f15 = getStartState().getFirstFocalKeyline().leftOrTopPaddingShift;
        float f16 = getEndState().getLastFocalKeyline().rightOrBottomPaddingShift;
        if (this.startShiftRange == f15) {
            f13 += f15;
        }
        if (this.endShiftRange == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fLerp = AnimationUtils.lerp(1.0f, 0.0f, f11, f13, f10);
            list = this.startStateSteps;
            fArr = this.startStateStepsInterpolationPoints;
        } else {
            if (f10 <= f14) {
                return this.defaultState;
            }
            fLerp = AnimationUtils.lerp(0.0f, 1.0f, f14, f12, f10);
            list = this.endStateSteps;
            fArr = this.endStateStepsInterpolationPoints;
        }
        return z9 ? closestStateStepFromInterpolation(list, fLerp, fArr) : lerp(list, fLerp, fArr);
    }
}
