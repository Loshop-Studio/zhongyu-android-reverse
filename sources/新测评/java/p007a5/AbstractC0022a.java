package p007a5;

import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.enums.SelectGraphEnum;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p210q4.InterfaceC8888c;
import p221r4.C9006b;
import p221r4.C9008d;
import p243t4.C9383b;

/* renamed from: a5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC0022a {

    /* renamed from: a */
    public static final List f57a = CollectionsKt.listOf((Object[]) new SelectGraphEnum[]{SelectGraphEnum.STROKE, SelectGraphEnum.STROKE_HIGHLIGHTER, SelectGraphEnum.IMAGE, SelectGraphEnum.TEXT, SelectGraphEnum.GEOMETRY});

    /* renamed from: a */
    public static final SelectGraphEnum m62a(InterfaceC8888c interfaceC8888c) {
        Intrinsics.checkNotNullParameter(interfaceC8888c, "<this>");
        if (interfaceC8888c instanceof ImageGraph) {
            return SelectGraphEnum.IMAGE;
        }
        if (interfaceC8888c instanceof C9006b) {
            return SelectGraphEnum.GEOMETRY;
        }
        if (interfaceC8888c instanceof C9008d) {
            return SelectGraphEnum.TEXT;
        }
        List<InterfaceC8888c> listMo14995f = interfaceC8888c.mo14995f();
        if (listMo14995f == null || !listMo14995f.isEmpty()) {
            for (InterfaceC8888c interfaceC8888c2 : listMo14995f) {
                if (!(interfaceC8888c2 instanceof C9383b) || !((C9383b) interfaceC8888c2).m15691I()) {
                    return SelectGraphEnum.STROKE;
                }
            }
        }
        return SelectGraphEnum.STROKE_HIGHLIGHTER;
    }

    /* renamed from: b */
    public static final List m63b() {
        return f57a;
    }
}
