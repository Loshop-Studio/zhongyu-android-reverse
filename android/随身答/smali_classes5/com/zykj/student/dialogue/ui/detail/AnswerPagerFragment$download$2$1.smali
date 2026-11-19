.class public final Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;
.super Ly1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->E(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

.field public final synthetic c:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic d:Lcom/liulishuo/okdownload/a;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/liulishuo/okdownload/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;->b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;->d:Lcom/liulishuo/okdownload/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ly1/b;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Lcom/liulishuo/okdownload/a;Lr1/c;ZLz1/b$b;)V
    .locals 0

    .line 1
    const-string p3, "task"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "info"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "model"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;Lp1/f;)V
    .locals 8

    .line 1
    const-string p3, "task"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "cause"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p3, "taskSpeed"

    .line 12
    .line 13
    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p3, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;->b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 17
    .line 18
    invoke-static {p3}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;

    .line 23
    .line 24
    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 25
    .line 26
    iget-object v5, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;->d:Lcom/liulishuo/okdownload/a;

    .line 27
    .line 28
    iget-object v6, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;->b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    move-object v3, p1

    .line 32
    move-object v2, p2

    .line 33
    invoke-direct/range {v1 .. v7}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1;-><init>(Lcom/liulishuo/okdownload/core/cause/EndCause;Lcom/liulishuo/okdownload/a;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/liulishuo/okdownload/a;Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lkotlin/coroutines/Continuation;)V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x3

    .line 37
    const/4 v5, 0x0

    .line 38
    move-object v3, v1

    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public g(Lcom/liulishuo/okdownload/a;)V
    .locals 1

    .line 1
    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public h(Lcom/liulishuo/okdownload/a;ILr1/a;Lp1/f;)V
    .locals 0

    .line 1
    const-string p2, "task"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "blockSpeed"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public j(Lcom/liulishuo/okdownload/a;IJLp1/f;)V
    .locals 0

    .line 1
    const-string p2, "task"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "blockSpeed"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public l(Lcom/liulishuo/okdownload/a;JLp1/f;)V
    .locals 2

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "taskSpeed"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p4, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;->d:Lcom/liulishuo/okdownload/a;

    .line 12
    .line 13
    if-eqz p4, :cond_0

    .line 14
    .line 15
    invoke-virtual {p4}, Lcom/liulishuo/okdownload/a;->b()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p4, 0x0

    .line 21
    :goto_0
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->b()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    if-eqz p4, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->p()Lr1/c;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p4, p0, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 38
    .line 39
    iget-object p4, p4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p4, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 42
    .line 43
    if-eqz p4, :cond_1

    .line 44
    .line 45
    long-to-float p2, p2

    .line 46
    const/high16 p3, 0x3f800000    # 1.0f

    .line 47
    .line 48
    mul-float/2addr p2, p3

    .line 49
    invoke-virtual {p1}, Lr1/c;->j()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    long-to-float p1, v0

    .line 54
    div-float/2addr p2, p1

    .line 55
    const/16 p1, 0x64

    .line 56
    .line 57
    int-to-float p1, p1

    .line 58
    mul-float/2addr p2, p1

    .line 59
    float-to-int p1, p2

    .line 60
    invoke-virtual {p4, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t(I)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public o(Lcom/liulishuo/okdownload/a;IILjava/util/Map;)V
    .locals 0

    .line 1
    const-string p2, "task"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "responseHeaderFields"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public u(Lcom/liulishuo/okdownload/a;ILjava/util/Map;)V
    .locals 0

    .line 1
    const-string p2, "task"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "requestHeaderFields"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
