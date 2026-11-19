package androidx.work.impl.model;

import java.util.UUID;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10976v;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class WorkSpecDaoKt {
    private static final String WORK_INFO_BY_IDS = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)";
    private static final String WORK_INFO_BY_NAME = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)";
    private static final String WORK_INFO_BY_TAG = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)";
    private static final String WORK_INFO_COLUMNS = "id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason";

    public static final InterfaceC11594c dedup(final InterfaceC11594c interfaceC11594c, AbstractC11106e0 dispatcher) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(dispatcher, "dispatcher");
        return AbstractC11596e.m25534E(AbstractC11596e.m25564n(new InterfaceC11594c() { // from class: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1

            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2 */
            public static final class C48382<T> implements InterfaceC11595d {
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;

                @InterfaceC11829d(m26210c = "androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2", m26211f = "WorkSpecDao.kt", m26212l = {223}, m26213m = "emit")
                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C48382.this.emit(null, this);
                    }
                }

                public C48382(InterfaceC11595d interfaceC11595d) {
                    this.$this_unsafeFlow = interfaceC11595d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.C48382.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.C48382.AnonymousClass1) r0
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
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9924b.m20071b(r7)
                        goto L66
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.AbstractC9924b.m20071b(r7)
                        vd.d r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = p325rc.AbstractC10980x.m24153x(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L49:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L5d
                        java.lang.Object r4 = r6.next()
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r4 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r4
                        androidx.work.WorkInfo r4 = r4.toWorkInfo()
                        r2.add(r4)
                        goto L49
                    L5d:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L66
                        return r1
                    L66:
                        qc.q r6 = p309qc.C10786q.f26013a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.C48382.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = interfaceC11594c.collect(new C48382(interfaceC11595d), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }), dispatcher);
    }

    public static final InterfaceC11594c getWorkStatusPojoFlowDataForIds(WorkSpecDao workSpecDao, UUID id2) {
        AbstractC9979u.m20294g(workSpecDao, "<this>");
        AbstractC9979u.m20294g(id2, "id");
        final InterfaceC11594c workStatusPojoFlowDataForIds = workSpecDao.getWorkStatusPojoFlowDataForIds(AbstractC10976v.m24126e(String.valueOf(id2)));
        return AbstractC11596e.m25564n(new InterfaceC11594c() { // from class: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1

            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2 */
            public static final class C48392<T> implements InterfaceC11595d {
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;

                @InterfaceC11829d(m26210c = "androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2", m26211f = "WorkSpecDao.kt", m26212l = {223}, m26213m = "emit")
                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C48392.this.emit(null, this);
                    }
                }

                public C48392(InterfaceC11595d interfaceC11595d) {
                    this.$this_unsafeFlow = interfaceC11595d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.C48392.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.C48392.AnonymousClass1) r0
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
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9924b.m20071b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.AbstractC9924b.m20071b(r6)
                        vd.d r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Object r5 = p325rc.AbstractC10947g0.m23946o0(r5)
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
                        qc.q r5 = p309qc.C10786q.f26013a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.C48392.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = workStatusPojoFlowDataForIds.collect(new C48392(interfaceC11595d), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        });
    }

    public static final InterfaceC11594c getWorkStatusPojoFlowForName(WorkSpecDao workSpecDao, AbstractC11106e0 dispatcher, String name) {
        AbstractC9979u.m20294g(workSpecDao, "<this>");
        AbstractC9979u.m20294g(dispatcher, "dispatcher");
        AbstractC9979u.m20294g(name, "name");
        return dedup(workSpecDao.getWorkStatusPojoFlowForName(name), dispatcher);
    }

    public static final InterfaceC11594c getWorkStatusPojoFlowForTag(WorkSpecDao workSpecDao, AbstractC11106e0 dispatcher, String tag) {
        AbstractC9979u.m20294g(workSpecDao, "<this>");
        AbstractC9979u.m20294g(dispatcher, "dispatcher");
        AbstractC9979u.m20294g(tag, "tag");
        return dedup(workSpecDao.getWorkStatusPojoFlowForTag(tag), dispatcher);
    }
}
