package com.tencent.liteav;

import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.ijk.media.player.IjkBitrateItem;
import com.tencent.ijk.media.player.MediaInfo;
import com.tencent.liteav.basic.datareport.C6574a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.p048c.InterfaceC6570k;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.txcvodplayer.C6709d;
import com.tencent.liteav.txcvodplayer.InterfaceC6710e;
import com.tencent.liteav.txcvodplayer.TXCVodVideoView;
import com.tencent.liteav.txcvodplayer.TextureRenderView;
import com.tencent.rtmp.TXBitrateItem;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.p056ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.liteav.g */
/* loaded from: classes4.dex */
public class C6604g extends AbstractC6606i {

    /* renamed from: a */
    protected boolean f5667a;

    /* renamed from: f */
    private TXCVodVideoView f5668f;

    /* renamed from: g */
    private C6709d f5669g;

    /* renamed from: h */
    private C6603f f5670h;

    /* renamed from: i */
    private boolean f5671i;

    /* renamed from: j */
    private boolean f5672j;

    /* renamed from: k */
    private boolean f5673k;

    /* renamed from: l */
    private boolean f5674l;

    /* renamed from: m */
    private float f5675m;

    /* renamed from: n */
    private Surface f5676n;

    /* renamed from: o */
    private InterfaceC6710e f5677o;

