.class public Lcom/luck/picture/lib/widget/SlideSelectTouchListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;,
        Lcom/luck/picture/lib/widget/SlideSelectTouchListener$b;
    }
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:I

.field public g:F

.field public h:F

.field public i:I

.field public j:I

.field public k:Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;

.field public l:Landroidx/recyclerview/widget/RecyclerView;

.field public m:Landroid/widget/OverScroller;

.field public final n:Ljava/lang/Runnable;

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:Z

.field public x:Z

.field public y:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$a;-><init>(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->n:Ljava/lang/Runnable;

    .line 10
    .line 11
    const/16 v0, 0x10

    .line 12
    .line 13
    iput v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->s:I

    .line 14
    .line 15
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 24
    .line 25
    const/high16 v1, 0x42600000    # 56.0f

    .line 26
    .line 27
    mul-float/2addr v0, v1

    .line 28
    float-to-int v0, v0

    .line 29
    iput v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->t:I

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->u:I

    .line 33
    .line 34
    iput v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->v:I

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    iput-boolean v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->w:Z

    .line 38
    .line 39
    iput-boolean v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->x:Z

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static synthetic a(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;)Landroid/widget/OverScroller;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->m:Landroid/widget/OverScroller;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->l(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lcom/luck/picture/lib/widget/SlideSelectTouchListener;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->n:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final f(Landroidx/recyclerview/widget/RecyclerView;FF)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget p2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->y:I

    .line 12
    .line 13
    sub-int/2addr p1, p2

    .line 14
    const/4 p2, -0x1

    .line 15
    if-eq p1, p2, :cond_0

    .line 16
    .line 17
    iget p2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->c:I

    .line 18
    .line 19
    if-eq p2, p1, :cond_0

    .line 20
    .line 21
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->c:I

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->i()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final g(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p1, v0, p2}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->f(Landroidx/recyclerview/widget/RecyclerView;FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final h(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->m:Landroid/widget/OverScroller;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/widget/OverScroller;

    .line 6
    .line 7
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 8
    .line 9
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->m:Landroid/widget/OverScroller;

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final i()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k:Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    iget v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->b:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-eq v0, v1, :cond_a

    .line 10
    .line 11
    iget v2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->c:I

    .line 12
    .line 13
    if-ne v2, v1, :cond_1

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_1
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->b:I

    .line 21
    .line 22
    iget v3, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->c:I

    .line 23
    .line 24
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-gez v0, :cond_2

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    iget v3, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->i:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eq v3, v1, :cond_7

    .line 35
    .line 36
    iget v5, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->j:I

    .line 37
    .line 38
    if-ne v5, v1, :cond_3

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    const/4 v1, 0x0

    .line 42
    if-le v0, v3, :cond_4

    .line 43
    .line 44
    iget-object v5, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k:Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;

    .line 45
    .line 46
    add-int/lit8 v6, v0, -0x1

    .line 47
    .line 48
    invoke-interface {v5, v3, v6, v1}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;->b(IIZ)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    if-ge v0, v3, :cond_5

    .line 53
    .line 54
    iget-object v5, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k:Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;

    .line 55
    .line 56
    sub-int/2addr v3, v4

    .line 57
    invoke-interface {v5, v0, v3, v4}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;->b(IIZ)V

    .line 58
    .line 59
    .line 60
    :cond_5
    :goto_0
    iget v3, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->j:I

    .line 61
    .line 62
    if-le v2, v3, :cond_6

    .line 63
    .line 64
    iget-object v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k:Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;

    .line 65
    .line 66
    add-int/2addr v3, v4

    .line 67
    invoke-interface {v1, v3, v2, v4}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;->b(IIZ)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_6
    if-ge v2, v3, :cond_9

    .line 72
    .line 73
    iget-object v4, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k:Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;

    .line 74
    .line 75
    add-int/lit8 v5, v2, 0x1

    .line 76
    .line 77
    invoke-interface {v4, v5, v3, v1}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;->b(IIZ)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_7
    :goto_1
    sub-int v1, v2, v0

    .line 82
    .line 83
    if-ne v1, v4, :cond_8

    .line 84
    .line 85
    iget-object v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k:Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;

    .line 86
    .line 87
    invoke-interface {v1, v0, v0, v4}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;->b(IIZ)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_8
    iget-object v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k:Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;

    .line 92
    .line 93
    invoke-interface {v1, v0, v2, v4}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;->b(IIZ)V

    .line 94
    .line 95
    .line 96
    :cond_9
    :goto_2
    iput v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->i:I

    .line 97
    .line 98
    iput v2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->j:I

    .line 99
    .line 100
    :cond_a
    :goto_3
    return-void
.end method

.method public final j(Landroid/view/MotionEvent;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    float-to-int v0, v0

    .line 6
    iget v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->o:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    iget v3, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->p:I

    .line 12
    .line 13
    if-gt v0, v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->g:F

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->h:F

    .line 26
    .line 27
    iget p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->p:I

    .line 28
    .line 29
    int-to-float v1, p1

    .line 30
    iget v3, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->o:I

    .line 31
    .line 32
    int-to-float v4, v3

    .line 33
    sub-float/2addr v1, v4

    .line 34
    int-to-float v0, v0

    .line 35
    int-to-float v4, v3

    .line 36
    sub-float/2addr v0, v4

    .line 37
    sub-float/2addr v1, v0

    .line 38
    int-to-float p1, p1

    .line 39
    int-to-float v0, v3

    .line 40
    sub-float/2addr p1, v0

    .line 41
    div-float/2addr v1, p1

    .line 42
    iget p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->s:I

    .line 43
    .line 44
    int-to-float p1, p1

    .line 45
    mul-float/2addr p1, v1

    .line 46
    const/high16 v0, -0x40800000    # -1.0f

    .line 47
    .line 48
    mul-float/2addr p1, v0

    .line 49
    float-to-int p1, p1

    .line 50
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->f:I

    .line 51
    .line 52
    iget-boolean p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->d:Z

    .line 53
    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    iput-boolean v2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->d:Z

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->o()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    iget-boolean v3, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->w:Z

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    if-ge v0, v1, :cond_1

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iput v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->g:F

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->h:F

    .line 79
    .line 80
    iget p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->s:I

    .line 81
    .line 82
    mul-int/lit8 p1, p1, -0x1

    .line 83
    .line 84
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->f:I

    .line 85
    .line 86
    iget-boolean p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->d:Z

    .line 87
    .line 88
    if-nez p1, :cond_3

    .line 89
    .line 90
    iput-boolean v2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->d:Z

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->o()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_1
    iget v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->q:I

    .line 97
    .line 98
    if-lt v0, v1, :cond_2

    .line 99
    .line 100
    iget v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->r:I

    .line 101
    .line 102
    if-gt v0, v1, :cond_2

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    iput v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->g:F

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->h:F

    .line 115
    .line 116
    int-to-float p1, v0

    .line 117
    iget v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->q:I

    .line 118
    .line 119
    int-to-float v1, v0

    .line 120
    sub-float/2addr p1, v1

    .line 121
    iget v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->r:I

    .line 122
    .line 123
    int-to-float v1, v1

    .line 124
    int-to-float v0, v0

    .line 125
    sub-float/2addr v1, v0

    .line 126
    div-float/2addr p1, v1

    .line 127
    iget v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->s:I

    .line 128
    .line 129
    int-to-float v0, v0

    .line 130
    mul-float/2addr v0, p1

    .line 131
    float-to-int p1, v0

    .line 132
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->f:I

    .line 133
    .line 134
    iget-boolean p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->e:Z

    .line 135
    .line 136
    if-nez p1, :cond_3

    .line 137
    .line 138
    iput-boolean v2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->e:Z

    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->o()V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_2
    iget-boolean v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->x:Z

    .line 145
    .line 146
    if-eqz v1, :cond_4

    .line 147
    .line 148
    iget v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->r:I

    .line 149
    .line 150
    if-le v0, v1, :cond_4

    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    iput v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->g:F

    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->h:F

    .line 163
    .line 164
    iget p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->s:I

    .line 165
    .line 166
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->f:I

    .line 167
    .line 168
    iget-boolean p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->d:Z

    .line 169
    .line 170
    if-nez p1, :cond_3

    .line 171
    .line 172
    iput-boolean v2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->d:Z

    .line 173
    .line 174
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->o()V

    .line 175
    .line 176
    .line 177
    :cond_3
    return-void

    .line 178
    :cond_4
    const/4 p1, 0x0

    .line 179
    iput-boolean p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->e:Z

    .line 180
    .line 181
    iput-boolean p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->d:Z

    .line 182
    .line 183
    const/4 p1, 0x1

    .line 184
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->g:F

    .line 185
    .line 186
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->h:F

    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->q()V

    .line 189
    .line 190
    .line 191
    return-void
.end method

.method public final k()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->m(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k:Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    instance-of v2, v1, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$b;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$b;

    .line 14
    .line 15
    iget v2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->c:I

    .line 16
    .line 17
    invoke-interface {v1, v2}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$b;->c(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v1, -0x1

    .line 21
    iput v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->b:I

    .line 22
    .line 23
    iput v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->c:I

    .line 24
    .line 25
    iput v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->i:I

    .line 26
    .line 27
    iput v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->j:I

    .line 28
    .line 29
    iput-boolean v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->d:Z

    .line 30
    .line 31
    iput-boolean v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->e:Z

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    iput v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->g:F

    .line 35
    .line 36
    iput v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->h:F

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->q()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final l(I)V
    .locals 2

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->s:I

    .line 4
    .line 5
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->s:I

    .line 11
    .line 12
    neg-int v0, v0

    .line 13
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    :goto_0
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 21
    .line 22
    .line 23
    iget p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->g:F

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    cmpl-float v1, p1, v0

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->h:F

    .line 31
    .line 32
    cmpl-float v0, v1, v0

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    invoke-virtual {p0, v0, p1, v1}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->f(Landroidx/recyclerview/widget/RecyclerView;FF)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public m(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->a:Z

    .line 2
    .line 3
    return-void
.end method

.method public n(I)Lcom/luck/picture/lib/widget/SlideSelectTouchListener;
    .locals 0

    .line 1
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->y:I

    .line 2
    .line 3
    return-object p0
.end method

.method public o()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->h(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->m:Landroid/widget/OverScroller;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->n:Ljava/lang/Runnable;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->m:Landroid/widget/OverScroller;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrY()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/16 v6, 0x1388

    .line 35
    .line 36
    const v7, 0x186a0

    .line 37
    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    invoke-virtual/range {v2 .. v7}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->n:Ljava/lang/Runnable;

    .line 47
    .line 48
    invoke-static {v0, v1}, Landroidx/core/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void
.end method

.method public onInterceptTouchEvent(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x5

    .line 29
    if-eq p2, v0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k()V

    .line 33
    .line 34
    .line 35
    :goto_0
    iput-object p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget p2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->u:I

    .line 42
    .line 43
    iput p2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->o:I

    .line 44
    .line 45
    iget v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->t:I

    .line 46
    .line 47
    add-int/2addr p2, v0

    .line 48
    iput p2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->p:I

    .line 49
    .line 50
    iget p2, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->v:I

    .line 51
    .line 52
    add-int v1, p1, p2

    .line 53
    .line 54
    sub-int/2addr v1, v0

    .line 55
    iput v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->q:I

    .line 56
    .line 57
    add-int/2addr p1, p2

    .line 58
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->r:I

    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    return p1

    .line 62
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 63
    return p1
.end method

.method public onRequestDisallowInterceptTouchEvent(Z)V
    .locals 0

    return-void
.end method

.method public onTouchEvent(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    if-eq v0, p1, :cond_3

    .line 21
    .line 22
    const/4 p1, 0x6

    .line 23
    if-eq v0, p1, :cond_3

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-boolean v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->d:Z

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iget-boolean v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->e:Z

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p1, p2}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->g(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0, p2}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->j(Landroid/view/MotionEvent;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public p(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->m(Z)V

    .line 3
    .line 4
    .line 5
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->b:I

    .line 6
    .line 7
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->c:I

    .line 8
    .line 9
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->i:I

    .line 10
    .line 11
    iput p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->j:I

    .line 12
    .line 13
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k:Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    instance-of v1, v0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$b;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    check-cast v0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$b;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Lcom/luck/picture/lib/widget/SlideSelectTouchListener$b;->a(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public q()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->m:Landroid/widget/OverScroller;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->n:Ljava/lang/Runnable;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->m:Landroid/widget/OverScroller;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public r(Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;)Lcom/luck/picture/lib/widget/SlideSelectTouchListener;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/widget/SlideSelectTouchListener;->k:Lcom/luck/picture/lib/widget/SlideSelectTouchListener$c;

    .line 2
    .line 3
    return-object p0
.end method
