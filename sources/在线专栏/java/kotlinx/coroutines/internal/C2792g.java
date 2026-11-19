package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.collections.C2731m;
import kotlin.collections.C2735q;
import kotlin.collections.C2738t;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p082e3.C2495u;
import p082e3.C2496v;
import p128o2.C2909b;
import p163v2.C3424a;

/* renamed from: kotlinx.coroutines.internal.g */
/* loaded from: classes.dex */
public final class C2792g {

    /* renamed from: a */
    @NotNull
    public static final C2792g f10760a = new C2792g();

    private C2792g() {
    }

    /* renamed from: a */
    private final <S> S m9291a(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final <S> List<S> m9292b(Class<S> cls, ClassLoader classLoader) {
        try {
            return m9296d(cls, classLoader);
        } catch (Throwable unused) {
            return C2738t.m9163K(ServiceLoader.load(cls, classLoader));
        }
    }

    /* renamed from: e */
    private final List<String> m9293e(URL url) throws IOException {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!C2495u.m8340C(string, "jar", false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> listM9294f = f10760a.m9294f(bufferedReader);
                C3424a.m10441a(bufferedReader, null);
                return listM9294f;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String strM8363F0 = C2496v.m8363F0(C2496v.m8411y0(string, "jar:file:", null, 2, null), '!', null, 2, null);
        String strM8411y0 = C2496v.m8411y0(string, "!/", null, 2, null);
        JarFile jarFile = new JarFile(strM8363F0, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strM8411y0)), "UTF-8"));
            try {
                List<String> listM9294f2 = f10760a.m9294f(bufferedReader);
                C3424a.m10441a(bufferedReader, null);
                jarFile.close();
                return listM9294f2;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    C2909b.m9982a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    /* renamed from: f */
    private final List<String> m9294f(BufferedReader bufferedReader) throws IOException {
        boolean z3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return C2738t.m9163K(linkedHashSet);
            }
            String strM8365G0 = C2496v.m8365G0(line, "#", null, 2, null);
            Objects.requireNonNull(strM8365G0, "null cannot be cast to non-null type kotlin.CharSequence");
            String string = C2496v.m8367H0(strM8365G0).toString();
            int i4 = 0;
            while (true) {
                if (i4 >= string.length()) {
                    z3 = true;
                    break;
                }
                char cCharAt = string.charAt(i4);
                if (!(cCharAt == '.' || Character.isJavaIdentifierPart(cCharAt))) {
                    z3 = false;
                    break;
                }
                i4++;
            }
            if (!z3) {
                throw new IllegalArgumentException(C2769l.m9248l("Illegal service provider class name: ", string).toString());
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    @NotNull
    /* renamed from: c */
    public final List<MainDispatcherFactory> m9295c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!C2793h.m9297a()) {
            return m9292b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return m9292b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    @NotNull
    /* renamed from: d */
    public final <S> List<S> m9296d(@NotNull Class<S> cls, @NotNull ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(C2769l.m9248l("META-INF/services/", cls.getName())));
        C2769l.m9240d(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2735q.m9151r(arrayList, f10760a.m9293e((URL) it.next()));
        }
        Set setM9166N = C2738t.m9166N(arrayList);
        if (!(!setM9166N.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(C2731m.m9149p(setM9166N, 10));
        Iterator it2 = setM9166N.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f10760a.m9291a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
