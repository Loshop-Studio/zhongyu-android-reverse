package com.zykj.subscriber;

import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.p068uc.crashsdk.export.LogType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p116l2.C2846g;
import p116l2.C2847h;

/* loaded from: classes.dex */
public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: a */
    @NotNull
    public Map<Integer, View> f9827a = new LinkedHashMap();

    /* renamed from: b */
    @NotNull
    private final String f9828b = getClass().getSimpleName();

    /* renamed from: d */
    public final void m8022d(@NotNull int... ids) {
        C2769l.m9241e(ids, "ids");
        int length = ids.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = ids[i4];
            i4++;
            findViewById(i5).setOnClickListener(this);
        }
    }

    /* renamed from: e */
    public abstract void mo8023e();

    /* renamed from: f */
    public final void m8024f(@NotNull String tips) {
        C2769l.m9241e(tips, "tips");
        C2847h.f10954a.m9553a(this, tips);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        C2846g c2846g = C2846g.f10951a;
        Resources resources = super.getResources();
        C2769l.m9240d(resources, "super.getResources()");
        return c2846g.m9552a(resources, LogType.UNEXP_ANR);
    }

    public abstract void initView();

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        onViewClick(view);
    }

    public abstract void onViewClick(@Nullable View view);

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        initView();
        mo8023e();
    }
}
