package com.zykj.mistake.service;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置。

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import androidx.navigation.C2861i;
import com.blankj.utilcode.util.AbstractC3382c;
import com.blankj.utilcode.util.AbstractC3399s;
import com.zykj.mistake.R;
import com.zykj.mistake.entity.req.MonitorPictureReq;
import com.zykj.mistake.entity.req.TokenReq;
import com.zykj.mistake.entity.resp.GeneratorResp;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.utils.C5105j;
import com.zykj.mistake.utils.C5107l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5862w;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import p030c6.AbstractC3234f;
import p045d6.C5443s;
import p073h4.AbstractC5626b;
import p075h6.InterfaceC5631c;
import p151r5.AbstractC6465b;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import retrofit2.C6509n0;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/service/UploadFolderIntentService;", "Landroid/app/IntentService;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class UploadFolderIntentService extends IntentService {

    /* renamed from: a */
    public final String f7994a;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.mistake.service.UploadFolderIntentService$onHandleIntent$1", m5303f = "UploadFolderIntentService.kt", m5304i = {}, m5305l = {100}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.mistake.service.UploadFolderIntentService$onHandleIntent$1 */
    final class C50921 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ String $filePath;
        final /* synthetic */ ArrayList<String> $imageUrlList;
        final /* synthetic */ Ref$ObjectRef<String> $jsonUrl;
        final /* synthetic */ String $objectKey;
        final /* synthetic */ GeneratorResp $resp;
        Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "", "path", "url"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m5302c = "com.zykj.mistake.service.UploadFolderIntentService$onHandleIntent$1$1", m5303f = "UploadFolderIntentService.kt", m5304i = {0, 0}, m5305l = {LocationRequestCompat.QUALITY_LOW_POWER}, m5306m = "invokeSuspend", m5307n = {"path", "url"}, m5308s = {"L$0", "L$1"})
        /* renamed from: com.zykj.mistake.service.UploadFolderIntentService$onHandleIntent$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6474f {
            final /* synthetic */ GeneratorResp $resp;
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(GeneratorResp generatorResp, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(3, interfaceC5631c);
                this.$resp = generatorResp;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                String str = (String) this.L$0;
                String str2 = (String) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                    return obj;
                }
                AbstractC5774b.m5119b(obj);
                GeneratorResp.Credential result = this.$resp.getResult();
                AbstractC5830k.m5327d(result);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objM4475a = C5107l.f8051a.m4475a(str, str2, result, this);
                return objM4475a == coroutineSingletons ? coroutineSingletons : objM4475a;
            }

            @Override // p152r6.InterfaceC6474f
            public final Object invoke(String str, String str2, InterfaceC5631c<? super String> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resp, interfaceC5631c);
                anonymousClass1.L$0 = str;
                anonymousClass1.L$1 = str2;
                return anonymousClass1.invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50921(Ref$ObjectRef<String> ref$ObjectRef, String str, String str2, GeneratorResp generatorResp, ArrayList<String> arrayList, InterfaceC5631c<? super C50921> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$jsonUrl = ref$ObjectRef;
            this.$filePath = str;
            this.$objectKey = str2;
            this.$resp = generatorResp;
            this.$imageUrlList = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C50921(this.$jsonUrl, this.$filePath, this.$objectKey, this.$resp, this.$imageUrlList, interfaceC5631c);
        }

        /* JADX WARN: Type inference failed for: r10v4, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Ref$ObjectRef<String> ref$ObjectRef;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                Ref$ObjectRef<String> ref$ObjectRef2 = this.$jsonUrl;
                String str = this.$filePath;
                String str2 = this.$objectKey;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resp, null);
                C2861i c2861i = new C2861i(this.$imageUrlList, 18);
                this.L$0 = ref$ObjectRef2;
                this.label = 1;
                Object objM4474d = C5105j.f8047a.m4474d(str, str2, anonymousClass1, c2861i, this);
                if (objM4474d == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef2;
                obj = objM4474d;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef = (Ref$ObjectRef) this.L$0;
                AbstractC5774b.m5119b(obj);
            }
            ?? r10 = (String) obj;
            if (r10 == 0) {
                throw new Exception("Upload Failed");
            }
            ref$ObjectRef.element = r10;
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C50921) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public UploadFolderIntentService() {
        super("UploadFolderIntentService");
        this.f7994a = "UploadFolderIntentService";
    }

    /* renamed from: b */
    public static void m4439b(int i, Bundle bundle, Messenger messenger) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 0;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        try {
            messenger.send(messageObtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m4440a(String str, ArrayList arrayList, Messenger messenger) {
        if (arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putString("UPLOAD_SUCCESS_URL", str);
            m4439b(103, bundle, messenger);
        } else {
            String string = getApplicationContext().getString(R.string.app_name);
            AbstractC5830k.m5329f(string, "getString(...)");
            MonitorPictureReq monitorPictureReq = new MonitorPictureReq(string, "com.zykj.mistake", arrayList);
            C5088a c5088a = C5088a.f7986a;
            C5088a.m4381b().m4400r(monitorPictureReq).m6079d(AbstractC3234f.f1799a).m6077a(AbstractC6465b.m6127a()).m6078b(new C5093a(this, messenger, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) throws Throwable {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("UPLOAD_PATH");
        String str = stringExtra == null ? "" : stringExtra;
        Bundle extras = intent.getExtras();
        AbstractC5830k.m5327d(extras);
        Object obj = extras.get("UPLOAD_MESSENGER");
        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type android.os.Messenger");
        Messenger messenger = (Messenger) obj;
        if (!AbstractC5099d.m4454d(getApplicationContext())) {
            m4439b(ComposerKt.compositionLocalMapKey, null, messenger);
            return;
        }
        try {
            long j7 = AbstractC5626b.f8757a.getSharedPreferences("zykjMistake", 0).getLong("SP_USER_ID", -1L);
            String string = UUID.randomUUID().toString();
            AbstractC5830k.m5329f(string, "toString(...)");
            String strM5407A = AbstractC5862w.m5407A(string, "-", "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            TokenReq tokenReq = new TokenReq(0, 2, "", 0, null, strM5407A, jCurrentTimeMillis, AbstractC3382c.m2301b(j7 + "+mistake_v2+res+2++0+" + strM5407A + "+" + jCurrentTimeMillis), 25, null);
            String str2 = "mistake_v2/res/" + j7 + "/" + AbstractC3399s.m2350a().format(new Date(jCurrentTimeMillis)) + "/" + strM5407A + "";
            C5088a c5088a = C5088a.f7986a;
            C6509n0 c6509n0Mo6145d = C5088a.m4381b().m4397o(tokenReq).mo6145d();
            AbstractC5830k.m5329f(c6509n0Mo6145d, "execute(...)");
            if (c6509n0Mo6145d.f10762a.f10107d == 401) {
                m4439b(ComposerKt.providerValuesKey, null, messenger);
                return;
            }
            GeneratorResp generatorResp = (GeneratorResp) c6509n0Mo6145d.f10763b;
            try {
                if (generatorResp == null || !generatorResp.getSuccess()) {
                    m4439b(ComposerKt.compositionLocalMapKey, null, messenger);
                    return;
                }
                m4439b(LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, null, messenger);
                ArrayList arrayList = new ArrayList();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                AbstractC6014x.m5655z(EmptyCoroutineContext.INSTANCE, new C50921(ref$ObjectRef, str, str2, generatorResp, arrayList, null));
                m4440a((String) ref$ObjectRef.element, arrayList, messenger);
            } catch (IOException e) {
                e = e;
                m4439b(ComposerKt.compositionLocalMapKey, null, messenger);
                e.printStackTrace();
            }
        } catch (IOException e4) {
            e = e4;
        }
    }
}
