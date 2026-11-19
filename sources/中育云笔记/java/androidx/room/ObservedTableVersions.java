package androidx.room;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class ObservedTableVersions {
    private final InterfaceC11603l versions;

    @InterfaceC11829d(m26210c = "androidx.room.ObservedTableVersions", m26211f = "InvalidationTracker.kt", m26212l = {TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE}, m26213m = "collect")
    /* renamed from: androidx.room.ObservedTableVersions$collect$1 */
    public static final class C44681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C44681(InterfaceC11588c<? super C44681> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ObservedTableVersions.this.collect(null, this);
        }
    }

    public ObservedTableVersions(int i10) {
        this.versions = AbstractC11613v.m25602a(new int[i10]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(p379vd.InterfaceC11595d r5, vc.InterfaceC11588c<?> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.room.ObservedTableVersions.C44681
            if (r0 == 0) goto L13
            r0 = r6
            androidx.room.ObservedTableVersions$collect$1 r0 = (androidx.room.ObservedTableVersions.C44681) r0
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.AbstractC9924b.m20071b(r6)
            goto L3f
        L31:
            kotlin.AbstractC9924b.m20071b(r6)
            vd.l r6 = r4.versions
            r0.label = r3
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ObservedTableVersions.collect(vd.d, vc.c):java.lang.Object");
    }

    public final void increment(Set<Integer> tableIds) {
        Object value;
        int[] iArr;
        AbstractC9979u.m20294g(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        InterfaceC11603l interfaceC11603l = this.versions;
        do {
            value = interfaceC11603l.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = tableIds.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!interfaceC11603l.mo20870e(value, iArr));
    }
}
