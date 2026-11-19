package com.friday.common.camera;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.SurfaceOrientedMeteringPointFactory;
import com.friday.common.databinding.FragmentImagePickBinding;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p028b2.C5144a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.camera.ImagePickFragment$bindCameraUseCases$3", m26211f = "ImagePickFragment.kt", m26212l = {296}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ImagePickFragment$bindCameraUseCases$3 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f5724c;

    /* renamed from: d */
    public final /* synthetic */ ImagePickFragment f5725d;

    @InterfaceC11829d(m26210c = "com.friday.common.camera.ImagePickFragment$bindCameraUseCases$3$2", m26211f = "ImagePickFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.common.camera.ImagePickFragment$bindCameraUseCases$3$2 */
    public static final class C59372 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f5726c;

        /* renamed from: d */
        public /* synthetic */ Object f5727d;

        /* renamed from: e */
        public final /* synthetic */ ImagePickFragment f5728e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59372(ImagePickFragment imagePickFragment, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f5728e = imagePickFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C59372 c59372 = new C59372(this.f5728e, interfaceC11588c);
            c59372.f5727d = obj;
            return c59372;
        }

        @Override // p181hd.InterfaceC9544p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C5144a c5144a, InterfaceC11588c interfaceC11588c) {
            return ((C59372) create(c5144a, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5144a c5144a = (C5144a) this.f5727d;
            AbstractC11725a.m25952f();
            if (this.f5726c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            FragmentImagePickBinding fragmentImagePickBinding = this.f5728e.f5706m;
            Camera camera = null;
            if (fragmentImagePickBinding == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding = null;
            }
            float width = fragmentImagePickBinding.f6002j.getWidth();
            FragmentImagePickBinding fragmentImagePickBinding2 = this.f5728e.f5706m;
            if (fragmentImagePickBinding2 == null) {
                AbstractC9979u.m20312y("mBindView");
                fragmentImagePickBinding2 = null;
            }
            MeteringPoint meteringPointCreatePoint = new SurfaceOrientedMeteringPointFactory(width, fragmentImagePickBinding2.f6002j.getHeight()).createPoint(c5144a.m2662b(), c5144a.m2663c());
            AbstractC9979u.m20293f(meteringPointCreatePoint, "createPoint(...)");
            try {
                Camera camera2 = this.f5728e.f5707n;
                if (camera2 == null) {
                    AbstractC9979u.m20312y("camera");
                } else {
                    camera = camera2;
                }
                CameraControl cameraControl = camera.getCameraControl();
                FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(meteringPointCreatePoint, 1);
                builder.disableAutoCancel();
                AbstractC9979u.m20291d(cameraControl.startFocusAndMetering(builder.build()));
            } catch (CameraInfoUnavailableException unused) {
            }
            return C10786q.f26013a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickFragment$bindCameraUseCases$3(ImagePickFragment imagePickFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5725d = imagePickFragment;
    }

    /* renamed from: m */
    public static final boolean m4889m(C5144a c5144a, C5144a c5144a2) {
        return c5144a2.m2661a() - c5144a.m2661a() < 1000;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ImagePickFragment$bindCameraUseCases$3(this.f5725d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5724c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11594c interfaceC11594cM25565o = AbstractC11596e.m25565o(this.f5725d.m4860H().m4825c(), new InterfaceC9544p() { // from class: com.friday.common.camera.a
                @Override // p181hd.InterfaceC9544p
                public final Object invoke(Object obj2, Object obj3) {
                    return Boolean.valueOf(ImagePickFragment$bindCameraUseCases$3.m4889m((C5144a) obj2, (C5144a) obj3));
                }
            });
            C59372 c59372 = new C59372(this.f5725d, null);
            this.f5724c = 1;
            if (AbstractC11596e.m25559i(interfaceC11594cM25565o, c59372, this) == objM25952f) {
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
        return ((ImagePickFragment$bindCameraUseCases$3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
