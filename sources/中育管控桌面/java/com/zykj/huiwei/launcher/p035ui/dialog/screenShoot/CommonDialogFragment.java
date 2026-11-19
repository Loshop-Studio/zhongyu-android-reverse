package com.zykj.huiwei.launcher.p035ui.dialog.screenShoot;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import com.blankj.utilcode.util.AbstractC4646g;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.zykj.huiwei.launcher.databinding.FragmentSingleDialogBinding;
import com.zykj.huiwei.launcher.p035ui.dialog.screenShoot.CommonDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b4\b\u0007\u0018\u0000 b2\u00020\u0001:\u000203B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J-\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001e\u0010\u001aJg\u0010(\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00152\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)Jg\u0010*\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00152\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b*\u0010)J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00104R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00104R\u0018\u0010?\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00106R\u0018\u0010A\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00108R\u0018\u0010B\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00106R\u0018\u0010C\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00106R\u0018\u0010D\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00106R\u0018\u0010E\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00106R\u0018\u0010F\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00104R\u0018\u0010H\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00106R\u0018\u0010J\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00108R\u0018\u0010L\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00106R\u0018\u0010N\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00106R\u0018\u0010P\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00106R\u0018\u0010R\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00106R\"\u0010X\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010.R\u0018\u0010[\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0016\u0010_\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010TR\u0014\u0010a\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010`¨\u0006c"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onDestroy", "", "title", "", "titleColor", "", "titleSize", "o", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;)V", "message", "messageColor", "messageSize", "l", "text", "textColor", "textSize", "backgroundTint", "cornerRadius", "strokeColor", "strokeWidth", "Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;", "listener", "m", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;)V", "n", "", "center", "k", "(Z)V", "Lcom/zykj/huiwei/launcher/databinding/FragmentSingleDialogBinding;", "a", "Lcom/zykj/huiwei/launcher/databinding/FragmentSingleDialogBinding;", "dialogBinding", "b", "Ljava/lang/String;", "c", "Ljava/lang/Integer;", "d", "Ljava/lang/Float;", "e", "f", "g", "h", "negativeButtonText", "i", "negativeButtonTextColor", "j", "negativeButtonTextSize", "negativeBackgroundTint", "negativeCornerRadius", "negativeStrokeColor", "negativeStrokeWidth", "positiveButtonText", "p", "positiveButtonTextColor", "q", "positiveButtonTextSize", "r", "positiveBackgroundTint", "s", "positiveCornerRadius", "t", "positiveStrokeColor", "u", "positiveStrokeWidth", "v", "Z", "getDialogCancelable", "()Z", "setDialogCancelable", "dialogCancelable", "w", "Lcom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment$b;", "positiveButtonListener", "x", "negativeButtonListener", "y", "isCenter", "()Lcom/zykj/huiwei/launcher/databinding/FragmentSingleDialogBinding;", "binding", "z", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nCommonDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonDialogFragment.kt\ncom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n327#2,4:264\n327#2,4:268\n1#3:272\n*S KotlinDebug\n*F\n+ 1 CommonDialogFragment.kt\ncom/zykj/huiwei/launcher/ui/dialog/screenShoot/CommonDialogFragment\n*L\n97#1:264,4\n140#1:268,4\n*E\n"})
/* loaded from: classes4.dex */
public final class CommonDialogFragment extends DialogFragment {

    /* renamed from: a, reason: from kotlin metadata */
    public FragmentSingleDialogBinding dialogBinding;

    /* renamed from: b, reason: from kotlin metadata */
    public String title;

    /* renamed from: c, reason: from kotlin metadata */
    public Integer titleColor;

    /* renamed from: d, reason: from kotlin metadata */
    public Float titleSize;

    /* renamed from: e, reason: from kotlin metadata */
    public String message;

    /* renamed from: f, reason: from kotlin metadata */
    public Integer messageColor;

    /* renamed from: g, reason: from kotlin metadata */
    public Float messageSize;

    /* renamed from: h, reason: from kotlin metadata */
    public String negativeButtonText;

    /* renamed from: i, reason: from kotlin metadata */
    public Integer negativeButtonTextColor;

    /* renamed from: j, reason: from kotlin metadata */
    public Float negativeButtonTextSize;

    /* renamed from: k, reason: from kotlin metadata */
    public Integer negativeBackgroundTint;

    /* renamed from: l, reason: from kotlin metadata */
    public Integer negativeCornerRadius;

    /* renamed from: m, reason: from kotlin metadata */
    public Integer negativeStrokeColor;

    /* renamed from: n, reason: from kotlin metadata */
    public Integer negativeStrokeWidth;

