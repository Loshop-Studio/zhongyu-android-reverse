package kotlin.text;

import com.zykj.message.client.BuildConfig;
import kotlin.Metadata;

/* compiled from: MatchResult.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002¨\u0006\u0006"}, m18d2 = {"Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/text/MatchGroupCollection;", "get", "Lkotlin/text/MatchGroup;", "name", BuildConfig.FLAVOR, "kotlin-stdlib"}, m19k = 1, m20mv = {1, 4, 0})
/* loaded from: classes.dex */
public interface MatchNamedGroupCollection extends MatchGroupCollection {
    MatchGroup get(String name);
}
