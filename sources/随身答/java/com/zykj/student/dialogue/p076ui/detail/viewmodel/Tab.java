package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;", "", "", RequestParameters.POSITION, "<init>", "(Ljava/lang/String;II)V", "a", "b", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class Tab {

    /* renamed from: a */
    public static final Tab f11245a = new Tab("ALL", 0, 0);

    /* renamed from: b */
    public static final Tab f11246b = new Tab("PRIMARY", 1, 1);

    /* renamed from: c */
    public static final /* synthetic */ Tab[] f11247c;

    /* renamed from: d */
    public static final /* synthetic */ EnumEntries f11248d;

    static {
        Tab[] tabArrM10497a = m10497a();
        f11247c = tabArrM10497a;
        f11248d = EnumEntriesKt.enumEntries(tabArrM10497a);
    }

    public Tab(String str, int i9, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ Tab[] m10497a() {
        return new Tab[]{f11245a, f11246b};
    }

    public static Tab valueOf(String str) {
        return (Tab) Enum.valueOf(Tab.class, str);
    }

    public static Tab[] values() {
        return (Tab[]) f11247c.clone();
    }
}
