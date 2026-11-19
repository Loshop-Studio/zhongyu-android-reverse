package io.objectbox;

import com.google.flatbuffers.C3821a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.objectbox.e */
/* loaded from: classes3.dex */
public final class C5701e {

    /* renamed from: a */
    public final C3821a f8958a = new C3821a();

    /* renamed from: b */
    public final ArrayList f8959b = new ArrayList();

    /* renamed from: c */
    public Integer f8960c;

    /* renamed from: d */
    public Long f8961d;

    /* renamed from: e */
    public Integer f8962e;

    /* renamed from: f */
    public Long f8963f;

    /* renamed from: g */
    public Integer f8964g;

    /* renamed from: h */
    public Long f8965h;

    /* renamed from: a */
    public final int m5059a(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        C3821a c3821a = this.f8958a;
        boolean z8 = c3821a.f2959f;
        if (z8) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        if (z8) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        c3821a.f2964k = size;
        int i8 = 4 * size;
        c3821a.m2773h(4, i8);
        c3821a.m2773h(4, i8);
        c3821a.f2959f = true;
        for (int i9 = size - 1; i9 >= 0; i9--) {
            int i10 = iArr[i9];
            c3821a.m2773h(4, 0);
            c3821a.m2774i((c3821a.m2772g() - i10) + 4);
        }
        if (!c3821a.f2959f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        c3821a.f2959f = false;
        c3821a.m2774i(c3821a.f2964k);
        return c3821a.m2772g();
    }
}
