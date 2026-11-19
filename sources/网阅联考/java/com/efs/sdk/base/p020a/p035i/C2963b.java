package com.efs.sdk.base.p020a.p035i;

import com.efs.sdk.base.p020a.p021a.C2901a;
import com.efs.sdk.base.p020a.p023c.C2919b;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.protocol.record.AbsRecordLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.i.b */
/* loaded from: classes2.dex */
public final class C2963b extends AbsRecordLog {

    /* renamed from: a */
    private String f1157a;

    /* renamed from: b */
    private String f1158b;

    /* renamed from: c */
    private String f1159c;

    /* renamed from: d */
    private String f1160d;

    public C2963b(String str, String str2, String str3) {
        super("wa");
        this.f1157a = str;
        this.f1158b = str2;
        this.f1160d = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS", Locale.CHINA);
        C2901a.m2055a();
        this.f1159c = simpleDateFormat.format(new Date(C2901a.m2058b()));
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final byte[] generate() {
        String strGenerateString = generateString();
        if (C2921a.m2128a().f1044g) {
            C2957d.m2212a("efs.base", strGenerateString);
        }
        return strGenerateString.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String generateString() {
        StringBuilder sb = new StringBuilder();
        sb.append("lt=event`");
        sb.append("ev_ct=");
        sb.append(this.f1157a);
        sb.append("`");
        sb.append("ev_ac=");
        sb.append(this.f1158b);
        sb.append("`");
        sb.append("tm=");
        sb.append(this.f1159c);
        sb.append("`");
        sb.append("dn=");
        sb.append(this.f1160d);
        sb.append("`");
        for (Map.Entry<String, Object> entry : this.dataMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("`");
        }
        return sb.subSequence(0, sb.length() - 1).toString();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkId() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkKey() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void insertGlobal(C2919b c2919b) {
        this.dataMap.putAll(c2919b.m2123a());
        this.dataMap.putAll(C2921a.m2128a().m2091a());
    }
}
