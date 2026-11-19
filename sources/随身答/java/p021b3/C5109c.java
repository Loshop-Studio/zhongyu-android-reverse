package p021b3;

import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.p071uc.crashsdk.export.CustomLogInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b3.c */
/* loaded from: classes4.dex */
public class C5109c {

    /* renamed from: c */
    public String f2220c;

    /* renamed from: a */
    public Map f2218a = new HashMap(20);

    /* renamed from: b */
    public List f2219b = new ArrayList(5);

    /* renamed from: d */
    public CustomLogInfo f2221d = new CustomLogInfo(new StringBuffer(), "exception");

    public C5109c(String str) {
        this.f2218a.put("k_ct", "exception");
        this.f2218a.put("k_ac", str);
    }

    /* renamed from: a */
    public CustomLogInfo m2166a() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry entry : this.f2218a.entrySet()) {
            stringBuffer.append((String) entry.getKey());
            stringBuffer.append(":");
            stringBuffer.append((String) entry.getValue());
            stringBuffer.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
        }
        if (!TextUtils.isEmpty(this.f2220c)) {
            stringBuffer.append(this.f2220c);
            stringBuffer.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
        }
        for (String str : this.f2219b) {
            stringBuffer.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---");
            stringBuffer.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            stringBuffer.append(str);
            stringBuffer.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
        }
        CustomLogInfo customLogInfo = this.f2221d;
        customLogInfo.mData = stringBuffer;
        return customLogInfo;
    }

    /* renamed from: b */
    public C5109c m2167b(String str) {
        this.f2220c = "Exception message:\nBack traces starts.\n" + str + "Back traces ends.";
        return this;
    }

    /* renamed from: c */
    public C5109c m2168c(Throwable th) {
        return m2167b(Log.getStackTraceString(th));
    }
}
