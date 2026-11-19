package com.tendcloud.tenddata;

import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.tendcloud.tenddata.cw */
/* loaded from: classes5.dex */
public class C7918cw {

    /* renamed from: a */
    static final Queue<String> f14643a;

    static {
        LinkedList linkedList = new LinkedList();
        f14643a = linkedList;
        linkedList.add(C7842aa.f14242c);
        linkedList.add(C7842aa.f14243d);
        linkedList.add(C7842aa.f14244e);
    }

    /* renamed from: a */
    public static URL m11649a(URL url, String str) {
        return C7903ch.m11528b() ? url : new URL(url.getProtocol(), str, url.getPort(), url.getFile());
    }

    /* renamed from: a */
    public static void m11650a(String str) {
        Queue<String> queue = f14643a;
        if (queue.contains(str)) {
            C7896ca.eForInternal("host existed...");
        } else {
            queue.add(str);
        }
    }

    /* renamed from: a */
    public static String m11648a() {
        return f14643a.poll();
    }
}
