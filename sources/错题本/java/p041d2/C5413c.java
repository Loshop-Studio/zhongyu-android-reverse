package p041d2;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import coil3.InterfaceC3305k;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.json.internal.AbstractC6021b;
import kotlinx.serialization.json.internal.C6022c;
import p016b0.InterfaceC3072g0;
import p077i0.C5666v;
import p120n0.InterfaceC6207a;
import p140q.C6397a;
import p140q.C6404h;
import p202y.C6763f;

/* renamed from: d2.c */
/* loaded from: classes3.dex */
public final class C5413c implements InterfaceC5411a, InterfaceC6207a {

    /* renamed from: a */
    public final /* synthetic */ int f8373a;

    /* renamed from: b */
    public int f8374b;

    /* renamed from: c */
    public Object f8375c;

    @Override // p120n0.InterfaceC6207a
    /* renamed from: a */
    public InterfaceC3072g0 mo2017a(InterfaceC3072g0 interfaceC3072g0, C6763f c6763f) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC3072g0.get()).compress((Bitmap.CompressFormat) this.f8375c, this.f8374b, byteArrayOutputStream);
        interfaceC3072g0.recycle();
        return new C5666v(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: c */
    public void m4802c() {
        WeakReference weakReference;
        int i = this.f8374b;
        this.f8374b = i + 1;
        if (i >= 10) {
            this.f8374b = 0;
            Iterator it = ((LinkedHashMap) this.f8375c).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    C6404h c6404h = (C6404h) AbstractC5805t.m5229i0(arrayList);
                    if (((c6404h == null || (weakReference = c6404h.f10511a) == null) ? null : (InterfaceC3305k) weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i8 = 0;
                    for (int i9 = 0; i9 < size; i9++) {
                        int i10 = i9 - i8;
                        if (((C6404h) arrayList.get(i10)).f10511a.get() == null) {
                            arrayList.remove(i10);
                            i8++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m4803d(int i, int i8) {
        int i9 = i8 + i;
        char[] cArr = (char[]) this.f8375c;
        if (cArr.length <= i9) {
            int i10 = i * 2;
            if (i9 < i10) {
                i9 = i10;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i9);
            AbstractC5830k.m5329f(cArrCopyOf, "copyOf(...)");
            this.f8375c = cArrCopyOf;
        }
    }

    /* renamed from: e */
    public boolean m4804e() {
        return this.f8374b < ((ArrayList) this.f8375c).size();
    }

    /* renamed from: f */
    public void m4805f() {
        C6022c c6022c = C6022c.f9545c;
        char[] array = (char[]) this.f8375c;
        c6022c.getClass();
        AbstractC5830k.m5330g(array, "array");
        synchronized (c6022c) {
            int i = c6022c.f9547b;
            if (array.length + i < AbstractC6021b.f9544a) {
                c6022c.f9547b = i + array.length;
                c6022c.f9546a.addLast(array);
            }
        }
    }

    /* renamed from: g */
    public void m4806g(C6397a c6397a, InterfaceC3305k interfaceC3305k, Map map, long j7) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8375c;
        Object arrayList = linkedHashMap.get(c6397a);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(c6397a, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        C6404h c6404h = new C6404h(new WeakReference(interfaceC3305k), map, j7);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                C6404h c6404h2 = (C6404h) arrayList2.get(i);
                if (j7 < c6404h2.f10513c) {
                    i++;
                } else if (c6404h2.f10511a.get() == interfaceC3305k) {
                    arrayList2.set(i, c6404h);
                } else {
                    arrayList2.add(i, c6404h);
                }
            }
        } else {
            arrayList2.add(c6404h);
        }
        m4802c();
    }

    @Override // p041d2.InterfaceC5411a
    public int getState() {
        return this.f8374b;
    }

    /* renamed from: h */
    public void m4807h(String text) {
        AbstractC5830k.m5330g(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        m4803d(this.f8374b, length);
        text.getChars(0, text.length(), (char[]) this.f8375c, this.f8374b);
        this.f8374b += length;
    }

    @Override // p041d2.InterfaceC5411a
    public void hide() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((View) this.f8375c).getScaleX(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new C5412b(this, 1));
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f8374b = 0;
    }

    @Override // p041d2.InterfaceC5411a
    public void show() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((View) this.f8375c).getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C5412b(this, 0));
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        this.f8374b = 1;
    }

    public String toString() {
        switch (this.f8373a) {
            case 1:
                return new String((char[]) this.f8375c, 0, this.f8374b);
            default:
                return super.toString();
        }
    }

    public C5413c(int i) {
        this.f8373a = i;
        switch (i) {
            case 4:
                this.f8375c = new LinkedHashMap();
                break;
            default:
                this.f8375c = Bitmap.CompressFormat.JPEG;
                this.f8374b = 100;
                break;
        }
    }

    public C5413c(ArrayList arrayList) {
        this.f8373a = 3;
        this.f8375c = arrayList;
    }

    @Override // p041d2.InterfaceC5411a
    /* renamed from: b */
    public void mo4801b(int i) {
    }
}
