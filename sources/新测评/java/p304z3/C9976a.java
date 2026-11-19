package p304z3;

import android.R;
import android.content.Context;
import android.view.animation.Animation;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.utils.AbstractC6480e;

/* renamed from: z3.a */
/* loaded from: classes4.dex */
public class C9976a {

    /* renamed from: b */
    public Animation f17834b;

    /* renamed from: c */
    public Animation f17835c;

    /* renamed from: a */
    public boolean f17833a = true;

    /* renamed from: d */
    public int f17836d = R$drawable.stf_ic_empty;

    /* renamed from: e */
    public int f17837e = R$string.stfEmptyMessage;

    /* renamed from: f */
    public int f17838f = R$drawable.stf_ic_error;

    /* renamed from: g */
    public int f17839g = R$string.stfErrorMessage;

    /* renamed from: h */
    public int f17840h = R$drawable.stf_ic_offline;

    /* renamed from: i */
    public int f17841i = R$string.stfOfflineMessage;

    /* renamed from: j */
    public int f17842j = R$drawable.stf_ic_location_off;

    /* renamed from: k */
    public int f17843k = R$string.stfLocationOffMessage;

    /* renamed from: l */
    public int f17844l = R$string.stfRetryButtonText;

    /* renamed from: m */
    public int f17845m = R$string.stfLoadingMessage;

    public C9976a(Context context) {
        this.f17834b = AbstractC6480e.m5356b(context, R.anim.fade_in);
        this.f17835c = AbstractC6480e.m5356b(context, R.anim.fade_out);
    }
}
