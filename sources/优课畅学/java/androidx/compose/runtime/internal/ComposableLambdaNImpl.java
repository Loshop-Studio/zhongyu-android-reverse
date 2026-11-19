package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9112b0;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p134i7.AbstractC8801r;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10582x;

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

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, kotlin.jvm.internal.InterfaceC9130r
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, p300x7.InterfaceC10582x
    public Object invoke(final Object... objArr) {
        final int iRealParamCount = realParamCount(objArr.length);
        Object obj = objArr[iRealParamCount];
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = AbstractC8801r.m14704e1(objArr, AbstractC8323h.m13525t(0, objArr.length - 1)).toArray(new Object[0]);
        Object obj2 = objArr[objArr.length - 1];
        AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Composer composerStartRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = iIntValue | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(iRealParamCount) : ComposableLambdaKt.sameBits(iRealParamCount));
        Object obj3 = this._block;
        AbstractC9133u.m16131e(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        C9112b0 c9112b0 = new C9112b0(2);
        c9112b0.m16089b(array);
        c9112b0.m16088a(Integer.valueOf(iDifferentBits));
        Object objInvoke = ((InterfaceC10582x) obj3).invoke(c9112b0.m16091d(new Object[c9112b0.m16090c()]));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((Composer) obj4, ((Number) obj5).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer, int i10) {
                    Object[] array2 = AbstractC8801r.m14704e1(objArr, AbstractC8323h.m13525t(0, iRealParamCount)).toArray(new Object[0]);
                    Object obj4 = objArr[iRealParamCount + 1];
                    AbstractC9133u.m16131e(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(((Integer) obj4).intValue());
                    int length = (objArr.length - iRealParamCount) - 2;
                    Object[] objArr2 = new Object[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        Object obj5 = objArr[iRealParamCount + 2 + i11];
                        AbstractC9133u.m16131e(obj5, "null cannot be cast to non-null type kotlin.Int");
                        objArr2[i11] = Integer.valueOf(RecomposeScopeImplKt.updateChangedFlags(((Integer) obj5).intValue()));
                    }
                    ComposableLambdaNImpl composableLambdaNImpl = this;
                    C9112b0 c9112b02 = new C9112b0(4);
                    c9112b02.m16089b(array2);
                    c9112b02.m16088a(composer);
                    c9112b02.m16088a(Integer.valueOf(iUpdateChangedFlags | 1));
                    c9112b02.m16089b(objArr2);
                    composableLambdaNImpl.invoke(c9112b02.m16091d(new Object[c9112b02.m16090c()]));
                }
            });
        }
        return objInvoke;
    }

    public final void update(Object obj) {
        if (AbstractC9133u.m16128b(obj, this._block)) {
            return;
        }
        boolean z10 = this._block == null;
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this._block = (InterfaceC10582x) obj;
        if (z10) {
            return;
        }
        trackWrite();
    }
}
