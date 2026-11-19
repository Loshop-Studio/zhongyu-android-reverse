package com.zykj.lib.login.provide;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.Serializer;
import com.zykj.lib.login.proto.UserBean;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class UserBeanSerializer implements Serializer<UserBean> {

    /* renamed from: a */
    public static final UserBeanSerializer f9918a = new UserBeanSerializer();

    /* renamed from: b */
    public static final UserBean f9919b;

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.provide.UserBeanSerializer$readFrom$2", m17801f = "UserBeanSerializer.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.provide.UserBeanSerializer$readFrom$2 */
    public static final class C73302 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f9920a;

        /* renamed from: b */
        public /* synthetic */ Object f9921b;

        /* renamed from: c */
        public final /* synthetic */ InputStream f9922c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73302(InputStream inputStream, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f9922c = inputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C73302 c73302 = new C73302(this.f9922c, interfaceC9324c);
            c73302.f9921b = obj;
            return c73302;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73302) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM15909b;
            AbstractC9434a.m17291f();
            if (this.f9920a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            InputStream inputStream = this.f9922c;
            try {
                Result.C9076a c9076a = Result.f17350b;
                objM15909b = Result.m15909b(UserBean.parseFrom(inputStream));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            if (Result.m15913g(objM15909b)) {
                objM15909b = null;
            }
            UserBean userBean = (UserBean) objM15909b;
            return userBean == null ? UserBeanSerializer.f9918a.getDefaultValue() : userBean;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.provide.UserBeanSerializer$writeTo$2", m17801f = "UserBeanSerializer.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.provide.UserBeanSerializer$writeTo$2 */
    public static final class C73312 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f9923a;

        /* renamed from: b */
        public /* synthetic */ Object f9924b;

        /* renamed from: c */
        public final /* synthetic */ UserBean f9925c;

        /* renamed from: d */
        public final /* synthetic */ OutputStream f9926d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73312(UserBean userBean, OutputStream outputStream, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f9925c = userBean;
            this.f9926d = outputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C73312 c73312 = new C73312(this.f9925c, this.f9926d, interfaceC9324c);
            c73312.f9924b = obj;
            return c73312;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73312) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM15909b;
            AbstractC9434a.m17291f();
            if (this.f9923a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            UserBean userBean = this.f9925c;
            OutputStream outputStream = this.f9926d;
            try {
                Result.C9076a c9076a = Result.f17350b;
                userBean.writeTo(outputStream);
                objM15909b = Result.m15909b(C8736p.f16368a);
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            return Result.m15908a(objM15909b);
        }
    }

    static {
        UserBean defaultInstance = UserBean.getDefaultInstance();
        AbstractC9133u.m16132f(defaultInstance, "getDefaultInstance(...)");
        f9919b = defaultInstance;
    }

    private UserBeanSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public UserBean getDefaultValue() {
        return f9919b;
    }

    @Override // androidx.datastore.core.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(UserBean userBean, OutputStream outputStream, InterfaceC9324c interfaceC9324c) {
        Object objM14848g = AbstractC8833f.m14848g(C8843i0.m14867b(), new C73312(userBean, outputStream, null), interfaceC9324c);
        return objM14848g == AbstractC9434a.m17291f() ? objM14848g : C8736p.f16368a;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, InterfaceC9324c<? super UserBean> interfaceC9324c) {
        return AbstractC8833f.m14848g(C8843i0.m14867b(), new C73302(inputStream, null), interfaceC9324c);
    }
}
