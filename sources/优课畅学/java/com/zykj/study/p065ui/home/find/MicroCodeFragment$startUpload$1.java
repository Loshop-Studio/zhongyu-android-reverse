package com.zykj.study.p065ui.home.find;

import com.blankj.utilcode.util.AbstractC5376m0;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$string;
import java.io.File;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p134i7.AbstractC8801r;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.MicroCodeFragment$startUpload$1", m17801f = "MicroCodeFragment.kt", m17802l = {136}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MicroCodeFragment$startUpload$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f12632a;

    /* renamed from: b */
    public int f12633b;

    /* renamed from: c */
    public /* synthetic */ Object f12634c;

    /* renamed from: d */
    public final /* synthetic */ String f12635d;

    /* renamed from: e */
    public final /* synthetic */ MicroCodeFragment f12636e;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.MicroCodeFragment$startUpload$1$1", m17801f = "MicroCodeFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.MicroCodeFragment$startUpload$1$1 */
    public static final class C79441 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12637a;

        /* renamed from: b */
        public /* synthetic */ Object f12638b;

        /* renamed from: c */
        public final /* synthetic */ String f12639c;

        /* renamed from: d */
        public final /* synthetic */ String f12640d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C79441(String str, String str2, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f12639c = str;
            this.f12640d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C79441 c79441 = new C79441(this.f12639c, this.f12640d, interfaceC9324c);
            c79441.f12638b = obj;
            return c79441;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79441) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM15909b;
            List listM14736u1;
            AbstractC9434a.m17291f();
            if (this.f12637a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            String str = this.f12639c;
            String str2 = this.f12640d;
            try {
                Result.C9076a c9076a = Result.f17350b;
                File[] fileArrListFiles = new File(str).listFiles();
                objM15909b = Result.m15909b((fileArrListFiles == null || (listM14736u1 = AbstractC8801r.m14736u1(fileArrListFiles)) == null) ? null : AbstractC9536a.m17796a(AbstractC5376m0.m2585e(listM14736u1, new File(str2))));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            if (Result.m15913g(objM15909b)) {
                return null;
            }
            return objM15909b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroCodeFragment$startUpload$1(String str, MicroCodeFragment microCodeFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12635d = str;
        this.f12636e = microCodeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        MicroCodeFragment$startUpload$1 microCodeFragment$startUpload$1 = new MicroCodeFragment$startUpload$1(this.f12635d, this.f12636e, interfaceC9324c);
        microCodeFragment$startUpload$1.f12634c = obj;
        return microCodeFragment$startUpload$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MicroCodeFragment$startUpload$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f12634c;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f12633b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            String str2 = this.f12635d + ".zip";
            CoroutineDispatcher coroutineDispatcherM14867b = C8843i0.m14867b();
            C79441 c79441 = new C79441(this.f12635d, str2, null);
            this.f12634c = interfaceC8822b0;
            this.f12632a = str2;
            this.f12633b = 1;
            Object objM14848g = AbstractC8833f.m14848g(coroutineDispatcherM14867b, c79441, this);
            if (objM14848g == objM17291f) {
                return objM17291f;
            }
            str = str2;
            obj = objM14848g;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.f12632a;
            AbstractC9079b.m15926b(obj);
        }
        if (((Boolean) obj) != null) {
            this.f12636e.m11086C(this.f12635d, str);
        } else {
            MicroCodeFragment microCodeFragment = this.f12636e;
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = microCodeFragment.getString(R$string.micro_zip_error);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
        }
        return C8736p.f16368a;
    }
}
