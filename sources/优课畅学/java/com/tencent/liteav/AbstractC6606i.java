package com.tencent.liteav;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p046a.EnumC6557b;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.p048c.InterfaceC6570k;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p056ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.liteav.i */
/* loaded from: classes4.dex */
public abstract class AbstractC6606i {

    /* renamed from: c */
    protected Context f5680c;

    /* renamed from: e */
    protected WeakReference<InterfaceC6559b> f5682e;

    /* renamed from: b */
    protected C6601d f5679b = null;

    /* renamed from: d */
    protected TXCloudVideoView f5681d = null;

    public AbstractC6606i(Context context) {
        this.f5680c = null;
        if (context != null) {
            this.f5680c = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public int mo5096a(String str) {
        return -1;
    }

    /* renamed from: a */
    public abstract int mo5097a(String str, int i10);

    /* renamed from: a */
    public abstract int mo5098a(boolean z10);

    /* renamed from: a */
    public abstract void mo5100a(int i10);

    /* renamed from: a */
    public abstract void mo5104a(InterfaceC6570k interfaceC6570k);

    /* renamed from: a */
    public abstract void mo5110a(boolean z10, int i10);

    /* renamed from: b */
    public void mo5111b() {
        TXCLog.m4998w("TXIPlayer", "resume not support");
    }

    /* renamed from: b */
    public abstract void mo5112b(int i10);

    /* renamed from: b */
    public abstract void mo5113b(boolean z10);

    /* renamed from: c */
    public abstract void mo5114c(int i10);

    /* renamed from: c */
    public abstract void mo5115c(boolean z10);

    /* renamed from: c */
    public abstract boolean mo5116c();

    /* renamed from: d */
    public abstract int mo5117d(int i10);

    /* renamed from: d */
    public TextureView mo5118d() {
        return null;
    }

    /* renamed from: e */
    public abstract int mo5119e();

    /* renamed from: e */
    public void mo5169e(int i10) {
        TXCLog.m4998w("TXIPlayer", "seek not support");
    }

    /* renamed from: f */
    public boolean mo5120f() {
        return false;
    }

    /* renamed from: g */
    public void mo5121g() {
    }

    /* renamed from: i */
    public abstract int mo5123i();

    /* renamed from: q */
    public C6601d m5188q() {
        return this.f5679b;
    }

    /* renamed from: a */
    public void mo5101a(int i10, int i11) {
    }

    /* renamed from: b */
    public void mo5166b(float f10) {
        TXCLog.m4998w("TXIPlayer", "rate not implement");
    }

    /* renamed from: d */
    public boolean mo5168d(boolean z10) {
        return false;
    }

    /* renamed from: e */
    public void mo5170e(boolean z10) {
        TXCLog.m4998w("TXIPlayer", "autoPlay not implement");
    }

    /* renamed from: a */
    public void mo5102a(Context context, int i10) {
    }

    /* renamed from: a */
    public void mo5103a(Surface surface) {
    }

    /* renamed from: a */
    public void mo5106a(InterfaceC6607j interfaceC6607j, EnumC6557b enumC6557b, Object obj) {
    }

    /* renamed from: a */
    public void mo5107a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
    }

    /* renamed from: a */
    public void mo5109a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
    }

    /* renamed from: a */
    public void mo5105a(C6601d c6601d) {
        this.f5679b = c6601d;
        if (c6601d == null) {
            this.f5679b = new C6601d();
        }
    }

    /* renamed from: a */
    public void mo5099a() {
        TXCLog.m4998w("TXIPlayer", "pause not support");
    }

    /* renamed from: a */
    public void mo5108a(TXCloudVideoView tXCloudVideoView) {
        this.f5681d = tXCloudVideoView;
    }

    /* renamed from: a */
    public void m5187a(InterfaceC6559b interfaceC6559b) {
        this.f5682e = new WeakReference<>(interfaceC6559b);
    }
}
