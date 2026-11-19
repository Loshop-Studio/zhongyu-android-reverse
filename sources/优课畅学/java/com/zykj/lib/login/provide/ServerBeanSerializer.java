package com.zykj.lib.login.provide;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.Serializer;
import com.zykj.lib.login.proto.ServerBean;
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
public final class ServerBeanSerializer implements Serializer<ServerBean> {

    /* renamed from: a */
    public static final ServerBeanSerializer f9909a = new ServerBeanSerializer();

    /* renamed from: b */
    public static final ServerBean f9910b;

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.provide.ServerBeanSerializer$readFrom$2", m17801f = "ServerBeanSerializer.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.provide.ServerBeanSerializer$readFrom$2 */
    public static final class C73282 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f9911a;

        /* renamed from: b */
        public /* synthetic */ Object f9912b;

        /* renamed from: c */
        public final /* synthetic */ InputStream f9913c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73282(InputStream inputStream, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f9913c = inputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C73282 c73282 = new C73282(this.f9913c, interfaceC9324c);
            c73282.f9912b = obj;
            return c73282;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73282) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM15909b;
            AbstractC9434a.m17291f();
            if (this.f9911a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            InputStream inputStream = this.f9913c;
            try {
                Result.C9076a c9076a = Result.f17350b;
                objM15909b = Result.m15909b(ServerBean.parseFrom(inputStream));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            if (Result.m15913g(objM15909b)) {
                objM15909b = null;
            }
            ServerBean serverBean = (ServerBean) objM15909b;
            return serverBean == null ? ServerBeanSerializer.f9909a.getDefaultValue() : serverBean;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.provide.ServerBeanSerializer$writeTo$2", m17801f = "ServerBeanSerializer.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.provide.ServerBeanSerializer$writeTo$2 */
    public static final class C73292 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f9914a;

        /* renamed from: b */
        public /* synthetic */ Object f9915b;

        /* renamed from: c */
        public final /* synthetic */ ServerBean f9916c;

        /* renamed from: d */
        public final /* synthetic */ OutputStream f9917d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73292(ServerBean serverBean, OutputStream outputStream, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f9916c = serverBean;
            this.f9917d = outputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C73292 c73292 = new C73292(this.f9916c, this.f9917d, interfaceC9324c);
            c73292.f9915b = obj;
            return c73292;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73292) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM15909b;
            AbstractC9434a.m17291f();
            if (this.f9914a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            ServerBean serverBean = this.f9916c;
            OutputStream outputStream = this.f9917d;
            try {
                Result.C9076a c9076a = Result.f17350b;
                serverBean.writeTo(outputStream);
                objM15909b = Result.m15909b(C8736p.f16368a);
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            return Result.m15908a(objM15909b);
        }
    }

    static {
        ServerBean defaultInstance = ServerBean.getDefaultInstance();
        AbstractC9133u.m16132f(defaultInstance, "getDefaultInstance(...)");
        f9910b = defaultInstance;
    }

    private ServerBeanSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ServerBean getDefaultValue() {
        return f9910b;
    }

    @Override // androidx.datastore.core.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(ServerBean serverBean, OutputStream outputStream, InterfaceC9324c interfaceC9324c) {
        Object objM14848g = AbstractC8833f.m14848g(C8843i0.m14867b(), new C73292(serverBean, outputStream, null), interfaceC9324c);
        return objM14848g == AbstractC9434a.m17291f() ? objM14848g : C8736p.f16368a;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, InterfaceC9324c<? super ServerBean> interfaceC9324c) {
        return AbstractC8833f.m14848g(C8843i0.m14867b(), new C73282(inputStream, null), interfaceC9324c);
    }
}
