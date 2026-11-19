package kotlin.reflect;

import com.zykj.message.client.BuildConfig;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: KDeclarationContainer.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18d2 = {"Lkotlin/reflect/KDeclarationContainer;", BuildConfig.FLAVOR, "members", BuildConfig.FLAVOR, "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "kotlin-stdlib"}, m19k = 1, m20mv = {1, 4, 0})
/* loaded from: classes.dex */
public interface KDeclarationContainer {
    Collection<KCallable<?>> getMembers();
}
