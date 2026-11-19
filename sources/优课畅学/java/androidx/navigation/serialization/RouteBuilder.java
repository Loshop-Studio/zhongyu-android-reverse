package androidx.navigation.serialization;

import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p212p7.InterfaceC9760a;
import p246s8.InterfaceC10052b;

/* loaded from: classes3.dex */
public final class RouteBuilder<T> {
    private final String path;
    private String pathArgs;
    private String queryArgs;
    private final InterfaceC10052b serializer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ParamType {
        private static final /* synthetic */ InterfaceC9760a $ENTRIES;
        private static final /* synthetic */ ParamType[] $VALUES;
        public static final ParamType PATH = new ParamType("PATH", 0);
        public static final ParamType QUERY = new ParamType("QUERY", 1);

        private static final /* synthetic */ ParamType[] $values() {
            return new ParamType[]{PATH, QUERY};
        }

        static {
            ParamType[] paramTypeArr$values = $values();
            $VALUES = paramTypeArr$values;
            $ENTRIES = AbstractC9108a.m16085a(paramTypeArr$values);
        }

        private ParamType(String str, int i10) {
        }

        public static InterfaceC9760a getEntries() {
            return $ENTRIES;
        }

        public static ParamType valueOf(String str) {
            return (ParamType) Enum.valueOf(ParamType.class, str);
        }

        public static ParamType[] values() {
            return (ParamType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParamType.values().length];
            try {
                iArr[ParamType.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParamType.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RouteBuilder(InterfaceC10052b serializer) {
        AbstractC9133u.m16133g(serializer, "serializer");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = serializer;
        this.path = serializer.getDescriptor().mo19089f();
    }

    private final void addPath(String str) {
        this.pathArgs += '/' + str;
    }

    private final void addQuery(String str, String str2) {
        this.queryArgs += (this.queryArgs.length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    private final ParamType computeParamType(int i10, NavType<Object> navType) {
        return ((navType instanceof CollectionNavType) || this.serializer.getDescriptor().mo19090g(i10)) ? ParamType.QUERY : ParamType.PATH;
    }

    public final void appendArg(int i10, String name, NavType<Object> type, List<String> value) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(value, "value");
        int i11 = WhenMappings.$EnumSwitchMapping$0[computeParamType(i10, type).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                addQuery(name, (String) it.next());
            }
            return;
        }
        if (value.size() == 1) {
            addPath((String) AbstractC8778f0.m14566l0(value));
            return;
        }
        throw new IllegalArgumentException(("Expected one value for argument " + name + ", found " + value.size() + "values instead.").toString());
    }

    public final void appendPattern(int i10, String name, NavType<Object> type) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(type, "type");
        int i11 = WhenMappings.$EnumSwitchMapping$0[computeParamType(i10, type).ordinal()];
        if (i11 == 1) {
            addPath('{' + name + '}');
            return;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        addQuery(name, '{' + name + '}');
    }

    public final String build() {
        return this.path + this.pathArgs + this.queryArgs;
    }

    public RouteBuilder(String path, InterfaceC10052b serializer) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(serializer, "serializer");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = serializer;
        this.path = path;
    }
}
