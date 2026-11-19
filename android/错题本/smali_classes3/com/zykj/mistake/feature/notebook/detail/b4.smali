.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/b4;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/b4;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/b4;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/b4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/b4;->c:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/b4;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->J(Ljava/lang/String;)Lcom/zykj/mistake/feature/notebook/detail/c4;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-boolean v0, v0, Lcom/zykj/mistake/feature/notebook/detail/c4;->c:Z

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 19
    .line 20
    sget v2, Lcom/zykj/mistake/R$string;->tips_data_err:I

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->B(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v0, v2}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/b4;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/b4;->b:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->J(Ljava/lang/String;)Lcom/zykj/mistake/feature/notebook/detail/c4;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-boolean v0, v0, Lcom/zykj/mistake/feature/notebook/detail/c4;->c:Z

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/j1;

    .line 48
    .line 49
    sget v2, Lcom/zykj/mistake/R$string;->tips_data_err:I

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->B(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {v0, v2}, Lcom/zykj/mistake/feature/notebook/detail/j1;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->S(Lcom/zykj/mistake/feature/notebook/detail/k1;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 62
    .line 63
    return-object v0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