    public C6604g(Context context) {
        super(context);
        this.f5670h = null;
        this.f5672j = true;
        this.f5673k = true;
        this.f5674l = true;
        this.f5675m = 1.0f;
        this.f5677o = new InterfaceC6710e() { // from class: com.tencent.liteav.g.1
            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6710e
            /* renamed from: a */
            public void mo5182a(int i10, Bundle bundle) {
                InterfaceC6559b interfaceC6559b;
                String str;
                Bundle bundle2 = new Bundle(bundle);
                int i11 = -2301;
                if (i10 != -2301) {
                    i11 = 2011;
                    if (i10 != 2011) {
                        i11 = 2103;
                        if (i10 != 2103) {
                            i11 = 2106;
                            int i12 = 0;
                            if (i10 != 2106) {
                                i11 = 2013;
                                if (i10 != 2013) {
                                    i11 = 2014;
                                    if (i10 != 2014) {
                                        switch (i10) {
                                            case -2305:
                                                i11 = -2305;
                                                break;
                                            case -2304:
                                                if (!C6604g.this.f5671i) {
                                                    C6604g.this.f5669g.m5662a(false);
                                                }
                                                i11 = -2304;
                                                break;
                                            case -2303:
                                                i11 = -2303;
                                                break;
                                            default:
                                                switch (i10) {
                                                    case 2003:
                                                        if (!C6604g.this.f5671i) {
                                                            C6604g.this.f5671i = true;
                                                            C6604g.this.f5670h.m5151e();
                                                            Bundle bundle3 = new Bundle();
                                                            bundle3.putInt("EVT_ID", 2008);
                                                            bundle3.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                                                            MediaInfo mediaInfo = C6604g.this.f5668f.getMediaInfo();
                                                            if (mediaInfo != null && (str = mediaInfo.mVideoDecoderImpl) != null && str.contains("hevc")) {
                                                                i12 = 1;
                                                            }
                                                            if (C6604g.this.f5668f.getPlayerType() == 0) {
                                                                if (i12 == 0) {
                                                                    bundle3.putCharSequence("description", C6604g.this.f5669g.m5663a() ? "Enables hardware decoding" : "Enables software decoding");
                                                                } else {
                                                                    bundle3.putCharSequence("description", C6604g.this.f5669g.m5663a() ? "Enables hardware decoding H265" : "Enables software decoding h265");
                                                                }
                                                                bundle3.putInt("EVT_PARAM1", C6604g.this.f5669g.m5663a() ? 1 : 2);
                                                                bundle3.putInt("hevc", i12);
                                                            } else {
                                                                bundle3.putCharSequence("description", "Enables hardware decoding");
                                                                bundle3.putInt("EVT_PARAM1", 2);
                                                            }
                                                            mo5182a(2008, bundle3);
                                                            i11 = 2003;
                                                            break;
                                                        } else {
                                                            return;
                                                        }
                                                    case 2004:
                                                        C6604g.this.f5670h.m5150d();
                                                        i11 = 2004;
                                                        break;
                                                    case 2005:
                                                        C6604g.this.f5670h.m5143a(bundle.getInt(TXLiveConstants.EVT_PLAY_DURATION, 0));
                                                        i11 = 2005;
                                                        break;
                                                    case 2006:
                                                        C6604g.this.f5670h.m5149c();
                                                        C6604g c6604g = C6604g.this;
                                                        if (!c6604g.f5667a) {
                                                            i11 = 2006;
                                                            break;
                                                        } else {
                                                            c6604g.f5668f.m5603b();
                                                            TXCLog.m4989d(TXVodPlayer.TAG, "loop play");
                                                            return;
                                                        }
                                                    case 2007:
                                                        C6604g.this.f5670h.m5155i();
                                                        i11 = 2007;
                                                        break;
                                                    case 2008:
                                                        i11 = 2008;
                                                        break;
                                                    case 2009:
                                                        i11 = 2009;
                                                        break;
                                                    default:
                                                        switch (i10) {
                                                            case TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC /* 2016 */:
                                                                C6604g.this.f5670h.m5152f();
                                                                break;
                                                            case TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET /* 2017 */:
                                                                C6604g.this.f5670h.m5154h();
                                                                break;
                                                            case TXLiteAVCode.EVT_VOD_PLAY_DNS_RESOLVED /* 2018 */:
                                                                C6604g.this.f5670h.m5153g();
                                                                break;
                                                            case TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE /* 2019 */:
                                                                break;
                                                            default:
                                                                TXCLog.m4989d(TXVodPlayer.TAG, "miss match event " + i10);
                                                                break;
                                                        }
                                                        return;
                                                }
                                        }
                                    }
                                } else {
                                    C6604g.this.f5670h.m5150d();
                                }
                            } else if (!C6604g.this.f5671i) {
                                C6604g.this.f5669g.m5662a(false);
                            }
                        }
                    } else {
                        bundle2.putInt("EVT_PARAM1", C6604g.this.f5668f.getMetaRotationDegree());
                    }
                }
                bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, bundle.getString("description", ""));
                WeakReference<InterfaceC6559b> weakReference = C6604g.this.f5682e;
                if (weakReference == null || (interfaceC6559b = weakReference.get()) == null) {
                    return;
                }
                interfaceC6559b.onNotifyEvent(i11, bundle2);
            }

            @Override // com.tencent.liteav.txcvodplayer.InterfaceC6710e
            /* renamed from: a */
            public void mo5183a(Bundle bundle) {
                InterfaceC6559b interfaceC6559b;
                Bundle bundle2 = new Bundle();
                int[] iArrM5047a = C6592e.m5047a();
                bundle2.putCharSequence(TXLiveConstants.NET_STATUS_CPU_USAGE, (iArrM5047a[0] / 10) + "/" + (iArrM5047a[1] / 10) + "%");
                bundle2.putInt(TXLiveConstants.NET_STATUS_VIDEO_FPS, (int) bundle.getFloat("fps"));
                bundle2.putInt(TXLiveConstants.NET_STATUS_VIDEO_DPS, (int) bundle.getFloat("dps"));
                bundle2.putInt(TXLiveConstants.NET_STATUS_NET_SPEED, ((int) bundle.getLong("tcpSpeed")) / 1000);
                bundle2.putInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE, ((int) bundle.getLong("cachedBytes")) / 1000);
                bundle2.putInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH, C6604g.this.f5668f.getVideoWidth());
                bundle2.putInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT, C6604g.this.f5668f.getVideoHeight());
                bundle2.putString(TXLiveConstants.NET_STATUS_SERVER_IP, C6604g.this.f5668f.getServerIp());
                C6604g.this.f5670h.m5148b(C6604g.this.f5668f.getServerIp());
                WeakReference<InterfaceC6559b> weakReference = C6604g.this.f5682e;
                if (weakReference == null || (interfaceC6559b = weakReference.get()) == null) {
                    return;
                }
                interfaceC6559b.onNotifyEvent(15001, bundle2);
            }
        };
        TXCVodVideoView tXCVodVideoView = new TXCVodVideoView(context);
        this.f5668f = tXCVodVideoView;
        tXCVodVideoView.setListener(this.f5677o);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5104a(InterfaceC6570k interfaceC6570k) {
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: c */
    public void mo5115c(boolean z10) {
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: d */
    public int mo5117d(int i10) {
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: e */
    public int mo5119e() {
        return 0;
    }

    /* renamed from: f */
    public void m5171f(int i10) {
        C6603f c6603f;
        TXCVodVideoView tXCVodVideoView = this.f5668f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setBitrateIndex(i10);
        }
        if (!this.f5671i || (c6603f = this.f5670h) == null) {
            return;
        }
        c6603f.m5157k();
    }

    /* renamed from: g */
    public void m5173g(boolean z10) {
        TextureView textureViewMo5118d = mo5118d();
        if (textureViewMo5118d != null) {
            if (this.f5679b.f5623t && (this.f5668f.getMetaRotationDegree() == 90 || this.f5668f.getMetaRotationDegree() == 270)) {
                textureViewMo5118d.setScaleY(z10 ? -1.0f : 1.0f);
            } else {
                textureViewMo5118d.setScaleX(z10 ? -1.0f : 1.0f);
            }
        }
        C6603f c6603f = this.f5670h;
        if (c6603f != null) {
            c6603f.m5145a(z10);
        }
    }

    /* renamed from: h */
    public float m5174h() {
        if (this.f5668f != null) {
            return r0.getCurrentPosition() / 1000.0f;
        }
        return 0.0f;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: i */
    public int mo5123i() {
        return 0;
    }

    /* renamed from: j */
    public float m5175j() {
        if (this.f5668f != null) {
            return r0.getBufferDuration() / 1000.0f;
        }
        return 0.0f;
    }

    /* renamed from: k */
    public float m5176k() {
        if (this.f5668f != null) {
            return r0.getDuration() / 1000.0f;
        }
        return 0.0f;
    }

    /* renamed from: l */
    public float m5177l() {
        if (this.f5668f != null) {
            return r0.getBufferDuration() / 1000.0f;
        }
        return 0.0f;
    }

    /* renamed from: m */
    public int m5178m() {
        TXCVodVideoView tXCVodVideoView = this.f5668f;
        if (tXCVodVideoView != null) {
            return tXCVodVideoView.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: n */
    public int m5179n() {
        TXCVodVideoView tXCVodVideoView = this.f5668f;
        if (tXCVodVideoView != null) {
            return tXCVodVideoView.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: o */
    public int m5180o() {
        TXCVodVideoView tXCVodVideoView = this.f5668f;
        if (tXCVodVideoView != null) {
            return tXCVodVideoView.getBitrateIndex();
        }
        return 0;
    }

    /* renamed from: p */
    public ArrayList<TXBitrateItem> m5181p() {
        ArrayList<IjkBitrateItem> supportedBitrates;
        ArrayList<TXBitrateItem> arrayList = new ArrayList<>();
        TXCVodVideoView tXCVodVideoView = this.f5668f;
        if (tXCVodVideoView != null && (supportedBitrates = tXCVodVideoView.getSupportedBitrates()) != null) {
            Iterator<IjkBitrateItem> it = supportedBitrates.iterator();
            while (it.hasNext()) {
                IjkBitrateItem next = it.next();
                TXBitrateItem tXBitrateItem = new TXBitrateItem();
                tXBitrateItem.index = next.index;
                tXBitrateItem.width = next.width;
                tXBitrateItem.height = next.height;
                tXBitrateItem.bitrate = next.bitrate;
                arrayList.add(tXBitrateItem);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5110a(boolean z10, int i10) {
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: b */
    public void mo5111b() {
        this.f5668f.m5603b();
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: e */
    public void mo5169e(int i10) {
        C6603f c6603f;
        this.f5668f.m5601a(i10 * 1000);
        if (!this.f5671i || (c6603f = this.f5670h) == null) {
            return;
        }
        c6603f.m5156j();
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: b */
    public void mo5113b(boolean z10) {
        this.f5668f.setMute(z10);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: c */
    public void mo5114c(int i10) {
        this.f5668f.setVolume(i10);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: d */
    public TextureView mo5118d() {
        TXCloudVideoView tXCloudVideoView = this.f5681d;
        if (tXCloudVideoView != null) {
            return tXCloudVideoView.getVideoView();
        }
        return null;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: b */
    public void mo5112b(int i10) {
        this.f5668f.setVideoRotationDegree(360 - i10);
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: c */
    public boolean mo5116c() {
        return this.f5668f.m5607e();
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5105a(C6601d c6601d) {
        super.mo5105a(c6601d);
        if (this.f5669g == null) {
            this.f5669g = new C6709d();
        }
        this.f5669g.m5658a(this.f5679b.f5608e);
        this.f5669g.m5665b(this.f5679b.f5609f);
        this.f5669g.m5669c(this.f5679b.f5621r);
        this.f5669g.m5662a(this.f5679b.f5611h);
        this.f5669g.m5660a(this.f5679b.f5617n);
        this.f5669g.m5659a(this.f5679b.f5618o);
        this.f5669g.m5666b(this.f5679b.f5619p);
        this.f5669g.m5661a(this.f5679b.f5620q);
        this.f5669g.m5668b(this.f5679b.f5622s);
        this.f5669g.m5671c(this.f5679b.f5624u);
        this.f5669g.m5667b(this.f5679b.f5625v);
        this.f5669g.m5670c(this.f5679b.f5626w);
        this.f5669g.m5672d(this.f5679b.f5627x);
        this.f5668f.setConfig(this.f5669g);
        this.f5674l = c6601d.f5623t;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: b */
    public void mo5166b(float f10) {
        C6603f c6603f;
        this.f5675m = f10;
        TXCVodVideoView tXCVodVideoView = this.f5668f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setRate(f10);
        }
        if (!this.f5671i || (c6603f = this.f5670h) == null) {
            return;
        }
        c6603f.m5158l();
    }

    /* renamed from: c */
    public void m5167c(float f10) {
        TXCVodVideoView tXCVodVideoView = this.f5668f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setStartTime(f10);
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: d */
    public boolean mo5168d(boolean z10) {
        this.f5672j = z10;
        TXCVodVideoView tXCVodVideoView = this.f5668f;
        if (tXCVodVideoView != null) {
            return tXCVodVideoView.m5604b(z10);
        }
        return true;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: e */
    public void mo5170e(boolean z10) {
        this.f5673k = z10;
        TXCVodVideoView tXCVodVideoView = this.f5668f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setAutoPlay(z10);
        }
    }

    /* renamed from: f */
    public void m5172f(boolean z10) {
        this.f5667a = z10;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public int mo5097a(String str, int i10) throws ClassNotFoundException {
        TXCloudVideoView tXCloudVideoView = this.f5681d;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.setVisibility(0);
            if (this.f5681d.getVideoView() == null) {
                TextureRenderView textureRenderView = new TextureRenderView(this.f5681d.getContext());
                this.f5681d.addVideoView(textureRenderView);
                this.f5668f.setTextureRenderView(textureRenderView);
            }
            this.f5681d.getVideoView().setVisibility(0);
        } else {
            Surface surface = this.f5676n;
            if (surface != null) {
                this.f5668f.setRenderSurface(surface);
            }
        }
        C6603f c6603f = new C6603f(this.f5680c);
        this.f5670h = c6603f;
        c6603f.m5144a(str);
        this.f5670h.m5146b();
        this.f5671i = false;
        this.f5668f.setPlayerType(this.f5669g.m5664b());
        this.f5668f.m5604b(this.f5672j);
        this.f5668f.setVideoPath(str);
        this.f5668f.setAutoPlay(this.f5673k);
        this.f5668f.setRate(this.f5675m);
        this.f5668f.setAutoRotate(this.f5674l);
        this.f5668f.m5603b();
        this.f5670h.m5147b(1);
        TXCLog.m4989d(TXVodPlayer.TAG, "startPlay " + str);
        TXCDRApi.txReportDAU(this.f5680c, C6574a.f5424bs);
        try {
            Class.forName("com.tencent.liteav.demo.play.SuperPlayerView");
            TXCDRApi.txReportDAU(this.f5680c, C6574a.f5400bD);
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public int mo5098a(boolean z10) {
        this.f5668f.m5605c();
        TXCloudVideoView tXCloudVideoView = this.f5681d;
        if (tXCloudVideoView != null && tXCloudVideoView.getVideoView() != null && z10) {
            this.f5681d.getVideoView().setVisibility(8);
        }
        C6603f c6603f = this.f5670h;
        if (c6603f == null) {
            return 0;
        }
        c6603f.m5149c();
        return 0;
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5103a(Surface surface) {
        this.f5676n = surface;
        TXCVodVideoView tXCVodVideoView = this.f5668f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setRenderSurface(surface);
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5099a() {
        this.f5668f.m5606d();
    }

    /* renamed from: a */
    public void m5164a(float f10) {
        C6603f c6603f;
        this.f5668f.m5601a((int) (f10 * 1000.0f));
        if (!this.f5671i || (c6603f = this.f5670h) == null) {
            return;
        }
        c6603f.m5156j();
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5100a(int i10) {
        if (i10 == 1) {
            this.f5668f.setRenderMode(0);
        } else {
            this.f5668f.setRenderMode(1);
        }
    }

    @Override // com.tencent.liteav.AbstractC6606i
    /* renamed from: a */
    public void mo5108a(TXCloudVideoView tXCloudVideoView) {
        TXCloudVideoView tXCloudVideoView2 = this.f5681d;
        if (tXCloudVideoView != tXCloudVideoView2) {
            if (tXCloudVideoView2 != null) {
                tXCloudVideoView2.removeVideoView();
            }
            if (tXCloudVideoView != null) {
                tXCloudVideoView.removeVideoView();
            }
        }
        if (tXCloudVideoView != null) {
            tXCloudVideoView.setVisibility(0);
            if (tXCloudVideoView.getVideoView() == null) {
                TextureRenderView textureRenderView = new TextureRenderView(tXCloudVideoView.getContext());
                tXCloudVideoView.addVideoView(textureRenderView);
                this.f5668f.setTextureRenderView(textureRenderView);
            }
            tXCloudVideoView.getVideoView().setVisibility(0);
        }
        super.mo5108a(tXCloudVideoView);
    }

    /* renamed from: a */
    public void m5165a(TextureRenderView textureRenderView) {
        TXCVodVideoView tXCVodVideoView = this.f5668f;
        if (tXCVodVideoView != null) {
            tXCVodVideoView.setRenderView(textureRenderView);
        }
    }
}
