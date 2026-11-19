package com.efs.sdk.base.protocol.file;

import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.p035a.p036a.C1273a;
import com.efs.sdk.base.p035a.p038c.C1291b;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.JSONSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.efs.sdk.base.protocol.file.section.TextSection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
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
        for (Map.Entry<String, String> entry : C1293a.m5487a().m5450a().entrySet()) {
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
        if (C1293a.m5487a().f7014g) {
            C1329d.m5571a("efs.base", strChangeToStr);
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
    public void insertGlobal(C1291b c1291b) {
        insertCustomInfoSection();
        List<AbsSection> list = this.sectionList;
        String logType = getLogType();
        ArrayList arrayList = new ArrayList();
        KVSection kVSection = new KVSection("global_head");
        KVSection kVSectionPut = kVSection.put("type", logType).put("appid", c1291b.f7044a.get("appid")).put("wid", c1291b.f7044a.get("wid")).put("pid", c1291b.f7044a.get("pid")).put("pkg", c1291b.f7044a.get("pkg")).put("ver", c1291b.f7044a.get("ver")).put("vcode", c1291b.f7044a.get("vcode")).put("ps", c1291b.f7044a.get("ps")).put("stime", c1291b.f7044a.get("stime"));
        C1273a.m5414a();
        KVSection kVSectionPut2 = kVSectionPut.put("ctime", Long.valueOf(C1273a.m5417b() / 1000));
        C1273a.m5414a();
        kVSectionPut2.put("w_tm", Long.valueOf(C1273a.m5417b() / 1000)).put("sdk_ver", c1291b.f7044a.get("sdk_ver"));
        String strValueOf = String.valueOf(c1291b.m5484b("uid", ""));
        if (!TextUtils.isEmpty(strValueOf)) {
            kVSection.put("uid", strValueOf);
        }
        arrayList.add(kVSection);
        KVSection kVSection2 = new KVSection("device_info");
        kVSection2.put("lang", c1291b.f7044a.get("lang")).put(com.taobao.accs.common.Constants.KEY_BRAND, c1291b.f7044a.get(com.taobao.accs.common.Constants.KEY_BRAND)).put(com.taobao.accs.common.Constants.KEY_MODEL, c1291b.f7044a.get(com.taobao.accs.common.Constants.KEY_MODEL)).put("rom", c1291b.f7044a.get("rom")).put("sdk", c1291b.f7044a.get("sdk")).put("dsp_h", c1291b.f7044a.get("dsp_h")).put("dsp_w", c1291b.f7044a.get("dsp_w")).put("tzone", c1291b.f7044a.get("tzone")).put("net", c1291b.f7044a.get("net")).put("fr", c1291b.f7044a.get("fr"));
        arrayList.add(kVSection2);
        list.addAll(0, arrayList);
    }
}
