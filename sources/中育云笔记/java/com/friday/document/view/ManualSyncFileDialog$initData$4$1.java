package com.friday.document.view;

import androidx.appcompat.app.AppCompatDelegate;
import com.friday.document.viewmodel.ManualSyncViewModel;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.ManualSyncFileDialog$initData$4$1", m26211f = "ManualSyncFileDialog.kt", m26212l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ManualSyncFileDialog$initData$4$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7177c;

    /* renamed from: d */
    public final /* synthetic */ List f7178d;

    /* renamed from: e */
    public final /* synthetic */ ManualSyncFileDialog f7179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualSyncFileDialog$initData$4$1(List list, ManualSyncFileDialog manualSyncFileDialog, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7178d = list;
        this.f7179e = manualSyncFileDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ManualSyncFileDialog$initData$4$1(this.f7178d, this.f7179e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7177c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.f7178d != null) {
                this.f7179e.m5710x().setList(this.f7178d);
                this.f7179e.updateTitle();
                ManualSyncViewModel manualSyncViewModelM5711y = this.f7179e.m5711y();
                this.f7177c = 1;
                if (manualSyncViewModelM5711y.m6310n(this) == objM25952f) {
                    return objM25952f;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ManualSyncFileDialog$initData$4$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
