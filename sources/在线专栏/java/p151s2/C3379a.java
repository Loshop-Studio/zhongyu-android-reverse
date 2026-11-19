package p151s2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p179z2.AbstractC3515c;
import p179z2.C3514b;

/* renamed from: s2.a */
/* loaded from: classes.dex */
public class C3379a {

    /* renamed from: s2.a$a */
    private static final class a {

        /* renamed from: a */
        @NotNull
        public static final a f11863a = new a();

        /* renamed from: b */
        @Nullable
        public static final Method f11864b;

        /* renamed from: c */
        @Nullable
        public static final Method f11865c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
        static {
            /*
                s2.a$a r0 = new s2.a$a
                r0.<init>()
                p151s2.C3379a.a.f11863a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.C2769l.m9240d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L15:
                r5 = 0
                if (r4 >= r2) goto L41
                r6 = r1[r4]
                int r4 = r4 + 1
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.C2769l.m9237a(r7, r8)
                if (r7 == 0) goto L3d
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.C2769l.m9240d(r7, r8)
                java.lang.Object r7 = kotlin.collections.C2717d.m9074v(r7)
                boolean r7 = kotlin.jvm.internal.C2769l.m9237a(r7, r0)
                if (r7 == 0) goto L3d
                r7 = 1
                goto L3e
            L3d:
                r7 = 0
            L3e:
                if (r7 == 0) goto L15
                goto L42
            L41:
                r6 = r5
            L42:
                p151s2.C3379a.a.f11864b = r6
                int r0 = r1.length
            L45:
                if (r3 >= r0) goto L58
                r2 = r1[r3]
                int r3 = r3 + 1
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.C2769l.m9237a(r4, r6)
                if (r4 == 0) goto L45
                r5 = r2
            L58:
                p151s2.C3379a.a.f11865c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p151s2.C3379a.a.<clinit>():void");
        }

        private a() {
        }
    }

    /* renamed from: a */
    public void mo10291a(@NotNull Throwable cause, @NotNull Throwable exception) {
        C2769l.m9241e(cause, "cause");
        C2769l.m9241e(exception, "exception");
        Method method = a.f11864b;
        if (method == null) {
            return;
        }
        method.invoke(cause, exception);
    }

    @NotNull
    /* renamed from: b */
    public AbstractC3515c mo10292b() {
        return new C3514b();
    }
}
