package com.tencent.liteav.network;

import android.os.Bundle;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p047b.InterfaceC6559b;
import com.tencent.liteav.basic.structs.C6585a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.tencent.liteav.network.d */
/* loaded from: classes4.dex */
public class C6641d implements InterfaceC6645h {

    /* renamed from: f */
    private a f5813f;

    /* renamed from: a */
    private InterfaceC6645h f5808a = null;

    /* renamed from: b */
    private b f5809b = null;

    /* renamed from: c */
    private long f5810c = 0;

    /* renamed from: d */
    private long f5811d = 0;

    /* renamed from: e */
    private b f5812e = null;

    /* renamed from: g */
    private long f5814g = 0;

    /* renamed from: h */
    private long f5815h = 0;

    /* renamed from: com.tencent.liteav.network.d$a */
    public interface a {
        void onSwitchFinish(TXIStreamDownloader tXIStreamDownloader, boolean z10);
    }

    public C6641d(a aVar) {
        this.f5813f = aVar;
    }

    /* renamed from: b */
    public void m5273b() {
        this.f5809b.m5281a((InterfaceC6645h) null);
        this.f5812e.m5281a(this);
        this.f5809b = this.f5812e;
        this.f5812e = null;
        StringBuilder sb = new StringBuilder();
        sb.append(" stream_switch end at ");
        sb.append(this.f5810c);
        sb.append(" stop ts ");
        sb.append(this.f5815h);
        sb.append(" start ts ");
        sb.append(this.f5814g);
        sb.append(" diff ts ");
        long j10 = this.f5815h;
        long j11 = this.f5814g;
        sb.append(j10 > j11 ? j10 - j11 : j11 - j10);
        TXCLog.m4998w("TXCMultiStreamDownloader", sb.toString());
    }

    /* renamed from: c */
    public void m5275c(long j10) {
        this.f5815h = j10;
    }

