.class public final synthetic Lcom/zykj/mistake/feature/collection/filter/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/c;

.field public final synthetic c:Lp4/a;


# direct methods
.method public synthetic constructor <init>(Lr6/c;Lp4/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/feature/collection/filter/f;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/filter/f;->b:Lr6/c;

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/filter/f;->c:Lp4/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/f;->c:Lp4/a;

    .line 7
    .line 8
    iget-wide v0, v0, Lp4/a;->a:J

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/f;->b:Lr6/c;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/filter/f;->c:Lp4/a;

    .line 23
    .line 24
    iget-wide v0, v0, Lp4/a;->a:J

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/f;->b:Lr6/c;

    .line 31
    .line 32
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
