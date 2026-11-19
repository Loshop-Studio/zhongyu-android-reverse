.class public final Lio/reactivex/exceptions/a;
.super Lcoil3/network/g;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/reactivex/exceptions/a;->b:I

    const/4 p2, 0x6

    invoke-direct {p0, p2}, Lcoil3/network/g;-><init>(I)V

    iput-object p1, p0, Lio/reactivex/exceptions/a;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lio/reactivex/exceptions/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/reactivex/exceptions/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/io/PrintWriter;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lio/reactivex/exceptions/a;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/io/PrintStream;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
