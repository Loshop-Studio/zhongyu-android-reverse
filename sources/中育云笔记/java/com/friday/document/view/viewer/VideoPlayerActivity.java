package com.friday.document.view.viewer;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.friday.common.helper.C5962b;
import com.friday.document.R$layout;
import com.friday.document.R$string;
import com.friday.document.databinding.ActivityVideoPlayerBinding;
import com.friday.document.view.viewer.VideoPlayerActivity;
import com.friday.document.viewmodel.ShareBaseViewModel;
import java.io.File;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p141f2.C9166c;
import p181hd.InterfaceC9529a;
import p220k7.C9827c;
import p309qc.InterfaceC10773d;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
@Route(path = "/document/VideoPlayerActivity")
/* loaded from: classes3.dex */
public final class VideoPlayerActivity extends Hilt_VideoPlayerActivity<ActivityVideoPlayerBinding> {

    /* renamed from: g */
    public final InterfaceC10773d f7789g;

    /* renamed from: h */
    public String f7790h = "";

    /* renamed from: i */
    public String f7791i = "";

    /* renamed from: j */
    public String f7792j = "";

    /* renamed from: k */
    public long f7793k;

    /* renamed from: l */
    public boolean f7794l;

    public VideoPlayerActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f7789g = new ViewModelLazy(AbstractC9983y.m20315b(ShareBaseViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.viewer.VideoPlayerActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.viewer.VideoPlayerActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.viewer.VideoPlayerActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* renamed from: P */
    public static final void m6197P(VideoPlayerActivity videoPlayerActivity, View view) {
        videoPlayerActivity.onBackPressed();
    }

    /* renamed from: O */
    public final ShareBaseViewModel m6198O() {
        return (ShareBaseViewModel) this.f7789g.getValue();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.activity_video_player;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        ARouter.getInstance().inject(this);
        String externalAppDataPath = PathUtils.getExternalAppDataPath();
        String str = File.separator;
        String str2 = externalAppDataPath + str + "share" + str + C5962b.f6082a.m5299a().m5292t() + str + this.f7792j;
        if (this.f7794l) {
            if (FileUtils.isDir(str2)) {
                m6198O().m6371I(this.f7792j);
            } else {
                if (!C9166c.f21406a.m18061e()) {
                    AbstractC11958b.m26587h(R$string.connect_network_please);
                    return;
                }
                m6198O().m6368E(this.f7792j);
            }
            ((ActivityVideoPlayerBinding) getMBinding()).f6331c.setUp(this.f7790h, true, new File(str2), this.f7791i);
        } else {
            ((ActivityVideoPlayerBinding) getMBinding()).f6331c.setUp(this.f7790h, true, this.f7791i);
        }
        ((ActivityVideoPlayerBinding) getMBinding()).f6331c.getTitleTextView().setVisibility(0);
        ((ActivityVideoPlayerBinding) getMBinding()).f6331c.getBackButton().setVisibility(0);
        ImageView fullscreenButton = ((ActivityVideoPlayerBinding) getMBinding()).f6331c.getFullscreenButton();
        AbstractC9979u.m20293f(fullscreenButton, "getFullscreenButton(...)");
        fullscreenButton.setVisibility(8);
        ((ActivityVideoPlayerBinding) getMBinding()).f6331c.setIsTouchWiget(true);
        ((ActivityVideoPlayerBinding) getMBinding()).f6331c.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: y2.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPlayerActivity.m6197P(this.f28220c, view);
            }
        });
        ((ActivityVideoPlayerBinding) getMBinding()).f6331c.setSeekOnStart(this.f7793k);
        ((ActivityVideoPlayerBinding) getMBinding()).f6331c.startPlayLogic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((ActivityVideoPlayerBinding) getMBinding()).f6331c.setVideoAllCallBack(null);
        super.onBackPressed();
    }

    @Override // com.friday.document.view.viewer.Hilt_VideoPlayerActivity, com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9827c.m19927r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((ActivityVideoPlayerBinding) getMBinding()).f6331c.onVideoPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((ActivityVideoPlayerBinding) getMBinding()).f6331c.onVideoResume();
    }
}
