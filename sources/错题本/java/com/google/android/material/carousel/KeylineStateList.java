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

/* loaded from: classes2.dex */
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
        float f = list.get(list.size() - 1).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.startShiftRange = f;
        float f7 = keylineState.getLastKeyline().loc - list2.get(list2.size() - 1).getLastKeyline().loc;
        this.endShiftRange = f7;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(f, list, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(f7, list2, false);
    }

    private KeylineState closestStateStepFromInterpolation(List<KeylineState> list, float f, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f, fArr);
        return stateStepsRange[0] >= 0.5f ? list.get((int) stateStepsRange[2]) : list.get((int) stateStepsRange[1]);
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f == keylineState.getKeylines().get(lastFocalKeylineIndex).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    private static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int i = 0; i < keylineState.getKeylines().size(); i++) {
            if (!keylineState.getKeylines().get(i).isAnchor) {
                return i;
            }
        }
        return -1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f) {
        for (int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - 1; firstFocalKeylineIndex >= 0; firstFocalKeylineIndex--) {
            if (f == keylineState.getKeylines().get(firstFocalKeylineIndex).mask) {
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

    public static KeylineStateList from(Carousel carousel, KeylineState keylineState, float f, float f7, float f8) {
        return new KeylineStateList(keylineState, getStateStepsStart(carousel, keylineState, f, f7), getStateStepsEnd(carousel, keylineState, f, f8));
    }

    private static float[] getStateStepInterpolationPoints(float f, List<KeylineState> list, boolean z8) {
        int size = list.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i8 = i - 1;
            KeylineState keylineState = list.get(i8);
            KeylineState keylineState2 = list.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i8] + ((z8 ? keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc : keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc) / f);
            i++;
        }
        return fArr;
    }

    private static List<KeylineState> getStateStepsEnd(Carousel carousel, KeylineState keylineState, float f, float f7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iFindLastNonAnchorKeylineIndex = findLastNonAnchorKeylineIndex(keylineState);
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!isLastFocalItemVisibleAtRightOfContainer(carousel, keylineState) && iFindLastNonAnchorKeylineIndex != -1) {
            int lastFocalKeylineIndex = iFindLastNonAnchorKeylineIndex - keylineState.getLastFocalKeylineIndex();
            float f8 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (lastFocalKeylineIndex <= 0 && keylineState.getLastFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f8 - keylineState.getLastFocalKeyline().cutoff, containerWidth));
                return arrayList;
            }
            int i = 0;
            float f9 = 0.0f;
            while (i < lastFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i8 = iFindLastNonAnchorKeylineIndex - i;
                float f10 = f9 + keylineState.getKeylines().get(i8).cutoff;
                int i9 = i8 + 1;
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindLastNonAnchorKeylineIndex, i9 < keylineState.getKeylines().size() ? findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i9).mask) + 1 : 0, f8 - f10, keylineState.getFirstFocalKeylineIndex() + i + 1, keylineState.getLastFocalKeylineIndex() + i + 1, containerWidth);
                if (i == lastFocalKeylineIndex - 1 && f7 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f7, containerWidth, false, f);
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
                i++;
                f9 = f10;
            }
        } else if (f7 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f7, containerWidth, false, f));
        }
        return arrayList;
    }

    private static float[] getStateStepsRange(List<KeylineState> list, float f, float[] fArr) {
        int size = list.size();
        float f7 = fArr[0];
        int i = 1;
        while (i < size) {
            float f8 = fArr[i];
            if (f <= f8) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f7, f8, f), i - 1, i};
            }
            i++;
            f7 = f8;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<KeylineState> getStateStepsStart(Carousel carousel, KeylineState keylineState, float f, float f7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int iFindFirstNonAnchorKeylineIndex = findFirstNonAnchorKeylineIndex(keylineState);
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!isFirstFocalItemAtLeftOfContainer(keylineState) && iFindFirstNonAnchorKeylineIndex != -1) {
            int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - iFindFirstNonAnchorKeylineIndex;
            float f8 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (firstFocalKeylineIndex <= 0 && keylineState.getFirstFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f8 + keylineState.getFirstFocalKeyline().cutoff, containerWidth));
                return arrayList;
            }
            int i = 0;
            float f9 = 0.0f;
            while (i < firstFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i8 = iFindFirstNonAnchorKeylineIndex + i;
                int size = keylineState.getKeylines().size() - 1;
                float f10 = f9 + keylineState.getKeylines().get(i8).cutoff;
                int i9 = i8 - 1;
                if (i9 >= 0) {
                    size = findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i9).mask) - 1;
                }
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindFirstNonAnchorKeylineIndex, size, f8 + f10, (keylineState.getFirstFocalKeylineIndex() - i) - 1, (keylineState.getLastFocalKeylineIndex() - i) - 1, containerWidth);
                if (i == firstFocalKeylineIndex - 1 && f7 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f7, containerWidth, true, f);
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
                i++;
                f9 = f10;
            }
        } else if (f7 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f7, containerWidth, true, f));
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
        return (keylineState.getLastFocalKeyline().maskedItemSize / 2.0f) + keylineState.getLastFocalKeyline().locOffset <= ((float) containerHeight) && keylineState.getLastFocalKeyline() == keylineState.getLastNonAnchorKeyline();
    }

    private static KeylineState lerp(List<KeylineState> list, float f, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f, fArr);
        return KeylineState.lerp(list.get((int) stateStepsRange[1]), list.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i, int i8, float f, int i9, int i10, float f7) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i8, (KeylineState.Keyline) arrayList.remove(i));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f7);
        int i11 = 0;
        while (i11 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i11);
            float f8 = keyline.maskedItemSize;
            builder.addKeyline((f8 / 2.0f) + f, keyline.mask, f8, i11 >= i9 && i11 <= i10, keyline.isAnchor, keyline.cutoff);
            f += keyline.maskedItemSize;
            i11++;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylineStateForPadding(KeylineState keylineState, float f, float f7, boolean z8, float f8) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f7);
        float numberOfNonAnchorKeylines = f / keylineState.getNumberOfNonAnchorKeylines();
        float f9 = z8 ? f : 0.0f;
        int i = 0;
        while (i < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i);
            if (keyline.isAnchor) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                boolean z9 = i >= keylineState.getFirstFocalKeylineIndex() && i <= keylineState.getLastFocalKeylineIndex();
                float f10 = keyline.maskedItemSize - numberOfNonAnchorKeylines;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f10, keylineState.getItemSize(), f8);
                float f11 = (f10 / 2.0f) + f9;
                float f12 = f11 - keyline.locOffset;
                builder.addKeyline(f11, childMaskPercentage, f10, z9, false, keyline.cutoff, z8 ? f12 : 0.0f, z8 ? 0.0f : f12);
                f9 += f10;
            }
            i++;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f, float f7) {
        return moveKeylineAndCreateKeylineState(keylineState, 0, 0, f, keylineState.getFirstFocalKeylineIndex(), keylineState.getLastFocalKeylineIndex(), f7);
    }

    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    public KeylineState getEndState() {
        return this.endStateSteps.get(r0.size() - 1);
    }

    public Map<Integer, KeylineState> getKeylineStateForPositionMap(int i, int i8, int i9, boolean z8) {
        float itemSize = this.defaultState.getItemSize();
        HashMap map = new HashMap();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= i) {
                break;
            }
            int i12 = z8 ? (i - i10) - 1 : i10;
            if (i12 * itemSize * (z8 ? -1 : 1) > i9 - this.endShiftRange || i10 >= i - this.endStateSteps.size()) {
                Integer numValueOf = Integer.valueOf(i12);
                List<KeylineState> list = this.endStateSteps;
                map.put(numValueOf, list.get(MathUtils.clamp(i11, 0, list.size() - 1)));
                i11++;
            }
            i10++;
        }
        int i13 = 0;
        for (int i14 = i - 1; i14 >= 0; i14--) {
            int i15 = z8 ? (i - i14) - 1 : i14;
            if (i15 * itemSize * (z8 ? -1 : 1) < i8 + this.startShiftRange || i14 < this.startStateSteps.size()) {
                Integer numValueOf2 = Integer.valueOf(i15);
                List<KeylineState> list2 = this.startStateSteps;
                map.put(numValueOf2, list2.get(MathUtils.clamp(i13, 0, list2.size() - 1)));
                i13++;
            }
        }
        return map;
    }

    public KeylineState getShiftedState(float f, float f7, float f8) {
        return getShiftedState(f, f7, f8, false);
    }

    public KeylineState getStartState() {
        return this.startStateSteps.get(r0.size() - 1);
    }

    public KeylineState getShiftedState(float f, float f7, float f8, boolean z8) {
        float fLerp;
        List<KeylineState> list;
        float[] fArr;
        float f9 = this.startShiftRange + f7;
        float f10 = f8 - this.endShiftRange;
        float f11 = getStartState().getFirstFocalKeyline().leftOrTopPaddingShift;
        float f12 = getEndState().getLastFocalKeyline().rightOrBottomPaddingShift;
        if (this.startShiftRange == f11) {
            f9 += f11;
        }
        if (this.endShiftRange == f12) {
            f10 -= f12;
        }
        if (f < f9) {
            fLerp = AnimationUtils.lerp(1.0f, 0.0f, f7, f9, f);
            list = this.startStateSteps;
            fArr = this.startStateStepsInterpolationPoints;
        } else {
            if (f <= f10) {
                return this.defaultState;
            }
            fLerp = AnimationUtils.lerp(0.0f, 1.0f, f10, f8, f);
            list = this.endStateSteps;
            fArr = this.endStateStepsInterpolationPoints;
        }
        return z8 ? closestStateStepFromInterpolation(list, fLerp, fArr) : lerp(list, fLerp, fArr);
    }
}
