package p016c0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import anet.channel.bytes.C0860a;
import anet.channel.entity.EventType;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.p068uc.crashsdk.export.LogType;
import com.taobao.accs.data.Message;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p016c0.InterfaceC1053f;
import p139q.C3004b;
import p172y.C3482a;

/* renamed from: c0.c */
/* loaded from: classes.dex */
public class C1050c {

    /* renamed from: d */
    private static int f6186d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f6187a;

    /* renamed from: b */
    public int f6188b = -1;

    /* renamed from: c */
    private int f6189c = -1;

    /* renamed from: c0.c$a */
    public static class a {

        /* renamed from: A */
        public static final a f6190A;

        /* renamed from: B */
        public static final a f6191B;

        /* renamed from: C */
        public static final a f6192C;

        /* renamed from: D */
        public static final a f6193D;

        /* renamed from: E */
        public static final a f6194E;

        /* renamed from: F */
        public static final a f6195F;

        /* renamed from: G */
        public static final a f6196G;

        /* renamed from: H */
        public static final a f6197H;

        /* renamed from: I */
        public static final a f6198I;

        /* renamed from: J */
        public static final a f6199J;

        /* renamed from: K */
        public static final a f6200K;

        /* renamed from: L */
        public static final a f6201L;

        /* renamed from: M */
        public static final a f6202M;

        /* renamed from: N */
        public static final a f6203N;

        /* renamed from: O */
        public static final a f6204O;

        /* renamed from: P */
        public static final a f6205P;

        /* renamed from: Q */
        public static final a f6206Q;

        /* renamed from: e */
        public static final a f6207e = new a(1, null);

        /* renamed from: f */
        public static final a f6208f = new a(2, null);

        /* renamed from: g */
        public static final a f6209g = new a(4, null);

        /* renamed from: h */
        public static final a f6210h = new a(8, null);

        /* renamed from: i */
        public static final a f6211i = new a(16, null);

        /* renamed from: j */
        public static final a f6212j = new a(32, null);

        /* renamed from: k */
        public static final a f6213k = new a(64, null);

        /* renamed from: l */
        public static final a f6214l = new a(128, null);

        /* renamed from: m */
        public static final a f6215m = new a(256, null, InterfaceC1053f.b.class);

        /* renamed from: n */
        public static final a f6216n = new a(EventType.AUTH_SUCC, null, InterfaceC1053f.b.class);

        /* renamed from: o */
        public static final a f6217o = new a(1024, null, InterfaceC1053f.c.class);

        /* renamed from: p */
        public static final a f6218p = new a(2048, null, InterfaceC1053f.c.class);

        /* renamed from: q */
        public static final a f6219q = new a(4096, null);

        /* renamed from: r */
        public static final a f6220r = new a(8192, null);

        /* renamed from: s */
        public static final a f6221s = new a(16384, null);

        /* renamed from: t */
        public static final a f6222t = new a(Message.FLAG_DATA_TYPE, null);

        /* renamed from: u */
        public static final a f6223u = new a(ArrayPool.STANDARD_BUFFER_SIZE_BYTES, null);

        /* renamed from: v */
        public static final a f6224v = new a(131072, null, InterfaceC1053f.g.class);

        /* renamed from: w */
        public static final a f6225w = new a(262144, null);

        /* renamed from: x */
        public static final a f6226x = new a(C0860a.MAX_POOL_SIZE, null);

        /* renamed from: y */
        public static final a f6227y = new a(LogType.ANR, null);

        /* renamed from: z */
        public static final a f6228z = new a(2097152, null, InterfaceC1053f.h.class);

        /* renamed from: a */
        final Object f6229a;

        /* renamed from: b */
        private final int f6230b;

        /* renamed from: c */
        private final Class<? extends InterfaceC1053f.a> f6231c;

        /* renamed from: d */
        protected final InterfaceC1053f f6232d;

