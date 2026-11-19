package p213q7;

import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035c5.InterfaceC5119b;
import p035c5.InterfaceC5121d;
import p035c5.InterfaceC5122e;
import p035c5.InterfaceC5123f;
import p035c5.InterfaceC5124g;
import p035c5.InterfaceC5126i;
import p035c5.InterfaceC5127j;
import p177n4.InterfaceC8629i;

/* renamed from: q7.b2 */
/* loaded from: classes5.dex */
public abstract class AbstractC8906b2 {

    /* renamed from: q7.b2$a */
    public static final class a implements InterfaceC5127j {

        /* renamed from: a */
        public final /* synthetic */ Function2 f15217a;

        public a(Function2 function2) {
            this.f15217a = function2;
        }

        @Override // p035c5.InterfaceC5127j
        /* renamed from: a */
        public void mo2787a(boolean z9, boolean z10) {
            this.f15217a.invoke(Boolean.valueOf(z9), Boolean.valueOf(z10));
        }
    }

    /* renamed from: q7.b2$b */
    public static final class b implements InterfaceC5119b {

        /* renamed from: a */
        public final /* synthetic */ Function1 f15218a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8629i f15219b;

        public b(Function1 function1, InterfaceC8629i interfaceC8629i) {
            this.f15218a = function1;
            this.f15219b = interfaceC8629i;
        }

        @Override // p035c5.InterfaceC5119b
        /* renamed from: a */
        public void mo2774a(CommandInfoEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.f15218a.invoke(entity);
            this.f15219b.mo6705B(this);
        }
    }

    /* renamed from: q7.b2$c */
    public static final class c implements InterfaceC5122e {

        /* renamed from: a */
        public final /* synthetic */ Function1 f15220a;

        public c(Function1 function1) {
            this.f15220a = function1;
        }

        @Override // p035c5.InterfaceC5122e
        /* renamed from: a */
        public void mo2780a(int i10) {
            this.f15220a.invoke(Integer.valueOf(i10));
        }
    }

    /* renamed from: q7.b2$d */
    public static final class d implements InterfaceC5121d {

        /* renamed from: a */
        public float f15221a;

        /* renamed from: b */
        public float f15222b;

        /* renamed from: c */
        public final /* synthetic */ Function2 f15223c;

        /* renamed from: d */
        public final /* synthetic */ Function0 f15224d;

        /* renamed from: e */
        public final /* synthetic */ Function0 f15225e;

