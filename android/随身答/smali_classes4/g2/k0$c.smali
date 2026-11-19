.class public Lg2/k0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg2/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Lv2/e$h;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Ly2/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, p0, Lg2/k0$c;->b:I

    .line 9
    .line 10
    iput v1, p0, Lg2/k0$c;->c:I

    .line 11
    .line 12
    iput v1, p0, Lg2/k0$c;->d:I

    .line 13
    .line 14
    iput v1, p0, Lg2/k0$c;->e:I

    .line 15
    .line 16
    iput-object v0, p0, Lg2/k0$c;->f:Ly2/a;

    .line 17
    .line 18
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Ly2/a;->c(Landroid/content/Context;)Ly2/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lg2/k0$c;->f:Ly2/a;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 3

    .line 1
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "test_report_interval"

    .line 6
    .line 7
    const-string v2, "-1"

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, -0x1

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/16 v1, 0x5a

    .line 25
    .line 26
    if-lt v0, v1, :cond_1

    .line 27
    .line 28
    const v1, 0x15180

    .line 29
    .line 30
    .line 31
    if-le v0, v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    mul-int/lit16 v0, v0, 0x3e8

    .line 35
    .line 36
    return v0

    .line 37
    :cond_1
    :goto_0
    return p1
.end method

.method public b()V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    :try_start_0
    invoke-virtual {p0, v0, v0}, Lg2/k0$c;->c(II)[I

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x0

    .line 7
    aget v1, v0, v1

    .line 8
    .line 9
    iput v1, p0, Lg2/k0$c;->b:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    aget v0, v0, v1

    .line 13
    .line 14
    iput v0, p0, Lg2/k0$c;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    :catchall_0
    return-void
.end method

.method public c(II)[I
    .locals 4

    .line 1
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "report_policy"

    .line 6
    .line 7
    const-string v2, "-1"

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v3, "report_interval"

    .line 26
    .line 27
    invoke-static {v1, v3, v2}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, -0x1

    .line 40
    if-eq v0, v2, :cond_7

    .line 41
    .line 42
    invoke-static {v0}, Lv2/e;->a(I)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v3, 0x6

    .line 50
    if-ne v3, v0, :cond_3

    .line 51
    .line 52
    const/16 p1, 0x5a

    .line 53
    .line 54
    if-eq v1, v2, :cond_1

    .line 55
    .line 56
    if-lt v1, p1, :cond_1

    .line 57
    .line 58
    const p2, 0x15180

    .line 59
    .line 60
    .line 61
    if-le v1, p2, :cond_2

    .line 62
    .line 63
    :cond_1
    move v1, p1

    .line 64
    :cond_2
    mul-int/lit16 v1, v1, 0x3e8

    .line 65
    .line 66
    filled-new-array {v0, v1}, [I

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_3
    const/16 v3, 0xb

    .line 72
    .line 73
    if-ne v3, v0, :cond_6

    .line 74
    .line 75
    const/16 p1, 0xf

    .line 76
    .line 77
    if-eq v1, v2, :cond_4

    .line 78
    .line 79
    if-lt v1, p1, :cond_4

    .line 80
    .line 81
    const/16 p2, 0xe10

    .line 82
    .line 83
    if-le v1, p2, :cond_5

    .line 84
    .line 85
    :cond_4
    move v1, p1

    .line 86
    :cond_5
    mul-int/lit16 v1, v1, 0x3e8

    .line 87
    .line 88
    filled-new-array {v0, v1}, [I

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :cond_6
    filled-new-array {p1, p2}, [I

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :cond_7
    :goto_0
    filled-new-array {p1, p2}, [I

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1
.end method

.method public final d(II)Lv2/e$h;
    .locals 3

    .line 1
    if-eqz p1, :cond_d

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_b

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    if-eq p1, v0, :cond_9

    .line 8
    .line 9
    const/4 v0, 0x5

    .line 10
    if-eq p1, v0, :cond_7

    .line 11
    .line 12
    const/4 v0, 0x6

    .line 13
    if-eq p1, v0, :cond_5

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    if-eq p1, v0, :cond_3

    .line 18
    .line 19
    const/16 v0, 0xb

    .line 20
    .line 21
    if-eq p1, v0, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 24
    .line 25
    instance-of p2, p1, Lv2/e$c;

    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    new-instance p1, Lv2/e$c;

    .line 31
    .line 32
    invoke-direct {p1}, Lv2/e$c;-><init>()V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    iget-object p1, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 37
    .line 38
    instance-of v0, p1, Lv2/e$f;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    move-object v0, p1

    .line 43
    check-cast v0, Lv2/e$f;

    .line 44
    .line 45
    int-to-long v1, p2

    .line 46
    invoke-virtual {v0, v1, v2}, Lv2/e$f;->d(J)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    new-instance p1, Lv2/e$f;

    .line 51
    .line 52
    invoke-direct {p1}, Lv2/e$f;-><init>()V

    .line 53
    .line 54
    .line 55
    int-to-long v0, p2

    .line 56
    invoke-virtual {p1, v0, v1}, Lv2/e$f;->d(J)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_3
    iget-object p1, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 61
    .line 62
    instance-of p2, p1, Lv2/e$j;

    .line 63
    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_4
    new-instance p1, Lv2/e$j;

    .line 68
    .line 69
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-static {p2}, Lx2/b;->e(Landroid/content/Context;)Lx2/b;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-direct {p1, p2}, Lv2/e$j;-><init>(Lx2/b;)V

    .line 78
    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_5
    iget-object p1, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 82
    .line 83
    instance-of v0, p1, Lv2/e$d;

    .line 84
    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    move-object v0, p1

    .line 88
    check-cast v0, Lv2/e$d;

    .line 89
    .line 90
    int-to-long v1, p2

    .line 91
    invoke-virtual {v0, v1, v2}, Lv2/e$d;->d(J)V

    .line 92
    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_6
    new-instance p1, Lv2/e$d;

    .line 96
    .line 97
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Lx2/b;->e(Landroid/content/Context;)Lx2/b;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    int-to-long v1, p2

    .line 106
    invoke-direct {p1, v0, v1, v2}, Lv2/e$d;-><init>(Lx2/b;J)V

    .line 107
    .line 108
    .line 109
    return-object p1

    .line 110
    :cond_7
    iget-object p1, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 111
    .line 112
    instance-of p2, p1, Lv2/e$i;

    .line 113
    .line 114
    if-eqz p2, :cond_8

    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_8
    new-instance p1, Lv2/e$i;

    .line 118
    .line 119
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-direct {p1, p2}, Lv2/e$i;-><init>(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_9
    iget-object p1, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 128
    .line 129
    instance-of p2, p1, Lv2/e$e;

    .line 130
    .line 131
    if-eqz p2, :cond_a

    .line 132
    .line 133
    return-object p1

    .line 134
    :cond_a
    new-instance p1, Lv2/e$e;

    .line 135
    .line 136
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-static {p2}, Lx2/b;->e(Landroid/content/Context;)Lx2/b;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-direct {p1, p2}, Lv2/e$e;-><init>(Lx2/b;)V

    .line 145
    .line 146
    .line 147
    return-object p1

    .line 148
    :cond_b
    iget-object p1, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 149
    .line 150
    instance-of p2, p1, Lv2/e$c;

    .line 151
    .line 152
    if-eqz p2, :cond_c

    .line 153
    .line 154
    return-object p1

    .line 155
    :cond_c
    new-instance p1, Lv2/e$c;

    .line 156
    .line 157
    invoke-direct {p1}, Lv2/e$c;-><init>()V

    .line 158
    .line 159
    .line 160
    return-object p1

    .line 161
    :cond_d
    iget-object p1, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 162
    .line 163
    instance-of p2, p1, Lv2/e$g;

    .line 164
    .line 165
    if-eqz p2, :cond_e

    .line 166
    .line 167
    return-object p1

    .line 168
    :cond_e
    new-instance p1, Lv2/e$g;

    .line 169
    .line 170
    invoke-direct {p1}, Lv2/e$g;-><init>()V

    .line 171
    .line 172
    .line 173
    return-object p1
.end method

.method public e()V
    .locals 8

    .line 1
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ly2/b;->c(Landroid/content/Context;)Ly2/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ly2/b;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x3

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 18
    .line 19
    instance-of v4, v1, Lv2/e$b;

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Lv2/e$h;->a()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v1, Lv2/e$b;

    .line 33
    .line 34
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v4}, Lx2/b;->e(Landroid/content/Context;)Lx2/b;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-direct {v1, v4, v0}, Lv2/e$b;-><init>(Lx2/b;Ly2/b;)V

    .line 43
    .line 44
    .line 45
    move-object v0, v1

    .line 46
    :goto_0
    iput-object v0, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 47
    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :cond_1
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "integrated_test"

    .line 55
    .line 56
    const-string v4, "-1"

    .line 57
    .line 58
    invoke-static {v0, v1, v4}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/4 v1, 0x0

    .line 71
    const/4 v5, 0x1

    .line 72
    if-ne v0, v5, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move v5, v1

    .line 76
    :goto_1
    invoke-static {}, Lk2/a;->e()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    sget-boolean v0, Lv2/d;->a:Z

    .line 85
    .line 86
    if-nez v0, :cond_3

    .line 87
    .line 88
    sget-object v0, Lg2/g0;->G:Ljava/lang/String;

    .line 89
    .line 90
    const-string v6, "\\|"

    .line 91
    .line 92
    invoke-static {v0, v2, v6, v3, v3}, Lm2/f;->h(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    sget-boolean v0, Lv2/d;->a:Z

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    if-eqz v5, :cond_4

    .line 100
    .line 101
    new-instance v0, Lv2/e$a;

    .line 102
    .line 103
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {v1}, Lx2/b;->e(Landroid/content/Context;)Lx2/b;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-direct {v0, v1}, Lv2/e$a;-><init>(Lx2/b;)V

    .line 112
    .line 113
    .line 114
    iput-object v0, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_4
    iget-object v0, p0, Lg2/k0$c;->f:Ly2/a;

    .line 118
    .line 119
    invoke-virtual {v0}, Ly2/a;->f()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    const/4 v5, -0x1

    .line 124
    if-eqz v0, :cond_8

    .line 125
    .line 126
    iget-object v0, p0, Lg2/k0$c;->f:Ly2/a;

    .line 127
    .line 128
    invoke-virtual {v0}, Ly2/a;->d()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v6, "RPT"

    .line 133
    .line 134
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_8

    .line 139
    .line 140
    iget-object v0, p0, Lg2/k0$c;->f:Ly2/a;

    .line 141
    .line 142
    invoke-virtual {v0}, Ly2/a;->e()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    const/4 v6, 0x6

    .line 147
    if-ne v0, v6, :cond_7

    .line 148
    .line 149
    invoke-static {}, Lg2/k0;->G()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const-string v1, "test_report_interval"

    .line 154
    .line 155
    invoke-static {v0, v1, v4}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eq v0, v5, :cond_5

    .line 168
    .line 169
    const v0, 0x15f90

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v0}, Lg2/k0$c;->a(I)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    goto :goto_2

    .line 177
    :cond_5
    iget v1, p0, Lg2/k0$c;->c:I

    .line 178
    .line 179
    if-lez v1, :cond_6

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_6
    iget v1, p0, Lg2/k0$c;->e:I

    .line 183
    .line 184
    :cond_7
    :goto_2
    iget-object v0, p0, Lg2/k0$c;->f:Ly2/a;

    .line 185
    .line 186
    invoke-virtual {v0}, Ly2/a;->e()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    invoke-virtual {p0, v0, v1}, Lg2/k0$c;->d(II)Lv2/e$h;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iput-object v0, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_8
    iget v0, p0, Lg2/k0$c;->d:I

    .line 198
    .line 199
    iget v1, p0, Lg2/k0$c;->e:I

    .line 200
    .line 201
    iget v4, p0, Lg2/k0$c;->b:I

    .line 202
    .line 203
    if-eq v4, v5, :cond_9

    .line 204
    .line 205
    iget v1, p0, Lg2/k0$c;->c:I

    .line 206
    .line 207
    move v0, v4

    .line 208
    :cond_9
    invoke-virtual {p0, v0, v1}, Lg2/k0$c;->d(II)Lv2/e$h;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    iput-object v0, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 213
    .line 214
    :goto_3
    invoke-static {}, Lk2/a;->e()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_d

    .line 219
    .line 220
    :try_start_0
    iget-object v0, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 221
    .line 222
    instance-of v1, v0, Lv2/e$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    .line 224
    const-string v4, ""

    .line 225
    .line 226
    if-eqz v1, :cond_a

    .line 227
    .line 228
    :try_start_1
    sget-object v0, Lg2/g0;->E:Ljava/lang/String;

    .line 229
    .line 230
    invoke-static {v0, v2, v4, v3, v3}, Lm2/f;->h(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :cond_a
    instance-of v1, v0, Lv2/e$d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 235
    .line 236
    const-string v5, "@"

    .line 237
    .line 238
    const-wide/16 v6, 0x3e8

    .line 239
    .line 240
    if-eqz v1, :cond_b

    .line 241
    .line 242
    :try_start_2
    check-cast v0, Lv2/e$d;

    .line 243
    .line 244
    invoke-virtual {v0}, Lv2/e$d;->c()J

    .line 245
    .line 246
    .line 247
    move-result-wide v0

    .line 248
    div-long/2addr v0, v6

    .line 249
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    filled-new-array {v5}, [Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    filled-new-array {v0}, [Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    sget-object v3, Lg2/g0;->F:Ljava/lang/String;

    .line 262
    .line 263
    invoke-static {v3, v2, v4, v1, v0}, Lm2/f;->h(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_b
    instance-of v1, v0, Lv2/e$a;

    .line 268
    .line 269
    if-eqz v1, :cond_c

    .line 270
    .line 271
    sget-object v0, Lg2/g0;->H:Ljava/lang/String;

    .line 272
    .line 273
    invoke-static {v0, v2, v4, v3, v3}, Lm2/f;->h(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :cond_c
    instance-of v1, v0, Lv2/e$f;

    .line 278
    .line 279
    if-eqz v1, :cond_d

    .line 280
    .line 281
    check-cast v0, Lv2/e$f;

    .line 282
    .line 283
    invoke-virtual {v0}, Lv2/e$f;->c()J

    .line 284
    .line 285
    .line 286
    move-result-wide v0

    .line 287
    div-long/2addr v0, v6

    .line 288
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    filled-new-array {v5}, [Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    filled-new-array {v0}, [Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    sget-object v3, Lg2/g0;->I:Ljava/lang/String;

    .line 301
    .line 302
    invoke-static {v3, v2, v4, v1, v0}, Lm2/f;->h(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 303
    .line 304
    .line 305
    :catchall_0
    :cond_d
    return-void
.end method

.method public f()Lv2/e$h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg2/k0$c;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg2/k0$c;->a:Lv2/e$h;

    .line 5
    .line 6
    return-object v0
.end method
