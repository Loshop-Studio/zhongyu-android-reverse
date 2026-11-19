package com.zykj.mistake.activity;

import android.os.Parcel;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p128o1.AbstractBinderC6266b;
import p128o1.C6265a;
import p128o1.InterfaceC6267c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.activity.MainActivity$connection$1$onServiceConnected$1$1$1$1", m5303f = "MainActivity.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
public final class MainActivity$connection$1$onServiceConnected$1$1$1$1 extends SuspendLambda implements InterfaceC6473e {
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$connection$1$onServiceConnected$1$1$1$1(MainActivity mainActivity, InterfaceC5631c<? super MainActivity$connection$1$onServiceConnected$1$1$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MainActivity$connection$1$onServiceConnected$1$1$1$1(this.this$0, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Parcel parcelObtain;
        Parcel parcelObtain2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        InterfaceC6267c interfaceC6267c = this.this$0.f5787c;
        if (interfaceC6267c != null) {
            C6265a c6265a = (C6265a) interfaceC6267c;
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                if (!c6265a.f10018c.transact(2, parcelObtain, parcelObtain2, 0)) {
                    int i = AbstractBinderC6266b.f10019c;
                }
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } finally {
            }
        }
        MainActivity mainActivity = this.this$0;
        InterfaceC6267c interfaceC6267c2 = mainActivity.f5787c;
        if (interfaceC6267c2 != null) {
            String packageName = mainActivity.getPackageName();
            C6265a c6265a2 = (C6265a) interfaceC6267c2;
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                parcelObtain.writeString(packageName);
                if (!c6265a2.f10018c.transact(3, parcelObtain, parcelObtain2, 0)) {
                    int i8 = AbstractBinderC6266b.f10019c;
                }
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } finally {
            }
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MainActivity$connection$1$onServiceConnected$1$1$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
