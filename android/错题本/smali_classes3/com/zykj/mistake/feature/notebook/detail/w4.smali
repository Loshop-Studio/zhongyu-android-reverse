.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/w4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lm7/x;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->b:I

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/a5;ILjava/io/File;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->c:Ljava/lang/Object;

    iput p2, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->b:I

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/text/Regex;Ljava/lang/CharSequence;I)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->d:Ljava/lang/Object;

    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->b:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->b:I

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lm7/x;

    .line 15
    .line 16
    new-array v3, v0, [Lk7/g;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    move v5, v4

    .line 20
    :goto_0
    if-ge v5, v0, :cond_0

    .line 21
    .line 22
    new-instance v6, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v7, 0x2e

    .line 31
    .line 32
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v7, v2, Lm7/a1;->e:[Ljava/lang/String;

    .line 36
    .line 37
    aget-object v7, v7, v5

    .line 38
    .line 39
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    sget-object v7, Lk7/l;->e:Lk7/l;

    .line 47
    .line 48
    new-array v8, v4, [Lk7/g;

    .line 49
    .line 50
    invoke-static {v6, v7, v8}, La/a;->h(Ljava/lang/String;Lcoil3/network/g;[Lk7/g;)Lk7/h;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    aput-object v6, v3, v5

    .line 55
    .line 56
    add-int/lit8 v5, v5, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-object v3

    .line 60
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lkotlin/text/Regex;

    .line 63
    .line 64
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Ljava/lang/CharSequence;

    .line 67
    .line 68
    iget v2, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->b:I

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Lkotlin/text/Regex;->find(Ljava/lang/CharSequence;I)Lkotlin/text/k;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    return-object v0

    .line 75
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 78
    .line 79
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->b:I

    .line 80
    .line 81
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/w4;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Ljava/io/File;

    .line 84
    .line 85
    iget v3, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->f:I

    .line 86
    .line 87
    if-eq v3, v1, :cond_1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/x4;

    .line 97
    .line 98
    invoke-direct {v4, v2}, Lcom/zykj/mistake/feature/notebook/detail/x4;-><init>(Ljava/io/File;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v4}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-eqz v2, :cond_3

    .line 106
    .line 107
    array-length v3, v2

    .line 108
    const/4 v4, 0x0

    .line 109
    :goto_1
    if-ge v4, v3, :cond_3

    .line 110
    .line 111
    aget-object v5, v2, v4

    .line 112
    .line 113
    iget v6, v0, Lcom/zykj/mistake/feature/notebook/detail/a5;->f:I

    .line 114
    .line 115
    if-ne v6, v1, :cond_2

    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 118
    .line 119
    .line 120
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    :goto_2
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 124
    .line 125
    return-object v0

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
