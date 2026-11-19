package p340t1;

import android.text.TextUtils;
import com.alibaba.android.arouter.utils.Consts;
import p329s1.AbstractC11047n;

/* renamed from: t1.f */
/* loaded from: classes3.dex */
public class C11205f implements InterfaceC11202c {
    @Override // p340t1.InterfaceC11202c
    /* renamed from: a */
    public String mo24912a(String str) {
        String strM24926b = m24926b(str);
        String strM24486d = AbstractC11047n.m24486d(str);
        if (TextUtils.isEmpty(strM24926b)) {
            return strM24486d;
        }
        return strM24486d + Consts.DOT + strM24926b;
    }

    /* renamed from: b */
    public final String m24926b(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf == -1 || iLastIndexOf <= str.lastIndexOf(47) || iLastIndexOf + 6 <= str.length()) ? "" : str.substring(iLastIndexOf + 1);
    }
}
