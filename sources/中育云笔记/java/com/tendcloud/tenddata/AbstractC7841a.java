package com.tendcloud.tenddata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.tendcloud.tenddata.a */
/* loaded from: classes5.dex */
public abstract class AbstractC7841a {
    public static final AbstractC7841a ENV;
    private static volatile List<String> FeaturesList = new ArrayList();
    public static final String MF_JSON = "UNIFIED_SDK_JSON";
    public static final AbstractC7841a UNIVERSAL;
    private static final AbstractC7841a[] service;
    private int indexNum;
    private String nameString;

    static {
        AbstractC7841a abstractC7841a = new AbstractC7841a("ENV", 2) { // from class: com.tendcloud.tenddata.a.1
            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getCert() {
                return "";
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getDataFolder() {
                return super.getDataFolder();
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public int getFileLimitType() {
                return super.getFileLimitType();
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getHost() {
                return C7842aa.f14251l;
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getIP() {
                return C7842aa.f14253n;
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getMessageFormat() {
                return AbstractC7841a.MF_JSON;
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getRootFolder() {
                return super.getRootFolder();
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getUrl() {
                return "https://me.cpatrk.net";
            }
        };
        ENV = abstractC7841a;
        AbstractC7841a abstractC7841a2 = new AbstractC7841a("SDK", 99) { // from class: com.tendcloud.tenddata.a.2
            private boolean isUrlUpdated = false;
            private String url;

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getCert() {
                return "";
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getDataFolder() {
                return super.getDataFolder();
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public int getFileLimitType() {
                return super.getFileLimitType();
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getHost() {
                return C7842aa.f14241b;
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getIP() {
                return C7842aa.f14246g;
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getMessageFormat() {
                return AbstractC7841a.MF_JSON;
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getRootFolder() {
                return super.getRootFolder();
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public String getUrl() {
                return this.isUrlUpdated ? this.url : C7842aa.f14250k;
            }

            @Override // com.tendcloud.tenddata.AbstractC7841a
            public void setUrl(String str) {
                this.isUrlUpdated = true;
                this.url = str;
            }
        };
        UNIVERSAL = abstractC7841a2;
        service = new AbstractC7841a[]{abstractC7841a, abstractC7841a2};
    }

    public AbstractC7841a(String str, int i10) {
        this.nameString = str;
        this.indexNum = i10;
        addFeatures2List(str);
    }

    private void addFeatures2List(String str) {
        try {
            if (C7912cq.m11608b(str) || FeaturesList.contains(str)) {
                return;
            }
            FeaturesList.add(str);
        } catch (Throwable unused) {
        }
    }

    public static ArrayList<AbstractC7841a> getFeaturesList() {
        ArrayList<AbstractC7841a> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < FeaturesList.size(); i10++) {
            try {
                if (valueOf(FeaturesList.get(i10)) != null) {
                    arrayList.add(valueOf(FeaturesList.get(i10)));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static List<String> getFeaturesNameList() {
        return FeaturesList;
    }

    public static AbstractC7841a valueOf(String str) {
        AbstractC7841a abstractC7841a = ENV;
        if (str.equals(abstractC7841a.name())) {
            return abstractC7841a;
        }
        AbstractC7841a abstractC7841a2 = UNIVERSAL;
        if (str.equals(abstractC7841a2.name())) {
            return abstractC7841a2;
        }
        return null;
    }

    public static AbstractC7841a[] values() {
        AbstractC7841a[] abstractC7841aArr = service;
        return (AbstractC7841a[]) Arrays.copyOf(abstractC7841aArr, abstractC7841aArr.length);
    }

    public abstract String getCert();

    public String getDataFolder() {
        return "td_database" + index() + C7988fl.f14948c;
    }

    public int getFileLimitType() {
        return 1;
    }

    public abstract String getHost();

    public abstract String getIP();

    public abstract String getMessageFormat();

    public String getRootFolder() {
        return C7842aa.f14236T;
    }

    public abstract String getUrl();

    public int index() {
        return this.indexNum;
    }

    public String name() {
        return this.nameString;
    }

    public boolean needToSendData() {
        return true;
    }

    public void setUrl(String str) {
    }

    public AbstractC7841a(String str, int i10, boolean z10) {
        this.nameString = str;
        this.indexNum = i10;
    }
}
