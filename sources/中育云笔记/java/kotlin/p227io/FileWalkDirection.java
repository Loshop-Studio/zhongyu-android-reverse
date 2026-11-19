package kotlin.p227io;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FileWalkDirection {

    /* renamed from: c */
    public static final FileWalkDirection f23377c = new FileWalkDirection("TOP_DOWN", 0);

    /* renamed from: d */
    public static final FileWalkDirection f23378d = new FileWalkDirection("BOTTOM_UP", 1);

    /* renamed from: e */
    public static final /* synthetic */ FileWalkDirection[] f23379e;

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC11943a f23380f;

    static {
        FileWalkDirection[] fileWalkDirectionArrM20231a = m20231a();
        f23379e = fileWalkDirectionArrM20231a;
        f23380f = AbstractC9953a.m20230a(fileWalkDirectionArrM20231a);
    }

    public FileWalkDirection(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ FileWalkDirection[] m20231a() {
        return new FileWalkDirection[]{f23377c, f23378d};
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f23379e.clone();
    }
}
