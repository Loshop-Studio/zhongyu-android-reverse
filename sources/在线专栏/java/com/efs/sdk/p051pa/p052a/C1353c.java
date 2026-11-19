package com.efs.sdk.p051pa.p052a;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.efs.sdk.p051pa.InterfaceC1348PA;
import com.efs.sdk.p051pa.PAANRListener;
import com.efs.sdk.p051pa.PAMsgListener;
import com.efs.sdk.p051pa.p052a.C1352b;
import com.efs.sdk.p051pa.p052a.C1357g;
import com.xuexiang.xui.widget.popupwindow.bar.Cookie;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.efs.sdk.pa.a.c */
/* loaded from: classes.dex */
public final class C1353c implements InterfaceC1348PA {

    /* renamed from: a */
    private boolean f7187a;

    /* renamed from: c */
    private C1355e f7189c;

    /* renamed from: d */
    private C1356f f7190d;

    /* renamed from: e */
    private C1351a f7191e;

    /* renamed from: h */
    private boolean f7194h;

    /* renamed from: i */
    private boolean f7195i;

    /* renamed from: b */
    private Looper f7188b = Looper.myLooper();

    /* renamed from: f */
    private C1352b f7192f = new C1352b();

    /* renamed from: g */
    private C1357g f7193g = new C1357g();

    public C1353c(boolean z3) {
        this.f7195i = z3;
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void enableDumpToFile(String str) throws IOException {
        FileOutputStream fileOutputStream;
        C1356f c1356f = this.f7190d;
        if (c1356f == null || str == null || str.trim().length() == 0) {
            return;
        }
        c1356f.f7204c = str;
        if (c1356f.f7205d == null) {
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (Exception unused) {
            }
            try {
                c1356f.f7205d = new BufferedOutputStream(fileOutputStream);
            } catch (Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void enableLog(boolean z3) {
        this.f7187a = z3;
        this.f7192f.f7181b = z3;
        this.f7193g.f7207b = z3;
        C1356f c1356f = this.f7190d;
        if (c1356f != null) {
            c1356f.f7203b = z3;
        }
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final int endCalFPS(String str) {
        if (!this.f7194h) {
            return -1;
        }
        C1352b c1352b = this.f7192f;
        if (str != null && str.trim().length() != 0) {
            C1352b.a aVar = c1352b.f7180a.get(str);
            if (aVar == null) {
                return 0;
            }
            View view = aVar.f7185d;
            if (view != null && aVar.f7184c != null) {
                view.getViewTreeObserver().removeOnPreDrawListener(aVar.f7184c);
            }
            c1352b.f7180a.remove(str);
            int iCurrentTimeMillis = (int) (aVar.f7183b / ((System.currentTimeMillis() - aVar.f7182a) / 1000.0f));
            i = iCurrentTimeMillis > 0 ? iCurrentTimeMillis : 0;
            if (c1352b.f7181b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",fps=" + i);
            }
        }
        return i;
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final long endCalTime(String str) {
        if (!this.f7194h) {
            return -1L;
        }
        C1357g c1357g = this.f7193g;
        long jCurrentTimeMillis = 0;
        if (str != null && str.trim().length() != 0) {
            C1357g.a aVar = c1357g.f7206a.get(str);
            if (aVar == null) {
                return 0L;
            }
            c1357g.f7206a.remove(str);
            jCurrentTimeMillis = System.currentTimeMillis() - aVar.f7208a;
            if (c1357g.f7207b) {
                Log.e("PerformanceAnalyze", "key=" + str + ",consumeTime=" + jCurrentTimeMillis);
            }
        }
        return jCurrentTimeMillis;
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener) {
        registerPAANRListener(context, pAANRListener, Cookie.DEFAULT_COOKIE_DURATION);
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void registerPAMsgListener(PAMsgListener pAMsgListener) {
        if (this.f7189c == null) {
            this.f7189c = new C1355e();
        }
        this.f7188b.setMessageLogging(this.f7189c);
        if (this.f7190d == null) {
            this.f7190d = new C1356f();
        }
        C1356f c1356f = this.f7190d;
        c1356f.f7203b = this.f7187a;
        c1356f.f7202a = pAMsgListener;
        this.f7189c.f7196a.add(c1356f);
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void start() {
        if (this.f7195i) {
            this.f7194h = true;
            C1355e c1355e = this.f7189c;
            if (c1355e != null) {
                this.f7188b.setMessageLogging(c1355e);
            }
            C1351a c1351a = this.f7191e;
            if (c1351a == null || !c1351a.f7167f) {
                return;
            }
            c1351a.f7167f = false;
            c1351a.f7168g.post(c1351a.f7174m);
            c1351a.f7171j = SystemClock.uptimeMillis();
        }
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void startCalFPS(String str, View view) {
        if (this.f7194h) {
            C1352b c1352b = this.f7192f;
            if (str == null || str.trim().length() == 0 || view == null || c1352b.f7180a.get(str) != null) {
                return;
            }
            C1352b.a aVar = new C1352b.a((byte) 0);
            aVar.f7185d = view;
            C1352b.a.AnonymousClass1 anonymousClass1 = new ViewTreeObserver.OnPreDrawListener() { // from class: com.efs.sdk.pa.a.b.a.1
                AnonymousClass1() {
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    a.this.f7183b++;
                    return true;
                }
            };
            aVar.f7184c = anonymousClass1;
            aVar.f7185d.getViewTreeObserver().addOnPreDrawListener(anonymousClass1);
            aVar.f7182a = System.currentTimeMillis();
            c1352b.f7180a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void startCalTime(String str) {
        if (this.f7194h) {
            C1357g c1357g = this.f7193g;
            if (str == null || str.trim().length() == 0 || c1357g.f7206a.get(str) != null) {
                return;
            }
            C1357g.a aVar = new C1357g.a((byte) 0);
            aVar.f7208a = System.currentTimeMillis();
            c1357g.f7206a.put(str, aVar);
        }
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void stop() {
        this.f7194h = false;
        this.f7188b.setMessageLogging(null);
        C1351a c1351a = this.f7191e;
        if (c1351a != null) {
            c1351a.f7167f = true;
            c1351a.f7168g.removeCallbacksAndMessages(null);
            c1351a.f7162a = true;
        }
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void unRegisterPAMsgListener() {
        C1356f c1356f = this.f7190d;
        if (c1356f != null) {
            c1356f.f7202a = null;
        }
        C1355e c1355e = this.f7189c;
        if (c1355e != null) {
            c1355e.f7196a.remove(c1356f);
        }
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void unregisterPAANRListener() {
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j4) {
        registerPAANRListener(context, pAANRListener, j4, Looper.getMainLooper().getThread());
    }

    @Override // com.efs.sdk.p051pa.InterfaceC1348PA
    public final void registerPAANRListener(Context context, PAANRListener pAANRListener, long j4, Thread thread) {
        if (this.f7191e == null) {
            if (thread != null) {
                this.f7191e = new C1351a((Application) context.getApplicationContext(), j4);
            } else {
                this.f7191e = new C1351a((Application) context.getApplicationContext(), j4, false);
            }
        }
        this.f7191e.f7169h = pAANRListener;
    }
}
