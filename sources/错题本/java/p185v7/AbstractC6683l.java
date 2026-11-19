package p185v7;

import android.opengl.GLES20;
import android.support.v4.media.AbstractC0037f;
import android.view.View;
import android.view.animation.ScaleAnimation;
import androidx.camera.core.impl.C0362d;
import androidx.navigation.internal.C2865d;
import com.google.gson.C3842h;
import com.zykj.mistake.network.C5088a;
import io.reactivex.internal.operators.observable.C5714j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.AbstractC5774b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import kotlin.text.AbstractC5844e;
import okhttp3.C6337y;
import okhttp3.C6338z;
import okio.FileSystem;
import okio.Path;
import p016b0.C3065d;
import p030c6.AbstractC3234f;
import p032c8.C3240e;
import p047d8.C5449a;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p084i7.C5687c;
import p084i7.InterfaceC5685a;
import p084i7.InterfaceC5686b;
import p109l7.InterfaceC6069c;
import p115m4.C6104b;
import p115m4.C6105c;
import p115m4.InterfaceC6103a;
import p115m4.InterfaceC6106d;
import p118m7.AbstractC6120b;
import p118m7.AbstractC6191y0;
import p133o7.AbstractC6281e;
import p133o7.C6280d;
import p151r5.AbstractC6465b;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p153r7.AbstractC6479a;
import p153r7.C6480b;
import p153r7.C6481c;
import p207y6.InterfaceC6779c;
import p214z6.C6831i;

/* renamed from: v7.l */
/* loaded from: classes4.dex */
public abstract class AbstractC6683l {
    /* renamed from: a */
    public static final void m6361a(AbstractC6479a abstractC6479a, C6480b c6480b, String str) {
        C6481c.f10657i.fine(c6480b.f10651b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC6479a.f10646a);
    }

