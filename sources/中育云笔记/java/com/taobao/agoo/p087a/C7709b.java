package com.taobao.agoo.p087a;

import android.content.Context;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.JsonUtility;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.IListAliasCallback;
import com.taobao.agoo.IListAliasCallbackInner;
import com.taobao.agoo.p087a.p088a.C7705a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.taobao.agoo.a.b */
/* loaded from: classes5.dex */
public class C7709b extends AccsAbstractDataListener {

    /* renamed from: b */
    public static C7704a f13279b;

    /* renamed from: a */
    public Map<String, ICallback> f13280a = new HashMap();

    public C7709b(Context context) {
        if (f13279b == null) {
            f13279b = new C7704a(context.getApplicationContext());
        }
    }

    /* renamed from: a */
    private void m10207a(JSONObject jSONObject, IListAliasCallback iListAliasCallback) {
        Map<String, String> map = JsonUtility.getMap(jSONObject, C7705a.JSON_ALIAS_TOKEN_MAP);
        if (map == null) {
            map = new HashMap<>();
        }
        if (iListAliasCallback != null) {
            if (iListAliasCallback instanceof IListAliasCallbackInner) {
                ((IListAliasCallbackInner) iListAliasCallback).onSuccess(map);
            } else {
                iListAliasCallback.onSuccess(new ArrayList(map.keySet()));
            }
        }
    }

    @Override // com.taobao.accs.base.AccsAbstractDataListener, com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i10, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
    }

    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.accs.base.AccsAbstractDataListener, com.taobao.accs.base.AccsDataListenerV2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResponse(java.lang.String r14, java.lang.String r15, int r16, java.lang.String r17, byte[] r18, com.taobao.accs.base.TaoBaseService.ExtraInfo r19) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.p087a.C7709b.onResponse(java.lang.String, java.lang.String, int, java.lang.String, byte[], com.taobao.accs.base.TaoBaseService$ExtraInfo):void");
    }

    @Override // com.taobao.accs.base.AccsAbstractDataListener, com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i10, TaoBaseService.ExtraInfo extraInfo) {
    }

    @Override // com.taobao.accs.base.AccsAbstractDataListener, com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i10, TaoBaseService.ExtraInfo extraInfo) {
    }
}
