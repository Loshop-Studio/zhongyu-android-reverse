package androidx.compose.p014ui.layout;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9717a;

/* loaded from: classes2.dex */
public /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements InterfaceC9544p {
    public static final AlignmentLineKt$FirstBaseline$1 INSTANCE = new AlignmentLineKt$FirstBaseline$1();

    public AlignmentLineKt$FirstBaseline$1() {
        super(2, AbstractC9717a.class, "min", "min(II)I", 1);
    }

    public final Integer invoke(int i10, int i11) {
        return Integer.valueOf(Math.min(i10, i11));
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
