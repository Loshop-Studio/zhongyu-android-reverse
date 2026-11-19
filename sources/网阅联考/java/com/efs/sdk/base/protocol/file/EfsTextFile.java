package com.efs.sdk.base.protocol.file;

import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p020a.p021a.C2901a;
import com.efs.sdk.base.p020a.p023c.C2919b;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.JSONSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.efs.sdk.base.protocol.file.section.TextSection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class EfsTextFile extends AbsFileLog {
    private static final String FILE_START = "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***";
    private static final String SECTION_START = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---";
    private boolean mHasInitLinkInfo;
    private String mLinkID;
    private String mLinkKey;
    private List<AbsSection> sectionList;

    public EfsTextFile(String str) {
        super(str);
        this.sectionList = new ArrayList();
        this.mLinkKey = null;
        this.mLinkID = null;
        this.mHasInitLinkInfo = false;
    }

    private String changeToStr() {
        StringBuilder sb = new StringBuilder(FILE_START);
        sb.append("\n");
        int i4 = 0;
        for (AbsSection absSection : this.sectionList) {
            if (i4 > 0) {
                sb.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
            }
            sb.append(absSection.changeToStr());
            i4++;
        }
        return sb.toString();
    }

    private void initLinkInfo() {
        if ((TextUtils.isEmpty(this.mLinkID) || TextUtils.isEmpty(this.mLinkKey)) && !this.mHasInitLinkInfo) {
            for (AbsSection absSection : this.sectionList) {
                if (absSection instanceof KVSection) {
                    Map<String, Object> dataMap = ((KVSection) absSection).getDataMap();
                    if (TextUtils.isEmpty(this.mLinkID) && dataMap.containsKey(Constants.LOG_KEY_LINK_ID)) {
                        this.mLinkID = String.valueOf(dataMap.get(Constants.LOG_KEY_LINK_ID));
                    }
                    if (TextUtils.isEmpty(this.mLinkKey) && dataMap.containsKey(Constants.LOG_KEY_LINK_KEY)) {
                        this.mLinkKey = String.valueOf(dataMap.get(Constants.LOG_KEY_LINK_KEY));
                    }
                }
            }
            this.mHasInitLinkInfo = true;
        }
    }

    private void insertCustomInfoSection() {
        KVSection kVSection = new KVSection("custom_info");
        for (Map.Entry<String, String> entry : C2921a.m2128a().m2091a().entrySet()) {
            kVSection.put(entry.getKey(), entry.getValue());
        }
        this.sectionList.add(0, kVSection);
    }

    public JSONSection createAndAddJSONSection(String str) {
        JSONSection jSONSection = new JSONSection(str);
        this.sectionList.add(jSONSection);
        return jSONSection;
    }

    public KVSection createAndAddKVSection(String str) {
        KVSection kVSection = new KVSection(str);
        this.sectionList.add(kVSection);
        return kVSection;
    }

    public TextSection createAndAddTextSection(String str) {
        TextSection textSection = new TextSection(str);
        this.sectionList.add(textSection);
        return textSection;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public byte[] generate() {
        String strChangeToStr = changeToStr();
        if (C2921a.m2128a().f1044g) {
            C2957d.m2212a("efs.base", strChangeToStr);
        }
        return strChangeToStr.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String generateString() {
        return changeToStr();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getLinkId() {
        initLinkInfo();
        return this.mLinkID;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getLinkKey() {
        initLinkInfo();
        return this.mLinkKey;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public void insertGlobal(C2919b c2919b) {
        insertCustomInfoSection();
        List<AbsSection> list = this.sectionList;
        String logType = getLogType();
        ArrayList arrayList = new ArrayList();
        KVSection kVSection = new KVSection("global_head");
        KVSection kVSectionPut = kVSection.put("type", logType).put("appid", c2919b.f1074a.get("appid")).put("wid", c2919b.f1074a.get("wid")).put("pid", c2919b.f1074a.get("pid")).put("pkg", c2919b.f1074a.get("pkg")).put("ver", c2919b.f1074a.get("ver")).put("vcode", c2919b.f1074a.get("vcode")).put("ps", c2919b.f1074a.get("ps")).put("stime", c2919b.f1074a.get("stime"));
        C2901a.m2055a();
        KVSection kVSectionPut2 = kVSectionPut.put("ctime", Long.valueOf(C2901a.m2058b() / 1000));
        C2901a.m2055a();
        kVSectionPut2.put("w_tm", Long.valueOf(C2901a.m2058b() / 1000)).put("sdk_ver", c2919b.f1074a.get("sdk_ver"));
        String strValueOf = String.valueOf(c2919b.m2125b("uid", ""));
        if (!TextUtils.isEmpty(strValueOf)) {
            kVSection.put("uid", strValueOf);
        }
        arrayList.add(kVSection);
        KVSection kVSection2 = new KVSection("device_info");
        kVSection2.put("lang", c2919b.f1074a.get("lang")).put("brand", c2919b.f1074a.get("brand")).put("model", c2919b.f1074a.get("model")).put("rom", c2919b.f1074a.get("rom")).put("sdk", c2919b.f1074a.get("sdk")).put("dsp_h", c2919b.f1074a.get("dsp_h")).put("dsp_w", c2919b.f1074a.get("dsp_w")).put("tzone", c2919b.f1074a.get("tzone")).put("net", c2919b.f1074a.get("net")).put("fr", c2919b.f1074a.get("fr"));
        arrayList.add(kVSection2);
        list.addAll(0, arrayList);
    }
}
