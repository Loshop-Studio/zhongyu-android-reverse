package com.zykj.huiwei.launcher.p035ui.fragment.applist;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.C4641d0;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zykj.base.BaseViewModel;
import com.zykj.huiwei.launcher.bean.BaseAppInfo;
import com.zykj.huiwei.launcher.bean.resp.AppData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;", "Lcom/zykj/base/BaseViewModel;", "<init>", "()V", "", "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;", "list", "Lcom/zykj/huiwei/launcher/bean/resp/AppData;", "a", "(Ljava/util/List;)Ljava/util/List;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nBaseAppListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAppListViewModel.kt\ncom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1563#2:34\n1634#2,3:35\n1563#2:38\n1634#2,3:39\n1056#2:42\n*S KotlinDebug\n*F\n+ 1 BaseAppListViewModel.kt\ncom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel\n*L\n19#1:34\n19#1:35,3\n23#1:38\n23#1:39,3\n30#1:42\n*E\n"})
/* loaded from: classes4.dex */
public abstract class BaseAppListViewModel extends BaseViewModel {

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.applist.BaseAppListViewModel$a */
    public static final class C6163a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((AppData) obj).getSort()), Integer.valueOf(((AppData) obj2).getSort()));
        }
    }

    @Metadata(m7879d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m7880d2 = {"com/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel$b", "Lcom/google/gson/reflect/TypeToken;", "", "", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.applist.BaseAppListViewModel$b */
    public static final class C6164b extends TypeToken<List<? extends String>> {
    }

    /* renamed from: a */
    public final List m5990a(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List list2 = (List) new Gson().fromJson(C4641d0.m2157a().m2161d("SP_APP_SORT_LIST"), new C6164b().getType());
        if (list2 == null || list2.isEmpty()) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new AppData((BaseAppInfo) it.next(), Integer.MAX_VALUE));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BaseAppInfo baseAppInfo = (BaseAppInfo) it2.next();
            int iIndexOf = list2.indexOf(baseAppInfo.getLabel());
            arrayList2.add(iIndexOf != -1 ? new AppData(baseAppInfo, iIndexOf) : new AppData(baseAppInfo, Integer.MAX_VALUE));
        }
        return CollectionsKt.sortedWith(arrayList2, new C6163a());
    }
}
