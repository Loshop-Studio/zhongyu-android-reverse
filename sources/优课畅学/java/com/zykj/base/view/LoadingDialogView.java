package com.zykj.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class LoadingDialogView extends View {

    /* renamed from: a */
    public MaterialDialog f8671a;

    /* renamed from: b */
    public int f8672b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this.f8672b = 8;
        m7348a(context);
    }

    private final void setDialogVisibility(int i10) {
        this.f8672b = i10;
        if (i10 == 0) {
            MaterialDialog materialDialog = this.f8671a;
            if (materialDialog != null) {
                materialDialog.show();
                return;
            }
            return;
        }
        MaterialDialog materialDialog2 = this.f8671a;
        if (materialDialog2 != null) {
            materialDialog2.dismiss();
        }
    }

    /* renamed from: a */
    public final void m7348a(Context context) {
        this.f8671a = new MaterialDialog.C6913g(context).m6758s().m6737H("提示").m6749j("正在加载").m6731B(true, 0).m6733D(false).m6742c();
    }

    @Override // android.view.View
    public int getVisibility() {
        return this.f8672b;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        MaterialDialog materialDialog = this.f8671a;
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
        this.f8671a = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        setDialogVisibility(i10);
    }
}
