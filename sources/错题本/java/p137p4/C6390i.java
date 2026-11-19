package p137p4;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.mistake.feature.mistake.model.MistakeTagType;
import com.zykj.view.board.play.C5353b;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p118m7.AbstractC6191y0;

@StabilityInferred(parameters = 1)
@Serializable
/* renamed from: p4.i */
/* loaded from: classes3.dex */
public final class C6390i {

    @NotNull
    public static final C6389h Companion = new C6389h();

    /* renamed from: d */
    public static final InterfaceC5429e[] f10479d = {null, AbstractC5773a.m5116a(LazyThreadSafetyMode.PUBLICATION, new C5353b(23)), null};

    /* renamed from: a */
    public final String f10480a;

    /* renamed from: b */
    public final MistakeTagType f10481b;

    /* renamed from: c */
    public final Integer f10482c;

    public /* synthetic */ C6390i(int i, String str, MistakeTagType mistakeTagType, Integer num) {
        if (3 != (i & 3)) {
            AbstractC6191y0.m5841k(C6388g.f10478a.getDescriptor(), i, 3);
            throw null;
        }
        this.f10480a = str;
        this.f10481b = mistakeTagType;
        if ((i & 4) == 0) {
            this.f10482c = null;
        } else {
            this.f10482c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6390i)) {
            return false;
        }
        C6390i c6390i = (C6390i) obj;
        return AbstractC5830k.m5325b(this.f10480a, c6390i.f10480a) && this.f10481b == c6390i.f10481b && AbstractC5830k.m5325b(this.f10482c, c6390i.f10482c);
    }

    public final int hashCode() {
        int iHashCode = (this.f10481b.hashCode() + (this.f10480a.hashCode() * 31)) * 31;
        Integer num = this.f10482c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "MistakeTagUiState(text=" + this.f10480a + ", type=" + this.f10481b + ", tagId=" + this.f10482c + ")";
    }

    public C6390i(String text, MistakeTagType type, Integer num) {
        AbstractC5830k.m5330g(text, "text");
        AbstractC5830k.m5330g(type, "type");
        this.f10480a = text;
        this.f10481b = type;
        this.f10482c = num;
    }
}
