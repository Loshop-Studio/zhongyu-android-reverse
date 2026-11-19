package p000a.p031h.p043j.p044a0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import io.github.inflationx.calligraphy3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p031h.p043j.p044a0.InterfaceC0247d;

/* renamed from: a.h.j.a0.b */
/* loaded from: classes.dex */
public class C0245b {

    /* renamed from: d */
    public static int f1562d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f1563a;

    /* renamed from: b */
    public int f1564b = -1;

    /* renamed from: c */
    public int f1565c = -1;

    /* renamed from: a.h.j.a0.b$a */
    public static class a {

        /* renamed from: e */
        public static final a f1566e;

        /* renamed from: f */
        public static final a f1567f;

        /* renamed from: g */
        public static final a f1568g;

        /* renamed from: h */
        public static final a f1569h;

        /* renamed from: i */
        public static final a f1570i;

        /* renamed from: j */
        public static final a f1571j;

        /* renamed from: k */
        public static final a f1572k;

        /* renamed from: l */
        public static final a f1573l;

        /* renamed from: a */
        public final Object f1574a;

        /* renamed from: b */
        public final int f1575b;

        /* renamed from: c */
        public final Class<? extends InterfaceC0247d.a> f1576c;

        /* renamed from: d */
        public final InterfaceC0247d f1577d;

        static {
            new AccessibilityNodeInfo.AccessibilityAction(1, null);
            new AccessibilityNodeInfo.AccessibilityAction(2, null);
            new AccessibilityNodeInfo.AccessibilityAction(4, null);
            new AccessibilityNodeInfo.AccessibilityAction(8, null);
            f1566e = new a(16, null);
            new AccessibilityNodeInfo.AccessibilityAction(32, null);
            new AccessibilityNodeInfo.AccessibilityAction(64, null);
            new AccessibilityNodeInfo.AccessibilityAction(128, null);
            new AccessibilityNodeInfo.AccessibilityAction(256, null);
            new AccessibilityNodeInfo.AccessibilityAction(512, null);
            new AccessibilityNodeInfo.AccessibilityAction(1024, null);
            new AccessibilityNodeInfo.AccessibilityAction(2048, null);
            f1567f = new a(4096, null);
            f1568g = new a(8192, null);
            new AccessibilityNodeInfo.AccessibilityAction(16384, null);
            new AccessibilityNodeInfo.AccessibilityAction(32768, null);
            new AccessibilityNodeInfo.AccessibilityAction(65536, null);
            new AccessibilityNodeInfo.AccessibilityAction(131072, null);
            f1569h = new a(262144, null);
            f1570i = new a(524288, null);
            f1571j = new a(1048576, null);
            new AccessibilityNodeInfo.AccessibilityAction(2097152, null);
            int i = Build.VERSION.SDK_INT;
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionShowOnScreen, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollToPosition, null);
            }
            f1572k = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollLeft, null);
            }
            f1573l = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionScrollRight, null);
            }
            if ((i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageUp, null);
            }
            if ((i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageDown, null);
            }
            if ((i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageLeft, null);
            }
            if ((i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPageRight, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionContextClick, null);
            }
            if ((i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionSetProgress, null);
            }
            if ((i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionMoveWindow, null);
            }
            if ((i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionShowTooltip, null);
            }
            if ((i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionHideTooltip, null);
            }
            if ((i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionPressAndHold, null);
            }
            if ((i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(R.id.accessibilityActionImeEnter, null);
            }
        }

        public a(int i, CharSequence charSequence) {
            this(null, i, null, null, null);
        }

        public a(Object obj, int i, CharSequence charSequence, InterfaceC0247d interfaceC0247d, Class<? extends InterfaceC0247d.a> cls) {
            this.f1575b = i;
            this.f1577d = interfaceC0247d;
            this.f1574a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
            this.f1576c = cls;
        }

        /* renamed from: a */
        public int m827a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1574a).getId();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f1574a;
            Object obj3 = ((a) obj).f1574a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f1574a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: a.h.j.a0.b$b */
    public static class b {

        /* renamed from: a */
        public final Object f1578a;

        public b(Object obj) {
            this.f1578a = obj;
        }
    }

    /* renamed from: a.h.j.a0.b$c */
    public static class c {

        /* renamed from: a */
        public final Object f1579a;

        public c(Object obj) {
            this.f1579a = obj;
        }

        /* renamed from: a */
        public static c m828a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public C0245b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1563a = accessibilityNodeInfo;
    }

    /* renamed from: c */
    public static String m816c(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case BuildConfig.VERSION_CODE /* 32 */:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
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
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
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
                        switch (i) {
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

    /* renamed from: d */
    public static ClickableSpan[] m817d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: a */
    public void m818a(a aVar) {
        this.f1563a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1574a);
    }

    /* renamed from: b */
    public final List<Integer> m819b(String str) {
        ArrayList<Integer> integerArrayList = this.f1563a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f1563a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public CharSequence m820e() {
        return this.f1563a.getContentDescription();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0245b)) {
            return false;
        }
        C0245b c0245b = (C0245b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1563a;
        if (accessibilityNodeInfo == null) {
            if (c0245b.f1563a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c0245b.f1563a)) {
            return false;
        }
        return this.f1565c == c0245b.f1565c && this.f1564b == c0245b.f1564b;
    }

    /* renamed from: f */
    public Bundle m821f() {
        return this.f1563a.getExtras();
    }

    /* renamed from: g */
    public CharSequence m822g() {
        if (!(!m819b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f1563a.getText();
        }
        List<Integer> listM819b = m819b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listM819b2 = m819b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listM819b3 = m819b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listM819b4 = m819b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f1563a.getText(), 0, this.f1563a.getText().length()));
        for (int i = 0; i < listM819b.size(); i++) {
            spannableString.setSpan(new C0244a(listM819b4.get(i).intValue(), this, m821f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listM819b.get(i).intValue(), listM819b2.get(i).intValue(), listM819b3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: h */
    public final void m823h(int i, boolean z) {
        Bundle bundleM821f = m821f();
        if (bundleM821f != null) {
            int i2 = bundleM821f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleM821f.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1563a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public void m824i(Object obj) {
        this.f1563a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f1578a);
    }

    /* renamed from: j */
    public void m825j(Object obj) {
        this.f1563a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f1579a);
    }

    /* renamed from: k */
    public void m826k(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1563a.setHintText(charSequence);
        } else {
            this.f1563a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public String toString() {
        ?? EmptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f1563a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f1563a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f1563a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f1563a.getClassName());
        sb.append("; text: ");
        sb.append(m822g());
        sb.append("; contentDescription: ");
        sb.append(m820e());
        sb.append("; viewId: ");
        sb.append(this.f1563a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f1563a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f1563a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f1563a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f1563a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f1563a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f1563a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f1563a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f1563a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f1563a.isPassword());
        sb.append("; scrollable: " + this.f1563a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f1563a.getActionList();
        if (actionList != null) {
            EmptyList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                EmptyList.add(new a(actionList.get(i), 0, null, null, null));
            }
        } else {
            EmptyList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < EmptyList.size(); i2++) {
            a aVar = (a) EmptyList.get(i2);
            String strM816c = m816c(aVar.m827a());
            if (strM816c.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) aVar.f1574a).getLabel() != null) {
                strM816c = ((AccessibilityNodeInfo.AccessibilityAction) aVar.f1574a).getLabel().toString();
            }
            sb.append(strM816c);
            if (i2 != EmptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
