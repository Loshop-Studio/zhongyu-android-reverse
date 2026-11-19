.class public final Lc0/f;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc0/f;->b:I

    invoke-direct {p0}, Lc0/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Lc0/i;
    .locals 1

    .line 1
    iget v0, p0, Lc0/f;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lc0/k;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lc0/k;-><init>(Lc0/f;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lc0/e;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lc0/e;-><init>(Lc0/f;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
