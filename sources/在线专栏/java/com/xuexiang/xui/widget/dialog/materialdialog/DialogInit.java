package com.xuexiang.xui.widget.dialog.materialdialog;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.XUIKeyboardScrollView;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDAdapter;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDTintHelper;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.xuexiang.xui.widget.progress.materialprogressbar.HorizontalProgressDrawable;
import com.xuexiang.xui.widget.progress.materialprogressbar.IndeterminateCircularProgressDrawable;
import com.xuexiang.xui.widget.progress.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
class DialogInit {
    DialogInit() {
    }

    private static void fixCanvasScalingWhenHardwareAccelerated(ProgressBar progressBar) {
    }

    static int getInflateLayout(MaterialDialog.Builder builder) {
        return builder.customView != null ? C2042R.layout.xmd_layout_dialog_custom : (builder.items == null && builder.adapter == null) ? builder.progress > -2 ? C2042R.layout.xmd_layout_dialog_progress : builder.indeterminateProgress ? builder.indeterminateIsHorizontalProgress ? C2042R.layout.xmd_layout_dialog_progress_indeterminate_horizontal : C2042R.layout.xmd_layout_dialog_progress_indeterminate : builder.inputCallback != null ? builder.checkBoxPrompt != null ? C2042R.layout.xmd_layout_dialog_input_check : C2042R.layout.xmd_layout_dialog_input : builder.checkBoxPrompt != null ? C2042R.layout.xmd_layout_dialog_basic_check : C2042R.layout.xmd_layout_dialog_basic : builder.checkBoxPrompt != null ? C2042R.layout.xmd_layout_dialog_list_check : C2042R.layout.xmd_layout_dialog_list;
    }

    static int getTheme(MaterialDialog.Builder builder) {
        int i4 = builder.customTheme;
        if (i4 != -1) {
            return i4;
        }
        Context context = builder.context;
        int i5 = C2042R.attr.md_dark_theme;
        Theme theme = builder.theme;
        Theme theme2 = Theme.DARK;
        boolean zResolveBoolean = ThemeUtils.resolveBoolean(context, i5, theme == theme2);
        if (!zResolveBoolean) {
            theme2 = Theme.LIGHT;
        }
        builder.theme = theme2;
        return zResolveBoolean ? C2042R.style.MD_Dark : C2042R.style.MD_Light;
    }

