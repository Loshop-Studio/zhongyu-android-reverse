.class public Landroidx/constraintlayout/helper/widget/MotionEffect;
.super Landroidx/constraintlayout/motion/widget/MotionHelper;
.source "SourceFile"


# static fields
.field public static final AUTO:I = -0x1

.field public static final EAST:I = 0x2

.field public static final NORTH:I = 0x0

.field public static final SOUTH:I = 0x1

.field public static final TAG:Ljava/lang/String; = "FadeMove"

.field private static final UNSET:I = -0x1

.field public static final WEST:I = 0x3


# instance fields
.field private mFadeMove:I

.field private mMotionEffectAlpha:F

.field private mMotionEffectEnd:I

.field private mMotionEffectStart:I

.field private mMotionEffectStrictMove:Z

.field private mMotionEffectTranslationX:I

.field private mMotionEffectTranslationY:I

.field private mViewTransitionId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;-><init>(Landroid/content/Context;)V

    const p1, 0x3dcccccd    # 0.1f

    .line 2
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectAlpha:F

    const/16 p1, 0x31

    .line 3
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStart:I

    const/16 p1, 0x32

    .line 4
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationX:I

    .line 6
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationY:I

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStrictMove:Z

    const/4 p1, -0x1

    .line 8
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mViewTransitionId:I

    .line 9
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mFadeMove:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 10
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/motion/widget/MotionHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const v0, 0x3dcccccd    # 0.1f

    .line 11
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectAlpha:F

    const/16 v0, 0x31

    .line 12
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStart:I

    const/16 v0, 0x32

    .line 13
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    const/4 v0, 0x0

    .line 14
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationX:I

    .line 15
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationY:I

    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStrictMove:Z

    const/4 v0, -0x1

    .line 17
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mViewTransitionId:I

    .line 18
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mFadeMove:I

    .line 19
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/helper/widget/MotionEffect;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/motion/widget/MotionHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p3, 0x3dcccccd    # 0.1f

    .line 21
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectAlpha:F

    const/16 p3, 0x31

    .line 22
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStart:I

    const/16 p3, 0x32

    .line 23
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    const/4 p3, 0x0

    .line 24
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationX:I

    .line 25
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationY:I

    const/4 p3, 0x1

    .line 26
    iput-boolean p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStrictMove:Z

    const/4 p3, -0x1

    .line 27
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mViewTransitionId:I

    .line 28
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mFadeMove:I

    .line 29
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/helper/widget/MotionEffect;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    if-eqz p2, :cond_b

    .line 2
    .line 3
    sget-object v0, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect:[I

    .line 4
    .line 5
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v0, 0x0

    .line 14
    move v1, v0

    .line 15
    :goto_0
    if-ge v1, p2, :cond_8

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_start:I

    .line 22
    .line 23
    const/16 v4, 0x63

    .line 24
    .line 25
    if-ne v2, v3, :cond_0

    .line 26
    .line 27
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStart:I

    .line 28
    .line 29
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStart:I

    .line 34
    .line 35
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStart:I

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_end:I

    .line 47
    .line 48
    if-ne v2, v3, :cond_1

    .line 49
    .line 50
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    .line 51
    .line 52
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    .line 57
    .line 58
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_translationX:I

    .line 70
    .line 71
    if-ne v2, v3, :cond_2

    .line 72
    .line 73
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationX:I

    .line 74
    .line 75
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationX:I

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_translationY:I

    .line 83
    .line 84
    if-ne v2, v3, :cond_3

    .line 85
    .line 86
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationY:I

    .line 87
    .line 88
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationY:I

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_alpha:I

    .line 96
    .line 97
    if-ne v2, v3, :cond_4

    .line 98
    .line 99
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectAlpha:F

    .line 100
    .line 101
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectAlpha:F

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_move:I

    .line 109
    .line 110
    if-ne v2, v3, :cond_5

    .line 111
    .line 112
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mFadeMove:I

    .line 113
    .line 114
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mFadeMove:I

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_5
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_strict:I

    .line 122
    .line 123
    if-ne v2, v3, :cond_6

    .line 124
    .line 125
    iget-boolean v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStrictMove:Z

    .line 126
    .line 127
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    iput-boolean v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStrictMove:Z

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionEffect_motionEffect_viewTransition:I

    .line 135
    .line 136
    if-ne v2, v3, :cond_7

    .line 137
    .line 138
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mViewTransitionId:I

    .line 139
    .line 140
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mViewTransitionId:I

    .line 145
    .line 146
    :cond_7
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_8
    iget p2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStart:I

    .line 151
    .line 152
    iget v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    .line 153
    .line 154
    if-ne p2, v0, :cond_a

    .line 155
    .line 156
    if-lez p2, :cond_9

    .line 157
    .line 158
    add-int/lit8 p2, p2, -0x1

    .line 159
    .line 160
    iput p2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStart:I

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_9
    add-int/lit8 v0, v0, 0x1

    .line 164
    .line 165
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    .line 166
    .line 167
    :cond_a
    :goto_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 168
    .line 169
    .line 170
    :cond_b
    return-void
.end method


# virtual methods
.method public isDecorator()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onPreSetup(Landroidx/constraintlayout/motion/widget/MotionLayout;Ljava/util/HashMap;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/motion/widget/MotionLayout;",
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "Landroidx/constraintlayout/motion/widget/MotionController;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const/4 v4, 0x1

    .line 11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    .line 21
    invoke-virtual {v0, v6}, Landroidx/constraintlayout/widget/ConstraintHelper;->getViews(Landroidx/constraintlayout/widget/ConstraintLayout;)[Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    invoke-static {}, Landroidx/constraintlayout/motion/widget/Debug;->getLoc()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v7, Landroidx/constraintlayout/motion/widget/KeyAttributes;

    .line 32
    .line 33
    invoke-direct {v7}, Landroidx/constraintlayout/motion/widget/KeyAttributes;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v8, Landroidx/constraintlayout/motion/widget/KeyAttributes;

    .line 37
    .line 38
    invoke-direct {v8}, Landroidx/constraintlayout/motion/widget/KeyAttributes;-><init>()V

    .line 39
    .line 40
    .line 41
    iget v9, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectAlpha:F

    .line 42
    .line 43
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    const-string v10, "alpha"

    .line 48
    .line 49
    invoke-virtual {v7, v10, v9}, Landroidx/constraintlayout/motion/widget/KeyAttributes;->setValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget v9, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectAlpha:F

    .line 53
    .line 54
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-virtual {v8, v10, v9}, Landroidx/constraintlayout/motion/widget/KeyAttributes;->setValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget v9, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStart:I

    .line 62
    .line 63
    invoke-virtual {v7, v9}, Landroidx/constraintlayout/motion/widget/Key;->setFramePosition(I)V

    .line 64
    .line 65
    .line 66
    iget v9, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    .line 67
    .line 68
    invoke-virtual {v8, v9}, Landroidx/constraintlayout/motion/widget/Key;->setFramePosition(I)V

    .line 69
    .line 70
    .line 71
    new-instance v9, Landroidx/constraintlayout/motion/widget/KeyPosition;

    .line 72
    .line 73
    invoke-direct {v9}, Landroidx/constraintlayout/motion/widget/KeyPosition;-><init>()V

    .line 74
    .line 75
    .line 76
    iget v10, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStart:I

    .line 77
    .line 78
    invoke-virtual {v9, v10}, Landroidx/constraintlayout/motion/widget/Key;->setFramePosition(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9, v2}, Landroidx/constraintlayout/motion/widget/KeyPosition;->setType(I)V

    .line 82
    .line 83
    .line 84
    const-string/jumbo v10, "percentX"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9, v10, v3}, Landroidx/constraintlayout/motion/widget/KeyPosition;->setValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const-string/jumbo v11, "percentY"

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9, v11, v3}, Landroidx/constraintlayout/motion/widget/KeyPosition;->setValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    new-instance v12, Landroidx/constraintlayout/motion/widget/KeyPosition;

    .line 97
    .line 98
    invoke-direct {v12}, Landroidx/constraintlayout/motion/widget/KeyPosition;-><init>()V

    .line 99
    .line 100
    .line 101
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    .line 102
    .line 103
    invoke-virtual {v12, v13}, Landroidx/constraintlayout/motion/widget/Key;->setFramePosition(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v2}, Landroidx/constraintlayout/motion/widget/KeyPosition;->setType(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v10, v5}, Landroidx/constraintlayout/motion/widget/KeyPosition;->setValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v11, v5}, Landroidx/constraintlayout/motion/widget/KeyPosition;->setValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget v5, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationX:I

    .line 116
    .line 117
    const/4 v10, 0x0

    .line 118
    if-lez v5, :cond_1

    .line 119
    .line 120
    new-instance v5, Landroidx/constraintlayout/motion/widget/KeyAttributes;

    .line 121
    .line 122
    invoke-direct {v5}, Landroidx/constraintlayout/motion/widget/KeyAttributes;-><init>()V

    .line 123
    .line 124
    .line 125
    new-instance v11, Landroidx/constraintlayout/motion/widget/KeyAttributes;

    .line 126
    .line 127
    invoke-direct {v11}, Landroidx/constraintlayout/motion/widget/KeyAttributes;-><init>()V

    .line 128
    .line 129
    .line 130
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationX:I

    .line 131
    .line 132
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    const-string/jumbo v14, "translationX"

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, v14, v13}, Landroidx/constraintlayout/motion/widget/KeyAttributes;->setValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    .line 143
    .line 144
    invoke-virtual {v5, v13}, Landroidx/constraintlayout/motion/widget/Key;->setFramePosition(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v11, v14, v3}, Landroidx/constraintlayout/motion/widget/KeyAttributes;->setValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    .line 151
    .line 152
    sub-int/2addr v13, v4

    .line 153
    invoke-virtual {v11, v13}, Landroidx/constraintlayout/motion/widget/Key;->setFramePosition(I)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_1
    move-object v5, v10

    .line 158
    move-object v11, v5

    .line 159
    :goto_0
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationY:I

    .line 160
    .line 161
    if-lez v13, :cond_2

    .line 162
    .line 163
    new-instance v10, Landroidx/constraintlayout/motion/widget/KeyAttributes;

    .line 164
    .line 165
    invoke-direct {v10}, Landroidx/constraintlayout/motion/widget/KeyAttributes;-><init>()V

    .line 166
    .line 167
    .line 168
    new-instance v13, Landroidx/constraintlayout/motion/widget/KeyAttributes;

    .line 169
    .line 170
    invoke-direct {v13}, Landroidx/constraintlayout/motion/widget/KeyAttributes;-><init>()V

    .line 171
    .line 172
    .line 173
    iget v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationY:I

    .line 174
    .line 175
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    const-string/jumbo v15, "translationY"

    .line 180
    .line 181
    .line 182
    invoke-virtual {v10, v15, v14}, Landroidx/constraintlayout/motion/widget/KeyAttributes;->setValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    iget v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    .line 186
    .line 187
    invoke-virtual {v10, v14}, Landroidx/constraintlayout/motion/widget/Key;->setFramePosition(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v13, v15, v3}, Landroidx/constraintlayout/motion/widget/KeyAttributes;->setValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget v3, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectEnd:I

    .line 194
    .line 195
    sub-int/2addr v3, v4

    .line 196
    invoke-virtual {v13, v3}, Landroidx/constraintlayout/motion/widget/Key;->setFramePosition(I)V

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_2
    move-object v13, v10

    .line 201
    :goto_1
    iget v3, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mFadeMove:I

    .line 202
    .line 203
    move/from16 v16, v2

    .line 204
    .line 205
    const/4 v2, -0x1

    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    if-ne v3, v2, :cond_b

    .line 209
    .line 210
    const/4 v3, 0x4

    .line 211
    new-array v2, v3, [I

    .line 212
    .line 213
    move/from16 v15, v16

    .line 214
    .line 215
    const/16 v18, 0x3

    .line 216
    .line 217
    const/16 v19, 0x2

    .line 218
    .line 219
    :goto_2
    array-length v14, v6

    .line 220
    if-ge v15, v14, :cond_8

    .line 221
    .line 222
    aget-object v14, v6, v15

    .line 223
    .line 224
    invoke-virtual {v1, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v14

    .line 228
    check-cast v14, Landroidx/constraintlayout/motion/widget/MotionController;

    .line 229
    .line 230
    if-nez v14, :cond_3

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_3
    invoke-virtual {v14}, Landroidx/constraintlayout/motion/widget/MotionController;->getFinalX()F

    .line 234
    .line 235
    .line 236
    move-result v20

    .line 237
    invoke-virtual {v14}, Landroidx/constraintlayout/motion/widget/MotionController;->getStartX()F

    .line 238
    .line 239
    .line 240
    move-result v21

    .line 241
    sub-float v20, v20, v21

    .line 242
    .line 243
    invoke-virtual {v14}, Landroidx/constraintlayout/motion/widget/MotionController;->getFinalY()F

    .line 244
    .line 245
    .line 246
    move-result v21

    .line 247
    invoke-virtual {v14}, Landroidx/constraintlayout/motion/widget/MotionController;->getStartY()F

    .line 248
    .line 249
    .line 250
    move-result v14

    .line 251
    sub-float v21, v21, v14

    .line 252
    .line 253
    cmpg-float v14, v21, v17

    .line 254
    .line 255
    if-gez v14, :cond_4

    .line 256
    .line 257
    aget v14, v2, v4

    .line 258
    .line 259
    add-int/2addr v14, v4

    .line 260
    aput v14, v2, v4

    .line 261
    .line 262
    :cond_4
    cmpl-float v14, v21, v17

    .line 263
    .line 264
    if-lez v14, :cond_5

    .line 265
    .line 266
    aget v14, v2, v16

    .line 267
    .line 268
    add-int/2addr v14, v4

    .line 269
    aput v14, v2, v16

    .line 270
    .line 271
    :cond_5
    cmpl-float v14, v20, v17

    .line 272
    .line 273
    if-lez v14, :cond_6

    .line 274
    .line 275
    aget v14, v2, v18

    .line 276
    .line 277
    add-int/2addr v14, v4

    .line 278
    aput v14, v2, v18

    .line 279
    .line 280
    :cond_6
    cmpg-float v14, v20, v17

    .line 281
    .line 282
    if-gez v14, :cond_7

    .line 283
    .line 284
    aget v14, v2, v19

    .line 285
    .line 286
    add-int/2addr v14, v4

    .line 287
    aput v14, v2, v19

    .line 288
    .line 289
    :cond_7
    :goto_3
    add-int/lit8 v15, v15, 0x1

    .line 290
    .line 291
    goto :goto_2

    .line 292
    :cond_8
    aget v14, v2, v16

    .line 293
    .line 294
    move v15, v14

    .line 295
    move/from16 v14, v16

    .line 296
    .line 297
    :goto_4
    if-ge v4, v3, :cond_a

    .line 298
    .line 299
    aget v3, v2, v4

    .line 300
    .line 301
    if-ge v15, v3, :cond_9

    .line 302
    .line 303
    move v15, v3

    .line 304
    move v14, v4

    .line 305
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 306
    .line 307
    const/4 v3, 0x4

    .line 308
    goto :goto_4

    .line 309
    :cond_a
    move v3, v14

    .line 310
    goto :goto_5

    .line 311
    :cond_b
    const/16 v18, 0x3

    .line 312
    .line 313
    const/16 v19, 0x2

    .line 314
    .line 315
    :goto_5
    move/from16 v2, v16

    .line 316
    .line 317
    :goto_6
    array-length v4, v6

    .line 318
    if-ge v2, v4, :cond_17

    .line 319
    .line 320
    aget-object v4, v6, v2

    .line 321
    .line 322
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    check-cast v4, Landroidx/constraintlayout/motion/widget/MotionController;

    .line 327
    .line 328
    if-nez v4, :cond_d

    .line 329
    .line 330
    :cond_c
    :goto_7
    move-object/from16 v1, p1

    .line 331
    .line 332
    const/4 v15, -0x1

    .line 333
    goto/16 :goto_b

    .line 334
    .line 335
    :cond_d
    invoke-virtual {v4}, Landroidx/constraintlayout/motion/widget/MotionController;->getFinalX()F

    .line 336
    .line 337
    .line 338
    move-result v14

    .line 339
    invoke-virtual {v4}, Landroidx/constraintlayout/motion/widget/MotionController;->getStartX()F

    .line 340
    .line 341
    .line 342
    move-result v15

    .line 343
    sub-float/2addr v14, v15

    .line 344
    invoke-virtual {v4}, Landroidx/constraintlayout/motion/widget/MotionController;->getFinalY()F

    .line 345
    .line 346
    .line 347
    move-result v15

    .line 348
    invoke-virtual {v4}, Landroidx/constraintlayout/motion/widget/MotionController;->getStartY()F

    .line 349
    .line 350
    .line 351
    move-result v16

    .line 352
    sub-float v15, v15, v16

    .line 353
    .line 354
    if-nez v3, :cond_10

    .line 355
    .line 356
    cmpl-float v15, v15, v17

    .line 357
    .line 358
    if-lez v15, :cond_e

    .line 359
    .line 360
    iget-boolean v15, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStrictMove:Z

    .line 361
    .line 362
    if-eqz v15, :cond_f

    .line 363
    .line 364
    cmpl-float v14, v14, v17

    .line 365
    .line 366
    if-nez v14, :cond_e

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_e
    move/from16 v1, v18

    .line 370
    .line 371
    goto :goto_a

    .line 372
    :cond_f
    :goto_8
    move/from16 v1, v18

    .line 373
    .line 374
    goto :goto_9

    .line 375
    :cond_10
    const/4 v1, 0x1

    .line 376
    if-ne v3, v1, :cond_11

    .line 377
    .line 378
    cmpg-float v15, v15, v17

    .line 379
    .line 380
    if-gez v15, :cond_e

    .line 381
    .line 382
    iget-boolean v15, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStrictMove:Z

    .line 383
    .line 384
    if-eqz v15, :cond_f

    .line 385
    .line 386
    cmpl-float v14, v14, v17

    .line 387
    .line 388
    if-nez v14, :cond_e

    .line 389
    .line 390
    goto :goto_8

    .line 391
    :cond_11
    move/from16 v1, v19

    .line 392
    .line 393
    if-ne v3, v1, :cond_12

    .line 394
    .line 395
    cmpg-float v14, v14, v17

    .line 396
    .line 397
    if-gez v14, :cond_e

    .line 398
    .line 399
    iget-boolean v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStrictMove:Z

    .line 400
    .line 401
    if-eqz v14, :cond_f

    .line 402
    .line 403
    cmpl-float v14, v15, v17

    .line 404
    .line 405
    if-nez v14, :cond_e

    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_12
    move/from16 v1, v18

    .line 409
    .line 410
    if-ne v3, v1, :cond_13

    .line 411
    .line 412
    cmpl-float v14, v14, v17

    .line 413
    .line 414
    if-lez v14, :cond_13

    .line 415
    .line 416
    iget-boolean v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectStrictMove:Z

    .line 417
    .line 418
    if-eqz v14, :cond_c

    .line 419
    .line 420
    cmpl-float v14, v15, v17

    .line 421
    .line 422
    if-nez v14, :cond_13

    .line 423
    .line 424
    :goto_9
    goto :goto_7

    .line 425
    :cond_13
    :goto_a
    iget v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mViewTransitionId:I

    .line 426
    .line 427
    const/4 v15, -0x1

    .line 428
    if-ne v14, v15, :cond_16

    .line 429
    .line 430
    invoke-virtual {v4, v7}, Landroidx/constraintlayout/motion/widget/MotionController;->addKey(Landroidx/constraintlayout/motion/widget/Key;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v4, v8}, Landroidx/constraintlayout/motion/widget/MotionController;->addKey(Landroidx/constraintlayout/motion/widget/Key;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v4, v9}, Landroidx/constraintlayout/motion/widget/MotionController;->addKey(Landroidx/constraintlayout/motion/widget/Key;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v4, v12}, Landroidx/constraintlayout/motion/widget/MotionController;->addKey(Landroidx/constraintlayout/motion/widget/Key;)V

    .line 440
    .line 441
    .line 442
    iget v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationX:I

    .line 443
    .line 444
    if-lez v14, :cond_14

    .line 445
    .line 446
    invoke-virtual {v4, v5}, Landroidx/constraintlayout/motion/widget/MotionController;->addKey(Landroidx/constraintlayout/motion/widget/Key;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v4, v11}, Landroidx/constraintlayout/motion/widget/MotionController;->addKey(Landroidx/constraintlayout/motion/widget/Key;)V

    .line 450
    .line 451
    .line 452
    :cond_14
    iget v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->mMotionEffectTranslationY:I

    .line 453
    .line 454
    if-lez v14, :cond_15

    .line 455
    .line 456
    invoke-virtual {v4, v10}, Landroidx/constraintlayout/motion/widget/MotionController;->addKey(Landroidx/constraintlayout/motion/widget/Key;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v4, v13}, Landroidx/constraintlayout/motion/widget/MotionController;->addKey(Landroidx/constraintlayout/motion/widget/Key;)V

    .line 460
    .line 461
    .line 462
    :cond_15
    move-object/from16 v1, p1

    .line 463
    .line 464
    goto :goto_b

    .line 465
    :cond_16
    move-object/from16 v1, p1

    .line 466
    .line 467
    invoke-virtual {v1, v14, v4}, Landroidx/constraintlayout/motion/widget/MotionLayout;->applyViewTransition(ILandroidx/constraintlayout/motion/widget/MotionController;)Z

    .line 468
    .line 469
    .line 470
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 471
    .line 472
    move-object/from16 v1, p2

    .line 473
    .line 474
    const/16 v18, 0x3

    .line 475
    .line 476
    const/16 v19, 0x2

    .line 477
    .line 478
    goto/16 :goto_6

    .line 479
    .line 480
    :cond_17
    return-void
.end method
