package com.efs.sdk.base.p035a.p042e;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.p035a.p037b.C1277a;
import com.efs.sdk.base.p035a.p037b.C1284h;
import com.efs.sdk.base.p035a.p037b.InterfaceC1282f;
import com.efs.sdk.base.p035a.p038c.C1292c;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p042e.C1300f;
import com.efs.sdk.base.p035a.p043f.C1302b;
import com.efs.sdk.base.p035a.p046h.C1315a;
import com.efs.sdk.base.p035a.p046h.C1321b;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p047a.C1316a;
import com.efs.sdk.base.p035a.p046h.p047a.C1319d;
import com.efs.sdk.base.p035a.p050i.C1335b;
import com.efs.sdk.base.p035a.p050i.C1338e;
import com.efs.sdk.base.p035a.p050i.C1339f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.e.d */
/* loaded from: classes.dex */
public final class HandlerC1298d extends Handler {

    /* renamed from: a */
    public int f7067a;

    /* renamed from: b */
    public InterfaceC1297c f7068b;

    /* renamed from: c */
    private InterfaceC1297c f7069c;

    /* renamed from: d */
    private List<String> f7070d;

    /* renamed from: e */
    private AtomicInteger f7071e;

    /* renamed from: f */
    private InterfaceC1282f f7072f;

    /* renamed from: com.efs.sdk.base.a.e.d$a */
    static class a {

        /* renamed from: a */
        private static final HandlerC1298d f7073a = new HandlerC1298d(0);
    }

    /* synthetic */ HandlerC1298d(byte b4) {
        this();
    }

    /* renamed from: a */
    public static HandlerC1298d m5503a() {
        return a.f7073a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List<File> listEmptyList;
        super.handleMessage(message);
        if (C1300f.a.f7081a.m5507a()) {
            int i4 = message.what;
            if (i4 != 0) {
                if (i4 != 1) {
                    return;
                }
                Object obj = message.obj;
                if (obj != null) {
                    this.f7070d.remove(obj.toString());
                }
                int iIncrementAndGet = message.arg1 != 0 ? this.f7071e.incrementAndGet() : 0;
                if (this.f7070d.isEmpty()) {
                    if (iIncrementAndGet < 5) {
                        sendEmptyMessage(0);
                        return;
                    }
                    this.f7071e.set(0);
                    sendEmptyMessageDelayed(0, C1293a.m5487a().f7018k);
                    C1329d.m5571a("efs.send_log", "request error cnt gt 5, next request delay 10s");
                    return;
                }
                return;
            }
            String strM5485a = C1292c.a.f7047a.m5485a();
            if ("denied".equalsIgnoreCase(strM5485a) || "disconnected".equalsIgnoreCase(strM5485a)) {
                C1329d.m5571a("efs.send_log", "log cann't be send because net status is ".concat(String.valueOf(strM5485a)));
                sendEmptyMessageDelayed(0, C1293a.m5487a().f7019l);
                return;
            }
            List<C1302b> listEmptyList2 = Collections.emptyList();
            try {
                C1277a c1277a = C1277a.b.f6999a;
                int i5 = this.f7067a;
                InterfaceC1282f interfaceC1282f = this.f7072f;
                c1277a.m5435a();
                c1277a.m5435a();
                File fileM5533f = C1315a.m5533f(C1293a.m5487a().f7010c, C1293a.m5487a().f7008a);
                if (fileM5533f.exists()) {
                    List<File> listM5549d = C1321b.m5549d(fileM5533f);
                    if (c1277a.f6996b) {
                        C1339f c1339f = C1339f.a.f7143a;
                        int size = listM5549d.size();
                        if (c1339f.f7140b != null && C1293a.m5487a().f7011d) {
                            C1335b c1335b = new C1335b("efs_core", "log_lag", c1339f.f7139a.f7133c);
                            c1335b.put("cnt", Integer.valueOf(size));
                            c1339f.f7140b.m5492a(c1335b);
                        }
                        c1277a.f6996b = false;
                    }
                    Collections.sort(listM5549d, c1277a.f6998d);
                    ArrayList arrayList = new ArrayList(i5);
                    for (int size2 = listM5549d.size() - 1; size2 >= 0 && arrayList.size() < i5; size2--) {
                        File file = listM5549d.get(size2);
                        if (file.exists() && (interfaceC1282f == null || !interfaceC1282f.mo5444a(file))) {
                            arrayList.add(file);
                        }
                    }
                    listEmptyList = arrayList;
                } else {
                    listEmptyList = Collections.emptyList();
                }
                ArrayList arrayList2 = new ArrayList(i5);
                for (File file2 : listEmptyList) {
                    C1302b c1302bM5434a = c1277a.m5434a(file2);
                    if (c1302bM5434a == null) {
                        C1329d.m5572a("efs.cache", "file upload error, name is " + file2.getName(), null);
                    } else {
                        arrayList2.add(c1302bM5434a);
                    }
                }
                listEmptyList2 = arrayList2;
            } catch (Throwable unused) {
            }
            for (C1302b c1302b : listEmptyList2) {
                if ("wa".equals(c1302b.f7089a.f7082a) || HandlerC1296b.m5495a().m5501a(c1302b.f7089a.f7082a, c1302b.m5511a())) {
                    InterfaceC1297c interfaceC1297c = this.f7068b;
                    if ("wa".equals(c1302b.f7089a.f7082a)) {
                        interfaceC1297c = this.f7069c;
                    }
                    String string = UUID.randomUUID().toString();
                    this.f7070d.add(string);
                    if (C1319d.m5536a(new RunnableC1299e(c1302b, interfaceC1297c, string)) == null) {
                        m5504a(string, -1);
                    }
                }
            }
            if (this.f7070d.size() <= 0) {
                sendEmptyMessageDelayed(0, C1293a.m5487a().f7019l);
            }
        }
    }

    private HandlerC1298d() {
        super(C1316a.f7105a.getLooper());
        this.f7067a = 5;
        this.f7070d = new ArrayList();
        this.f7071e = new AtomicInteger(0);
        this.f7068b = new C1295a();
        this.f7069c = new C1338e();
        this.f7072f = new C1284h();
    }

    /* renamed from: a */
    final void m5504a(Object obj, int i4) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = obj;
        messageObtain.arg1 = i4;
        sendMessage(messageObtain);
    }
}
