package androidx.compose.p013ui.layout;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10574p;
import p322z7.AbstractC10727a;

/* loaded from: classes2.dex */
public /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements InterfaceC10574p {
    public static final AlignmentLineKt$LastBaseline$1 INSTANCE = new AlignmentLineKt$LastBaseline$1();

    public AlignmentLineKt$LastBaseline$1() {
        super(2, AbstractC10727a.class, "max", "max(II)I", 1);
    }

    public final Integer invoke(int i10, int i11) {
        return Integer.valueOf(Math.max(i10, i11));
    }

    @Override // p300x7.InterfaceC10574p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
