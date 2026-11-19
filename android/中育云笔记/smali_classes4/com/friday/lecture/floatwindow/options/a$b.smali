.class public final Lcom/friday/lecture/floatwindow/options/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/floatwindow/options/a;->p(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public c:F

.field public d:F

.field public final synthetic e:Lcom/friday/lecture/floatwindow/options/a;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/floatwindow/options/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/floatwindow/options/a$b;->e:Lcom/friday/lecture/floatwindow/options/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "motionEvent"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lcom/friday/lecture/floatwindow/options/a$b;->c:F

    .line 16
    .line 17
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {}, Lcom/blankj/utilcode/util/BarUtils;->getStatusBarHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    int-to-float v0, v0

    .line 26
    sub-float/2addr p1, v0

    .line 27
    iput p1, p0, Lcom/friday/lecture/floatwindow/options/a$b;->d:F

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 p2, 0x0

    .line 34
    const-string v0, "layoutParams"

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    if-eq p1, v1, :cond_4

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    if-eq p1, v2, :cond_0

    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_0
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/a$b;->e:Lcom/friday/lecture/floatwindow/options/a;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/friday/lecture/floatwindow/options/a;->d(Lcom/friday/lecture/floatwindow/options/a;)Landroid/view/WindowManager$LayoutParams;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object p1, p2

    .line 56
    :cond_1
    iget v2, p0, Lcom/friday/lecture/floatwindow/options/a$b;->c:F

    .line 57
    .line 58
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a$b;->e:Lcom/friday/lecture/floatwindow/options/a;

    .line 59
    .line 60
    invoke-virtual {v3}, Lcom/friday/lecture/floatwindow/options/a;->h()Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->getTouchDownX()F

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    sub-float/2addr v2, v3

    .line 72
    float-to-int v2, v2

    .line 73
    iput v2, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 74
    .line 75
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/a$b;->e:Lcom/friday/lecture/floatwindow/options/a;

    .line 76
    .line 77
    invoke-static {p1}, Lcom/friday/lecture/floatwindow/options/a;->d(Lcom/friday/lecture/floatwindow/options/a;)Landroid/view/WindowManager$LayoutParams;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-nez p1, :cond_2

    .line 82
    .line 83
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    move-object p1, p2

    .line 87
    :cond_2
    iget v2, p0, Lcom/friday/lecture/floatwindow/options/a$b;->d:F

    .line 88
    .line 89
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a$b;->e:Lcom/friday/lecture/floatwindow/options/a;

    .line 90
    .line 91
    invoke-virtual {v3}, Lcom/friday/lecture/floatwindow/options/a;->h()Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Lcom/friday/lecture/floatwindow/options/OptionLayout;->getTouchDownY()F

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    sub-float/2addr v2, v3

    .line 103
    float-to-int v2, v2

    .line 104
    iput v2, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 105
    .line 106
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/a$b;->e:Lcom/friday/lecture/floatwindow/options/a;

    .line 107
    .line 108
    invoke-static {p1}, Lcom/friday/lecture/floatwindow/options/a;->e(Lcom/friday/lecture/floatwindow/options/a;)Landroid/view/WindowManager;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object v2, p0, Lcom/friday/lecture/floatwindow/options/a$b;->e:Lcom/friday/lecture/floatwindow/options/a;

    .line 113
    .line 114
    invoke-virtual {v2}, Lcom/friday/lecture/floatwindow/options/a;->h()Lcom/friday/lecture/floatwindow/options/OptionLayout;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    iget-object v3, p0, Lcom/friday/lecture/floatwindow/options/a$b;->e:Lcom/friday/lecture/floatwindow/options/a;

    .line 119
    .line 120
    invoke-static {v3}, Lcom/friday/lecture/floatwindow/options/a;->d(Lcom/friday/lecture/floatwindow/options/a;)Landroid/view/WindowManager$LayoutParams;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-nez v3, :cond_3

    .line 125
    .line 126
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_3
    move-object p2, v3

    .line 131
    :goto_0
    invoke-interface {p1, v2, p2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_4
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/a$b;->e:Lcom/friday/lecture/floatwindow/options/a;

    .line 136
    .line 137
    invoke-static {p1}, Lcom/friday/lecture/floatwindow/options/a;->d(Lcom/friday/lecture/floatwindow/options/a;)Landroid/view/WindowManager$LayoutParams;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    if-nez v2, :cond_5

    .line 142
    .line 143
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    move-object v2, p2

    .line 147
    :cond_5
    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 148
    .line 149
    invoke-static {p1, v2}, Lcom/friday/lecture/floatwindow/options/a;->f(Lcom/friday/lecture/floatwindow/options/a;I)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, Lcom/friday/lecture/floatwindow/options/a$b;->e:Lcom/friday/lecture/floatwindow/options/a;

    .line 153
    .line 154
    invoke-static {p1}, Lcom/friday/lecture/floatwindow/options/a;->d(Lcom/friday/lecture/floatwindow/options/a;)Landroid/view/WindowManager$LayoutParams;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    if-nez v2, :cond_6

    .line 159
    .line 160
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_6
    move-object p2, v2

    .line 165
    :goto_1
    iget p2, p2, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 166
    .line 167
    invoke-static {p1, p2}, Lcom/friday/lecture/floatwindow/options/a;->g(Lcom/friday/lecture/floatwindow/options/a;I)V

    .line 168
    .line 169
    .line 170
    :goto_2
    return v1
.end method
