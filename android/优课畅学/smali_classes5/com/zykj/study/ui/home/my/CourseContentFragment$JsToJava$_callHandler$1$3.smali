.class final Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;
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
    c = "com.zykj.study.ui.home.my.CourseContentFragment$JsToJava$_callHandler$1$3"
    f = "CourseContentFragment.kt"
    l = {
        0xbf
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

.field public final synthetic c:Lorg/json/JSONArray;

.field public final synthetic d:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lorg/json/JSONArray;Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->c:Lorg/json/JSONArray;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->d:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

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

.method public static synthetic c(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->d(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V

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
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->c:Lorg/json/JSONArray;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->d:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;Lorg/json/JSONArray;Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->a:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v4, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :try_start_1
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->l(Lcom/zykj/study/ui/home/my/CourseContentFragment;)Lcom/zykj/study/viewmodels/CourseContentViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->c:Lorg/json/JSONArray;

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    iget-object v5, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->c:Lorg/json/JSONArray;

    .line 53
    .line 54
    invoke-virtual {v5, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    iput v4, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->a:I

    .line 67
    .line 68
    invoke-virtual {p1, v1, v5, p0}, Lcom/zykj/study/viewmodels/CourseContentViewModel;->b(IILm7/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_2

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_2
    :goto_0
    move-object v9, p1

    .line 76
    check-cast v9, Lcom/zykj/study/bean/exercise/GroupStatistic;

    .line 77
    .line 78
    if-eqz v9, :cond_3

    .line 79
    .line 80
    iget-object v5, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 81
    .line 82
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->c:Lorg/json/JSONArray;

    .line 83
    .line 84
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->d:Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;

    .line 85
    .line 86
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava;->c()Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, Lcom/zykj/study/ui/home/my/CourseContentFragmentArgs;->e()Z

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    invoke-static/range {v5 .. v10}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->n(Lcom/zykj/study/ui/home/my/CourseContentFragment;IIILcom/zykj/study/bean/exercise/GroupStatistic;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 138
    .line 139
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->m(Lcom/zykj/study/ui/home/my/CourseContentFragment;)Lcom/zykj/study/view/CustomX5WebView;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$JsToJava$_callHandler$1$3;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 144
    .line 145
    new-instance v1, Lcom/zykj/study/ui/home/my/b;

    .line 146
    .line 147
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/b;-><init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 151
    .line 152
    .line 153
    :cond_3
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 154
    .line 155
    return-object p1
.end method
