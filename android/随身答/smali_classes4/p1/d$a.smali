.class public Lp1/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lt1/b;

.field public b:Lt1/a;

.field public c:Lr1/i;

.field public d:Ls1/a$b;

.field public e:Lv1/e;

.field public f:Lu1/g;

.field public g:Lv1/a$a;

.field public final h:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lp1/d$a;->h:Landroid/content/Context;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Lp1/d;
    .locals 10

    .line 1
    iget-object v0, p0, Lp1/d$a;->a:Lt1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lt1/b;

    .line 6
    .line 7
    invoke-direct {v0}, Lt1/b;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lp1/d$a;->a:Lt1/b;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lp1/d$a;->b:Lt1/a;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Lt1/a;

    .line 17
    .line 18
    invoke-direct {v0}, Lt1/a;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lp1/d$a;->b:Lt1/a;

    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lp1/d$a;->c:Lr1/i;

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lp1/d$a;->h:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {v0}, Lq1/c;->g(Landroid/content/Context;)Lr1/i;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lp1/d$a;->c:Lr1/i;

    .line 34
    .line 35
    :cond_2
    iget-object v0, p0, Lp1/d$a;->d:Ls1/a$b;

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    invoke-static {}, Lq1/c;->f()Ls1/a$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lp1/d$a;->d:Ls1/a$b;

    .line 44
    .line 45
    :cond_3
    iget-object v0, p0, Lp1/d$a;->g:Lv1/a$a;

    .line 46
    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    new-instance v0, Lv1/b$a;

    .line 50
    .line 51
    invoke-direct {v0}, Lv1/b$a;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lp1/d$a;->g:Lv1/a$a;

    .line 55
    .line 56
    :cond_4
    iget-object v0, p0, Lp1/d$a;->e:Lv1/e;

    .line 57
    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    new-instance v0, Lv1/e;

    .line 61
    .line 62
    invoke-direct {v0}, Lv1/e;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lp1/d$a;->e:Lv1/e;

    .line 66
    .line 67
    :cond_5
    iget-object v0, p0, Lp1/d$a;->f:Lu1/g;

    .line 68
    .line 69
    if-nez v0, :cond_6

    .line 70
    .line 71
    new-instance v0, Lu1/g;

    .line 72
    .line 73
    invoke-direct {v0}, Lu1/g;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Lp1/d$a;->f:Lu1/g;

    .line 77
    .line 78
    :cond_6
    new-instance v1, Lp1/d;

    .line 79
    .line 80
    iget-object v2, p0, Lp1/d$a;->h:Landroid/content/Context;

    .line 81
    .line 82
    iget-object v3, p0, Lp1/d$a;->a:Lt1/b;

    .line 83
    .line 84
    iget-object v4, p0, Lp1/d$a;->b:Lt1/a;

    .line 85
    .line 86
    iget-object v5, p0, Lp1/d$a;->c:Lr1/i;

    .line 87
    .line 88
    iget-object v6, p0, Lp1/d$a;->d:Ls1/a$b;

    .line 89
    .line 90
    iget-object v7, p0, Lp1/d$a;->g:Lv1/a$a;

    .line 91
    .line 92
    iget-object v8, p0, Lp1/d$a;->e:Lv1/e;

    .line 93
    .line 94
    iget-object v9, p0, Lp1/d$a;->f:Lu1/g;

    .line 95
    .line 96
    invoke-direct/range {v1 .. v9}, Lp1/d;-><init>(Landroid/content/Context;Lt1/b;Lt1/a;Lr1/i;Ls1/a$b;Lv1/a$a;Lv1/e;Lu1/g;)V

    .line 97
    .line 98
    .line 99
    const/4 v0, 0x0

    .line 100
    invoke-virtual {v1, v0}, Lp1/d;->j(Lp1/b;)V

    .line 101
    .line 102
    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v2, "downloadStore["

    .line 109
    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    iget-object v2, p0, Lp1/d$a;->c:Lr1/i;

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v2, "] connectionFactory["

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-object v2, p0, Lp1/d$a;->d:Ls1/a$b;

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v2, "OkDownload"

    .line 133
    .line 134
    invoke-static {v2, v0}, Lq1/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v1
.end method
