.class final Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;
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
    c = "com.zykj.study.ui.home.my.CourseContentFragment$JsToJava$_callHandler$1$2"
    f = "CourseContentFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

.field public final synthetic c:Lorg/json/JSONArray;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lorg/json/JSONArray;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->c:Lorg/json/JSONArray;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->d(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V

    return-void
.end method

.method public static final d(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 2
    .line 3
    sget v1, Lcom/zykj/study/R$string;->exercise_params_error:I

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v1, "getString(...)"

    .line 10
    .line 11
    invoke-static {p0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p0}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->c:Lorg/json/JSONArray;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lorg/json/JSONArray;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, Lcom/zykj/study/ui/home/my/c;->a:Lcom/zykj/study/ui/home/my/c$f;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->c:Lorg/json/JSONArray;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->c:Lorg/json/JSONArray;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget-object v3, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->c:Lorg/json/JSONArray;

    .line 50
    .line 51
    const/4 v4, 0x2

    .line 52
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iget-object v4, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->c:Lorg/json/JSONArray;

    .line 65
    .line 66
    const/4 v5, 0x3

    .line 67
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/zykj/study/ui/home/my/c$f;->d(IIII)Landroidx/navigation/NavDirections;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catch_0
    move-exception p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 92
    .line 93
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->m(Lcom/zykj/study/ui/home/my/CourseContentFragment;)Lcom/zykj/study/view/CustomX5WebView;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$2;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 98
    .line 99
    new-instance v1, Lcom/zykj/study/ui/home/my/a;

    .line 100
    .line 101
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/a;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 105
    .line 106
    .line 107
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 108
    .line 109
    return-object p1

    .line 110
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 113
    .line 114
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1
.end method
