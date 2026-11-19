package com.zykj.student.dialogue.p076ui.collect;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/collect/CollectPayloadKey;", "", "<init>", "(Ljava/lang/String;I)V", "a", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class CollectPayloadKey {

    /* renamed from: a */
    public static final CollectPayloadKey f10780a = new CollectPayloadKey("COLLECT_STATE", 0);

    /* renamed from: b */
    public static final /* synthetic */ CollectPayloadKey[] f10781b;

    /* renamed from: c */
    public static final /* synthetic */ EnumEntries f10782c;

    static {
        CollectPayloadKey[] collectPayloadKeyArrM10138a = m10138a();
        f10781b = collectPayloadKeyArrM10138a;
        f10782c = EnumEntriesKt.enumEntries(collectPayloadKeyArrM10138a);
    }

    public CollectPayloadKey(String str, int i9) {
    }

    /* renamed from: a */
    public static final /* synthetic */ CollectPayloadKey[] m10138a() {
        return new CollectPayloadKey[]{f10780a};
    }

    public static CollectPayloadKey valueOf(String str) {
        return (CollectPayloadKey) Enum.valueOf(CollectPayloadKey.class, str);
    }

    public static CollectPayloadKey[] values() {
        return (CollectPayloadKey[]) f10781b.clone();
    }
}
