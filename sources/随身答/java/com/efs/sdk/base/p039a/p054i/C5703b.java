package com.efs.sdk.base.p039a.p054i;

import com.efs.sdk.base.p039a.p040a.C5641a;
import com.efs.sdk.base.p039a.p042c.C5659b;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.protocol.record.AbsRecordLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.i.b */
/* loaded from: classes3.dex */
public final class C5703b extends AbsRecordLog {

    /* renamed from: a */
    private String f4761a;

    /* renamed from: b */
    private String f4762b;

    /* renamed from: c */
    private String f4763c;

    /* renamed from: d */
    private String f4764d;

    public C5703b(String str, String str2, String str3) {
        super("wa");
        this.f4761a = str;
        this.f4762b = str2;
        this.f4764d = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS", Locale.CHINA);
        C5641a.m4024a();
        this.f4763c = simpleDateFormat.format(new Date(C5641a.m4027b()));
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final byte[] generate() {
        String strGenerateString = generateString();
        if (C5661a.m4097a().f4648g) {
            C5697d.m4181a("efs.base", strGenerateString);
        }
        return strGenerateString.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String generateString() {
        StringBuilder sb = new StringBuilder();
        sb.append("lt=event`");
        sb.append("ev_ct=");
        sb.append(this.f4761a);
        sb.append("`");
        sb.append("ev_ac=");
        sb.append(this.f4762b);
        sb.append("`");
        sb.append("tm=");
        sb.append(this.f4763c);
        sb.append("`");
        sb.append("dn=");
        sb.append(this.f4764d);
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
    public final void insertGlobal(C5659b c5659b) {
        this.dataMap.putAll(c5659b.m4092a());
        this.dataMap.putAll(C5661a.m4097a().m4060a());
    }
}
