package p038c0;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.sdk.android.error.ErrorCode;
import com.aliyun.ams.emas.push.MsgService;
import com.aliyun.ams.emas.push.notification.CPushMessage;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.C7703a;
import java.util.Calendar;
import org.android.agoo.common.AgooConstants;

/* renamed from: c0.l */
/* loaded from: classes3.dex */
public class C5216l {

    /* renamed from: a */
    public final Context f3095a;

    /* renamed from: b */
    public int f3096b;

    /* renamed from: c */
    public int f3097c;

    /* renamed from: d */
    public int f3098d;

    /* renamed from: e */
    public int f3099e;

    /* renamed from: f */
    public boolean f3100f = false;

    public C5216l(Context context) {
        this.f3095a = context;
    }

    /* renamed from: a */
    public void m2779a(int i10, int i11, int i12, int i13, InterfaceC5207c interfaceC5207c) {
        ALog.m10116d("MPS:CloudPushService", "setDoNotDisturb " + i10 + ":" + i11 + "-" + i12 + ":" + i13, new Object[0]);
        if (i10 < 0 || i10 > 23 || i12 < 0 || i12 > 23 || i11 < 0 || i11 > 59 || i13 < 0 || i13 > 59) {
            if (interfaceC5207c != null) {
                ErrorCode errorCode = C7703a.INVALID_ARG;
                interfaceC5207c.onFailed(errorCode.getCode(), errorCode.getMsg());
                return;
            }
            return;
        }
        this.f3100f = true;
        this.f3096b = i10;
        this.f3097c = i11;
        this.f3098d = i12;
        this.f3099e = i13;
        if (interfaceC5207c != null) {
            interfaceC5207c.onSuccess("");
        }
    }

    /* renamed from: b */
    public void m2780b(CPushMessage cPushMessage) {
        if (cPushMessage == null || TextUtils.isEmpty(cPushMessage.m3877c())) {
            ALog.m10118e("MPS:CloudPushService", "message is null", new Object[0]);
            return;
        }
        if (this.f3095a == null) {
            ALog.m10118e("MPS:CloudPushService", "context is null", new Object[0]);
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(AbstractC5218n.f3102b);
            intent.setClassName(this.f3095a.getPackageName(), MsgService.class.getName());
            intent.putExtra(AgooConstants.ACTION_TYPE, AgooConstants.MESSAGE_TYPE_OPEN);
            intent.putExtra("msgId", cPushMessage.m3877c());
            intent.putExtra(AgooConstants.MESSAGE_EXT, cPushMessage.m3879h());
            this.f3095a.startService(intent);
        } catch (Throwable th) {
            ALog.m10117e("MPS:CloudPushService", "Click message event upload failed.", th, new Object[0]);
        }
    }

    /* renamed from: c */
    public void m2781c(boolean z10) {
        this.f3100f = z10;
    }

    /* renamed from: d */
    public boolean m2782d() {
        if (!this.f3100f) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        int i10 = (this.f3096b * 60) + this.f3097c;
        int i11 = (this.f3098d * 60) + this.f3099e;
        int i12 = (calendar.get(11) * 60) + calendar.get(12);
        return i10 <= i11 ? i12 >= i10 && i12 <= i11 : i12 >= i10 || i12 <= i11;
    }

    /* renamed from: e */
    public void m2783e(CPushMessage cPushMessage) {
        if (cPushMessage == null || TextUtils.isEmpty(cPushMessage.m3877c())) {
            ALog.m10118e("MPS:CloudPushService", "message is null", new Object[0]);
            return;
        }
        if (this.f3095a == null) {
            ALog.m10118e("MPS:CloudPushService", "context is null", new Object[0]);
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(AbstractC5218n.f3102b);
            intent.setClassName(this.f3095a.getPackageName(), MsgService.class.getName());
            intent.putExtra(AgooConstants.ACTION_TYPE, AgooConstants.MESSAGE_TYPE_DELETE);
            intent.putExtra("msgId", cPushMessage.m3877c());
            intent.putExtra(AgooConstants.MESSAGE_EXT, cPushMessage.m3879h());
            this.f3095a.startService(intent);
        } catch (Throwable th) {
            ALog.m10117e("MPS:CloudPushService", "Dismiss message event upload failed.", th, new Object[0]);
        }
    }
}
