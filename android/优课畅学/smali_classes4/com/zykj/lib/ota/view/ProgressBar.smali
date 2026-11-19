.class public Lcom/zykj/lib/ota/view/ProgressBar;
.super Landroid/widget/ProgressBar;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/lib/ota/view/ProgressBar$a;,
        Lcom/zykj/lib/ota/view/ProgressBar$Mode;,
        Lcom/zykj/lib/ota/view/ProgressBar$b;
    }
.end annotation


# static fields
.field public static final t:Lcom/zykj/lib/ota/view/ProgressBar$a;

.field public static final u:Ljava/lang/String;


# instance fields
.field public a:Landroid/graphics/Paint;

.field public b:Lcom/zykj/lib/ota/view/ProgressBar$Mode;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:Landroid/graphics/RectF;

.field public final r:Landroid/graphics/Rect;

.field public s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/lib/ota/view/ProgressBar$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/lib/ota/view/ProgressBar$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/lib/ota/view/ProgressBar;->t:Lcom/zykj/lib/ota/view/ProgressBar$a;

    .line 8
    .line 9
    const-class v0, Landroid/widget/ProgressBar;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/zykj/lib/ota/view/ProgressBar;->u:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const v0, 0x1010077

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 13
    .line 14
    sget-object v0, Lcom/zykj/lib/ota/view/ProgressBar$Mode;->a:Lcom/zykj/lib/ota/view/ProgressBar$Mode;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->b:Lcom/zykj/lib/ota/view/ProgressBar$Mode;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->r:Landroid/graphics/Rect;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/zykj/lib/ota/view/ProgressBar;->d(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, Lcom/zykj/lib/ota/view/ProgressBar;->c(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->g:I

    .line 34
    .line 35
    iget p2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->i:I

    .line 36
    .line 37
    invoke-static {p1, p2}, Ld8/h;->e(II)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iput p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->n:I

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    sget-object v0, Lkotlin/jvm/internal/c0;->a:Lkotlin/jvm/internal/c0;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    mul-float/2addr v0, v1

    .line 11
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    div-float/2addr v0, v1

    .line 17
    const/16 v1, 0x64

    .line 18
    .line 19
    int-to-float v1, v1

    .line 20
    mul-float/2addr v0, v1

    .line 21
    float-to-int v0, v0

    .line 22
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "%d"

    .line 36
    .line 37
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "format(...)"

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, "%"

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->s:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 66
    .line 67
    iget v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->d:I

    .line 68
    .line 69
    int-to-float v1, v1

    .line 70
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 74
    .line 75
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->s:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    iget-object v3, p0, Lcom/zykj/lib/ota/view/ProgressBar;->r:Landroid/graphics/Rect;

    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->r:Landroid/graphics/Rect;

    .line 98
    .line 99
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iput v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->p:I

    .line 104
    .line 105
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->r:Landroid/graphics/Rect;

    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    iput v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->o:I

    .line 112
    .line 113
    return-void
.end method

.method public final b(ILandroid/content/res/TypedArray;)V
    .locals 1

    .line 1
    sget v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar_pb_mode:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/lib/ota/view/ProgressBar$Mode;->a:Lcom/zykj/lib/ota/view/ProgressBar$Mode;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {}, Lcom/zykj/lib/ota/view/ProgressBar$Mode;->values()[Lcom/zykj/lib/ota/view/ProgressBar$Mode;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    aget-object p1, p2, p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->b:Lcom/zykj/lib/ota/view/ProgressBar$Mode;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    sget v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar_pb_textColor:I

    .line 25
    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->c:I

    .line 29
    .line 30
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->c:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    sget v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar_pb_textSize:I

    .line 38
    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->d:I

    .line 42
    .line 43
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iput p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->d:I

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    sget v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar_pb_textMargin:I

    .line 51
    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->e:I

    .line 55
    .line 56
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iput p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->e:I

    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    sget v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar_pb_reachedColor:I

    .line 64
    .line 65
    if-ne p1, v0, :cond_4

    .line 66
    .line 67
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->f:I

    .line 68
    .line 69
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    iput p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->f:I

    .line 74
    .line 75
    return-void

    .line 76
    :cond_4
    sget v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar_pb_reachedHeight:I

    .line 77
    .line 78
    if-ne p1, v0, :cond_5

    .line 79
    .line 80
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->g:I

    .line 81
    .line 82
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    iput p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->g:I

    .line 87
    .line 88
    return-void

    .line 89
    :cond_5
    sget v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar_pb_unReachedColor:I

    .line 90
    .line 91
    if-ne p1, v0, :cond_6

    .line 92
    .line 93
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->h:I

    .line 94
    .line 95
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    iput p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->h:I

    .line 100
    .line 101
    return-void

    .line 102
    :cond_6
    sget v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar_pb_unReachedHeight:I

    .line 103
    .line 104
    if-ne p1, v0, :cond_7

    .line 105
    .line 106
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->i:I

    .line 107
    .line 108
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    iput p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->i:I

    .line 113
    .line 114
    return-void

    .line 115
    :cond_7
    sget v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar_pb_isCapRounded:I

    .line 116
    .line 117
    if-ne p1, v0, :cond_8

    .line 118
    .line 119
    iget-boolean v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->j:Z

    .line 120
    .line 121
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    iput-boolean p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->j:Z

    .line 126
    .line 127
    if-eqz p1, :cond_a

    .line 128
    .line 129
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 130
    .line 131
    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_8
    sget v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar_pb_isHiddenText:I

    .line 138
    .line 139
    if-ne p1, v0, :cond_9

    .line 140
    .line 141
    iget-boolean v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->k:Z

    .line 142
    .line 143
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    iput-boolean p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->k:Z

    .line 148
    .line 149
    return-void

    .line 150
    :cond_9
    sget v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar_pb_radius:I

    .line 151
    .line 152
    if-ne p1, v0, :cond_a

    .line 153
    .line 154
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->l:I

    .line 155
    .line 156
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    iput p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->l:I

    .line 161
    .line 162
    :cond_a
    return-void
.end method

.method public final c(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/lib/ota/R$styleable;->ProgressBar:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string p2, "obtainStyledAttributes(...)"

    .line 8
    .line 9
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-ge v0, p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0, v1, p1}, Lcom/zykj/lib/ota/view/ProgressBar;->b(ILandroid/content/res/TypedArray;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final d(Landroid/content/Context;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 5
    .line 6
    .line 7
    const-string v0, "#70A800"

    .line 8
    .line 9
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iput v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->c:I

    .line 14
    .line 15
    sget-object v1, Lcom/zykj/lib/ota/view/ProgressBar;->t:Lcom/zykj/lib/ota/view/ProgressBar$a;

    .line 16
    .line 17
    const/high16 v2, 0x41200000    # 10.0f

    .line 18
    .line 19
    invoke-virtual {v1, p1, v2}, Lcom/zykj/lib/ota/view/ProgressBar$a;->b(Landroid/content/Context;F)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iput v2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->d:I

    .line 24
    .line 25
    const/high16 v2, 0x40800000    # 4.0f

    .line 26
    .line 27
    invoke-virtual {v1, p1, v2}, Lcom/zykj/lib/ota/view/ProgressBar$a;->a(Landroid/content/Context;F)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iput v2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->e:I

    .line 32
    .line 33
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->f:I

    .line 38
    .line 39
    const/high16 v0, 0x40000000    # 2.0f

    .line 40
    .line 41
    invoke-virtual {v1, p1, v0}, Lcom/zykj/lib/ota/view/ProgressBar$a;->a(Landroid/content/Context;F)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iput v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->g:I

    .line 46
    .line 47
    const-string v0, "#CCCCCC"

    .line 48
    .line 49
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iput v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->h:I

    .line 54
    .line 55
    const/high16 v0, 0x3f800000    # 1.0f

    .line 56
    .line 57
    invoke-virtual {v1, p1, v0}, Lcom/zykj/lib/ota/view/ProgressBar$a;->a(Landroid/content/Context;F)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iput v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->i:I

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    iput-boolean v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->j:Z

    .line 65
    .line 66
    iput-boolean v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->k:Z

    .line 67
    .line 68
    const/high16 v0, 0x41800000    # 16.0f

    .line 69
    .line 70
    invoke-virtual {v1, p1, v0}, Lcom/zykj/lib/ota/view/ProgressBar$a;->a(Landroid/content/Context;F)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    iput p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->l:I

    .line 75
    .line 76
    return-void
.end method

.method public final e(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->n:I

    .line 9
    .line 10
    div-int/lit8 v1, v1, 0x2

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    int-to-float v0, v0

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget v2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->n:I

    .line 19
    .line 20
    div-int/lit8 v2, v2, 0x2

    .line 21
    .line 22
    add-int/2addr v1, v2

    .line 23
    int-to-float v1, v1

    .line 24
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 28
    .line 29
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 35
    .line 36
    iget v2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->h:I

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 42
    .line 43
    iget v2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->i:I

    .line 44
    .line 45
    int-to-float v2, v2

    .line 46
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 47
    .line 48
    .line 49
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->l:I

    .line 50
    .line 51
    int-to-float v2, v0

    .line 52
    int-to-float v3, v0

    .line 53
    int-to-float v0, v0

    .line 54
    iget-object v4, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 55
    .line 56
    invoke-virtual {p1, v2, v3, v0, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 65
    .line 66
    iget v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->f:I

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 72
    .line 73
    iget v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->g:I

    .line 74
    .line 75
    int-to-float v1, v1

    .line 76
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    int-to-float v0, v0

    .line 84
    const/high16 v1, 0x3f800000    # 1.0f

    .line 85
    .line 86
    mul-float/2addr v0, v1

    .line 87
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    int-to-float v1, v1

    .line 92
    div-float/2addr v0, v1

    .line 93
    const/16 v1, 0x168

    .line 94
    .line 95
    int-to-float v1, v1

    .line 96
    mul-float v5, v0, v1

    .line 97
    .line 98
    iget-object v3, p0, Lcom/zykj/lib/ota/view/ProgressBar;->q:Landroid/graphics/RectF;

    .line 99
    .line 100
    if-eqz v3, :cond_0

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    iget-object v7, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 104
    .line 105
    const/high16 v4, -0x3d4c0000    # -90.0f

    .line 106
    .line 107
    move-object v2, p1

    .line 108
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_0
    move-object v2, p1

    .line 113
    :goto_0
    iget-boolean p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->k:Z

    .line 114
    .line 115
    if-nez p1, :cond_1

    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/zykj/lib/ota/view/ProgressBar;->a()V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 121
    .line 122
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 128
    .line 129
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->c:I

    .line 130
    .line 131
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 135
    .line 136
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 137
    .line 138
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->s:Ljava/lang/String;

    .line 142
    .line 143
    if-eqz p1, :cond_1

    .line 144
    .line 145
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->l:I

    .line 146
    .line 147
    int-to-float v1, v0

    .line 148
    iget v3, p0, Lcom/zykj/lib/ota/view/ProgressBar;->o:I

    .line 149
    .line 150
    div-int/lit8 v3, v3, 0x2

    .line 151
    .line 152
    add-int/2addr v0, v3

    .line 153
    int-to-float v0, v0

    .line 154
    iget-object v3, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 155
    .line 156
    invoke-virtual {v2, p1, v1, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 157
    .line 158
    .line 159
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public final f(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    int-to-float v0, v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x2

    .line 14
    div-int/2addr v1, v2

    .line 15
    int-to-float v1, v1

    .line 16
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-float v0, v0

    .line 24
    const/high16 v1, 0x3f800000    # 1.0f

    .line 25
    .line 26
    mul-float/2addr v0, v1

    .line 27
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    int-to-float v3, v3

    .line 32
    div-float/2addr v0, v3

    .line 33
    iget v3, p0, Lcom/zykj/lib/ota/view/ProgressBar;->m:I

    .line 34
    .line 35
    int-to-float v4, v3

    .line 36
    mul-float/2addr v0, v4

    .line 37
    iget-boolean v4, p0, Lcom/zykj/lib/ota/view/ProgressBar;->k:Z

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    int-to-float v4, v3

    .line 43
    cmpl-float v4, v0, v4

    .line 44
    .line 45
    if-lez v4, :cond_0

    .line 46
    .line 47
    int-to-float v0, v3

    .line 48
    :cond_0
    move v9, v0

    .line 49
    cmpl-float v0, v9, v5

    .line 50
    .line 51
    if-lez v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 54
    .line 55
    iget v3, p0, Lcom/zykj/lib/ota/view/ProgressBar;->f:I

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 61
    .line 62
    iget v3, p0, Lcom/zykj/lib/ota/view/ProgressBar;->g:I

    .line 63
    .line 64
    int-to-float v3, v3

    .line 65
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 69
    .line 70
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 73
    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    iget-object v11, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    const/4 v8, 0x0

    .line 80
    move-object v6, p1

    .line 81
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 82
    .line 83
    .line 84
    move-object v3, v6

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    move-object v3, p1

    .line 87
    :goto_0
    iget-boolean p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->j:Z

    .line 88
    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    iget p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->g:I

    .line 92
    .line 93
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->i:I

    .line 94
    .line 95
    add-int/2addr p1, v0

    .line 96
    int-to-float p1, p1

    .line 97
    mul-float/2addr p1, v1

    .line 98
    int-to-float v0, v2

    .line 99
    div-float/2addr p1, v0

    .line 100
    add-float/2addr v9, p1

    .line 101
    :cond_2
    move v4, v9

    .line 102
    iget p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->m:I

    .line 103
    .line 104
    int-to-float p1, p1

    .line 105
    cmpg-float p1, v4, p1

    .line 106
    .line 107
    if-gez p1, :cond_8

    .line 108
    .line 109
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 110
    .line 111
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->h:I

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 117
    .line 118
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->i:I

    .line 119
    .line 120
    int-to-float v0, v0

    .line 121
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 125
    .line 126
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 129
    .line 130
    .line 131
    iget p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->m:I

    .line 132
    .line 133
    int-to-float v6, p1

    .line 134
    const/4 v7, 0x0

    .line 135
    iget-object v8, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_2

    .line 142
    .line 143
    :cond_3
    move-object v3, p1

    .line 144
    invoke-virtual {p0}, Lcom/zykj/lib/ota/view/ProgressBar;->a()V

    .line 145
    .line 146
    .line 147
    iget p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->m:I

    .line 148
    .line 149
    iget v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->p:I

    .line 150
    .line 151
    sub-int/2addr p1, v1

    .line 152
    iget v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->e:I

    .line 153
    .line 154
    sub-int/2addr p1, v1

    .line 155
    int-to-float p1, p1

    .line 156
    cmpl-float v1, v0, p1

    .line 157
    .line 158
    if-lez v1, :cond_4

    .line 159
    .line 160
    move v6, p1

    .line 161
    goto :goto_1

    .line 162
    :cond_4
    move v6, v0

    .line 163
    :goto_1
    cmpl-float p1, v6, v5

    .line 164
    .line 165
    if-lez p1, :cond_5

    .line 166
    .line 167
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 168
    .line 169
    iget v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->f:I

    .line 170
    .line 171
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 175
    .line 176
    iget v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->g:I

    .line 177
    .line 178
    int-to-float v1, v1

    .line 179
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 183
    .line 184
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 187
    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    iget-object v8, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 191
    .line 192
    const/4 v4, 0x0

    .line 193
    const/4 v5, 0x0

    .line 194
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 195
    .line 196
    .line 197
    :cond_5
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 198
    .line 199
    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    .line 200
    .line 201
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 205
    .line 206
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 207
    .line 208
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 209
    .line 210
    .line 211
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 212
    .line 213
    iget v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->c:I

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 216
    .line 217
    .line 218
    if-lez p1, :cond_6

    .line 219
    .line 220
    iget p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->e:I

    .line 221
    .line 222
    int-to-float p1, p1

    .line 223
    add-float/2addr v6, p1

    .line 224
    :cond_6
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->s:Ljava/lang/String;

    .line 225
    .line 226
    if-eqz p1, :cond_7

    .line 227
    .line 228
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->o:I

    .line 229
    .line 230
    div-int/2addr v0, v2

    .line 231
    int-to-float v0, v0

    .line 232
    iget-object v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 233
    .line 234
    invoke-virtual {v3, p1, v6, v0, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 235
    .line 236
    .line 237
    :cond_7
    iget p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->p:I

    .line 238
    .line 239
    int-to-float p1, p1

    .line 240
    add-float/2addr v6, p1

    .line 241
    iget p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->e:I

    .line 242
    .line 243
    int-to-float p1, p1

    .line 244
    add-float v4, v6, p1

    .line 245
    .line 246
    iget p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->m:I

    .line 247
    .line 248
    int-to-float p1, p1

    .line 249
    cmpg-float p1, v4, p1

    .line 250
    .line 251
    if-gez p1, :cond_8

    .line 252
    .line 253
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 254
    .line 255
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->h:I

    .line 256
    .line 257
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 258
    .line 259
    .line 260
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 261
    .line 262
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->i:I

    .line 263
    .line 264
    int-to-float v0, v0

    .line 265
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 266
    .line 267
    .line 268
    iget-object p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 269
    .line 270
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 271
    .line 272
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 273
    .line 274
    .line 275
    iget p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->m:I

    .line 276
    .line 277
    int-to-float v6, p1

    .line 278
    const/4 v7, 0x0

    .line 279
    iget-object v8, p0, Lcom/zykj/lib/ota/view/ProgressBar;->a:Landroid/graphics/Paint;

    .line 280
    .line 281
    const/4 v5, 0x0

    .line 282
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 283
    .line 284
    .line 285
    :cond_8
    :goto_2
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    .line 286
    .line 287
    .line 288
    return-void
.end method

.method public declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "canvas"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->b:Lcom/zykj/lib/ota/view/ProgressBar$Mode;

    .line 8
    .line 9
    sget-object v1, Lcom/zykj/lib/ota/view/ProgressBar$b;->a:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_4

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    if-eq v0, v1, :cond_3

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    if-eq v0, v1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x5

    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->onDraw(Landroid/graphics/Canvas;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 39
    .line 40
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->onDraw(Landroid/graphics/Canvas;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/lib/ota/view/ProgressBar;->e(Landroid/graphics/Canvas;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-virtual {p0, p1}, Lcom/zykj/lib/ota/view/ProgressBar;->f(Landroid/graphics/Canvas;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->onDraw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    :goto_0
    monitor-exit p0

    .line 60
    return-void

    .line 61
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    throw p1
.end method

.method public declared-synchronized onMeasure(II)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->b:Lcom/zykj/lib/ota/view/ProgressBar$Mode;

    .line 3
    .line 4
    sget-object v1, Lcom/zykj/lib/ota/view/ProgressBar$b;->a:[I

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    aget v0, v1, v0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eq v0, v1, :cond_6

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    if-eq v0, v1, :cond_4

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    if-eq v0, v2, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    invoke-super {p0, p1, p2}, Landroid/widget/ProgressBar;->onMeasure(II)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 36
    .line 37
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/ProgressBar;->onMeasure(II)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_2
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->l:I

    .line 47
    .line 48
    mul-int/2addr v0, v1

    .line 49
    iget v2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->n:I

    .line 50
    .line 51
    add-int/2addr v0, v2

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/2addr v0, v2

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    add-int/2addr v0, v2

    .line 62
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    invoke-static {p1, p2}, Ld8/h;->h(II)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    sub-int p2, p1, p2

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    sub-int/2addr p2, v0

    .line 85
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->n:I

    .line 86
    .line 87
    sub-int/2addr p2, v0

    .line 88
    div-int/2addr p2, v1

    .line 89
    iput p2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->l:I

    .line 90
    .line 91
    iget-object p2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->q:Landroid/graphics/RectF;

    .line 92
    .line 93
    if-nez p2, :cond_3

    .line 94
    .line 95
    new-instance p2, Landroid/graphics/RectF;

    .line 96
    .line 97
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->q:Landroid/graphics/RectF;

    .line 101
    .line 102
    :cond_3
    iget-object p2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->q:Landroid/graphics/RectF;

    .line 103
    .line 104
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget v0, p0, Lcom/zykj/lib/ota/view/ProgressBar;->l:I

    .line 108
    .line 109
    mul-int/lit8 v2, v0, 0x2

    .line 110
    .line 111
    int-to-float v2, v2

    .line 112
    mul-int/2addr v0, v1

    .line 113
    int-to-float v0, v0

    .line 114
    const/4 v1, 0x0

    .line 115
    invoke-virtual {p2, v1, v1, v2, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/lib/ota/view/ProgressBar;->a()V

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    add-int/2addr v0, v1

    .line 138
    iget-boolean v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->k:Z

    .line 139
    .line 140
    if-eqz v1, :cond_5

    .line 141
    .line 142
    iget v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->g:I

    .line 143
    .line 144
    iget v2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->i:I

    .line 145
    .line 146
    invoke-static {v1, v2}, Ld8/h;->e(II)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    goto :goto_0

    .line 151
    :cond_5
    iget v1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->o:I

    .line 152
    .line 153
    iget v2, p0, Lcom/zykj/lib/ota/view/ProgressBar;->g:I

    .line 154
    .line 155
    iget v3, p0, Lcom/zykj/lib/ota/view/ProgressBar;->i:I

    .line 156
    .line 157
    invoke-static {v2, v3}, Ld8/h;->e(II)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    invoke-static {v1, v2}, Ld8/h;->e(II)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    :goto_0
    add-int/2addr v0, v1

    .line 166
    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    sub-int/2addr p1, p2

    .line 182
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    sub-int/2addr p1, p2

    .line 187
    iput p1, p0, Lcom/zykj/lib/ota/view/ProgressBar;->m:I

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_6
    invoke-super {p0, p1, p2}, Landroid/widget/ProgressBar;->onMeasure(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    .line 192
    .line 193
    :goto_1
    monitor-exit p0

    .line 194
    return-void

    .line 195
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    throw p1
.end method
