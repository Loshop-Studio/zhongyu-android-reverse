package androidx.compose.p014ui.tooling.preview.datasource;

import androidx.compose.p014ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9529a;
import p296pd.AbstractC10666n;
import p296pd.AbstractC10669q;
import p296pd.InterfaceC10659g;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;
    private final int words;

    public LoremIpsum(int i10) {
        this.words = i10;
    }

    private final String generateLoremIpsum(int i10) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        final int size = LoremIpsum_androidKt.LOREM_IPSUM_SOURCE.size();
        return AbstractC10669q.m22588z(AbstractC10669q.m22572D(AbstractC10666n.m22564h(new InterfaceC9529a() { // from class: androidx.compose.ui.tooling.preview.datasource.LoremIpsum.generateLoremIpsum.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final String invoke() {
                List list = LoremIpsum_androidKt.LOREM_IPSUM_SOURCE;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                int i11 = ref$IntRef2.f23400c;
                ref$IntRef2.f23400c = i11 + 1;
                return (String) list.get(i11 % size);
            }
        }), i10), " ", null, null, 0, null, null, 62, null);
    }

    @Override // androidx.compose.p014ui.tooling.preview.PreviewParameterProvider
    public InterfaceC10659g getValues() {
        return AbstractC10666n.m22568l(generateLoremIpsum(this.words));
    }

    public LoremIpsum() {
        this(500);
    }
}
