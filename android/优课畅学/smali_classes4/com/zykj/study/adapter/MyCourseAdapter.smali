.class public final Lcom/zykj/study/adapter/MyCourseAdapter;
.super Landroidx/paging/PagingDataAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/MyCourseAdapter$a;,
        Lcom/zykj/study/adapter/MyCourseAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingDataAdapter<",
        "Lcom/zykj/study/data/MyCourseEntity;",
        "Lcom/zykj/study/adapter/MyCourseAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Lcom/zykj/study/adapter/MyCourseAdapter$a;

.field public static final e:I

.field public static final f:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;


# instance fields
.field public final a:Lcom/zykj/study/viewmodels/DictViewModel;

.field public final b:Lx7/l;

.field public c:Lcom/zykj/lib/login/proto/UserBean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/adapter/MyCourseAdapter$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/MyCourseAdapter$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/study/adapter/MyCourseAdapter;->d:Lcom/zykj/study/adapter/MyCourseAdapter$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/zykj/study/adapter/MyCourseAdapter;->e:I

    .line 12
    .line 13
    new-instance v0, Lcom/zykj/study/adapter/MyCourseAdapter$Companion$POST_COMPARATOR$1;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/zykj/study/adapter/MyCourseAdapter$Companion$POST_COMPARATOR$1;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/zykj/study/adapter/MyCourseAdapter;->f:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/viewmodels/DictViewModel;Lx7/l;)V
    .locals 7

    .line 1
    const-string v0, "dictViewModel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v2, Lcom/zykj/study/adapter/MyCourseAdapter;->f:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;

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
    iput-object p1, v1, Lcom/zykj/study/adapter/MyCourseAdapter;->a:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 17
    .line 18
    iput-object p2, v1, Lcom/zykj/study/adapter/MyCourseAdapter;->b:Lx7/l;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/MyCourseAdapter;Lcom/zykj/study/data/MyCourseEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/MyCourseAdapter;->e(Lcom/zykj/study/adapter/MyCourseAdapter;Lcom/zykj/study/data/MyCourseEntity;Landroid/view/View;)V

    return-void
.end method

.method public static final e(Lcom/zykj/study/adapter/MyCourseAdapter;Lcom/zykj/study/data/MyCourseEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/MyCourseAdapter;->b:Lx7/l;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Lcom/zykj/study/data/MyCourseEntity;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Ln4/j0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ln4/j0;-><init>(Lcom/zykj/study/adapter/MyCourseAdapter;Lcom/zykj/study/data/MyCourseEntity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public f(Lcom/zykj/study/adapter/MyCourseAdapter$ViewHolder;I)V
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
    move-result-object p2

    .line 10
    check-cast p2, Lcom/zykj/study/data/MyCourseEntity;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/MyCourseAdapter;->d(Lcom/zykj/study/data/MyCourseEntity;)Landroid/view/View$OnClickListener;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/zykj/study/adapter/MyCourseAdapter;->c:Lcom/zykj/lib/login/proto/UserBean;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/zykj/study/adapter/MyCourseAdapter;->a:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 21
    .line 22
    invoke-virtual {p1, v0, p2, v1, v2}, Lcom/zykj/study/adapter/MyCourseAdapter$ViewHolder;->a(Landroid/view/View$OnClickListener;Lcom/zykj/study/data/MyCourseEntity;Lcom/zykj/lib/login/proto/UserBean;Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public g(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/MyCourseAdapter$ViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/adapter/MyCourseAdapter$ViewHolder;

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
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ItemMyCourseBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemMyCourseBinding;

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
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/MyCourseAdapter$ViewHolder;-><init>(Lcom/zykj/study/databinding/ItemMyCourseBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final h(Lcom/zykj/lib/login/proto/UserBean;)V
    .locals 1

    .line 1
    const-string v0, "userInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/adapter/MyCourseAdapter;->c:Lcom/zykj/lib/login/proto/UserBean;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/adapter/MyCourseAdapter$ViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/MyCourseAdapter;->f(Lcom/zykj/study/adapter/MyCourseAdapter$ViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/MyCourseAdapter;->g(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/MyCourseAdapter$ViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