    /* renamed from: o, reason: from kotlin metadata */
    public String positiveButtonText;

    /* renamed from: p, reason: from kotlin metadata */
    public Integer positiveButtonTextColor;

    /* renamed from: q, reason: from kotlin metadata */
    public Float positiveButtonTextSize;

    /* renamed from: r, reason: from kotlin metadata */
    public Integer positiveBackgroundTint;

    /* renamed from: s, reason: from kotlin metadata */
    public Integer positiveCornerRadius;

    /* renamed from: t, reason: from kotlin metadata */
    public Integer positiveStrokeColor;

    /* renamed from: u, reason: from kotlin metadata */
    public Integer positiveStrokeWidth;

    /* renamed from: v, reason: from kotlin metadata */
    public boolean dialogCancelable = true;

    /* renamed from: w, reason: from kotlin metadata */
    public InterfaceC6131b positiveButtonListener;

    /* renamed from: x, reason: from kotlin metadata */
    public InterfaceC6131b negativeButtonListener;

    /* renamed from: y, reason: from kotlin metadata */
    public boolean isCenter;

    /* renamed from: A */
    public static final int f6577A = 8;

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.screenShoot.CommonDialogFragment$b */
    public interface InterfaceC6131b {
        /* renamed from: a */
        void mo5823a(Dialog dialog);
    }

    /* renamed from: i */
    public static final void m5815i(CommonDialogFragment commonDialogFragment, View view) {
        InterfaceC6131b interfaceC6131b = commonDialogFragment.positiveButtonListener;
        if (interfaceC6131b != null) {
            interfaceC6131b.mo5823a(commonDialogFragment.getDialog());
        }
    }

    /* renamed from: j */
    public static final void m5816j(CommonDialogFragment commonDialogFragment, View view) {
        InterfaceC6131b interfaceC6131b = commonDialogFragment.negativeButtonListener;
        if (interfaceC6131b != null) {
            interfaceC6131b.mo5823a(commonDialogFragment.getDialog());
        } else {
            commonDialogFragment.dismiss();
        }
    }

    /* renamed from: h */
    public final FragmentSingleDialogBinding m5817h() {
        FragmentSingleDialogBinding fragmentSingleDialogBinding = this.dialogBinding;
        Intrinsics.checkNotNull(fragmentSingleDialogBinding);
        return fragmentSingleDialogBinding;
    }

    /* renamed from: k */
    public final void m5818k(boolean center) {
        this.isCenter = center;
    }

