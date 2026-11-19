package p116i0;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p083f0.C7422a;
import p105h0.AbstractC7612a;
import p105h0.AbstractC7614c;
import p127j0.AbstractC7774e;
import p127j0.AbstractC7777h;

/* renamed from: i0.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7641b {
    /* renamed from: a */
    public static boolean m12649a(C7422a c7422a, String str, Context context, String str2, long j10, String str3, int i10, Object obj, Object obj2, Object obj3, Map map) {
        byte[] bArrM12533b;
        try {
            AbstractC7774e.m13121d("RestAPI start send log!");
            String strM12646a = AbstractC7640a.m12646a(c7422a, str, j10, str3, i10, obj, obj2, obj3, map);
            if (!AbstractC7777h.m13133e(strM12646a)) {
                AbstractC7774e.m13121d("UTRestAPI build data failure!");
                return false;
            }
            AbstractC7774e.m13121d("RestAPI build data succ!");
            HashMap map2 = new HashMap(1);
            map2.put(String.valueOf(i10), strM12646a);
            try {
                bArrM12533b = AbstractC7612a.m12533b(c7422a, str, context, map2);
            } catch (Exception e10) {
                AbstractC7774e.m13119b(e10.toString());
                bArrM12533b = null;
            }
            if (bArrM12533b == null) {
                return false;
            }
            AbstractC7774e.m13121d("packRequest success!");
            return AbstractC7614c.m12539b(c7422a, str2, bArrM12533b).m12537a();
        } catch (Throwable th) {
            AbstractC7774e.m13120c("system error!", th);
            return false;
        }
    }
}
