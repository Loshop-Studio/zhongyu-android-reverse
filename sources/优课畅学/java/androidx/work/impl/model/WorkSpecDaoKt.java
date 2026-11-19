package androidx.work.impl.model;

import com.tencent.smtt.sdk.TbsListener;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p134i7.AbstractC8807u;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;

/* loaded from: classes3.dex */
public final class WorkSpecDaoKt {
    private static final String WORK_INFO_BY_IDS = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)";
    private static final String WORK_INFO_BY_NAME = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)";
    private static final String WORK_INFO_BY_TAG = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)";
    private static final String WORK_INFO_COLUMNS = "id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason";

    public static final InterfaceC9266c dedup(final InterfaceC9266c interfaceC9266c, CoroutineDispatcher dispatcher) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(dispatcher, "dispatcher");
        return AbstractC9268e.m16994F(AbstractC9268e.m17025o(new InterfaceC9266c() { // from class: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1

            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2 */
            public static final class C48902<T> implements InterfaceC9267d {
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;

                @InterfaceC9539d(m17800c = "androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2", m17801f = "WorkSpecDao.kt", m17802l = {TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C48902.this.emit(null, this);
                    }
                }

                public C48902(InterfaceC9267d interfaceC9267d) {
                    this.$this_unsafeFlow = interfaceC9267d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.C48902.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.C48902.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9079b.m15926b(r7)
                        goto L64
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.AbstractC9079b.m15926b(r7)
                        l8.d r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = p134i7.AbstractC8811w.m14786x(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L47:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L5b
                        java.lang.Object r4 = r6.next()
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r4 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r4
                        androidx.work.WorkInfo r4 = r4.toWorkInfo()
                        r2.add(r4)
                        goto L47
                    L5b:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L64
                        return r1
                    L64:
                        h7.p r6 = p123h7.C8736p.f16368a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.C48902.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = interfaceC9266c.collect(new C48902(interfaceC9267d), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        }), dispatcher);
    }

    public static final InterfaceC9266c getWorkStatusPojoFlowDataForIds(WorkSpecDao workSpecDao, UUID id) {
        AbstractC9133u.m16133g(workSpecDao, "<this>");
        AbstractC9133u.m16133g(id, "id");
        final InterfaceC9266c workStatusPojoFlowDataForIds = workSpecDao.getWorkStatusPojoFlowDataForIds(AbstractC8807u.m14755e(String.valueOf(id)));
        return AbstractC9268e.m17025o(new InterfaceC9266c() { // from class: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1

            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2 */
            public static final class C48912<T> implements InterfaceC9267d {
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;

                @InterfaceC9539d(m17800c = "androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2", m17801f = "WorkSpecDao.kt", m17802l = {TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C48912.this.emit(null, this);
                    }
                }

                public C48912(InterfaceC9267d interfaceC9267d) {
                    this.$this_unsafeFlow = interfaceC9267d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.C48912.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.C48912.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9079b.m15926b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.AbstractC9079b.m15926b(r6)
                        l8.d r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Object r5 = p134i7.AbstractC8778f0.m14568n0(r5)
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r5 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r5
                        if (r5 == 0) goto L45
                        androidx.work.WorkInfo r5 = r5.toWorkInfo()
                        goto L46
                    L45:
                        r5 = 0
                    L46:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        h7.p r5 = p123h7.C8736p.f16368a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.C48912.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = workStatusPojoFlowDataForIds.collect(new C48912(interfaceC9267d), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        });
    }

    public static final InterfaceC9266c getWorkStatusPojoFlowForName(WorkSpecDao workSpecDao, CoroutineDispatcher dispatcher, String name) {
        AbstractC9133u.m16133g(workSpecDao, "<this>");
        AbstractC9133u.m16133g(dispatcher, "dispatcher");
        AbstractC9133u.m16133g(name, "name");
        return dedup(workSpecDao.getWorkStatusPojoFlowForName(name), dispatcher);
    }

    public static final InterfaceC9266c getWorkStatusPojoFlowForTag(WorkSpecDao workSpecDao, CoroutineDispatcher dispatcher, String tag) {
        AbstractC9133u.m16133g(workSpecDao, "<this>");
        AbstractC9133u.m16133g(dispatcher, "dispatcher");
        AbstractC9133u.m16133g(tag, "tag");
        return dedup(workSpecDao.getWorkStatusPojoFlowForTag(tag), dispatcher);
    }
}
