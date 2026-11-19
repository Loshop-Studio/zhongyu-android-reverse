package com.friday.common.helper;

import com.blankj.utilcode.util.EncryptUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.friday.common.entity.OssFileResource;
import com.friday.common.entity.OssFileType;
import com.friday.common.entity.OssReqData;
import com.friday.common.entity.OssTokenReq;
import com.friday.common.entity.OssTokenResponse;
import java.io.File;
import java.util.UUID;
import je.AbstractC9744x;
import je.C9740t;
import je.C9741u;
import je.C9743w;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import sd.AbstractC11109f;
import sd.C11157r0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class OssUploadHelper {

    /* renamed from: b */
    public static final C5960a f6053b = new C5960a(null);

    /* renamed from: a */
    public final OssTokenResponse f6054a;

    /* renamed from: com.friday.common.helper.OssUploadHelper$a */
    public static final class C5960a {
        public /* synthetic */ C5960a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ OssReqData m5254b(C5960a c5960a, OssFileType ossFileType, String str, OssFileResource ossFileResource, String str2, String str3, long j10, int i10, Object obj) {
            String strM23238K;
            long jCurrentTimeMillis;
            C5960a c5960a2;
            OssFileType ossFileType2;
            OssFileResource ossFileResource2;
            if ((i10 & 2) != 0) {
                str = "";
            }
            String str4 = str;
            String str5 = (i10 & 8) != 0 ? "0" : str2;
            if ((i10 & 16) != 0) {
                String string = UUID.randomUUID().toString();
                AbstractC9979u.m20293f(string, "toString(...)");
                strM23238K = AbstractC10819z.m23238K(string, "-", "", false, 4, null);
            } else {
                strM23238K = str3;
            }
            if ((i10 & 32) != 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
                ossFileResource2 = ossFileResource;
                c5960a2 = c5960a;
                ossFileType2 = ossFileType;
            } else {
                jCurrentTimeMillis = j10;
                c5960a2 = c5960a;
                ossFileType2 = ossFileType;
                ossFileResource2 = ossFileResource;
            }
            return c5960a2.m5255a(ossFileType2, str4, ossFileResource2, str5, strM23238K, jCurrentTimeMillis);
        }

        /* renamed from: a */
        public final OssReqData m5255a(OssFileType fileType, String fileExt, OssFileResource fileResource, String date, String uuid, long j10) {
            String str;
            AbstractC9979u.m20294g(fileType, "fileType");
            AbstractC9979u.m20294g(fileExt, "fileExt");
            AbstractC9979u.m20294g(fileResource, "fileResource");
            AbstractC9979u.m20294g(date, "date");
            AbstractC9979u.m20294g(uuid, "uuid");
            long jM5292t = C5962b.f6082a.m5299a().m5292t();
            String strEncryptMD5ToString = EncryptUtils.encryptMD5ToString(jM5292t + MqttTopic.SINGLE_LEVEL_WILDCARD + "note_v2" + MqttTopic.SINGLE_LEVEL_WILDCARD + fileResource.getName() + MqttTopic.SINGLE_LEVEL_WILDCARD + fileType.getValue() + MqttTopic.SINGLE_LEVEL_WILDCARD + fileExt + MqttTopic.SINGLE_LEVEL_WILDCARD + date + MqttTopic.SINGLE_LEVEL_WILDCARD + uuid + MqttTopic.SINGLE_LEVEL_WILDCARD + j10);
            int value = fileType.getValue();
            int value2 = fileResource.getValue();
            AbstractC9979u.m20291d(strEncryptMD5ToString);
            OssTokenReq ossTokenReq = new OssTokenReq(0, value, fileExt, value2, date, uuid, j10, strEncryptMD5ToString, 1, null);
            String name = fileResource.getName();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("note_v2");
            sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            sb2.append(name);
            sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            sb2.append(jM5292t);
            String string = sb2.toString();
            String strMillis2String = AbstractC9979u.m20289b(date, "0") ? TimeUtils.millis2String(j10, TimeUtils.getSafeDateFormat("yyyyMMdd")) : date;
            if (AbstractC9979u.m20289b(fileResource, OssFileResource.Log.INSTANCE)) {
                str = "";
            } else if (AbstractC9979u.m20289b(fileType, OssFileType.File.INSTANCE)) {
                str = uuid + fileExt;
            } else {
                str = uuid;
            }
            return new OssReqData(ossTokenReq, AbstractC10793c0.m23150z0(string + MqttTopic.TOPIC_LEVEL_SEPARATOR + strMillis2String + MqttTopic.TOPIC_LEVEL_SEPARATOR + str, MqttTopic.TOPIC_LEVEL_SEPARATOR));
        }

        public C5960a() {
        }
    }

    public OssUploadHelper(OssTokenResponse ossToken) {
        AbstractC9979u.m20294g(ossToken, "ossToken");
        this.f6054a = ossToken;
    }

    /* renamed from: b */
    public final String m5249b() {
        return this.f6054a.getEndpoint();
    }

    /* renamed from: c */
    public final Object m5250c(String str, String str2, InterfaceC11588c interfaceC11588c) {
        File file = new File(str);
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new OssUploadHelper$gridFsUpload$2(new C9743w.a().m19608p(this.f6054a.getEndpoint() + MqttTopic.TOPIC_LEVEL_SEPARATOR + str2).m19594a("Authorization", "bearer " + this.f6054a.getSecurityToken()).m19594a("Checksum", "3f4e17759c6b9c6a364211895bbb2abdc0ba62db").m19603k(new C9741u.a(null, 1, null).m19496e(C9741u.f22782k).m19492a("file", file.getName(), AbstractC9744x.Companion.m19613a(file, C9740t.f22770e.m19489b("multipart/form-data"))).m19495d()).m19595b(), null), interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5251d(java.lang.String r13, java.lang.String r14, vc.InterfaceC11588c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.helper.OssUploadHelper.m5251d(java.lang.String, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/helper/OssUploadHelper.smali:374
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5252e(java.lang.String r7, java.lang.String r8, vc.InterfaceC11588c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.helper.OssUploadHelper.m5252e(java.lang.String, java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/helper/OssUploadHelper.smali:1055
    }

    /* renamed from: f */
    public final Object m5253f(String str, String str2, InterfaceC11588c interfaceC11588c) {
        File file = new File(str);
        return AbstractC11109f.m24709g(C11157r0.m24799b(), new OssUploadHelper$zyFsUpload$2(new C9743w.a().m19608p(this.f6054a.getEndpoint() + MqttTopic.TOPIC_LEVEL_SEPARATOR + str2).m19594a("Authorization", "bearer " + this.f6054a.getSecurityToken()).m19594a("Checksum", "3f4e17759c6b9c6a364211895bbb2abdc0ba62db").m19603k(new C9741u.a(null, 1, null).m19496e(C9741u.f22782k).m19492a("file", file.getName(), AbstractC9744x.Companion.m19613a(file, C9740t.f22770e.m19489b("multipart/form-data"))).m19495d()).m19595b(), null), interfaceC11588c);
    }
}
