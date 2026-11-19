package p223q5;

import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.enums.SelectGraphEnum;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p117g5.InterfaceC8055c;
import p127h5.C8099b;
import p127h5.C8101d;
import p147j5.C8215b;

/* renamed from: q5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9361a {

    /* renamed from: a */
    public static final List f16277a = CollectionsKt.listOf((Object[]) new SelectGraphEnum[]{SelectGraphEnum.STROKE, SelectGraphEnum.STROKE_HIGHLIGHTER, SelectGraphEnum.IMAGE, SelectGraphEnum.TEXT, SelectGraphEnum.GEOMETRY});

    /* renamed from: a */
    public static final SelectGraphEnum m15335a(InterfaceC8055c interfaceC8055c) {
        Intrinsics.checkNotNullParameter(interfaceC8055c, "<this>");
        if (interfaceC8055c instanceof ImageGraph) {
            return SelectGraphEnum.IMAGE;
        }
        if (interfaceC8055c instanceof C8099b) {
            return SelectGraphEnum.GEOMETRY;
        }
        if (interfaceC8055c instanceof C8101d) {
            return SelectGraphEnum.TEXT;
        }
        List<InterfaceC8055c> listMo12796e = interfaceC8055c.mo12796e();
        if (listMo12796e == null || !listMo12796e.isEmpty()) {
            for (InterfaceC8055c interfaceC8055c2 : listMo12796e) {
                if (!(interfaceC8055c2 instanceof C8215b) || !((C8215b) interfaceC8055c2).m13242H()) {
                    return SelectGraphEnum.STROKE;
                }
            }
        }
        return SelectGraphEnum.STROKE_HIGHLIGHTER;
    }

    /* renamed from: b */
    public static final List m15336b() {
        return f16277a;
    }
}
