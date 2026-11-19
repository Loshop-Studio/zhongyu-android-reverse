package com.friday.common.camera;

import androidx.cardview.widget.CardView;
import com.friday.common.databinding.FragmentImagePickBinding;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.camera.ImagePickFragment$startJob$1", m26211f = "ImagePickFragment.kt", m26212l = {418}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImagePickFragment$startJob$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f5733c;

    /* renamed from: d */
    public final /* synthetic */ long f5734d;

    /* renamed from: e */
    public final /* synthetic */ ImagePickFragment f5735e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$startJob$1(long j10, ImagePickFragment imagePickFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5734d = j10;
        this.f5735e = imagePickFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ImagePickFragment$startJob$1(this.f5734d, this.f5735e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5733c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            long j10 = this.f5734d;
            this.f5733c = 1;
            if (DelayKt.m20376b(j10, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        FragmentImagePickBinding fragmentImagePickBinding = this.f5735e.f5706m;
        FragmentImagePickBinding fragmentImagePickBinding2 = null;
        if (fragmentImagePickBinding == null) {
            AbstractC9979u.m20312y("mBindView");
            fragmentImagePickBinding = null;
        }
        CardView cvZoomValue = fragmentImagePickBinding.f5998f;
        AbstractC9979u.m20293f(cvZoomValue, "cvZoomValue");
        cvZoomValue.setVisibility(0);
        FragmentImagePickBinding fragmentImagePickBinding3 = this.f5735e.f5706m;
        if (fragmentImagePickBinding3 == null) {
            AbstractC9979u.m20312y("mBindView");
        } else {
            fragmentImagePickBinding2 = fragmentImagePickBinding3;
        }
        ZoomControlView dbView = fragmentImagePickBinding2.f5999g;
        AbstractC9979u.m20293f(dbView, "dbView");
        dbView.setVisibility(8);
        this.f5735e.m4886U();
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ImagePickFragment$startJob$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
