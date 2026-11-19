package com.canhub.cropper;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
@DebugMetadata(m5302c = "com.canhub.cropper.BitmapLoadingWorkerJob$start$1", m5303f = "BitmapLoadingWorkerJob.kt", m5304i = {}, m5305l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF, ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
final class BitmapLoadingWorkerJob$start$1 extends SuspendLambda implements InterfaceC6473e {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C3429d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapLoadingWorkerJob$start$1(C3429d c3429d, InterfaceC5631c<? super BitmapLoadingWorkerJob$start$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c3429d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        BitmapLoadingWorkerJob$start$1 bitmapLoadingWorkerJob$start$1 = new BitmapLoadingWorkerJob$start$1(this.this$0, interfaceC5631c);
        bitmapLoadingWorkerJob$start$1.L$0 = obj;
        return bitmapLoadingWorkerJob$start$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ExifInterface exifInterface;
        C3433f c3433f;
        InputStream inputStreamOpenInputStream;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5443s c5443s = C5443s.f8405a;
        try {
        } catch (Exception e) {
            C3429d c3429d = this.this$0;
            C3427c c3427c = new C3427c(c3429d.f2569b, null, 0, 0, false, false, e);
            this.label = 2;
            C5609e c5609e = AbstractC5896f0.f9343a;
            Object objM5626F = AbstractC6014x.m5626F(AbstractC5479k.f8471a, new BitmapLoadingWorkerJob$onPostExecute$2(c3429d, c3427c, null), this);
            if (objM5626F != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM5626F = c5443s;
            }
            if (objM5626F == coroutineSingletons) {
            }
        }
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
            if (AbstractC6014x.m5648s(interfaceC6009v)) {
                Rect rect = AbstractC3437h.f2603a;
                C3429d c3429d2 = this.this$0;
                C3431e c3431eM2478i = AbstractC3437h.m2478i(c3429d2.f2568a, c3429d2.f2569b, c3429d2.f2570c, c3429d2.f2571d);
                if (AbstractC6014x.m5648s(interfaceC6009v)) {
                    Bitmap bitmap = c3431eM2478i.f2577a;
                    C3429d c3429d3 = this.this$0;
                    try {
                        inputStreamOpenInputStream = c3429d3.f2568a.getContentResolver().openInputStream(c3429d3.f2569b);
                    } catch (Throwable unused) {
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            exifInterface = new ExifInterface(inputStreamOpenInputStream);
                            inputStreamOpenInputStream.close();
                        } finally {
                        }
                    } else {
                        exifInterface = null;
                    }
                    if (exifInterface != null) {
                        int attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                        c3433f = new C3433f(bitmap, attributeInt != 3 ? (attributeInt == 5 || attributeInt == 6 || attributeInt == 7) ? 90 : attributeInt != 8 ? 0 : 270 : 180, attributeInt == 2 || attributeInt == 5, attributeInt == 4 || attributeInt == 7);
                    } else {
                        c3433f = new C3433f(bitmap, 0, false, false);
                    }
                    C3429d c3429d4 = this.this$0;
                    C3427c c3427c2 = new C3427c(c3429d4.f2569b, (Bitmap) c3433f.f2594d, c3431eM2478i.f2578b, c3433f.f2591a, c3433f.f2592b, c3433f.f2593c, null);
                    this.label = 1;
                    C5609e c5609e2 = AbstractC5896f0.f9343a;
                    Object objM5626F2 = AbstractC6014x.m5626F(AbstractC5479k.f8471a, new BitmapLoadingWorkerJob$onPostExecute$2(c3429d4, c3427c2, null), this);
                    if (objM5626F2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM5626F2 = c5443s;
                    }
                    if (objM5626F2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return c5443s;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((BitmapLoadingWorkerJob$start$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
