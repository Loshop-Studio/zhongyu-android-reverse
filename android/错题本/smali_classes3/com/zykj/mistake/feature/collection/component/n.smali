.class public final Lcom/zykj/mistake/feature/collection/component/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lr6/c;Lp4/b;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/feature/collection/component/n;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/n;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lu7/o;Lu7/s;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/zykj/mistake/feature/collection/component/n;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/component/n;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/component/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lu7/o;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/component/n;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lu7/s;

    .line 13
    .line 14
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->INTERNAL_ERROR:Lokhttp3/internal/http2/ErrorCode;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    :try_start_0
    invoke-virtual {v1, v3, p0}, Lu7/s;->a(ZLcom/zykj/mistake/feature/collection/component/n;)Z

    .line 19
    .line 20
    .line 21
    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :cond_0
    const/4 v3, 0x0

    .line 25
    :try_start_1
    invoke-virtual {v1, v3, p0}, Lu7/s;->a(ZLcom/zykj/mistake/feature/collection/component/n;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    sget-object v3, Lokhttp3/internal/http2/ErrorCode;->NO_ERROR:Lokhttp3/internal/http2/ErrorCode;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    :try_start_2
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->CANCEL:Lokhttp3/internal/http2/ErrorCode;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    invoke-virtual {v0, v3, v2, v4}, Lu7/o;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {v1}, Lp7/c;->c(Ljava/io/Closeable;)V

    .line 39
    .line 40
    .line 41
    goto :goto_4

    .line 42
    :catchall_0
    move-exception v5

    .line 43
    goto :goto_5

    .line 44
    :catch_0
    move-exception v4

    .line 45
    goto :goto_3

    .line 46
    :catchall_1
    move-exception v5

    .line 47
    :goto_1
    move-object v3, v2

    .line 48
    goto :goto_5

    .line 49
    :catch_1
    move-exception v3

    .line 50
    move-object v4, v3

    .line 51
    move-object v3, v2

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    :try_start_3
    new-instance v3, Ljava/io/IOException;

    .line 54
    .line 55
    const-string v5, "Required SETTINGS preface not received"

    .line 56
    .line 57
    invoke-direct {v3, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v3
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 61
    :goto_2
    move-object v5, v3

    .line 62
    goto :goto_1

    .line 63
    :catchall_2
    move-exception v3

    .line 64
    goto :goto_2

    .line 65
    :goto_3
    :try_start_4
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->PROTOCOL_ERROR:Lokhttp3/internal/http2/ErrorCode;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 66
    .line 67
    invoke-virtual {v0, v2, v2, v4}, Lu7/o;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :goto_4
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 72
    .line 73
    return-object v0

    .line 74
    :goto_5
    invoke-virtual {v0, v3, v2, v4}, Lu7/o;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v1}, Lp7/c;->c(Ljava/io/Closeable;)V

    .line 78
    .line 79
    .line 80
    throw v5

    .line 81
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/component/n;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lr6/c;

    .line 84
    .line 85
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Lp4/b;

    .line 88
    .line 89
    invoke-interface {v0, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/component/n;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lr6/c;

    .line 98
    .line 99
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Lp4/b;

    .line 102
    .line 103
    invoke-interface {v0, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
