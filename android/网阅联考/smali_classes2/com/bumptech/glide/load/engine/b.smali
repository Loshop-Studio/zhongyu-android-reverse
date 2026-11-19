.class public Lcom/bumptech/glide/load/engine/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/engine/c;
.implements Lk/d$a;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lcom/bumptech/glide/load/engine/d;

.field public final c:Lcom/bumptech/glide/load/engine/c$a;

.field public d:I

.field public e:Lj/b;

.field public f:Ljava/util/List;

.field public g:I

.field public volatile h:Lq/m$a;

.field public i:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/engine/d;Lcom/bumptech/glide/load/engine/c$a;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/bumptech/glide/load/engine/d;->c()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/bumptech/glide/load/engine/b;-><init>(Ljava/util/List;Lcom/bumptech/glide/load/engine/d;Lcom/bumptech/glide/load/engine/c$a;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/bumptech/glide/load/engine/d;Lcom/bumptech/glide/load/engine/c$a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/bumptech/glide/load/engine/b;->d:I

    .line 4
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/b;->a:Ljava/util/List;

    .line 5
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/b;->b:Lcom/bumptech/glide/load/engine/d;

    .line 6
    iput-object p3, p0, Lcom/bumptech/glide/load/engine/b;->c:Lcom/bumptech/glide/load/engine/c$a;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/bumptech/glide/load/engine/b;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->f:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    return v0
.end method

.method public b()Z
    .locals 7

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->f:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->h:Lq/m$a;

    .line 16
    .line 17
    :cond_2
    :goto_1
    if-nez v1, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->a()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->f:Ljava/util/List;

    .line 26
    .line 27
    iget v3, p0, Lcom/bumptech/glide/load/engine/b;->g:I

    .line 28
    .line 29
    add-int/lit8 v4, v3, 0x1

    .line 30
    .line 31
    iput v4, p0, Lcom/bumptech/glide/load/engine/b;->g:I

    .line 32
    .line 33
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lq/m;

    .line 38
    .line 39
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/b;->i:Ljava/io/File;

    .line 40
    .line 41
    iget-object v4, p0, Lcom/bumptech/glide/load/engine/b;->b:Lcom/bumptech/glide/load/engine/d;

    .line 42
    .line 43
    invoke-virtual {v4}, Lcom/bumptech/glide/load/engine/d;->s()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    iget-object v5, p0, Lcom/bumptech/glide/load/engine/b;->b:Lcom/bumptech/glide/load/engine/d;

    .line 48
    .line 49
    invoke-virtual {v5}, Lcom/bumptech/glide/load/engine/d;->f()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    iget-object v6, p0, Lcom/bumptech/glide/load/engine/b;->b:Lcom/bumptech/glide/load/engine/d;

    .line 54
    .line 55
    invoke-virtual {v6}, Lcom/bumptech/glide/load/engine/d;->k()Lj/d;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-interface {v0, v3, v4, v5, v6}, Lq/m;->b(Ljava/lang/Object;IILj/d;)Lq/m$a;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->h:Lq/m$a;

    .line 64
    .line 65
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->h:Lq/m$a;

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->b:Lcom/bumptech/glide/load/engine/d;

    .line 70
    .line 71
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/b;->h:Lq/m$a;

    .line 72
    .line 73
    iget-object v3, v3, Lq/m$a;->c:Lk/d;

    .line 74
    .line 75
    invoke-interface {v3}, Lk/d;->a()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v0, v3}, Lcom/bumptech/glide/load/engine/d;->t(Ljava/lang/Class;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->h:Lq/m$a;

    .line 86
    .line 87
    iget-object v0, v0, Lq/m$a;->c:Lk/d;

    .line 88
    .line 89
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->b:Lcom/bumptech/glide/load/engine/d;

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/bumptech/glide/load/engine/d;->l()Lcom/bumptech/glide/Priority;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {v0, v1, p0}, Lk/d;->f(Lcom/bumptech/glide/Priority;Lk/d$a;)V

    .line 96
    .line 97
    .line 98
    move v1, v2

    .line 99
    goto :goto_1

    .line 100
    :cond_3
    return v1

    .line 101
    :cond_4
    :goto_2
    iget v0, p0, Lcom/bumptech/glide/load/engine/b;->d:I

    .line 102
    .line 103
    add-int/2addr v0, v2

    .line 104
    iput v0, p0, Lcom/bumptech/glide/load/engine/b;->d:I

    .line 105
    .line 106
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->a:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-lt v0, v2, :cond_5

    .line 113
    .line 114
    return v1

    .line 115
    :cond_5
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->a:Ljava/util/List;

    .line 116
    .line 117
    iget v2, p0, Lcom/bumptech/glide/load/engine/b;->d:I

    .line 118
    .line 119
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lj/b;

    .line 124
    .line 125
    new-instance v2, Lm/a;

    .line 126
    .line 127
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/b;->b:Lcom/bumptech/glide/load/engine/d;

    .line 128
    .line 129
    invoke-virtual {v3}, Lcom/bumptech/glide/load/engine/d;->o()Lj/b;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-direct {v2, v0, v3}, Lm/a;-><init>(Lj/b;Lj/b;)V

    .line 134
    .line 135
    .line 136
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/b;->b:Lcom/bumptech/glide/load/engine/d;

    .line 137
    .line 138
    invoke-virtual {v3}, Lcom/bumptech/glide/load/engine/d;->d()Lo/a;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-interface {v3, v2}, Lo/a;->b(Lj/b;)Ljava/io/File;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->i:Ljava/io/File;

    .line 147
    .line 148
    if-eqz v2, :cond_0

    .line 149
    .line 150
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->e:Lj/b;

    .line 151
    .line 152
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->b:Lcom/bumptech/glide/load/engine/d;

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Lcom/bumptech/glide/load/engine/d;->j(Ljava/io/File;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->f:Ljava/util/List;

    .line 159
    .line 160
    iput v1, p0, Lcom/bumptech/glide/load/engine/b;->g:I

    .line 161
    .line 162
    goto/16 :goto_0
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->c:Lcom/bumptech/glide/load/engine/c$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->e:Lj/b;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->h:Lq/m$a;

    .line 6
    .line 7
    iget-object v2, v2, Lq/m$a;->c:Lk/d;

    .line 8
    .line 9
    sget-object v3, Lcom/bumptech/glide/load/DataSource;->c:Lcom/bumptech/glide/load/DataSource;

    .line 10
    .line 11
    invoke-interface {v0, v1, p1, v2, v3}, Lcom/bumptech/glide/load/engine/c$a;->d(Lj/b;Ljava/lang/Exception;Lk/d;Lcom/bumptech/glide/load/DataSource;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->h:Lq/m$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lq/m$a;->c:Lk/d;

    .line 6
    .line 7
    invoke-interface {v0}, Lk/d;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->c:Lcom/bumptech/glide/load/engine/c$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->e:Lj/b;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->h:Lq/m$a;

    .line 6
    .line 7
    iget-object v3, v2, Lq/m$a;->c:Lk/d;

    .line 8
    .line 9
    sget-object v4, Lcom/bumptech/glide/load/DataSource;->c:Lcom/bumptech/glide/load/DataSource;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/bumptech/glide/load/engine/b;->e:Lj/b;

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    invoke-interface/range {v0 .. v5}, Lcom/bumptech/glide/load/engine/c$a;->a(Lj/b;Ljava/lang/Object;Lk/d;Lcom/bumptech/glide/load/DataSource;Lj/b;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
