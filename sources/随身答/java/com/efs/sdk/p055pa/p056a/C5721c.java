package com.efs.sdk.p055pa.p056a;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.efs.sdk.p055pa.InterfaceC5716PA;
import com.efs.sdk.p055pa.PAANRListener;
import com.efs.sdk.p055pa.PAMsgListener;
import com.efs.sdk.p055pa.p056a.C5720b;
import com.efs.sdk.p055pa.p056a.C5725g;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.efs.sdk.pa.a.c */
/* loaded from: classes3.dex */
public final class C5721c implements InterfaceC5716PA {

    /* renamed from: a */
    private boolean f4821a;

    /* renamed from: c */
    private C5723e f4823c;

    /* renamed from: d */
    private C5724f f4824d;

    /* renamed from: e */
    private C5719a f4825e;

    /* renamed from: h */
    private boolean f4828h;

    /* renamed from: i */
    private boolean f4829i;

    /* renamed from: b */
    private Looper f4822b = Looper.myLooper();

    /* renamed from: f */
    private C5720b f4826f = new C5720b();

    /* renamed from: g */
    private C5725g f4827g = new C5725g();

    public C5721c(boolean z9) {
        this.f4829i = z9;
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void enableDumpToFile(String str) throws IOException {
        FileOutputStream fileOutputStream;
        C5724f c5724f = this.f4824d;
        if (c5724f == null || str == null || str.trim().length() == 0) {
            return;
        }
        c5724f.f4838c = str;
        if (c5724f.f4839d != null) {
            return;
        }
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                c5724f.f4839d = new BufferedOutputStream(fileOutputStream);
            } catch (Exception unused) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
        }
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void enableLog(boolean z9) {
        this.f4821a = z9;
        this.f4826f.f4815b = z9;
        this.f4827g.f4841b = z9;
        C5724f c5724f = this.f4824d;
        if (c5724f != null) {
            c5724f.f4837b = z9;
        }
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final int endCalFPS(String str) {
        if (!this.f4828h) {
            return -1;
        }
        C5720b c5720b = this.f4826f;
        if (str != null && str.trim().length() != 0) {
            C5720b.a aVar = c5720b.f4814a.get(str);
            if (aVar == null) {
                return 0;
            }
            View view = aVar.f4819d;
            if (view != null && aVar.f4818c != null) {
                view.getViewTreeObserver().removeOnPreDrawListener(aVar.f4818c);
            }
            c5720b.f4814a.remove(str);
            int iCurrentTimeMillis = (int) (aVar.f4817b / ((System.currentTimeMillis() - aVar.f4816a) / 1000.0f));
            i = iCurrentTimeMillis > 0 ? iCurrentTimeMillis : 0;
            if (c5720b.f4815b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",fps=" + i);
            }
        }
        return i;
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final long endCalTime(String str) {
        if (!this.f4828h) {
            return -1L;
        }
        C5725g c5725g = this.f4827g;
        long jCurrentTimeMillis = 0;
        if (str != null && str.trim().length() != 0) {
            C5725g.a aVar = c5725g.f4840a.get(str);
            if (aVar == null) {
                return 0L;
            }
            c5725g.f4840a.remove(str);
            jCurrentTimeMillis = System.currentTimeMillis() - aVar.f4842a;
            if (c5725g.f4841b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",consumeTime=" + jCurrentTimeMillis);
            }
        }
        return jCurrentTimeMillis;
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener) {
        registerPAANRListener(context, pAANRListener, 2000L);
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void registerPAMsgListener(PAMsgListener pAMsgListener) {
        if (this.f4823c == null) {
            this.f4823c = new C5723e();
        }
        this.f4822b.setMessageLogging(this.f4823c);
        if (this.f4824d == null) {
            this.f4824d = new C5724f();
        }
        C5724f c5724f = this.f4824d;
        c5724f.f4837b = this.f4821a;
        c5724f.f4836a = pAMsgListener;
        this.f4823c.f4830a.add(c5724f);
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void start() {
        if (this.f4829i) {
            this.f4828h = true;
            C5723e c5723e = this.f4823c;
            if (c5723e != null) {
                this.f4822b.setMessageLogging(c5723e);
            }
            C5719a c5719a = this.f4825e;
            if (c5719a == null || !c5719a.f4801f) {
                return;
            }
            c5719a.f4801f = false;
            c5719a.f4802g.post(c5719a.f4808m);
            c5719a.f4805j = SystemClock.uptimeMillis();
        }
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void startCalFPS(String str, View view) {
        if (this.f4828h) {
            C5720b c5720b = this.f4826f;
            if (str == null || str.trim().length() == 0 || view == null || c5720b.f4814a.get(str) != null) {
                return;
            }
            C5720b.a aVar = new C5720b.a((byte) 0);
            aVar.f4819d = view;
            C5720b.a.AnonymousClass1 anonymousClass1 = new ViewTreeObserver.OnPreDrawListener() { // from class: com.efs.sdk.pa.a.b.a.1
                public AnonymousClass1() {
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    a.this.f4817b++;
                    return true;
                }
            };
            aVar.f4818c = anonymousClass1;
            aVar.f4819d.getViewTreeObserver().addOnPreDrawListener(anonymousClass1);
            aVar.f4816a = System.currentTimeMillis();
            c5720b.f4814a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void startCalTime(String str) {
        if (this.f4828h) {
            C5725g c5725g = this.f4827g;
            if (str == null || str.trim().length() == 0 || c5725g.f4840a.get(str) != null) {
                return;
            }
            C5725g.a aVar = new C5725g.a((byte) 0);
            aVar.f4842a = System.currentTimeMillis();
            c5725g.f4840a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void stop() {
        this.f4828h = false;
        this.f4822b.setMessageLogging(null);
        C5719a c5719a = this.f4825e;
        if (c5719a != null) {
            c5719a.f4801f = true;
            c5719a.f4802g.removeCallbacksAndMessages(null);
            c5719a.f4796a = true;
        }
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void unRegisterPAMsgListener() {
        C5724f c5724f = this.f4824d;
        if (c5724f != null) {
            c5724f.f4836a = null;
        }
        C5723e c5723e = this.f4823c;
        if (c5723e != null) {
            c5723e.f4830a.remove(c5724f);
        }
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void unregisterPAANRListener() {
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j9) {
        registerPAANRListener(context, pAANRListener, j9, Looper.getMainLooper().getThread());
    }

    @Override // com.efs.sdk.p055pa.InterfaceC5716PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j9, Thread thread) {
        if (this.f4825e == null) {
            if (thread != null) {
                this.f4825e = new C5719a((Application) context.getApplicationContext(), j9);
            } else {
                this.f4825e = new C5719a((Application) context.getApplicationContext(), j9, false);
            }
        }
        this.f4825e.f4803h = pAANRListener;
    }
}
