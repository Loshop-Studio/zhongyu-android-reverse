package com.efs.sdk.base.p020a.p027e;

import android.os.Handler;
import android.os.Message;
import com.efs.sdk.base.p020a.p022b.C2905a;
import com.efs.sdk.base.p020a.p022b.C2912h;
import com.efs.sdk.base.p020a.p022b.InterfaceC2910f;
import com.efs.sdk.base.p020a.p023c.C2920c;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p027e.C2928f;
import com.efs.sdk.base.p020a.p028f.C2930b;
import com.efs.sdk.base.p020a.p031h.C2943a;
import com.efs.sdk.base.p020a.p031h.C2949b;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p032a.C2944a;
import com.efs.sdk.base.p020a.p031h.p032a.C2947d;
import com.efs.sdk.base.p020a.p035i.C2963b;
import com.efs.sdk.base.p020a.p035i.C2966e;
import com.efs.sdk.base.p020a.p035i.C2967f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.e.d */
/* loaded from: classes2.dex */
public final class HandlerC2926d extends Handler {

    /* renamed from: a */
    public int f1097a;

    /* renamed from: b */
    public InterfaceC2925c f1098b;

    /* renamed from: c */
    private InterfaceC2925c f1099c;

    /* renamed from: d */
    private List<String> f1100d;

    /* renamed from: e */
    private AtomicInteger f1101e;

    /* renamed from: f */
    private InterfaceC2910f f1102f;

    /* renamed from: com.efs.sdk.base.a.e.d$a */
    public static class a {

        /* renamed from: a */
        private static final HandlerC2926d f1103a = new HandlerC2926d(0);
    }

    public /* synthetic */ HandlerC2926d(byte b4) {
        this();
    }

    /* renamed from: a */
    public static HandlerC2926d m2144a() {
        return a.f1103a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List<File> listEmptyList;
        super.handleMessage(message);
        if (C2928f.a.f1111a.m2148a()) {
            int i4 = message.what;
            if (i4 != 0) {
                if (i4 != 1) {
                    return;
                }
                Object obj = message.obj;
                if (obj != null) {
                    this.f1100d.remove(obj.toString());
                }
                int iIncrementAndGet = message.arg1 != 0 ? this.f1101e.incrementAndGet() : 0;
                if (this.f1100d.isEmpty()) {
                    if (iIncrementAndGet < 5) {
                        sendEmptyMessage(0);
                        return;
                    }
                    this.f1101e.set(0);
                    sendEmptyMessageDelayed(0, C2921a.m2128a().f1048k);
                    C2957d.m2212a("efs.send_log", "request error cnt gt 5, next request delay 10s");
                    return;
                }
                return;
            }
            String strM2126a = C2920c.a.f1077a.m2126a();
            if ("denied".equalsIgnoreCase(strM2126a) || "disconnected".equalsIgnoreCase(strM2126a)) {
                C2957d.m2212a("efs.send_log", "log cann't be send because net status is ".concat(String.valueOf(strM2126a)));
                sendEmptyMessageDelayed(0, C2921a.m2128a().f1049l);
                return;
            }
            List<C2930b> listEmptyList2 = Collections.emptyList();
            try {
                C2905a c2905a = C2905a.b.f1029a;
                int i5 = this.f1097a;
                InterfaceC2910f interfaceC2910f = this.f1102f;
                c2905a.m2076a();
                c2905a.m2076a();
                File fileM2174f = C2943a.m2174f(C2921a.m2128a().f1040c, C2921a.m2128a().f1038a);
                if (fileM2174f.exists()) {
                    List<File> listM2190d = C2949b.m2190d(fileM2174f);
                    if (c2905a.f1026b) {
                        C2967f c2967f = C2967f.a.f1173a;
                        int size = listM2190d.size();
                        if (c2967f.f1170b != null && C2921a.m2128a().f1041d) {
                            C2963b c2963b = new C2963b("efs_core", "log_lag", c2967f.f1169a.f1163c);
                            c2963b.put("cnt", Integer.valueOf(size));
                            c2967f.f1170b.m2133a(c2963b);
                        }
                        c2905a.f1026b = false;
                    }
                    Collections.sort(listM2190d, c2905a.f1028d);
                    ArrayList arrayList = new ArrayList(i5);
                    for (int size2 = listM2190d.size() - 1; size2 >= 0 && arrayList.size() < i5; size2--) {
                        File file = listM2190d.get(size2);
                        if (file.exists() && (interfaceC2910f == null || !interfaceC2910f.mo2085a(file))) {
                            arrayList.add(file);
                        }
                    }
                    listEmptyList = arrayList;
                } else {
                    listEmptyList = Collections.emptyList();
                }
                ArrayList arrayList2 = new ArrayList(i5);
                for (File file2 : listEmptyList) {
                    C2930b c2930bM2075a = c2905a.m2075a(file2);
                    if (c2930bM2075a == null) {
                        C2957d.m2213a("efs.cache", "file upload error, name is " + file2.getName(), null);
                    } else {
                        arrayList2.add(c2930bM2075a);
                    }
                }
                listEmptyList2 = arrayList2;
            } catch (Throwable unused) {
            }
            for (C2930b c2930b : listEmptyList2) {
                if ("wa".equals(c2930b.f1119a.f1112a) || HandlerC2924b.m2136a().m2142a(c2930b.f1119a.f1112a, c2930b.m2152a())) {
                    InterfaceC2925c interfaceC2925c = this.f1098b;
                    if ("wa".equals(c2930b.f1119a.f1112a)) {
                        interfaceC2925c = this.f1099c;
                    }
                    String string = UUID.randomUUID().toString();
                    this.f1100d.add(string);
                    if (C2947d.m2177a(new RunnableC2927e(c2930b, interfaceC2925c, string)) == null) {
                        m2145a(string, -1);
                    }
                }
            }
            if (this.f1100d.size() <= 0) {
                sendEmptyMessageDelayed(0, C2921a.m2128a().f1049l);
            }
        }
    }

    private HandlerC2926d() {
        super(C2944a.f1135a.getLooper());
        this.f1097a = 5;
        this.f1100d = new ArrayList();
        this.f1101e = new AtomicInteger(0);
        this.f1098b = new C2923a();
        this.f1099c = new C2966e();
        this.f1102f = new C2912h();
    }

    /* renamed from: a */
    public final void m2145a(Object obj, int i4) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = obj;
        messageObtain.arg1 = i4;
        sendMessage(messageObtain);
    }
}