        public d(Function2 function2, Function0 function0, Function0 function02) {
            this.f15223c = function2;
            this.f15224d = function0;
            this.f15225e = function02;
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: a */
        public void mo2776a(float f10) {
            this.f15222b = f10;
            this.f15223c.invoke(Float.valueOf(this.f15221a), Float.valueOf(this.f15222b));
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: b */
        public void mo2777b(float f10) {
            this.f15221a = f10;
            this.f15223c.invoke(Float.valueOf(f10), Float.valueOf(this.f15222b));
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: c */
        public void mo2778c() {
            this.f15225e.invoke();
        }

        @Override // p035c5.InterfaceC5121d
        /* renamed from: d */
        public void mo2779d() {
            this.f15224d.invoke();
        }
    }

    /* renamed from: q7.b2$e */
    public static final class e implements InterfaceC5124g {

        /* renamed from: a */
        public final /* synthetic */ Function1 f15226a;

        public e(Function1 function1) {
            this.f15226a = function1;
        }

        @Override // p035c5.InterfaceC5124g
        /* renamed from: a */
        public void mo2785a() {
            this.f15226a.invoke(Boolean.TRUE);
        }

        @Override // p035c5.InterfaceC5124g
        /* renamed from: b */
        public void mo2786b() {
            this.f15226a.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: q7.b2$f */
    public static final class f implements InterfaceC5126i {

        /* renamed from: a */
        public final /* synthetic */ Function1 f15227a;

        /* renamed from: b */
        public final /* synthetic */ Function0 f15228b;

        /* renamed from: c */
        public final /* synthetic */ Function0 f15229c;

        public f(Function1 function1, Function0 function0, Function0 function02) {
            this.f15227a = function1;
            this.f15228b = function0;
            this.f15229c = function02;
        }

        @Override // p035c5.InterfaceC5126i
        public void progress(long j10) {
            this.f15227a.invoke(Long.valueOf(j10));
        }

        @Override // p035c5.InterfaceC5126i
        public void startRecord() {
            this.f15228b.invoke();
        }

        @Override // p035c5.InterfaceC5126i
        public void stopRecord() {
            this.f15229c.invoke();
        }
    }

    /* renamed from: a */
    public static final void m15021a(InterfaceC8629i interfaceC8629i, Function2 onChange) {
        Intrinsics.checkNotNullParameter(interfaceC8629i, "<this>");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        interfaceC8629i.mo6715h(new a(onChange));
    }

    /* renamed from: b */
    public static final void m15022b(InterfaceC8629i interfaceC8629i, Function1 onEvent) {
        Intrinsics.checkNotNullParameter(interfaceC8629i, "<this>");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        interfaceC8629i.mo6719k(new b(onEvent, interfaceC8629i));
    }

    /* renamed from: c */
    public static final void m15023c(InterfaceC8629i interfaceC8629i, Function1 onGeometryColorChange) {
        Intrinsics.checkNotNullParameter(interfaceC8629i, "<this>");
        Intrinsics.checkNotNullParameter(onGeometryColorChange, "onGeometryColorChange");
        interfaceC8629i.mo6732v(new c(onGeometryColorChange));
    }

    /* renamed from: d */
    public static final void m15024d(InterfaceC8629i interfaceC8629i, Function0 onMoveStart, Function2 onMoving, Function0 onMoveEnd) {
        Intrinsics.checkNotNullParameter(interfaceC8629i, "<this>");
        Intrinsics.checkNotNullParameter(onMoveStart, "onMoveStart");
        Intrinsics.checkNotNullParameter(onMoving, "onMoving");
        Intrinsics.checkNotNullParameter(onMoveEnd, "onMoveEnd");
        interfaceC8629i.setAreaMoveListener(new d(onMoving, onMoveStart, onMoveEnd));
    }

    /* renamed from: e */
    public static final void m15025e(InterfaceC8629i interfaceC8629i, Function1 onMicroPhoneChange) {
        Intrinsics.checkNotNullParameter(interfaceC8629i, "<this>");
        Intrinsics.checkNotNullParameter(onMicroPhoneChange, "onMicroPhoneChange");
        interfaceC8629i.mo6714g(new e(onMicroPhoneChange));
    }

    /* renamed from: f */
    public static final void m15026f(InterfaceC8629i interfaceC8629i, Function0 onStart, Function1 onProgress, Function0 onStop) {
        Intrinsics.checkNotNullParameter(interfaceC8629i, "<this>");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onStop, "onStop");
        interfaceC8629i.mo6726p(new f(onProgress, onStart, onStop));
    }

    /* renamed from: g */
    public static final void m15027g(InterfaceC8629i interfaceC8629i, Function1 onTextColorChange, Function1 onTextSizeChange) {
        Intrinsics.checkNotNullParameter(interfaceC8629i, "<this>");
        Intrinsics.checkNotNullParameter(onTextColorChange, "onTextColorChange");
        Intrinsics.checkNotNullParameter(onTextSizeChange, "onTextSizeChange");
        interfaceC8629i.mo6707D(new g(onTextColorChange, onTextSizeChange));
    }

    /* renamed from: q7.b2$g */
    public static final class g implements InterfaceC5123f {

        /* renamed from: a */
        public final /* synthetic */ Function1 f15230a;

        /* renamed from: b */
        public final /* synthetic */ Function1 f15231b;

        public g(Function1 function1, Function1 function12) {
            this.f15230a = function1;
            this.f15231b = function12;
        }

        @Override // p035c5.InterfaceC5123f
        /* renamed from: a */
        public void mo2781a(float f10) {
            this.f15231b.invoke(Float.valueOf(f10));
        }

        @Override // p035c5.InterfaceC5123f
        /* renamed from: d */
        public void mo2784d(int i10) {
            this.f15230a.invoke(Integer.valueOf(i10));
        }

        @Override // p035c5.InterfaceC5123f
        /* renamed from: b */
        public void mo2782b() {
        }

        @Override // p035c5.InterfaceC5123f
        /* renamed from: c */
        public void mo2783c(int i10, float f10) {
        }
    }
}
