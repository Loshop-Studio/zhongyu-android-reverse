package com.zykj.student.dialogue.p076ui.home.category;

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
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$getAllCategories$1", m13451f = "EditCategoryViewModel.kt", m13452i = {}, m13453l = {69}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nEditCategoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCategoryViewModel.kt\ncom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1740#2,3:152\n1056#2:155\n3301#2,10:156\n1068#2:166\n1056#2:167\n*S KotlinDebug\n*F\n+ 1 EditCategoryViewModel.kt\ncom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1\n*L\n71#1:152,3\n72#1:155\n80#1:156,10\n81#1:166\n82#1:167\n*E\n"})
/* loaded from: classes5.dex */
public final class EditCategoryViewModel$getAllCategories$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11787a;

    /* renamed from: b */
    public final /* synthetic */ EditCategoryViewModel f11788b;

    /* renamed from: com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$getAllCategories$1$a */
    public static final class C7607a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((CatalogResp) obj).getId()), Long.valueOf(((CatalogResp) obj2).getId()));
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$getAllCategories$1$b */
    public static final class C7608b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((CatalogResp) obj).getSort()), Integer.valueOf(((CatalogResp) obj2).getSort()));
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$getAllCategories$1$c */
    public static final class C7609c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((CatalogResp) obj2).getId()), Long.valueOf(((CatalogResp) obj).getId()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCategoryViewModel$getAllCategories$1(EditCategoryViewModel editCategoryViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11788b = editCategoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditCategoryViewModel$getAllCategories$1(this.f11788b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f11787a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r9)
            goto L29
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            kotlin.ResultKt.throwOnFailure(r9)
            com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel r9 = r8.f11788b
            k6.g r9 = com.zykj.student.dialogue.p076ui.home.category.EditCategoryViewModel.m10935m(r9)
            r8.f11787a = r2
            java.lang.Object r9 = r9.m13399o(r8)
            if (r9 != r0) goto L29
            return r0
        L29:
            com.zykj.student.dialogue.network.BaseResponse r9 = (com.zykj.student.dialogue.network.BaseResponse) r9
            java.lang.Object r9 = p138i6.AbstractC8137c.m13043b(r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto Lbe
            com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel r0 = r8.f11788b
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L3c
            goto La8
        L3c:
            java.util.Iterator r1 = r9.iterator()
        L40:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La8
            java.lang.Object r3 = r1.next()
            com.zykj.student.dialogue.bean.resp.CatalogResp r3 = (com.zykj.student.dialogue.bean.resp.CatalogResp) r3
            int r3 = r3.getSort()
            if (r3 != 0) goto L53
            goto L40
        L53:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L61:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r9.next()
            r4 = r3
            com.zykj.student.dialogue.bean.resp.CatalogResp r4 = (com.zykj.student.dialogue.bean.resp.CatalogResp) r4
            long r4 = r4.getId()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L7c
            r1.add(r3)
            goto L61
        L7c:
            r2.add(r3)
            goto L61
        L80:
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r1, r2)
            java.lang.Object r1 = r9.getFirst()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$getAllCategories$1$c r2 = new com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$getAllCategories$1$c
            r2.<init>()
            java.util.List r1 = kotlin.collections.CollectionsKt.sortedWith(r1, r2)
            java.lang.Object r9 = r9.getSecond()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$getAllCategories$1$b r2 = new com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$getAllCategories$1$b
            r2.<init>()
            java.util.List r9 = kotlin.collections.CollectionsKt.sortedWith(r9, r2)
            java.util.List r9 = kotlin.collections.CollectionsKt.plus(r1, r9)
            goto Lbb
        La8:
            com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$getAllCategories$1$a r1 = new com.zykj.student.dialogue.ui.home.category.EditCategoryViewModel$getAllCategories$1$a
            r1.<init>()
            java.util.List r9 = kotlin.collections.CollectionsKt.sortedWith(r9, r1)
            int r1 = r9.size()
            if (r1 <= r2) goto Lbb
            r1 = 0
            java.util.Collections.swap(r9, r1, r2)
        Lbb:
            r0.m10943D(r9)
        Lbe:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.home.category.EditCategoryViewModel$getAllCategories$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/category/EditCategoryViewModel$getAllCategories$1.smali:137
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EditCategoryViewModel$getAllCategories$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
