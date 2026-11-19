.class public final Li3/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li3/q$a;
    }
.end annotation


# static fields
.field public static final d:Li3/q$a;

.field public static final e:I

.field public static final f:Lqc/d;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

.field public final c:Landroid/view/WindowManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li3/q$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li3/q$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li3/q;->d:Li3/q$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Li3/q;->e:I

    .line 12
    .line 13
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 14
    .line 15
    new-instance v1, Li3/p;

    .line 16
    .line 17
    invoke-direct {v1}, Li3/p;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Li3/q;->f:Lqc/d;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li3/q;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-string v0, "window"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p1, Landroid/view/WindowManager;

    .line 18
    .line 19
    iput-object p1, p0, Li3/q;->c:Landroid/view/WindowManager;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic a()Li3/q;
    .locals 1

    .line 1
    invoke-static {}, Li3/q;->b()Li3/q;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Li3/q;
    .locals 3

    .line 1
    new-instance v0, Li3/q;

    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getApp(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Li3/q;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static final synthetic c()Lqc/d;
    .locals 1

    .line 1
    sget-object v0, Li3/q;->f:Lqc/d;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final d(IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li3/q;->b:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->s(IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Li3/q;->c:Landroid/view/WindowManager;

    .line 2
    .line 3
    iget-object v1, p0, Li3/q;->b:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Li3/q;->b:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 6
    .line 7
    iget-object v1, p0, Li3/q;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Li3/q;->b:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, Li3/q;->b:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 6
    .line 7
    iget-object v1, p0, Li3/q;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Li3/q;->b:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 13
    .line 14
    :cond_0
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->screenOrientation:I

    .line 21
    .line 22
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v2, 0x1a

    .line 25
    .line 26
    if-lt v1, v2, :cond_1

    .line 27
    .line 28
    const/16 v1, 0x7f6

    .line 29
    .line 30
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/16 v1, 0x7d2

    .line 34
    .line 35
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 36
    .line 37
    :goto_0
    const/16 v1, 0x500

    .line 38
    .line 39
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 40
    .line 41
    const/4 v1, -0x1

    .line 42
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 43
    .line 44
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 48
    .line 49
    iget-object v1, p0, Li3/q;->c:Landroid/view/WindowManager;

    .line 50
    .line 51
    iget-object v2, p0, Li3/q;->b:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;

    .line 52
    .line 53
    invoke-interface {v1, v2, v0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
