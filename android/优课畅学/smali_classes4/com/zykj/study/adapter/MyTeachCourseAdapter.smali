.class public final Lcom/zykj/study/adapter/MyTeachCourseAdapter;
.super Landroidx/paging/PagingDataAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/MyTeachCourseAdapter$a;,
        Lcom/zykj/study/adapter/MyTeachCourseAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingDataAdapter<",
        "Lcom/zykj/study/bean/course/CourseDetailsBean;",
        "Lcom/zykj/study/adapter/MyTeachCourseAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Lcom/zykj/study/adapter/MyTeachCourseAdapter$a;

.field public static final d:I

.field public static final e:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;


# instance fields
.field public final a:Lx7/l;

.field public final b:Lcom/zykj/study/viewmodels/DictViewModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/adapter/MyTeachCourseAdapter$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/MyTeachCourseAdapter$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->c:Lcom/zykj/study/adapter/MyTeachCourseAdapter$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->d:I

    .line 12
    .line 13
    new-instance v0, Lcom/zykj/study/adapter/MyTeachCourseAdapter$Companion$POST_COMPARATOR$1;

    .line 14
    .line 15
    invoke-direct {v0}, Lcom/zykj/study/adapter/MyTeachCourseAdapter$Companion$POST_COMPARATOR$1;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->e:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lx7/l;Lcom/zykj/study/viewmodels/DictViewModel;)V
    .locals 7

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dictViewModel"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v2, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->e:Landroidx/recyclerview/widget/DiffUtil$ItemCallback;

    .line 12
    .line 13
    const/4 v5, 0x6

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v1, p0

    .line 18
    invoke-direct/range {v1 .. v6}, Landroidx/paging/PagingDataAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;ILkotlin/jvm/internal/n;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v1, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->a:Lx7/l;

    .line 22
    .line 23
    iput-object p2, v1, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->b:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/MyTeachCourseAdapter;Lcom/zykj/study/bean/course/CourseDetailsBean;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->e(Lcom/zykj/study/adapter/MyTeachCourseAdapter;Lcom/zykj/study/bean/course/CourseDetailsBean;Landroid/view/View;)V

    return-void
.end method

.method public static final e(Lcom/zykj/study/adapter/MyTeachCourseAdapter;Lcom/zykj/study/bean/course/CourseDetailsBean;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->a:Lx7/l;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Lcom/zykj/study/bean/course/CourseDetailsBean;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Ln4/k0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ln4/k0;-><init>(Lcom/zykj/study/adapter/MyTeachCourseAdapter;Lcom/zykj/study/bean/course/CourseDetailsBean;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public f(Lcom/zykj/study/adapter/MyTeachCourseAdapter$ViewHolder;I)V
    .locals 2

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
    check-cast p2, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->d(Lcom/zykj/study/bean/course/CourseDetailsBean;)Landroid/view/View$OnClickListener;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->b:Lcom/zykj/study/viewmodels/DictViewModel;

    .line 19
    .line 20
    invoke-virtual {p1, v0, p2, v1}, Lcom/zykj/study/adapter/MyTeachCourseAdapter$ViewHolder;->a(Landroid/view/View$OnClickListener;Lcom/zykj/study/bean/course/CourseDetailsBean;Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public g(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/MyTeachCourseAdapter$ViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/adapter/MyTeachCourseAdapter$ViewHolder;

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
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ItemMyTeachCourseBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemMyTeachCourseBinding;

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
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/MyTeachCourseAdapter$ViewHolder;-><init>(Lcom/zykj/study/databinding/ItemMyTeachCourseBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/adapter/MyTeachCourseAdapter$ViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->f(Lcom/zykj/study/adapter/MyTeachCourseAdapter$ViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/MyTeachCourseAdapter;->g(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/MyTeachCourseAdapter$ViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
