package androidx.navigation.serialization;

import android.support.v4.media.AbstractC0037f;
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5805t;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p084i7.InterfaceC5686b;
import p092j6.InterfaceC5748a;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001#B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006$"}, m5110d2 = {"Landroidx/navigation/serialization/RouteBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "", "Li7/b;", "serializer", "<init>", "(Li7/b;)V", "", "path", "(Ljava/lang/String;Li7/b;)V", "Ld6/s;", "addPath", "(Ljava/lang/String;)V", HintConstants.AUTOFILL_HINT_NAME, "value", "addQuery", "(Ljava/lang/String;Ljava/lang/String;)V", "", "index", "Landroidx/navigation/NavType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/navigation/serialization/RouteBuilder$ParamType;", "computeParamType", "(ILandroidx/navigation/NavType;)Landroidx/navigation/serialization/RouteBuilder$ParamType;", "build", "()Ljava/lang/String;", "appendPattern", "(ILjava/lang/String;Landroidx/navigation/NavType;)V", "", "appendArg", "(ILjava/lang/String;Landroidx/navigation/NavType;Ljava/util/List;)V", "Li7/b;", "Ljava/lang/String;", "pathArgs", "queryArgs", "ParamType", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRouteBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteBuilder.kt\nandroidx/navigation/serialization/RouteBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1863#2,2:112\n*S KotlinDebug\n*F\n+ 1 RouteBuilder.kt\nandroidx/navigation/serialization/RouteBuilder\n*L\n88#1:112,2\n*E\n"})
/* loaded from: classes2.dex */
public final class RouteBuilder<T> {

    @NotNull
    private final String path;

    @NotNull
    private String pathArgs;

    @NotNull
    private String queryArgs;

    @NotNull
    private final InterfaceC5686b serializer;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m5110d2 = {"Landroidx/navigation/serialization/RouteBuilder$ParamType;", "", "<init>", "(Ljava/lang/String;I)V", "PATH", "QUERY", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ParamType {
        private static final /* synthetic */ InterfaceC5748a $ENTRIES;
        private static final /* synthetic */ ParamType[] $VALUES;
        public static final ParamType PATH = new ParamType("PATH", 0);
        public static final ParamType QUERY = new ParamType("QUERY", 1);

        private static final /* synthetic */ ParamType[] $values() {
            return new ParamType[]{PATH, QUERY};
        }

        static {
            ParamType[] paramTypeArr$values = $values();
            $VALUES = paramTypeArr$values;
            $ENTRIES = AbstractC5817a.m5310a(paramTypeArr$values);
        }

        private ParamType(String str, int i) {
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return $ENTRIES;
        }

        public static ParamType valueOf(String str) {
            return (ParamType) Enum.valueOf(ParamType.class, str);
        }

        public static ParamType[] values() {
            return (ParamType[]) $VALUES.clone();
        }
    }

    @Metadata(m5111k = 3, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public RouteBuilder(@NotNull InterfaceC5686b serializer) {
        AbstractC5830k.m5330g(serializer, "serializer");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = serializer;
        this.path = serializer.getDescriptor().mo5105h();
    }

    private final void addPath(String path) {
        this.pathArgs += '/' + path;
    }

    private final void addQuery(String name, String value) {
        this.queryArgs += (this.queryArgs.length() == 0 ? "?" : "&") + name + '=' + value;
    }

    private final ParamType computeParamType(int index, NavType<Object> type) {
        return ((type instanceof CollectionNavType) || this.serializer.getDescriptor().mo5106i(index)) ? ParamType.QUERY : ParamType.PATH;
    }

    public final void appendArg(int index, @NotNull String name, @NotNull NavType<Object> type, @NotNull List<String> value) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(type, "type");
        AbstractC5830k.m5330g(value, "value");
        int i = WhenMappings.$EnumSwitchMapping$0[computeParamType(index, type).ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                addQuery(name, (String) it.next());
            }
            return;
        }
        if (value.size() == 1) {
            addPath((String) AbstractC5805t.m5228h0(value));
            return;
        }
        StringBuilder sbM100y = AbstractC0037f.m100y("Expected one value for argument ", name, ", found ");
        sbM100y.append(value.size());
        sbM100y.append("values instead.");
        throw new IllegalArgumentException(sbM100y.toString().toString());
    }

    public final void appendPattern(int index, @NotNull String name, @NotNull NavType<Object> type) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(type, "type");
        int i = WhenMappings.$EnumSwitchMapping$0[computeParamType(index, type).ordinal()];
        if (i == 1) {
            addPath(AbstractC1923c.m1047k('}', "{", name));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            addQuery(name, AbstractC1923c.m1047k('}', "{", name));
        }
    }

    @NotNull
    public final String build() {
        return this.path + this.pathArgs + this.queryArgs;
    }

    public RouteBuilder(@NotNull String path, @NotNull InterfaceC5686b serializer) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(serializer, "serializer");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = serializer;
        this.path = path;
    }
}
