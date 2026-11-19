package com.zykj.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.navigation.compose.DialogNavigator;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R$\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0010¨\u0006\u001f"}, m7880d2 = {"Lcom/zykj/base/view/LoadingDialogView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "visibility", "setVisibility", "(I)V", "getVisibility", "()I", "onDetachedFromWindow", "()V", "a", "(Landroid/content/Context;)V", "Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;", "Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;", DialogNavigator.NAME, "value", "b", "I", "setDialogVisibility", "dialogVisibility", "base_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class LoadingDialogView extends View {

    /* renamed from: a, reason: from kotlin metadata */
    public MaterialDialog dialog;

    /* renamed from: b, reason: from kotlin metadata */
    public int dialogVisibility;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dialogVisibility = 8;
        m4989a(context);
    }

    private final void setDialogVisibility(int i6) {
        this.dialogVisibility = i6;
        if (i6 == 0) {
            MaterialDialog materialDialog = this.dialog;
            if (materialDialog != null) {
                materialDialog.show();
                return;
            }
            return;
        }
        MaterialDialog materialDialog2 = this.dialog;
        if (materialDialog2 != null) {
            materialDialog2.dismiss();
        }
    }

    /* renamed from: a */
    public final void m4989a(Context context) {
        this.dialog = new MaterialDialog.C5891g(context).m4613g().m4620n("提示").m4610d("正在加载").m4615i(true, 0).m4617k(false).m4607a();
    }

    @Override // android.view.View
    public int getVisibility() {
        return this.dialogVisibility;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        MaterialDialog materialDialog = this.dialog;
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
        this.dialog = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        setDialogVisibility(visibility);
    }
}
