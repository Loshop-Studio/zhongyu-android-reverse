package kotlinx.serialization.json.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m5110d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "", "begin", "C", "end", "OBJ", "LIST", "MAP", "POLY_OBJ", "kotlinx-serialization-json"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class WriteMode {
    public static final WriteMode LIST;
    public static final WriteMode MAP;
    public static final WriteMode OBJ;
    public static final WriteMode POLY_OBJ;

    /* renamed from: a */
    public static final /* synthetic */ WriteMode[] f9537a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f9538b;

    @JvmField
    public final char begin;

    @JvmField
    public final char end;

    static {
        WriteMode writeMode = new WriteMode("OBJ", 0, '{', '}');
        OBJ = writeMode;
        WriteMode writeMode2 = new WriteMode("LIST", 1, '[', ']');
        LIST = writeMode2;
        WriteMode writeMode3 = new WriteMode("MAP", 2, '{', '}');
        MAP = writeMode3;
        WriteMode writeMode4 = new WriteMode("POLY_OBJ", 3, '[', ']');
        POLY_OBJ = writeMode4;
        WriteMode[] writeModeArr = {writeMode, writeMode2, writeMode3, writeMode4};
        f9537a = writeModeArr;
        f9538b = AbstractC5817a.m5310a(writeModeArr);
    }

    public WriteMode(String str, int i, char c, char c9) {
        this.begin = c;
        this.end = c9;
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f9538b;
    }

    public static WriteMode valueOf(String str) {
        return (WriteMode) Enum.valueOf(WriteMode.class, str);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) f9537a.clone();
    }
}
