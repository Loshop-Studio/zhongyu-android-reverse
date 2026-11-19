package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5834o;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

@Stable
@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0017\"\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m5110d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "", "key", "", "tracked", "arity", "<init>", "(IZI)V", "Ld6/s;", "trackWrite", "()V", "Landroidx/compose/runtime/Composer;", "composer", "trackRead", "(Landroidx/compose/runtime/Composer;)V", "params", "realParamCount", "(I)I", "", "block", "update", "(Ljava/lang/Object;)V", "", "args", "invoke", "([Ljava/lang/Object;)Ljava/lang/Object;", "I", "getKey", "()I", "Z", "getArity", "_block", "Ljava/lang/Object;", "Landroidx/compose/runtime/RecomposeScope;", "scope", "Landroidx/compose/runtime/RecomposeScope;", "", "scopes", "Ljava/util/List;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n37#2,2:182\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n114#1:182,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    public static final int $stable = 0;

    @Nullable
    private Object _block;
    private final int arity;
    private final int key;

    @Nullable
    private RecomposeScope scope;

    @Nullable
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i, boolean z8, int i8) {
        this.key = i;
        this.tracked = z8;
        this.arity = i8;
    }

    private final int realParamCount(int params) {
        int i = params - 2;
        for (int i8 = 1; i8 * 10 < i; i8++) {
            i--;
        }
        return i;
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
        for (int i = 0; i < size; i++) {
            if (ComposableLambdaKt.replacableWith(list.get(i), recomposeScope)) {
                list.set(i, recomposeScope);
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
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, kotlin.jvm.internal.InterfaceC5827h
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN
    @Nullable
    public Object invoke(@NotNull final Object... args) {
        final int iRealParamCount = realParamCount(args.length);
        Object obj = args[iRealParamCount];
        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = AbstractC5802q.m5199Z(args, AbstractC5806u.m5260N(0, args.length - 1)).toArray(new Object[0]);
        Object obj2 = args[args.length - 1];
        AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Composer composerStartRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = iIntValue | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(iRealParamCount) : ComposableLambdaKt.sameBits(iRealParamCount));
        Object obj3 = this._block;
        AbstractC5830k.m5328e(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        C5834o c5834o = new C5834o(2);
        c5834o.m5346d(array);
        c5834o.m5343a(Integer.valueOf(iDifferentBits));
        ArrayList arrayList = c5834o.f9224a;
        Object objInvoke = ((ComposableLambdaN) obj3).invoke(arrayList.toArray(new Object[arrayList.size()]));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl.invoke.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5) {
                    invoke((Composer) obj4, ((Number) obj5).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer, int i) {
                    Object[] array2 = AbstractC5802q.m5199Z(args, AbstractC5806u.m5260N(0, iRealParamCount)).toArray(new Object[0]);
                    Object obj4 = args[iRealParamCount + 1];
                    AbstractC5830k.m5328e(obj4, "null cannot be cast to non-null type kotlin.Int");
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(((Integer) obj4).intValue());
                    int length = (args.length - iRealParamCount) - 2;
                    Object[] objArr = new Object[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object obj5 = args[iRealParamCount + 2 + i8];
                        AbstractC5830k.m5328e(obj5, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i8] = Integer.valueOf(RecomposeScopeImplKt.updateChangedFlags(((Integer) obj5).intValue()));
                    }
                    ComposableLambdaNImpl composableLambdaNImpl = this;
                    C5834o c5834o2 = new C5834o(4);
                    c5834o2.m5346d(array2);
                    c5834o2.m5343a(composer);
                    c5834o2.m5343a(Integer.valueOf(iUpdateChangedFlags | 1));
                    c5834o2.m5346d(objArr);
                    ArrayList arrayList2 = c5834o2.f9224a;
                    composableLambdaNImpl.invoke(arrayList2.toArray(new Object[arrayList2.size()]));
                }
            });
        }
        return objInvoke;
    }

    public final void update(@NotNull Object block) {
        if (AbstractC5830k.m5325b(block, this._block)) {
            return;
        }
        boolean z8 = this._block == null;
        AbstractC5830k.m5328e(block, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this._block = (ComposableLambdaN) block;
        if (z8) {
            return;
        }
        trackWrite();
    }
}
