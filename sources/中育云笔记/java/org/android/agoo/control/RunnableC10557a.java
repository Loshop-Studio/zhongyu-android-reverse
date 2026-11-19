package org.android.agoo.control;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: org.android.agoo.control.a */
/* loaded from: classes6.dex */
class RunnableC10557a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f25310a;

    /* renamed from: b */
    final /* synthetic */ String f25311b;

    /* renamed from: c */
    final /* synthetic */ AgooFactory f25312c;

    public RunnableC10557a(AgooFactory agooFactory, byte[] bArr, String str) {
        this.f25312c = agooFactory;
        this.f25310a = bArr;
        this.f25311b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = new String(this.f25310a, "utf-8");
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length == 1) {
                String string = null;
                String string2 = null;
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    if (jSONObject != null) {
                        string = jSONObject.getString("i");
                        string2 = jSONObject.getString("p");
                    }
                }
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m10119i("AgooFactory", "saveMsg msgId:" + string + ",message=" + str + ",currentPack=" + string2 + ",reportTimes=" + Config.m22241g(AgooFactory.sContext), new Object[0]);
                }
                if (TextUtils.isEmpty(string2) || !TextUtils.equals(string2, AgooFactory.sContext.getPackageName())) {
                    return;
                }
                if (TextUtils.isEmpty(this.f25311b)) {
                    this.f25312c.messageService.m22256a(string, str, "0");
                } else {
                    this.f25312c.messageService.m22256a(string, str, this.f25311b);
                }
            }
        } catch (Throwable th) {
            ALog.m10118e("AgooFactory", "saveMsg fail:" + th.toString(), new Object[0]);
        }
    }
}