    public static void init(MaterialDialog materialDialog) {
        MaterialDialog.Builder builder = materialDialog.builder;
        materialDialog.setCancelable(builder.cancelable);
        materialDialog.setCanceledOnTouchOutside(builder.canceledOnTouchOutside);
        if (builder.backgroundColor == 0) {
            builder.backgroundColor = ThemeUtils.resolveColor(builder.context, C2042R.attr.md_background_color, ThemeUtils.resolveColor(materialDialog.getContext(), C2042R.attr.colorBackgroundFloating));
        }
        if (builder.backgroundColor != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(builder.context.getResources().getDimension(C2042R.dimen.md_bg_corner_radius));
            gradientDrawable.setColor(builder.backgroundColor);
            materialDialog.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!builder.positiveColorSet) {
            builder.positiveColor = ThemeUtils.resolveActionTextColorStateList(builder.context, C2042R.attr.md_positive_color, builder.positiveColor);
        }
        if (!builder.neutralColorSet) {
            builder.neutralColor = ThemeUtils.resolveActionTextColorStateList(builder.context, C2042R.attr.md_neutral_color, builder.neutralColor);
        }
        if (!builder.negativeColorSet) {
            builder.negativeColor = ThemeUtils.resolveActionTextColorStateList(builder.context, C2042R.attr.md_negative_color, builder.negativeColor);
        }
        if (!builder.widgetColorSet) {
            builder.widgetColor = ThemeUtils.resolveColor(builder.context, C2042R.attr.md_widget_color, builder.widgetColor);
        }
        if (!builder.titleColorSet) {
            builder.titleColor = ThemeUtils.resolveColor(builder.context, C2042R.attr.md_title_color, ThemeUtils.resolveColor(materialDialog.getContext(), R.attr.textColorPrimary));
        }
        if (!builder.contentColorSet) {
            builder.contentColor = ThemeUtils.resolveColor(builder.context, C2042R.attr.md_content_color, ThemeUtils.resolveColor(materialDialog.getContext(), R.attr.textColorSecondary));
        }
        if (!builder.itemColorSet) {
            builder.itemColor = ThemeUtils.resolveColor(builder.context, C2042R.attr.md_item_color, builder.contentColor);
        }
        materialDialog.title = (TextView) materialDialog.view.findViewById(C2042R.id.md_title);
        materialDialog.icon = (ImageView) materialDialog.view.findViewById(C2042R.id.md_icon);
        materialDialog.titleFrame = materialDialog.view.findViewById(C2042R.id.md_titleFrame);
        materialDialog.content = (TextView) materialDialog.view.findViewById(C2042R.id.md_content);
        materialDialog.recyclerView = (RecyclerView) materialDialog.view.findViewById(C2042R.id.md_contentRecyclerView);
        materialDialog.checkBoxPrompt = (CheckBox) materialDialog.view.findViewById(C2042R.id.md_promptCheckbox);
        materialDialog.positiveButton = (MDButton) materialDialog.view.findViewById(C2042R.id.md_buttonDefaultPositive);
        materialDialog.neutralButton = (MDButton) materialDialog.view.findViewById(C2042R.id.md_buttonDefaultNeutral);
        materialDialog.negativeButton = (MDButton) materialDialog.view.findViewById(C2042R.id.md_buttonDefaultNegative);
        if (builder.inputCallback != null && builder.positiveText == null) {
            builder.positiveText = builder.context.getText(R.string.ok);
        }
        materialDialog.positiveButton.setVisibility(builder.positiveText != null ? 0 : 8);
        materialDialog.neutralButton.setVisibility(builder.neutralText != null ? 0 : 8);
        materialDialog.negativeButton.setVisibility(builder.negativeText != null ? 0 : 8);
        materialDialog.positiveButton.setFocusable(true);
        materialDialog.neutralButton.setFocusable(true);
        materialDialog.negativeButton.setFocusable(true);
        if (builder.positiveFocus) {
            materialDialog.positiveButton.requestFocus();
        }
        if (builder.neutralFocus) {
            materialDialog.neutralButton.requestFocus();
        }
        if (builder.negativeFocus) {
            materialDialog.negativeButton.requestFocus();
        }
        if (builder.icon != null) {
            materialDialog.icon.setVisibility(0);
            materialDialog.icon.setImageDrawable(builder.icon);
        } else {
            Drawable drawableResolveDrawable = ThemeUtils.resolveDrawable(builder.context, C2042R.attr.md_icon);
            if (drawableResolveDrawable != null) {
                materialDialog.icon.setVisibility(0);
                materialDialog.icon.setImageDrawable(drawableResolveDrawable);
            } else {
                materialDialog.icon.setVisibility(8);
            }
        }
        int dimensionPixelSize = builder.maxIconSize;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = ThemeUtils.resolveDimension(builder.context, C2042R.attr.md_icon_max_size);
        }
        if (builder.limitIconToDefaultSize || ThemeUtils.resolveBoolean(builder.context, C2042R.attr.md_icon_limit_icon_to_default_size)) {
            dimensionPixelSize = builder.context.getResources().getDimensionPixelSize(C2042R.dimen.default_md_icon_max_size);
        }
        if (dimensionPixelSize > -1) {
            materialDialog.icon.setAdjustViewBounds(true);
            materialDialog.icon.setMaxHeight(dimensionPixelSize);
            materialDialog.icon.setMaxWidth(dimensionPixelSize);
            materialDialog.icon.requestLayout();
        }
        if (!builder.dividerColorSet) {
            builder.dividerColor = ThemeUtils.resolveColor(builder.context, C2042R.attr.md_divider_color, ThemeUtils.resolveColor(materialDialog.getContext(), C2042R.attr.md_divider));
        }
        materialDialog.view.setDividerColor(builder.dividerColor);
        TextView textView = materialDialog.title;
        if (textView != null) {
            materialDialog.setTypeface(textView, builder.mediumFont);
            materialDialog.title.setTextColor(builder.titleColor);
            materialDialog.title.setGravity(builder.titleGravity.getGravityInt());
            materialDialog.title.setTextAlignment(builder.titleGravity.getTextAlignment());
            CharSequence charSequence = builder.title;
            if (charSequence == null) {
                materialDialog.titleFrame.setVisibility(8);
            } else {
                materialDialog.title.setText(charSequence);
                materialDialog.titleFrame.setVisibility(0);
            }
        }
        TextView textView2 = materialDialog.content;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            materialDialog.setTypeface(materialDialog.content, builder.regularFont);
            materialDialog.content.setLineSpacing(IGoodView.DEFAULT_TO_ALPHA, builder.contentLineSpacingMultiplier);
            ColorStateList colorStateList = builder.linkColor;
            if (colorStateList == null) {
                materialDialog.content.setLinkTextColor(ThemeUtils.resolveColor(materialDialog.getContext(), R.attr.textColorPrimary));
            } else {
                materialDialog.content.setLinkTextColor(colorStateList);
            }
            materialDialog.content.setTextColor(builder.contentColor);
            materialDialog.content.setGravity(builder.contentGravity.getGravityInt());
            materialDialog.content.setTextAlignment(builder.contentGravity.getTextAlignment());
            CharSequence charSequence2 = builder.content;
            if (charSequence2 != null) {
                materialDialog.content.setText(charSequence2);
                materialDialog.content.setVisibility(0);
            } else {
                materialDialog.content.setVisibility(8);
            }
        }
        CheckBox checkBox = materialDialog.checkBoxPrompt;
        if (checkBox != null) {
            checkBox.setText(builder.checkBoxPrompt);
            materialDialog.checkBoxPrompt.setChecked(builder.checkBoxPromptInitiallyChecked);
            materialDialog.checkBoxPrompt.setOnCheckedChangeListener(builder.checkBoxPromptListener);
            materialDialog.setTypeface(materialDialog.checkBoxPrompt, builder.regularFont);
            materialDialog.checkBoxPrompt.setTextColor(builder.contentColor);
            MDTintHelper.setTint(materialDialog.checkBoxPrompt, builder.widgetColor);
        }
        materialDialog.view.setButtonGravity(builder.buttonsGravity);
        materialDialog.view.setButtonStackedGravity(builder.btnStackedGravity);
        materialDialog.view.setStackingBehavior(builder.stackingBehavior);
        boolean zResolveBoolean = ThemeUtils.resolveBoolean(builder.context, R.attr.textAllCaps, true);
        if (zResolveBoolean) {
            zResolveBoolean = ThemeUtils.resolveBoolean(builder.context, C2042R.attr.textAllCaps, true);
        }
        MDButton mDButton = materialDialog.positiveButton;
        materialDialog.setTypeface(mDButton, builder.mediumFont);
        mDButton.setAllCapsCompat(zResolveBoolean);
        mDButton.setText(builder.positiveText);
        mDButton.setTextColor(builder.positiveColor);
        MDButton mDButton2 = materialDialog.positiveButton;
        DialogAction dialogAction = DialogAction.POSITIVE;
        mDButton2.setStackedSelector(materialDialog.getButtonSelector(dialogAction, true));
        materialDialog.positiveButton.setDefaultSelector(materialDialog.getButtonSelector(dialogAction, false));
        materialDialog.positiveButton.setTag(dialogAction);
        materialDialog.positiveButton.setOnClickListener(materialDialog);
        materialDialog.positiveButton.setVisibility(0);
        MDButton mDButton3 = materialDialog.negativeButton;
        materialDialog.setTypeface(mDButton3, builder.mediumFont);
        mDButton3.setAllCapsCompat(zResolveBoolean);
        mDButton3.setText(builder.negativeText);
        mDButton3.setTextColor(builder.negativeColor);
        MDButton mDButton4 = materialDialog.negativeButton;
        DialogAction dialogAction2 = DialogAction.NEGATIVE;
        mDButton4.setStackedSelector(materialDialog.getButtonSelector(dialogAction2, true));
        materialDialog.negativeButton.setDefaultSelector(materialDialog.getButtonSelector(dialogAction2, false));
        materialDialog.negativeButton.setTag(dialogAction2);
        materialDialog.negativeButton.setOnClickListener(materialDialog);
        materialDialog.negativeButton.setVisibility(0);
        MDButton mDButton5 = materialDialog.neutralButton;
        materialDialog.setTypeface(mDButton5, builder.mediumFont);
        mDButton5.setAllCapsCompat(zResolveBoolean);
        mDButton5.setText(builder.neutralText);
        mDButton5.setTextColor(builder.neutralColor);
        MDButton mDButton6 = materialDialog.neutralButton;
        DialogAction dialogAction3 = DialogAction.NEUTRAL;
        mDButton6.setStackedSelector(materialDialog.getButtonSelector(dialogAction3, true));
        materialDialog.neutralButton.setDefaultSelector(materialDialog.getButtonSelector(dialogAction3, false));
        materialDialog.neutralButton.setTag(dialogAction3);
        materialDialog.neutralButton.setOnClickListener(materialDialog);
        materialDialog.neutralButton.setVisibility(0);
        if (builder.listCallbackMultiChoice != null) {
            materialDialog.selectedIndicesList = new ArrayList();
        }
        if (materialDialog.recyclerView != null) {
            Object obj = builder.adapter;
            if (obj == null) {
                if (builder.listCallbackSingleChoice != null) {
                    materialDialog.listType = MaterialDialog.ListType.SINGLE;
                } else if (builder.listCallbackMultiChoice != null) {
                    materialDialog.listType = MaterialDialog.ListType.MULTI;
                    if (builder.selectedIndices != null) {
                        materialDialog.selectedIndicesList = new ArrayList(Arrays.asList(builder.selectedIndices));
                        builder.selectedIndices = null;
                    }
                } else {
                    materialDialog.listType = MaterialDialog.ListType.REGULAR;
                }
                builder.adapter = new DefaultRvAdapter(materialDialog, MaterialDialog.ListType.getLayoutForType(materialDialog.listType));
            } else if (obj instanceof MDAdapter) {
                ((MDAdapter) obj).setDialog(materialDialog);
            }
        }
        setupProgressDialog(materialDialog);
        setupInputDialog(materialDialog);
        if (builder.customView != null) {
            ((MDRootLayout) materialDialog.view.findViewById(C2042R.id.md_root)).noTitleNoPadding();
            FrameLayout frameLayout = (FrameLayout) materialDialog.view.findViewById(C2042R.id.md_customViewFrame);
            materialDialog.customViewFrame = frameLayout;
            View view = builder.customView;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (builder.wrapCustomViewInScroll) {
                Resources resources = materialDialog.getContext().getResources();
                int iResolveDimension = ThemeUtils.resolveDimension(materialDialog.getContext(), C2042R.attr.md_dialog_frame_margin, C2042R.dimen.default_md_dialog_frame_margin);
                XUIKeyboardScrollView xUIKeyboardScrollView = new XUIKeyboardScrollView(materialDialog.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C2042R.dimen.md_content_padding_top);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(C2042R.dimen.md_content_padding_bottom);
                xUIKeyboardScrollView.setClipToPadding(false);
                if (view instanceof EditText) {
                    xUIKeyboardScrollView.setPadding(iResolveDimension, dimensionPixelSize2, iResolveDimension, dimensionPixelSize3);
                } else {
                    xUIKeyboardScrollView.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(iResolveDimension, 0, iResolveDimension, 0);
                }
                xUIKeyboardScrollView.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = xUIKeyboardScrollView;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = builder.showListener;
        if (onShowListener != null) {
            materialDialog.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = builder.cancelListener;
        if (onCancelListener != null) {
            materialDialog.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = builder.dismissListener;
        if (onDismissListener != null) {
            materialDialog.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = builder.keyListener;
        if (onKeyListener != null) {
            materialDialog.setOnKeyListener(onKeyListener);
        }
        materialDialog.setOnShowListenerInternal();
        materialDialog.invalidateList();
        materialDialog.setViewInternal(materialDialog.view);
        materialDialog.checkIfListInitScroll();
        Display defaultDisplay = materialDialog.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i4 = point.x;
        int i5 = point.y;
        int iResolveDimension2 = ThemeUtils.resolveDimension(builder.context, C2042R.attr.md_dialog_vertical_margin, ResUtils.getDimensionPixelSize(C2042R.dimen.default_md_dialog_vertical_margin_phone));
        int iResolveDimension3 = ThemeUtils.resolveDimension(builder.context, C2042R.attr.md_dialog_horizontal_margin, ResUtils.getDimensionPixelSize(C2042R.dimen.default_md_dialog_horizontal_margin_phone));
        materialDialog.view.setMaxHeight(i5 - (iResolveDimension2 * 2));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(materialDialog.getWindow().getAttributes());
        layoutParams.width = Math.min(ThemeUtils.resolveDimension(builder.context, C2042R.attr.md_dialog_max_width), i4 - (iResolveDimension3 * 2));
        materialDialog.getWindow().setAttributes(layoutParams);
    }

    private static void setupInputDialog(MaterialDialog materialDialog) {
        MaterialDialog.Builder builder = materialDialog.builder;
        EditText editText = (EditText) materialDialog.view.findViewById(R.id.input);
        materialDialog.input = editText;
        if (editText == null) {
            return;
        }
        materialDialog.setTypeface(editText, builder.regularFont);
        CharSequence charSequence = builder.inputPrefill;
        if (charSequence != null) {
            materialDialog.input.setText(charSequence);
        }
        materialDialog.setInternalInputCallback();
        materialDialog.input.setHint(builder.inputHint);
        materialDialog.input.setSingleLine();
        materialDialog.input.setTextColor(builder.contentColor);
        materialDialog.input.setHintTextColor(ThemeUtils.adjustAlpha(builder.contentColor, 0.3f));
        MDTintHelper.setTint(materialDialog.input, materialDialog.builder.widgetColor);
        int i4 = builder.inputType;
        if (i4 != -1) {
            materialDialog.input.setInputType(i4);
            int i5 = builder.inputType;
            if (i5 != 144 && (i5 & 128) == 128) {
                materialDialog.input.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        TextView textView = (TextView) materialDialog.view.findViewById(C2042R.id.md_minMax);
        materialDialog.inputMinMax = textView;
        if (builder.inputMinLength > 0 || builder.inputMaxLength > -1) {
            materialDialog.invalidateInputMinMaxIndicator(materialDialog.input.getText().toString().length(), !builder.inputAllowEmpty);
        } else {
            textView.setVisibility(8);
            materialDialog.inputMinMax = null;
        }
    }

    private static void setupProgressDialog(MaterialDialog materialDialog) {
        MaterialDialog.Builder builder = materialDialog.builder;
        if (builder.indeterminateProgress || builder.progress > -2) {
            ProgressBar progressBar = (ProgressBar) materialDialog.view.findViewById(R.id.progress);
            materialDialog.progressBar = progressBar;
            if (progressBar == null) {
                return;
            }
            if (!builder.indeterminateProgress) {
                HorizontalProgressDrawable horizontalProgressDrawable = new HorizontalProgressDrawable(builder.getContext());
                horizontalProgressDrawable.setTint(builder.widgetColor);
                materialDialog.progressBar.setProgressDrawable(horizontalProgressDrawable);
                materialDialog.progressBar.setIndeterminateDrawable(horizontalProgressDrawable);
            } else if (builder.indeterminateIsHorizontalProgress) {
                IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(builder.getContext());
                indeterminateHorizontalProgressDrawable.setTint(builder.widgetColor);
                materialDialog.progressBar.setProgressDrawable(indeterminateHorizontalProgressDrawable);
                materialDialog.progressBar.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
            } else {
                IndeterminateCircularProgressDrawable indeterminateCircularProgressDrawable = new IndeterminateCircularProgressDrawable(builder.getContext());
                indeterminateCircularProgressDrawable.setTint(builder.widgetColor);
                materialDialog.progressBar.setProgressDrawable(indeterminateCircularProgressDrawable);
                materialDialog.progressBar.setIndeterminateDrawable(indeterminateCircularProgressDrawable);
            }
            boolean z3 = builder.indeterminateProgress;
            if (!z3 || builder.indeterminateIsHorizontalProgress) {
                materialDialog.progressBar.setIndeterminate(z3 && builder.indeterminateIsHorizontalProgress);
                materialDialog.progressBar.setProgress(0);
                materialDialog.progressBar.setMax(builder.progressMax);
                TextView textView = (TextView) materialDialog.view.findViewById(C2042R.id.md_label);
                materialDialog.progressLabel = textView;
                if (textView != null) {
                    materialDialog.setTypeface(textView, builder.mediumFont);
                    materialDialog.progressLabel.setText(builder.progressPercentFormat.format(0L));
                }
                TextView textView2 = (TextView) materialDialog.view.findViewById(C2042R.id.md_minMax);
                materialDialog.progressMinMax = textView2;
                if (textView2 != null) {
                    materialDialog.setTypeface(textView2, builder.regularFont);
                    if (builder.showMinMax) {
                        materialDialog.progressMinMax.setVisibility(0);
                        materialDialog.progressMinMax.setText(String.format(builder.progressNumberFormat, 0, Integer.valueOf(builder.progressMax)));
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) materialDialog.progressBar.getLayoutParams();
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = 0;
                    } else {
                        materialDialog.progressMinMax.setVisibility(8);
                    }
                } else {
                    builder.showMinMax = false;
                }
            }
        }
        ProgressBar progressBar2 = materialDialog.progressBar;
        if (progressBar2 != null) {
            fixCanvasScalingWhenHardwareAccelerated(progressBar2);
        }
    }
}
