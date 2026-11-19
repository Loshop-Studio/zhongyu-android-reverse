package com.efs.sdk.base.p039a.p046e;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.p039a.p041b.C5645a;
import com.efs.sdk.base.p039a.p041b.C5652h;
import com.efs.sdk.base.p039a.p041b.InterfaceC5650f;
import com.efs.sdk.base.p039a.p042c.C5660c;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p046e.C5668f;
import com.efs.sdk.base.p039a.p047f.C5670b;
import com.efs.sdk.base.p039a.p050h.C5683a;
import com.efs.sdk.base.p039a.p050h.C5689b;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p051a.C5684a;
import com.efs.sdk.base.p039a.p050h.p051a.C5687d;
import com.efs.sdk.base.p039a.p054i.C5703b;
import com.efs.sdk.base.p039a.p054i.C5706e;
import com.efs.sdk.base.p039a.p054i.C5707f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.e.d */
/* loaded from: classes3.dex */
public final class HandlerC5666d extends Handler {

    /* renamed from: a */
    public int f4701a;

    /* renamed from: b */
    public InterfaceC5665c f4702b;

    /* renamed from: c */
    private InterfaceC5665c f4703c;

    /* renamed from: d */
    private List<String> f4704d;

    /* renamed from: e */
    private AtomicInteger f4705e;

    /* renamed from: f */
    private InterfaceC5650f f4706f;

    /* renamed from: com.efs.sdk.base.a.e.d$a */
    public static class a {

        /* renamed from: a */
        private static final HandlerC5666d f4707a = new HandlerC5666d(0);
    }

    public /* synthetic */ HandlerC5666d(byte b10) {
        this();
    }

    /* renamed from: a */
    public static HandlerC5666d m4113a() {
        return a.f4707a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List<File> arrayList;
        super.handleMessage(message);
        if (C5668f.a.f4715a.m4117a()) {
            int i9 = message.what;
            if (i9 != 0) {
                if (i9 != 1) {
                    return;
                }
                Object obj = message.obj;
                if (obj != null) {
                    this.f4704d.remove(obj.toString());
                }
                int iIncrementAndGet = message.arg1 != 0 ? this.f4705e.incrementAndGet() : 0;
                if (this.f4704d.isEmpty()) {
                    if (iIncrementAndGet < 5) {
                        sendEmptyMessage(0);
                        return;
                    }
                    this.f4705e.set(0);
                    sendEmptyMessageDelayed(0, C5661a.m4097a().f4652k);
                    C5697d.m4181a("efs.send_log", "request error cnt gt 5, next request delay 10s");
                    return;
                }
                return;
            }
            String strM4095a = C5660c.a.f4681a.m4095a();
            if ("denied".equalsIgnoreCase(strM4095a) || "disconnected".equalsIgnoreCase(strM4095a)) {
                C5697d.m4181a("efs.send_log", "log cann't be send because net status is ".concat(String.valueOf(strM4095a)));
                sendEmptyMessageDelayed(0, C5661a.m4097a().f4653l);
                return;
            }
            List<C5670b> list = Collections.EMPTY_LIST;
            try {
                C5645a c5645a = C5645a.b.f4633a;
                int i10 = this.f4701a;
                InterfaceC5650f interfaceC5650f = this.f4706f;
                c5645a.m4045a();
                c5645a.m4045a();
                File fileM4143f = C5683a.m4143f(C5661a.m4097a().f4644c, C5661a.m4097a().f4642a);
                if (fileM4143f.exists()) {
                    List<File> listM4159d = C5689b.m4159d(fileM4143f);
                    if (c5645a.f4630b) {
                        C5707f c5707f = C5707f.a.f4777a;
                        int size = listM4159d.size();
                        if (c5707f.f4774b != null && C5661a.m4097a().f4645d) {
                            C5703b c5703b = new C5703b("efs_core", "log_lag", c5707f.f4773a.f4767c);
                            c5703b.put("cnt", Integer.valueOf(size));
                            c5707f.f4774b.m4102a(c5703b);
                        }
                        c5645a.f4630b = false;
                    }
                    Collections.sort(listM4159d, c5645a.f4632d);
                    arrayList = new ArrayList(i10);
                    for (int size2 = listM4159d.size() - 1; size2 >= 0 && arrayList.size() < i10; size2--) {
                        File file = listM4159d.get(size2);
                        if (file.exists() && (interfaceC5650f == null || !interfaceC5650f.mo4054a(file))) {
                            arrayList.add(file);
                        }
                    }
                } else {
                    arrayList = list;
                }
                ArrayList arrayList2 = new ArrayList(i10);
                for (File file2 : arrayList) {
                    C5670b c5670bM4044a = c5645a.m4044a(file2);
                    if (c5670bM4044a == null) {
                        C5697d.m4182a("efs.cache", "file upload error, name is " + file2.getName(), null);
                    } else {
                        arrayList2.add(c5670bM4044a);
                    }
                }
                list = arrayList2;
            } catch (Throwable unused) {
            }
            for (C5670b c5670b : list) {
                if ("wa".equals(c5670b.f4723a.f4716a) || HandlerC5664b.m4105a().m4111a(c5670b.f4723a.f4716a, c5670b.m4121a())) {
                    InterfaceC5665c interfaceC5665c = this.f4702b;
                    if ("wa".equals(c5670b.f4723a.f4716a)) {
                        interfaceC5665c = this.f4703c;
                    }
                    String string = UUID.randomUUID().toString();
                    this.f4704d.add(string);
                    if (C5687d.m4146a(new RunnableC5667e(c5670b, interfaceC5665c, string)) == null) {
                        m4114a(string, -1);
                    }
                }
            }
            if (this.f4704d.size() <= 0) {
                sendEmptyMessageDelayed(0, C5661a.m4097a().f4653l);
            }
        }
    }

    private HandlerC5666d() {
        super(C5684a.f4739a.getLooper());
        this.f4701a = 5;
        this.f4704d = new ArrayList();
        this.f4705e = new AtomicInteger(0);
        this.f4702b = new C5663a();
        this.f4703c = new C5706e();
        this.f4706f = new C5652h();
    }

    /* renamed from: a */
    public final void m4114a(Object obj, int i9) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = obj;
        messageObtain.arg1 = i9;
        sendMessage(messageObtain);
    }
}
