package com.zykj.study.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.bumptech.glide.C5396g;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6935c;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.DialogShowBigImageBinding;
import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p105g0.C8514b;
import p113g8.AbstractC8687z;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.AbstractC9536a;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShowBigImageDialog extends Hilt_ShowBigImageDialog<DialogShowBigImageBinding> {

    /* renamed from: f */
    public final NavArgsLazy f11213f = new NavArgsLazy(AbstractC9137y.m16154b(ShowBigImageDialogArgs.class), new C7723b(this));

    /* renamed from: com.zykj.study.dialog.ShowBigImageDialog$a */
    public static final class C7722a implements ViewOnTouchListenerC6935c.f {
        public C7722a() {
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6935c.f
        /* renamed from: a */
        public void mo6953a() {
            FragmentKt.findNavController(ShowBigImageDialog.this).navigateUp();
        }

        @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6935c.f
        /* renamed from: b */
        public void mo6954b(View view, float f10, float f11) {
            FragmentKt.findNavController(ShowBigImageDialog.this).navigateUp();
        }
    }

    /* renamed from: com.zykj.study.dialog.ShowBigImageDialog$b */
    public static final class C7723b implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11215a;

        public C7723b(Fragment fragment) {
            this.f11215a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11215a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11215a + " has null arguments");
        }
    }

    /* renamed from: g */
    public final ShowBigImageDialogArgs m10283g() {
        return (ShowBigImageDialogArgs) this.f11213f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        if (AbstractC8687z.m14105M(m10283g().m10285a(), "http", false, 2, null)) {
            AbstractC9133u.m16130d(ComponentCallbacks2C5391b.m2738t(requireContext()).m2809u(m10283g().m10285a()).m2790w0(((DialogShowBigImageBinding) getMBindView()).ivShow));
        } else {
            File file = new File(m10283g().m10285a());
            if (file.exists()) {
                ((C5396g) ComponentCallbacks2C5391b.m2738t(requireContext()).m2807s(file).m13383d0(new C8514b(AbstractC9536a.m17799d(file.lastModified())))).m2790w0(((DialogShowBigImageBinding) getMBindView()).ivShow);
            }
        }
        ((DialogShowBigImageBinding) getMBindView()).ivShow.setOnPhotoTapListener(new C7722a());
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_show_big_image;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(true);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCanceledOnTouchOutside(false);
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
    }
}
