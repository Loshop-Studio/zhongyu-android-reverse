package p101k7;

import coil3.network.AbstractC3315g;
import java.util.List;
import kotlin.collections.EmptyList;

/* renamed from: k7.g */
/* loaded from: classes4.dex */
public interface InterfaceC5765g {
    /* renamed from: b */
    default boolean mo5099b() {
        return false;
    }

    /* renamed from: c */
    int mo5100c(String str);

    /* renamed from: d */
    int mo5101d();

    /* renamed from: e */
    String mo5102e(int i);

    /* renamed from: f */
    List mo5103f(int i);

    /* renamed from: g */
    InterfaceC5765g mo5104g(int i);

    default List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    AbstractC3315g getKind();

    /* renamed from: h */
    String mo5105h();

    /* renamed from: i */
    boolean mo5106i(int i);

    default boolean isInline() {
        return false;
    }
}
