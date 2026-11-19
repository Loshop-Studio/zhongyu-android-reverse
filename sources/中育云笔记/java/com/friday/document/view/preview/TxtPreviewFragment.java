package com.friday.document.view.preview;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.alibaba.fastjson.asm.Opcodes;
import com.friday.common.base.BaseFragment;
import com.friday.common.helper.C5963c;
import com.friday.document.R$layout;
import com.friday.document.databinding.FragmentPreviewTxtBinding;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p383w2.InterfaceC11671b;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TxtPreviewFragment extends Hilt_TxtPreviewFragment<FragmentPreviewTxtBinding> implements InterfaceC11671b {

    /* renamed from: i */
    public static final C6061a f7486i = new C6061a(null);

    /* renamed from: j */
    public static final int f7487j = BaseFragment.$stable;

    /* renamed from: com.friday.document.view.preview.TxtPreviewFragment$a */
    public static final class C6061a {
        public /* synthetic */ C6061a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final TxtPreviewFragment m5971a(String fileName, String filePath, String shareTime) {
            AbstractC9979u.m20294g(fileName, "fileName");
            AbstractC9979u.m20294g(filePath, "filePath");
            AbstractC9979u.m20294g(shareTime, "shareTime");
            Bundle bundle = new Bundle();
            bundle.putString("fileName", fileName);
            bundle.putString("filePath", filePath);
            bundle.putString("shareTime", shareTime);
            TxtPreviewFragment txtPreviewFragment = new TxtPreviewFragment();
            txtPreviewFragment.setArguments(bundle);
            return txtPreviewFragment;
        }

        public C6061a() {
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.view.preview.TxtPreviewFragment$initData$1", m26211f = "TxtPreviewFragment.kt", m26212l = {Opcodes.ASTORE}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.preview.TxtPreviewFragment$initData$1 */
    public static final class C60621 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7488c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.preview.TxtPreviewFragment$initData$1$1", m26211f = "TxtPreviewFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.preview.TxtPreviewFragment$initData$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7490c;

            /* renamed from: d */
            public final /* synthetic */ TxtPreviewFragment f7491d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TxtPreviewFragment txtPreviewFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7491d = txtPreviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f7491d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f7490c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return AbstractC11958b.m26590k(this.f7491d.m5968u(), null, true, 2, null);
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C60621(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return TxtPreviewFragment.this.new C60621(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7488c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TxtPreviewFragment.this, null);
                this.f7488c = 1;
                obj = AbstractC11109f.m24709g(abstractC11106e0M24799b, anonymousClass1, this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            TxtPreviewFragment.m5967s(TxtPreviewFragment.this).f6409d.setText((String) obj);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60621) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static final /* synthetic */ FragmentPreviewTxtBinding m5967s(TxtPreviewFragment txtPreviewFragment) {
        return (FragmentPreviewTxtBinding) txtPreviewFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final String m5968u() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("filePath")) == null) ? "" : string;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_preview_txt;
    }

    @Override // p383w2.InterfaceC11671b
    /* renamed from: i */
    public void mo5940i() {
        C5963c.m5305q(C5963c.f6084a, "", "", m5969t(), null, m5970v(), false, m5968u(), 8, null);
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60621(null), 3, null);
    }

    @Override // com.friday.common.base.BaseFragment
    public boolean needHideLoadingOnDestroy() {
        return false;
    }

    /* renamed from: t */
    public final String m5969t() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("fileName")) == null) ? "" : string;
    }

    /* renamed from: v */
    public final String m5970v() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("shareTime")) == null) ? "" : string;
    }
}
