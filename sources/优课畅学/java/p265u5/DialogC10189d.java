package p265u5;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.zykj.view.R$style;
import com.zykj.view.databinding.ViewDialogCommonTipBinding;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* renamed from: u5.d */
/* loaded from: classes5.dex */
public final class DialogC10189d extends Dialog {

    /* renamed from: a */
    public ViewDialogCommonTipBinding f20324a;

    /* renamed from: b */
    public InterfaceC10559a f20325b;

    /* renamed from: c */
    public boolean f20326c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC10189d(Context context, int i10) {
        super(context, i10);
        AbstractC9133u.m16133g(context, "context");
        this.f20325b = new InterfaceC10559a() { // from class: u5.c
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return DialogC10189d.m19045d();
            }
        };
    }

    /* renamed from: d */
    public static final C8736p m19045d() {
        return C8736p.f16368a;
    }

    /* renamed from: e */
    public static final void m19046e(DialogC10189d dialogC10189d, View view) {
        dialogC10189d.dismiss();
        dialogC10189d.f20325b.invoke();
    }

    /* renamed from: f */
    public static final void m19047f(DialogC10189d dialogC10189d, View view) {
        dialogC10189d.dismiss();
    }

    /* renamed from: h */
    public static /* synthetic */ void m19048h(DialogC10189d dialogC10189d, String str, boolean z10, InterfaceC10559a interfaceC10559a, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        dialogC10189d.m19049g(str, z10, interfaceC10559a, z11);
    }

    /* renamed from: g */
    public final void m19049g(String content, boolean z10, InterfaceC10559a callback, boolean z11) {
        AbstractC9133u.m16133g(content, "content");
        AbstractC9133u.m16133g(callback, "callback");
        this.f20326c = z10;
        show();
        ViewDialogCommonTipBinding viewDialogCommonTipBinding = this.f20324a;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding2 = null;
        if (viewDialogCommonTipBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogCommonTipBinding = null;
        }
        viewDialogCommonTipBinding.f15322d.setText(content);
        setCanceledOnTouchOutside(z10);
        this.f20325b = callback;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding3 = this.f20324a;
        if (viewDialogCommonTipBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewDialogCommonTipBinding2 = viewDialogCommonTipBinding3;
        }
        TextView tvCancel = viewDialogCommonTipBinding2.f15320b;
        AbstractC9133u.m16132f(tvCancel, "tvCancel");
        tvCancel.setVisibility(z11 ? 0 : 8);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDialogCommonTipBinding viewDialogCommonTipBindingM13258a = ViewDialogCommonTipBinding.m13258a(LayoutInflater.from(getContext()));
        AbstractC9133u.m16132f(viewDialogCommonTipBindingM13258a, "inflate(...)");
        this.f20324a = viewDialogCommonTipBindingM13258a;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding = null;
        if (viewDialogCommonTipBindingM13258a == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogCommonTipBindingM13258a = null;
        }
        setContentView(viewDialogCommonTipBindingM13258a.getRoot());
        ViewDialogCommonTipBinding viewDialogCommonTipBinding2 = this.f20324a;
        if (viewDialogCommonTipBinding2 == null) {
            AbstractC9133u.m16151y("mBinding");
            viewDialogCommonTipBinding2 = null;
        }
        viewDialogCommonTipBinding2.f15321c.setOnClickListener(new View.OnClickListener() { // from class: u5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC10189d.m19046e(this.f20322a, view);
            }
        });
        ViewDialogCommonTipBinding viewDialogCommonTipBinding3 = this.f20324a;
        if (viewDialogCommonTipBinding3 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewDialogCommonTipBinding = viewDialogCommonTipBinding3;
        }
        viewDialogCommonTipBinding.f15320b.setOnClickListener(new View.OnClickListener() { // from class: u5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC10189d.m19047f(this.f20323a, view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (i10 != 4 || this.f20326c) {
            return super.onKeyDown(i10, event);
        }
        return true;
    }

    public /* synthetic */ DialogC10189d(Context context, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? R$style.AppTheme_Dialog : i10);
    }
}
