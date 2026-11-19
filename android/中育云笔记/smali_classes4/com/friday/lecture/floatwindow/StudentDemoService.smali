.class public final Lcom/friday/lecture/floatwindow/StudentDemoService;
.super Lcom/friday/common/service/BaseLifecycleService;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public d:Landroid/view/WindowManager;

.field public e:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/service/BaseLifecycleService;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/friday/common/service/BaseLifecycleService;->onCreate()V

    .line 2
    .line 3
    .line 4
    const-string v0, "window"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast v0, Landroid/view/WindowManager;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/friday/lecture/floatwindow/StudentDemoService;->d:Landroid/view/WindowManager;

    .line 18
    .line 19
    new-instance v0, Landroid/util/DisplayMetrics;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/StudentDemoService;->d:Landroid/view/WindowManager;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    .line 38
    .line 39
    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 40
    .line 41
    .line 42
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 43
    .line 44
    const/16 v2, 0x1a

    .line 45
    .line 46
    if-lt v1, v2, :cond_1

    .line 47
    .line 48
    const/16 v1, 0x7f6

    .line 49
    .line 50
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/16 v1, 0x7d2

    .line 54
    .line 55
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 56
    .line 57
    :goto_0
    const v1, 0x800053

    .line 58
    .line 59
    .line 60
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    sget v2, Lcom/friday/lecture/R$dimen;->view_32:I

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    float-to-int v1, v1

    .line 73
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    sget v2, Lcom/friday/lecture/R$dimen;->view_24:I

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    float-to-int v1, v1

    .line 86
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    sget v2, Lcom/friday/lecture/R$dimen;->view_7:I

    .line 93
    .line 94
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    float-to-int v1, v1

    .line 99
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    sget v2, Lcom/friday/lecture/R$dimen;->view_8:I

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    float-to-int v1, v1

    .line 112
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 113
    .line 114
    const/4 v1, 0x1

    .line 115
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 116
    .line 117
    const/16 v1, 0x28

    .line 118
    .line 119
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 120
    .line 121
    sget v1, Lcom/friday/lecture/R$layout;->window_student_demo_flag:I

    .line 122
    .line 123
    const/4 v2, 0x0

    .line 124
    invoke-static {p0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iput-object v1, p0, Lcom/friday/lecture/floatwindow/StudentDemoService;->e:Landroid/view/View;

    .line 129
    .line 130
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/StudentDemoService;->d:Landroid/view/WindowManager;

    .line 131
    .line 132
    if-eqz v2, :cond_2

    .line 133
    .line 134
    invoke-interface {v2, v1, v0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 135
    .line 136
    .line 137
    :cond_2
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/friday/common/service/BaseLifecycleService;->onDestroy()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/friday/lecture/floatwindow/StudentDemoService;->d:Landroid/view/WindowManager;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/friday/lecture/floatwindow/StudentDemoService;->e:Landroid/view/View;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :catch_0
    :cond_0
    return-void
.end method
