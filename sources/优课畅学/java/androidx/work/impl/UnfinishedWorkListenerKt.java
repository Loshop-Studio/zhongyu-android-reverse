package androidx.work.impl;

import android.content.Context;
import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.ProcessUtils;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

/* loaded from: classes3.dex */
public final class UnfinishedWorkListenerKt {
    private static final int DELAY_MS = 30000;
    private static final long MAX_DELAY_MS;
    private static final String TAG;

    @InterfaceC9539d(m17800c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", m17801f = "UnfinishedWorkListener.kt", m17802l = {C3721BR.viewModel}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 */
    public static final class C48291 extends SuspendLambda implements InterfaceC10576r {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        public C48291(InterfaceC9324c<? super C48291> interfaceC9324c) {
            super(4, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10576r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((InterfaceC9267d) obj, (Throwable) obj2, ((Number) obj3).longValue(), (InterfaceC9324c<? super Boolean>) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Throwable th = (Throwable) this.L$0;
                long j10 = this.J$0;
                Logger.get().error(UnfinishedWorkListenerKt.TAG, "Cannot check for unfinished work", th);
                long jMin = Math.min(j10 * UnfinishedWorkListenerKt.DELAY_MS, UnfinishedWorkListenerKt.MAX_DELAY_MS);
                this.label = 1;
                if (DelayKt.m16227b(jMin, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return AbstractC9536a.m17796a(true);
        }

        public final Object invoke(InterfaceC9267d interfaceC9267d, Throwable th, long j10, InterfaceC9324c<? super Boolean> interfaceC9324c) {
            C48291 c48291 = new C48291(interfaceC9324c);
            c48291.L$0 = th;
            c48291.J$0 = j10;
            return c48291.invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", m17801f = "UnfinishedWorkListener.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 */
    public static final class C48302 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ Context $appContext;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48302(Context context, InterfaceC9324c<? super C48302> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$appContext = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C48302 c48302 = new C48302(this.$appContext, interfaceC9324c);
            c48302.Z$0 = ((Boolean) obj).booleanValue();
            return c48302;
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c<? super C8736p>) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            PackageManagerHelper.setComponentEnabled(this.$appContext, RescheduleReceiver.class, this.Z$0);
            return C8736p.f16368a;
        }

        public final Object invoke(boolean z10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C48302) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("UnfinishedWorkListener");
        AbstractC9133u.m16132f(strTagWithPrefix, "tagWithPrefix(\"UnfinishedWorkListener\")");
        TAG = strTagWithPrefix;
        MAX_DELAY_MS = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void maybeLaunchUnfinishedWorkListener(InterfaceC8822b0 interfaceC8822b0, Context appContext, Configuration configuration, WorkDatabase db) {
        AbstractC9133u.m16133g(interfaceC8822b0, "<this>");
        AbstractC9133u.m16133g(appContext, "appContext");
        AbstractC9133u.m16133g(configuration, "configuration");
        AbstractC9133u.m16133g(db, "db");
        if (ProcessUtils.isDefaultProcess(appContext, configuration)) {
            AbstractC9268e.m16995G(AbstractC9268e.m17000L(AbstractC9268e.m17025o(AbstractC9268e.m17022l(AbstractC9268e.m17003O(db.workSpecDao().hasUnfinishedWorkFlow(), new C48291(null)))), new C48302(appContext, null)), interfaceC8822b0);
        }
    }
}
