package com.zykj.mistake.activity;

import android.os.Parcel;
import androidx.fragment.app.FragmentManager;
import com.zykj.mistake.R;
import com.zykj.mistake.dialog.ConvertDialog;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p046d7.C5447d;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5631c;
import p106l4.C6052c;
import p128o1.AbstractBinderC6266b;
import p128o1.C6265a;
import p128o1.InterfaceC6267c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.mistake.activity.MainActivity$connection$1$onServiceConnected$1", m5303f = "MainActivity.kt", m5304i = {}, m5305l = {285}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
final class MainActivity$connection$1$onServiceConnected$1 extends SuspendLambda implements InterfaceC6473e {
    int label;
    final /* synthetic */ MainActivity this$0;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.mistake.activity.MainActivity$connection$1$onServiceConnected$1$1", m5303f = "MainActivity.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.activity.MainActivity$connection$1$onServiceConnected$1$1 */
    public static final class C44571 extends SuspendLambda implements InterfaceC6473e {
        int label;
        final /* synthetic */ MainActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44571(MainActivity mainActivity, InterfaceC5631c<? super C44571> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.this$0 = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C44571(this.this$0, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            ConvertDialog convertDialog = new ConvertDialog();
            MainActivity mainActivity = this.this$0;
            String string = mainActivity.getString(R.string.tips_upgrade_new_version);
            C6052c c6052c = new C6052c(this.this$0.getString(R.string.to_update), new C4468f(this.this$0, 0));
            convertDialog.f6174c = string;
            convertDialog.f6175d = c6052c;
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            AbstractC5830k.m5329f(supportFragmentManager, "getSupportFragmentManager(...)");
            convertDialog.show(supportFragmentManager, "ConvertDialog");
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C44571) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$connection$1$onServiceConnected$1(MainActivity mainActivity, InterfaceC5631c<? super MainActivity$connection$1$onServiceConnected$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new MainActivity$connection$1$onServiceConnected$1(this.this$0, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            MainActivity mainActivity = this.this$0;
            InterfaceC6267c interfaceC6267c = mainActivity.f5787c;
            if (interfaceC6267c != null) {
                String packageName = mainActivity.getPackageName();
                C6265a c6265a = (C6265a) interfaceC6267c;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.techvision.aldl.ICheckAppUpdate");
                    parcelObtain.writeString(packageName);
                    if (!c6265a.f10018c.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i8 = AbstractBinderC6266b.f10019c;
                    }
                    parcelObtain2.readException();
                    boolean z8 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    if (z8) {
                        C5609e c5609e = AbstractC5896f0.f9343a;
                        C5447d c5447d = AbstractC5479k.f8471a;
                        C44571 c44571 = new C44571(this.this$0, null);
                        this.label = 1;
                        if (AbstractC6014x.m5626F(c5447d, c44571, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((MainActivity$connection$1$onServiceConnected$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
