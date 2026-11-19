package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.core.view.C0358u;
import androidx.customview.widget.AbstractC0382a;
import com.google.android.material.C1371R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p016c0.C1050c;
import p073d.C2443a;
import p156u.C3403a;
import p164w.C3425a;

/* loaded from: classes.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final double THRESHOLD = 1.0E-4d;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    private static final String WARNING_FLOATING_POINT_ERRROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.";
    private BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;
    private final AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;
    private final Paint activeTicksPaint;
    private final Paint activeTrackPaint;
    private final List<L> changeListeners;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;
    private ColorStateList haloColor;
    private final Paint haloPaint;
    private int haloRadius;
    private final Paint inactiveTicksPaint;
    private final Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    private final TooltipDrawableFactory labelMaker;
    private int labelPadding;
    private final List<TooltipDrawable> labels;
    private MotionEvent lastEvent;
    private final int scaledTouchSlop;
    private float stepSize;
    private final MaterialShapeDrawable thumbDrawable;
    private boolean thumbIsPressed;
    private final Paint thumbPaint;
    private int thumbRadius;
    private ColorStateList tickColorActive;
    private ColorStateList tickColorInactive;
    private float[] ticksCoordinates;
    private float touchDownX;
    private final List<T> touchListeners;
    private float touchPosition;
    private ColorStateList trackColorActive;
    private ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackSidePadding;
    private int trackTop;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetHeight;
    private static final String TAG = BaseSlider.class.getSimpleName();
    private static final int DEF_STYLE_RES = C1371R.style.Widget_MaterialComponents_Slider;

    private class AccessibilityEventSender implements Runnable {
        int virtualViewId;

        private AccessibilityEventSender() {
            this.virtualViewId = -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.accessibilityHelper.sendEventForVirtualView(this.virtualViewId, 4);
        }

        void setVirtualViewId(int i4) {
            this.virtualViewId = i4;
        }
    }

    private static class AccessibilityHelper extends AbstractC0382a {
        private final BaseSlider<?, ?, ?> slider;
        Rect virtualViewBounds;

        AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.virtualViewBounds = new Rect();
            this.slider = baseSlider;
        }

        private String startOrEndDescription(int i4) {
            return i4 == this.slider.getValues().size() + (-1) ? this.slider.getContext().getString(C1371R.string.material_slider_range_end) : i4 == 0 ? this.slider.getContext().getString(C1371R.string.material_slider_range_start) : "";
        }

        @Override // androidx.customview.widget.AbstractC0382a
        protected int getVirtualViewAt(float f4, float f5) {
            for (int i4 = 0; i4 < this.slider.getValues().size(); i4++) {
                this.slider.updateBoundsForVirturalViewId(i4, this.virtualViewBounds);
                if (this.virtualViewBounds.contains((int) f4, (int) f5)) {
                    return i4;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.AbstractC0382a
        protected void getVisibleVirtualViews(List<Integer> list) {
            for (int i4 = 0; i4 < this.slider.getValues().size(); i4++) {
                list.add(Integer.valueOf(i4));
            }
        }

        @Override // androidx.customview.widget.AbstractC0382a
        protected boolean onPerformActionForVirtualView(int i4, int i5, Bundle bundle) {
            if (!this.slider.isEnabled()) {
                return false;
            }
            if (i5 != 4096 && i5 != 8192) {
                if (i5 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.slider.snapThumbToValue(i4, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.slider.updateHaloHotspot();
                        this.slider.postInvalidate();
                        invalidateVirtualView(i4);
                        return true;
                    }
                }
                return false;
            }
            float fCalculateStepIncrement = this.slider.calculateStepIncrement(20);
            if (i5 == 8192) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            if (this.slider.isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            if (!this.slider.snapThumbToValue(i4, C3425a.m10442a(this.slider.getValues().get(i4).floatValue() + fCalculateStepIncrement, this.slider.getValueFrom(), this.slider.getValueTo()))) {
                return false;
            }
            this.slider.updateHaloHotspot();
            this.slider.postInvalidate();
            invalidateVirtualView(i4);
            return true;
        }

        @Override // androidx.customview.widget.AbstractC0382a
        protected void onPopulateNodeForVirtualView(int i4, C1050c c1050c) {
            c1050c.m4876b(C1050c.a.f6201L);
            List<Float> values = this.slider.getValues();
            float fFloatValue = values.get(i4).floatValue();
            float valueFrom = this.slider.getValueFrom();
            float valueTo = this.slider.getValueTo();
            if (this.slider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    c1050c.m4874a(8192);
                }
                if (fFloatValue < valueTo) {
                    c1050c.m4874a(4096);
                }
            }
            c1050c.m4910v0(C1050c.d.m4924a(1, valueFrom, valueTo, fFloatValue));
            c1050c.m4879c0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.slider.getContentDescription() != null) {
                sb.append(this.slider.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(startOrEndDescription(i4));
                sb.append(this.slider.formatValue(fFloatValue));
            }
            c1050c.m4885g0(sb.toString());
            this.slider.updateBoundsForVirturalViewId(i4, this.virtualViewBounds);
            c1050c.m4871X(this.virtualViewBounds);
        }
    }

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SliderState[] newArray(int i4) {
                return new SliderState[i4];
            }
        };
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        ArrayList<Float> values;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }
    }

    private interface TooltipDrawableFactory {
        TooltipDrawable createTooltipDrawable();
    }

    public BaseSlider(Context context) {
        this(context, null);
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    private Float calculateIncrementForKey(int i4) {
        float fCalculateStepIncrement = this.isLongPress ? calculateStepIncrement(20) : calculateStepIncrement();
        if (i4 == 21) {
            if (!isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            return Float.valueOf(fCalculateStepIncrement);
        }
        if (i4 == 22) {
            if (isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            return Float.valueOf(fCalculateStepIncrement);
        }
        if (i4 == 69) {
            return Float.valueOf(-fCalculateStepIncrement);
        }
        if (i4 == 70 || i4 == 81) {
            return Float.valueOf(fCalculateStepIncrement);
        }
        return null;
    }

    private float calculateStepIncrement() {
        float f4 = this.stepSize;
        if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
            return 1.0f;
        }
        return f4;
    }

    private void calculateTicksCoordinates() {
        validateConfigurationIfDirty();
        int iMin = Math.min((int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f), (this.trackWidth / (this.trackHeight * 2)) + 1);
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length != iMin * 2) {
            this.ticksCoordinates = new float[iMin * 2];
        }
        float f4 = this.trackWidth / (iMin - 1);
        for (int i4 = 0; i4 < iMin * 2; i4 += 2) {
            float[] fArr2 = this.ticksCoordinates;
            fArr2[i4] = this.trackSidePadding + ((i4 / 2) * f4);
            fArr2[i4 + 1] = calculateTop();
        }
    }

    private int calculateTop() {
        return this.trackTop + (this.labelBehavior == 1 ? this.labels.get(0).getIntrinsicHeight() : 0);
    }

    private void createLabelPool() {
        if (this.labels.size() > this.values.size()) {
            List<TooltipDrawable> listSubList = this.labels.subList(this.values.size(), this.labels.size());
            for (TooltipDrawable tooltipDrawable : listSubList) {
                if (C0358u.m2012U(this)) {
                    detachLabelFromContentView(tooltipDrawable);
                }
            }
            listSubList.clear();
        }
        while (this.labels.size() < this.values.size()) {
            TooltipDrawable tooltipDrawableCreateTooltipDrawable = this.labelMaker.createTooltipDrawable();
            this.labels.add(tooltipDrawableCreateTooltipDrawable);
            if (C0358u.m2012U(this)) {
                attachLabelToContentView(tooltipDrawableCreateTooltipDrawable);
            }
        }
        int i4 = this.labels.size() == 1 ? 0 : 1;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setStrokeWidth(i4);
        }
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        ViewOverlayImpl contentViewOverlay = ViewUtils.getContentViewOverlay(this);
        if (contentViewOverlay != null) {
            contentViewOverlay.remove(tooltipDrawable);
            tooltipDrawable.detachView(ViewUtils.getContentView(this));
        }
    }

    private void dispatchOnChangedFromUser(int i4) {
        Iterator<L> it = this.changeListeners.iterator();
        while (it.hasNext()) {
            it.next().onValueChange(this, this.values.get(i4).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        scheduleAccessibilityEventSender(i4);
    }

    private void dispatchOnChangedProgramatically() {
        for (L l3 : this.changeListeners) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                l3.onValueChange(this, it.next().floatValue(), false);
            }
        }
    }

    private void drawActiveTrack(Canvas canvas, int i4, int i5) {
        float[] activeRange = getActiveRange();
        int i6 = this.trackSidePadding;
        float f4 = i4;
        float f5 = i5;
        canvas.drawLine(i6 + (activeRange[0] * f4), f5, i6 + (activeRange[1] * f4), f5, this.activeTrackPaint);
    }

    private void drawInactiveTrack(Canvas canvas, int i4, int i5) {
        float[] activeRange = getActiveRange();
        float f4 = i4;
        float f5 = this.trackSidePadding + (activeRange[1] * f4);
        if (f5 < r1 + i4) {
            float f6 = i5;
            canvas.drawLine(f5, f6, r1 + i4, f6, this.inactiveTrackPaint);
        }
        int i6 = this.trackSidePadding;
        float f7 = i6 + (activeRange[0] * f4);
        if (f7 > i6) {
            float f8 = i5;
            canvas.drawLine(i6, f8, f7, f8, this.inactiveTrackPaint);
        }
    }

    private void drawThumbs(Canvas canvas, int i4, int i5) {
        if (!isEnabled()) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(this.trackSidePadding + (normalizeValue(it.next().floatValue()) * i4), i5, this.thumbRadius, this.thumbPaint);
            }
        }
        Iterator<Float> it2 = this.values.iterator();
        while (it2.hasNext()) {
            Float next = it2.next();
            canvas.save();
            int iNormalizeValue = this.trackSidePadding + ((int) (normalizeValue(next.floatValue()) * i4));
            int i6 = this.thumbRadius;
            canvas.translate(iNormalizeValue - i6, i5 - i6);
            this.thumbDrawable.draw(canvas);
            canvas.restore();
        }
    }

    private void drawTicks(Canvas canvas) {
        float[] activeRange = getActiveRange();
        int iPivotIndex = pivotIndex(this.ticksCoordinates, activeRange[0]);
        int iPivotIndex2 = pivotIndex(this.ticksCoordinates, activeRange[1]);
        int i4 = iPivotIndex * 2;
        canvas.drawPoints(this.ticksCoordinates, 0, i4, this.inactiveTicksPaint);
        int i5 = iPivotIndex2 * 2;
        canvas.drawPoints(this.ticksCoordinates, i4, i5 - i4, this.activeTicksPaint);
        float[] fArr = this.ticksCoordinates;
        canvas.drawPoints(fArr, i5, fArr.length - i5, this.inactiveTicksPaint);
    }

    private void ensureLabels() {
        if (this.labelBehavior == 2) {
            return;
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        for (int i4 = 0; i4 < this.values.size() && it.hasNext(); i4++) {
            if (i4 != this.focusedThumbIdx) {
                setValueForLabel(it.next(), this.values.get(i4).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.labels.size()), Integer.valueOf(this.values.size())));
        }
        setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
    }

    private void focusThumbOnFocusGained(int i4) {
        if (i4 == 1) {
            moveFocus(Integer.MAX_VALUE);
            return;
        }
        if (i4 == 2) {
            moveFocus(Integer.MIN_VALUE);
        } else if (i4 == 17) {
            moveFocusInAbsoluteDirection(Integer.MAX_VALUE);
        } else {
            if (i4 != 66) {
                return;
            }
            moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatValue(float f4) {
        if (hasLabelFormatter()) {
            return this.formatter.getFormattedValue(f4);
        }
        return String.format(((float) ((int) f4)) == f4 ? "%.0f" : "%.2f", Float.valueOf(f4));
    }

    private float[] getActiveRange() {
        float fFloatValue = ((Float) Collections.max(getValues())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.values.size() == 1) {
            fFloatValue2 = this.valueFrom;
        }
        float fNormalizeValue = normalizeValue(fFloatValue2);
        float fNormalizeValue2 = normalizeValue(fFloatValue);
        return isRtl() ? new float[]{fNormalizeValue2, fNormalizeValue} : new float[]{fNormalizeValue, fNormalizeValue2};
    }

    private float getClampedValue(int i4, float f4) {
        int i5 = i4 + 1;
        int i6 = i4 - 1;
        return C3425a.m10442a(f4, i6 < 0 ? this.valueFrom : this.values.get(i6).floatValue(), i5 >= this.values.size() ? this.valueTo : this.values.get(i5).floatValue());
    }

    private int getColorForState(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private float getValueOfTouchPosition() {
        double dSnapPosition = snapPosition(this.touchPosition);
        if (isRtl()) {
            dSnapPosition = 1.0d - dSnapPosition;
        }
        float f4 = this.valueTo;
        return (float) ((dSnapPosition * (f4 - r3)) + this.valueFrom);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f4 = this.touchPosition;
        if (isRtl()) {
            f4 = 1.0f - f4;
        }
        float f5 = this.valueTo;
        float f6 = this.valueFrom;
        return (f4 * (f5 - f6)) + f6;
    }

    private void invalidateTrack() {
        this.inactiveTrackPaint.setStrokeWidth(this.trackHeight);
        this.activeTrackPaint.setStrokeWidth(this.trackHeight);
        this.inactiveTicksPaint.setStrokeWidth(this.trackHeight / 2.0f);
        this.activeTicksPaint.setStrokeWidth(this.trackHeight / 2.0f);
    }

    private boolean isInScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void loadResources(Resources resources) {
        this.widgetHeight = resources.getDimensionPixelSize(C1371R.dimen.mtrl_slider_widget_height);
        this.trackSidePadding = resources.getDimensionPixelOffset(C1371R.dimen.mtrl_slider_track_side_padding);
        this.trackTop = resources.getDimensionPixelOffset(C1371R.dimen.mtrl_slider_track_top);
        this.labelPadding = resources.getDimensionPixelSize(C1371R.dimen.mtrl_slider_label_padding);
    }

    private void maybeDrawHalo(Canvas canvas, int i4, int i5) {
        if (shouldDrawCompatHalo()) {
            int iNormalizeValue = (int) (this.trackSidePadding + (normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * i4));
            if (Build.VERSION.SDK_INT < 28) {
                int i6 = this.haloRadius;
                canvas.clipRect(iNormalizeValue - i6, i5 - i6, iNormalizeValue + i6, i6 + i5, Region.Op.UNION);
            }
            canvas.drawCircle(iNormalizeValue, i5, this.haloRadius, this.haloPaint);
        }
    }

    private boolean moveFocus(int i4) {
        int i5 = this.focusedThumbIdx;
        int iM10444c = (int) C3425a.m10444c(i5 + i4, 0L, this.values.size() - 1);
        this.focusedThumbIdx = iM10444c;
        if (iM10444c == i5) {
            return false;
        }
        if (this.activeThumbIdx != -1) {
            this.activeThumbIdx = iM10444c;
        }
        updateHaloHotspot();
        postInvalidate();
        return true;
    }

    private boolean moveFocusInAbsoluteDirection(int i4) {
        if (isRtl()) {
            i4 = i4 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i4;
        }
        return moveFocus(i4);
    }

    private float normalizeValue(float f4) {
        float f5 = this.valueFrom;
        float f6 = (f4 - f5) / (this.valueTo - f5);
        return isRtl() ? 1.0f - f6 : f6;
    }

    private Boolean onKeyDownNoActiveThumb(int i4, KeyEvent keyEvent) {
        if (i4 == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(moveFocus(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(moveFocus(-1)) : Boolean.FALSE;
        }
        if (i4 != 66) {
            if (i4 != 81) {
                if (i4 == 69) {
                    moveFocus(-1);
                    return Boolean.TRUE;
                }
                if (i4 != 70) {
                    switch (i4) {
                        case 21:
                            moveFocusInAbsoluteDirection(-1);
                            break;
                        case 22:
                            moveFocusInAbsoluteDirection(1);
                            break;
                    }
                    return Boolean.TRUE;
                }
            }
            moveFocus(1);
            return Boolean.TRUE;
        }
        this.activeThumbIdx = this.focusedThumbIdx;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void onStartTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStartTrackingTouch(this);
        }
    }

    private void onStopTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStopTrackingTouch(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TooltipDrawable parseLabelDrawable(Context context, TypedArray typedArray) {
        return TooltipDrawable.createFromAttributes(context, null, 0, typedArray.getResourceId(C1371R.styleable.Slider_labelStyle, C1371R.style.Widget_MaterialComponents_Tooltip));
    }

    private static int pivotIndex(float[] fArr, float f4) {
        return Math.round(f4 * ((fArr.length / 2) - 1));
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i4) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C1371R.styleable.Slider, i4, DEF_STYLE_RES, new int[0]);
        this.valueFrom = typedArrayObtainStyledAttributes.getFloat(C1371R.styleable.Slider_android_valueFrom, IGoodView.DEFAULT_TO_ALPHA);
        this.valueTo = typedArrayObtainStyledAttributes.getFloat(C1371R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.valueFrom));
        this.stepSize = typedArrayObtainStyledAttributes.getFloat(C1371R.styleable.Slider_android_stepSize, IGoodView.DEFAULT_TO_ALPHA);
        int i5 = C1371R.styleable.Slider_trackColor;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i5);
        int i6 = zHasValue ? i5 : C1371R.styleable.Slider_trackColorInactive;
        if (!zHasValue) {
            i5 = C1371R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i6);
        if (colorStateList == null) {
            colorStateList = C2443a.m8168c(context, C1371R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i5);
        if (colorStateList2 == null) {
            colorStateList2 = C2443a.m8168c(context, C1371R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.thumbDrawable.setFillColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1371R.styleable.Slider_thumbColor));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C1371R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = C2443a.m8168c(context, C1371R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        int i7 = C1371R.styleable.Slider_tickColor;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i7);
        int i8 = zHasValue2 ? i7 : C1371R.styleable.Slider_tickColorInactive;
        if (!zHasValue2) {
            i7 = C1371R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i8);
        if (colorStateList4 == null) {
            colorStateList4 = C2443a.m8168c(context, C1371R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i7);
        if (colorStateList5 == null) {
            colorStateList5 = C2443a.m8168c(context, C1371R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1371R.styleable.Slider_thumbRadius, 0));
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1371R.styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(C1371R.styleable.Slider_thumbElevation, IGoodView.DEFAULT_TO_ALPHA));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1371R.styleable.Slider_trackHeight, 0));
        this.labelBehavior = typedArrayObtainStyledAttributes.getInt(C1371R.styleable.Slider_labelBehavior, 0);
        if (!typedArrayObtainStyledAttributes.getBoolean(C1371R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void scheduleAccessibilityEventSender(int i4) {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender == null) {
            this.accessibilityEventSender = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        this.accessibilityEventSender.setVirtualViewId(i4);
        postDelayed(this.accessibilityEventSender, 200L);
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f4) {
        tooltipDrawable.setText(formatValue(f4));
        int iNormalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f4) * this.trackWidth))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int iCalculateTop = calculateTop() - (this.labelPadding + this.thumbRadius);
        tooltipDrawable.setBounds(iNormalizeValue, iCalculateTop - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + iNormalizeValue, iCalculateTop);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect);
        tooltipDrawable.setBounds(rect);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.values.size() == arrayList.size() && this.values.equals(arrayList)) {
            return;
        }
        this.values = arrayList;
        this.dirtyConfig = true;
        this.focusedThumbIdx = 0;
        updateHaloHotspot();
        createLabelPool();
        dispatchOnChangedProgramatically();
        postInvalidate();
    }

    private boolean shouldDrawCompatHalo() {
        return this.forceDrawCompatHalo || !(getBackground() instanceof RippleDrawable);
    }

    private boolean snapActiveThumbToValue(float f4) {
        return snapThumbToValue(this.activeThumbIdx, f4);
    }

    private double snapPosition(float f4) {
        float f5 = this.stepSize;
        if (f5 <= IGoodView.DEFAULT_TO_ALPHA) {
            return f4;
        }
        return Math.round(f4 * r0) / ((int) ((this.valueTo - this.valueFrom) / f5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean snapThumbToValue(int i4, float f4) {
        if (Math.abs(f4 - this.values.get(i4).floatValue()) < THRESHOLD) {
            return false;
        }
        this.values.set(i4, Float.valueOf(getClampedValue(i4, f4)));
        this.focusedThumbIdx = i4;
        dispatchOnChangedFromUser(i4);
        return true;
    }

    private boolean snapTouchPosition() {
        return snapActiveThumbToValue(getValueOfTouchPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHaloHotspot() {
        if (shouldDrawCompatHalo() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iNormalizeValue = (int) ((normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * this.trackWidth) + this.trackSidePadding);
            int iCalculateTop = calculateTop();
            int i4 = this.haloRadius;
            C3403a.m10395l(background, iNormalizeValue - i4, iCalculateTop - i4, iNormalizeValue + i4, iCalculateTop + i4);
        }
    }

    private void validateConfigurationIfDirty() {
        if (this.dirtyConfig) {
            validateValueFrom();
            validateValueTo();
            validateStepSize();
            validateValues();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
        }
    }

    private void validateStepSize() {
        if (this.stepSize > IGoodView.DEFAULT_TO_ALPHA && !valueLandsOnTick(this.valueTo)) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, Float.toString(this.stepSize), Float.toString(this.valueFrom), Float.toString(this.valueTo)));
        }
    }

    private void validateValueFrom() {
        if (this.valueFrom >= this.valueTo) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE_FROM, Float.toString(this.valueFrom), Float.toString(this.valueTo)));
        }
    }

    private void validateValueTo() {
        if (this.valueTo <= this.valueFrom) {
            throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE_TO, Float.toString(this.valueTo), Float.toString(this.valueFrom)));
        }
    }

    private void validateValues() {
        Iterator<Float> it = this.values.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.valueFrom || next.floatValue() > this.valueTo) {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_VALUE, Float.toString(next.floatValue()), Float.toString(this.valueFrom), Float.toString(this.valueTo)));
            }
            if (this.stepSize > IGoodView.DEFAULT_TO_ALPHA && !valueLandsOnTick(next.floatValue())) {
                throw new IllegalStateException(String.format(EXCEPTION_ILLEGAL_DISCRETE_VALUE, Float.toString(next.floatValue()), Float.toString(this.valueFrom), Float.toString(this.stepSize), Float.toString(this.stepSize)));
            }
        }
    }

    private boolean valueLandsOnTick(float f4) {
        double dDoubleValue = new BigDecimal(Float.toString(f4)).subtract(new BigDecimal(Float.toString(this.valueFrom))).divide(new BigDecimal(Float.toString(this.stepSize)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < THRESHOLD;
    }

    private float valueToX(float f4) {
        return (normalizeValue(f4) * this.trackWidth) + this.trackSidePadding;
    }

    private void warnAboutFloatingPointError() {
        float f4 = this.stepSize;
        if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
            return;
        }
        if (((int) f4) != f4) {
            Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERRROR, "stepSize", Float.valueOf(f4)));
        }
        float f5 = this.valueFrom;
        if (((int) f5) != f5) {
            Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERRROR, "valueFrom", Float.valueOf(f5)));
        }
        float f6 = this.valueTo;
        if (((int) f6) != f6) {
            Log.w(TAG, String.format(WARNING_FLOATING_POINT_ERRROR, "valueTo", Float.valueOf(f6)));
        }
    }

    public void addOnChangeListener(L l3) {
        this.changeListeners.add(l3);
    }

    public void addOnSliderTouchListener(T t3) {
        this.touchListeners.add(t3);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.accessibilityHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        for (TooltipDrawable tooltipDrawable : this.labels) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.thumbDrawable.isStateful()) {
            this.thumbDrawable.setState(getDrawableState());
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    void forceDrawCompatHalo(boolean z3) {
        this.forceDrawCompatHalo = z3;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    public int getHaloRadius() {
        return this.haloRadius;
    }

    public ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public float getThumbElevation() {
        return this.thumbDrawable.getElevation();
    }

    public int getThumbRadius() {
        return this.thumbRadius;
    }

    public ColorStateList getThumbTintList() {
        return this.thumbDrawable.getFillColor();
    }

    public ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    public ColorStateList getTickTintList() {
        if (this.tickColorInactive.equals(this.tickColorActive)) {
            return this.tickColorActive;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    public int getTrackHeight() {
        return this.trackHeight;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    public ColorStateList getTrackTintList() {
        if (this.trackColorInactive.equals(this.trackColorActive)) {
            return this.trackColorActive;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.trackWidth;
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public float getValueTo() {
        return this.valueTo;
    }

    List<Float> getValues() {
        return new ArrayList(this.values);
    }

    public boolean hasLabelFormatter() {
        return this.formatter != null;
    }

    final boolean isRtl() {
        return C0358u.m1978A(this) == 1;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            attachLabelToContentView(it.next());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            detachLabelFromContentView(it.next());
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            if (this.stepSize > IGoodView.DEFAULT_TO_ALPHA) {
                calculateTicksCoordinates();
            }
        }
        super.onDraw(canvas);
        int iCalculateTop = calculateTop();
        drawInactiveTrack(canvas, this.trackWidth, iCalculateTop);
        if (((Float) Collections.max(getValues())).floatValue() > this.valueFrom) {
            drawActiveTrack(canvas, this.trackWidth, iCalculateTop);
        }
        if (this.stepSize > IGoodView.DEFAULT_TO_ALPHA) {
            drawTicks(canvas);
        }
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            maybeDrawHalo(canvas, this.trackWidth, iCalculateTop);
            if (this.activeThumbIdx != -1) {
                ensureLabels();
            }
        }
        drawThumbs(canvas, this.trackWidth, iCalculateTop);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z3, int i4, Rect rect) {
        super.onFocusChanged(z3, i4, rect);
        if (z3) {
            focusThumbOnFocusGained(i4);
            this.accessibilityHelper.requestKeyboardFocusForVirtualView(this.focusedThumbIdx);
            return;
        }
        this.activeThumbIdx = -1;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            ViewUtils.getContentViewOverlay(this).remove(it.next());
        }
        this.accessibilityHelper.clearKeyboardFocusForVirtualView(this.focusedThumbIdx);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i4, keyEvent);
        }
        if (this.values.size() == 1) {
            this.activeThumbIdx = 0;
        }
        if (this.activeThumbIdx == -1) {
            Boolean boolOnKeyDownNoActiveThumb = onKeyDownNoActiveThumb(i4, keyEvent);
            return boolOnKeyDownNoActiveThumb != null ? boolOnKeyDownNoActiveThumb.booleanValue() : super.onKeyDown(i4, keyEvent);
        }
        this.isLongPress |= keyEvent.isLongPress();
        Float fCalculateIncrementForKey = calculateIncrementForKey(i4);
        if (fCalculateIncrementForKey != null) {
            if (snapActiveThumbToValue(this.values.get(this.activeThumbIdx).floatValue() + fCalculateIncrementForKey.floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i4 != 23) {
            if (i4 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return moveFocus(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return moveFocus(-1);
                }
                return false;
            }
            if (i4 != 66) {
                return super.onKeyDown(i4, keyEvent);
            }
        }
        this.activeThumbIdx = -1;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            ViewUtils.getContentViewOverlay(this).remove(it.next());
        }
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(this.widgetHeight + (this.labelBehavior == 1 ? this.labels.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.valueFrom;
        this.valueTo = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.stepSize = sliderState.stepSize;
        if (sliderState.hasFocus) {
            requestFocus();
        }
        dispatchOnChangedProgramatically();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.valueFrom;
        sliderState.valueTo = this.valueTo;
        sliderState.values = new ArrayList<>(this.values);
        sliderState.stepSize = this.stepSize;
        sliderState.hasFocus = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        this.trackWidth = Math.max(i4 - (this.trackSidePadding * 2), 0);
        if (this.stepSize > IGoodView.DEFAULT_TO_ALPHA) {
            calculateTicksCoordinates();
        }
        updateHaloHotspot();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x3 = motionEvent.getX();
        float f4 = (x3 - this.trackSidePadding) / this.trackWidth;
        this.touchPosition = f4;
        float fMax = Math.max(IGoodView.DEFAULT_TO_ALPHA, f4);
        this.touchPosition = fMax;
        this.touchPosition = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.touchDownX = x3;
            if (!isInScrollingContainer()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.thumbIsPressed = true;
                    snapTouchPosition();
                    updateHaloHotspot();
                    invalidate();
                    onStartTrackingTouch();
                }
            }
        } else if (actionMasked == 1) {
            this.thumbIsPressed = false;
            MotionEvent motionEvent2 = this.lastEvent;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.lastEvent.getX() - motionEvent.getX()) <= this.scaledTouchSlop && Math.abs(this.lastEvent.getY() - motionEvent.getY()) <= this.scaledTouchSlop) {
                pickActiveThumb();
            }
            if (this.activeThumbIdx != -1) {
                snapTouchPosition();
                this.activeThumbIdx = -1;
            }
            Iterator<TooltipDrawable> it = this.labels.iterator();
            while (it.hasNext()) {
                ViewUtils.getContentViewOverlay(this).remove(it.next());
            }
            onStopTrackingTouch();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.thumbIsPressed) {
                if (Math.abs(x3 - this.touchDownX) < this.scaledTouchSlop) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                onStartTrackingTouch();
            }
            if (pickActiveThumb()) {
                this.thumbIsPressed = true;
                snapTouchPosition();
                updateHaloHotspot();
                invalidate();
            }
        }
        setPressed(this.thumbIsPressed);
        this.lastEvent = MotionEvent.obtain(motionEvent);
        return true;
    }

    protected boolean pickActiveThumb() {
        if (this.activeThumbIdx != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fValueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float fAbs = Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i4 = 1; i4 < this.values.size(); i4++) {
            float fAbs2 = Math.abs(this.values.get(i4).floatValue() - valueOfTouchPositionAbsolute);
            float fValueToX2 = valueToX(this.values.get(i4).floatValue());
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            boolean z3 = !isRtl() ? fValueToX2 - fValueToX >= IGoodView.DEFAULT_TO_ALPHA : fValueToX2 - fValueToX <= IGoodView.DEFAULT_TO_ALPHA;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.activeThumbIdx = i4;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fValueToX2 - fValueToX) < this.scaledTouchSlop) {
                        this.activeThumbIdx = -1;
                        return false;
                    }
                    if (z3) {
                        this.activeThumbIdx = i4;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.activeThumbIdx != -1;
    }

    public void removeOnChangeListener(L l3) {
        this.changeListeners.remove(l3);
    }

    public void removeOnSliderTouchListener(T t3) {
        this.touchListeners.remove(t3);
    }

    protected void setActiveThumbIndex(int i4) {
        this.activeThumbIdx = i4;
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        setLayerType(z3 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i4) {
        if (i4 < 0 || i4 >= this.values.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.focusedThumbIdx = i4;
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(i4);
        postInvalidate();
    }

    public void setHaloRadius(int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (i4 == this.haloRadius) {
            return;
        }
        this.haloRadius = i4;
        Drawable background = getBackground();
        if (shouldDrawCompatHalo() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.haloRadius);
        }
    }

    public void setHaloRadiusResource(int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        setHaloRadius(getResources().getDimensionPixelSize(i4));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.haloColor)) {
            return;
        }
        this.haloColor = colorStateList;
        Drawable background = getBackground();
        if (!shouldDrawCompatHalo() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.haloPaint.setColor(getColorForState(colorStateList));
        this.haloPaint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i4) {
        if (this.labelBehavior != i4) {
            this.labelBehavior = i4;
            requestLayout();
        }
    }

    public void setLabelFormatter(LabelFormatter labelFormatter) {
        this.formatter = labelFormatter;
    }

    public void setStepSize(float f4) {
        if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
            throw new IllegalArgumentException(String.format(EXCEPTION_ILLEGAL_STEP_SIZE, Float.toString(f4), Float.toString(this.valueFrom), Float.toString(this.valueTo)));
        }
        if (this.stepSize != f4) {
            this.stepSize = f4;
            this.dirtyConfig = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f4) {
        this.thumbDrawable.setElevation(f4);
    }

    public void setThumbElevationResource(int i4) {
        setThumbElevation(getResources().getDimension(i4));
    }

    public void setThumbRadius(int i4) {
        if (i4 == this.thumbRadius) {
            return;
        }
        this.thumbRadius = i4;
        this.thumbDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.thumbRadius).build());
        MaterialShapeDrawable materialShapeDrawable = this.thumbDrawable;
        int i5 = this.thumbRadius;
        materialShapeDrawable.setBounds(0, 0, i5 * 2, i5 * 2);
        postInvalidate();
    }

    public void setThumbRadiusResource(int i4) {
        setThumbRadius(getResources().getDimensionPixelSize(i4));
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.thumbDrawable.setFillColor(colorStateList);
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorActive)) {
            return;
        }
        this.tickColorActive = colorStateList;
        this.activeTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorInactive)) {
            return;
        }
        this.tickColorInactive = colorStateList;
        this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorActive)) {
            return;
        }
        this.trackColorActive = colorStateList;
        this.activeTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackHeight(int i4) {
        if (this.trackHeight != i4) {
            this.trackHeight = i4;
            invalidateTrack();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorInactive)) {
            return;
        }
        this.trackColorInactive = colorStateList;
        this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f4) {
        this.valueFrom = f4;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValueTo(float f4) {
        this.valueTo = f4;
        this.dirtyConfig = true;
        postInvalidate();
    }

    void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    void updateBoundsForVirturalViewId(int i4, Rect rect) {
        int iNormalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i4).floatValue()) * this.trackWidth));
        int iCalculateTop = calculateTop();
        int i5 = this.thumbRadius;
        rect.set(iNormalizeValue - i5, iCalculateTop - i5, iNormalizeValue + i5, iCalculateTop + i5);
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1371R.attr.sliderStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateStepIncrement(int i4) {
        float fCalculateStepIncrement = calculateStepIncrement();
        return (this.valueTo - this.valueFrom) / fCalculateStepIncrement <= i4 ? fCalculateStepIncrement : Math.round(r1 / r4) * fCalculateStepIncrement;
    }

    public BaseSlider(Context context, final AttributeSet attributeSet, final int i4) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i4, DEF_STYLE_RES), attributeSet, i4);
        this.labels = new ArrayList();
        this.changeListeners = new ArrayList();
        this.touchListeners = new ArrayList();
        this.thumbIsPressed = false;
        this.values = new ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = IGoodView.DEFAULT_TO_ALPHA;
        this.isLongPress = false;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.thumbDrawable = materialShapeDrawable;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.inactiveTrackPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.activeTrackPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.thumbPaint = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.haloPaint = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.inactiveTicksPaint = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.activeTicksPaint = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        loadResources(context2.getResources());
        this.labelMaker = new TooltipDrawableFactory() { // from class: com.google.android.material.slider.BaseSlider.1
            @Override // com.google.android.material.slider.BaseSlider.TooltipDrawableFactory
            public TooltipDrawable createTooltipDrawable() {
                TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(BaseSlider.this.getContext(), attributeSet, C1371R.styleable.Slider, i4, BaseSlider.DEF_STYLE_RES, new int[0]);
                TooltipDrawable labelDrawable = BaseSlider.parseLabelDrawable(BaseSlider.this.getContext(), typedArrayObtainStyledAttributes);
                typedArrayObtainStyledAttributes.recycle();
                return labelDrawable;
            }
        };
        processAttributes(context2, attributeSet, i4);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.scaledTouchSlop = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.accessibilityHelper = accessibilityHelper;
        C0358u.m2051q0(this, accessibilityHelper);
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    void setValues(List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }
}
