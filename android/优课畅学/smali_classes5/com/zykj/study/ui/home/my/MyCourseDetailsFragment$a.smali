.class public final Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/study/adapter/CatalogEditAdapter$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;-><init>()V
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
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$a;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lcom/zykj/study/bean/course/CatalogBean;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$a;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->I(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lp4/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Lp4/a;->E(Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$a;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 29
    .line 30
    invoke-static {p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->I(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lp4/a;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Lp4/a;->v(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$a;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->H(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lp4/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0, p2}, Lp4/a;->E(Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    iget-object p2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$a;->a:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 52
    .line 53
    invoke-static {p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->H(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lp4/a;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Lp4/a;->v(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    return-void
.end method
