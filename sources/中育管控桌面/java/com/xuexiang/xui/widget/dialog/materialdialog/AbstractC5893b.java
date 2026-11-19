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
import com.xuexiang.xui.utils.AbstractC5857e;
import com.xuexiang.xui.utils.AbstractC5859g;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;
import com.xuexiang.xui.widget.progress.materialprogressbar.C5959l;
import com.xuexiang.xui.widget.progress.materialprogressbar.IndeterminateCircularProgressDrawable;
import com.xuexiang.xui.widget.progress.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import p017b2.AbstractC4411b;
import p017b2.InterfaceC4410a;
import p140r1.C7637a;

/* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5893b {
    /* renamed from: a */
    public static void m4629a(ProgressBar progressBar) {
    }

    /* renamed from: b */
    public static int m4630b(MaterialDialog.C5891g c5891g) {
        return c5891g.f4895s != null ? R$layout.xmd_layout_dialog_custom : (c5891g.f4881l == null && c5891g.f4848P == null) ? c5891g.f4864c0 > -2 ? R$layout.xmd_layout_dialog_progress : c5891g.f4860a0 ? c5891g.f4896s0 ? R$layout.xmd_layout_dialog_progress_indeterminate_horizontal : R$layout.xmd_layout_dialog_progress_indeterminate : c5891g.f4886n0 != null ? R$layout.xmd_layout_dialog_basic_check : R$layout.xmd_layout_dialog_basic : c5891g.f4886n0 != null ? R$layout.xmd_layout_dialog_list_check : R$layout.xmd_layout_dialog_list;
    }

    /* renamed from: c */
    public static int m4631c(MaterialDialog.C5891g c5891g) {
        int i6 = c5891g.f4830C;
        if (i6 != -1) {
            return i6;
        }
        Context context = c5891g.f4859a;
        int i7 = R$attr.md_dark_theme;
        Theme theme = c5891g.f4828B;
        Theme theme2 = Theme.DARK;
        boolean zM4386l = AbstractC5859g.m4386l(context, i7, theme == theme2);
        if (!zM4386l) {
            theme2 = Theme.LIGHT;
        }
        c5891g.f4828B = theme2;
        return zM4386l ? R$style.MD_Dark : R$style.MD_Light;
    }

    /* renamed from: d */
    public static void m4632d(MaterialDialog materialDialog) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, SecurityException, IllegalArgumentException {
        MaterialDialog.C5891g c5891g = materialDialog.f4792c;
        materialDialog.setCancelable(c5891g.f4832D);
        materialDialog.setCanceledOnTouchOutside(c5891g.f4834E);
        if (c5891g.f4857Y == 0) {
            c5891g.f4857Y = AbstractC5859g.m4388n(c5891g.f4859a, R$attr.md_background_color, AbstractC5859g.m4387m(materialDialog.getContext(), R$attr.colorBackgroundFloating));
        }
        if (c5891g.f4857Y != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(c5891g.f4859a.getResources().getDimension(R$dimen.md_bg_corner_radius));
            gradientDrawable.setColor(c5891g.f4857Y);
            materialDialog.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!c5891g.f4904w0) {
            c5891g.f4901v = AbstractC5859g.m4384j(c5891g.f4859a, R$attr.md_positive_color, c5891g.f4901v);
        }
        if (!c5891g.f4906x0) {
            c5891g.f4905x = AbstractC5859g.m4384j(c5891g.f4859a, R$attr.md_neutral_color, c5891g.f4905x);
        }
        if (!c5891g.f4908y0) {
            c5891g.f4903w = AbstractC5859g.m4384j(c5891g.f4859a, R$attr.md_negative_color, c5891g.f4903w);
        }
        if (!c5891g.f4910z0) {
            c5891g.f4897t = AbstractC5859g.m4388n(c5891g.f4859a, R$attr.md_widget_color, c5891g.f4897t);
        }
        if (!c5891g.f4898t0) {
            c5891g.f4875i = AbstractC5859g.m4388n(c5891g.f4859a, R$attr.md_title_color, AbstractC5859g.m4387m(materialDialog.getContext(), R.attr.textColorPrimary));
        }
        if (!c5891g.f4900u0) {
            c5891g.f4877j = AbstractC5859g.m4388n(c5891g.f4859a, R$attr.md_content_color, AbstractC5859g.m4387m(materialDialog.getContext(), R.attr.textColorSecondary));
        }
        if (!c5891g.f4902v0) {
            c5891g.f4858Z = AbstractC5859g.m4388n(c5891g.f4859a, R$attr.md_item_color, c5891g.f4877j);
        }
        materialDialog.f4795f = (TextView) materialDialog.f3a.findViewById(R$id.md_title);
        materialDialog.f4794e = (ImageView) materialDialog.f3a.findViewById(R$id.md_icon);
        materialDialog.f4799j = materialDialog.f3a.findViewById(R$id.md_titleFrame);
        materialDialog.f4796g = (TextView) materialDialog.f3a.findViewById(R$id.md_content);
        materialDialog.f4798i = (RecyclerView) materialDialog.f3a.findViewById(R$id.md_contentRecyclerView);
        materialDialog.f4805p = (CheckBox) materialDialog.f3a.findViewById(R$id.md_promptCheckbox);
        materialDialog.f4806q = (MDButton) materialDialog.f3a.findViewById(R$id.md_buttonDefaultPositive);
        materialDialog.f4807r = (MDButton) materialDialog.f3a.findViewById(R$id.md_buttonDefaultNeutral);
        materialDialog.f4808s = (MDButton) materialDialog.f3a.findViewById(R$id.md_buttonDefaultNegative);
        materialDialog.f4806q.setVisibility(c5891g.f4883m != null ? 0 : 8);
        materialDialog.f4807r.setVisibility(c5891g.f4885n != null ? 0 : 8);
        materialDialog.f4808s.setVisibility(c5891g.f4887o != null ? 0 : 8);
        materialDialog.f4806q.setFocusable(true);
        materialDialog.f4807r.setFocusable(true);
        materialDialog.f4808s.setFocusable(true);
        if (c5891g.f4889p) {
            materialDialog.f4806q.requestFocus();
        }
        if (c5891g.f4891q) {
            materialDialog.f4807r.requestFocus();
        }
        if (c5891g.f4893r) {
            materialDialog.f4808s.requestFocus();
        }
        if (c5891g.f4845M != null) {
            materialDialog.f4794e.setVisibility(0);
            materialDialog.f4794e.setImageDrawable(c5891g.f4845M);
        } else {
            Drawable drawableM4391q = AbstractC5859g.m4391q(c5891g.f4859a, R$attr.md_icon);
            if (drawableM4391q != null) {
                materialDialog.f4794e.setVisibility(0);
                materialDialog.f4794e.setImageDrawable(drawableM4391q);
            } else {
                materialDialog.f4794e.setVisibility(8);
            }
        }
        int dimensionPixelSize = c5891g.f4847O;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = AbstractC5859g.m4389o(c5891g.f4859a, R$attr.md_icon_max_size);
        }
        if (c5891g.f4846N || AbstractC5859g.m4385k(c5891g.f4859a, R$attr.md_icon_limit_icon_to_default_size)) {
            dimensionPixelSize = c5891g.f4859a.getResources().getDimensionPixelSize(R$dimen.default_md_icon_max_size);
        }
        if (dimensionPixelSize > -1) {
            materialDialog.f4794e.setAdjustViewBounds(true);
            materialDialog.f4794e.setMaxHeight(dimensionPixelSize);
            materialDialog.f4794e.setMaxWidth(dimensionPixelSize);
            materialDialog.f4794e.requestLayout();
        }
        if (!c5891g.f4827A0) {
            c5891g.f4856X = AbstractC5859g.m4388n(c5891g.f4859a, R$attr.md_divider_color, AbstractC5859g.m4387m(materialDialog.getContext(), R$attr.md_divider));
        }
        materialDialog.f3a.setDividerColor(c5891g.f4856X);
        TextView textView = materialDialog.f4795f;
        if (textView != null) {
            materialDialog.m4603u(textView, c5891g.f4844L);
            materialDialog.f4795f.setTextColor(c5891g.f4875i);
            materialDialog.f4795f.setGravity(c5891g.f4863c.m4583a());
            materialDialog.f4795f.setTextAlignment(c5891g.f4863c.m4584b());
            CharSequence charSequence = c5891g.f4861b;
            if (charSequence == null) {
                materialDialog.f4799j.setVisibility(8);
            } else {
                materialDialog.f4795f.setText(charSequence);
                materialDialog.f4799j.setVisibility(0);
            }
        }
        TextView textView2 = materialDialog.f4796g;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            materialDialog.m4603u(materialDialog.f4796g, c5891g.f4843K);
            materialDialog.f4796g.setLineSpacing(0.0f, c5891g.f4836F);
            ColorStateList colorStateList = c5891g.f4907y;
            if (colorStateList == null) {
                materialDialog.f4796g.setLinkTextColor(AbstractC5859g.m4387m(materialDialog.getContext(), R.attr.textColorPrimary));
            } else {
                materialDialog.f4796g.setLinkTextColor(colorStateList);
            }
            materialDialog.f4796g.setTextColor(c5891g.f4877j);
            materialDialog.f4796g.setGravity(c5891g.f4865d.m4583a());
            materialDialog.f4796g.setTextAlignment(c5891g.f4865d.m4584b());
            CharSequence charSequence2 = c5891g.f4879k;
            if (charSequence2 != null) {
                materialDialog.f4796g.setText(charSequence2);
                materialDialog.f4796g.setVisibility(0);
            } else {
                materialDialog.f4796g.setVisibility(8);
            }
        }
        CheckBox checkBox = materialDialog.f4805p;
        if (checkBox != null) {
            checkBox.setText(c5891g.f4886n0);
            materialDialog.f4805p.setChecked(c5891g.f4888o0);
            materialDialog.f4805p.setOnCheckedChangeListener(c5891g.f4890p0);
            materialDialog.m4603u(materialDialog.f4805p, c5891g.f4843K);
            materialDialog.f4805p.setTextColor(c5891g.f4877j);
            AbstractC4411b.m1466c(materialDialog.f4805p, c5891g.f4897t);
        }
        materialDialog.f3a.setButtonGravity(c5891g.f4871g);
        materialDialog.f3a.setButtonStackedGravity(c5891g.f4867e);
        materialDialog.f3a.setStackingBehavior(c5891g.f4854V);
        boolean zM4386l = AbstractC5859g.m4386l(c5891g.f4859a, R.attr.textAllCaps, true);
        if (zM4386l) {
            zM4386l = AbstractC5859g.m4386l(c5891g.f4859a, R$attr.textAllCaps, true);
        }
        MDButton mDButton = materialDialog.f4806q;
        materialDialog.m4603u(mDButton, c5891g.f4844L);
        mDButton.setAllCapsCompat(zM4386l);
        mDButton.setText(c5891g.f4883m);
        mDButton.setTextColor(c5891g.f4901v);
        MDButton mDButton2 = materialDialog.f4806q;
        DialogAction dialogAction = DialogAction.POSITIVE;
        mDButton2.setStackedSelector(materialDialog.m4590h(dialogAction, true));
        materialDialog.f4806q.setDefaultSelector(materialDialog.m4590h(dialogAction, false));
        materialDialog.f4806q.setTag(dialogAction);
        materialDialog.f4806q.setOnClickListener(materialDialog);
        materialDialog.f4806q.setVisibility(0);
        MDButton mDButton3 = materialDialog.f4808s;
        materialDialog.m4603u(mDButton3, c5891g.f4844L);
        mDButton3.setAllCapsCompat(zM4386l);
        mDButton3.setText(c5891g.f4887o);
        mDButton3.setTextColor(c5891g.f4903w);
        MDButton mDButton4 = materialDialog.f4808s;
        DialogAction dialogAction2 = DialogAction.NEGATIVE;
        mDButton4.setStackedSelector(materialDialog.m4590h(dialogAction2, true));
        materialDialog.f4808s.setDefaultSelector(materialDialog.m4590h(dialogAction2, false));
        materialDialog.f4808s.setTag(dialogAction2);
        materialDialog.f4808s.setOnClickListener(materialDialog);
        materialDialog.f4808s.setVisibility(0);
        MDButton mDButton5 = materialDialog.f4807r;
        materialDialog.m4603u(mDButton5, c5891g.f4844L);
        mDButton5.setAllCapsCompat(zM4386l);
        mDButton5.setText(c5891g.f4885n);
        mDButton5.setTextColor(c5891g.f4905x);
        MDButton mDButton6 = materialDialog.f4807r;
        DialogAction dialogAction3 = DialogAction.NEUTRAL;
        mDButton6.setStackedSelector(materialDialog.m4590h(dialogAction3, true));
        materialDialog.f4807r.setDefaultSelector(materialDialog.m4590h(dialogAction3, false));
        materialDialog.f4807r.setTag(dialogAction3);
        materialDialog.f4807r.setOnClickListener(materialDialog);
        materialDialog.f4807r.setVisibility(0);
        if (materialDialog.f4798i != null) {
            Object obj = c5891g.f4848P;
            if (obj == null) {
                MaterialDialog.ListType listType = MaterialDialog.ListType.REGULAR;
                materialDialog.f4809t = listType;
                c5891g.f4848P = new C5892a(materialDialog, MaterialDialog.ListType.m4606a(listType));
            } else if (obj instanceof InterfaceC4410a) {
                ((InterfaceC4410a) obj).mo1463a(materialDialog);
            }
        }
        m4634f(materialDialog);
        m4633e(materialDialog);
        if (c5891g.f4895s != null) {
            ((MDRootLayout) materialDialog.f3a.findViewById(R$id.md_root)).m4656t();
            FrameLayout frameLayout = (FrameLayout) materialDialog.f3a.findViewById(R$id.md_customViewFrame);
            materialDialog.f4800k = frameLayout;
            View view = c5891g.f4895s;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (c5891g.f4855W) {
                Resources resources = materialDialog.getContext().getResources();
                int iM4390p = AbstractC5859g.m4390p(materialDialog.getContext(), R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
                C7637a c7637a = new C7637a(materialDialog.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.md_content_padding_top);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.md_content_padding_bottom);
                c7637a.setClipToPadding(false);
                if (view instanceof EditText) {
                    c7637a.setPadding(iM4390p, dimensionPixelSize2, iM4390p, dimensionPixelSize3);
                } else {
                    c7637a.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(iM4390p, 0, iM4390p, 0);
                }
                c7637a.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = c7637a;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = c5891g.f4853U;
        if (onShowListener != null) {
            materialDialog.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = c5891g.f4851S;
        if (onCancelListener != null) {
            materialDialog.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = c5891g.f4850R;
        if (onDismissListener != null) {
            materialDialog.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = c5891g.f4852T;
        if (onKeyListener != null) {
            materialDialog.setOnKeyListener(onKeyListener);
        }
        materialDialog.m10b();
        materialDialog.m4598p();
        materialDialog.m11c(materialDialog.f3a);
        materialDialog.m4587e();
        Display defaultDisplay = materialDialog.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i6 = point.x;
        int i7 = point.y;
        Context context = c5891g.f4859a;
        int iM4390p2 = AbstractC5859g.m4390p(context, R$attr.md_dialog_vertical_margin, AbstractC5857e.m4364e(context, R$dimen.default_md_dialog_vertical_margin_phone));
        Context context2 = c5891g.f4859a;
        int iM4390p3 = AbstractC5859g.m4390p(context2, R$attr.md_dialog_horizontal_margin, AbstractC5857e.m4364e(context2, R$dimen.default_md_dialog_horizontal_margin_phone));
        materialDialog.f3a.setMaxHeight(i7 - (iM4390p2 * 2));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(materialDialog.getWindow().getAttributes());
        layoutParams.width = Math.min(AbstractC5859g.m4389o(c5891g.f4859a, R$attr.md_dialog_max_width), i6 - (iM4390p3 * 2));
        materialDialog.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: e */
    public static void m4633e(MaterialDialog materialDialog) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        MaterialDialog.C5891g c5891g = materialDialog.f4792c;
        EditText editText = (EditText) materialDialog.f3a.findViewById(R.id.input);
        materialDialog.f4797h = editText;
        if (editText == null) {
            return;
        }
        materialDialog.m4603u(editText, c5891g.f4843K);
        CharSequence charSequence = c5891g.f4868e0;
        if (charSequence != null) {
            materialDialog.f4797h.setText(charSequence);
        }
        materialDialog.m4601s();
        materialDialog.f4797h.setHint(c5891g.f4870f0);
        materialDialog.f4797h.setSingleLine();
        materialDialog.f4797h.setTextColor(c5891g.f4877j);
        materialDialog.f4797h.setHintTextColor(AbstractC5859g.m4375a(c5891g.f4877j, 0.3f));
        AbstractC4411b.m1468e(materialDialog.f4797h, materialDialog.f4792c.f4897t);
        int i6 = c5891g.f4874h0;
        if (i6 != -1) {
            materialDialog.f4797h.setInputType(i6);
            int i7 = c5891g.f4874h0;
            if (i7 != 144 && (i7 & 128) == 128) {
                materialDialog.f4797h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        TextView textView = (TextView) materialDialog.f3a.findViewById(R$id.md_minMax);
        materialDialog.f4804o = textView;
        if (c5891g.f4878j0 > 0 || c5891g.f4880k0 > -1) {
            materialDialog.m4597o(materialDialog.f4797h.getText().toString().length(), !c5891g.f4872g0);
        } else {
            textView.setVisibility(8);
            materialDialog.f4804o = null;
        }
    }

    /* renamed from: f */
    public static void m4634f(MaterialDialog materialDialog) {
        MaterialDialog.C5891g c5891g = materialDialog.f4792c;
        if (c5891g.f4860a0 || c5891g.f4864c0 > -2) {
            ProgressBar progressBar = (ProgressBar) materialDialog.f3a.findViewById(R.id.progress);
            materialDialog.f4801l = progressBar;
            if (progressBar == null) {
                return;
            }
            if (!c5891g.f4860a0) {
                C5959l c5959l = new C5959l(c5891g.m4612f());
                c5959l.setTint(c5891g.f4897t);
                materialDialog.f4801l.setProgressDrawable(c5959l);
                materialDialog.f4801l.setIndeterminateDrawable(c5959l);
            } else if (c5891g.f4896s0) {
                IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(c5891g.m4612f());
                indeterminateHorizontalProgressDrawable.setTint(c5891g.f4897t);
                materialDialog.f4801l.setProgressDrawable(indeterminateHorizontalProgressDrawable);
                materialDialog.f4801l.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
            } else {
                IndeterminateCircularProgressDrawable indeterminateCircularProgressDrawable = new IndeterminateCircularProgressDrawable(c5891g.m4612f());
                indeterminateCircularProgressDrawable.setTint(c5891g.f4897t);
                materialDialog.f4801l.setProgressDrawable(indeterminateCircularProgressDrawable);
                materialDialog.f4801l.setIndeterminateDrawable(indeterminateCircularProgressDrawable);
            }
            boolean z6 = c5891g.f4860a0;
            if (!z6 || c5891g.f4896s0) {
                materialDialog.f4801l.setIndeterminate(z6 && c5891g.f4896s0);
                materialDialog.f4801l.setProgress(0);
                materialDialog.f4801l.setMax(c5891g.f4866d0);
                TextView textView = (TextView) materialDialog.f3a.findViewById(R$id.md_label);
                materialDialog.f4802m = textView;
                if (textView != null) {
                    materialDialog.m4603u(textView, c5891g.f4844L);
                    materialDialog.f4802m.setText(c5891g.f4894r0.format(0L));
                }
                TextView textView2 = (TextView) materialDialog.f3a.findViewById(R$id.md_minMax);
                materialDialog.f4803n = textView2;
                if (textView2 != null) {
                    materialDialog.m4603u(textView2, c5891g.f4843K);
                    if (c5891g.f4862b0) {
                        materialDialog.f4803n.setVisibility(0);
                        materialDialog.f4803n.setText(String.format(c5891g.f4892q0, 0, Integer.valueOf(c5891g.f4866d0)));
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) materialDialog.f4801l.getLayoutParams();
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = 0;
                    } else {
                        materialDialog.f4803n.setVisibility(8);
                    }
                } else {
                    c5891g.f4862b0 = false;
                }
            }
        }
        ProgressBar progressBar2 = materialDialog.f4801l;
        if (progressBar2 != null) {
            m4629a(progressBar2);
        }
    }
}
