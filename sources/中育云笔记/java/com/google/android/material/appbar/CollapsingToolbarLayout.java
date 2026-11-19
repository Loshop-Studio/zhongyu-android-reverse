package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0216R;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.C6339R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes5.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
    private static final int DEF_STYLE_RES = C6339R.style.Widget_Design_CollapsingToolbar;
    public static final int TITLE_COLLAPSE_MODE_FADE = 1;
    public static final int TITLE_COLLAPSE_MODE_SCALE = 0;

    @NonNull
    final CollapsingTextHelper collapsingTextHelper;
    private boolean collapsingTitleEnabled;

    @Nullable
    private Drawable contentScrim;
    int currentOffset;
    private boolean drawCollapsingTitle;
    private View dummyView;

    @NonNull
    final ElevationOverlayProvider elevationOverlayProvider;
    private int expandedMarginBottom;
    private int expandedMarginEnd;
    private int expandedMarginStart;
    private int expandedMarginTop;
    private int extraMultilineHeight;
    private boolean extraMultilineHeightEnabled;
    private boolean forceApplySystemWindowInsetTop;

    @Nullable
    WindowInsetsCompat lastInsets;
    private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private boolean refreshToolbar;
    private int scrimAlpha;
    private long scrimAnimationDuration;
    private final TimeInterpolator scrimAnimationFadeInInterpolator;
    private final TimeInterpolator scrimAnimationFadeOutInterpolator;
    private ValueAnimator scrimAnimator;
    private int scrimVisibleHeightTrigger;
    private boolean scrimsAreShown;

    @Nullable
    Drawable statusBarScrim;
    private int titleCollapseMode;
    private final Rect tmpRect;

    @Nullable
    private ViewGroup toolbar;

    @Nullable
    private View toolbarDirectChild;
    private int toolbarId;
    private int topInsetApplied;

    public class OffsetUpdateListener implements AppBarLayout.OnOffsetChangedListener {
        public OffsetUpdateListener() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i10) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.currentOffset = i10;
            WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.lastInsets;
            int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                int i12 = layoutParams.collapseMode;
                if (i12 == 1) {
                    viewOffsetHelper.setTopAndBottomOffset(MathUtils.clamp(-i10, 0, CollapsingToolbarLayout.this.getMaxOffsetForPinChild(childAt)));
                } else if (i12 == 2) {
                    viewOffsetHelper.setTopAndBottomOffset(Math.round((-i10) * layoutParams.parallaxMult));
                }
            }
            CollapsingToolbarLayout.this.updateScrimVisibility();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.statusBarScrim != null && systemWindowInsetTop > 0) {
                ViewCompat.postInvalidateOnAnimation(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - ViewCompat.getMinimumHeight(CollapsingToolbarLayout.this)) - systemWindowInsetTop;
            float f10 = height;
            CollapsingToolbarLayout.this.collapsingTextHelper.setFadeModeStartFraction(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f10));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.collapsingTextHelper.setCurrentOffsetY(collapsingToolbarLayout3.currentOffset + height);
            CollapsingToolbarLayout.this.collapsingTextHelper.setExpansionFraction(Math.abs(i10) / f10);
        }
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface StaticLayoutBuilderConfigurer extends com.google.android.material.internal.StaticLayoutBuilderConfigurer {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TitleCollapseMode {
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void animateScrim(int i10) {
        ensureToolbar();
        ValueAnimator valueAnimator = this.scrimAnimator;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.scrimAnimator = valueAnimator2;
            valueAnimator2.setInterpolator(i10 > this.scrimAlpha ? this.scrimAnimationFadeInInterpolator : this.scrimAnimationFadeOutInterpolator);
            this.scrimAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator3) {
                    CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.scrimAnimator.cancel();
        }
        this.scrimAnimator.setDuration(this.scrimAnimationDuration);
        this.scrimAnimator.setIntValues(this.scrimAlpha, i10);
        this.scrimAnimator.start();
    }

    private TextUtils.TruncateAt convertEllipsizeToTruncateAt(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    private void disableLiftOnScrollIfNeeded(AppBarLayout appBarLayout) {
        if (isTitleCollapseFadeMode()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void ensureToolbar() {
        if (this.refreshToolbar) {
            ViewGroup viewGroup = null;
            this.toolbar = null;
            this.toolbarDirectChild = null;
            int i10 = this.toolbarId;
            if (i10 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
                this.toolbar = viewGroup2;
                if (viewGroup2 != null) {
                    this.toolbarDirectChild = findDirectChild(viewGroup2);
                }
            }
            if (this.toolbar == null) {
                int childCount = getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i11);
                    if (isToolbar(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i11++;
                }
                this.toolbar = viewGroup;
            }
            updateDummyView();
            this.refreshToolbar = false;
        }
    }

    @NonNull
    private View findDirectChild(@NonNull View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    @ColorInt
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() throws Resources.NotFoundException {
        ColorStateList colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), C6339R.attr.colorSurfaceContainer);
        if (colorStateListOrNull != null) {
            return colorStateListOrNull.getDefaultColor();
        }
        return this.elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(getResources().getDimension(C6339R.dimen.design_appbar_elevation));
    }

    private static int getHeightWithMargins(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static CharSequence getToolbarTitle(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @NonNull
    public static ViewOffsetHelper getViewOffsetHelper(@NonNull View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(C6339R.id.view_offset_helper);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        ViewOffsetHelper viewOffsetHelper2 = new ViewOffsetHelper(view);
        view.setTag(C6339R.id.view_offset_helper, viewOffsetHelper2);
        return viewOffsetHelper2;
    }

    private boolean isTitleCollapseFadeMode() {
        return this.titleCollapseMode == 1;
    }

    private static boolean isToolbar(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean isToolbarChild(View view) {
        View view2 = this.toolbarDirectChild;
        return (view2 == null || view2 == this) ? view == this.toolbar : view == view2;
    }

    private void updateCollapsedBounds(boolean z10) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.toolbarDirectChild;
        if (view == null) {
            view = this.toolbar;
        }
        int maxOffsetForPinChild = getMaxOffsetForPinChild(view);
        DescendantOffsetUtils.getDescendantRect(this, this.dummyView, this.tmpRect);
        ViewGroup viewGroup = this.toolbar;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        Rect rect = this.tmpRect;
        int i10 = rect.left + (z10 ? titleMarginEnd : titleMarginStart);
        int i11 = rect.top + maxOffsetForPinChild + titleMarginTop;
        int i12 = rect.right;
        if (!z10) {
            titleMarginStart = titleMarginEnd;
        }
        collapsingTextHelper.setCollapsedBounds(i10, i11, i12 - titleMarginStart, (rect.bottom + maxOffsetForPinChild) - titleMarginBottom);
    }

    private void updateContentDescriptionFromTitle() {
        setContentDescription(getTitle());
    }

    private void updateContentScrimBounds(@NonNull Drawable drawable, int i10, int i11) {
        updateContentScrimBounds(drawable, this.toolbar, i10, i11);
    }

    private void updateDummyView() {
        View view;
        if (!this.collapsingTitleEnabled && (view = this.dummyView) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.dummyView);
            }
        }
        if (!this.collapsingTitleEnabled || this.toolbar == null) {
            return;
        }
        if (this.dummyView == null) {
            this.dummyView = new View(getContext());
        }
        if (this.dummyView.getParent() == null) {
            this.toolbar.addView(this.dummyView, -1, -1);
        }
    }

    private void updateTextBounds(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        if (!this.collapsingTitleEnabled || (view = this.dummyView) == null) {
            return;
        }
        boolean z11 = ViewCompat.isAttachedToWindow(view) && this.dummyView.getVisibility() == 0;
        this.drawCollapsingTitle = z11;
        if (z11 || z10) {
            boolean z12 = ViewCompat.getLayoutDirection(this) == 1;
            updateCollapsedBounds(z12);
            this.collapsingTextHelper.setExpandedBounds(z12 ? this.expandedMarginEnd : this.expandedMarginStart, this.tmpRect.top + this.expandedMarginTop, (i12 - i10) - (z12 ? this.expandedMarginStart : this.expandedMarginEnd), (i13 - i11) - this.expandedMarginBottom);
            this.collapsingTextHelper.recalculate(z10);
        }
    }

    private void updateTitleFromToolbarIfNeeded() {
        if (this.toolbar != null && this.collapsingTitleEnabled && TextUtils.isEmpty(this.collapsingTextHelper.getText())) {
            setTitle(getToolbarTitle(this.toolbar));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        ensureToolbar();
        if (this.toolbar == null && (drawable = this.contentScrim) != null && this.scrimAlpha > 0) {
            drawable.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
        }
        if (this.collapsingTitleEnabled && this.drawCollapsingTitle) {
            if (this.toolbar == null || this.contentScrim == null || this.scrimAlpha <= 0 || !isTitleCollapseFadeMode() || this.collapsingTextHelper.getExpansionFraction() >= this.collapsingTextHelper.getFadeModeThresholdFraction()) {
                this.collapsingTextHelper.draw(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.contentScrim.getBounds(), Region.Op.DIFFERENCE);
                this.collapsingTextHelper.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.statusBarScrim == null || this.scrimAlpha <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.statusBarScrim.setBounds(0, -this.currentOffset, getWidth(), systemWindowInsetTop - this.currentOffset);
            this.statusBarScrim.mutate().setAlpha(this.scrimAlpha);
            this.statusBarScrim.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (this.contentScrim == null || this.scrimAlpha <= 0 || !isToolbarChild(view)) {
            z10 = false;
        } else {
            updateContentScrimBounds(this.contentScrim, view, getWidth(), getHeight());
            this.contentScrim.mutate().setAlpha(this.scrimAlpha);
            this.contentScrim.draw(canvas);
            z10 = true;
        }
        return super.drawChild(canvas, view, j10) || z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarScrim;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper != null) {
            state |= collapsingTextHelper.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public int getCollapsedTitleGravity() {
        return this.collapsingTextHelper.getCollapsedTextGravity();
    }

    public float getCollapsedTitleTextSize() {
        return this.collapsingTextHelper.getCollapsedTextSize();
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        return this.collapsingTextHelper.getCollapsedTypeface();
    }

    @Nullable
    public Drawable getContentScrim() {
        return this.contentScrim;
    }

    public int getExpandedTitleGravity() {
        return this.collapsingTextHelper.getExpandedTextGravity();
    }

    public int getExpandedTitleMarginBottom() {
        return this.expandedMarginBottom;
    }

    public int getExpandedTitleMarginEnd() {
        return this.expandedMarginEnd;
    }

    public int getExpandedTitleMarginStart() {
        return this.expandedMarginStart;
    }

    public int getExpandedTitleMarginTop() {
        return this.expandedMarginTop;
    }

    public float getExpandedTitleTextSize() {
        return this.collapsingTextHelper.getExpandedTextSize();
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        return this.collapsingTextHelper.getExpandedTypeface();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.collapsingTextHelper.getHyphenationFrequency();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLineCount() {
        return this.collapsingTextHelper.getLineCount();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.collapsingTextHelper.getLineSpacingAdd();
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.collapsingTextHelper.getLineSpacingMultiplier();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.collapsingTextHelper.getMaxLines();
    }

    public final int getMaxOffsetForPinChild(@NonNull View view) {
        return ((getHeight() - getViewOffsetHelper(view).getLayoutTop()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    public int getScrimAlpha() {
        return this.scrimAlpha;
    }

    public long getScrimAnimationDuration() {
        return this.scrimAnimationDuration;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.scrimVisibleHeightTrigger;
        if (i10 >= 0) {
            return i10 + this.topInsetApplied + this.extraMultilineHeight;
        }
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + systemWindowInsetTop, getHeight()) : getHeight() / 3;
    }

    @Nullable
    public Drawable getStatusBarScrim() {
        return this.statusBarScrim;
    }

    @Nullable
    public CharSequence getTitle() {
        if (this.collapsingTitleEnabled) {
            return this.collapsingTextHelper.getText();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.titleCollapseMode;
    }

    @Nullable
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.collapsingTextHelper.getPositionInterpolator();
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.collapsingTextHelper.getTitleTextEllipsize();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isExtraMultilineHeightEnabled() {
        return this.extraMultilineHeightEnabled;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isForceApplySystemWindowInsetTop() {
        return this.forceApplySystemWindowInsetTop;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.collapsingTextHelper.isRtlTextDirectionHeuristicsEnabled();
    }

    public boolean isTitleEnabled() {
        return this.collapsingTitleEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            disableLiftOnScrollIfNeeded(appBarLayout);
            ViewCompat.setFitsSystemWindows(this, ViewCompat.getFitsSystemWindows(appBarLayout));
            if (this.onOffsetChangedListener == null) {
                this.onOffsetChangedListener = new OffsetUpdateListener();
            }
            appBarLayout.addOnOffsetChangedListener(this.onOffsetChangedListener);
            ViewCompat.requestApplyInsets(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = this.onOffsetChangedListener;
        if (onOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(onOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!ViewCompat.getFitsSystemWindows(childAt) && childAt.getTop() < systemWindowInsetTop) {
                    ViewCompat.offsetTopAndBottom(childAt, systemWindowInsetTop);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            getViewOffsetHelper(getChildAt(i15)).onViewLayout();
        }
        updateTextBounds(i10, i11, i12, i13, false);
        updateTitleFromToolbarIfNeeded();
        updateScrimVisibility();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            getViewOffsetHelper(getChildAt(i16)).applyOffsets();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        ensureToolbar();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if ((mode == 0 || this.forceApplySystemWindowInsetTop) && systemWindowInsetTop > 0) {
            this.topInsetApplied = systemWindowInsetTop;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + systemWindowInsetTop, 1073741824));
        }
        if (!this.extraMultilineHeightEnabled || this.collapsingTextHelper.getMaxLines() <= 1) {
            collapsingToolbarLayout = this;
        } else {
            updateTitleFromToolbarIfNeeded();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.updateTextBounds(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int expandedLineCount = collapsingToolbarLayout.collapsingTextHelper.getExpandedLineCount();
            if (expandedLineCount > 1) {
                collapsingToolbarLayout.extraMultilineHeight = Math.round(collapsingToolbarLayout.collapsingTextHelper.getExpandedTextFullHeight()) * (expandedLineCount - 1);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + collapsingToolbarLayout.extraMultilineHeight, 1073741824));
            }
        }
        ViewGroup viewGroup = collapsingToolbarLayout.toolbar;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.toolbarDirectChild;
            if (view == null || view == collapsingToolbarLayout) {
                setMinimumHeight(getHeightWithMargins(viewGroup));
            } else {
                setMinimumHeight(getHeightWithMargins(view));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.contentScrim;
        if (drawable != null) {
            updateContentScrimBounds(drawable, i10, i11);
        }
    }

    public WindowInsetsCompat onWindowInsetChanged(@NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(this) ? windowInsetsCompat : null;
        if (!ObjectsCompat.equals(this.lastInsets, windowInsetsCompat2)) {
            this.lastInsets = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.consumeSystemWindowInsets();
    }

    public void setCollapsedTitleGravity(int i10) {
        this.collapsingTextHelper.setCollapsedTextGravity(i10);
    }

    public void setCollapsedTitleTextAppearance(@StyleRes int i10) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i10);
    }

    public void setCollapsedTitleTextColor(@ColorInt int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextSize(float f10) {
        this.collapsingTextHelper.setCollapsedTextSize(f10);
    }

    public void setCollapsedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTextHelper.setCollapsedTypeface(typeface);
    }

    public void setContentScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.contentScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.contentScrim = drawableMutate;
            if (drawableMutate != null) {
                updateContentScrimBounds(drawableMutate, getWidth(), getHeight());
                this.contentScrim.setCallback(this);
                this.contentScrim.setAlpha(this.scrimAlpha);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setContentScrimColor(@ColorInt int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(@DrawableRes int i10) {
        setContentScrim(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setExpandedTitleColor(@ColorInt int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        this.collapsingTextHelper.setExpandedTextGravity(i10);
    }

    public void setExpandedTitleMargin(int i10, int i11, int i12, int i13) {
        this.expandedMarginStart = i10;
        this.expandedMarginTop = i11;
        this.expandedMarginEnd = i12;
        this.expandedMarginBottom = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.expandedMarginBottom = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.expandedMarginEnd = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.expandedMarginStart = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.expandedMarginTop = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@StyleRes int i10) {
        this.collapsingTextHelper.setExpandedTextAppearance(i10);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTextHelper.setExpandedTextColor(colorStateList);
    }

    public void setExpandedTitleTextSize(float f10) {
        this.collapsingTextHelper.setExpandedTextSize(f10);
    }

    public void setExpandedTitleTypeface(@Nullable Typeface typeface) {
        this.collapsingTextHelper.setExpandedTypeface(typeface);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.extraMultilineHeightEnabled = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.forceApplySystemWindowInsetTop = z10;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i10) {
        this.collapsingTextHelper.setHyphenationFrequency(i10);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f10) {
        this.collapsingTextHelper.setLineSpacingAdd(f10);
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f10) {
        this.collapsingTextHelper.setLineSpacingMultiplier(f10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setMaxLines(int i10) {
        this.collapsingTextHelper.setMaxLines(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(z10);
    }

    public void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.scrimAlpha) {
            if (this.contentScrim != null && (viewGroup = this.toolbar) != null) {
                ViewCompat.postInvalidateOnAnimation(viewGroup);
            }
            this.scrimAlpha = i10;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setScrimAnimationDuration(@IntRange(from = 0) long j10) {
        this.scrimAnimationDuration = j10;
    }

    public void setScrimVisibleHeightTrigger(@IntRange(from = 0) int i10) {
        if (this.scrimVisibleHeightTrigger != i10) {
            this.scrimVisibleHeightTrigger = i10;
            updateScrimVisibility();
        }
    }

    public void setScrimsShown(boolean z10) {
        setScrimsShown(z10, ViewCompat.isLaidOut(this) && !isInEditMode());
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.collapsingTextHelper.setStaticLayoutBuilderConfigurer(staticLayoutBuilderConfigurer);
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        Drawable drawable2 = this.statusBarScrim;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.statusBarScrim = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.statusBarScrim.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.statusBarScrim, ViewCompat.getLayoutDirection(this));
                this.statusBarScrim.setVisible(getVisibility() == 0, false);
                this.statusBarScrim.setCallback(this);
                this.statusBarScrim.setAlpha(this.scrimAlpha);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarScrimColor(@ColorInt int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(@DrawableRes int i10) {
        setStatusBarScrim(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.collapsingTextHelper.setText(charSequence);
        updateContentDescriptionFromTitle();
    }

    public void setTitleCollapseMode(int i10) {
        this.titleCollapseMode = i10;
        boolean zIsTitleCollapseFadeMode = isTitleCollapseFadeMode();
        this.collapsingTextHelper.setFadeModeEnabled(zIsTitleCollapseFadeMode);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            disableLiftOnScrollIfNeeded((AppBarLayout) parent);
        }
        if (zIsTitleCollapseFadeMode && this.contentScrim == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.collapsingTextHelper.setTitleTextEllipsize(truncateAt);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.collapsingTitleEnabled) {
            this.collapsingTitleEnabled = z10;
            updateContentDescriptionFromTitle();
            updateDummyView();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.collapsingTextHelper.setPositionInterpolator(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.statusBarScrim;
        if (drawable != null && drawable.isVisible() != z10) {
            this.statusBarScrim.setVisible(z10, false);
        }
        Drawable drawable2 = this.contentScrim;
        if (drawable2 == null || drawable2.isVisible() == z10) {
            return;
        }
        this.contentScrim.setVisible(z10, false);
    }

    public final void updateScrimVisibility() {
        if (this.contentScrim == null && this.statusBarScrim == null) {
            return;
        }
        setScrimsShown(getHeight() + this.currentOffset < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.contentScrim || drawable == this.statusBarScrim;
    }

    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C6339R.attr.collapsingToolbarLayoutStyle);
    }

    private void updateContentScrimBounds(@NonNull Drawable drawable, @Nullable View view, int i10, int i11) {
        if (isTitleCollapseFadeMode() && view != null && this.collapsingTitleEnabled) {
            i11 = view.getBottom();
        }
        drawable.setBounds(0, 0, i10, i11);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
    }

    public void setScrimsShown(boolean z10, boolean z11) {
        if (this.scrimsAreShown != z10) {
            if (z11) {
                animateScrim(z10 ? 255 : 0);
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.scrimsAreShown = z10;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.refreshToolbar = true;
        this.tmpRect = new Rect();
        this.scrimVisibleHeightTrigger = -1;
        this.topInsetApplied = 0;
        this.extraMultilineHeight = 0;
        Context context2 = getContext();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        collapsingTextHelper.setTextSizeInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
        collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(false);
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C6339R.styleable.CollapsingToolbarLayout, i10, i11, new int[0]);
        collapsingTextHelper.setExpandedTextGravity(typedArrayObtainStyledAttributes.getInt(C6339R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        collapsingTextHelper.setCollapsedTextGravity(typedArrayObtainStyledAttributes.getInt(C6339R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6339R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.expandedMarginBottom = dimensionPixelSize;
        this.expandedMarginEnd = dimensionPixelSize;
        this.expandedMarginTop = dimensionPixelSize;
        this.expandedMarginStart = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(C6339R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.expandedMarginStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6339R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6339R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.expandedMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6339R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6339R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.expandedMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6339R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6339R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.expandedMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6339R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.collapsingTitleEnabled = typedArrayObtainStyledAttributes.getBoolean(C6339R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(C6339R.styleable.CollapsingToolbarLayout_title));
        collapsingTextHelper.setExpandedTextAppearance(C6339R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        collapsingTextHelper.setCollapsedTextAppearance(C0216R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(C6339R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            collapsingTextHelper.setExpandedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C6339R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6339R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            collapsingTextHelper.setCollapsedTextAppearance(typedArrayObtainStyledAttributes.getResourceId(C6339R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6339R.styleable.CollapsingToolbarLayout_titleTextEllipsize)) {
            setTitleEllipsize(convertEllipsizeToTruncateAt(typedArrayObtainStyledAttributes.getInt(C6339R.styleable.CollapsingToolbarLayout_titleTextEllipsize, -1)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6339R.styleable.CollapsingToolbarLayout_expandedTitleTextColor)) {
            collapsingTextHelper.setExpandedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C6339R.styleable.CollapsingToolbarLayout_expandedTitleTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6339R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor)) {
            collapsingTextHelper.setCollapsedTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C6339R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor));
        }
        this.scrimVisibleHeightTrigger = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6339R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayObtainStyledAttributes.hasValue(C6339R.styleable.CollapsingToolbarLayout_maxLines)) {
            collapsingTextHelper.setMaxLines(typedArrayObtainStyledAttributes.getInt(C6339R.styleable.CollapsingToolbarLayout_maxLines, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C6339R.styleable.CollapsingToolbarLayout_titlePositionInterpolator)) {
            collapsingTextHelper.setPositionInterpolator(android.view.animation.AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(C6339R.styleable.CollapsingToolbarLayout_titlePositionInterpolator, 0)));
        }
        this.scrimAnimationDuration = typedArrayObtainStyledAttributes.getInt(C6339R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.scrimAnimationFadeInInterpolator = MotionUtils.resolveThemeInterpolator(context2, C6339R.attr.motionEasingStandardInterpolator, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        this.scrimAnimationFadeOutInterpolator = MotionUtils.resolveThemeInterpolator(context2, C6339R.attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(C6339R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(C6339R.styleable.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(C6339R.styleable.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.toolbarId = typedArrayObtainStyledAttributes.getResourceId(C6339R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        this.forceApplySystemWindowInsetTop = typedArrayObtainStyledAttributes.getBoolean(C6339R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.extraMultilineHeightEnabled = typedArrayObtainStyledAttributes.getBoolean(C6339R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
                return CollapsingToolbarLayout.this.onWindowInsetChanged(windowInsetsCompat);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int COLLAPSE_MODE_OFF = 0;
        public static final int COLLAPSE_MODE_PARALLAX = 2;
        public static final int COLLAPSE_MODE_PIN = 1;
        private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5f;
        int collapseMode;
        float parallaxMult;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6339R.styleable.CollapsingToolbarLayout_Layout);
            this.collapseMode = typedArrayObtainStyledAttributes.getInt(C6339R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            setParallaxMultiplier(typedArrayObtainStyledAttributes.getFloat(C6339R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public int getCollapseMode() {
            return this.collapseMode;
        }

        public float getParallaxMultiplier() {
            return this.parallaxMult;
        }

        public void setCollapseMode(int i10) {
            this.collapseMode = i10;
        }

        public void setParallaxMultiplier(float f10) {
            this.parallaxMult = f10;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(int i10, int i11, int i12) {
            super(i10, i11, i12);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
        }

        @RequiresApi(19)
        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((FrameLayout.LayoutParams) layoutParams);
            this.collapseMode = 0;
            this.parallaxMult = 0.5f;
            this.collapseMode = layoutParams.collapseMode;
            this.parallaxMult = layoutParams.parallaxMult;
        }
    }
}
