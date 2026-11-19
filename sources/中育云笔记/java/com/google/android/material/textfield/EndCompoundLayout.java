package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C6339R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
class EndCompoundLayout extends LinearLayout {

    @Nullable
    private final AccessibilityManager accessibilityManager;
    private EditText editText;
    private final TextWatcher editTextWatcher;
    private final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final EndIconDelegates endIconDelegates;

    @NonNull
    private final FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;

    @NonNull
    private ImageView.ScaleType endIconScaleType;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;

    @NonNull
    private final CheckableImageButton endIconView;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;

    @NonNull
    private final CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;

    @Nullable
    private CharSequence suffixText;

    @NonNull
    private final TextView suffixTextView;
    final TextInputLayout textInputLayout;

    @Nullable
    private AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    public static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final SparseArray<EndIconDelegate> delegates = new SparseArray<>();
        private final EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        public EndIconDelegates(EndCompoundLayout endCompoundLayout, TintTypedArray tintTypedArray) {
            this.endLayout = endCompoundLayout;
            this.customEndIconDrawableId = tintTypedArray.getResourceId(C6339R.styleable.TextInputLayout_endIconDrawable, 0);
            this.passwordIconDrawableId = tintTypedArray.getResourceId(C6339R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        private EndIconDelegate create(int i10) {
            if (i10 == -1) {
                return new CustomEndIconDelegate(this.endLayout);
            }
            if (i10 == 0) {
                return new NoEndIconDelegate(this.endLayout);
            }
            if (i10 == 1) {
                return new PasswordToggleEndIconDelegate(this.endLayout, this.passwordIconDrawableId);
            }
            if (i10 == 2) {
                return new ClearTextEndIconDelegate(this.endLayout);
            }
            if (i10 == 3) {
                return new DropdownMenuEndIconDelegate(this.endLayout);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        public EndIconDelegate get(int i10) {
            EndIconDelegate endIconDelegate = this.delegates.get(i10);
            if (endIconDelegate != null) {
                return endIconDelegate;
            }
            EndIconDelegate endIconDelegateCreate = create(i10);
            this.delegates.append(i10, endIconDelegateCreate);
            return endIconDelegateCreate;
        }
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.endIconMode = 0;
        this.endIconChangedListeners = new LinkedHashSet<>();
        this.editTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.getEndIconDelegate().afterEditTextChanged(editable);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                EndCompoundLayout.this.getEndIconDelegate().beforeEditTextChanged(charSequence, i10, i11, i12);
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(@NonNull TextInputLayout textInputLayout2) {
                if (EndCompoundLayout.this.editText == textInputLayout2.getEditText()) {
                    return;
                }
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.removeTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                    if (EndCompoundLayout.this.editText.getOnFocusChangeListener() == EndCompoundLayout.this.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                        EndCompoundLayout.this.editText.setOnFocusChangeListener(null);
                    }
                }
                EndCompoundLayout.this.editText = textInputLayout2.getEditText();
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.addTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                }
                EndCompoundLayout.this.getEndIconDelegate().onEditTextAttached(EndCompoundLayout.this.editText);
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
            }
        };
        this.onEditTextAttachedListener = onEditTextAttachedListener;
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.endIconFrame = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonCreateIconView = createIconView(this, layoutInflaterFrom, C6339R.id.text_input_error_icon);
        this.errorIconView = checkableImageButtonCreateIconView;
        CheckableImageButton checkableImageButtonCreateIconView2 = createIconView(frameLayout, layoutInflaterFrom, C6339R.id.text_input_end_icon);
        this.endIconView = checkableImageButtonCreateIconView2;
        this.endIconDelegates = new EndIconDelegates(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.suffixTextView = appCompatTextView;
        initErrorIconView(tintTypedArray);
        initEndIconView(tintTypedArray);
        initSuffixTextView(tintTypedArray);
        frameLayout.addView(checkableImageButtonCreateIconView2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonCreateIconView);
        textInputLayout.addOnEditTextAttachedListener(onEditTextAttachedListener);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                EndCompoundLayout.this.addTouchExplorationStateChangeListenerIfNeeded();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                EndCompoundLayout.this.removeTouchExplorationStateChangeListenerIfNeeded();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTouchExplorationStateChangeListenerIfNeeded() {
        if (this.touchExplorationStateChangeListener == null || this.accessibilityManager == null || !ViewCompat.isAttachedToWindow(this)) {
            return;
        }
        AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.accessibilityManager, this.touchExplorationStateChangeListener);
    }

    private CheckableImageButton createIconView(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C6339R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void dispatchOnEndIconChanged(int i10) {
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this.textInputLayout, i10);
        }
    }

