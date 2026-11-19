package androidx.compose.p011ui.tooling.preview.datasource;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C5803r;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.C5842c;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p214z6.AbstractC6833k;
import p214z6.C6823a;
import p214z6.C6824b;
import p214z6.C6826d;
import p214z6.C6835m;
import p214z6.InterfaceC6825c;
import p214z6.InterfaceC6830h;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m5110d2 = {"Landroidx/compose/ui/tooling/preview/datasource/LoremIpsum;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "", "words", "<init>", "(I)V", "()V", "generateLoremIpsum", "(I)Ljava/lang/String;", "I", "Lz6/h;", "getValues", "()Lz6/h;", "values", "ui-tooling-preview_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;
    private final int words;

    public LoremIpsum(int i) {
        this.words = i;
    }

    private final String generateLoremIpsum(int words) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        final int size = LoremIpsum_androidKt.LOREM_IPSUM_SOURCE.size();
        InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.ui.tooling.preview.datasource.LoremIpsum.generateLoremIpsum.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final String invoke() {
                List list = LoremIpsum_androidKt.LOREM_IPSUM_SOURCE;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                int i = ref$IntRef2.element;
                ref$IntRef2.element = i + 1;
                return (String) list.get(i % size);
            }
        };
        InterfaceC6830h c6823a = new C6823a(new C5842c(interfaceC6469a, new C6835m(interfaceC6469a, 0)));
        if (words >= 0) {
            return AbstractC6833k.m6496w(words == 0 ? C6826d.f11565a : c6823a instanceof InterfaceC6825c ? ((InterfaceC6825c) c6823a).mo6487b(words) : new C6824b(c6823a, words, 1), " ");
        }
        throw new IllegalArgumentException(AbstractC0037f.m82g(words, "Requested element count ", " is less than zero.").toString());
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    @NotNull
    public InterfaceC6830h getValues() {
        return new C5803r(new String[]{generateLoremIpsum(this.words)}, 0);
    }

    public LoremIpsum() {
        this(500);
    }
}
