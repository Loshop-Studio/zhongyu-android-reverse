package com.zykj.huiwei.launcher.p035ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.ComponentCallbacks2C4684i;
import com.zykj.base.BaseFragment;
import com.zykj.download.OssUtils;
import com.zykj.huiwei.launcher.databinding.DiscoveryFragmentImageBinding;
import com.zykj.manage.R;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0094@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/activity/ImageFragment;", "Lcom/zykj/base/BaseFragment;", "Lcom/zykj/huiwei/launcher/databinding/DiscoveryFragmentImageBinding;", "<init>", "()V", "", "layoutId", "()I", "", "initData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "a", "Ljava/lang/String;", "localPath", "b", "urlPath", "c", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class ImageFragment extends BaseFragment<DiscoveryFragmentImageBinding> {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d */
    public static final int f6374d = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public String localPath;

    /* renamed from: b, reason: from kotlin metadata */
    public String urlPath;

    /* renamed from: com.zykj.huiwei.launcher.ui.activity.ImageFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ImageFragment m5581a(String path, String url) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(url, "url");
            ImageFragment imageFragment = new ImageFragment();
            Bundle bundle = new Bundle();
            bundle.putString(OssUtils.FILE_PATH, path);
            bundle.putString("url_path", url);
            imageFragment.setArguments(bundle);
            return imageFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: f */
    public final void m5580f() {
        ImageView imageView;
        String str = this.localPath;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localPath");
            str = null;
        }
        if (!new File(str).exists()) {
            Context contextRequireContext = requireContext();
            String str3 = this.localPath;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localPath");
            } else {
                str2 = str3;
            }
            Toast.makeText(contextRequireContext, "文件不存在:" + str2, 0).show();
            return;
        }
        View view = getView();
        if (view == null || (imageView = (ImageView) view.findViewById(R.id.iv_prev)) == null) {
            return;
        }
        ComponentCallbacks2C4684i componentCallbacks2C4684iM2476t = ComponentCallbacks2C4678c.m2476t(requireContext());
        String str4 = this.urlPath;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("urlPath");
        } else {
            str2 = str4;
        }
        componentCallbacks2C4684iM2476t.mo2544t(str2).m2527w0(imageView);
    }

    @Override // com.zykj.base.BaseFragment
    public Object initData(Continuation continuation) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(OssUtils.FILE_PATH);
            if (string == null || string.length() == 0) {
                ToastUtils.m2096r("文件不存在", new Object[0]);
            } else {
                this.localPath = string;
            }
            String string2 = arguments.getString("url_path");
            if (string2 == null || string2.length() == 0) {
                ToastUtils.m2096r("Url不存在", new Object[0]);
            } else {
                this.urlPath = string2;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        m5580f();
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.discovery_fragment_image;
    }
}
