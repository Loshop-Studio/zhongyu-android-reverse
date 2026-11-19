package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.ProcessUtils;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class UnfinishedWorkListenerKt {
    private static final int DELAY_MS = 30000;
    private static final long MAX_DELAY_MS;
    private static final String TAG;

    @InterfaceC11829d(m26210c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", m26211f = "UnfinishedWorkListener.kt", m26212l = {59}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 */
    public static final class C47771 extends SuspendLambda implements InterfaceC9546r {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        public C47771(InterfaceC11588c<? super C47771> interfaceC11588c) {
            super(4, interfaceC11588c);
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((InterfaceC11595d) obj, (Throwable) obj2, ((Number) obj3).longValue(), (InterfaceC11588c<? super Boolean>) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Throwable th = (Throwable) this.L$0;
                long j10 = this.J$0;
                Logger.get().error(UnfinishedWorkListenerKt.TAG, "Cannot check for unfinished work", th);
                long jMin = Math.min(j10 * 30000, UnfinishedWorkListenerKt.MAX_DELAY_MS);
                this.label = 1;
                if (DelayKt.m20376b(jMin, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return AbstractC11826a.m26206a(true);
        }

        public final Object invoke(InterfaceC11595d interfaceC11595d, Throwable th, long j10, InterfaceC11588c<? super Boolean> interfaceC11588c) {
            C47771 c47771 = new C47771(interfaceC11588c);
            c47771.L$0 = th;
            c47771.J$0 = j10;
            return c47771.invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", m26211f = "UnfinishedWorkListener.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 */
    public static final class C47782 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Context $appContext;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47782(Context context, InterfaceC11588c<? super C47782> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$appContext = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C47782 c47782 = new C47782(this.$appContext, interfaceC11588c);
            c47782.Z$0 = ((Boolean) obj).booleanValue();
            return c47782;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c<? super C10786q>) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            PackageManagerHelper.setComponentEnabled(this.$appContext, RescheduleReceiver.class, this.Z$0);
            return C10786q.f26013a;
        }

        public final Object invoke(boolean z10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C47782) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("UnfinishedWorkListener");
        AbstractC9979u.m20293f(strTagWithPrefix, "tagWithPrefix(\"UnfinishedWorkListener\")");
        TAG = strTagWithPrefix;
        MAX_DELAY_MS = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void maybeLaunchUnfinishedWorkListener(InterfaceC11122i0 interfaceC11122i0, Context appContext, Configuration configuration, WorkDatabase db2) {
        AbstractC9979u.m20294g(interfaceC11122i0, "<this>");
        AbstractC9979u.m20294g(appContext, "appContext");
        AbstractC9979u.m20294g(configuration, "configuration");
        AbstractC9979u.m20294g(db2, "db");
        if (ProcessUtils.isDefaultProcess(appContext, configuration)) {
            AbstractC11596e.m25535F(AbstractC11596e.m25540K(AbstractC11596e.m25564n(AbstractC11596e.m25561k(AbstractC11596e.m25543N(db2.workSpecDao().hasUnfinishedWorkFlow(), new C47771(null)))), new C47782(appContext, null)), interfaceC11122i0);
        }
    }
}
