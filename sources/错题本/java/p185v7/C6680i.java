package p185v7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: v7.i */
/* loaded from: classes4.dex */
public final class C6680i implements InvocationHandler {

    /* renamed from: a */
    public final ArrayList f11265a;

    /* renamed from: b */
    public boolean f11266b;

    /* renamed from: c */
    public String f11267c;

    public C6680i(ArrayList arrayList) {
        this.f11265a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        AbstractC5830k.m5330g(proxy, "proxy");
        AbstractC5830k.m5330g(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC5830k.m5325b(name, "supports") && AbstractC5830k.m5325b(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC5830k.m5325b(name, "unsupported") && AbstractC5830k.m5325b(Void.TYPE, returnType)) {
            this.f11266b = true;
            return null;
        }
        boolean zM5325b = AbstractC5830k.m5325b(name, "protocols");
        ArrayList arrayList = this.f11265a;
        if (zM5325b && objArr.length == 0) {
            return arrayList;
        }
        if ((AbstractC5830k.m5325b(name, "selectProtocol") || AbstractC5830k.m5325b(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj2 = list.get(i);
                        AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f11267c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f11267c = str2;
                return str2;
            }
        }
        if ((!AbstractC5830k.m5325b(name, "protocolSelected") && !AbstractC5830k.m5325b(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        AbstractC5830k.m5328e(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f11267c = (String) obj3;
        return null;
    }
}
