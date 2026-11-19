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
        float f6 = list.get(list.size() - 1).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.startShiftRange = f6;
        float f7 = keylineState.getLastKeyline().loc - list2.get(list2.size() - 1).getLastKeyline().loc;
        this.endShiftRange = f7;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(f6, list, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(f7, list2, false);
    }

    private KeylineState closestStateStepFromInterpolation(List<KeylineState> list, float f6, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f6, fArr);
        return stateStepsRange[0] >= 0.5f ? list.get((int) stateStepsRange[2]) : list.get((int) stateStepsRange[1]);
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f6) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f6 == keylineState.getKeylines().get(lastFocalKeylineIndex).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    private static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int i6 = 0; i6 < keylineState.getKeylines().size(); i6++) {
            if (!keylineState.getKeylines().get(i6).isAnchor) {
                return i6;
            }
        }
        return -1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f6) {
        for (int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - 1; firstFocalKeylineIndex >= 0; firstFocalKeylineIndex--) {
            if (f6 == keylineState.getKeylines().get(firstFocalKeylineIndex).mask) {
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

    public static KeylineStateList from(Carousel carousel, KeylineState keylineState, float f6, float f7, float f8) {
        return new KeylineStateList(keylineState, getStateStepsStart(carousel, keylineState, f6, f7), getStateStepsEnd(carousel, keylineState, f6, f8));
    }

    private static float[] getStateStepInterpolationPoints(float f6, List<KeylineState> list, boolean z6) {
        int size = list.size();
        float[] fArr = new float[size];
        int i6 = 1;
        while (i6 < size) {
            int i7 = i6 - 1;
            KeylineState keylineState = list.get(i7);
            KeylineState keylineState2 = list.get(i6);
            fArr[i6] = i6 == size + (-1) ? 1.0f : fArr[i7] + ((z6 ? keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc : keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc) / f6);
            i6++;
        }
        return fArr;
    }

    private static List<KeylineState> getStateStepsEnd(Carousel carousel, KeylineState keylineState, float f6, float f7) {
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
            int i6 = 0;
            float f9 = 0.0f;
            while (i6 < lastFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i7 = iFindLastNonAnchorKeylineIndex - i6;
                float f10 = f9 + keylineState.getKeylines().get(i7).cutoff;
                int i8 = i7 + 1;
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindLastNonAnchorKeylineIndex, i8 < keylineState.getKeylines().size() ? findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i8).mask) + 1 : 0, f8 - f10, keylineState.getFirstFocalKeylineIndex() + i6 + 1, keylineState.getLastFocalKeylineIndex() + i6 + 1, containerWidth);
                if (i6 == lastFocalKeylineIndex - 1 && f7 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f7, containerWidth, false, f6);
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
                i6++;
                f9 = f10;
            }
        } else if (f7 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f7, containerWidth, false, f6));
        }
        return arrayList;
    }

    private static float[] getStateStepsRange(List<KeylineState> list, float f6, float[] fArr) {
        int size = list.size();
        float f7 = fArr[0];
        int i6 = 1;
        while (i6 < size) {
            float f8 = fArr[i6];
            if (f6 <= f8) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f7, f8, f6), i6 - 1, i6};
            }
            i6++;
            f7 = f8;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<KeylineState> getStateStepsStart(Carousel carousel, KeylineState keylineState, float f6, float f7) {
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
            int i6 = 0;
            float f9 = 0.0f;
            while (i6 < firstFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i7 = iFindFirstNonAnchorKeylineIndex + i6;
                int size = keylineState.getKeylines().size() - 1;
                float f10 = f9 + keylineState.getKeylines().get(i7).cutoff;
                int i8 = i7 - 1;
                if (i8 >= 0) {
                    size = findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i8).mask) - 1;
                }
                KeylineState keylineStateMoveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, iFindFirstNonAnchorKeylineIndex, size, f8 + f10, (keylineState.getFirstFocalKeylineIndex() - i6) - 1, (keylineState.getLastFocalKeylineIndex() - i6) - 1, containerWidth);
                if (i6 == firstFocalKeylineIndex - 1 && f7 > 0.0f) {
                    keylineStateMoveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(keylineStateMoveKeylineAndCreateKeylineState, f7, containerWidth, true, f6);
                }
                arrayList.add(keylineStateMoveKeylineAndCreateKeylineState);
                i6++;
                f9 = f10;
            }
        } else if (f7 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f7, containerWidth, true, f6));
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

    private static KeylineState lerp(List<KeylineState> list, float f6, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f6, fArr);
        return KeylineState.lerp(list.get((int) stateStepsRange[1]), list.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i6, int i7, float f6, int i8, int i9, float f7) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i7, (KeylineState.Keyline) arrayList.remove(i6));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f7);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i10);
            float f8 = keyline.maskedItemSize;
            builder.addKeyline(f6 + (f8 / 2.0f), keyline.mask, f8, i10 >= i8 && i10 <= i9, keyline.isAnchor, keyline.cutoff);
            f6 += keyline.maskedItemSize;
            i10++;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylineStateForPadding(KeylineState keylineState, float f6, float f7, boolean z6, float f8) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f7);
        float numberOfNonAnchorKeylines = f6 / keylineState.getNumberOfNonAnchorKeylines();
        float f9 = z6 ? f6 : 0.0f;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i6);
            if (keyline.isAnchor) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                boolean z7 = i6 >= keylineState.getFirstFocalKeylineIndex() && i6 <= keylineState.getLastFocalKeylineIndex();
                float f10 = keyline.maskedItemSize - numberOfNonAnchorKeylines;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f10, keylineState.getItemSize(), f8);
                float f11 = (f10 / 2.0f) + f9;
                float f12 = f11 - keyline.locOffset;
                builder.addKeyline(f11, childMaskPercentage, f10, z7, false, keyline.cutoff, z6 ? f12 : 0.0f, z6 ? 0.0f : f12);
                f9 += f10;
            }
            i6++;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f6, float f7) {
        return moveKeylineAndCreateKeylineState(keylineState, 0, 0, f6, keylineState.getFirstFocalKeylineIndex(), keylineState.getLastFocalKeylineIndex(), f7);
    }

    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    public KeylineState getEndState() {
        return this.endStateSteps.get(r0.size() - 1);
    }

    public Map<Integer, KeylineState> getKeylineStateForPositionMap(int i6, int i7, int i8, boolean z6) {
        float itemSize = this.defaultState.getItemSize();
        HashMap map = new HashMap();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= i6) {
                break;
            }
            int i11 = z6 ? (i6 - i9) - 1 : i9;
            if (i11 * itemSize * (z6 ? -1 : 1) > i8 - this.endShiftRange || i9 >= i6 - this.endStateSteps.size()) {
                Integer numValueOf = Integer.valueOf(i11);
                List<KeylineState> list = this.endStateSteps;
                map.put(numValueOf, list.get(MathUtils.clamp(i10, 0, list.size() - 1)));
                i10++;
            }
            i9++;
        }
        int i12 = 0;
        for (int i13 = i6 - 1; i13 >= 0; i13--) {
            int i14 = z6 ? (i6 - i13) - 1 : i13;
            if (i14 * itemSize * (z6 ? -1 : 1) < i7 + this.startShiftRange || i13 < this.startStateSteps.size()) {
                Integer numValueOf2 = Integer.valueOf(i14);
                List<KeylineState> list2 = this.startStateSteps;
                map.put(numValueOf2, list2.get(MathUtils.clamp(i12, 0, list2.size() - 1)));
                i12++;
            }
        }
        return map;
    }

    public KeylineState getShiftedState(float f6, float f7, float f8) {
        return getShiftedState(f6, f7, f8, false);
    }

    public KeylineState getStartState() {
        return this.startStateSteps.get(r0.size() - 1);
    }

    public KeylineState getShiftedState(float f6, float f7, float f8, boolean z6) {
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
        if (f6 < f9) {
            fLerp = AnimationUtils.lerp(1.0f, 0.0f, f7, f9, f6);
            list = this.startStateSteps;
            fArr = this.startStateStepsInterpolationPoints;
        } else {
            if (f6 <= f10) {
                return this.defaultState;
            }
            fLerp = AnimationUtils.lerp(0.0f, 1.0f, f10, f8, f6);
            list = this.endStateSteps;
            fArr = this.endStateStepsInterpolationPoints;
        }
        return z6 ? closestStateStepFromInterpolation(list, fLerp, fArr) : lerp(list, fLerp, fArr);
    }
}
