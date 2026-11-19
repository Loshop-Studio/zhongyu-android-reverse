package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import com.tendcloud.tenddata.AbstractC8015t;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.tendcloud.tenddata.i */
/* loaded from: classes5.dex */
class C8005i implements AbstractC8015t.a {

    /* renamed from: d */
    private static final int f15020d = 128;

    /* renamed from: e */
    private static final int f15021e = 1000;

    /* renamed from: a */
    private final Handler f15022a;

    /* renamed from: c */
    private final Map<b, c> f15024c = new HashMap();

    /* renamed from: b */
    private final Runnable f15023b = new a();

    /* renamed from: com.tendcloud.tenddata.i$a */
    public final class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (C8005i.this.f15024c) {
                try {
                    Iterator it = C8005i.this.f15024c.entrySet().iterator();
                    while (it.hasNext()) {
                        c cVar = (c) ((Map.Entry) it.next()).getValue();
                        if (jCurrentTimeMillis - cVar.timeSentMillis > 1000) {
                            TalkingDataSDK.onEvent(C7843ab.f14307g, cVar.eventName, AudioStats.AUDIO_AMPLITUDE_NONE, cVar.properties);
                            it.remove();
                        }
                    }
                    if (!C8005i.this.f15024c.isEmpty()) {
                        C8005i.this.f15022a.postDelayed(this, 500L);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.tendcloud.tenddata.i$b */
    public static class b {
        private final int mHashCode;

        public b(View view, String str) {
            this.mHashCode = view.hashCode() ^ str.hashCode();
        }

        public boolean equals(Object obj) {
            try {
                if (obj instanceof b) {
                    if (this.mHashCode == obj.hashCode()) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            return false;
        }

        public int hashCode() {
            return this.mHashCode;
        }
    }

    /* renamed from: com.tendcloud.tenddata.i$c */
    public static class c {
        final String eventName;
        final Hashtable<String, Object> properties;
        final long timeSentMillis;

        public c(String str, Hashtable<String, Object> hashtable, long j10) {
            this.eventName = str;
            this.properties = hashtable;
            this.timeSentMillis = j10;
        }
    }

    public C8005i(Handler handler) {
        this.f15022a = handler;
    }

    @Override // com.tendcloud.tenddata.AbstractC8015t.a
    public void OnEvent(View view, String str, boolean z10) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Hashtable hashtable = new Hashtable();
            String strM12030a = m12030a(view);
            if (strM12030a == null) {
                strM12030a = "";
            }
            hashtable.put("text", strM12030a);
            hashtable.put("dynamic_event", Boolean.TRUE);
            hashtable.put(AgooConstants.MESSAGE_ID, str);
            hashtable.put("time", Long.valueOf(jCurrentTimeMillis));
            if (!z10) {
                Message messageObtainMessage = this.f15022a.obtainMessage(13);
                messageObtainMessage.obj = hashtable;
                this.f15022a.sendMessage(messageObtainMessage);
                return;
            }
            b bVar = new b(view, str);
            c cVar = new c(str, hashtable, jCurrentTimeMillis);
            synchronized (this.f15024c) {
                try {
                    boolean zIsEmpty = this.f15024c.isEmpty();
                    this.f15024c.put(bVar, cVar);
                    if (zIsEmpty) {
                        this.f15022a.postDelayed(this.f15023b, 1000L);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static String m12030a(View view) {
        if (view == null) {
            return "";
        }
        try {
            if (view instanceof TextView) {
                CharSequence text = ((TextView) view).getText();
                if (text != null) {
                    return text.toString();
                }
                return null;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            boolean z10 = false;
            for (int i10 = 0; i10 < childCount && sb2.length() < 128; i10++) {
                String strM12030a = m12030a(viewGroup.getChildAt(i10));
                if (strM12030a != null && strM12030a.length() > 0) {
                    if (z10) {
                        sb2.append(",");
                    }
                    sb2.append(strM12030a);
                    z10 = true;
                }
            }
            if (sb2.length() > 128) {
                return sb2.substring(0, 128);
            }
            if (z10) {
                return sb2.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
