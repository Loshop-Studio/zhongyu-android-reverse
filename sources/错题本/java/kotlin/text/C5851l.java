package kotlin.text;

import androidx.navigation.C2861i;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC5775a;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import p200x6.C6756f;
import p214z6.AbstractC6833k;
import p214z6.C6838p;

/* renamed from: kotlin.text.l */
/* loaded from: classes4.dex */
public final class C5851l extends AbstractC5775a {

    /* renamed from: a */
    public final /* synthetic */ C5852m f9263a;

    public C5851l(C5852m c5852m) {
        this.f9263a = c5852m;
    }

    /* renamed from: a */
    public final C5849j m5369a(int i) {
        Matcher matcher = this.f9263a.f9264a;
        C6756f c6756fM5260N = AbstractC5806u.m5260N(matcher.start(i), matcher.end(i));
        if (c6756fM5260N.f11420a < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        AbstractC5830k.m5329f(strGroup, "group(...)");
        return new C5849j(strGroup, c6756fM5260N);
    }

    @Override // kotlin.collections.AbstractC5775a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof C5849j) {
            return super.contains((C5849j) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC5775a
    /* renamed from: getSize */
    public final int get_size() {
        return this.f9263a.f9264a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractC5775a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6838p(AbstractC6833k.m6498y(AbstractC5805t.m5223c0(new C6756f(0, size() - 1, 1)), new C2861i(this, 24)));
    }
}
