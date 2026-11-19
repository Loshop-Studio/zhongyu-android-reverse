.class final Lcom/zykj/view/widget/SketchProgressView$showView$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/widget/SketchProgressView;->showView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.widget.SketchProgressView$showView$1"
    f = "SketchProgressView.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x15a
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "a"
    }
    s = {
        "L$0",
        "I$0"
    }
.end annotation


# instance fields
.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/widget/SketchProgressView;


# direct methods
.method public constructor <init>(Lcom/zykj/view/widget/SketchProgressView;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/widget/SketchProgressView;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/widget/SketchProgressView$showView$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->this$0:Lcom/zykj/view/widget/SketchProgressView;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic e(Lcom/zykj/view/widget/SketchProgressView;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/widget/SketchProgressView$showView$1;->invokeSuspend$lambda$0(Lcom/zykj/view/widget/SketchProgressView;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lcom/zykj/view/widget/SketchProgressView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/view/widget/SketchProgressView$showView$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->this$0:Lcom/zykj/view/widget/SketchProgressView;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/view/widget/SketchProgressView$showView$1;-><init>(Lcom/zykj/view/widget/SketchProgressView;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/widget/SketchProgressView$showView$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/widget/SketchProgressView$showView$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/widget/SketchProgressView$showView$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/widget/SketchProgressView$showView$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/v;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v2, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    if-ne v2, v3, :cond_1

    .line 13
    .line 14
    iget v2, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->I$0:I

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    move p1, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_1
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
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    :goto_0
    invoke-static {v0}, Lkotlinx/coroutines/x;->s(Lkotlinx/coroutines/v;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    const/16 v2, 0xfa

    .line 40
    .line 41
    if-ge p1, v2, :cond_3

    .line 42
    .line 43
    add-int/lit8 v2, p1, 0x19

    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->this$0:Lcom/zykj/view/widget/SketchProgressView;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/zykj/view/widget/SketchProgressView;->access$getPaint$p(Lcom/zykj/view/widget/SketchProgressView;)Landroid/graphics/Paint;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->this$0:Lcom/zykj/view/widget/SketchProgressView;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->L$0:Ljava/lang/Object;

    .line 60
    .line 61
    iput v2, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->I$0:I

    .line 62
    .line 63
    iput v3, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->label:I

    .line 64
    .line 65
    const-wide/16 v4, 0xa

    .line 66
    .line 67
    invoke-static {v4, v5, p0}, Lkotlinx/coroutines/x;->i(JLh6/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v1, :cond_0

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->this$0:Lcom/zykj/view/widget/SketchProgressView;

    .line 75
    .line 76
    new-instance v0, Lcom/zykj/view/widget/a;

    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    invoke-direct {v0, p1, v1}, Lcom/zykj/view/widget/a;-><init>(Lcom/zykj/view/widget/SketchProgressView;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 83
    .line 84
    .line 85
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 86
    .line 87
    return-object p1
.end method
