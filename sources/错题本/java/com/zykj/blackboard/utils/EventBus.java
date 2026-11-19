package com.zykj.blackboard.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\fR<\u0010\u0011\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000fj\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m5110d2 = {"Lcom/zykj/blackboard/utils/EventBus;", "", "<init>", "()V", "Lcom/zykj/blackboard/utils/EventKey;", "eventKey", "Lkotlin/Function0;", "Ld6/s;", "function", "register", "(Lcom/zykj/blackboard/utils/EventKey;Lr6/a;)V", "unregister", "(Lcom/zykj/blackboard/utils/EventKey;)V", "clear", "post", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "methodHashMap", "Ljava/util/HashMap;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EventBus {

    @NotNull
    public static final EventBus INSTANCE = new EventBus();

    @NotNull
    private static final HashMap<EventKey, InterfaceC6469a> methodHashMap = new HashMap<>();

    private EventBus() {
    }

    public final void clear() {
        methodHashMap.clear();
    }

    public final void post(@NotNull EventKey eventKey) {
        InterfaceC6469a interfaceC6469a;
        AbstractC5830k.m5330g(eventKey, "eventKey");
        HashMap<EventKey, InterfaceC6469a> map = methodHashMap;
        if (map.get(eventKey) == null || (interfaceC6469a = map.get(eventKey)) == null) {
            return;
        }
        interfaceC6469a.invoke();
    }

    public final void register(@NotNull EventKey eventKey, @NotNull InterfaceC6469a function) {
        AbstractC5830k.m5330g(eventKey, "eventKey");
        AbstractC5830k.m5330g(function, "function");
        methodHashMap.put(eventKey, function);
    }

    public final void unregister(@NotNull EventKey eventKey) {
        AbstractC5830k.m5330g(eventKey, "eventKey");
        methodHashMap.remove(eventKey);
    }
}
