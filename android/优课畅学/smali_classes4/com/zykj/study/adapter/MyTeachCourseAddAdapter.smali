.class public final Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;
.super Landroidx/paging/PagingDataAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$a;,
        Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingDataAdapter<",
        "Lcom/zykj/study/data/MyCourseEntity;",
        "Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$a;

.field public static final d:I

.field public static final e:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;


# instance fields
.field public final a:Lcom/zykj/study/viewmodels/DictViewModel;

.field public b:Lcom/zykj/study/data/MyCourseEntity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->c:Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->d:I

    .line 12
    .line 13
    new-instance v0, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$Companion$POST_COMPARATOR$1;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$Companion$POST_COMPARATOR$1;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->e:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/viewmodels/DictViewModel;)V
    .locals 7

    .line 1
    const-string v0, "dictViewModel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v2, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->e:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;

    .line 7
    .line 8
    const/4 v5, 0x6

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move-object v1, p0

    .line 13
    invoke-direct/range {v1 .. v6}, Landroidx/paging/PagingDataAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;ILkotlin/jvm/internal/n;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v1, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->a:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->e(Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;ILandroid/view/View;)V

    return-void
.end method

.method public static final e(Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/data/MyCourseEntity;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->b:Lcom/zykj/study/data/MyCourseEntity;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public final d(I)Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Ln4/l0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ln4/l0;-><init>(Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final f(Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->b:Lcom/zykj/study/data/MyCourseEntity;

    .line 2
    .line 3
    return-object p1
.end method

.method public g(Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$ViewHolder;I)V
    .locals 3

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/zykj/study/data/MyCourseEntity;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->d(I)Landroid/view/View$OnClickListener;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object v1, p0, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->b:Lcom/zykj/study/data/MyCourseEntity;

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v2, p0, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->a:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 25
    .line 26
    invoke-virtual {p1, p2, v0, v1, v2}, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$ViewHolder;->a(Landroid/view/View$OnClickListener;Lcom/zykj/study/data/MyCourseEntity;ZLcom/zykj/study/viewmodels/DictViewModel;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public h(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$ViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$ViewHolder;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "inflate(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$ViewHolder;-><init>(Lcom/zykj/study/databinding/ItemCourseTeachAddBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$ViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->g(Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$ViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/MyTeachCourseAddAdapter;->h(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/MyTeachCourseAddAdapter$ViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
