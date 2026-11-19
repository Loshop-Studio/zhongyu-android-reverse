package p294pb;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.zykj.view.R$style;
import com.zykj.view.databinding.ViewDialogCommonTipBinding;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* renamed from: pb.d */
/* loaded from: classes6.dex */
public final class DialogC10643d extends Dialog {

    /* renamed from: c */
    public ViewDialogCommonTipBinding f25662c;

    /* renamed from: d */
    public InterfaceC9529a f25663d;

    /* renamed from: e */
    public boolean f25664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC10643d(Context context, int i10) {
        super(context, i10);
        AbstractC9979u.m20294g(context, "context");
        this.f25663d = new InterfaceC9529a() { // from class: pb.c
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return DialogC10643d.m22514d();
            }
        };
    }

    /* renamed from: d */
    public static final C10786q m22514d() {
        return C10786q.f26013a;
    }

    /* renamed from: e */
    public static final void m22515e(DialogC10643d dialogC10643d, View view) {
        dialogC10643d.dismiss();
        dialogC10643d.f25663d.invoke();
    }

    /* renamed from: f */
    public static final void m22516f(DialogC10643d dialogC10643d, View view) {
        dialogC10643d.dismiss();
    }

    /* renamed from: g */
    public final void m22517g(String content, boolean z10, InterfaceC9529a callback, boolean z11) {
        AbstractC9979u.m20294g(content, "content");
        AbstractC9979u.m20294g(callback, "callback");
        this.f25664e = z10;
        show();
        ViewDialogCommonTipBinding viewDialogCommonTipBinding = this.f25662c;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding2 = null;
        if (viewDialogCommonTipBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogCommonTipBinding = null;
        }
        viewDialogCommonTipBinding.f20533f.setText(content);
        setCanceledOnTouchOutside(z10);
        this.f25663d = callback;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding3 = this.f25662c;
        if (viewDialogCommonTipBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewDialogCommonTipBinding2 = viewDialogCommonTipBinding3;
        }
        TextView tvCancel = viewDialogCommonTipBinding2.f20531d;
        AbstractC9979u.m20293f(tvCancel, "tvCancel");
        tvCancel.setVisibility(z11 ? 0 : 8);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDialogCommonTipBinding viewDialogCommonTipBindingM17330a = ViewDialogCommonTipBinding.m17330a(LayoutInflater.from(getContext()));
        AbstractC9979u.m20293f(viewDialogCommonTipBindingM17330a, "inflate(...)");
        this.f25662c = viewDialogCommonTipBindingM17330a;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding = null;
        if (viewDialogCommonTipBindingM17330a == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogCommonTipBindingM17330a = null;
        }
        setContentView(viewDialogCommonTipBindingM17330a.getRoot());
        ViewDialogCommonTipBinding viewDialogCommonTipBinding2 = this.f25662c;
        if (viewDialogCommonTipBinding2 == null) {
            AbstractC9979u.m20312y("mBinding");
            viewDialogCommonTipBinding2 = null;
        }
        viewDialogCommonTipBinding2.f20532e.setOnClickListener(new View.OnClickListener() { // from class: pb.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC10643d.m22515e(this.f25660c, view);
            }
        });
        ViewDialogCommonTipBinding viewDialogCommonTipBinding3 = this.f25662c;
        if (viewDialogCommonTipBinding3 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewDialogCommonTipBinding = viewDialogCommonTipBinding3;
        }
        viewDialogCommonTipBinding.f20531d.setOnClickListener(new View.OnClickListener() { // from class: pb.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC10643d.m22516f(this.f25661c, view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (i10 != 4 || this.f25664e) {
            return super.onKeyDown(i10, event);
        }
        return true;
    }

    public /* synthetic */ DialogC10643d(Context context, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? R$style.AppTheme_Dialog : i10);
    }
}
