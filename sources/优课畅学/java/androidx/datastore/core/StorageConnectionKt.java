package androidx.datastore.core;

import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
public final class StorageConnectionKt {

    @InterfaceC9539d(m17800c = "androidx.datastore.core.StorageConnectionKt$readData$2", m17801f = "StorageConnection.kt", m17802l = {74}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.StorageConnectionKt$readData$2 */
    public static final class C37642 extends SuspendLambda implements InterfaceC10575q {
        private /* synthetic */ Object L$0;
        int label;

        public C37642(InterfaceC9324c<? super C37642> interfaceC9324c) {
            super(3, interfaceC9324c);
        }

        public final Object invoke(ReadScope<T> readScope, boolean z10, InterfaceC9324c<? super T> interfaceC9324c) {
            C37642 c37642 = new C37642(interfaceC9324c);
            c37642.L$0 = readScope;
            return c37642.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            ReadScope readScope = (ReadScope) this.L$0;
            this.label = 1;
            Object data = readScope.readData(this);
            return data == objM17291f ? objM17291f : data;
        }

        @Override // p300x7.InterfaceC10575q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((ReadScope) obj, ((Boolean) obj2).booleanValue(), (InterfaceC9324c) obj3);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.datastore.core.StorageConnectionKt$writeData$2", m17801f = "StorageConnection.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_MAIN}, m17803m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.StorageConnectionKt$writeData$2 */
    public static final class C37652 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ T $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37652(T t10, InterfaceC9324c<? super C37652> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$value = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C37652 c37652 = new C37652(this.$value, interfaceC9324c);
            c37652.L$0 = obj;
            return c37652;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(WriteScope<T> writeScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C37652) create(writeScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                WriteScope writeScope = (WriteScope) this.L$0;
                T t10 = this.$value;
                this.label = 1;
                if (writeScope.writeData(t10, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object readData(StorageConnection<T> storageConnection, InterfaceC9324c<? super T> interfaceC9324c) {
        return storageConnection.readScope(new C37642(null), interfaceC9324c);
    }

    public static final <T> Object writeData(StorageConnection<T> storageConnection, T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objWriteScope = storageConnection.writeScope(new C37652(t10, null), interfaceC9324c);
        return objWriteScope == AbstractC9434a.m17291f() ? objWriteScope : C8736p.f16368a;
    }
}
