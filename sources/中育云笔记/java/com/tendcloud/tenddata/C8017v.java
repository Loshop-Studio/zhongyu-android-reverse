package com.tendcloud.tenddata;

import android.R;
import android.app.Fragment;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.compose.p014ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: com.tendcloud.tenddata.v */
/* loaded from: classes5.dex */
public class C8017v {

    /* renamed from: a */
    static final int f15114a = 1413742593;

    /* renamed from: b */
    static final int f15115b = 1413742594;

    /* renamed from: c */
    static final String f15116c = "MainContentView";

    /* renamed from: d */
    private static final String f15117d = "v";

    /* renamed from: e */
    private static Pattern f15118e = Pattern.compile("\\[(\\d)\\]");

    private C8017v() {
    }

    /* renamed from: a */
    public static String m12096a(View view) {
        String text;
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            int inputType = editText.getInputType();
            text = (inputType == 16 || inputType == 128 || inputType == 144 || inputType == 224) ? "" : editText.getText();
        } else {
            text = view instanceof TextView ? ((TextView) view).getText() : view.getContentDescription();
        }
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        return text.toString();
    }

    /* renamed from: b */
    public static boolean m12103b(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        try {
            Method declaredMethod = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("isVisibleToUser", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(view, null)).booleanValue();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: c */
    private static void m12106c(Object obj, List<String> list) {
        Fragment fragment = (Fragment) obj;
        list.add(fragment.getClass().getSimpleName());
        if (C7912cq.m11595a(17)) {
            for (Fragment parentFragment = fragment.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                list.add(MqttTopic.TOPIC_LEVEL_SEPARATOR);
                list.add(parentFragment.getClass().getName());
            }
        }
    }

    /* renamed from: d */
    public static boolean m12107d(View view) {
        if (view instanceof ListView) {
            return true;
        }
        if (C7976f.m11931a() && (view instanceof RecyclerView)) {
            return true;
        }
        return C7976f.m11932b() && (view instanceof RecyclerView);
    }

    /* renamed from: e */
    public static boolean m12108e(View view) {
        return view instanceof WebView;
    }

    /* renamed from: f */
    public static boolean m12109f(View view) {
        if (view == null || !view.isEnabled()) {
            return false;
        }
        Object parent = view.getParent();
        return parent instanceof AdapterView ? ((AdapterView) parent).getOnItemClickListener() != null : view instanceof CompoundButton ? ((view instanceof RadioButton) && (parent instanceof RadioGroup)) ? m12110g((View) parent) : m12110g(view) : C7912cq.m11595a(15) ? view.isClickable() && view.hasOnClickListeners() : view.isClickable();
    }

    /* renamed from: g */
    public static boolean m12110g(View view) {
        Field declaredField;
        try {
            Class<?> superclass = view.getClass();
            while (superclass != null && !View.class.getName().equals(superclass.getName()) && !CompoundButton.class.getName().equals(superclass.getName()) && !RadioGroup.class.getName().equals(superclass.getName())) {
                superclass = superclass.getSuperclass();
            }
            declaredField = superclass.getDeclaredField("mOnCheckedChangeListener");
            declaredField.setAccessible(true);
        } catch (Throwable unused) {
        }
        return declaredField.get(view) != null;
    }

    public static void trackFragment(Object obj) {
        if (m12100a(obj) || (obj instanceof Fragment) || m12104b(obj)) {
            View view = (m12100a(obj) || m12104b(obj)) ? ((androidx.fragment.app.Fragment) obj).getView() : ((Fragment) obj).getView();
            if (view == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(16);
            if (m12100a(obj)) {
                m12099a(obj, arrayList);
            } else if (m12104b(obj)) {
                m12102b(obj, arrayList);
            } else {
                m12106c(obj, arrayList);
            }
            String strConcat = "";
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                strConcat = strConcat.concat((String) arrayList.get(size));
            }
            view.setTag(f15115b, obj.getClass().getSimpleName());
            C7896ca.dForInternal("current fragment -> " + obj);
            m12098a(view, strConcat);
        }
    }

    /* renamed from: b */
    private static void m12102b(Object obj, List<String> list) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        list.add(fragment.getClass().getSimpleName());
        for (androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            list.add(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            list.add(parentFragment.getClass().getName());
        }
    }

    /* renamed from: a */
    private static void m12099a(Object obj, List<String> list) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        list.add(fragment.getClass().getSimpleName());
        for (androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            list.add(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            list.add(parentFragment.getClass().getName());
        }
    }

    /* renamed from: c */
    public static String m12105c(View view) throws Resources.NotFoundException {
        String simpleName;
        int childAdapterPosition;
        String resourceEntryName;
        int id2;
        if (view == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(view);
        for (ViewParent parent = view.getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
            arrayList.add((View) parent);
        }
        int size = arrayList.size();
        View view2 = (View) arrayList.get(size - 1);
        StringBuilder sb2 = new StringBuilder();
        if ("DecorView".equals(view2.getClass().getSimpleName())) {
            sb2.append("DecorView[0]/");
        }
        if (!(view2 instanceof ViewGroup)) {
            return "";
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        for (int i10 = size - 2; i10 >= 0; i10--) {
            View view3 = (View) arrayList.get(i10);
            if (view3.getTag(f15115b) != null) {
                simpleName = (String) view3.getTag(f15115b);
            } else if (view3.getId() == 16908290) {
                simpleName = f15116c;
            } else {
                simpleName = view3.getClass().getSimpleName();
            }
            int iIndexOfChild = viewGroup.indexOfChild(view3);
            if (C7976f.m11935e() && (viewGroup instanceof ViewPager)) {
                iIndexOfChild = ((ViewPager) viewGroup).getCurrentItem();
            } else if (C7976f.m11936f() && (viewGroup instanceof ViewPager)) {
                iIndexOfChild = ((ViewPager) viewGroup).getCurrentItem();
            } else if (viewGroup instanceof AdapterView) {
                iIndexOfChild = ((AdapterView) viewGroup).getPositionForView(view3);
            } else if (!C7976f.m11931a() || !(viewGroup instanceof RecyclerView) ? !(!C7976f.m11932b() || !(viewGroup instanceof RecyclerView) || (childAdapterPosition = ((RecyclerView) viewGroup).getChildAdapterPosition(view3)) < 0) : (childAdapterPosition = ((RecyclerView) viewGroup).getChildAdapterPosition(view3)) >= 0) {
                iIndexOfChild = childAdapterPosition;
            }
            try {
                id2 = view3.getId();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (id2 <= 2130706432 || id2 == -1) {
                resourceEntryName = "";
            } else {
                resourceEntryName = view3.getResources().getResourceEntryName(view3.getId());
            }
            String str = simpleName + "[" + iIndexOfChild + "]";
            if (!TextUtils.isEmpty(resourceEntryName)) {
                str = str + MqttTopic.MULTI_LEVEL_WILDCARD + resourceEntryName;
            }
            sb2.append(str);
            sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            if (!(view3 instanceof ViewGroup)) {
                break;
            }
            viewGroup = (ViewGroup) view3;
        }
        sb2.delete(sb2.lastIndexOf(MqttTopic.TOPIC_LEVEL_SEPARATOR), sb2.length());
        return sb2.toString();
    }

    /* renamed from: b */
    public static boolean m12104b(Object obj) {
        try {
            if (C7976f.m11934d()) {
                if (obj instanceof androidx.fragment.app.Fragment) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: a */
    private static void m12098a(View view, String str) {
        if (view != null) {
            view.setTag(f15114a, str);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m12098a(viewGroup.getChildAt(i10), str);
            }
        }
    }

    /* renamed from: a */
    private static boolean m12101a(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return str.substring(str.indexOf(f15116c)).equals(str2.substring(str2.indexOf(f15116c)));
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C8018w m12095a(View view, List<C8018w> list, boolean z10) throws Resources.NotFoundException {
        String string;
        if (view != null && list != null && list.size() != 0) {
            String strM12105c = m12105c(view);
            String str = f15117d;
            C7896ca.dForInternal(str, "btn_path:" + strM12105c);
            if (view instanceof TextView) {
                string = ((TextView) view).getText().toString();
                C7896ca.dForInternal(str, "btn_value:" + string);
            } else {
                string = null;
            }
            ArrayList arrayList = new ArrayList();
            for (C8018w c8018w : list) {
                if (view.getTag(f15114a) != null && view.getTag(f15114a).equals(c8018w.m12120i())) {
                    String strSubstring = c8018w.m12114c().substring(c8018w.m12114c().lastIndexOf(MqttTopic.TOPIC_LEVEL_SEPARATOR));
                    if (!TextUtils.isEmpty(strSubstring) && strSubstring.lastIndexOf(MqttTopic.MULTI_LEVEL_WILDCARD) > strSubstring.length() - 1) {
                        String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(MqttTopic.MULTI_LEVEL_WILDCARD) + 1);
                        String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
                        if (!TextUtils.isEmpty(strSubstring2) && strSubstring2.equals(resourceEntryName)) {
                            C7896ca.dForInternal(f15117d, "view id matched");
                            return c8018w;
                        }
                    }
                }
                if (m12101a(strM12105c, c8018w.m12114c())) {
                    C7896ca.dForInternal(f15117d, "view path matched");
                    return c8018w;
                }
                String str2 = f15117d;
                C7896ca.dForInternal(str2, "btn_value:" + string + "||eventValue:" + c8018w.m12119h() + "||eventSame:" + c8018w.m12113b());
                if (!TextUtils.isEmpty(string) && string.equalsIgnoreCase(c8018w.m12119h())) {
                    C7896ca.dForInternal(str2, "view value matched");
                    return c8018w;
                }
                if (!TextUtils.isEmpty(c8018w.m12113b())) {
                    arrayList.add(c8018w);
                }
            }
            C7896ca.dForInternal(f15117d, "same elements:" + arrayList.size());
            if (z10 && arrayList.size() > 0) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    C8018w c8018w2 = (C8018w) obj;
                    if (strM12105c.startsWith(c8018w2.m12113b())) {
                        C7896ca.dForInternal(f15117d, "view same matched");
                        return c8018w2;
                    }
                }
            }
            C7896ca.dForInternal(f15117d, "view none matched");
            return null;
        }
        C7896ca.dForInternal(f15117d, "empty reject");
        return null;
    }

    /* renamed from: a */
    public static Map<String, Object> m12097a(View view, C8018w c8018w) {
        if (view != null && c8018w != null && c8018w.m12116e() != null && c8018w.m12116e().size() != 0) {
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(view);
            for (ViewParent parent = view.getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
                arrayList.add((View) parent);
            }
            View view2 = (View) arrayList.get(arrayList.size() - 1);
            C7896ca.dForInternal(f15117d, "rootView-----:" + view2);
            HashMap map = new HashMap();
            for (C8007k c8007k : c8018w.m12116e()) {
                View viewM12094a = m12094a(c8007k.m12040b(), (ViewGroup) view2);
                C7896ca.dForInternal(f15117d, "getTarget:" + viewM12094a);
                if (viewM12094a != null && (viewM12094a instanceof TextView)) {
                    TextView textView = (TextView) viewM12094a;
                    if (!TextUtils.isEmpty(textView.getText().toString())) {
                        map.put(c8007k.m12039a(), textView.getText().toString());
                    }
                }
            }
            C7896ca.dForInternal(f15117d, "values:" + map.toString());
            return map;
        }
        C7896ca.dForInternal(f15117d, "getValue faild by null");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: a */
    private static View m12094a(String str, ViewGroup viewGroup) {
        if (!TextUtils.isEmpty(str) && viewGroup != null) {
            int iIndexOf = str.indexOf(f15116c);
            String childAt = str;
            if (iIndexOf > 0) {
                String strSubstring = str.substring(iIndexOf);
                viewGroup = (ViewGroup) viewGroup.findViewById(R.id.content);
                childAt = strSubstring;
            }
            try {
                ArrayList arrayList = new ArrayList();
                Matcher matcher = f15118e.matcher(childAt);
                while (matcher.find()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(matcher.group(1))));
                }
                C7896ca.dForInternal(f15117d, arrayList.toString());
                for (int i10 = 1; i10 < arrayList.size(); i10++) {
                    if (i10 == arrayList.size() - 1) {
                        childAt = viewGroup.getChildAt(((Integer) arrayList.get(i10)).intValue());
                        return childAt;
                    }
                    viewGroup = (ViewGroup) viewGroup.getChildAt(((Integer) arrayList.get(i10)).intValue());
                    if (viewGroup == null) {
                        break;
                    }
                }
                return null;
            } catch (Exception e10) {
                C7896ca.dForInternal(f15117d, "parse error:" + childAt);
                e10.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m12100a(Object obj) {
        try {
            if (C7976f.m11933c()) {
                if (obj instanceof androidx.fragment.app.Fragment) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
