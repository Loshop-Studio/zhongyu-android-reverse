package p344t5;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;
import p332s4.AbstractC11057a;

/* renamed from: t5.d */
/* loaded from: classes5.dex */
public abstract class AbstractC11230d {

    /* renamed from: a */
    public static final Object f26942a = new Object();

    /* renamed from: a */
    public static boolean m24992a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (jSONObject != null) {
            return TextUtils.isEmpty(str) && jSONObject2 == null;
        }
        return true;
    }

    /* renamed from: b */
    public static String m24993b(Context context) {
        return AbstractC11057a.m24512b(context).getString("client/project_id");
    }
}
