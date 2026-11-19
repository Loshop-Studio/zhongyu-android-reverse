package kotlin.p159io;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class FileWalkDirection {

    /* renamed from: a */
    public static final FileWalkDirection f17464a = new FileWalkDirection("TOP_DOWN", 0);

    /* renamed from: b */
    public static final FileWalkDirection f17465b = new FileWalkDirection("BOTTOM_UP", 1);

    /* renamed from: c */
    public static final /* synthetic */ FileWalkDirection[] f17466c;

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC9760a f17467d;

    static {
        FileWalkDirection[] fileWalkDirectionArrM16086a = m16086a();
        f17466c = fileWalkDirectionArrM16086a;
        f17467d = AbstractC9108a.m16085a(fileWalkDirectionArrM16086a);
    }

    public FileWalkDirection(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ FileWalkDirection[] m16086a() {
        return new FileWalkDirection[]{f17464a, f17465b};
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f17466c.clone();
    }
}
