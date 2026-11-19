package com.zykj.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.view.C5280R;
import com.zykj.view.board.play.C5353b;
import com.zykj.view.databinding.ViewDialogCommonTipBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 ¨\u0006!"}, m5110d2 = {"Lcom/zykj/view/dialog/CommonTipDialog;", "Landroid/app/Dialog;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "savedInstanceState", "Ld6/s;", "onCreate", "(Landroid/os/Bundle;)V", "keyCode", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "", "content", "cancelAble", "Lkotlin/Function0;", "callback", "needCancelButton", "showDialog", "(Ljava/lang/String;ZLr6/a;Z)V", "Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;", "mBinding", "Lcom/zykj/view/databinding/ViewDialogCommonTipBinding;", "confirmCallback", "Lr6/a;", "Z", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCommonTipDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTipDialog.kt\ncom/zykj/view/dialog/CommonTipDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,52:1\n257#2,2:53\n*S KotlinDebug\n*F\n+ 1 CommonTipDialog.kt\ncom/zykj/view/dialog/CommonTipDialog\n*L\n50#1:53,2\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonTipDialog extends Dialog {
    private boolean cancelAble;

    @NotNull
    private InterfaceC6469a confirmCallback;
    private ViewDialogCommonTipBinding mBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTipDialog(@NotNull Context context, int i) {
        super(context, i);
        AbstractC5830k.m5330g(context, "context");
        this.confirmCallback = new C5353b(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(CommonTipDialog commonTipDialog, View view) {
        commonTipDialog.dismiss();
        commonTipDialog.confirmCallback.invoke();
    }

    public static /* synthetic */ void showDialog$default(CommonTipDialog commonTipDialog, String str, boolean z8, InterfaceC6469a interfaceC6469a, boolean z9, int i, Object obj) {
        if ((i & 8) != 0) {
            z9 = false;
        }
        commonTipDialog.showDialog(str, z8, interfaceC6469a, z9);
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDialogCommonTipBinding viewDialogCommonTipBindingInflate = ViewDialogCommonTipBinding.inflate(LayoutInflater.from(getContext()));
        AbstractC5830k.m5329f(viewDialogCommonTipBindingInflate, "inflate(...)");
        this.mBinding = viewDialogCommonTipBindingInflate;
        setContentView(viewDialogCommonTipBindingInflate.getRoot());
        ViewDialogCommonTipBinding viewDialogCommonTipBinding = this.mBinding;
        if (viewDialogCommonTipBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i = 0;
        viewDialogCommonTipBinding.tvConfirm.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.dialog.a

            /* renamed from: b */
            public final /* synthetic */ CommonTipDialog f8318b;

            {
                this.f8318b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        CommonTipDialog.onCreate$lambda$1(this.f8318b, view);
                        break;
                    default:
                        this.f8318b.dismiss();
                        break;
                }
            }
        });
        ViewDialogCommonTipBinding viewDialogCommonTipBinding2 = this.mBinding;
        if (viewDialogCommonTipBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        final int i8 = 1;
        viewDialogCommonTipBinding2.tvCancel.setOnClickListener(new View.OnClickListener(this) { // from class: com.zykj.view.dialog.a

            /* renamed from: b */
            public final /* synthetic */ CommonTipDialog f8318b;

            {
                this.f8318b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        CommonTipDialog.onCreate$lambda$1(this.f8318b, view);
                        break;
                    default:
                        this.f8318b.dismiss();
                        break;
                }
            }
        });
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (keyCode != 4 || this.cancelAble) {
            return super.onKeyDown(keyCode, event);
        }
        return true;
    }

    public final void showDialog(@NotNull String content, boolean cancelAble, @NotNull InterfaceC6469a callback, boolean needCancelButton) {
        AbstractC5830k.m5330g(content, "content");
        AbstractC5830k.m5330g(callback, "callback");
        this.cancelAble = cancelAble;
        show();
        ViewDialogCommonTipBinding viewDialogCommonTipBinding = this.mBinding;
        if (viewDialogCommonTipBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewDialogCommonTipBinding.tvContent.setText(content);
        setCanceledOnTouchOutside(cancelAble);
        this.confirmCallback = callback;
        ViewDialogCommonTipBinding viewDialogCommonTipBinding2 = this.mBinding;
        if (viewDialogCommonTipBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        TextView tvCancel = viewDialogCommonTipBinding2.tvCancel;
        AbstractC5830k.m5329f(tvCancel, "tvCancel");
        tvCancel.setVisibility(needCancelButton ? 0 : 8);
    }

    public /* synthetic */ CommonTipDialog(Context context, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? C5280R.style.AppTheme_Dialog : i);
    }
}
