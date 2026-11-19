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
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$style;
import com.xuexiang.xui.utils.AbstractC6480e;
import com.xuexiang.xui.utils.AbstractC6482g;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;
import com.xuexiang.xui.widget.progress.materialprogressbar.C6581l;
import com.xuexiang.xui.widget.progress.materialprogressbar.IndeterminateCircularProgressDrawable;
import com.xuexiang.xui.widget.progress.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import p005a3.AbstractC0019b;
import p005a3.InterfaceC0018a;
import p208q2.C8882a;

/* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6514b {
    /* renamed from: a */
    public static void m5610a(ProgressBar progressBar) {
    }

    /* renamed from: b */
    public static int m5611b(MaterialDialog.C6512f c6512f) {
        return c6512f.f6170s != null ? R$layout.xmd_layout_dialog_custom : (c6512f.f6156l == null && c6512f.f6123P == null) ? c6512f.f6139c0 > -2 ? R$layout.xmd_layout_dialog_progress : c6512f.f6135a0 ? c6512f.f6171s0 ? R$layout.xmd_layout_dialog_progress_indeterminate_horizontal : R$layout.xmd_layout_dialog_progress_indeterminate : c6512f.f6161n0 != null ? R$layout.xmd_layout_dialog_basic_check : R$layout.xmd_layout_dialog_basic : c6512f.f6161n0 != null ? R$layout.xmd_layout_dialog_list_check : R$layout.xmd_layout_dialog_list;
    }

    /* renamed from: c */
    public static int m5612c(MaterialDialog.C6512f c6512f) {
        int i10 = c6512f.f6105C;
        if (i10 != -1) {
            return i10;
        }
        Context context = c6512f.f6134a;
        int i11 = R$attr.md_dark_theme;
        Theme theme = c6512f.f6103B;
        Theme theme2 = Theme.DARK;
        boolean zM5381l = AbstractC6482g.m5381l(context, i11, theme == theme2);
        if (!zM5381l) {
            theme2 = Theme.LIGHT;
        }
        c6512f.f6103B = theme2;
        return zM5381l ? R$style.MD_Dark : R$style.MD_Light;
    }

    /* renamed from: d */
    public static void m5613d(MaterialDialog materialDialog) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, SecurityException, IllegalArgumentException {
        MaterialDialog.C6512f c6512f = materialDialog.f6068c;
        materialDialog.setCancelable(c6512f.f6107D);
        materialDialog.setCanceledOnTouchOutside(c6512f.f6109E);
        if (c6512f.f6132Y == 0) {
            c6512f.f6132Y = AbstractC6482g.m5383n(c6512f.f6134a, R$attr.md_background_color, AbstractC6482g.m5382m(materialDialog.getContext(), R$attr.colorBackgroundFloating));
        }
        if (c6512f.f6132Y != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(c6512f.f6134a.getResources().getDimension(R$dimen.md_bg_corner_radius));
            gradientDrawable.setColor(c6512f.f6132Y);
            materialDialog.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!c6512f.f6179w0) {
            c6512f.f6176v = AbstractC6482g.m5379j(c6512f.f6134a, R$attr.md_positive_color, c6512f.f6176v);
        }
        if (!c6512f.f6181x0) {
            c6512f.f6180x = AbstractC6482g.m5379j(c6512f.f6134a, R$attr.md_neutral_color, c6512f.f6180x);
        }
        if (!c6512f.f6183y0) {
            c6512f.f6178w = AbstractC6482g.m5379j(c6512f.f6134a, R$attr.md_negative_color, c6512f.f6178w);
        }
        if (!c6512f.f6185z0) {
            c6512f.f6172t = AbstractC6482g.m5383n(c6512f.f6134a, R$attr.md_widget_color, c6512f.f6172t);
        }
        if (!c6512f.f6173t0) {
            c6512f.f6150i = AbstractC6482g.m5383n(c6512f.f6134a, R$attr.md_title_color, AbstractC6482g.m5382m(materialDialog.getContext(), R.attr.textColorPrimary));
        }
        if (!c6512f.f6175u0) {
            c6512f.f6152j = AbstractC6482g.m5383n(c6512f.f6134a, R$attr.md_content_color, AbstractC6482g.m5382m(materialDialog.getContext(), R.attr.textColorSecondary));
        }
        if (!c6512f.f6177v0) {
            c6512f.f6133Z = AbstractC6482g.m5383n(c6512f.f6134a, R$attr.md_item_color, c6512f.f6152j);
        }
        materialDialog.f6071f = (TextView) materialDialog.f17831a.findViewById(R$id.md_title);
        materialDialog.f6070e = (ImageView) materialDialog.f17831a.findViewById(R$id.md_icon);
        materialDialog.f6075j = materialDialog.f17831a.findViewById(R$id.md_titleFrame);
        materialDialog.f6072g = (TextView) materialDialog.f17831a.findViewById(R$id.md_content);
        materialDialog.f6074i = (RecyclerView) materialDialog.f17831a.findViewById(R$id.md_contentRecyclerView);
        materialDialog.f6081p = (CheckBox) materialDialog.f17831a.findViewById(R$id.md_promptCheckbox);
        materialDialog.f6082q = (MDButton) materialDialog.f17831a.findViewById(R$id.md_buttonDefaultPositive);
        materialDialog.f6083r = (MDButton) materialDialog.f17831a.findViewById(R$id.md_buttonDefaultNeutral);
        materialDialog.f6084s = (MDButton) materialDialog.f17831a.findViewById(R$id.md_buttonDefaultNegative);
        materialDialog.f6082q.setVisibility(c6512f.f6158m != null ? 0 : 8);
        materialDialog.f6083r.setVisibility(c6512f.f6160n != null ? 0 : 8);
        materialDialog.f6084s.setVisibility(c6512f.f6162o != null ? 0 : 8);
        materialDialog.f6082q.setFocusable(true);
        materialDialog.f6083r.setFocusable(true);
        materialDialog.f6084s.setFocusable(true);
        if (c6512f.f6164p) {
            materialDialog.f6082q.requestFocus();
        }
        if (c6512f.f6166q) {
            materialDialog.f6083r.requestFocus();
        }
        if (c6512f.f6168r) {
            materialDialog.f6084s.requestFocus();
        }
        if (c6512f.f6120M != null) {
            materialDialog.f6070e.setVisibility(0);
            materialDialog.f6070e.setImageDrawable(c6512f.f6120M);
        } else {
            Drawable drawableM5386q = AbstractC6482g.m5386q(c6512f.f6134a, R$attr.md_icon);
            if (drawableM5386q != null) {
                materialDialog.f6070e.setVisibility(0);
                materialDialog.f6070e.setImageDrawable(drawableM5386q);
            } else {
                materialDialog.f6070e.setVisibility(8);
            }
        }
        int dimensionPixelSize = c6512f.f6122O;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = AbstractC6482g.m5384o(c6512f.f6134a, R$attr.md_icon_max_size);
        }
        if (c6512f.f6121N || AbstractC6482g.m5380k(c6512f.f6134a, R$attr.md_icon_limit_icon_to_default_size)) {
            dimensionPixelSize = c6512f.f6134a.getResources().getDimensionPixelSize(R$dimen.default_md_icon_max_size);
        }
        if (dimensionPixelSize > -1) {
            materialDialog.f6070e.setAdjustViewBounds(true);
            materialDialog.f6070e.setMaxHeight(dimensionPixelSize);
            materialDialog.f6070e.setMaxWidth(dimensionPixelSize);
            materialDialog.f6070e.requestLayout();
        }
        if (!c6512f.f6102A0) {
            c6512f.f6131X = AbstractC6482g.m5383n(c6512f.f6134a, R$attr.md_divider_color, AbstractC6482g.m5382m(materialDialog.getContext(), R$attr.md_divider));
        }
        materialDialog.f17831a.setDividerColor(c6512f.f6131X);
        TextView textView = materialDialog.f6071f;
        if (textView != null) {
            materialDialog.m5590r(textView, c6512f.f6119L);
            materialDialog.f6071f.setTextColor(c6512f.f6150i);
            materialDialog.f6071f.setGravity(c6512f.f6138c.m5573a());
            materialDialog.f6071f.setTextAlignment(c6512f.f6138c.m5574f());
            CharSequence charSequence = c6512f.f6136b;
            if (charSequence == null) {
                materialDialog.f6075j.setVisibility(8);
            } else {
                materialDialog.f6071f.setText(charSequence);
                materialDialog.f6075j.setVisibility(0);
            }
        }
        TextView textView2 = materialDialog.f6072g;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            materialDialog.m5590r(materialDialog.f6072g, c6512f.f6118K);
            materialDialog.f6072g.setLineSpacing(0.0f, c6512f.f6111F);
            ColorStateList colorStateList = c6512f.f6182y;
            if (colorStateList == null) {
                materialDialog.f6072g.setLinkTextColor(AbstractC6482g.m5382m(materialDialog.getContext(), R.attr.textColorPrimary));
            } else {
                materialDialog.f6072g.setLinkTextColor(colorStateList);
            }
            materialDialog.f6072g.setTextColor(c6512f.f6152j);
            materialDialog.f6072g.setGravity(c6512f.f6140d.m5573a());
            materialDialog.f6072g.setTextAlignment(c6512f.f6140d.m5574f());
            CharSequence charSequence2 = c6512f.f6154k;
            if (charSequence2 != null) {
                materialDialog.f6072g.setText(charSequence2);
                materialDialog.f6072g.setVisibility(0);
            } else {
                materialDialog.f6072g.setVisibility(8);
            }
        }
        CheckBox checkBox = materialDialog.f6081p;
        if (checkBox != null) {
            checkBox.setText(c6512f.f6161n0);
            materialDialog.f6081p.setChecked(c6512f.f6163o0);
            materialDialog.f6081p.setOnCheckedChangeListener(c6512f.f6165p0);
            materialDialog.m5590r(materialDialog.f6081p, c6512f.f6118K);
            materialDialog.f6081p.setTextColor(c6512f.f6152j);
            AbstractC0019b.m55c(materialDialog.f6081p, c6512f.f6172t);
        }
        materialDialog.f17831a.setButtonGravity(c6512f.f6146g);
        materialDialog.f17831a.setButtonStackedGravity(c6512f.f6142e);
        materialDialog.f17831a.setStackingBehavior(c6512f.f6129V);
        boolean zM5381l = AbstractC6482g.m5381l(c6512f.f6134a, R.attr.textAllCaps, true);
        if (zM5381l) {
            zM5381l = AbstractC6482g.m5381l(c6512f.f6134a, R$attr.textAllCaps, true);
        }
        MDButton mDButton = materialDialog.f6082q;
        materialDialog.m5590r(mDButton, c6512f.f6119L);
        mDButton.setAllCapsCompat(zM5381l);
        mDButton.setText(c6512f.f6158m);
        mDButton.setTextColor(c6512f.f6176v);
        MDButton mDButton2 = materialDialog.f6082q;
        DialogAction dialogAction = DialogAction.POSITIVE;
        mDButton2.setStackedSelector(materialDialog.m5580h(dialogAction, true));
        materialDialog.f6082q.setDefaultSelector(materialDialog.m5580h(dialogAction, false));
        materialDialog.f6082q.setTag(dialogAction);
        materialDialog.f6082q.setOnClickListener(materialDialog);
        materialDialog.f6082q.setVisibility(0);
        MDButton mDButton3 = materialDialog.f6084s;
        materialDialog.m5590r(mDButton3, c6512f.f6119L);
        mDButton3.setAllCapsCompat(zM5381l);
        mDButton3.setText(c6512f.f6162o);
        mDButton3.setTextColor(c6512f.f6178w);
        MDButton mDButton4 = materialDialog.f6084s;
        DialogAction dialogAction2 = DialogAction.NEGATIVE;
        mDButton4.setStackedSelector(materialDialog.m5580h(dialogAction2, true));
        materialDialog.f6084s.setDefaultSelector(materialDialog.m5580h(dialogAction2, false));
        materialDialog.f6084s.setTag(dialogAction2);
        materialDialog.f6084s.setOnClickListener(materialDialog);
        materialDialog.f6084s.setVisibility(0);
        MDButton mDButton5 = materialDialog.f6083r;
        materialDialog.m5590r(mDButton5, c6512f.f6119L);
        mDButton5.setAllCapsCompat(zM5381l);
        mDButton5.setText(c6512f.f6160n);
        mDButton5.setTextColor(c6512f.f6180x);
        MDButton mDButton6 = materialDialog.f6083r;
        DialogAction dialogAction3 = DialogAction.NEUTRAL;
        mDButton6.setStackedSelector(materialDialog.m5580h(dialogAction3, true));
        materialDialog.f6083r.setDefaultSelector(materialDialog.m5580h(dialogAction3, false));
        materialDialog.f6083r.setTag(dialogAction3);
        materialDialog.f6083r.setOnClickListener(materialDialog);
        materialDialog.f6083r.setVisibility(0);
        if (materialDialog.f6074i != null) {
            Object obj = c6512f.f6123P;
            if (obj == null) {
                MaterialDialog.ListType listType = MaterialDialog.ListType.REGULAR;
                materialDialog.f6085t = listType;
                c6512f.f6123P = new C6513a(materialDialog, MaterialDialog.ListType.m5593a(listType));
            } else if (obj instanceof InterfaceC0018a) {
                ((InterfaceC0018a) obj).mo52a(materialDialog);
            }
        }
        m5615f(materialDialog);
        m5614e(materialDialog);
        if (c6512f.f6170s != null) {
            ((MDRootLayout) materialDialog.f17831a.findViewById(R$id.md_root)).m5637t();
            FrameLayout frameLayout = (FrameLayout) materialDialog.f17831a.findViewById(R$id.md_customViewFrame);
            materialDialog.f6076k = frameLayout;
            View view = c6512f.f6170s;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (c6512f.f6130W) {
                Resources resources = materialDialog.getContext().getResources();
                int iM5385p = AbstractC6482g.m5385p(materialDialog.getContext(), R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
                C8882a c8882a = new C8882a(materialDialog.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.md_content_padding_top);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.md_content_padding_bottom);
                c8882a.setClipToPadding(false);
                if (view instanceof EditText) {
                    c8882a.setPadding(iM5385p, dimensionPixelSize2, iM5385p, dimensionPixelSize3);
                } else {
                    c8882a.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(iM5385p, 0, iM5385p, 0);
                }
                c8882a.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = c8882a;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = c6512f.f6128U;
        if (onShowListener != null) {
            materialDialog.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = c6512f.f6126S;
        if (onCancelListener != null) {
            materialDialog.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = c6512f.f6125R;
        if (onDismissListener != null) {
            materialDialog.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = c6512f.f6127T;
        if (onKeyListener != null) {
            materialDialog.setOnKeyListener(onKeyListener);
        }
        materialDialog.m16799b();
        materialDialog.m5586n();
        materialDialog.m16800c(materialDialog.f17831a);
        materialDialog.m5577e();
        Display defaultDisplay = materialDialog.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Context context = c6512f.f6134a;
        int iM5385p2 = AbstractC6482g.m5385p(context, R$attr.md_dialog_vertical_margin, AbstractC6480e.m5359e(context, R$dimen.default_md_dialog_vertical_margin_phone));
        Context context2 = c6512f.f6134a;
        int iM5385p3 = AbstractC6482g.m5385p(context2, R$attr.md_dialog_horizontal_margin, AbstractC6480e.m5359e(context2, R$dimen.default_md_dialog_horizontal_margin_phone));
        materialDialog.f17831a.setMaxHeight(i11 - (iM5385p2 * 2));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(materialDialog.getWindow().getAttributes());
        layoutParams.width = Math.min(AbstractC6482g.m5384o(c6512f.f6134a, R$attr.md_dialog_max_width), i10 - (iM5385p3 * 2));
        materialDialog.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: e */
    public static void m5614e(MaterialDialog materialDialog) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        MaterialDialog.C6512f c6512f = materialDialog.f6068c;
        EditText editText = (EditText) materialDialog.f17831a.findViewById(R.id.input);
        materialDialog.f6073h = editText;
        if (editText == null) {
            return;
        }
        materialDialog.m5590r(editText, c6512f.f6118K);
        CharSequence charSequence = c6512f.f6143e0;
        if (charSequence != null) {
            materialDialog.f6073h.setText(charSequence);
        }
        materialDialog.m5589q();
        materialDialog.f6073h.setHint(c6512f.f6145f0);
        materialDialog.f6073h.setSingleLine();
        materialDialog.f6073h.setTextColor(c6512f.f6152j);
        materialDialog.f6073h.setHintTextColor(AbstractC6482g.m5370a(c6512f.f6152j, 0.3f));
        AbstractC0019b.m57e(materialDialog.f6073h, materialDialog.f6068c.f6172t);
        int i10 = c6512f.f6149h0;
        if (i10 != -1) {
            materialDialog.f6073h.setInputType(i10);
            int i11 = c6512f.f6149h0;
            if (i11 != 144 && (i11 & 128) == 128) {
                materialDialog.f6073h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        TextView textView = (TextView) materialDialog.f17831a.findViewById(R$id.md_minMax);
        materialDialog.f6080o = textView;
        if (c6512f.f6153j0 > 0 || c6512f.f6155k0 > -1) {
            materialDialog.m5585m(materialDialog.f6073h.getText().toString().length(), !c6512f.f6147g0);
        } else {
            textView.setVisibility(8);
            materialDialog.f6080o = null;
        }
    }

    /* renamed from: f */
    public static void m5615f(MaterialDialog materialDialog) {
        MaterialDialog.C6512f c6512f = materialDialog.f6068c;
        if (c6512f.f6135a0 || c6512f.f6139c0 > -2) {
            ProgressBar progressBar = (ProgressBar) materialDialog.f17831a.findViewById(R.id.progress);
            materialDialog.f6077l = progressBar;
            if (progressBar == null) {
                return;
            }
            if (!c6512f.f6135a0) {
                C6581l c6581l = new C6581l(c6512f.m5597d());
                c6581l.setTint(c6512f.f6172t);
                materialDialog.f6077l.setProgressDrawable(c6581l);
                materialDialog.f6077l.setIndeterminateDrawable(c6581l);
            } else if (c6512f.f6171s0) {
                IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(c6512f.m5597d());
                indeterminateHorizontalProgressDrawable.setTint(c6512f.f6172t);
                materialDialog.f6077l.setProgressDrawable(indeterminateHorizontalProgressDrawable);
                materialDialog.f6077l.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
            } else {
                IndeterminateCircularProgressDrawable indeterminateCircularProgressDrawable = new IndeterminateCircularProgressDrawable(c6512f.m5597d());
                indeterminateCircularProgressDrawable.setTint(c6512f.f6172t);
                materialDialog.f6077l.setProgressDrawable(indeterminateCircularProgressDrawable);
                materialDialog.f6077l.setIndeterminateDrawable(indeterminateCircularProgressDrawable);
            }
            boolean z9 = c6512f.f6135a0;
            if (!z9 || c6512f.f6171s0) {
                materialDialog.f6077l.setIndeterminate(z9 && c6512f.f6171s0);
                materialDialog.f6077l.setProgress(0);
                materialDialog.f6077l.setMax(c6512f.f6141d0);
                TextView textView = (TextView) materialDialog.f17831a.findViewById(R$id.md_label);
                materialDialog.f6078m = textView;
                if (textView != null) {
                    materialDialog.m5590r(textView, c6512f.f6119L);
                    materialDialog.f6078m.setText(c6512f.f6169r0.format(0L));
                }
                TextView textView2 = (TextView) materialDialog.f17831a.findViewById(R$id.md_minMax);
                materialDialog.f6079n = textView2;
                if (textView2 != null) {
                    materialDialog.m5590r(textView2, c6512f.f6118K);
                    if (c6512f.f6137b0) {
                        materialDialog.f6079n.setVisibility(0);
                        materialDialog.f6079n.setText(String.format(c6512f.f6167q0, 0, Integer.valueOf(c6512f.f6141d0)));
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) materialDialog.f6077l.getLayoutParams();
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = 0;
                    } else {
                        materialDialog.f6079n.setVisibility(8);
                    }
                } else {
                    c6512f.f6137b0 = false;
                }
            }
        }
        ProgressBar progressBar2 = materialDialog.f6077l;
        if (progressBar2 != null) {
            m5610a(progressBar2);
        }
    }
}
