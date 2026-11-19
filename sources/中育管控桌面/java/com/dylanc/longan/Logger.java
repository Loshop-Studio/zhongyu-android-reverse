package com.dylanc.longan;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p054f1.C6294f;
import p054f1.InterfaceC6293e;

/* loaded from: classes3.dex */
public interface Logger {

    /* renamed from: a */
    public static final Companion f3268a = Companion.f3269a;

    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f3269a = new Companion();

        /* renamed from: b */
        public static Function2 f3270b = new Function2<Integer, String, Boolean>() { // from class: com.dylanc.longan.Logger$Companion$isLoggable$1
            /* renamed from: a */
            public final Boolean m3337a(int i6, String noName_1) {
                Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
                return Boolean.TRUE;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, String str) {
                return m3337a(num.intValue(), str);
            }
        };

        /* renamed from: c */
        public static InterfaceC6293e f3271c = new C6294f();

        /* renamed from: a */
        public final InterfaceC6293e m3335a() {
            return f3271c;
        }

        /* renamed from: b */
        public final Function2 m3336b() {
            return f3270b;
        }
    }
}
