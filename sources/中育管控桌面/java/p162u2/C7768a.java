package p162u2;

import android.R;
import android.content.Context;
import android.view.animation.Animation;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.utils.AbstractC5857e;

/* renamed from: u2.a */
/* loaded from: classes3.dex */
public class C7768a {

    /* renamed from: b */
    public Animation f10284b;

    /* renamed from: c */
    public Animation f10285c;

    /* renamed from: a */
    public boolean f10283a = true;

    /* renamed from: d */
    public int f10286d = R$drawable.stf_ic_empty;

    /* renamed from: e */
    public int f10287e = R$string.stfEmptyMessage;

    /* renamed from: f */
    public int f10288f = R$drawable.stf_ic_error;

    /* renamed from: g */
    public int f10289g = R$string.stfErrorMessage;

    /* renamed from: h */
    public int f10290h = R$drawable.stf_ic_offline;

    /* renamed from: i */
    public int f10291i = R$string.stfOfflineMessage;

    /* renamed from: j */
    public int f10292j = R$drawable.stf_ic_location_off;

    /* renamed from: k */
    public int f10293k = R$string.stfLocationOffMessage;

    /* renamed from: l */
    public int f10294l = R$string.stfRetryButtonText;

    /* renamed from: m */
    public int f10295m = R$string.stfLoadingMessage;

    public C7768a(Context context) {
        this.f10284b = AbstractC5857e.m4361b(context, R.anim.fade_in);
        this.f10285c = AbstractC5857e.m4361b(context, R.anim.fade_out);
    }
}
