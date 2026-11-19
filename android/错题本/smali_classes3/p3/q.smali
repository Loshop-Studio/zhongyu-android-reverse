.class public final Lp3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Lp3/r;


# direct methods
.method public constructor <init>(Lp3/r;IFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp3/q;->d:Lp3/r;

    .line 5
    .line 6
    iput p2, p0, Lp3/q;->a:I

    .line 7
    .line 8
    iput p3, p0, Lp3/q;->b:F

    .line 9
    .line 10
    iput p4, p0, Lp3/q;->c:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    iget v3, p0, Lp3/q;->c:F

    .line 5
    .line 6
    iget v4, p0, Lp3/q;->b:F

    .line 7
    .line 8
    const-wide/16 v5, 0x64

    .line 9
    .line 10
    iget-object v7, p0, Lp3/q;->d:Lp3/r;

    .line 11
    .line 12
    iget v8, p0, Lp3/q;->a:I

    .line 13
    .line 14
    if-lez v8, :cond_0

    .line 15
    .line 16
    iget v8, v7, Lp3/r;->c:F

    .line 17
    .line 18
    new-array v9, v2, [F

    .line 19
    .line 20
    aput v8, v9, v1

    .line 21
    .line 22
    aput v4, v9, v0

    .line 23
    .line 24
    invoke-static {v9}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v8, Lp3/p;

    .line 33
    .line 34
    invoke-direct {v8, p0, v1}, Lp3/p;-><init>(Lp3/q;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v8}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 38
    .line 39
    .line 40
    iget v8, v7, Lp3/r;->a:F

    .line 41
    .line 42
    new-array v2, v2, [F

    .line 43
    .line 44
    aput v8, v2, v1

    .line 45
    .line 46
    aput v3, v2, v0

    .line 47
    .line 48
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, Lp3/p;

    .line 57
    .line 58
    invoke-direct {v2, p0, v0}, Lp3/p;-><init>(Lp3/q;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    if-gez v8, :cond_1

    .line 66
    .line 67
    iget v8, v7, Lp3/r;->a:F

    .line 68
    .line 69
    new-array v9, v2, [F

    .line 70
    .line 71
    aput v8, v9, v1

    .line 72
    .line 73
    aput v3, v9, v0

    .line 74
    .line 75
    invoke-static {v9}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    new-instance v8, Lp3/p;

    .line 84
    .line 85
    invoke-direct {v8, p0, v2}, Lp3/p;-><init>(Lp3/q;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v8}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 89
    .line 90
    .line 91
    iget v8, v7, Lp3/r;->c:F

    .line 92
    .line 93
    new-array v2, v2, [F

    .line 94
    .line 95
    aput v8, v2, v1

    .line 96
    .line 97
    aput v4, v2, v0

    .line 98
    .line 99
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    new-instance v0, Lp3/p;

    .line 108
    .line 109
    const/4 v2, 0x3

    .line 110
    invoke-direct {v0, p0, v2}, Lp3/p;-><init>(Lp3/q;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 114
    .line 115
    .line 116
    move-object v4, v3

    .line 117
    goto :goto_0

    .line 118
    :cond_1
    const/4 v4, 0x0

    .line 119
    move-object v1, v4

    .line 120
    :goto_0
    if-eqz v4, :cond_2

    .line 121
    .line 122
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 123
    .line 124
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object v0, v7, Lp3/r;->g:Landroid/animation/AnimatorSet;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0, v4}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 134
    .line 135
    .line 136
    iget-object v0, v7, Lp3/r;->g:Landroid/animation/AnimatorSet;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 139
    .line 140
    .line 141
    :cond_2
    return-void
.end method