    @Override // com.tencent.liteav.network.InterfaceC6645h
    public void onPullAudio(C6585a c6585a) {
        InterfaceC6645h interfaceC6645h = this.f5808a;
        if (interfaceC6645h != null) {
            interfaceC6645h.onPullAudio(c6585a);
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC6645h
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        long j10 = tXSNALPacket.pts;
        this.f5810c = j10;
        if (tXSNALPacket.nalType == 0) {
            this.f5811d = j10;
        }
        InterfaceC6645h interfaceC6645h = this.f5808a;
        if (interfaceC6645h != null) {
            interfaceC6645h.onPullNAL(tXSNALPacket);
        }
    }

    /* renamed from: a */
    public void m5272a(InterfaceC6645h interfaceC6645h) {
        this.f5808a = interfaceC6645h;
    }

    /* renamed from: a */
    public void m5269a() {
        b bVar = this.f5809b;
        if (bVar != null) {
            bVar.m5282b(0L);
        }
        b bVar2 = this.f5812e;
        if (bVar2 != null) {
            bVar2.m5282b(0L);
        }
    }

    /* renamed from: com.tencent.liteav.network.d$b */
    public static class b implements InterfaceC6559b, InterfaceC6645h {

        /* renamed from: a */
        private final int f5816a = 2;

        /* renamed from: b */
        private long f5817b = 0;

        /* renamed from: c */
        private long f5818c = 0;

        /* renamed from: d */
        private int f5819d = 0;

        /* renamed from: e */
        private boolean f5820e = false;

        /* renamed from: f */
        private long f5821f = 0;

        /* renamed from: g */
        private long f5822g = 0;

        /* renamed from: h */
        private long f5823h = 0;

        /* renamed from: i */
        private ArrayList<TXSNALPacket> f5824i = new ArrayList<>();

        /* renamed from: j */
        private ArrayList<C6585a> f5825j = new ArrayList<>();

        /* renamed from: k */
        private TXIStreamDownloader f5826k;

        /* renamed from: l */
        private WeakReference<C6641d> f5827l;

        /* renamed from: m */
        private InterfaceC6645h f5828m;

        public b(TXIStreamDownloader tXIStreamDownloader, C6641d c6641d) {
            this.f5826k = null;
            this.f5827l = new WeakReference<>(c6641d);
            this.f5826k = tXIStreamDownloader;
            tXIStreamDownloader.setListener(this);
        }

        /* renamed from: a */
        public void m5280a(long j10) {
            this.f5819d = 0;
            this.f5817b = j10;
            this.f5826k.setListener(this);
            this.f5826k.setNotifyListener(this);
        }

        /* renamed from: b */
        public void m5282b(long j10) {
            this.f5817b = 0L;
            this.f5821f = j10;
            this.f5823h = 0L;
            this.f5822g = 0L;
            TXIStreamDownloader tXIStreamDownloader = this.f5826k;
            if (tXIStreamDownloader == null || j10 != 0) {
                return;
            }
            tXIStreamDownloader.stopDownload();
            this.f5826k = null;
        }

        @Override // com.tencent.liteav.basic.p047b.InterfaceC6559b
        public void onNotifyEvent(int i10, Bundle bundle) {
            if (i10 == -2301 || i10 == 3010) {
                C6641d c6641d = this.f5827l.get();
                if (c6641d != null) {
                    c6641d.m5271a(this.f5826k, false);
                }
                this.f5826k.setNotifyListener(null);
            }
        }

        @Override // com.tencent.liteav.network.InterfaceC6645h
        public void onPullAudio(C6585a c6585a) {
            if (this.f5817b > 0) {
                m5277a(c6585a);
                return;
            }
            if (this.f5821f > 0) {
                m5279b(c6585a);
                return;
            }
            InterfaceC6645h interfaceC6645h = this.f5828m;
            if (interfaceC6645h != null) {
                interfaceC6645h.onPullAudio(c6585a);
            }
        }

        @Override // com.tencent.liteav.network.InterfaceC6645h
        public void onPullNAL(TXSNALPacket tXSNALPacket) {
            if (tXSNALPacket == null) {
                return;
            }
            if (this.f5817b > 0) {
                m5276a(tXSNALPacket);
                return;
            }
            if (this.f5821f > 0) {
                m5278b(tXSNALPacket);
                return;
            }
            InterfaceC6645h interfaceC6645h = this.f5828m;
            if (interfaceC6645h != null) {
                interfaceC6645h.onPullNAL(tXSNALPacket);
            }
        }

        /* renamed from: a */
        public void m5281a(InterfaceC6645h interfaceC6645h) {
            this.f5828m = interfaceC6645h;
        }

        /* renamed from: a */
        private void m5277a(C6585a c6585a) {
            if (c6585a == null) {
                return;
            }
            long j10 = c6585a.f5491e;
            long j11 = this.f5818c;
            if (j10 < j11 || j10 < this.f5817b) {
                return;
            }
            InterfaceC6645h interfaceC6645h = this.f5828m;
            if (interfaceC6645h != null && j11 > 0 && j10 >= j11) {
                interfaceC6645h.onPullAudio(c6585a);
            } else {
                this.f5825j.add(c6585a);
            }
        }

        /* renamed from: b */
        private void m5279b(C6585a c6585a) {
            if (this.f5823h > 0) {
                return;
            }
            long j10 = this.f5822g;
            if (j10 > 0 && c6585a != null) {
                long j11 = c6585a.f5491e;
                if (j11 >= j10) {
                    this.f5823h = j11;
                    return;
                }
            }
            InterfaceC6645h interfaceC6645h = this.f5828m;
            if (interfaceC6645h != null) {
                interfaceC6645h.onPullAudio(c6585a);
            }
        }

        /* renamed from: a */
        private void m5276a(TXSNALPacket tXSNALPacket) {
            C6641d c6641d = this.f5827l.get();
            if (tXSNALPacket.nalType == 0 && !this.f5820e) {
                this.f5819d++;
                if (c6641d != null) {
                    long j10 = c6641d.f5811d;
                    long j11 = tXSNALPacket.pts;
                    if (j10 <= j11 || this.f5819d == 2) {
                        this.f5817b = c6641d.m5268a(j11);
                        this.f5820e = true;
                    }
                }
                if (c6641d != null) {
                    TXCLog.m4998w("TXCMultiStreamDownloader", " stream_switch pre start begin gop " + this.f5819d + " last iframe ts " + c6641d.f5811d + " pts " + tXSNALPacket.pts + " from " + this.f5817b + " type " + tXSNALPacket.nalType);
                }
            }
            if (this.f5820e) {
                if (c6641d != null) {
                    c6641d.m5274b(tXSNALPacket.pts);
                }
                long j12 = tXSNALPacket.pts;
                if (j12 >= this.f5817b) {
                    if (tXSNALPacket.nalType == 0 && this.f5818c == 0) {
                        this.f5818c = j12;
                        TXCLog.m4998w("TXCMultiStreamDownloader", " stream_switch pre start end " + tXSNALPacket.pts + " from " + this.f5817b + " type " + tXSNALPacket.nalType);
                    }
                    if (this.f5818c > 0) {
                        if (this.f5828m != null) {
                            if (c6641d != null) {
                                c6641d.m5271a(this.f5826k, true);
                            }
                            if (!this.f5825j.isEmpty()) {
                                Iterator<C6585a> it = this.f5825j.iterator();
                                while (it.hasNext()) {
                                    C6585a next = it.next();
                                    if (next.f5491e >= this.f5818c) {
                                        TXCLog.m4994i("TXCMultiStreamDownloader", " stream_switch pre start cache audio pts " + next.f5491e + " from " + this.f5818c);
                                        this.f5828m.onPullAudio(next);
                                    }
                                }
                                TXCLog.m4998w("TXCMultiStreamDownloader", " stream_switch pre start end audio cache  " + this.f5825j.size());
                                this.f5825j.clear();
                            }
                            if (!this.f5824i.isEmpty()) {
                                TXCLog.m4998w("TXCMultiStreamDownloader", " stream_switch pre start end video cache  " + this.f5824i.size());
                                Iterator<TXSNALPacket> it2 = this.f5824i.iterator();
                                while (it2.hasNext()) {
                                    this.f5828m.onPullNAL(it2.next());
                                }
                                this.f5824i.clear();
                            }
                            TXCLog.m4998w("TXCMultiStreamDownloader", " stream_switch pre start first pull nal " + tXSNALPacket.pts + " from " + this.f5818c + " type " + tXSNALPacket.nalType);
                            this.f5828m.onPullNAL(tXSNALPacket);
                            this.f5828m = null;
                            this.f5826k.setNotifyListener(null);
                            return;
                        }
                        TXCLog.m4994i("TXCMultiStreamDownloader", " stream_switch pre start cache video pts " + tXSNALPacket.pts + " from " + this.f5818c + " type " + tXSNALPacket.nalType);
                        this.f5824i.add(tXSNALPacket);
                    }
                }
            }
        }

        /* renamed from: b */
        private void m5278b(TXSNALPacket tXSNALPacket) {
            C6641d c6641d = this.f5827l.get();
            if (c6641d != null) {
                c6641d.m5275c(tXSNALPacket.pts);
            }
            long j10 = tXSNALPacket.pts;
            if (j10 >= this.f5821f) {
                if (tXSNALPacket.nalType == 0) {
                    this.f5822g = j10;
                }
                if (this.f5822g <= 0) {
                    InterfaceC6645h interfaceC6645h = this.f5828m;
                    if (interfaceC6645h != null) {
                        interfaceC6645h.onPullNAL(tXSNALPacket);
                        return;
                    }
                    return;
                }
                if (this.f5823h > 0) {
                    TXCLog.m4998w("TXCMultiStreamDownloader", " stream_switch delay stop end video pts " + this.f5822g + " audio ts " + this.f5823h + " from " + this.f5821f);
                    if (c6641d != null) {
                        c6641d.m5273b();
                    }
                    this.f5828m = null;
                    this.f5826k.setListener(null);
                    this.f5826k.stopDownload();
                    return;
                }
                TXCLog.m4998w("TXCMultiStreamDownloader", " stream_switch delay stop video end wait audio end video pts " + tXSNALPacket.pts + " from " + this.f5821f + " type " + tXSNALPacket.nalType);
                return;
            }
            InterfaceC6645h interfaceC6645h2 = this.f5828m;
            if (interfaceC6645h2 != null) {
                interfaceC6645h2.onPullNAL(tXSNALPacket);
            }
        }
    }

    /* renamed from: b */
    public void m5274b(long j10) {
        this.f5814g = j10;
    }

    /* renamed from: a */
    public void m5270a(TXIStreamDownloader tXIStreamDownloader, TXIStreamDownloader tXIStreamDownloader2, long j10, long j11, String str) {
        this.f5810c = tXIStreamDownloader.getCurrentTS();
        this.f5811d = tXIStreamDownloader.getLastIFrameTS();
        b bVar = new b(tXIStreamDownloader, this);
        this.f5809b = bVar;
        bVar.m5281a(this);
        ((TXCFLVDownloader) tXIStreamDownloader).recvData(true);
        Vector<C6642e> vector = new Vector<>();
        vector.add(new C6642e(str, false));
        tXIStreamDownloader2.setOriginUrl(str);
        ((TXCFLVDownloader) tXIStreamDownloader2).recvData(true);
        tXIStreamDownloader2.startDownload(vector, false, false, tXIStreamDownloader.mEnableMessage, tXIStreamDownloader.mEnableMetaData);
        b bVar2 = new b(tXIStreamDownloader2, this);
        this.f5812e = bVar2;
        bVar2.m5280a(this.f5810c);
    }

    /* renamed from: a */
    public void m5271a(TXIStreamDownloader tXIStreamDownloader, boolean z10) {
        a aVar = this.f5813f;
        if (aVar != null) {
            aVar.onSwitchFinish(tXIStreamDownloader, z10);
        }
    }

    /* renamed from: a */
    public long m5268a(long j10) {
        b bVar = this.f5809b;
        if (bVar != null) {
            bVar.m5282b(this.f5810c);
        }
        TXCLog.m4998w("TXCMultiStreamDownloader", " stream_switch delay stop begin from " + this.f5810c);
        return this.f5810c;
    }
}
