.class public final Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    if-eqz v1, :cond_0

    .line 1
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    if-eqz v1, :cond_0

    const/4 v3, -0x1

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2
    :cond_0
    iget-object v1, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->c0()Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 3
    iget-object v3, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-virtual {v3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->c0()Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->g()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zykj/study/bean/course/CatalogBean;

    .line 4
    iget-object v4, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-virtual {v4}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->b0()Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v5

    :goto_0
    const/4 v6, 0x0

    if-eqz v4, :cond_2

    if-eqz v1, :cond_2

    if-eqz v3, :cond_2

    .line 5
    iget-object v2, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object v2

    const-string v4, "getViewLifecycleOwner(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v7

    new-instance v10, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;

    iget-object v2, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-direct {v10, v2, v1, v3, v5}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;Lcom/zykj/study/bean/course/CatalogBean;Lm7/c;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 6
    iget-object v1, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-virtual {v1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->b0()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1a

    invoke-virtual {v1, v6}, Landroid/view/View;->setBackgroundResource(I)V

    goto/16 :goto_c

    .line 7
    :cond_2
    iget-object v1, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-static {v1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->G(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v2, :cond_4

    .line 8
    iget-object v1, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-static {v1, v5}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->M(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Ljava/lang/Integer;)V

    return-void

    .line 9
    :cond_4
    :goto_1
    iget-object v1, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-static {v1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->K(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->f()Ll8/h;

    move-result-object v1

    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->j()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Li7/v;->n()Ljava/util/List;

    move-result-object v3

    invoke-static {v1}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move-object v1, v3

    :cond_5
    check-cast v1, Ljava/util/Collection;

    .line 10
    invoke-static {v1}, Li7/f0;->X0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    .line 11
    iget-object v3, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-static {v3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->x(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr0/b;

    .line 12
    instance-of v4, v3, Lcom/zykj/study/bean/course/CatalogBean;

    if-eqz v4, :cond_1a

    .line 13
    iget-object v4, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-static {v4}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    move-result-object v4

    add-int/lit8 v7, v2, 0x1

    invoke-virtual {v4, v7}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->x(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/zykj/study/bean/course/CatalogBean;

    const/4 v7, 0x1

    if-nez v2, :cond_6

    move-object v2, v5

    goto :goto_2

    .line 14
    :cond_6
    iget-object v8, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-static {v8}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    move-result-object v8

    sub-int/2addr v2, v7

    invoke-virtual {v8, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->x(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/study/bean/course/CatalogBean;

    :goto_2
    if-eqz v1, :cond_7

    .line 15
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_3

    .line 16
    :cond_7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/zykj/study/bean/course/CatalogBean;

    .line 17
    invoke-static {v9, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    move v6, v7

    .line 18
    :cond_9
    :goto_3
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v1, v9}, Li7/w;->x(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 20
    move-object v11, v10

    check-cast v11, Lcom/zykj/study/bean/course/CatalogBean;

    if-eqz v6, :cond_a

    goto :goto_5

    .line 21
    :cond_a
    invoke-virtual {v11}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_b

    invoke-interface {v10, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-ne v10, v7, :cond_b

    .line 22
    invoke-virtual {v11}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    move-result-object v10

    invoke-static {v10, v3}, Li7/f0;->E0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    const/16 v23, 0x7ef

    const/16 v24, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v11 .. v24}, Lcom/zykj/study/bean/course/CatalogBean;->copy$default(Lcom/zykj/study/bean/course/CatalogBean;ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZIIILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogBean;

    move-result-object v11

    .line 23
    :cond_b
    :goto_5
    invoke-interface {v8, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 24
    :cond_c
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_d
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lcom/zykj/study/bean/course/CatalogBean;

    .line 26
    invoke-static {v10, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    .line 27
    invoke-interface {v1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_e
    if-nez v2, :cond_f

    .line 28
    invoke-static {v3}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v1}, Li7/f0;->F0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_b

    :cond_f
    if-nez v4, :cond_10

    .line 29
    invoke-static {v1, v3}, Li7/f0;->G0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_b

    .line 30
    :cond_10
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogBean;->isChild()Z

    move-result v6

    if-nez v6, :cond_13

    .line 31
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 34
    move-object v8, v7

    check-cast v8, Lcom/zykj/study/bean/course/CatalogBean;

    .line 35
    invoke-virtual {v8}, Lcom/zykj/study/bean/course/CatalogBean;->getSort()I

    move-result v8

    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogBean;->getSort()I

    move-result v9

    if-ge v8, v9, :cond_11

    .line 36
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 37
    :cond_11
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 38
    :cond_12
    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, v2, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    invoke-virtual {v1}, Lkotlin/Pair;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, v3}, Li7/f0;->G0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v2, v1}, Li7/f0;->F0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_b

    .line 40
    :cond_13
    invoke-virtual {v2}, Lcom/zykj/study/bean/course/CatalogBean;->isChild()Z

    move-result v2

    if-eqz v2, :cond_18

    .line 41
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v9}, Li7/w;->x(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 43
    move-object v8, v6

    check-cast v8, Lcom/zykj/study/bean/course/CatalogBean;

    .line 44
    invoke-virtual {v8}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_16

    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-ne v6, v7, :cond_16

    .line 45
    invoke-virtual {v8}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    move-result-object v6

    .line 46
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 47
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 48
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 49
    move-object v12, v11

    check-cast v12, Lcom/zykj/study/bean/course/CatalogBean;

    .line 50
    invoke-virtual {v12}, Lcom/zykj/study/bean/course/CatalogBean;->getSort()I

    move-result v12

    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogBean;->getSort()I

    move-result v13

    if-ge v12, v13, :cond_14

    .line 51
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 52
    :cond_14
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 53
    :cond_15
    new-instance v6, Lkotlin/Pair;

    invoke-direct {v6, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    invoke-virtual {v6}, Lkotlin/Pair;->e()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-static {v9, v3}, Li7/f0;->G0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v6}, Lkotlin/Pair;->g()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v9, v6}, Li7/f0;->F0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v13

    const/16 v20, 0x7ef

    const/16 v21, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    .line 55
    invoke-static/range {v8 .. v21}, Lcom/zykj/study/bean/course/CatalogBean;->copy$default(Lcom/zykj/study/bean/course/CatalogBean;ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZIIILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogBean;

    move-result-object v8

    .line 56
    :cond_16
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_17
    move-object v1, v2

    goto :goto_b

    .line 57
    :cond_18
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v9}, Li7/w;->x(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 59
    move-object v8, v6

    check-cast v8, Lcom/zykj/study/bean/course/CatalogBean;

    .line 60
    invoke-virtual {v8}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_19

    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-ne v6, v7, :cond_19

    .line 61
    invoke-static {v3}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v8}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    move-result-object v9

    invoke-static {v6, v9}, Li7/f0;->F0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v13

    const/16 v20, 0x7ef

    const/16 v21, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    .line 62
    invoke-static/range {v8 .. v21}, Lcom/zykj/study/bean/course/CatalogBean;->copy$default(Lcom/zykj/study/bean/course/CatalogBean;ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZIIILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogBean;

    move-result-object v8

    .line 63
    :cond_19
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 64
    :goto_b
    iget-object v2, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-static {v2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->K(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    move-result-object v2

    .line 65
    iget-object v3, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-static {v3, v1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->N(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 66
    invoke-virtual {v2, v1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->o(Ljava/util/List;)V

    .line 67
    :cond_1a
    :goto_c
    iget-object v1, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    invoke-static {v1, v5}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->M(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Ljava/lang/Integer;)V

    return-void
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 4

    .line 1
    const-string v0, "viewHolder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, Lr0/b;

    .line 17
    .line 18
    instance-of v0, p2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-nez p2, :cond_1

    .line 29
    .line 30
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 31
    .line 32
    invoke-static {p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->o()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p2}, Li7/v;->p(Ljava/util/List;)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    :goto_0
    const/4 v0, -0x1

    .line 45
    if-ge v0, p2, :cond_1

    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 48
    .line 49
    invoke-static {v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lr0/b;

    .line 58
    .line 59
    instance-of v1, v0, Lcom/zykj/study/bean/course/CatalogBean;

    .line 60
    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    move-object v1, v0

    .line 64
    check-cast v1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_0

    .line 71
    .line 72
    invoke-virtual {v1}, Lr0/a;->isExpanded()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 79
    .line 80
    invoke-static {v2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    new-instance v3, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v0, v3}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->r0(Lr0/b;Ljava/util/Collection;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 93
    .line 94
    invoke-static {v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->K(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->k()Ljava/util/HashSet;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_1
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 117
    .line 118
    invoke-virtual {p2}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 123
    .line 124
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;

    .line 125
    .line 126
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;->recycle:Landroidx/recyclerview/widget/RecyclerView;

    .line 127
    .line 128
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {p2, v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->M(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Ljava/lang/Integer;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 146
    .line 147
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 148
    .line 149
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    sget v0, Lcom/zykj/study/R$color;->subscribe_tab_bg_select:I

    .line 154
    .line 155
    invoke-static {p2, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 160
    .line 161
    .line 162
    return-void
.end method
