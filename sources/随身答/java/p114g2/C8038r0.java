package p114g2;

import android.content.Context;
import android.content.SharedPreferences;
import p092e2.AbstractC7839a;
import p290x2.AbstractC9866a;
import p310z2.AbstractC9993d;

/* renamed from: g2.r0 */
/* loaded from: classes4.dex */
public class C8038r0 implements InterfaceC8036q0 {

    /* renamed from: a */
    public long f13629a = AbstractC7839a.f13169f;

    @Override // p114g2.InterfaceC8036q0
    /* renamed from: a */
    public String mo12717a(Context context) {
        String strM17321f = AbstractC9993d.m17321f(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (strM17321f == null) {
            throw new RuntimeException("Appkey is null or empty, Please check!");
        }
        return AbstractC9993d.m17316a(jCurrentTimeMillis + strM17321f + "02:00:00:00:00:00");
    }

    @Override // p114g2.InterfaceC8036q0
    /* renamed from: b */
    public void mo12718b(Context context, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            SharedPreferences.Editor editorEdit = AbstractC9866a.m16841a(context).edit();
            editorEdit.putString("session_id", str);
            editorEdit.putLong("session_end_time", 0L);
            editorEdit.putLong("a_start_time", jCurrentTimeMillis);
            editorEdit.putLong("a_end_time", 0L);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }

    @Override // p114g2.InterfaceC8036q0
    /* renamed from: c */
    public boolean mo12719c(long j9, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (j9 == 0 || jCurrentTimeMillis - j9 >= this.f13629a) && j10 > 0 && jCurrentTimeMillis - j10 > this.f13629a;
    }
}
