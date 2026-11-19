package p251t2;

import android.R;
import android.content.Context;
import android.view.animation.Animation;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.utils.AbstractC6875e;

/* renamed from: t2.a */
/* loaded from: classes4.dex */
public class C10089a {

    /* renamed from: b */
    public Animation f20148b;

    /* renamed from: c */
    public Animation f20149c;

    /* renamed from: a */
    public boolean f20147a = true;

    /* renamed from: d */
    public int f20150d = R$drawable.stf_ic_empty;

    /* renamed from: e */
    public int f20151e = R$string.stfEmptyMessage;

    /* renamed from: f */
    public int f20152f = R$drawable.stf_ic_error;

    /* renamed from: g */
    public int f20153g = R$string.stfErrorMessage;

    /* renamed from: h */
    public int f20154h = R$drawable.stf_ic_offline;

    /* renamed from: i */
    public int f20155i = R$string.stfOfflineMessage;

    /* renamed from: j */
    public int f20156j = R$drawable.stf_ic_location_off;

    /* renamed from: k */
    public int f20157k = R$string.stfLocationOffMessage;

    /* renamed from: l */
    public int f20158l = R$string.stfRetryButtonText;

    /* renamed from: m */
    public int f20159m = R$string.stfLoadingMessage;

    public C10089a(Context context) {
        this.f20148b = AbstractC6875e.m6446b(context, R.anim.fade_in);
        this.f20149c = AbstractC6875e.m6446b(context, R.anim.fade_out);
    }
}
