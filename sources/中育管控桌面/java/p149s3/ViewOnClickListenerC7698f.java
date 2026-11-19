package p149s3;

import android.view.View;
import com.blankj.utilcode.util.AbstractC4668s;
import p078i4.C6539i;

/* renamed from: s3.f */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC7698f implements View.OnClickListener {

    /* renamed from: a */
    public final View.OnClickListener f10160a;

    public ViewOnClickListenerC7698f(View.OnClickListener onClickListener) {
        this.f10160a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (C6539i.f8374a.m7328a()) {
            AbstractC4668s.m2377i("fast click--->");
            return;
        }
        View.OnClickListener onClickListener = this.f10160a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
