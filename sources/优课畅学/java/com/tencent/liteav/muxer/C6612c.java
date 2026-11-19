package com.tencent.liteav.muxer;

import android.content.Context;
import android.media.MediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p049d.C6573c;

/* renamed from: com.tencent.liteav.muxer.c */
/* loaded from: classes4.dex */
public class C6612c implements InterfaceC6610a {

    /* renamed from: a */
    private int f5703a;

    /* renamed from: b */
    private InterfaceC6610a f5704b;

    public C6612c(Context context, int i10) {
        this.f5703a = 0;
        if (i10 == 0) {
            this.f5703a = 0;
            this.f5704b = new C6613d();
            TXCLog.m4994i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
        } else if (i10 == 1) {
            this.f5703a = 1;
            this.f5704b = new C6611b();
            TXCLog.m4994i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
        } else if (m5209a(context)) {
            this.f5703a = 0;
            this.f5704b = new C6613d();
            TXCLog.m4994i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
        } else {
            this.f5703a = 1;
            this.f5704b = new C6611b();
            TXCLog.m4994i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
        }
    }

    /* renamed from: a */
    public static boolean m5209a(Context context) {
        C6573c.m4883a().m4909a(context);
        return C6573c.m4883a().m4913d() == 1;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: b */
    public void mo5197b(MediaFormat mediaFormat) {
        this.f5704b.mo5197b(mediaFormat);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: c */
    public boolean mo5199c() {
        return this.f5704b.mo5199c();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: b */
    public void mo5198b(byte[] bArr, int i10, int i11, long j10, int i12) {
        this.f5704b.mo5198b(bArr, i10, i11, j10, i12);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: a */
    public void mo5193a(MediaFormat mediaFormat) {
        this.f5704b.mo5193a(mediaFormat);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: b */
    public int mo5196b() {
        return this.f5704b.mo5196b();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: a */
    public void mo5194a(String str) {
        this.f5704b.mo5194a(str);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: a */
    public void mo5195a(byte[] bArr, int i10, int i11, long j10, int i12) {
        this.f5704b.mo5195a(bArr, i10, i11, j10, i12);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC6610a
    /* renamed from: a */
    public int mo5192a() {
        return this.f5704b.mo5192a();
    }
}
