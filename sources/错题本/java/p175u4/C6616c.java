package p175u4;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailContract$EntryMode;
import com.zykj.view.board.play.C5353b;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;

@StabilityInferred(parameters = 1)
@Serializable
/* renamed from: u4.c */
/* loaded from: classes3.dex */
public final class C6616c {

    @NotNull
    public static final C6615b Companion = new C6615b();

    /* renamed from: e */
    public static final InterfaceC5429e[] f11064e = {null, null, null, AbstractC5773a.m5116a(LazyThreadSafetyMode.PUBLICATION, new C5353b(26))};

    /* renamed from: a */
    public final String f11065a;

    /* renamed from: b */
    public final String f11066b;

    /* renamed from: c */
    public final int f11067c;

    /* renamed from: d */
    public final MistakeCollectionDetailContract$EntryMode f11068d;

    public /* synthetic */ C6616c(int i, String str, String str2, int i8, MistakeCollectionDetailContract$EntryMode mistakeCollectionDetailContract$EntryMode) {
        this.f11065a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f11066b = "错题集";
        } else {
            this.f11066b = str2;
        }
        if ((i & 4) == 0) {
            this.f11067c = 0;
        } else {
            this.f11067c = i8;
        }
        if ((i & 8) == 0) {
            this.f11068d = MistakeCollectionDetailContract$EntryMode.EXISTING;
        } else {
            this.f11068d = mistakeCollectionDetailContract$EntryMode;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6616c)) {
            return false;
        }
        C6616c c6616c = (C6616c) obj;
        return AbstractC5830k.m5325b(this.f11065a, c6616c.f11065a) && AbstractC5830k.m5325b(this.f11066b, c6616c.f11066b) && this.f11067c == c6616c.f11067c && this.f11068d == c6616c.f11068d;
    }

    public final int hashCode() {
        return this.f11068d.hashCode() + AbstractC0584a.m902c(this.f11067c, AbstractC0584a.m903d(this.f11065a.hashCode() * 31, 31, this.f11066b), 31);
    }

    public final String toString() {
        StringBuilder sbM101z = AbstractC0037f.m101z("CollectionDetailRouteArgs(collectionId=", this.f11065a, ", title=", this.f11066b, ", currentCount=");
        sbM101z.append(this.f11067c);
        sbM101z.append(", entryMode=");
        sbM101z.append(this.f11068d);
        sbM101z.append(")");
        return sbM101z.toString();
    }

    public C6616c(String collectionId, String title, int i, MistakeCollectionDetailContract$EntryMode entryMode) {
        AbstractC5830k.m5330g(collectionId, "collectionId");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(entryMode, "entryMode");
        this.f11065a = collectionId;
        this.f11066b = title;
        this.f11067c = i;
        this.f11068d = entryMode;
    }
}
