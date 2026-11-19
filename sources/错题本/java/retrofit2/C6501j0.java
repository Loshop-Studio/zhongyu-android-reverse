package retrofit2;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* renamed from: retrofit2.j0 */
/* loaded from: classes4.dex */
public final class C6501j0 extends C6484b {

    /* renamed from: h */
    public final /* synthetic */ int f10707h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6501j0(int i) {
        super(7);
        this.f10707h = i;
    }

    @Override // retrofit2.C6484b
    /* renamed from: c */
    public String mo6140c(Method method, int i) {
        switch (this.f10707h) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                    break;
                } else {
                    break;
                }
        }
        return super.mo6140c(method, i);
    }

    @Override // retrofit2.C6484b
    /* renamed from: d */
    public final Object mo6141d(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f10707h) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return AbstractC6522v.m6169k(method, cls, obj, objArr);
                }
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            default:
                return AbstractC6522v.m6169k(method, cls, obj, objArr);
        }
    }

    @Override // retrofit2.C6484b
    /* renamed from: e */
    public final boolean mo6142e(Method method) {
        switch (this.f10707h) {
        }
        return method.isDefault();
    }
}