    /* renamed from: l */
    public final void m5819l(String message, Integer messageColor, Float messageSize) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.messageColor = messageColor;
        this.messageSize = messageSize;
    }

    /* renamed from: m */
    public final void m5820m(String text, Integer textColor, Float textSize, Integer backgroundTint, Integer cornerRadius, Integer strokeColor, Integer strokeWidth, InterfaceC6131b listener) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.negativeButtonText = text;
        this.negativeButtonTextColor = textColor;
        this.negativeButtonTextSize = textSize;
        this.negativeBackgroundTint = backgroundTint;
        this.negativeCornerRadius = cornerRadius;
        this.negativeStrokeColor = strokeColor;
        this.negativeStrokeWidth = strokeWidth;
        this.negativeButtonListener = listener;
    }

    /* renamed from: n */
    public final void m5821n(String text, Integer textColor, Float textSize, Integer backgroundTint, Integer cornerRadius, Integer strokeColor, Integer strokeWidth, InterfaceC6131b listener) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.positiveButtonText = text;
        this.positiveButtonTextColor = textColor;
        this.positiveButtonTextSize = textSize;
        this.positiveBackgroundTint = backgroundTint;
        this.positiveCornerRadius = cornerRadius;
        this.positiveStrokeColor = strokeColor;
        this.positiveStrokeWidth = strokeWidth;
        this.positiveButtonListener = listener;
    }

    /* renamed from: o */
    public final void m5822o(String title, Integer titleColor, Float titleSize) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.titleColor = titleColor;
        this.titleSize = titleSize;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.dialogBinding = FragmentSingleDialogBinding.inflate(inflater, container, false);
        FrameLayout root = m5817h().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.dialogBinding = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setDimAmount(0.5f);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setLayout(-1, -2);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String str2 = this.title;
        if (str2 != null) {
            m5817h().tvTitle.setVisibility(0);
            m5817h().tvTitle.setText(str2);
        } else {
            m5817h().tvTitle.setVisibility(8);
        }
        Integer num = this.titleColor;
        if (num != null) {
            m5817h().tvTitle.setTextColor(num.intValue());
        }
        Float f6 = this.titleSize;
        if (f6 != null) {
            m5817h().tvTitle.setTextSize(f6.floatValue());
        }
        String str3 = this.message;
        if (str3 != null) {
            m5817h().tvMessage.setVisibility(0);
            m5817h().tvMessage.setText(str3);
            int i6 = 1;
            if (!this.isCenter && (str = this.title) != null && str.length() != 0) {
                i6 = 0;
            }
            String str4 = this.title;
            int iM2185e = AbstractC4646g.m2185e((str4 == null || str4.length() == 0) ? 26.0f : 12.0f);
            m5817h().tvMessage.setGravity(i6);
            MaterialTextView tvMessage = m5817h().tvMessage;
            Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
            ViewGroup.LayoutParams layoutParams = tvMessage.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = iM2185e;
            tvMessage.setLayoutParams(layoutParams2);
        } else {
            m5817h().tvMessage.setVisibility(8);
        }
        Integer num2 = this.messageColor;
        if (num2 != null) {
            m5817h().tvMessage.setTextColor(num2.intValue());
        }
        Float f7 = this.messageSize;
        if (f7 != null) {
            m5817h().tvMessage.setTextSize(f7.floatValue());
        }
        String str5 = this.negativeButtonText;
        if (str5 != null) {
            m5817h().btnNegative.setVisibility(0);
            m5817h().btnNegative.setText(str5);
        } else {
            m5817h().btnNegative.setVisibility(8);
        }
        Integer num3 = this.negativeButtonTextColor;
        if (num3 != null) {
            m5817h().btnNegative.setTextColor(num3.intValue());
        }
        Float f8 = this.negativeButtonTextSize;
        if (f8 != null) {
            m5817h().btnNegative.setTextSize(f8.floatValue());
        }
        Integer num4 = this.negativeBackgroundTint;
        if (num4 != null) {
            m5817h().btnNegative.setTextColor(num4.intValue());
        }
        Integer num5 = this.negativeCornerRadius;
        if (num5 != null) {
            m5817h().btnNegative.setCornerRadius(num5.intValue());
        }
        Integer num6 = this.negativeStrokeColor;
        if (num6 != null) {
            m5817h().btnNegative.setStrokeColorResource(num6.intValue());
        }
        Integer num7 = this.negativeStrokeWidth;
        if (num7 != null) {
            m5817h().btnNegative.setStrokeWidth(num7.intValue());
        }
        String str6 = this.positiveButtonText;
        if (str6 != null) {
            m5817h().btnPositive.setVisibility(0);
            m5817h().btnPositive.setText(str6);
            String str7 = this.negativeButtonText;
            if (str7 == null || str7.length() == 0) {
                MaterialButton btnPositive = m5817h().btnPositive;
                Intrinsics.checkNotNullExpressionValue(btnPositive, "btnPositive");
                ViewGroup.LayoutParams layoutParams3 = btnPositive.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                ((ViewGroup.MarginLayoutParams) layoutParams4).width = AbstractC4646g.m2185e(127.0f);
                btnPositive.setLayoutParams(layoutParams4);
            }
        } else {
            m5817h().btnPositive.setVisibility(8);
        }
        Integer num8 = this.positiveButtonTextColor;
        if (num8 != null) {
            m5817h().btnPositive.setTextColor(num8.intValue());
        }
        Float f9 = this.positiveButtonTextSize;
        if (f9 != null) {
            m5817h().btnPositive.setTextSize(f9.floatValue());
        }
        Integer num9 = this.positiveBackgroundTint;
        if (num9 != null) {
            m5817h().btnPositive.setTextColor(num9.intValue());
        }
        Integer num10 = this.positiveCornerRadius;
        if (num10 != null) {
            m5817h().btnPositive.setCornerRadius(num10.intValue());
        }
        Integer num11 = this.positiveStrokeColor;
        if (num11 != null) {
            m5817h().btnPositive.setStrokeColorResource(num11.intValue());
        }
        Integer num12 = this.positiveStrokeWidth;
        if (num12 != null) {
            m5817h().btnPositive.setStrokeWidth(num12.intValue());
        }
        m5817h().btnPositive.setOnClickListener(new View.OnClickListener() { // from class: e4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CommonDialogFragment.m5815i(this.f7626a, view2);
            }
        });
        m5817h().btnNegative.setOnClickListener(new View.OnClickListener() { // from class: e4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CommonDialogFragment.m5816j(this.f7627a, view2);
            }
        });
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(this.dialogCancelable);
        }
    }
}
