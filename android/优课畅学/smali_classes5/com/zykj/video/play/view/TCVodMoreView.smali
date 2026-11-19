.class public Lcom/zykj/video/play/view/TCVodMoreView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/video/play/view/TCVodMoreView$c;
    }
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/widget/SeekBar;

.field public c:Landroid/widget/SeekBar;

.field public d:Landroid/widget/Switch;

.field public e:Landroid/widget/Switch;

.field public f:Lcom/zykj/video/play/view/TCVodMoreView$c;

.field public g:Landroid/media/AudioManager;

.field public h:Landroid/widget/RadioGroup;

.field public i:Landroid/widget/RadioButton;

.field public j:Landroid/widget/RadioButton;

.field public k:Landroid/widget/RadioButton;

.field public l:Landroid/widget/RadioButton;

.field public m:Landroid/widget/LinearLayout;

.field public n:Landroid/widget/LinearLayout;

.field public o:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field public p:Landroid/widget/SeekBar$OnSeekBarChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Lcom/zykj/video/play/view/TCVodMoreView$a;

    .line 5
    .line 6
    invoke-direct {p2, p0}, Lcom/zykj/video/play/view/TCVodMoreView$a;-><init>(Lcom/zykj/video/play/view/TCVodMoreView;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/zykj/video/play/view/TCVodMoreView;->o:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 10
    .line 11
    new-instance p2, Lcom/zykj/video/play/view/TCVodMoreView$b;

    .line 12
    .line 13
    invoke-direct {p2, p0}, Lcom/zykj/video/play/view/TCVodMoreView$b;-><init>(Lcom/zykj/video/play/view/TCVodMoreView;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/video/play/view/TCVodMoreView;->p:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/view/TCVodMoreView;->d(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static synthetic a(Lcom/zykj/video/play/view/TCVodMoreView;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/view/TCVodMoreView;->i(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/zykj/video/play/view/TCVodMoreView;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/video/play/view/TCVodMoreView;->e(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static c(Landroid/app/Activity;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 10
    .line 11
    return p0
.end method


# virtual methods
.method public final d(Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget v1, Lcom/zykj/video/play/R$layout;->superplayer_more_popup_view:I

    .line 8
    .line 9
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_ll_speed:I

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/widget/LinearLayout;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->m:Landroid/widget/LinearLayout;

    .line 21
    .line 22
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_rg:I

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/widget/RadioGroup;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->h:Landroid/widget/RadioGroup;

    .line 31
    .line 32
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_rb_speed1:I

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Landroid/widget/RadioButton;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->i:Landroid/widget/RadioButton;

    .line 41
    .line 42
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_rb_speed125:I

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroid/widget/RadioButton;

    .line 49
    .line 50
    iput-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->j:Landroid/widget/RadioButton;

    .line 51
    .line 52
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_rb_speed15:I

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Landroid/widget/RadioButton;

    .line 59
    .line 60
    iput-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->k:Landroid/widget/RadioButton;

    .line 61
    .line 62
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_rb_speed2:I

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Landroid/widget/RadioButton;

    .line 69
    .line 70
    iput-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->l:Landroid/widget/RadioButton;

    .line 71
    .line 72
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->h:Landroid/widget/RadioGroup;

    .line 73
    .line 74
    invoke-virtual {v0, p0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 75
    .line 76
    .line 77
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_sb_audio:I

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Landroid/widget/SeekBar;

    .line 84
    .line 85
    iput-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->b:Landroid/widget/SeekBar;

    .line 86
    .line 87
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_sb_light:I

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Landroid/widget/SeekBar;

    .line 94
    .line 95
    iput-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->c:Landroid/widget/SeekBar;

    .line 96
    .line 97
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_ll_mirror:I

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Landroid/widget/LinearLayout;

    .line 104
    .line 105
    iput-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->n:Landroid/widget/LinearLayout;

    .line 106
    .line 107
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_switch_mirror:I

    .line 108
    .line 109
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Landroid/widget/Switch;

    .line 114
    .line 115
    iput-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->d:Landroid/widget/Switch;

    .line 116
    .line 117
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_switch_accelerate:I

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Landroid/widget/Switch;

    .line 124
    .line 125
    iput-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->e:Landroid/widget/Switch;

    .line 126
    .line 127
    invoke-static {}, Lcom/zykj/video/play/a;->a()Lcom/zykj/video/play/a;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iget-object v1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->e:Landroid/widget/Switch;

    .line 132
    .line 133
    iget-boolean v0, v0, Lcom/zykj/video/play/a;->c:Z

    .line 134
    .line 135
    invoke-virtual {v1, v0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->b:Landroid/widget/SeekBar;

    .line 139
    .line 140
    iget-object v1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->o:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->c:Landroid/widget/SeekBar;

    .line 146
    .line 147
    iget-object v1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->p:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->d:Landroid/widget/Switch;

    .line 153
    .line 154
    invoke-virtual {v0, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->e:Landroid/widget/Switch;

    .line 158
    .line 159
    invoke-virtual {v0, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 160
    .line 161
    .line 162
    const-string v0, "audio"

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    check-cast p1, Landroid/media/AudioManager;

    .line 169
    .line 170
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->g:Landroid/media/AudioManager;

    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCVodMoreView;->g()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/zykj/video/play/view/TCVodMoreView;->f()V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public final e(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->a:Landroid/content/Context;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Activity;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    int-to-float v2, p1

    .line 14
    const/high16 v3, 0x3f800000    # 1.0f

    .line 15
    .line 16
    mul-float/2addr v2, v3

    .line 17
    const/high16 v4, 0x42c80000    # 100.0f

    .line 18
    .line 19
    div-float/2addr v2, v4

    .line 20
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 21
    .line 22
    cmpl-float v2, v2, v3

    .line 23
    .line 24
    if-lez v2, :cond_0

    .line 25
    .line 26
    iput v3, v1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 27
    .line 28
    :cond_0
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 29
    .line 30
    const v3, 0x3c23d70a    # 0.01f

    .line 31
    .line 32
    .line 33
    cmpg-float v2, v2, v3

    .line 34
    .line 35
    if-gtz v2, :cond_1

    .line 36
    .line 37
    iput v3, v1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->c:Landroid/widget/SeekBar;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->a:Landroid/content/Context;

    .line 2
    .line 3
    check-cast v0, Landroid/app/Activity;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 14
    .line 15
    const/high16 v3, -0x40800000    # -1.0f

    .line 16
    .line 17
    cmpl-float v2, v2, v3

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/video/play/view/TCVodMoreView;->a:Landroid/content/Context;

    .line 22
    .line 23
    check-cast v2, Landroid/app/Activity;

    .line 24
    .line 25
    invoke-static {v2}, Lcom/zykj/video/play/view/TCVodMoreView;->c(Landroid/app/Activity;)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    iget v0, v1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 35
    .line 36
    cmpl-float v1, v0, v3

    .line 37
    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->c:Landroid/widget/SeekBar;

    .line 41
    .line 42
    const/16 v1, 0x64

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    iget-object v1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->c:Landroid/widget/SeekBar;

    .line 49
    .line 50
    const/high16 v2, 0x42c80000    # 100.0f

    .line 51
    .line 52
    mul-float/2addr v0, v2

    .line 53
    float-to-int v0, v0

    .line 54
    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v2, p0, Lcom/zykj/video/play/view/TCVodMoreView;->g:Landroid/media/AudioManager;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    int-to-float v0, v0

    .line 15
    int-to-float v1, v1

    .line 16
    div-float/2addr v0, v1

    .line 17
    iget-object v1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->b:Landroid/widget/SeekBar;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getMax()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    mul-float/2addr v0, v1

    .line 25
    float-to-int v0, v0

    .line 26
    iget-object v1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->b:Landroid/widget/SeekBar;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public h(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->m:Landroid/widget/LinearLayout;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->n:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->m:Landroid/widget/LinearLayout;

    .line 17
    .line 18
    const/16 v0, 0x8

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->n:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final i(I)V
    .locals 3

    .line 1
    int-to-float p1, p1

    .line 2
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->b:Landroid/widget/SeekBar;

    .line 3
    .line 4
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    int-to-float v0, v0

    .line 9
    div-float/2addr p1, v0

    .line 10
    const/4 v0, 0x0

    .line 11
    cmpg-float v0, p1, v0

    .line 12
    .line 13
    if-ltz v0, :cond_1

    .line 14
    .line 15
    const/high16 v0, 0x3f800000    # 1.0f

    .line 16
    .line 17
    cmpl-float v0, p1, v0

    .line 18
    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->g:Landroid/media/AudioManager;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-float v0, v0

    .line 32
    mul-float/2addr p1, v0

    .line 33
    float-to-int p1, p1

    .line 34
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->g:Landroid/media/AudioManager;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {v0, v1, p1, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    return-void
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/zykj/video/play/R$id;->superplayer_switch_mirror:I

    if-ne v0, v1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->f:Lcom/zykj/video/play/view/TCVodMoreView$c;

    if-eqz p1, :cond_1

    .line 3
    invoke-interface {p1, p2}, Lcom/zykj/video/play/view/TCVodMoreView$c;->e(Z)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sget p2, Lcom/zykj/video/play/R$id;->superplayer_switch_accelerate:I

    if-ne p1, p2, :cond_1

    .line 5
    invoke-static {}, Lcom/zykj/video/play/a;->a()Lcom/zykj/video/play/a;

    move-result-object p1

    .line 6
    iget-boolean p2, p1, Lcom/zykj/video/play/a;->c:Z

    xor-int/lit8 p2, p2, 0x1

    iput-boolean p2, p1, Lcom/zykj/video/play/a;->c:Z

    .line 7
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVodMoreView;->e:Landroid/widget/Switch;

    invoke-virtual {v0, p2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 8
    iget-object p2, p0, Lcom/zykj/video/play/view/TCVodMoreView;->f:Lcom/zykj/video/play/view/TCVodMoreView$c;

    if-eqz p2, :cond_1

    .line 9
    iget-boolean p1, p1, Lcom/zykj/video/play/a;->c:Z

    invoke-interface {p2, p1}, Lcom/zykj/video/play/view/TCVodMoreView$c;->c(Z)V

    :cond_1
    return-void
.end method

.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    .line 10
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_rb_speed1:I

    const/4 v0, 0x1

    if-ne p2, p1, :cond_0

    .line 11
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->i:Landroid/widget/RadioButton;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 12
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->f:Lcom/zykj/video/play/view/TCVodMoreView$c;

    if-eqz p1, :cond_3

    const/high16 p2, 0x3f800000    # 1.0f

    .line 13
    invoke-interface {p1, p2}, Lcom/zykj/video/play/view/TCVodMoreView$c;->a(F)V

    return-void

    .line 14
    :cond_0
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_rb_speed125:I

    if-ne p2, p1, :cond_1

    .line 15
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->j:Landroid/widget/RadioButton;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 16
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->f:Lcom/zykj/video/play/view/TCVodMoreView$c;

    if-eqz p1, :cond_3

    const/high16 p2, 0x3fa00000    # 1.25f

    .line 17
    invoke-interface {p1, p2}, Lcom/zykj/video/play/view/TCVodMoreView$c;->a(F)V

    return-void

    .line 18
    :cond_1
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_rb_speed15:I

    if-ne p2, p1, :cond_2

    .line 19
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->k:Landroid/widget/RadioButton;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 20
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->f:Lcom/zykj/video/play/view/TCVodMoreView$c;

    if-eqz p1, :cond_3

    const/high16 p2, 0x3fc00000    # 1.5f

    .line 21
    invoke-interface {p1, p2}, Lcom/zykj/video/play/view/TCVodMoreView$c;->a(F)V

    return-void

    .line 22
    :cond_2
    sget p1, Lcom/zykj/video/play/R$id;->superplayer_rb_speed2:I

    if-ne p2, p1, :cond_3

    .line 23
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->l:Landroid/widget/RadioButton;

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 24
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->f:Lcom/zykj/video/play/view/TCVodMoreView$c;

    if-eqz p1, :cond_3

    const/high16 p2, 0x40000000    # 2.0f

    .line 25
    invoke-interface {p1, p2}, Lcom/zykj/video/play/view/TCVodMoreView$c;->a(F)V

    :cond_3
    return-void
.end method

.method public setCallback(Lcom/zykj/video/play/view/TCVodMoreView$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->f:Lcom/zykj/video/play/view/TCVodMoreView$c;

    .line 2
    .line 3
    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_4

    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->f:Lcom/zykj/video/play/view/TCVodMoreView$c;

    .line 7
    .line 8
    if-eqz p1, :cond_4

    .line 9
    .line 10
    invoke-interface {p1}, Lcom/zykj/video/play/view/TCVodMoreView$c;->getSpeed()F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    cmpl-float v0, p1, v0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->i:Landroid/widget/RadioButton;

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 28
    .line 29
    cmpl-float v0, p1, v0

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->j:Landroid/widget/RadioButton;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 40
    .line 41
    cmpl-float v0, p1, v0

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->k:Landroid/widget/RadioButton;

    .line 46
    .line 47
    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    const/high16 v0, 0x40000000    # 2.0f

    .line 52
    .line 53
    cmpl-float p1, p1, v0

    .line 54
    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->l:Landroid/widget/RadioButton;

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    iget-object p1, p0, Lcom/zykj/video/play/view/TCVodMoreView;->i:Landroid/widget/RadioButton;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 66
    .line 67
    .line 68
    :cond_4
    return-void
.end method
