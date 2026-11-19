.class public final Ls5/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls5/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls5/c0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 14

    .line 1
    new-instance v0, Ls5/c0;

    .line 2
    .line 3
    const/16 v6, 0xc

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    .line 7
    .line 8
    const-string v3, "2.0X"

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-direct/range {v0 .. v7}, Ls5/c0;-><init>(DLjava/lang/String;ZIILkotlin/jvm/internal/n;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ls5/c0;

    .line 16
    .line 17
    const/16 v7, 0xc

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const-wide/high16 v2, 0x3ffc000000000000L    # 1.75

    .line 21
    .line 22
    const-string v4, "1.75X"

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-direct/range {v1 .. v8}, Ls5/c0;-><init>(DLjava/lang/String;ZIILkotlin/jvm/internal/n;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Ls5/c0;

    .line 29
    .line 30
    const/16 v8, 0xc

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    .line 34
    .line 35
    const-string v5, "1.5X"

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-direct/range {v2 .. v9}, Ls5/c0;-><init>(DLjava/lang/String;ZIILkotlin/jvm/internal/n;)V

    .line 39
    .line 40
    .line 41
    new-instance v3, Ls5/c0;

    .line 42
    .line 43
    const/16 v9, 0xc

    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    const-wide/high16 v4, 0x3ff4000000000000L    # 1.25

    .line 47
    .line 48
    const-string v6, "1.25X"

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    invoke-direct/range {v3 .. v10}, Ls5/c0;-><init>(DLjava/lang/String;ZIILkotlin/jvm/internal/n;)V

    .line 52
    .line 53
    .line 54
    new-instance v4, Ls5/c0;

    .line 55
    .line 56
    const/16 v10, 0x8

    .line 57
    .line 58
    const/4 v11, 0x0

    .line 59
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 60
    .line 61
    const-string v7, "1.0X"

    .line 62
    .line 63
    const/4 v8, 0x1

    .line 64
    const/4 v9, 0x0

    .line 65
    invoke-direct/range {v4 .. v11}, Ls5/c0;-><init>(DLjava/lang/String;ZIILkotlin/jvm/internal/n;)V

    .line 66
    .line 67
    .line 68
    new-instance v5, Ls5/c0;

    .line 69
    .line 70
    const/16 v11, 0xc

    .line 71
    .line 72
    const/4 v12, 0x0

    .line 73
    const-wide/high16 v6, 0x3fe8000000000000L    # 0.75

    .line 74
    .line 75
    const-string v8, "0.75X"

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    invoke-direct/range {v5 .. v12}, Ls5/c0;-><init>(DLjava/lang/String;ZIILkotlin/jvm/internal/n;)V

    .line 79
    .line 80
    .line 81
    new-instance v6, Ls5/c0;

    .line 82
    .line 83
    const/16 v12, 0xc

    .line 84
    .line 85
    const/4 v13, 0x0

    .line 86
    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    .line 87
    .line 88
    const-string v9, "0.5X"

    .line 89
    .line 90
    const/4 v11, 0x0

    .line 91
    invoke-direct/range {v6 .. v13}, Ls5/c0;-><init>(DLjava/lang/String;ZIILkotlin/jvm/internal/n;)V

    .line 92
    .line 93
    .line 94
    filled-new-array/range {v0 .. v6}, [Ls5/c0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0}, Li7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    return-object v0
.end method
