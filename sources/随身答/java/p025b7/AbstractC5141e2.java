package p025b7;

import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p084d5.InterfaceC7751k;
import p243s5.InterfaceC9474b;
import p243s5.InterfaceC9476d;
import p243s5.InterfaceC9477e;
import p243s5.InterfaceC9478f;
import p243s5.InterfaceC9479g;
import p243s5.InterfaceC9481i;
import p243s5.InterfaceC9482j;

/* renamed from: b7.e2 */
/* loaded from: classes5.dex */
public abstract class AbstractC5141e2 {

    /* renamed from: b7.e2$a */
    public static final class a implements InterfaceC9482j {

        /* renamed from: a */
        public final /* synthetic */ Function2 f2275a;

        public a(Function2 function2) {
            this.f2275a = function2;
        }

        @Override // p243s5.InterfaceC9482j
        /* renamed from: a */
        public void mo2218a(boolean z9, boolean z10) {
            this.f2275a.invoke(Boolean.valueOf(z9), Boolean.valueOf(z10));
        }
    }

    /* renamed from: b7.e2$b */
    public static final class b implements InterfaceC9474b {

        /* renamed from: a */
        public final /* synthetic */ Function1 f2276a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC7751k f2277b;

        public b(Function1 function1, InterfaceC7751k interfaceC7751k) {
            this.f2276a = function1;
            this.f2277b = interfaceC7751k;
        }

        @Override // p243s5.InterfaceC9474b
        /* renamed from: a */
        public void mo2219a(CommandInfoEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.f2276a.invoke(entity);
            this.f2277b.mo7825h(this);
        }
    }

    /* renamed from: b7.e2$c */
    public static final class c implements InterfaceC9477e {

        /* renamed from: a */
        public final /* synthetic */ Function1 f2278a;

        public c(Function1 function1) {
            this.f2278a = function1;
        }

        @Override // p243s5.InterfaceC9477e
        /* renamed from: a */
        public void mo2220a(int i9) {
            this.f2278a.invoke(Integer.valueOf(i9));
        }
    }

    /* renamed from: b7.e2$d */
    public static final class d implements InterfaceC9476d {

        /* renamed from: a */
        public float f2279a;

        /* renamed from: b */
        public float f2280b;

        /* renamed from: c */
        public final /* synthetic */ Function2 f2281c;

        /* renamed from: d */
        public final /* synthetic */ Function0 f2282d;

        /* renamed from: e */
        public final /* synthetic */ Function0 f2283e;

