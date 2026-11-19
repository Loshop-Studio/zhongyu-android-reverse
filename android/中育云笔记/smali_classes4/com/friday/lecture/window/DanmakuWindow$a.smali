.class public final Lcom/friday/lecture/window/DanmakuWindow$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/window/DanmakuWindow;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/lecture/window/DanmakuWindow;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/window/DanmakuWindow;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/window/DanmakuWindow$a;->a:Lcom/friday/lecture/window/DanmakuWindow;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1
    const-string v0, "msg"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 7
    .line 8
    .line 9
    iget v0, p1, Landroid/os/Message;->what:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, "dataBinding"

    .line 14
    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Lcom/friday/lecture/window/DanmakuWindow$a;->a:Lcom/friday/lecture/window/DanmakuWindow;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/friday/lecture/window/DanmakuWindow;->a(Lcom/friday/lecture/window/DanmakuWindow;)Lcom/friday/lecture/databinding/WindowDanmakuBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object v0, v2

    .line 29
    :cond_0
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowDanmakuBinding;->c:Landroid/widget/LinearLayout;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v4, 0x5

    .line 36
    if-ne v0, v4, :cond_3

    .line 37
    .line 38
    iget-object v0, p0, Lcom/friday/lecture/window/DanmakuWindow$a;->a:Lcom/friday/lecture/window/DanmakuWindow;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/friday/lecture/window/DanmakuWindow;->a(Lcom/friday/lecture/window/DanmakuWindow;)Lcom/friday/lecture/databinding/WindowDanmakuBinding;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    move-object v0, v2

    .line 50
    :cond_1
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowDanmakuBinding;->c:Landroid/widget/LinearLayout;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v4, "null cannot be cast to non-null type com.friday.lecture.window.DanmakuWindow.ClockTextView"

    .line 57
    .line 58
    invoke-static {v0, v4}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    check-cast v0, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;->f()V

    .line 64
    .line 65
    .line 66
    iget-object v4, p0, Lcom/friday/lecture/window/DanmakuWindow$a;->a:Lcom/friday/lecture/window/DanmakuWindow;

    .line 67
    .line 68
    invoke-static {v4}, Lcom/friday/lecture/window/DanmakuWindow;->a(Lcom/friday/lecture/window/DanmakuWindow;)Lcom/friday/lecture/databinding/WindowDanmakuBinding;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    if-nez v4, :cond_2

    .line 73
    .line 74
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    move-object v4, v2

    .line 78
    :cond_2
    iget-object v4, v4, Lcom/friday/lecture/databinding/WindowDanmakuBinding;->c:Landroid/widget/LinearLayout;

    .line 79
    .line 80
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    iget-object v0, p0, Lcom/friday/lecture/window/DanmakuWindow$a;->a:Lcom/friday/lecture/window/DanmakuWindow;

    .line 84
    .line 85
    invoke-static {v0}, Lcom/friday/lecture/window/DanmakuWindow;->a(Lcom/friday/lecture/window/DanmakuWindow;)Lcom/friday/lecture/databinding/WindowDanmakuBinding;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-nez v0, :cond_4

    .line 90
    .line 91
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    move-object v0, v2

    .line 95
    :cond_4
    iget-object v0, v0, Lcom/friday/lecture/databinding/WindowDanmakuBinding;->c:Landroid/widget/LinearLayout;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lcom/friday/lecture/window/DanmakuWindow$a;->a:Lcom/friday/lecture/window/DanmakuWindow;

    .line 101
    .line 102
    invoke-static {v0}, Lcom/friday/lecture/window/DanmakuWindow;->b(Lcom/friday/lecture/window/DanmakuWindow;)Lcom/friday/lecture/window/DanmakuWindow$ClockTextView;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 107
    .line 108
    const-string v1, "null cannot be cast to non-null type kotlin.String"

    .line 109
    .line 110
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    check-cast p1, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lcom/friday/lecture/window/DanmakuWindow$a;->a:Lcom/friday/lecture/window/DanmakuWindow;

    .line 119
    .line 120
    invoke-static {p1}, Lcom/friday/lecture/window/DanmakuWindow;->a(Lcom/friday/lecture/window/DanmakuWindow;)Lcom/friday/lecture/databinding/WindowDanmakuBinding;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-nez p1, :cond_5

    .line 125
    .line 126
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_5
    move-object v2, p1

    .line 131
    :goto_0
    iget-object p1, v2, Lcom/friday/lecture/databinding/WindowDanmakuBinding;->c:Landroid/widget/LinearLayout;

    .line 132
    .line 133
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 134
    .line 135
    .line 136
    return-void
.end method
