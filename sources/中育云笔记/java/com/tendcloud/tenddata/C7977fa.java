package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.blankj.utilcode.constant.TimeConstants;
import com.tendcloud.tenddata.C7902cg;
import com.tendcloud.tenddata.C7924db;
import com.tendcloud.tenddata.C7960ek;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: com.tendcloud.tenddata.fa */
/* loaded from: classes5.dex */
public class C7977fa {

    /* renamed from: a */
    private static String f14906a = "utf-8";

    /* renamed from: c */
    private static final int f14908c = 5;

    /* renamed from: d */
    private static final int f14909d = 30000;

    /* renamed from: g */
    private static final boolean f14910g = true;

    /* renamed from: h */
    private static final int f14911h = 65536;

    /* renamed from: j */
    private static HandlerThread f14913j;

    /* renamed from: e */
    private long f14914e = 0;

    /* renamed from: f */
    private boolean f14915f = true;

    /* renamed from: k */
    private Handler f14916k;

    /* renamed from: b */
    private static final CRC32 f14907b = new CRC32();

    /* renamed from: i */
    private static volatile C7977fa f14912i = null;

    static {
        try {
            C7913cr.m11625a().register(m11937a());
        } catch (Throwable unused) {
        }
    }

    private C7977fa() {
        this.f14916k = null;
        HandlerThread handlerThread = new HandlerThread("ModuleDataForward", 10);
        f14913j = handlerThread;
        handlerThread.start();
        this.f14916k = new Handler(f14913j.getLooper()) { // from class: com.tendcloud.tenddata.fa.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                try {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof AbstractC7841a)) {
                        C7977fa.this.m11939a((AbstractC7841a) obj);
                    }
                    C7977fa.this.m11945b();
                } catch (Throwable unused) {
                }
            }
        };
        m11945b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m11945b() {
        int i10;
        int i11;
        int iNextInt;
        if (this.f14916k.hasMessages(5)) {
            return;
        }
        try {
            SecureRandom secureRandomM11603b = C7912cq.m11603b();
            int[] iArrM11033a = C7843ab.m11033a();
            int i12 = 0;
            if (C7903ch.m11541i(C7843ab.f14307g)) {
                if (this.f14915f) {
                    i10 = iArrM11033a[1];
                } else {
                    i11 = iArrM11033a[1];
                    iNextInt = secureRandomM11603b.nextInt(30000);
                    i10 = i11 + iNextInt;
                }
            } else if (this.f14915f) {
                i10 = iArrM11033a[0];
            } else {
                i11 = iArrM11033a[0];
                iNextInt = secureRandomM11603b.nextInt(TimeConstants.MIN) - 30000;
                i10 = i11 + iNextInt;
            }
            if (i10 > 1800000) {
                i10 = 1800000;
            }
            ArrayList<AbstractC7841a> featuresList = AbstractC7841a.getFeaturesList();
            int size = featuresList.size();
            while (i12 < size) {
                AbstractC7841a abstractC7841a = featuresList.get(i12);
                i12++;
                Handler handler = this.f14916k;
                handler.sendMessageDelayed(Message.obtain(handler, 5, abstractC7841a), i10);
            }
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventForwardRequest(C7960ek c7960ek) {
        if (c7960ek == null || C7843ab.f14307g == null) {
            return;
        }
        if (c7960ek.f14867b.equals(C7960ek.a.IMMEDIATELY)) {
            if (this.f14916k.hasMessages(5, c7960ek.f14866a)) {
                this.f14916k.removeMessages(5);
            }
            Message.obtain(this.f14916k, 5, c7960ek.f14866a).sendToTarget();
        } else if (c7960ek.f14867b.equals(C7960ek.a.HIGH)) {
            if (this.f14916k.hasMessages(5)) {
                this.f14916k.removeMessages(5);
            }
            long jAbs = Math.abs((SystemClock.elapsedRealtime() - this.f14914e) - 30000);
            this.f14916k.sendMessageDelayed(Message.obtain(this.f14916k, 5, c7960ek.f14866a), jAbs <= 30000 ? jAbs : 30000L);
        }
    }

    /* renamed from: a */
    private void m11942a(String str, AbstractC7841a abstractC7841a, boolean z10) {
        String str2 = "[" + abstractC7841a.name() + "] " + str;
        int iIndex = abstractC7841a.index();
        if (iIndex != 0 && iIndex != 1 && iIndex != 3 && iIndex != 99 && iIndex != 7 && iIndex != 8) {
            C7896ca.iForInternal(str2);
        } else if (z10) {
            C7896ca.iForDeveloper(str2);
        } else {
            C7896ca.dForInternal(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m11939a(AbstractC7841a abstractC7841a) {
        byte[] bArrM11575a;
        if (!C7903ch.m11529b(C7843ab.f14307g) || !abstractC7841a.needToSendData()) {
            return;
        }
        boolean z10 = false;
        try {
            boolean zM11501a = C7902cg.m11501a(C7902cg.b.getFeatureLockFileName(abstractC7841a.index()));
            if (zM11501a) {
                try {
                    TreeSet<C7979fc> treeSetM11947a = C7978fb.m11946a().m11947a(abstractC7841a);
                    if (treeSetM11947a != null && treeSetM11947a.size() > 0) {
                        m11942a("New local data found!", abstractC7841a, false);
                        byte[] bArrM11943a = m11943a(treeSetM11947a, C7912cq.m11620f(m11938a(treeSetM11947a)));
                        C7925dc c7925dc = new C7925dc();
                        if (abstractC7841a.name().equals("PUSH")) {
                            bArrM11575a = null;
                        } else {
                            bArrM11575a = C7908cm.m11575a(bArrM11943a);
                            c7925dc.m11677a("decrypt-version", C7843ab.f14281P);
                        }
                        if (bArrM11575a != null) {
                            bArrM11943a = bArrM11575a;
                        }
                        CRC32 crc32 = f14907b;
                        crc32.reset();
                        crc32.update(bArrM11943a);
                        if (bArrM11943a != null && bArrM11943a.length > 0) {
                            m11942a("Submit local data to collector server ...", abstractC7841a, true);
                        }
                        StringBuilder sb2 = new StringBuilder(abstractC7841a.name().equals("SDK") ? C7906ck.m11569b(C7843ab.f14307g, C7843ab.f14324x, C7843ab.f14269D, abstractC7841a.getUrl()) : abstractC7841a.getUrl());
                        if (abstractC7841a.name().equals("TRACKING")) {
                            sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR + Long.toHexString(crc32.getValue()));
                            sb2.append("/1");
                        } else {
                            sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR + Long.toHexString(crc32.getValue()));
                        }
                        C7927de c7927deM11667a = C7921cz.m11667a(C7921cz.m11665a().url(sb2.toString()).body(new C7924db(C7924db.a.EMPTY, bArrM11943a)).method(EnumC7926dd.POST).cert(abstractC7841a.getCert()).header(c7925dc).host(abstractC7841a.name().equals("SDK") ? C7906ck.m11569b(C7843ab.f14307g, C7843ab.f14324x, C7843ab.f14270E, abstractC7841a.getHost()) : abstractC7841a.getHost()).m11673ip(abstractC7841a.getIP()).build(), abstractC7841a);
                        if (c7927deM11667a.m11686b() == 200) {
                            this.f14914e = SystemClock.elapsedRealtime();
                            this.f14915f = true;
                            C7978fb.m11946a().sendMessageSuccess(abstractC7841a);
                            m11942a("Data submitted successfully!", abstractC7841a, true);
                            C7843ab.f14289X.set(0);
                        } else {
                            C7843ab.f14289X.incrementAndGet();
                            C7978fb.m11946a().sendMessageFaild(abstractC7841a);
                            this.f14915f = false;
                            m11942a("Failed to submit data! Response code " + c7927deM11667a.m11686b(), abstractC7841a, true);
                        }
                        if (!zM11501a) {
                            return;
                        }
                    } else {
                        m11942a("No new data found!", abstractC7841a, false);
                        if (!zM11501a) {
                            return;
                        }
                    }
                } catch (Throwable unused) {
                    z10 = zM11501a;
                    if (z10) {
                        C7902cg.releaseFileLock(C7902cg.b.getFeatureLockFileName(abstractC7841a.index()));
                        return;
                    }
                    return;
                }
            } else if (!zM11501a) {
                return;
            }
            C7902cg.releaseFileLock(C7902cg.b.getFeatureLockFileName(abstractC7841a.index()));
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private static String m11938a(TreeSet<C7979fc> treeSet) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<C7979fc> it = treeSet.iterator();
        while (it.hasNext()) {
            C7979fc next = it.next();
            if (next.m11956c() != null && next.m11956c().length > 0) {
                sb2.append(new String(next.m11956c()));
                sb2.append(",");
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: a */
    private static byte[] m11943a(TreeSet<C7979fc> treeSet, byte[] bArr) {
        int size;
        try {
            if (bArr.length >= 65536 && (size = treeSet.size()) != 1) {
                for (int i10 = 0; i10 < size / 2; i10++) {
                    treeSet.pollLast();
                }
                return m11943a(treeSet, C7912cq.m11620f(m11938a(treeSet)));
            }
        } catch (Throwable unused) {
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m11944a(byte[] bArr) throws IOException {
        BufferedInputStream bufferedInputStream;
        byte[] bArr2 = new byte[2048];
        try {
            bufferedInputStream = new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(bArr), new Inflater(false)));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i10 = bufferedInputStream.read(bArr2);
                    if (i10 != -1) {
                        byteArrayOutputStream.write(bArr2, 0, i10);
                    } else {
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream.toByteArray();
                    }
                }
            } catch (Exception unused) {
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Exception unused2) {
            bufferedInputStream = null;
        }
    }

    /* renamed from: a */
    public static C7977fa m11937a() {
        if (f14912i == null) {
            synchronized (C7977fa.class) {
                try {
                    if (f14912i == null) {
                        f14912i = new C7977fa();
                    }
                } finally {
                }
            }
        }
        return f14912i;
    }
}
