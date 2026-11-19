.class public final Lcom/zykj/study/ui/home/my/CourseContentFragment$CourseDeauthorized;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/ui/home/my/CourseContentFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "CourseDeauthorized"
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/CourseContentFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$CourseDeauthorized;->a:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final courseDeauthorized()V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$CourseDeauthorized;->a:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getViewLifecycleOwner(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v5, Lcom/zykj/study/ui/home/my/CourseContentFragment$CourseDeauthorized$courseDeauthorized$1;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$CourseDeauthorized;->a:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v5, v0, v1}, Lcom/zykj/study/ui/home/my/CourseContentFragment$CourseDeauthorized$courseDeauthorized$1;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lm7/c;)V

    .line 22
    .line 23
    .line 24
    const/4 v6, 0x3

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-static/range {v2 .. v7}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 29
    .line 30
    .line 31
    return-void
.end method
