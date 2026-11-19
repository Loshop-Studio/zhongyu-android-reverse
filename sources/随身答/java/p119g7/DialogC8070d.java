package p119g7;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.zykj.view.R$style;
import com.zykj.view.databinding.ViewDialogCommonTipBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g7.d */
/* loaded from: classes5.dex */
public final class DialogC8070d extends Dialog {

    /* renamed from: a */
    public ViewDialogCommonTipBinding f13766a;

    /* renamed from: b */
    public Function0 f13767b;

    /* renamed from: c */
    public boolean f13768c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC8070d(Context context, int i9) {
        super(context, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13767b = new Function0() { // from class: g7.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC8070d.m12874d();
            }
        };
    }

    /* renamed from: d */
    public static final Unit m12874d() {
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final void m12875e(DialogC8070d dialogC8070d, View view) {
        dialogC8070d.dismiss();
        dialogC8070d.f13767b.invoke();
    }

    /* renamed from: f */
    public static final void m12876f(DialogC8070d dialogC8070d, View view) {
        dialogC8070d.dismiss();
    }

    /* renamed from: h */
    public static /* synthetic */ void m12877h(DialogC8070d dialogC8070d, String str, boolean z9, Function0 function0, boolean z10, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            z10 = false;
        }
        dialogC8070d.m12878g(str, z9, function0, z10);
    }

    /* renamed from: g */
    public final void m12878g(String content, boolean z9, Function0 callback, boolean z10) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f13768c = z9;
        show();
        ViewDialogCommonTipBinding viewDialogCommonTipBinding = this.f13766a;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding2 = null;
        if (viewDialogCommonTipBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogCommonTipBinding = null;
        }
        viewDialogCommonTipBinding.f12568d.setText(content);
        setCanceledOnTouchOutside(z9);
        this.f13767b = callback;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding3 = this.f13766a;
        if (viewDialogCommonTipBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogCommonTipBinding2 = viewDialogCommonTipBinding3;
        }
        TextView tvCancel = viewDialogCommonTipBinding2.f12566b;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        tvCancel.setVisibility(z10 ? 0 : 8);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDialogCommonTipBinding viewDialogCommonTipBindingM11876a = ViewDialogCommonTipBinding.m11876a(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(viewDialogCommonTipBindingM11876a, "inflate(...)");
        this.f13766a = viewDialogCommonTipBindingM11876a;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding = null;
        if (viewDialogCommonTipBindingM11876a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogCommonTipBindingM11876a = null;
        }
        setContentView(viewDialogCommonTipBindingM11876a.getRoot());
        ViewDialogCommonTipBinding viewDialogCommonTipBinding2 = this.f13766a;
        if (viewDialogCommonTipBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogCommonTipBinding2 = null;
        }
        viewDialogCommonTipBinding2.f12567c.setOnClickListener(new View.OnClickListener() { // from class: g7.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8070d.m12875e(this.f13764a, view);
            }
        });
        ViewDialogCommonTipBinding viewDialogCommonTipBinding3 = this.f13766a;
        if (viewDialogCommonTipBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogCommonTipBinding = viewDialogCommonTipBinding3;
        }
        viewDialogCommonTipBinding.f12566b.setOnClickListener(new View.OnClickListener() { // from class: g7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8070d.m12876f(this.f13765a, view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i9 != 4 || this.f13768c) {
            return super.onKeyDown(i9, event);
        }
        return true;
    }

    public /* synthetic */ DialogC8070d(Context context, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? R$style.AppTheme_Dialog : i9);
    }
}
