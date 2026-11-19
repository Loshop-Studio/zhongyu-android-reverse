package com.zykj.student.dialogue.p076ui.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/DeleteAction;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class DeleteAction {

    /* renamed from: a */
    public static final DeleteAction f10964a = new DeleteAction("SESSION", 0);

    /* renamed from: b */
    public static final DeleteAction f10965b = new DeleteAction("ANSWER", 1);

    /* renamed from: c */
    public static final /* synthetic */ DeleteAction[] f10966c;

    /* renamed from: d */
    public static final /* synthetic */ EnumEntries f10967d;

    static {
        DeleteAction[] deleteActionArrM10298a = m10298a();
        f10966c = deleteActionArrM10298a;
        f10967d = EnumEntriesKt.enumEntries(deleteActionArrM10298a);
    }

    public DeleteAction(String str, int i9) {
    }

    /* renamed from: a */
    public static final /* synthetic */ DeleteAction[] m10298a() {
        return new DeleteAction[]{f10964a, f10965b};
    }

    public static DeleteAction valueOf(String str) {
        return (DeleteAction) Enum.valueOf(DeleteAction.class, str);
    }

    public static DeleteAction[] values() {
        return (DeleteAction[]) f10966c.clone();
    }
}
