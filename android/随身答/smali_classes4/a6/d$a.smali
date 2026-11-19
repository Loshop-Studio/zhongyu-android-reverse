.class public final La6/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La6/d;->c(Lc9/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lc9/d;

.field public final synthetic b:La6/d;


# direct methods
.method public constructor <init>(Lc9/d;La6/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, La6/d$a;->a:Lc9/d;

    .line 2
    .line 3
    iput-object p2, p0, La6/d$a;->b:La6/d;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lc9/b;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "throwable"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of p1, p2, Ljava/io/IOException;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    new-instance p1, La6/a$b;

    .line 16
    .line 17
    check-cast p2, Ljava/io/IOException;

    .line 18
    .line 19
    invoke-direct {p1, p2}, La6/a$b;-><init>(Ljava/io/IOException;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, La6/a$d;

    .line 24
    .line 25
    invoke-direct {p1, p2}, La6/a$d;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p2, p0, La6/d$a;->a:Lc9/d;

    .line 29
    .line 30
    iget-object v0, p0, La6/d$a;->b:La6/d;

    .line 31
    .line 32
    invoke-static {p1}, Lc9/x;->h(Ljava/lang/Object;)Lc9/x;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p2, v0, p1}, Lc9/d;->b(Lc9/b;Lc9/x;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public b(Lc9/b;Lc9/x;)V
    .locals 6

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lc9/x;->a()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2}, Lc9/x;->b()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p2}, Lc9/x;->d()Ll8/z;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p2}, Lc9/x;->f()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p2, p0, La6/d$a;->a:Lc9/d;

    .line 32
    .line 33
    iget-object v0, p0, La6/d$a;->b:La6/d;

    .line 34
    .line 35
    new-instance v1, La6/a$c;

    .line 36
    .line 37
    invoke-direct {v1, p1}, La6/a$c;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Lc9/x;->h(Ljava/lang/Object;)Lc9/x;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p2, v0, p1}, Lc9/d;->b(Lc9/b;Lc9/x;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    iget-object p1, p0, La6/d$a;->a:Lc9/d;

    .line 49
    .line 50
    iget-object p2, p0, La6/d$a;->b:La6/d;

    .line 51
    .line 52
    new-instance v0, La6/a$d;

    .line 53
    .line 54
    new-instance v1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 55
    .line 56
    sget-object v2, Lcom/zykj/lib/error/code/ErrorCode;->NET_RESPONSE_NULL:Lcom/zykj/lib/error/code/ErrorCode;

    .line 57
    .line 58
    invoke-direct {v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1}, La6/a$d;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lc9/x;->h(Ljava/lang/Object;)Lc9/x;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {p1, p2, v0}, Lc9/d;->b(Lc9/b;Lc9/x;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    const/4 p1, 0x0

    .line 73
    if-nez v1, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v1}, Ll8/z;->contentLength()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    const-wide/16 v4, 0x0

    .line 81
    .line 82
    cmp-long p2, v2, v4

    .line 83
    .line 84
    if-nez p2, :cond_3

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    :try_start_0
    iget-object p2, p0, La6/d$a;->b:La6/d;

    .line 88
    .line 89
    invoke-static {p2}, La6/d;->b(La6/d;)Lc9/f;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-interface {p2, v1}, Lc9/f;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    :catch_0
    :goto_0
    if-eqz p1, :cond_4

    .line 98
    .line 99
    iget-object p2, p0, La6/d$a;->a:Lc9/d;

    .line 100
    .line 101
    iget-object v1, p0, La6/d$a;->b:La6/d;

    .line 102
    .line 103
    new-instance v2, La6/a$a;

    .line 104
    .line 105
    invoke-direct {v2, p1, v0}, La6/a$a;-><init>(Ljava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    invoke-static {v2}, Lc9/x;->h(Ljava/lang/Object;)Lc9/x;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-interface {p2, v1, p1}, Lc9/d;->b(Lc9/b;Lc9/x;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    iget-object p1, p0, La6/d$a;->a:Lc9/d;

    .line 117
    .line 118
    iget-object p2, p0, La6/d$a;->b:La6/d;

    .line 119
    .line 120
    new-instance v1, La6/a$d;

    .line 121
    .line 122
    new-instance v2, Lcom/zykj/http/exception/RemoteCodeException;

    .line 123
    .line 124
    sget-object v3, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    .line 125
    .line 126
    invoke-virtual {v3, v0}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-direct {v2, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v1, v2}, La6/a$d;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v1}, Lc9/x;->h(Ljava/lang/Object;)Lc9/x;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-interface {p1, p2, v0}, Lc9/d;->b(Lc9/b;Lc9/x;)V

    .line 141
    .line 142
    .line 143
    :goto_1
    return-void
.end method
