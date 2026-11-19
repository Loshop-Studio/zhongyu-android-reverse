package androidx.compose.p013ui.tooling.preview.datasource;

import androidx.compose.p013ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import p101f8.AbstractC8476n;
import p101f8.AbstractC8479q;
import p101f8.InterfaceC8469g;
import p300x7.InterfaceC10559a;

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
        return AbstractC8479q.m13857z(AbstractC8479q.m13841D(AbstractC8476n.m13834i(new InterfaceC10559a() { // from class: androidx.compose.ui.tooling.preview.datasource.LoremIpsum.generateLoremIpsum.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final String invoke() {
                List list = LoremIpsum_androidKt.LOREM_IPSUM_SOURCE;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                int i11 = ref$IntRef2.f17471a;
                ref$IntRef2.f17471a = i11 + 1;
                return (String) list.get(i11 % size);
            }
        }), i10), " ", null, null, 0, null, null, 62, null);
    }

    @Override // androidx.compose.p013ui.tooling.preview.PreviewParameterProvider
    public InterfaceC8469g getValues() {
        return AbstractC8476n.m13837l(generateLoremIpsum(this.words));
    }

    public LoremIpsum() {
        this(TbsListener.ErrorCode.INFO_CODE_MINIQB);
    }
}
