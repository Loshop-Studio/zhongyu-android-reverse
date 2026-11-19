package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0003b;
import p011b0.C1025h;

/* renamed from: androidx.core.widget.k */
/* loaded from: classes.dex */
public final class C0377k {

    /* renamed from: androidx.core.widget.k$a */
    private static class a implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f2827a;

        /* renamed from: b */
        private final TextView f2828b;

        /* renamed from: c */
        private Class<?> f2829c;

        /* renamed from: d */
        private Method f2830d;

        /* renamed from: e */
        private boolean f2831e;

        /* renamed from: f */
        private boolean f2832f = false;

        a(ActionMode.Callback callback, TextView textView) {
            this.f2827a = callback;
            this.f2828b = textView;
        }

        /* renamed from: a */
        private Intent m2204a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m2205b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = m2204a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m2207d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m2206c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m2204a(), 0)) {
                if (m2208e(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        private boolean m2207d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: e */
        private boolean m2208e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: f */
        private void m2209f(Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            Context context = this.f2828b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2832f) {
                this.f2832f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2829c = cls;
                    this.f2830d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f2831e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2829c = null;
                    this.f2830d = null;
                    this.f2831e = false;
                }
            }
            try {
                Method declaredMethod = (this.f2831e && this.f2829c.isInstance(menu)) ? this.f2830d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listM2206c = m2206c(context, packageManager);
                for (int i4 = 0; i4 < listM2206c.size(); i4++) {
                    ResolveInfo resolveInfo = listM2206c.get(i4);
                    menu.add(0, 0, i4 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m2205b(resolveInfo, this.f2828b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2827a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2827a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2827a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            m2209f(menu);
            return this.f2827a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m2187a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* renamed from: b */
    public static int m2188b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m2189c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m2190d(TextView textView) {
        return textView.getMaxLines();
    }

    /* renamed from: e */
    private static int m2191e(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: f */
    private static TextDirectionHeuristic m2192f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z3 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z3) {
                    break;
                } else {
                    break;
                }
        }
        return TextDirectionHeuristics.LTR;
    }

    /* renamed from: g */
    public static C0003b.a m2193g(TextView textView) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new C0003b.a(textView.getTextMetricsParams());
        }
        C0003b.a.C3516a c3516a = new C0003b.a.C3516a(new TextPaint(textView.getPaint()));
        if (i4 >= 23) {
            c3516a.m37b(textView.getBreakStrategy());
            c3516a.m38c(textView.getHyphenationFrequency());
        }
        c3516a.m39d(m2192f(textView));
        return c3516a.m36a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static void m2194h(TextView textView, ColorStateList colorStateList) {
        C1025h.m4782f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof InterfaceC0379m) {
            ((InterfaceC0379m) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static void m2195i(TextView textView, PorterDuff.Mode mode) {
        C1025h.m4782f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof InterfaceC0379m) {
            ((InterfaceC0379m) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: j */
    public static void m2196j(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: k */
    public static void m2197k(TextView textView, int i4) {
        C1025h.m4780d(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: l */
    public static void m2198l(TextView textView, int i4) {
        C1025h.m4780d(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    /* renamed from: m */
    public static void m2199m(TextView textView, int i4) {
        C1025h.m4780d(i4);
        if (i4 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i4 - r0, 1.0f);
        }
    }

    /* renamed from: n */
    public static void m2200n(TextView textView, C0003b c0003b) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(c0003b.m30b());
        } else {
            if (!m2193g(textView).m31a(c0003b.m29a())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(c0003b);
        }
    }

    /* renamed from: o */
    public static void m2201o(TextView textView, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i4);
        } else {
            textView.setTextAppearance(textView.getContext(), i4);
        }
    }

    /* renamed from: p */
    public static void m2202p(TextView textView, C0003b.a aVar) {
        int i4 = Build.VERSION.SDK_INT;
        textView.setTextDirection(m2191e(aVar.m34d()));
        if (i4 >= 23) {
            textView.getPaint().set(aVar.m35e());
            textView.setBreakStrategy(aVar.m32b());
            textView.setHyphenationFrequency(aVar.m33c());
        } else {
            float textScaleX = aVar.m35e().getTextScaleX();
            textView.getPaint().set(aVar.m35e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
        }
    }

    /* renamed from: q */
    public static ActionMode.Callback m2203q(TextView textView, ActionMode.Callback callback) {
        int i4 = Build.VERSION.SDK_INT;
        return (i4 < 26 || i4 > 27 || (callback instanceof a) || callback == null) ? callback : new a(callback, textView);
    }
}
