package com.blankj.utilcode.util;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class FragmentUtils {
    private static final String ARGS_ID = "args_id";
    private static final String ARGS_IS_ADD_STACK = "args_is_add_stack";
    private static final String ARGS_IS_HIDE = "args_is_hide";
    private static final String ARGS_TAG = "args_tag";
    private static final int TYPE_ADD_FRAGMENT = 1;
    private static final int TYPE_HIDE_FRAGMENT = 4;
    private static final int TYPE_REMOVE_FRAGMENT = 32;
    private static final int TYPE_REMOVE_TO_FRAGMENT = 64;
    private static final int TYPE_REPLACE_FRAGMENT = 16;
    private static final int TYPE_SHOW_FRAGMENT = 2;
    private static final int TYPE_SHOW_HIDE_FRAGMENT = 8;

    public static class Args {

        /* renamed from: id */
        final int f3346id;
        final boolean isAddStack;
        final boolean isHide;
        final String tag;

        public Args(int i10, boolean z9, boolean z10) {
            this(i10, null, z9, z10);
        }

        public Args(int i10, String str, boolean z9, boolean z10) {
            this.f3346id = i10;
            this.tag = str;
            this.isHide = z9;
            this.isAddStack = z10;
        }
    }

    public static class FragmentNode {
        final Fragment fragment;
        final List<FragmentNode> next;

        public FragmentNode(Fragment fragment, List<FragmentNode> list) {
            this.fragment = fragment;
            this.next = list;
        }

        public Fragment getFragment() {
            return this.fragment;
        }

        public List<FragmentNode> getNext() {
            return this.next;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.fragment.getClass().getSimpleName());
            sb.append("->");
            List<FragmentNode> list = this.next;
            sb.append((list == null || list.isEmpty()) ? "no child" : this.next.toString());
            return sb.toString();
        }
    }

    public interface OnBackClickListener {
        boolean onBackClick();
    }

    private FragmentUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10) {
        add(fragmentManager, fragment, i10, (String) null, false, false);
    }

    private static void addAnim(FragmentTransaction fragmentTransaction, int i10, int i11, int i12, int i13) {
        fragmentTransaction.setCustomAnimations(i10, i11, i12, i13);
    }

    private static void addSharedElement(FragmentTransaction fragmentTransaction, View... viewArr) {
        for (View view : viewArr) {
            fragmentTransaction.addSharedElement(view, view.getTransitionName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchBackPress(@NonNull Fragment fragment) {
        return fragment.isResumed() && fragment.isVisible() && fragment.getUserVisibleHint() && (fragment instanceof OnBackClickListener) && ((OnBackClickListener) fragment).onBackClick();
    }

    public static Fragment findFragment(@NonNull FragmentManager fragmentManager, Class<? extends Fragment> cls) {
        return fragmentManager.findFragmentByTag(cls.getName());
    }

    public static List<FragmentNode> getAllFragments(@NonNull FragmentManager fragmentManager) {
        return getAllFragments(fragmentManager, new ArrayList());
    }

    public static List<FragmentNode> getAllFragmentsInStack(@NonNull FragmentManager fragmentManager) {
        return getAllFragmentsInStack(fragmentManager, new ArrayList());
    }

    private static Args getArgs(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        return new Args(arguments.getInt(ARGS_ID, fragment.getId()), arguments.getBoolean(ARGS_IS_HIDE), arguments.getBoolean(ARGS_IS_ADD_STACK));
    }

    public static List<Fragment> getFragments(@NonNull FragmentManager fragmentManager) {
        List<Fragment> fragments = fragmentManager.getFragments();
        return (fragments == null || fragments.isEmpty()) ? Collections.EMPTY_LIST : fragments;
    }

    public static List<Fragment> getFragmentsInStack(@NonNull FragmentManager fragmentManager) {
        Bundle arguments;
        List<Fragment> fragments = getFragments(fragmentManager);
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : fragments) {
            if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getBoolean(ARGS_IS_ADD_STACK)) {
                arrayList.add(fragment);
            }
        }
        return arrayList;
    }

    public static String getSimpleName(Fragment fragment) {
        return fragment == null ? "null" : fragment.getClass().getSimpleName();
    }

    public static Fragment getTop(@NonNull FragmentManager fragmentManager) {
        return getTopIsInStack(fragmentManager, null, false);
    }

    public static Fragment getTopInStack(@NonNull FragmentManager fragmentManager) {
        return getTopIsInStack(fragmentManager, null, true);
    }

    private static Fragment getTopIsInStack(@NonNull FragmentManager fragmentManager, Fragment fragment, boolean z9) {
        List<Fragment> fragments = getFragments(fragmentManager);
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment2 = fragments.get(size);
            if (fragment2 != null) {
                if (!z9) {
                    return getTopIsInStack(fragment2.getChildFragmentManager(), fragment2, false);
                }
                Bundle arguments = fragment2.getArguments();
                if (arguments != null && arguments.getBoolean(ARGS_IS_ADD_STACK)) {
                    return getTopIsInStack(fragment2.getChildFragmentManager(), fragment2, true);
                }
            }
        }
        return fragment;
    }

    public static Fragment getTopShow(@NonNull FragmentManager fragmentManager) {
        return getTopShowIsInStack(fragmentManager, null, false);
    }

    public static Fragment getTopShowInStack(@NonNull FragmentManager fragmentManager) {
        return getTopShowIsInStack(fragmentManager, null, true);
    }

    private static Fragment getTopShowIsInStack(@NonNull FragmentManager fragmentManager, Fragment fragment, boolean z9) {
        List<Fragment> fragments = getFragments(fragmentManager);
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment2 = fragments.get(size);
            if (fragment2 != null && fragment2.isResumed() && fragment2.isVisible() && fragment2.getUserVisibleHint()) {
                if (!z9) {
                    return getTopShowIsInStack(fragment2.getChildFragmentManager(), fragment2, false);
                }
                Bundle arguments = fragment2.getArguments();
                if (arguments != null && arguments.getBoolean(ARGS_IS_ADD_STACK)) {
                    return getTopShowIsInStack(fragment2.getChildFragmentManager(), fragment2, true);
                }
            }
        }
        return fragment;
    }

    public static void hide(@NonNull Fragment fragment) {
        putArgs(fragment, true);
        operateNoAnim(4, fragment.getFragmentManager(), null, fragment);
    }

    private static void operate(int i10, @NonNull FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, Fragment fragment, Fragment... fragmentArr) {
        if (fragment != null && fragment.isRemoving()) {
            Log.e("FragmentUtils", fragment.getClass().getName() + " is isRemoving");
            return;
        }
        int i11 = 0;
        if (i10 == 1) {
            int length = fragmentArr.length;
            while (i11 < length) {
                Fragment fragment2 = fragmentArr[i11];
                Bundle arguments = fragment2.getArguments();
                if (arguments == null) {
                    return;
                }
                String string = arguments.getString(ARGS_TAG, fragment2.getClass().getName());
                Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(string);
                if (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isAdded()) {
                    fragmentTransaction.remove(fragmentFindFragmentByTag);
                }
                fragmentTransaction.add(arguments.getInt(ARGS_ID), fragment2, string);
                if (arguments.getBoolean(ARGS_IS_HIDE)) {
                    fragmentTransaction.hide(fragment2);
                }
                if (arguments.getBoolean(ARGS_IS_ADD_STACK)) {
                    fragmentTransaction.addToBackStack(string);
                }
                i11++;
            }
        } else if (i10 == 2) {
            int length2 = fragmentArr.length;
            while (i11 < length2) {
                fragmentTransaction.show(fragmentArr[i11]);
                i11++;
            }
        } else if (i10 == 4) {
            int length3 = fragmentArr.length;
            while (i11 < length3) {
                fragmentTransaction.hide(fragmentArr[i11]);
                i11++;
            }
        } else if (i10 == 8) {
            fragmentTransaction.show(fragment);
            int length4 = fragmentArr.length;
            while (i11 < length4) {
                Fragment fragment3 = fragmentArr[i11];
                if (fragment3 != fragment) {
                    fragmentTransaction.hide(fragment3);
                }
                i11++;
            }
        } else if (i10 == 16) {
            Bundle arguments2 = fragmentArr[0].getArguments();
            if (arguments2 == null) {
                return;
            }
            String string2 = arguments2.getString(ARGS_TAG, fragmentArr[0].getClass().getName());
            fragmentTransaction.replace(arguments2.getInt(ARGS_ID), fragmentArr[0], string2);
            if (arguments2.getBoolean(ARGS_IS_ADD_STACK)) {
                fragmentTransaction.addToBackStack(string2);
            }
        } else if (i10 == 32) {
            int length5 = fragmentArr.length;
            while (i11 < length5) {
                Fragment fragment4 = fragmentArr[i11];
                if (fragment4 != fragment) {
                    fragmentTransaction.remove(fragment4);
                }
                i11++;
            }
        } else if (i10 == 64) {
            int length6 = fragmentArr.length - 1;
            while (true) {
                if (length6 < 0) {
                    break;
                }
                Fragment fragment5 = fragmentArr[length6];
                if (fragment5 != fragmentArr[0]) {
                    fragmentTransaction.remove(fragment5);
                    length6--;
                } else if (fragment != null) {
                    fragmentTransaction.remove(fragment5);
                }
            }
        }
        fragmentTransaction.commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
    }

    private static void operateNoAnim(int i10, @Nullable FragmentManager fragmentManager, Fragment fragment, Fragment... fragmentArr) {
        if (fragmentManager == null) {
            return;
        }
        operate(i10, fragmentManager, fragmentManager.beginTransaction(), fragment, fragmentArr);
    }

    public static void pop(@NonNull FragmentManager fragmentManager) {
        pop(fragmentManager, true);
    }

    public static void popAll(@NonNull FragmentManager fragmentManager) {
        popAll(fragmentManager, true);
    }

    public static void popTo(@NonNull FragmentManager fragmentManager, Class<? extends Fragment> cls, boolean z9) {
        popTo(fragmentManager, cls, z9, true);
    }

    private static void putArgs(Fragment fragment, Args args) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putInt(ARGS_ID, args.f3346id);
        arguments.putBoolean(ARGS_IS_HIDE, args.isHide);
        arguments.putBoolean(ARGS_IS_ADD_STACK, args.isAddStack);
        arguments.putString(ARGS_TAG, args.tag);
    }

    public static void remove(@NonNull Fragment fragment) {
        operateNoAnim(32, fragment.getFragmentManager(), null, fragment);
    }

    public static void removeAll(@NonNull FragmentManager fragmentManager) {
        operateNoAnim(32, fragmentManager, null, (Fragment[]) getFragments(fragmentManager).toArray(new Fragment[0]));
    }

    public static void removeTo(@NonNull Fragment fragment, boolean z9) {
        operateNoAnim(64, fragment.getFragmentManager(), z9 ? fragment : null, fragment);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2) {
        replace(fragment, fragment2, (String) null, false);
    }

    public static void setBackground(@NonNull Fragment fragment, Drawable drawable) {
        View view = fragment.getView();
        if (view == null) {
            return;
        }
        view.setBackground(drawable);
    }

    public static void setBackgroundColor(@NonNull Fragment fragment, @ColorInt int i10) {
        View view = fragment.getView();
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public static void setBackgroundResource(@NonNull Fragment fragment, @DrawableRes int i10) {
        View view = fragment.getView();
        if (view != null) {
            view.setBackgroundResource(i10);
        }
    }

    public static void show(@NonNull Fragment fragment) {
        putArgs(fragment, false);
        operateNoAnim(2, fragment.getFragmentManager(), null, fragment);
    }

    public static void showHide(@NonNull Fragment fragment, @NonNull Fragment fragment2) {
        showHide(fragment, (List<Fragment>) Collections.singletonList(fragment2));
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, boolean z9) {
        add(fragmentManager, fragment, i10, (String) null, z9, false);
    }

    public static Fragment findFragment(@NonNull FragmentManager fragmentManager, @NonNull String str) {
        return fragmentManager.findFragmentByTag(str);
    }

    private static List<FragmentNode> getAllFragments(@NonNull FragmentManager fragmentManager, List<FragmentNode> list) {
        List<Fragment> fragments = getFragments(fragmentManager);
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment = fragments.get(size);
            if (fragment != null) {
                list.add(new FragmentNode(fragment, getAllFragments(fragment.getChildFragmentManager(), new ArrayList())));
            }
        }
        return list;
    }

    private static List<FragmentNode> getAllFragmentsInStack(@NonNull FragmentManager fragmentManager, List<FragmentNode> list) {
        Bundle arguments;
        List<Fragment> fragments = getFragments(fragmentManager);
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment = fragments.get(size);
            if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getBoolean(ARGS_IS_ADD_STACK)) {
                list.add(new FragmentNode(fragment, getAllFragmentsInStack(fragment.getChildFragmentManager(), new ArrayList())));
            }
        }
        return list;
    }

    public static void pop(@NonNull FragmentManager fragmentManager, boolean z9) {
        if (z9) {
            fragmentManager.popBackStackImmediate();
        } else {
            fragmentManager.popBackStack();
        }
    }

    public static void popAll(@NonNull FragmentManager fragmentManager, boolean z9) {
        if (fragmentManager.getBackStackEntryCount() > 0) {
            FragmentManager.BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(0);
            if (z9) {
                fragmentManager.popBackStackImmediate(backStackEntryAt.getId(), 1);
            } else {
                fragmentManager.popBackStack(backStackEntryAt.getId(), 1);
            }
        }
    }

    public static void popTo(@NonNull FragmentManager fragmentManager, Class<? extends Fragment> cls, boolean z9, boolean z10) {
        if (z10) {
            fragmentManager.popBackStackImmediate(cls.getName(), z9 ? 1 : 0);
        } else {
            fragmentManager.popBackStack(cls.getName(), z9 ? 1 : 0);
        }
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, boolean z9) {
        replace(fragment, fragment2, (String) null, z9);
    }

    public static void showHide(int i10, @NonNull Fragment... fragmentArr) {
        showHide(fragmentArr[i10], fragmentArr);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, boolean z9, boolean z10) {
        add(fragmentManager, fragment, i10, (String) null, z9, z10);
    }

    public static void hide(@NonNull FragmentManager fragmentManager) {
        List<Fragment> fragments = getFragments(fragmentManager);
        Iterator<Fragment> it = fragments.iterator();
        while (it.hasNext()) {
            putArgs(it.next(), true);
        }
        operateNoAnim(4, fragmentManager, null, (Fragment[]) fragments.toArray(new Fragment[0]));
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11) {
        replace(fragment, fragment2, (String) null, false, i10, i11, 0, 0);
    }

    public static void show(@NonNull FragmentManager fragmentManager) {
        List<Fragment> fragments = getFragments(fragmentManager);
        Iterator<Fragment> it = fragments.iterator();
        while (it.hasNext()) {
            putArgs(it.next(), false);
        }
        operateNoAnim(2, fragmentManager, null, (Fragment[]) fragments.toArray(new Fragment[0]));
    }

    public static void showHide(@NonNull Fragment fragment, @NonNull Fragment... fragmentArr) {
        showHide(fragment, (List<Fragment>) Arrays.asList(fragmentArr));
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12) {
        add(fragmentManager, fragment, i10, null, false, i11, i12, 0, 0);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, boolean z9, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11) {
        replace(fragment, fragment2, (String) null, z9, i10, i11, 0, 0);
    }

    public static void showHide(int i10, @NonNull List<Fragment> list) {
        showHide(list.get(i10), list);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, boolean z9, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12) {
        add(fragmentManager, fragment, i10, null, z9, i11, i12, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchBackPress(@NonNull FragmentManager fragmentManager) {
        List<Fragment> fragments = getFragments(fragmentManager);
        if (fragments != null && !fragments.isEmpty()) {
            for (int size = fragments.size() - 1; size >= 0; size--) {
                Fragment fragment = fragments.get(size);
                if (fragment != 0 && fragment.isResumed() && fragment.isVisible() && fragment.getUserVisibleHint() && (fragment instanceof OnBackClickListener) && ((OnBackClickListener) fragment).onBackClick()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13) {
        replace(fragment, fragment2, (String) null, false, i10, i11, i12, i13);
    }

    public static void showHide(@NonNull Fragment fragment, @NonNull List<Fragment> list) {
        Iterator<Fragment> it = list.iterator();
        while (true) {
            boolean z9 = false;
            if (it.hasNext()) {
                Fragment next = it.next();
                if (next != fragment) {
                    z9 = true;
                }
                putArgs(next, z9);
            } else {
                operateNoAnim(8, fragment.getFragmentManager(), fragment, (Fragment[]) list.toArray(new Fragment[0]));
                return;
            }
        }
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13, @AnimRes @AnimatorRes int i14) {
        add(fragmentManager, fragment, i10, null, false, i11, i12, i13, i14);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, boolean z9, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13) {
        replace(fragment, fragment2, (String) null, z9, i10, i11, i12, i13);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, boolean z9, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13, @AnimRes @AnimatorRes int i14) {
        add(fragmentManager, fragment, i10, null, z9, i11, i12, i13, i14);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, View... viewArr) {
        replace(fragment, fragment2, (String) null, false, viewArr);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, @NonNull View... viewArr) {
        add(fragmentManager, fragment, i10, (String) null, false, viewArr);
    }

    private static void putArgs(Fragment fragment, boolean z9) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putBoolean(ARGS_IS_HIDE, z9);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, boolean z9, View... viewArr) {
        replace(fragment, fragment2, (String) null, z9, viewArr);
    }

    public static void showHide(@NonNull Fragment fragment, @NonNull Fragment fragment2, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13) {
        showHide(fragment, (List<Fragment>) Collections.singletonList(fragment2), i10, i11, i12, i13);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, boolean z9, @NonNull View... viewArr) {
        add(fragmentManager, fragment, i10, (String) null, z9, viewArr);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10) {
        replace(fragmentManager, fragment, i10, (String) null, false);
    }

    public static void showHide(int i10, @NonNull List<Fragment> list, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13, @AnimRes @AnimatorRes int i14) {
        showHide(list.get(i10), list, i11, i12, i13, i14);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull List<Fragment> list, @IdRes int i10, int i11) {
        add(fragmentManager, (Fragment[]) list.toArray(new Fragment[0]), i10, (String[]) null, i11);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, boolean z9) {
        replace(fragmentManager, fragment, i10, (String) null, z9);
    }

    public static void showHide(@NonNull Fragment fragment, @NonNull List<Fragment> list, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13) {
        Iterator<Fragment> it = list.iterator();
        while (true) {
            boolean z9 = false;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next != fragment) {
                z9 = true;
            }
            putArgs(next, z9);
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            addAnim(fragmentTransactionBeginTransaction, i10, i11, i12, i13);
            operate(8, fragmentManager, fragmentTransactionBeginTransaction, fragment, (Fragment[]) list.toArray(new Fragment[0]));
        }
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment[] fragmentArr, @IdRes int i10, int i11) {
        add(fragmentManager, fragmentArr, i10, (String[]) null, i11);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12) {
        replace(fragmentManager, fragment, i10, null, false, i11, i12, 0, 0);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str) {
        add(fragmentManager, fragment, i10, str, false, false);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, boolean z9, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12) {
        replace(fragmentManager, fragment, i10, null, z9, i11, i12, 0, 0);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, boolean z9) {
        add(fragmentManager, fragment, i10, str, z9, false);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13, @AnimRes @AnimatorRes int i14) {
        replace(fragmentManager, fragment, i10, null, false, i11, i12, i13, i14);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, boolean z9, boolean z10) {
        putArgs(fragment, new Args(i10, str, z9, z10));
        operateNoAnim(1, fragmentManager, null, fragment);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, boolean z9, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13, @AnimRes @AnimatorRes int i14) {
        replace(fragmentManager, fragment, i10, null, z9, i11, i12, i13, i14);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, View... viewArr) {
        replace(fragmentManager, fragment, i10, (String) null, false, viewArr);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12) {
        add(fragmentManager, fragment, i10, str, false, i11, i12, 0, 0);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, boolean z9, View... viewArr) {
        replace(fragmentManager, fragment, i10, (String) null, z9, viewArr);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, boolean z9, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12) {
        add(fragmentManager, fragment, i10, str, z9, i11, i12, 0, 0);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str) {
        replace(fragment, fragment2, str, false);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13, @AnimRes @AnimatorRes int i14) {
        add(fragmentManager, fragment, i10, str, false, i11, i12, i13, i14);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, boolean z9) {
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        replace(fragmentManager, fragment2, getArgs(fragment).f3346id, str, z9);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, boolean z9, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13, @AnimRes @AnimatorRes int i14) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        putArgs(fragment, new Args(i10, str, false, z9));
        addAnim(fragmentTransactionBeginTransaction, i11, i12, i13, i14);
        operate(1, fragmentManager, fragmentTransactionBeginTransaction, null, fragment);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11) {
        replace(fragment, fragment2, str, false, i10, i11, 0, 0);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, boolean z9, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11) {
        replace(fragment, fragment2, str, z9, i10, i11, 0, 0);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, @NonNull View... viewArr) {
        add(fragmentManager, fragment, i10, str, false, viewArr);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13) {
        replace(fragment, fragment2, str, false, i10, i11, i12, i13);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, boolean z9, @NonNull View... viewArr) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        putArgs(fragment, new Args(i10, str, false, z9));
        addSharedElement(fragmentTransactionBeginTransaction, viewArr);
        operate(1, fragmentManager, fragmentTransactionBeginTransaction, null, fragment);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, boolean z9, @AnimRes @AnimatorRes int i10, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13) {
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        replace(fragmentManager, fragment2, getArgs(fragment).f3346id, str, z9, i10, i11, i12, i13);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, View... viewArr) {
        replace(fragment, fragment2, str, false, viewArr);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull List<Fragment> list, @IdRes int i10, String[] strArr, int i11) {
        add(fragmentManager, (Fragment[]) list.toArray(new Fragment[0]), i10, strArr, i11);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, boolean z9, View... viewArr) {
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        replace(fragmentManager, fragment2, getArgs(fragment).f3346id, str, z9, viewArr);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment[] fragmentArr, @IdRes int i10, String[] strArr, int i11) {
        if (strArr == null) {
            int length = fragmentArr.length;
            int i12 = 0;
            while (i12 < length) {
                putArgs(fragmentArr[i12], new Args(i10, null, i11 != i12, false));
                i12++;
            }
        } else {
            int length2 = fragmentArr.length;
            int i13 = 0;
            while (i13 < length2) {
                putArgs(fragmentArr[i13], new Args(i10, strArr[i13], i11 != i13, false));
                i13++;
            }
        }
        operateNoAnim(1, fragmentManager, null, fragmentArr);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str) {
        replace(fragmentManager, fragment, i10, str, false);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, boolean z9) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        putArgs(fragment, new Args(i10, str, false, z9));
        operate(16, fragmentManager, fragmentTransactionBeginTransaction, null, fragment);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12) {
        replace(fragmentManager, fragment, i10, str, false, i11, i12, 0, 0);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, boolean z9, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12) {
        replace(fragmentManager, fragment, i10, str, z9, i11, i12, 0, 0);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13, @AnimRes @AnimatorRes int i14) {
        replace(fragmentManager, fragment, i10, str, false, i11, i12, i13, i14);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, boolean z9, @AnimRes @AnimatorRes int i11, @AnimRes @AnimatorRes int i12, @AnimRes @AnimatorRes int i13, @AnimRes @AnimatorRes int i14) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        putArgs(fragment, new Args(i10, str, false, z9));
        addAnim(fragmentTransactionBeginTransaction, i11, i12, i13, i14);
        operate(16, fragmentManager, fragmentTransactionBeginTransaction, null, fragment);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, View... viewArr) {
        replace(fragmentManager, fragment, i10, str, false, viewArr);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i10, String str, boolean z9, View... viewArr) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        putArgs(fragment, new Args(i10, str, false, z9));
        addSharedElement(fragmentTransactionBeginTransaction, viewArr);
        operate(16, fragmentManager, fragmentTransactionBeginTransaction, null, fragment);
    }
}
