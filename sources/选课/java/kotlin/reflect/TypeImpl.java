package kotlin.reflect;

import com.zykj.message.client.BuildConfig;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: TypesJVM.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bc\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m18d2 = {"Lkotlin/reflect/TypeImpl;", "Ljava/lang/reflect/Type;", "getTypeName", BuildConfig.FLAVOR, "kotlin-stdlib"}, m19k = 1, m20mv = {1, 4, 0})
/* loaded from: classes.dex */
interface TypeImpl extends Type {
    String getTypeName();
}
