package com.canhub.cropper;

import android.content.DialogInterface;
import com.canhub.cropper.CropImageActivity;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment;
import kotlin.jvm.internal.AbstractC5830k;
import p152r6.InterfaceC6471c;

/* renamed from: com.canhub.cropper.p */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3445p implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f2614a;

    /* renamed from: b */
    public final /* synthetic */ Object f2615b;

    public /* synthetic */ DialogInterfaceOnClickListenerC3445p(Object obj, int i) {
        this.f2614a = i;
        this.f2615b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i8 = this.f2614a;
        Object obj = this.f2615b;
        switch (i8) {
            case 0:
                InterfaceC6471c openSource = (InterfaceC6471c) obj;
                int i9 = CropImageActivity.f2361h;
                AbstractC5830k.m5330g(openSource, "$openSource");
                openSource.invoke(i == 0 ? CropImageActivity.Source.CAMERA : CropImageActivity.Source.GALLERY);
                break;
            default:
                BlackboardEvaluationFragment.askForErase$lambda$44$lambda$42((BlackboardEvaluationFragment) obj, dialogInterface, i);
                break;
        }
    }
}
