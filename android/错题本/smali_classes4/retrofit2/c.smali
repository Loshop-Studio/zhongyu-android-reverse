.class public final Lretrofit2/c;
.super Lretrofit2/l;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lretrofit2/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;)Lretrofit2/m;
    .locals 1

    .line 1
    iget v0, p0, Lretrofit2/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lretrofit2/l;->a(Ljava/lang/reflect/Type;)Lretrofit2/m;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    const-class v0, Lokhttp3/g0;

    .line 12
    .line 13
    invoke-static {p1}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    sget-object p1, Lretrofit2/b;->d:Lretrofit2/b;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/p0;)Lretrofit2/m;
    .locals 2

    .line 1
    iget v0, p0, Lretrofit2/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lretrofit2/v;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v1, Ljava/util/Optional;

    .line 11
    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 18
    .line 19
    invoke-static {v0, p1}, Lretrofit2/v;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p3, p1, p2}, Lretrofit2/p0;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/m;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance p2, Lq/d;

    .line 28
    .line 29
    invoke-direct {p2, p1}, Lq/d;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object p1, p2

    .line 33
    :goto_0
    return-object p1

    .line 34
    :pswitch_0
    const-class p3, Lokhttp3/m0;

    .line 35
    .line 36
    if-ne p1, p3, :cond_2

    .line 37
    .line 38
    const-class p1, Lretrofit2/http/Streaming;

    .line 39
    .line 40
    invoke-static {p2, p1}, Lretrofit2/v;->l([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    sget-object p1, Lretrofit2/b;->e:Lretrofit2/b;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    sget-object p1, Lretrofit2/b;->c:Lretrofit2/b;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const-class p2, Ljava/lang/Void;

    .line 53
    .line 54
    if-ne p1, p2, :cond_3

    .line 55
    .line 56
    sget-object p1, Lretrofit2/b;->g:Lretrofit2/b;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    sget-boolean p2, Lretrofit2/v;->b:Z

    .line 60
    .line 61
    if-eqz p2, :cond_4

    .line 62
    .line 63
    :try_start_0
    const-class p2, Ld6/s;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    if-ne p1, p2, :cond_4

    .line 66
    .line 67
    sget-object p1, Lretrofit2/b;->f:Lretrofit2/b;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catch_0
    const/4 p1, 0x0

    .line 71
    sput-boolean p1, Lretrofit2/v;->b:Z

    .line 72
    .line 73
    :cond_4
    const/4 p1, 0x0

    .line 74
    :goto_1
    return-object p1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
