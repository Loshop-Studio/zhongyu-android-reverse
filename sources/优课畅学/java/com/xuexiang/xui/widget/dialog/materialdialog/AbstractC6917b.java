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
import com.xuexiang.xui.utils.AbstractC6875e;
import com.xuexiang.xui.utils.AbstractC6877g;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;
import com.xuexiang.xui.widget.progress.materialprogressbar.C6987l;
import com.xuexiang.xui.widget.progress.materialprogressbar.IndeterminateCircularProgressDrawable;
import com.xuexiang.xui.widget.progress.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import p195o1.C9511a;
import p316z1.AbstractC10702b;
import p316z1.InterfaceC10701a;

/* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6917b {
    /* renamed from: a */
    public static void m6773a(ProgressBar progressBar) {
    }

    /* renamed from: b */
    public static int m6774b(MaterialDialog.C6913g c6913g) {
        return c6913g.f7557s != null ? R$layout.xmd_layout_dialog_custom : (c6913g.f7543l == null && c6913g.f7514T == null) ? c6913g.f7534g0 > -2 ? R$layout.xmd_layout_dialog_progress : c6913g.f7530e0 ? c6913g.f7568x0 ? R$layout.xmd_layout_dialog_progress_indeterminate_horizontal : R$layout.xmd_layout_dialog_progress_indeterminate : c6913g.f7542k0 != null ? c6913g.f7558s0 != null ? R$layout.xmd_layout_dialog_input_check : R$layout.xmd_layout_dialog_input : c6913g.f7558s0 != null ? R$layout.xmd_layout_dialog_basic_check : R$layout.xmd_layout_dialog_basic : c6913g.f7558s0 != null ? R$layout.xmd_layout_dialog_list_check : R$layout.xmd_layout_dialog_list;
    }

    /* renamed from: c */
    public static int m6775c(MaterialDialog.C6913g c6913g) {
        int i10 = c6913g.f7495G;
        if (i10 != -1) {
            return i10;
        }
        Context context = c6913g.f7521a;
        int i11 = R$attr.md_dark_theme;
        Theme theme = c6913g.f7493F;
        Theme theme2 = Theme.DARK;
        boolean zM6478l = AbstractC6877g.m6478l(context, i11, theme == theme2);
        if (!zM6478l) {
            theme2 = Theme.LIGHT;
        }
        c6913g.f7493F = theme2;
        return zM6478l ? R$style.MD_Dark : R$style.MD_Light;
    }

    /* renamed from: d */
    public static void m6776d(MaterialDialog materialDialog) throws Resources.NotFoundException {
        MaterialDialog.C6913g c6913g = materialDialog.f7449c;
        materialDialog.setCancelable(c6913g.f7497H);
        materialDialog.setCanceledOnTouchOutside(c6913g.f7499I);
        if (c6913g.f7526c0 == 0) {
            c6913g.f7526c0 = AbstractC6877g.m6480n(c6913g.f7521a, R$attr.md_background_color, AbstractC6877g.m6479m(materialDialog.getContext(), R$attr.colorBackgroundFloating));
        }
        if (c6913g.f7526c0 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(c6913g.f7521a.getResources().getDimension(R$dimen.md_bg_corner_radius));
            gradientDrawable.setColor(c6913g.f7526c0);
            materialDialog.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!c6913g.f7486B0) {
            c6913g.f7563v = AbstractC6877g.m6476j(c6913g.f7521a, R$attr.md_positive_color, c6913g.f7563v);
        }
        if (!c6913g.f7488C0) {
            c6913g.f7567x = AbstractC6877g.m6476j(c6913g.f7521a, R$attr.md_neutral_color, c6913g.f7567x);
        }
        if (!c6913g.f7490D0) {
            c6913g.f7565w = AbstractC6877g.m6476j(c6913g.f7521a, R$attr.md_negative_color, c6913g.f7565w);
        }
        if (!c6913g.f7492E0) {
            c6913g.f7559t = AbstractC6877g.m6480n(c6913g.f7521a, R$attr.md_widget_color, c6913g.f7559t);
        }
        if (!c6913g.f7570y0) {
            c6913g.f7537i = AbstractC6877g.m6480n(c6913g.f7521a, R$attr.md_title_color, AbstractC6877g.m6479m(materialDialog.getContext(), R.attr.textColorPrimary));
        }
        if (!c6913g.f7572z0) {
            c6913g.f7539j = AbstractC6877g.m6480n(c6913g.f7521a, R$attr.md_content_color, AbstractC6877g.m6479m(materialDialog.getContext(), R.attr.textColorSecondary));
        }
        if (!c6913g.f7484A0) {
            c6913g.f7528d0 = AbstractC6877g.m6480n(c6913g.f7521a, R$attr.md_item_color, c6913g.f7539j);
        }
        materialDialog.f7452f = (TextView) materialDialog.f21003a.findViewById(R$id.md_title);
        materialDialog.f7451e = (ImageView) materialDialog.f21003a.findViewById(R$id.md_icon);
        materialDialog.f7456j = materialDialog.f21003a.findViewById(R$id.md_titleFrame);
        materialDialog.f7453g = (TextView) materialDialog.f21003a.findViewById(R$id.md_content);
        materialDialog.f7455i = (RecyclerView) materialDialog.f21003a.findViewById(R$id.md_contentRecyclerView);
        materialDialog.f7462p = (CheckBox) materialDialog.f21003a.findViewById(R$id.md_promptCheckbox);
        materialDialog.f7463q = (MDButton) materialDialog.f21003a.findViewById(R$id.md_buttonDefaultPositive);
        materialDialog.f7464r = (MDButton) materialDialog.f21003a.findViewById(R$id.md_buttonDefaultNeutral);
        materialDialog.f7465s = (MDButton) materialDialog.f21003a.findViewById(R$id.md_buttonDefaultNegative);
        if (c6913g.f7542k0 != null && c6913g.f7545m == null) {
            c6913g.f7545m = c6913g.f7521a.getText(R.string.ok);
        }
        materialDialog.f7463q.setVisibility(c6913g.f7545m != null ? 0 : 8);
        materialDialog.f7464r.setVisibility(c6913g.f7547n != null ? 0 : 8);
        materialDialog.f7465s.setVisibility(c6913g.f7549o != null ? 0 : 8);
        materialDialog.f7463q.setFocusable(true);
        materialDialog.f7464r.setFocusable(true);
        materialDialog.f7465s.setFocusable(true);
        if (c6913g.f7551p) {
            materialDialog.f7463q.requestFocus();
        }
        if (c6913g.f7553q) {
            materialDialog.f7464r.requestFocus();
        }
        if (c6913g.f7555r) {
            materialDialog.f7465s.requestFocus();
        }
        if (c6913g.f7511Q != null) {
            materialDialog.f7451e.setVisibility(0);
            materialDialog.f7451e.setImageDrawable(c6913g.f7511Q);
        } else {
            Drawable drawableM6483q = AbstractC6877g.m6483q(c6913g.f7521a, R$attr.md_icon);
            if (drawableM6483q != null) {
                materialDialog.f7451e.setVisibility(0);
                materialDialog.f7451e.setImageDrawable(drawableM6483q);
            } else {
                materialDialog.f7451e.setVisibility(8);
            }
        }
        int dimensionPixelSize = c6913g.f7513S;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = AbstractC6877g.m6481o(c6913g.f7521a, R$attr.md_icon_max_size);
        }
        if (c6913g.f7512R || AbstractC6877g.m6477k(c6913g.f7521a, R$attr.md_icon_limit_icon_to_default_size)) {
            dimensionPixelSize = c6913g.f7521a.getResources().getDimensionPixelSize(R$dimen.default_md_icon_max_size);
        }
        if (dimensionPixelSize > -1) {
            materialDialog.f7451e.setAdjustViewBounds(true);
            materialDialog.f7451e.setMaxHeight(dimensionPixelSize);
            materialDialog.f7451e.setMaxWidth(dimensionPixelSize);
            materialDialog.f7451e.requestLayout();
        }
        if (!c6913g.f7494F0) {
            c6913g.f7524b0 = AbstractC6877g.m6480n(c6913g.f7521a, R$attr.md_divider_color, AbstractC6877g.m6479m(materialDialog.getContext(), R$attr.md_divider));
        }
        materialDialog.f21003a.setDividerColor(c6913g.f7524b0);
        TextView textView = materialDialog.f7452f;
        if (textView != null) {
            materialDialog.m6726u(textView, c6913g.f7510P);
            materialDialog.f7452f.setTextColor(c6913g.f7537i);
            materialDialog.f7452f.setGravity(c6913g.f7525c.m6706a());
            materialDialog.f7452f.setTextAlignment(c6913g.f7525c.m6707b());
            CharSequence charSequence = c6913g.f7523b;
            if (charSequence == null) {
                materialDialog.f7456j.setVisibility(8);
            } else {
                materialDialog.f7452f.setText(charSequence);
                materialDialog.f7456j.setVisibility(0);
            }
        }
        TextView textView2 = materialDialog.f7453g;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            materialDialog.m6726u(materialDialog.f7453g, c6913g.f7509O);
            materialDialog.f7453g.setLineSpacing(0.0f, c6913g.f7501J);
            ColorStateList colorStateList = c6913g.f7569y;
            if (colorStateList == null) {
                materialDialog.f7453g.setLinkTextColor(AbstractC6877g.m6479m(materialDialog.getContext(), R.attr.textColorPrimary));
            } else {
                materialDialog.f7453g.setLinkTextColor(colorStateList);
            }
            materialDialog.f7453g.setTextColor(c6913g.f7539j);
            materialDialog.f7453g.setGravity(c6913g.f7527d.m6706a());
            materialDialog.f7453g.setTextAlignment(c6913g.f7527d.m6707b());
            CharSequence charSequence2 = c6913g.f7541k;
            if (charSequence2 != null) {
                materialDialog.f7453g.setText(charSequence2);
                materialDialog.f7453g.setVisibility(0);
            } else {
                materialDialog.f7453g.setVisibility(8);
            }
        }
        CheckBox checkBox = materialDialog.f7462p;
        if (checkBox != null) {
            checkBox.setText(c6913g.f7558s0);
            materialDialog.f7462p.setChecked(c6913g.f7560t0);
            materialDialog.f7462p.setOnCheckedChangeListener(c6913g.f7562u0);
            materialDialog.m6726u(materialDialog.f7462p, c6913g.f7509O);
            materialDialog.f7462p.setTextColor(c6913g.f7539j);
            AbstractC10702b.m20011c(materialDialog.f7462p, c6913g.f7559t);
        }
        materialDialog.f21003a.setButtonGravity(c6913g.f7533g);
        materialDialog.f21003a.setButtonStackedGravity(c6913g.f7529e);
        materialDialog.f21003a.setStackingBehavior(c6913g.f7520Z);
        boolean zM6478l = AbstractC6877g.m6478l(c6913g.f7521a, R.attr.textAllCaps, true);
        if (zM6478l) {
            zM6478l = AbstractC6877g.m6478l(c6913g.f7521a, R$attr.textAllCaps, true);
        }
        MDButton mDButton = materialDialog.f7463q;
        materialDialog.m6726u(mDButton, c6913g.f7510P);
        mDButton.setAllCapsCompat(zM6478l);
        mDButton.setText(c6913g.f7545m);
        mDButton.setTextColor(c6913g.f7563v);
        MDButton mDButton2 = materialDialog.f7463q;
        DialogAction dialogAction = DialogAction.POSITIVE;
        mDButton2.setStackedSelector(materialDialog.m6713h(dialogAction, true));
        materialDialog.f7463q.setDefaultSelector(materialDialog.m6713h(dialogAction, false));
        materialDialog.f7463q.setTag(dialogAction);
        materialDialog.f7463q.setOnClickListener(materialDialog);
        materialDialog.f7463q.setVisibility(0);
        MDButton mDButton3 = materialDialog.f7465s;
        materialDialog.m6726u(mDButton3, c6913g.f7510P);
        mDButton3.setAllCapsCompat(zM6478l);
        mDButton3.setText(c6913g.f7549o);
        mDButton3.setTextColor(c6913g.f7565w);
        MDButton mDButton4 = materialDialog.f7465s;
        DialogAction dialogAction2 = DialogAction.NEGATIVE;
        mDButton4.setStackedSelector(materialDialog.m6713h(dialogAction2, true));
        materialDialog.f7465s.setDefaultSelector(materialDialog.m6713h(dialogAction2, false));
        materialDialog.f7465s.setTag(dialogAction2);
        materialDialog.f7465s.setOnClickListener(materialDialog);
        materialDialog.f7465s.setVisibility(0);
        MDButton mDButton5 = materialDialog.f7464r;
        materialDialog.m6726u(mDButton5, c6913g.f7510P);
        mDButton5.setAllCapsCompat(zM6478l);
        mDButton5.setText(c6913g.f7547n);
        mDButton5.setTextColor(c6913g.f7567x);
        MDButton mDButton6 = materialDialog.f7464r;
        DialogAction dialogAction3 = DialogAction.NEUTRAL;
        mDButton6.setStackedSelector(materialDialog.m6713h(dialogAction3, true));
        materialDialog.f7464r.setDefaultSelector(materialDialog.m6713h(dialogAction3, false));
        materialDialog.f7464r.setTag(dialogAction3);
        materialDialog.f7464r.setOnClickListener(materialDialog);
        materialDialog.f7464r.setVisibility(0);
        if (materialDialog.f7455i != null) {
            Object obj = c6913g.f7514T;
            if (obj == null) {
                MaterialDialog.ListType listType = MaterialDialog.ListType.REGULAR;
                materialDialog.f7466t = listType;
                c6913g.f7514T = new C6916a(materialDialog, MaterialDialog.ListType.m6729a(listType));
            } else if (obj instanceof InterfaceC10701a) {
                ((InterfaceC10701a) obj).mo6803b(materialDialog);
            }
        }
        m6778f(materialDialog);
        m6777e(materialDialog);
        if (c6913g.f7557s != null) {
            ((MDRootLayout) materialDialog.f21003a.findViewById(R$id.md_root)).m6800t();
            FrameLayout frameLayout = (FrameLayout) materialDialog.f21003a.findViewById(R$id.md_customViewFrame);
            materialDialog.f7457k = frameLayout;
            View view = c6913g.f7557s;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (c6913g.f7522a0) {
                Resources resources = materialDialog.getContext().getResources();
                int iM6482p = AbstractC6877g.m6482p(materialDialog.getContext(), R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
                C9511a c9511a = new C9511a(materialDialog.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.md_content_padding_top);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.md_content_padding_bottom);
                c9511a.setClipToPadding(false);
                if (view instanceof EditText) {
                    c9511a.setPadding(iM6482p, dimensionPixelSize2, iM6482p, dimensionPixelSize3);
                } else {
                    c9511a.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(iM6482p, 0, iM6482p, 0);
                }
                c9511a.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = c9511a;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = c6913g.f7519Y;
        if (onShowListener != null) {
            materialDialog.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = c6913g.f7517W;
        if (onCancelListener != null) {
            materialDialog.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = c6913g.f7516V;
        if (onDismissListener != null) {
            materialDialog.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = c6913g.f7518X;
        if (onKeyListener != null) {
            materialDialog.setOnKeyListener(onKeyListener);
        }
        materialDialog.m19769b();
        materialDialog.m6721p();
        materialDialog.m19770c(materialDialog.f21003a);
        materialDialog.m6710e();
        Display defaultDisplay = materialDialog.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i10 = point.x;
        int i11 = point.y;
        Context context = c6913g.f7521a;
        int iM6482p2 = AbstractC6877g.m6482p(context, R$attr.md_dialog_vertical_margin, AbstractC6875e.m6450f(context, R$dimen.default_md_dialog_vertical_margin_phone));
        Context context2 = c6913g.f7521a;
        int iM6482p3 = AbstractC6877g.m6482p(context2, R$attr.md_dialog_horizontal_margin, AbstractC6875e.m6450f(context2, R$dimen.default_md_dialog_horizontal_margin_phone));
        materialDialog.f21003a.setMaxHeight(i11 - (iM6482p2 * 2));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(materialDialog.getWindow().getAttributes());
        layoutParams.width = Math.min(AbstractC6877g.m6481o(c6913g.f7521a, R$attr.md_dialog_max_width), i10 - (iM6482p3 * 2));
        materialDialog.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: e */
    public static void m6777e(MaterialDialog materialDialog) {
        MaterialDialog.C6913g c6913g = materialDialog.f7449c;
        EditText editText = (EditText) materialDialog.f21003a.findViewById(R.id.input);
        materialDialog.f7454h = editText;
        if (editText == null) {
            return;
        }
        materialDialog.m6726u(editText, c6913g.f7509O);
        CharSequence charSequence = c6913g.f7538i0;
        if (charSequence != null) {
            materialDialog.f7454h.setText(charSequence);
        }
        materialDialog.m6724s();
        materialDialog.f7454h.setHint(c6913g.f7540j0);
        materialDialog.f7454h.setSingleLine();
        materialDialog.f7454h.setTextColor(c6913g.f7539j);
        materialDialog.f7454h.setHintTextColor(AbstractC6877g.m6467a(c6913g.f7539j, 0.3f));
        AbstractC10702b.m20013e(materialDialog.f7454h, materialDialog.f7449c.f7559t);
        int i10 = c6913g.f7546m0;
        if (i10 != -1) {
            materialDialog.f7454h.setInputType(i10);
            int i11 = c6913g.f7546m0;
            if (i11 != 144 && (i11 & 128) == 128) {
                materialDialog.f7454h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        TextView textView = (TextView) materialDialog.f21003a.findViewById(R$id.md_minMax);
        materialDialog.f7461o = textView;
        if (c6913g.f7550o0 > 0 || c6913g.f7552p0 > -1) {
            materialDialog.m6720o(materialDialog.f7454h.getText().toString().length(), !c6913g.f7544l0);
        } else {
            textView.setVisibility(8);
            materialDialog.f7461o = null;
        }
    }

    /* renamed from: f */
    public static void m6778f(MaterialDialog materialDialog) {
        MaterialDialog.C6913g c6913g = materialDialog.f7449c;
        if (c6913g.f7530e0 || c6913g.f7534g0 > -2) {
            ProgressBar progressBar = (ProgressBar) materialDialog.f21003a.findViewById(R.id.progress);
            materialDialog.f7458l = progressBar;
            if (progressBar == null) {
                return;
            }
            if (!c6913g.f7530e0) {
                C6987l c6987l = new C6987l(c6913g.m6752m());
                c6987l.setTint(c6913g.f7559t);
                materialDialog.f7458l.setProgressDrawable(c6987l);
                materialDialog.f7458l.setIndeterminateDrawable(c6987l);
            } else if (c6913g.f7568x0) {
                IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(c6913g.m6752m());
                indeterminateHorizontalProgressDrawable.setTint(c6913g.f7559t);
                materialDialog.f7458l.setProgressDrawable(indeterminateHorizontalProgressDrawable);
                materialDialog.f7458l.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
            } else {
                IndeterminateCircularProgressDrawable indeterminateCircularProgressDrawable = new IndeterminateCircularProgressDrawable(c6913g.m6752m());
                indeterminateCircularProgressDrawable.setTint(c6913g.f7559t);
                materialDialog.f7458l.setProgressDrawable(indeterminateCircularProgressDrawable);
                materialDialog.f7458l.setIndeterminateDrawable(indeterminateCircularProgressDrawable);
            }
            boolean z10 = c6913g.f7530e0;
            if (!z10 || c6913g.f7568x0) {
                materialDialog.f7458l.setIndeterminate(z10 && c6913g.f7568x0);
                materialDialog.f7458l.setProgress(0);
                materialDialog.f7458l.setMax(c6913g.f7536h0);
                TextView textView = (TextView) materialDialog.f21003a.findViewById(R$id.md_label);
                materialDialog.f7459m = textView;
                if (textView != null) {
                    materialDialog.m6726u(textView, c6913g.f7510P);
                    materialDialog.f7459m.setText(c6913g.f7566w0.format(0L));
                }
                TextView textView2 = (TextView) materialDialog.f21003a.findViewById(R$id.md_minMax);
                materialDialog.f7460n = textView2;
                if (textView2 != null) {
                    materialDialog.m6726u(textView2, c6913g.f7509O);
                    if (c6913g.f7532f0) {
                        materialDialog.f7460n.setVisibility(0);
                        materialDialog.f7460n.setText(String.format(c6913g.f7564v0, 0, Integer.valueOf(c6913g.f7536h0)));
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) materialDialog.f7458l.getLayoutParams();
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = 0;
                    } else {
                        materialDialog.f7460n.setVisibility(8);
                    }
                } else {
                    c6913g.f7532f0 = false;
                }
            }
        }
        ProgressBar progressBar2 = materialDialog.f7458l;
        if (progressBar2 != null) {
            m6773a(progressBar2);
        }
    }
}
