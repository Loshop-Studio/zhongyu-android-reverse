package com.friday.document.view.preview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.friday.common.helper.C5963c;
import com.friday.document.R$layout;
import com.friday.document.databinding.FragmentPreviewVideoBinding;
import java.io.File;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p040c2.InterfaceC5250g2;
import p220k7.C9827c;
import p236l7.InterfaceC10158h;
import p383w2.InterfaceC11671b;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class VideoPreviewFragment extends Hilt_VideoPreviewFragment<FragmentPreviewVideoBinding> implements InterfaceC11671b {

    /* renamed from: j */
    public static final C6063a f7492j = new C6063a(null);

    /* renamed from: k */
    public static final int f7493k = 8;

    /* renamed from: i */
    public InterfaceC5250g2 f7494i;

    /* renamed from: com.friday.document.view.preview.VideoPreviewFragment$a */
    public static final class C6063a {
        public /* synthetic */ C6063a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final VideoPreviewFragment m5978a(String title, String fileId, String url, String cachePath) {
            AbstractC9979u.m20294g(title, "title");
            AbstractC9979u.m20294g(fileId, "fileId");
            AbstractC9979u.m20294g(url, "url");
            AbstractC9979u.m20294g(cachePath, "cachePath");
            Bundle bundle = new Bundle();
            bundle.putString("title", title);
            bundle.putString("fileId", fileId);
            bundle.putString("url", url);
            bundle.putString("cachePath", cachePath);
            VideoPreviewFragment videoPreviewFragment = new VideoPreviewFragment();
            videoPreviewFragment.setArguments(bundle);
            return videoPreviewFragment;
        }

        public C6063a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final String m5973t() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("fileId")) == null) ? "" : string;
    }

    /* renamed from: v */
    private final String m5974v() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("title")) == null) ? "" : string;
    }

    /* renamed from: w */
    private final String m5975w() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("url")) == null) ? "" : string;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_preview_video;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p383w2.InterfaceC11671b
    /* renamed from: i */
    public void mo5940i() {
        C5963c.f6084a.m5318r(m5974v(), m5975w(), true, m5973t(), ((FragmentPreviewVideoBinding) getMBinding()).f6414c.getCurrentPositionWhenPlaying());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        ((FragmentPreviewVideoBinding) getMBinding()).f6414c.setUp(m5975w(), true, new File(m5976s()), "");
        TextView titleTextView = ((FragmentPreviewVideoBinding) getMBinding()).f6414c.getTitleTextView();
        AbstractC9979u.m20293f(titleTextView, "getTitleTextView(...)");
        titleTextView.setVisibility(8);
        ImageView backButton = ((FragmentPreviewVideoBinding) getMBinding()).f6414c.getBackButton();
        AbstractC9979u.m20293f(backButton, "getBackButton(...)");
        backButton.setVisibility(8);
        ImageView fullscreenButton = ((FragmentPreviewVideoBinding) getMBinding()).f6414c.getFullscreenButton();
        AbstractC9979u.m20293f(fullscreenButton, "getFullscreenButton(...)");
        fullscreenButton.setVisibility(8);
        ((FragmentPreviewVideoBinding) getMBinding()).f6414c.setVideoAllCallBack(new InterfaceC10158h() { // from class: com.friday.document.view.preview.VideoPreviewFragment.initData.1
            @Override // p236l7.InterfaceC10158h
            /* renamed from: a */
            public void mo5979a(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: b */
            public void mo5980b(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: c */
            public void mo5981c(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: d */
            public void mo5982d(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: e */
            public void mo5983e(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: f */
            public void mo5984f(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: g */
            public void mo5985g(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: h */
            public void mo5986h(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: i */
            public void mo5987i(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: j */
            public void mo5988j(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: k */
            public void mo5989k(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: l */
            public void mo5990l(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: m */
            public void mo5991m(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
                AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(VideoPreviewFragment.this), null, null, new VideoPreviewFragment$initData$1$onClickStartIcon$1(VideoPreviewFragment.this, null), 3, null);
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: n */
            public void mo5992n(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: o */
            public void mo5993o(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: p */
            public void mo5994p(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: r */
            public void mo5995r(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: s */
            public void mo5996s(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: t */
            public void mo5997t(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: u */
            public void mo5998u(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: w */
            public void mo5999w(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: x */
            public void mo6000x(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }

            @Override // p236l7.InterfaceC10158h
            /* renamed from: y */
            public void mo6001y(String str, Object... objects) {
                AbstractC9979u.m20294g(objects, "objects");
            }
        });
    }

    @Override // com.friday.common.base.BaseFragment
    public boolean needHideLoadingOnDestroy() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((FragmentPreviewVideoBinding) getMBinding()).f6414c.setVideoAllCallBack(null);
        C9827c.m19927r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ((FragmentPreviewVideoBinding) getMBinding()).f6414c.onVideoPause();
    }

    /* renamed from: s */
    public final String m5976s() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("cachePath")) == null) ? "" : string;
    }

    /* renamed from: u */
    public final InterfaceC5250g2 m5977u() {
        InterfaceC5250g2 interfaceC5250g2 = this.f7494i;
        if (interfaceC5250g2 != null) {
            return interfaceC5250g2;
        }
        AbstractC9979u.m20312y("shareCacheDao");
        return null;
    }
}
