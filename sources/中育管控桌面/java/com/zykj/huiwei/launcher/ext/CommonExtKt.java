package com.zykj.huiwei.launcher.ext;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.PictureDrawable;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC4640d;
import com.zykj.base.utils.XToastUtils;
import com.zykj.huiwei.launcher.app.App;
import com.zykj.huiwei.launcher.ext.CommonExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import p078i4.AbstractC6541k;
import p092k4.C6677c;
import p118o0.C7501l;
import p181x0.C7826d;

/* loaded from: classes4.dex */
public abstract class CommonExtKt {

    /* renamed from: a */
    public static final /* synthetic */ KProperty[] f6076a = {Reflection.property1(new PropertyReference1Impl(CommonExtKt.class, "preferencesDataStore", "getPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* renamed from: b */
    public static final ReadOnlyProperty f6077b = PreferenceDataStoreDelegateKt.preferencesDataStore$default("zykj_launcher", null, null, null, 14, null);

    /* renamed from: b */
    public static final void m5309b(RecyclerView recyclerView, final int i6, final boolean z6, final boolean z7) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.zykj.huiwei.launcher.ext.CommonExtKt$addDivider$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                int dimensionPixelSize = App.INSTANCE.m5206a().getResources().getDimensionPixelSize(i6);
                boolean z8 = z6;
                boolean z9 = z7;
                int childAdapterPosition = parent.getChildAdapterPosition(view);
                if (z8 && childAdapterPosition == 0) {
                    outRect.top = dimensionPixelSize;
                }
                if (childAdapterPosition != parent.getChildCount() - 1 || z9) {
                    outRect.bottom = dimensionPixelSize;
                }
            }
        });
    }

    /* renamed from: c */
    public static /* synthetic */ void m5310c(RecyclerView recyclerView, int i6, boolean z6, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = true;
        }
        if ((i7 & 4) != 0) {
            z7 = true;
        }
        m5309b(recyclerView, i6, z6, z7);
    }

    /* renamed from: d */
    public static final DataStore m5311d(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (DataStore) f6077b.getValue(context, f6076a[0]);
    }

    /* renamed from: e */
    public static final void m5312e(Fragment fragment, String packageName, Function0 function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (!AbstractC4640d.m2155i(packageName)) {
            if (function0 != null) {
                function0.invoke();
                return;
            } else {
                XToastUtils.INSTANCE.toast("应用未安装");
                return;
            }
        }
        try {
            Intent launchIntentForPackage = fragment.requireContext().getPackageManager().getLaunchIntentForPackage(packageName);
            if (launchIntentForPackage != null) {
                fragment.startActivity(launchIntentForPackage);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception unused) {
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m5313f(Fragment fragment, String str, Function0 function0, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            function0 = null;
        }
        m5312e(fragment, str, function0);
    }

    /* renamed from: g */
    public static final void m5314g(ImageView imageView, String str, int i6, int i7) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (str == null) {
            str = "";
        }
        if (StringsKt.endsWith$default(str, "svg", false, 2, (Object) null)) {
            Intrinsics.checkNotNull(AbstractC6541k.m7330a(imageView).mo2534j(PictureDrawable.class).mo2529y0(new C6677c()).mo2510A0(str).mo2514b(C7826d.m9450l0(new C7501l())).mo7346X(i6).mo7359l(i7).m2527w0(imageView));
        } else {
            Intrinsics.checkNotNull(AbstractC6541k.m7330a(imageView).mo2544t(str).mo2514b(C7826d.m9450l0(new C7501l())).mo7346X(i6).mo7359l(i7).m2527w0(imageView));
        }
    }

    /* renamed from: h */
    public static final void m5315h(final Group group, final View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(group, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        int[] referencedIds = group.getReferencedIds();
        Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
        for (int i6 : referencedIds) {
            Object parent = group.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).findViewById(i6).setOnClickListener(new View.OnClickListener() { // from class: u3.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommonExtKt.m5316i(onClickListener, group, view);
                }
            });
        }
    }

    /* renamed from: i */
    public static final void m5316i(View.OnClickListener onClickListener, Group group, View view) {
        onClickListener.onClick(group);
    }

    /* renamed from: j */
    public static final String m5317j(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