        static {
            int i4 = Build.VERSION.SDK_INT;
            f6190A = new a(i4 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            f6191B = new a(i4 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC1053f.e.class);
            f6192C = new a(i4 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            f6193D = new a(i4 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            f6194E = new a(i4 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            f6195F = new a(i4 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            f6196G = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f6197H = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f6198I = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f6199J = new a(i4 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f6200K = new a(i4 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            f6201L = new a(i4 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, InterfaceC1053f.f.class);
            f6202M = new a(i4 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, InterfaceC1053f.d.class);
            f6203N = new a(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f6204O = new a(i4 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f6205P = new a(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f6206Q = new a(i4 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public a(int i4, CharSequence charSequence) {
            this(null, i4, charSequence, null, null);
        }

        /* renamed from: a */
        public a m4917a(CharSequence charSequence, InterfaceC1053f interfaceC1053f) {
            return new a(null, this.f6230b, charSequence, interfaceC1053f, this.f6231c);
        }

        /* renamed from: b */
        public int m4918b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f6229a).getId();
        }

        /* renamed from: c */
        public CharSequence m4919c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f6229a).getLabel();
        }

        /* renamed from: d */
        public boolean m4920d(View view, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            InterfaceC1053f.a aVarNewInstance;
            if (this.f6232d == null) {
                return false;
            }
            InterfaceC1053f.a aVar = null;
            Class<? extends InterfaceC1053f.a> cls = this.f6231c;
            if (cls != null) {
                try {
                    aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e4) {
                    e = e4;
                }
                try {
                    aVarNewInstance.m4931a(bundle);
                    aVar = aVarNewInstance;
                } catch (Exception e5) {
                    e = e5;
                    aVar = aVarNewInstance;
                    Class<? extends InterfaceC1053f.a> cls2 = this.f6231c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    return this.f6232d.perform(view, aVar);
                }
            }
            return this.f6232d.perform(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f6229a;
            return obj2 == null ? aVar.f6229a == null : obj2.equals(aVar.f6229a);
        }

        public int hashCode() {
            Object obj = this.f6229a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i4, CharSequence charSequence, Class<? extends InterfaceC1053f.a> cls) {
            this(null, i4, charSequence, null, cls);
        }

        a(Object obj, int i4, CharSequence charSequence, InterfaceC1053f interfaceC1053f, Class<? extends InterfaceC1053f.a> cls) {
            this.f6230b = i4;
            this.f6232d = interfaceC1053f;
            if (obj == null) {
                this.f6229a = new AccessibilityNodeInfo.AccessibilityAction(i4, charSequence);
            } else {
                this.f6229a = obj;
            }
            this.f6231c = cls;
        }
    }

    /* renamed from: c0.c$b */
    public static class b {

        /* renamed from: a */
        final Object f6233a;

        b(Object obj) {
            this.f6233a = obj;
        }

        /* renamed from: a */
        public static b m4921a(int i4, int i5, boolean z3) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, z3));
        }

        /* renamed from: b */
        public static b m4922b(int i4, int i5, boolean z3, int i6) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, z3, i6));
        }
    }

    /* renamed from: c0.c$c */
    public static class c {

        /* renamed from: a */
        final Object f6234a;

        c(Object obj) {
            this.f6234a = obj;
        }

        /* renamed from: a */
        public static c m4923a(int i4, int i5, int i6, int i7, boolean z3, boolean z4) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z3, z4));
        }
    }

    /* renamed from: c0.c$d */
    public static class d {

        /* renamed from: a */
        final Object f6235a;

        d(Object obj) {
            this.f6235a = obj;
        }

        /* renamed from: a */
        public static d m4924a(int i4, float f4, float f5, float f6) {
            return new d(AccessibilityNodeInfo.RangeInfo.obtain(i4, f4, f5, f6));
        }
    }