    /* renamed from: b */
    public static final String m6362b(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    /* renamed from: c */
    public static void m6363c(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new RuntimeException(str + ": glError " + iGlGetError);
    }

    /* renamed from: d */
    public static final void m6364d(int i, String str) {
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbM94s = AbstractC0037f.m94s(i, "Expected '-' (hyphen) at index ", ", but was '");
        sbM94s.append(str.charAt(i));
        sbM94s.append('\'');
        throw new IllegalArgumentException(sbM94s.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static InterfaceC5631c m6365e(final InterfaceC6473e interfaceC6473e, final Object obj, final InterfaceC5631c completion) {
        AbstractC5830k.m5330g(interfaceC6473e, "<this>");
        AbstractC5830k.m5330g(completion, "completion");
        if (interfaceC6473e instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) interfaceC6473e).create(obj, completion);
        }
        final InterfaceC5636h context = completion.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(completion, interfaceC6473e, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ InterfaceC6473e $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(completion);
                this.$this_createCoroutineUnintercepted$inlined = interfaceC6473e;
                this.$receiver$inlined = obj;
                AbstractC5830k.m5328e(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.label = 2;
                    AbstractC5774b.m5119b(result);
                    return result;
                }
                this.label = 1;
                AbstractC5774b.m5119b(result);
                AbstractC5830k.m5328e(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                InterfaceC6473e interfaceC6473e2 = this.$this_createCoroutineUnintercepted$inlined;
                AbstractC5835p.m5354c(2, interfaceC6473e2);
                return interfaceC6473e2.invoke(this.$receiver$inlined, this);
            }
        } : new ContinuationImpl(completion, context, interfaceC6473e, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ InterfaceC6473e $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(completion, context);
                this.$this_createCoroutineUnintercepted$inlined = interfaceC6473e;
                this.$receiver$inlined = obj;
                AbstractC5830k.m5328e(completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.label = 2;
                    AbstractC5774b.m5119b(result);
                    return result;
                }
                this.label = 1;
                AbstractC5774b.m5119b(result);
                AbstractC5830k.m5328e(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                InterfaceC6473e interfaceC6473e2 = this.$this_createCoroutineUnintercepted$inlined;
                AbstractC5835p.m5354c(2, interfaceC6473e2);
                return interfaceC6473e2.invoke(this.$receiver$inlined, this);
            }
        };
    }

    /* renamed from: f */
    public static void m6366f(FileSystem fileSystem, Path path) throws IOException {
        if (fileSystem.exists(path)) {
            return;
        }
        try {
            fileSystem.sink(path).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static final void m6367g(FileSystem fileSystem, Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.list(path)) {
                try {
                    if (fileSystem.metadata(path2).getIsDirectory()) {
                        m6367g(fileSystem, path2);
                    }
                    fileSystem.delete(path2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* renamed from: h */
    public static void m6368h(String url, String localPath, InterfaceC6106d interfaceC6106d) {
        AbstractC5830k.m5330g(url, "url");
        AbstractC5830k.m5330g(localPath, "localPath");
        C6337y c6337y = new C6337y();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c6337y.m5980a(60L, timeUnit);
        c6337y.m5982c(60L, timeUnit);
        c6337y.m5981b(60L, timeUnit);
        int i = 0;
        c6337y.f10297c.add(new C6104b(interfaceC6106d, i));
        C6338z c6338z = new C6338z(c6337y);
        C5088a c5088a = C5088a.f7986a;
        int i8 = 1;
        int length = url.length() - 1;
        int i9 = 0;
        boolean z8 = false;
        while (i9 <= length) {
            boolean z9 = AbstractC5830k.m5332i(url.charAt(!z8 ? i9 : length), 32) <= 0;
            if (z8) {
                if (!z9) {
                    break;
                } else {
                    length--;
                }
            } else if (z9) {
                i9++;
            } else {
                z8 = true;
            }
        }
        String string = url.subSequence(i9, length + 1).toString();
        String url2 = "";
        if (!AbstractC5830k.m5325b(string, "")) {
            Matcher matcher = Pattern.compile("//([^/]*)/").matcher(url);
            if (matcher.find()) {
                url2 = matcher.group(1);
                AbstractC5830k.m5329f(url2, "group(...)");
            }
            url2 = AbstractC0037f.m86k("http://", url2, "/");
        }
        AbstractC5830k.m5330g(url2, "url");
        C3065d c3065d = new C3065d(1);
        c3065d.m2008b(url2);
        c3065d.f1395a = c6338z;
        C3842h c3842h = new C3842h();
        c3842h.f3006j = true;
        ((ArrayList) c3065d.f1397c).add(new C5449a(c3842h.m2790a()));
        ((ArrayList) c3065d.f1398d).add(new C3240e(i));
        new C5714j(((InterfaceC6103a) c3065d.m2009c().m6155b(InterfaceC6103a.class)).m5801a(url).m6079d(AbstractC3234f.f1799a), new C0362d(new C2865d(localPath, 5), 14), i8).m6077a(AbstractC6465b.m6127a()).m6078b(new C6105c(interfaceC6106d));
    }

    /* renamed from: i */
    public static final InterfaceC5685a m6369i(AbstractC6120b abstractC6120b, InterfaceC6069c interfaceC6069c, String str) {
        InterfaceC5686b interfaceC5686b;
        AbstractC5830k.m5330g(abstractC6120b, "<this>");
        AbstractC6281e serializersModule = interfaceC6069c.getSerializersModule();
        InterfaceC6779c baseClass = ((C5687c) abstractC6120b).f8861a;
        C6280d c6280d = (C6280d) serializersModule;
        c6280d.getClass();
        AbstractC5830k.m5330g(baseClass, "baseClass");
        Map map = (Map) c6280d.f10036d.get(baseClass);
        InterfaceC5686b interfaceC5686b2 = map != null ? (InterfaceC5686b) map.get(str) : null;
        if (!(interfaceC5686b2 instanceof InterfaceC5686b)) {
            interfaceC5686b2 = null;
        }
        if (interfaceC5686b2 != null) {
            interfaceC5686b = interfaceC5686b2;
        } else {
            Object obj = c6280d.f10037e.get(baseClass);
            InterfaceC6471c interfaceC6471c = AbstractC5835p.m5356e(1, obj) ? (InterfaceC6471c) obj : null;
            interfaceC5686b = interfaceC6471c != null ? (InterfaceC5685a) interfaceC6471c.invoke(str) : null;
        }
        if (interfaceC5686b != null) {
            return interfaceC5686b;
        }
        AbstractC6191y0.m5842l(str, baseClass);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p084i7.InterfaceC5689e m6370j(p118m7.AbstractC6120b r3, p109l7.InterfaceC6072f r4, java.lang.Object r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r3, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r5, r0)
            o7.e r4 = r4.getSerializersModule()
            i7.c r3 = (p084i7.C5687c) r3
            y6.c r3 = r3.f8861a
            o7.d r4 = (p133o7.C6280d) r4
            r4.getClass()
            java.lang.String r0 = "baseClass"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r3, r0)
            r0 = r3
            kotlin.jvm.internal.d r0 = (kotlin.jvm.internal.C5823d) r0
            boolean r0 = r0.m5321f(r5)
            r1 = 0
            if (r0 != 0) goto L27
            goto L67
        L27:
            java.util.Map r0 = r4.f10034b
            java.lang.Object r0 = r0.get(r3)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L40
            java.lang.Class r2 = r5.getClass()
            kotlin.jvm.internal.d r2 = kotlin.jvm.internal.AbstractC5832m.m5340a(r2)
            java.lang.Object r0 = r0.get(r2)
            i7.b r0 = (p084i7.InterfaceC5686b) r0
            goto L41
        L40:
            r0 = r1
        L41:
            boolean r2 = r0 instanceof p084i7.InterfaceC5689e
            if (r2 == 0) goto L48
            i7.e r0 = (p084i7.InterfaceC5689e) r0
            goto L49
        L48:
            r0 = r1
        L49:
            if (r0 == 0) goto L4c
            goto L68
        L4c:
            java.util.Map r4 = r4.f10035c
            java.lang.Object r4 = r4.get(r3)
            r0 = 1
            boolean r0 = kotlin.jvm.internal.AbstractC5835p.m5356e(r0, r4)
            if (r0 == 0) goto L5c
            r6.c r4 = (p152r6.InterfaceC6471c) r4
            goto L5d
        L5c:
            r4 = r1
        L5d:
            if (r4 == 0) goto L67
            java.lang.Object r4 = r4.invoke(r5)
            r0 = r4
            i7.e r0 = (p084i7.InterfaceC5689e) r0
            goto L68
        L67:
            r0 = r1
        L68:
            if (r0 != 0) goto L80
            java.lang.Class r4 = r5.getClass()
            kotlin.jvm.internal.d r4 = kotlin.jvm.internal.AbstractC5832m.m5340a(r4)
            java.lang.String r5 = r4.m5320e()
            if (r5 != 0) goto L7c
            java.lang.String r5 = java.lang.String.valueOf(r4)
        L7c:
            p118m7.AbstractC6191y0.m5842l(r5, r3)
            throw r1
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p185v7.AbstractC6683l.m6370j(m7.b, l7.f, java.lang.Object):i7.e");
    }

    /* renamed from: k */
    public static final void m6371k(long j7, byte[] bArr, int i, int i8, int i9) {
        int i10 = 7 - i8;
        int i11 = 8 - i9;
        if (i11 > i10) {
            return;
        }
        while (true) {
            int i12 = AbstractC5844e.f9247a[(int) ((j7 >> (i10 << 3)) & 255)];
            int i13 = i + 1;
            bArr[i] = (byte) (i12 >> 8);
            i += 2;
            bArr[i13] = (byte) i12;
            if (i10 == i11) {
                return;
            } else {
                i10--;
            }
        }
    }

    /* renamed from: l */
    public static final String m6372l(long j7) {
        String strM83h;
        if (j7 <= -999500000) {
            strM83h = AbstractC0037f.m83h((j7 - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j7 <= -999500) {
            strM83h = AbstractC0037f.m83h((j7 - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j7 <= 0) {
            strM83h = AbstractC0037f.m83h((j7 - 500) / 1000, " µs", new StringBuilder());
        } else if (j7 < 999500) {
            strM83h = AbstractC0037f.m83h((j7 + 500) / 1000, " µs", new StringBuilder());
        } else if (j7 < 999500000) {
            strM83h = AbstractC0037f.m83h((j7 + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strM83h = AbstractC0037f.m83h((j7 + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strM83h}, 1));
    }

    /* renamed from: m */
    public static final int m6373m(int i, int i8, int i9) {
        if (i9 > 0) {
            if (i < i8) {
                int i10 = i8 % i9;
                if (i10 < 0) {
                    i10 += i9;
                }
                int i11 = i % i9;
                if (i11 < 0) {
                    i11 += i9;
                }
                int i12 = (i10 - i11) % i9;
                if (i12 < 0) {
                    i12 += i9;
                }
                return i8 - i12;
            }
        } else {
            if (i9 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i8) {
                int i13 = -i9;
                int i14 = i % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i8 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i16 + i8;
            }
        }
        return i8;
    }

    /* renamed from: n */
    public static InterfaceC5631c m6374n(InterfaceC5631c interfaceC5631c) {
        InterfaceC5631c<Object> interfaceC5631cIntercepted;
        AbstractC5830k.m5330g(interfaceC5631c, "<this>");
        ContinuationImpl continuationImpl = interfaceC5631c instanceof ContinuationImpl ? (ContinuationImpl) interfaceC5631c : null;
        return (continuationImpl == null || (interfaceC5631cIntercepted = continuationImpl.intercepted()) == null) ? interfaceC5631c : interfaceC5631cIntercepted;
    }

    /* renamed from: o */
    public static boolean m6375o(float f, float f7, float f8, float f9, float f10) {
        return Math.abs(f - f8) <= f10 && Math.abs(f7 - f9) <= f10;
    }

    /* renamed from: p */
    public static C6831i m6376p(InterfaceC6473e interfaceC6473e) {
        C6831i c6831i = new C6831i();
        c6831i.f11581d = m6365e(interfaceC6473e, c6831i, c6831i);
        return c6831i;
    }

    /* renamed from: q */
    public static int m6377q(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
                GLES20.glDeleteShader(iGlCreateShader);
                throw new RuntimeException("Could not compile shader " + i + ":" + strGlGetShaderInfoLog);
            }
        }
        return iGlCreateShader;
    }

    /* renamed from: r */
    public static final void m6378r(View view) {
        ScaleAnimation scaleAnimation;
        AbstractC5830k.m5330g(view, "<this>");
        if (view.getAlpha() == 1.0f) {
            view.setAlpha(0.5f);
            scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, view.getWidth() / 2.0f, (view.getHeight() / 2.0f) + 30.0f);
        } else {
            view.setAlpha(1.0f);
            scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, view.getWidth() / 2.0f, (view.getHeight() / 2.0f) + 30.0f);
        }
        scaleAnimation.setDuration(600L);
        scaleAnimation.setFillAfter(true);
        view.startAnimation(scaleAnimation);
    }

    /* renamed from: s */
    public static Object m6379s(InterfaceC6473e interfaceC6473e, Object obj, final InterfaceC5631c interfaceC5631c) {
        AbstractC5830k.m5330g(interfaceC6473e, "<this>");
        final InterfaceC5636h context = interfaceC5631c.getContext();
        Object obj2 = context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(interfaceC5631c) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC5631c);
                AbstractC5830k.m5328e(interfaceC5631c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                AbstractC5774b.m5119b(result);
                return result;
            }
        } : new ContinuationImpl(interfaceC5631c, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(interfaceC5631c, context);
                AbstractC5830k.m5328e(interfaceC5631c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public Object invokeSuspend(Object result) {
                AbstractC5774b.m5119b(result);
                return result;
            }
        };
        AbstractC5835p.m5354c(2, interfaceC6473e);
        return interfaceC6473e.invoke(obj, obj2);
    }
}
