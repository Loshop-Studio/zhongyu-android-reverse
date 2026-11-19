package p318r5;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: r5.k */
/* loaded from: classes5.dex */
public class C10874k implements InterfaceRunnableC10897u {

    /* renamed from: c */
    public String f26245c;

    /* renamed from: d */
    public String f26246d;

    /* renamed from: e */
    public String f26247e;

    /* renamed from: f */
    public List f26248f;

    public C10874k(List list, String str, String str2, String str3) {
        this.f26245c = str;
        this.f26246d = str2;
        this.f26247e = str3;
        this.f26248f = list;
    }

    /* renamed from: a */
    public final void m23507a() {
        AbstractC10877l.m23520d(AbstractC10900v0.m23682q(), "backup_event", AbstractC10886o0.m23582e(this.f26245c, this.f26247e, this.f26246d));
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.f26248f;
        if (list == null || list.size() == 0) {
            AbstractC10861f1.m23438j("hmsSdk", "failed events is empty");
            return;
        }
        if (AbstractC10865h.m23462c(AbstractC10900v0.m23682q(), "cached_v2_1", AbstractC10900v0.m23684s() * 1048576)) {
            AbstractC10861f1.m23440l("hmsSdk", "The cacheFile is full,Can not writing data, delete it! reqID:" + this.f26246d);
            AbstractC10877l.m23520d(AbstractC10900v0.m23682q(), "cached_v2_1", new String[0]);
            return;
        }
        String strM23581d = AbstractC10886o0.m23581d(this.f26245c, this.f26247e);
        List list2 = (List) AbstractC10868i.m23477f(AbstractC10900v0.m23682q(), "cached_v2_1", strM23581d).get(strM23581d);
        if (list2 != null && list2.size() != 0) {
            this.f26248f.addAll(list2);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f26248f.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((C10859f) it.next()).m23419h());
            } catch (JSONException unused) {
                AbstractC10861f1.m23440l("hmsSdk", "event to json error");
            }
        }
        String string = jSONArray.toString();
        if (string.length() > AbstractC10900v0.m23680o() * 1048576) {
            AbstractC10861f1.m23440l("hmsSdk", "this failed data is too long,can not writing it");
            this.f26248f = null;
            return;
        }
        AbstractC10861f1.m23438j("hmsSdk", "data send failed, write to cache file...reqID:" + this.f26246d);
        AbstractC10877l.m23523g(AbstractC10900v0.m23682q(), "cached_v2_1", strM23581d, string);
        m23507a();
    }
}
