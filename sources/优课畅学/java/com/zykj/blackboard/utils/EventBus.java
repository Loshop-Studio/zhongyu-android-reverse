package com.zykj.blackboard.utils;

import java.util.HashMap;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class EventBus {
    public static final EventBus INSTANCE = new EventBus();
    private static final HashMap<EventKey, InterfaceC10559a> methodHashMap = new HashMap<>();

    private EventBus() {
    }

    public final void clear() {
        methodHashMap.clear();
    }

    public final void post(EventKey eventKey) {
        InterfaceC10559a interfaceC10559a;
        AbstractC9133u.m16133g(eventKey, "eventKey");
        HashMap<EventKey, InterfaceC10559a> map = methodHashMap;
        if (map.get(eventKey) == null || (interfaceC10559a = map.get(eventKey)) == null) {
            return;
        }
        interfaceC10559a.invoke();
    }

    public final void register(EventKey eventKey, InterfaceC10559a function) {
        AbstractC9133u.m16133g(eventKey, "eventKey");
        AbstractC9133u.m16133g(function, "function");
        methodHashMap.put(eventKey, function);
    }

    public final void unregister(EventKey eventKey) {
        AbstractC9133u.m16133g(eventKey, "eventKey");
        methodHashMap.remove(eventKey);
    }
}
