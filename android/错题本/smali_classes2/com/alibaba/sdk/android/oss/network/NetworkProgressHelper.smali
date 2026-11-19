.class public Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static addProgressRequestBody(Ljava/io/InputStream;JLjava/lang/String;Lcom/alibaba/sdk/android/oss/network/ExecutionContext;)Lcom/alibaba/sdk/android/oss/network/ProgressTouchableRequestBody;
    .locals 6

    .line 1
    new-instance v0, Lcom/alibaba/sdk/android/oss/network/ProgressTouchableRequestBody;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-wide v2, p1

    .line 5
    move-object v4, p3

    .line 6
    move-object v5, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/alibaba/sdk/android/oss/network/ProgressTouchableRequestBody;-><init>(Ljava/io/InputStream;JLjava/lang/String;Lcom/alibaba/sdk/android/oss/network/ExecutionContext;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static addProgressResponseListener(Lokhttp3/z;Lcom/alibaba/sdk/android/oss/network/ExecutionContext;)Lokhttp3/z;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lokhttp3/y;

    .line 5
    .line 6
    invoke-direct {v0}, Lokhttp3/y;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lokhttp3/z;->a:Lc0/g;

    .line 10
    .line 11
    iput-object v1, v0, Lokhttp3/y;->a:Lc0/g;

    .line 12
    .line 13
    iget-object v1, p0, Lokhttp3/z;->b:Lo2/a;

    .line 14
    .line 15
    iput-object v1, v0, Lokhttp3/y;->b:Lo2/a;

    .line 16
    .line 17
    iget-object v1, v0, Lokhttp3/y;->c:Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v2, p0, Lokhttp3/z;->c:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v2, v1}, Lkotlin/collections/y;->S(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lokhttp3/z;->d:Ljava/util/List;

    .line 25
    .line 26
    iget-object v2, v0, Lokhttp3/y;->d:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/collections/y;->S(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lokhttp3/z;->e:Lp7/a;

    .line 32
    .line 33
    iput-object v1, v0, Lokhttp3/y;->e:Lp7/a;

    .line 34
    .line 35
    iget-boolean v1, p0, Lokhttp3/z;->f:Z

    .line 36
    .line 37
    iput-boolean v1, v0, Lokhttp3/y;->f:Z

    .line 38
    .line 39
    iget-object v1, p0, Lokhttp3/z;->g:Lokhttp3/b;

    .line 40
    .line 41
    iput-object v1, v0, Lokhttp3/y;->g:Lokhttp3/b;

    .line 42
    .line 43
    iget-boolean v1, p0, Lokhttp3/z;->h:Z

    .line 44
    .line 45
    iput-boolean v1, v0, Lokhttp3/y;->h:Z

    .line 46
    .line 47
    iget-boolean v1, p0, Lokhttp3/z;->i:Z

    .line 48
    .line 49
    iput-boolean v1, v0, Lokhttp3/y;->i:Z

    .line 50
    .line 51
    iget-object v1, p0, Lokhttp3/z;->j:Lokhttp3/b;

    .line 52
    .line 53
    iput-object v1, v0, Lokhttp3/y;->j:Lokhttp3/b;

    .line 54
    .line 55
    iget-object v1, p0, Lokhttp3/z;->k:Lokhttp3/b;

    .line 56
    .line 57
    iput-object v1, v0, Lokhttp3/y;->k:Lokhttp3/b;

    .line 58
    .line 59
    iget-object v1, p0, Lokhttp3/z;->l:Ljava/net/Proxy;

    .line 60
    .line 61
    iput-object v1, v0, Lokhttp3/y;->l:Ljava/net/Proxy;

    .line 62
    .line 63
    iget-object v1, p0, Lokhttp3/z;->m:Ljava/net/ProxySelector;

    .line 64
    .line 65
    iput-object v1, v0, Lokhttp3/y;->m:Ljava/net/ProxySelector;

    .line 66
    .line 67
    iget-object v1, p0, Lokhttp3/z;->n:Lokhttp3/b;

    .line 68
    .line 69
    iput-object v1, v0, Lokhttp3/y;->n:Lokhttp3/b;

    .line 70
    .line 71
    iget-object v1, p0, Lokhttp3/z;->o:Ljavax/net/SocketFactory;

    .line 72
    .line 73
    iput-object v1, v0, Lokhttp3/y;->o:Ljavax/net/SocketFactory;

    .line 74
    .line 75
    iget-object v1, p0, Lokhttp3/z;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 76
    .line 77
    iput-object v1, v0, Lokhttp3/y;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 78
    .line 79
    iget-object v1, p0, Lokhttp3/z;->q:Ljavax/net/ssl/X509TrustManager;

    .line 80
    .line 81
    iput-object v1, v0, Lokhttp3/y;->q:Ljavax/net/ssl/X509TrustManager;

    .line 82
    .line 83
    iget-object v1, p0, Lokhttp3/z;->r:Ljava/util/List;

    .line 84
    .line 85
    iput-object v1, v0, Lokhttp3/y;->r:Ljava/util/List;

    .line 86
    .line 87
    iget-object v1, p0, Lokhttp3/z;->s:Ljava/util/List;

    .line 88
    .line 89
    iput-object v1, v0, Lokhttp3/y;->s:Ljava/util/List;

    .line 90
    .line 91
    iget-object v1, p0, Lokhttp3/z;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 92
    .line 93
    iput-object v1, v0, Lokhttp3/y;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 94
    .line 95
    iget-object v1, p0, Lokhttp3/z;->u:Lokhttp3/h;

    .line 96
    .line 97
    iput-object v1, v0, Lokhttp3/y;->u:Lokhttp3/h;

    .line 98
    .line 99
    iget-object v1, p0, Lokhttp3/z;->v:Ly1/a;

    .line 100
    .line 101
    iput-object v1, v0, Lokhttp3/y;->v:Ly1/a;

    .line 102
    .line 103
    iget v1, p0, Lokhttp3/z;->w:I

    .line 104
    .line 105
    iput v1, v0, Lokhttp3/y;->w:I

    .line 106
    .line 107
    iget v1, p0, Lokhttp3/z;->x:I

    .line 108
    .line 109
    iput v1, v0, Lokhttp3/y;->x:I

    .line 110
    .line 111
    iget v1, p0, Lokhttp3/z;->y:I

    .line 112
    .line 113
    iput v1, v0, Lokhttp3/y;->y:I

    .line 114
    .line 115
    iget-wide v3, p0, Lokhttp3/z;->z:J

    .line 116
    .line 117
    iput-wide v3, v0, Lokhttp3/y;->z:J

    .line 118
    .line 119
    iget-object p0, p0, Lokhttp3/z;->A:Lo2/a;

    .line 120
    .line 121
    iput-object p0, v0, Lokhttp3/y;->A:Lo2/a;

    .line 122
    .line 123
    new-instance p0, Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper$1;

    .line 124
    .line 125
    invoke-direct {p0, p1}, Lcom/alibaba/sdk/android/oss/network/NetworkProgressHelper$1;-><init>(Lcom/alibaba/sdk/android/oss/network/ExecutionContext;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    new-instance p0, Lokhttp3/z;

    .line 132
    .line 133
    invoke-direct {p0, v0}, Lokhttp3/z;-><init>(Lokhttp3/y;)V

    .line 134
    .line 135
    .line 136
    return-object p0
.end method
