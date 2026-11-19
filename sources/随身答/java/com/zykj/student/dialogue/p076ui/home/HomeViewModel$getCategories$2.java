package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel$getCategories$2", m13451f = "HomeViewModel.kt", m13452i = {}, m13453l = {148}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$getCategories$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,509:1\n1740#2,3:510\n1056#2:513\n3301#2,10:514\n1068#2:524\n1056#2:525\n1761#2,3:529\n230#3,3:526\n233#3,2:532\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$getCategories$2\n*L\n149#1:510,3\n150#1:513\n158#1:514,10\n159#1:524\n160#1:525\n167#1:529,3\n164#1:526,3\n164#1:532,2\n*E\n"})
/* loaded from: classes5.dex */
public final class HomeViewModel$getCategories$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11668a;

    /* renamed from: b */
    public final /* synthetic */ HomeViewModel f11669b;

    /* renamed from: com.zykj.student.dialogue.ui.home.HomeViewModel$getCategories$2$a */
    public static final class C7590a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((CatalogResp) obj).getId()), Long.valueOf(((CatalogResp) obj2).getId()));
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.HomeViewModel$getCategories$2$b */
    public static final class C7591b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((CatalogResp) obj).getSort()), Integer.valueOf(((CatalogResp) obj2).getSort()));
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.HomeViewModel$getCategories$2$c */
    public static final class C7592c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((CatalogResp) obj2).getId()), Long.valueOf(((CatalogResp) obj).getId()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getCategories$2(HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11669b = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$getCategories$2(this.f11669b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.home.HomeViewModel$getCategories$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/HomeViewModel$getCategories$2.smali:137
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$getCategories$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
