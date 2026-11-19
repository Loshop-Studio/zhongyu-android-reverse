package kotlin.sequences;

import com.zykj.message.client.BuildConfig;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Sequence.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010(\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¨\u0006\u0005"}, m18d2 = {"Lkotlin/sequences/Sequence;", "T", BuildConfig.FLAVOR, "iterator", BuildConfig.FLAVOR, "kotlin-stdlib"}, m19k = 1, m20mv = {1, 4, 0})
/* loaded from: classes.dex */
public interface Sequence<T> {
    Iterator<T> iterator();
}
