.class final Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;->_callHandler(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.my.CourseContentFragment$JsToJava$_callHandler$1$4"
    f = "CourseContentFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

.field public final synthetic c:Lorg/json/JSONArray;

.field public final synthetic d:Lcom/zykj/study/ui/home/my/CourseContentFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;Lorg/json/JSONArray;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->c:Lorg/json/JSONArray;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->d:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->c:Lorg/json/JSONArray;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->d:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;Lorg/json/JSONArray;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lcom/zykj/study/ui/home/my/c;->a:Lcom/zykj/study/ui/home/my/c$f;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;->c()Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->b()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->c:Lorg/json/JSONArray;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->c:Lorg/json/JSONArray;

    .line 47
    .line 48
    const/4 v3, 0x2

    .line 49
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {p1, v0, v1, v2}, Lcom/zykj/study/ui/home/my/c$f;->a(III)Landroidx/navigation/NavDirections;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$4;->d:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 66
    .line 67
    invoke-static {v0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 72
    .line 73
    .line 74
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1
.end method
