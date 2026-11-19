package com.zykj.mistake.feature.notebook.detail;

import android.graphics.Bitmap;
import coil3.AbstractC3330o;
import coil3.InterfaceC3305k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6286b;
import okhttp3.C6330r;
import p171u.InterfaceC6608a;

/* renamed from: com.zykj.mistake.feature.notebook.detail.z4 */
/* loaded from: classes3.dex */
public final class C4916z4 implements InterfaceC6608a {

    /* renamed from: a */
    public final /* synthetic */ int f7432a;

    /* renamed from: b */
    public int f7433b;

    /* renamed from: c */
    public final ArrayList f7434c;

    /* renamed from: d */
    public ArrayList f7435d;

    /* renamed from: e */
    public Object f7436e;

    /* renamed from: f */
    public Object f7437f;

    /* renamed from: g */
    public Object f7438g;

    /* renamed from: h */
    public Serializable f7439h;

    /* renamed from: i */
    public Serializable f7440i;

    public C4916z4(C4764a5 c4764a5, C4791f c4791f, ArrayList arrayList, AtomicInteger atomicInteger, ArrayList arrayList2, int i, C4791f c4791f2, AtomicInteger atomicInteger2) {
        this.f7432a = 0;
        this.f7436e = c4764a5;
        this.f7437f = c4791f;
        this.f7434c = arrayList;
        this.f7439h = atomicInteger;
        this.f7435d = arrayList2;
        this.f7433b = i;
        this.f7438g = c4791f2;
        this.f7440i = atomicInteger2;
    }

    /* renamed from: a */
    public C6330r m4285a() {
        ArrayList arrayList;
        String str = (String) this.f7436e;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strM5880e = C6286b.m5880e((String) this.f7437f, 0, 0, 7);
        String strM5880e2 = C6286b.m5880e((String) this.f7438g, 0, 0, 7);
        String str2 = (String) this.f7439h;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iM4286b = m4286b();
        ArrayList arrayList2 = this.f7434c;
        ArrayList arrayList3 = new ArrayList(AbstractC5806u.m5277p(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(C6286b.m5880e((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = this.f7435d;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC5806u.m5277p(arrayList4, 10));
            int size2 = arrayList4.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = arrayList4.get(i8);
                i8++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? C6286b.m5880e(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f7440i;
        return new C6330r(str, strM5880e, strM5880e2, str2, iM4286b, arrayList3, arrayList, str4 != null ? C6286b.m5880e(str4, 0, 0, 7) : null, toString());
    }

    /* renamed from: b */
    public int m4286b() {
        int i = this.f7433b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.f7436e;
        AbstractC5830k.m5327d(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: c */
    public void m4287c(String str) {
        String strM5878b;
        this.f7435d = (str == null || (strM5878b = C6286b.m5878b(str, 0, " \"'<>#", 0, 211)) == null) ? null : C6286b.m5881f(strM5878b);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4288d(okhttp3.C6330r r18, java.lang.String r19) throws java.lang.NumberFormatException, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.C4916z4.m4288d(okhttp3.r, java.lang.String):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/z4.smali:568
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: f */
    public void mo112f(InterfaceC3305k interfaceC3305k) {
        C4764a5.m4165a((C4764a5) this.f7436e, (C4791f) this.f7437f, this.f7434c, (AtomicInteger) this.f7439h);
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: m */
    public void mo119m(InterfaceC3305k interfaceC3305k) {
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: q */
    public void mo123q(InterfaceC3305k interfaceC3305k) {
        Bitmap bitmapM2272j = AbstractC3330o.m2272j(interfaceC3305k);
        ArrayList arrayList = this.f7435d;
        arrayList.set(this.f7433b, bitmapM2272j);
        C4764a5.m4165a((C4764a5) this.f7436e, (C4791f) this.f7438g, arrayList, (AtomicInteger) this.f7440i);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.C4916z4.toString():java.lang.String"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/z4.smali:2605
    }

    public C4916z4() {
        this.f7432a = 1;
        this.f7437f = "";
        this.f7438g = "";
        this.f7433b = -1;
        ArrayList arrayList = new ArrayList();
        this.f7434c = arrayList;
        arrayList.add("");
    }
}
