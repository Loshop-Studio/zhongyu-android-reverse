.class public final Lz6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/h;
.implements Lz6/c;


# instance fields
.field public final synthetic a:I

.field public final b:Lz6/h;

.field public final c:I


# direct methods
.method public constructor <init>(Lz6/h;II)V
    .locals 0

    .line 1
    iput p3, p0, Lz6/b;->a:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string/jumbo p3, "sequence"

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lz6/b;->b:Lz6/h;

    .line 16
    .line 17
    iput p2, p0, Lz6/b;->c:I

    .line 18
    .line 19
    if-ltz p2, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p1, "count must be non-negative, but was "

    .line 23
    .line 24
    const/16 p3, 0x2e

    .line 25
    .line 26
    invoke-static {p1, p2, p3}, Landroidx/collection/a;->o(Ljava/lang/String;IC)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p2

    .line 40
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lz6/b;->b:Lz6/h;

    .line 44
    .line 45
    iput p2, p0, Lz6/b;->c:I

    .line 46
    .line 47
    if-ltz p2, :cond_1

    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    const-string p1, "count must be non-negative, but was "

    .line 51
    .line 52
    const/16 p3, 0x2e

    .line 53
    .line 54
    invoke-static {p1, p2, p3}, Landroidx/collection/a;->o(Ljava/lang/String;IC)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p2

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(I)Lz6/h;
    .locals 3

    .line 1
    iget v0, p0, Lz6/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lz6/b;->c:I

    .line 7
    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lz6/d;->a:Lz6/d;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Lz6/n;

    .line 14
    .line 15
    iget-object v2, p0, Lz6/b;->b:Lz6/h;

    .line 16
    .line 17
    invoke-direct {v1, v2, p1, v0}, Lz6/n;-><init>(Lz6/h;II)V

    .line 18
    .line 19
    .line 20
    move-object p1, v1

    .line 21
    :goto_0
    return-object p1

    .line 22
    :pswitch_0
    iget v0, p0, Lz6/b;->c:I

    .line 23
    .line 24
    add-int/2addr v0, p1

    .line 25
    if-gez v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Lz6/b;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, p0, p1, v1}, Lz6/b;-><init>(Lz6/h;II)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance p1, Lz6/b;

    .line 35
    .line 36
    iget-object v1, p0, Lz6/b;->b:Lz6/h;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {p1, v1, v0, v2}, Lz6/b;-><init>(Lz6/h;II)V

    .line 40
    .line 41
    .line 42
    move-object v0, p1

    .line 43
    :goto_1
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(I)Lz6/h;
    .locals 3

    .line 1
    iget v0, p0, Lz6/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lz6/b;->c:I

    .line 7
    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Lz6/b;

    .line 13
    .line 14
    iget-object v1, p0, Lz6/b;->b:Lz6/h;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v1, p1, v2}, Lz6/b;-><init>(Lz6/h;II)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-object v0

    .line 21
    :pswitch_0
    iget v0, p0, Lz6/b;->c:I

    .line 22
    .line 23
    add-int v1, v0, p1

    .line 24
    .line 25
    if-gez v1, :cond_1

    .line 26
    .line 27
    new-instance v0, Lz6/b;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {v0, p0, p1, v1}, Lz6/b;-><init>(Lz6/h;II)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance p1, Lz6/n;

    .line 35
    .line 36
    iget-object v2, p0, Lz6/b;->b:Lz6/h;

    .line 37
    .line 38
    invoke-direct {p1, v2, v0, v1}, Lz6/n;-><init>(Lz6/h;II)V

    .line 39
    .line 40
    .line 41
    move-object v0, p1

    .line 42
    :goto_1
    return-object v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lz6/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/collections/b0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lkotlin/collections/b0;-><init>(Lz6/b;B)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    new-instance v0, Lkotlin/collections/b0;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lkotlin/collections/b0;-><init>(Lz6/b;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
