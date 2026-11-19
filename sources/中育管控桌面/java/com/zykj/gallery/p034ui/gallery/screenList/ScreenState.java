package com.zykj.gallery.p034ui.gallery.screenList;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m7880d2 = {"Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class ScreenState {

    /* renamed from: a */
    public static final ScreenState f5889a = new ScreenState("GALLERY_NORMAL", 0);

    /* renamed from: b */
    public static final ScreenState f5890b = new ScreenState("GALLERY_SELECTION", 1);

    /* renamed from: c */
    public static final ScreenState f5891c = new ScreenState("GALLERY_DELETE_SELECTION", 2);

    /* renamed from: d */
    public static final ScreenState f5892d = new ScreenState("GALLERY_DELETE_LIST", 3);

    /* renamed from: e */
    public static final /* synthetic */ ScreenState[] f5893e;

    /* renamed from: f */
    public static final /* synthetic */ EnumEntries f5894f;

    static {
        ScreenState[] screenStateArrM5119a = m5119a();
        f5893e = screenStateArrM5119a;
        f5894f = EnumEntriesKt.enumEntries(screenStateArrM5119a);
    }

    public ScreenState(String str, int i6) {
    }

    /* renamed from: a */
    public static final /* synthetic */ ScreenState[] m5119a() {
        return new ScreenState[]{f5889a, f5890b, f5891c, f5892d};
    }

    public static ScreenState valueOf(String str) {
        return (ScreenState) Enum.valueOf(ScreenState.class, str);
    }

    public static ScreenState[] values() {
        return (ScreenState[]) f5893e.clone();
    }
}
