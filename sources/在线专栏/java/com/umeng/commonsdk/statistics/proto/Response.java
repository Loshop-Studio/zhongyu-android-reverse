package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC1885bp;
import com.umeng.analytics.pro.AbstractC1895bz;
import com.umeng.analytics.pro.AbstractC1897ca;
import com.umeng.analytics.pro.C1851ai;
import com.umeng.analytics.pro.C1856an;
import com.umeng.analytics.pro.C1865aw;
import com.umeng.analytics.pro.C1872bc;
import com.umeng.analytics.pro.C1873bd;
import com.umeng.analytics.pro.C1877bh;
import com.umeng.analytics.pro.C1879bj;
import com.umeng.analytics.pro.C1880bk;
import com.umeng.analytics.pro.C1886bq;
import com.umeng.analytics.pro.C1888bs;
import com.umeng.analytics.pro.C1890bu;
import com.umeng.analytics.pro.C1891bv;
import com.umeng.analytics.pro.C1898cb;
import com.umeng.analytics.pro.InterfaceC1859aq;
import com.umeng.analytics.pro.InterfaceC1866ax;
import com.umeng.analytics.pro.InterfaceC1893bx;
import com.umeng.analytics.pro.InterfaceC1894by;
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

/* loaded from: classes.dex */
public class Response implements InterfaceC1859aq<Response, EnumC2019e>, Serializable, Cloneable {
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<EnumC2019e, C1872bc> metaDataMap;
    private static final Map<Class<? extends InterfaceC1893bx>, InterfaceC1894by> schemes;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public C2023d imprint;
    public String msg;
    private EnumC2019e[] optionals;
    public int resp_code;
    private static final C1890bu STRUCT_DESC = new C1890bu("Response");
    private static final C1880bk RESP_CODE_FIELD_DESC = new C1880bk("resp_code", (byte) 8, 1);
    private static final C1880bk MSG_FIELD_DESC = new C1880bk("msg", (byte) 11, 2);
    private static final C1880bk IMPRINT_FIELD_DESC = new C1880bk(C1851ai.f8248X, (byte) 12, 3);

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$a */
    private static class C2015a extends AbstractC1895bz<Response> {
        private C2015a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, Response response) throws C1865aw {
            abstractC1885bp.mo6987j();
            while (true) {
                C1880bk c1880bkMo6989l = abstractC1885bp.mo6989l();
                byte b4 = c1880bkMo6989l.f8499b;
                if (b4 == 0) {
                    break;
                }
                short s3 = c1880bkMo6989l.f8500c;
                if (s3 != 1) {
                    if (s3 != 2) {
                        if (s3 != 3) {
                            C1888bs.m7033a(abstractC1885bp, b4);
                        } else if (b4 == 12) {
                            C2023d c2023d = new C2023d();
                            response.imprint = c2023d;
                            c2023d.read(abstractC1885bp);
                            response.setImprintIsSet(true);
                        } else {
                            C1888bs.m7033a(abstractC1885bp, b4);
                        }
                    } else if (b4 == 11) {
                        response.msg = abstractC1885bp.mo7003z();
                        response.setMsgIsSet(true);
                    } else {
                        C1888bs.m7033a(abstractC1885bp, b4);
                    }
                } else if (b4 == 8) {
                    response.resp_code = abstractC1885bp.mo7000w();
                    response.setResp_codeIsSet(true);
                } else {
                    C1888bs.m7033a(abstractC1885bp, b4);
                }
                abstractC1885bp.mo6990m();
            }
            abstractC1885bp.mo6988k();
            if (response.isSetResp_code()) {
                response.validate();
                return;
            }
            throw new C1886bq("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, Response response) throws C1865aw {
            response.validate();
            abstractC1885bp.mo6971a(Response.STRUCT_DESC);
            abstractC1885bp.mo6966a(Response.RESP_CODE_FIELD_DESC);
            abstractC1885bp.mo6964a(response.resp_code);
            abstractC1885bp.mo6978c();
            if (response.msg != null && response.isSetMsg()) {
                abstractC1885bp.mo6966a(Response.MSG_FIELD_DESC);
                abstractC1885bp.mo6972a(response.msg);
                abstractC1885bp.mo6978c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                abstractC1885bp.mo6966a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(abstractC1885bp);
                abstractC1885bp.mo6978c();
            }
            abstractC1885bp.mo6980d();
            abstractC1885bp.mo6977b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$b */
    private static class C2016b implements InterfaceC1894by {
        private C2016b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1894by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2015a mo6837b() {
            return new C2015a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$c */
    private static class C2017c extends AbstractC1897ca<Response> {
        private C2017c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo6833a(AbstractC1885bp abstractC1885bp, Response response) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            c1891bv.mo6964a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            c1891bv.m7037a(bitSet, 2);
            if (response.isSetMsg()) {
                c1891bv.mo6972a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(c1891bv);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC1893bx
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6835b(AbstractC1885bp abstractC1885bp, Response response) throws C1865aw {
            C1891bv c1891bv = (C1891bv) abstractC1885bp;
            response.resp_code = c1891bv.mo7000w();
            response.setResp_codeIsSet(true);
            BitSet bitSetM7038b = c1891bv.m7038b(2);
            if (bitSetM7038b.get(0)) {
                response.msg = c1891bv.mo7003z();
                response.setMsgIsSet(true);
            }
            if (bitSetM7038b.get(1)) {
                C2023d c2023d = new C2023d();
                response.imprint = c2023d;
                c2023d.read(c1891bv);
                response.setImprintIsSet(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$d */
    private static class C2018d implements InterfaceC1894by {
        private C2018d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC1894by
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2017c mo6837b() {
            return new C2017c();
        }
    }

    static {
        HashMap map = new HashMap();
        schemes = map;
        map.put(AbstractC1895bz.class, new C2016b());
        map.put(AbstractC1897ca.class, new C2018d());
        EnumMap enumMap = new EnumMap(EnumC2019e.class);
        enumMap.put((EnumMap) EnumC2019e.RESP_CODE, (EnumC2019e) new C1872bc("resp_code", (byte) 1, new C1873bd((byte) 8)));
        enumMap.put((EnumMap) EnumC2019e.MSG, (EnumC2019e) new C1872bc("msg", (byte) 2, new C1873bd((byte) 11)));
        enumMap.put((EnumMap) EnumC2019e.IMPRINT, (EnumC2019e) new C1872bc(C1851ai.f8248X, (byte) 2, new C1877bh((byte) 12, C2023d.class)));
        Map<EnumC2019e, C1872bc> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = mapUnmodifiableMap;
        C1872bc.m6953a(Response.class, mapUnmodifiableMap);
    }

    public Response() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new EnumC2019e[]{EnumC2019e.MSG, EnumC2019e.IMPRINT};
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new C1879bj(new C1898cb(objectInputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C1879bj(new C1898cb(objectOutputStream)));
        } catch (C1865aw e4) {
            throw new IOException(e4.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public C2023d getImprint() {
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
        return C1856an.m6867a(this.__isset_bitfield, 0);
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void read(AbstractC1885bp abstractC1885bp) throws C1865aw {
        schemes.get(abstractC1885bp.mo7029D()).mo6837b().mo6835b(abstractC1885bp, this);
    }

    public Response setImprint(C2023d c2023d) {
        this.imprint = c2023d;
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
        this.__isset_bitfield = C1856an.m6859a(this.__isset_bitfield, 0, z3);
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
            C2023d c2023d = this.imprint;
            if (c2023d == null) {
                sb.append("null");
            } else {
                sb.append(c2023d);
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
        this.__isset_bitfield = C1856an.m6871b(this.__isset_bitfield, 0);
    }

    public void validate() throws C1865aw {
        C2023d c2023d = this.imprint;
        if (c2023d != null) {
            c2023d.m7879l();
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public void write(AbstractC1885bp abstractC1885bp) throws C1865aw {
        schemes.get(abstractC1885bp.mo7029D()).mo6837b().mo6833a(abstractC1885bp, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$e */
    public enum EnumC2019e implements InterfaceC1866ax {
        RESP_CODE(1, "resp_code"),
        MSG(2, "msg"),
        IMPRINT(3, C1851ai.f8248X);


        /* renamed from: d */
        private static final Map<String, EnumC2019e> f9445d = new HashMap();

        /* renamed from: e */
        private final short f9447e;

        /* renamed from: f */
        private final String f9448f;

        static {
            Iterator it = EnumSet.allOf(EnumC2019e.class).iterator();
            while (it.hasNext()) {
                EnumC2019e enumC2019e = (EnumC2019e) it.next();
                f9445d.put(enumC2019e.mo6845b(), enumC2019e);
            }
        }

        EnumC2019e(short s3, String str) {
            this.f9447e = s3;
            this.f9448f = str;
        }

        /* renamed from: a */
        public static EnumC2019e m7741a(int i4) {
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
        public static EnumC2019e m7743b(int i4) {
            EnumC2019e enumC2019eM7741a = m7741a(i4);
            if (enumC2019eM7741a != null) {
                return enumC2019eM7741a;
            }
            throw new IllegalArgumentException("Field " + i4 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: b */
        public String mo6845b() {
            return this.f9448f;
        }

        /* renamed from: a */
        public static EnumC2019e m7742a(String str) {
            return f9445d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC1866ax
        /* renamed from: a */
        public short mo6844a() {
            return this.f9447e;
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public Response deepCopy() {
        return new Response(this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC1859aq
    public EnumC2019e fieldForId(int i4) {
        return EnumC2019e.m7741a(i4);
    }

    public Response(int i4) {
        this();
        this.resp_code = i4;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new EnumC2019e[]{EnumC2019e.MSG, EnumC2019e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new C2023d(response.imprint);
        }
    }
}
