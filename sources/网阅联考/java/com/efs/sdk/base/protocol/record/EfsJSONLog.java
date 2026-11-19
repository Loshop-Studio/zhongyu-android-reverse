package com.efs.sdk.base.protocol.record;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p020a.p023c.C2919b;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p031h.C2957d;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class EfsJSONLog extends AbsRecordLog {
    public EfsJSONLog(String str) {
        super(str);
        put("type", str);
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public byte[] generate() {
        String strGenerateString = generateString();
        if (C2921a.m2128a().f1044g) {
            C2957d.m2212a("efs.base", strGenerateString);
        }
        return strGenerateString.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String generateString() {
        return new JSONObject(this.dataMap).toString();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getLinkId() {
        if (this.dataMap.containsKey(Constants.LOG_KEY_LINK_ID)) {
            return String.valueOf(this.dataMap.get(Constants.LOG_KEY_LINK_ID));
        }
        return null;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getLinkKey() {
        if (this.dataMap.containsKey(Constants.LOG_KEY_LINK_KEY)) {
            return String.valueOf(this.dataMap.get(Constants.LOG_KEY_LINK_KEY));
        }
        return null;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public void insertGlobal(C2919b c2919b) {
        this.dataMap.putAll(c2919b.m2123a());
        this.dataMap.putAll(C2921a.m2128a().m2091a());
    }
}
