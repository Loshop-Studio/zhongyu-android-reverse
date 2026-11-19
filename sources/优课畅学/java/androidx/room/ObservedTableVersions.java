package androidx.room;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

/* loaded from: classes3.dex */
public final class ObservedTableVersions {
    private final InterfaceC9271h versions;

    @InterfaceC9539d(m17800c = "androidx.room.ObservedTableVersions", m17801f = "InvalidationTracker.kt", m17802l = {TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE}, m17803m = "collect")
    /* renamed from: androidx.room.ObservedTableVersions$collect$1 */
    public static final class C45201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C45201(InterfaceC9324c<? super C45201> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ObservedTableVersions.this.collect(null, this);
        }
    }

    public ObservedTableVersions(int i10) {
        this.versions = AbstractC9281r.m17054a(new int[i10]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(p169l8.InterfaceC9267d r5, p179m7.InterfaceC9324c<?> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.room.ObservedTableVersions.C45201
            if (r0 == 0) goto L13
            r0 = r6
            androidx.room.ObservedTableVersions$collect$1 r0 = (androidx.room.ObservedTableVersions.C45201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.ObservedTableVersions$collect$1 r0 = new androidx.room.ObservedTableVersions$collect$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.AbstractC9079b.m15926b(r6)
            goto L3f
        L31:
            kotlin.AbstractC9079b.m15926b(r6)
            l8.h r6 = r4.versions
            r0.label = r3
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ObservedTableVersions.collect(l8.d, m7.c):java.lang.Object");
    }

    public final void increment(Set<Integer> tableIds) {
        Object value;
        int[] iArr;
        AbstractC9133u.m16133g(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        InterfaceC9271h interfaceC9271h = this.versions;
        do {
            value = interfaceC9271h.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = tableIds.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!interfaceC9271h.mo16686e(value, iArr));
    }
}
