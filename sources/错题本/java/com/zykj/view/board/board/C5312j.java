package com.zykj.view.board.board;

import androidx.databinding.ViewDataBinding;
import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import com.zykj.view.databinding.ViewItemSketchRecordBinding;
import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.view.board.board.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5312j implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f8239a;

    /* renamed from: b */
    public final /* synthetic */ ViewDataBinding f8240b;

    public /* synthetic */ C5312j(ViewDataBinding viewDataBinding, int i) {
        this.f8239a = i;
        this.f8240b = viewDataBinding;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f8239a) {
            case 0:
                return BoardFragment$initExtraClickListener$3$5$1$1.invokeSuspend$lambda$0((ViewItemSketchRecordAudioBinding) this.f8240b);
            default:
                return BoardFragment$initExtraClickListener$4$1$1$1.invokeSuspend$lambda$0((ViewItemSketchRecordBinding) this.f8240b);
        }
    }
}
