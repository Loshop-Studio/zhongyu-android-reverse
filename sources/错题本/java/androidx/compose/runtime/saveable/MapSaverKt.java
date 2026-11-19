package androidx.compose.runtime.saveable;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u007f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\r\"\u0004\b\u0000\u0010\u00002:\u0010\n\u001a6\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0001¢\u0006\u0002\b\t2\"\u0010\f\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "value", "", "", "", "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", RequestParameters.X_OSS_RESTORE, "Landroidx/compose/runtime/saveable/Saver;", "mapSaver", "(Lr6/e;Lr6/c;)Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MapSaverKt {
    @NotNull
    public static final <T> Saver<T, Object> mapSaver(@NotNull final InterfaceC6473e interfaceC6473e, @NotNull final InterfaceC6471c interfaceC6471c) {
        return ListSaverKt.listSaver(new InterfaceC6473e() { // from class: androidx.compose.runtime.saveable.MapSaverKt.mapSaver.1
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((SaverScope) obj, (SaverScope) obj2);
            }

            public final List<Object> invoke(SaverScope saverScope, T t8) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) interfaceC6473e.invoke(saverScope, t8)).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            }
        }, new InterfaceC6471c() { // from class: androidx.compose.runtime.saveable.MapSaverKt.mapSaver.2
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
            @Override // p152r6.InterfaceC6471c
            public final T invoke(List<? extends Object> list) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list.size() % 2 != 0) {
                    throw new IllegalStateException("non-zero remainder");
                }
                for (int i = 0; i < list.size(); i += 2) {
                    Object obj = list.get(i);
                    AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, list.get(i + 1));
                }
                return interfaceC6471c.invoke(linkedHashMap);
            }
        });
    }
}
