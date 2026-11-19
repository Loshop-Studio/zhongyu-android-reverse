package androidx.appcompat.widget;

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
import androidx.core.content.C0332a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import org.android.agoo.message.MessageService;
import p015c.C1038a;
import p015c.C1043f;
import p084f0.AbstractC2502c;

/* renamed from: androidx.appcompat.widget.a0 */
/* loaded from: classes.dex */
class ViewOnClickListenerC0202a0 extends AbstractC2502c implements View.OnClickListener {

    /* renamed from: l */
    private final SearchView f1031l;

    /* renamed from: m */
    private final SearchableInfo f1032m;

    /* renamed from: n */
    private final Context f1033n;

    /* renamed from: o */
    private final WeakHashMap<String, Drawable.ConstantState> f1034o;

    /* renamed from: p */
    private final int f1035p;

    /* renamed from: q */
    private boolean f1036q;

    /* renamed from: r */
    private int f1037r;

    /* renamed from: s */
    private ColorStateList f1038s;

    /* renamed from: t */
    private int f1039t;

    /* renamed from: u */
    private int f1040u;

    /* renamed from: v */
    private int f1041v;

    /* renamed from: w */
    private int f1042w;

    /* renamed from: x */
    private int f1043x;

    /* renamed from: y */
    private int f1044y;

    /* renamed from: androidx.appcompat.widget.a0$a */
    private static final class a {

        /* renamed from: a */
        public final TextView f1045a;

        /* renamed from: b */
        public final TextView f1046b;

        /* renamed from: c */
        public final ImageView f1047c;

        /* renamed from: d */
        public final ImageView f1048d;

        /* renamed from: e */
        public final ImageView f1049e;

        public a(View view) {
            this.f1045a = (TextView) view.findViewById(R.id.text1);
            this.f1046b = (TextView) view.findViewById(R.id.text2);
            this.f1047c = (ImageView) view.findViewById(R.id.icon1);
            this.f1048d = (ImageView) view.findViewById(R.id.icon2);
            this.f1049e = (ImageView) view.findViewById(C1043f.f5872s);
        }
    }

