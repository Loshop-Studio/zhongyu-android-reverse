package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9958b0;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9552x;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p325rc.AbstractC10968r;

@Stable
/* loaded from: classes2.dex */
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    public static final int $stable = 0;
    private Object _block;
    private final int arity;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i10, boolean z10, int i11) {
        this.key = i10;
        this.tracked = z10;
        this.arity = i11;
    }

    private final int realParamCount(int i10) {
        int i11 = i10 - 2;
        for (int i12 = 1; i12 * 10 < i11; i12++) {
            i11--;
        }
        return i11;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        List<RecomposeScope> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (ComposableLambdaKt.replacableWith(list.get(i10), recomposeScope)) {
                list.set(i10, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, kotlin.jvm.internal.InterfaceC9976r
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, p181hd.InterfaceC9552x
    public Object invoke(final Object... objArr) {
        final int iRealParamCount = realParamCount(objArr.length);
        Object obj = objArr[iRealParamCount];
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = AbstractC10968r.m24068a1(objArr, AbstractC10410o.m21768u(0, objArr.length - 1)).toArray(new Object[0]);
        Object obj2 = objArr[objArr.length - 1];
        AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Composer composerStartRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = iIntValue | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(iRealParamCount) : ComposableLambdaKt.sameBits(iRealParamCount));
        Object obj3 = this._block;
        AbstractC9979u.m20292e(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        C9958b0 c9958b0 = new C9958b0(2);
        c9958b0.m20247b(array);
        c9958b0.m20246a(Integer.valueOf(iDifferentBits));
        Object objInvoke = ((InterfaceC9552x) obj3).invoke(c9958b0.m20249d(new Object[c9958b0.m20248c()]));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((Composer) obj4, ((Number) obj5).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer, int i10) {
                    Object[] array2 = AbstractC10968r.m24068a1(objArr, AbstractC10410o.m21768u(0, iRealParamCount)).toArray(new Object[0]);
                    Object obj4 = objArr[iRealParamCount + 1];
                    AbstractC9979u.m20292e(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(((Integer) obj4).intValue());
                    int length = (objArr.length - iRealParamCount) - 2;
                    Object[] objArr2 = new Object[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        Object obj5 = objArr[iRealParamCount + 2 + i11];
                        AbstractC9979u.m20292e(obj5, "null cannot be cast to non-null type kotlin.Int");
                        objArr2[i11] = Integer.valueOf(RecomposeScopeImplKt.updateChangedFlags(((Integer) obj5).intValue()));
                    }
                    ComposableLambdaNImpl composableLambdaNImpl = this;
                    C9958b0 c9958b02 = new C9958b0(4);
                    c9958b02.m20247b(array2);
                    c9958b02.m20246a(composer);
                    c9958b02.m20246a(Integer.valueOf(iUpdateChangedFlags | 1));
                    c9958b02.m20247b(objArr2);
                    composableLambdaNImpl.invoke(c9958b02.m20249d(new Object[c9958b02.m20248c()]));
                }
            });
        }
        return objInvoke;
    }

    public final void update(Object obj) {
        if (AbstractC9979u.m20289b(obj, this._block)) {
            return;
        }
        boolean z10 = this._block == null;
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this._block = (InterfaceC9552x) obj;
        if (z10) {
            return;
        }
        trackWrite();
    }
}
