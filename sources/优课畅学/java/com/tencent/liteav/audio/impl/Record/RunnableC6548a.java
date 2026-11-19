package com.tencent.liteav.audio.impl.Record;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.tencent.liteav.audio.impl.Record.a */
/* loaded from: classes4.dex */
public class RunnableC6548a implements Runnable {

    /* renamed from: a */
    private WeakReference<InterfaceC6550c> f5101a;

    /* renamed from: b */
    private int f5102b;

    /* renamed from: c */
    private int f5103c;

    /* renamed from: d */
    private int f5104d;

    /* renamed from: e */
    private boolean f5105e;

    /* renamed from: f */
    private Thread f5106f;

    /* renamed from: g */
    private byte[] f5107g;

    /* renamed from: b */
    private void m4741b() {
        InterfaceC6550c interfaceC6550c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC6550c> weakReference = this.f5101a;
                interfaceC6550c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6550c != null) {
            interfaceC6550c.onAudioRecordStart();
        } else {
            TXCLog.m4991e("AudioCenter:TXCAudioBGMRecord", "onRecordStart:no callback");
        }
    }

    /* renamed from: c */
    private void m4742c() {
        InterfaceC6550c interfaceC6550c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC6550c> weakReference = this.f5101a;
                interfaceC6550c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6550c != null) {
            interfaceC6550c.onAudioRecordStop();
        } else {
            TXCLog.m4991e("AudioCenter:TXCAudioBGMRecord", "onRecordStop:no callback");
        }
    }

    /* renamed from: a */
    public void m4743a() throws InterruptedException {
        this.f5105e = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Thread thread = this.f5106f;
        if (thread != null && thread.isAlive() && Thread.currentThread().getId() != this.f5106f.getId()) {
            try {
                this.f5106f.join();
            } catch (Exception e10) {
                TXCLog.m4991e("AudioCenter:TXCAudioBGMRecord", "record stop Exception: " + e10.getMessage());
            }
        }
        TXCLog.m4994i("AudioCenter:TXCAudioBGMRecord", "stop record cost time(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
        this.f5106f = null;
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        if (!this.f5105e) {
            TXCLog.m4998w("AudioCenter:TXCAudioBGMRecord", "audio record: abandom start audio sys record thread!");
            return;
        }
        m4741b();
        int i10 = this.f5102b;
        int i11 = this.f5103c;
        int i12 = this.f5104d;
        int i13 = ((i11 * 1024) * i12) / 8;
        byte[] bArr = new byte[i13];
        this.f5107g = bArr;
        Arrays.fill(bArr, (byte) 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long length = 0;
        while (this.f5105e && !Thread.interrupted()) {
            if (((((((System.currentTimeMillis() - jCurrentTimeMillis) * i10) * i11) * i12) / 8) / 1000) - length < i13) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused) {
                }
            } else {
                byte[] bArr2 = this.f5107g;
                length += bArr2.length;
                m4740a(bArr2, bArr2.length, TXCTimeUtil.getTimeTick());
            }
        }
        m4742c();
    }

    /* renamed from: a */
    private void m4740a(byte[] bArr, int i10, long j10) {
        InterfaceC6550c interfaceC6550c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC6550c> weakReference = this.f5101a;
                interfaceC6550c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6550c != null) {
            interfaceC6550c.onAudioRecordPCM(bArr, i10, j10);
        } else {
            TXCLog.m4991e("AudioCenter:TXCAudioBGMRecord", "onRecordPcmData:no callback");
        }
    }
}
