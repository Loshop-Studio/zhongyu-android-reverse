package okio;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractC5786f;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Options;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\u0019B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m5110d2 = {"Lokio/TypedOptions;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/collections/f;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "list", "Lokio/Options;", "options", "<init>", "(Ljava/util/List;Lokio/Options;)V", "", "index", "get", "(I)Ljava/lang/Object;", "Lokio/Options;", "getOptions$okio", "()Lokio/Options;", "Ljava/util/List;", "getList$okio", "()Ljava/util/List;", "getSize", "()I", "size", "Companion", "okio"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class TypedOptions<T> extends AbstractC5786f implements RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<T> list;

    @NotNull
    private final Options options;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, m5110d2 = {"Lokio/TypedOptions$Companion;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "", "values", "Lkotlin/Function1;", "Lokio/ByteString;", "encode", "Lokio/TypedOptions;", "of", "(Ljava/lang/Iterable;Lr6/c;)Lokio/TypedOptions;", "okio"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        /* renamed from: of */
        public final <T> TypedOptions<T> m5994of(@NotNull Iterable<? extends T> values, @NotNull InterfaceC6471c encode) {
            AbstractC5830k.m5330g(values, "values");
            AbstractC5830k.m5330g(encode, "encode");
            List listM5217D0 = AbstractC5805t.m5217D0(values);
            Options.Companion companion = Options.INSTANCE;
            int size = listM5217D0.size();
            ByteString[] byteStringArr = new ByteString[size];
            for (int i = 0; i < size; i++) {
                byteStringArr[i] = encode.invoke(listM5217D0.get(i));
            }
            return new TypedOptions<>(listM5217D0, companion.m5992of(byteStringArr));
        }

        private Companion() {
        }
    }

    public TypedOptions(@NotNull List<? extends T> list, @NotNull Options options) {
        AbstractC5830k.m5330g(list, "list");
        AbstractC5830k.m5330g(options, "options");
        this.options = options;
        List<T> listM5217D0 = AbstractC5805t.m5217D0(list);
        this.list = listM5217D0;
        if (listM5217D0.size() != options.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: of */
    public static final <T> TypedOptions<T> m5993of(@NotNull Iterable<? extends T> iterable, @NotNull InterfaceC6471c interfaceC6471c) {
        return INSTANCE.m5994of(iterable, interfaceC6471c);
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.List
    @NotNull
    public T get(int index) {
        return this.list.get(index);
    }

    @NotNull
    public final List<T> getList$okio() {
        return this.list;
    }

    @NotNull
    /* renamed from: getOptions$okio, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    @Override // kotlin.collections.AbstractC5786f, kotlin.collections.AbstractC5775a
    /* renamed from: getSize */
    public int get_size() {
        return this.list.size();
    }
}
