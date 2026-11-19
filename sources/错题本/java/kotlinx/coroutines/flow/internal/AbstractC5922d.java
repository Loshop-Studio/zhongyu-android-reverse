package kotlinx.coroutines.flow.internal;

import androidx.collection.AbstractC0584a;
import java.util.ArrayList;
import kotlin.collections.AbstractC5805t;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C5883l;
import kotlinx.coroutines.channels.InterfaceC5884m;
import kotlinx.coroutines.channels.InterfaceC5886o;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.flow.internal.d */
/* loaded from: classes4.dex */
public abstract class AbstractC5922d implements InterfaceC5929k {

    /* renamed from: a */
    public final InterfaceC5636h f9390a;

    /* renamed from: b */
    public final int f9391b;

    /* renamed from: c */
    public final BufferOverflow f9392c;

    public AbstractC5922d(InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow) {
        this.f9390a = interfaceC5636h;
        this.f9391b = i;
        this.f9392c = bufferOverflow;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // kotlinx.coroutines.flow.internal.InterfaceC5929k
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC5910f mo5520b(p075h6.InterfaceC5636h r5, int r6, kotlinx.coroutines.channels.BufferOverflow r7) {
        /*
            r4 = this;
            h6.h r0 = r4.f9390a
            h6.h r5 = r5.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlinx.coroutines.channels.BufferOverflow r2 = r4.f9392c
            int r3 = r4.f9391b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.AbstractC5830k.m5325b(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            kotlinx.coroutines.flow.internal.d r5 = r4.mo5522f(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.AbstractC5922d.mo5520b(h6.h, int, kotlinx.coroutines.channels.BufferOverflow):kotlinx.coroutines.flow.f");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5910f
    public Object collect(InterfaceC5912g interfaceC5912g, InterfaceC5631c interfaceC5631c) {
        Object objM5637h = AbstractC6014x.m5637h(new ChannelFlow$collect$2(interfaceC5912g, this, null), interfaceC5631c);
        return objM5637h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5637h : C5443s.f8405a;
    }

    /* renamed from: d */
    public String mo5523d() {
        return null;
    }

    /* renamed from: e */
    public abstract Object mo5521e(InterfaceC5884m interfaceC5884m, InterfaceC5631c interfaceC5631c);

    /* renamed from: f */
    public abstract AbstractC5922d mo5522f(InterfaceC5636h interfaceC5636h, int i, BufferOverflow bufferOverflow);

    /* renamed from: g */
    public InterfaceC5910f mo5524g() {
        return null;
    }

    /* renamed from: h */
    public InterfaceC5886o mo5525h(InterfaceC6009v interfaceC6009v) {
        int i = this.f9391b;
        if (i == -3) {
            i = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        C5883l c5883l = new C5883l(AbstractC6014x.m5652w(interfaceC6009v, this.f9390a), AbstractC5882k.m5511a(i, 4, this.f9392c));
        coroutineStart.invoke(channelFlow$collectToFun$1, c5883l, c5883l);
        return c5883l;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo5523d = mo5523d();
        if (strMo5523d != null) {
            arrayList.add(strMo5523d);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        InterfaceC5636h interfaceC5636h = this.f9390a;
        if (interfaceC5636h != emptyCoroutineContext) {
            arrayList.add("context=" + interfaceC5636h);
        }
        int i = this.f9391b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow2 = this.f9392c;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return AbstractC0584a.m911l(']', AbstractC5805t.m5234n0(arrayList, ", ", null, null, null, 62), sb);
    }
}
