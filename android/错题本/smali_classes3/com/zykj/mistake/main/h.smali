.class public final synthetic Lcom/zykj/mistake/main/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/main/MainShellViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/main/h;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/main/h;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/mistake/main/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/zykj/mistake/main/a1;

    .line 7
    .line 8
    check-cast p2, Lcom/zykj/mistake/main/z0;

    .line 9
    .line 10
    const-string v0, "state"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "selection"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/zykj/mistake/main/i0;

    .line 21
    .line 22
    iget-object p1, p1, Lcom/zykj/mistake/main/a1;->a:Lcom/zykj/mistake/main/TagEditorTarget;

    .line 23
    .line 24
    invoke-direct {v0, p1, p2}, Lcom/zykj/mistake/main/i0;-><init>(Lcom/zykj/mistake/main/TagEditorTarget;Lcom/zykj/mistake/main/z0;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/mistake/main/h;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    check-cast p2, Ljava/lang/String;

    .line 42
    .line 43
    const-string p1, "name"

    .line 44
    .line 45
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Lcom/zykj/mistake/main/p0;

    .line 49
    .line 50
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/mistake/main/p0;-><init>(JLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lcom/zykj/mistake/main/h;->b:Lcom/zykj/mistake/main/MainShellViewModel;

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
