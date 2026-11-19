.class public final Lu7/l;
.super Lr7/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lu7/o;

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lu7/o;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lu7/l;->e:I

    iput-object p2, p0, Lu7/l;->f:Lu7/o;

    iput p3, p0, Lu7/l;->g:I

    iput-object p4, p0, Lu7/l;->h:Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lr7/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lu7/o;ILjava/util/List;Z)V
    .locals 0

    const/4 p5, 0x0

    iput p5, p0, Lu7/l;->e:I

    iput-object p2, p0, Lu7/l;->f:Lu7/o;

    iput p3, p0, Lu7/l;->g:I

    iput-object p4, p0, Lu7/l;->h:Ljava/lang/Object;

    const/4 p2, 0x1

    .line 2
    invoke-direct {p0, p1, p2}, Lr7/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    .line 1
    iget v0, p0, Lu7/l;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu7/l;->f:Lu7/o;

    .line 7
    .line 8
    :try_start_0
    iget v1, p0, Lu7/l;->g:I

    .line 9
    .line 10
    iget-object v2, p0, Lu7/l;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lokhttp3/internal/http2/ErrorCode;

    .line 13
    .line 14
    const-string v3, "statusCode"

    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v3, v0, Lu7/o;->w:Lu7/x;

    .line 20
    .line 21
    invoke-virtual {v3, v1, v2}, Lu7/x;->g(ILokhttp3/internal/http2/ErrorCode;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v1

    .line 26
    invoke-virtual {v0, v1}, Lu7/o;->b(Ljava/io/IOException;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    const-wide/16 v0, -0x1

    .line 30
    .line 31
    return-wide v0

    .line 32
    :pswitch_0
    iget-object v0, p0, Lu7/l;->f:Lu7/o;

    .line 33
    .line 34
    iget-object v0, v0, Lu7/o;->k:Lu7/a0;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    :try_start_1
    iget-object v0, p0, Lu7/l;->f:Lu7/o;

    .line 40
    .line 41
    iget-object v0, v0, Lu7/o;->w:Lu7/x;

    .line 42
    .line 43
    iget v1, p0, Lu7/l;->g:I

    .line 44
    .line 45
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->CANCEL:Lokhttp3/internal/http2/ErrorCode;

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Lu7/x;->g(ILokhttp3/internal/http2/ErrorCode;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lu7/l;->f:Lu7/o;

    .line 51
    .line 52
    monitor-enter v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 53
    :try_start_2
    iget-object v1, p0, Lu7/l;->f:Lu7/o;

    .line 54
    .line 55
    iget-object v1, v1, Lu7/o;->y:Ljava/util/LinkedHashSet;

    .line 56
    .line 57
    iget v2, p0, Lu7/l;->g:I

    .line 58
    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    .line 65
    .line 66
    :try_start_3
    monitor-exit v0

    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception v1

    .line 69
    monitor-exit v0

    .line 70
    throw v1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 71
    :catch_1
    :goto_1
    const-wide/16 v0, -0x1

    .line 72
    .line 73
    return-wide v0

    .line 74
    :pswitch_1
    iget-object v0, p0, Lu7/l;->f:Lu7/o;

    .line 75
    .line 76
    iget-object v0, v0, Lu7/o;->k:Lu7/a0;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    :try_start_4
    iget-object v0, p0, Lu7/l;->f:Lu7/o;

    .line 82
    .line 83
    iget-object v0, v0, Lu7/o;->w:Lu7/x;

    .line 84
    .line 85
    iget v1, p0, Lu7/l;->g:I

    .line 86
    .line 87
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->CANCEL:Lokhttp3/internal/http2/ErrorCode;

    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, Lu7/x;->g(ILokhttp3/internal/http2/ErrorCode;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lu7/l;->f:Lu7/o;

    .line 93
    .line 94
    monitor-enter v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 95
    :try_start_5
    iget-object v1, p0, Lu7/l;->f:Lu7/o;

    .line 96
    .line 97
    iget-object v1, v1, Lu7/o;->y:Ljava/util/LinkedHashSet;

    .line 98
    .line 99
    iget v2, p0, Lu7/l;->g:I

    .line 100
    .line 101
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 106
    .line 107
    .line 108
    :try_start_6
    monitor-exit v0

    .line 109
    goto :goto_2

    .line 110
    :catchall_1
    move-exception v1

    .line 111
    monitor-exit v0

    .line 112
    throw v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 113
    :catch_2
    :goto_2
    const-wide/16 v0, -0x1

    .line 114
    .line 115
    return-wide v0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
