package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

@Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J;\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m7880d2 = {"Lkotlinx/serialization/internal/ParametrizedSerializerCache;", ExifInterface.GPS_DIRECTION_TRUE, "", "get", "Lkotlin/Result;", "Lkotlinx/serialization/KSerializer;", "key", "Lkotlin/reflect/KClass;", "types", "", "Lkotlin/reflect/KType;", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "kotlinx-serialization-core"}, m7881k = 1, m7882mv = {2, 0, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public interface ParametrizedSerializerCache<T> {

    @Metadata(m7881k = 3, m7882mv = {2, 0, 0}, m7884xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: get-gIAlu-s$default, reason: not valid java name */
        public static /* synthetic */ Object m18732getgIAlus$default(ParametrizedSerializerCache parametrizedSerializerCache, KClass kClass, List list, int i6, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
            }
            if ((i6 & 2) != 0) {
                list = CollectionsKt.emptyList();
            }
            return parametrizedSerializerCache.mo18728getgIAlus(kClass, list);
        }
    }

    /* renamed from: get-gIAlu-s */
    Object mo18728getgIAlus(KClass<Object> key, List<? extends KType> types);
}
