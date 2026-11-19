package p000a.p005b.p014h;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p031h.p033c.C0192a;
import p000a.p047i.p048a.AbstractC0286c;

/* renamed from: a.b.h.o0 */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0098o0 extends AbstractC0286c implements View.OnClickListener {

    /* renamed from: z */
    public static final /* synthetic */ int f724z = 0;

    /* renamed from: m */
    public final SearchView f725m;

    /* renamed from: n */
    public final SearchableInfo f726n;

    /* renamed from: o */
    public final Context f727o;

    /* renamed from: p */
    public final WeakHashMap<String, Drawable.ConstantState> f728p;

    /* renamed from: q */
    public final int f729q;

    /* renamed from: r */
    public int f730r;

    /* renamed from: s */
    public ColorStateList f731s;

    /* renamed from: t */
    public int f732t;

    /* renamed from: u */
    public int f733u;

    /* renamed from: v */
    public int f734v;

    /* renamed from: w */
    public int f735w;

    /* renamed from: x */
    public int f736x;

    /* renamed from: y */
    public int f737y;

    /* renamed from: a.b.h.o0$a */
    public static final class a {

        /* renamed from: a */
        public final TextView f738a;

        /* renamed from: b */
        public final TextView f739b;

        /* renamed from: c */
        public final ImageView f740c;

        /* renamed from: d */
        public final ImageView f741d;

        /* renamed from: e */
        public final ImageView f742e;

        public a(View view) {
            this.f738a = (TextView) view.findViewById(R.id.text1);
            this.f739b = (TextView) view.findViewById(R.id.text2);
            this.f740c = (ImageView) view.findViewById(R.id.icon1);
            this.f741d = (ImageView) view.findViewById(R.id.icon2);
            this.f742e = (ImageView) view.findViewById(C1088R.id.edit_query);
        }
    }

    public ViewOnClickListenerC0098o0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f730r = 1;
        this.f732t = -1;
        this.f733u = -1;
        this.f734v = -1;
        this.f735w = -1;
        this.f736x = -1;
        this.f737y = -1;
        this.f725m = searchView;
        this.f726n = searchableInfo;
        this.f729q = searchView.getSuggestionCommitIconResId();
        this.f727o = context;
        this.f728p = weakHashMap;
    }

    /* renamed from: h */
    public static String m367h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.p047i.p048a.AbstractC0284a
    /* renamed from: a */
    public void mo368a(View view, Context context, Cursor cursor) throws PackageManager.NameNotFoundException, NumberFormatException, IOException {
        Drawable drawableM373f;
        String string;
        Drawable drawable;
        ActivityInfo activityInfo;
        int iconResource;
        String strM367h;
        a aVar = (a) view.getTag();
        int i = this.f737y;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f738a != null) {
            String strM367h2 = m367h(cursor, this.f732t);
            TextView textView = aVar.f738a;
            textView.setText(strM367h2);
            textView.setVisibility(TextUtils.isEmpty(strM367h2) ? 8 : 0);
        }
        if (aVar.f739b != null) {
            String strM367h3 = m367h(cursor, this.f734v);
            if (strM367h3 != null) {
                if (this.f731s == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f727o.getTheme().resolveAttribute(C1088R.attr.textColorSearchUrl, typedValue, true);
                    this.f731s = this.f727o.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strM367h3);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f731s, null), 0, strM367h3.length(), 33);
                strM367h = spannableString;
            } else {
                strM367h = m367h(cursor, this.f733u);
            }
            if (TextUtils.isEmpty(strM367h)) {
                TextView textView2 = aVar.f738a;
                if (textView2 != null) {
                    textView2.setSingleLine(false);
                    aVar.f738a.setMaxLines(2);
                }
            } else {
                TextView textView3 = aVar.f738a;
                if (textView3 != null) {
                    textView3.setSingleLine(true);
                    aVar.f738a.setMaxLines(1);
                }
            }
            TextView textView4 = aVar.f739b;
            textView4.setText(strM367h);
            textView4.setVisibility(TextUtils.isEmpty(strM367h) ? 8 : 0);
        }
        ImageView imageView = aVar.f740c;
        if (imageView != null) {
            int i3 = this.f735w;
            if (i3 == -1) {
                drawableM373f = null;
            } else {
                drawableM373f = m373f(cursor.getString(i3));
                if (drawableM373f == null) {
                    ComponentName searchActivity = this.f726n.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    if (this.f728p.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = this.f728p.get(strFlattenToShortString);
                        drawableM373f = constantState == null ? null : constantState.newDrawable(this.f727o.getResources());
                    } else {
                        PackageManager packageManager = this.f727o.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e2) {
                            string = e2.toString();
                        }
                        if (iconResource != 0) {
                            drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                string = "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString();
                                Log.w("SuggestionsAdapter", string);
                                drawable = null;
                            }
                        } else {
                            drawable = null;
                        }
                        this.f728p.put(strFlattenToShortString, drawable == null ? null : drawable.getConstantState());
                        drawableM373f = drawable;
                    }
                    if (drawableM373f == null) {
                        drawableM373f = this.f727o.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableM373f);
            if (drawableM373f == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableM373f.setVisible(false, false);
                drawableM373f.setVisible(true, false);
            }
        }
        ImageView imageView2 = aVar.f741d;
        if (imageView2 != null) {
            int i4 = this.f736x;
            Drawable drawableM373f2 = i4 != -1 ? m373f(cursor.getString(i4)) : null;
            imageView2.setImageDrawable(drawableM373f2);
            if (drawableM373f2 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                drawableM373f2.setVisible(false, false);
                drawableM373f2.setVisible(true, false);
            }
        }
        int i5 = this.f730r;
        if (i5 != 2 && (i5 != 1 || (i2 & 1) == 0)) {
            aVar.f742e.setVisibility(8);
            return;
        }
        aVar.f742e.setVisibility(0);
        aVar.f742e.setTag(aVar.f738a.getText());
        aVar.f742e.setOnClickListener(this);
    }

    @Override // p000a.p047i.p048a.AbstractC0284a
    /* renamed from: b */
    public void mo369b(Cursor cursor) {
        try {
            super.mo369b(cursor);
            if (cursor != null) {
                this.f732t = cursor.getColumnIndex("suggest_text_1");
                this.f733u = cursor.getColumnIndex("suggest_text_2");
                this.f734v = cursor.getColumnIndex("suggest_text_2_url");
                this.f735w = cursor.getColumnIndex("suggest_icon_1");
                this.f736x = cursor.getColumnIndex("suggest_icon_2");
                this.f737y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // p000a.p047i.p048a.AbstractC0284a
    /* renamed from: c */
    public CharSequence mo370c(Cursor cursor) {
        String strM367h;
        String strM367h2;
        if (cursor == null) {
            return null;
        }
        String strM367h3 = m367h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM367h3 != null) {
            return strM367h3;
        }
        if (this.f726n.shouldRewriteQueryFromData() && (strM367h2 = m367h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM367h2;
        }
        if (!this.f726n.shouldRewriteQueryFromText() || (strM367h = m367h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM367h;
    }

    @Override // p000a.p047i.p048a.AbstractC0286c, p000a.p047i.p048a.AbstractC0284a
    /* renamed from: d */
    public View mo371d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewInflate = this.f1716l.inflate(this.f1714j, viewGroup, false);
        viewInflate.setTag(new a(viewInflate));
        ((ImageView) viewInflate.findViewById(C1088R.id.edit_query)).setImageResource(this.f729q);
        return viewInflate;
    }

    /* renamed from: e */
    public Drawable m372e(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f727o.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: f */
    public final Drawable m373f(String str) throws PackageManager.NameNotFoundException, NumberFormatException, IOException {
        Drawable drawableM372e = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + this.f727o.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = this.f728p.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Context context = this.f727o;
                Object obj = C0192a.f1425a;
                Drawable drawableM739b = C0192a.c.m739b(context, i);
                if (drawableM739b != null) {
                    this.f728p.put(str2, drawableM739b.getConstantState());
                }
                return drawableM739b;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = this.f728p.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableM372e = m372e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = this.f727o.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e2) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                            }
                            drawableM372e = drawableCreateFromStream;
                        } finally {
                        }
                    }
                } catch (FileNotFoundException e3) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
                }
                if (drawableM372e != null) {
                    this.f728p.put(str, drawableM372e.getConstantState());
                }
            }
        }
        return drawableM372e;
    }

    /* renamed from: g */
    public Cursor m374g(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f727o.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p000a.p047i.p048a.AbstractC0284a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewInflate = this.f1716l.inflate(this.f1715k, viewGroup, false);
            if (viewInflate != null) {
                ((a) viewInflate.getTag()).f738a.setText(e2.toString());
            }
            return viewInflate;
        }
    }

    @Override // p000a.p047i.p048a.AbstractC0284a, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewMo371d = mo371d(this.f727o, this.f1705d, viewGroup);
            ((a) viewMo371d.getTag()).f738a.setText(e2.toString());
            return viewMo371d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: i */
    public final void m375i(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m375i(this.f1705d);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m375i(this.f1705d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f725m.m1600x((CharSequence) tag);
        }
    }
}