    private int getIconResId(EndIconDelegate endIconDelegate) {
        int i10 = this.endIconDelegates.customEndIconDrawableId;
        return i10 == 0 ? endIconDelegate.getIconDrawableResId() : i10;
    }

    private void initEndIconView(TintTypedArray tintTypedArray) {
        if (!tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_endIconTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, C6339R.styleable.TextInputLayout_endIconTint);
            }
            if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_endIconTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(C6339R.styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_endIconMode)) {
            setEndIconMode(tintTypedArray.getInt(C6339R.styleable.TextInputLayout_endIconMode, 0));
            if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(tintTypedArray.getText(C6339R.styleable.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(tintTypedArray.getBoolean(C6339R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_passwordToggleTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, C6339R.styleable.TextInputLayout_passwordToggleTint);
            }
            if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_passwordToggleTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(C6339R.styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            setEndIconMode(tintTypedArray.getBoolean(C6339R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconContentDescription(tintTypedArray.getText(C6339R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        setEndIconMinSize(tintTypedArray.getDimensionPixelSize(C6339R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(C6339R.dimen.mtrl_min_touch_target_size)));
        if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_endIconScaleType)) {
            setEndIconScaleType(IconHelper.convertScaleType(tintTypedArray.getInt(C6339R.styleable.TextInputLayout_endIconScaleType, -1)));
        }
    }

    private void initErrorIconView(TintTypedArray tintTypedArray) {
        if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_errorIconTint)) {
            this.errorIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, C6339R.styleable.TextInputLayout_errorIconTint);
        }
        if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_errorIconTintMode)) {
            this.errorIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(C6339R.styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(tintTypedArray.getDrawable(C6339R.styleable.TextInputLayout_errorIconDrawable));
        }
        this.errorIconView.setContentDescription(getResources().getText(C6339R.string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(this.errorIconView, 2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initSuffixTextView(TintTypedArray tintTypedArray) {
        this.suffixTextView.setVisibility(8);
        this.suffixTextView.setId(C6339R.id.textinput_suffix_text);
        this.suffixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.setAccessibilityLiveRegion(this.suffixTextView, 1);
        setSuffixTextAppearance(tintTypedArray.getResourceId(C6339R.styleable.TextInputLayout_suffixTextAppearance, 0));
        if (tintTypedArray.hasValue(C6339R.styleable.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(tintTypedArray.getColorStateList(C6339R.styleable.TextInputLayout_suffixTextColor));
        }
        setSuffixText(tintTypedArray.getText(C6339R.styleable.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTouchExplorationStateChangeListenerIfNeeded() {
        AccessibilityManager accessibilityManager;
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.accessibilityManager) == null) {
            return;
        }
        AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
        if (this.editText == null) {
            return;
        }
        if (endIconDelegate.getOnEditTextFocusChangeListener() != null) {
            this.editText.setOnFocusChangeListener(endIconDelegate.getOnEditTextFocusChangeListener());
        }
        if (endIconDelegate.getOnIconViewFocusChangeListener() != null) {
            this.endIconView.setOnFocusChangeListener(endIconDelegate.getOnIconViewFocusChangeListener());
        }
    }

    private void setUpDelegate(@NonNull EndIconDelegate endIconDelegate) {
        endIconDelegate.setUp();
        this.touchExplorationStateChangeListener = endIconDelegate.getTouchExplorationStateChangeListener();
        addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(@NonNull EndIconDelegate endIconDelegate) {
        removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
    }

    private void tintEndIconOnError(boolean z10) {
        if (!z10 || getEndIconDrawable() == null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            return;
        }
        Drawable drawableMutate = DrawableCompat.wrap(getEndIconDrawable()).mutate();
        DrawableCompat.setTint(drawableMutate, this.textInputLayout.getErrorCurrentTextColors());
        this.endIconView.setImageDrawable(drawableMutate);
    }

    private void updateEndLayoutVisibility() {
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        setVisibility((isEndIconVisible() || isErrorIconVisible() || !((this.suffixText == null || this.hintExpanded) ? 8 : false)) ? 0 : 8);
    }

    private void updateErrorIconVisibility() {
        this.errorIconView.setVisibility(getErrorIconDrawable() != null && this.textInputLayout.isErrorEnabled() && this.textInputLayout.shouldShowError() ? 0 : 8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        this.textInputLayout.updateDummyDrawables();
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i10 = (this.suffixText == null || this.hintExpanded) ? 8 : 0;
        if (visibility != i10) {
            getEndIconDelegate().onSuffixVisibilityChanged(i10 == 0);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i10);
        this.textInputLayout.updateDummyDrawables();
    }

    public void addOnEndIconChangedListener(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    public void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    @Nullable
    public CheckableImageButton getCurrentEndIconView() {
        if (isErrorIconVisible()) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public EndIconDelegate getEndIconDelegate() {
        return this.endIconDelegates.get(this.endIconMode);
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.endIconMinSize;
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.endIconScaleType;
    }

    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    @Nullable
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Nullable
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public int getSuffixTextEndOffset() {
        return ViewCompat.getPaddingEnd(this) + ViewCompat.getPaddingEnd(this.suffixTextView) + ((isEndIconVisible() || isErrorIconVisible()) ? this.endIconView.getMeasuredWidth() + MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) this.endIconView.getLayoutParams()) : 0);
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public boolean isEndIconChecked() {
        return hasEndIcon() && this.endIconView.isChecked();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public void onHintStateChanged(boolean z10) {
        this.hintExpanded = z10;
        updateSuffixTextVisibility();
    }

    public void onTextInputBoxStateUpdated() {
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().shouldTintIconOnError()) {
            tintEndIconOnError(this.textInputLayout.shouldShowError());
        }
    }

    public void refreshEndIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.endIconView, this.endIconTintList);
    }

    public void refreshErrorIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.errorIconView, this.errorIconTintList);
    }

    public void refreshIconState(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        boolean z12 = true;
        if (!endIconDelegate.isIconCheckable() || (zIsChecked = this.endIconView.isChecked()) == endIconDelegate.isIconChecked()) {
            z11 = false;
        } else {
            this.endIconView.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!endIconDelegate.isIconActivable() || (zIsActivated = this.endIconView.isActivated()) == endIconDelegate.isIconActivated()) {
            z12 = z11;
        } else {
            setEndIconActivated(!zIsActivated);
        }
        if (z10 || z12) {
            refreshEndIconDrawableState();
        }
    }

    public void removeOnEndIconChangedListener(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    public void setEndIconActivated(boolean z10) {
        this.endIconView.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.endIconView.setCheckable(z10);
    }

    public void setEndIconContentDescription(@StringRes int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(@DrawableRes int i10) {
        setEndIconDrawable(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    public void setEndIconMinSize(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.endIconMinSize) {
            this.endIconMinSize = i10;
            IconHelper.setIconMinSize(this.endIconView, i10);
            IconHelper.setIconMinSize(this.errorIconView, i10);
        }
    }

    public void setEndIconMode(int i10) {
        if (this.endIconMode == i10) {
            return;
        }
        tearDownDelegate(getEndIconDelegate());
        int i11 = this.endIconMode;
        this.endIconMode = i10;
        dispatchOnEndIconChanged(i11);
        setEndIconVisible(i10 != 0);
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(getIconResId(endIconDelegate));
        setEndIconContentDescription(endIconDelegate.getIconContentDescriptionResId());
        setEndIconCheckable(endIconDelegate.isIconCheckable());
        if (!endIconDelegate.isBoxBackgroundModeSupported(this.textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        setUpDelegate(endIconDelegate);
        setEndIconOnClickListener(endIconDelegate.getOnIconClickListener());
        EditText editText = this.editText;
        if (editText != null) {
            endIconDelegate.onEditTextAttached(editText);
            setOnFocusChangeListenersIfNeeded(endIconDelegate);
        }
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
        refreshIconState(true);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.endIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.endIconView, scaleType);
        IconHelper.setIconScaleType(this.errorIconView, scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (isEndIconVisible() != z10) {
            this.endIconView.setVisibility(z10 ? 0 : 8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    public void setErrorIconDrawable(@DrawableRes int i10) {
        setErrorIconDrawable(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
        refreshErrorIconDrawableState();
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(@StringRes int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z10) {
                return;
            }
            setEndIconMode(0);
        }
    }

    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
    }

    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(@StyleRes int i10) {
        TextViewCompat.setTextAppearance(this.suffixTextView, i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    public void togglePasswordVisibilityToggle(boolean z10) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z10) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void updateSuffixTextViewPadding() {
        if (this.textInputLayout.editText == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.suffixTextView, getContext().getResources().getDimensionPixelSize(C6339R.dimen.material_input_text_to_prefix_suffix_padding), this.textInputLayout.editText.getPaddingTop(), (isEndIconVisible() || isErrorIconVisible()) ? 0 : ViewCompat.getPaddingEnd(this.textInputLayout.editText), this.textInputLayout.editText.getPaddingBottom());
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }
}
