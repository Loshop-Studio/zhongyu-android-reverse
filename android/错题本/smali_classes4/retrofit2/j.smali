.class public final Lretrofit2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit2/g;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/reflect/Type;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/reflect/Type;)V
    .locals 0

    .line 1
    iput p1, p0, Lretrofit2/j;->a:I

    iput-object p2, p0, Lretrofit2/j;->b:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget v0, p0, Lretrofit2/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lretrofit2/j;->b:Ljava/lang/reflect/Type;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lretrofit2/j;->b:Ljava/lang/reflect/Type;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lretrofit2/x;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lretrofit2/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lretrofit2/k;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lretrofit2/k;-><init>(Lretrofit2/x;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lretrofit2/i;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v1, v0, v2}, Lretrofit2/i;-><init>(Lretrofit2/k;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lretrofit2/x;->b(Lretrofit2/h;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    new-instance v0, Lretrofit2/k;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lretrofit2/k;-><init>(Lretrofit2/x;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lretrofit2/i;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v1, v0, v2}, Lretrofit2/i;-><init>(Lretrofit2/k;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lretrofit2/x;->b(Lretrofit2/h;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
