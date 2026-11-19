package com.efs.sdk.p036pa.p037a;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.efs.sdk.p036pa.InterfaceC2976PA;
import com.efs.sdk.p036pa.PAANRListener;
import com.efs.sdk.p036pa.PAMsgListener;
import com.efs.sdk.p036pa.p037a.C2980b;
import com.efs.sdk.p036pa.p037a.C2985g;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.efs.sdk.pa.a.c */
/* loaded from: classes2.dex */
public final class C2981c implements InterfaceC2976PA {

    /* renamed from: a */
    private boolean f1217a;

    /* renamed from: c */
    private C2983e f1219c;

    /* renamed from: d */
    private C2984f f1220d;

    /* renamed from: e */
    private C2979a f1221e;

    /* renamed from: h */
    private boolean f1224h;

    /* renamed from: i */
    private boolean f1225i;

    /* renamed from: b */
    private Looper f1218b = Looper.myLooper();

    /* renamed from: f */
    private C2980b f1222f = new C2980b();

    /* renamed from: g */
    private C2985g f1223g = new C2985g();

    public C2981c(boolean z3) {
        this.f1225i = z3;
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void enableDumpToFile(String str) throws IOException {
        FileOutputStream fileOutputStream;
        C2984f c2984f = this.f1220d;
        if (c2984f == null || str == null || str.trim().length() == 0) {
            return;
        }
        c2984f.f1234c = str;
        if (c2984f.f1235d != null) {
            return;
        }
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                c2984f.f1235d = new BufferedOutputStream(fileOutputStream);
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

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void enableLog(boolean z3) {
        this.f1217a = z3;
        this.f1222f.f1211b = z3;
        this.f1223g.f1237b = z3;
        C2984f c2984f = this.f1220d;
        if (c2984f != null) {
            c2984f.f1233b = z3;
        }
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final int endCalFPS(String str) {
        if (!this.f1224h) {
            return -1;
        }
        C2980b c2980b = this.f1222f;
        if (str != null && str.trim().length() != 0) {
            C2980b.a aVar = c2980b.f1210a.get(str);
            if (aVar == null) {
                return 0;
            }
            View view = aVar.f1215d;
            if (view != null && aVar.f1214c != null) {
                view.getViewTreeObserver().removeOnPreDrawListener(aVar.f1214c);
            }
            c2980b.f1210a.remove(str);
            int iCurrentTimeMillis = (int) (aVar.f1213b / ((System.currentTimeMillis() - aVar.f1212a) / 1000.0f));
            i = iCurrentTimeMillis > 0 ? iCurrentTimeMillis : 0;
            if (c2980b.f1211b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",fps=" + i);
            }
        }
        return i;
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final long endCalTime(String str) {
        if (!this.f1224h) {
            return -1L;
        }
        C2985g c2985g = this.f1223g;
        long jCurrentTimeMillis = 0;
        if (str != null && str.trim().length() != 0) {
            C2985g.a aVar = c2985g.f1236a.get(str);
            if (aVar == null) {
                return 0L;
            }
            c2985g.f1236a.remove(str);
            jCurrentTimeMillis = System.currentTimeMillis() - aVar.f1238a;
            if (c2985g.f1237b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",consumeTime=" + jCurrentTimeMillis);
            }
        }
        return jCurrentTimeMillis;
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener) {
        registerPAANRListener(context, pAANRListener, 2000L);
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void registerPAMsgListener(PAMsgListener pAMsgListener) {
        if (this.f1219c == null) {
            this.f1219c = new C2983e();
        }
        this.f1218b.setMessageLogging(this.f1219c);
        if (this.f1220d == null) {
            this.f1220d = new C2984f();
        }
        C2984f c2984f = this.f1220d;
        c2984f.f1233b = this.f1217a;
        c2984f.f1232a = pAMsgListener;
        this.f1219c.f1226a.add(c2984f);
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void start() {
        if (this.f1225i) {
            this.f1224h = true;
            C2983e c2983e = this.f1219c;
            if (c2983e != null) {
                this.f1218b.setMessageLogging(c2983e);
            }
            C2979a c2979a = this.f1221e;
            if (c2979a == null || !c2979a.f1197f) {
                return;
            }
            c2979a.f1197f = false;
            c2979a.f1198g.post(c2979a.f1204m);
            c2979a.f1201j = SystemClock.uptimeMillis();
        }
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void startCalFPS(String str, View view) {
        if (this.f1224h) {
            C2980b c2980b = this.f1222f;
            if (str == null || str.trim().length() == 0 || view == null || c2980b.f1210a.get(str) != null) {
                return;
            }
            C2980b.a aVar = new C2980b.a((byte) 0);
            aVar.f1215d = view;
            C2980b.a.AnonymousClass1 anonymousClass1 = new ViewTreeObserver.OnPreDrawListener() { // from class: com.efs.sdk.pa.a.b.a.1
                public AnonymousClass1() {
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    a.this.f1213b++;
                    return true;
                }
            };
            aVar.f1214c = anonymousClass1;
            aVar.f1215d.getViewTreeObserver().addOnPreDrawListener(anonymousClass1);
            aVar.f1212a = System.currentTimeMillis();
            c2980b.f1210a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void startCalTime(String str) {
        if (this.f1224h) {
            C2985g c2985g = this.f1223g;
            if (str == null || str.trim().length() == 0 || c2985g.f1236a.get(str) != null) {
                return;
            }
            C2985g.a aVar = new C2985g.a((byte) 0);
            aVar.f1238a = System.currentTimeMillis();
            c2985g.f1236a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void stop() {
        this.f1224h = false;
        this.f1218b.setMessageLogging(null);
        C2979a c2979a = this.f1221e;
        if (c2979a != null) {
            c2979a.f1197f = true;
            c2979a.f1198g.removeCallbacksAndMessages(null);
            c2979a.f1192a = true;
        }
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void unRegisterPAMsgListener() {
        C2984f c2984f = this.f1220d;
        if (c2984f != null) {
            c2984f.f1232a = null;
        }
        C2983e c2983e = this.f1219c;
        if (c2983e != null) {
            c2983e.f1226a.remove(c2984f);
        }
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void unregisterPAANRListener() {
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j4) {
        registerPAANRListener(context, pAANRListener, j4, Looper.getMainLooper().getThread());
    }

    @Override // com.efs.sdk.p036pa.InterfaceC2976PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j4, Thread thread) {
        if (this.f1221e == null) {
            if (thread != null) {
                this.f1221e = new C2979a((Application) context.getApplicationContext(), j4);
            } else {
                this.f1221e = new C2979a((Application) context.getApplicationContext(), j4, false);
            }
        }
        this.f1221e.f1199h = pAANRListener;
    }
}
