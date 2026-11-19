package p310z2;

import java.util.Comparator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: z2.c */
/* loaded from: classes4.dex */
public class C9992c implements Comparator {

    /* renamed from: a */
    public String f17989a;

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            return (int) (jSONObject.getLong(this.f17989a) - jSONObject2.getLong(this.f17989a));
        } catch (JSONException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public void m17315b(String str) {
        this.f17989a = str;
    }
}
