package p086e5;

import com.zykj.blackboard.core.data.SourceSave;
import com.zykj.board.EzyPageRouter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* renamed from: e5.k */
/* loaded from: classes5.dex */
public final class C8362k {

    /* renamed from: a */
    public final String f15887a;

    /* renamed from: b */
    public final String f15888b;

    /* renamed from: c */
    public String f15889c;

    /* renamed from: d */
    public Integer f15890d;

    public C8362k(String absolutePath, String str) {
        AbstractC9133u.m16133g(absolutePath, "absolutePath");
        this.f15887a = absolutePath;
        this.f15888b = str;
    }

    /* renamed from: a */
    public final int m13639a() {
        if (new File(this.f15887a, SourceSave.PAGE_ROUTER_FILE_NAME).exists()) {
            this.f15890d = 6;
            return 6;
        }
        this.f15890d = 5;
        return 5;
    }

    /* renamed from: b */
    public final String m13640b() throws IOException {
        if (m13639a() != 6) {
            String str = this.f15887a;
            this.f15889c = str;
            return str;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f15887a, SourceSave.PAGE_ROUTER_FILE_NAME));
            EzyPageRouter.PageRouter pageRouterM8278k = EzyPageRouter.PageRouter.m8278k(fileInputStream);
            fileInputStream.close();
            String str2 = this.f15887a;
            List listM8281g = pageRouterM8278k.m8281g();
            AbstractC9133u.m16132f(listM8281g, "getPageInfoList(...)");
            String str3 = str2 + "/" + ((EzyPageRouter.PageRouter.PageInfo) AbstractC8778f0.m14566l0(listM8281g)).getName();
            this.f15889c = str3;
            return str3;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f15889c = null;
            return null;
        }
    }

    /* renamed from: c */
    public final String m13641c() throws IOException {
        String strM13640b = this.f15889c;
        if (strM13640b == null) {
            strM13640b = m13640b();
        }
        if (strM13640b == null) {
            return null;
        }
        Integer num = this.f15890d;
        if (num != null && num.intValue() == 6) {
            return strM13640b + "/screenshot.png";
        }
        return strM13640b + "/thumbnail.jpg";
    }
}
