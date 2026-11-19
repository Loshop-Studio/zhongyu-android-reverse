package com.shuyu.gsyvideoplayer;

import android.content.res.Configuration;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.GSYADVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import p220k7.C9825a;

/* loaded from: classes5.dex */
public abstract class GSYBaseADActivityDetail<T extends GSYBaseVideoPlayer, R extends GSYADVideoPlayer> extends GSYBaseActivityDetail<T> {

    /* renamed from: f */
    public OrientationUtils f12774f;

    /* renamed from: O */
    public abstract GSYADVideoPlayer m9721O();

    /* renamed from: P */
    public boolean m9722P() {
        return (m9721O().getCurrentPlayer().getCurrentState() < 0 || m9721O().getCurrentPlayer().getCurrentState() == 0 || m9721O().getCurrentPlayer().getCurrentState() == 6) ? false : true;
    }

    /* renamed from: Q */
    public abstract boolean m9723Q();

    /* renamed from: R */
    public void m9724R() throws NoSuchMethodException, SecurityException {
        if (this.f12774f.getIsLand() != 1) {
            this.f12774f.resolveByClick();
        }
        m9721O().startWindowFullscreen(this, m9728L(), m9729M());
    }

    /* renamed from: S */
    public void m9725S() throws NoSuchMethodException, SecurityException {
        m9721O().setVisibility(0);
        m9721O().startPlayLogic();
        if (m9727K().getCurrentPlayer().isIfCurrentIsFullscreen()) {
            m9724R();
            m9721O().setSaveBeforeFullSystemUiVisibility(m9727K().getSaveBeforeFullSystemUiVisibility());
        }
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, p236l7.InterfaceC10158h
    /* renamed from: i */
    public void mo5987i(String str, Object... objArr) throws NoSuchMethodException, SecurityException {
        super.mo5987i(str, objArr);
        if (m9723Q()) {
            m9725S();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, p236l7.InterfaceC10158h
    /* renamed from: l */
    public void mo5990l(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        OrientationUtils orientationUtils = this.f12774f;
        if (orientationUtils != null) {
            orientationUtils.backToProtVideo();
        }
        if (C9825a.m19905p(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws NoSuchMethodException, SecurityException {
        GSYBaseADActivityDetail<T, R> gSYBaseADActivityDetail;
        Configuration configuration2;
        boolean z10 = this.f12775c;
        if (!this.f12776d && m9721O().getVisibility() == 0 && m9722P()) {
            this.f12775c = false;
            gSYBaseADActivityDetail = this;
            configuration2 = configuration;
            m9721O().getCurrentPlayer().onConfigurationChanged(gSYBaseADActivityDetail, configuration2, this.f12774f, m9728L(), m9729M());
        } else {
            gSYBaseADActivityDetail = this;
            configuration2 = configuration;
        }
        super.onConfigurationChanged(configuration2);
        gSYBaseADActivityDetail.f12775c = z10;
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C9825a.m19909t();
        OrientationUtils orientationUtils = this.f12774f;
        if (orientationUtils != null) {
            orientationUtils.releaseListener();
        }
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C9825a.m19907r();
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C9825a.m19908s();
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, p236l7.InterfaceC10158h
    /* renamed from: u */
    public void mo5998u(String str, Object... objArr) {
        super.mo5998u(str, objArr);
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, p236l7.InterfaceC10158h
    /* renamed from: w */
    public void mo5999w(String str, Object... objArr) {
        super.mo5999w(str, objArr);
        ((GSYVideoPlayer) objArr[1]).getBackButton().setVisibility(8);
    }
}
