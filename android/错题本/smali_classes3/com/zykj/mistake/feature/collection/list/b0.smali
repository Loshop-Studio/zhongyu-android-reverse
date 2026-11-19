.class public final Lcom/zykj/mistake/feature/collection/list/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/c;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Lr6/c;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/feature/collection/list/b0;->a:I

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/list/b0;->c:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/list/b0;->b:Lr6/c;

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/list/b0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/list/b0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/b0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 9
    .line 10
    iget-boolean v0, v0, Lcom/zykj/mistake/feature/notebook/list/e1;->i:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/u0;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/b0;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lp4/b;

    .line 19
    .line 20
    iget-object v1, v1, Lp4/b;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lcom/zykj/mistake/feature/notebook/list/u0;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/b0;->b:Lr6/c;

    .line 26
    .line 27
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/b0;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lcom/zykj/mistake/feature/collection/list/v;

    .line 36
    .line 37
    iget-boolean v0, v0, Lcom/zykj/mistake/feature/collection/list/v;->k:Z

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    new-instance v0, Lcom/zykj/mistake/feature/collection/list/r;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/b0;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lcom/zykj/mistake/feature/collection/list/b;

    .line 46
    .line 47
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/list/b;->a:Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {v0, v1}, Lcom/zykj/mistake/feature/collection/list/r;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/list/b0;->b:Lr6/c;

    .line 53
    .line 54
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 58
    .line 59
    return-object v0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
