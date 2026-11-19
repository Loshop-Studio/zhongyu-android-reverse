package p268v7;

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

/* renamed from: v7.d */
/* loaded from: classes5.dex */
public final class DialogC9713d extends Dialog {

    /* renamed from: a */
    public ViewDialogCommonTipBinding f17043a;

    /* renamed from: b */
    public Function0 f17044b;

    /* renamed from: c */
    public boolean f17045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC9713d(Context context, int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17044b = new Function0() { // from class: v7.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC9713d.m16230d();
            }
        };
    }

    /* renamed from: d */
    public static final Unit m16230d() {
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final void m16231e(DialogC9713d dialogC9713d, View view) {
        dialogC9713d.dismiss();
        dialogC9713d.f17044b.invoke();
    }

    /* renamed from: f */
    public static final void m16232f(DialogC9713d dialogC9713d, View view) {
        dialogC9713d.dismiss();
    }

    /* renamed from: g */
    public final void m16233g(String content, boolean z9, Function0 callback, boolean z10) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f17045c = z9;
        show();
        ViewDialogCommonTipBinding viewDialogCommonTipBinding = this.f17043a;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding2 = null;
        if (viewDialogCommonTipBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogCommonTipBinding = null;
        }
        viewDialogCommonTipBinding.f11324d.setText(content);
        setCanceledOnTouchOutside(z9);
        this.f17044b = callback;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding3 = this.f17043a;
        if (viewDialogCommonTipBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogCommonTipBinding2 = viewDialogCommonTipBinding3;
        }
        TextView tvCancel = viewDialogCommonTipBinding2.f11322b;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        tvCancel.setVisibility(z10 ? 0 : 8);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDialogCommonTipBinding viewDialogCommonTipBindingM11386a = ViewDialogCommonTipBinding.m11386a(LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(viewDialogCommonTipBindingM11386a, "inflate(...)");
        this.f17043a = viewDialogCommonTipBindingM11386a;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding = null;
        if (viewDialogCommonTipBindingM11386a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogCommonTipBindingM11386a = null;
        }
        setContentView(viewDialogCommonTipBindingM11386a.getRoot());
        ViewDialogCommonTipBinding viewDialogCommonTipBinding2 = this.f17043a;
        if (viewDialogCommonTipBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewDialogCommonTipBinding2 = null;
        }
        viewDialogCommonTipBinding2.f11323c.setOnClickListener(new View.OnClickListener() { // from class: v7.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC9713d.m16231e(this.f17041a, view);
            }
        });
        ViewDialogCommonTipBinding viewDialogCommonTipBinding3 = this.f17043a;
        if (viewDialogCommonTipBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewDialogCommonTipBinding = viewDialogCommonTipBinding3;
        }
        viewDialogCommonTipBinding.f11322b.setOnClickListener(new View.OnClickListener() { // from class: v7.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC9713d.m16232f(this.f17042a, view);
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i10 != 4 || this.f17045c) {
            return super.onKeyDown(i10, event);
        }
        return true;
    }

    public /* synthetic */ DialogC9713d(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? R$style.AppTheme_Dialog : i10);
    }
}