    public ViewOnClickListenerC0202a0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1036q = false;
        this.f1037r = 1;
        this.f1039t = -1;
        this.f1040u = -1;
        this.f1041v = -1;
        this.f1042w = -1;
        this.f1043x = -1;
        this.f1044y = -1;
        this.f1031l = searchView;
        this.f1032m = searchableInfo;
        this.f1035p = searchView.getSuggestionCommitIconResId();
        this.f1033n = context;
        this.f1034o = weakHashMap;
    }

    /* renamed from: A */
    private void m739A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1034o.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m740B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* renamed from: k */
    private Drawable m741k(String str) {
        Drawable.ConstantState constantState = this.f1034o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m742l(CharSequence charSequence) {
        if (this.f1038s == null) {
            TypedValue typedValue = new TypedValue();
            this.f1033n.getTheme().resolveAttribute(C1038a.f5734M, typedValue, true);
            this.f1038s = this.f1033n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1038s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m743m(ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.f1033n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("SuggestionsAdapter", e4.toString());
            return null;
        }
    }

    /* renamed from: n */
    private Drawable m744n(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f1034o.containsKey(strFlattenToShortString)) {
            Drawable drawableM743m = m743m(componentName);
            this.f1034o.put(strFlattenToShortString, drawableM743m != null ? drawableM743m.getConstantState() : null);
            return drawableM743m;
        }
        Drawable.ConstantState constantState = this.f1034o.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1033n.getResources());
    }

    /* renamed from: o */
    public static String m745o(Cursor cursor, String str) {
        return m751w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m746p() throws PackageManager.NameNotFoundException {
        Drawable drawableM744n = m744n(this.f1032m.getSearchActivity());
        return drawableM744n != null ? drawableM744n : this.f1033n.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    private Drawable m747q(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m759r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f1033n.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e4) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e4);
                }
            }
        } catch (FileNotFoundException e5) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e5.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e5.getMessage());
        return null;
    }

    /* renamed from: s */
    private Drawable m748s(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || MessageService.MSG_DB_READY_REPORT.equals(str)) {
            return null;
        }
        try {
            int i4 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1033n.getPackageName() + "/" + i4;
            Drawable drawableM741k = m741k(str2);
            if (drawableM741k != null) {
                return drawableM741k;
            }
            Drawable drawableM1806d = C0332a.m1806d(this.f1033n, i4);
            m739A(str2, drawableM1806d);
            return drawableM1806d;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableM741k2 = m741k(str);
            if (drawableM741k2 != null) {
                return drawableM741k2;
            }
            Drawable drawableM747q = m747q(Uri.parse(str));
            m739A(str, drawableM747q);
            return drawableM747q;
        }
    }

    /* renamed from: t */
    private Drawable m749t(Cursor cursor) throws NumberFormatException, IOException {
        int i4 = this.f1042w;
        if (i4 == -1) {
            return null;
        }
        Drawable drawableM748s = m748s(cursor.getString(i4));
        return drawableM748s != null ? drawableM748s : m746p();
    }

    /* renamed from: u */
    private Drawable m750u(Cursor cursor) {
        int i4 = this.f1043x;
        if (i4 == -1) {
            return null;
        }
        return m748s(cursor.getString(i4));
    }

    /* renamed from: w */
    private static String m751w(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    /* renamed from: y */
    private void m752y(ImageView imageView, Drawable drawable, int i4) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i4);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m753z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // p084f0.AbstractC2500a, p084f0.C2501b.a
    /* renamed from: a */
    public void mo754a(Cursor cursor) {
        if (this.f1036q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo754a(cursor);
            if (cursor != null) {
                this.f1039t = cursor.getColumnIndex("suggest_text_1");
                this.f1040u = cursor.getColumnIndex("suggest_text_2");
                this.f1041v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1042w = cursor.getColumnIndex("suggest_icon_1");
                this.f1043x = cursor.getColumnIndex("suggest_icon_2");
                this.f1044y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    @Override // p084f0.AbstractC2500a, p084f0.C2501b.a
    /* renamed from: c */
    public CharSequence mo755c(Cursor cursor) {
        String strM745o;
        String strM745o2;
        if (cursor == null) {
            return null;
        }
        String strM745o3 = m745o(cursor, "suggest_intent_query");
        if (strM745o3 != null) {
            return strM745o3;
        }
        if (this.f1032m.shouldRewriteQueryFromData() && (strM745o2 = m745o(cursor, "suggest_intent_data")) != null) {
            return strM745o2;
        }
        if (!this.f1032m.shouldRewriteQueryFromText() || (strM745o = m745o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strM745o;
    }

    @Override // p084f0.C2501b.a
    /* renamed from: d */
    public Cursor mo756d(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f1031l.getVisibility() == 0 && this.f1031l.getWindowVisibility() == 0) {
            try {
                Cursor cursorM760v = m760v(this.f1032m, string, 50);
                if (cursorM760v != null) {
                    cursorM760v.getCount();
                    return cursorM760v;
                }
            } catch (RuntimeException e4) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e4);
            }
        }
        return null;
    }

    @Override // p084f0.AbstractC2500a
    /* renamed from: e */
    public void mo757e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i4 = this.f1044y;
        int i5 = i4 != -1 ? cursor.getInt(i4) : 0;
        if (aVar.f1045a != null) {
            m753z(aVar.f1045a, m751w(cursor, this.f1039t));
        }
        if (aVar.f1046b != null) {
            String strM751w = m751w(cursor, this.f1041v);
            CharSequence charSequenceM742l = strM751w != null ? m742l(strM751w) : m751w(cursor, this.f1040u);
            if (TextUtils.isEmpty(charSequenceM742l)) {
                TextView textView = aVar.f1045a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1045a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1045a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1045a.setMaxLines(1);
                }
            }
            m753z(aVar.f1046b, charSequenceM742l);
        }
        ImageView imageView = aVar.f1047c;
        if (imageView != null) {
            m752y(imageView, m749t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1048d;
        if (imageView2 != null) {
            m752y(imageView2, m750u(cursor), 8);
        }
        int i6 = this.f1037r;
        if (i6 != 2 && (i6 != 1 || (i5 & 1) == 0)) {
            aVar.f1049e.setVisibility(8);
            return;
        }
        aVar.f1049e.setVisibility(0);
        aVar.f1049e.setTag(aVar.f1045a.getText());
        aVar.f1049e.setOnClickListener(this);
    }

    @Override // p084f0.AbstractC2500a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View viewMo8421g = mo8421g(this.f1033n, mo8419b(), viewGroup);
            if (viewMo8421g != null) {
                ((a) viewMo8421g.getTag()).f1045a.setText(e4.toString());
            }
            return viewMo8421g;
        }
    }

    @Override // p084f0.AbstractC2500a, android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View viewMo758h = mo758h(this.f1033n, mo8419b(), viewGroup);
            if (viewMo758h != null) {
                ((a) viewMo758h.getTag()).f1045a.setText(e4.toString());
            }
            return viewMo758h;
        }
    }

    @Override // p084f0.AbstractC2502c, p084f0.AbstractC2500a
    /* renamed from: h */
    public View mo758h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewMo758h = super.mo758h(context, cursor, viewGroup);
        viewMo758h.setTag(new a(viewMo758h));
        ((ImageView) viewMo758h.findViewById(C1043f.f5872s)).setImageResource(this.f1035p);
        return viewMo758h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m740B(mo8419b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m740B(mo8419b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1031l.m707w((CharSequence) tag);
        }
    }

    /* renamed from: r */
    Drawable m759r(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1033n.getPackageManager().getResourcesForApplication(authority);
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

    /* renamed from: v */
    Cursor m760v(SearchableInfo searchableInfo, String str, int i4) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
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
        if (i4 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i4));
        }
        return this.f1033n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void m761x(int i4) {
        this.f1037r = i4;
    }
}
