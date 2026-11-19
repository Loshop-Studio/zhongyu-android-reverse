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
import com.xuexiang.xui.utils.AbstractC6799e;
import com.xuexiang.xui.utils.AbstractC6801g;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;
import com.xuexiang.xui.widget.progress.materialprogressbar.C6901l;
import com.xuexiang.xui.widget.progress.materialprogressbar.IndeterminateCircularProgressDrawable;
import com.xuexiang.xui.widget.progress.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import p115g3.C8049a;
import p221q3.AbstractC9358b;
import p221q3.InterfaceC9357a;

/* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6834b {
    /* renamed from: a */
    public static void m6715a(ProgressBar progressBar) {
    }

    /* renamed from: b */
    public static int m6716b(MaterialDialog.C6831g c6831g) {
        return c6831g.f7428s != null ? R$layout.xmd_layout_dialog_custom : (c6831g.f7414l == null && c6831g.f7385T == null) ? c6831g.f7405g0 > -2 ? R$layout.xmd_layout_dialog_progress : c6831g.f7401e0 ? c6831g.f7437w0 ? R$layout.xmd_layout_dialog_progress_indeterminate_horizontal : R$layout.xmd_layout_dialog_progress_indeterminate : c6831g.f7427r0 != null ? R$layout.xmd_layout_dialog_basic_check : R$layout.xmd_layout_dialog_basic : c6831g.f7427r0 != null ? R$layout.xmd_layout_dialog_list_check : R$layout.xmd_layout_dialog_list;
    }

    /* renamed from: c */
    public static int m6717c(MaterialDialog.C6831g c6831g) {
        int i9 = c6831g.f7367G;
        if (i9 != -1) {
            return i9;
        }
        Context context = c6831g.f7392a;
        int i10 = R$attr.md_dark_theme;
        Theme theme = c6831g.f7365F;
        Theme theme2 = Theme.DARK;
        boolean zM6478k = AbstractC6801g.m6478k(context, i10, theme == theme2);
        if (!zM6478k) {
            theme2 = Theme.LIGHT;
        }
        c6831g.f7365F = theme2;
        return zM6478k ? R$style.MD_Dark : R$style.MD_Light;
    }

    /* renamed from: d */
    public static void m6718d(MaterialDialog materialDialog) throws Resources.NotFoundException {
        MaterialDialog.C6831g c6831g = materialDialog.f7321c;
        materialDialog.setCancelable(c6831g.f7369H);
        materialDialog.setCanceledOnTouchOutside(c6831g.f7371I);
        if (c6831g.f7397c0 == 0) {
            c6831g.f7397c0 = AbstractC6801g.m6480m(c6831g.f7392a, R$attr.md_background_color, AbstractC6801g.m6479l(materialDialog.getContext(), R$attr.colorBackgroundFloating));
        }
        if (c6831g.f7397c0 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(c6831g.f7392a.getResources().getDimension(R$dimen.md_bg_corner_radius));
            gradientDrawable.setColor(c6831g.f7397c0);
            materialDialog.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!c6831g.f7356A0) {
            c6831g.f7434v = AbstractC6801g.m6476i(c6831g.f7392a, R$attr.md_positive_color, c6831g.f7434v);
        }
        if (!c6831g.f7358B0) {
            c6831g.f7438x = AbstractC6801g.m6476i(c6831g.f7392a, R$attr.md_neutral_color, c6831g.f7438x);
        }
        if (!c6831g.f7360C0) {
            c6831g.f7436w = AbstractC6801g.m6476i(c6831g.f7392a, R$attr.md_negative_color, c6831g.f7436w);
        }
        if (!c6831g.f7362D0) {
            c6831g.f7430t = AbstractC6801g.m6480m(c6831g.f7392a, R$attr.md_widget_color, c6831g.f7430t);
        }
        if (!c6831g.f7439x0) {
            c6831g.f7408i = AbstractC6801g.m6480m(c6831g.f7392a, R$attr.md_title_color, AbstractC6801g.m6479l(materialDialog.getContext(), R.attr.textColorPrimary));
        }
        if (!c6831g.f7441y0) {
            c6831g.f7410j = AbstractC6801g.m6480m(c6831g.f7392a, R$attr.md_content_color, AbstractC6801g.m6479l(materialDialog.getContext(), R.attr.textColorSecondary));
        }
        if (!c6831g.f7443z0) {
            c6831g.f7399d0 = AbstractC6801g.m6480m(c6831g.f7392a, R$attr.md_item_color, c6831g.f7410j);
        }
        materialDialog.f7324f = (TextView) materialDialog.f16162a.findViewById(R$id.md_title);
        materialDialog.f7323e = (ImageView) materialDialog.f16162a.findViewById(R$id.md_icon);
        materialDialog.f7328j = materialDialog.f16162a.findViewById(R$id.md_titleFrame);
        materialDialog.f7325g = (TextView) materialDialog.f16162a.findViewById(R$id.md_content);
        materialDialog.f7327i = (RecyclerView) materialDialog.f16162a.findViewById(R$id.md_contentRecyclerView);
        materialDialog.f7334p = (CheckBox) materialDialog.f16162a.findViewById(R$id.md_promptCheckbox);
        materialDialog.f7335q = (MDButton) materialDialog.f16162a.findViewById(R$id.md_buttonDefaultPositive);
        materialDialog.f7336r = (MDButton) materialDialog.f16162a.findViewById(R$id.md_buttonDefaultNeutral);
        materialDialog.f7337s = (MDButton) materialDialog.f16162a.findViewById(R$id.md_buttonDefaultNegative);
        materialDialog.f7335q.setVisibility(c6831g.f7416m != null ? 0 : 8);
        materialDialog.f7336r.setVisibility(c6831g.f7418n != null ? 0 : 8);
        materialDialog.f7337s.setVisibility(c6831g.f7420o != null ? 0 : 8);
        materialDialog.f7335q.setFocusable(true);
        materialDialog.f7336r.setFocusable(true);
        materialDialog.f7337s.setFocusable(true);
        if (c6831g.f7422p) {
            materialDialog.f7335q.requestFocus();
        }
        if (c6831g.f7424q) {
            materialDialog.f7336r.requestFocus();
        }
        if (c6831g.f7426r) {
            materialDialog.f7337s.requestFocus();
        }
        if (c6831g.f7382Q != null) {
            materialDialog.f7323e.setVisibility(0);
            materialDialog.f7323e.setImageDrawable(c6831g.f7382Q);
        } else {
            Drawable drawableM6483p = AbstractC6801g.m6483p(c6831g.f7392a, R$attr.md_icon);
            if (drawableM6483p != null) {
                materialDialog.f7323e.setVisibility(0);
                materialDialog.f7323e.setImageDrawable(drawableM6483p);
            } else {
                materialDialog.f7323e.setVisibility(8);
            }
        }
        int dimensionPixelSize = c6831g.f7384S;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = AbstractC6801g.m6481n(c6831g.f7392a, R$attr.md_icon_max_size);
        }
        if (c6831g.f7383R || AbstractC6801g.m6477j(c6831g.f7392a, R$attr.md_icon_limit_icon_to_default_size)) {
            dimensionPixelSize = c6831g.f7392a.getResources().getDimensionPixelSize(R$dimen.default_md_icon_max_size);
        }
        if (dimensionPixelSize > -1) {
            materialDialog.f7323e.setAdjustViewBounds(true);
            materialDialog.f7323e.setMaxHeight(dimensionPixelSize);
            materialDialog.f7323e.setMaxWidth(dimensionPixelSize);
            materialDialog.f7323e.requestLayout();
        }
        if (!c6831g.f7364E0) {
            c6831g.f7395b0 = AbstractC6801g.m6480m(c6831g.f7392a, R$attr.md_divider_color, AbstractC6801g.m6479l(materialDialog.getContext(), R$attr.md_divider));
        }
        materialDialog.f16162a.setDividerColor(c6831g.f7395b0);
        TextView textView = materialDialog.f7324f;
        if (textView != null) {
            materialDialog.m6687u(textView, c6831g.f7381P);
            materialDialog.f7324f.setTextColor(c6831g.f7408i);
            materialDialog.f7324f.setGravity(c6831g.f7396c.m6667a());
            materialDialog.f7324f.setTextAlignment(c6831g.f7396c.m6668c());
            CharSequence charSequence = c6831g.f7394b;
            if (charSequence == null) {
                materialDialog.f7328j.setVisibility(8);
            } else {
                materialDialog.f7324f.setText(charSequence);
                materialDialog.f7328j.setVisibility(0);
            }
        }
        TextView textView2 = materialDialog.f7325g;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            materialDialog.m6687u(materialDialog.f7325g, c6831g.f7380O);
            materialDialog.f7325g.setLineSpacing(0.0f, c6831g.f7373J);
            ColorStateList colorStateList = c6831g.f7440y;
            if (colorStateList == null) {
                materialDialog.f7325g.setLinkTextColor(AbstractC6801g.m6479l(materialDialog.getContext(), R.attr.textColorPrimary));
            } else {
                materialDialog.f7325g.setLinkTextColor(colorStateList);
            }
            materialDialog.f7325g.setTextColor(c6831g.f7410j);
            materialDialog.f7325g.setGravity(c6831g.f7398d.m6667a());
            materialDialog.f7325g.setTextAlignment(c6831g.f7398d.m6668c());
            CharSequence charSequence2 = c6831g.f7412k;
            if (charSequence2 != null) {
                materialDialog.f7325g.setText(charSequence2);
                materialDialog.f7325g.setVisibility(0);
            } else {
                materialDialog.f7325g.setVisibility(8);
            }
        }
        CheckBox checkBox = materialDialog.f7334p;
        if (checkBox != null) {
            checkBox.setText(c6831g.f7427r0);
            materialDialog.f7334p.setChecked(c6831g.f7429s0);
            materialDialog.f7334p.setOnCheckedChangeListener(c6831g.f7431t0);
            materialDialog.m6687u(materialDialog.f7334p, c6831g.f7380O);
            materialDialog.f7334p.setTextColor(c6831g.f7410j);
            AbstractC9358b.m15328c(materialDialog.f7334p, c6831g.f7430t);
        }
        materialDialog.f16162a.setButtonGravity(c6831g.f7404g);
        materialDialog.f16162a.setButtonStackedGravity(c6831g.f7400e);
        materialDialog.f16162a.setStackingBehavior(c6831g.f7391Z);
        boolean zM6478k = AbstractC6801g.m6478k(c6831g.f7392a, R.attr.textAllCaps, true);
        if (zM6478k) {
            zM6478k = AbstractC6801g.m6478k(c6831g.f7392a, R$attr.textAllCaps, true);
        }
        MDButton mDButton = materialDialog.f7335q;
        materialDialog.m6687u(mDButton, c6831g.f7381P);
        mDButton.setAllCapsCompat(zM6478k);
        mDButton.setText(c6831g.f7416m);
        mDButton.setTextColor(c6831g.f7434v);
        MDButton mDButton2 = materialDialog.f7335q;
        DialogAction dialogAction = DialogAction.POSITIVE;
        mDButton2.setStackedSelector(materialDialog.m6674h(dialogAction, true));
        materialDialog.f7335q.setDefaultSelector(materialDialog.m6674h(dialogAction, false));
        materialDialog.f7335q.setTag(dialogAction);
        materialDialog.f7335q.setOnClickListener(materialDialog);
        materialDialog.f7335q.setVisibility(0);
        MDButton mDButton3 = materialDialog.f7337s;
        materialDialog.m6687u(mDButton3, c6831g.f7381P);
        mDButton3.setAllCapsCompat(zM6478k);
        mDButton3.setText(c6831g.f7420o);
        mDButton3.setTextColor(c6831g.f7436w);
        MDButton mDButton4 = materialDialog.f7337s;
        DialogAction dialogAction2 = DialogAction.NEGATIVE;
        mDButton4.setStackedSelector(materialDialog.m6674h(dialogAction2, true));
        materialDialog.f7337s.setDefaultSelector(materialDialog.m6674h(dialogAction2, false));
        materialDialog.f7337s.setTag(dialogAction2);
        materialDialog.f7337s.setOnClickListener(materialDialog);
        materialDialog.f7337s.setVisibility(0);
        MDButton mDButton5 = materialDialog.f7336r;
        materialDialog.m6687u(mDButton5, c6831g.f7381P);
        mDButton5.setAllCapsCompat(zM6478k);
        mDButton5.setText(c6831g.f7418n);
        mDButton5.setTextColor(c6831g.f7438x);
        MDButton mDButton6 = materialDialog.f7336r;
        DialogAction dialogAction3 = DialogAction.NEUTRAL;
        mDButton6.setStackedSelector(materialDialog.m6674h(dialogAction3, true));
        materialDialog.f7336r.setDefaultSelector(materialDialog.m6674h(dialogAction3, false));
        materialDialog.f7336r.setTag(dialogAction3);
        materialDialog.f7336r.setOnClickListener(materialDialog);
        materialDialog.f7336r.setVisibility(0);
        if (materialDialog.f7327i != null) {
            Object obj = c6831g.f7385T;
            if (obj == null) {
                MaterialDialog.ListType listType = MaterialDialog.ListType.REGULAR;
                materialDialog.f7338t = listType;
                c6831g.f7385T = new C6833a(materialDialog, MaterialDialog.ListType.m6690a(listType));
            } else if (obj instanceof InterfaceC9357a) {
                ((InterfaceC9357a) obj).mo6745a(materialDialog);
            }
        }
        m6720f(materialDialog);
        m6719e(materialDialog);
        if (c6831g.f7428s != null) {
            ((MDRootLayout) materialDialog.f16162a.findViewById(R$id.md_root)).m6742t();
            FrameLayout frameLayout = (FrameLayout) materialDialog.f16162a.findViewById(R$id.md_customViewFrame);
            materialDialog.f7329k = frameLayout;
            View view = c6831g.f7428s;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (c6831g.f7393a0) {
                Resources resources = materialDialog.getContext().getResources();
                int iM6482o = AbstractC6801g.m6482o(materialDialog.getContext(), R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
                C8049a c8049a = new C8049a(materialDialog.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.md_content_padding_top);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.md_content_padding_bottom);
                c8049a.setClipToPadding(false);
                if (view instanceof EditText) {
                    c8049a.setPadding(iM6482o, dimensionPixelSize2, iM6482o, dimensionPixelSize3);
                } else {
                    c8049a.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(iM6482o, 0, iM6482o, 0);
                }
                c8049a.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = c8049a;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = c6831g.f7390Y;
        if (onShowListener != null) {
            materialDialog.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = c6831g.f7388W;
        if (onCancelListener != null) {
            materialDialog.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = c6831g.f7387V;
        if (onDismissListener != null) {
            materialDialog.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = c6831g.f7389X;
        if (onKeyListener != null) {
            materialDialog.setOnKeyListener(onKeyListener);
        }
        materialDialog.m15202b();
        materialDialog.m6682p();
        materialDialog.m15203c(materialDialog.f16162a);
        materialDialog.m6671e();
        Display defaultDisplay = materialDialog.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i9 = point.x;
        int i10 = point.y;
        int iM6482o2 = AbstractC6801g.m6482o(c6831g.f7392a, R$attr.md_dialog_vertical_margin, AbstractC6799e.m6459d(R$dimen.default_md_dialog_vertical_margin_phone));
        int iM6482o3 = AbstractC6801g.m6482o(c6831g.f7392a, R$attr.md_dialog_horizontal_margin, AbstractC6799e.m6459d(R$dimen.default_md_dialog_horizontal_margin_phone));
        materialDialog.f16162a.setMaxHeight(i10 - (iM6482o2 * 2));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(materialDialog.getWindow().getAttributes());
        layoutParams.width = Math.min(AbstractC6801g.m6481n(c6831g.f7392a, R$attr.md_dialog_max_width), i9 - (iM6482o3 * 2));
        materialDialog.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: e */
    public static void m6719e(MaterialDialog materialDialog) {
        MaterialDialog.C6831g c6831g = materialDialog.f7321c;
        EditText editText = (EditText) materialDialog.f16162a.findViewById(R.id.input);
        materialDialog.f7326h = editText;
        if (editText == null) {
            return;
        }
        materialDialog.m6687u(editText, c6831g.f7380O);
        CharSequence charSequence = c6831g.f7409i0;
        if (charSequence != null) {
            materialDialog.f7326h.setText(charSequence);
        }
        materialDialog.m6685s();
        materialDialog.f7326h.setHint(c6831g.f7411j0);
        materialDialog.f7326h.setSingleLine();
        materialDialog.f7326h.setTextColor(c6831g.f7410j);
        materialDialog.f7326h.setHintTextColor(AbstractC6801g.m6468a(c6831g.f7410j, 0.3f));
        AbstractC9358b.m15330e(materialDialog.f7326h, materialDialog.f7321c.f7430t);
        int i9 = c6831g.f7415l0;
        if (i9 != -1) {
            materialDialog.f7326h.setInputType(i9);
            int i10 = c6831g.f7415l0;
            if (i10 != 144 && (i10 & 128) == 128) {
                materialDialog.f7326h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        TextView textView = (TextView) materialDialog.f16162a.findViewById(R$id.md_minMax);
        materialDialog.f7333o = textView;
        if (c6831g.f7419n0 > 0 || c6831g.f7421o0 > -1) {
            materialDialog.m6681o(materialDialog.f7326h.getText().toString().length(), !c6831g.f7413k0);
        } else {
            textView.setVisibility(8);
            materialDialog.f7333o = null;
        }
    }

    /* renamed from: f */
    public static void m6720f(MaterialDialog materialDialog) {
        MaterialDialog.C6831g c6831g = materialDialog.f7321c;
        if (c6831g.f7401e0 || c6831g.f7405g0 > -2) {
            ProgressBar progressBar = (ProgressBar) materialDialog.f16162a.findViewById(R.id.progress);
            materialDialog.f7330l = progressBar;
            if (progressBar == null) {
                return;
            }
            if (!c6831g.f7401e0) {
                C6901l c6901l = new C6901l(c6831g.m6698h());
                c6901l.setTint(c6831g.f7430t);
                materialDialog.f7330l.setProgressDrawable(c6901l);
                materialDialog.f7330l.setIndeterminateDrawable(c6901l);
            } else if (c6831g.f7437w0) {
                IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(c6831g.m6698h());
                indeterminateHorizontalProgressDrawable.setTint(c6831g.f7430t);
                materialDialog.f7330l.setProgressDrawable(indeterminateHorizontalProgressDrawable);
                materialDialog.f7330l.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
            } else {
                IndeterminateCircularProgressDrawable indeterminateCircularProgressDrawable = new IndeterminateCircularProgressDrawable(c6831g.m6698h());
                indeterminateCircularProgressDrawable.setTint(c6831g.f7430t);
                materialDialog.f7330l.setProgressDrawable(indeterminateCircularProgressDrawable);
                materialDialog.f7330l.setIndeterminateDrawable(indeterminateCircularProgressDrawable);
            }
            boolean z9 = c6831g.f7401e0;
            if (!z9 || c6831g.f7437w0) {
                materialDialog.f7330l.setIndeterminate(z9 && c6831g.f7437w0);
                materialDialog.f7330l.setProgress(0);
                materialDialog.f7330l.setMax(c6831g.f7407h0);
                TextView textView = (TextView) materialDialog.f16162a.findViewById(R$id.md_label);
                materialDialog.f7331m = textView;
                if (textView != null) {
                    materialDialog.m6687u(textView, c6831g.f7381P);
                    materialDialog.f7331m.setText(c6831g.f7435v0.format(0L));
                }
                TextView textView2 = (TextView) materialDialog.f16162a.findViewById(R$id.md_minMax);
                materialDialog.f7332n = textView2;
                if (textView2 != null) {
                    materialDialog.m6687u(textView2, c6831g.f7380O);
                    if (c6831g.f7403f0) {
                        materialDialog.f7332n.setVisibility(0);
                        materialDialog.f7332n.setText(String.format(c6831g.f7433u0, 0, Integer.valueOf(c6831g.f7407h0)));
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) materialDialog.f7330l.getLayoutParams();
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = 0;
                    } else {
                        materialDialog.f7332n.setVisibility(8);
                    }
                } else {
                    c6831g.f7403f0 = false;
                }
            }
        }
        ProgressBar progressBar2 = materialDialog.f7330l;
        if (progressBar2 != null) {
            m6715a(progressBar2);
        }
    }
}
