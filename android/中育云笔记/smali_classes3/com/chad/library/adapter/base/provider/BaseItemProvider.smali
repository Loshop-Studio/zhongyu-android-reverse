.class public abstract Lcom/chad/library/adapter/base/provider/BaseItemProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/ref/WeakReference;

.field public final c:Lqc/d;

.field public final d:Lqc/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->e:Lkotlin/LazyThreadSafetyMode;

    .line 5
    .line 6
    sget-object v1, Lcom/chad/library/adapter/base/provider/BaseItemProvider$clickViewIds$2;->c:Lcom/chad/library/adapter/base/provider/BaseItemProvider$clickViewIds$2;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, p0, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->c:Lqc/d;

    .line 13
    .line 14
    sget-object v1, Lcom/chad/library/adapter/base/provider/BaseItemProvider$longClickViewIds$2;->c:Lcom/chad/library/adapter/base/provider/BaseItemProvider$longClickViewIds$2;

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->d:Lqc/d;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public abstract a(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
.end method

.method public abstract b(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->e()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final d()Ljava/util/ArrayList;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->i()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final e()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->c:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    return-object v0
.end method

.method public final f()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public abstract g()I
.end method

.method public abstract h()I
.end method

.method public final i()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->d:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    return-object v0
.end method

.method public j(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    const-string p3, "helper"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "view"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public k(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    const-string p3, "helper"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "view"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public l(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    const-string p3, "helper"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "view"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public m(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;
    .locals 1

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->h()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {p1, v0}, Lr1/a;->a(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {p2, p1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;-><init>(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-object p2
.end method

.method public n(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    const-string p3, "helper"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "view"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public o(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V
    .locals 1

    .line 1
    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public p(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V
    .locals 1

    .line 1
    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public q(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V
    .locals 0

    .line 1
    const-string p2, "viewHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final r(Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;)V
    .locals 1

    .line 1
    const-string v0, "adapter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->b:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    return-void
.end method

.method public final s(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->a:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method
