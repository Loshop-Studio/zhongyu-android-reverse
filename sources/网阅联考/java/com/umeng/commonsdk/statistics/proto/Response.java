package com.umeng.commonsdk.statistics.proto;

import androidx.core.app.NotificationCompat;
import com.umeng.analytics.pro.AbstractC3369bp;
import com.umeng.analytics.pro.AbstractC3379bz;
import com.umeng.analytics.pro.AbstractC3381ca;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.analytics.pro.C3340an;
import com.umeng.analytics.pro.C3349aw;
import com.umeng.analytics.pro.C3356bc;
import com.umeng.analytics.pro.C3357bd;
import com.umeng.analytics.pro.C3361bh;
import com.umeng.analytics.pro.C3363bj;
import com.umeng.analytics.pro.C3364bk;
import com.umeng.analytics.pro.C3370bq;
import com.umeng.analytics.pro.C3372bs;
import com.umeng.analytics.pro.C3374bu;
import com.umeng.analytics.pro.C3375bv;
import com.umeng.analytics.pro.C3382cb;
import com.umeng.analytics.pro.InterfaceC3343aq;
import com.umeng.analytics.pro.InterfaceC3350ax;
import com.umeng.analytics.pro.InterfaceC3377bx;
import com.umeng.analytics.pro.InterfaceC3378by;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class Response implements InterfaceC3343aq<Response, EnumC3503e>, Serializable, Cloneable {
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<EnumC3503e, C3356bc> metaDataMap;
    private static final Map<Class<? extends InterfaceC3377bx>, InterfaceC3378by> schemes;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public C3507d imprint;
    public String msg;
    private EnumC3503e[] optionals;
    public int resp_code;
    private static final C3374bu STRUCT_DESC = new C3374bu("Response");
    private static final C3364bk RESP_CODE_FIELD_DESC = new C3364bk("resp_code", (byte) 8, 1);
    private static final C3364bk MSG_FIELD_DESC = new C3364bk(NotificationCompat.CATEGORY_MESSAGE, (byte) 11, 2);
    private static final C3364bk IMPRINT_FIELD_DESC = new C3364bk(C3335ai.f1656X, (byte) 12, 3);

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$a */
    public static class C3499a extends AbstractC3379bz<Response> {
        private C3499a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, Response response) throws C3349aw {
            abstractC3369bp.mo3064j();
            while (true) {
                C3364bk c3364bkMo3066l = abstractC3369bp.mo3066l();
                byte b4 = c3364bkMo3066l.f1907b;
                if (b4 == 0) {
                    break;
                }
                short s3 = c3364bkMo3066l.f1908c;
                if (s3 != 1) {
                    if (s3 != 2) {
                        if (s3 != 3) {
                            C3372bs.m3110a(abstractC3369bp, b4);
                        } else if (b4 == 12) {
                            C3507d c3507d = new C3507d();
                            response.imprint = c3507d;
                            c3507d.read(abstractC3369bp);
                            response.setImprintIsSet(true);
                        } else {
                            C3372bs.m3110a(abstractC3369bp, b4);
                        }
                    } else if (b4 == 11) {
                        response.msg = abstractC3369bp.mo3080z();
                        response.setMsgIsSet(true);
                    } else {
                        C3372bs.m3110a(abstractC3369bp, b4);
                    }
                } else if (b4 == 8) {
                    response.resp_code = abstractC3369bp.mo3077w();
                    response.setResp_codeIsSet(true);
                } else {
                    C3372bs.m3110a(abstractC3369bp, b4);
                }
                abstractC3369bp.mo3067m();
            }
            abstractC3369bp.mo3065k();
            if (response.isSetResp_code()) {
                response.validate();
                return;
            }
            throw new C3370bq("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, Response response) throws C3349aw {
            response.validate();
            abstractC3369bp.mo3048a(Response.STRUCT_DESC);
            abstractC3369bp.mo3043a(Response.RESP_CODE_FIELD_DESC);
            abstractC3369bp.mo3041a(response.resp_code);
            abstractC3369bp.mo3055c();
            if (response.msg != null && response.isSetMsg()) {
                abstractC3369bp.mo3043a(Response.MSG_FIELD_DESC);
                abstractC3369bp.mo3049a(response.msg);
                abstractC3369bp.mo3055c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                abstractC3369bp.mo3043a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(abstractC3369bp);
                abstractC3369bp.mo3055c();
            }
            abstractC3369bp.mo3057d();
            abstractC3369bp.mo3054b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$b */
    public static class C3500b implements InterfaceC3378by {
        private C3500b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3378by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3499a mo2914b() {
            return new C3499a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$c */
    public static class C3501c extends AbstractC3381ca<Response> {
        private C3501c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2910a(AbstractC3369bp abstractC3369bp, Response response) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            c3375bv.mo3041a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            c3375bv.m3114a(bitSet, 2);
            if (response.isSetMsg()) {
                c3375bv.mo3049a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(c3375bv);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3377bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2912b(AbstractC3369bp abstractC3369bp, Response response) throws C3349aw {
            C3375bv c3375bv = (C3375bv) abstractC3369bp;
            response.resp_code = c3375bv.mo3077w();
            response.setResp_codeIsSet(true);
            BitSet bitSetM3115b = c3375bv.m3115b(2);
            if (bitSetM3115b.get(0)) {
                response.msg = c3375bv.mo3080z();
                response.setMsgIsSet(true);
            }
            if (bitSetM3115b.get(1)) {
                C3507d c3507d = new C3507d();
                response.imprint = c3507d;
                c3507d.read(c3375bv);
                response.setImprintIsSet(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$d */
    public static class C3502d implements InterfaceC3378by {
        private C3502d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3378by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3501c mo2914b() {
            return new C3501c();
        }
    }

    static {
        HashMap map = new HashMap();
        schemes = map;
        map.put(AbstractC3379bz.class, new C3500b());
        map.put(AbstractC3381ca.class, new C3502d());
        EnumMap enumMap = new EnumMap(EnumC3503e.class);
        enumMap.put((EnumMap) EnumC3503e.RESP_CODE, (EnumC3503e) new C3356bc("resp_code", (byte) 1, new C3357bd((byte) 8)));
        enumMap.put((EnumMap) EnumC3503e.MSG, (EnumC3503e) new C3356bc(NotificationCompat.CATEGORY_MESSAGE, (byte) 2, new C3357bd((byte) 11)));
        enumMap.put((EnumMap) EnumC3503e.IMPRINT, (EnumC3503e) new C3356bc(C3335ai.f1656X, (byte) 2, new C3361bh((byte) 12, C3507d.class)));
        Map<EnumC3503e, C3356bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = mapUnmodifiableMap;
        C3356bc.m3030a(Response.class, mapUnmodifiableMap);
    }

    public Response() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new EnumC3503e[]{EnumC3503e.MSG, EnumC3503e.IMPRINT};
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new C3363bj(new C3382cb(objectInputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3363bj(new C3382cb(objectOutputStream)));
        } catch (C3349aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public C3507d getImprint() {
        return this.imprint;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public boolean isSetImprint() {
        return this.imprint != null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public boolean isSetResp_code() {
        return C3340an.m2944a(this.__isset_bitfield, 0);
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void read(AbstractC3369bp abstractC3369bp) throws C3349aw {
        schemes.get(abstractC3369bp.mo3106D()).mo2914b().mo2912b(abstractC3369bp, this);
    }

    public Response setImprint(C3507d c3507d) {
        this.imprint = c3507d;
        return this;
    }

    public void setImprintIsSet(boolean z3) {
        if (z3) {
            return;
        }
        this.imprint = null;
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void setMsgIsSet(boolean z3) {
        if (z3) {
            return;
        }
        this.msg = null;
    }

    public Response setResp_code(int i4) {
        this.resp_code = i4;
        setResp_codeIsSet(true);
        return this;
    }

    public void setResp_codeIsSet(boolean z3) {
        this.__isset_bitfield = C3340an.m2936a(this.__isset_bitfield, 0, z3);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(");
        sb.append("resp_code:");
        sb.append(this.resp_code);
        if (isSetMsg()) {
            sb.append(", ");
            sb.append("msg:");
            String str = this.msg;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (isSetImprint()) {
            sb.append(", ");
            sb.append("imprint:");
            C3507d c3507d = this.imprint;
            if (c3507d == null) {
                sb.append("null");
            } else {
                sb.append(c3507d);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = C3340an.m2948b(this.__isset_bitfield, 0);
    }

    public void validate() throws C3349aw {
        C3507d c3507d = this.imprint;
        if (c3507d != null) {
            c3507d.m3956l();
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public void write(AbstractC3369bp abstractC3369bp) throws C3349aw {
        schemes.get(abstractC3369bp.mo3106D()).mo2914b().mo2910a(abstractC3369bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$e */
    public enum EnumC3503e implements InterfaceC3350ax {
        RESP_CODE(1, "resp_code"),
        MSG(2, NotificationCompat.CATEGORY_MESSAGE),
        IMPRINT(3, C3335ai.f1656X);


        /* renamed from: d */
        private static final Map<String, EnumC3503e> f2853d = new HashMap();

        /* renamed from: e */
        private final short f2855e;

        /* renamed from: f */
        private final String f2856f;

        static {
            Iterator it = EnumSet.allOf(EnumC3503e.class).iterator();
            while (it.hasNext()) {
                EnumC3503e enumC3503e = (EnumC3503e) it.next();
                f2853d.put(enumC3503e.mo2922b(), enumC3503e);
            }
        }

        EnumC3503e(short s3, String str) {
            this.f2855e = s3;
            this.f2856f = str;
        }

        /* renamed from: a */
        public static EnumC3503e m3818a(int i4) {
            if (i4 == 1) {
                return RESP_CODE;
            }
            if (i4 == 2) {
                return MSG;
            }
            if (i4 != 3) {
                return null;
            }
            return IMPRINT;
        }

        /* renamed from: b */
        public static EnumC3503e m3820b(int i4) {
            EnumC3503e enumC3503eM3818a = m3818a(i4);
            if (enumC3503eM3818a != null) {
                return enumC3503eM3818a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: b */
        public String mo2922b() {
            return this.f2856f;
        }

        /* renamed from: a */
        public static EnumC3503e m3819a(String str) {
            return f2853d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3350ax
        /* renamed from: a */
        public short mo2921a() {
            return this.f2855e;
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public Response deepCopy() {
        return new Response(this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC3343aq
    public EnumC3503e fieldForId(int i4) {
        return EnumC3503e.m3818a(i4);
    }

    public Response(int i4) {
        this();
        this.resp_code = i4;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new EnumC3503e[]{EnumC3503e.MSG, EnumC3503e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new C3507d(response.imprint);
        }
    }
}
