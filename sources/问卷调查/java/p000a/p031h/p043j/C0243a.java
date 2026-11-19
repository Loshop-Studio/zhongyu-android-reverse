package p000a.p031h.p043j;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p031h.p043j.p044a0.C0245b;
import p000a.p031h.p043j.p044a0.C0246c;

/* renamed from: a.h.j.a */
/* loaded from: classes.dex */
public class C0243a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f1555c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f1556a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f1557b;

    /* renamed from: a.h.j.a$a */
    public static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C0243a f1558a;

        public a(C0243a c0243a) {
            this.f1558a = c0243a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1558a.mo807a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0246c c0246cMo808b = this.f1558a.mo808b(view);
            if (c0246cMo808b != null) {
                return (AccessibilityNodeProvider) c0246cMo808b.f1580a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1558a.mo809c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int iKeyAt;
            C0245b c0245b = new C0245b(accessibilityNodeInfo);
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            Boolean boolM879c = new C0267p(C1088R.id.tag_screen_reader_focusable, Boolean.class, 28).m879c(view);
            boolean zBooleanValue = boolM879c == null ? false : boolM879c.booleanValue();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                c0245b.f1563a.setScreenReaderFocusable(zBooleanValue);
            } else {
                c0245b.m823h(1, zBooleanValue);
            }
            Boolean boolM879c2 = new C0270s(C1088R.id.tag_accessibility_heading, Boolean.class, 28).m879c(view);
            boolean zBooleanValue2 = boolM879c2 == null ? false : boolM879c2.booleanValue();
            if (i >= 28) {
                c0245b.f1563a.setHeading(zBooleanValue2);
            } else {
                c0245b.m823h(2, zBooleanValue2);
            }
            CharSequence charSequenceM867f = C0266o.m867f(view);
            AccessibilityNodeInfo accessibilityNodeInfo2 = c0245b.f1563a;
            if (i >= 28) {
                accessibilityNodeInfo2.setPaneTitle(charSequenceM867f);
            } else {
                accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceM867f);
            }
            CharSequence charSequenceM879c = new C0269r(C1088R.id.tag_state_description, CharSequence.class, 64, 30).m879c(view);
            if (i >= 30) {
                c0245b.f1563a.setStateDescription(charSequenceM879c);
            } else {
                c0245b.f1563a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequenceM879c);
            }
            this.f1558a.mo810d(view, c0245b);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i < 26) {
                c0245b.f1563a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                c0245b.f1563a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                c0245b.f1563a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                c0245b.f1563a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(C1088R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                        if (((WeakReference) sparseArray.valueAt(i2)).get() == null) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        sparseArray.remove(((Integer) arrayList.get(i3)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArrM817d = C0245b.m817d(text);
                if (clickableSpanArrM817d != null && clickableSpanArrM817d.length > 0) {
                    c0245b.m821f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C1088R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(C1088R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(C1088R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i4 = 0; i4 < clickableSpanArrM817d.length; i4++) {
                        ClickableSpan clickableSpan = clickableSpanArrM817d[i4];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= sparseArray2.size()) {
                                iKeyAt = C0245b.f1562d;
                                C0245b.f1562d = iKeyAt + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i5)).get())) {
                                    iKeyAt = sparseArray2.keyAt(i5);
                                    break;
                                }
                                i5++;
                            }
                        }
                        sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArrM817d[i4]));
                        ClickableSpan clickableSpan2 = clickableSpanArrM817d[i4];
                        Spanned spanned = (Spanned) text;
                        c0245b.m819b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        c0245b.m819b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        c0245b.m819b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        c0245b.m819b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    }
                }
            }
            List listEmptyList = (List) view.getTag(C1088R.id.tag_accessibility_actions);
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            for (int i6 = 0; i6 < listEmptyList.size(); i6++) {
                c0245b.m818a((C0245b.a) listEmptyList.get(i6));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1558a.mo811e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1558a.mo812f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f1558a.mo813g(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f1558a.mo814h(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1558a.mo815i(view, accessibilityEvent);
        }
    }

    public C0243a() {
        this.f1556a = f1555c;
        this.f1557b = new a(this);
    }

    public C0243a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1556a = accessibilityDelegate;
        this.f1557b = new a(this);
    }

    /* renamed from: a */
    public boolean mo807a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1556a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0246c mo808b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1556a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0246c(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: c */
    public void mo809c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1556a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo810d(View view, C0245b c0245b) {
        this.f1556a.onInitializeAccessibilityNodeInfo(view, c0245b.f1563a);
    }

    /* renamed from: e */
    public void mo811e(View view, AccessibilityEvent accessibilityEvent) {
        this.f1556a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo812f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1556a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo813g(android.view.View r9, int r10, android.os.Bundle r11) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r8 = this;
            r0 = 2131296765(0x7f0901fd, float:1.8211456E38)
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lf
            java.util.List r0 = java.util.Collections.emptyList()
        Lf:
            r1 = 0
            r2 = r1
        L11:
            int r3 = r0.size()
            if (r2 >= r3) goto L70
            java.lang.Object r3 = r0.get(r2)
            a.h.j.a0.b$a r3 = (p000a.p031h.p043j.p044a0.C0245b.a) r3
            int r4 = r3.m827a()
            if (r4 != r10) goto L6d
            a.h.j.a0.d r0 = r3.f1577d
            if (r0 == 0) goto L70
            r0 = 0
            java.lang.Class<? extends a.h.j.a0.d$a> r2 = r3.f1576c
            if (r2 == 0) goto L66
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L40
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L40
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Exception -> L40
            a.h.j.a0.d$a r2 = (p000a.p031h.p043j.p044a0.InterfaceC0247d.a) r2     // Catch: java.lang.Exception -> L40
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L3e
            goto L65
        L3e:
            r0 = move-exception
            goto L44
        L40:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L44:
            java.lang.Class<? extends a.h.j.a0.d$a> r4 = r3.f1576c
            if (r4 != 0) goto L4b
            java.lang.String r4 = "null"
            goto L4f
        L4b:
            java.lang.String r4 = r4.getName()
        L4f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r0)
        L65:
            r0 = r2
        L66:
            a.h.j.a0.d r2 = r3.f1577d
            boolean r0 = r2.mo832a(r9, r0)
            goto L71
        L6d:
            int r2 = r2 + 1
            goto L11
        L70:
            r0 = r1
        L71:
            if (r0 != 0) goto L79
            android.view.View$AccessibilityDelegate r0 = r8.f1556a
            boolean r0 = r0.performAccessibilityAction(r9, r10, r11)
        L79:
            if (r0 != 0) goto Lca
            r2 = 2131296297(0x7f090029, float:1.8210507E38)
            if (r10 != r2) goto Lca
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            r11 = 2131296766(0x7f0901fe, float:1.8211458E38)
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto Lc9
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto Lc9
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto Lc2
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = p000a.p031h.p043j.p044a0.C0245b.m817d(r11)
            r2 = r1
        Lb0:
            if (r11 == 0) goto Lc2
            int r3 = r11.length
            if (r2 >= r3) goto Lc2
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto Lbf
            r11 = r0
            goto Lc3
        Lbf:
            int r2 = r2 + 1
            goto Lb0
        Lc2:
            r11 = r1
        Lc3:
            if (r11 == 0) goto Lc9
            r10.onClick(r9)
            r1 = r0
        Lc9:
            r0 = r1
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p043j.C0243a.mo813g(android.view.View, int, android.os.Bundle):boolean");
    }

    /* renamed from: h */
    public void mo814h(View view, int i) {
        this.f1556a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: i */
    public void mo815i(View view, AccessibilityEvent accessibilityEvent) {
        this.f1556a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
