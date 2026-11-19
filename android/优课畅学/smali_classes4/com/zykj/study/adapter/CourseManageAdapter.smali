.class public final Lcom/zykj/study/adapter/CourseManageAdapter;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/CourseManageAdapter$a;,
        Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;,
        Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/ListAdapter<",
        "Lcom/zykj/study/bean/course/CatalogManageData;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Lcom/zykj/study/adapter/CourseManageAdapter$a;

.field public static final e:I


# instance fields
.field public final a:Lx7/p;

.field public final b:Lx7/p;

.field public final c:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/adapter/CourseManageAdapter$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/CourseManageAdapter$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/adapter/CourseManageAdapter;->d:Lcom/zykj/study/adapter/CourseManageAdapter$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/adapter/CourseManageAdapter;->e:I

    return-void
.end method

.method public constructor <init>(Lx7/p;Lx7/p;Lx7/p;)V
    .locals 1

    .line 1
    const-string v0, "onChapterClick"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onChapterChecked"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onKnowledgeChecked"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/zykj/study/adapter/CourseManageAdapter$1;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/zykj/study/adapter/CourseManageAdapter$1;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/study/adapter/CourseManageAdapter;->a:Lx7/p;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/zykj/study/adapter/CourseManageAdapter;->b:Lx7/p;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/zykj/study/adapter/CourseManageAdapter;->c:Lx7/p;

    .line 29
    .line 30
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/CourseManageAdapter;->h(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/CourseManageAdapter;->f(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/CourseManageAdapter;->g(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;Landroid/view/View;)V

    return-void
.end method

.method public static final f(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lcom/zykj/study/bean/course/CatalogManageData;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/zykj/study/adapter/CourseManageAdapter;->c:Lx7/p;

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CatalogManageData;->getId()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p1}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;->a()Lcom/zykj/study/databinding/ItemKnowledgeManageBinding;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemKnowledgeManageBinding;->switchBtn:Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    xor-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p0, p2, p1}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static final g(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/study/bean/course/CatalogManageData;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/zykj/study/adapter/CourseManageAdapter;->a:Lx7/p;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogManageData;->getId()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogManageData;->isExpanded()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    xor-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p0, p2, p1}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final h(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lcom/zykj/study/bean/course/CatalogManageData;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/zykj/study/adapter/CourseManageAdapter;->b:Lx7/p;

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CatalogManageData;->getId()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p1}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;->a()Lcom/zykj/study/databinding/ItemChapterManageBinding;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemChapterManageBinding;->switchBtn:Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    xor-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p0, p2, p1}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public getItemViewType(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/bean/course/CatalogManageData;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogManageData;->isLeaf()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 2

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/zykj/study/bean/course/CatalogManageData;

    .line 18
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/CourseManageAdapter;->getItemViewType(I)I

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    .line 19
    check-cast p1, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;

    invoke-virtual {p1}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;->a()Lcom/zykj/study/databinding/ItemKnowledgeManageBinding;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/zykj/study/databinding/ItemKnowledgeManageBinding;->setData(Lcom/zykj/study/bean/course/CatalogManageData;)V

    return-void

    .line 20
    :cond_0
    check-cast p1, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;

    invoke-virtual {p1}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;->a()Lcom/zykj/study/databinding/ItemChapterManageBinding;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/zykj/study/databinding/ItemChapterManageBinding;->setData(Lcom/zykj/study/bean/course/CatalogManageData;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payloads"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-string v0, "isUnlock"

    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/zykj/study/bean/course/CatalogManageData;

    .line 3
    instance-of v1, p1, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;

    if-eqz v1, :cond_0

    .line 4
    check-cast p1, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;

    invoke-virtual {p1}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;->a()Lcom/zykj/study/databinding/ItemKnowledgeManageBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/zykj/study/databinding/ItemKnowledgeManageBinding;->switchBtn:Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;

    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogManageData;->isUnlock()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setChecked(Z)V

    return-void

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;

    if-eqz v1, :cond_1

    .line 6
    check-cast p1, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;

    invoke-virtual {p1}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;->a()Lcom/zykj/study/databinding/ItemChapterManageBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/zykj/study/databinding/ItemChapterManageBinding;->switchBtn:Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;

    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogManageData;->isUnlock()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setChecked(Z)V

    return-void

    .line 7
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V

    return-void

    .line 8
    :cond_2
    const-string v0, "isExpanded"

    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 9
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/zykj/study/bean/course/CatalogManageData;

    .line 10
    instance-of v1, p1, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;

    if-eqz v1, :cond_5

    .line 11
    check-cast p1, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;

    invoke-virtual {p1}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;->a()Lcom/zykj/study/databinding/ItemChapterManageBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/zykj/study/databinding/ItemChapterManageBinding;->ivExpanded:Landroidx/appcompat/widget/AppCompatImageView;

    const-string p3, "ivExpanded"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogManageData;->isExpanded()Z

    move-result p3

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz p3, :cond_3

    move p3, v2

    goto :goto_0

    :cond_3
    move p3, v1

    .line 12
    :goto_0
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 13
    invoke-virtual {p1}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;->a()Lcom/zykj/study/databinding/ItemChapterManageBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/zykj/study/databinding/ItemChapterManageBinding;->ivUnexpanded:Landroidx/appcompat/widget/AppCompatImageView;

    const-string p2, "ivUnexpanded"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogManageData;->isExpanded()Z

    move-result p2

    if-nez p2, :cond_4

    move v1, v2

    .line 14
    :cond_4
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 15
    :cond_5
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V

    return-void

    .line 16
    :cond_6
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 3

    .line 1
    const-string v0, "parent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    const-string v1, "inflate(...)"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    new-instance p2, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0, p1, v2}, Lcom/zykj/study/databinding/ItemKnowledgeManageBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemKnowledgeManageBinding;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;-><init>(Lcom/zykj/study/databinding/ItemKnowledgeManageBinding;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;->a()Lcom/zykj/study/databinding/ItemKnowledgeManageBinding;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemKnowledgeManageBinding;->switchBtn:Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;

    .line 37
    .line 38
    new-instance v0, Ln4/u;

    .line 39
    .line 40
    invoke-direct {v0, p0, p2}, Ln4/u;-><init>(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderKnowledge;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :cond_0
    new-instance p2, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0, p1, v2}, Lcom/zykj/study/databinding/ItemChapterManageBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemChapterManageBinding;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;-><init>(Lcom/zykj/study/databinding/ItemChapterManageBinding;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;->a()Lcom/zykj/study/databinding/ItemChapterManageBinding;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemChapterManageBinding;->linearLayout:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 72
    .line 73
    new-instance v0, Ln4/v;

    .line 74
    .line 75
    invoke-direct {v0, p0, p2}, Ln4/v;-><init>(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;->a()Lcom/zykj/study/databinding/ItemChapterManageBinding;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemChapterManageBinding;->switchBtn:Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;

    .line 86
    .line 87
    new-instance v0, Ln4/w;

    .line 88
    .line 89
    invoke-direct {v0, p0, p2}, Ln4/w;-><init>(Lcom/zykj/study/adapter/CourseManageAdapter;Lcom/zykj/study/adapter/CourseManageAdapter$ViewHolderChapter;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    .line 94
    .line 95
    return-object p2
.end method
