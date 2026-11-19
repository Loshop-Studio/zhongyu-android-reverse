.class public final Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$initView$2;
.super Landroidx/viewpager/widget/PagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$initView$2;->a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/viewpager/widget/PagerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$initView$2;->b(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)Lqc/q;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->t(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->u(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 1
    const-string p2, "container"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "object"

    .line 7
    .line 8
    invoke-static {p3, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    check-cast p3, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 12
    .line 13
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$initView$2;->a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->s(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "mAdapter"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$initView$2;->a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;->s(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string v0, "mAdapter"

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    :cond_0
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->b()Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getLocalPath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->a()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getLocalPath()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v1, v0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->setImage(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->a()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getRemoteUrl()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v1, v0}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->setImage(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->a()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->a()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$initView$2;->a:Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;

    .line 79
    .line 80
    new-instance v1, Li3/g0;

    .line 81
    .line 82
    invoke-direct {v1, v0}, Li3/g0;-><init>(Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1}, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;->setOnClose(Lhd/a;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->a()Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "object"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method
