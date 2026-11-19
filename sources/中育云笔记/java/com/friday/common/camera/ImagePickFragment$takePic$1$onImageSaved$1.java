package com.friday.common.camera;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.PausingDispatcherKt;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.camera.ImagePickFragment$takePic$1$onImageSaved$1", m26211f = "ImagePickFragment.kt", m26212l = {156}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImagePickFragment$takePic$1$onImageSaved$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f5742c;

    /* renamed from: d */
    public final /* synthetic */ ImagePickFragment f5743d;

    @InterfaceC11829d(m26210c = "com.friday.common.camera.ImagePickFragment$takePic$1$onImageSaved$1$1", m26211f = "ImagePickFragment.kt", m26212l = {Opcodes.IF_ICMPEQ}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.common.camera.ImagePickFragment$takePic$1$onImageSaved$1$1 */
    public static final class C59411 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f5744c;

        /* renamed from: d */
        public Object f5745d;

        /* renamed from: e */
        public Object f5746e;

        /* renamed from: f */
        public int f5747f;

        /* renamed from: g */
        public int f5748g;

        /* renamed from: h */
        public final /* synthetic */ ImagePickFragment f5749h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59411(ImagePickFragment imagePickFragment, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f5749h = imagePickFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C59411(this.f5749h, interfaceC11588c);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.f5748g
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L28
                if (r2 != r4) goto L20
                java.lang.Object r1 = r0.f5746e
                com.friday.common.camera.CameraBean r1 = (com.friday.common.camera.CameraBean) r1
                java.lang.Object r1 = r0.f5745d
                com.friday.common.camera.ImagePickFragment r1 = (com.friday.common.camera.ImagePickFragment) r1
                java.lang.Object r2 = r0.f5744c
                com.friday.common.camera.CameraBean r2 = (com.friday.common.camera.CameraBean) r2
                kotlin.AbstractC9924b.m20071b(r18)
                r5 = r18
                goto L5b
            L20:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L28:
                kotlin.AbstractC9924b.m20071b(r18)
                com.friday.common.camera.ImagePickFragment r2 = r0.f5749h
                com.friday.common.camera.CameraBean r5 = com.friday.common.camera.ImagePickFragment.m4876y(r2)
                if (r5 == 0) goto L9c
                com.friday.common.camera.ImagePickFragment r2 = r0.f5749h
                int r6 = r5.m4820l()
                if (r6 != 0) goto L70
                sd.e0 r6 = sd.C11157r0.m24799b()
                com.friday.common.camera.ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1 r7 = new com.friday.common.camera.ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1
                r7.<init>(r5, r3)
                r0.f5744c = r5
                r0.f5745d = r2
                java.lang.Object r5 = p409xc.AbstractC11833h.m26224a(r5)
                r0.f5746e = r5
                r5 = 0
                r0.f5747f = r5
                r0.f5748g = r4
                java.lang.Object r5 = sd.AbstractC11109f.m24709g(r6, r7, r0)
                if (r5 != r1) goto L5a
                return r1
            L5a:
                r1 = r2
            L5b:
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                java.lang.String r2 = "key_class_bitmap"
                java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
                com.jeremyliao.liveeventbus.core.Observable r2 = com.jeremyliao.liveeventbus.LiveEventBus.get(r2, r6)
                r2.post(r5)
                androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
                r1.finish()
                goto L9c
            L70:
                com.friday.common.camera.CameraActivity$a r1 = com.friday.common.camera.CameraActivity.f5628i
                android.content.Context r6 = r2.requireContext()
                java.lang.String r7 = "requireContext(...)"
                kotlin.jvm.internal.AbstractC9979u.m20293f(r6, r7)
                r14 = 254(0xfe, float:3.56E-43)
                r15 = 0
                r7 = r6
                r6 = 1
                r8 = r7
                r7 = 0
                r9 = r8
                r8 = 0
                r10 = r9
                r9 = 0
                r11 = r10
                r10 = 0
                r12 = r11
                r11 = 0
                r13 = r12
                r12 = 0
                r16 = r13
                r13 = 0
                r3 = r16
                com.friday.common.camera.CameraBean r5 = com.friday.common.camera.CameraBean.m4812b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                android.content.Intent r1 = r1.m4811a(r3, r5)
                r2.startActivity(r1)
            L9c:
                com.friday.common.camera.ImagePickFragment r1 = r0.f5749h
                com.friday.common.databinding.FragmentImagePickBinding r1 = com.friday.common.camera.ImagePickFragment.m4877z(r1)
                if (r1 != 0) goto Lab
                java.lang.String r1 = "mBindView"
                kotlin.jvm.internal.AbstractC9979u.m20312y(r1)
                r3 = 0
                goto Lac
            Lab:
                r3 = r1
            Lac:
                android.widget.ImageView r1 = r3.f5996d
                r1.setEnabled(r4)
                qc.q r1 = p309qc.C10786q.f26013a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.common.camera.ImagePickFragment$takePic$1$onImageSaved$1.C59411.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1.smali:126
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C59411) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$takePic$1$onImageSaved$1(ImagePickFragment imagePickFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5743d = imagePickFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ImagePickFragment$takePic$1$onImageSaved$1(this.f5743d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5742c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            LifecycleOwner viewLifecycleOwner = this.f5743d.getViewLifecycleOwner();
            AbstractC9979u.m20293f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C59411 c59411 = new C59411(this.f5743d, null);
            this.f5742c = 1;
            if (PausingDispatcherKt.whenResumed(viewLifecycleOwner, c59411, this) == objM25952f) {
                return objM25952f;
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
        return ((ImagePickFragment$takePic$1$onImageSaved$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
