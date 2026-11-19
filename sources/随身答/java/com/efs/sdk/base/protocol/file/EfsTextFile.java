package com.efs.sdk.base.protocol.file;

import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p039a.p040a.C5641a;
import com.efs.sdk.base.p039a.p042c.C5659b;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.JSONSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.efs.sdk.base.protocol.file.section.TextSection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
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
        sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
        int i9 = 0;
        for (AbsSection absSection : this.sectionList) {
            if (i9 > 0) {
                sb.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
            }
            sb.append(absSection.changeToStr());
            i9++;
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
        for (Map.Entry<String, String> entry : C5661a.m4097a().m4060a().entrySet()) {
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
        if (C5661a.m4097a().f4648g) {
            C5697d.m4181a("efs.base", strChangeToStr);
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
    public void insertGlobal(C5659b c5659b) {
        insertCustomInfoSection();
        List<AbsSection> list = this.sectionList;
        String logType = getLogType();
        ArrayList arrayList = new ArrayList();
        KVSection kVSection = new KVSection("global_head");
        KVSection kVSectionPut = kVSection.put("type", logType).put("appid", c5659b.f4678a.get("appid")).put("wid", c5659b.f4678a.get("wid")).put("pid", c5659b.f4678a.get("pid")).put("pkg", c5659b.f4678a.get("pkg")).put("ver", c5659b.f4678a.get("ver")).put("vcode", c5659b.f4678a.get("vcode")).put("ps", c5659b.f4678a.get("ps")).put("stime", c5659b.f4678a.get("stime"));
        C5641a.m4024a();
        KVSection kVSectionPut2 = kVSectionPut.put("ctime", Long.valueOf(C5641a.m4027b() / 1000));
        C5641a.m4024a();
        kVSectionPut2.put("w_tm", Long.valueOf(C5641a.m4027b() / 1000)).put("sdk_ver", c5659b.f4678a.get("sdk_ver"));
        String strValueOf = String.valueOf(c5659b.m4094b("uid", ""));
        if (!TextUtils.isEmpty(strValueOf)) {
            kVSection.put("uid", strValueOf);
        }
        arrayList.add(kVSection);
        KVSection kVSection2 = new KVSection("device_info");
        kVSection2.put("lang", c5659b.f4678a.get("lang")).put("brand", c5659b.f4678a.get("brand")).put("model", c5659b.f4678a.get("model")).put("rom", c5659b.f4678a.get("rom")).put("sdk", c5659b.f4678a.get("sdk")).put("dsp_h", c5659b.f4678a.get("dsp_h")).put("dsp_w", c5659b.f4678a.get("dsp_w")).put("tzone", c5659b.f4678a.get("tzone")).put("net", c5659b.f4678a.get("net")).put("fr", c5659b.f4678a.get("fr"));
        arrayList.add(kVSection2);
        list.addAll(0, arrayList);
    }
}
