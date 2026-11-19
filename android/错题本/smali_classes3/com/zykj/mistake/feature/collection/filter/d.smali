.class public final synthetic Lcom/zykj/mistake/feature/collection/filter/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/c;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(IILr6/c;)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/feature/collection/filter/d;->a:I

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/filter/d;->b:Lr6/c;

    iput p1, p0, Lcom/zykj/mistake/feature/collection/filter/d;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/d;->c:I

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/d;->b:Lr6/c;

    .line 13
    .line 14
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/d;->c:I

    .line 21
    .line 22
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/d;->b:Lr6/c;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/d;->c:I

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/d;->b:Lr6/c;

    .line 39
    .line 40
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_2
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/d;->c:I

    .line 45
    .line 46
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/d;->b:Lr6/c;

    .line 51
    .line 52
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_3
    iget v0, p0, Lcom/zykj/mistake/feature/collection/filter/d;->c:I

    .line 57
    .line 58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/d;->b:Lr6/c;

    .line 63
    .line 64
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
