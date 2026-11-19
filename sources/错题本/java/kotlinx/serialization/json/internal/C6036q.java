package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import p045d6.AbstractC5425a;
import p045d6.C5427c;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p125n7.AbstractC6235j;
import p125n7.AbstractC6250y;
import p125n7.C6229d;
import p125n7.C6232g;
import p125n7.C6241p;
import p125n7.C6243r;
import p125n7.C6246u;
import p152r6.InterfaceC6474f;

/* renamed from: kotlinx.serialization.json.internal.q */
/* loaded from: classes4.dex */
public final class C6036q {

    /* renamed from: a */
    public final C6043x f9574a;

    /* renamed from: b */
    public int f9575b;

    public C6036q(C6232g c6232g, C6043x c6043x) {
        this.f9574a = c6043x;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5701a(kotlinx.serialization.json.internal.C6036q r12, p045d6.AbstractC5426b r13, kotlin.coroutines.jvm.internal.BaseContinuationImpl r14) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C6036q.m5701a(kotlinx.serialization.json.internal.q, d6.b, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* renamed from: b */
    public final AbstractC6235j m5702b() {
        AbstractC6235j c6246u;
        Object obj;
        C6043x c6043x = this.f9574a;
        byte bM5722q = c6043x.m5722q();
        if (bM5722q == 1) {
            return m5704d(true);
        }
        if (bM5722q == 0) {
            return m5704d(false);
        }
        if (bM5722q != 6) {
            if (bM5722q == 8) {
                return m5703c();
            }
            C6043x.m5706m(c6043x, "Cannot read Json element because of unexpected ".concat(AbstractC6029j.m5698s(bM5722q)), 0, null, 6);
            throw null;
        }
        int i = this.f9575b + 1;
        this.f9575b = i;
        if (i == 200) {
            JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this, null);
            Object obj2 = AbstractC5425a.f8388a;
            C5427c c5427c = new C5427c();
            c5427c.f8389a = jsonTreeReader$readDeepRecursive$1;
            c5427c.f8390b = c5427c;
            Object obj3 = AbstractC5425a.f8388a;
            c5427c.f8391c = obj3;
            while (true) {
                obj = c5427c.f8391c;
                InterfaceC5631c interfaceC5631c = c5427c.f8390b;
                if (interfaceC5631c == null) {
                    break;
                }
                if (Result.m13958equalsimpl0(obj3, obj)) {
                    try {
                        InterfaceC6474f interfaceC6474f = c5427c.f8389a;
                        C5443s c5443s = C5443s.f8405a;
                        AbstractC5835p.m5354c(3, interfaceC6474f);
                        Object objInvoke = interfaceC6474f.invoke(c5427c, c5443s, interfaceC5631c);
                        if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            interfaceC5631c.resumeWith(Result.m13956constructorimpl(objInvoke));
                        }
                    } catch (Throwable th) {
                        interfaceC5631c.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(th)));
                    }
                } else {
                    c5427c.f8391c = obj3;
                    interfaceC5631c.resumeWith(obj);
                }
            }
            AbstractC5774b.m5119b(obj);
            c6246u = (AbstractC6235j) obj;
        } else {
            byte bM5712f = c6043x.m5712f((byte) 6);
            if (c6043x.m5722q() == 4) {
                C6043x.m5706m(c6043x, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!c6043x.m5708b()) {
                    break;
                }
                String strM5715i = c6043x.m5715i();
                c6043x.m5712f((byte) 5);
                linkedHashMap.put(strM5715i, m5702b());
                bM5712f = c6043x.m5711e();
                if (bM5712f != 4) {
                    if (bM5712f != 7) {
                        C6043x.m5706m(c6043x, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bM5712f == 6) {
                c6043x.m5712f((byte) 7);
            } else if (bM5712f == 4) {
                AbstractC6029j.m5692m(c6043x, "object");
                throw null;
            }
            c6246u = new C6246u(linkedHashMap);
        }
        this.f9575b--;
        return c6246u;
    }

    /* renamed from: c */
    public final C6229d m5703c() {
        C6043x c6043x = this.f9574a;
        byte bM5711e = c6043x.m5711e();
        if (c6043x.m5722q() == 4) {
            C6043x.m5706m(c6043x, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c6043x.m5708b()) {
            arrayList.add(m5702b());
            bM5711e = c6043x.m5711e();
            if (bM5711e != 4) {
                boolean z8 = bM5711e == 9;
                int i = c6043x.f9597b;
                if (!z8) {
                    C6043x.m5706m(c6043x, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bM5711e == 8) {
            c6043x.m5712f((byte) 9);
        } else if (bM5711e == 4) {
            AbstractC6029j.m5692m(c6043x, "array");
            throw null;
        }
        return new C6229d(arrayList);
    }

    /* renamed from: d */
    public final AbstractC6250y m5704d(boolean z8) {
        C6043x c6043x = this.f9574a;
        String strM5716j = !z8 ? c6043x.m5716j() : c6043x.m5715i();
        return (z8 || !AbstractC5830k.m5325b(strM5716j, "null")) ? new C6241p(strM5716j, z8) : C6243r.INSTANCE;
    }
}