    private C1050c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f6187a = accessibilityNodeInfo;
    }

    /* renamed from: A */
    private int m4831A(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                if (clickableSpan.equals(sparseArray.valueAt(i4).get())) {
                    return sparseArray.keyAt(i4);
                }
            }
        }
        int i5 = f6186d;
        f6186d = i5 + 1;
        return i5;
    }

    /* renamed from: H0 */
    public static C1050c m4832H0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C1050c(accessibilityNodeInfo);
    }

    /* renamed from: O */
    public static C1050c m4833O() {
        return m4832H0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: P */
    public static C1050c m4834P(View view) {
        return m4832H0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: Q */
    public static C1050c m4835Q(C1050c c1050c) {
        return m4832H0(AccessibilityNodeInfo.obtain(c1050c.f6187a));
    }

    /* renamed from: U */
    private void m4836U(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayM4845w = m4845w(view);
        if (sparseArrayM4845w != null) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < sparseArrayM4845w.size(); i4++) {
                if (sparseArrayM4845w.valueAt(i4).get() == null) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                sparseArrayM4845w.remove(((Integer) arrayList.get(i5)).intValue());
            }
        }
    }

    /* renamed from: W */
    private void m4837W(int i4, boolean z3) {
        Bundle bundleM4904s = m4904s();
        if (bundleM4904s != null) {
            int i5 = bundleM4904s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i4);
            if (!z3) {
                i4 = 0;
            }
            bundleM4904s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i4 | i5);
        }
    }

    /* renamed from: e */
    private void m4838e(ClickableSpan clickableSpan, Spanned spanned, int i4) {
        m4840h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m4840h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m4840h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m4840h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i4));
    }

    /* renamed from: g */
    private void m4839g() {
        this.f6187a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f6187a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f6187a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f6187a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: h */
    private List<Integer> m4840h(String str) {
        ArrayList<Integer> integerArrayList = this.f6187a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f6187a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: j */
    private static String m4841j(int i4) {
        if (i4 == 1) {
            return "ACTION_FOCUS";
        }
        if (i4 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i4) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case EventType.AUTH_SUCC /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case Message.FLAG_DATA_TYPE /* 32768 */:
                return "ACTION_PASTE";
            case ArrayPool.STANDARD_BUFFER_SIZE_BYTES /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case C0860a.MAX_POOL_SIZE /* 524288 */:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i4) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i4) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: l */
    private boolean m4842l(int i4) {
        Bundle bundleM4904s = m4904s();
        return bundleM4904s != null && (bundleM4904s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i4) == i4;
    }

    /* renamed from: q */
    public static ClickableSpan[] m4843q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: u */
    private SparseArray<WeakReference<ClickableSpan>> m4844u(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayM4845w = m4845w(view);
        if (sparseArrayM4845w != null) {
            return sparseArrayM4845w;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C3004b.f11590I, sparseArray);
        return sparseArray;
    }

    /* renamed from: w */
    private SparseArray<WeakReference<ClickableSpan>> m4845w(View view) {
        return (SparseArray) view.getTag(C3004b.f11590I);
    }

    /* renamed from: z */
    private boolean m4846z() {
        return !m4840h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: A0 */
    public void m4847A0(boolean z3) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6187a.setShowingHintText(z3);
        } else {
            m4837W(4, z3);
        }
    }

    /* renamed from: B */
    public boolean m4848B() {
        return this.f6187a.isAccessibilityFocused();
    }

    /* renamed from: B0 */
    public void m4849B0(View view) {
        this.f6189c = -1;
        this.f6187a.setSource(view);
    }

    /* renamed from: C */
    public boolean m4850C() {
        return this.f6187a.isCheckable();
    }

    /* renamed from: C0 */
    public void m4851C0(View view, int i4) {
        this.f6189c = i4;
        this.f6187a.setSource(view, i4);
    }

    /* renamed from: D */
    public boolean m4852D() {
        return this.f6187a.isChecked();
    }

    /* renamed from: D0 */
    public void m4853D0(CharSequence charSequence) {
        if (C3482a.m10553b()) {
            this.f6187a.setStateDescription(charSequence);
        } else {
            this.f6187a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: E */
    public boolean m4854E() {
        return this.f6187a.isClickable();
    }

    /* renamed from: E0 */
    public void m4855E0(CharSequence charSequence) {
        this.f6187a.setText(charSequence);
    }

    /* renamed from: F */
    public boolean m4856F() {
        return this.f6187a.isEnabled();
    }

    /* renamed from: F0 */
    public void m4857F0(boolean z3) {
        this.f6187a.setVisibleToUser(z3);
    }

    /* renamed from: G */
    public boolean m4858G() {
        return this.f6187a.isFocusable();
    }

    /* renamed from: G0 */
    public AccessibilityNodeInfo m4859G0() {
        return this.f6187a;
    }

    /* renamed from: H */
    public boolean m4860H() {
        return this.f6187a.isFocused();
    }

    /* renamed from: I */
    public boolean m4861I() {
        return this.f6187a.isLongClickable();
    }

    /* renamed from: J */
    public boolean m4862J() {
        return this.f6187a.isPassword();
    }

    /* renamed from: K */
    public boolean m4863K() {
        return this.f6187a.isScrollable();
    }

    /* renamed from: L */
    public boolean m4864L() {
        return this.f6187a.isSelected();
    }

    /* renamed from: M */
    public boolean m4865M() {
        return Build.VERSION.SDK_INT >= 26 ? this.f6187a.isShowingHintText() : m4842l(4);
    }

    /* renamed from: N */
    public boolean m4866N() {
        return this.f6187a.isVisibleToUser();
    }

    /* renamed from: R */
    public boolean m4867R(int i4, Bundle bundle) {
        return this.f6187a.performAction(i4, bundle);
    }

    /* renamed from: S */
    public void m4868S() {
        this.f6187a.recycle();
    }

    /* renamed from: T */
    public boolean m4869T(a aVar) {
        return this.f6187a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f6229a);
    }

    /* renamed from: V */
    public void m4870V(boolean z3) {
        this.f6187a.setAccessibilityFocused(z3);
    }

    @Deprecated
    /* renamed from: X */
    public void m4871X(Rect rect) {
        this.f6187a.setBoundsInParent(rect);
    }

    /* renamed from: Y */
    public void m4872Y(Rect rect) {
        this.f6187a.setBoundsInScreen(rect);
    }

    /* renamed from: Z */
    public void m4873Z(boolean z3) {
        this.f6187a.setCanOpenPopup(z3);
    }

    /* renamed from: a */
    public void m4874a(int i4) {
        this.f6187a.addAction(i4);
    }

    /* renamed from: a0 */
    public void m4875a0(boolean z3) {
        this.f6187a.setCheckable(z3);
    }

    /* renamed from: b */
    public void m4876b(a aVar) {
        this.f6187a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f6229a);
    }

    /* renamed from: b0 */
    public void m4877b0(boolean z3) {
        this.f6187a.setChecked(z3);
    }

    /* renamed from: c */
    public void m4878c(View view) {
        this.f6187a.addChild(view);
    }

    /* renamed from: c0 */
    public void m4879c0(CharSequence charSequence) {
        this.f6187a.setClassName(charSequence);
    }

    /* renamed from: d */
    public void m4880d(View view, int i4) {
        this.f6187a.addChild(view, i4);
    }

    /* renamed from: d0 */
    public void m4881d0(boolean z3) {
        this.f6187a.setClickable(z3);
    }

    /* renamed from: e0 */
    public void m4882e0(Object obj) {
        this.f6187a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f6233a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1050c)) {
            return false;
        }
        C1050c c1050c = (C1050c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6187a;
        if (accessibilityNodeInfo == null) {
            if (c1050c.f6187a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c1050c.f6187a)) {
            return false;
        }
        return this.f6189c == c1050c.f6189c && this.f6188b == c1050c.f6188b;
    }

    /* renamed from: f */
    public void m4883f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m4839g();
            m4836U(view);
            ClickableSpan[] clickableSpanArrM4843q = m4843q(charSequence);
            if (clickableSpanArrM4843q == null || clickableSpanArrM4843q.length <= 0) {
                return;
            }
            m4904s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C3004b.f11601a);
            SparseArray<WeakReference<ClickableSpan>> sparseArrayM4844u = m4844u(view);
            for (int i4 = 0; i4 < clickableSpanArrM4843q.length; i4++) {
                int iM4831A = m4831A(clickableSpanArrM4843q[i4], sparseArrayM4844u);
                sparseArrayM4844u.put(iM4831A, new WeakReference<>(clickableSpanArrM4843q[i4]));
                m4838e(clickableSpanArrM4843q[i4], (Spanned) charSequence, iM4831A);
            }
        }
    }

    /* renamed from: f0 */
    public void m4884f0(Object obj) {
        this.f6187a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f6234a);
    }

    /* renamed from: g0 */
    public void m4885g0(CharSequence charSequence) {
        this.f6187a.setContentDescription(charSequence);
    }

    /* renamed from: h0 */
    public void m4886h0(boolean z3) {
        this.f6187a.setDismissable(z3);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6187a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<a> m4887i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f6187a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new a(actionList.get(i4)));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public void m4888i0(boolean z3) {
        this.f6187a.setEnabled(z3);
    }

    /* renamed from: j0 */
    public void m4889j0(CharSequence charSequence) {
        this.f6187a.setError(charSequence);
    }

    /* renamed from: k */
    public int m4890k() {
        return this.f6187a.getActions();
    }

    /* renamed from: k0 */
    public void m4891k0(boolean z3) {
        this.f6187a.setFocusable(z3);
    }

    /* renamed from: l0 */
    public void m4892l0(boolean z3) {
        this.f6187a.setFocused(z3);
    }

    @Deprecated
    /* renamed from: m */
    public void m4893m(Rect rect) {
        this.f6187a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void m4894m0(boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6187a.setHeading(z3);
        } else {
            m4837W(2, z3);
        }
    }

    /* renamed from: n */
    public void m4895n(Rect rect) {
        this.f6187a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void m4896n0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6187a.setHintText(charSequence);
        } else {
            this.f6187a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: o */
    public int m4897o() {
        return this.f6187a.getChildCount();
    }

    /* renamed from: o0 */
    public void m4898o0(boolean z3) {
        this.f6187a.setLongClickable(z3);
    }

    /* renamed from: p */
    public CharSequence m4899p() {
        return this.f6187a.getClassName();
    }

    /* renamed from: p0 */
    public void m4900p0(int i4) {
        this.f6187a.setMaxTextLength(i4);
    }

    /* renamed from: q0 */
    public void m4901q0(int i4) {
        this.f6187a.setMovementGranularities(i4);
    }

    /* renamed from: r */
    public CharSequence m4902r() {
        return this.f6187a.getContentDescription();
    }

    /* renamed from: r0 */
    public void m4903r0(CharSequence charSequence) {
        this.f6187a.setPackageName(charSequence);
    }

    /* renamed from: s */
    public Bundle m4904s() {
        return this.f6187a.getExtras();
    }

    /* renamed from: s0 */
    public void m4905s0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6187a.setPaneTitle(charSequence);
        } else {
            this.f6187a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: t */
    public int m4906t() {
        return this.f6187a.getMovementGranularities();
    }

    /* renamed from: t0 */
    public void m4907t0(View view) {
        this.f6188b = -1;
        this.f6187a.setParent(view);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m4893m(rect);
        sb.append("; boundsInParent: " + rect);
        m4895n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m4909v());
        sb.append("; className: ");
        sb.append(m4899p());
        sb.append("; text: ");
        sb.append(m4912x());
        sb.append("; contentDescription: ");
        sb.append(m4902r());
        sb.append("; viewId: ");
        sb.append(m4914y());
        sb.append("; checkable: ");
        sb.append(m4850C());
        sb.append("; checked: ");
        sb.append(m4852D());
        sb.append("; focusable: ");
        sb.append(m4858G());
        sb.append("; focused: ");
        sb.append(m4860H());
        sb.append("; selected: ");
        sb.append(m4864L());
        sb.append("; clickable: ");
        sb.append(m4854E());
        sb.append("; longClickable: ");
        sb.append(m4861I());
        sb.append("; enabled: ");
        sb.append(m4856F());
        sb.append("; password: ");
        sb.append(m4862J());
        sb.append("; scrollable: " + m4863K());
        sb.append("; [");
        List<a> listM4887i = m4887i();
        for (int i4 = 0; i4 < listM4887i.size(); i4++) {
            a aVar = listM4887i.get(i4);
            String strM4841j = m4841j(aVar.m4918b());
            if (strM4841j.equals("ACTION_UNKNOWN") && aVar.m4919c() != null) {
                strM4841j = aVar.m4919c().toString();
            }
            sb.append(strM4841j);
            if (i4 != listM4887i.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u0 */
    public void m4908u0(View view, int i4) {
        this.f6188b = i4;
        this.f6187a.setParent(view, i4);
    }

    /* renamed from: v */
    public CharSequence m4909v() {
        return this.f6187a.getPackageName();
    }

    /* renamed from: v0 */
    public void m4910v0(d dVar) {
        this.f6187a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f6235a);
    }

    /* renamed from: w0 */
    public void m4911w0(CharSequence charSequence) {
        this.f6187a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: x */
    public CharSequence m4912x() {
        if (!m4846z()) {
            return this.f6187a.getText();
        }
        List<Integer> listM4840h = m4840h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listM4840h2 = m4840h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listM4840h3 = m4840h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listM4840h4 = m4840h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f6187a.getText(), 0, this.f6187a.getText().length()));
        for (int i4 = 0; i4 < listM4840h.size(); i4++) {
            spannableString.setSpan(new C1048a(listM4840h4.get(i4).intValue(), this, m4904s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listM4840h.get(i4).intValue(), listM4840h2.get(i4).intValue(), listM4840h3.get(i4).intValue());
        }
        return spannableString;
    }

    /* renamed from: x0 */
    public void m4913x0(boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6187a.setScreenReaderFocusable(z3);
        } else {
            m4837W(1, z3);
        }
    }

    /* renamed from: y */
    public String m4914y() {
        return this.f6187a.getViewIdResourceName();
    }

    /* renamed from: y0 */
    public void m4915y0(boolean z3) {
        this.f6187a.setScrollable(z3);
    }

    /* renamed from: z0 */
    public void m4916z0(boolean z3) {
        this.f6187a.setSelected(z3);
    }
}
