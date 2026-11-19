package com.zykj.mistake.utils;

import android.support.v4.media.AbstractC0037f;
import com.zykj.blackboard.core.data.SourceSave;
import com.zykj.board.EzyPageRouter$PageRouter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.mistake.utils.h */
/* loaded from: classes3.dex */
public final class C5103h {

    /* renamed from: a */
    public final String f8044a;

    /* renamed from: b */
    public String f8045b;

    /* renamed from: c */
    public Integer f8046c;

    public C5103h(String absolutePath, String str) {
        AbstractC5830k.m5330g(absolutePath, "absolutePath");
        this.f8044a = absolutePath;
    }

    /* renamed from: a */
    public final void m4466a(String str, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2) {
        if (str == null || str.length() == 0) {
            interfaceC6469a2.invoke();
        } else {
            C5609e c5609e = AbstractC5896f0.f9343a;
            AbstractC6014x.m5651v(AbstractC6014x.m5630a(AbstractC5479k.f8471a), null, null, new MicroLessonUtils$downloadFile$1(str, this, interfaceC6469a, interfaceC6469a2, null), 3);
        }
    }

    /* renamed from: b */
    public final int m4467b() {
        if (new File(this.f8044a, SourceSave.PAGE_ROUTER_FILE_NAME).exists()) {
            this.f8046c = 6;
            return 6;
        }
        this.f8046c = 5;
        return 5;
    }

    /* renamed from: c */
    public final String m4468c() throws IOException {
        int iM4467b = m4467b();
        String str = this.f8044a;
        if (iM4467b != 6) {
            this.f8045b = str;
            return str;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str, SourceSave.PAGE_ROUTER_FILE_NAME));
            EzyPageRouter$PageRouter from = EzyPageRouter$PageRouter.parseFrom(fileInputStream);
            fileInputStream.close();
            List<EzyPageRouter$PageRouter.PageInfo> pageInfoList = from.getPageInfoList();
            AbstractC5830k.m5329f(pageInfoList, "getPageInfoList(...)");
            String str2 = str + "/" + ((EzyPageRouter$PageRouter.PageInfo) AbstractC5805t.m5228h0(pageInfoList)).getName();
            this.f8045b = str2;
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            this.f8045b = null;
            return null;
        }
    }

    /* renamed from: d */
    public final String m4469d() throws IOException {
        String strM4468c = this.f8045b;
        if (strM4468c == null) {
            strM4468c = m4468c();
        }
        if (strM4468c == null) {
            return null;
        }
        Integer num = this.f8046c;
        return (num != null && num.intValue() == 6) ? strM4468c.concat("/screenshot.png") : strM4468c.concat("/thumbnail.jpg");
    }

    /* renamed from: e */
    public final boolean m4470e() throws IOException {
        String strM4469d = m4469d();
        if (strM4469d == null || !new File(strM4469d).exists()) {
            return false;
        }
        Integer num = this.f8046c;
        if ((num != null ? num.intValue() : m4467b()) == 6) {
            return true;
        }
        return new File(AbstractC0037f.m74C(this.f8044a, "/actions.bin")).exists();
    }
}
