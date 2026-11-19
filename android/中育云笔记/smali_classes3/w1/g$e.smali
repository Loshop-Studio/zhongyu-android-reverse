.class public final Lw1/g$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public a:Lec/a;

.field public b:Ld2/a;

.field public c:Lp2/a;

.field public d:Lt3/a;

.field public e:Lc3/a;

.field public f:Lz3/a;

.field public g:Lsa/a;

.field public h:Lg4/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lw1/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw1/g$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lec/a;)Lw1/g$e;
    .locals 0

    .line 1
    invoke-static {p1}, Lgc/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lec/a;

    .line 6
    .line 7
    iput-object p1, p0, Lw1/g$e;->a:Lec/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public b()Lw1/e;
    .locals 10

    .line 1
    iget-object v0, p0, Lw1/g$e;->a:Lec/a;

    .line 2
    .line 3
    const-class v1, Lec/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgc/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lw1/g$e;->b:Ld2/a;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ld2/a;

    .line 13
    .line 14
    invoke-direct {v0}, Ld2/a;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lw1/g$e;->b:Ld2/a;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lw1/g$e;->c:Lp2/a;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Lp2/a;

    .line 24
    .line 25
    invoke-direct {v0}, Lp2/a;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lw1/g$e;->c:Lp2/a;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lw1/g$e;->d:Lt3/a;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    new-instance v0, Lt3/a;

    .line 35
    .line 36
    invoke-direct {v0}, Lt3/a;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lw1/g$e;->d:Lt3/a;

    .line 40
    .line 41
    :cond_2
    iget-object v0, p0, Lw1/g$e;->e:Lc3/a;

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    new-instance v0, Lc3/a;

    .line 46
    .line 47
    invoke-direct {v0}, Lc3/a;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lw1/g$e;->e:Lc3/a;

    .line 51
    .line 52
    :cond_3
    iget-object v0, p0, Lw1/g$e;->f:Lz3/a;

    .line 53
    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    new-instance v0, Lz3/a;

    .line 57
    .line 58
    invoke-direct {v0}, Lz3/a;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lw1/g$e;->f:Lz3/a;

    .line 62
    .line 63
    :cond_4
    iget-object v0, p0, Lw1/g$e;->g:Lsa/a;

    .line 64
    .line 65
    if-nez v0, :cond_5

    .line 66
    .line 67
    new-instance v0, Lsa/a;

    .line 68
    .line 69
    invoke-direct {v0}, Lsa/a;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lw1/g$e;->g:Lsa/a;

    .line 73
    .line 74
    :cond_5
    iget-object v0, p0, Lw1/g$e;->h:Lg4/a;

    .line 75
    .line 76
    if-nez v0, :cond_6

    .line 77
    .line 78
    new-instance v0, Lg4/a;

    .line 79
    .line 80
    invoke-direct {v0}, Lg4/a;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, Lw1/g$e;->h:Lg4/a;

    .line 84
    .line 85
    :cond_6
    new-instance v1, Lw1/g$h;

    .line 86
    .line 87
    iget-object v2, p0, Lw1/g$e;->a:Lec/a;

    .line 88
    .line 89
    iget-object v3, p0, Lw1/g$e;->b:Ld2/a;

    .line 90
    .line 91
    iget-object v4, p0, Lw1/g$e;->c:Lp2/a;

    .line 92
    .line 93
    iget-object v5, p0, Lw1/g$e;->d:Lt3/a;

    .line 94
    .line 95
    iget-object v6, p0, Lw1/g$e;->e:Lc3/a;

    .line 96
    .line 97
    iget-object v7, p0, Lw1/g$e;->f:Lz3/a;

    .line 98
    .line 99
    iget-object v8, p0, Lw1/g$e;->g:Lsa/a;

    .line 100
    .line 101
    iget-object v9, p0, Lw1/g$e;->h:Lg4/a;

    .line 102
    .line 103
    invoke-direct/range {v1 .. v9}, Lw1/g$h;-><init>(Lec/a;Ld2/a;Lp2/a;Lt3/a;Lc3/a;Lz3/a;Lsa/a;Lg4/a;)V

    .line 104
    .line 105
    .line 106
    return-object v1
.end method
