package com.tendcloud.tenddata;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public class TalkingDataProfile extends JSONObject {

    /* renamed from: a */
    private static final String f14192a = "name";

    /* renamed from: b */
    private static final String f14193b = "type";

    /* renamed from: c */
    private static final String f14194c = "gender";

    /* renamed from: d */
    private static final String f14195d = "age";

    /* renamed from: e */
    private static final String f14196e = "property1";

    /* renamed from: f */
    private static final String f14197f = "property2";

    /* renamed from: g */
    private static final String f14198g = "property3";

    /* renamed from: h */
    private static final String f14199h = "property4";

    /* renamed from: i */
    private static final String f14200i = "property5";

    /* renamed from: j */
    private static final String f14201j = "property6";

    /* renamed from: k */
    private static final String f14202k = "property7";

    /* renamed from: l */
    private static final String f14203l = "property8";

    /* renamed from: m */
    private static final String f14204m = "property9";

    /* renamed from: n */
    private static final String f14205n = "property10";

    private TalkingDataProfile() {
    }

    public static TalkingDataProfile createProfile() {
        return new TalkingDataProfile();
    }

    public TalkingDataProfile setAge(int i10) {
        try {
            put(f14195d, i10);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set age error ", th);
            return this;
        }
    }

    public TalkingDataProfile setGender(TalkingDataGender talkingDataGender) {
        try {
            put("gender", talkingDataGender.index());
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set gender error ", th);
            return this;
        }
    }

    public TalkingDataProfile setName(String str) {
        try {
            put("name", str);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set name error ", th);
            return this;
        }
    }

    public TalkingDataProfile setProperty1(Object obj) {
        try {
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                return this;
            }
            put(f14196e, obj);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set property1 error ", th);
            return this;
        }
    }

    public TalkingDataProfile setProperty10(Object obj) {
        try {
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                return this;
            }
            put(f14205n, obj);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set property10 error ", th);
            return this;
        }
    }

    public TalkingDataProfile setProperty2(Object obj) {
        try {
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                return this;
            }
            put(f14197f, obj);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set property2 error ", th);
            return this;
        }
    }

    public TalkingDataProfile setProperty3(Object obj) {
        try {
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                return this;
            }
            put(f14198g, obj);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set property3 error ", th);
            return this;
        }
    }

    public TalkingDataProfile setProperty4(Object obj) {
        try {
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                return this;
            }
            put(f14199h, obj);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set property4 error ", th);
            return this;
        }
    }

    public TalkingDataProfile setProperty5(Object obj) {
        try {
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                return this;
            }
            put(f14200i, obj);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set property5 error ", th);
            return this;
        }
    }

    public TalkingDataProfile setProperty6(Object obj) {
        try {
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                return this;
            }
            put(f14201j, obj);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set property6 error ", th);
            return this;
        }
    }

    public TalkingDataProfile setProperty7(Object obj) {
        try {
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                return this;
            }
            put(f14202k, obj);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set property7 error ", th);
            return this;
        }
    }

    public TalkingDataProfile setProperty8(Object obj) {
        try {
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                return this;
            }
            put(f14203l, obj);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set property8 error ", th);
            return this;
        }
    }

    public TalkingDataProfile setProperty9(Object obj) {
        try {
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                return this;
            }
            put(f14204m, obj);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set property9 error ", th);
            return this;
        }
    }

    public TalkingDataProfile setType(TalkingDataProfileType talkingDataProfileType) {
        try {
            put("type", talkingDataProfileType.index());
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set type error ", th);
            return this;
        }
    }
}
