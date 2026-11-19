package com.friday.paint.view.six;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.view.board.board.BoardFragment;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initObserver$7$1", m26211f = "NewPaintFragment.kt", m26212l = {360}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewPaintFragment$initObserver$7$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10185c;

    /* renamed from: d */
    public final /* synthetic */ NewPaintFragment f10186d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f10187e;

    /* renamed from: f */
    public final /* synthetic */ String f10188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPaintFragment$initObserver$7$1(NewPaintFragment newPaintFragment, Bitmap bitmap, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10186d = newPaintFragment;
        this.f10187e = bitmap;
        this.f10188f = str;
    }

    /* renamed from: m */
    public static final C10786q m7595m(NewPaintFragment newPaintFragment, String str) {
        if (str != null) {
            newPaintFragment.checkImageSafety(str);
            LogUtils.m3888i("[" + newPaintFragment.getViewModel().m7665G() + "] 添加图片:屏幕截图,路径:" + str);
        }
        return C10786q.f26013a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewPaintFragment$initObserver$7$1(this.f10186d, this.f10187e, this.f10188f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10185c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            NewPaintFragment newPaintFragment = this.f10186d;
            Bitmap bitmap = this.f10187e;
            String str = this.f10188f;
            this.f10185c = 1;
            obj = newPaintFragment.saveScreenCaptureToPng(bitmap, str, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        String str2 = (String) obj;
        BoardFragment currentNoteFragment = this.f10186d.getCurrentNoteFragment();
        if (currentNoteFragment != null) {
            Bitmap bitmap2 = str2 == null ? this.f10187e : null;
            String str3 = this.f10188f;
            final NewPaintFragment newPaintFragment2 = this.f10186d;
            currentNoteFragment.m16793t0(bitmap2, str2, str3, true, new InterfaceC9540l() { // from class: com.friday.paint.view.six.g
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return NewPaintFragment$initObserver$7$1.m7595m(newPaintFragment2, (String) obj2);
                }
            });
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewPaintFragment$initObserver$7$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
