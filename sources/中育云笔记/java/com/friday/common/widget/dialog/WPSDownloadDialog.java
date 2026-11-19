package com.friday.common.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FileUtils;
import com.friday.common.R$dimen;
import com.friday.common.R$layout;
import com.friday.common.R$style;
import com.friday.common.databinding.DialogDownloadWpsBinding;
import com.friday.common.widget.dialog.WPSDownloadDialog;
import com.lzy.okgo.model.Progress;
import java.io.File;
import java.net.URLDecoder;
import java.util.Arrays;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;
import p033b7.C5172a;
import p115d7.C9003e;
import p163g7.C9275a;
import p175h7.AbstractC9497a;
import p175h7.RunnableC9498b;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class WPSDownloadDialog extends DialogFragment {

    /* renamed from: d */
    public DialogDownloadWpsBinding f6192d;

    /* renamed from: e */
    public final String f6193e = URLDecoder.decode("https://ezy-upgrade.oss-cn-shanghai.aliyuncs.com/moffice_13.13.0_2052_cn00563_multidex_3a64542a409.apk", "utf-8");

    /* renamed from: f */
    public final InterfaceC10773d f6194f = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: l2.v
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return WPSDownloadDialog.m5391t(this.f24198c);
        }
    });

    /* renamed from: com.friday.common.widget.dialog.WPSDownloadDialog$a */
    public static final class C5974a extends AbstractC9497a {
        public C5974a(String str) {
            super(str);
        }

        @Override // p163g7.InterfaceC9276b
        /* renamed from: a */
        public void mo5395a(Progress progress) {
            DialogDownloadWpsBinding dialogDownloadWpsBinding = WPSDownloadDialog.this.f6192d;
            if (dialogDownloadWpsBinding == null) {
                AbstractC9979u.m20312y("dataBinding");
                dialogDownloadWpsBinding = null;
            }
            dialogDownloadWpsBinding.f5940c.setEnabled(false);
        }

        @Override // p163g7.InterfaceC9276b
        /* renamed from: b */
        public void mo5396b(Progress progress) {
            if (progress != null) {
                DialogDownloadWpsBinding dialogDownloadWpsBinding = WPSDownloadDialog.this.f6192d;
                if (dialogDownloadWpsBinding == null) {
                    AbstractC9979u.m20312y("dataBinding");
                    dialogDownloadWpsBinding = null;
                }
                TextView textView = dialogDownloadWpsBinding.f5942e;
                C9960c0 c9960c0 = C9960c0.f23411a;
                String str = String.format("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(progress.f12702h * 100)}, 1));
                AbstractC9979u.m20293f(str, "format(...)");
                textView.setText("下载中" + str + "%");
            }
        }

        @Override // p163g7.InterfaceC9276b
        /* renamed from: d */
        public void mo5398d(Progress progress) {
            AbstractC11958b.m26588i("下载出错，请重试");
            DialogDownloadWpsBinding dialogDownloadWpsBinding = WPSDownloadDialog.this.f6192d;
            DialogDownloadWpsBinding dialogDownloadWpsBinding2 = null;
            if (dialogDownloadWpsBinding == null) {
                AbstractC9979u.m20312y("dataBinding");
                dialogDownloadWpsBinding = null;
            }
            dialogDownloadWpsBinding.f5942e.setText("下载并安装");
            DialogDownloadWpsBinding dialogDownloadWpsBinding3 = WPSDownloadDialog.this.f6192d;
            if (dialogDownloadWpsBinding3 == null) {
                AbstractC9979u.m20312y("dataBinding");
            } else {
                dialogDownloadWpsBinding2 = dialogDownloadWpsBinding3;
            }
            dialogDownloadWpsBinding2.f5940c.setEnabled(true);
        }

        @Override // p163g7.InterfaceC9276b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo5397c(File file, Progress progress) {
            AppUtils.installApp(file);
            DialogDownloadWpsBinding dialogDownloadWpsBinding = WPSDownloadDialog.this.f6192d;
            if (dialogDownloadWpsBinding == null) {
                AbstractC9979u.m20312y("dataBinding");
                dialogDownloadWpsBinding = null;
            }
            dialogDownloadWpsBinding.f5942e.setText("下载中100%");
            WPSDownloadDialog.this.dismissAllowingStateLoss();
        }
    }

    /* renamed from: t */
    public static final C5974a m5391t(WPSDownloadDialog wPSDownloadDialog) {
        return wPSDownloadDialog.new C5974a(wPSDownloadDialog.f6193e);
    }

    /* renamed from: u */
    public static final void m5392u(WPSDownloadDialog wPSDownloadDialog, View view) {
        File externalCacheDir;
        Progress progressM17585k = C9003e.m17584n().m17585k(wPSDownloadDialog.f6193e);
        if (progressM17585k == null) {
            RunnableC9498b runnableC9498bM18264f = C9275a.m18264f(wPSDownloadDialog.f6193e, C5172a.m2691a(wPSDownloadDialog.f6193e));
            Context context = wPSDownloadDialog.getContext();
            runnableC9498bM18264f.m18702d((context == null || (externalCacheDir = context.getExternalCacheDir()) == null) ? null : externalCacheDir.getAbsolutePath()).m18701c("WPS.apk").m18712n().m18710l(wPSDownloadDialog.m5394s()).m18713o();
        } else if (!FileUtils.isFileExists(progressM17585k.f12700f)) {
            C9275a.m18265g(progressM17585k).m18710l(wPSDownloadDialog.m5394s()).m18711m();
        } else if (progressM17585k.f12706l != 5) {
            C9275a.m18265g(progressM17585k).m18710l(wPSDownloadDialog.m5394s()).m18713o();
        } else {
            AppUtils.installApp(progressM17585k.f12700f);
            wPSDownloadDialog.dismissAllowingStateLoss();
        }
    }

    /* renamed from: v */
    public static final void m5393v(WPSDownloadDialog wPSDownloadDialog, View view) {
        wPSDownloadDialog.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        DialogDownloadWpsBinding dialogDownloadWpsBinding = this.f6192d;
        DialogDownloadWpsBinding dialogDownloadWpsBinding2 = null;
        if (dialogDownloadWpsBinding == null) {
            AbstractC9979u.m20312y("dataBinding");
            dialogDownloadWpsBinding = null;
        }
        CardView cvGotIt = dialogDownloadWpsBinding.f5940c;
        AbstractC9979u.m20293f(cvGotIt, "cvGotIt");
        AbstractC11958b.m26591l(cvGotIt, 500L, new View.OnClickListener() { // from class: l2.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WPSDownloadDialog.m5392u(this.f24196c, view);
            }
        });
        DialogDownloadWpsBinding dialogDownloadWpsBinding3 = this.f6192d;
        if (dialogDownloadWpsBinding3 == null) {
            AbstractC9979u.m20312y("dataBinding");
        } else {
            dialogDownloadWpsBinding2 = dialogDownloadWpsBinding3;
        }
        dialogDownloadWpsBinding2.f5941d.setOnClickListener(new View.OnClickListener() { // from class: l2.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WPSDownloadDialog.m5393v(this.f24197c, view);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R$style.airPlayDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(inflater, R$layout.dialog_download_wps, viewGroup, false);
        AbstractC9979u.m20293f(viewDataBindingInflate, "inflate(...)");
        DialogDownloadWpsBinding dialogDownloadWpsBinding = (DialogDownloadWpsBinding) viewDataBindingInflate;
        this.f6192d = dialogDownloadWpsBinding;
        if (dialogDownloadWpsBinding == null) {
            AbstractC9979u.m20312y("dataBinding");
            dialogDownloadWpsBinding = null;
        }
        View root = dialogDownloadWpsBinding.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Progress progressM17585k = C9003e.m17584n().m17585k(this.f6193e);
        if (progressM17585k != null) {
            RunnableC9498b runnableC9498bM18265g = C9275a.m18265g(progressM17585k);
            runnableC9498bM18265g.m18703e();
            runnableC9498bM18265g.m18714p(progressM17585k.f12697c);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        WindowManager windowManager;
        Display defaultDisplay;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((int) getResources().getDimension(R$dimen.view_189), (int) getResources().getDimension(R$dimen.view_123));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
            dialog2.setCanceledOnTouchOutside(false);
        }
        super.onStart();
    }

    /* renamed from: s */
    public final C5974a m5394s() {
        return (C5974a) this.f6194f.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String str) {
        AbstractC9979u.m20294g(manager, "manager");
        try {
            manager.beginTransaction().remove(this).commit();
            super.show(manager, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
