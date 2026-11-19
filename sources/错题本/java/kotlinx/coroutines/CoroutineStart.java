package kotlinx.coroutines;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import org.jetbrains.annotations.NotNull;
import p000a.AbstractC0000a;
import p045d6.C5443s;
import p054e7.AbstractC5469a;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p092j6.InterfaceC5748a;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6683l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J[\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\b\u00072\u0006\u0010\t\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0087\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m5110d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lh6/c;", "", "Lkotlin/ExtensionFunctionType;", "block", "receiver", "completion", "Ld6/s;", "invoke", "(Lr6/e;Ljava/lang/Object;Lh6/c;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class CoroutineStart {

    @DelicateCoroutinesApi
    public static final CoroutineStart ATOMIC;
    public static final CoroutineStart DEFAULT;
    public static final CoroutineStart LAZY;
    public static final CoroutineStart UNDISPATCHED;

    /* renamed from: a */
    public static final /* synthetic */ CoroutineStart[] f9273a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f9274b;

    static {
        CoroutineStart coroutineStart = new CoroutineStart("DEFAULT", 0);
        DEFAULT = coroutineStart;
        CoroutineStart coroutineStart2 = new CoroutineStart("LAZY", 1);
        LAZY = coroutineStart2;
        CoroutineStart coroutineStart3 = new CoroutineStart("ATOMIC", 2);
        ATOMIC = coroutineStart3;
        CoroutineStart coroutineStart4 = new CoroutineStart("UNDISPATCHED", 3);
        UNDISPATCHED = coroutineStart4;
        CoroutineStart[] coroutineStartArr = {coroutineStart, coroutineStart2, coroutineStart3, coroutineStart4};
        f9273a = coroutineStartArr;
        f9274b = AbstractC5817a.m5310a(coroutineStartArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f9274b;
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void isLazy$annotations() {
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) f9273a.clone();
    }

    @InternalCoroutinesApi
    public final <R, T> void invoke(@NotNull InterfaceC6473e block, R receiver, @NotNull InterfaceC5631c<? super T> completion) {
        Object objInvoke;
        int i = AbstractC6012w.f9516a[ordinal()];
        if (i == 1) {
            AbstractC0000a.m13p(block, receiver, completion);
            return;
        }
        if (i == 2) {
            AbstractC5830k.m5330g(block, "<this>");
            AbstractC5830k.m5330g(completion, "completion");
            AbstractC6683l.m6374n(AbstractC6683l.m6365e(block, receiver, completion)).resumeWith(Result.m13956constructorimpl(C5443s.f8405a));
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        AbstractC5830k.m5330g(completion, "completion");
        try {
            InterfaceC5636h context = completion.getContext();
            Object objM4838n = AbstractC5469a.m4838n(context, null);
            try {
                if (block instanceof BaseContinuationImpl) {
                    AbstractC5835p.m5354c(2, block);
                    objInvoke = block.invoke(receiver, completion);
                } else {
                    objInvoke = AbstractC6683l.m6379s(block, receiver, completion);
                }
                AbstractC5469a.m4831g(context, objM4838n);
                if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    completion.resumeWith(Result.m13956constructorimpl(objInvoke));
                }
            } catch (Throwable th) {
                AbstractC5469a.m4831g(context, objM4838n);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            completion.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(th)));
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