        public d(Function2 function2, Function0 function0, Function0 function02) {
            this.f2281c = function2;
            this.f2282d = function0;
            this.f2283e = function02;
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: a */
        public void mo2221a(float f10) {
            this.f2280b = f10;
            this.f2281c.invoke(Float.valueOf(this.f2279a), Float.valueOf(this.f2280b));
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: b */
        public void mo2222b(float f10) {
            this.f2279a = f10;
            this.f2281c.invoke(Float.valueOf(f10), Float.valueOf(this.f2280b));
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: c */
        public void mo2223c() {
            this.f2283e.invoke();
        }

        @Override // p243s5.InterfaceC9476d
        /* renamed from: d */
        public void mo2224d() {
            this.f2282d.invoke();
        }
    }

    /* renamed from: b7.e2$e */
    public static final class e implements InterfaceC9479g {

        /* renamed from: a */
        public final /* synthetic */ Function1 f2284a;

        public e(Function1 function1) {
            this.f2284a = function1;
        }

        @Override // p243s5.InterfaceC9479g
        /* renamed from: a */
        public void mo2225a() {
            this.f2284a.invoke(Boolean.TRUE);
        }

        @Override // p243s5.InterfaceC9479g
        /* renamed from: b */
        public void mo2226b() {
            this.f2284a.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: b7.e2$f */
    public static final class f implements InterfaceC9481i {

        /* renamed from: a */
        public final /* synthetic */ Function1 f2285a;

        /* renamed from: b */
        public final /* synthetic */ Function0 f2286b;

        /* renamed from: c */
        public final /* synthetic */ Function0 f2287c;

        public f(Function1 function1, Function0 function0, Function0 function02) {
            this.f2285a = function1;
            this.f2286b = function0;
            this.f2287c = function02;
        }

        @Override // p243s5.InterfaceC9481i
        public void progress(long j9) {
            this.f2285a.invoke(Long.valueOf(j9));
        }

        @Override // p243s5.InterfaceC9481i
        public void startRecord() {
            this.f2286b.invoke();
        }

        @Override // p243s5.InterfaceC9481i
        public void stopRecord() {
            this.f2287c.invoke();
        }
    }

    /* renamed from: a */
    public static final void m2211a(InterfaceC7751k interfaceC7751k, Function2 onChange) {
        Intrinsics.checkNotNullParameter(interfaceC7751k, "<this>");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        interfaceC7751k.mo7822e(new a(onChange));
    }

    /* renamed from: b */
    public static final void m2212b(InterfaceC7751k interfaceC7751k, Function1 onEvent) {
        Intrinsics.checkNotNullParameter(interfaceC7751k, "<this>");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        interfaceC7751k.mo7826i(new b(onEvent, interfaceC7751k));
    }

    /* renamed from: c */
    public static final void m2213c(InterfaceC7751k interfaceC7751k, Function1 onGeometryColorChange) {
        Intrinsics.checkNotNullParameter(interfaceC7751k, "<this>");
        Intrinsics.checkNotNullParameter(onGeometryColorChange, "onGeometryColorChange");
        interfaceC7751k.mo7827j(new c(onGeometryColorChange));
    }

    /* renamed from: d */
    public static final void m2214d(InterfaceC7751k interfaceC7751k, Function0 onMoveStart, Function2 onMoving, Function0 onMoveEnd) {
        Intrinsics.checkNotNullParameter(interfaceC7751k, "<this>");
        Intrinsics.checkNotNullParameter(onMoveStart, "onMoveStart");
        Intrinsics.checkNotNullParameter(onMoving, "onMoving");
        Intrinsics.checkNotNullParameter(onMoveEnd, "onMoveEnd");
        interfaceC7751k.setAreaMoveListener(new d(onMoving, onMoveStart, onMoveEnd));
    }

    /* renamed from: e */
    public static final void m2215e(InterfaceC7751k interfaceC7751k, Function1 onMicroPhoneChange) {
        Intrinsics.checkNotNullParameter(interfaceC7751k, "<this>");
        Intrinsics.checkNotNullParameter(onMicroPhoneChange, "onMicroPhoneChange");
        interfaceC7751k.mo7817E(new e(onMicroPhoneChange));
    }

    /* renamed from: f */
    public static final void m2216f(InterfaceC7751k interfaceC7751k, Function0 onStart, Function1 onProgress, Function0 onStop) {
        Intrinsics.checkNotNullParameter(interfaceC7751k, "<this>");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onStop, "onStop");
        interfaceC7751k.mo7823f(new f(onProgress, onStart, onStop));
    }

    /* renamed from: g */
    public static final void m2217g(InterfaceC7751k interfaceC7751k, Function1 onTextColorChange, Function1 onTextSizeChange) {
        Intrinsics.checkNotNullParameter(interfaceC7751k, "<this>");
        Intrinsics.checkNotNullParameter(onTextColorChange, "onTextColorChange");
        Intrinsics.checkNotNullParameter(onTextSizeChange, "onTextSizeChange");
        interfaceC7751k.mo7829k(new g(onTextColorChange, onTextSizeChange));
    }

    /* renamed from: b7.e2$g */
    public static final class g implements InterfaceC9478f {

        /* renamed from: a */
        public final /* synthetic */ Function1 f2288a;

        /* renamed from: b */
        public final /* synthetic */ Function1 f2289b;

        public g(Function1 function1, Function1 function12) {
            this.f2288a = function1;
            this.f2289b = function12;
        }

        @Override // p243s5.InterfaceC9478f
        /* renamed from: a */
        public void mo2227a(float f10) {
            this.f2289b.invoke(Float.valueOf(f10));
        }

        @Override // p243s5.InterfaceC9478f
        /* renamed from: d */
        public void mo2230d(int i9) {
            this.f2288a.invoke(Integer.valueOf(i9));
        }

        @Override // p243s5.InterfaceC9478f
        /* renamed from: b */
        public void mo2228b() {
        }

        @Override // p243s5.InterfaceC9478f
        /* renamed from: c */
        public void mo2229c(int i9, float f10) {
        }
    }
}
