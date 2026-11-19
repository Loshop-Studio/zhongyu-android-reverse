.class public final Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initView$3;
.super Lcom/xuexiang/xui/widget/actionbar/TitleBar$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initView$3;->b:Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar$c;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initView$3;->b:Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "getViewLifecycleOwner(...)"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v4, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initView$3$performAction$1;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initView$3;->b:Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {v4, p1, v0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initView$3$performAction$1;-><init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;Lm7/c;)V

    .line 22
    .line 23
    .line 24
    const/4 v5, 0x3

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 29
    .line 30
    .line 31
    return-void
.end method
