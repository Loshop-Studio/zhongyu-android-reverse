package com.efs.sdk.base.p035a.p050i;

import com.efs.sdk.base.p035a.p036a.C1273a;
import com.efs.sdk.base.p035a.p038c.C1291b;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.protocol.record.AbsRecordLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.efs.sdk.base.a.i.b */
/* loaded from: classes.dex */
public final class C1335b extends AbsRecordLog {

    /* renamed from: a */
    private String f7127a;

    /* renamed from: b */
    private String f7128b;

    /* renamed from: c */
    private String f7129c;

    /* renamed from: d */
    private String f7130d;

    public C1335b(String str, String str2, String str3) {
        super("wa");
        this.f7127a = str;
        this.f7128b = str2;
        this.f7130d = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS", Locale.CHINA);
        C1273a.m5414a();
        this.f7129c = simpleDateFormat.format(new Date(C1273a.m5417b()));
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final byte[] generate() {
        String strGenerateString = generateString();
        if (C1293a.m5487a().f7014g) {
            C1329d.m5571a("efs.base", strGenerateString);
        }
        return strGenerateString.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String generateString() {
        StringBuilder sb = new StringBuilder();
        sb.append("lt=event`");
        sb.append("ev_ct=");
        sb.append(this.f7127a);
        sb.append("`");
        sb.append("ev_ac=");
        sb.append(this.f7128b);
        sb.append("`");
        sb.append("tm=");
        sb.append(this.f7129c);
        sb.append("`");
        sb.append("dn=");
        sb.append(this.f7130d);
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
    public final void insertGlobal(C1291b c1291b) {
        this.dataMap.putAll(c1291b.m5482a());
        this.dataMap.putAll(C1293a.m5487a().m5450a());
    }
}
