.class final Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;
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
    c = "com.zykj.study.ui.home.my.CourseContentFragment$JsToJava$_callHandler$1$5"
    f = "CourseContentFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lorg/json/JSONArray;

.field public final synthetic c:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

.field public final synthetic d:Lcom/zykj/study/ui/home/my/CourseContentFragment;


# direct methods
.method public constructor <init>(Lorg/json/JSONArray;Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->b:Lorg/json/JSONArray;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->c:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->d:Lcom/zykj/study/ui/home/my/CourseContentFragment;

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
    new-instance p1, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->b:Lorg/json/JSONArray;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->c:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->d:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;-><init>(Lorg/json/JSONArray;Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;Lcom/zykj/study/ui/home/my/CourseContentFragment;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/zykj/study/ui/home/my/c;->a:Lcom/zykj/study/ui/home/my/c$f;

    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->b:Lorg/json/JSONArray;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->b:Lorg/json/JSONArray;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->b:Lorg/json/JSONArray;

    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->c:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;->c()Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->e()Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    const/4 v5, 0x0

    .line 69
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/study/ui/home/my/c$f;->b(IIIIZ)Landroidx/navigation/NavDirections;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$5;->d:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 74
    .line 75
    invoke-static {v0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 80
    .line 81
    .line 82
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
.end method
