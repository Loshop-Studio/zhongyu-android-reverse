package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: org.tensorflow.lite.b */
/* loaded from: classes6.dex */
public final class C10588b implements AutoCloseable {

    /* renamed from: c */
    public NativeInterpreterWrapper f25550c;

    /* renamed from: org.tensorflow.lite.b$a */
    public static class a {

        /* renamed from: b */
        public Boolean f25552b;

        /* renamed from: c */
        public Boolean f25553c;

        /* renamed from: d */
        public Boolean f25554d;

        /* renamed from: e */
        public Boolean f25555e;

        /* renamed from: f */
        public Boolean f25556f;

        /* renamed from: a */
        public int f25551a = -1;

        /* renamed from: g */
        public final List f25557g = new ArrayList();

        /* renamed from: a */
        public a m22406a(int i10) {
            this.f25551a = i10;
            return this;
        }
    }

    public C10588b(ByteBuffer byteBuffer, a aVar) {
        this.f25550c = new NativeInterpreterWrapper(byteBuffer, aVar);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f25550c;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.f25550c = null;
        }
    }

    /* renamed from: e */
    public final void m22403e() {
        if (this.f25550c == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    /* renamed from: f */
    public void m22404f(Object obj, Object obj2) {
        HashMap map = new HashMap();
        map.put(0, obj2);
        m22405g(new Object[]{obj}, map);
    }

    public void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public void m22405g(Object[] objArr, Map map) {
        m22403e();
        this.f25550c.m22379j(objArr, map);
    }
}
